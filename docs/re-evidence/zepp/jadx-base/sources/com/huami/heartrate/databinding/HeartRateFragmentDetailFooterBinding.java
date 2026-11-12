package com.huami.heartrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.heartrate.R;
import com.huami.heartrate.ui.StatisticsView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes9.dex */
public final class HeartRateFragmentDetailFooterBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout heartRateExplainLayout;

    @NonNull
    public final ConstraintLayout measureResultLayout;

    @NonNull
    public final CardView statisticsCard;

    @NonNull
    public final StatisticsView statisticsView;

    @NonNull
    public final TypefaceTextView tvHeartRateExplainTitle;

    @NonNull
    public final TypefaceTextView tvMeasureResultInfo;

    private HeartRateFragmentDetailFooterBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout heartRateExplainLayout, @NonNull ConstraintLayout measureResultLayout, @NonNull CardView statisticsCard, @NonNull StatisticsView statisticsView, @NonNull TypefaceTextView tvHeartRateExplainTitle, @NonNull TypefaceTextView tvMeasureResultInfo) {
        this.a = rootView;
        this.heartRateExplainLayout = heartRateExplainLayout;
        this.measureResultLayout = measureResultLayout;
        this.statisticsCard = statisticsCard;
        this.statisticsView = statisticsView;
        this.tvHeartRateExplainTitle = tvHeartRateExplainTitle;
        this.tvMeasureResultInfo = tvMeasureResultInfo;
    }

    @NonNull
    public static HeartRateFragmentDetailFooterBinding bind(@NonNull View rootView) {
        int i = R.id.heartRateExplainLayout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
        if (constraintLayout != null) {
            i = R.id.measureResultLayout;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
            if (constraintLayout2 != null) {
                i = R.id.statisticsCard;
                CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, i);
                if (cardView != null) {
                    i = R.id.statisticsView;
                    StatisticsView statisticsView = (StatisticsView) ViewBindings.findChildViewById(rootView, i);
                    if (statisticsView != null) {
                        i = R.id.tvHeartRateExplainTitle;
                        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                        if (typefaceTextView != null) {
                            i = R.id.tvMeasureResultInfo;
                            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                            if (typefaceTextView2 != null) {
                                return new HeartRateFragmentDetailFooterBinding((ConstraintLayout) rootView, constraintLayout, constraintLayout2, cardView, statisticsView, typefaceTextView, typefaceTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeartRateFragmentDetailFooterBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeartRateFragmentDetailFooterBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heart_rate_fragment_detail_footer, parent, false);
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
