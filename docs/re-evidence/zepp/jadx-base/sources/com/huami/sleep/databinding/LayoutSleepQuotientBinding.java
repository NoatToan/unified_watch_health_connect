package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.view.UnitTextView;

/* JADX INFO: loaded from: classes13.dex */
public final class LayoutSleepQuotientBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View divider;

    @NonNull
    public final RecyclerView recycleView;

    @NonNull
    public final UnitTextView sleepScore;

    @NonNull
    public final TextView sleepScoreDesc;

    private LayoutSleepQuotientBinding(@NonNull ConstraintLayout rootView, @NonNull View divider, @NonNull RecyclerView recycleView, @NonNull UnitTextView sleepScore, @NonNull TextView sleepScoreDesc) {
        this.a = rootView;
        this.divider = divider;
        this.recycleView = recycleView;
        this.sleepScore = sleepScore;
        this.sleepScoreDesc = sleepScoreDesc;
    }

    @NonNull
    public static LayoutSleepQuotientBinding bind(@NonNull View rootView) {
        int i = R.id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, i);
        if (viewFindChildViewById != null) {
            i = R.id.recycle_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
            if (recyclerView != null) {
                i = R.id.sleep_score;
                UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
                if (unitTextView != null) {
                    i = R.id.sleep_score_desc;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView != null) {
                        return new LayoutSleepQuotientBinding((ConstraintLayout) rootView, viewFindChildViewById, recyclerView, unitTextView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutSleepQuotientBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutSleepQuotientBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_sleep_quotient, parent, false);
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
