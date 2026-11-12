package com.huawei.openalliance.ad;

import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public interface lj<R> {
    long a();

    R a(int i, InputStream inputStream, long j, kw kwVar);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final lk f19493a = new lk();

        public static <RD> lj<RD> a(Class<RD> cls) {
            if (cls == Integer.TYPE || cls == Integer.class) {
                return new lg();
            }
            if (cls == Float.TYPE || cls == Float.class) {
                return new le();
            }
            if (cls == Double.TYPE || cls == Double.class) {
                return new ld();
            }
            if (cls == Long.TYPE || cls == Long.class) {
                return new li();
            }
            if (cls == String.class) {
                return f19493a;
            }
            if (!cls.isPrimitive()) {
                return new lh(cls);
            }
            throw new IllegalArgumentException("Response type: " + cls + " not supported!");
        }
    }
}
