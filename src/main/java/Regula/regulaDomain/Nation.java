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
        nationData.put("доход", 0);
        nationData.put("лимит", 100);
        nationData.put("лимит_наступательной_войны", 50);
        nationData.put("лимит_оборонительной_войны", 40);
        nationData.put("стабильность", 0.75);
        nationData.put("благосостояние", 0.6);
        nationData.put("эффективность", 0.5);
        nationData.put("престиж", 500);
        nationData.put("лояльность_знати", 8);
        nationData.put("лояльность_духовенства", 7);
        nationData.put("лояльность_простолюдин", 6);
        nationData.put("бесчестие", 15);
        nationData.put("очки_пополнения", 120);
        nationData.put("статус", "графство");
        nationData.put("преобладающее_божество", "Аполлон");
        nationData.put("преобладающая_раса", "эльфы");
        nationData.put("имя_правителя", "Граф Иван");
        nationData.put("возраст_правителя", 35);
        nationData.put("раса_правителя", "человеки");
        nationData.put("прирост_престижа", 0);
        nationData.put("прирост_бесчестия", -1);
        nationData.put("линейный_бонус_к_доходу", 0);
        nationData.put("процентный_бонус_к_доходу", "0%"); // Отображение в процентах
        nationData.put("процентный_бонус_к_лимиту", "0%"); // Отображение в процентах
        nationData.put("процентный_бонус_к_лимиту_при_обороне", "0%"); // Отображение в процентах
        nationData.put("процентный_бонус_к_лимиту_при_наступлении", "0%"); // Отображение в процентах
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