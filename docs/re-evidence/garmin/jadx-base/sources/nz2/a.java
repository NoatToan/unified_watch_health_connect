package nz2;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f128381a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f128382b = 0;

    @Override // nz2.c
    public final long getValue() {
        return (this.f128382b << 16) | this.f128381a;
    }

    @Override // nz2.c
    public final void reset() {
        this.f128381a = 1L;
        this.f128382b = 0L;
    }

    @Override // nz2.c
    public final void update(byte[] bArr, int i14, int i15) {
        long j8;
        if (i15 == 1) {
            long j14 = this.f128381a + ((long) (bArr[i14] & UnsignedBytes.MAX_VALUE));
            long j15 = this.f128382b + j14;
            this.f128381a = j14 % 65521;
            this.f128382b = j15 % 65521;
            return;
        }
        int i16 = i15 / 5552;
        int i17 = i15 % 5552;
        while (true) {
            int i18 = i16 - 1;
            if (i16 <= 0) {
                break;
            }
            int i19 = 5552;
            while (true) {
                int i24 = i19 - 1;
                j8 = this.f128381a;
                if (i19 > 0) {
                    long j16 = j8 + ((long) (bArr[i14] & UnsignedBytes.MAX_VALUE));
                    this.f128381a = j16;
                    this.f128382b += j16;
                    i14++;
                    i19 = i24;
                }
            }
            this.f128381a = j8 % 65521;
            this.f128382b %= 65521;
            i16 = i18;
        }
        while (true) {
            int i25 = i17 - 1;
            long j17 = this.f128381a;
            if (i17 <= 0) {
                this.f128381a = j17 % 65521;
                this.f128382b %= 65521;
                return;
            }
            long j18 = j17 + ((long) (bArr[i14] & UnsignedBytes.MAX_VALUE));
            this.f128381a = j18;
            this.f128382b += j18;
            i14++;
            i17 = i25;
        }
    }
}
