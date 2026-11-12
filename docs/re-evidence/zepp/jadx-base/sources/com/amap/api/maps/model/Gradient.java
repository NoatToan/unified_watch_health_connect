package com.amap.api.maps.model;

import android.graphics.Color;
import android.util.Log;
import com.amap.api.maps.AMapException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class Gradient {
    private static final int DEFAULT_COLOR_MAP_SIZE = 1000;
    private boolean isAvailable;
    private int mColorMapSize;
    private int[] mColors;
    private float[] mStartPoints;

    public static class a {
        private final int a;
        private final int b;
        private final float c;

        public /* synthetic */ a(int i, int i2, float f, byte b) {
            this(i, i2, f);
        }

        private a(int i, int i2, float f) {
            this.a = i;
            this.b = i2;
            this.c = f;
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, (byte) 0);
    }

    private static int a(int i, int i2, float f) {
        int iAlpha = (int) (((Color.alpha(i2) - Color.alpha(i)) * f) + Color.alpha(i));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i2), Color.green(i2), Color.blue(i2), fArr2);
        if (fArr[0] - fArr2[0] > 180.0f) {
            fArr2[0] = fArr2[0] + 360.0f;
        } else if (fArr2[0] - fArr[0] > 180.0f) {
            fArr[0] = fArr[0] + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i3 = 0; i3 < 3; i3++) {
            fArr3[i3] = ((fArr2[i3] - fArr[i3]) * f) + fArr[i3];
        }
        return Color.HSVToColor(iAlpha, fArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] generateColorMap(double d) {
        HashMap map = new HashMap(32);
        if (this.mStartPoints[0] != 0.0f) {
            map.put(0, new a(Color.argb(0, Color.red(this.mColors[0]), Color.green(this.mColors[0]), Color.blue(this.mColors[0])), this.mColors[0], this.mColorMapSize * this.mStartPoints[0], null == true ? 1 : 0));
        }
        for (int i = 1; i < this.mColors.length; i++) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf((int) (this.mColorMapSize * this.mStartPoints[i2]));
            int[] iArr = this.mColors;
            int i3 = iArr[i2];
            int i4 = iArr[i];
            float f = this.mColorMapSize;
            float[] fArr = this.mStartPoints;
            map.put(numValueOf, new a(i3, i4, f * (fArr[i] - fArr[i2]), null == true ? 1 : 0));
        }
        float[] fArr2 = this.mStartPoints;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer numValueOf2 = Integer.valueOf((int) (this.mColorMapSize * fArr2[length]));
            int[] iArr2 = this.mColors;
            map.put(numValueOf2, new a(iArr2[length], iArr2[length], this.mColorMapSize * (1.0f - this.mStartPoints[length]), null == true ? 1 : 0));
        }
        int[] iArr3 = new int[this.mColorMapSize];
        a aVar = (a) map.get(0);
        int i5 = 0;
        for (int i6 = 0; i6 < this.mColorMapSize; i6++) {
            if (map.containsKey(Integer.valueOf(i6))) {
                aVar = (a) map.get(Integer.valueOf(i6));
                i5 = i6;
            }
            iArr3[i6] = a(aVar.a, aVar.b, (i6 - i5) / aVar.c);
        }
        if (d != 1.0d) {
            for (int i7 = 0; i7 < this.mColorMapSize; i7++) {
                int i8 = iArr3[i7];
                iArr3[i7] = Color.argb((int) (((double) Color.alpha(i8)) * d), Color.red(i8), Color.green(i8), Color.blue(i8));
            }
        }
        return iArr3;
    }

    public int[] getColors() {
        return this.mColors;
    }

    public float[] getStartPoints() {
        return this.mStartPoints;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    private Gradient(int[] iArr, float[] fArr, byte b) {
        this.isAvailable = true;
        try {
            if (iArr == null || fArr == null) {
                throw new AMapException("colors and startPoints should not be null");
            }
            if (iArr.length != fArr.length) {
                throw new AMapException("colors and startPoints should be same length");
            }
            if (iArr.length == 0) {
                throw new AMapException("No colors have been defined");
            }
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] < fArr[i - 1]) {
                    throw new AMapException("startPoints should be in increasing order");
                }
            }
            this.mColorMapSize = 1000;
            int[] iArr2 = new int[iArr.length];
            this.mColors = iArr2;
            this.mStartPoints = new float[fArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            System.arraycopy(fArr, 0, this.mStartPoints, 0, fArr.length);
            this.isAvailable = true;
        } catch (AMapException e) {
            this.isAvailable = false;
            Log.e("amap", e.getErrorMessage());
            e.printStackTrace();
        }
    }
}
