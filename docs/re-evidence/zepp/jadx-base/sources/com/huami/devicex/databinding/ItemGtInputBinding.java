package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemGtInputBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final AppCompatImageView deleteIcon;

    @NonNull
    public final View divider1;

    @NonNull
    public final View divider2;

    @NonNull
    public final View divider3;

    @NonNull
    public final TextView numberTv;

    private ItemGtInputBinding(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull TextView textView) {
        this.a = frameLayout;
        this.deleteIcon = appCompatImageView;
        this.divider1 = view;
        this.divider2 = view2;
        this.divider3 = view3;
        this.numberTv = textView;
    }

    @NonNull
    public static ItemGtInputBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i = R.id.delete_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider_1))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.divider_2))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.divider_3))) != null) {
            i = R.id.number_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new ItemGtInputBinding((FrameLayout) view, appCompatImageView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemGtInputBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemGtInputBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_gt_input, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
