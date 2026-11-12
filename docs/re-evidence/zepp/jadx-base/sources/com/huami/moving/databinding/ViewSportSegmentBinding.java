package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.huami.moving.R;
import com.huami.moving.ui.view.NestViewPager;

/* JADX INFO: loaded from: classes11.dex */
public final class ViewSportSegmentBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final ImageView editSegment;

    @NonNull
    public final TabLayout tabLayout;

    @NonNull
    public final NestViewPager viewPager;

    private ViewSportSegmentBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TabLayout tabLayout, @NonNull NestViewPager nestViewPager) {
        this.a = frameLayout;
        this.editSegment = imageView;
        this.tabLayout = tabLayout;
        this.viewPager = nestViewPager;
    }

    @NonNull
    public static ViewSportSegmentBinding bind(@NonNull View view) {
        int i = R.id.edit_segment;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tab_layout;
            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
            if (tabLayout != null) {
                i = R.id.view_pager;
                NestViewPager nestViewPager = (NestViewPager) ViewBindings.findChildViewById(view, i);
                if (nestViewPager != null) {
                    return new ViewSportSegmentBinding((FrameLayout) view, imageView, tabLayout, nestViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewSportSegmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewSportSegmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_sport_segment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
