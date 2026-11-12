package defpackage;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i3b implements snq<f3b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20734a;

    public i3b(int i) {
        this.f20734a = i;
    }

    public static float[] e(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f = i2 < fArr.length ? fArr[i2] : Float.NaN;
            float f2 = i3 < fArr2.length ? fArr2[i3] : Float.NaN;
            if (Float.isNaN(f2) || f < f2) {
                fArr3[i4] = f;
                i2++;
            } else if (Float.isNaN(f) || f2 < f) {
                fArr3[i4] = f2;
                i3++;
            } else {
                fArr3[i4] = f;
                i2++;
                i3++;
                i++;
            }
        }
        return i == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i);
    }

    public final f3b b(f3b f3bVar, List<Float> list) {
        int i = this.f20734a * 4;
        if (list.size() <= i) {
            return f3bVar;
        }
        float[] fArrD = f3bVar.d();
        int[] iArrC = f3bVar.c();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] fArrE = e(f3bVar.d(), fArr);
        int length = fArrE.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = fArrE[i3];
            int iBinarySearch = Arrays.binarySearch(fArrD, f);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i3] = c(f, fArr2[iBinarySearch2], fArrD, iArrC);
            } else {
                iArr[i3] = d(f, iArrC[iBinarySearch], fArr, fArr2);
            }
        }
        return new f3b(fArrE, iArr);
    }

    public int c(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f == fArr[0]) {
            return iArr[0];
        }
        for (int i = 1; i < fArr.length; i++) {
            float f3 = fArr[i];
            if (f3 >= f || i == fArr.length - 1) {
                int i2 = i - 1;
                float f4 = fArr[i2];
                float f5 = (f - f4) / (f3 - f4);
                int i3 = iArr[i];
                int i4 = iArr[i2];
                return Color.argb((int) (f2 * 255.0f), gxa.c(f5, Color.red(i4), Color.red(i3)), gxa.c(f5, Color.green(i4), Color.green(i3)), gxa.c(f5, Color.blue(i4), Color.blue(i3)));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    public final int d(float f, int i, float[] fArr, float[] fArr2) {
        float fI;
        if (fArr2.length < 2 || f <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 >= f || i2 == fArr.length - 1) {
                if (f2 <= f) {
                    fI = fArr2[i2];
                } else {
                    int i3 = i2 - 1;
                    float f3 = fArr[i3];
                    fI = d5g.i(fArr2[i3], fArr2[i2], (f - f3) / (f2 - f3));
                }
                return Color.argb((int) (fI * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    @Override // defpackage.snq
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public f3b a(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.n() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.b();
        }
        while (jsonReader.d()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f20734a = 2;
        }
        if (z) {
            jsonReader.c();
        }
        if (this.f20734a == -1) {
            this.f20734a = arrayList.size() / 4;
        }
        int i = this.f20734a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f20734a * 4; i4++) {
            int i5 = i4 / 4;
            double dFloatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 != 0) {
                if (i6 == 1) {
                    i2 = (int) (dFloatValue * 255.0d);
                } else if (i6 == 2) {
                    i3 = (int) (dFloatValue * 255.0d);
                } else if (i6 == 3) {
                    iArr[i5] = Color.argb(255, i2, i3, (int) (dFloatValue * 255.0d));
                }
            } else if (i5 > 0) {
                float f2 = (float) dFloatValue;
                if (fArr[i5 - 1] >= f2) {
                    fArr[i5] = f2 + 0.01f;
                } else {
                    fArr[i5] = (float) dFloatValue;
                }
            } else {
                fArr[i5] = (float) dFloatValue;
            }
        }
        return b(new f3b(fArr, iArr), arrayList);
    }
}
