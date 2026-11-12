package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityFwUpgradeSuccessBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final AppCompatImageView activityFwUpgradeSuccessImg;

    @NonNull
    public final TextView activityFwUpgradeSuccessInfo1;

    @NonNull
    public final TextView activityFwUpgradeSuccessInfo2;

    private ActivityFwUpgradeSuccessBinding(@NonNull RelativeLayout relativeLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.a = relativeLayout;
        this.activityFwUpgradeSuccessImg = appCompatImageView;
        this.activityFwUpgradeSuccessInfo1 = textView;
        this.activityFwUpgradeSuccessInfo2 = textView2;
    }

    @NonNull
    public static ActivityFwUpgradeSuccessBinding bind(@NonNull View view) {
        int i = R.id.activity_fw_upgrade_success_img;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.activity_fw_upgrade_success_info_1;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.activity_fw_upgrade_success_info_2;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new ActivityFwUpgradeSuccessBinding((RelativeLayout) view, appCompatImageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityFwUpgradeSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityFwUpgradeSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_fw_upgrade_success, viewGroup, false);
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
