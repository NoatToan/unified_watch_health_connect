package com.github.mikephil.charting.data.filter;

import android.annotation.TargetApi;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class Approximator {

    public class Line {

        /* JADX INFO: renamed from: dx, reason: collision with root package name */
        private float f52819dx;

        /* JADX INFO: renamed from: dy, reason: collision with root package name */
        private float f52820dy;
        private float exsy;
        private float length;
        private float[] points;
        private float sxey;

        public Line(float f14, float f15, float f16, float f17) {
            float f18 = f14 - f16;
            this.f52819dx = f18;
            float f19 = f15 - f17;
            this.f52820dy = f19;
            this.sxey = f14 * f17;
            this.exsy = f16 * f15;
            this.length = (float) Math.sqrt((f19 * f19) + (f18 * f18));
            this.points = new float[]{f14, f15, f16, f17};
        }

        public float distance(float f14, float f15) {
            return Math.abs((((this.f52820dy * f14) - (this.f52819dx * f15)) + this.sxey) - this.exsy) / this.length;
        }

        public float[] getPoints() {
            return this.points;
        }
    }

    public float[] concat(float[]... fArr) {
        int length = 0;
        for (float[] fArr2 : fArr) {
            length += fArr2.length;
        }
        float[] fArr3 = new float[length];
        int i14 = 0;
        for (float[] fArr4 : fArr) {
            for (float f14 : fArr4) {
                fArr3[i14] = f14;
                i14++;
            }
        }
        return fArr3;
    }

    @TargetApi(9)
    public float[] reduceWithDouglasPeucker(float[] fArr, float f14) {
        Line line = new Line(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1]);
        float f15 = 0.0f;
        int i14 = 0;
        for (int i15 = 2; i15 < fArr.length - 2; i15 += 2) {
            float fDistance = line.distance(fArr[i15], fArr[i15 + 1]);
            if (fDistance > f15) {
                i14 = i15;
                f15 = fDistance;
            }
        }
        if (f15 <= f14) {
            return line.getPoints();
        }
        float[] fArrReduceWithDouglasPeucker = reduceWithDouglasPeucker(Arrays.copyOfRange(fArr, 0, i14 + 2), f14);
        float[] fArrReduceWithDouglasPeucker2 = reduceWithDouglasPeucker(Arrays.copyOfRange(fArr, i14, fArr.length), f14);
        return concat(fArrReduceWithDouglasPeucker, Arrays.copyOfRange(fArrReduceWithDouglasPeucker2, 2, fArrReduceWithDouglasPeucker2.length));
    }
}
