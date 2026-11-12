package com.huami.heartrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.heartrate.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes9.dex */
public final class HeartRateFragmentHrRestingChartBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FrameLayout chartContainer;

    @NonNull
    public final ConstraintLayout layoutChartData;

    @NonNull
    public final LinearLayout learnMore;

    @NonNull
    public final LinearLayout listContainer;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    public final TypefaceTextView textHeartRate;

    @NonNull
    public final TypefaceTextView textTime;

    @NonNull
    public final TypefaceTextView textUnit;

    @NonNull
    public final TextView titleRhr;

    private HeartRateFragmentHrRestingChartBinding(@NonNull LinearLayout rootView, @NonNull FrameLayout chartContainer, @NonNull ConstraintLayout layoutChartData, @NonNull LinearLayout learnMore, @NonNull LinearLayout listContainer, @NonNull RecyclerView recyclerView, @NonNull TypefaceTextView textHeartRate, @NonNull TypefaceTextView textTime, @NonNull TypefaceTextView textUnit, @NonNull TextView titleRhr) {
        this.a = rootView;
        this.chartContainer = chartContainer;
        this.layoutChartData = layoutChartData;
        this.learnMore = learnMore;
        this.listContainer = listContainer;
        this.recyclerView = recyclerView;
        this.textHeartRate = textHeartRate;
        this.textTime = textTime;
        this.textUnit = textUnit;
        this.titleRhr = titleRhr;
    }

    @NonNull
    public static HeartRateFragmentHrRestingChartBinding bind(@NonNull View rootView) {
        int i = R.id.chart_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
        if (frameLayout != null) {
            i = R.id.layout_chart_data;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
            if (constraintLayout != null) {
                i = R.id.learn_more;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = R.id.list_container;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                    if (linearLayout2 != null) {
                        i = R.id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                        if (recyclerView != null) {
                            i = R.id.text_heart_rate;
                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                            if (typefaceTextView != null) {
                                i = R.id.text_time;
                                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                if (typefaceTextView2 != null) {
                                    i = R.id.text_unit;
                                    TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                    if (typefaceTextView3 != null) {
                                        i = R.id.title_rhr;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                                        if (textView != null) {
                                            return new HeartRateFragmentHrRestingChartBinding((LinearLayout) rootView, frameLayout, constraintLayout, linearLayout, linearLayout2, recyclerView, typefaceTextView, typefaceTextView2, typefaceTextView3, textView);
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
    public static HeartRateFragmentHrRestingChartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeartRateFragmentHrRestingChartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heart_rate_fragment_hr_resting_chart, parent, false);
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
