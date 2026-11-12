package javazoom.jl.decoder;

import com.airoha.android.lib.fota.fotaState.StageEnum;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.moving.ui.utils.SportDeviceUtils;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes23.dex */
final class d implements FrameDecoder {
    private static final int P = 18;
    private static final int Q = 32;
    private static int[][] X;
    private int A;
    private b[] N;
    public c O;
    public int[] b;
    private int[] d;
    private float[][][] e;
    private float[][][] f;
    private float[] g;
    private float[][] h;
    private float[][] i;
    private int[] j;
    private Bitstream k;
    private Header l;
    private javazoom.jl.decoder.e m;
    private javazoom.jl.decoder.e n;
    private Obuffer o;
    private int p;
    private javazoom.jl.decoder.a q;
    private a r;
    private e[] s;
    private e[] t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    private static final int[][] R = {new int[]{0, 0, 0, 0, 3, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4}, new int[]{0, 1, 2, 3, 0, 1, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3}};
    public static final int[] S = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 3, 2, 0};
    public static final float[] T = {1.0f, 0.70710677f, 0.5f, 0.35355338f, 0.25f, 0.17677669f, 0.125f, 0.088388346f, 0.0625f, 0.044194173f, 0.03125f, 0.022097087f, 0.015625f, 0.011048543f, 0.0078125f, 0.0055242716f, 0.00390625f, 0.0027621358f, 0.001953125f, 0.0013810679f, 9.765625E-4f, 6.9053395E-4f, 4.8828125E-4f, 3.4526698E-4f, 2.4414062E-4f, 1.7263349E-4f, 1.2207031E-4f, 8.6316744E-5f, 6.1035156E-5f, 4.3158372E-5f, 3.0517578E-5f, 2.1579186E-5f, 1.5258789E-5f, 1.0789593E-5f, 7.6293945E-6f, 5.3947965E-6f, 3.8146973E-6f, 2.6973983E-6f, 1.9073486E-6f, 1.3486991E-6f, 9.536743E-7f, 6.7434956E-7f, 4.7683716E-7f, 3.3717478E-7f, 2.3841858E-7f, 1.6858739E-7f, 1.1920929E-7f, 8.4293696E-8f, 5.9604645E-8f, 4.2146848E-8f, 2.9802322E-8f, 2.1073424E-8f, 1.4901161E-8f, 1.0536712E-8f, 7.450581E-9f, 5.268356E-9f, 3.7252903E-9f, 2.634178E-9f, 1.8626451E-9f, 1.317089E-9f, 9.313226E-10f, 6.585445E-10f, 4.656613E-10f, 3.2927225E-10f};
    public static final float[] U = b();
    public static final float[][] V = {new float[]{1.0f, 0.8408964f, 0.70710677f, 0.59460354f, 0.5f, 0.4204482f, 0.35355338f, 0.29730177f, 0.25f, 0.2102241f, 0.17677669f, 0.14865088f, 0.125f, 0.10511205f, 0.088388346f, 0.07432544f, 0.0625f, 0.052556027f, 0.044194173f, 0.03716272f, 0.03125f, 0.026278013f, 0.022097087f, 0.01858136f, 0.015625f, 0.013139007f, 0.011048543f, 0.00929068f, 0.0078125f, 0.0065695033f, 0.0055242716f, 0.00464534f}, new float[]{1.0f, 0.70710677f, 0.5f, 0.35355338f, 0.25f, 0.17677669f, 0.125f, 0.088388346f, 0.0625f, 0.044194173f, 0.03125f, 0.022097087f, 0.015625f, 0.011048543f, 0.0078125f, 0.0055242716f, 0.00390625f, 0.0027621358f, 0.001953125f, 0.0013810679f, 9.765625E-4f, 6.9053395E-4f, 4.8828125E-4f, 3.4526698E-4f, 2.4414062E-4f, 1.7263349E-4f, 1.2207031E-4f, 8.6316744E-5f, 6.1035156E-5f, 4.3158372E-5f, 3.0517578E-5f, 2.1579186E-5f}};
    public static final float[] W = {0.0f, 0.2679492f, 0.57735026f, 1.0f, 1.7320508f, 3.732051f, 1.0E11f, -3.732051f, -1.7320508f, -1.0f, -0.57735026f, -0.2679492f, 0.0f, 0.2679492f, 0.57735026f, 1.0f};
    private static final float[] Y = {0.8574929f, 0.881742f, 0.94962865f, 0.9833146f, 0.9955178f, 0.9991606f, 0.9998992f, 0.99999315f};
    private static final float[] Z = {-0.51449573f, -0.47173196f, -0.31337744f, -0.1819132f, -0.09457419f, -0.040965583f, -0.014198569f, -0.0036999746f};
    public static final float[][] a0 = {new float[]{-0.016141215f, -0.05360318f, -0.100707136f, -0.16280818f, -0.5f, -0.38388735f, -0.6206114f, -1.1659756f, -3.8720753f, -4.225629f, -1.519529f, -0.97416484f, -0.73744076f, -1.2071068f, -0.5163616f, -0.45426053f, -0.40715656f, -0.3696946f, -0.3387627f, -0.31242222f, -0.28939587f, -0.26880082f, -0.5f, -0.23251417f, -0.21596715f, -0.20004979f, -0.18449493f, -0.16905846f, -0.15350361f, -0.13758625f, -0.12103922f, -0.20710678f, -0.084752575f, -0.06415752f, -0.041131172f, -0.014790705f}, new float[]{-0.016141215f, -0.05360318f, -0.100707136f, -0.16280818f, -0.5f, -0.38388735f, -0.6206114f, -1.1659756f, -3.8720753f, -4.225629f, -1.519529f, -0.97416484f, -0.73744076f, -1.2071068f, -0.5163616f, -0.45426053f, -0.40715656f, -0.3696946f, -0.33908543f, -0.3151181f, -0.29642227f, -0.28184548f, -0.5411961f, -0.2621323f, -0.25387916f, -0.2329629f, -0.19852729f, -0.15233535f, -0.0964964f, -0.03342383f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, new float[]{-0.0483008f, -0.15715657f, -0.28325045f, -0.42953748f, -1.2071068f, -0.8242648f, -1.1451749f, -1.769529f, -4.5470223f, -3.489053f, -0.7329629f, -0.15076515f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.15076514f, -0.7329629f, -3.489053f, -4.5470223f, -1.769529f, -1.1451749f, -0.8313774f, -1.306563f, -0.54142016f, -0.46528974f, -0.4106699f, -0.3700468f, -0.3387627f, -0.31242222f, -0.28939587f, -0.26880082f, -0.5f, -0.23251417f, -0.21596715f, -0.20004979f, -0.18449493f, -0.16905846f, -0.15350361f, -0.13758625f, -0.12103922f, -0.20710678f, -0.084752575f, -0.06415752f, -0.041131172f, -0.014790705f}};
    public static final int[][][] b0 = {new int[][]{new int[]{6, 5, 5, 5}, new int[]{9, 9, 9, 9}, new int[]{6, 9, 9, 9}}, new int[][]{new int[]{6, 5, 7, 3}, new int[]{9, 9, 12, 6}, new int[]{6, 9, 12, 6}}, new int[][]{new int[]{11, 10, 0, 0}, new int[]{18, 18, 0, 0}, new int[]{15, 18, 0, 0}}, new int[][]{new int[]{7, 7, 7, 0}, new int[]{12, 12, 12, 0}, new int[]{6, 15, 12, 0}}, new int[][]{new int[]{6, 6, 6, 3}, new int[]{12, 9, 9, 6}, new int[]{6, 12, 9, 6}}, new int[][]{new int[]{8, 8, 5, 0}, new int[]{15, 12, 9, 0}, new int[]{6, 18, 9, 0}}};
    public final double a = 1.3333333333333333d;
    private int c = 0;
    private float[] B = new float[32];
    private float[] C = new float[32];
    private final int[] D = new int[4];
    public int[] E = {0};
    public int[] F = {0};
    public int[] G = {0};
    public int[] H = {0};
    public int[] I = new int[StageEnum.APP_RESULT_FOTA_NV_SUCCESS];
    public float[] J = new float[StageEnum.APP_RESULT_FOTA_NV_SUCCESS];
    public float[] K = new float[18];
    public float[] L = new float[36];
    private int M = 0;

    public static class a {
        public int a = 0;
        public int b = 0;
        public f[] c;

        public a() {
            f[] fVarArr = new f[2];
            this.c = fVarArr;
            fVarArr[0] = new f();
            this.c[1] = new f();
        }
    }

    /* JADX INFO: renamed from: javazoom.jl.decoder.d$d, reason: collision with other inner class name */
    public static class C1157d {
        public int a = 0;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public int f = 0;
        public int g = 0;
        public int j = 0;
        public int k = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int[] h = new int[3];
        public int[] i = new int[3];
    }

    public static class e {
        public int[] a = new int[23];
        public int[][] b = (int[][]) Array.newInstance((Class<?>) int.class, 3, 13);
    }

    public static class f {
        public int[] a = new int[4];
        public C1157d[] b;

        public f() {
            C1157d[] c1157dArr = new C1157d[2];
            this.b = c1157dArr;
            c1157dArr[0] = new C1157d();
            this.b[1] = new C1157d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x021f  */
    public d(Bitstream bitstream, Header header, javazoom.jl.decoder.e eVar, javazoom.jl.decoder.e eVar2, Obuffer obuffer, int i) {
        int i2;
        javazoom.jl.decoder.f.b();
        this.d = new int[580];
        this.e = (float[][][]) Array.newInstance((Class<?>) float.class, 2, 32, 18);
        this.f = (float[][][]) Array.newInstance((Class<?>) float.class, 2, 32, 18);
        this.g = new float[StageEnum.APP_RESULT_FOTA_NV_SUCCESS];
        this.h = (float[][]) Array.newInstance((Class<?>) float.class, 2, StageEnum.APP_RESULT_FOTA_NV_SUCCESS);
        this.i = (float[][]) Array.newInstance((Class<?>) float.class, 2, StageEnum.APP_RESULT_FOTA_NV_SUCCESS);
        this.j = new int[2];
        e[] eVarArr = new e[2];
        this.s = eVarArr;
        eVarArr[0] = new e();
        this.s[1] = new e();
        this.t = this.s;
        b[] bVarArr = new b[9];
        this.N = bVarArr;
        int[] iArr = {0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, StageEnum.APP_RESULT_FOTA_NV_SUCCESS};
        int[] iArr2 = {0, 4, 8, 12, 18, 24, 32, 42, 56, 74, 100, 132, DataTypeSource.SPORT_TYPE_CHECKERS, 192};
        int[] iArr3 = {0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, StageEnum.APP_RESULT_FOTA_NV_SUCCESS};
        int[] iArr4 = {0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 134, DataTypeSource.SPORT_TYPE_CHECKERS, 192};
        int[] iArr5 = {0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, StageEnum.APP_RESULT_FOTA_NV_SUCCESS};
        int[] iArr6 = {0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 134, DataTypeSource.SPORT_TYPE_CHECKERS, 192};
        int[] iArr7 = {0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, StageEnum.APP_RESULT_FOTA_NV_SUCCESS};
        int[] iArr8 = {0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 134, DataTypeSource.SPORT_TYPE_CHECKERS, 192};
        bVarArr[0] = new b(iArr, iArr2);
        this.N[1] = new b(new int[]{0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 114, 136, 162, 194, 232, 278, SportDeviceUtils.SOURCE_MADRID_W, 394, 464, 540, StageEnum.APP_RESULT_FOTA_NV_SUCCESS}, new int[]{0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 136, 180, 192});
        this.N[2] = new b(iArr3, iArr4);
        this.N[3] = new b(new int[]{0, 4, 8, 12, 16, 20, 24, 30, 36, 44, 52, 62, 74, 90, 110, 134, 162, 196, 238, 288, SportDeviceUtils.SOURCE_SOFIA_W, 418, StageEnum.APP_RESULT_FOTA_NV_SUCCESS}, new int[]{0, 4, 8, 12, 16, 22, 30, 40, 52, 66, 84, 106, 136, 192});
        this.N[4] = new b(new int[]{0, 4, 8, 12, 16, 20, 24, 30, 36, 42, 50, 60, 72, 88, 106, 128, 156, 190, FTPCodes.USER_LOGGED_IN, 276, SportDeviceUtils.SOURCE_MADRID_W, 384, StageEnum.APP_RESULT_FOTA_NV_SUCCESS}, new int[]{0, 4, 8, 12, 16, 22, 28, 38, 50, 64, 80, 100, 126, 192});
        this.N[5] = new b(new int[]{0, 4, 8, 12, 16, 20, 24, 30, 36, 44, 54, 66, 82, 102, 126, 156, 194, 240, 296, 364, 448, 550, StageEnum.APP_RESULT_FOTA_NV_SUCCESS}, new int[]{0, 4, 8, 12, 16, 22, 30, 42, 58, 78, 104, 138, 180, 192});
        int i3 = 6;
        this.N[6] = new b(iArr5, iArr6);
        this.N[7] = new b(iArr7, iArr8);
        this.N[8] = new b(new int[]{0, 12, 24, 36, 48, 60, 72, 88, 108, 132, 160, 192, 232, 280, 336, 400, 476, 566, 568, 570, 572, 574, StageEnum.APP_RESULT_FOTA_NV_SUCCESS}, new int[]{0, 8, 16, 24, 36, 52, 72, 96, 124, 160, 162, 164, 166, 192});
        if (X == null) {
            X = new int[9][];
            for (int i4 = 0; i4 < 9; i4++) {
                X[i4] = o(this.N[i4].b);
            }
        }
        this.O = new c(new int[]{0, 6, 11, 16, 21}, new int[]{0, 6, 12});
        this.b = new int[54];
        this.k = bitstream;
        this.l = header;
        this.m = eVar;
        this.n = eVar2;
        this.o = obuffer;
        this.p = i;
        this.v = 0;
        this.x = header.mode() == 3 ? 1 : 2;
        this.u = this.l.version() == 1 ? 2 : 1;
        int iSample_frequency = this.l.sample_frequency();
        if (this.l.version() == 1) {
            i2 = 2;
            i3 = 3;
        } else {
            i2 = 2;
            if (this.l.version() != 2) {
                i3 = 0;
            }
        }
        this.A = iSample_frequency + i3;
        if (this.x == i2) {
            int i5 = this.p;
            if (i5 == 1) {
                this.z = 0;
                this.y = 0;
            } else if (i5 == i2) {
                this.z = 1;
                this.y = 1;
            } else if (i5 != 3) {
                this.y = 0;
                this.z = 1;
            } else {
                this.z = 0;
                this.y = 0;
            }
        } else {
            this.z = 0;
            this.y = 0;
        }
        for (int i6 = 0; i6 < 2; i6++) {
            for (int i7 = 0; i7 < 576; i7++) {
                this.h[i6][i7] = 0.0f;
            }
        }
        int[] iArr9 = this.j;
        iArr9[1] = 576;
        iArr9[0] = 576;
        this.q = new javazoom.jl.decoder.a();
        this.r = new a();
    }

    private void a(int i, int i2) {
        C1157d c1157d = this.r.c[i].b[i2];
        int i3 = c1157d.e;
        if (i3 != 0 && c1157d.f == 2 && c1157d.g == 0) {
            return;
        }
        int i4 = (i3 == 0 || c1157d.g == 0 || c1157d.f != 2) ? 558 : 18;
        for (int i5 = 0; i5 < i4; i5 += 18) {
            for (int i6 = 0; i6 < 8; i6++) {
                int i7 = (i5 + 17) - i6;
                int i8 = i5 + 18 + i6;
                float[] fArr = this.g;
                float f2 = fArr[i7];
                float f3 = fArr[i8];
                float[] fArr2 = Y;
                float f4 = fArr2[i6] * f2;
                float[] fArr3 = Z;
                fArr[i7] = f4 - (fArr3[i6] * f3);
                fArr[i8] = (f3 * fArr2[i6]) + (f2 * fArr3[i6]);
            }
        }
    }

    private static float[] b() {
        float[] fArr = new float[8192];
        for (int i = 0; i < 8192; i++) {
            fArr[i] = (float) Math.pow(i, 1.3333333333333333d);
        }
        return fArr;
    }

    private void d(float[][] fArr, int i, int i2) {
        int i3;
        int i4;
        int[] iArr;
        int i5;
        C1157d c1157d = this.r.c[i].b[i2];
        if (c1157d.e != 0 && c1157d.f == 2 && c1157d.g == 0) {
            int i6 = this.N[this.A].b[1];
            i4 = i6;
            i3 = (i6 << 2) - i6;
        } else {
            i3 = this.N[this.A].a[1];
            i4 = 0;
        }
        float fPow = (float) Math.pow(2.0d, (((double) c1157d.c) - 210.0d) * 0.25d);
        for (int i7 = 0; i7 < this.j[i]; i7++) {
            int i8 = i7 % 18;
            int i9 = (i7 - i8) / 18;
            int[] iArr2 = this.d;
            if (iArr2[i7] == 0) {
                fArr[i9][i8] = 0.0f;
            } else {
                int i10 = iArr2[i7];
                float[] fArr2 = U;
                if (i10 < fArr2.length) {
                    if (iArr2[i7] > 0) {
                        fArr[i9][i8] = fArr2[i10] * fPow;
                    } else {
                        int i11 = -i10;
                        if (i11 < fArr2.length) {
                            fArr[i9][i8] = (-fPow) * fArr2[i11];
                        } else {
                            fArr[i9][i8] = (-fPow) * ((float) Math.pow(i11, 1.3333333333333333d));
                        }
                    }
                } else if (iArr2[i7] > 0) {
                    fArr[i9][i8] = ((float) Math.pow(i10, 1.3333333333333333d)) * fPow;
                } else {
                    fArr[i9][i8] = (-fPow) * ((float) Math.pow(-i10, 1.3333333333333333d));
                }
            }
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            iArr = this.j;
            if (i12 >= iArr[i]) {
                break;
            }
            int i16 = i12 % 18;
            int i17 = (i12 - i16) / 18;
            if (i13 == i3) {
                if (c1157d.e == 0 || c1157d.f != 2) {
                    i14++;
                    i3 = this.N[this.A].a[i14 + 1];
                } else if (c1157d.g != 0) {
                    b[] bVarArr = this.N;
                    int i18 = this.A;
                    if (i13 == bVarArr[i18].a[8]) {
                        int i19 = bVarArr[i18].b[4];
                        int i20 = (i19 << 2) - i19;
                        i4 = bVarArr[i18].b[4] - bVarArr[i18].b[3];
                        int i21 = bVarArr[i18].b[3];
                        i14 = 3;
                        i15 = (i21 << 2) - i21;
                        i3 = i20;
                    } else if (i13 < bVarArr[i18].a[8]) {
                        i14++;
                        i3 = bVarArr[i18].a[i14 + 1];
                    } else {
                        i14++;
                        int i22 = i14 + 1;
                        int i23 = bVarArr[i18].b[i22];
                        int i24 = (i23 << 2) - i23;
                        int i25 = bVarArr[i18].b[i14];
                        int i26 = bVarArr[i18].b[i22] - i25;
                        i15 = (i25 << 2) - i25;
                        i4 = i26;
                        i3 = i24;
                    }
                } else {
                    b[] bVarArr2 = this.N;
                    int i27 = this.A;
                    i14++;
                    int i28 = i14 + 1;
                    int i29 = bVarArr2[i27].b[i28];
                    int i30 = (i29 << 2) - i29;
                    int i31 = bVarArr2[i27].b[i14];
                    int i32 = bVarArr2[i27].b[i28] - i31;
                    i15 = (i31 << 2) - i31;
                    i4 = i32;
                    i3 = i30;
                }
            }
            if (c1157d.e == 0 || (!((i5 = c1157d.f) == 2 && c1157d.g == 0) && (i5 != 2 || c1157d.g == 0 || i12 < 36))) {
                int i33 = this.t[i].a[i14];
                if (c1157d.l != 0) {
                    i33 += S[i14];
                }
                int i34 = i33 << c1157d.m;
                float[] fArr3 = fArr[i17];
                fArr3[i16] = fArr3[i16] * T[i34];
            } else {
                int i35 = (i13 - i15) / i4;
                int i36 = (this.t[i].b[i35][i14] << c1157d.m) + (c1157d.i[i35] << 2);
                float[] fArr4 = fArr[i17];
                fArr4[i16] = fArr4[i16] * T[i36];
            }
            i13++;
            i12++;
        }
        for (int i37 = iArr[i]; i37 < 576; i37++) {
            int i38 = i37 % 18;
            int i39 = (i37 - i38) / 18;
            if (i38 < 0) {
                i38 = 0;
            }
            if (i39 < 0) {
                i39 = 0;
            }
            fArr[i39][i38] = 0.0f;
        }
    }

    private void e() {
        for (int i = 0; i < 18; i++) {
            for (int i2 = 0; i2 < 18; i2 += 3) {
                float[][][] fArr = this.f;
                fArr[0][i][i2] = (fArr[0][i][i2] + fArr[1][i][i2]) * 0.5f;
                int i3 = i2 + 1;
                fArr[0][i][i3] = (fArr[0][i][i3] + fArr[1][i][i3]) * 0.5f;
                int i4 = i2 + 2;
                fArr[0][i][i4] = (fArr[0][i][i4] + fArr[1][i][i4]) * 0.5f;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    private void f(int i, int i2) {
        char c2;
        char c3;
        int iMode_extension = this.l.mode_extension();
        f[] fVarArr = this.r.c;
        C1157d c1157d = fVarArr[i].b[i2];
        int i3 = c1157d.d;
        if (c1157d.f != 2) {
            c2 = 0;
        } else {
            int i4 = c1157d.g;
            if (i4 == 0) {
                c2 = 1;
            } else if (i4 == 1) {
                c2 = 2;
            } else {
                c2 = 0;
            }
        }
        char c4 = 5;
        if ((iMode_extension == 1 || iMode_extension == 3) && i == 1) {
            c3 = 0;
        } else {
            if (i3 < 400) {
                int[] iArr = this.D;
                int i5 = i3 >>> 4;
                iArr[0] = i5 / 5;
                iArr[1] = i5 % 5;
                iArr[2] = (i3 & 15) >>> 2;
                iArr[3] = i3 & 3;
                fVarArr[i].b[i2].l = 0;
            } else if (i3 < 500) {
                int[] iArr2 = this.D;
                int i6 = i3 - 400;
                int i7 = i6 >>> 2;
                iArr2[0] = i7 / 5;
                iArr2[1] = i7 % 5;
                iArr2[2] = i6 & 3;
                iArr2[3] = 0;
                fVarArr[i].b[i2].l = 0;
                c3 = 1;
            } else if (i3 < 512) {
                int[] iArr3 = this.D;
                int i8 = i3 - 500;
                iArr3[0] = i8 / 3;
                iArr3[1] = i8 % 3;
                iArr3[2] = 0;
                iArr3[3] = 0;
                fVarArr[i].b[i2].l = 1;
                c3 = 2;
            }
            c3 = 0;
        }
        if ((iMode_extension == 1 || iMode_extension == 3) && i == 1) {
            int i9 = i3 >>> 1;
            if (i9 < 180) {
                int[] iArr4 = this.D;
                iArr4[0] = i9 / 36;
                int i10 = i9 % 36;
                iArr4[1] = i10 / 6;
                iArr4[2] = i10 % 6;
                iArr4[3] = 0;
                fVarArr[i].b[i2].l = 0;
                c4 = 3;
            } else if (i9 < 244) {
                int[] iArr5 = this.D;
                int i11 = i9 - 180;
                iArr5[0] = (i11 & 63) >>> 4;
                iArr5[1] = (i11 & 15) >>> 2;
                iArr5[2] = i11 & 3;
                iArr5[3] = 0;
                fVarArr[i].b[i2].l = 0;
                c4 = 4;
            } else if (i9 < 255) {
                int[] iArr6 = this.D;
                int i12 = i9 - 244;
                iArr6[0] = i12 / 3;
                iArr6[1] = i12 % 3;
                iArr6[2] = 0;
                iArr6[3] = 0;
                fVarArr[i].b[i2].l = 0;
            } else {
                c4 = c3;
            }
        } else {
            c4 = c3;
        }
        for (int i13 = 0; i13 < 45; i13++) {
            this.b[i13] = 0;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            for (int i16 = 0; i16 < b0[c4][c2][i15]; i16++) {
                int[] iArr7 = this.b;
                int[] iArr8 = this.D;
                iArr7[i14] = iArr8[i15] == 0 ? 0 : this.q.b(iArr8[i15]);
                i14++;
            }
        }
    }

    private void g(int i, int i2) {
        C1157d c1157d = this.r.c[i].b[i2];
        f(i, i2);
        if (c1157d.e == 0 || c1157d.f != 2) {
            int i3 = 0;
            for (int i4 = 0; i4 < 21; i4++) {
                this.t[i].a[i4] = this.b[i3];
                i3++;
            }
            e[] eVarArr = this.t;
            eVarArr[i].a[21] = 0;
            eVarArr[i].a[22] = 0;
            return;
        }
        if (c1157d.g == 0) {
            int i5 = 0;
            for (int i6 = 0; i6 < 12; i6++) {
                for (int i7 = 0; i7 < 3; i7++) {
                    this.t[i].b[i7][i6] = this.b[i5];
                    i5++;
                }
            }
            for (int i8 = 0; i8 < 3; i8++) {
                this.t[i].b[i8][12] = 0;
            }
            return;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            this.t[i].a[i10] = this.b[i9];
            i9++;
        }
        for (int i11 = 3; i11 < 12; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                this.t[i].b[i12][i11] = this.b[i9];
                i9++;
            }
        }
        for (int i13 = 0; i13 < 3; i13++) {
            this.t[i].b[i13][12] = 0;
        }
    }

    private void h(int i, int i2) {
        f[] fVarArr = this.r.c;
        C1157d c1157d = fVarArr[i].b[i2];
        int i3 = c1157d.d;
        int[][] iArr = R;
        int i4 = iArr[0][i3];
        int i5 = iArr[1][i3];
        if (c1157d.e == 0 || c1157d.f != 2) {
            if (fVarArr[i].a[0] == 0 || i2 == 0) {
                this.t[i].a[0] = this.q.b(i4);
                this.t[i].a[1] = this.q.b(i4);
                this.t[i].a[2] = this.q.b(i4);
                this.t[i].a[3] = this.q.b(i4);
                this.t[i].a[4] = this.q.b(i4);
                this.t[i].a[5] = this.q.b(i4);
            }
            if (this.r.c[i].a[1] == 0 || i2 == 0) {
                this.t[i].a[6] = this.q.b(i4);
                this.t[i].a[7] = this.q.b(i4);
                this.t[i].a[8] = this.q.b(i4);
                this.t[i].a[9] = this.q.b(i4);
                this.t[i].a[10] = this.q.b(i4);
            }
            if (this.r.c[i].a[2] == 0 || i2 == 0) {
                this.t[i].a[11] = this.q.b(i5);
                this.t[i].a[12] = this.q.b(i5);
                this.t[i].a[13] = this.q.b(i5);
                this.t[i].a[14] = this.q.b(i5);
                this.t[i].a[15] = this.q.b(i5);
            }
            if (this.r.c[i].a[3] == 0 || i2 == 0) {
                this.t[i].a[16] = this.q.b(i5);
                this.t[i].a[17] = this.q.b(i5);
                this.t[i].a[18] = this.q.b(i5);
                this.t[i].a[19] = this.q.b(i5);
                this.t[i].a[20] = this.q.b(i5);
            }
            e[] eVarArr = this.t;
            eVarArr[i].a[21] = 0;
            eVarArr[i].a[22] = 0;
            return;
        }
        if (c1157d.g != 0) {
            for (int i6 = 0; i6 < 8; i6++) {
                this.t[i].a[i6] = this.q.b(R[0][c1157d.d]);
            }
            for (int i7 = 3; i7 < 6; i7++) {
                for (int i8 = 0; i8 < 3; i8++) {
                    this.t[i].b[i8][i7] = this.q.b(R[0][c1157d.d]);
                }
            }
            for (int i9 = 6; i9 < 12; i9++) {
                for (int i10 = 0; i10 < 3; i10++) {
                    this.t[i].b[i10][i9] = this.q.b(R[1][c1157d.d]);
                }
            }
            for (int i11 = 0; i11 < 3; i11++) {
                this.t[i].b[i11][12] = 0;
            }
            return;
        }
        this.t[i].b[0][0] = this.q.b(i4);
        this.t[i].b[1][0] = this.q.b(i4);
        this.t[i].b[2][0] = this.q.b(i4);
        this.t[i].b[0][1] = this.q.b(i4);
        this.t[i].b[1][1] = this.q.b(i4);
        this.t[i].b[2][1] = this.q.b(i4);
        this.t[i].b[0][2] = this.q.b(i4);
        this.t[i].b[1][2] = this.q.b(i4);
        this.t[i].b[2][2] = this.q.b(i4);
        this.t[i].b[0][3] = this.q.b(i4);
        this.t[i].b[1][3] = this.q.b(i4);
        this.t[i].b[2][3] = this.q.b(i4);
        this.t[i].b[0][4] = this.q.b(i4);
        this.t[i].b[1][4] = this.q.b(i4);
        this.t[i].b[2][4] = this.q.b(i4);
        this.t[i].b[0][5] = this.q.b(i4);
        this.t[i].b[1][5] = this.q.b(i4);
        this.t[i].b[2][5] = this.q.b(i4);
        this.t[i].b[0][6] = this.q.b(i5);
        this.t[i].b[1][6] = this.q.b(i5);
        this.t[i].b[2][6] = this.q.b(i5);
        this.t[i].b[0][7] = this.q.b(i5);
        this.t[i].b[1][7] = this.q.b(i5);
        this.t[i].b[2][7] = this.q.b(i5);
        this.t[i].b[0][8] = this.q.b(i5);
        this.t[i].b[1][8] = this.q.b(i5);
        this.t[i].b[2][8] = this.q.b(i5);
        this.t[i].b[0][9] = this.q.b(i5);
        this.t[i].b[1][9] = this.q.b(i5);
        this.t[i].b[2][9] = this.q.b(i5);
        this.t[i].b[0][10] = this.q.b(i5);
        this.t[i].b[1][10] = this.q.b(i5);
        this.t[i].b[2][10] = this.q.b(i5);
        this.t[i].b[0][11] = this.q.b(i5);
        this.t[i].b[1][11] = this.q.b(i5);
        this.t[i].b[2][11] = this.q.b(i5);
        e[] eVarArr2 = this.t;
        eVarArr2[i].b[0][12] = 0;
        eVarArr2[i].b[1][12] = 0;
        eVarArr2[i].b[2][12] = 0;
    }

    private boolean i() {
        if (this.l.version() == 1) {
            this.r.a = this.k.get_bits(9);
            if (this.x == 1) {
                this.r.b = this.k.get_bits(5);
            } else {
                this.r.b = this.k.get_bits(3);
            }
            for (int i = 0; i < this.x; i++) {
                this.r.c[i].a[0] = this.k.get_bits(1);
                this.r.c[i].a[1] = this.k.get_bits(1);
                this.r.c[i].a[2] = this.k.get_bits(1);
                this.r.c[i].a[3] = this.k.get_bits(1);
            }
            for (int i2 = 0; i2 < 2; i2++) {
                for (int i3 = 0; i3 < this.x; i3++) {
                    this.r.c[i3].b[i2].a = this.k.get_bits(12);
                    this.r.c[i3].b[i2].b = this.k.get_bits(9);
                    this.r.c[i3].b[i2].c = this.k.get_bits(8);
                    this.r.c[i3].b[i2].d = this.k.get_bits(4);
                    this.r.c[i3].b[i2].e = this.k.get_bits(1);
                    f[] fVarArr = this.r.c;
                    if (fVarArr[i3].b[i2].e != 0) {
                        fVarArr[i3].b[i2].f = this.k.get_bits(2);
                        this.r.c[i3].b[i2].g = this.k.get_bits(1);
                        this.r.c[i3].b[i2].h[0] = this.k.get_bits(5);
                        this.r.c[i3].b[i2].h[1] = this.k.get_bits(5);
                        this.r.c[i3].b[i2].i[0] = this.k.get_bits(3);
                        this.r.c[i3].b[i2].i[1] = this.k.get_bits(3);
                        this.r.c[i3].b[i2].i[2] = this.k.get_bits(3);
                        f[] fVarArr2 = this.r.c;
                        if (fVarArr2[i3].b[i2].f == 0) {
                            return false;
                        }
                        if (fVarArr2[i3].b[i2].f == 2 && fVarArr2[i3].b[i2].g == 0) {
                            fVarArr2[i3].b[i2].j = 8;
                        } else {
                            fVarArr2[i3].b[i2].j = 7;
                        }
                        fVarArr2[i3].b[i2].k = 20 - fVarArr2[i3].b[i2].j;
                    } else {
                        fVarArr[i3].b[i2].h[0] = this.k.get_bits(5);
                        this.r.c[i3].b[i2].h[1] = this.k.get_bits(5);
                        this.r.c[i3].b[i2].h[2] = this.k.get_bits(5);
                        this.r.c[i3].b[i2].j = this.k.get_bits(4);
                        this.r.c[i3].b[i2].k = this.k.get_bits(3);
                        this.r.c[i3].b[i2].f = 0;
                    }
                    this.r.c[i3].b[i2].l = this.k.get_bits(1);
                    this.r.c[i3].b[i2].m = this.k.get_bits(1);
                    this.r.c[i3].b[i2].n = this.k.get_bits(1);
                }
            }
        } else {
            this.r.a = this.k.get_bits(8);
            if (this.x == 1) {
                this.r.b = this.k.get_bits(1);
            } else {
                this.r.b = this.k.get_bits(2);
            }
            for (int i4 = 0; i4 < this.x; i4++) {
                this.r.c[i4].b[0].a = this.k.get_bits(12);
                this.r.c[i4].b[0].b = this.k.get_bits(9);
                this.r.c[i4].b[0].c = this.k.get_bits(8);
                this.r.c[i4].b[0].d = this.k.get_bits(9);
                this.r.c[i4].b[0].e = this.k.get_bits(1);
                f[] fVarArr3 = this.r.c;
                if (fVarArr3[i4].b[0].e != 0) {
                    fVarArr3[i4].b[0].f = this.k.get_bits(2);
                    this.r.c[i4].b[0].g = this.k.get_bits(1);
                    this.r.c[i4].b[0].h[0] = this.k.get_bits(5);
                    this.r.c[i4].b[0].h[1] = this.k.get_bits(5);
                    this.r.c[i4].b[0].i[0] = this.k.get_bits(3);
                    this.r.c[i4].b[0].i[1] = this.k.get_bits(3);
                    this.r.c[i4].b[0].i[2] = this.k.get_bits(3);
                    f[] fVarArr4 = this.r.c;
                    if (fVarArr4[i4].b[0].f == 0) {
                        return false;
                    }
                    if (fVarArr4[i4].b[0].f == 2 && fVarArr4[i4].b[0].g == 0) {
                        fVarArr4[i4].b[0].j = 8;
                    } else {
                        fVarArr4[i4].b[0].j = 7;
                        fVarArr4[i4].b[0].k = 20 - fVarArr4[i4].b[0].j;
                    }
                } else {
                    fVarArr3[i4].b[0].h[0] = this.k.get_bits(5);
                    this.r.c[i4].b[0].h[1] = this.k.get_bits(5);
                    this.r.c[i4].b[0].h[2] = this.k.get_bits(5);
                    this.r.c[i4].b[0].j = this.k.get_bits(4);
                    this.r.c[i4].b[0].k = this.k.get_bits(3);
                    this.r.c[i4].b[0].f = 0;
                }
                this.r.c[i4].b[0].m = this.k.get_bits(1);
                this.r.c[i4].b[0].n = this.k.get_bits(1);
            }
        }
        return true;
    }

    private void j(int i, int i2) {
        int i3;
        int i4;
        f[] fVarArr;
        javazoom.jl.decoder.f fVar;
        this.E[0] = 0;
        this.F[0] = 0;
        this.G[0] = 0;
        this.H[0] = 0;
        int i5 = this.w;
        f[] fVarArr2 = this.r.c;
        int i6 = i5 + fVarArr2[i].b[i2].a;
        if (fVarArr2[i].b[i2].e == 0 || fVarArr2[i].b[i2].f != 2) {
            int i7 = fVarArr2[i].b[i2].j + 1;
            int length = fVarArr2[i].b[i2].k + i7 + 1;
            b[] bVarArr = this.N;
            int i8 = this.A;
            if (length > bVarArr[i8].a.length - 1) {
                length = bVarArr[i8].a.length - 1;
            }
            int i9 = bVarArr[i8].a[i7];
            i3 = bVarArr[i8].a[length];
            i4 = i9;
        } else {
            i4 = this.A == 8 ? 72 : 36;
            i3 = StageEnum.APP_RESULT_FOTA_NV_SUCCESS;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            fVarArr = this.r.c;
            if (i10 >= (fVarArr[i].b[i2].b << 1)) {
                break;
            }
            if (i10 < i4) {
                fVar = javazoom.jl.decoder.f.I[fVarArr[i].b[i2].h[0]];
            } else {
                fVar = i10 < i3 ? javazoom.jl.decoder.f.I[fVarArr[i].b[i2].h[1]] : javazoom.jl.decoder.f.I[fVarArr[i].b[i2].h[2]];
            }
            javazoom.jl.decoder.f.a(fVar, this.E, this.F, this.G, this.H, this.q);
            int[] iArr = this.d;
            int i12 = i11 + 1;
            int[] iArr2 = this.E;
            iArr[i11] = iArr2[0];
            i11 = i12 + 1;
            int[] iArr3 = this.F;
            iArr[i12] = iArr3[0];
            this.c = this.c + iArr2[0] + iArr3[0];
            i10 += 2;
        }
        javazoom.jl.decoder.f fVar2 = javazoom.jl.decoder.f.I[fVarArr[i].b[i2].n + 32];
        int iD = this.q.d();
        while (iD < i6 && i11 < 576) {
            javazoom.jl.decoder.f.a(fVar2, this.E, this.F, this.G, this.H, this.q);
            int[] iArr4 = this.d;
            int i13 = i11 + 1;
            int[] iArr5 = this.G;
            iArr4[i11] = iArr5[0];
            int i14 = i13 + 1;
            int[] iArr6 = this.H;
            iArr4[i13] = iArr6[0];
            int i15 = i14 + 1;
            int[] iArr7 = this.E;
            iArr4[i14] = iArr7[0];
            int[] iArr8 = this.F;
            iArr4[i15] = iArr8[0];
            this.c = this.c + iArr5[0] + iArr6[0] + iArr7[0] + iArr8[0];
            iD = this.q.d();
            i11 = i15 + 1;
        }
        if (iD > i6) {
            this.q.e(iD - i6);
            i11 -= 4;
        }
        int iD2 = this.q.d();
        if (iD2 < i6) {
            this.q.b(i6 - iD2);
        }
        if (i11 < 576) {
            this.j[i] = i11;
        } else {
            this.j[i] = 576;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < 576) {
            this.d[i11] = 0;
            i11++;
        }
    }

    private void k(int i, int i2) {
        C1157d c1157d = this.r.c[i].b[i2];
        int i3 = 0;
        while (i3 < 576) {
            int i4 = (c1157d.e == 0 || c1157d.g == 0 || i3 >= 36) ? c1157d.f : 0;
            float[] fArr = this.g;
            for (int i5 = 0; i5 < 18; i5++) {
                this.K[i5] = fArr[i5 + i3];
            }
            m(this.K, this.L, i4);
            for (int i6 = 0; i6 < 18; i6++) {
                fArr[i6 + i3] = this.K[i6];
            }
            float[][] fArr2 = this.h;
            int i7 = i3 + 0;
            float[] fArr3 = this.L;
            fArr[i7] = fArr3[0] + fArr2[i][i7];
            fArr2[i][i7] = fArr3[18];
            int i8 = i3 + 1;
            fArr[i8] = fArr3[1] + fArr2[i][i8];
            fArr2[i][i8] = fArr3[19];
            int i9 = i3 + 2;
            fArr[i9] = fArr3[2] + fArr2[i][i9];
            fArr2[i][i9] = fArr3[20];
            int i10 = i3 + 3;
            fArr[i10] = fArr3[3] + fArr2[i][i10];
            fArr2[i][i10] = fArr3[21];
            int i11 = i3 + 4;
            fArr[i11] = fArr3[4] + fArr2[i][i11];
            fArr2[i][i11] = fArr3[22];
            int i12 = i3 + 5;
            fArr[i12] = fArr3[5] + fArr2[i][i12];
            fArr2[i][i12] = fArr3[23];
            int i13 = i3 + 6;
            fArr[i13] = fArr3[6] + fArr2[i][i13];
            fArr2[i][i13] = fArr3[24];
            int i14 = i3 + 7;
            fArr[i14] = fArr3[7] + fArr2[i][i14];
            fArr2[i][i14] = fArr3[25];
            int i15 = i3 + 8;
            fArr[i15] = fArr3[8] + fArr2[i][i15];
            fArr2[i][i15] = fArr3[26];
            int i16 = i3 + 9;
            fArr[i16] = fArr3[9] + fArr2[i][i16];
            fArr2[i][i16] = fArr3[27];
            int i17 = i3 + 10;
            fArr[i17] = fArr3[10] + fArr2[i][i17];
            fArr2[i][i17] = fArr3[28];
            int i18 = i3 + 11;
            fArr[i18] = fArr3[11] + fArr2[i][i18];
            fArr2[i][i18] = fArr3[29];
            int i19 = i3 + 12;
            fArr[i19] = fArr3[12] + fArr2[i][i19];
            fArr2[i][i19] = fArr3[30];
            int i20 = i3 + 13;
            fArr[i20] = fArr3[13] + fArr2[i][i20];
            fArr2[i][i20] = fArr3[31];
            int i21 = i3 + 14;
            fArr[i21] = fArr3[14] + fArr2[i][i21];
            fArr2[i][i21] = fArr3[32];
            int i22 = i3 + 15;
            fArr[i22] = fArr3[15] + fArr2[i][i22];
            fArr2[i][i22] = fArr3[33];
            int i23 = i3 + 16;
            fArr[i23] = fArr3[16] + fArr2[i][i23];
            fArr2[i][i23] = fArr3[34];
            int i24 = i3 + 17;
            fArr[i24] = fArr3[17] + fArr2[i][i24];
            fArr2[i][i24] = fArr3[35];
            i3 += 18;
        }
    }

    private void l(int i, int i2, int i3) {
        if (i == 0) {
            float[][] fArr = this.i;
            fArr[0][i3] = 1.0f;
            fArr[1][i3] = 1.0f;
        } else if ((i & 1) != 0) {
            float[][] fArr2 = this.i;
            fArr2[0][i3] = V[i2][(i + 1) >>> 1];
            fArr2[1][i3] = 1.0f;
        } else {
            float[][] fArr3 = this.i;
            fArr3[0][i3] = 1.0f;
            fArr3[1][i3] = V[i2][i >>> 1];
        }
    }

    private void n(float[][] fArr, int i, int i2) {
        C1157d c1157d = this.r.c[i].b[i2];
        int i3 = 0;
        if (c1157d.e == 0 || c1157d.f != 2) {
            while (i3 < 576) {
                int i4 = i3 % 18;
                this.g[i3] = fArr[(i3 - i4) / 18][i4];
                i3++;
            }
            return;
        }
        for (int i5 = 0; i5 < 576; i5++) {
            this.g[i5] = 0.0f;
        }
        if (c1157d.g == 0) {
            while (i3 < 576) {
                int i6 = X[this.A][i3];
                int i7 = i6 % 18;
                this.g[i3] = fArr[(i6 - i7) / 18][i7];
                i3++;
            }
            return;
        }
        for (int i8 = 0; i8 < 36; i8++) {
            int i9 = i8 % 18;
            this.g[i8] = fArr[(i8 - i9) / 18][i9];
        }
        int i10 = 3;
        while (i10 < 13) {
            b[] bVarArr = this.N;
            int i11 = this.A;
            int i12 = bVarArr[i11].b[i10];
            i10++;
            int i13 = bVarArr[i11].b[i10] - i12;
            int i14 = (i12 << 2) - i12;
            int i15 = 0;
            int i16 = 0;
            while (i15 < i13) {
                int i17 = i14 + i15;
                int i18 = i14 + i16;
                int i19 = i17 % 18;
                float[] fArr2 = this.g;
                fArr2[i18] = fArr[(i17 - i19) / 18][i19];
                int i20 = i17 + i13;
                int i21 = i18 + 1;
                int i22 = i20 % 18;
                fArr2[i21] = fArr[(i20 - i22) / 18][i22];
                int i23 = i20 + i13;
                int i24 = i23 % 18;
                fArr2[i21 + 1] = fArr[(i23 - i24) / 18][i24];
                i15++;
                i16 += 3;
            }
        }
    }

    public static int[] o(int[] iArr) {
        int[] iArr2 = new int[StageEnum.APP_RESULT_FOTA_NV_SUCCESS];
        int i = 0;
        int i2 = 0;
        while (i < 13) {
            int i3 = iArr[i];
            i++;
            int i4 = iArr[i];
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = i3;
                while (i6 < i4) {
                    iArr2[(i6 * 3) + i5] = i2;
                    i6++;
                    i2++;
                }
            }
        }
        return iArr2;
    }

    private void q(int i) {
        float f2;
        b[] bVarArr;
        int i2;
        b[] bVarArr2;
        int i3;
        if (this.x == 1) {
            for (int i4 = 0; i4 < 32; i4++) {
                for (int i5 = 0; i5 < 18; i5 += 3) {
                    float[][][] fArr = this.f;
                    float[] fArr2 = fArr[0][i4];
                    float[][][] fArr3 = this.e;
                    fArr2[i5] = fArr3[0][i4][i5];
                    int i6 = i5 + 1;
                    fArr[0][i4][i6] = fArr3[0][i4][i6];
                    int i7 = i5 + 2;
                    fArr[0][i4][i7] = fArr3[0][i4][i7];
                }
            }
            return;
        }
        C1157d c1157d = this.r.c[0].b[i];
        int iMode_extension = this.l.mode_extension();
        boolean z = this.l.mode() == 1 && (iMode_extension & 2) != 0;
        boolean z2 = this.l.mode() == 1 && (iMode_extension & 1) != 0;
        boolean z3 = this.l.version() == 0 || this.l.version() == 2;
        int i8 = c1157d.d & 1;
        int i9 = 0;
        while (true) {
            f2 = 0.0f;
            if (i9 >= 576) {
                break;
            }
            this.I[i9] = 7;
            this.J[i9] = 0.0f;
            i9++;
        }
        if (z2) {
            if (c1157d.e == 0 || c1157d.f != 2) {
                int i10 = 31;
                int i11 = 0;
                loop19: while (true) {
                    int i12 = 17;
                    while (true) {
                        if (i10 < 0) {
                            break loop19;
                        }
                        if (this.e[1][i10][i12] != 0.0f) {
                            i11 = (i10 << 4) + (i10 << 1) + i12;
                            i10 = -1;
                        } else {
                            i12--;
                            if (i12 < 0) {
                                i10--;
                            }
                        }
                    }
                }
                int i13 = 0;
                while (true) {
                    bVarArr = this.N;
                    i2 = this.A;
                    if (bVarArr[i2].a[i13] > i11) {
                        break;
                    } else {
                        i13++;
                    }
                }
                int i14 = bVarArr[i2].a[i13];
                while (i13 < 21) {
                    b[] bVarArr3 = this.N;
                    int i15 = this.A;
                    int i16 = i13 + 1;
                    for (int i17 = bVarArr3[i15].a[i16] - bVarArr3[i15].a[i13]; i17 > 0; i17--) {
                        int[] iArr = this.I;
                        iArr[i14] = this.t[1].a[i13];
                        if (iArr[i14] != 7) {
                            if (z3) {
                                l(iArr[i14], i8, i14);
                            } else {
                                this.J[i14] = W[iArr[i14]];
                            }
                        }
                        i14++;
                    }
                    i13 = i16;
                }
                b[] bVarArr4 = this.N;
                int i18 = this.A;
                int i19 = bVarArr4[i18].a[20];
                for (int i20 = 576 - bVarArr4[i18].a[21]; i20 > 0 && i14 < 576; i20--) {
                    int[] iArr2 = this.I;
                    iArr2[i14] = iArr2[i19];
                    if (z3) {
                        float[][] fArr4 = this.i;
                        fArr4[0][i14] = fArr4[0][i19];
                        fArr4[1][i14] = fArr4[1][i19];
                    } else {
                        float[] fArr5 = this.J;
                        fArr5[i14] = fArr5[i19];
                    }
                    i14++;
                }
            } else {
                int i21 = 3;
                int i22 = 12;
                if (c1157d.g != 0) {
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < i21) {
                        int i25 = 12;
                        int i26 = 2;
                        while (i25 >= i21) {
                            b[] bVarArr5 = this.N;
                            int i27 = this.A;
                            int i28 = bVarArr5[i27].b[i25];
                            int i29 = bVarArr5[i27].b[i25 + 1] - i28;
                            int i30 = (((i28 << 2) - i28) + ((i23 + 1) * i29)) - 1;
                            while (i29 > 0) {
                                if (this.e[1][i30 / 18][i30 % 18] != f2) {
                                    i26 = i25;
                                    i25 = -10;
                                    i29 = -10;
                                }
                                i29--;
                                i30--;
                            }
                            i25--;
                            i21 = 3;
                        }
                        int i31 = i26 + 1;
                        if (i31 > i24) {
                            i24 = i31;
                        }
                        while (i31 < i22) {
                            b[] bVarArr6 = this.N;
                            int i32 = this.A;
                            int i33 = bVarArr6[i32].b[i31];
                            int[] iArr3 = bVarArr6[i32].b;
                            int i34 = i31 + 1;
                            int i35 = iArr3[i34] - i33;
                            int i36 = ((i33 << 2) - i33) + (i23 * i35);
                            while (i35 > 0) {
                                int[] iArr4 = this.I;
                                iArr4[i36] = this.t[1].b[i23][i31];
                                if (iArr4[i36] != 7) {
                                    if (z3) {
                                        l(iArr4[i36], i8, i36);
                                    } else {
                                        this.J[i36] = W[iArr4[i36]];
                                    }
                                }
                                i36++;
                                i35--;
                                i22 = 12;
                            }
                            i31 = i34;
                        }
                        b[] bVarArr7 = this.N;
                        int i37 = this.A;
                        int i38 = bVarArr7[i37].b[10];
                        int i39 = ((i38 << 2) - i38) + ((bVarArr7[i37].b[11] - i38) * i23);
                        int i40 = bVarArr7[i37].b[11];
                        int i41 = bVarArr7[i37].b[12] - i40;
                        int i42 = ((i40 << 2) - i40) + (i23 * i41);
                        while (i41 > 0) {
                            int[] iArr5 = this.I;
                            iArr5[i42] = iArr5[i39];
                            if (z3) {
                                float[][] fArr6 = this.i;
                                fArr6[0][i42] = fArr6[0][i39];
                                fArr6[1][i42] = fArr6[1][i39];
                            } else {
                                float[] fArr7 = this.J;
                                fArr7[i42] = fArr7[i39];
                            }
                            i42++;
                            i41--;
                        }
                        i23++;
                        i21 = 3;
                        f2 = 0.0f;
                        i22 = 12;
                    }
                    if (i24 <= 3) {
                        int i43 = 17;
                        int i44 = -1;
                        int i45 = 2;
                        while (i45 >= 0) {
                            if (this.e[1][i45][i43] != 0.0f) {
                                i44 = (i45 << 4) + (i45 << 1) + i43;
                                i45 = -1;
                            } else {
                                i43--;
                                if (i43 < 0) {
                                    i45--;
                                    i43 = 17;
                                }
                            }
                        }
                        int i46 = 0;
                        while (true) {
                            bVarArr2 = this.N;
                            i3 = this.A;
                            if (bVarArr2[i3].a[i46] > i44) {
                                break;
                            } else {
                                i46++;
                            }
                        }
                        int i47 = bVarArr2[i3].a[i46];
                        while (i46 < 8) {
                            b[] bVarArr8 = this.N;
                            int i48 = this.A;
                            int i49 = i46 + 1;
                            for (int i50 = bVarArr8[i48].a[i49] - bVarArr8[i48].a[i46]; i50 > 0; i50--) {
                                int[] iArr6 = this.I;
                                iArr6[i47] = this.t[1].a[i46];
                                if (iArr6[i47] != 7) {
                                    if (z3) {
                                        l(iArr6[i47], i8, i47);
                                    } else {
                                        this.J[i47] = W[iArr6[i47]];
                                    }
                                }
                                i47++;
                            }
                            i46 = i49;
                        }
                    }
                } else {
                    for (int i51 = 0; i51 < 3; i51++) {
                        int i52 = 12;
                        int i53 = -1;
                        while (i52 >= 0) {
                            b[] bVarArr9 = this.N;
                            int i54 = this.A;
                            int i55 = bVarArr9[i54].b[i52];
                            int i56 = bVarArr9[i54].b[i52 + 1] - i55;
                            int i57 = (((i55 << 2) - i55) + ((i51 + 1) * i56)) - 1;
                            while (i56 > 0) {
                                if (this.e[1][i57 / 18][i57 % 18] != 0.0f) {
                                    i53 = i52;
                                    i52 = -10;
                                    i56 = -10;
                                }
                                i56--;
                                i57--;
                            }
                            i52--;
                        }
                        int i58 = i53 + 1;
                        while (i58 < 12) {
                            b[] bVarArr10 = this.N;
                            int i59 = this.A;
                            int i60 = bVarArr10[i59].b[i58];
                            int[] iArr7 = bVarArr10[i59].b;
                            int i61 = i58 + 1;
                            int i62 = iArr7[i61] - i60;
                            int i63 = ((i60 << 2) - i60) + (i51 * i62);
                            while (i62 > 0) {
                                int[] iArr8 = this.I;
                                iArr8[i63] = this.t[1].b[i51][i58];
                                if (iArr8[i63] != 7) {
                                    if (z3) {
                                        l(iArr8[i63], i8, i63);
                                    } else {
                                        this.J[i63] = W[iArr8[i63]];
                                    }
                                }
                                i63++;
                                i62--;
                            }
                            i58 = i61;
                        }
                        b[] bVarArr11 = this.N;
                        int i64 = this.A;
                        int i65 = bVarArr11[i64].b[10];
                        int i66 = bVarArr11[i64].b[11];
                        int i67 = ((i65 << 2) - i65) + ((i66 - i65) * i51);
                        int i68 = bVarArr11[i64].b[12] - i66;
                        int i69 = ((i66 << 2) - i66) + (i51 * i68);
                        while (i68 > 0) {
                            int[] iArr9 = this.I;
                            iArr9[i69] = iArr9[i67];
                            if (z3) {
                                float[][] fArr8 = this.i;
                                fArr8[0][i69] = fArr8[0][i67];
                                fArr8[1][i69] = fArr8[1][i67];
                            } else {
                                float[] fArr9 = this.J;
                                fArr9[i69] = fArr9[i67];
                            }
                            i69++;
                            i68--;
                        }
                    }
                }
            }
        }
        int i70 = 0;
        int i71 = 0;
        for (int i72 = 32; i71 < i72; i72 = 32) {
            for (int i73 = 0; i73 < 18; i73++) {
                if (this.I[i70] != 7) {
                    if (z2) {
                        if (z3) {
                            float[][][] fArr10 = this.f;
                            float[] fArr11 = fArr10[0][i71];
                            float[][][] fArr12 = this.e;
                            float f3 = fArr12[0][i71][i73];
                            float[][] fArr13 = this.i;
                            fArr11[i73] = f3 * fArr13[0][i70];
                            fArr10[1][i71][i73] = fArr12[0][i71][i73] * fArr13[1][i70];
                        } else {
                            float[][][] fArr14 = this.f;
                            float[] fArr15 = fArr14[1][i71];
                            float f4 = this.e[0][i71][i73];
                            float[] fArr16 = this.J;
                            fArr15[i73] = f4 / (fArr16[i70] + 1.0f);
                            fArr14[0][i71][i73] = fArr14[1][i71][i73] * fArr16[i70];
                        }
                    }
                    i70++;
                } else if (z) {
                    float[][][] fArr17 = this.f;
                    float[] fArr18 = fArr17[0][i71];
                    float[][][] fArr19 = this.e;
                    fArr18[i73] = (fArr19[0][i71][i73] + fArr19[1][i71][i73]) * 0.70710677f;
                    fArr17[1][i71][i73] = (fArr19[0][i71][i73] - fArr19[1][i71][i73]) * 0.70710677f;
                } else {
                    float[][][] fArr20 = this.f;
                    float[] fArr21 = fArr20[0][i71];
                    float[][][] fArr22 = this.e;
                    fArr21[i73] = fArr22[0][i71][i73];
                    fArr20[1][i71][i73] = fArr22[1][i71][i73];
                }
                i70++;
            }
            i71++;
        }
    }

    public void c() {
        int iSlots = this.l.slots();
        i();
        for (int i = 0; i < iSlots; i++) {
            this.q.c(this.k.get_bits(8));
        }
        int iD = this.q.d() >>> 3;
        int iD2 = this.q.d() & 7;
        if (iD2 != 0) {
            this.q.b(8 - iD2);
            iD++;
        }
        int i2 = this.v;
        int i3 = (i2 - iD) - this.r.a;
        int i4 = i2 + iSlots;
        this.v = i4;
        if (i3 < 0) {
            return;
        }
        if (iD > 4096) {
            this.v = i4 - 4096;
            this.q.f(4096);
        }
        while (i3 > 0) {
            this.q.b(8);
            i3--;
        }
        for (int i5 = 0; i5 < this.u; i5++) {
            for (int i6 = 0; i6 < this.x; i6++) {
                this.w = this.q.d();
                if (this.l.version() == 1) {
                    h(i6, i5);
                } else {
                    g(i6, i5);
                }
                j(i6, i5);
                d(this.e[i6], i6, i5);
            }
            q(i5);
            if (this.p == 3 && this.x > 1) {
                e();
            }
            for (int i7 = this.y; i7 <= this.z; i7++) {
                n(this.f[i7], i7, i5);
                a(i7, i5);
                k(i7, i5);
                for (int i8 = 18; i8 < 576; i8 += 36) {
                    for (int i9 = 1; i9 < 18; i9 += 2) {
                        float[] fArr = this.g;
                        int i10 = i8 + i9;
                        fArr[i10] = -fArr[i10];
                    }
                }
                if (i7 == 0 || this.p == 2) {
                    for (int i11 = 0; i11 < 18; i11++) {
                        int i12 = 0;
                        for (int i13 = 0; i13 < 576; i13 += 18) {
                            this.B[i12] = this.g[i13 + i11];
                            i12++;
                        }
                        this.m.v(this.B);
                        this.m.a(this.o);
                    }
                } else {
                    for (int i14 = 0; i14 < 18; i14++) {
                        int i15 = 0;
                        for (int i16 = 0; i16 < 576; i16 += 18) {
                            this.C[i15] = this.g[i16 + i14];
                            i15++;
                        }
                        this.n.v(this.C);
                        this.n.a(this.o);
                    }
                }
            }
        }
        this.M++;
        this.o.write_buffer(1);
    }

    @Override // javazoom.jl.decoder.FrameDecoder
    public void decodeFrame() {
        c();
    }

    public void m(float[] fArr, float[] fArr2, int i) {
        int i2 = 0;
        if (i == 2) {
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
            fArr2[2] = 0.0f;
            fArr2[3] = 0.0f;
            fArr2[4] = 0.0f;
            fArr2[5] = 0.0f;
            fArr2[6] = 0.0f;
            fArr2[7] = 0.0f;
            fArr2[8] = 0.0f;
            fArr2[9] = 0.0f;
            fArr2[10] = 0.0f;
            fArr2[11] = 0.0f;
            fArr2[12] = 0.0f;
            fArr2[13] = 0.0f;
            fArr2[14] = 0.0f;
            fArr2[15] = 0.0f;
            fArr2[16] = 0.0f;
            fArr2[17] = 0.0f;
            fArr2[18] = 0.0f;
            fArr2[19] = 0.0f;
            fArr2[20] = 0.0f;
            fArr2[21] = 0.0f;
            fArr2[22] = 0.0f;
            fArr2[23] = 0.0f;
            fArr2[24] = 0.0f;
            fArr2[25] = 0.0f;
            fArr2[26] = 0.0f;
            fArr2[27] = 0.0f;
            fArr2[28] = 0.0f;
            fArr2[29] = 0.0f;
            fArr2[30] = 0.0f;
            fArr2[31] = 0.0f;
            fArr2[32] = 0.0f;
            fArr2[33] = 0.0f;
            fArr2[34] = 0.0f;
            fArr2[35] = 0.0f;
            int i3 = 0;
            while (i2 < 3) {
                int i4 = i2 + 15;
                int i5 = i2 + 12;
                fArr[i4] = fArr[i4] + fArr[i5];
                int i6 = i2 + 9;
                fArr[i5] = fArr[i5] + fArr[i6];
                int i7 = i2 + 6;
                fArr[i6] = fArr[i6] + fArr[i7];
                int i8 = i2 + 3;
                fArr[i7] = fArr[i7] + fArr[i8];
                int i9 = i2 + 0;
                fArr[i8] = fArr[i8] + fArr[i9];
                fArr[i4] = fArr[i4] + fArr[i6];
                fArr[i6] = fArr[i6] + fArr[i8];
                float f2 = fArr[i5] * 0.5f;
                float f3 = fArr[i7] * 0.8660254f;
                float f4 = fArr[i9] + f2;
                float f5 = fArr[i9] - fArr[i5];
                float f6 = f4 + f3;
                float f7 = f4 - f3;
                float f8 = fArr[i4] * 0.5f;
                float f9 = fArr[i6] * 0.8660254f;
                float f10 = fArr[i8] + f8;
                float f11 = fArr[i8] - fArr[i4];
                float f12 = f10 + f9;
                float f13 = (f10 - f9) * 1.9318516f;
                float f14 = f11 * 0.70710677f;
                float f15 = f12 * 0.5176381f;
                float f16 = f6 + f15;
                float f17 = f6 - f15;
                float f18 = f5 + f14;
                float f19 = f5 - f14;
                float f20 = f7 + f13;
                float f21 = (f7 - f13) * 0.8213398f;
                float f22 = f19 * 1.306563f;
                float f23 = f17 * 3.830649f;
                float f24 = -(f16 * 0.5043145f);
                float f25 = -(f18 * 0.5411961f);
                float f26 = -(f20 * 0.6302362f);
                float f27 = (-f21) * 0.9914449f;
                int i10 = i3 + 6;
                fArr2[i10] = fArr2[i10] + (f21 * 0.13052619f);
                int i11 = i3 + 7;
                fArr2[i11] = fArr2[i11] + (0.38268343f * f22);
                int i12 = i3 + 8;
                fArr2[i12] = fArr2[i12] + (0.6087614f * f23);
                int i13 = i3 + 9;
                fArr2[i13] = fArr2[i13] + ((-f23) * 0.7933533f);
                int i14 = i3 + 10;
                fArr2[i14] = fArr2[i14] + ((-f22) * 0.9238795f);
                int i15 = i3 + 11;
                fArr2[i15] = fArr2[i15] + f27;
                int i16 = i3 + 12;
                fArr2[i16] = fArr2[i16] + (0.9914449f * f26);
                int i17 = i3 + 13;
                fArr2[i17] = fArr2[i17] + (0.9238795f * f25);
                int i18 = i3 + 14;
                fArr2[i18] = fArr2[i18] + (0.7933533f * f24);
                int i19 = i3 + 15;
                fArr2[i19] = fArr2[i19] + (f24 * 0.6087614f);
                int i20 = i3 + 16;
                fArr2[i20] = fArr2[i20] + (f25 * 0.38268343f);
                int i21 = i3 + 17;
                fArr2[i21] = fArr2[i21] + (f26 * 0.13052619f);
                i2++;
                i3 = i10;
            }
            return;
        }
        fArr[17] = fArr[17] + fArr[16];
        fArr[16] = fArr[16] + fArr[15];
        fArr[15] = fArr[15] + fArr[14];
        fArr[14] = fArr[14] + fArr[13];
        fArr[13] = fArr[13] + fArr[12];
        fArr[12] = fArr[12] + fArr[11];
        fArr[11] = fArr[11] + fArr[10];
        fArr[10] = fArr[10] + fArr[9];
        fArr[9] = fArr[9] + fArr[8];
        fArr[8] = fArr[8] + fArr[7];
        fArr[7] = fArr[7] + fArr[6];
        fArr[6] = fArr[6] + fArr[5];
        fArr[5] = fArr[5] + fArr[4];
        fArr[4] = fArr[4] + fArr[3];
        fArr[3] = fArr[3] + fArr[2];
        fArr[2] = fArr[2] + fArr[1];
        fArr[1] = fArr[1] + fArr[0];
        fArr[17] = fArr[17] + fArr[15];
        fArr[15] = fArr[15] + fArr[13];
        fArr[13] = fArr[13] + fArr[11];
        fArr[11] = fArr[11] + fArr[9];
        fArr[9] = fArr[9] + fArr[7];
        fArr[7] = fArr[7] + fArr[5];
        fArr[5] = fArr[5] + fArr[3];
        fArr[3] = fArr[3] + fArr[1];
        float f28 = fArr[0] + fArr[0];
        float f29 = f28 + fArr[12];
        float f30 = f29 + (fArr[4] * 1.8793852f) + (fArr[8] * 1.5320889f) + (fArr[16] * 0.34729636f);
        float f31 = ((((f28 + fArr[4]) - fArr[8]) - fArr[12]) - fArr[12]) - fArr[16];
        float f32 = ((f29 - (fArr[4] * 0.34729636f)) - (fArr[8] * 1.8793852f)) + (fArr[16] * 1.5320889f);
        float f33 = ((f29 - (fArr[4] * 1.5320889f)) + (fArr[8] * 0.34729636f)) - (fArr[16] * 1.8793852f);
        float f34 = (((fArr[0] - fArr[4]) + fArr[8]) - fArr[12]) + fArr[16];
        float f35 = fArr[6] * 1.7320508f;
        float f36 = (fArr[2] * 1.9696155f) + f35 + (fArr[10] * 1.2855753f) + (fArr[14] * 0.6840403f);
        float f37 = ((fArr[2] - fArr[10]) - fArr[14]) * 1.7320508f;
        float f38 = (((fArr[2] * 1.2855753f) - f35) - (fArr[10] * 0.6840403f)) + (fArr[14] * 1.9696155f);
        float f39 = (((fArr[2] * 0.6840403f) - f35) + (fArr[10] * 1.9696155f)) - (fArr[14] * 1.2855753f);
        float f40 = fArr[1] + fArr[1];
        float f41 = f40 + fArr[13];
        float f42 = f41 + (fArr[5] * 1.8793852f) + (fArr[9] * 1.5320889f) + (fArr[17] * 0.34729636f);
        float f43 = ((((f40 + fArr[5]) - fArr[9]) - fArr[13]) - fArr[13]) - fArr[17];
        float f44 = ((f41 - (fArr[5] * 0.34729636f)) - (fArr[9] * 1.8793852f)) + (fArr[17] * 1.5320889f);
        float f45 = ((f41 - (fArr[5] * 1.5320889f)) + (fArr[9] * 0.34729636f)) - (fArr[17] * 1.8793852f);
        float f46 = ((((fArr[1] - fArr[5]) + fArr[9]) - fArr[13]) + fArr[17]) * 0.70710677f;
        float f47 = fArr[7] * 1.7320508f;
        float f48 = (fArr[3] * 1.9696155f) + f47 + (fArr[11] * 1.2855753f) + (fArr[15] * 0.6840403f);
        float f49 = ((fArr[3] - fArr[11]) - fArr[15]) * 1.7320508f;
        float f50 = (((fArr[3] * 1.2855753f) - f47) - (fArr[11] * 0.6840403f)) + (fArr[15] * 1.9696155f);
        float f51 = (((fArr[3] * 0.6840403f) - f47) + (fArr[11] * 1.9696155f)) - (fArr[15] * 1.2855753f);
        float f52 = f30 + f36;
        float f53 = (f42 + f48) * 0.5019099f;
        float f54 = f52 + f53;
        float f55 = f52 - f53;
        float f56 = f31 + f37;
        float f57 = (f43 + f49) * 0.5176381f;
        float f58 = f56 + f57;
        float f59 = f56 - f57;
        float f60 = f32 + f38;
        float f61 = (f44 + f50) * 0.55168897f;
        float f62 = f60 + f61;
        float f63 = f60 - f61;
        float f64 = f33 + f39;
        float f65 = (f45 + f51) * 0.61038727f;
        float f66 = f64 + f65;
        float f67 = f64 - f65;
        float f68 = f34 + f46;
        float f69 = f34 - f46;
        float f70 = f33 - f39;
        float f71 = (f45 - f51) * 0.8717234f;
        float f72 = f70 + f71;
        float f73 = f70 - f71;
        float f74 = f32 - f38;
        float f75 = (f44 - f50) * 1.1831008f;
        float f76 = f74 + f75;
        float f77 = f74 - f75;
        float f78 = f31 - f37;
        float f79 = (f43 - f49) * 1.9318516f;
        float f80 = f78 + f79;
        float f81 = f78 - f79;
        float f82 = f30 - f36;
        float f83 = (f42 - f48) * 5.7368565f;
        float f84 = f82 + f83;
        float f85 = f82 - f83;
        float[] fArr3 = a0[i];
        fArr2[0] = (-f85) * fArr3[0];
        fArr2[1] = (-f81) * fArr3[1];
        fArr2[2] = (-f77) * fArr3[2];
        fArr2[3] = (-f73) * fArr3[3];
        fArr2[4] = (-f69) * fArr3[4];
        fArr2[5] = (-f67) * fArr3[5];
        fArr2[6] = (-f63) * fArr3[6];
        fArr2[7] = (-f59) * fArr3[7];
        fArr2[8] = (-f55) * fArr3[8];
        fArr2[9] = f55 * fArr3[9];
        fArr2[10] = f59 * fArr3[10];
        fArr2[11] = f63 * fArr3[11];
        fArr2[12] = f67 * fArr3[12];
        fArr2[13] = f69 * fArr3[13];
        fArr2[14] = f73 * fArr3[14];
        fArr2[15] = f77 * fArr3[15];
        fArr2[16] = f81 * fArr3[16];
        fArr2[17] = f85 * fArr3[17];
        fArr2[18] = fArr3[18] * f84;
        fArr2[19] = fArr3[19] * f80;
        fArr2[20] = fArr3[20] * f76;
        fArr2[21] = fArr3[21] * f72;
        fArr2[22] = fArr3[22] * f68;
        fArr2[23] = fArr3[23] * f66;
        fArr2[24] = fArr3[24] * f62;
        fArr2[25] = fArr3[25] * f58;
        fArr2[26] = fArr3[26] * f54;
        fArr2[27] = f54 * fArr3[27];
        fArr2[28] = f58 * fArr3[28];
        fArr2[29] = f62 * fArr3[29];
        fArr2[30] = f66 * fArr3[30];
        fArr2[31] = f68 * fArr3[31];
        fArr2[32] = f72 * fArr3[32];
        fArr2[33] = f76 * fArr3[33];
        fArr2[34] = f80 * fArr3[34];
        fArr2[35] = f84 * fArr3[35];
    }

    public void p() {
        this.v = 0;
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 576; i2++) {
                this.h[i][i2] = 0.0f;
            }
        }
        this.q = new javazoom.jl.decoder.a();
    }

    public static class b {
        public int[] a;
        public int[] b;

        public b() {
            this.a = new int[23];
            this.b = new int[14];
        }

        public b(int[] iArr, int[] iArr2) {
            this.a = iArr;
            this.b = iArr2;
        }
    }

    public class c {
        public int[] a;
        public int[] b;

        public c() {
            this.a = new int[5];
            this.b = new int[3];
        }

        public c(int[] iArr, int[] iArr2) {
            this.a = iArr;
            this.b = iArr2;
        }
    }
}
