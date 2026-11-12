package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes4.dex */
public class rcj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rect f32411a = new Rect();

    public static void a(View view, Rect rect) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            rect.setEmpty();
            return;
        }
        if (parent instanceof qcj) {
            qcj qcjVar = (qcj) parent;
            if (qcjVar.getRemoveClippedSubviews()) {
                Rect rect2 = f32411a;
                qcjVar.getClippingRect(rect2);
                if (!rect2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                    rect.setEmpty();
                    return;
                }
                rect2.offset(-view.getLeft(), -view.getTop());
                rect2.offset(view.getScrollX(), view.getScrollY());
                rect.set(rect2);
                return;
            }
        }
        view.getDrawingRect(rect);
    }
}
