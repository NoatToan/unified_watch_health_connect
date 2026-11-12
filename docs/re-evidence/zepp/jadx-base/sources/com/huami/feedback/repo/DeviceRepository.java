package com.huami.feedback.repo;

import com.huami.feedback.sync.api.DeviceLogSyncError;
import com.huami.feedback.sync.api.device.DeviceType;
import com.huami.feedback.sync.api.device.FeedbackDevice;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&J\u001b\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH&J\u001b\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000eJ\u001b\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&J%\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H¦@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/huami/feedback/repo/DeviceRepository;", "", "", "Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "getActiveDevices", "", "type", "", "connectDevice", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/feedback/sync/api/device/DeviceType;", "deviceType", "isConnected", "hasNewFirmware", "(Lcom/huami/feedback/sync/api/device/DeviceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "upgradeFirmware", "isSyncing", "isFWUpgrading", "isUsingVoiceAssistant", "isUsingMusicController", "isSupportSyncLog", "", "logDirector", "Lcom/huami/feedback/sync/api/DeviceLogSyncError;", "syncDeviceLog", "(Lcom/huami/feedback/sync/api/device/DeviceType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public interface DeviceRepository {
    @Nullable
    Object connectDevice(int i, @NotNull Continuation<? super Boolean> continuation);

    @NotNull
    List<FeedbackDevice> getActiveDevices();

    @Nullable
    Object hasNewFirmware(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation);

    boolean isConnected(@NotNull DeviceType deviceType);

    @Nullable
    Object isFWUpgrading(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation);

    boolean isSupportSyncLog(@NotNull DeviceType deviceType);

    @Nullable
    Object isSyncing(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object isUsingMusicController(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object isUsingVoiceAssistant(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object syncDeviceLog(@NotNull DeviceType deviceType, @NotNull String str, @NotNull Continuation<? super DeviceLogSyncError> continuation);

    void upgradeFirmware();
}
