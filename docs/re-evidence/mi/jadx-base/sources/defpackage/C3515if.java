package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.xiaomi.digitalkey.wearable.DigitalKeyService;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;

/* JADX INFO: renamed from: if, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3515if {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f21070a = {96000, 88200, MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_BIT_RATE, MIOTAudioModuleCore.SAMPLING_RATE, 44100, 32000, 24000, DigitalKeyService.DIGITAL_KEY_INSUFFICIENT_SE_SPACE, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f21071b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: if$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21073b;
        public final String c;

        public b(int i, int i2, String str) {
            this.f21072a = i;
            this.f21073b = i2;
            this.c = str;
        }
    }

    public static byte[] a(int i, int i2) {
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int[] iArr = f21070a;
            if (i5 >= iArr.length) {
                break;
            }
            if (i == iArr[i5]) {
                i4 = i5;
            }
            i5++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = f21071b;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return b(2, i4, i6);
        }
        StringBuilder sb = new StringBuilder(67);
        sb.append("Invalid sample rate or number of channels: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static byte[] b(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static int c(nkh nkhVar) {
        int iH = nkhVar.h(5);
        return iH == 31 ? nkhVar.h(6) + 32 : iH;
    }

    public static int d(int i) {
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public static int e(nkh nkhVar) throws ParserException {
        int iH = nkhVar.h(4);
        if (iH == 15) {
            return nkhVar.h(24);
        }
        if (iH < 13) {
            return f21070a[iH];
        }
        throw new ParserException();
    }

    public static b f(nkh nkhVar, boolean z) throws ParserException {
        int iC = c(nkhVar);
        int iE = e(nkhVar);
        int iH = nkhVar.h(4);
        StringBuilder sb = new StringBuilder(19);
        sb.append("mp4a.40.");
        sb.append(iC);
        String string = sb.toString();
        if (iC == 5 || iC == 29) {
            iE = e(nkhVar);
            iC = c(nkhVar);
            if (iC == 22) {
                iH = nkhVar.h(4);
            }
        }
        if (z) {
            if (iC != 1 && iC != 2 && iC != 3 && iC != 4 && iC != 6 && iC != 7 && iC != 17) {
                switch (iC) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder(42);
                        sb2.append("Unsupported audio object type: ");
                        sb2.append(iC);
                        throw new ParserException(sb2.toString());
                }
            }
            h(nkhVar, iC, iH);
            switch (iC) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = nkhVar.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        StringBuilder sb3 = new StringBuilder(33);
                        sb3.append("Unsupported epConfig: ");
                        sb3.append(iH2);
                        throw new ParserException(sb3.toString());
                    }
                    break;
            }
        }
        int i = f21071b[iH];
        if (i != -1) {
            return new b(iE, i, string);
        }
        throw new ParserException();
    }

    public static b g(byte[] bArr) throws ParserException {
        return f(new nkh(bArr), false);
    }

    public static void h(nkh nkhVar, int i, int i2) {
        if (nkhVar.g()) {
            toe.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (nkhVar.g()) {
            nkhVar.r(14);
        }
        boolean zG = nkhVar.g();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            nkhVar.r(3);
        }
        if (zG) {
            if (i == 22) {
                nkhVar.r(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                nkhVar.r(3);
            }
            nkhVar.r(1);
        }
    }
}
