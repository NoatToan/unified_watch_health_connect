package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityExerciserHisShareBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final ImageView ivShare;

    @NonNull
    public final FrameLayout sharePaneContainer;

    @NonNull
    public final RelativeLayout titleRl;

    private ActivityExerciserHisShareBinding(@NonNull RelativeLayout rootView, @NonNull ImageView ivClose, @NonNull ImageView ivShare, @NonNull FrameLayout sharePaneContainer, @NonNull RelativeLayout titleRl) {
        this.a = rootView;
        this.ivClose = ivClose;
        this.ivShare = ivShare;
        this.sharePaneContainer = sharePaneContainer;
        this.titleRl = titleRl;
    }

    @NonNull
    public static ActivityExerciserHisShareBinding bind(@NonNull View rootView) {
        int i = R.id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_close);
        if (imageView != null) {
            i = R.id.iv_share;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_share);
            if (imageView2 != null) {
                i = R.id.share_pane_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.share_pane_container);
                if (frameLayout != null) {
                    i = R.id.title_rl;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.title_rl);
                    if (relativeLayout != null) {
                        return new ActivityExerciserHisShareBinding((RelativeLayout) rootView, imageView, imageView2, frameLayout, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityExerciserHisShareBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityExerciserHisShareBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_exerciser_his_share, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
