package defpackage;

import android.util.Log;
import com.ultrasoniclibrary.ultrasoundcore.classfun.FreqParam;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes46.dex */
public class ytm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f53863c = 1000000000;
    public static int e = 1000000000;

    public static class e {
        public double e = 0.0d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f53864b = 0.0d;
    }

    public static float b(float f) {
        return f >= 0.0f ? f : f + 360.0f;
    }

    public static float d(float f) {
        float f2 = f % 360.0f;
        float f3 = 0.0f;
        if (f2 >= 0.0f && f2 < 180.0f) {
            f3 = f2;
        }
        return f2 >= 180.0f ? 360.0f - f2 : f3;
    }

    public static float d(float f, float f2, int i, int i2) {
        boolean z = i > i2 * 48 || i < 960;
        return (f > -100.0f || !z) ? (f < 150.0f || !z) ? f : f - ((i2 * f2) * 1000.0f) : f + (f2 * i2 * 1000.0f);
    }

    public static float e(float f) {
        if (f > -95.0f) {
            return ((f * 0.6f) + 331.6f) / 1000000.0f;
        }
        return 3.45E-4f;
    }

    public static float a(float[] fArr) {
        boolean z;
        Log.e("UltraAlg", "getMeanAngle: angleArray: " + Arrays.toString(fArr));
        e eVarE = e(fArr);
        double d = eVarE.e;
        double d2 = eVarE.f53864b;
        double dA = ytp.a(fArr);
        if (Math.abs(d2 - 0.0d) > 1.0E-5d) {
            dA = (Math.atan(d / d2) * 180.0d) / 3.141592653589793d;
            z = true;
        } else {
            z = false;
        }
        Log.e("UltraAlg", "getMeanAngle: meanAngle: " + dA);
        if (z && d2 < 0.0d && d2 < 0.0d) {
            dA += 180.0d;
        }
        if (dA < 0.0d) {
            dA += 360.0d;
        }
        return (float) dA;
    }

    public static e e(float[] fArr) {
        e eVar = new e();
        double dSin = 0.0d;
        double dCos = 0.0d;
        for (float f : fArr) {
            double d = (((double) f) * 3.141592653589793d) / 180.0d;
            dSin += Math.sin(d);
            dCos += Math.cos(d);
        }
        int length = fArr.length;
        if (length > 0) {
            double d2 = length;
            dSin /= d2;
            dCos /= d2;
        }
        eVar.e = dSin;
        eVar.f53864b = dCos;
        return eVar;
    }

    public static int d(CopyOnWriteArrayList<float[]> copyOnWriteArrayList) {
        if (copyOnWriteArrayList.isEmpty()) {
            return 0;
        }
        int size = copyOnWriteArrayList.size();
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            float[] fArr2 = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                fArr2[i2] = copyOnWriteArrayList.get(i2)[i];
            }
            float fA = ytp.a(fArr2);
            fArr[i] = (ytp.c(fArr2) - (fA * fA)) * 1000.0f;
        }
        Log.e("UltraAlg", "getMoveState: std" + Arrays.toString(fArr));
        float[] fArr3 = {3800.0f, 200.0f, 3800.0f};
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            if (fArr[i4] > fArr3[i4]) {
                i3 = 1;
            }
        }
        return i3;
    }

    public static float b(int i, int i2, List<float[]> list, int i3) {
        int i4;
        if (i2 == 0) {
            Log.e("UltraAlg", "getSensorDegree: length of sensorList is 0!");
            return 0.0f;
        }
        int iRound = Math.round(600.0f / i2);
        Log.e("UltraAlg", "getSensorIdx unit is: " + iRound);
        if (i3 == 0) {
            Log.e("UltraAlg", "getSensorDegree: calFlag=0, sensorIdx is the last idx");
            i4 = i2 - 1;
        } else {
            int i5 = (iRound + 80) * 48;
            if (i <= i5) {
                i4 = 0;
            } else {
                int i6 = ((iRound * 2) + 80) * 48;
                if (i > i6 || i <= i5) {
                    int i7 = ((iRound * 3) + 80) * 48;
                    if (i > i7 || i <= i6) {
                        int i8 = ((iRound * 4) + 80) * 48;
                        if (i > i8 || i <= i7) {
                            int i9 = ((iRound * 5) + 80) * 48;
                            if (i > i9 || i <= i8) {
                                int i10 = ((iRound * 6) + 80) * 48;
                                if (i > i10 || i <= i9) {
                                    int i11 = ((iRound * 7) + 80) * 48;
                                    if (i > i11 || i <= i10) {
                                        i4 = (i > ((iRound * 8) + 80) * 48 || i <= i11) ? 8 : 7;
                                    } else {
                                        i4 = 6;
                                    }
                                } else {
                                    i4 = 5;
                                }
                            } else {
                                i4 = 4;
                            }
                        } else {
                            i4 = 3;
                        }
                    } else {
                        i4 = 2;
                    }
                } else {
                    i4 = 1;
                }
            }
        }
        Log.e("UltraAlg", "sensorIdx is：" + i4);
        float[] fArr = list.get(i4);
        Log.e("UltraAlg", "sensorDegreeTemp is：" + Arrays.toString(fArr));
        return Math.round(fArr[0]);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0092  */
    public static int b(double d, double d2, double d3, double d4, float f, int i) {
        double d5;
        int iCeil;
        Log.e("UltraAlg", "inputCoors: " + d + "; " + d2 + "; " + d3 + "; " + d4);
        float f2 = f * 1000000.0f * 100.0f;
        if (f2 <= 0.0f) {
            d5 = 0.7200000286102295d;
        } else {
            d5 = i > 0 ? f2 / i : 0.0d;
        }
        Log.e("UltraAlg", "waveLen: " + d5);
        if (d <= 0.0d || d2 <= 0.0d || d3 <= 0.0d) {
            iCeil = 23;
        } else {
            double d6 = d3 - d;
            double d7 = d4 - d2;
            double dSqrt = Math.sqrt((d6 * d6) + (d7 * d7)) / 10.0d;
            Log.e("UltraAlg", "micDis: " + dSqrt);
            if (Math.abs(d5 - 0.0d) > 1.0E-5d) {
                iCeil = (int) Math.ceil(dSqrt / d5);
            } else {
                iCeil = 23;
            }
        }
        Log.e("UltraAlg", "micDisPoint: " + iCeil);
        return iCeil;
    }

    public static float b(int i, int i2) {
        if (i > i2) {
            i = i2;
        } else {
            int i3 = -i2;
            if (i < i3) {
                i = i3;
            }
        }
        return Math.round(((Math.asin(((double) i) / ((double) i2)) * 57.29577951308232d) + 90.0d) / 10.0d) * 10;
    }

    public static float a(float f) {
        if (Math.abs(f) <= 180.0f) {
            return f;
        }
        return f > 180.0f ? f - 360.0f : f + 360.0f;
    }

    public static float e(float[] fArr, float f, float f2) {
        int length = fArr.length;
        float f3 = 0.0f;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (Math.abs(fArr[i2] - f) <= f2) {
                Log.e("UltraAlg", "angle[i]: " + fArr[i2]);
                f3 += fArr[i2];
                i++;
            }
        }
        Log.e("UltraAlg", "getFilterAngle sumTmp: " + f3);
        Log.e("UltraAlg", "angleBeta k count: " + i);
        if (i <= 0) {
            return 1.0f;
        }
        float fRound = Math.round(((f3 / i) % 360.0f) / 10.0f) * 10;
        Log.e("UltraAlg", "angleFilterTmp2: " + fRound);
        return a(fRound);
    }

    public static yta d(float f, float f2, int i, FreqParam freqParam) {
        float[] fArr = {f, f2};
        Log.i("UltraAlg", "resultValues[0]: " + f + "  resultValues[1]: " + f2 + "  freqParam: " + freqParam.toString());
        if (i == 4 && Math.abs(f - 1.0f) < 0.2f) {
            i = 1;
        }
        return new yta(i, fArr, freqParam);
    }

    public static long[] e(long[] jArr, int i, int i2) {
        if (jArr.length < 1 || i < 1) {
            return new long[]{0};
        }
        long[] jArr2 = new long[i];
        long[] jArr3 = new long[i];
        System.arraycopy(jArr, 0, jArr2, 1, i2);
        int i3 = i2 + 1;
        if (i3 < i) {
            System.arraycopy(jArr, i3, jArr2, i3, (i - 1) - i2);
        }
        jArr2[0] = f53863c;
        System.arraycopy(jArr2, 0, jArr3, 0, i);
        return jArr3;
    }

    public static int[] a(int[] iArr, int i, int i2) {
        if (iArr.length < 1 || i < 1) {
            return new int[]{0};
        }
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 1, i2);
        int i3 = i2 + 1;
        if (i3 < i) {
            System.arraycopy(iArr, i3, iArr2, i3, (i - 1) - i2);
        }
        iArr2[0] = e;
        System.arraycopy(iArr2, 0, iArr3, 0, i);
        return iArr3;
    }

    public static long[] b(long[] jArr, int i, long j) {
        if (jArr.length < 1 || i < 1) {
            return new long[]{0};
        }
        long[] jArr2 = new long[i];
        long[] jArr3 = new long[i];
        int i2 = i - 1;
        System.arraycopy(jArr, 1, jArr2, 0, i2);
        jArr2[i2] = j;
        System.arraycopy(jArr2, 0, jArr3, 0, i);
        return jArr3;
    }

    public static int[] e(int[] iArr, int i, int i2) {
        if (iArr.length < 1 || i < 1) {
            return new int[]{0};
        }
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i3 = i - 1;
        System.arraycopy(iArr, 1, iArr2, 0, i3);
        iArr2[i3] = i2;
        System.arraycopy(iArr2, 0, iArr3, 0, i);
        return iArr3;
    }

    public static CopyOnWriteArrayList<Float> c(CopyOnWriteArrayList<Float> copyOnWriteArrayList, int i, float f) {
        if (copyOnWriteArrayList.size() >= i) {
            copyOnWriteArrayList.remove(0);
        }
        copyOnWriteArrayList.add(Float.valueOf(f));
        return copyOnWriteArrayList;
    }

    public static CopyOnWriteArrayList<float[]> d(CopyOnWriteArrayList<float[]> copyOnWriteArrayList, int i, CopyOnWriteArrayList<float[]> copyOnWriteArrayList2) {
        int size = copyOnWriteArrayList2.size();
        if (copyOnWriteArrayList.size() >= i - size) {
            for (int i2 = 0; i2 < size; i2++) {
                copyOnWriteArrayList.remove(0);
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            copyOnWriteArrayList.add(copyOnWriteArrayList2.get(i3));
        }
        return copyOnWriteArrayList;
    }

    public static float[] b(CopyOnWriteArrayList<Float> copyOnWriteArrayList, CopyOnWriteArrayList<Float> copyOnWriteArrayList2, float f) {
        int size = copyOnWriteArrayList.size();
        if (size < 1) {
            return new float[size];
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (Math.abs(copyOnWriteArrayList.get(i2).floatValue() - 800.0f) > 1.0f) {
                i++;
            }
        }
        Log.e("UltraAlg", "minusNoEmpty: arrayLen：" + i);
        float[] fArr = new float[i];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            if (Math.abs(copyOnWriteArrayList.get(i4).floatValue() - 800.0f) > 1.0f) {
                float[] fArr2 = new float[(size - 1) - i4];
                for (int i5 = i4 + 1; i5 < size; i5++) {
                    fArr2[(i5 - i4) - 1] = copyOnWriteArrayList2.get(i5).floatValue();
                }
                fArr[i3] = b((copyOnWriteArrayList.get(i4).floatValue() - (ytp.b(fArr2) + f)) % 360.0f);
                i3++;
            }
        }
        Log.e("UltraAlg", "minusNoEmpty: arrayOutput: " + Arrays.toString(fArr));
        return fArr;
    }
}
