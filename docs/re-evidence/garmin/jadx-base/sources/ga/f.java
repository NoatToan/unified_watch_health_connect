package ga;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f76579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f76580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f76582d = 0;

    public f(byte[] bArr, int i14, int i15) {
        this.f76579a = bArr;
        this.f76581c = i14;
        this.f76580b = i15;
        a();
    }

    public final void a() {
        int i14;
        int i15 = this.f76581c;
        fa.a.d(i15 >= 0 && (i15 < (i14 = this.f76580b) || (i15 == i14 && this.f76582d == 0)));
    }

    public final boolean b(int i14) {
        int i15 = this.f76581c;
        int i16 = i14 / 8;
        int i17 = i15 + i16;
        int i18 = (this.f76582d + i14) - (i16 * 8);
        if (i18 > 7) {
            i17++;
            i18 -= 8;
        }
        while (true) {
            i15++;
            if (i15 > i17 || i17 >= this.f76580b) {
                break;
            }
            if (h(i15)) {
                i17++;
                i15 += 2;
            }
        }
        int i19 = this.f76580b;
        if (i17 >= i19) {
            return i17 == i19 && i18 == 0;
        }
        return true;
    }

    public final boolean c() {
        int i14 = this.f76581c;
        int i15 = this.f76582d;
        int i16 = 0;
        while (this.f76581c < this.f76580b && !d()) {
            i16++;
        }
        boolean z14 = this.f76581c == this.f76580b;
        this.f76581c = i14;
        this.f76582d = i15;
        return !z14 && b((i16 * 2) + 1);
    }

    public final boolean d() {
        boolean z14 = (this.f76579a[this.f76581c] & (128 >> this.f76582d)) != 0;
        i();
        return z14;
    }

    public final int e(int i14) {
        int i15;
        this.f76582d += i14;
        int i16 = 0;
        while (true) {
            i15 = this.f76582d;
            int i17 = 2;
            if (i15 <= 8) {
                break;
            }
            int i18 = i15 - 8;
            this.f76582d = i18;
            byte[] bArr = this.f76579a;
            int i19 = this.f76581c;
            i16 |= (bArr[i19] & UnsignedBytes.MAX_VALUE) << i18;
            if (!h(i19 + 1)) {
                i17 = 1;
            }
            this.f76581c = i19 + i17;
        }
        byte[] bArr2 = this.f76579a;
        int i24 = this.f76581c;
        int i25 = ((-1) >>> (32 - i14)) & (i16 | ((bArr2[i24] & UnsignedBytes.MAX_VALUE) >> (8 - i15)));
        if (i15 == 8) {
            this.f76582d = 0;
            this.f76581c = i24 + (h(i24 + 1) ? 2 : 1);
        }
        a();
        return i25;
    }

    public final int f() {
        int i14 = 0;
        while (!d()) {
            i14++;
        }
        return ((1 << i14) - 1) + (i14 > 0 ? e(i14) : 0);
    }

    public final int g() {
        int iF = f();
        return ((iF + 1) / 2) * (iF % 2 == 0 ? -1 : 1);
    }

    public final boolean h(int i14) {
        if (2 > i14 || i14 >= this.f76580b) {
            return false;
        }
        byte[] bArr = this.f76579a;
        return bArr[i14] == 3 && bArr[i14 + (-2)] == 0 && bArr[i14 - 1] == 0;
    }

    public final void i() {
        int i14 = this.f76582d + 1;
        this.f76582d = i14;
        if (i14 == 8) {
            this.f76582d = 0;
            int i15 = this.f76581c;
            this.f76581c = i15 + (h(i15 + 1) ? 2 : 1);
        }
        a();
    }

    public final void j(int i14) {
        int i15 = this.f76581c;
        int i16 = i14 / 8;
        int i17 = i15 + i16;
        this.f76581c = i17;
        int i18 = (i14 - (i16 * 8)) + this.f76582d;
        this.f76582d = i18;
        if (i18 > 7) {
            this.f76581c = i17 + 1;
            this.f76582d = i18 - 8;
        }
        while (true) {
            i15++;
            if (i15 > this.f76581c) {
                a();
                return;
            } else if (h(i15)) {
                this.f76581c++;
                i15 += 2;
            }
        }
    }
}
