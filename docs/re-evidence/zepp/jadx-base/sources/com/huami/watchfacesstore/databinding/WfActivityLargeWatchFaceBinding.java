package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;

/* JADX INFO: loaded from: classes17.dex */
public final class WfActivityLargeWatchFaceBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView ivWatch;

    @NonNull
    public final ImageView ivWatchFace;

    @NonNull
    public final ImageView ivWatchFaceTransparent;

    @NonNull
    public final ConstraintLayout largeContainer;

    private WfActivityLargeWatchFaceBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivWatch, @NonNull ImageView ivWatchFace, @NonNull ImageView ivWatchFaceTransparent, @NonNull ConstraintLayout largeContainer) {
        this.a = rootView;
        this.ivWatch = ivWatch;
        this.ivWatchFace = ivWatchFace;
        this.ivWatchFaceTransparent = ivWatchFaceTransparent;
        this.largeContainer = largeContainer;
    }

    @NonNull
    public static WfActivityLargeWatchFaceBinding bind(@NonNull View rootView) {
        int i = R.id.iv_watch;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.iv_watch_face;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = R.id.iv_watch_face_transparent;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                if (imageView3 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                    return new WfActivityLargeWatchFaceBinding(constraintLayout, imageView, imageView2, imageView3, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfActivityLargeWatchFaceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfActivityLargeWatchFaceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_activity_large_watch_face, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
