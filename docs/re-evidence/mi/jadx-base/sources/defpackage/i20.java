package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class i20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f20680a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20682b;
        public final int c;
        public final int d;
        public final int e;

        public b(int i, int i2, int i3, int i4, int i5) {
            this.f20681a = i;
            this.c = i2;
            this.f20682b = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public static void a(int i, okh okhVar) {
        okhVar.L(7);
        byte[] bArrD = okhVar.d();
        bArrD[0] = -84;
        bArrD[1] = 64;
        bArrD[2] = -1;
        bArrD[3] = -1;
        bArrD[4] = (byte) ((i >> 16) & 255);
        bArrD[5] = (byte) ((i >> 8) & 255);
        bArrD[6] = (byte) (i & 255);
    }

    public static Format b(okh okhVar, String str, String str2, DrmInitData drmInitData) {
        okhVar.Q(1);
        return new Format.b().S(str).e0("audio/ac4").H(2).f0(((okhVar.D() & 32) >> 5) == 1 ? MIOTAudioModuleCore.SAMPLING_RATE : 44100).L(drmInitData).V(str2).E();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return d(new nkh(bArr)).e;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static b d(nkh nkhVar) {
        int i;
        int i2;
        int iH = nkhVar.h(16);
        int iH2 = nkhVar.h(16);
        if (iH2 == 65535) {
            iH2 = nkhVar.h(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iH2 + i;
        if (iH == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int iH3 = nkhVar.h(2);
        if (iH3 == 3) {
            iH3 += f(nkhVar, 2);
        }
        int i5 = iH3;
        int iH4 = nkhVar.h(10);
        if (nkhVar.g() && nkhVar.h(3) > 0) {
            nkhVar.r(2);
        }
        int i6 = nkhVar.g() ? 48000 : 44100;
        int iH5 = nkhVar.h(4);
        if (i6 == 44100 && iH5 == 13) {
            i2 = f20680a[iH5];
        } else if (i6 == 48000) {
            int[] iArr = f20680a;
            if (iH5 < iArr.length) {
                int i7 = iArr[iH5];
                int i8 = iH4 % 5;
                if (i8 == 1) {
                    if (iH5 != 3 || iH5 == 8) {
                        i7++;
                    }
                } else if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4 && (iH5 == 3 || iH5 == 8 || iH5 == 11)) {
                            i7++;
                        }
                    } else if (iH5 != 3) {
                        i7++;
                    } else {
                        i7++;
                    }
                } else if (iH5 == 8 || iH5 == 11) {
                    i7++;
                }
                i2 = i7;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        return new b(i5, 2, i6, i4, i2);
    }

    public static int e(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    public static int f(nkh nkhVar, int i) {
        int i2 = 0;
        while (true) {
            int iH = i2 + nkhVar.h(i);
            if (!nkhVar.g()) {
                return iH;
            }
            i2 = (iH + 1) << i;
        }
    }
}
