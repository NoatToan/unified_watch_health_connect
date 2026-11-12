package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityMiband3InstuctionBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final LinearLayout indicatorContainer;

    @NonNull
    public final ImageView indicatorImg;

    @NonNull
    public final ImageView lastIndicatorImg;

    @NonNull
    public final ViewPager viewPager;

    private ActivityMiband3InstuctionBinding(@NonNull FrameLayout rootView, @NonNull LinearLayout indicatorContainer, @NonNull ImageView indicatorImg, @NonNull ImageView lastIndicatorImg, @NonNull ViewPager viewPager) {
        this.a = rootView;
        this.indicatorContainer = indicatorContainer;
        this.indicatorImg = indicatorImg;
        this.lastIndicatorImg = lastIndicatorImg;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityMiband3InstuctionBinding bind(@NonNull View rootView) {
        int i = R.id.indicator_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.indicator_container);
        if (linearLayout != null) {
            i = R.id.indicator_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.indicator_img);
            if (imageView != null) {
                i = R.id.last_indicator_img;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.last_indicator_img);
                if (imageView2 != null) {
                    i = R.id.view_pager;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
                    if (viewPager != null) {
                        return new ActivityMiband3InstuctionBinding((FrameLayout) rootView, linearLayout, imageView, imageView2, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityMiband3InstuctionBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityMiband3InstuctionBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_miband3_instuction, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
