package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import i3.e5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import oe2.f;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, String> f28359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f28360b = {"AD1", "AD2", "AD3", "AD8", "AD9", "AD10", "AD11", "AD12", "AD14", "AD15", "AD16", "AD18", "AD20", "AD21", "AD23", "AD24", "AD26", "AD27", "AD28", "AD29", "AD30", "AD31", "AD34", "AA1", "AA2", "AA3", "AA4", "AC4", "AC10", "AE1", "AE2", "AE3", "AE4", "AE5", "AE6", "AE7", "AE8", "AE9", "AE10", "AE11", "AE12", "AE13", "AE14", "AE15"};

    public static String a(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            String str = (String) arrayList.get(i14);
            String str2 = map.get(str);
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder sb3 = new StringBuilder();
            if (i14 != 0) {
                str3 = "&";
            }
            stringBuffer.append(e5.h(sb3, str3, str, "=", str2));
        }
        return stringBuffer.toString();
    }

    public static synchronized String b(Context context, Map<String, String> map) {
        TreeMap treeMap;
        try {
            a(context, map);
            treeMap = new TreeMap();
            for (String str : f28360b) {
                if (f28359a.containsKey(str)) {
                    treeMap.put(str, f28359a.get(str));
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f.c(a(treeMap));
    }

    public static synchronized void c(Context context, Map<String, String> map) {
        TreeMap treeMap = new TreeMap();
        f28359a = treeMap;
        treeMap.putAll(b.a(context, map));
        f28359a.putAll(d.a(context));
        f28359a.putAll(c.a(context));
        f28359a.putAll(a.a(context, map));
    }

    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        try {
            if (f28359a == null) {
                c(context, map);
            }
            f28359a.putAll(d.a());
        } catch (Throwable th3) {
            throw th3;
        }
        return f28359a;
    }

    public static synchronized void a() {
        f28359a = null;
    }
}
