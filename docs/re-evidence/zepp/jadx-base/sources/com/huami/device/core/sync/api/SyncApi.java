package com.huami.device.core.sync.api;

import androidx.annotation.WorkerThread;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import kotlin.Metadata;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\b\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/huami/device/core/sync/api/SyncApi;", "", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "start", "", "isRunning", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public interface SyncApi {
    boolean isRunning();

    @WorkerThread
    @NotNull
    Channel<WorkStatusDto> start() throws Exception;
}
