package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes17.dex */
public class rke extends BacklogEvent {
    public rke() {
        super(BacklogType.EARPHONE_MATCHING);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void onBacklogClick(String str, final BackLogCallback<Integer> backLogCallback) {
        super.onBacklogClick(str, backLogCallback);
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            backLogCallback.onFailure(-1, "Activity is null ");
            return;
        }
        DeviceInfo deviceInfoById = getDeviceInfoById(str);
        if (deviceInfoById == null) {
            backLogCallback.onFailure(-1, "device info is null");
        } else {
            ruh.d(activityJ, deviceInfoById, new SimpleChain.Emitter() { // from class: rke.4
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public void onSuccess(Object... objArr) {
                    backLogCallback.onSuccess(0);
                    ruh.l();
                }

                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public void onError(String str2) {
                    super.onError(str2);
                    backLogCallback.onFailure(-1, str2);
                    ruh.l();
                }
            });
        }
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiClickParams(String str, String str2) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiClickParams(str, str2));
        popTipEventBiParams.put("Content", 14);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiShowParams(int i, int i2, DeviceInfo deviceInfo) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiShowParams(i, i2, deviceInfo));
        popTipEventBiParams.put("Content", 103);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        return BaseApplication.b().getString(R.string.IDS_backlog_earphone_matching_title);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void checkEventComplete(final DeviceInfo deviceInfo, final BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        if (!isRemind(deviceInfo)) {
            LogUtil.a("EarphoneMatchingEvent", "isRemind false");
            eventCompleteCallback.onResult(false);
            return;
        }
        if (!eey.d(deviceInfo, 112)) {
            LogUtil.a("EarphoneMatchingEvent", "addEarphoneMatching not support.");
            eventCompleteCallback.onResult(false);
        } else {
            if (deviceInfo.getDeviceConnectState() != 2) {
                boolean cache = readCache(deviceInfo);
                eventCompleteCallback.onResult(cache);
                if (cache) {
                    reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
                    return;
                }
                return;
            }
            ThreadPoolManager.c().a("EarphoneMatchingEvent", new Runnable() { // from class: rkj
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(deviceInfo, eventCompleteCallback);
                }
            });
        }
    }

    /* synthetic */ void b(final DeviceInfo deviceInfo, final BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        lxb.c().e(deviceInfo, new EarPhoneResponseCallback() { // from class: rkf
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
            public final void onResponse(int i, edj edjVar) {
                this.e.d(atomicBoolean, eventCompleteCallback, deviceInfo, countDownLatch, i, edjVar);
            }
        });
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.j("EarphoneMatchingEvent", "await InterruptedException");
        }
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        boolean cache = readCache(deviceInfo);
        LogUtil.a("EarphoneMatchingEvent", "timeout ：");
        eventCompleteCallback.onResult(cache);
        if (cache) {
            reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
        }
    }

    /* synthetic */ void d(AtomicBoolean atomicBoolean, BacklogEvent.EventCompleteCallback eventCompleteCallback, DeviceInfo deviceInfo, CountDownLatch countDownLatch, int i, edj edjVar) {
        if (atomicBoolean.getAndSet(true)) {
            LogUtil.a("EarphoneMatchingEvent", "timeout ：result");
            return;
        }
        if (edjVar == null || TextUtils.isEmpty(edjVar.d())) {
            eventCompleteCallback.onResult(true);
            reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
            countDownLatch.countDown();
            return;
        }
        boolean zB = lxb.c().b(edjVar.d());
        LogUtil.a("EarphoneMatchingEvent", "getEarPhoneInfoFromCached pairState:", Boolean.valueOf(zB));
        eventCompleteCallback.onResult(!zB);
        if (zB) {
            updateVisited(deviceInfo, false);
            setCache(deviceInfo, "0");
        } else {
            setCache(deviceInfo, "1");
            reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
        }
        countDownLatch.countDown();
    }
}
