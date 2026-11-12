package hc;

import com.google.android.exoplayer2.C;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f83178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f83179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f83180e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.w f83176a = new fa.w(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f83181f = C.TIME_UNSET;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f83182g = C.TIME_UNSET;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f83183h = C.TIME_UNSET;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fa.r f83177b = new fa.r();

    public static int b(byte[] bArr, int i14) {
        return (bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) | ((bArr[i14] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 8);
    }

    public static long c(fa.r rVar) {
        int i14 = rVar.f70055b;
        if (rVar.a() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        rVar.e(bArr, 0, 9);
        rVar.G(i14);
        byte b14 = bArr[0];
        if ((b14 & 196) == 68) {
            byte b15 = bArr[2];
            if ((b15 & 4) == 4) {
                byte b16 = bArr[4];
                if ((b16 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j8 = b14;
                    long j14 = b15;
                    return ((j14 & 3) << 13) | ((j8 & 3) << 28) | (((56 & j8) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j14 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b16) & 248) >> 3);
                }
            }
        }
        return C.TIME_UNSET;
    }

    public final void a(bb.o oVar) {
        byte[] bArr = fa.z.f70076f;
        fa.r rVar = this.f83177b;
        rVar.getClass();
        rVar.E(bArr, bArr.length);
        this.f83178c = true;
        oVar.resetPeekPosition();
    }
}
