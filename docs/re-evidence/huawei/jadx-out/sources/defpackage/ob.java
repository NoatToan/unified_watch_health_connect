package defpackage;

import com.alipay.sdk.m.s.e;
import com.huawei.operation.ble.BleConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ob extends e {
    @Override // com.alipay.sdk.m.s.e
    public JSONObject a() throws JSONException {
        return e.a("cashier", "main");
    }

    @Override // com.alipay.sdk.m.s.e
    public boolean c() {
        return false;
    }

    @Override // com.alipay.sdk.m.s.e
    public Map<String, String> a(boolean z, String str) {
        HashMap map = new HashMap();
        map.put(e.i, "CBC");
        return map;
    }

    @Override // com.alipay.sdk.m.s.e
    public String a(on onVar) throws JSONException {
        return a(onVar, new HashMap<>(), new HashMap<>());
    }

    @Override // com.alipay.sdk.m.s.e
    public String a(on onVar, String str, JSONObject jSONObject) {
        String strA = super.a(onVar, str, jSONObject);
        try {
            String strF = np.e().f();
            mu.d(onVar, "biz", "localConfigVersion", strF);
            JSONObject jSONObject2 = new JSONObject(strA);
            jSONObject2.put("h5_local", "true");
            jSONObject2.put("h5_local_version", strF);
            jSONObject2.put("route_pay_from", BleConstants.BLE_THIRD_DEVICE_H5);
            jSONObject2.put("init_from", "SDKLite");
            jSONObject2.put("cc", "y");
            return jSONObject2.toString();
        } catch (Throwable th) {
            mu.c(onVar, "biz", "buildBody", th);
            oq.c(th);
            return strA;
        }
    }
}
