package defpackage;

import java.lang.reflect.Method;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class n4q {
    public static final n4q e = new n4q(0, "VZCBSIFJD", 0, 1);
    public static final n4q f = new n4q(1, "VZCBSIFJD", 1, 2);
    public static final n4q g = new n4q(2, "VZCBSIFJD", 2, 3);
    public static final n4q h = new n4q(3, "VZCBSIFJD", 3, 4);
    public static final n4q i = new n4q(4, "VZCBSIFJD", 4, 5);
    public static final n4q j = new n4q(5, "VZCBSIFJD", 5, 6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n4q f27548k = new n4q(6, "VZCBSIFJD", 6, 7);
    public static final n4q l = new n4q(7, "VZCBSIFJD", 7, 8);
    public static final n4q m = new n4q(8, "VZCBSIFJD", 8, 9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27550b;
    public final int c;
    public final int d;

    public n4q(int i2, String str, int i3, int i4) {
        this.f27549a = i2;
        this.f27550b = str;
        this.c = i3;
        this.d = i4;
    }

    public static void a(Class<?> cls, StringBuilder sb) {
        char c;
        while (cls.isArray()) {
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            sb.append('L');
            sb.append(g(cls));
            sb.append(';');
            return;
        }
        if (cls == Integer.TYPE) {
            c = 'I';
        } else if (cls == Void.TYPE) {
            c = 'V';
        } else if (cls == Boolean.TYPE) {
            c = 'Z';
        } else if (cls == Byte.TYPE) {
            c = 'B';
        } else if (cls == Character.TYPE) {
            c = 'C';
        } else if (cls == Short.TYPE) {
            c = 'S';
        } else if (cls == Double.TYPE) {
            c = 'D';
        } else if (cls == Float.TYPE) {
            c = 'F';
        } else {
            if (cls != Long.TYPE) {
                throw new AssertionError();
            }
            c = 'J';
        }
        sb.append(c);
    }

    public static n4q[] b(String str) {
        int i2 = 0;
        int i3 = 0;
        int iMax = 1;
        while (str.charAt(iMax) != ')') {
            while (str.charAt(iMax) == '[') {
                iMax++;
            }
            int i4 = iMax + 1;
            iMax = str.charAt(iMax) == 'L' ? Math.max(i4, str.indexOf(59, i4) + 1) : i4;
            i3++;
        }
        n4q[] n4qVarArr = new n4q[i3];
        int i5 = 1;
        while (str.charAt(i5) != ')') {
            int i6 = i5;
            while (str.charAt(i6) == '[') {
                i6++;
            }
            int iMax2 = i6 + 1;
            if (str.charAt(i6) == 'L') {
                iMax2 = Math.max(iMax2, str.indexOf(59, iMax2) + 1);
            }
            n4qVarArr[i2] = o(str, i5, iMax2);
            i2++;
            i5 = iMax2;
        }
        return n4qVarArr;
    }

    public static int c(String str) {
        char cCharAt = str.charAt(1);
        int i2 = 1;
        int i3 = 1;
        while (cCharAt != ')') {
            if (cCharAt == 'J' || cCharAt == 'D') {
                i2++;
                i3 += 2;
            } else {
                while (str.charAt(i2) == '[') {
                    i2++;
                }
                int iMax = i2 + 1;
                if (str.charAt(i2) == 'L') {
                    iMax = Math.max(iMax, str.indexOf(59, iMax) + 1);
                }
                i3++;
                i2 = iMax;
            }
            cCharAt = str.charAt(i2);
        }
        char cCharAt2 = str.charAt(i2 + 1);
        if (cCharAt2 == 'V') {
            return i3 << 2;
        }
        return (i3 << 2) | ((cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1);
    }

    public static String e(Class<?> cls) {
        StringBuilder sb = new StringBuilder();
        a(cls, sb);
        return sb.toString();
    }

    public static String g(Class<?> cls) {
        return cls.getName().replace('.', '/');
    }

    public static String h(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (Class<?> cls : method.getParameterTypes()) {
            a(cls, sb);
        }
        sb.append(')');
        a(method.getReturnType(), sb);
        return sb.toString();
    }

    public static n4q i(String str) {
        return new n4q(11, str, 0, str.length());
    }

    public static n4q j(String str) {
        return new n4q(str.charAt(0) == '[' ? 9 : 12, str, 0, str.length());
    }

    public static int k(String str) {
        int iMax = 1;
        while (str.charAt(iMax) != ')') {
            while (str.charAt(iMax) == '[') {
                iMax++;
            }
            int i2 = iMax + 1;
            iMax = str.charAt(iMax) == 'L' ? Math.max(i2, str.indexOf(59, i2) + 1) : i2;
        }
        return iMax + 1;
    }

    public static n4q m(Class<?> cls) {
        if (!cls.isPrimitive()) {
            return n(e(cls));
        }
        if (cls == Integer.TYPE) {
            return j;
        }
        if (cls == Void.TYPE) {
            return e;
        }
        if (cls == Boolean.TYPE) {
            return f;
        }
        if (cls == Byte.TYPE) {
            return h;
        }
        if (cls == Character.TYPE) {
            return g;
        }
        if (cls == Short.TYPE) {
            return i;
        }
        if (cls == Double.TYPE) {
            return m;
        }
        if (cls == Float.TYPE) {
            return f27548k;
        }
        if (cls == Long.TYPE) {
            return l;
        }
        throw new AssertionError();
    }

    public static n4q n(String str) {
        return o(str, 0, str.length());
    }

    public static n4q o(String str, int i2, int i3) {
        char cCharAt = str.charAt(i2);
        if (cCharAt == '(') {
            return new n4q(11, str, i2, i3);
        }
        if (cCharAt == 'F') {
            return f27548k;
        }
        if (cCharAt == 'L') {
            return new n4q(10, str, i2 + 1, i3 - 1);
        }
        if (cCharAt == 'S') {
            return i;
        }
        if (cCharAt == 'V') {
            return e;
        }
        if (cCharAt == 'I') {
            return j;
        }
        if (cCharAt == 'J') {
            return l;
        }
        if (cCharAt == 'Z') {
            return f;
        }
        if (cCharAt == '[') {
            return new n4q(9, str, i2, i3);
        }
        switch (cCharAt) {
            case 'B':
                return h;
            case 'C':
                return g;
            case 'D':
                return m;
            default:
                throw new IllegalArgumentException();
        }
    }

    public String d() {
        int i2 = this.f27549a;
        if (i2 == 10) {
            return this.f27550b.substring(this.c - 1, this.d + 1);
        }
        if (i2 != 12) {
            return this.f27550b.substring(this.c, this.d);
        }
        return 'L' + this.f27550b.substring(this.c, this.d) + ';';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4q)) {
            return false;
        }
        n4q n4qVar = (n4q) obj;
        int i2 = this.f27549a;
        if (i2 == 12) {
            i2 = 10;
        }
        int i3 = n4qVar.f27549a;
        if (i2 != (i3 != 12 ? i3 : 10)) {
            return false;
        }
        int i4 = this.c;
        int i5 = this.d;
        int i6 = n4qVar.c;
        if (i5 - i4 != n4qVar.d - i6) {
            return false;
        }
        while (i4 < i5) {
            if (this.f27550b.charAt(i4) != n4qVar.f27550b.charAt(i6)) {
                return false;
            }
            i4++;
            i6++;
        }
        return true;
    }

    public String f() {
        return this.f27550b.substring(this.c, this.d);
    }

    public int hashCode() {
        int i2 = this.f27549a;
        int iCharAt = (i2 == 12 ? 10 : i2) * 13;
        if (i2 >= 9) {
            int i3 = this.d;
            for (int i4 = this.c; i4 < i3; i4++) {
                iCharAt = (iCharAt + this.f27550b.charAt(i4)) * 17;
            }
        }
        return iCharAt;
    }

    public int l() {
        int i2 = this.f27549a;
        if (i2 == 12) {
            return 10;
        }
        return i2;
    }

    public String toString() {
        return d();
    }
}
