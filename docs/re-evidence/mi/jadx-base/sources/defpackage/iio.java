package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iio {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iio f21181a = new a(',');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final iio f21182b = new a('\t');
    public static final iio c = new a(' ');
    public static final iio d = new b(" \t\n\r\f".toCharArray());
    public static final iio e = new d();
    public static final iio f = new a('\'');
    public static final iio g = new a('\"');
    public static final iio h = new b("'\"".toCharArray());
    public static final iio i = new c();

    public static final class a extends iio {
        public final char j;

        public a(char c) {
            this.j = c;
        }

        @Override // defpackage.iio
        public int d(char[] cArr, int i, int i2, int i3) {
            return this.j == cArr[i] ? 1 : 0;
        }
    }

    public static final class b extends iio {
        public final char[] j;

        public b(char[] cArr) {
            char[] cArr2 = (char[]) cArr.clone();
            this.j = cArr2;
            Arrays.sort(cArr2);
        }

        @Override // defpackage.iio
        public int d(char[] cArr, int i, int i2, int i3) {
            return Arrays.binarySearch(this.j, cArr[i]) >= 0 ? 1 : 0;
        }
    }

    public static final class c extends iio {
        @Override // defpackage.iio
        public int d(char[] cArr, int i, int i2, int i3) {
            return 0;
        }
    }

    public static final class d extends iio {
        @Override // defpackage.iio
        public int d(char[] cArr, int i, int i2, int i3) {
            return cArr[i] <= ' ' ? 1 : 0;
        }
    }

    public static iio a() {
        return f21181a;
    }

    public static iio b() {
        return g;
    }

    public static iio e() {
        return i;
    }

    public static iio f() {
        return d;
    }

    public static iio g() {
        return f21182b;
    }

    public static iio h() {
        return e;
    }

    public int c(char[] cArr, int i2) {
        return d(cArr, i2, 0, cArr.length);
    }

    public abstract int d(char[] cArr, int i2, int i3, int i4);
}
