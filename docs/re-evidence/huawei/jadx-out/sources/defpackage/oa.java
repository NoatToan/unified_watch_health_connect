package defpackage;

import com.alipay.sdk.m.s.e;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class oa extends e {
    @Override // com.alipay.sdk.m.s.e
    public JSONObject a() throws JSONException {
        return e.a("sdkConfig", "obtain");
    }

    @Override // com.alipay.sdk.m.s.e
    public String b() {
        return "5.0.0";
    }

    @Override // com.alipay.sdk.m.s.e
    public boolean c() {
        return true;
    }

    @Override // com.alipay.sdk.m.s.e
    public String a(on onVar, HashMap<String, String> map, HashMap<String, String> map2) throws JSONException {
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        map2.putAll(om.c(onVar));
        oq.c("mspl", "cf " + map2);
        return super.a(onVar, map, map2);
    }
}
