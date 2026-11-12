package defpackage;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public class qyq extends pyq {
    @Override // defpackage.hyq, defpackage.ryq
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.lyq, defpackage.ryq
    public void d(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // defpackage.nyq, defpackage.ryq
    public void e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.hyq, defpackage.ryq
    public void f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.pyq, defpackage.ryq
    public void g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.lyq, defpackage.ryq
    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.lyq, defpackage.ryq
    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
