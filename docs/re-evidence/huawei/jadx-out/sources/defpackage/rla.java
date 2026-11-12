package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.fullscenarioservice.pluginwearota.callback.InitCallback;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import health.compact.a.Utils;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class rla extends BacklogEvent {
    public rla() {
        super(BacklogType.VERSION_UPGRADE);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void onBacklogClick(final String str, final BackLogCallback<Integer> backLogCallback) {
        super.onBacklogClick(str, backLogCallback);
        final Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            backLogCallback.onFailure(-1, "Activity is null ");
            return;
        }
        final DeviceInfo deviceInfoC = mgg.c(str, "VersionUpgradeEvent");
        if (deviceInfoC == null) {
            backLogCallback.onFailure(-1, "device info is null");
        } else {
            HandlerExecutor.c(new Runnable() { // from class: rky
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47432a.d(str, deviceInfoC, activity, backLogCallback);
                }
            });
        }
    }

    /* synthetic */ void d(String str, final DeviceInfo deviceInfo, Activity activity, BackLogCallback backLogCallback) {
        final Intent intent = new Intent();
        intent.putExtra("device_id", str);
        boolean zD = eey.d(deviceInfo, 108);
        boolean zD2 = eey.d(deviceInfo, 58);
        LogUtil.e("VersionUpgradeEvent", "isSupportDetect：", Boolean.valueOf(zD2), " ,isSupportUpgrade：", Boolean.valueOf(zD));
        if (zD2 || zD) {
            final boolean z = zD2 || (zD && Utils.k());
            intent.putExtra("moduleName", "PluginWearAbility");
            LogUtil.e("VersionUpgradeEvent", "isSupportUpdate：", Boolean.valueOf(z));
            dad.c().launchActivity(activity, intent, new AppBundleLauncher.InstallCallback() { // from class: rla.1
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public boolean call(Context context, Intent intent2) {
                    HwOtaUpgradeManager.d().c(deviceInfo.getDeviceUdid(), (InitCallback) null);
                    if (z) {
                        intent.setClassName(dmz.y, "com.huawei.ui.device.activity.update.UpdateVersionActivity");
                    } else {
                        intent.putExtra("UNIQUE_ID", deviceInfo.getDeviceUdid());
                        intent.setClassName(BaseApplication.getContext().getPackageName(), ComponentInfo.PluginWearAbility_A_0);
                    }
                    ohf.e().b("PluginWearAbility");
                    LogUtil.a("VersionUpgradeEvent", "PluginWearOtaProxy launchActivity call");
                    iov.d(BaseApplication.getContext(), intent);
                    return false;
                }

                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public void onFailed(Context context, Intent intent2) {
                    super.onFailed(context, intent2);
                    LogUtil.e("VersionUpgradeEvent", "versionUpgrade onFailed");
                }
            });
            backLogCallback.onSuccess(0);
            return;
        }
        LogUtil.e("VersionUpgradeEvent", "versionUpgrade -> UpdateVersionActivity");
        intent.setClassName(dmz.y, "com.huawei.ui.device.activity.update.UpdateVersionActivity");
        iov.d(BaseApplication.getContext(), intent);
        backLogCallback.onSuccess(0);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiClickParams(String str, String str2) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiClickParams(str, str2));
        popTipEventBiParams.put("Content", 18);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiShowParams(int i, int i2, DeviceInfo deviceInfo) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiShowParams(i, i2, deviceInfo));
        popTipEventBiParams.put("Content", Integer.valueOf(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON));
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        return com.huawei.haf.application.BaseApplication.b().getString(R.string.IDS_backlog_new_version_prompt_title);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void checkEventComplete(DeviceInfo deviceInfo, BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        if (!isRemind(deviceInfo)) {
            LogUtil.a("VersionUpgradeEvent", "isRemind false");
            eventCompleteCallback.onResult(false);
            return;
        }
        if (deviceInfo.getDeviceConnectState() != 2) {
            boolean cache = readCache(deviceInfo);
            eventCompleteCallback.onResult(cache);
            if (cache) {
                reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
                return;
            }
            return;
        }
        Context contextB = com.huawei.haf.application.BaseApplication.b();
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        boolean zD = eey.d(deviceInfo, 58);
        boolean zD2 = eey.d(deviceInfo, 108);
        LogUtil.a("VersionUpgradeEvent", "checkNewVersion isSupportDetect:", Boolean.valueOf(zD), " , isSupportOtaUpgrade:", Boolean.valueOf(zD2));
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(contextB).e(deviceIdentify);
        if ((deviceCapabilityE != null && deviceCapabilityE.isOtaUpdate()) || zD || zD2) {
            boolean zO = HwVersionManager.b(contextB).o(deviceIdentify);
            LogUtil.a("VersionUpgradeEvent", "checkNewVersion isNewVersion:", Boolean.valueOf(zO));
            if (zO) {
                eventCompleteCallback.onResult(true);
                setCache(deviceInfo, "1");
                reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
                return;
            } else if (eey.d(deviceInfo, 108) && !Utils.k()) {
                b(deviceInfo, eventCompleteCallback);
                return;
            }
        }
        setCache(deviceInfo, "0");
        eventCompleteCallback.onResult(false);
        updateVisited(deviceInfo, false);
    }

    private void b(final DeviceInfo deviceInfo, final BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        LogUtil.a("VersionUpgradeEvent", "enter getNewVersion");
        if (!dad.c().isPluginAvaiable()) {
            LogUtil.j("VersionUpgradeEvent", "getNewVersion ota Plugin Unavailable");
            eventCompleteCallback.onResult(false);
            setCache(deviceInfo, "0");
            updateVisited(deviceInfo, false);
            ThreadPoolManager.c().a("VersionUpgradeEvent", new Runnable() { // from class: rkx
                @Override // java.lang.Runnable
                public final void run() {
                    HwOtaUpgradeManager.d().e(deviceInfo, new HwOtaUpgradeManager.RefreshLittleRedListener() { // from class: rkz
                        @Override // com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.RefreshLittleRedListener
                        public final void refreshLittleRed() {
                            LogUtil.a("VersionUpgradeEvent", "getNewVersion HwOtaUpgradeManagerHwOta UpgradeManager");
                        }
                    });
                }
            });
            return;
        }
        final String deviceIdentify = deviceInfo.getDeviceIdentify();
        HwOtaUpgradeManager.d().e(deviceInfo, new HwOtaUpgradeManager.RefreshLittleRedListener() { // from class: rlb
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.RefreshLittleRedListener
            public final void refreshLittleRed() {
                this.d.b(deviceIdentify, eventCompleteCallback, deviceInfo);
            }
        });
    }

    /* synthetic */ void b(String str, BacklogEvent.EventCompleteCallback eventCompleteCallback, DeviceInfo deviceInfo) {
        boolean zO = HwVersionManager.b(com.huawei.haf.application.BaseApplication.b()).o(str);
        LogUtil.a("VersionUpgradeEvent", "getNewVersion isNewVersion:", Boolean.valueOf(zO));
        eventCompleteCallback.onResult(zO);
        if (!zO) {
            setCache(deviceInfo, "0");
            updateVisited(deviceInfo, false);
        } else {
            setCache(deviceInfo, "1");
            reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
        }
    }
}
