package bb;

import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.material.internal.ViewUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f17219a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f17220b = {-1, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f17221c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, GDIRealtimeSettingsProto.AppWellKnownCompositionId.INVALID_VALUE};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f17222d = {8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, OpusUtil.SAMPLE_RATE, 96000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 384000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f17223e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f17224f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f17225g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f17226h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f17227i = {5, 8, 10, 12};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17231d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f17232e;

        private b(String str, int i14, int i15, int i16, long j8, int i17) {
            this.f17228a = str;
            this.f17230c = i14;
            this.f17229b = i15;
            this.f17231d = i16;
            this.f17232e = j8;
        }
    }

    private m() {
    }

    public static fa.q a(byte[] bArr) {
        byte[] bArr2;
        byte b14 = bArr[0];
        if (b14 == 127 || b14 == 100 || b14 == 64 || b14 == 113) {
            return new fa.q(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b15 = bArrCopyOf[0];
        if (b15 == -2 || b15 == -1 || b15 == 37 || b15 == -14 || b15 == -24) {
            for (int i14 = 0; i14 < bArrCopyOf.length - 1; i14 += 2) {
                byte b16 = bArrCopyOf[i14];
                int i15 = i14 + 1;
                bArrCopyOf[i14] = bArrCopyOf[i15];
                bArrCopyOf[i15] = b16;
            }
        }
        fa.q qVar = new fa.q(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            fa.q qVar2 = new fa.q(bArrCopyOf);
            while (qVar2.b() >= 16) {
                qVar2.o(2);
                int iG = qVar2.g(14) & 16383;
                int iMin = Math.min(8 - qVar.f70049c, 14);
                int i16 = qVar.f70049c;
                int i17 = (8 - i16) - iMin;
                byte[] bArr3 = qVar.f70047a;
                int i18 = qVar.f70048b;
                byte b17 = (byte) (((65280 >> i16) | ((1 << i17) - 1)) & bArr3[i18]);
                bArr3[i18] = b17;
                int i19 = 14 - iMin;
                bArr3[i18] = (byte) (b17 | ((iG >>> i19) << i17));
                int i24 = i18 + 1;
                while (true) {
                    bArr2 = qVar.f70047a;
                    if (i19 > 8) {
                        bArr2[i24] = (byte) (iG >>> (i19 - 8));
                        i19 -= 8;
                        i24++;
                    }
                }
                int i25 = 8 - i19;
                byte b18 = (byte) (bArr2[i24] & ((1 << i25) - 1));
                bArr2[i24] = b18;
                bArr2[i24] = (byte) (((iG & ((1 << i19) - 1)) << i25) | b18);
                qVar.o(14);
                qVar.a();
            }
        }
        qVar.l(bArrCopyOf, bArrCopyOf.length);
        return qVar;
    }

    public static int b(fa.q qVar, int[] iArr) {
        int i14 = 0;
        for (int i15 = 0; i15 < 3 && qVar.f(); i15++) {
            i14++;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            i16 += 1 << iArr[i17];
        }
        return qVar.g(iArr[i14]) + i16;
    }
}
