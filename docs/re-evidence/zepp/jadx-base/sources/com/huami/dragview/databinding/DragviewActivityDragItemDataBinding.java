package com.huami.dragview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huami.dragview.R;

/* JADX INFO: loaded from: classes8.dex */
public final class DragviewActivityDragItemDataBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout dragviewDragItem;

    @NonNull
    public final ImageView dragviewDragItemBar;

    @NonNull
    public final ImageView dragviewDragItemIcon;

    @NonNull
    public final View dragviewDragItemLine;

    @NonNull
    public final TextView dragviewDragItemTitle;

    private DragviewActivityDragItemDataBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull TextView textView) {
        this.a = constraintLayout;
        this.dragviewDragItem = constraintLayout2;
        this.dragviewDragItemBar = imageView;
        this.dragviewDragItemIcon = imageView2;
        this.dragviewDragItemLine = view;
        this.dragviewDragItemTitle = textView;
    }

    @NonNull
    public static DragviewActivityDragItemDataBinding bind(@NonNull View view) {
        View viewFindViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.dragview_drag_item_bar;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.dragview_drag_item_icon;
            ImageView imageView2 = (ImageView) view.findViewById(i);
            if (imageView2 != null && (viewFindViewById = view.findViewById((i = R.id.dragview_drag_item_line))) != null) {
                i = R.id.dragview_drag_item_title;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    return new DragviewActivityDragItemDataBinding((ConstraintLayout) view, constraintLayout, imageView, imageView2, viewFindViewById, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DragviewActivityDragItemDataBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DragviewActivityDragItemDataBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dragview_activity_drag_item_data, viewGroup, false);
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
