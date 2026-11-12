package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.sport.ui.R;

/* JADX INFO: loaded from: classes11.dex */
public final class MovingUiSportDetailChartsLandscapeChartItemBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final CheckBox movingUiChartSelectIcon;

    @NonNull
    public final AppCompatTextView movingUiChartSelectValue;

    private MovingUiSportDetailChartsLandscapeChartItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CheckBox checkBox, @NonNull AppCompatTextView appCompatTextView) {
        this.a = constraintLayout;
        this.movingUiChartSelectIcon = checkBox;
        this.movingUiChartSelectValue = appCompatTextView;
    }

    @NonNull
    public static MovingUiSportDetailChartsLandscapeChartItemBinding bind(@NonNull View view) {
        int i = R.id.moving_ui_chart_select_icon;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
        if (checkBox != null) {
            i = R.id.moving_ui_chart_select_value;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                return new MovingUiSportDetailChartsLandscapeChartItemBinding((ConstraintLayout) view, checkBox, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static MovingUiSportDetailChartsLandscapeChartItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MovingUiSportDetailChartsLandscapeChartItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moving_ui_sport_detail_charts_landscape_chart_item, viewGroup, false);
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
