package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityLargeWatchSkinBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final FrameLayout cincoContainer;

    @NonNull
    public final ImageView largeIv;

    @NonNull
    public final FrameLayout layoutContainer;

    @NonNull
    public final ImageView transparentIv;

    private ActivityLargeWatchSkinBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout3, @NonNull ImageView imageView2) {
        this.a = frameLayout;
        this.cincoContainer = frameLayout2;
        this.largeIv = imageView;
        this.layoutContainer = frameLayout3;
        this.transparentIv = imageView2;
    }

    @NonNull
    public static ActivityLargeWatchSkinBinding bind(@NonNull View view) {
        int i = R.id.cinco_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.large_iv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                FrameLayout frameLayout2 = (FrameLayout) view;
                i = R.id.transparent_iv;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    return new ActivityLargeWatchSkinBinding(frameLayout2, frameLayout, imageView, frameLayout2, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityLargeWatchSkinBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityLargeWatchSkinBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_large_watch_skin, viewGroup, false);
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
