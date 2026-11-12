package com.huami.feedback.sync.api.device;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH&J\u001b\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000eJ\u001b\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/feedback/sync/api/device/DevicesDataSource;", "", "", "Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "getActiveDevices", "Lcom/huami/feedback/sync/api/device/DeviceType;", "deviceType", "", "rootDir", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/feedback/sync/api/device/SyncLogResult;", "syncLog", "", "hasFwUpgrade", "(Lcom/huami/feedback/sync/api/device/DeviceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "startFwUpgrade", "isFwUpgrading", "isSyncing", "isVoiceAssistantAlive", "isMusicAlive", "isConnected", "isSupportSyncLog", "feedback-sync-device-log-api_release"}, k = 1, mv = {1, 5, 1})
public interface DevicesDataSource {
    @NotNull
    List<FeedbackDevice> getActiveDevices();

    @Nullable
    Object hasFwUpgrade(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation);

    boolean isConnected(@NotNull DeviceType deviceType);

    @Nullable
    Object isFwUpgrading(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object isMusicAlive(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation);

    boolean isSupportSyncLog(@NotNull DeviceType deviceType);

    @Nullable
    Object isSyncing(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object isVoiceAssistantAlive(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation);

    void startFwUpgrade();

    @NotNull
    Flow<SyncLogResult> syncLog(@NotNull DeviceType deviceType, @NotNull String rootDir);
}
