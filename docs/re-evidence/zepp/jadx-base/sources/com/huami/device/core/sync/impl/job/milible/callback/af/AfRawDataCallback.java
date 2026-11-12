package com.huami.device.core.sync.impl.job.milible.callback.af;

import com.huami.device.core.sync.impl.job.milible.type.AtrialFibrillationType;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmGdspRawData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0013j\b\u0012\u0004\u0012\u00020\u0002`\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/callback/af/AfRawDataCallback;", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmGdspRawData;", "", "result", "", "onFinish", "t", "onData", "", "maxTime", "", "loadOutData", "Lcom/huami/device/core/sync/impl/job/milible/type/AtrialFibrillationType;", "type", "Lcom/huami/device/core/sync/impl/job/milible/type/AtrialFibrillationType;", "", "tag", "Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "outData", "Ljava/util/ArrayList;", "Ljava/util/concurrent/CountDownLatch;", "countDownLatch", "Ljava/util/concurrent/CountDownLatch;", "<init>", "(Lcom/huami/device/core/sync/impl/job/milible/type/AtrialFibrillationType;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class AfRawDataCallback extends HMCallback<HmGdspRawData> {

    @NotNull
    private final AtrialFibrillationType type;

    @NotNull
    private final String tag = "SyncCenter-AccRawDataCallback";

    @NotNull
    private ArrayList<HmGdspRawData> outData = new ArrayList<>();

    @NotNull
    private final CountDownLatch countDownLatch = new CountDownLatch(1);

    public AfRawDataCallback(@NotNull AtrialFibrillationType atrialFibrillationType) {
        this.type = atrialFibrillationType;
    }

    @NotNull
    public final List<HmGdspRawData> loadOutData(long maxTime) throws InterruptedException {
        this.countDownLatch.await(maxTime, TimeUnit.MILLISECONDS);
        return this.outData;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onFinish(boolean result) {
        super.onFinish(result);
        HMLog.d(this.tag, "AF数据同步结束 --- " + this.type + " -- result : " + result, new Object[0]);
        this.countDownLatch.countDown();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onData(@Nullable HmGdspRawData t) {
        super.onData(t);
        HMLog.d(this.tag, "AF数据同步 --- " + this.type + " 数据量 " + t, new Object[0]);
        if (t == null) {
            return;
        }
        this.outData.add(t);
    }
}
