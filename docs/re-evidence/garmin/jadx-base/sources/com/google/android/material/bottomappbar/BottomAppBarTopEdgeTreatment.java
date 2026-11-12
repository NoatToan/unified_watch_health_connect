package com.google.android.material.bottomappbar;

import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;
import j20.x;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize = -1.0f;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f14, float f15, float f16) {
        this.fabMargin = f14;
        this.roundedCornerRadius = f15;
        setCradleVerticalOffset(f16);
        this.horizontalOffset = 0.0f;
    }

    public float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f14, float f15, float f16, ShapePath shapePath) {
        float f17;
        float f18;
        float f19 = this.fabDiameter;
        if (f19 == 0.0f) {
            shapePath.lineTo(f14, 0.0f);
            return;
        }
        float f22 = ((this.fabMargin * 2.0f) + f19) / 2.0f;
        float f24 = f16 * this.roundedCornerRadius;
        float f25 = f15 + this.horizontalOffset;
        float fA = x.a(1.0f, f16, f22, this.cradleVerticalOffset * f16);
        if (fA / f22 >= 1.0f) {
            shapePath.lineTo(f14, 0.0f);
            return;
        }
        float f26 = this.fabCornerSize;
        float f27 = f26 * f16;
        boolean z14 = f26 == -1.0f || Math.abs((f26 * 2.0f) - f19) < 0.1f;
        if (z14) {
            f17 = fA;
            f18 = 0.0f;
        } else {
            f18 = ROUNDED_CORNER_FAB_OFFSET;
            f17 = 0.0f;
        }
        float f28 = f22 + f24;
        float f29 = f17 + f24;
        float fSqrt = (float) Math.sqrt((f28 * f28) - (f29 * f29));
        float f34 = f25 - fSqrt;
        float f35 = f25 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f29));
        float f36 = (90.0f - degrees) + f18;
        shapePath.lineTo(f34, 0.0f);
        float f37 = f34 - f24;
        float f38 = f34 + f24;
        float f39 = f24 * 2.0f;
        shapePath.addArc(f37, 0.0f, f38, f39, 270.0f, degrees);
        if (z14) {
            shapePath.addArc(f25 - f22, (-f22) - f17, f25 + f22, f22 - f17, 180.0f - f36, (f36 * 2.0f) - 180.0f);
        } else {
            float f44 = this.fabMargin;
            float f45 = f27 * 2.0f;
            float f46 = f44 + f45;
            float f47 = f25 - f22;
            shapePath.addArc(f47, -(f27 + f44), f46 + f47, f44 + f27, 180.0f - f36, ((f36 * 2.0f) - 180.0f) / 2.0f);
            float f48 = f25 + f22;
            float f49 = this.fabMargin;
            shapePath.lineTo(f48 - ((f49 / 2.0f) + f27), f49 + f27);
            float f50 = this.fabMargin;
            shapePath.addArc(f48 - (f45 + f50), -(f27 + f50), f48, f50 + f27, 90.0f, f36 - 90.0f);
        }
        shapePath.addArc(f35 - f24, 0.0f, f35 + f24, f39, 270.0f - degrees, degrees);
        shapePath.lineTo(f14, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.fabCornerSize;
    }

    public float getFabCradleMargin() {
        return this.fabMargin;
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    public float getFabDiameter() {
        return this.fabDiameter;
    }

    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    public void setCradleVerticalOffset(float f14) {
        if (f14 >= 0.0f) {
            this.cradleVerticalOffset = f14;
        } else {
            h.s("cradleVerticalOffset must be positive.");
        }
    }

    public void setFabCornerSize(float f14) {
        this.fabCornerSize = f14;
    }

    public void setFabCradleMargin(float f14) {
        this.fabMargin = f14;
    }

    public void setFabCradleRoundedCornerRadius(float f14) {
        this.roundedCornerRadius = f14;
    }

    public void setFabDiameter(float f14) {
        this.fabDiameter = f14;
    }

    public void setHorizontalOffset(float f14) {
        this.horizontalOffset = f14;
    }
}
