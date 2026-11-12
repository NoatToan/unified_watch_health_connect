package com.huawei.openalliance.ad;

import android.content.Context;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface la<P> {
    String a();

    String a(P p, kw kwVar);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map<Type, la> f19446a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static lb f19447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static ky f19448c;
        private static kz d;

        private static void a(Context context) {
            synchronized (a.class) {
                if (f19447b == null) {
                    lb lbVar = new lb(context);
                    f19447b = lbVar;
                    f19446a.put(String.class, lbVar);
                }
                if (f19448c == null) {
                    f19448c = new ky(context);
                    Map<Type, la> map = f19446a;
                    map.put(Integer.TYPE, f19448c);
                    map.put(Integer.class, f19448c);
                    map.put(Float.TYPE, f19448c);
                    map.put(Float.class, f19448c);
                    map.put(Long.TYPE, f19448c);
                    map.put(Long.class, f19448c);
                    map.put(Double.TYPE, f19448c);
                    map.put(Double.class, f19448c);
                    map.put(Short.TYPE, f19448c);
                    map.put(Short.class, f19448c);
                    map.put(Byte.TYPE, f19448c);
                    map.put(Byte.class, f19448c);
                    map.put(Character.TYPE, f19448c);
                    map.put(Character.class, f19448c);
                    map.put(Boolean.TYPE, f19448c);
                    map.put(Boolean.class, f19448c);
                }
                if (d == null) {
                    d = new kz(context);
                }
            }
        }

        public static la a(Context context, Class cls) {
            a(context);
            la laVar = f19446a.get(cls);
            return laVar == null ? d : laVar;
        }
    }
}
