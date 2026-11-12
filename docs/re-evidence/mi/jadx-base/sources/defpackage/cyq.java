package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes4.dex */
public class cyq {
    public static Rect a(View view, View view2) {
        if (view2 == null || view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("getLocationInView parent is null?");
            sb.append(view == null);
            sb.append(" child is null?");
            sb.append(view2 == null);
            hpe.a(sb.toString());
            return null;
        }
        Context context = view2.getContext();
        View decorView = context instanceof Activity ? ((Activity) context).getWindow().getDecorView() : null;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        if (view2 == view) {
            view2.getHitRect(rect);
            return rect;
        }
        View view3 = view2;
        while (view3 != decorView && view3 != view) {
            hpe.a("tmp class:" + view3.getClass().getSimpleName());
            view3.getHitRect(rect2);
            hpe.a("tmp hit Rect:" + rect2);
            if (!view3.getClass().equals("NoSaveStateFrameLayout")) {
                rect.left += rect2.left;
                rect.top += rect2.top;
            }
            view3 = (View) view3.getParent();
            if (view3 == null) {
                throw new IllegalArgumentException("the view is not showing in the window!");
            }
            if (view3.getParent() instanceof ScrollView) {
                int scrollY = ((ScrollView) view3.getParent()).getScrollY();
                hpe.a("scrollY:" + scrollY);
                rect.top = rect.top - scrollY;
            }
            if (view3.getParent() instanceof HorizontalScrollView) {
                int scrollX = ((HorizontalScrollView) view3.getParent()).getScrollX();
                hpe.a("scrollX:" + scrollX);
                rect.left = rect.left - scrollX;
            }
            if (view3.getParent() != null && (view3.getParent() instanceof ViewPager2)) {
                view3 = (View) view3.getParent();
            }
        }
        rect.right = rect.left + view2.getMeasuredWidth();
        rect.bottom = rect.top + view2.getMeasuredHeight();
        return rect;
    }
}
