package com.xiaomi.wearable.transport.queue;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.wearable.ChannelInfo;
import com.xiaomi.wearable.ChannelWriter;
import com.xiaomi.wearable.core.WearApiTask;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\tH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0011H&J\b\u0010\u0015\u001a\u00020\u0003H&¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/wearable/transport/queue/ITaskQueue;", "Lcom/xiaomi/wearable/ChannelWriter;", "enqueue", "", "apiTask", "Lcom/xiaomi/wearable/core/WearApiTask;", "removeTask", "hasTask", "isIdle", "", "onSendSuccess", "onSendFailed", "timeout", "onResponseTimeout", "onReceiveResponse", BroadcastsKt.SILENT_PUSHING_CANCEL, "callId", "", "open", Constants.EXTRA_CLOSE_TAI, "reason", "destroy", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ITaskQueue extends ChannelWriter {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void writeToChannel(@NotNull ITaskQueue iTaskQueue, @Nullable ChannelInfo channelInfo, @NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            ChannelWriter.DefaultImpls.writeToChannel(iTaskQueue, channelInfo, data);
        }
    }

    void cancel(int callId);

    void cancel(@NotNull WearApiTask apiTask);

    void close(int reason);

    void destroy();

    void enqueue(@NotNull WearApiTask apiTask);

    void hasTask(@NotNull WearApiTask apiTask);

    boolean isIdle();

    void onReceiveResponse(@NotNull WearApiTask apiTask);

    void onResponseTimeout(@NotNull WearApiTask apiTask);

    void onSendFailed(@NotNull WearApiTask apiTask, boolean timeout);

    void onSendSuccess(@NotNull WearApiTask apiTask);

    void open();

    void removeTask(@NotNull WearApiTask apiTask);
}
