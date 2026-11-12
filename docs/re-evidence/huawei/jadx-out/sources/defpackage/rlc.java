package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes17.dex */
public class rlc extends BacklogEvent {
    public rlc() {
        super(BacklogType.WECHAT_BINDING);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void onBacklogClick(String str, final BackLogCallback<Integer> backLogCallback) {
        super.onBacklogClick(str, backLogCallback);
        final DeviceInfo deviceInfoById = getDeviceInfoById(str);
        HandlerExecutor.c(new Runnable() { // from class: rlg
            @Override // java.lang.Runnable
            public final void run() {
                rlc.a(deviceInfoById, backLogCallback);
            }
        });
    }

    static /* synthetic */ void a(DeviceInfo deviceInfo, BackLogCallback backLogCallback) {
        new WechatDeviceProviderHelper(deviceInfo, HandlerExecutor.a()).b(BaseApplication.j());
        backLogCallback.onSuccess(0);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiClickParams(String str, String str2) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiClickParams(str, str2));
        popTipEventBiParams.put("Content", 7);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public Map<String, Object> getBiShowParams(int i, int i2, DeviceInfo deviceInfo) {
        Map<String, Object> popTipEventBiParams = getPopTipEventBiParams();
        popTipEventBiParams.putAll(super.getBiShowParams(i, i2, deviceInfo));
        popTipEventBiParams.put("Content", 110);
        return popTipEventBiParams;
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public String getTitle() {
        return BaseApplication.b().getString(R.string.IDS_backlog_wechat_device_binding_title);
    }

    @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent
    public void checkEventComplete(final DeviceInfo deviceInfo, final BacklogEvent.EventCompleteCallback eventCompleteCallback) {
        LogUtil.a("WechatDeviceBindEvent", "enter addWechatBinding");
        if (!isRemind(deviceInfo)) {
            LogUtil.a("WechatDeviceBindEvent", "isRemind false");
            eventCompleteCallback.onResult(false);
            return;
        }
        if (!NetworkUtil.i()) {
            boolean cache = readCache(deviceInfo);
            eventCompleteCallback.onResult(cache);
            if (cache) {
                reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
                return;
            }
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new WechatDeviceProviderHelper(deviceInfo, HandlerExecutor.a()).a(new WechatDeviceProviderHelper.CheckResultListener() { // from class: rle
            @Override // com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.CheckResultListener
            public final void onResult(boolean z) {
                this.d.e(deviceInfo, atomicBoolean, eventCompleteCallback, countDownLatch, z);
            }
        });
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.j("WechatDeviceBindEvent", "await InterruptedException");
        }
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        LogUtil.a("WechatDeviceBindEvent", "timeout ：");
        eventCompleteCallback.onResult(readCache(deviceInfo));
    }

    /* synthetic */ void e(DeviceInfo deviceInfo, AtomicBoolean atomicBoolean, BacklogEvent.EventCompleteCallback eventCompleteCallback, CountDownLatch countDownLatch, boolean z) {
        LogUtil.a("WechatDeviceBindEvent", "queryWechatBinding:", Boolean.valueOf(z));
        if (z) {
            setCache(deviceInfo, "1");
            reportBiEvent(getBiKey(), getBiShowParams(0, 1, deviceInfo));
        } else {
            setCache(deviceInfo, "0");
            updateVisited(deviceInfo, false);
        }
        if (atomicBoolean.getAndSet(true)) {
            LogUtil.a("WechatDeviceBindEvent", "timeout ：result");
        } else {
            eventCompleteCallback.onResult(z);
            countDownLatch.countDown();
        }
    }
}
