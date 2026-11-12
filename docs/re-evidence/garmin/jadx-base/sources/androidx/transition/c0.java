package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class c0 extends b0 {
    @Override // androidx.transition.y
    public final float a(View view2) {
        return view2.getTransitionAlpha();
    }

    @Override // androidx.transition.y
    public final void b(float f14, View view2) {
        view2.setTransitionAlpha(f14);
    }

    @Override // androidx.transition.b0, androidx.transition.y
    public final void c(int i14, View view2) {
        view2.setTransitionVisibility(i14);
    }

    @Override // androidx.transition.z
    public final void d(View view2, Matrix matrix) {
        view2.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.z
    public final void e(View view2, Matrix matrix) {
        view2.transformMatrixToLocal(matrix);
    }

    @Override // androidx.transition.a0
    public final void f(View view2, int i14, int i15, int i16, int i17) {
        view2.setLeftTopRightBottom(i14, i15, i16, i17);
    }
}
