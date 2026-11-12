package com.xiaomi.wearable.transport;

import com.xiaomi.continuity.channel.Packet;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.wearable.transport.queue.TaskDataReceiver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0004H&¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/wearable/transport/ITransport;", Packet.TAG, "", "init", "", "prepare", "callback", "Lcom/xiaomi/wearable/transport/Callback;", "sendPacket", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "(Ljava/lang/Object;Lcom/xiaomi/wearable/transport/Callback;)V", "setTaskDataReceiver", "receiver", "Lcom/xiaomi/wearable/transport/queue/TaskDataReceiver;", "setChannel", "channel", "Lcom/xiaomi/wearable/transport/Channel;", "reset", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ITransport<Packet> {
    void init();

    void prepare(@Nullable Callback callback);

    void reset();

    void sendPacket(Packet p, @Nullable Callback callback);

    void setChannel(@NotNull Channel channel);

    void setTaskDataReceiver(@NotNull TaskDataReceiver<Packet> receiver);
}
