package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityBloodPressureHistoryBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final AppCompatTextView bpHistoryDate;

    @NonNull
    public final ConstraintLayout bpHistoryDateLayout;

    @NonNull
    public final AppCompatImageView bpHistoryRing;

    @NonNull
    public final AppCompatTextView bpHistoryYear;

    @NonNull
    public final TitlebarBloodPressureBinding containerTitlebar;

    @NonNull
    public final RecyclerView rvHistory;

    private ActivityBloodPressureHistoryBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView2, @NonNull TitlebarBloodPressureBinding titlebarBloodPressureBinding, @NonNull RecyclerView recyclerView) {
        this.a = linearLayout;
        this.bpHistoryDate = appCompatTextView;
        this.bpHistoryDateLayout = constraintLayout;
        this.bpHistoryRing = appCompatImageView;
        this.bpHistoryYear = appCompatTextView2;
        this.containerTitlebar = titlebarBloodPressureBinding;
        this.rvHistory = recyclerView;
    }

    @NonNull
    public static ActivityBloodPressureHistoryBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.bp_history_date;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.bp_history_date_layout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.bp_history_ring;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.bp_history_year;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.container_titlebar))) != null) {
                        TitlebarBloodPressureBinding titlebarBloodPressureBindingBind = TitlebarBloodPressureBinding.bind(viewFindChildViewById);
                        i = R.id.rv_history;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            return new ActivityBloodPressureHistoryBinding((LinearLayout) view, appCompatTextView, constraintLayout, appCompatImageView, appCompatTextView2, titlebarBloodPressureBindingBind, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBloodPressureHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBloodPressureHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_blood_pressure_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
