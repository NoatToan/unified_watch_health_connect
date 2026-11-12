package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hio {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hio f20110a = new a(',');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hio f20111b = new a('\t');
    public static final hio c = new a(' ');
    public static final hio d = new b(" \t\n\r\f".toCharArray());
    public static final hio e = new d();
    public static final hio f = new a('\'');
    public static final hio g = new a('\"');
    public static final hio h = new b("'\"".toCharArray());
    public static final hio i = new c();

    public static final class a extends hio {
        public final char j;

        public a(char c) {
            this.j = c;
        }

        @Override // defpackage.hio
        public int b(char[] cArr, int i, int i2, int i3) {
            return this.j == cArr[i] ? 1 : 0;
        }
    }

    public static final class b extends hio {
        public final char[] j;

        public b(char[] cArr) {
            char[] cArr2 = (char[]) cArr.clone();
            this.j = cArr2;
            Arrays.sort(cArr2);
        }

        @Override // defpackage.hio
        public int b(char[] cArr, int i, int i2, int i3) {
            return Arrays.binarySearch(this.j, cArr[i]) >= 0 ? 1 : 0;
        }
    }

    public static final class c extends hio {
        @Override // defpackage.hio
        public int b(char[] cArr, int i, int i2, int i3) {
            return 0;
        }
    }

    public static final class d extends hio {
        @Override // defpackage.hio
        public int b(char[] cArr, int i, int i2, int i3) {
            return cArr[i] <= ' ' ? 1 : 0;
        }
    }

    public static hio c() {
        return d;
    }

    public int a(char[] cArr, int i2) {
        return b(cArr, i2, 0, cArr.length);
    }

    public abstract int b(char[] cArr, int i2, int i3, int i4);
}
