package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f16374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16376c;

    public w(byte[] bArr) {
        this.f16374a = bArr;
    }

    public int b() {
        return this.f16376c;
    }

    public int c() {
        return this.f16375b;
    }

    public int a() {
        return ((this.f16374a.length - this.f16375b) * 8) - this.f16376c;
    }

    public int a(int i) {
        if (i >= 1 && i <= 32 && i <= a()) {
            int i2 = this.f16376c;
            int i3 = 0;
            if (i2 > 0) {
                int i4 = 8 - i2;
                int i5 = i < i4 ? i : i4;
                int i6 = i4 - i5;
                int i7 = w7.a(this.f16374a, this.f16375b) ? (((255 >> (8 - i5)) << i6) & this.f16374a[this.f16375b]) >> i6 : 0;
                i -= i5;
                int i8 = this.f16376c + i5;
                this.f16376c = i8;
                if (i8 == 8) {
                    this.f16376c = 0;
                    this.f16375b++;
                }
                i3 = i7;
            }
            if (i > 0) {
                while (i >= 8) {
                    if (w7.a(this.f16374a, this.f16375b)) {
                        i3 = (i3 << 8) | (this.f16374a[this.f16375b] & 255);
                    }
                    this.f16375b++;
                    i -= 8;
                }
                if (i > 0) {
                    int i9 = 8 - i;
                    if (w7.a(this.f16374a, this.f16375b)) {
                        i3 = ((((255 >> i9) << i9) & this.f16374a[this.f16375b]) >> i9) | (i3 << i);
                    }
                    this.f16376c += i;
                }
            }
            return i3;
        }
        throw new IllegalArgumentException(String.valueOf(i));
    }
}
