package com.huami.dragview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.huami.dragview.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes8.dex */
public final class DragviewActivityDragListBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView dragviewDragItemShowEmpty;

    @NonNull
    public final NestedScrollView dragviewDragScroll;

    @NonNull
    public final RecyclerView dragviewDragShowRv;

    @NonNull
    public final TextView dragviewDragTip;

    @NonNull
    public final TextView dragviewShowTitle;

    @NonNull
    public final RainbowTitleBar dragviewToolbar;

    private DragviewActivityDragListBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull NestedScrollView nestedScrollView, @NonNull RecyclerView recyclerView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = linearLayout;
        this.dragviewDragItemShowEmpty = textView;
        this.dragviewDragScroll = nestedScrollView;
        this.dragviewDragShowRv = recyclerView;
        this.dragviewDragTip = textView2;
        this.dragviewShowTitle = textView3;
        this.dragviewToolbar = rainbowTitleBar;
    }

    @NonNull
    public static DragviewActivityDragListBinding bind(@NonNull View view) {
        int i = R.id.dragview_drag_item_show_empty;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.dragview_drag_scroll;
            NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(i);
            if (nestedScrollView != null) {
                i = R.id.dragview_drag_show_rv;
                RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
                if (recyclerView != null) {
                    i = R.id.dragview_drag_tip;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        i = R.id.dragview_show_title;
                        TextView textView3 = (TextView) view.findViewById(i);
                        if (textView3 != null) {
                            i = R.id.dragview_toolbar;
                            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) view.findViewById(i);
                            if (rainbowTitleBar != null) {
                                return new DragviewActivityDragListBinding((LinearLayout) view, textView, nestedScrollView, recyclerView, textView2, textView3, rainbowTitleBar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DragviewActivityDragListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DragviewActivityDragListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dragview_activity_drag_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
