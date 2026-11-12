package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityKeepAliveTipsBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView keepAliveTipsCancel;

    @NonNull
    public final TextView keepAliveTipsDescribe;

    @NonNull
    public final ImageView keepAliveTipsDev;

    @NonNull
    public final TextView keepAliveTipsSetting;

    private ActivityKeepAliveTipsBinding(@NonNull RelativeLayout rootView, @NonNull TextView keepAliveTipsCancel, @NonNull TextView keepAliveTipsDescribe, @NonNull ImageView keepAliveTipsDev, @NonNull TextView keepAliveTipsSetting) {
        this.a = rootView;
        this.keepAliveTipsCancel = keepAliveTipsCancel;
        this.keepAliveTipsDescribe = keepAliveTipsDescribe;
        this.keepAliveTipsDev = keepAliveTipsDev;
        this.keepAliveTipsSetting = keepAliveTipsSetting;
    }

    @NonNull
    public static ActivityKeepAliveTipsBinding bind(@NonNull View rootView) {
        int i = R.id.keep_alive_tips_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_tips_cancel);
        if (textView != null) {
            i = R.id.keep_alive_tips_describe;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_tips_describe);
            if (textView2 != null) {
                i = R.id.keep_alive_tips_dev;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_tips_dev);
                if (imageView != null) {
                    i = R.id.keep_alive_tips_setting;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_tips_setting);
                    if (textView3 != null) {
                        return new ActivityKeepAliveTipsBinding((RelativeLayout) rootView, textView, textView2, imageView, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityKeepAliveTipsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityKeepAliveTipsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_keep_alive_tips, parent, false);
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
