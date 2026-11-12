package com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.spo2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.spo2.BleSpo2SettingFragment;
import com.xiaomi.fitness.devicesettings.common.SubTitleDialog;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.devicesettings.widget.SetRadioGroup;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.cg6;
import defpackage.eui;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0006R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/spo2/BleSpo2SettingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/BaseHealthMonitorFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/spo2/BleSpo2SettingViewModel;", "Lcg6;", "", "showHypoxemiaNoticeThresholdSelectDialog", "()V", "showSpo2ModeSettingDialog", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onVisible", "onInvisible", "", "mBleSpo2SettingFragmentVisibleTime", "J", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BleSpo2SettingFragment extends Hilt_BleSpo2SettingFragment<BleSpo2SettingViewModel, cg6> {
    private long mBleSpo2SettingFragmentVisibleTime;

    public BleSpo2SettingFragment() {
        super(eui.V);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BleSpo2SettingViewModel access$getMViewModel(BleSpo2SettingFragment bleSpo2SettingFragment) {
        return (BleSpo2SettingViewModel) bleSpo2SettingFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$0(BleSpo2SettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        iSwitchButton.setChecked(!z);
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            ((BleSpo2SettingViewModel) this$0.getMViewModel()).setSpoOpen(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(BleSpo2SettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.showHypoxemiaNoticeThresholdSelectDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(BleSpo2SettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.showSpo2ModeSettingDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$3(BleSpo2SettingFragment this$0, SetRadioGroup.RadioItem radioItem, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(radioItem, "radioItem");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
            return Unit.INSTANCE;
        }
        ((BleSpo2SettingViewModel) this$0.getMViewModel()).setFrequency(radioItem.getId());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showHypoxemiaNoticeThresholdSelectDialog() {
        Pair<String[], Integer> pairBuildHypoxemiaNoticeThresholdPair = ((BleSpo2SettingViewModel) getMViewModel()).getSpo2Model().buildHypoxemiaNoticeThresholdPair();
        CommonDialog commonDialogCreate = new CommonDialog.c("HypoxemiaThreshold").setCancelable(true).setDialogTitle(wzi.i5).setItems(pairBuildHypoxemiaNoticeThresholdPair.getFirst()).setItemsCheckedIndex(pairBuildHypoxemiaNoticeThresholdPair.getSecond().intValue()).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.spo2.BleSpo2SettingFragment.showHypoxemiaNoticeThresholdSelectDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which > CollectionsKt__CollectionsKt.getLastIndex(BleSpo2SettingFragment.access$getMViewModel(BleSpo2SettingFragment.this).getSpo2Model().getBlodLowList())) {
                    BleSpo2SettingFragment.access$getMViewModel(BleSpo2SettingFragment.this).setLowSwitch(false);
                } else {
                    BleSpo2SettingFragment.access$getMViewModel(BleSpo2SettingFragment.this).setBlodLowValue(which);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showSpo2ModeSettingDialog() {
        Pair<String[], Integer> pairBuildBloodOxygenModeItems = ((BleSpo2SettingViewModel) getMViewModel()).getSpo2Model().buildBloodOxygenModeItems();
        SubTitleDialog subTitleDialogCreate = SubTitleDialog.INSTANCE.defaultBuilder("spo2Mode").setTitle(wzi.H7).setSubTitle(wzi.G7).setItems(pairBuildBloodOxygenModeItems.getFirst()).setItemsCheckedIndex(pairBuildBloodOxygenModeItems.getSecond().intValue()).create();
        subTitleDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.spo2.BleSpo2SettingFragment.showSpo2ModeSettingDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                Logger.d("onDialogClick " + which, new Object[0]);
                BleSpo2SettingFragment.access$getMViewModel(BleSpo2SettingFragment.this).setBloodOxygenMode(which);
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        subTitleDialogCreate.showIfNeed(getParentFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mBleSpo2SettingFragmentVisibleTime = 0L;
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "SpO2_setting_detail_page", "title", getString(wzi.L7), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mBleSpo2SettingFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.L7);
        ((BleSpo2SettingViewModel) getMViewModel()).loadBloodOxygenConfig();
        ((cg6) getMBinding()).C.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: ku2
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                BleSpo2SettingFragment.onViewCreated$lambda$0(this.f24292a, z, iSwitchButton);
            }
        });
        ((cg6) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: lu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BleSpo2SettingFragment.onViewCreated$lambda$1(this.f25433a, view2);
            }
        });
        ((cg6) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: mu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BleSpo2SettingFragment.onViewCreated$lambda$2(this.f27213a, view2);
            }
        });
        ((cg6) getMBinding()).B.setOnCheckedChangeListener(new Function2() { // from class: nu2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BleSpo2SettingFragment.onViewCreated$lambda$3(this.f28370a, (SetRadioGroup.RadioItem) obj, ((Integer) obj2).intValue());
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mBleSpo2SettingFragmentVisibleTime = System.currentTimeMillis();
    }
}
