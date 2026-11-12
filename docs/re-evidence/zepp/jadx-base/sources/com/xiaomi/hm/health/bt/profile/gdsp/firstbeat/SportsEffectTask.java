package com.xiaomi.hm.health.bt.profile.gdsp.firstbeat;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.proto.SportEfect;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmGdspRawData;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeatData;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.IHMFirstbeatDataCallback;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/firstbeat/SportsEffectTask;", "", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/BleFirstbeatData;", "outData", "", "b", "Ljava/util/Calendar;", "a", "start", "", "byteArray", "onRawData", "Ljava/util/Calendar;", "startTime", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/IHMFirstbeatDataCallback;", "c", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/IHMFirstbeatDataCallback;", "dataCallback", "", GoogleApiAvailabilityLight.a, LogUtil.I, "dataType", "<init>", "(Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/IHMFirstbeatDataCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SportsEffectTask {

    @NotNull
    private static final String e = "SportsEffectJob";
    private static final long f = 30000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Calendar startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HMMiLiProDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IHMFirstbeatDataCallback dataCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int dataType = 59;

    public SportsEffectTask(@NotNull Calendar calendar, @NotNull HMMiLiProDevice hMMiLiProDevice, @NotNull IHMFirstbeatDataCallback iHMFirstbeatDataCallback) {
        this.startTime = calendar;
        this.device = hMMiLiProDevice;
        this.dataCallback = iHMFirstbeatDataCallback;
    }

    private final Calendar a() {
        Debug.fi(e, "ready to sync firstbeat data");
        return this.startTime;
    }

    private final void b(BleFirstbeatData outData) {
        this.dataCallback.onFirstbeatData(outData);
    }

    public final void onRawData(@Nullable byte[] byteArray) {
        Object objM3845constructorimpl;
        if (byteArray != null) {
            if (!(byteArray.length == 0)) {
                try {
                    Result.Companion companion = Result.Companion;
                    Debug.fi(e, "同步到训练效果数据" + byteArray.length + " ,开始解析");
                    Debug.fi(e, Intrinsics.stringPlus("训练效果数据:", ByteArrayKt.toHexString(byteArray)));
                    b(SportsEffectTaskKt.convertToBleFirstbeatData(SportEfect.SportEffectMessage.parseFrom(byteArray), a().getTimeInMillis() / ((long) 1000)));
                    objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    Debug.fi(e, Intrinsics.stringPlus("解析SportEffect数据异常:", thM3848exceptionOrNullimpl));
                    return;
                }
                return;
            }
        }
        Debug.fi(e, "没有同步到SportEffect数据");
    }

    public final void start() throws InterruptedException {
        Debug.fi(e, "Start sync sport effect.");
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        this.device.startSyncRawData(a(), this.dataType, new HMCallback<HmGdspRawData>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.firstbeat.SportsEffectTask.start.1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean ret) {
                if (!ret) {
                    Debug.fi(SportsEffectTask.e, "sync first beat data finished.");
                }
                this.dataCallback.onFinish(ret);
                countDownLatch.countDown();
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onProgress(@Nullable Progress progress) {
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onStart() {
                countDownLatch.countDown();
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onData(@Nullable HmGdspRawData t) {
                this.onRawData(t == null ? null : t.getRawData());
                countDownLatch.countDown();
            }
        });
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
    }
}
