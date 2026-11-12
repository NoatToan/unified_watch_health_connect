package bb;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f17092a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f17093b = {OpusUtil.SAMPLE_RATE, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f17094c = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f17095d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f17096e = {32, 40, 48, 56, 64, 80, 96, 112, 128, SyslogConstants.LOG_LOCAL4, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f17097f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: bb.b$b, reason: collision with other inner class name */
    public static final class C0239b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f17102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f17103f;

        private C0239b(String str, int i14, int i15, int i16, int i17, int i18, int i19) {
            this.f17098a = str;
            this.f17100c = i15;
            this.f17099b = i16;
            this.f17101d = i17;
            this.f17102e = i18;
            this.f17103f = i19;
        }
    }

    private b() {
    }

    public static int a(int i14, int i15) {
        int i16 = i15 / 2;
        if (i14 < 0 || i14 >= 3 || i15 < 0 || i16 >= 19) {
            return -1;
        }
        int i17 = f17093b[i14];
        if (i17 == 44100) {
            return ((i15 % 2) + f17097f[i16]) * 2;
        }
        int i18 = f17096e[i16];
        return i17 == 32000 ? i18 * 6 : i18 * 4;
    }
}
