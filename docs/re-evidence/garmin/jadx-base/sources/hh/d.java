package hh;

import android.content.Context;
import com.google.common.net.HttpHeaders;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Objects;
import kg.f;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class d extends fh.e {
    @Override // fh.e
    public final fh.b a(Context context, String str, lh.a aVar) throws Throwable {
        byte[] bArrA = ch.b.a(str.getBytes(Charset.forName("UTF-8")));
        HashMap map = new HashMap();
        map.put("utdId", lh.b.b().a());
        map.put("logHeader", "RAW");
        map.put("bizCode", "alipaysdk");
        map.put("productId", "alipaysdk_android");
        map.put(HttpHeaders.CONTENT_ENCODING, "Gzip");
        map.put("productVersion", "15.8.30");
        eh.a.b bVarA = eh.a.a(context, new eh.a.C1357a("https://loggw-exsdk.alipay.com/loggw/logUpload.do", map, bArrA));
        Objects.toString(bVarA);
        if (bVarA == null) {
            f.n("Response is null");
            return null;
        }
        boolean zI = fh.e.i(bVarA);
        try {
            byte[] bArrB = bVarA.f64024b;
            if (zI) {
                bArrB = ch.b.b(bArrB);
            }
            return new fh.b("", new String(bArrB, Charset.forName("UTF-8")));
        } catch (Exception e4) {
            nh.d.a(e4);
            return null;
        }
    }

    @Override // fh.e
    public final String d(lh.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // fh.e
    public final HashMap f(String str, boolean z14) {
        return new HashMap();
    }

    @Override // fh.e
    public final JSONObject g() {
        return null;
    }
}
