package Regula.regulaDomain;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Nation {

    public Nation(String[] args) {
        // Создаем данные для нации
        Map<String, Object> nationData = new LinkedHashMap<>();
        String nationTitle = "";
        if (args.length == 0) {
            nationTitle = "Гоблинвиль";
        }
        else {nationTitle = args[0];}
        nationData.put("Доход: ", 0);
        nationData.put("Лимит армии:", 0);
        nationData.put("Лимит наступательной войны: ", 50);
        nationData.put("Лимит оборонительной войны: ", 40);
        nationData.put("Стабильность: ", 0);
        nationData.put("Благосостояние: ", 0);
        nationData.put("Эффективность: ", 0.5);
        nationData.put("Престиж: ", 100);
        nationData.put("Лояльность знати: ", 5);
        nationData.put("Лояльность духовенства: ", 5);
        nationData.put("Лояльность простолюдин: ", 5);
        nationData.put("Бесчестие: ", 0);
        nationData.put("Очки пополнения: ", 0);
        nationData.put("Статус: ", "графство");
        nationData.put("Преобладающее божество: ", "Аполлон");
        nationData.put("Преобладающая раса: ", "эльфы");
        nationData.put("Имя правителя: ", "Граф Иван");
        nationData.put("Возраст правителя: ", 35);
        nationData.put("Раса правителя: ", "человеки");
        nationData.put("Прирост престижа: ", 0);
        nationData.put("Прирост бесчестия: ", -1);
        nationData.put("Линейный бонус к доходу: ", 0);
        nationData.put("Процентный бонус к доходу: ", 0); // Отображение в процентах
        nationData.put("Процентный бонус к лимиту: ", 0); // Отображение в процентах
        nationData.put("Процентный бонус к лимиту при обороне: ", 0); // Отображение в процентах
        nationData.put("Процентный бонус к лимиту при наступлении: ", 0); // Отображение в процентах
        // Создаем YML-файл
        try (FileWriter writer = new FileWriter("nations.yml")) {
            DumperOptions options = new DumperOptions();
            options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            Yaml yaml = new Yaml(options);
            yaml.dump(nationData, writer);
            System.out.println("Файл nation.yml успешно создан!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}