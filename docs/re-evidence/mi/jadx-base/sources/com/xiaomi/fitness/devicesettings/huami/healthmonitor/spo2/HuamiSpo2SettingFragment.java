package com.xiaomi.fitness.devicesettings.huami.healthmonitor.spo2;

import android.content.DialogInterface;
import android.view.View;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.spo2.HuamiSpo2SettingFragment;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.ek6;
import defpackage.eui;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/spo2/HuamiSpo2SettingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/spo2/HuamiSpo2SettingViewModel;", "Lek6;", "", "chooseHypoxemiaNoticeValue", "()V", "setListener", "onVisible", "onInvisible", "", "mHuamiSpo2SettingFragmentVisibleTime", "J", "", "getTitle", "()Ljava/lang/String;", "title", "", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HuamiSpo2SettingFragment extends Hilt_HuamiSpo2SettingFragment<HuamiSpo2SettingViewModel, ek6> {
    private long mHuamiSpo2SettingFragmentVisibleTime;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ HuamiSpo2SettingViewModel access$getMViewModel(HuamiSpo2SettingFragment huamiSpo2SettingFragment) {
        return (HuamiSpo2SettingViewModel) huamiSpo2SettingFragment.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void chooseHypoxemiaNoticeValue() {
        CommonDialog commonDialogCreate = new CommonDialog.c("low_spo2").setDialogTitle(wzi.j5).setCancelable(true).setCanceledOnTouchOutside(true).setItems(((HuamiSpo2SettingViewModel) getMViewModel()).getLowSpo2WarningIntervalStrs()).setItemsCheckedIndex(((HuamiSpo2SettingViewModel) getMViewModel()).getCurLowSpo2IntervalIndex()).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.healthmonitor.spo2.HuamiSpo2SettingFragment.chooseHypoxemiaNoticeValue.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                HuamiSpo2SettingFragment.access$getMViewModel(HuamiSpo2SettingFragment.this).setLowSpo2(which);
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$0(HuamiSpo2SettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!UtilsKt.isDeviceNotConnection()) {
            ((HuamiSpo2SettingViewModel) this$0.getMViewModel()).enableSpo2(z);
        } else {
            iSwitchButton.setChecked(!z);
            ToastUtil.showShortToast(wzi.u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(HuamiSpo2SettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.chooseHypoxemiaNoticeValue();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.V0;
    }

    @Override // com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorFragment
    @NotNull
    public String getTitle() {
        String string = ApplicationExtKt.getApplication().getString(wzi.L7);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mHuamiSpo2SettingFragmentVisibleTime = 0L;
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "SpO2_setting_detail_page", "title", getString(wzi.L7), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mHuamiSpo2SettingFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mHuamiSpo2SettingFragmentVisibleTime = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((ek6) getMBinding()).B.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: emc
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                HuamiSpo2SettingFragment.setListener$lambda$0(this.f16806a, z, iSwitchButton);
            }
        });
        ((ek6) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: fmc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HuamiSpo2SettingFragment.setListener$lambda$1(this.f17928a, view);
            }
        });
    }
}
