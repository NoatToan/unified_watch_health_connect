package aurelienribon.tweenengine.paths;

import aurelienribon.tweenengine.TweenPath;

/* JADX INFO: loaded from: classes2.dex */
public class CatmullRom implements TweenPath {
    private float a(float f, float f2, float f3, float f4, float f5) {
        float f6 = 2.0f * f5 * f5;
        float f7 = 3.0f * f5 * f5;
        float f8 = ((f6 * f5) - f7) + 1.0f;
        float f9 = ((-2.0f) * f5 * f5 * f5) + f7;
        float f10 = f5 * f5;
        float f11 = f10 * f5;
        return (f2 * f8) + (f3 * f9) + ((f3 - f) * 0.5f * ((f11 - f6) + f5)) + ((f4 - f2) * 0.5f * (f11 - f10));
    }

    @Override // aurelienribon.tweenengine.TweenPath
    public float compute(float f, float[] fArr, int i) {
        int i2 = i - 1;
        float f2 = i2 * f;
        int i3 = i - 2;
        int iMin = Math.min(Math.max((int) Math.floor(f2), 0), i3);
        float f3 = f2 - iMin;
        if (iMin == 0) {
            return a(fArr[0], fArr[0], fArr[1], fArr[2], f3);
        }
        return iMin == i3 ? a(fArr[i - 3], fArr[i3], fArr[i2], fArr[i2], f3) : a(fArr[iMin - 1], fArr[iMin], fArr[iMin + 1], fArr[iMin + 2], f3);
    }
}
