package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentHrRestingChartBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RelativeLayout btnIntro;

    @NonNull
    public final FrameLayout chartArea;

    @NonNull
    public final FrameLayout chartContainer;

    @NonNull
    public final TextView chartMessage;

    @NonNull
    public final TextView dayFirst;

    @NonNull
    public final TextView dayFirstThird;

    @NonNull
    public final TextView dayLast;

    @NonNull
    public final TextView dayLastThird;

    @NonNull
    public final RelativeLayout dayScale;

    @NonNull
    public final TextView emptyView;

    @NonNull
    public final LinearLayout listContainer;

    @NonNull
    public final TextView titleRhr;

    private FragmentHrRestingChartBinding(@NonNull LinearLayout rootView, @NonNull RelativeLayout btnIntro, @NonNull FrameLayout chartArea, @NonNull FrameLayout chartContainer, @NonNull TextView chartMessage, @NonNull TextView dayFirst, @NonNull TextView dayFirstThird, @NonNull TextView dayLast, @NonNull TextView dayLastThird, @NonNull RelativeLayout dayScale, @NonNull TextView emptyView, @NonNull LinearLayout listContainer, @NonNull TextView titleRhr) {
        this.a = rootView;
        this.btnIntro = btnIntro;
        this.chartArea = chartArea;
        this.chartContainer = chartContainer;
        this.chartMessage = chartMessage;
        this.dayFirst = dayFirst;
        this.dayFirstThird = dayFirstThird;
        this.dayLast = dayLast;
        this.dayLastThird = dayLastThird;
        this.dayScale = dayScale;
        this.emptyView = emptyView;
        this.listContainer = listContainer;
        this.titleRhr = titleRhr;
    }

    @NonNull
    public static FragmentHrRestingChartBinding bind(@NonNull View rootView) {
        int i = R.id.btn_intro;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btn_intro);
        if (relativeLayout != null) {
            i = R.id.chart_area;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.chart_area);
            if (frameLayout != null) {
                i = R.id.chart_container;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.chart_container);
                if (frameLayout2 != null) {
                    i = R.id.chart_message;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.chart_message);
                    if (textView != null) {
                        i = R.id.day_first;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_first);
                        if (textView2 != null) {
                            i = R.id.day_first_third;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_first_third);
                            if (textView3 != null) {
                                i = R.id.day_last;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_last);
                                if (textView4 != null) {
                                    i = R.id.day_last_third;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.day_last_third);
                                    if (textView5 != null) {
                                        i = R.id.day_scale;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_scale);
                                        if (relativeLayout2 != null) {
                                            i = R.id.empty_view;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty_view);
                                            if (textView6 != null) {
                                                i = R.id.list_container;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.list_container);
                                                if (linearLayout != null) {
                                                    i = R.id.title_rhr;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_rhr);
                                                    if (textView7 != null) {
                                                        return new FragmentHrRestingChartBinding((LinearLayout) rootView, relativeLayout, frameLayout, frameLayout2, textView, textView2, textView3, textView4, textView5, relativeLayout2, textView6, linearLayout, textView7);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentHrRestingChartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentHrRestingChartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_hr_resting_chart, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
