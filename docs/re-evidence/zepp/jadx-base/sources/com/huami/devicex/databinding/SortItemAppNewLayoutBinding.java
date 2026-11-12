package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class SortItemAppNewLayoutBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView dividerItem;

    @NonNull
    public final AppCompatImageView sortDragItem;

    @NonNull
    public final ImageView sortIcon;

    @NonNull
    public final RelativeLayout sortItemDragArea;

    @NonNull
    public final RelativeLayout sortItemGroup;

    @NonNull
    public final TextView sortItemText;

    private SortItemAppNewLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull AppCompatImageView appCompatImageView, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView2) {
        this.a = linearLayout;
        this.dividerItem = textView;
        this.sortDragItem = appCompatImageView;
        this.sortIcon = imageView;
        this.sortItemDragArea = relativeLayout;
        this.sortItemGroup = relativeLayout2;
        this.sortItemText = textView2;
    }

    @NonNull
    public static SortItemAppNewLayoutBinding bind(@NonNull View view) {
        int i = R.id.divider_item;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.sort_drag_item;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.sort_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.sort_item_drag_area;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.sort_item_group;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout2 != null) {
                            i = R.id.sort_item_text;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new SortItemAppNewLayoutBinding((LinearLayout) view, textView, appCompatImageView, imageView, relativeLayout, relativeLayout2, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static SortItemAppNewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SortItemAppNewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.sort_item_app_new_layout, viewGroup, false);
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
