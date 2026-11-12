package kotlin;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import o4.l1;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li5/f1;", "Li5/d1;", "<init>", "()V", "Landroid/view/View;", "view", "Lo4/a1;", "matrix", "", "a", "(Landroid/view/View;[F)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f91176a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f91177b = new int[2];

    @Override // kotlin.d1
    public void a(View view2, float[] matrix) {
        Matrix matrix2 = this.f91176a;
        matrix2.reset();
        view2.transformMatrixToGlobal(matrix2);
        ViewParent parent = view2.getParent();
        while (parent instanceof View) {
            view2 = parent;
            parent = view2.getParent();
        }
        int[] iArr = this.f91177b;
        view2.getLocationOnScreen(iArr);
        int i14 = iArr[0];
        int i15 = iArr[1];
        view2.getLocationInWindow(iArr);
        matrix2.postTranslate(iArr[0] - i14, iArr[1] - i15);
        l1.f(matrix, matrix2);
    }
}
