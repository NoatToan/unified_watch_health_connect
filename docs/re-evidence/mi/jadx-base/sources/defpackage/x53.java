package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class x53 {
    public static final int[] c = {8000, 8000, 2000, 2000};
    public static final int[] d = {4000, 4000, 200, 200};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f38709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[][] f38710b;

    public x53() {
        this(4, 4);
    }

    public final byte[] a(int i) {
        return b(i, 0);
    }

    public byte[] b(int i, int i2) {
        int iF = f(i);
        if (i2 < iF) {
            i2 = iF;
        }
        byte[][] bArr = this.f38709a;
        byte[] bArr2 = bArr[i];
        if (bArr2 == null || bArr2.length < i2) {
            return e(i2);
        }
        bArr[i] = null;
        return bArr2;
    }

    public final char[] c(int i) {
        return d(i, 0);
    }

    public char[] d(int i, int i2) {
        int iH = h(i);
        if (i2 < iH) {
            i2 = iH;
        }
        char[][] cArr = this.f38710b;
        char[] cArr2 = cArr[i];
        if (cArr2 == null || cArr2.length < i2) {
            return g(i2);
        }
        cArr[i] = null;
        return cArr2;
    }

    public byte[] e(int i) {
        return new byte[i];
    }

    public int f(int i) {
        return c[i];
    }

    public char[] g(int i) {
        return new char[i];
    }

    public int h(int i) {
        return d[i];
    }

    public void i(int i, byte[] bArr) {
        this.f38709a[i] = bArr;
    }

    public void j(int i, char[] cArr) {
        this.f38710b[i] = cArr;
    }

    public x53(int i, int i2) {
        this.f38709a = new byte[i][];
        this.f38710b = new char[i2][];
    }
}
