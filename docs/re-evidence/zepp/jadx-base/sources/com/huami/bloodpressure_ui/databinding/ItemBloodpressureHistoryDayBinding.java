package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemBloodpressureHistoryDayBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final RecyclerView itemBpHistoryRecyclerView;

    @NonNull
    public final View view2;

    private ItemBloodpressureHistoryDayBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull View view) {
        this.a = constraintLayout;
        this.itemBpHistoryRecyclerView = recyclerView;
        this.view2 = view;
    }

    @NonNull
    public static ItemBloodpressureHistoryDayBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.item_bp_history_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view_2))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        return new ItemBloodpressureHistoryDayBinding((ConstraintLayout) view, recyclerView, viewFindChildViewById);
    }

    @NonNull
    public static ItemBloodpressureHistoryDayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemBloodpressureHistoryDayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_bloodpressure_history_day, viewGroup, false);
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
