package defpackage;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pbm implements obm {
    public static boolean h = true;
    public static String[] i = new String[0];
    public static Class[] j = new Class[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30214b;
    public String c;
    public Class d;
    public a e;
    public String f;
    public ClassLoader g = null;

    public interface a {
        void a(int i, String str);

        String get(int i);
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SoftReference f30215a;

        public b() {
            c();
        }

        @Override // pbm.a
        public void a(int i, String str) {
            String[] strArrB = b();
            if (strArrB == null) {
                strArrB = c();
            }
            strArrB[i] = str;
        }

        public final String[] b() {
            return (String[]) this.f30215a.get();
        }

        public final String[] c() {
            String[] strArr = new String[3];
            this.f30215a = new SoftReference(strArr);
            return strArr;
        }

        @Override // pbm.a
        public String get(int i) {
            String[] strArrB = b();
            if (strArrB == null) {
                return null;
            }
            return strArrB[i];
        }
    }

    public pbm(int i2, String str, Class cls) {
        this.f30213a = i2;
        this.f30214b = str;
        this.d = cls;
    }

    public abstract String b(glo gloVar);

    public int c(int i2) {
        return Integer.parseInt(d(i2), 16);
    }

    public String d(int i2) {
        int iIndexOf = this.f.indexOf(45);
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            i3 = iIndexOf + 1;
            iIndexOf = this.f.indexOf(45, i3);
            i2 = i4;
        }
        if (iIndexOf == -1) {
            iIndexOf = this.f.length();
        }
        return this.f.substring(i3, iIndexOf);
    }

    public Class e(int i2) {
        return s69.a(d(i2), i());
    }

    public Class[] f(int i2) {
        StringTokenizer stringTokenizer = new StringTokenizer(d(i2), ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i3 = 0; i3 < iCountTokens; i3++) {
            clsArr[i3] = s69.a(stringTokenizer.nextToken(), i());
        }
        return clsArr;
    }

    public Class g() {
        if (this.d == null) {
            this.d = e(2);
        }
        return this.d;
    }

    public String h() {
        if (this.c == null) {
            this.c = g().getName();
        }
        return this.c;
    }

    public final ClassLoader i() {
        if (this.g == null) {
            this.g = getClass().getClassLoader();
        }
        return this.g;
    }

    public int j() {
        if (this.f30213a == -1) {
            this.f30213a = c(0);
        }
        return this.f30213a;
    }

    public String k() {
        if (this.f30214b == null) {
            this.f30214b = d(1);
        }
        return this.f30214b;
    }

    public String l(glo gloVar) {
        String strB;
        if (h) {
            a aVar = this.e;
            if (aVar == null) {
                try {
                    this.e = new b();
                } catch (Throwable unused) {
                    h = false;
                }
                strB = null;
            } else {
                strB = aVar.get(gloVar.i);
            }
        } else {
            strB = null;
        }
        if (strB == null) {
            strB = b(gloVar);
        }
        if (h) {
            this.e.a(gloVar.i, strB);
        }
        return strB;
    }

    public final String toString() {
        return l(glo.f19117k);
    }
}
