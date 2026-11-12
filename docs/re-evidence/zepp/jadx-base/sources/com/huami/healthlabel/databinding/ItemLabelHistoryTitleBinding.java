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
public final class ItemLabelHistoryTitleBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView itemLabelHistoryDate;

    @NonNull
    public final AppCompatImageView itemLabelHistoryRing;

    private ItemLabelHistoryTitleBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatTextView itemLabelHistoryDate, @NonNull AppCompatImageView itemLabelHistoryRing) {
        this.a = rootView;
        this.itemLabelHistoryDate = itemLabelHistoryDate;
        this.itemLabelHistoryRing = itemLabelHistoryRing;
    }

    @NonNull
    public static ItemLabelHistoryTitleBinding bind(@NonNull View rootView) {
        int i = R.id.item_label_history_date;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
        if (appCompatTextView != null) {
            i = R.id.item_label_history_ring;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
            if (appCompatImageView != null) {
                return new ItemLabelHistoryTitleBinding((ConstraintLayout) rootView, appCompatTextView, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemLabelHistoryTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemLabelHistoryTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_label_history_title, parent, false);
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
