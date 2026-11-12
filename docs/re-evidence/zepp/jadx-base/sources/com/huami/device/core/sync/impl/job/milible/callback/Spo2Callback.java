package com.huami.device.core.sync.impl.job.milible.callback;

import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.impl.job.milible.type.BloodOxygenType;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0013j\b\u0012\u0004\u0012\u00020\u0003`\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/callback/Spo2Callback;", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "", "onStart", "", "result", "onFinish", "t", "", "maxAwaitTime", "loadResult", "Lcom/huami/device/core/sync/impl/job/milible/type/BloodOxygenType;", "type", "Lcom/huami/device/core/sync/impl/job/milible/type/BloodOxygenType;", "Ljava/util/concurrent/CountDownLatch;", "countDownLatch", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "outData", "Ljava/util/ArrayList;", "isFinish", "Z", "<init>", "(Lcom/huami/device/core/sync/impl/job/milible/type/BloodOxygenType;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class Spo2Callback extends HMCallback<List<? extends Spo2Data>> {
    private boolean isFinish;

    @NotNull
    private final BloodOxygenType type;

    @NotNull
    private final CountDownLatch countDownLatch = new CountDownLatch(2);

    @NotNull
    private final ArrayList<Spo2Data> outData = new ArrayList<>();

    public Spo2Callback(@NotNull BloodOxygenType bloodOxygenType) {
        this.type = bloodOxygenType;
    }

    @NotNull
    public final List<Spo2Data> loadResult(long maxAwaitTime) throws SyncException, InterruptedException {
        this.countDownLatch.await(maxAwaitTime, TimeUnit.MILLISECONDS);
        if (this.isFinish) {
            return this.outData;
        }
        throw new SyncException("sync " + this.type + " error", null, 0, 6, null);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onStart() {
        super.onStart();
        this.countDownLatch.countDown();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onFinish(boolean result) {
        super.onFinish(result);
        this.isFinish = result;
        this.countDownLatch.countDown();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onFinish(@Nullable List<? extends Spo2Data> t) {
        super.onFinish(t);
        this.outData.clear();
        if (t == null) {
            return;
        }
        this.outData.addAll(t);
    }
}
