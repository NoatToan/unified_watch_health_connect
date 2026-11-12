package bb;

import androidx.media3.common.ParserException;
import com.google.common.primitives.SignedBytes;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f17107a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f17111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17113f;

        private b() {
            this.f17108a = true;
            this.f17109b = -1;
            this.f17110c = -1;
            this.f17111d = true;
            this.f17112e = 2;
            this.f17113f = 0;
        }
    }

    /* JADX INFO: renamed from: bb.c$c, reason: collision with other inner class name */
    public static final class C0240c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17117d;

        private C0240c(int i14, int i15, int i16, int i17, int i18) {
            this.f17115b = i15;
            this.f17114a = i16;
            this.f17116c = i17;
            this.f17117d = i18;
        }
    }

    private c() {
    }

    public static void a(int i14, fa.r rVar) {
        rVar.D(7);
        byte[] bArr = rVar.f70054a;
        bArr[0] = -84;
        bArr[1] = SignedBytes.MAX_POWER_OF_TWO;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i14 >> 16) & 255);
        bArr[5] = (byte) ((i14 >> 8) & 255);
        bArr[6] = (byte) (i14 & 255);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    public static C0240c b(fa.q qVar) {
        int i14;
        int iG;
        int iG2 = qVar.g(16);
        int iG3 = qVar.g(16);
        if (iG3 == 65535) {
            iG3 = qVar.g(24);
            i14 = 7;
        } else {
            i14 = 4;
        }
        int i15 = iG3 + i14;
        if (iG2 == 44097) {
            i15 += 2;
        }
        int i16 = i15;
        int iG4 = qVar.g(2);
        int i17 = 0;
        if (iG4 == 3) {
            int i18 = 0;
            while (true) {
                iG = qVar.g(2) + i18;
                if (!qVar.f()) {
                    break;
                }
                i18 = (iG + 1) << 2;
            }
            iG4 += iG;
        }
        int i19 = iG4;
        int iG5 = qVar.g(10);
        if (qVar.f() && qVar.g(3) > 0) {
            qVar.o(2);
        }
        int i24 = 44100;
        if (qVar.f()) {
            i24 = 48000;
        }
        int iG6 = qVar.g(4);
        int[] iArr = f17107a;
        if (i24 == 44100 && iG6 == 13) {
            i17 = iArr[iG6];
        } else if (i24 == 48000 && iG6 < 14) {
            i17 = iArr[iG6];
            int i25 = iG5 % 5;
            if (i25 == 1) {
                if (iG6 != 3 || iG6 == 8) {
                    i17++;
                }
            } else if (i25 != 2) {
                if (i25 != 3) {
                    if (i25 == 4 && (iG6 == 3 || iG6 == 8 || iG6 == 11)) {
                        i17++;
                    }
                } else if (iG6 != 3) {
                    i17++;
                } else {
                    i17++;
                }
            } else if (iG6 == 8 || iG6 == 11) {
                i17++;
            }
        }
        return new C0240c(i19, 2, i24, i16, i17);
    }

    public static void c(fa.q qVar, b bVar) throws ParserException {
        int iG = qVar.g(5);
        qVar.o(2);
        if (qVar.f()) {
            qVar.o(5);
        }
        if (iG >= 7 && iG <= 10) {
            qVar.n();
        }
        if (qVar.f()) {
            int iG2 = qVar.g(3);
            if (bVar.f17109b == -1 && iG >= 0 && iG <= 15 && (iG2 == 0 || iG2 == 1)) {
                bVar.f17109b = iG;
            }
            if (qVar.f()) {
                e(qVar);
            }
        }
    }

    public static void d(fa.q qVar, b bVar) throws ParserException {
        qVar.o(2);
        boolean zF = qVar.f();
        int iG = qVar.g(8);
        for (int i14 = 0; i14 < iG; i14++) {
            qVar.o(2);
            if (qVar.f()) {
                qVar.o(5);
            }
            if (zF) {
                qVar.o(24);
            } else {
                if (qVar.f()) {
                    if (!qVar.f()) {
                        qVar.o(4);
                    }
                    bVar.f17110c = qVar.g(6) + 1;
                }
                qVar.o(4);
            }
        }
        if (qVar.f()) {
            qVar.o(3);
            if (qVar.f()) {
                e(qVar);
            }
        }
    }

    public static void e(fa.q qVar) throws ParserException {
        int iG = qVar.g(6);
        if (iG < 2 || iG > 42) {
            throw ParserException.createForUnsupportedContainerFeature(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iG)));
        }
        qVar.o(iG * 8);
    }
}
