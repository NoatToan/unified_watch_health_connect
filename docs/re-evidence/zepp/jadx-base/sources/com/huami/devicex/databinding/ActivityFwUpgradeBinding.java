package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.view.progress.ProgressView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityFwUpgradeBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView fwUpgradeDescription;

    @NonNull
    public final TextView fwUpgradeLog;

    @NonNull
    public final ProgressView fwUpgradeProgress;

    @NonNull
    public final TextView fwUpgradeTips;

    @NonNull
    public final TextView fwUpgradeTitle;

    @NonNull
    public final DeviceLayoutBottomCommonBtnBinding llUpdateSelect;

    private ActivityFwUpgradeBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ProgressView progressView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull DeviceLayoutBottomCommonBtnBinding deviceLayoutBottomCommonBtnBinding) {
        this.a = relativeLayout;
        this.fwUpgradeDescription = textView;
        this.fwUpgradeLog = textView2;
        this.fwUpgradeProgress = progressView;
        this.fwUpgradeTips = textView3;
        this.fwUpgradeTitle = textView4;
        this.llUpdateSelect = deviceLayoutBottomCommonBtnBinding;
    }

    @NonNull
    public static ActivityFwUpgradeBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.fw_upgrade_description;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.fw_upgrade_log;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.fw_upgrade_progress;
                ProgressView progressView = (ProgressView) ViewBindings.findChildViewById(view, i);
                if (progressView != null) {
                    i = R.id.fw_upgrade_tips;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.fw_upgrade_title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.ll_update_select))) != null) {
                            return new ActivityFwUpgradeBinding((RelativeLayout) view, textView, textView2, progressView, textView3, textView4, DeviceLayoutBottomCommonBtnBinding.bind(viewFindChildViewById));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityFwUpgradeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityFwUpgradeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_fw_upgrade, viewGroup, false);
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
