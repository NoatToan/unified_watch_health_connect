package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public final class MoreObjects {

    public static final class ToStringHelper {
        private final String a;
        private final a b;
        private a c;
        private boolean d;

        public static final class a {

            @NullableDecl
            public String a;

            @NullableDecl
            public Object b;

            @NullableDecl
            public a c;

            private a() {
            }
        }

        private a a() {
            a aVar = new a();
            this.c.c = aVar;
            this.c = aVar;
            return aVar;
        }

        private ToStringHelper b(@NullableDecl Object obj) {
            a().b = obj;
            return this;
        }

        private ToStringHelper c(String str, @NullableDecl Object obj) {
            a aVarA = a();
            aVarA.b = obj;
            aVarA.a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, @NullableDecl Object obj) {
            return c(str, obj);
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(@NullableDecl Object obj) {
            return b(obj);
        }

        @CanIgnoreReturnValue
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
                Object obj = aVar.b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = aVar.a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append(com.alipay.sdk.m.n.a.h);
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private ToStringHelper(String str) {
            a aVar = new a();
            this.b = aVar;
            this.c = aVar;
            this.d = false;
            this.a = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, boolean z) {
            return c(str, String.valueOf(z));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(boolean z) {
            return b(String.valueOf(z));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, char c) {
            return c(str, String.valueOf(c));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(char c) {
            return b(String.valueOf(c));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, double d) {
            return c(str, String.valueOf(d));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(double d) {
            return b(String.valueOf(d));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, float f) {
            return c(str, String.valueOf(f));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(float f) {
            return b(String.valueOf(f));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, int i) {
            return c(str, String.valueOf(i));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(int i) {
            return b(String.valueOf(i));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, long j) {
            return c(str, String.valueOf(j));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(long j) {
            return b(String.valueOf(j));
        }
    }

    private MoreObjects() {
    }

    public static <T> T firstNonNull(@NullableDecl T t, @NullableDecl T t2) {
        if (t != null) {
            return t;
        }
        java.util.Objects.requireNonNull(t2, "Both parameters are null");
        return t2;
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }
}
