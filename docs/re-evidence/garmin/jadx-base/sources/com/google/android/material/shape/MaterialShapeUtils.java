package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes14.dex */
public class MaterialShapeUtils {
    private MaterialShapeUtils() {
    }

    public static CornerTreatment createCornerTreatment(int i14) {
        if (i14 != 0) {
            return i14 != 1 ? createDefaultCornerTreatment() : new CutCornerTreatment();
        }
        return new RoundedCornerTreatment();
    }

    public static CornerTreatment createDefaultCornerTreatment() {
        return new RoundedCornerTreatment();
    }

    public static EdgeTreatment createDefaultEdgeTreatment() {
        return new EdgeTreatment();
    }

    public static void setElevation(View view2, float f14) {
        Drawable background = view2.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).setElevation(f14);
        }
    }

    public static void setParentAbsoluteElevation(View view2) {
        Drawable background = view2.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            setParentAbsoluteElevation(view2, (MaterialShapeDrawable) background);
        }
    }

    public static void setParentAbsoluteElevation(View view2, MaterialShapeDrawable materialShapeDrawable) {
        if (materialShapeDrawable.isElevationOverlayEnabled()) {
            materialShapeDrawable.setParentAbsoluteElevation(ViewUtils.getParentAbsoluteElevation(view2));
        }
    }
}
