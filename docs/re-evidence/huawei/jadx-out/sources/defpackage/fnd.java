package defpackage;

import com.huawei.health.device.api.JsonParserApi;
import com.huawei.health.device.wifi.entity.utils.JsonParser;
import com.huawei.hmf.annotation.ApiDefine;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = JsonParserApi.class)
public class fnd implements JsonParserApi {
    @Override // com.huawei.health.device.api.JsonParserApi
    public Map<String, Object> fromJsonObject(String str) {
        return JsonParser.a(str);
    }

    @Override // com.huawei.health.device.api.JsonParserApi
    public JSONObject toJsonObject(Map<?, ?> map) {
        return JsonParser.a(map);
    }
}
