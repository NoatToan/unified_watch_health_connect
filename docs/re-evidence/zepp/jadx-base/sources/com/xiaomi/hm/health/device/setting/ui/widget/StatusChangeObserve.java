package com.xiaomi.hm.health.device.setting.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.Observer;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceHelperActivity;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.setting.ui.ViewHelper;
import com.xiaomi.hm.health.device.setting.ui.dialog.ConnectFailureDialogFactory;
import com.xiaomi.hm.health.device.setting.ui.widget.StatusChangeObserve;
import com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel;
import com.xiaomi.hm.health.device.setting.vo.ConnectStatus;
import com.xiaomi.hm.health.device.setting.vo.DeviceConnectedVo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bo\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001a\u0012\u0006\u0010#\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020\u001a\u0012\u0006\u0010'\u001a\u00020\u001a\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,¢\u0006\u0004\b0\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010!\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010#\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0016\u0010%\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0016\u0010'\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/widget/StatusChangeObserve;", "Landroidx/lifecycle/Observer;", "Lcom/xiaomi/hm/health/device/setting/vo/DeviceConnectedVo;", "", "e", "it", "onChanged", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/fragment/app/FragmentManager;", "b", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lcom/xiaomi/hm/health/device/setting/viewmodel/FeatureViewModel;", "c", "Lcom/xiaomi/hm/health/device/setting/viewmodel/FeatureViewModel;", "featureViewModel", "Lcom/xiaomi/hm/health/device/setting/ui/widget/BatteryLevelDisplay;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/ui/widget/BatteryLevelDisplay;", "levelDisplayController", "Lcom/xiaomi/hm/health/device/setting/ui/ViewHelper;", "Lcom/xiaomi/hm/health/device/setting/ui/ViewHelper;", "viewHelper", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "tv_device_status", "g", "tv_battery_level", "h", "tv_percent", "i", "tv_charging", z.j, "tv_last_charge", hl.k, "retry_connect_tv", "Landroidx/appcompat/widget/AppCompatImageView;", "l", "Landroidx/appcompat/widget/AppCompatImageView;", "icon_state", "Landroid/content/res/Resources;", "m", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lcom/xiaomi/hm/health/device/setting/viewmodel/FeatureViewModel;Lcom/xiaomi/hm/health/device/setting/ui/widget/BatteryLevelDisplay;Lcom/xiaomi/hm/health/device/setting/ui/ViewHelper;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatImageView;Landroid/content/res/Resources;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class StatusChangeObserve implements Observer<DeviceConnectedVo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FragmentManager fragmentManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final FeatureViewModel featureViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final BatteryLevelDisplay levelDisplayController;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ViewHelper viewHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final TextView tv_device_status;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final TextView tv_battery_level;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final TextView tv_percent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final TextView tv_charging;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final TextView tv_last_charge;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final TextView retry_connect_tv;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final AppCompatImageView icon_state;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Resources resources;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectStatus.values().length];
            iArr[ConnectStatus.BLUETOOTH_DISABLE.ordinal()] = 1;
            iArr[ConnectStatus.CONNECTING.ordinal()] = 2;
            iArr[ConnectStatus.UN_CONNECT.ordinal()] = 3;
            iArr[ConnectStatus.SYNC.ordinal()] = 4;
            iArr[ConnectStatus.SYNC_A_GPS.ordinal()] = 5;
            iArr[ConnectStatus.SYNC_A_GPS_FAIL.ordinal()] = 6;
            iArr[ConnectStatus.FAILURE.ordinal()] = 7;
            iArr[ConnectStatus.CONNECTED.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StatusChangeObserve(@NotNull Context context, @NotNull FragmentManager fragmentManager, @NotNull FeatureViewModel featureViewModel, @NotNull BatteryLevelDisplay batteryLevelDisplay, @NotNull ViewHelper viewHelper, @NotNull TextView textView, @NotNull TextView textView2, @NotNull TextView textView3, @NotNull TextView textView4, @NotNull TextView textView5, @NotNull TextView textView6, @NotNull AppCompatImageView appCompatImageView, @NotNull Resources resources) {
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.featureViewModel = featureViewModel;
        this.levelDisplayController = batteryLevelDisplay;
        this.viewHelper = viewHelper;
        this.tv_device_status = textView;
        this.tv_battery_level = textView2;
        this.tv_percent = textView3;
        this.tv_charging = textView4;
        this.tv_last_charge = textView5;
        this.retry_connect_tv = textView6;
        this.icon_state = appCompatImageView;
        this.resources = resources;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(TextView textView, StatusChangeObserve statusChangeObserve, View view) {
        textView.setOnClickListener(null);
        HMDeviceHelperActivity.show(statusChangeObserve.context, ConnectFailureDialogFactory.INSTANCE.getHelpType(HMDeviceType.MILI), 1);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.STATUSBAR_CONNECTIONFAILRETRY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(StatusChangeObserve statusChangeObserve, View view) {
        ViewExKt.setVisible(statusChangeObserve.retry_connect_tv, false);
        statusChangeObserve.featureViewModel.retryConnect();
    }

    private final void e() {
        ViewExKt.setVisible(this.retry_connect_tv, false);
        ViewExKt.setVisible(this.icon_state, false);
    }

    @Override // androidx.p008lifecycle.Observer
    public void onChanged(@Nullable DeviceConnectedVo it2) {
        if (it2 == null) {
            return;
        }
        e();
        this.viewHelper.setItemEnable(it2.getConnectStatus() == ConnectStatus.CONNECTED);
        switch (WhenMappings.$EnumSwitchMapping$0[it2.getConnectStatus().ordinal()]) {
            case 1:
                this.tv_device_status.setText(R.string.add_devices_bluetooth_off);
                break;
            case 2:
                this.tv_device_status.setText(R.string.device_connecting);
                break;
            case 3:
                this.tv_device_status.setText(R.string.add_devices_notconnect);
                break;
            case 4:
                this.tv_device_status.setText(this.resources.getString(R.string.sync_data_label1));
                break;
            case 5:
                this.tv_device_status.setText(this.resources.getString(R.string.sync_agps_data_label, Integer.valueOf(it2.getProgress())));
                break;
            case 6:
                this.tv_device_status.setText(this.resources.getString(R.string.apgs_sync_fail));
                break;
            case 7:
                final TextView textView = this.tv_device_status;
                textView.setText(HMDeviceConfig.hasBoundWatch() ? R.string.watch_connect_fail : R.string.band_connect_fail);
                textView.setOnClickListener(new View.OnClickListener() { // from class: vf7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StatusChangeObserve.c(textView, this, view);
                    }
                });
                ViewExKt.setVisible(this.retry_connect_tv, true);
                this.retry_connect_tv.setOnClickListener(new View.OnClickListener() { // from class: wf7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StatusChangeObserve.d(this.a, view);
                    }
                });
                break;
            case 8:
                this.levelDisplayController.display(it2, this.tv_charging, this.tv_last_charge, this.resources);
                if (it2.getBatteryLevel() == -1) {
                    this.tv_battery_level.setText("");
                    this.tv_percent.setText("");
                } else {
                    this.tv_battery_level.setText(String.valueOf(it2.getBatteryLevel()));
                    this.tv_percent.setText("%");
                }
                break;
        }
        this.viewHelper.showStatusIcon(it2);
    }
}
