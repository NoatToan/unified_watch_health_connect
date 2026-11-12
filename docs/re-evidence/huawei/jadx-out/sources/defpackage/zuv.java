package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public final class zuv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54591c;
    private final boolean e;

    public static int d(int i) {
        if (i <= 0) {
            return 16;
        }
        if (i >= 6) {
            return 1024;
        }
        return 1 << (i + 4);
    }

    public zuv(int i, boolean z, int i2) {
        if (i < 0 || 7 < i) {
            throw new IllegalArgumentException("Block option's szx " + i + " must be between 0 and 7 inclusive");
        }
        if (i2 < 0 || 1048575 < i2) {
            throw new IllegalArgumentException("Block option's num " + i2 + " must be between 0 and 524288 inclusive");
        }
        this.f54590b = i;
        this.e = z;
        this.f54591c = i2;
    }

    public zuv(byte[] bArr) {
        bArr.getClass();
        if (bArr.length > 3) {
            throw new IllegalArgumentException("Block option's length " + bArr.length + " must be at most 3 bytes inclusive");
        }
        if (bArr.length == 0) {
            this.f54590b = 0;
            this.e = false;
            this.f54591c = 0;
            return;
        }
        byte b2 = bArr[bArr.length - 1];
        this.f54590b = b2 & 7;
        this.e = ((b2 >> 3) & 1) == 1;
        int i = (b2 & 255) >> 4;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            i += (bArr[(bArr.length - i2) - 1] & 255) << ((i2 * 8) - 4);
        }
        this.f54591c = i;
    }

    public boolean f() {
        return this.f54590b == 7;
    }

    public void c(int i) {
        int iA;
        if (this.f54590b >= 7 || i <= 0 || i <= (iA = a())) {
            return;
        }
        throw new IllegalStateException("Message with " + i + " bytes payload exceeds the blocksize of " + iA + " bytes!");
    }

    public int c() {
        return this.f54590b;
    }

    public int a() {
        return d(this.f54590b);
    }

    public boolean j() {
        return this.e;
    }

    public int b() {
        return this.f54591c;
    }

    public byte[] e() {
        int i = this.f54590b;
        boolean z = this.e;
        int i2 = (z ? 8 : 0) | i;
        int i3 = this.f54591c;
        if (i3 == 0 && !z && i == 0) {
            return zzg.f54809a;
        }
        if (i3 < 16) {
            return new byte[]{(byte) ((i3 << 4) | i2)};
        }
        if (i3 < 4096) {
            return new byte[]{(byte) (i3 >> 4), (byte) (i2 | (i3 << 4))};
        }
        return new byte[]{(byte) (i3 >> 12), (byte) (i3 >> 4), (byte) (i2 | (i3 << 4))};
    }

    public int d() {
        return this.f54591c * d(this.f54590b);
    }

    public String toString() {
        int i = this.f54590b;
        return String.format("(szx=%d/%d, m=%b, num=%d)", Integer.valueOf(i), Integer.valueOf(d(i)), Boolean.valueOf(this.e), Integer.valueOf(this.f54591c));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zuv)) {
            return false;
        }
        zuv zuvVar = (zuv) obj;
        return this.f54590b == zuvVar.f54590b && this.f54591c == zuvVar.f54591c && this.e == zuvVar.e;
    }

    public int hashCode() {
        return (((this.f54590b * 31) + (this.e ? 1 : 0)) * 31) + this.f54591c;
    }

    public static int a(int i) {
        if (i >= 1024) {
            return 6;
        }
        if (i <= 16) {
            return 0;
        }
        return Integer.numberOfTrailingZeros(Integer.highestOneBit(i)) - 4;
    }
}
