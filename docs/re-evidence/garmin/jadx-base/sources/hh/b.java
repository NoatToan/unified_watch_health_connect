package hh;

import android.content.Context;
import android.os.Process;
import android.util.Base64;
import java.security.SecureRandom;
import java.util.HashMap;
import nh.n;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class b extends fh.e {
    @Override // fh.e
    public final String e(lh.a aVar, HashMap<String, String> map, HashMap<String, String> map2) {
        String strEncodeToString;
        int iMyUid;
        HashMap map3 = new HashMap();
        try {
            sg.a aVarA = nh.a.a();
            JSONObject jSONObject = new JSONObject();
            Context applicationContext = aVar != null ? aVar.f112378c : null;
            if (applicationContext == null) {
                applicationContext = lh.b.b().f112390a.getApplicationContext();
            }
            String strB = n.b(applicationContext, aVar);
            String strA = oh.b.a(applicationContext, aVar);
            String strEncodeToString2 = "";
            if (aVarA != null) {
                byte[] bArr = aVarA.f144652a;
                SecureRandom secureRandom = qg.b.f144653a;
                strEncodeToString = Base64.encodeToString(bArr, 3);
            } else {
                strEncodeToString = "";
            }
            jSONObject.put("ap_q", strEncodeToString);
            jSONObject.put("ap_link_token", aVar != null ? aVar.f112379d : "");
            try {
                iMyUid = Process.myUid();
            } catch (Throwable th3) {
                nh.d.a(th3);
                iMyUid = -200;
            }
            jSONObject.put("u_pd", String.valueOf(iMyUid));
            jSONObject.put("u_lk", String.valueOf(n.n(n.k())));
            jSONObject.put("u_pi", String.valueOf(aVar != null ? aVar.f112381f : "_"));
            jSONObject.put("u_fu", strB);
            jSONObject.put("u_oi", strA);
            map3.put("ap_req", jSONObject.toString());
            StringBuilder sb3 = new StringBuilder();
            if (aVarA != null) {
                byte[] bArr2 = aVarA.f144652a;
                SecureRandom secureRandom2 = qg.b.f144653a;
                strEncodeToString2 = Base64.encodeToString(bArr2, 3);
            }
            sb3.append(strEncodeToString2);
            sb3.append("|");
            sb3.append(strB);
            wg.a.c(aVar, "biz", "ap_q", sb3.toString());
        } catch (Exception e4) {
            wg.a.d(aVar, "biz", "APMEx1", e4);
        }
        map2.putAll(map3);
        map2.toString();
        return super.e(aVar, map, map2);
    }

    @Override // fh.e
    public final JSONObject g() {
        return fh.e.h("sdkConfig", "obtain");
    }

    @Override // fh.e
    public final String j() {
        return "5.0.0";
    }
}
