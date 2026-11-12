package com.huami.healthlabel.databinding;

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
import com.huami.healthlabel.R;

/* JADX INFO: loaded from: classes9.dex */
public final class ItemLabelHistoryTitleYearBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView itemLabelYear;

    @NonNull
    public final AppCompatTextView itemLabelYearDate;

    @NonNull
    public final AppCompatImageView itemLabelYearRing;

    @NonNull
    public final View view2;

    private ItemLabelHistoryTitleYearBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatTextView itemLabelYear, @NonNull AppCompatTextView itemLabelYearDate, @NonNull AppCompatImageView itemLabelYearRing, @NonNull View view2) {
        this.a = rootView;
        this.itemLabelYear = itemLabelYear;
        this.itemLabelYearDate = itemLabelYearDate;
        this.itemLabelYearRing = itemLabelYearRing;
        this.view2 = view2;
    }

    @NonNull
    public static ItemLabelHistoryTitleYearBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        int i = R.id.item_label_year;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
        if (appCompatTextView != null) {
            i = R.id.item_label_year_date;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
            if (appCompatTextView2 != null) {
                i = R.id.item_label_year_ring;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.view_2))) != null) {
                    return new ItemLabelHistoryTitleYearBinding((ConstraintLayout) rootView, appCompatTextView, appCompatTextView2, appCompatImageView, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemLabelHistoryTitleYearBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemLabelHistoryTitleYearBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_label_history_title_year, parent, false);
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
