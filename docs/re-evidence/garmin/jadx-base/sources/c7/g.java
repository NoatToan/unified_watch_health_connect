package c7;

import android.graphics.Path;
import java.util.ArrayList;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f25194a;
    }

    private g() {
    }

    public static float[] a(float[] fArr, int i14) {
        if (i14 < 0) {
            vb.h.w();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i14, length);
        float[] fArr2 = new float[i14];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4 A[Catch: NumberFormatException -> 0x00b2, TryCatch #0 {NumberFormatException -> 0x00b2, blocks: (B:22:0x0054, B:24:0x0067, B:25:0x006e, B:27:0x0074, B:31:0x0080, B:45:0x009f, B:35:0x0089, B:40:0x0095, B:47:0x00a4, B:50:0x00b4, B:54:0x00bb, B:55:0x00be), top: B:70:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bb A[Catch: NumberFormatException -> 0x00b2, TryCatch #0 {NumberFormatException -> 0x00b2, blocks: (B:22:0x0054, B:24:0x0067, B:25:0x006e, B:27:0x0074, B:31:0x0080, B:45:0x009f, B:35:0x0089, B:40:0x0095, B:47:0x00a4, B:50:0x00b4, B:54:0x00bb, B:55:0x00be), top: B:70:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static b[] b(String str) {
        int i14;
        String strTrim;
        float[] fArrA;
        int i15;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ArrayList arrayList = new ArrayList();
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i18 < str.length()) {
            while (i18 < str.length()) {
                char cCharAt = str.charAt(i18);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i17, i18).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i16) != 'z' || strTrim.charAt(i16) == 'Z') {
                                fArrA = new float[i16];
                                i15 = i16;
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    a aVar = new a();
                                    int length = strTrim.length();
                                    int i19 = i16;
                                    int i24 = 1;
                                    boolean z18 = i16;
                                    while (i24 < length) {
                                        aVar.f25194a = z18;
                                        boolean z19 = z18;
                                        boolean z24 = z19 ? 1 : 0;
                                        boolean z25 = z24 ? 1 : 0;
                                        int i25 = i24;
                                        boolean z26 = z19;
                                        boolean z27 = z24;
                                        while (i25 < strTrim.length()) {
                                            char cCharAt2 = strTrim.charAt(i25);
                                            if (cCharAt2 == ' ') {
                                                z14 = false;
                                                z15 = true;
                                                z16 = z27;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case '-':
                                                        z17 = z25;
                                                        z17 = z25;
                                                        if (i25 != i24 && !z26) {
                                                            aVar.f25194a = true;
                                                            break;
                                                        } else {
                                                            z14 = false;
                                                            z16 = z27;
                                                            z15 = z17;
                                                            break;
                                                        }
                                                    case ',':
                                                        z14 = false;
                                                        z15 = true;
                                                        z16 = z27;
                                                        break;
                                                    case '.':
                                                        if (!z27) {
                                                            z14 = false;
                                                            z16 = true;
                                                        } else {
                                                            aVar.f25194a = true;
                                                            z17 = true;
                                                            z14 = false;
                                                            z16 = z27;
                                                            z15 = z17;
                                                        }
                                                        break;
                                                    default:
                                                        z17 = z25;
                                                        z14 = false;
                                                        z16 = z27;
                                                        z15 = z17;
                                                        break;
                                                }
                                            } else {
                                                z14 = true;
                                                z16 = z27;
                                                z15 = z25;
                                            }
                                            if (z15) {
                                                z15 = z25;
                                                if (i24 < i25) {
                                                    int i26 = (i19 == true ? 1 : 0) + 1;
                                                    fArr[i19 == true ? 1 : 0] = Float.parseFloat(strTrim.substring(i24, i25));
                                                    i19 = i26;
                                                }
                                                if (aVar.f25194a) {
                                                    i24 = i25;
                                                } else {
                                                    i24 = i25 + 1;
                                                }
                                                z18 = 0;
                                                i19 = i19;
                                            } else {
                                                z15 = z25;
                                                i25++;
                                                z26 = z14;
                                                z27 = z16;
                                                z25 = z15;
                                            }
                                        }
                                        if (i24 < i25) {
                                            int i27 = (i19 == true ? 1 : 0) + 1;
                                            fArr[i19 == true ? 1 : 0] = Float.parseFloat(strTrim.substring(i24, i25));
                                            i19 = i27;
                                        }
                                        if (aVar.f25194a) {
                                            i24 = i25;
                                        } else {
                                            i24 = i25 + 1;
                                        }
                                        z18 = 0;
                                        i19 = i19;
                                    }
                                    fArrA = a(fArr, i19 == true ? 1 : 0);
                                    i15 = 0;
                                } catch (NumberFormatException e4) {
                                    q2.v(am.j.m("error in parsing \"", strTrim, "\""), e4);
                                    return null;
                                }
                            }
                            arrayList.add(new b(strTrim.charAt(i15), fArrA));
                        }
                        i17 = i18;
                        i18++;
                        i16 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i18++;
            }
            strTrim = str.substring(i17, i18).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i16) != 'z') {
                    fArrA = new float[i16];
                    i15 = i16;
                } else {
                    fArrA = new float[i16];
                    i15 = i16;
                }
                arrayList.add(new b(strTrim.charAt(i15), fArrA));
            }
            i17 = i18;
            i18++;
            i16 = 0;
        }
        if (i18 - i17 != 1 || i17 >= str.length()) {
            i14 = 0;
        } else {
            i14 = 0;
            arrayList.add(new b(str.charAt(i17), new float[0]));
        }
        return (b[]) arrayList.toArray(new b[i14]);
    }

    public static Path c(String str) {
        Path path = new Path();
        try {
            b.b(b(str), path);
            return path;
        } catch (RuntimeException e4) {
            q2.v("Error in parsing ".concat(str), e4);
            return null;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public char f25195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f25196b;

        public b(b bVar) {
            this.f25195a = bVar.f25195a;
            float[] fArr = bVar.f25196b;
            this.f25196b = g.a(fArr, fArr.length);
        }

        public static void a(Path path, float f14, float f15, float f16, float f17, float f18, float f19, float f22, boolean z14, boolean z15) {
            double d14;
            double d15;
            double radians = Math.toRadians(f22);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d16 = f14;
            double d17 = f15;
            double d18 = f18;
            double d19 = ((d17 * dSin) + (d16 * dCos)) / d18;
            double d24 = f19;
            double d25 = ((d17 * dCos) + (((double) (-f14)) * dSin)) / d24;
            double d26 = f17;
            double d27 = ((d26 * dSin) + (((double) f16) * dCos)) / d18;
            double d28 = ((d26 * dCos) + (((double) (-f16)) * dSin)) / d24;
            double d29 = d19 - d27;
            double d34 = d25 - d28;
            double d35 = (d19 + d27) / 2.0d;
            double d36 = (d25 + d28) / 2.0d;
            double d37 = (d34 * d34) + (d29 * d29);
            if (d37 == 0.0d) {
                return;
            }
            double d38 = (1.0d / d37) - 0.25d;
            if (d38 < 0.0d) {
                float fSqrt = (float) (Math.sqrt(d37) / 1.99999d);
                a(path, f14, f15, f16, f17, f18 * fSqrt, fSqrt * f19, f22, z14, z15);
                return;
            }
            double dSqrt = Math.sqrt(d38);
            double d39 = d29 * dSqrt;
            double d44 = dSqrt * d34;
            if (z14 == z15) {
                d14 = d35 - d44;
                d15 = d36 + d39;
            } else {
                d14 = d35 + d44;
                d15 = d36 - d39;
            }
            double dAtan2 = Math.atan2(d25 - d15, d19 - d14);
            double dAtan3 = Math.atan2(d28 - d15, d27 - d14) - dAtan2;
            if (z15 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d45 = d14 * d18;
            double d46 = d15 * d24;
            double d47 = (d45 * dCos) - (d46 * dSin);
            double d48 = (d46 * dCos) + (d45 * dSin);
            int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
            double dCos2 = Math.cos(radians);
            double dSin2 = Math.sin(radians);
            double dCos3 = Math.cos(dAtan2);
            double dSin3 = Math.sin(dAtan2);
            double d49 = -d18;
            double d54 = d49 * dCos2;
            double d55 = d24 * dSin2;
            double d56 = (d54 * dSin3) - (d55 * dCos3);
            double d57 = d49 * dSin2;
            double d58 = d24 * dCos2;
            double d59 = dAtan3 / ((double) iCeil);
            double d64 = (dCos3 * d58) + (dSin3 * d57);
            int i14 = 0;
            double d65 = d16;
            double d66 = d17;
            double d67 = dAtan2;
            while (i14 < iCeil) {
                double d68 = d67 + d59;
                double dSin4 = Math.sin(d68);
                double dCos4 = Math.cos(d68);
                double d69 = d59;
                double d74 = (((d18 * dCos2) * dCos4) + d47) - (d55 * dSin4);
                double d75 = d47;
                double d76 = (d58 * dSin4) + (d18 * dSin2 * dCos4) + d48;
                double d77 = (d54 * dSin4) - (d55 * dCos4);
                double d78 = (dCos4 * d58) + (dSin4 * d57);
                double d79 = d68 - d67;
                double dTan = Math.tan(d79 / 2.0d);
                double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d79)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d56 * dSqrt2) + d65), (float) ((d64 * dSqrt2) + d66), (float) (d74 - (dSqrt2 * d77)), (float) (d76 - (dSqrt2 * d78)), (float) d74, (float) d76);
                i14++;
                d66 = d76;
                iCeil = iCeil;
                d57 = d57;
                dCos2 = dCos2;
                d67 = d68;
                d64 = d78;
                d56 = d77;
                d47 = d75;
                d65 = d74;
                d59 = d69;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Deprecated
        public static void b(b[] bVarArr, Path path) {
            int i14;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f22;
            float f24;
            float f25;
            float f26;
            b[] bVarArr2 = bVarArr;
            float[] fArr = new float[6];
            int length = bVarArr2.length;
            int i15 = 0;
            int i16 = 0;
            char c14 = 'm';
            while (i16 < length) {
                b bVar = bVarArr2[i16];
                char c15 = bVar.f25195a;
                float[] fArr2 = bVar.f25196b;
                float f27 = fArr[i15];
                float f28 = fArr[1];
                float f29 = fArr[2];
                float f34 = fArr[3];
                float f35 = fArr[4];
                int i17 = i15;
                float f36 = fArr[5];
                switch (c15) {
                    case 'A':
                    case 'a':
                        i14 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i14 = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i14 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i14 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f35, f36);
                        f27 = f35;
                        f29 = f27;
                        f28 = f36;
                        f34 = f28;
                    default:
                        i14 = 2;
                        break;
                }
                float f37 = f35;
                float f38 = f36;
                float f39 = f27;
                float f44 = f28;
                int i18 = i17;
                while (i18 < fArr2.length) {
                    if (c15 == 'A') {
                        fArr2 = fArr2;
                        i18 = i18;
                        bVar = bVar;
                        float f45 = f44;
                        i16 = i16;
                        int i19 = i18 + 5;
                        int i24 = i18 + 6;
                        a(path, f39, f45, fArr2[i19], fArr2[i24], fArr2[i18], fArr2[i18 + 1], fArr2[i18 + 2], fArr2[i18 + 3] != 0.0f ? 1 : i17, fArr2[i18 + 4] != 0.0f ? 1 : i17);
                        f29 = fArr2[i19];
                        f14 = fArr2[i24];
                        f34 = f14;
                        f15 = f29;
                    } else if (c15 == 'C') {
                        fArr2 = fArr2;
                        i18 = i18;
                        i16 = i16;
                        bVar = bVar;
                        int i25 = i18 + 2;
                        int i26 = i18 + 3;
                        int i27 = i18 + 4;
                        int i28 = i18 + 5;
                        path.cubicTo(fArr2[i18], fArr2[i18 + 1], fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                        float f46 = fArr2[i27];
                        float f47 = fArr2[i28];
                        f29 = fArr2[i25];
                        f34 = fArr2[i26];
                        f14 = f47;
                        f15 = f46;
                    } else if (c15 == 'H') {
                        fArr2 = fArr2;
                        i18 = i18;
                        bVar = bVar;
                        f14 = f44;
                        i16 = i16;
                        path.lineTo(fArr2[i18], f14);
                        f15 = fArr2[i18];
                    } else if (c15 == 'Q') {
                        fArr2 = fArr2;
                        i18 = i18;
                        i16 = i16;
                        bVar = bVar;
                        int i29 = i18 + 1;
                        int i30 = i18 + 2;
                        int i34 = i18 + 3;
                        path.quadTo(fArr2[i18], fArr2[i29], fArr2[i30], fArr2[i34]);
                        float f48 = fArr2[i18];
                        float f49 = fArr2[i29];
                        float f50 = fArr2[i30];
                        float f54 = fArr2[i34];
                        f29 = f48;
                        f34 = f49;
                        f15 = f50;
                        f14 = f54;
                    } else if (c15 == 'V') {
                        fArr2 = fArr2;
                        i18 = i18;
                        i16 = i16;
                        bVar = bVar;
                        f15 = f39;
                        path.lineTo(f15, fArr2[i18]);
                        f14 = fArr2[i18];
                    } else if (c15 != 'a') {
                        if (c15 == 'c') {
                            fArr2 = fArr2;
                            i18 = i18;
                            int i35 = i18 + 2;
                            int i36 = i18 + 3;
                            int i37 = i18 + 4;
                            int i38 = i18 + 5;
                            path.rCubicTo(fArr2[i18], fArr2[i18 + 1], fArr2[i35], fArr2[i36], fArr2[i37], fArr2[i38]);
                            float f55 = fArr2[i35] + f39;
                            float f56 = fArr2[i36] + f44;
                            f39 += fArr2[i37];
                            f44 += fArr2[i38];
                            f29 = f55;
                            f34 = f56;
                        } else if (c15 != 'h') {
                            if (c15 != 'q') {
                                if (c15 != 'v') {
                                    if (c15 == 'L') {
                                        fArr2 = fArr2;
                                        i18 = i18;
                                        int i39 = i18 + 1;
                                        path.lineTo(fArr2[i18], fArr2[i39]);
                                        f15 = fArr2[i18];
                                        f14 = fArr2[i39];
                                    } else if (c15 == 'M') {
                                        fArr2 = fArr2;
                                        i18 = i18;
                                        f15 = fArr2[i18];
                                        f14 = fArr2[i18 + 1];
                                        if (i18 > 0) {
                                            path.lineTo(f15, f14);
                                        } else {
                                            path.moveTo(f15, f14);
                                            f37 = f15;
                                            f38 = f14;
                                        }
                                    } else if (c15 == 'S') {
                                        fArr2 = fArr2;
                                        i18 = i18;
                                        if (c14 == 'c' || c14 == 's' || c14 == 'C' || c14 == 'S') {
                                            f39 = (f39 * 2.0f) - f29;
                                            f44 = (f44 * 2.0f) - f34;
                                        }
                                        float f57 = f39;
                                        float f58 = f44;
                                        int i44 = i18 + 1;
                                        int i45 = i18 + 2;
                                        int i46 = i18 + 3;
                                        path.cubicTo(f57, f58, fArr2[i18], fArr2[i44], fArr2[i45], fArr2[i46]);
                                        f29 = fArr2[i18];
                                        f34 = fArr2[i44];
                                        f15 = fArr2[i45];
                                        f14 = fArr2[i46];
                                    } else if (c15 == 'T') {
                                        fArr2 = fArr2;
                                        i18 = i18;
                                        if (c14 == 'q' || c14 == 't' || c14 == 'Q' || c14 == 'T') {
                                            f39 = (f39 * 2.0f) - f29;
                                            f44 = (f44 * 2.0f) - f34;
                                        }
                                        int i47 = i18 + 1;
                                        path.quadTo(f39, f44, fArr2[i18], fArr2[i47]);
                                        f15 = fArr2[i18];
                                        f14 = fArr2[i47];
                                        bVar = bVar;
                                        f29 = f39;
                                        f34 = f44;
                                    } else if (c15 == 'l') {
                                        fArr2 = fArr2;
                                        i18 = i18;
                                        int i48 = i18 + 1;
                                        path.rLineTo(fArr2[i18], fArr2[i48]);
                                        f39 += fArr2[i18];
                                        f19 = fArr2[i48];
                                    } else if (c15 == 'm') {
                                        fArr2 = fArr2;
                                        i18 = i18;
                                        float f59 = fArr2[i18];
                                        f39 += f59;
                                        float f64 = fArr2[i18 + 1];
                                        f44 += f64;
                                        if (i18 > 0) {
                                            path.rLineTo(f59, f64);
                                        } else {
                                            path.rMoveTo(f59, f64);
                                            bVar = bVar;
                                            f15 = f39;
                                            f37 = f15;
                                            f14 = f44;
                                            f38 = f14;
                                        }
                                    } else if (c15 != 's') {
                                        if (c15 != 't') {
                                            f15 = f39;
                                        } else {
                                            if (c14 == 'q' || c14 == 't' || c14 == 'Q' || c14 == 'T') {
                                                f25 = f39 - f29;
                                                f26 = f44 - f34;
                                            } else {
                                                f26 = 0.0f;
                                                f25 = 0.0f;
                                            }
                                            int i49 = i18 + 1;
                                            path.rQuadTo(f25, f26, fArr2[i18], fArr2[i49]);
                                            float f65 = f25 + f39;
                                            float f66 = f26 + f44;
                                            float f67 = f39 + fArr2[i18];
                                            f44 += fArr2[i49];
                                            f34 = f66;
                                            f15 = f67;
                                            f29 = f65;
                                        }
                                        f14 = f44;
                                    } else {
                                        if (c14 == 'c' || c14 == 's' || c14 == 'C' || c14 == 'S') {
                                            f22 = f44 - f34;
                                            f24 = f39 - f29;
                                        } else {
                                            f24 = 0.0f;
                                            f22 = 0.0f;
                                        }
                                        int i54 = i18;
                                        int i55 = i54 + 1;
                                        int i56 = i54 + 2;
                                        int i57 = i54 + 3;
                                        fArr2 = fArr2;
                                        i18 = i54;
                                        path.rCubicTo(f24, f22, fArr2[i54], fArr2[i55], fArr2[i56], fArr2[i57]);
                                        f16 = fArr2[i18] + f39;
                                        f17 = fArr2[i55] + f44;
                                        f39 += fArr2[i56];
                                        f18 = fArr2[i57];
                                    }
                                    bVar = bVar;
                                } else {
                                    fArr2 = fArr2;
                                    i18 = i18;
                                    path.rLineTo(0.0f, fArr2[i18]);
                                    f19 = fArr2[i18];
                                }
                                f44 += f19;
                            } else {
                                fArr2 = fArr2;
                                i18 = i18;
                                int i58 = i18 + 1;
                                int i59 = i18 + 2;
                                int i64 = i18 + 3;
                                path.rQuadTo(fArr2[i18], fArr2[i58], fArr2[i59], fArr2[i64]);
                                f16 = fArr2[i18] + f39;
                                f17 = fArr2[i58] + f44;
                                f39 += fArr2[i59];
                                f18 = fArr2[i64];
                            }
                            f44 += f18;
                            f29 = f16;
                            f34 = f17;
                        } else {
                            fArr2 = fArr2;
                            i18 = i18;
                            path.rLineTo(fArr2[i18], 0.0f);
                            f39 += fArr2[i18];
                        }
                        bVar = bVar;
                        f15 = f39;
                        f14 = f44;
                    } else {
                        fArr2 = fArr2;
                        i18 = i18;
                        int i65 = i18 + 5;
                        float f68 = fArr2[i65] + f39;
                        int i66 = i18 + 6;
                        float f69 = fArr2[i66] + f44;
                        bVar = bVar;
                        float f74 = f39;
                        float f75 = f44;
                        i16 = i16;
                        a(path, f74, f75, f68, f69, fArr2[i18], fArr2[i18 + 1], fArr2[i18 + 2], fArr2[i18 + 3] != 0.0f ? 1 : i17, fArr2[i18 + 4] != 0.0f ? 1 : i17);
                        f15 = f74 + fArr2[i65];
                        f14 = f75 + fArr2[i66];
                        f29 = f15;
                        f34 = f14;
                    }
                    i18 += i14;
                    path = path;
                    bVar = bVar;
                    c15 = c15;
                    i16 = i16;
                    f39 = f15;
                    f44 = f14;
                    c14 = c15;
                    fArr2 = fArr2;
                }
                fArr[i17] = f39;
                fArr[1] = f44;
                fArr[2] = f29;
                fArr[3] = f34;
                fArr[4] = f37;
                fArr[5] = f38;
                c14 = bVar.f25195a;
                i16++;
                bVarArr2 = bVarArr;
                i15 = i17;
            }
        }

        public b(char c14, float[] fArr) {
            this.f25195a = c14;
            this.f25196b = fArr;
        }
    }
}
