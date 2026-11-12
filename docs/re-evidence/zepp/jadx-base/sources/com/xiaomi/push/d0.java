package com.xiaomi.push;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
class d0 {
    public static void a(com.xiaomi.push.service.az.b bVar, String str, bt btVar) {
        String strA;
        au.c cVar = new au.c();
        if (!TextUtils.isEmpty(bVar.c)) {
            cVar.a(bVar.c);
        }
        if (!TextUtils.isEmpty(bVar.e)) {
            cVar.d(bVar.e);
        }
        if (!TextUtils.isEmpty(bVar.f)) {
            cVar.e(bVar.f);
        }
        cVar.b(bVar.f207a ? "1" : "0");
        if (TextUtils.isEmpty(bVar.d)) {
            cVar.c("XIAOMI-SASL");
        } else {
            cVar.c(bVar.d);
        }
        bi biVar = new bi();
        biVar.c(bVar.b);
        biVar.a(Integer.parseInt(bVar.g));
        biVar.b(bVar.f206a);
        biVar.a("BIND", (String) null);
        biVar.a(biVar.e());
        com.xiaomi.channel.commonutils.logger.b.m3434a("[Slim]: bind id=" + biVar.e());
        HashMap map = new HashMap();
        map.put("challenge", str);
        map.put("token", bVar.c);
        map.put("chid", bVar.g);
        map.put("from", bVar.b);
        map.put("id", biVar.e());
        map.put("to", "xiaomi.com");
        if (bVar.f207a) {
            map.put("kick", "1");
        } else {
            map.put("kick", "0");
        }
        if (TextUtils.isEmpty(bVar.e)) {
            map.put("client_attrs", "");
        } else {
            map.put("client_attrs", bVar.e);
        }
        if (TextUtils.isEmpty(bVar.f)) {
            map.put("cloud_attrs", "");
        } else {
            map.put("cloud_attrs", bVar.f);
        }
        if (bVar.d.equals("XIAOMI-PASS") || bVar.d.equals("XMPUSH-PASS")) {
            strA = ab.a(bVar.d, null, map, bVar.h);
        } else {
            bVar.d.equals("XIAOMI-SASL");
            strA = null;
        }
        cVar.f(strA);
        biVar.a(cVar.m3755a(), (String) null);
        btVar.b(biVar);
    }

    public static void b(String str, String str2, bt btVar) {
        bi biVar = new bi();
        biVar.c(str2);
        biVar.a(Integer.parseInt(str));
        biVar.a("UBND", (String) null);
        btVar.b(biVar);
    }
}
