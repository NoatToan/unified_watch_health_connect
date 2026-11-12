package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class g12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f18449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18450b = 0;

    public g12(int i) {
        this.f18449a = new byte[i];
    }

    public void a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f18450b;
            this.f18450b = i3 + 1;
            c(i3, z);
        }
    }

    public byte[] b(int i) {
        int length = this.f18449a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f18449a[i2 / i];
        }
        return bArr;
    }

    public final void c(int i, boolean z) {
        this.f18449a[i] = z ? (byte) 1 : (byte) 0;
    }
}
