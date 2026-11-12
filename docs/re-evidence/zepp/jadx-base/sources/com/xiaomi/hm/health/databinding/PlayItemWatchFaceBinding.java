package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class PlayItemWatchFaceBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatImageView ivWatchFace;

    @NonNull
    public final AppCompatImageView ivWatchFaceNew;

    @NonNull
    public final AppCompatImageView ivWatchFaceShadow;

    @NonNull
    public final TypefaceTextView tvWatchFaceName;

    private PlayItemWatchFaceBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatImageView ivWatchFace, @NonNull AppCompatImageView ivWatchFaceNew, @NonNull AppCompatImageView ivWatchFaceShadow, @NonNull TypefaceTextView tvWatchFaceName) {
        this.a = rootView;
        this.ivWatchFace = ivWatchFace;
        this.ivWatchFaceNew = ivWatchFaceNew;
        this.ivWatchFaceShadow = ivWatchFaceShadow;
        this.tvWatchFaceName = tvWatchFaceName;
    }

    @NonNull
    public static PlayItemWatchFaceBinding bind(@NonNull View rootView) {
        int i = R.id.iv_watch_face;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_watch_face);
        if (appCompatImageView != null) {
            i = R.id.iv_watch_face_new;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_watch_face_new);
            if (appCompatImageView2 != null) {
                i = R.id.iv_watch_face_shadow;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_watch_face_shadow);
                if (appCompatImageView3 != null) {
                    i = R.id.tv_watch_face_name;
                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_watch_face_name);
                    if (typefaceTextView != null) {
                        return new PlayItemWatchFaceBinding((ConstraintLayout) rootView, appCompatImageView, appCompatImageView2, appCompatImageView3, typefaceTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PlayItemWatchFaceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PlayItemWatchFaceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.play_item_watch_face, parent, false);
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
