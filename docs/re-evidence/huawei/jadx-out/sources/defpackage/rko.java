package defpackage;

import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes17.dex */
public class rko extends BacklogEvent {
    public rko() {
        super(BacklogType.OFFLINE_MAP_AUTO_SWITCH);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void onBacklogClick(String str, final BackLogCallback<Integer> backLogCallback) {
        super.onBacklogClick(str, backLogCallback);
        rpq.c(FeatureType.OFFLINE_MAP).jumpToFeaturePage(getDeviceInfoById(str), new SimpleChain.Emitter() { // from class: rko.5
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public void onSuccess(Object... objArr) {
                LogUtil.a("OfflineMapAutoSwitchEvent", "jumpToFeaturePage onSuccess");
                backLogCallback.onSuccess(0);
            }

            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public void onError(String str2) {
                backLogCallback.onFailure(-1, str2);
            }
        });
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void checkEventComplete(final DeviceInfo deviceInfo, final BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        if (!isRemind(deviceInfo)) {
            LogUtil.a("OfflineMapAutoSwitchEvent", "isRemind false");
            eventCompleteCallback.onResult(false);
            return;
        }
        boolean zIsSupportOfflineMap = ((DeviceFeatureSupportApi) Services.b("Module_Device_Feature", DeviceFeatureSupportApi.class)).isSupportOfflineMap(deviceInfo);
        boolean zD = eey.d(deviceInfo, FitWorkout.CATEGORY_REAL_SCENE);
        LogUtil.a("OfflineMapAutoSwitchEvent", "isSupportShow ：", Boolean.valueOf(zIsSupportOfflineMap && zD));
        if (!zIsSupportOfflineMap || !zD) {
            eventCompleteCallback.onResult(false);
            return;
        }
        if (deviceInfo.getDeviceConnectState() != 2) {
            eventCompleteCallback.onResult(readCache(deviceInfo));
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        edc.e().registerDeviceSampleListener(OfflineMapWearEngineManager.MAPKIT_PACKAGE_NAME, new DataReceiveCallback() { // from class: rku
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public final void onDataReceived(int i, DeviceInfo deviceInfo2, eec eecVar) {
                this.d.e(deviceInfo, atomicBoolean, eventCompleteCallback, countDownLatch, i, deviceInfo2, eecVar);
            }
        });
        e(deviceInfo);
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.j("OfflineMapAutoSwitchEvent", "await InterruptedException");
        }
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        LogUtil.a("OfflineMapAutoSwitchEvent", "timeout ：");
        eventCompleteCallback.onResult(readCache(deviceInfo));
    }

    /* synthetic */ void e(DeviceInfo deviceInfo, AtomicBoolean atomicBoolean, BacklogEvent.EventCompleteCallback eventCompleteCallback, CountDownLatch countDownLatch, int i, DeviceInfo deviceInfo2, eec eecVar) {
        LogUtil.a("OfflineMapAutoSwitchEvent", "addOfflineMapAutoSwitch onDataReceived:");
        boolean zB = eecVar instanceof eef ? b((eef) eecVar) : false;
        LogUtil.a("OfflineMapAutoSwitchEvent", "addOfflineMapAutoSwitch: isAutoSwitchOpen", Boolean.valueOf(zB));
        if (!zB) {
            updateVisited(deviceInfo, false);
            setCache(deviceInfo, "0");
        } else {
            setCache(deviceInfo, "1");
        }
        edc.e().unRegisterDeviceSampleListener(OfflineMapWearEngineManager.MAPKIT_PACKAGE_NAME);
        if (atomicBoolean.getAndSet(true)) {
            LogUtil.a("OfflineMapAutoSwitchEvent", "timeout ：result");
        } else {
            eventCompleteCallback.onResult(zB);
            countDownLatch.countDown();
        }
    }

    private static boolean b(eef eefVar) {
        NumberFormatException e;
        int iV;
        eeu e2;
        List<eeg> configInfoList = eefVar.getConfigInfoList();
        if (configInfoList.isEmpty()) {
            LogUtil.j("OfflineMapAutoSwitchEvent", "getConfigData sampleConfigList is empty");
            return false;
        }
        eeg eegVar = configInfoList.get(0);
        if (eegVar == null) {
            return false;
        }
        byte[] bArrE = eegVar.e();
        if (bArrE == null) {
            iV = 1;
            break;
        }
        try {
            Iterator<eew> it = new eet().b(eeq.e(bArrE)).e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    iV = 1;
                    break;
                }
                eew next = it.next();
                if (CommonUtil.v(next.e()) == 25) {
                    iV = CommonUtil.v(next.b());
                    try {
                        LogUtil.a("OfflineMapAutoSwitchEvent", "configData autoDownload:", Integer.valueOf(iV));
                        break;
                    } catch (eeu e3) {
                        e2 = e3;
                        LogUtil.e("OfflineMapAutoSwitchEvent", "configData catch TlvException", LogAnonymous.b(e2));
                    } catch (NumberFormatException e4) {
                        e = e4;
                        LogUtil.e("OfflineMapAutoSwitchEvent", "configData catch NumberFormatException", LogAnonymous.b(e));
                    }
                }
                LogUtil.e("OfflineMapAutoSwitchEvent", "configData catch TlvException", LogAnonymous.b(e2));
            }
        } catch (eeu e5) {
            e2 = e5;
            iV = 1;
        } catch (NumberFormatException e6) {
            e = e6;
            iV = 1;
        }
        LogUtil.a("OfflineMapAutoSwitchEvent", "getConfigData autoDownload: ", Integer.valueOf(iV));
        return iV == 0;
    }

    private static void e(DeviceInfo deviceInfo) {
        eeg eegVar = new eeg();
        eegVar.b(OfflineMapWearEngineManager.AUTO_DOWNLOAD_SWITCH);
        eegVar.b(2);
        eegVar.c(Long.valueOf(System.currentTimeMillis()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(eegVar);
        eef eefVar = new eef();
        eefVar.setSrcPkgName(OfflineMapWearEngineManager.MAPKIT_PACKAGE_NAME);
        eefVar.setWearPkgName(OfflineMapWearEngineManager.WEAR_PACKAGE_NAME);
        eefVar.setConfigInfoList(arrayList);
        edc.e().sendSampleConfigCommand(deviceInfo, eefVar, "OfflineMapAutoSwitchEvent");
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getBiKey() {
        return "";
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        return BaseApplication.b().getString(R.string.IDS_backlog_enable_map_auto_cache);
    }
}
