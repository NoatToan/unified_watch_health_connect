package com.xiaomi.wearable.transport.layerl0;

import android.os.Handler;
import com.mi.health.course.export.data.CourseConfigModel;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.client.Logger;
import com.xiaomi.wearable.transport.Channel;
import com.xiaomi.wearable.transport.ChannelReceiver;
import com.xiaomi.wearable.transport.layerl0.TransportL0;
import com.xiaomi.wearable.transport.layerl1.L1Packet;
import com.xiaomi.wearable.transport.layerl1.TransportL1;
import com.xiaomi.wearable.utils.ByteUtil;
import com.xiaomi.wearable.utils.CRCUtil;
import defpackage.ht3;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014H\u0002J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0014H\u0002J\u0016\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\fJ\u000e\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010#\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl0/TransportL0;", "Lcom/xiaomi/wearable/transport/ChannelReceiver;", "<init>", "()V", "channel", "Lcom/xiaomi/wearable/transport/Channel;", "layerL1", "Lcom/xiaomi/wearable/transport/layerl1/TransportL1;", "rxQueue", "Ljava/util/LinkedList;", "", "receiverHandler", "Landroid/os/Handler;", "sendPacket", "", "packet", "Lcom/xiaomi/wearable/transport/layerl1/L1Packet;", "performSendPacket", "data", "startIndex", "", "onSendComplete", "onDataReceive", "packetAssemble", "flushHeader", "rxQueuePush", "rxQueueSize", "rxQueuePop", MediaStoreUtil.MediaInfo.SIZE, "rxQueuePeek", "offset", CourseConfigModel.DevCmd.CMD_ACTION_SET, "transportL1", "handler", "setChannel", "resetConfig", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransportL0.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransportL0.kt\ncom/xiaomi/wearable/transport/layerl0/TransportL0\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,248:1\n1863#2,2:249\n*S KotlinDebug\n*F\n+ 1 TransportL0.kt\ncom/xiaomi/wearable/transport/layerl0/TransportL0\n*L\n152#1:249,2\n*E\n"})
public final class TransportL0 implements ChannelReceiver {

    @NotNull
    private static final String TAG = "TaskQueueV2";
    private Channel channel;
    private TransportL1 layerL1;
    private Handler receiverHandler;

    @NotNull
    private LinkedList<byte[]> rxQueue = new LinkedList<>();

