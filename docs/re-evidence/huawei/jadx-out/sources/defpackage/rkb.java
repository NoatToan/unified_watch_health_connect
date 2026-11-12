package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.huawei.fullscenarioservice.pluginwearota.callback.CompleteCallback;
import com.huawei.fullscenarioservice.pluginwearota.callback.InitCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.activity.update.UpdateSettingActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class rkb extends BacklogEvent {
    public rkb() {
        super(BacklogType.AUTO_UPGRADE_ON_WLAN);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void onBacklogClick(String str, BackLogCallback<Integer> backLogCallback) {
        super.onBacklogClick(str, backLogCallback);
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            backLogCallback.onFailure(-1, "activity info is null");
            LogUtil.a("AutoUpgradeOnWlanEvent", "autoUpgradeOnWLAN activity is null");
            return;
        }
        DeviceInfo deviceInfoById = getDeviceInfoById(str);
        if (deviceInfoById == null) {
            backLogCallback.onFailure(-1, "device info is null");
            LogUtil.a("AutoUpgradeOnWlanEvent", "device info is null");
            return;
        }
        boolean zK = Utils.k();
        boolean zD = eey.d(deviceInfoById, 108);
        boolean z = zD && zK;
        boolean zD2 = eey.d(deviceInfoById, 58);
        boolean z2 = zD2 || z;
        LogUtil.a("AutoUpgradeOnWlanEvent", " isSupportUpdate ", Boolean.valueOf(z2), ",isOverseaCloud:", Boolean.valueOf(zK));
        if (zD2 || zD) {
            b(activityJ, deviceInfoById, z2, zD, backLogCallback);
        } else {
            a(activityJ, deviceInfoById, str, backLogCallback);
        }
    }

    private void b(final Activity activity, final DeviceInfo deviceInfo, final boolean z, final boolean z2, final BackLogCallback<Integer> backLogCallback) {
        final String deviceIdentify = deviceInfo.getDeviceIdentify();
        final boolean zK = Utils.k();
        final Intent intent = new Intent();
        intent.putExtra("device_id", deviceIdentify);
        intent.putExtra("moduleName", "PluginWearAbility");
        activity.runOnUiThread(new Runnable() { // from class: rkc
            @Override // java.lang.Runnable
            public final void run() {
                this.f47404b.d(activity, intent, deviceInfo, z, backLogCallback, z2, zK, deviceIdentify);
            }
        });
    }

    /* synthetic */ void d(final Activity activity, final Intent intent, final DeviceInfo deviceInfo, final boolean z, final BackLogCallback backLogCallback, final boolean z2, final boolean z3, final String str) {
        dad.c().launchActivity(activity, intent, new AppBundleLauncher.InstallCallback() { // from class: rkb.4
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public boolean call(Context context, Intent intent2) {
                HwOtaUpgradeManager.d().c(deviceInfo.getDeviceUdid(), (InitCallback) null);
                if (!z) {
                    rkb.this.d(intent, deviceInfo, backLogCallback);
                    return false;
                }
                if (z2 && !z3) {
                    rkb.this.d(intent, deviceInfo, backLogCallback);
                    return false;
                }
                ohf.e().b("PluginWearAbility");
                LogUtil.a("AutoUpgradeOnWlanEvent", "PluginWearOtaProxy launchActivity call");
                rkb.this.a(activity, deviceInfo, str, (BackLogCallback<Integer>) backLogCallback);
                return false;
            }

            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public void onFailed(Context context, Intent intent2) {
                super.onFailed(context, intent2);
                LogUtil.e("AutoUpgradeOnWlanEvent", "versionUpgrade onFailed");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent, DeviceInfo deviceInfo, BackLogCallback<Integer> backLogCallback) {
        intent.putExtra("TARGET_SETTING", true);
        intent.putExtra("UNIQUE_ID", deviceInfo.getDeviceUdid());
        intent.setClassName(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getPackageName(), ComponentInfo.PluginWearAbility_A_0);
        ohf.e().b("PluginWearAbility");
        LogUtil.a("AutoUpgradeOnWlanEvent", "PluginWearOtaProxy launchActivity call OtaTempActivity");
        iov.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), intent);
        backLogCallback.onSuccess(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Activity activity, final DeviceInfo deviceInfo, final String str, final BackLogCallback<Integer> backLogCallback) {
        LogUtil.a("AutoUpgradeOnWlanEvent", "enter redirectUpdateSetting");
        final int iE = e(str);
        final String deviceUdid = deviceInfo.getDeviceUdid();
        activity.runOnUiThread(new Runnable() { // from class: rjy
            @Override // java.lang.Runnable
            public final void run() {
                rkb.c(activity, iE, str, deviceInfo, deviceUdid, backLogCallback);
            }
        });
    }

    static /* synthetic */ void c(Activity activity, int i, String str, DeviceInfo deviceInfo, String str2, BackLogCallback backLogCallback) {
        try {
            Intent intent = new Intent();
            intent.setClass(activity, UpdateSettingActivity.class);
            intent.putExtra("device_support_wlan", b(i));
            intent.putExtra("device_support_auto", d(str));
            intent.putExtra("device_support_wlan_transmit", ram.d(deviceInfo));
            intent.putExtra("device_unique", str2);
            intent.putExtra("device_id", str);
            activity.startActivity(intent);
            backLogCallback.onSuccess(0);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("AutoUpgradeOnWlanEvent", "startActivity exception: ", LogAnonymous.b(e));
            backLogCallback.onFailure(-1, "native exception");
        }
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiClickParams(String str, String str2) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiClickParams(str, str2));
        popTipEventBiParams.put("Content", 17);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiShowParams(int i, int i2, DeviceInfo deviceInfo) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiShowParams(i, i2, deviceInfo));
        popTipEventBiParams.put("Content", 112);
        return popTipEventBiParams;
    }

    private static boolean b(int i) {
        if (lvi.a(i).w() == 1) {
            return true;
        }
        if (!eel.d(i) && 12 != i) {
            return true;
        }
        LogUtil.j("AutoUpgradeOnWlanEvent", "not support wlan");
        return false;
    }

    private static boolean d(String str) {
        DeviceCapability deviceCapabilityA = eej.a(str);
        return deviceCapabilityA != null && deviceCapabilityA.getIsSupportAutoUpdate();
    }

    private static int e(String str) {
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (deviceInfoE == null) {
            LogUtil.a("AutoUpgradeOnWlanEvent", "Enter showDeviceType() deviceInfo = null ");
            return -1;
        }
        rcw.b(BaseApplication.b()).d(deviceInfoE.getProductType());
        LogUtil.a("AutoUpgradeOnWlanEvent", "Enter showDeviceType() getProductType() productType ", Integer.valueOf(deviceInfoE.getProductType()));
        return deviceInfoE.getProductType();
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void checkEventComplete(DeviceInfo deviceInfo, BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        if (!isRemind(deviceInfo)) {
            LogUtil.a("AutoUpgradeOnWlanEvent", "isRemind false");
            eventCompleteCallback.onResult(false);
            return;
        }
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.b()).e(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityE == null) {
            LogUtil.j("AutoUpgradeOnWlanEvent", "deviceCapability is null");
            eventCompleteCallback.onResult(false);
            return;
        }
        boolean zD = eey.d(deviceInfo, 58);
        boolean zD2 = eey.d(deviceInfo, 108);
        int productType = deviceInfo.getProductType();
        LogUtil.a("AutoUpgradeOnWlanEvent", "productType:", Integer.valueOf(productType), " isOtaUpdate:", Boolean.valueOf(deviceCapabilityE.isOtaUpdate()), " isSupportDetect:", Boolean.valueOf(zD), " isSupportOtaUpgrade:", Boolean.valueOf(zD2));
        if ((deviceCapabilityE.isOtaUpdate() && !eel.d(productType) && productType != 12) || zD || zD2) {
            boolean zB = SharedPreferenceManager.b(getModuleId(deviceInfo.getDeviceUdid()), "AutoUpgradeOnWlanEvent", false);
            LogUtil.a("AutoUpgradeOnWlanEvent", "getSettingSwitch isReloadFromOta:", Boolean.valueOf(zB));
            if (zB) {
                e(deviceInfo, eventCompleteCallback);
                return;
            } else {
                d(deviceInfo, eventCompleteCallback);
                return;
            }
        }
        eventCompleteCallback.onResult(false);
    }

    private void e(final DeviceInfo deviceInfo, final BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        LogUtil.a("AutoUpgradeOnWlanEvent", "enter getSettingSwitchFormPlugin");
        SharedPreferenceManager.b(getModuleId(deviceInfo.getDeviceUdid()), "AutoUpgradeOnWlanEvent");
        dad.c().getSettingSwitch(deviceInfo.getDeviceUdid(), new CompleteCallback() { // from class: rkb.3
            @Override // com.huawei.fullscenarioservice.pluginwearota.callback.CompleteCallback
            public void complete(int i, String str) {
                LogUtil.a("AutoUpgradeOnWlanEvent", "getSettingSwitch code:", Integer.valueOf(i), ", wifiSwitch:", str);
                boolean zEquals = "1".equals(str);
                eventCompleteCallback.onResult(!zEquals);
                if (!zEquals) {
                    rkb rkbVar = rkb.this;
                    rkbVar.reportBiEvent(rkbVar.getBiKey(), rkb.this.getBiShowParams(0, 1, deviceInfo));
                } else {
                    rkb.this.updateVisited(deviceInfo, false);
                }
            }
        });
    }

    private void d(final DeviceInfo deviceInfo, final BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        LogUtil.a("AutoUpgradeOnWlanEvent", "enter getSettingSwitchFormStorage");
        mhs.a().getSwitchSetting("wlan_auto_update", new IBaseResponseCallback() { // from class: rka
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f47396a.c(eventCompleteCallback, deviceInfo, i, obj);
            }
        });
    }

    /* synthetic */ void c(BacklogEvent.EventCompleteCallback eventCompleteCallback, DeviceInfo deviceInfo, int i, Object obj) {
        LogUtil.a("AutoUpgradeOnWlanEvent", "updateLayoutIsShow errorCode = ", Integer.valueOf(i));
        boolean zEquals = (i == 0 && (obj instanceof String)) ? "2".equals((String) obj) : false;
        eventCompleteCallback.onResult(zEquals);
        if (zEquals) {
            reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
        } else {
            updateVisited(deviceInfo, false);
        }
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        if (Utils.o()) {
            return BaseApplication.b().getString(R.string.IDS_backlog_wlan_auto_upgrade_title_oversea);
        }
        return BaseApplication.b().getString(R.string.IDS_backlog_wlan_auto_upgrade_title);
    }
}
