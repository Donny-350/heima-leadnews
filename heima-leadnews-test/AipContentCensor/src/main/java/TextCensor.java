import com.baidu.aip.contentcensor.AipContentCensor;
import org.json.JSONException;
import org.json.JSONObject;

public class TextCensor {
    // 设置APPID/AK/SK
    public static final String APP_ID = "35295641";
    public static final String API_KEY = "AkuPUMW4XzMBN73WauIWVGkq";
    public static final String SECRET_KEY = "4WyDQbOhNl3LVAzu3WPqTMCg47xsB6qc";

    public static void main(String[] args) {
        // 初始化一个AipContentCensor
        AipContentCensor client = new AipContentCensor(APP_ID, API_KEY, SECRET_KEY);

        // 设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 调用接口进行文本审核
        String text = "我要努力学习";
        JSONObject response = client.textCensorUserDefined(text);

        // 打印审核结果
        try {
            System.out.println(response.toString(2));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
