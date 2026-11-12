package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<Matrix> f6374a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<RectF> f6375b = new ThreadLocal<>();

    private b() {
    }

    public static void a(CoordinatorLayout coordinatorLayout, View view2, Matrix matrix) {
        Object parent = view2.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            View view3 = (View) parent;
            a(coordinatorLayout, view3, matrix);
            matrix.preTranslate(-view3.getScrollX(), -view3.getScrollY());
        }
        matrix.preTranslate(view2.getLeft(), view2.getTop());
        if (view2.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view2.getMatrix());
    }
}
