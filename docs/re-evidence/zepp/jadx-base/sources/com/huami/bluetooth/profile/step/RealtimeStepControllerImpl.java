package com.huami.bluetooth.profile.step;

import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.data.DataCallback;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\t\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006H\u0016R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/step/RealtimeStepControllerImpl;", "Lcom/huami/bluetooth/profile/step/RealtimeStepController;", "", "Lcom/xiaomi/hm/health/bt/profile/base/RealtimeStep;", "a", "getStep", "Lcom/huami/bluetooth/profile/data/DataCallback;", "callback", "", "setStepCallback", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "characteristic", "<init>", "(Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class RealtimeStepControllerImpl implements RealtimeStepController {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BluetoothCharacteristic characteristic;

    public RealtimeStepControllerImpl(@NotNull BluetoothCharacteristic bluetoothCharacteristic) {
        this.characteristic = bluetoothCharacteristic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RealtimeStep a(byte[] bArr) {
        if (bArr.length < 5) {
            return null;
        }
        return RealtimeStep.parseFrom(bArr);
    }

    @Override // com.huami.bluetooth.profile.step.RealtimeStepController
    @Nullable
    public RealtimeStep getStep() {
        byte[] bArr = this.characteristic.read();
        if (bArr == null) {
            return null;
        }
        return a(bArr);
    }

    @Override // com.huami.bluetooth.profile.step.RealtimeStepController
    public boolean setStepCallback(@Nullable final DataCallback<? super RealtimeStep> callback) {
        return callback == null ? this.characteristic.unregisterNotification() : this.characteristic.registerNotification(new com.huami.bluetooth.profile.characteristic.DataCallback() { // from class: com.huami.bluetooth.profile.step.RealtimeStepControllerImpl.setStepCallback.1
            @Override // com.huami.bluetooth.profile.characteristic.DataCallback
            public void onReceived(@NotNull byte[] data) {
                RealtimeStep realtimeStepA = RealtimeStepControllerImpl.this.a(data);
                if (realtimeStepA == null) {
                    return;
                }
                callback.onReceived(realtimeStepA);
            }
        });
    }
}
