package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.scroll.HMScrollView;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseui.NewViewPager;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityToolSportBinding implements ViewBinding {

    @NonNull
    private final HMScrollView a;

    @NonNull
    public final HMScrollView container;

    @NonNull
    public final NewViewPager viewPager;

    private ActivityToolSportBinding(@NonNull HMScrollView rootView, @NonNull HMScrollView container, @NonNull NewViewPager viewPager) {
        this.a = rootView;
        this.container = container;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityToolSportBinding bind(@NonNull View rootView) {
        HMScrollView hMScrollView = (HMScrollView) rootView;
        NewViewPager newViewPager = (NewViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
        if (newViewPager != null) {
            return new ActivityToolSportBinding(hMScrollView, hMScrollView, newViewPager);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.view_pager)));
    }

    @NonNull
    public static ActivityToolSportBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityToolSportBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_tool_sport, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public HMScrollView getRoot() {
        return this.a;
    }
}
