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
public final class DragviewActivityDragItemTitleBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView dragviewDragItemTitle;

    @NonNull
    public final ConstraintLayout dragviewDragTitle;

    private DragviewActivityDragItemTitleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2) {
        this.a = constraintLayout;
        this.dragviewDragItemTitle = textView;
        this.dragviewDragTitle = constraintLayout2;
    }

    @NonNull
    public static DragviewActivityDragItemTitleBinding bind(@NonNull View view) {
        int i = R.id.dragview_drag_item_title;
        TextView textView = (TextView) view.findViewById(i);
        if (textView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        return new DragviewActivityDragItemTitleBinding(constraintLayout, textView, constraintLayout);
    }

    @NonNull
    public static DragviewActivityDragItemTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DragviewActivityDragItemTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dragview_activity_drag_item_title, viewGroup, false);
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
