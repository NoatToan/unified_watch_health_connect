package com.huami.healthlabel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.healthlabel.R;

/* JADX INFO: loaded from: classes9.dex */
public final class ItemLabelManagerTitleBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView itemLabelManagerMsg;

    @NonNull
    public final AppCompatTextView itemLabelManagerTitle;

    private ItemLabelManagerTitleBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatTextView itemLabelManagerMsg, @NonNull AppCompatTextView itemLabelManagerTitle) {
        this.a = rootView;
        this.itemLabelManagerMsg = itemLabelManagerMsg;
        this.itemLabelManagerTitle = itemLabelManagerTitle;
    }

    @NonNull
    public static ItemLabelManagerTitleBinding bind(@NonNull View rootView) {
        int i = R.id.item_label_manager_msg;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
        if (appCompatTextView != null) {
            i = R.id.item_label_manager_title;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
            if (appCompatTextView2 != null) {
                return new ItemLabelManagerTitleBinding((ConstraintLayout) rootView, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemLabelManagerTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemLabelManagerTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_label_manager_title, parent, false);
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
