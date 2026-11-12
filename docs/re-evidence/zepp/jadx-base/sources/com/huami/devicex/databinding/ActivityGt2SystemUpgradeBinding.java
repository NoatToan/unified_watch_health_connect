package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.xiaomi.hm.health.device.firmware.SystemUpgradeView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityGt2SystemUpgradeBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RainbowTitleBar actionBar;

    @NonNull
    public final View divider;

    @NonNull
    public final FrameLayout fwCheckContainer;

    @NonNull
    public final AppCompatImageView fwInfoImg;

    @NonNull
    public final NestedScrollView fwInfoSv;

    @NonNull
    public final RelativeLayout fwLatestContainer;

    @NonNull
    public final FrameLayout fwTipsContainer;

    @NonNull
    public final TextView lastVersionTv;

    @NonNull
    public final View maskView;

    @NonNull
    public final SystemUpgradeView systemUpgradeView;

    @NonNull
    public final TextView systemVersion;

    @NonNull
    public final TextView updateLogTv;

    @NonNull
    public final TextView upgradeTitleTv;

    private ActivityGt2SystemUpgradeBinding(@NonNull LinearLayout linearLayout, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull View view, @NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull NestedScrollView nestedScrollView, @NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout2, @NonNull TextView textView, @NonNull View view2, @NonNull SystemUpgradeView systemUpgradeView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.a = linearLayout;
        this.actionBar = rainbowTitleBar;
        this.divider = view;
        this.fwCheckContainer = frameLayout;
        this.fwInfoImg = appCompatImageView;
        this.fwInfoSv = nestedScrollView;
        this.fwLatestContainer = relativeLayout;
        this.fwTipsContainer = frameLayout2;
        this.lastVersionTv = textView;
        this.maskView = view2;
        this.systemUpgradeView = systemUpgradeView;
        this.systemVersion = textView2;
        this.updateLogTv = textView3;
        this.upgradeTitleTv = textView4;
    }

    @NonNull
    public static ActivityGt2SystemUpgradeBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.action_bar;
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
        if (rainbowTitleBar != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null) {
            i = R.id.fw_check_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.fw_info_img;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.fw_info_sv;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                    if (nestedScrollView != null) {
                        i = R.id.fw_latest_container;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout != null) {
                            i = R.id.fw_tips_container;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout2 != null) {
                                i = R.id.last_version_tv;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                                    i = R.id.system_upgrade_view;
                                    SystemUpgradeView systemUpgradeView = (SystemUpgradeView) ViewBindings.findChildViewById(view, i);
                                    if (systemUpgradeView != null) {
                                        i = R.id.system_version;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = R.id.update_log_tv;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = R.id.upgrade_title_tv;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    return new ActivityGt2SystemUpgradeBinding((LinearLayout) view, rainbowTitleBar, viewFindChildViewById, frameLayout, appCompatImageView, nestedScrollView, relativeLayout, frameLayout2, textView, viewFindChildViewById2, systemUpgradeView, textView2, textView3, textView4);
                                                }
                                            }
                                        }
                                    }
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
    public static ActivityGt2SystemUpgradeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityGt2SystemUpgradeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_gt2_system_upgrade, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
