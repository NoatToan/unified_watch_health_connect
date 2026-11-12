package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes14.dex */
public class DescendantOffsetUtils {
    private static final ThreadLocal<Matrix> matrix = new ThreadLocal<>();
    private static final ThreadLocal<RectF> rectF = new ThreadLocal<>();

    public static void getDescendantRect(ViewGroup viewGroup, View view2, Rect rect) {
        rect.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRect(viewGroup, view2, rect);
    }

    private static void offsetDescendantMatrix(ViewParent viewParent, View view2, Matrix matrix2) {
        Object parent = view2.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view3 = (View) parent;
            offsetDescendantMatrix(viewParent, view3, matrix2);
            matrix2.preTranslate(-view3.getScrollX(), -view3.getScrollY());
        }
        matrix2.preTranslate(view2.getLeft(), view2.getTop());
        if (view2.getMatrix().isIdentity()) {
            return;
        }
        matrix2.preConcat(view2.getMatrix());
    }

    public static void offsetDescendantRect(ViewGroup viewGroup, View view2, Rect rect) {
        ThreadLocal<Matrix> threadLocal = matrix;
        Matrix matrix2 = threadLocal.get();
        if (matrix2 == null) {
            matrix2 = new Matrix();
            threadLocal.set(matrix2);
        } else {
            matrix2.reset();
        }
        offsetDescendantMatrix(viewGroup, view2, matrix2);
        ThreadLocal<RectF> threadLocal2 = rectF;
        RectF rectF2 = threadLocal2.get();
        if (rectF2 == null) {
            rectF2 = new RectF();
            threadLocal2.set(rectF2);
        }
        rectF2.set(rect);
        matrix2.mapRect(rectF2);
        rect.set((int) (rectF2.left + 0.5f), (int) (rectF2.top + 0.5f), (int) (rectF2.right + 0.5f), (int) (rectF2.bottom + 0.5f));
    }
}
