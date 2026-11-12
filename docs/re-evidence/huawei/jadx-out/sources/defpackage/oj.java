package defpackage;

import android.content.Context;
import com.alipay.sdk.m.s.e;
import com.huawei.hms.network.base.common.trans.FileBinary;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class oj extends e {
    @Override // com.alipay.sdk.m.s.e
    public String a(on onVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.alipay.sdk.m.s.e
    public Map<String, String> a(boolean z, String str) {
        HashMap map = new HashMap();
        map.put(e.f2125c, String.valueOf(z));
        map.put(e.f, FileBinary.HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM);
        map.put(e.i, "CBC");
        return map;
    }

    @Override // com.alipay.sdk.m.s.e
    public JSONObject a() throws JSONException {
        return null;
    }

    @Override // com.alipay.sdk.m.s.e
    public boolean c() {
        return false;
    }

    @Override // com.alipay.sdk.m.s.e
    public String a(on onVar) throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        map.put("api_name", "/sdk/log");
        map.put(e.l, "1.0.0");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("log_v", "1.0");
        return a(onVar, map, map2);
    }

    @Override // com.alipay.sdk.m.s.e
    public nw a(on onVar, Context context, String str) throws Throwable {
        return a(onVar, context, str, "https://mcgw.alipay.com/sdklog.do", true);
    }
}
