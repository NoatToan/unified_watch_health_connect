package com.huami.feedback.sync.api.device;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/huami/feedback/sync/api/device/DeviceLogSyncApi;", "", "Lcom/huami/feedback/sync/api/device/DeviceType;", "deviceType", "", "fileDir", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/feedback/sync/api/device/SyncLogResult;", "syncLog", "feedback-sync-device-log-api_release"}, k = 1, mv = {1, 5, 1})
public interface DeviceLogSyncApi {
    @NotNull
    Flow<SyncLogResult> syncLog(@NotNull DeviceType deviceType, @NotNull String fileDir);
}
