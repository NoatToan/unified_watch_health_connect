package com.huami.device.core.sync.report;

import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.type.SyncJob;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J?\u0010\r\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0003H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/device/core/sync/report/JobRunner;", "", "Ljava/util/Queue;", "Lcom/huami/device/core/sync/api/type/SyncJob;", "jobQueue", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "statusChannel", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "runJobQueue", "(Ljava/util/Queue;Lkotlinx/coroutines/channels/Channel;Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "job", "runItem", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public interface JobRunner {
    void runItem(@NotNull SyncJob job);

    @Nullable
    Object runJobQueue(@NotNull Queue<SyncJob> queue, @NotNull Channel<WorkStatusDto> channel, @NotNull HMBaseDevice hMBaseDevice, @NotNull CoroutineScope coroutineScope, @NotNull Continuation<? super Unit> continuation);
}
