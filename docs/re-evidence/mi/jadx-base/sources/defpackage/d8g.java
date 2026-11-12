package defpackage;

import com.google.common.base.Optional;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class d8g {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0909b f15215b;
        public C0909b c;
        public boolean d;
        public boolean e;

        public static final class a extends C0909b {
            public a() {
                super();
            }
        }

        /* JADX INFO: renamed from: d8g$b$b, reason: collision with other inner class name */
        public static class C0909b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f15216a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f15217b;
            public C0909b c;

            public C0909b() {
            }
        }

        public static boolean k(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof Optional) {
                return !((Optional) obj).isPresent();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b a(String str, double d) {
            return i(str, String.valueOf(d));
        }

        public b b(String str, int i) {
            return i(str, String.valueOf(i));
        }

        public b c(String str, long j) {
            return i(str, String.valueOf(j));
        }

        public b d(String str, Object obj) {
            return g(str, obj);
        }

        public final C0909b e() {
            C0909b c0909b = new C0909b();
            this.c.c = c0909b;
            this.c = c0909b;
            return c0909b;
        }

        public final b f(Object obj) {
            e().f15217b = obj;
            return this;
        }

        public final b g(String str, Object obj) {
            C0909b c0909bE = e();
            c0909bE.f15217b = obj;
            c0909bE.f15216a = (String) c6i.o(str);
            return this;
        }

        public final a h() {
            a aVar = new a();
            this.c.c = aVar;
            this.c = aVar;
            return aVar;
        }

        public final b i(String str, Object obj) {
            a aVarH = h();
            aVarH.f15217b = obj;
            aVarH.f15216a = (String) c6i.o(str);
            return this;
        }

        public b j(Object obj) {
            return f(obj);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:14:0x0037  */
        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Code duplicated, block: B:19:0x005d  */
        public String toString() {
            String str;
            boolean z = this.d;
            boolean z2 = this.e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f15214a);
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            String str2 = "";
            for (C0909b c0909b = this.f15215b.c; c0909b != null; c0909b = c0909b.c) {
                Object obj = c0909b.f15217b;
                if (c0909b instanceof a) {
                    sb.append(str2);
                    str = c0909b.f15216a;
                    if (str != null) {
                        sb.append(str);
                        sb.append('=');
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    str2 = ", ";
                } else if (obj == null) {
                    if (!z) {
                        sb.append(str2);
                        str = c0909b.f15216a;
                        if (str != null) {
                            sb.append(str);
                            sb.append('=');
                        }
                        if (obj == null) {
                            sb.append(obj);
                        } else {
                            sb.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z2 || !k(obj)) {
                    sb.append(str2);
                    str = c0909b.f15216a;
                    if (str != null) {
                        sb.append(str);
                        sb.append('=');
                    }
                    if (obj == null) {
                        sb.append(obj);
                    } else {
                        sb.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb.append(AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }

        public b(String str) {
            C0909b c0909b = new C0909b();
            this.f15215b = c0909b;
            this.c = c0909b;
            this.d = false;
            this.e = false;
            this.f15214a = (String) c6i.o(str);
        }
    }

    public static <T> T a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
