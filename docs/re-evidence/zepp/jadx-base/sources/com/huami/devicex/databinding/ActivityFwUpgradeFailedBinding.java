package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.view.progress.ProgressView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityFwUpgradeFailedBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ImageView acceptImg;

    @NonNull
    public final ProgressView bindChart;

    @NonNull
    public final AppCompatImageView bluetoothImg;

    @NonNull
    public final TextView fwFailedTips;

    @NonNull
    public final TextView fwFailedTitle;

    @NonNull
    public final TextView fwUpgradeLog;

    @NonNull
    public final ImageView phoneImg;

    private ActivityFwUpgradeFailedBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ProgressView progressView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView2) {
        this.a = relativeLayout;
        this.acceptImg = imageView;
        this.bindChart = progressView;
        this.bluetoothImg = appCompatImageView;
        this.fwFailedTips = textView;
        this.fwFailedTitle = textView2;
        this.fwUpgradeLog = textView3;
        this.phoneImg = imageView2;
    }

    @NonNull
    public static ActivityFwUpgradeFailedBinding bind(@NonNull View view) {
        int i = R.id.accept_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.bind_chart;
            ProgressView progressView = (ProgressView) ViewBindings.findChildViewById(view, i);
            if (progressView != null) {
                i = R.id.bluetooth_img;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.fw_failed_tips;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.fw_failed_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.fw_upgrade_log;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.phone_img;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    return new ActivityFwUpgradeFailedBinding((RelativeLayout) view, imageView, progressView, appCompatImageView, textView, textView2, textView3, imageView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityFwUpgradeFailedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityFwUpgradeFailedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_fw_upgrade_failed, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
