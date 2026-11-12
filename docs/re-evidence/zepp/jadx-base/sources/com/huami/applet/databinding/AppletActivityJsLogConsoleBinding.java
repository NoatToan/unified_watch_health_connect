package com.huami.applet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.huami.applet.R;

/* JADX INFO: loaded from: classes5.dex */
public final class AppletActivityJsLogConsoleBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TabLayout appletLogTabLayout;

    @NonNull
    public final ViewPager2 appletLogViewpager;

    private AppletActivityJsLogConsoleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2) {
        this.a = constraintLayout;
        this.appletLogTabLayout = tabLayout;
        this.appletLogViewpager = viewPager2;
    }

    @NonNull
    public static AppletActivityJsLogConsoleBinding bind(@NonNull View view) {
        int i = R.id.applet_log_tabLayout;
        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
        if (tabLayout != null) {
            i = R.id.applet_log_viewpager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                return new AppletActivityJsLogConsoleBinding((ConstraintLayout) view, tabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static AppletActivityJsLogConsoleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static AppletActivityJsLogConsoleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.applet_activity_js_log_console, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
