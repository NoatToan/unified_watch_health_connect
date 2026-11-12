package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.xiaomi.hm.health.view.dslv.DragSortListView;

/* JADX INFO: loaded from: classes7.dex */
public final class ScappSortLayoutBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final View maskView;

    @NonNull
    public final LayoutMusicPermissionBinding notificationPermissionContainer;

    @NonNull
    public final DragSortListView sortListview;

    @NonNull
    public final View sortTopDivider;

    @NonNull
    public final TextView sortTopLabel;

    @NonNull
    public final RainbowTitleBar tvTitleBar;

    private ScappSortLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull LayoutMusicPermissionBinding layoutMusicPermissionBinding, @NonNull DragSortListView dragSortListView, @NonNull View view2, @NonNull TextView textView, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = relativeLayout;
        this.container = frameLayout;
        this.maskView = view;
        this.notificationPermissionContainer = layoutMusicPermissionBinding;
        this.sortListview = dragSortListView;
        this.sortTopDivider = view2;
        this.sortTopLabel = textView;
        this.tvTitleBar = rainbowTitleBar;
    }

    @NonNull
    public static ScappSortLayoutBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.notification_permission_container))) != null) {
            LayoutMusicPermissionBinding layoutMusicPermissionBindingBind = LayoutMusicPermissionBinding.bind(viewFindChildViewById2);
            i = R.id.sort_listview;
            DragSortListView dragSortListView = (DragSortListView) ViewBindings.findChildViewById(view, i);
            if (dragSortListView != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.sort_top_divider))) != null) {
                i = R.id.sort_top_label;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_title_bar;
                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                    if (rainbowTitleBar != null) {
                        return new ScappSortLayoutBinding((RelativeLayout) view, frameLayout, viewFindChildViewById, layoutMusicPermissionBindingBind, dragSortListView, viewFindChildViewById3, textView, rainbowTitleBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ScappSortLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ScappSortLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.scapp_sort_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
