package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.huami.sleep.R;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentBreathQualityOdDayBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FrameLayout chartContentFL;

    @NonNull
    public final TextView chartTitleDesc;

    @NonNull
    public final TextView chartTitleTv;

    @NonNull
    public final TextView emptyTv;

    @NonNull
    public final FlexboxLayout legendLL;

    @NonNull
    public final LinearLayout tipLayout;

    @NonNull
    public final TextView tipTv;

    private FragmentBreathQualityOdDayBinding(@NonNull ConstraintLayout rootView, @NonNull FrameLayout chartContentFL, @NonNull TextView chartTitleDesc, @NonNull TextView chartTitleTv, @NonNull TextView emptyTv, @NonNull FlexboxLayout legendLL, @NonNull LinearLayout tipLayout, @NonNull TextView tipTv) {
        this.a = rootView;
        this.chartContentFL = chartContentFL;
        this.chartTitleDesc = chartTitleDesc;
        this.chartTitleTv = chartTitleTv;
        this.emptyTv = emptyTv;
        this.legendLL = legendLL;
        this.tipLayout = tipLayout;
        this.tipTv = tipTv;
    }

    @NonNull
    public static FragmentBreathQualityOdDayBinding bind(@NonNull View rootView) {
        int i = R.id.chartContentFL;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
        if (frameLayout != null) {
            i = R.id.chartTitleDesc;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.chartTitleTv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = R.id.emptyTv;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        i = R.id.legendLL;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(rootView, i);
                        if (flexboxLayout != null) {
                            i = R.id.tipLayout;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                            if (linearLayout != null) {
                                i = R.id.tipTv;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView4 != null) {
                                    return new FragmentBreathQualityOdDayBinding((ConstraintLayout) rootView, frameLayout, textView, textView2, textView3, flexboxLayout, linearLayout, textView4);
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
    public static FragmentBreathQualityOdDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentBreathQualityOdDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_breath_quality_od_day, parent, false);
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
