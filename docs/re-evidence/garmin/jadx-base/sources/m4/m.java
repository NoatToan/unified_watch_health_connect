package m4;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f116498a = new int[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rect f116499b = new Rect();

    public static final n4.d a(View view2, View view3) {
        int[] iArr = f116498a;
        view2.getLocationInWindow(iArr);
        int i14 = iArr[0];
        int i15 = iArr[1];
        view3.getLocationInWindow(iArr);
        int i16 = iArr[0];
        float f14 = i15 - iArr[1];
        Rect rect = f116499b;
        view2.getFocusedRect(rect);
        float f15 = (i14 - i16) + rect.left;
        return new n4.d(f15, rect.top + f14, rect.width() + f15, f14 + rect.top + rect.height());
    }

    public static final boolean b(View view2, Integer num, Rect rect) {
        if (num == null) {
            return view2.requestFocus();
        }
        if (!(view2 instanceof ViewGroup)) {
            return view2.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view2 instanceof kotlin.m) {
            return ((kotlin.m) view2).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view2.requestFocus(num.intValue());
    }

    public static final Integer c(int i14) {
        g.a aVar = g.f116466b;
        aVar.getClass();
        if (i14 == g.f116471g) {
            return 33;
        }
        aVar.getClass();
        if (i14 == g.f116472h) {
            return 130;
        }
        aVar.getClass();
        if (i14 == g.f116469e) {
            return 17;
        }
        aVar.getClass();
        if (i14 == g.f116470f) {
            return 66;
        }
        aVar.getClass();
        if (i14 == g.f116467c) {
            return 2;
        }
        aVar.getClass();
        return i14 == g.f116468d ? 1 : null;
    }

    public static final g d(int i14) {
        if (i14 == 1) {
            g.f116466b.getClass();
            return g.a(g.f116468d);
        }
        if (i14 == 2) {
            g.f116466b.getClass();
            return g.a(g.f116467c);
        }
        if (i14 == 17) {
            g.f116466b.getClass();
            return g.a(g.f116469e);
        }
        if (i14 == 33) {
            g.f116466b.getClass();
            return g.a(g.f116471g);
        }
        if (i14 == 66) {
            g.f116466b.getClass();
            return g.a(g.f116470f);
        }
        if (i14 != 130) {
            return null;
        }
        g.f116466b.getClass();
        return g.a(g.f116472h);
    }
}
