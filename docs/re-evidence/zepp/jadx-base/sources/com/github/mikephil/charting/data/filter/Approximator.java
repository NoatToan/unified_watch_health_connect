package com.github.mikephil.charting.data.filter;

import android.annotation.TargetApi;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Approximator {

    public class a {
        private float[] a;
        private float b;
        private float c;
        private float d;
        private float e;
        private float f;

        public a(float f, float f2, float f3, float f4) {
            float f5 = f - f3;
            this.d = f5;
            float f6 = f2 - f4;
            this.e = f6;
            this.b = f * f4;
            this.c = f3 * f2;
            this.f = (float) Math.sqrt((f5 * f5) + (f6 * f6));
            this.a = new float[]{f, f2, f3, f4};
        }

        public float a(float f, float f2) {
            return Math.abs((((this.e * f) - (this.d * f2)) + this.b) - this.c) / this.f;
        }

        public float[] b() {
            return this.a;
        }
    }

    public float[] a(float[]... fArr) {
        int length = 0;
        for (float[] fArr2 : fArr) {
            length += fArr2.length;
        }
        float[] fArr3 = new float[length];
        int i = 0;
        for (float[] fArr4 : fArr) {
            for (float f : fArr4) {
                fArr3[i] = f;
                i++;
            }
        }
        return fArr3;
    }

    @TargetApi(9)
    public float[] reduceWithDouglasPeucker(float[] fArr, float f) {
        a aVar = new a(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1]);
        float f2 = 0.0f;
        int i = 0;
        for (int i2 = 2; i2 < fArr.length - 2; i2 += 2) {
            float fA = aVar.a(fArr[i2], fArr[i2 + 1]);
            if (fA > f2) {
                i = i2;
                f2 = fA;
            }
        }
        if (f2 <= f) {
            return aVar.b();
        }
        float[] fArrReduceWithDouglasPeucker = reduceWithDouglasPeucker(Arrays.copyOfRange(fArr, 0, i + 2), f);
        float[] fArrReduceWithDouglasPeucker2 = reduceWithDouglasPeucker(Arrays.copyOfRange(fArr, i, fArr.length), f);
        return a(fArrReduceWithDouglasPeucker, Arrays.copyOfRange(fArrReduceWithDouglasPeucker2, 2, fArrReduceWithDouglasPeucker2.length));
    }
}
