package defpackage;

import android.text.TextUtils;
import com.xiaomi.push.service.bg;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class hvs {
    public static void a(bg.b bVar, String str, gws gwsVar) {
        String strB;
        gqs gqsVar = new gqs();
        if (!TextUtils.isEmpty(bVar.c)) {
            gqsVar.k(bVar.c);
        }
        if (!TextUtils.isEmpty(bVar.f)) {
            gqsVar.t(bVar.f);
        }
        if (!TextUtils.isEmpty(bVar.g)) {
            gqsVar.w(bVar.g);
        }
        gqsVar.n(bVar.e ? "1" : "0");
        if (TextUtils.isEmpty(bVar.d)) {
            gqsVar.q("XIAOMI-SASL");
        } else {
            gqsVar.q(bVar.d);
        }
        mvs mvsVar = new mvs();
        mvsVar.B(bVar.f14197b);
        mvsVar.h(Integer.parseInt(bVar.h));
        mvsVar.v(bVar.f14196a);
        mvsVar.l("BIND", null);
        mvsVar.k(mvsVar.D());
        x9s.o("[Slim]: bind id=" + mvsVar.D());
        HashMap map = new HashMap();
        map.put("challenge", str);
        map.put("token", bVar.c);
        map.put("chid", bVar.h);
        map.put("from", bVar.f14197b);
        map.put("id", mvsVar.D());
        map.put("to", "xiaomi.com");
        if (bVar.e) {
            map.put("kick", "1");
        } else {
            map.put("kick", "0");
        }
        if (TextUtils.isEmpty(bVar.f)) {
            map.put("client_attrs", "");
        } else {
            map.put("client_attrs", bVar.f);
        }
        if (TextUtils.isEmpty(bVar.g)) {
            map.put("cloud_attrs", "");
        } else {
            map.put("cloud_attrs", bVar.g);
        }
        if (bVar.d.equals("XIAOMI-PASS") || bVar.d.equals("XMPUSH-PASS")) {
            strB = ics.b(bVar.d, null, map, bVar.i);
        } else {
            bVar.d.equals("XIAOMI-SASL");
            strB = null;
        }
        gqsVar.z(strB);
        mvsVar.n(gqsVar.h(), null);
        gwsVar.w(mvsVar);
    }

    public static void b(String str, String str2, gws gwsVar) {
        mvs mvsVar = new mvs();
        mvsVar.B(str2);
        mvsVar.h(Integer.parseInt(str));
        mvsVar.l("UBND", null);
        gwsVar.w(mvsVar);
    }
}
