package tareaJSON;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tareaJson.TareaJson;

public class TareaJsonTest {
    @Test
    public void jsonAreEqualTest1() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        String json2 = "{\r\n" +
                "\"name\":\"eynar5\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": 1545645456\r\n" +
                "}";

        TareaJson tareaJson = new TareaJson();
        Assertions.assertThrows(Exception.class, ()->{
            tareaJson.jsonAreEqual(json1, json2, "Error");});
    }

    @Test
    public void jsonAreEqualTest2() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        String json2 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        TareaJson tareaJson = new TareaJson();
        tareaJson.jsonAreEqual(json1, json2, "Error");
    }

    @Test
    public void jsonAreEqualTest3() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "}";

        String json2 = "{\r\n" +
                "}";

        TareaJson tareaJson = new TareaJson();
        Assertions.assertThrows(Exception.class, ()->{
            tareaJson.jsonAreEqual(json1, json2, "Error");});
    }

    @Test
    public void jsonAreEqualTest4() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        String json2 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"abcd\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        TareaJson tareaJson = new TareaJson();
        tareaJson.jsonAreEqual(json1, json2, "ErrorEnMetodo");
    }

    @Test
    public void jsonAreEqualTest5() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": false,\r\n" +
                "\"update\": true\r\n" +
                "}";

        String json2 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        TareaJson tareaJson = new TareaJson();
        tareaJson.jsonAreEqual(json1, json2, "ErrorEnMetodo");
    }

}
