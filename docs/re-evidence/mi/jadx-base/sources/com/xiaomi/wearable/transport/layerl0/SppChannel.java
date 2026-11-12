package com.xiaomi.wearable.transport.layerl0;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.spp.SppDataReceiver;
import com.xiaomi.wearable.transport.Channel;
import com.xiaomi.wearable.transport.ChannelReceiver;
import com.xiaomi.wearable.transport.layerl0.SppChannel;
import com.xiaomi.wearable.utils.ByteUtil;
import defpackage.ht3;
import defpackage.izc;
import defpackage.j7o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/wearable/transport/layerl0/SppChannel;", "Lcom/xiaomi/wearable/transport/Channel;", "Lcom/xiaomi/wearable/spp/SppDataReceiver;", "", "open", "()V", "", "data", "Lht3;", "callback", "send", "([BLht3;)V", "", "mtu", "setOptions", "(I)V", "onDataReceived", "([B)V", Constants.EXTRA_CLOSE_TAI, "getMTU", "()I", "Lcom/xiaomi/wearable/transport/ChannelReceiver;", "receiver", "setChannelDataReceiver", "(Lcom/xiaomi/wearable/transport/ChannelReceiver;)V", "Lizc;", "client", "Lizc;", "getClient", "()Lizc;", "Lcom/xiaomi/wearable/transport/ChannelReceiver;", "<init>", "(Lizc;)V", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public final class SppChannel implements Channel, SppDataReceiver {

    @NotNull
    private static final String TAG = "SppChannel";

    @NotNull
    private final izc client;
    private ChannelReceiver receiver;

    public SppChannel(@NotNull izc client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void send$lambda$0(ht3 ht3Var, int i, String str) {
        if (ht3Var != null) {
            ht3Var.onCallback(i);
        }
    }

    @Override // com.xiaomi.wearable.transport.Channel
    public void close() {
        this.client.close();
    }

    @NotNull
    public final izc getClient() {
        return this.client;
    }

    @Override // com.xiaomi.wearable.transport.Channel
    public int getMTU() {
        return 16394;
    }

    @Override // com.xiaomi.wearable.transport.Channel
    public void onDataReceived(@Nullable byte[] data) {
        if (data != null) {
            byte[] bArr = data.length >= 8 ? ByteUtil.get(data, 0, 8) : ByteUtil.get(data, 0, data.length);
            CoreExtKt.getLogger().i(TAG, "onDataReceive: " + ByteUtil.byteToString(bArr));
            ChannelReceiver channelReceiver = this.receiver;
            if (channelReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("receiver");
                channelReceiver = null;
            }
            channelReceiver.onDataReceive(data);
        }
    }

    @Override // com.xiaomi.wearable.transport.Channel
    public void open() {
        this.client.setDataReceiver(this);
    }

    @Override // com.xiaomi.wearable.transport.Channel
    public void send(@Nullable byte[] data, @Nullable final ht3 callback) {
        this.client.sendData(data, new j7o() { // from class: z6o
            @Override // defpackage.j7o
            public final void a(int i, String str) {
                SppChannel.send$lambda$0(callback, i, str);
            }
        });
    }

    @Override // com.xiaomi.wearable.transport.Channel
    public void setChannelDataReceiver(@NotNull ChannelReceiver receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        this.receiver = receiver;
    }

    @Override // com.xiaomi.wearable.transport.Channel
    public void setOptions(int mtu) {
    }
}
