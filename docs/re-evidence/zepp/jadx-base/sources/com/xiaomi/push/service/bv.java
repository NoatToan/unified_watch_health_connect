package com.xiaomi.push.service;

import android.content.Context;
import android.util.Log;
import com.xiaomi.push.df;
import com.xiaomi.push.dt;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class bv implements XMPushService.n {
    private static final boolean a = Log.isLoggable("UNDatas", 3);
    private static final Map<Integer, Map<String, List<String>>> b = new HashMap();
    private static Context c;

    public bv(Context context) {
        c = context;
    }

    private static dt c(String str, String str2, String str3, String str4) {
        dt dtVar = new dt();
        if (str3 != null) {
            dtVar.c(str3);
        }
        if (str != null) {
            dtVar.b(str);
        }
        if (str2 != null) {
            dtVar.a(str2);
        }
        if (str4 != null) {
            dtVar.d(str4);
        }
        dtVar.a(false);
        return dtVar;
    }

    private static void d(Context context, dt dtVar) {
        if (a) {
            com.xiaomi.channel.commonutils.logger.b.b("UNDatas upload message notification:" + dtVar);
        }
        com.xiaomi.push.o.a(context).a(new k0(dtVar));
    }

    private static void e() {
        HashMap map = new HashMap();
        map.putAll(b);
        if (map.size() > 0) {
            for (Integer num : map.keySet()) {
                Map map2 = (Map) map.get(num);
                if (map2 != null && map2.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (String str : map2.keySet()) {
                        sb.append(str);
                        sb.append(":");
                        List list = (List) map2.get(str);
                        if (!com.xiaomi.channel.commonutils.android.l.a(list)) {
                            for (int i = 0; i < list.size(); i++) {
                                if (i != 0) {
                                    sb.append(",");
                                }
                                sb.append((String) list.get(i));
                            }
                        }
                        sb.append(";");
                    }
                    dt dtVarC = c(null, aw.a(), df.NotificationRemoved.f77a, null);
                    dtVarC.a("removed_reason", String.valueOf(num));
                    dtVarC.a("all_delete_msgId_appId", sb.toString());
                    com.xiaomi.channel.commonutils.logger.b.b("UNDatas upload all removed messages reason: " + num + " allIds: " + sb.toString());
                    d(c, dtVarC);
                }
                b.remove(num);
            }
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.n
    public void a() {
        Map<Integer, Map<String, List<String>>> map = b;
        if (map.size() > 0) {
            synchronized (map) {
                e();
            }
        }
    }
}
