package com.huami.device.core.sync.impl.job.milible.callback;

import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.impl.job.milible.type.PressureType;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.IHMPressureDataCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/callback/PressureCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/IHMPressureDataCallback;", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "Lkotlin/collections/ArrayList;", "list", "", "onPressureData", "onPressureStart", "", "result", "onPressureStop", "", "maxAwaitTime", "", "loadOutData", "Lcom/huami/device/core/sync/impl/job/milible/type/PressureType;", "type", "Lcom/huami/device/core/sync/impl/job/milible/type/PressureType;", "", "tag", "Ljava/lang/String;", "outData", "Ljava/util/ArrayList;", "Ljava/util/concurrent/CountDownLatch;", "countDownLatch", "Ljava/util/concurrent/CountDownLatch;", "isFinish", "Z", "<init>", "(Lcom/huami/device/core/sync/impl/job/milible/type/PressureType;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class PressureCallback implements IHMPressureDataCallback {
    private boolean isFinish;

    @NotNull
    private final PressureType type;

    @NotNull
    private final String tag = "SyncCenter-PressureCallback";

    @NotNull
    private final ArrayList<HMPressureData> outData = new ArrayList<>();

    @NotNull
    private final CountDownLatch countDownLatch = new CountDownLatch(2);

    public PressureCallback(@NotNull PressureType pressureType) {
        this.type = pressureType;
    }

    @NotNull
    public final List<HMPressureData> loadOutData(long maxAwaitTime) throws SyncException, InterruptedException {
        this.countDownLatch.await(maxAwaitTime, TimeUnit.MILLISECONDS);
        if (this.isFinish) {
            return this.outData;
        }
        throw new SyncException("sync " + this.type + " error", null, 0, 6, null);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.pressure.IHMPressureDataCallback
    public void onPressureData(@NotNull ArrayList<HMPressureData> list) {
        this.outData.clear();
        this.outData.addAll(list);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.pressure.IHMPressureDataCallback
    public void onPressureStart() {
        HMLog.d(this.tag, Intrinsics.stringPlus("开始同步压力数据-- ", this.type), new Object[0]);
        this.countDownLatch.countDown();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.pressure.IHMPressureDataCallback
    public void onPressureStop(boolean result) {
        HMLog.d(this.tag, Intrinsics.stringPlus("同步数据结果-- ", this.type), new Object[0]);
        this.isFinish = result;
        this.countDownLatch.countDown();
    }
}
