package hh;

import android.content.Context;
import com.github.mikephil.chartingv2.BuildConfig;
import com.mapbox.common.HttpHeaders;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class c extends fh.e {
    @Override // fh.e
    public final fh.b a(Context context, String str, lh.a aVar) {
        return b(null, context, str, "https://mcgw.alipay.com/sdklog.do", true);
    }

    @Override // fh.e
    public final String c(lh.a aVar) {
        HashMap<String, String> map = new HashMap<>();
        map.put("api_name", "/sdk/log");
        map.put("api_version", "1.0.0");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("log_v", BuildConfig.VERSION_NAME);
        return e(aVar, map, map2);
    }

    @Override // fh.e
    public final String d(lh.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // fh.e
    public final HashMap f(String str, boolean z14) {
        HashMap map = new HashMap();
        map.put("msp-gzip", String.valueOf(z14));
        map.put(HttpHeaders.CONTENT_TYPE, "application/octet-stream");
        map.put("des-mode", "CBC");
        return map;
    }

    @Override // fh.e
    public final JSONObject g() {
        return null;
    }
}
