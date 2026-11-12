package hc;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f83155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f83156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f83157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83158e;

    public t(int i14, int i15) {
        this.f83154a = i14;
        byte[] bArr = new byte[i15 + 3];
        this.f83157d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i14, int i15) {
        if (this.f83155b) {
            int i16 = i15 - i14;
            byte[] bArr2 = this.f83157d;
            int length = bArr2.length;
            int i17 = this.f83158e + i16;
            if (length < i17) {
                this.f83157d = Arrays.copyOf(bArr2, i17 * 2);
            }
            System.arraycopy(bArr, i14, this.f83157d, this.f83158e, i16);
            this.f83158e += i16;
        }
    }

    public final boolean b(int i14) {
        if (!this.f83155b) {
            return false;
        }
        this.f83158e -= i14;
        this.f83155b = false;
        this.f83156c = true;
        return true;
    }

    public final void c() {
        this.f83155b = false;
        this.f83156c = false;
    }

    public final void d(int i14) {
        fa.a.d(!this.f83155b);
        boolean z14 = i14 == this.f83154a;
        this.f83155b = z14;
        if (z14) {
            this.f83158e = 3;
            this.f83156c = false;
        }
    }
}
