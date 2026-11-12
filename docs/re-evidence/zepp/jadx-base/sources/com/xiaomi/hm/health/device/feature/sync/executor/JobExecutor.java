package com.xiaomi.hm.health.device.feature.sync.executor;

import androidx.annotation.WorkerThread;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.exception.ConfigException;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.device.core.sync.impl.sync.inject.InjectDevice;
import com.huami.device.core.sync.impl.sync.inject.InjectScope;
import com.huami.device.core.sync.impl.sync.inject.InjectStatusChannel;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0002\b\tJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/executor/JobExecutor;", "", "", "Lcom/huami/device/core/sync/api/type/SyncJob;", "jobs", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", Constant.METHOD_EXECUTE, "Companion", "DefJobExecutor", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface JobExecutor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/executor/JobExecutor$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "device", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/xiaomi/hm/health/device/feature/sync/executor/JobExecutor;", "newExecutor", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final String TAG = "JobExecutor";

        private Companion() {
        }

        @WorkerThread
        @NotNull
        public final JobExecutor newExecutor(@NotNull HMBaseBleDevice device, @NotNull CoroutineScope scope) throws Exception {
            try {
                return new DefJobExecutor(device, scope);
            } catch (Throwable unused) {
                throw new ConfigException("config error", null, 2, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/executor/JobExecutor$DefJobExecutor;", "Lcom/xiaomi/hm/health/device/feature/sync/executor/JobExecutor;", "Lcom/huami/device/core/sync/api/type/SyncJob;", "job", "", "config", "", "jobs", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", Constant.METHOD_EXECUTE, "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "device", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;Lkotlinx/coroutines/CoroutineScope;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class DefJobExecutor implements JobExecutor {

        @NotNull
        private final HMBaseBleDevice device;

        @NotNull
        private final CoroutineScope scope;

        public DefJobExecutor(@NotNull HMBaseBleDevice hMBaseBleDevice, @NotNull CoroutineScope coroutineScope) {
            this.device = hMBaseBleDevice;
            this.scope = coroutineScope;
        }

        private final void config(SyncJob job) throws ConfigException {
            if (job instanceof InjectDevice) {
                ((InjectDevice) job).onInject(this.device);
            }
            if (job instanceof InjectScope) {
                ((InjectScope) job).onInject(this.scope);
            }
        }

        @Override // com.xiaomi.hm.health.device.feature.sync.executor.JobExecutor
        @NotNull
        public Channel<WorkStatusDto> execute(@NotNull Iterable<? extends SyncJob> jobs) {
            Channel<WorkStatusDto> channelChannel$default = ChannelKt.Channel$default(200, null, null, 6, null);
            try {
                for (SyncJob syncJob : jobs) {
                    if (syncJob instanceof InjectStatusChannel) {
                        ((InjectStatusChannel) syncJob).onInject(channelChannel$default);
                    }
                    config(syncJob);
                    try {
                        syncJob.start();
                    } catch (Exception e) {
                        HMLog.error$default("JobExecutor", null, e, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.executor.JobExecutor$DefJobExecutor$execute$1
                            @Override // kotlin.jvm.functions.Function0
                            @Nullable
                            public final String invoke() {
                                return "error of start item.";
                            }
                        }, 2, null);
                    }
                }
                SendChannel.DefaultImpls.close$default(channelChannel$default, null, 1, null);
                return channelChannel$default;
            } catch (Throwable th) {
                SendChannel.DefaultImpls.close$default(channelChannel$default, null, 1, null);
                throw th;
            }
        }
    }

    @NotNull
    Channel<WorkStatusDto> execute(@NotNull Iterable<? extends SyncJob> jobs);
}
