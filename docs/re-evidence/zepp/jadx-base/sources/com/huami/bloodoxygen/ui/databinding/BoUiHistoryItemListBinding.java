package com.huami.bloodoxygen.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.view.BloodOxygenCardView;

/* JADX INFO: loaded from: classes5.dex */
public final class BoUiHistoryItemListBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final BloodOxygenCardView card;

    @NonNull
    public final FrameLayout frameLayout;

    @NonNull
    public final View line;

    @NonNull
    public final RecyclerView recyclerView;

    private BoUiHistoryItemListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BloodOxygenCardView bloodOxygenCardView, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.card = bloodOxygenCardView;
        this.frameLayout = frameLayout;
        this.line = view;
        this.recyclerView = recyclerView;
    }

    @NonNull
    public static BoUiHistoryItemListBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.card;
        BloodOxygenCardView bloodOxygenCardView = (BloodOxygenCardView) ViewBindings.findChildViewById(view, i);
        if (bloodOxygenCardView != null) {
            i = R.id.frame_layout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
                i = R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new BoUiHistoryItemListBinding((ConstraintLayout) view, bloodOxygenCardView, frameLayout, viewFindChildViewById, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static BoUiHistoryItemListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BoUiHistoryItemListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.bo_ui_history_item_list, viewGroup, false);
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
