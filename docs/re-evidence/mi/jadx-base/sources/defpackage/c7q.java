package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class c7q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f5026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f5027b;
    public final int e;
    public byte f;
    public byte g;
    public byte h;
    public byte i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5028k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5029r;
    public final int d = 16;
    public final int c = 31;

    public c7q(boolean z) {
        this.e = z ? 102400 : 1440;
    }

    public byte[] a() {
        return this.f5027b;
    }

    public int b() {
        return this.l;
    }

    public byte[] c() {
        return this.f5026a;
    }

    public int d() {
        return this.n;
    }

    public int e() {
        return this.o;
    }

    public int f() {
        return this.h;
    }

    public int g() {
        int i = this.f5029r;
        int i2 = this.e;
        return i - i2 > 0 ? i2 : i;
    }

    public int h() {
        return this.f5028k;
    }

    public int i() {
        return this.q;
    }

    public boolean j(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        int length = this.f5029r - bArr.length;
        this.f5029r = length;
        if (length < 0) {
            return false;
        }
        this.f5027b = bArr;
        return true;
    }

    public boolean k(byte[] bArr) {
        if (this.d > bArr.length || bArr.length > this.c) {
            return false;
        }
        byte b2 = bArr[0];
        this.f = b2;
        byte b3 = bArr[1];
        this.g = (byte) ((b3 >> 4) & 15);
        this.i = (byte) (bArr[7] & 31);
        int i = ((bArr[8] & 255) << 24) | ((bArr[9] & 255) << 16) | ((bArr[10] & 255) << 8) | (bArr[11] & 255);
        this.j = i;
        byte b4 = (b3 & 8) == 0 ? (byte) 0 : (byte) 1;
        this.h = b4;
        this.f5028k = ((bArr[12] & 255) << 8) | (bArr[13] & 255);
        this.l = (bArr[15] & 255) | ((bArr[14] & 255) << 8);
        if (b4 == 0) {
            this.q = i;
            this.f5029r = i;
        }
        return 85 == b2;
    }

    public boolean l(int i, int i2, byte[] bArr) {
        if (bArr == null) {
            this.f5027b = null;
            this.f5026a = null;
            this.q = 0;
            this.f5029r = 0;
            return false;
        }
        int i3 = this.d;
        this.m = i3;
        byte[] bArr2 = new byte[i3];
        this.f5026a = bArr2;
        bArr2[0] = 85;
        byte b2 = (byte) (bArr2[1] & 15);
        bArr2[1] = b2;
        bArr2[1] = (byte) (b2 | 16);
        byte b3 = (byte) (bArr2[7] & 224);
        bArr2[7] = b3;
        bArr2[7] = (byte) (((byte) (i3 & 31)) | b3);
        bArr2[12] = (byte) ((i >> 8) & 255);
        bArr2[13] = (byte) (i & 255);
        bArr2[14] = (byte) ((i2 >> 8) & 255);
        bArr2[15] = (byte) (i2 & 255);
        this.f5027b = bArr;
        this.q = bArr.length;
        this.f5029r = bArr.length;
        return true;
    }

    public boolean m() {
        int i;
        if (this.f5027b == null || (i = this.f5029r) == 0) {
            return false;
        }
        int i2 = this.q;
        this.o = i2 - i;
        int i3 = this.e;
        if (i <= i3) {
            i3 = i;
        }
        this.n = i3;
        int i4 = i2 == i ? i2 : i3;
        this.p = i4;
        byte[] bArr = this.f5026a;
        byte b2 = (byte) (bArr[1] & 247);
        bArr[1] = b2;
        bArr[1] = (byte) ((i2 != i ? (byte) 8 : (byte) 0) | b2);
        bArr[8] = (byte) (i4 >> 24);
        bArr[9] = (byte) (i4 >> 16);
        bArr[10] = (byte) (i4 >> 8);
        bArr[11] = (byte) i4;
        this.f5029r = i - i3;
        return true;
    }
}
