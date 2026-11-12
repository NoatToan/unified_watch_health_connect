package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemBloodpressureHistoryTitleYearBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView itemBpYear;

    @NonNull
    public final AppCompatTextView itemBpYearDate;

    @NonNull
    public final AppCompatImageView itemBpYearRing;

    @NonNull
    public final View view2;

    private ItemBloodpressureHistoryTitleYearBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatImageView appCompatImageView, @NonNull View view) {
        this.a = constraintLayout;
        this.itemBpYear = appCompatTextView;
        this.itemBpYearDate = appCompatTextView2;
        this.itemBpYearRing = appCompatImageView;
        this.view2 = view;
    }

    @NonNull
    public static ItemBloodpressureHistoryTitleYearBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.item_bp_year;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.item_bp_year_date;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = R.id.item_bp_year_ring;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view_2))) != null) {
                    return new ItemBloodpressureHistoryTitleYearBinding((ConstraintLayout) view, appCompatTextView, appCompatTextView2, appCompatImageView, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemBloodpressureHistoryTitleYearBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemBloodpressureHistoryTitleYearBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_bloodpressure_history_title_year, viewGroup, false);
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
