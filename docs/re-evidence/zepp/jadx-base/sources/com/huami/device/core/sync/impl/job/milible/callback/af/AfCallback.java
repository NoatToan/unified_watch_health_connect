package com.huami.device.core.sync.impl.job.milible.callback.af;

import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.impl.job.milible.type.AtrialFibrillationType;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmAfCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmAfData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0013j\b\u0012\u0004\u0012\u00020\u0003`\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/callback/af/AfCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmAfCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmAfData;", "t", "", "onResultData", "", "result", "onFinish", "", "maxTime", "loadOutData", "Lcom/huami/device/core/sync/impl/job/milible/type/AtrialFibrillationType;", "type", "Lcom/huami/device/core/sync/impl/job/milible/type/AtrialFibrillationType;", "", "tag", "Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "outData", "Ljava/util/ArrayList;", "Ljava/util/concurrent/CountDownLatch;", "countDownLatch", "Ljava/util/concurrent/CountDownLatch;", "isFinish", "Z", "<init>", "(Lcom/huami/device/core/sync/impl/job/milible/type/AtrialFibrillationType;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class AfCallback extends HmAfCallback {

    @NotNull
    private final CountDownLatch countDownLatch;
    private boolean isFinish;

    @NotNull
    private final ArrayList<HmAfData> outData;

    @NotNull
    private final String tag;

    @NotNull
    private final AtrialFibrillationType type;

    public AfCallback(@NotNull AtrialFibrillationType atrialFibrillationType) {
        super(17);
        this.type = atrialFibrillationType;
        this.tag = "SyncCenter-AfCallback";
        this.outData = new ArrayList<>();
        this.countDownLatch = new CountDownLatch(1);
    }

    @NotNull
    public final List<HmAfData> loadOutData(long maxTime) throws SyncException, InterruptedException {
        this.countDownLatch.await(maxTime, TimeUnit.MILLISECONDS);
        if (this.isFinish) {
            return this.outData;
        }
        throw new SyncException("type : " + this.type + " sync fail.", null, 0, 6, null);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onFinish(boolean result) {
        super.onFinish(result);
        HMLog.d(this.tag, Intrinsics.stringPlus("AF数据同步结束 --- ", this.type), new Object[0]);
        this.isFinish = result;
        this.countDownLatch.countDown();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.raw.HmRawDataCallback
    public void onResultData(@NotNull List<? extends HmAfData> t) {
        super.onResultData(t);
        HMLog.d(this.tag, "AF数据同步 --- " + this.type + " 数据量 " + t.size(), new Object[0]);
        this.outData.addAll(t);
    }
}
