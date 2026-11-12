package com.xiaomi.wearable.transport.queue;

import com.xiaomi.onetrack.api.b;
import com.xiaomi.wearable.transport.Callback;
import com.xiaomi.wearable.transport.Channel;
import com.xiaomi.wearable.transport.layerl0.BleChannel;
import defpackage.ht2;
import defpackage.jpc;
import defpackage.lq2;
import defpackage.qf4;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/wearable/transport/queue/BleTaskQueueV2;", "Lcom/xiaomi/wearable/transport/queue/TaskQueueV2;", "Lcom/xiaomi/wearable/transport/queue/IBleOperation;", "Lcom/xiaomi/wearable/transport/Channel;", "initTaskChannel", "()Lcom/xiaomi/wearable/transport/Channel;", "", "data", "", "handleVersion", "([B)V", "Lht2;", "Ljava/lang/Void;", b.I, "enableNotifications", "(Lht2;)V", "Llq2;", "bleApiCall", "Llq2;", "Ljpc;", "getBleManager", "()Ljpc;", "bleManager", "<init>", "(Llq2;)V", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public final class BleTaskQueueV2 extends TaskQueueV2 implements IBleOperation {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final UUID notifyCharacteristicUUID;

    @NotNull
    private static final UUID serviceUUID;

    @NotNull
    private static final UUID writeCharacteristicUUID;

    @NotNull
    private final lq2 bleApiCall;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/wearable/transport/queue/BleTaskQueueV2$Companion;", "", "<init>", "()V", "serviceUUID", "Ljava/util/UUID;", "getServiceUUID", "()Ljava/util/UUID;", "writeCharacteristicUUID", "getWriteCharacteristicUUID", "notifyCharacteristicUUID", "getNotifyCharacteristicUUID", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UUID getNotifyCharacteristicUUID() {
            return BleTaskQueueV2.notifyCharacteristicUUID;
        }

        @NotNull
        public final UUID getServiceUUID() {
            return BleTaskQueueV2.serviceUUID;
        }

        @NotNull
        public final UUID getWriteCharacteristicUUID() {
            return BleTaskQueueV2.writeCharacteristicUUID;
        }
    }

    static {
        UUID MI_WEAR_SERVICE_UUID = qf4.f31472a;
        Intrinsics.checkNotNullExpressionValue(MI_WEAR_SERVICE_UUID, "MI_WEAR_SERVICE_UUID");
        serviceUUID = MI_WEAR_SERVICE_UUID;
        UUID MIWEAR_MI_SERVICE_BLE_UUID_SAR_WRITE = qf4.n;
        Intrinsics.checkNotNullExpressionValue(MIWEAR_MI_SERVICE_BLE_UUID_SAR_WRITE, "MIWEAR_MI_SERVICE_BLE_UUID_SAR_WRITE");
        writeCharacteristicUUID = MIWEAR_MI_SERVICE_BLE_UUID_SAR_WRITE;
        UUID MIWEAR_MI_SERVICE_BLE_UUID_SAR_NOTIFY = qf4.m;
        Intrinsics.checkNotNullExpressionValue(MIWEAR_MI_SERVICE_BLE_UUID_SAR_NOTIFY, "MIWEAR_MI_SERVICE_BLE_UUID_SAR_NOTIFY");
        notifyCharacteristicUUID = MIWEAR_MI_SERVICE_BLE_UUID_SAR_NOTIFY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleTaskQueueV2(@NotNull lq2 bleApiCall) {
        super(bleApiCall);
        Intrinsics.checkNotNullParameter(bleApiCall, "bleApiCall");
        this.bleApiCall = bleApiCall;
    }

    private final jpc getBleManager() {
        jpc jpcVarH = this.bleApiCall.h();
        Intrinsics.checkNotNullExpressionValue(jpcVarH, "getBleManager(...)");
        return jpcVarH;
    }

    @Override // com.xiaomi.wearable.transport.queue.IBleOperation
    public void enableNotifications(@NotNull final ht2<Void> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Channel channel = getChannel();
        Intrinsics.checkNotNull(channel, "null cannot be cast to non-null type com.xiaomi.wearable.transport.layerl0.BleChannel");
        ((BleChannel) channel).enableNotifications(new ht2<Void>() { // from class: com.xiaomi.wearable.transport.queue.BleTaskQueueV2.enableNotifications.1
            @Override // defpackage.ht2
            public void onFailed(int status) {
            }

            @Override // defpackage.ht2
            public void onResponse(final Void data) {
                BleTaskQueueV2 bleTaskQueueV2 = BleTaskQueueV2.this;
                final ht2<Void> ht2Var = response;
                bleTaskQueueV2.sendStartRequest(new Callback() { // from class: com.xiaomi.wearable.transport.queue.BleTaskQueueV2$enableNotifications$1$onResponse$1
                    @Override // com.xiaomi.wearable.transport.Callback
                    public void onCallback(int packetId, int code, String message) {
                        ht2Var.onResponse(data);
                    }
                });
            }
        });
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV2
    public void handleVersion(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskQueueV2
    @NotNull
    public Channel initTaskChannel() {
        return new BleChannel(getBleManager(), serviceUUID, writeCharacteristicUUID, notifyCharacteristicUUID);
    }
}
