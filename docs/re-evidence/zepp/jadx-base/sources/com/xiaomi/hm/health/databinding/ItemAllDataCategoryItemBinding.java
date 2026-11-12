package com.xiaomi.hm.health.databinding;

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
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ItemAllDataCategoryItemBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final AppCompatImageView icArrow;

    @NonNull
    public final AppCompatImageView icItemIcon;

    @NonNull
    public final TextView tvItemName;

    private ItemAllDataCategoryItemBinding(@NonNull FrameLayout rootView, @NonNull AppCompatImageView icArrow, @NonNull AppCompatImageView icItemIcon, @NonNull TextView tvItemName) {
        this.a = rootView;
        this.icArrow = icArrow;
        this.icItemIcon = icItemIcon;
        this.tvItemName = tvItemName;
    }

    @NonNull
    public static ItemAllDataCategoryItemBinding bind(@NonNull View rootView) {
        int i = R.id.ic_arrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.ic_arrow);
        if (appCompatImageView != null) {
            i = R.id.ic_item_icon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.ic_item_icon);
            if (appCompatImageView2 != null) {
                i = R.id.tv_item_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_item_name);
                if (textView != null) {
                    return new ItemAllDataCategoryItemBinding((FrameLayout) rootView, appCompatImageView, appCompatImageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemAllDataCategoryItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemAllDataCategoryItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_all_data_category_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
