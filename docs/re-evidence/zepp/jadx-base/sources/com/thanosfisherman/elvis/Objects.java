package com.thanosfisherman.elvis;

import java.util.Arrays;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
public final class Objects {

    public static final class ToStringHelper {
        private final String a;
        private final a b;
        private a c;
        private boolean d;

        public static final class a {
            public String a;
            public Object b;
            public a c;

            private a() {
            }
        }

        public ToStringHelper(String str) {
            a aVar = new a();
            this.b = aVar;
            this.c = aVar;
            this.a = (String) Objects.checkNotNull(str);
        }

        private a a() {
            a aVar = new a();
            this.c.c = aVar;
            this.c = aVar;
            return aVar;
        }

        private ToStringHelper b(@Nullable Object obj) {
            a().b = obj;
            return this;
        }

        private ToStringHelper c(String str, @Nullable Object obj) {
            a aVarA = a();
            aVarA.b = obj;
            aVarA.a = (String) Objects.checkNotNull(str);
            return this;
        }

        public ToStringHelper add(String str, @Nullable Object obj) {
            return c(str, obj);
        }

        public ToStringHelper addValue(@Nullable Object obj) {
            return b(obj);
        }

        public ToStringHelper omitNullValues() {
            this.d = true;
            return this;
        }

        public String toString() {
            boolean z = this.d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append('{');
            String str = "";
            for (a aVar = this.b.c; aVar != null; aVar = aVar.c) {
                if (!z || aVar.b != null) {
                    sb.append(str);
                    String str2 = aVar.a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append(com.alipay.sdk.m.n.a.h);
                    }
                    sb.append(aVar.b);
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        public ToStringHelper add(String str, boolean z) {
            return c(str, String.valueOf(z));
        }

        public ToStringHelper addValue(boolean z) {
            return b(String.valueOf(z));
        }

        public ToStringHelper add(String str, char c) {
            return c(str, String.valueOf(c));
        }

        public ToStringHelper addValue(char c) {
            return b(String.valueOf(c));
        }

        public ToStringHelper add(String str, double d) {
            return c(str, String.valueOf(d));
        }

        public ToStringHelper addValue(double d) {
            return b(String.valueOf(d));
        }

        public ToStringHelper add(String str, float f) {
            return c(str, String.valueOf(f));
        }

        public ToStringHelper addValue(float f) {
            return b(String.valueOf(f));
        }

        public ToStringHelper add(String str, int i) {
            return c(str, String.valueOf(i));
        }

        public ToStringHelper addValue(int i) {
            return b(String.valueOf(i));
        }

        public ToStringHelper add(String str, long j) {
            return c(str, String.valueOf(j));
        }

        public ToStringHelper addValue(long j) {
            return b(String.valueOf(j));
        }
    }

    private Objects() {
    }

    public static String a(Class<?> cls) {
        String strReplaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int iLastIndexOf = strReplaceAll.lastIndexOf(36);
        if (iLastIndexOf == -1) {
            iLastIndexOf = strReplaceAll.lastIndexOf(46);
        }
        return strReplaceAll.substring(iLastIndexOf + 1);
    }

    public static <T> T checkNotNull(T t) {
        java.util.Objects.requireNonNull(t);
        return t;
    }

    public static boolean equals(@Nullable Object obj, @Nullable Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> T firstNonNull(@Nullable T t, @Nullable T t2) {
        return t != null ? t : (T) checkNotNull(t2);
    }

    public static int hashCode(@Nullable Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static <T> T requireNonNull(T t) {
        java.util.Objects.requireNonNull(t);
        return t;
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(a(obj.getClass()));
    }

    public static <T> T checkNotNull(T t, @Nullable Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T requireNonNull(T t, String str) {
        java.util.Objects.requireNonNull(t, str);
        return t;
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(a(cls));
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }
}
