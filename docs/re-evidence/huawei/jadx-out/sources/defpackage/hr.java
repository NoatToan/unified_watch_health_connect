package defpackage;

import android.graphics.Color;
import com.airbnb.lottie.parser.ValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class hr implements ValueParser<gl> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37073c;

    public hr(int i) {
        this.f37073c = i;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public gl parse(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f37073c = 2;
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.f37073c == -1) {
            this.f37073c = arrayList.size() / 4;
        }
        int i = this.f37073c;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f37073c * 4; i4++) {
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
        return b(new gl(fArr, iArr), arrayList);
    }

    private gl b(gl glVar, List<Float> list) {
        int i = this.f37073c * 4;
        if (list.size() <= i) {
            return glVar;
        }
        float[] fArrD = glVar.d();
        int[] iArrB = glVar.b();
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
        float[] fArrB = b(glVar.d(), fArr);
        int length = fArrB.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = fArrB[i3];
            int iBinarySearch = Arrays.binarySearch(fArrD, f);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i3] = a(f, fArr2[iBinarySearch2], fArrD, iArrB);
            } else {
                iArr[i3] = a(f, iArrB[iBinarySearch], fArr, fArr2);
            }
        }
        return new gl(fArrB, iArr);
    }

    int a(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f == fArr[0]) {
            return iArr[0];
        }
        for (int i = 1; i < fArr.length; i++) {
            float f3 = fArr[i];
            if (f3 >= f || i == fArr.length - 1) {
                if (i == fArr.length - 1 && f >= f3) {
                    return Color.argb((int) (f2 * 255.0f), Color.red(iArr[i]), Color.green(iArr[i]), Color.blue(iArr[i]));
                }
                int i2 = i - 1;
                float f4 = fArr[i2];
                int iB = ix.b((f - f4) / (f3 - f4), iArr[i2], iArr[i]);
                return Color.argb((int) (f2 * 255.0f), Color.red(iB), Color.green(iB), Color.blue(iB));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    private int a(float f, int i, float[] fArr, float[] fArr2) {
        float fA;
        if (fArr2.length < 2 || f <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 >= f || i2 == fArr.length - 1) {
                if (f2 <= f) {
                    fA = fArr2[i2];
                } else {
                    int i3 = i2 - 1;
                    float f3 = fArr[i3];
                    fA = jc.a(fArr2[i3], fArr2[i2], (f - f3) / (f2 - f3));
                }
                return Color.argb((int) (fA * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    protected static float[] b(float[] fArr, float[] fArr2) {
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
}
