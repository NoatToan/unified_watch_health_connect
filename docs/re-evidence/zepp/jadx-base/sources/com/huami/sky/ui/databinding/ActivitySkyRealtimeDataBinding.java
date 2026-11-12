package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sky.ui.R;

/* JADX INFO: loaded from: classes13.dex */
public final class ActivitySkyRealtimeDataBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final LinearLayout layoutSkyRealtime;

    @NonNull
    public final SkyLayoutRealtimeChartNodataBinding relaxChartNoDataLayout;

    @NonNull
    public final AppCompatTextView skyRealtimeIllustrate;

    @NonNull
    public final AppCompatTextView skyRealtimeRelax;

    @NonNull
    public final AppCompatTextView skyRealtimeRelaxTitle;

    @NonNull
    public final AppCompatTextView skyRealtimeTag;

    @NonNull
    public final RecyclerView skyRealtimeTagRecycler;

    @NonNull
    public final AppCompatTextView skyRealtimeTime;

    @NonNull
    public final AppCompatTextView skyRealtimeTips;

    @NonNull
    public final FrameLayout skyRelaxChartLayout;

    @NonNull
    public final RainbowTitleBar titleBar;

    private ActivitySkyRealtimeDataBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull SkyLayoutRealtimeChartNodataBinding skyLayoutRealtimeChartNodataBinding, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull RecyclerView recyclerView, @NonNull AppCompatTextView appCompatTextView5, @NonNull AppCompatTextView appCompatTextView6, @NonNull FrameLayout frameLayout, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = constraintLayout;
        this.layoutSkyRealtime = linearLayout;
        this.relaxChartNoDataLayout = skyLayoutRealtimeChartNodataBinding;
        this.skyRealtimeIllustrate = appCompatTextView;
        this.skyRealtimeRelax = appCompatTextView2;
        this.skyRealtimeRelaxTitle = appCompatTextView3;
        this.skyRealtimeTag = appCompatTextView4;
        this.skyRealtimeTagRecycler = recyclerView;
        this.skyRealtimeTime = appCompatTextView5;
        this.skyRealtimeTips = appCompatTextView6;
        this.skyRelaxChartLayout = frameLayout;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivitySkyRealtimeDataBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.layout_sky_realtime;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.relax_chart_no_data_layout))) != null) {
            SkyLayoutRealtimeChartNodataBinding skyLayoutRealtimeChartNodataBindingBind = SkyLayoutRealtimeChartNodataBinding.bind(viewFindChildViewById);
            i = R.id.sky_realtime_illustrate;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = R.id.sky_realtime_relax;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = R.id.sky_realtime_relax_title;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView3 != null) {
                        i = R.id.sky_realtime_tag;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView4 != null) {
                            i = R.id.sky_realtime_tag_recycler;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = R.id.sky_realtime_time;
                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView5 != null) {
                                    i = R.id.sky_realtime_tips;
                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView6 != null) {
                                        i = R.id.sky_relax_chart_layout;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                        if (frameLayout != null) {
                                            i = R.id.title_bar;
                                            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                            if (rainbowTitleBar != null) {
                                                return new ActivitySkyRealtimeDataBinding((ConstraintLayout) view, linearLayout, skyLayoutRealtimeChartNodataBindingBind, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, recyclerView, appCompatTextView5, appCompatTextView6, frameLayout, rainbowTitleBar);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySkyRealtimeDataBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySkyRealtimeDataBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_sky_realtime_data, viewGroup, false);
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
