package defpackage;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class i4h {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f20773b;
        public a c;
        public boolean d;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f20774a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f20775b;
            public a c;

            public a() {
            }
        }

        public b a(String str, int i) {
            return e(str, String.valueOf(i));
        }

        public b b(String str, Object obj) {
            return e(str, obj);
        }

        public b c(String str, boolean z) {
            return e(str, String.valueOf(z));
        }

        public final a d() {
            a aVar = new a();
            this.c.c = aVar;
            this.c = aVar;
            return aVar;
        }

        public final b e(String str, Object obj) {
            a aVarD = d();
            aVarD.f20775b = obj;
            aVarD.f20774a = (String) b6i.g(str);
            return this;
        }

        public String toString() {
            boolean z = this.d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f20772a);
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            String str = "";
            for (a aVar = this.f20773b.c; aVar != null; aVar = aVar.c) {
                if (!z || aVar.f20775b != null) {
                    sb.append(str);
                    String str2 = aVar.f20774a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    sb.append(aVar.f20775b);
                    str = ", ";
                }
            }
            sb.append(AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }

        public b(String str) {
            a aVar = new a();
            this.f20773b = aVar;
            this.c = aVar;
            this.d = false;
            this.f20772a = (String) b6i.g(str);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static String c(Class<?> cls) {
        String strReplaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int iLastIndexOf = strReplaceAll.lastIndexOf(36);
        if (iLastIndexOf == -1) {
            iLastIndexOf = strReplaceAll.lastIndexOf(46);
        }
        return strReplaceAll.substring(iLastIndexOf + 1);
    }

    public static b d(Object obj) {
        return new b(c(obj.getClass()));
    }
}
