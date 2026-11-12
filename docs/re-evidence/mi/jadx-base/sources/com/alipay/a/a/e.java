package com.alipay.a.a;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<i> f5719a;

    static {
        ArrayList arrayList = new ArrayList();
        f5719a = arrayList;
        arrayList.add(new l());
        f5719a.add(new d());
        f5719a.add(new c());
        f5719a.add(new h());
        f5719a.add(new k());
        f5719a.add(new b());
        f5719a.add(new a());
        f5719a.add(new g());
    }

    public static final <T> T a(Object obj, Type type) {
        T t;
        for (i iVar : f5719a) {
            if (iVar.a(com.alipay.a.b.a.a(type)) && (t = (T) iVar.b(obj, type)) != null) {
                return t;
            }
        }
        return null;
    }

    public static final Object b(String str, Type type) {
        Object bVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("[") && strTrim.endsWith("]")) {
            bVar = new org.json.alipay.a(strTrim);
        } else {
            if (!strTrim.startsWith("{") || !strTrim.endsWith("}")) {
                return a(strTrim, type);
            }
            bVar = new org.json.alipay.b(strTrim);
        }
        return a(bVar, type);
    }
}
