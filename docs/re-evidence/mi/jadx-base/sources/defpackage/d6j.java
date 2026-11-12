package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class d6j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15142b;
    public final byte[] c = new byte[256];

    public d6j(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < 256; i++) {
            this.c[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = i2 + bArr[i3 % length];
            byte[] bArr2 = this.c;
            byte b2 = bArr2[i3];
            i2 = (i4 + b2) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b2;
        }
        this.f15141a = 0;
        this.f15142b = 0;
    }

    public void a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ b());
        }
    }

    public byte b() {
        int i = (this.f15141a + 1) & 255;
        this.f15141a = i;
        int i2 = this.f15142b;
        byte[] bArr = this.c;
        byte b2 = bArr[i];
        int i3 = (i2 + b2) & 255;
        this.f15142b = i3;
        bArr[i] = bArr[i3];
        bArr[i3] = b2;
        return bArr[(bArr[i] + b2) & 255];
    }
}
