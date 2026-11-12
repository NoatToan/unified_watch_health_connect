package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.view.pager.HMViewPager;
import com.xiaomi.hm.health.view.pager.TabPageIndicator;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityMainTabBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final TabPageIndicator indicator;

    @NonNull
    public final HMViewPager viewpager;

    private ActivityMainTabBinding(@NonNull View rootView, @NonNull TabPageIndicator indicator, @NonNull HMViewPager viewpager) {
        this.a = rootView;
        this.indicator = indicator;
        this.viewpager = viewpager;
    }

    @NonNull
    public static ActivityMainTabBinding bind(@NonNull View rootView) {
        int i = R.id.indicator;
        TabPageIndicator tabPageIndicator = (TabPageIndicator) ViewBindings.findChildViewById(rootView, R.id.indicator);
        if (tabPageIndicator != null) {
            i = R.id.viewpager;
            HMViewPager hMViewPager = (HMViewPager) ViewBindings.findChildViewById(rootView, R.id.viewpager);
            if (hMViewPager != null) {
                return new ActivityMainTabBinding(rootView, tabPageIndicator, hMViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityMainTabBinding inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        Objects.requireNonNull(parent, "parent");
        inflater.inflate(R.layout.activity_main_tab, parent);
        return bind(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
