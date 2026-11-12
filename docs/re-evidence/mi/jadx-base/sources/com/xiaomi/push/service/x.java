package com.xiaomi.push.service;

import android.content.Context;
import android.util.Log;
import com.xiaomi.push.il;
import com.xiaomi.push.ja;
import defpackage.det;
import defpackage.gbs;
import defpackage.k5s;
import defpackage.pgs;
import defpackage.x9s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class x implements XMPushService.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f14268a = Log.isLoggable("UNDatas", 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Integer, Map<String, List<String>>> f14269b = new HashMap();
    public static Context c;

    public x(Context context) {
        c = context;
    }

    public static ja c(String str, String str2, String str3, String str4) {
        ja jaVar = new ja();
        if (str3 != null) {
            jaVar.c(str3);
        }
        if (str != null) {
            jaVar.b(str);
        }
        if (str2 != null) {
            jaVar.a(str2);
        }
        if (str4 != null) {
            jaVar.d(str4);
        }
        jaVar.a(false);
        return jaVar;
    }

    public static void d(Context context, ja jaVar) {
        if (f14268a) {
            x9s.y("UNDatas upload message notification:" + jaVar);
        }
        k5s.a(context).g(new pgs(jaVar));
    }

    public static void e() {
        HashMap map = new HashMap();
        map.putAll(f14269b);
        if (map.size() > 0) {
            for (Integer num : map.keySet()) {
                Map map2 = (Map) map.get(num);
                if (map2 != null && map2.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (String str : map2.keySet()) {
                        sb.append(str);
                        sb.append(":");
                        List list = (List) map2.get(str);
                        if (!det.d(list)) {
                            for (int i = 0; i < list.size(); i++) {
                                if (i != 0) {
                                    sb.append(",");
                                }
                                sb.append((String) list.get(i));
                            }
                        }
                        sb.append(";");
                    }
                    ja jaVarC = c(null, gbs.a(), il.NotificationRemoved.f125a, null);
                    jaVarC.a("removed_reason", String.valueOf(num));
                    jaVarC.a("all_delete_msgId_appId", sb.toString());
                    x9s.y("UNDatas upload all removed messages reason: " + num + " allIds: " + sb.toString());
                    d(c, jaVarC);
                }
                f14269b.remove(num);
            }
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.n
    public void a() {
        Map<Integer, Map<String, List<String>>> map = f14269b;
        if (map.size() > 0) {
            synchronized (map) {
                e();
            }
        }
    }
}
