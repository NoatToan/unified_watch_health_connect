package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.view.weightfigure.WeightFigureView;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.baseui.widget.SportHeartRateView;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityHeartRateDetailBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView delete;

    @NonNull
    public final RelativeLayout heartValueArea;

    @NonNull
    public final TypefaceTextView hr;

    @NonNull
    public final WeightFigureView hrFigureView;

    @NonNull
    public final SportHeartRateView hrSportView;

    private ActivityHeartRateDetailBinding(@NonNull LinearLayout rootView, @NonNull TextView delete, @NonNull RelativeLayout heartValueArea, @NonNull TypefaceTextView hr, @NonNull WeightFigureView hrFigureView, @NonNull SportHeartRateView hrSportView) {
        this.a = rootView;
        this.delete = delete;
        this.heartValueArea = heartValueArea;
        this.hr = hr;
        this.hrFigureView = hrFigureView;
        this.hrSportView = hrSportView;
    }

    @NonNull
    public static ActivityHeartRateDetailBinding bind(@NonNull View rootView) {
        int i = R.id.delete;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.delete);
        if (textView != null) {
            i = R.id.heart_value_area;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.heart_value_area);
            if (relativeLayout != null) {
                i = R.id.hr;
                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.hr);
                if (typefaceTextView != null) {
                    i = R.id.hr_figure_view;
                    WeightFigureView weightFigureView = (WeightFigureView) ViewBindings.findChildViewById(rootView, R.id.hr_figure_view);
                    if (weightFigureView != null) {
                        i = R.id.hr_sport_view;
                        SportHeartRateView sportHeartRateView = (SportHeartRateView) ViewBindings.findChildViewById(rootView, R.id.hr_sport_view);
                        if (sportHeartRateView != null) {
                            return new ActivityHeartRateDetailBinding((LinearLayout) rootView, textView, relativeLayout, typefaceTextView, weightFigureView, sportHeartRateView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityHeartRateDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityHeartRateDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_heart_rate_detail, parent, false);
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
