package com.huami.heartrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.heartrate.R;

/* JADX INFO: loaded from: classes9.dex */
public final class HeartRateStatisticsViewBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView averageHr;

    @NonNull
    public final TextView averageHrLabel;

    @NonNull
    public final TextView averageHrUnit;

    @NonNull
    public final TextView maxHr;

    @NonNull
    public final TextView maxHrLabel;

    @NonNull
    public final TextView maxHrUnit;

    @NonNull
    public final TextView minHr;

    @NonNull
    public final TextView minHrLabel;

    @NonNull
    public final TextView minHrUnit;

    @NonNull
    public final TextView title;

    private HeartRateStatisticsViewBinding(@NonNull ConstraintLayout rootView, @NonNull TextView averageHr, @NonNull TextView averageHrLabel, @NonNull TextView averageHrUnit, @NonNull TextView maxHr, @NonNull TextView maxHrLabel, @NonNull TextView maxHrUnit, @NonNull TextView minHr, @NonNull TextView minHrLabel, @NonNull TextView minHrUnit, @NonNull TextView title) {
        this.a = rootView;
        this.averageHr = averageHr;
        this.averageHrLabel = averageHrLabel;
        this.averageHrUnit = averageHrUnit;
        this.maxHr = maxHr;
        this.maxHrLabel = maxHrLabel;
        this.maxHrUnit = maxHrUnit;
        this.minHr = minHr;
        this.minHrLabel = minHrLabel;
        this.minHrUnit = minHrUnit;
        this.title = title;
    }

    @NonNull
    public static HeartRateStatisticsViewBinding bind(@NonNull View rootView) {
        int i = R.id.averageHr;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.averageHrLabel;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = R.id.averageHrUnit;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView3 != null) {
                    i = R.id.maxHr;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView4 != null) {
                        i = R.id.maxHrLabel;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView5 != null) {
                            i = R.id.maxHrUnit;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView6 != null) {
                                i = R.id.minHr;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView7 != null) {
                                    i = R.id.minHrLabel;
                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView8 != null) {
                                        i = R.id.minHrUnit;
                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                        if (textView9 != null) {
                                            i = R.id.title;
                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                            if (textView10 != null) {
                                                return new HeartRateStatisticsViewBinding((ConstraintLayout) rootView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
    public static HeartRateStatisticsViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeartRateStatisticsViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heart_rate_statistics_view, parent, false);
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
