package bb;

import androidx.media3.common.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f17086a = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f17087b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f17090c;

        private b(int i14, int i15, String str) {
            this.f17088a = i14;
            this.f17089b = i15;
            this.f17090c = str;
        }
    }

    private a() {
    }

    public static int a(fa.q qVar) throws ParserException {
        int iG = qVar.g(4);
        if (iG == 15) {
            if (qVar.b() >= 24) {
                return qVar.g(24);
            }
            throw ParserException.createForMalformedContainer("AAC header insufficient data", null);
        }
        if (iG < 13) {
            return f17086a[iG];
        }
        throw ParserException.createForMalformedContainer("AAC header wrong Sampling Frequency Index", null);
    }

    public static b b(fa.q qVar, boolean z14) throws ParserException {
        int iG = qVar.g(5);
        if (iG == 31) {
            iG = qVar.g(6) + 32;
        }
        int iA = a(qVar);
        int iG2 = qVar.g(4);
        String strH = am.j.h(iG, "mp4a.40.");
        if (iG == 5 || iG == 29) {
            iA = a(qVar);
            int iG3 = qVar.g(5);
            if (iG3 == 31) {
                iG3 = qVar.g(6) + 32;
            }
            iG = iG3;
            if (iG == 22) {
                iG2 = qVar.g(4);
            }
        }
        if (z14) {
            if (iG != 1 && iG != 2 && iG != 3 && iG != 4 && iG != 6 && iG != 7 && iG != 17) {
                switch (iG) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.createForUnsupportedContainerFeature("Unsupported audio object type: " + iG);
                }
            }
            if (qVar.f()) {
                fa.k.g("Unexpected frameLengthFlag = 1");
            }
            if (qVar.f()) {
                qVar.o(14);
            }
            boolean zF = qVar.f();
            if (iG2 == 0) {
                com.google.protobuf.a.m();
                return null;
            }
            if (iG == 6 || iG == 20) {
                qVar.o(3);
            }
            if (zF) {
                if (iG == 22) {
                    qVar.o(16);
                }
                if (iG == 17 || iG == 19 || iG == 20 || iG == 23) {
                    qVar.o(3);
                }
                qVar.o(1);
            }
            switch (iG) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iG4 = qVar.g(2);
                    if (iG4 == 2 || iG4 == 3) {
                        throw ParserException.createForUnsupportedContainerFeature("Unsupported epConfig: " + iG4);
                    }
                    break;
            }
        }
        int i14 = f17087b[iG2];
        if (i14 != -1) {
            return new b(iA, i14, strH);
        }
        throw ParserException.createForMalformedContainer(null, null);
    }
}
