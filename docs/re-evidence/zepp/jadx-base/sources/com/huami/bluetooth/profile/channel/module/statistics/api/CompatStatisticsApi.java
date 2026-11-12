package com.huami.bluetooth.profile.channel.module.statistics.api;

import androidx.annotation.WorkerThread;
import com.huami.bluetooth.profile.channel.module.statistics.ICompatStatisticsApi;
import com.huami.bluetooth.profile.channel.module.statistics.IOldStatisticsApiDelegate;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0017R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/statistics/api/CompatStatisticsApi;", "Lcom/huami/bluetooth/profile/channel/module/statistics/ICompatStatisticsApi;", "Lcom/xiaomi/hm/health/bt/model/HMStatisticInfo;", "getStatisticsInfo", "Lcom/huami/bluetooth/profile/channel/module/statistics/IOldStatisticsApiDelegate;", "a", "Lcom/huami/bluetooth/profile/channel/module/statistics/IOldStatisticsApiDelegate;", "delegate", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/statistics/IOldStatisticsApiDelegate;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CompatStatisticsApi implements ICompatStatisticsApi {

    @NotNull
    private static final String b = "CompatStatisticsApi";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IOldStatisticsApiDelegate delegate;

    public CompatStatisticsApi(@NotNull IOldStatisticsApiDelegate iOldStatisticsApiDelegate) {
        this.delegate = iOldStatisticsApiDelegate;
    }

    @Override // com.huami.bluetooth.profile.channel.module.statistics.ICompatStatisticsApi
    @WorkerThread
    @Nullable
    public HMStatisticInfo getStatisticsInfo() {
        HMStatisticInfo statisticsInfo = this.delegate.getStatisticsInfo();
        Debug.fi(b, Intrinsics.stringPlus("return statistic info: ", statisticsInfo));
        return statisticsInfo;
    }
}
