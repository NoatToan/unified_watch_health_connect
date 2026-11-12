package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.sport.ui.R;

/* JADX INFO: loaded from: classes11.dex */
public final class ActivitySportDetailChartsLandscapeBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatImageView movingUiDiagramLandscapeChartBackIcon;

    @NonNull
    public final LinearLayout movingUiDiagramLandscapeChartLabelLayout;

    @NonNull
    public final RelativeLayout movingUiDiagramLandscapeContainer;

    @NonNull
    public final LinearLayout movingUiDiagramLandscapeFlagLayout;

    @NonNull
    public final AppCompatTextView movingUiDiagramLandscapeFlagText;

    private ActivitySportDetailChartsLandscapeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout2, @NonNull AppCompatTextView appCompatTextView) {
        this.a = constraintLayout;
        this.movingUiDiagramLandscapeChartBackIcon = appCompatImageView;
        this.movingUiDiagramLandscapeChartLabelLayout = linearLayout;
        this.movingUiDiagramLandscapeContainer = relativeLayout;
        this.movingUiDiagramLandscapeFlagLayout = linearLayout2;
        this.movingUiDiagramLandscapeFlagText = appCompatTextView;
    }

    @NonNull
    public static ActivitySportDetailChartsLandscapeBinding bind(@NonNull View view) {
        int i = R.id.moving_ui_diagram_landscape_chart_back_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.moving_ui_diagram_landscape_chart_label_layout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.moving_ui_diagram_landscape_container;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.moving_ui_diagram_landscape_flag_layout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = R.id.moving_ui_diagram_landscape_flag_text;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            return new ActivitySportDetailChartsLandscapeBinding((ConstraintLayout) view, appCompatImageView, linearLayout, relativeLayout, linearLayout2, appCompatTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySportDetailChartsLandscapeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySportDetailChartsLandscapeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_sport_detail_charts_landscape, viewGroup, false);
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
