package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class jgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22772b;
    public boolean c;
    public byte[] d;
    public int e;

    public jgg(int i, int i2) {
        this.f22771a = i;
        byte[] bArr = new byte[i2 + 3];
        this.d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.f22772b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.e;
            if (length < i4 + i3) {
                this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.d, this.e, i3);
            this.e += i3;
        }
    }

    public boolean b(int i) {
        if (!this.f22772b) {
            return false;
        }
        this.e -= i;
        this.f22772b = false;
        this.c = true;
        return true;
    }

    public boolean c() {
        return this.c;
    }

    public void d() {
        this.f22772b = false;
        this.c = false;
    }

    public void e(int i) {
        rk1.g(!this.f22772b);
        boolean z = i == this.f22771a;
        this.f22772b = z;
        if (z) {
            this.e = 3;
            this.c = false;
        }
    }
}
