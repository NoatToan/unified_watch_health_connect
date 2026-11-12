package com.huami.heartrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.heartrate.R;

/* JADX INFO: loaded from: classes9.dex */
public final class HeartRateHistoryItemListBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final CardView card;

    @NonNull
    public final FrameLayout frameLayout;

    @NonNull
    public final View line;

    @NonNull
    public final RecyclerView recyclerView;

    private HeartRateHistoryItemListBinding(@NonNull ConstraintLayout rootView, @NonNull CardView card, @NonNull FrameLayout frameLayout, @NonNull View line, @NonNull RecyclerView recyclerView) {
        this.a = rootView;
        this.card = card;
        this.frameLayout = frameLayout;
        this.line = line;
        this.recyclerView = recyclerView;
    }

    @NonNull
    public static HeartRateHistoryItemListBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        int i = R.id.card;
        CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, i);
        if (cardView != null) {
            i = R.id.frame_layout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
            if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.line))) != null) {
                i = R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                if (recyclerView != null) {
                    return new HeartRateHistoryItemListBinding((ConstraintLayout) rootView, cardView, frameLayout, viewFindChildViewById, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeartRateHistoryItemListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeartRateHistoryItemListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heart_rate_history_item_list, parent, false);
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
