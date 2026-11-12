package bb;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f17118a = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f17119b = {44100, OpusUtil.SAMPLE_RATE, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f17120c = {32000, 64000, 96000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f17121d = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f17122e = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f17123f = {32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f17124g = {8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000};

    private c0() {
    }

    public static int a(int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if ((i14 & (-2097152)) != -2097152 || (i15 = (i14 >>> 19) & 3) == 1 || (i16 = (i14 >>> 17) & 3) == 0 || (i17 = (i14 >>> 12) & 15) == 0 || i17 == 15 || (i18 = (i14 >>> 10) & 3) == 3) {
            return -1;
        }
        int i24 = f17119b[i18];
        if (i15 == 2) {
            i24 /= 2;
        } else if (i15 == 0) {
            i24 /= 4;
        }
        int i25 = (i14 >>> 9) & 1;
        if (i16 == 3) {
            return ((((i15 == 3 ? f17120c[i17 - 1] : f17121d[i17 - 1]) * 12) / i24) + i25) * 4;
        }
        if (i15 == 3) {
            i19 = i16 == 2 ? f17122e[i17 - 1] : f17123f[i17 - 1];
        } else {
            i19 = f17124g[i17 - 1];
        }
        int i26 = SyslogConstants.LOG_LOCAL2;
        if (i15 == 3) {
            return androidx.core.view.j.a(i19, SyslogConstants.LOG_LOCAL2, i24, i25);
        }
        if (i16 == 1) {
            i26 = 72;
        }
        return androidx.core.view.j.a(i26, i19, i24, i25);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f17126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17130f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f17131g;

        public a(a aVar) {
            this.f17125a = aVar.f17125a;
            this.f17126b = aVar.f17126b;
            this.f17127c = aVar.f17127c;
            this.f17128d = aVar.f17128d;
            this.f17129e = aVar.f17129e;
            this.f17130f = aVar.f17130f;
            this.f17131g = aVar.f17131g;
        }

        public final boolean a(int i14) {
            int i15;
            int i16;
            int i17;
            int i18;
            if ((i14 & (-2097152)) != -2097152 || (i15 = (i14 >>> 19) & 3) == 1 || (i16 = (i14 >>> 17) & 3) == 0 || (i17 = (i14 >>> 12) & 15) == 0 || i17 == 15 || (i18 = (i14 >>> 10) & 3) == 3) {
                return false;
            }
            this.f17125a = i15;
            this.f17126b = c0.f17118a[3 - i16];
            int i19 = c0.f17119b[i18];
            this.f17128d = i19;
            if (i15 == 2) {
                this.f17128d = i19 / 2;
            } else if (i15 == 0) {
                this.f17128d = i19 / 4;
            }
            int i24 = (i14 >>> 9) & 1;
            int i25 = 1152;
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 3) {
                        vb.h.w();
                        return false;
                    }
                    i25 = 384;
                }
            } else if (i15 != 3) {
                i25 = 576;
            }
            this.f17131g = i25;
            if (i16 == 3) {
                int i26 = i15 == 3 ? c0.f17120c[i17 - 1] : c0.f17121d[i17 - 1];
                this.f17130f = i26;
                this.f17127c = (((i26 * 12) / this.f17128d) + i24) * 4;
            } else {
                int i27 = SyslogConstants.LOG_LOCAL2;
                if (i15 == 3) {
                    int i28 = i16 == 2 ? c0.f17122e[i17 - 1] : c0.f17123f[i17 - 1];
                    this.f17130f = i28;
                    this.f17127c = ((i28 * SyslogConstants.LOG_LOCAL2) / this.f17128d) + i24;
                } else {
                    int i29 = c0.f17124g[i17 - 1];
                    this.f17130f = i29;
                    if (i16 == 1) {
                        i27 = 72;
                    }
                    this.f17127c = ((i27 * i29) / this.f17128d) + i24;
                }
            }
            this.f17129e = ((i14 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public a() {
        }
    }
}
