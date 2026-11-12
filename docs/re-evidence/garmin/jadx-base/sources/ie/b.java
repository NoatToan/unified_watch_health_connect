package ie;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ViewGroup.MarginLayoutParams f93067b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayoutManager f93068a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f93067b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public b(LinearLayoutManager linearLayoutManager) {
        this.f93068a = linearLayoutManager;
    }

    public static boolean a(View view2) {
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                if (a(viewGroup.getChildAt(i14))) {
                    return true;
                }
            }
        }
        return false;
    }
}
