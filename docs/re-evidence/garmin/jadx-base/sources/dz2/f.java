package dz2;

import p005kotlin.Metadata;
import p13.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldz2/f;", "Ldz2/b;", "", "data", "<init>", "([B)V", "util-io_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f61808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f61809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f61810d;

    public f(byte[] bArr) {
        bArr.getClass();
        this.f61808b = bArr;
        this.f61810d = bArr.length;
    }

    @Override // dz2.b
    public final int b(int i14, int i15, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.f61808b;
        int iMin = Math.min(bArr2.length - this.f61809c, i15);
        if (iMin == 0) {
            return 0;
        }
        int i16 = this.f61809c;
        s.e(bArr2, i14, i16, bArr, i16 + iMin);
        this.f61809c += iMin;
        return iMin;
    }

    @Override // dz2.b
    public final void close() {
    }

    @Override // dz2.b
    public final boolean d() {
        return this.f61809c < this.f61808b.length;
    }

    @Override // dz2.b
    public final byte[] e(int i14) {
        int iMin = Math.min(i14, (int) (this.f61810d - ((long) this.f61809c)));
        byte[] bArr = new byte[iMin];
        b(0, iMin, bArr);
        return bArr;
    }

    @Override // dz2.b
    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final long getF61810d() {
        return this.f61810d;
    }

    @Override // dz2.b
    public final void setPosition(long j8) {
        if (j8 < 0) {
            this.f61809c = 0;
            return;
        }
        long j14 = this.f61810d;
        if (j8 > j14) {
            this.f61809c = (int) j14;
        } else {
            this.f61809c = (int) j8;
        }
    }
}
