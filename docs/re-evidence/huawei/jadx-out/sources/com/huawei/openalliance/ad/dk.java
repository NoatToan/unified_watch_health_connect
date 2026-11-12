package com.huawei.openalliance.ad;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class dk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, dn> f18396a = new HashMap();

    public static void b() {
        synchronized (dk.class) {
            Iterator<String> it = f18396a.keySet().iterator();
            while (it.hasNext()) {
                dn dnVar = f18396a.get(it.next());
                if (dnVar != null) {
                    dnVar.d();
                }
            }
        }
    }

    public static void a() {
        synchronized (dk.class) {
            Iterator<String> it = f18396a.keySet().iterator();
            while (it.hasNext()) {
                dn dnVar = f18396a.get(it.next());
                if (dnVar != null) {
                    dnVar.a();
                }
            }
            f18396a.clear();
        }
    }

    public static dn a(Context context, String str) {
        dn dnVar;
        synchronized (dk.class) {
            if (com.huawei.openalliance.ad.utils.dg.b(str)) {
                str = "normal";
            }
            dnVar = f18396a.get(str);
            if (dnVar == null) {
                dnVar = new dn(context, str);
            }
            f18396a.put(str, dnVar);
        }
        return dnVar;
    }
}
