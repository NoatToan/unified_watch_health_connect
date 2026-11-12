package aurelienribon.tweenengine.paths;

import aurelienribon.tweenengine.TweenPath;

/* JADX INFO: loaded from: classes2.dex */
public class Linear implements TweenPath {
    @Override // aurelienribon.tweenengine.TweenPath
    public float compute(float f, float[] fArr, int i) {
        float f2 = (i - 1) * f;
        int iMin = Math.min(Math.max((int) Math.floor(f2), 0), i - 2);
        return fArr[iMin] + ((f2 - iMin) * (fArr[iMin + 1] - fArr[iMin]));
    }
}
