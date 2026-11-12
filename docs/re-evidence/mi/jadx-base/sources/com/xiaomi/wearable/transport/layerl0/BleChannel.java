package com.xiaomi.wearable.transport.layerl0;

import android.os.Handler;
import android.os.HandlerThread;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.transport.Channel;
import com.xiaomi.wearable.transport.ChannelReceiver;
import com.xiaomi.wearable.transport.layerl0.BleChannel;
import com.xiaomi.wearable.transport.queue.IBleOperation;
import com.xiaomi.wearable.utils.ByteUtil;
import defpackage.ht2;
import defpackage.ht3;
import defpackage.jpc;
import defpackage.snr;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B'\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010*\u001a\u00020&¢\u0006\u0004\b3\u00104J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010.R \u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl0/BleChannel;", "Lcom/xiaomi/wearable/transport/Channel;", "Lcom/xiaomi/wearable/transport/queue/IBleOperation;", "", "registerNotificationCallback", "()Z", "", "registerNotificationResponse", "()V", "unregisterNotificationResponses", "open", "Lht2;", "Ljava/lang/Void;", b.I, "enableNotifications", "(Lht2;)V", "", "data", "Lht3;", "callback", "send", "([BLht3;)V", "", "mtu", "setOptions", "(I)V", "onDataReceived", "([B)V", Constants.EXTRA_CLOSE_TAI, "getMTU", "()I", "Lcom/xiaomi/wearable/transport/ChannelReceiver;", "receiver", "setChannelDataReceiver", "(Lcom/xiaomi/wearable/transport/ChannelReceiver;)V", "Ljpc;", "bleManager", "Ljpc;", "Ljava/util/UUID;", "serviceUUID", "Ljava/util/UUID;", "writeUUID", "notifyUUID", "Landroid/os/Handler;", "channelHandler", "Landroid/os/Handler;", "Lcom/xiaomi/wearable/transport/ChannelReceiver;", "mNotificationResponse", "Lht2;", "mNotificationsEnabled", "Z", "<init>", "(Ljpc;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)V", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public final class BleChannel implements Channel, IBleOperation {

    @NotNull
    private static final String TAG = "BleChannel";

    @NotNull
    private final jpc bleManager;

    @NotNull
    private Handler channelHandler;

    @Nullable
    private ht2<byte[]> mNotificationResponse;
    private boolean mNotificationsEnabled;

    @NotNull
    private final UUID notifyUUID;
    private ChannelReceiver receiver;

    @NotNull
    private final UUID serviceUUID;

    @NotNull
    private final UUID writeUUID;

    /* JADX INFO: renamed from: com.xiaomi.wearable.transport.layerl0.BleChannel$send$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/wearable/transport/layerl0/BleChannel$send$1", "Lht2;", "Ljava/lang/Void;", "data", "", "onResponse", "(Ljava/lang/Void;)V", "", "status", "onFailed", "(I)V", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
    public static final class C34801 implements ht2<Void> {
        final /* synthetic */ ht3 $callback;

        public C34801(ht3 ht3Var) {
            this.$callback = ht3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onFailed$lambda$1(ht3 ht3Var) {
            if (ht3Var != null) {
                ht3Var.onCallback(-7);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onResponse$lambda$0(ht3 ht3Var) {
            if (ht3Var != null) {
                ht3Var.onCallback(0);
            }
        }

        @Override // defpackage.ht2
        public void onFailed(int status) {
            Handler handler = BleChannel.this.channelHandler;
            final ht3 ht3Var = this.$callback;
            handler.post(new Runnable() { // from class: oq2
                @Override // java.lang.Runnable
                public final void run() {
                    BleChannel.C34801.onFailed$lambda$1(ht3Var);
                }
            });
        }

        @Override // defpackage.ht2
        public void onResponse(Void data) {
            Handler handler = BleChannel.this.channelHandler;
            final ht3 ht3Var = this.$callback;
            handler.post(new Runnable() { // from class: pq2
                @Override // java.lang.Runnable
                public final void run() {
                    BleChannel.C34801.onResponse$lambda$0(ht3Var);
                }
            });
        }
    }

    public BleChannel(@NotNull jpc bleManager, @NotNull UUID serviceUUID, @NotNull UUID writeUUID, @NotNull UUID notifyUUID) {
        Intrinsics.checkNotNullParameter(bleManager, "bleManager");
        Intrinsics.checkNotNullParameter(serviceUUID, "serviceUUID");
        Intrinsics.checkNotNullParameter(writeUUID, "writeUUID");
        Intrinsics.checkNotNullParameter(notifyUUID, "notifyUUID");
        this.bleManager = bleManager;
        this.serviceUUID = serviceUUID;
        this.writeUUID = writeUUID;
        this.notifyUUID = notifyUUID;
        new HandlerThread(TAG).start();
        this.channelHandler = new Handler(snr.a());
    }

    private final boolean registerNotificationCallback() {
        return this.bleManager.f(this.serviceUUID, this.notifyUUID);
    }

    private final void registerNotificationResponse() {
        if (this.mNotificationResponse != null) {
            return;
        }
        ht2<byte[]> ht2Var = new ht2<byte[]>() { // from class: com.xiaomi.wearable.transport.layerl0.BleChannel.registerNotificationResponse.1
            @Override // defpackage.ht2
            public void onFailed(int status) {
            }

            @Override // defpackage.ht2
            public void onResponse(byte[] data) {
                BleChannel.this.onDataReceived(data);
            }
        };
        this.mNotificationResponse = ht2Var;
        this.bleManager.l(this.serviceUUID, this.notifyUUID, ht2Var);
    }

    private final void unregisterNotificationResponses() {
        ht2<byte[]> ht2Var = this.mNotificationResponse;
        if (ht2Var != null) {
            this.bleManager.d(this.serviceUUID, this.notifyUUID, ht2Var);
            this.mNotificationResponse = null;
        }
    }

    @Override // com.xiaomi.wearable.transport.Channel
    public void close() {
        this.mNotificationsEnabled = false;
        unregisterNotificationResponses();
    }

    @Override // com.xiaomi.wearable.transport.queue.IBleOperation
    public void enableNotifications(@NotNull ht2<Void> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (this.mNotificationsEnabled) {
            response.onResponse(null);
        } else {
            this.mNotificationsEnabled = true;
            this.bleManager.p(this.serviceUUID, this.notifyUUID, response);
        }
    }

    @Override // com.xiaomi.wearable.transport.Channel
    public int getMTU() {
        return this.bleManager.o() - 3;
    }

    @Override // com.xiaomi.wearable.transport.Channel
    public void onDataReceived(@Nullable byte[] data) {
        CoreExtKt.getLogger().d(TAG, "onRead() called with: data = " + ByteUtil.byteToString(data));
        if (data != null) {
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
        boolean zA = this.bleManager.a(this.serviceUUID, this.writeUUID);
        CoreExtKt.getLogger().i(TAG, "open: hasCharacteristic: " + zA);
        if (registerNotificationCallback()) {
            registerNotificationResponse();
        }
    }

    @Override // com.xiaomi.wearable.transport.Channel
    public void send(@Nullable byte[] data, @Nullable ht3 callback) {
        this.bleManager.g(this.serviceUUID, this.writeUUID, data, new C34801(callback));
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
