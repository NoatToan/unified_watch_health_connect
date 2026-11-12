package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes6.dex */
public class y8l {
    public static aak a(ViewGroup viewGroup, View view) {
        if (view.getParent() == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        try {
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            return new aak(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static f08 b(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        return new f08(rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), Math.min(rootWindowInsets.getSystemWindowInsetBottom(), rootWindowInsets.getStableInsetBottom()), rootWindowInsets.getSystemWindowInsetLeft());
    }

    public static f08 c(View view) {
        View rootView;
        f08 f08VarB;
        if (view.getHeight() == 0 || (f08VarB = b((rootView = view.getRootView()))) == null) {
            return null;
        }
        float width = rootView.getWidth();
        float height = rootView.getHeight();
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        f08VarB.f17254a = Math.max(f08VarB.f17254a - rect.top, 0.0f);
        f08VarB.d = Math.max(f08VarB.d - rect.left, 0.0f);
        f08VarB.c = Math.max(Math.min((rect.top + view.getHeight()) - height, 0.0f) + f08VarB.c, 0.0f);
        f08VarB.f17255b = Math.max(Math.min((rect.left + view.getWidth()) - width, 0.0f) + f08VarB.f17255b, 0.0f);
        return f08VarB;
    }
}
