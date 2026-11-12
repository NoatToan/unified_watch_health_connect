package com.huami.healthlabel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.healthlabel.R;

/* JADX INFO: loaded from: classes9.dex */
public final class ItemLabelHistoryDayBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final RecyclerView itemLabelHistoryRecyclerView;

    @NonNull
    public final View view2;

    private ItemLabelHistoryDayBinding(@NonNull ConstraintLayout rootView, @NonNull RecyclerView itemLabelHistoryRecyclerView, @NonNull View view2) {
        this.a = rootView;
        this.itemLabelHistoryRecyclerView = itemLabelHistoryRecyclerView;
        this.view2 = view2;
    }

    @NonNull
    public static ItemLabelHistoryDayBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        int i = R.id.item_label_history_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
        if (recyclerView == null || (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.view_2))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
        }
        return new ItemLabelHistoryDayBinding((ConstraintLayout) rootView, recyclerView, viewFindChildViewById);
    }

    @NonNull
    public static ItemLabelHistoryDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemLabelHistoryDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_label_history_day, parent, false);
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
