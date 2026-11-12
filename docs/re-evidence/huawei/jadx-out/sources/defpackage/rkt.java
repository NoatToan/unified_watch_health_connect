package defpackage;

import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.init.OfflineMapInitManager;
import com.huawei.maps.offlinedata.health.init.OnCheckUpdatesListener;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import health.compact.a.Services;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes17.dex */
public class rkt extends BacklogEvent {
    public rkt() {
        super(BacklogType.OFFLINE_MAP_UPDATE);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void onBacklogClick(String str, final BackLogCallback<Integer> backLogCallback) {
        super.onBacklogClick(str, backLogCallback);
        rpq.c(FeatureType.OFFLINE_MAP).jumpToFeaturePage(getDeviceInfoById(str), new SimpleChain.Emitter() { // from class: rkt.5
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public void onSuccess(Object... objArr) {
                LogUtil.a("OfflineMapUpdateEvent", "jumpToFeaturePage onSuccess");
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
            LogUtil.a("OfflineMapUpdateEvent", "isRemind false");
            eventCompleteCallback.onResult(false);
            return;
        }
        boolean zIsSupportOfflineMap = ((DeviceFeatureSupportApi) Services.b("Module_Device_Feature", DeviceFeatureSupportApi.class)).isSupportOfflineMap(deviceInfo);
        LogUtil.a("OfflineMapUpdateEvent", "isSupportShow ：", Boolean.valueOf(zIsSupportOfflineMap));
        if (!zIsSupportOfflineMap) {
            eventCompleteCallback.onResult(false);
            return;
        }
        if (deviceInfo.getDeviceConnectState() != 2) {
            eventCompleteCallback.onResult(readCache(deviceInfo));
            return;
        }
        rdo.b().a(BaseApplication.getContext(), deviceInfo.getDeviceUdid());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        OfflineMapInitManager.getInstance().checkForUpdates(com.huawei.haf.application.BaseApplication.b(), deviceInfo.getDeviceUdid(), new OnCheckUpdatesListener() { // from class: rks
            @Override // com.huawei.maps.offlinedata.health.init.OnCheckUpdatesListener
            public final void onResult(boolean z) {
                this.f47425a.b(deviceInfo, atomicBoolean, eventCompleteCallback, countDownLatch, z);
            }
        });
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.j("OfflineMapUpdateEvent", "await InterruptedException");
        }
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        boolean cache = readCache(deviceInfo);
        LogUtil.a("OfflineMapUpdateEvent", "timeout cache result：", Boolean.valueOf(cache));
        eventCompleteCallback.onResult(cache);
    }

    /* synthetic */ void b(DeviceInfo deviceInfo, AtomicBoolean atomicBoolean, BacklogEvent.EventCompleteCallback eventCompleteCallback, CountDownLatch countDownLatch, boolean z) {
        LogUtil.a("OfflineMapUpdateEvent", "addOfflineMapUpdate needUpdate:", Boolean.valueOf(z));
        if (!z) {
            updateVisited(deviceInfo, false);
            setCache(deviceInfo, "0");
        } else {
            setCache(deviceInfo, "1");
        }
        if (atomicBoolean.getAndSet(true)) {
            LogUtil.a("OfflineMapUpdateEvent", "timeout ：result");
        } else {
            eventCompleteCallback.onResult(z);
            countDownLatch.countDown();
        }
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getBiKey() {
        return "";
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        return com.huawei.haf.application.BaseApplication.b().getString(R.string.IDS_backlog_offline_map_update);
    }
}
