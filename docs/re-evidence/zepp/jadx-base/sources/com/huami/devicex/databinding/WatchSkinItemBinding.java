package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchSkinItemBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final ImageView deleteImg;

    @NonNull
    public final View selectedBg;

    @NonNull
    public final ImageView selectedImg;

    @NonNull
    public final AppCompatImageView thumbnailImg;

    private WatchSkinItemBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull ImageView imageView2, @NonNull AppCompatImageView appCompatImageView) {
        this.a = frameLayout;
        this.deleteImg = imageView;
        this.selectedBg = view;
        this.selectedImg = imageView2;
        this.thumbnailImg = appCompatImageView;
    }

    @NonNull
    public static WatchSkinItemBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.delete_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.selected_bg))) != null) {
            i = R.id.selected_img;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.thumbnail_img;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    return new WatchSkinItemBinding((FrameLayout) view, imageView, viewFindChildViewById, imageView2, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static WatchSkinItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WatchSkinItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.watch_skin_item, viewGroup, false);
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