    private final void flushHeader() {
        CoreExtKt.getLogger().d("TaskQueueV2", "flushHeader() called");
        while (rxQueueSize() >= 2) {
            byte[] bArrRxQueuePeek = rxQueuePeek(2, 0);
            if (bArrRxQueuePeek == null) {
                return;
            }
            if (ByteBuffer.wrap(bArrRxQueuePeek).getShort() == -23131) {
                CoreExtKt.getLogger().i("TaskQueueV2", "flushHeader: find");
                break;
            }
            rxQueuePop(1);
        }
        CoreExtKt.getLogger().i("TaskQueueV2", "flushHeader: find finish or not find finish");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDataReceive$lambda$4(TransportL0 this$0, byte[] data) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "$data");
        this$0.rxQueuePush(data);
        this$0.packetAssemble();
    }

    private final void onSendComplete(L1Packet packet) {
        TransportL1 transportL1 = this.layerL1;
        if (transportL1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layerL1");
            transportL1 = null;
        }
        transportL1.onSendComplete(packet);
    }

    private final int packetAssemble() {
        byte[] bArrRxQueuePeek;
        while (rxQueueSize() >= 8) {
            byte[] bArrRxQueuePeek2 = rxQueuePeek(8, 0);
            if (bArrRxQueuePeek2 == null) {
                CoreExtKt.getLogger().i("TaskQueueV2", "onDataReceive: headerByte = null");
                return -1;
            }
            L1Packet.Header header = L1Packet.Header.INSTANCE.get(bArrRxQueuePeek2);
            if (header.getMagic() != -23131) {
                flushHeader();
            } else {
                if (rxQueueSize() < header.getDataLength() + 8) {
                    CoreExtKt.getLogger().i("TaskQueueV2", "onDataReceive: received size < packet size");
                    return -1;
                }
                CoreExtKt.getLogger().i("TaskQueueV2", "onDataReceive: header: " + ByteUtil.byteToString(bArrRxQueuePeek2));
                TransportL1 transportL1 = null;
                if (header.getDataLength() > 0) {
                    bArrRxQueuePeek = rxQueuePeek(header.getDataLength(), 8);
                    if (bArrRxQueuePeek == null) {
                        CoreExtKt.getLogger().i("TaskQueueV2", "onDataReceive: payload is null");
                        return -1;
                    }
                    if (bArrRxQueuePeek.length != header.getDataLength()) {
                        CoreExtKt.getLogger().i("TaskQueueV2", "onDataReceive: receive data error: payload.size != header.length");
                        return -1;
                    }
                    int iCRC16 = CRCUtil.CRC16(bArrRxQueuePeek.length, bArrRxQueuePeek);
                    if (header.getCrc() != ((short) iCRC16)) {
                        CoreExtKt.getLogger().i("TaskQueueV2", "onDataReceive: receive data error: crc error, header " + ((int) header.getCrc()) + ", payload " + iCRC16);
                        rxQueuePop(1);
                        flushHeader();
                    }
                } else {
                    bArrRxQueuePeek = null;
                }
                rxQueuePop(header.getDataLength() + 8);
                TransportL1 transportL2 = this.layerL1;
                if (transportL2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layerL1");
                } else {
                    transportL1 = transportL2;
                }
                transportL1.onPacketReceive(new L1Packet(header, bArrRxQueuePeek));
            }
        }
        return 0;
    }

    private final void performSendPacket(final L1Packet packet, final byte[] data, final int startIndex) {
        Channel channel = this.channel;
        Channel channel2 = null;
        if (channel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            channel = null;
        }
        final int mtu = channel.getMTU();
        if (startIndex == 0) {
            if (data.length <= mtu) {
                Channel channel3 = this.channel;
                if (channel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("channel");
                } else {
                    channel2 = channel3;
                }
                channel2.send(data, new ht3() { // from class: y0q
                    @Override // defpackage.ht3
                    public final void onCallback(int i) {
                        TransportL0.performSendPacket$lambda$0(this.f39664a, packet, i);
                    }
                });
                return;
            }
            byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(data, 0, mtu);
            Channel channel4 = this.channel;
            if (channel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channel");
            } else {
                channel2 = channel4;
            }
            channel2.send(bArrCopyOfRange, new ht3() { // from class: z0q
                @Override // defpackage.ht3
                public final void onCallback(int i) {
                    TransportL0.performSendPacket$lambda$1(this.f40763a, packet, data, mtu, i);
                }
            });
            return;
        }
        if (data.length - startIndex <= mtu) {
            byte[] bArrCopyOfRange2 = ArraysKt___ArraysJvmKt.copyOfRange(data, startIndex, (data.length - startIndex) + startIndex);
            Channel channel5 = this.channel;
            if (channel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channel");
            } else {
                channel2 = channel5;
            }
            channel2.send(bArrCopyOfRange2, new ht3() { // from class: a1q
                @Override // defpackage.ht3
                public final void onCallback(int i) {
                    TransportL0.performSendPacket$lambda$2(this.f534a, packet, i);
                }
            });
            return;
        }
        byte[] bArrCopyOfRange3 = ArraysKt___ArraysJvmKt.copyOfRange(data, startIndex, startIndex + mtu);
        Channel channel6 = this.channel;
        if (channel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
        } else {
            channel2 = channel6;
        }
        channel2.send(bArrCopyOfRange3, new ht3() { // from class: b1q
            @Override // defpackage.ht3
            public final void onCallback(int i) {
                TransportL0.performSendPacket$lambda$3(this.f3696a, packet, data, startIndex, mtu, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performSendPacket$lambda$0(TransportL0 this$0, L1Packet packet, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(packet, "$packet");
        this$0.onSendComplete(packet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performSendPacket$lambda$1(TransportL0 this$0, L1Packet packet, byte[] data, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(packet, "$packet");
        Intrinsics.checkNotNullParameter(data, "$data");
        this$0.performSendPacket(packet, data, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performSendPacket$lambda$2(TransportL0 this$0, L1Packet packet, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(packet, "$packet");
        this$0.onSendComplete(packet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performSendPacket$lambda$3(TransportL0 this$0, L1Packet packet, byte[] data, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(packet, "$packet");
        Intrinsics.checkNotNullParameter(data, "$data");
        this$0.performSendPacket(packet, data, i + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetConfig$lambda$6(TransportL0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.rxQueue.clear();
    }

    private final byte[] rxQueuePeek(int size, int offset) {
        if (size <= 0) {
            return null;
        }
        byte[] bArr = new byte[size];
        Iterator<byte[]> it = this.rxQueue.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        int length = 0;
        while (it.hasNext() && length < size) {
            byte[] next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            byte[] bArr2 = next;
            if (offset > 0 && bArr2.length <= offset) {
                offset -= bArr2.length;
            } else {
                if (bArr2.length - offset > size - length) {
                    ArraysKt___ArraysJvmKt.copyInto(bArr2, bArr, length, offset, (size + offset) - length);
                    break;
                }
                ArraysKt___ArraysJvmKt.copyInto(bArr2, bArr, length, offset, bArr2.length);
                length += bArr2.length - offset;
                offset = 0;
            }
        }
        return bArr;
    }

    private final int rxQueuePop(int size) {
        if (size <= 0) {
            return -1;
        }
        Iterator<byte[]> it = this.rxQueue.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        int length = size;
        while (it.hasNext() && length > 0) {
            byte[] next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            byte[] bArr = next;
            if (bArr.length > length) {
                byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bArr, RangesKt___RangesKt.until(length, bArr.length));
                it.remove();
                this.rxQueue.addFirst(bArrSliceArray);
                break;
            }
            length -= bArr.length;
            it.remove();
        }
        return size - length;
    }

    private final void rxQueuePush(byte[] data) {
        this.rxQueue.addLast(data);
    }

    private final int rxQueueSize() {
        Iterator<T> it = this.rxQueue.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        return length;
    }

    @Override // com.xiaomi.wearable.transport.ChannelReceiver
    public void onDataReceive(@NotNull final byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Handler handler = this.receiverHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("receiverHandler");
            handler = null;
        }
        handler.post(new Runnable() { // from class: c1q
            @Override // java.lang.Runnable
            public final void run() {
                TransportL0.onDataReceive$lambda$4(this.f4838a, data);
            }
        });
    }

    public final void resetConfig() {
        Handler handler = this.receiverHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("receiverHandler");
            handler = null;
        }
        handler.post(new Runnable() { // from class: x0q
            @Override // java.lang.Runnable
            public final void run() {
                TransportL0.resetConfig$lambda$6(this.f38556a);
            }
        });
    }

    public final void sendPacket(@NotNull L1Packet packet) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        Logger logger = CoreExtKt.getLogger();
        short crc = packet.getHeader().getCrc();
        Channel channel = this.channel;
        if (channel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            channel = null;
        }
        logger.i("TaskQueueV2", "sendPacket() called with: packet = " + packet + "}, crc = " + ((int) crc) + ", mtu = " + channel.getMTU());
        performSendPacket(packet, packet.getBytes(), 0);
    }

    public final void set(@NotNull TransportL1 transportL1, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(transportL1, "transportL1");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.layerL1 = transportL1;
        this.receiverHandler = handler;
    }

    public final void setChannel(@NotNull Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        if (channel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            channel = null;
        }
        channel.setChannelDataReceiver(this);
    }
}
