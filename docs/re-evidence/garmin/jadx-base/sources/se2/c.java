package se2;

import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p005kotlin.Unit;
import p13.w;
import zk.d;

/* JADX INFO: loaded from: classes11.dex */
public final class c {
    public static final void a(b bVar, Map<a, ? extends Object> map) {
        bVar.getClass();
        zk.c cVar = zk.c.f205034a;
        List listC = w.c("FIREBASE");
        cVar.getClass();
        zk.b bVar2 = new zk.b("FIREBASE", new d(cVar, null, listC));
        String strN = fb1.c.n("MobAuth_", bVar.name());
        HashMap map2 = new HashMap();
        for (Map.Entry<a, ? extends Object> entry : map.entrySet()) {
            a key = entry.getKey();
            Object value = entry.getValue();
            String strName = key.name();
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strName.toLowerCase(locale);
            lowerCase.getClass();
            map2.put(lowerCase, value);
        }
        map2.put("android_model", Build.MODEL);
        map2.put("android_mfg", Build.MANUFACTURER);
        map2.put("os_ver", Integer.valueOf(Build.VERSION.SDK_INT));
        map2.put("lib", "mobile-auth");
        map2.put("lib_ver", "16.1.0");
        Unit unit = Unit.INSTANCE;
        zk.a aVar = new zk.a(strN, map2, 0L, 4, null);
        aVar.f205031c = aVar.f205031c;
        bVar2.f205033a.a(aVar);
    }
}
