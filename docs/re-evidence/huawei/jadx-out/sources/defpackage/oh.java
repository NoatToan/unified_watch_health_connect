package defpackage;

import android.content.Context;
import com.alipay.sdk.m.s.e;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class oh extends e {
    @Override // com.alipay.sdk.m.s.e
    public String a(on onVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.alipay.sdk.m.s.e
    public Map<String, String> a(boolean z, String str) {
        return new HashMap();
    }

    @Override // com.alipay.sdk.m.s.e
    public JSONObject a() {
        return null;
    }

    @Override // com.alipay.sdk.m.s.e
    public boolean c() {
        return false;
    }

    @Override // com.alipay.sdk.m.s.e
    public nw a(on onVar, Context context, String str) throws Throwable {
        oq.c("mspl", "mdap post");
        byte[] bArrE = nk.e(str.getBytes(Charset.forName("UTF-8")));
        HashMap map = new HashMap();
        map.put("utdId", ol.e().b());
        map.put("logHeader", "RAW");
        map.put("bizCode", "alipaysdk");
        map.put("productId", "alipaysdk_android");
        map.put("Content-Encoding", "Gzip");
        map.put("productVersion", "15.8.35");
        nu.b bVarD = nu.d(context, new nu.c("https://loggw-exsdk.alipay.com/loggw/logUpload.do", map, bArrE));
        oq.c("mspl", "mdap got " + bVarD);
        if (bVarD == null) {
            throw new RuntimeException("Response is null");
        }
        boolean zA = e.a(bVarD);
        try {
            byte[] bArrB = bVarD.f43724b;
            if (zA) {
                bArrB = nk.b(bArrB);
            }
            return new nw("", new String(bArrB, Charset.forName("UTF-8")));
        } catch (Exception e) {
            oq.c(e);
            return null;
        }
    }
}
