package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class PlayDialLayoutErrorBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    public final TextView tvRetry;

    @NonNull
    public final TextView tvTip;

    private PlayDialLayoutErrorBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivIcon, @NonNull TextView tvRetry, @NonNull TextView tvTip) {
        this.a = rootView;
        this.ivIcon = ivIcon;
        this.tvRetry = tvRetry;
        this.tvTip = tvTip;
    }

    @NonNull
    public static PlayDialLayoutErrorBinding bind(@NonNull View rootView) {
        int i = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_icon);
        if (imageView != null) {
            i = R.id.tv_retry;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_retry);
            if (textView != null) {
                i = R.id.tv_tip;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
                if (textView2 != null) {
                    return new PlayDialLayoutErrorBinding((LinearLayout) rootView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PlayDialLayoutErrorBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PlayDialLayoutErrorBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.play_dial_layout_error, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
