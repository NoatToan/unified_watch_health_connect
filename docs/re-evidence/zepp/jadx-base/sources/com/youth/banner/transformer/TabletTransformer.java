package com.youth.banner.transformer;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes22.dex */
public class TabletTransformer extends ABaseTransformer {
    private static final Matrix a = new Matrix();
    private static final Camera b = new Camera();
    private static final float[] c = new float[2];

    public static final float getOffsetXForRotation(float f, int i, int i2) {
        Matrix matrix = a;
        matrix.reset();
        Camera camera = b;
        camera.save();
        camera.rotateY(Math.abs(f));
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate((-i) * 0.5f, (-i2) * 0.5f);
        float f2 = i;
        float f3 = i2;
        matrix.postTranslate(f2 * 0.5f, 0.5f * f3);
        float[] fArr = c;
        fArr[0] = f2;
        fArr[1] = f3;
        matrix.mapPoints(fArr);
        return (f2 - fArr[0]) * (f > 0.0f ? 1.0f : -1.0f);
    }

    @Override // com.youth.banner.transformer.ABaseTransformer
    public void onTransform(View view, float f) {
        float fAbs = (f < 0.0f ? 30.0f : -30.0f) * Math.abs(f);
        view.setTranslationX(getOffsetXForRotation(fAbs, view.getWidth(), view.getHeight()));
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(0.0f);
        view.setRotationY(fAbs);
    }
}
