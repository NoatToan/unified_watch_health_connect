package nz2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.material.internal.ViewUtils;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f128445d = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f128446e = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f128447f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 7};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f128448g = {Ascii.DLE, 17, Ascii.DC2, 0, 8, 7, 9, 6, 10, 5, Ascii.VT, 4, Ascii.FF, 3, Ascii.CR, 2, Ascii.SO, 1, Ascii.SI};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f128449h = {0, 1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, 0, 0, Ascii.DLE, 17, Ascii.DC2, Ascii.DC2, 19, 19, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.FS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS, Ascii.GS};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f128450i = {0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 10, 10, Ascii.VT, Ascii.VT, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.DLE, Ascii.DLE, Ascii.DLE, Ascii.DLE, Ascii.DLE, Ascii.DLE, Ascii.DLE, Ascii.DLE, 17, 17, 17, 17, 17, 17, 17, 17, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, 19, 19, 19, 19, 19, 19, 19, 19, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.EM, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.FS};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f128451j = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 20, 24, 28, 32, 40, 48, 56, 64, 80, 96, 112, 128, SyslogConstants.LOG_LOCAL4, 192, 224, 0};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f128452k = {0, 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, 128, 192, 256, 384, 512, ViewUtils.EDGE_TO_EDGE_FLAGS, 1024, 1536, 2048, 3072, 4096, 6144, 8192, 12288, 16384, 24576};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f128453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f128454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f128455c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17, types: [int] */
    /* JADX WARN: Type inference failed for: r4v18, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7, types: [int, short] */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v10, types: [int] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9, types: [short] */
    public final void a(d dVar) {
        int i14;
        int i15;
        char c14;
        short[] sArr;
        short s8;
        short[] sArr2;
        char c15;
        int i16;
        int i17;
        short[] sArr3 = this.f128453a;
        i iVar = this.f128455c;
        short[] sArr4 = iVar.f128440a;
        int i18 = iVar.f128443d;
        dVar.M0 = 0;
        dVar.N0 = 573;
        int i19 = 0;
        int i24 = -1;
        while (true) {
            i14 = 1;
            if (i19 >= i18) {
                break;
            }
            int i25 = i19 * 2;
            if (sArr3[i25] != 0) {
                int[] iArr = dVar.L0;
                int i26 = dVar.M0 + 1;
                dVar.M0 = i26;
                iArr[i26] = i19;
                dVar.O0[i19] = 0;
                i24 = i19;
            } else {
                sArr3[i25 + 1] = 0;
            }
            i19++;
        }
        while (true) {
            i15 = dVar.M0;
            c14 = 2;
            if (i15 >= 2) {
                break;
            }
            int[] iArr2 = dVar.L0;
            int i27 = i15 + 1;
            dVar.M0 = i27;
            if (i24 < 2) {
                i17 = i24 + 1;
                i16 = i17;
            } else {
                i16 = i24;
                i17 = 0;
            }
            iArr2[i27] = i17;
            int i28 = i17 * 2;
            sArr3[i28] = 1;
            dVar.O0[i17] = 0;
            dVar.T0--;
            if (sArr4 != null) {
                dVar.U0 -= sArr4[i28 + 1];
            }
            i24 = i16;
        }
        this.f128454b = i24;
        for (int i29 = i15 / 2; i29 >= 1; i29--) {
            dVar.k(sArr3, i29);
        }
        while (true) {
            int[] iArr3 = dVar.L0;
            int i30 = iArr3[1];
            int i34 = dVar.M0;
            dVar.M0 = i34 - 1;
            iArr3[1] = iArr3[i34];
            dVar.k(sArr3, 1);
            int[] iArr4 = dVar.L0;
            int i35 = iArr4[1];
            int i36 = dVar.N0;
            int i37 = i36 - 1;
            dVar.N0 = i37;
            iArr4[i37] = i30;
            int i38 = i36 - 2;
            dVar.N0 = i38;
            iArr4[i38] = i35;
            int i39 = i30 * 2;
            int i44 = i35 * 2;
            sArr3[i18 * 2] = (short) (sArr3[i39] + sArr3[i44]);
            byte[] bArr = dVar.O0;
            bArr[i18] = (byte) (Math.max((int) bArr[i30], (int) bArr[i35]) + 1);
            short s14 = (short) i18;
            sArr3[i44 + 1] = s14;
            sArr3[i39 + 1] = s14;
            int i45 = i18 + 1;
            dVar.L0[1] = i18;
            dVar.k(sArr3, 1);
            if (dVar.M0 < 2) {
                break;
            } else {
                i18 = i45;
            }
        }
        int[] iArr5 = dVar.L0;
        int i46 = dVar.N0 - 1;
        dVar.N0 = i46;
        iArr5[i46] = iArr5[1];
        short[] sArr5 = this.f128453a;
        i iVar2 = this.f128455c;
        short[] sArr6 = iVar2.f128440a;
        int[] iArr6 = iVar2.f128441b;
        int i47 = iVar2.f128442c;
        int i48 = iVar2.f128444e;
        for (int i49 = 0; i49 <= 15; i49++) {
            dVar.J0[i49] = 0;
        }
        int[] iArr7 = dVar.L0;
        int i54 = dVar.N0;
        sArr5[(iArr7[i54] * 2) + 1] = 0;
        int i55 = i54 + 1;
        int i56 = 0;
        for (int i57 = 573; i55 < i57; i57 = 573) {
            int i58 = dVar.L0[i55];
            int i59 = i58 * 2;
            int i64 = i59 + 1;
            int i65 = sArr5[(sArr5[i64] * 2) + 1] + 1;
            if (i65 > i48) {
                i56++;
                i65 = i48;
            }
            int i66 = i14;
            sArr5[i64] = (short) i65;
            if (i58 > this.f128454b) {
                c15 = c14;
            } else {
                short[] sArr7 = dVar.J0;
                c15 = c14;
                sArr7[i65] = (short) (sArr7[i65] + 1);
                int i67 = i58 >= i47 ? iArr6[i58 - i47] : 0;
                short s15 = sArr5[i59];
                dVar.T0 = ((i65 + i67) * s15) + dVar.T0;
                if (sArr6 != null) {
                    dVar.U0 = ((sArr6[i64] + i67) * s15) + dVar.U0;
                }
            }
            i55++;
            i14 = i66;
            c14 = c15;
        }
        int i68 = i14;
        if (i56 != 0) {
            do {
                int i69 = i48 - 1;
                while (true) {
                    sArr = dVar.J0;
                    s8 = sArr[i69];
                    if (s8 != 0) {
                        break;
                    } else {
                        i69--;
                    }
                }
                sArr[i69] = (short) (s8 - 1);
                int i74 = i69 + 1;
                sArr[i74] = (short) (sArr[i74] + 2);
                sArr[i48] = (short) (sArr[i48] - 1);
                i56 -= 2;
            } while (i56 > 0);
            while (i48 != 0) {
                short s16 = dVar.J0[i48];
                while (s16 != 0) {
                    i55--;
                    int i75 = dVar.L0[i55];
                    if (i75 <= this.f128454b) {
                        int i76 = i75 * 2;
                        int i77 = i76 + 1;
                        short s17 = sArr5[i77];
                        if (s17 != i48) {
                            sArr2 = sArr5;
                            dVar.T0 = (int) (((((long) i48) - ((long) s17)) * ((long) sArr2[i76])) + ((long) dVar.T0));
                            sArr2[i77] = (short) i48;
                        } else {
                            sArr2 = sArr5;
                        }
                        s16--;
                        sArr3 = sArr3;
                        sArr5 = sArr2;
                    }
                }
                i48--;
            }
        }
        short[] sArr8 = sArr3;
        short[] sArr9 = dVar.J0;
        short[] sArr10 = dVar.K0;
        sArr10[0] = 0;
        short s18 = 0;
        for (int i78 = i68; i78 <= 15; i78++) {
            s18 = (short) ((s18 + sArr9[i78 - 1]) << 1);
            sArr10[i78] = s18;
        }
        for (int i79 = 0; i79 <= i24; i79++) {
            int i84 = i79 * 2;
            short s19 = sArr8[i84 + 1];
            if (s19 != 0) {
                short s24 = sArr10[s19];
                sArr10[s19] = (short) (s24 + 1);
                int i85 = 0;
                do {
                    int i86 = i85 | (s24 & 1);
                    s24 >>>= 1;
                    i85 = i86 << 1;
                    s19--;
                } while (s19 > 0);
                sArr8[i84] = (short) (i85 >>> 1);
            }
        }
    }
}
