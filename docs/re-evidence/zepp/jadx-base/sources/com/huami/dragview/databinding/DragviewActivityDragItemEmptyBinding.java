package com.huami.dragview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huami.dragview.R;

/* JADX INFO: loaded from: classes8.dex */
public final class DragviewActivityDragItemEmptyBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout dragviewDragEmpty;

    @NonNull
    public final TextView dragviewDragItemNotShowEmpty;

    private DragviewActivityDragItemEmptyBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView) {
        this.a = constraintLayout;
        this.dragviewDragEmpty = constraintLayout2;
        this.dragviewDragItemNotShowEmpty = textView;
    }

    @NonNull
    public static DragviewActivityDragItemEmptyBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.dragview_drag_item_not_show_empty;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            return new DragviewActivityDragItemEmptyBinding((ConstraintLayout) view, constraintLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DragviewActivityDragItemEmptyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DragviewActivityDragItemEmptyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dragview_activity_drag_item_empty, viewGroup, false);
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
