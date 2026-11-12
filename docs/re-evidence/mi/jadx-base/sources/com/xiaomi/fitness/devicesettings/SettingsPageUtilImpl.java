package com.xiaomi.fitness.devicesettings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.about.DeviceInfoFragment;
import com.xiaomi.fitness.devicesettings.base.sedenraty.SedentaryFragment;
import com.xiaomi.fitness.devicesettings.base.stand.StandDetectSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.applayout.WatchAppLayoutSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.factory.FactoryTestFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr.BleHrSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.pressure.BlePressureSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.sleep.view.BleSleepSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.spo2.BleSpo2SettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.temp.TemperatureSettingFragment;
import com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindFragment;
import com.xiaomi.fitness.devicesettings.common.extensions.ContextExtKt;
import com.xiaomi.fitness.devicesettings.common.lock.UnWearSettingFragment;
import com.xiaomi.fitness.devicesettings.common.track.TrackSettingFragment;
import com.xiaomi.fitness.devicesettings.common.vitality.VitalitySettingFragment;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtil;
import com.xiaomi.fitness.devicesettings.guide.GuideOpenNotificationFragment;
import com.xiaomi.fitness.devicesettings.guide.GuideOpenPhoneCallFragment;
import com.xiaomi.fitness.devicesettings.guide.GuideSyncSystemSettingFragment;
import com.xiaomi.fitness.devicesettings.guide.GuideWearInstructionFragment;
import com.xiaomi.fitness.devicesettings.guide.GuideWebViewFragment;
import com.xiaomi.fitness.devicesettings.guide.OpenPolicyAccessActivity;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingFragment;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingFragment;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.pressure.HuamiPressureSettingFragment;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.sleep.HuamiSleepSettingFragment;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.spo2.HuamiSpo2SettingFragment;
import com.xiaomi.fitness.devicesettings.utils.Constants;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J0\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001d\u0010\u0012\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00150\u0013¢\u0006\u0002\b\u0016H\u0082\bJ\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/SettingsPageUtilImpl;", "Lcom/xiaomi/fitness/devicesettings/export/SettingsPageUtil;", "<init>", "()V", "gotoHeartRatePage", "", "context", "Landroid/content/Context;", "gotoSleepPage", "gotoSpo2Page", "gotoPressurePage", "gotoSedentaryPage", "gotoStandDetectPage", "gotoUnWearSettingFragment", UnWearSettingFragment.IS_NFC_NEED, "", "gotoFactoryTestFragment", "goWithDeviceConnected", "target", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Ljava/lang/Class;", "Lkotlin/ExtensionFunctionType;", "gotoGuideSettingPage", "gotoOpenPolicyAccessActivity", "gotoDeviceKeepAliveGuideActivity", "needDeviceConnect", "gotoDeviceInfoPage", "gotoVitalityPage", "gotoTrackPage", "gotoECGMeasureRemindPage", "gotoConnectNewPhonePage", "newAppLayoutPage", "Landroidx/fragment/app/Fragment;", "newWearInstructionPage", "newGuideOpenPhoneCallPage", "newGuideSyncSystemSettingPage", "newGuideWebViewPage", "url", "", "gotoAudioRecordPage", "gotoTempSettingPage", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSettingsPageUtilImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsPageUtilImpl.kt\ncom/xiaomi/fitness/devicesettings/SettingsPageUtilImpl\n*L\n1#1,205:1\n125#1,9:206\n125#1,9:215\n125#1,9:224\n125#1,9:233\n125#1,9:242\n125#1,9:251\n125#1,9:260\n125#1,9:269\n*S KotlinDebug\n*F\n+ 1 SettingsPageUtilImpl.kt\ncom/xiaomi/fitness/devicesettings/SettingsPageUtilImpl\n*L\n58#1:206,9\n71#1:215,9\n80#1:224,9\n89#1:233,9\n98#1:242,9\n152#1:251,9\n156#1:260,9\n160#1:269,9\n*E\n"})
public final class SettingsPageUtilImpl implements SettingsPageUtil {
    private final void goWithDeviceConnected(Context context, Function1<? super WearableDeviceModel, ? extends Class<?>> target) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            ToastUtil.showShortToast(wzi.u);
            return;
        }
        if (!wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(wzi.u);
            return;
        }
        Class<?> clsInvoke = target.invoke2(wearableDeviceModel);
        if (clsInvoke != null) {
            ContextExtKt.gotoPage$default(context, clsInvoke, null, 2, null);
        } else {
            ToastExtKt.toastShort(context, "unsupported device");
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoAudioRecordPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContextExtKt.gotoAudioRecordPage(context);
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoConnectNewPhonePage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContextExtKt.gotoConnectNewPhone(context, ConnectNewPhoneFragment.class, true);
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoDeviceInfoPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContextExtKt.gotoPage$default(context, DeviceInfoFragment.class, null, 2, null);
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoDeviceKeepAliveGuideActivity(boolean needDeviceConnect) {
        Constants.INSTANCE.goKeepAliveBrowserActivity(needDeviceConnect);
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoECGMeasureRemindPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            ToastUtil.showShortToast(wzi.u);
        } else if (wearableDeviceModel.getIsDeviceConnected()) {
            ContextExtKt.gotoPage$default(context, ECGMeasureRemindFragment.class, null, 2, null);
        } else {
            ToastUtil.showShortToast(wzi.u);
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoFactoryTestFragment(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContextExtKt.gotoPage$default(context, FactoryTestFragment.class, null, 2, null);
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoGuideSettingPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContextExtKt.gotoPage(context, GuideOpenNotificationFragment.class, null);
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoHeartRatePage(@NotNull Context context) {
        Class cls;
        Intrinsics.checkNotNullParameter(context, "context");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            ToastUtil.showShortToast(wzi.u);
            return;
        }
        if (!wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(wzi.u);
            return;
        }
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            cls = DeviceModelExtKt.isKongMing(wearableDeviceModel) ? HrHuaMiSettingFragment.class : HuamiHrSettingFragment.class;
        } else {
            cls = BleHrSettingFragment.class;
        }
        ContextExtKt.gotoPage$default(context, cls, null, 2, null);
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoOpenPolicyAccessActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) OpenPolicyAccessActivity.class));
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoPressurePage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            ToastUtil.showShortToast(wzi.u);
        } else if (wearableDeviceModel.getIsDeviceConnected()) {
            ContextExtKt.gotoPage$default(context, DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? HuamiPressureSettingFragment.class : BlePressureSettingFragment.class, null, 2, null);
        } else {
            ToastUtil.showShortToast(wzi.u);
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoSedentaryPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            ToastUtil.showShortToast(wzi.u);
        } else if (wearableDeviceModel.getIsDeviceConnected()) {
            ContextExtKt.gotoPage$default(context, SedentaryFragment.class, null, 2, null);
        } else {
            ToastUtil.showShortToast(wzi.u);
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoSleepPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            ToastUtil.showShortToast(wzi.u);
        } else if (wearableDeviceModel.getIsDeviceConnected()) {
            ContextExtKt.gotoPage$default(context, DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? HuamiSleepSettingFragment.class : BleSleepSettingFragment.class, null, 2, null);
        } else {
            ToastUtil.showShortToast(wzi.u);
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoSpo2Page(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            ToastUtil.showShortToast(wzi.u);
        } else if (wearableDeviceModel.getIsDeviceConnected()) {
            ContextExtKt.gotoPage$default(context, DeviceModelExtKt.isL66(wearableDeviceModel) ? HuamiSpo2SettingFragment.class : BleSpo2SettingFragment.class, null, 2, null);
        } else {
            ToastUtil.showShortToast(wzi.u);
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoStandDetectPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContextExtKt.gotoPage$default(context, StandDetectSettingFragment.class, null, 2, null);
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoTempSettingPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContextExtKt.gotoPage$default(context, TemperatureSettingFragment.class, null, 2, null);
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoTrackPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            ToastUtil.showShortToast(wzi.u);
        } else if (wearableDeviceModel.getIsDeviceConnected()) {
            ContextExtKt.gotoPage$default(context, TrackSettingFragment.class, null, 2, null);
        } else {
            ToastUtil.showShortToast(wzi.u);
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoUnWearSettingFragment(@NotNull Context context, boolean sIsNeedSync) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle bundle = new Bundle();
        bundle.putBoolean(UnWearSettingFragment.IS_NFC_NEED, sIsNeedSync);
        ContextExtKt.gotoPage(context, UnWearSettingFragment.class, bundle);
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    public void gotoVitalityPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            ToastUtil.showShortToast(wzi.u);
        } else if (wearableDeviceModel.getIsDeviceConnected()) {
            ContextExtKt.gotoPage$default(context, VitalitySettingFragment.class, null, 2, null);
        } else {
            ToastUtil.showShortToast(wzi.u);
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    @NotNull
    public Fragment newAppLayoutPage() {
        WatchAppLayoutSettingFragment watchAppLayoutSettingFragment = new WatchAppLayoutSettingFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(WatchAppLayoutSettingFragment.INSTANCE.getGUIDE_STATE(), true);
        watchAppLayoutSettingFragment.setArguments(bundle);
        return watchAppLayoutSettingFragment;
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    @NotNull
    public Fragment newGuideOpenPhoneCallPage() {
        return new GuideOpenPhoneCallFragment();
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    @NotNull
    public Fragment newGuideSyncSystemSettingPage() {
        return new GuideSyncSystemSettingFragment();
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    @NotNull
    public Fragment newGuideWebViewPage(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        GuideWebViewFragment guideWebViewFragment = new GuideWebViewFragment();
        Bundle bundle = new Bundle();
        bundle.putString("URL", url);
        guideWebViewFragment.setArguments(bundle);
        return guideWebViewFragment;
    }

    @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtil
    @NotNull
    public Fragment newWearInstructionPage() {
        return new GuideWearInstructionFragment();
    }
}
