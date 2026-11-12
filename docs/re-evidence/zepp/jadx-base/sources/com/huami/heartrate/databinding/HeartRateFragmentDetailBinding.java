package com.huami.heartrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.huami.heartrate.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes9.dex */
public final class HeartRateFragmentDetailBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FrameLayout chartContainer;

    @NonNull
    public final FrameLayout chartContainerLayout;

    @NonNull
    public final TextView labelAtrial;

    @NonNull
    public final ConstraintLayout layoutChartData;

    @NonNull
    public final FlexboxLayout llColorDesc;

    @NonNull
    public final FragmentContainerView subHrFragmentContainer;

    @NonNull
    public final TypefaceTextView textHeartRate;

    @NonNull
    public final TypefaceTextView textTime;

    @NonNull
    public final TypefaceTextView textUnit;

    private HeartRateFragmentDetailBinding(@NonNull ConstraintLayout rootView, @NonNull FrameLayout chartContainer, @NonNull FrameLayout chartContainerLayout, @NonNull TextView labelAtrial, @NonNull ConstraintLayout layoutChartData, @NonNull FlexboxLayout llColorDesc, @NonNull FragmentContainerView subHrFragmentContainer, @NonNull TypefaceTextView textHeartRate, @NonNull TypefaceTextView textTime, @NonNull TypefaceTextView textUnit) {
        this.a = rootView;
        this.chartContainer = chartContainer;
        this.chartContainerLayout = chartContainerLayout;
        this.labelAtrial = labelAtrial;
        this.layoutChartData = layoutChartData;
        this.llColorDesc = llColorDesc;
        this.subHrFragmentContainer = subHrFragmentContainer;
        this.textHeartRate = textHeartRate;
        this.textTime = textTime;
        this.textUnit = textUnit;
    }

    @NonNull
    public static HeartRateFragmentDetailBinding bind(@NonNull View rootView) {
        int i = R.id.chart_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
        if (frameLayout != null) {
            i = R.id.chart_container_layout;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
            if (frameLayout2 != null) {
                i = R.id.label_atrial;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    i = R.id.layout_chart_data;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                    if (constraintLayout != null) {
                        i = R.id.llColorDesc;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(rootView, i);
                        if (flexboxLayout != null) {
                            i = R.id.subHrFragmentContainer;
                            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(rootView, i);
                            if (fragmentContainerView != null) {
                                i = R.id.text_heart_rate;
                                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                if (typefaceTextView != null) {
                                    i = R.id.text_time;
                                    TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                    if (typefaceTextView2 != null) {
                                        i = R.id.text_unit;
                                        TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                        if (typefaceTextView3 != null) {
                                            return new HeartRateFragmentDetailBinding((ConstraintLayout) rootView, frameLayout, frameLayout2, textView, constraintLayout, flexboxLayout, fragmentContainerView, typefaceTextView, typefaceTextView2, typefaceTextView3);
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
    public static HeartRateFragmentDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeartRateFragmentDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heart_rate_fragment_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
