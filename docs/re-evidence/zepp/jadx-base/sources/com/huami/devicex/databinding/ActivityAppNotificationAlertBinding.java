package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.view.widget.TipComponent;
import com.xiaomi.hm.health.ui.smartplay.appnotify.view.AppList;
import com.xiaomi.hm.health.ui.smartplay.appnotify.view.HeaderView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityAppNotificationAlertBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TipComponent accessTip;

    @NonNull
    public final FrameLayout fragmentContainer;

    @NonNull
    public final HeaderView headerView;

    @NonNull
    public final View maskView;

    @NonNull
    public final AppList notifiAppList;

    @NonNull
    public final RainbowTitleBar titleBar;

    private ActivityAppNotificationAlertBinding(@NonNull RelativeLayout relativeLayout, @NonNull TipComponent tipComponent, @NonNull FrameLayout frameLayout, @NonNull HeaderView headerView, @NonNull View view, @NonNull AppList appList, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = relativeLayout;
        this.accessTip = tipComponent;
        this.fragmentContainer = frameLayout;
        this.headerView = headerView;
        this.maskView = view;
        this.notifiAppList = appList;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivityAppNotificationAlertBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.access_tip;
        TipComponent tipComponent = (TipComponent) ViewBindings.findChildViewById(view, i);
        if (tipComponent != null) {
            i = R.id.fragment_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.header_view;
                HeaderView headerView = (HeaderView) ViewBindings.findChildViewById(view, i);
                if (headerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                    i = R.id.notifi_app_list;
                    AppList appList = (AppList) ViewBindings.findChildViewById(view, i);
                    if (appList != null) {
                        i = R.id.title_bar;
                        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                        if (rainbowTitleBar != null) {
                            return new ActivityAppNotificationAlertBinding((RelativeLayout) view, tipComponent, frameLayout, headerView, viewFindChildViewById, appList, rainbowTitleBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAppNotificationAlertBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityAppNotificationAlertBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_app_notification_alert, viewGroup, false);
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
