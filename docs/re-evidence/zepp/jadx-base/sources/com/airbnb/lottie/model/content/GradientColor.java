package com.airbnb.lottie.model.content;

import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;

/* JADX INFO: loaded from: classes2.dex */
public class GradientColor {
    private final float[] a;
    private final int[] b;

    public GradientColor(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public int[] getColors() {
        return this.b;
    }

    public float[] getPositions() {
        return this.a;
    }

    public int getSize() {
        return this.b.length;
    }

    public void lerp(GradientColor gradientColor, GradientColor gradientColor2, float f) {
        if (gradientColor.b.length == gradientColor2.b.length) {
            for (int i = 0; i < gradientColor.b.length; i++) {
                this.a[i] = MiscUtils.lerp(gradientColor.a[i], gradientColor2.a[i], f);
                this.b[i] = GammaEvaluator.evaluate(f, gradientColor.b[i], gradientColor2.b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + gradientColor.b.length + " vs " + gradientColor2.b.length + ")");
    }
}
