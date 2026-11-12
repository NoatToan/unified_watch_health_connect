package com.huami.device.core.sync.impl.sync;

import androidx.core.graphics.drawable.IconCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.device.core.sync.SyncCenterFactory;
import com.huami.device.core.sync.api.SyncStrategy;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.device.core.sync.api.type.job.LazySyncJob;
import com.huami.device.core.sync.impl.job.DefJobRunner;
import com.huami.device.core.sync.impl.job.SyncCenterExceptionHandler;
import com.huami.device.core.sync.impl.sync.inject.InjectDevice;
import com.huami.device.core.sync.impl.sync.inject.InjectJobStrategy;
import com.huami.device.core.sync.impl.sync.inject.InjectScope;
import com.huami.device.core.sync.impl.sync.inject.InjectStatusChannel;
import com.huami.device.core.sync.report.DevMode;
import com.huami.device.core.sync.report.ReportJobRunner;
import com.huami.device.core.sync.report.service.StoreServiceImpl;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0001\u001a\u001e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000\u001a\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000\u001a\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a?\u0010 \u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0080@ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u0016\u0010#\u001a\u00020\r2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u001cH\u0000\u001a\u0010\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0000\u001a\b\u0010)\u001a\u00020(H\u0000\"\u0016\u0010*\u001a\u00020&8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010+\"\u0016\u0010,\u001a\u00020&8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"", "lastTimeMs", "", "isNeedSync", "", "Lcom/huami/device/core/sync/api/type/SyncJob;", "values", "loadAllPositiveSyncJob", "loadAllLazySyncJob", "", "target", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "injectDevice", "injectJobStrategy", "job", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "channel", "injectStatusChannel", IconCompat.EXTRA_OBJ, "Lkotlinx/coroutines/CoroutineScope;", "scope", "injectScope", "createStatusChannel", "Lcom/huami/device/core/sync/api/SyncStrategy;", "jobStrategy", "Ljava/util/Queue;", "convertJobListToQueue", "jobQueue", "statusChannel", "runJobQueue", "(Ljava/util/Queue;Lkotlinx/coroutines/channels/Channel;Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jobs", "printDebugInfo", "", "e", "", "findErrorCode", "Lkotlin/coroutines/CoroutineContext;", "createSyncContext", "SYNC_DATA_TIME_INTERVAL", LogUtil.I, "capacityOfChannel", "sync-center_release"}, k = 2, mv = {1, 5, 1})
public final class ConstKt {
    public static final int SYNC_DATA_TIME_INTERVAL = 60000;
    public static final int capacityOfChannel = 100;

    @NotNull
    public static final Queue<SyncJob> convertJobListToQueue(@NotNull SyncStrategy syncStrategy, @NotNull HMBaseDevice hMBaseDevice) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(syncStrategy.loadSyncJobs(hMBaseDevice));
        return linkedList;
    }

    @NotNull
    public static final Channel<WorkStatusDto> createStatusChannel() {
        return ChannelKt.Channel(100);
    }

    @NotNull
    public static final CoroutineContext createSyncContext() {
        return JobKt__JobKt.d(null, 1, null).plus(new SyncCenterExceptionHandler());
    }

    public static final int findErrorCode(@NotNull Throwable th) {
        if (th instanceof SyncException) {
            return ((SyncException) th).getErrorCode();
        }
        return 0;
    }

    public static final void injectDevice(@NotNull Object obj, @NotNull HMBaseDevice hMBaseDevice) {
        if (obj instanceof InjectDevice) {
            ((InjectDevice) obj).onInject(hMBaseDevice);
        }
    }

    @ExperimentalCoroutinesApi
    public static final void injectJobStrategy(@NotNull Object obj) {
        if (obj instanceof InjectJobStrategy) {
            ((InjectJobStrategy) obj).onInject(SyncCenterFactory.INSTANCE.getSyncStrategy());
        }
    }

    public static final void injectScope(@NotNull Object obj, @NotNull CoroutineScope coroutineScope) {
        if (obj instanceof InjectScope) {
            ((InjectScope) obj).onInject(coroutineScope);
        }
    }

    public static final void injectStatusChannel(@NotNull Object obj, @NotNull Channel<WorkStatusDto> channel) {
        if (obj instanceof InjectStatusChannel) {
            ((InjectStatusChannel) obj).onInject(channel);
        }
    }

    public static final boolean isNeedSync(long j) {
        return !SyncCenterFactory.INSTANCE.isBackground() || System.currentTimeMillis() - j > 60000;
    }

    @NotNull
    public static final List<SyncJob> loadAllLazySyncJob(@NotNull List<? extends SyncJob> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SyncJob) obj) instanceof LazySyncJob) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<SyncJob> loadAllPositiveSyncJob(@NotNull List<? extends SyncJob> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((SyncJob) obj) instanceof LazySyncJob)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void printDebugInfo(@NotNull final Queue<SyncJob> queue) {
        HMLog.info("SyncCenter-printlnInfo", new Function0<String>() { // from class: com.huami.device.core.sync.impl.sync.ConstKt.printDebugInfo.1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "debug info =========>";
            }
        });
        HMLog.info("SyncCenter-printlnInfo", new Function0<String>() { // from class: com.huami.device.core.sync.impl.sync.ConstKt.printDebugInfo.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "一共有 " + queue.size() + " 个同步job ";
            }
        });
        for (final SyncJob syncJob : queue) {
            HMLog.debug("SyncCenter-printlnInfo", new Function0<String>() { // from class: com.huami.device.core.sync.impl.sync.ConstKt$printDebugInfo$3$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "item-> " + syncJob.findType() + " - " + ((Object) Reflection.getOrCreateKotlinClass(syncJob.getClass()).getSimpleName());
                }
            });
        }
        HMLog.info("SyncCenter-printlnInfo", new Function0<String>() { // from class: com.huami.device.core.sync.impl.sync.ConstKt.printDebugInfo.4
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "debug info <=========";
            }
        });
    }

    @Nullable
    public static final Object runJobQueue(@NotNull Queue<SyncJob> queue, @NotNull Channel<WorkStatusDto> channel, @NotNull HMBaseDevice hMBaseDevice, @NotNull CoroutineScope coroutineScope, @NotNull Continuation<? super Unit> continuation) {
        Object objRunJobQueue = (SyncCenterFactory.INSTANCE.getDevMode$sync_center_release() == DevMode.REPORT ? new ReportJobRunner(new StoreServiceImpl()) : new DefJobRunner()).runJobQueue(queue, channel, hMBaseDevice, coroutineScope, continuation);
        return objRunJobQueue == a.getCOROUTINE_SUSPENDED() ? objRunJobQueue : Unit.INSTANCE;
    }
}
