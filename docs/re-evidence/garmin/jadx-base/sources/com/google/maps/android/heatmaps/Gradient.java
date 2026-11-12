package com.google.maps.android.heatmaps;

import android.graphics.Color;
import j20.x;
import java.util.HashMap;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public class Gradient {
    private static final int DEFAULT_COLOR_MAP_SIZE = 1000;
    public final int mColorMapSize;
    public int[] mColors;
    public float[] mStartPoints;

    public Gradient(int[] iArr, float[] fArr, int i14) {
        if (iArr.length != fArr.length) {
            h.s("colors and startPoints should be same length");
            throw null;
        }
        if (iArr.length == 0) {
            h.s("No colors have been defined");
            throw null;
        }
        for (int i15 = 1; i15 < fArr.length; i15++) {
            if (fArr[i15] <= fArr[i15 - 1]) {
                h.s("startPoints should be in increasing order");
                throw null;
            }
        }
        this.mColorMapSize = i14;
        int[] iArr2 = new int[iArr.length];
        this.mColors = iArr2;
        this.mStartPoints = new float[fArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        System.arraycopy(fArr, 0, this.mStartPoints, 0, fArr.length);
    }

    private HashMap<Integer, ColorInterval> generateColorIntervals() {
        HashMap<Integer, ColorInterval> map = new HashMap<>();
        if (this.mStartPoints[0] != 0.0f) {
            map.put(0, new ColorInterval(this, Color.argb(0, Color.red(this.mColors[0]), Color.green(this.mColors[0]), Color.blue(this.mColors[0])), this.mColors[0], this.mColorMapSize * this.mStartPoints[0], 0));
        }
        for (int i14 = 1; i14 < this.mColors.length; i14++) {
            int i15 = i14 - 1;
            Integer numValueOf = Integer.valueOf((int) (this.mColorMapSize * this.mStartPoints[i15]));
            int[] iArr = this.mColors;
            int i16 = iArr[i15];
            int i17 = iArr[i14];
            float f14 = this.mColorMapSize;
            float[] fArr = this.mStartPoints;
            map.put(numValueOf, new ColorInterval(this, i16, i17, (fArr[i14] - fArr[i15]) * f14, 0));
        }
        float[] fArr2 = this.mStartPoints;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer numValueOf2 = Integer.valueOf((int) (this.mColorMapSize * fArr2[length]));
            int i18 = this.mColors[length];
            map.put(numValueOf2, new ColorInterval(this, i18, i18, (1.0f - this.mStartPoints[length]) * this.mColorMapSize, 0));
        }
        return map;
    }

    public static int interpolateColor(int i14, int i15, float f14) {
        int iAlpha = (int) (((Color.alpha(i15) - Color.alpha(i14)) * f14) + Color.alpha(i14));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i14), Color.green(i14), Color.blue(i14), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i15), Color.green(i15), Color.blue(i15), fArr2);
        float f15 = fArr[0];
        float f16 = fArr2[0];
        if (f15 - f16 > 180.0f) {
            fArr2[0] = f16 + 360.0f;
        } else if (f16 - f15 > 180.0f) {
            fArr[0] = f15 + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i16 = 0; i16 < 3; i16++) {
            float f17 = fArr2[i16];
            float f18 = fArr[i16];
            fArr3[i16] = x.a(f17, f18, f14, f18);
        }
        return Color.HSVToColor(iAlpha, fArr3);
    }

    public int[] generateColorMap(double d14) {
        HashMap<Integer, ColorInterval> mapGenerateColorIntervals = generateColorIntervals();
        int[] iArr = new int[this.mColorMapSize];
        ColorInterval colorInterval = mapGenerateColorIntervals.get(0);
        int i14 = 0;
        for (int i15 = 0; i15 < this.mColorMapSize; i15++) {
            if (mapGenerateColorIntervals.containsKey(Integer.valueOf(i15))) {
                colorInterval = mapGenerateColorIntervals.get(Integer.valueOf(i15));
                i14 = i15;
            }
            iArr[i15] = interpolateColor(colorInterval.color1, colorInterval.color2, (i15 - i14) / colorInterval.duration);
        }
        if (d14 != 1.0d) {
            for (int i16 = 0; i16 < this.mColorMapSize; i16++) {
                int i17 = iArr[i16];
                iArr[i16] = Color.argb((int) (((double) Color.alpha(i17)) * d14), Color.red(i17), Color.green(i17), Color.blue(i17));
            }
        }
        return iArr;
    }

    public class ColorInterval {
        private final int color1;
        private final int color2;
        private final float duration;

        private ColorInterval(int i14, int i15, float f14) {
            this.color1 = i14;
            this.color2 = i15;
            this.duration = f14;
        }

        public /* synthetic */ ColorInterval(Gradient gradient, int i14, int i15, float f14, int i16) {
            this(i14, i15, f14);
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }
}
