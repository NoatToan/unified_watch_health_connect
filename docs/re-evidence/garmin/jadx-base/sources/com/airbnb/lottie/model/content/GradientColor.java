package com.airbnb.lottie.model.content;

import am.j;
import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import java.util.Arrays;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class GradientColor {
    private final int[] colors;
    private final float[] positions;

    public GradientColor(float[] fArr, int[] iArr) {
        this.positions = fArr;
        this.colors = iArr;
    }

    private void copyFrom(GradientColor gradientColor) {
        int i14 = 0;
        while (true) {
            int[] iArr = gradientColor.colors;
            if (i14 >= iArr.length) {
                return;
            }
            this.positions[i14] = gradientColor.positions[i14];
            this.colors[i14] = iArr[i14];
            i14++;
        }
    }

    private int getColorForPosition(float f14) {
        int iBinarySearch = Arrays.binarySearch(this.positions, f14);
        if (iBinarySearch >= 0) {
            return this.colors[iBinarySearch];
        }
        int i14 = -(iBinarySearch + 1);
        int[] iArr = this.colors;
        if (i14 == 0) {
            return iArr[0];
        }
        if (i14 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.positions;
        int i15 = i14 - 1;
        float f15 = fArr[i15];
        return GammaEvaluator.evaluate((f14 - f15) / (fArr[i14] - f15), iArr[i15], iArr[i14]);
    }

    public GradientColor copyWithPositions(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i14 = 0; i14 < fArr.length; i14++) {
            iArr[i14] = getColorForPosition(fArr[i14]);
        }
        return new GradientColor(fArr, iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GradientColor gradientColor = (GradientColor) obj;
            if (Arrays.equals(this.positions, gradientColor.positions) && Arrays.equals(this.colors, gradientColor.colors)) {
                return true;
            }
        }
        return false;
    }

    public int[] getColors() {
        return this.colors;
    }

    public float[] getPositions() {
        return this.positions;
    }

    public int getSize() {
        return this.colors.length;
    }

    public int hashCode() {
        return Arrays.hashCode(this.colors) + (Arrays.hashCode(this.positions) * 31);
    }

    public void lerp(GradientColor gradientColor, GradientColor gradientColor2, float f14) {
        int[] iArr;
        if (gradientColor.equals(gradientColor2)) {
            copyFrom(gradientColor);
            return;
        }
        if (f14 <= 0.0f) {
            copyFrom(gradientColor);
            return;
        }
        if (f14 >= 1.0f) {
            copyFrom(gradientColor2);
            return;
        }
        if (gradientColor.colors.length != gradientColor2.colors.length) {
            StringBuilder sb3 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb3.append(gradientColor.colors.length);
            sb3.append(" vs ");
            h.s(j.q(sb3, gradientColor2.colors.length, ")"));
            return;
        }
        int i14 = 0;
        while (true) {
            iArr = gradientColor.colors;
            if (i14 >= iArr.length) {
                break;
            }
            this.positions[i14] = MiscUtils.lerp(gradientColor.positions[i14], gradientColor2.positions[i14], f14);
            this.colors[i14] = GammaEvaluator.evaluate(f14, gradientColor.colors[i14], gradientColor2.colors[i14]);
            i14++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.positions;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = gradientColor.colors;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.colors;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }
}
