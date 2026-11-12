package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public final class l3s {
    public static final l3s c = new l3s(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f24617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f24618b = 0;

    public l3s(byte[] bArr) {
        this.f24617a = bArr;
    }

    public static l3s b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public static l3s c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new l3s(bArr2);
    }

    public int a() {
        return this.f24617a.length;
    }

    public byte[] d() {
        byte[] bArr = this.f24617a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l3s)) {
            return false;
        }
        byte[] bArr = this.f24617a;
        int length = bArr.length;
        byte[] bArr2 = ((l3s) obj).f24617a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f24618b;
        if (i == 0) {
            byte[] bArr = this.f24617a;
            int length = bArr.length;
            for (byte b2 : bArr) {
                length = (length * 31) + b2;
            }
            i = length == 0 ? 1 : length;
            this.f24618b = i;
        }
        return i;
    }
}
