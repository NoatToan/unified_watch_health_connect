package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class p6q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f30071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30072b;
    public int c;
    public int d;
    public int e;
    public int f;

    public byte[] a() {
        return this.f30071a;
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public void e(int i, int i2, boolean z) {
        this.f30071a = new byte[]{0, 0, 0, 0, 5, !z ? 1 : 0, (byte) ((i >> 8) & 255), (byte) (i & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)};
    }

    public final int f(byte[] bArr) {
        if (bArr == null || bArr.length < 5) {
            return -1;
        }
        this.d = bArr[5] & 255;
        this.e = ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        this.f = (bArr[9] & 255) | ((bArr[8] & 255) << 8);
        StringBuilder sb = new StringBuilder();
        sb.append("SrcAppID: ");
        sb.append(this.e);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DstAppID: ");
        sb2.append(this.f);
        return 0;
    }

    public int g(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        int i = bArr[0] & 255;
        this.f30072b = i;
        int i2 = ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[4] & 255);
        this.c = i2;
        return (i2 + 5 <= bArr.length && i == 0 && f(bArr) >= 0) ? 0 : -1;
    }
}
