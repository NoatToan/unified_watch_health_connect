package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WindowInsets f6584a = m1.f6507b.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f6585b = false;

    private w0() {
    }

    public static WindowInsets a(View view2, WindowInsets windowInsets) {
        Object tag = view2.getTag(R.id.tag_on_apply_window_listener);
        Object tag2 = view2.getTag(R.id.tag_window_insets_animation_callback);
        final View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = tag instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag : tag2 instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag2 : null;
        WindowInsets windowInsets2 = f6584a;
        final WindowInsets[] windowInsetsArr = {windowInsets2};
        view2.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.u0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view3, WindowInsets windowInsets3) {
                WindowInsets windowInsets4 = w0.f6584a;
                View.OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                windowInsetsArr[0] = onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view3, windowInsets3) : view3.onApplyWindowInsets(windowInsets3);
                return w0.f6584a;
            }
        });
        view2.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view2.getTag(R.id.tag_compat_insets_dispatch);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view2.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets3 = windowInsetsArr[0];
        if (windowInsets3 != null && !windowInsets3.isConsumed() && (view2 instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int childCount = viewGroup.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                a(viewGroup.getChildAt(i14), windowInsetsArr[0]);
            }
        }
        WindowInsets windowInsets4 = windowInsetsArr[0];
        return windowInsets4 != null ? windowInsets4 : windowInsets2;
    }
}
