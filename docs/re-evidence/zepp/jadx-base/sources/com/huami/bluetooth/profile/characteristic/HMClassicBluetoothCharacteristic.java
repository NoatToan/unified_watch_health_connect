package com.huami.bluetooth.profile.characteristic;

import androidx.core.app.NotificationCompat;
import com.xiaomi.hm.health.bt.classic.ITransport;
import com.xiaomi.hm.health.bt.classic.Protocol;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xmlywind.sdk.common.mta.PointCategory;
import defpackage.to2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/bluetooth/profile/characteristic/HMClassicBluetoothCharacteristic;", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "", PointCategory.INIT, "deInit", "Lcom/huami/bluetooth/profile/characteristic/DataCallback;", "callback", "registerNotification", "unregisterNotification", "", "data", "", "timeout", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "sendCommandWithResponse", "sendCommandNoResponse", "read", "Lcom/xiaomi/hm/health/bt/classic/Protocol;", "a", "Lcom/xiaomi/hm/health/bt/classic/Protocol;", "protocol", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/classic/ITransport;", "b", "Lkotlin/jvm/functions/Function0;", NotificationCompat.CATEGORY_TRANSPORT, "<init>", "(Lcom/xiaomi/hm/health/bt/classic/Protocol;Lkotlin/jvm/functions/Function0;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class HMClassicBluetoothCharacteristic implements BluetoothCharacteristic {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Protocol protocol;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<ITransport> transport;

    /* JADX WARN: Multi-variable type inference failed */
    public HMClassicBluetoothCharacteristic(@NotNull Protocol protocol, @NotNull Function0<? extends ITransport> function0) {
        this.protocol = protocol;
        this.transport = function0;
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        return true;
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        return true;
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    @Nullable
    public byte[] read() {
        return BluetoothCharacteristic.DefaultImpls.read(this);
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean registerNotification(@NotNull DataCallback callback) {
        ITransport iTransportInvoke = this.transport.invoke();
        if (iTransportInvoke == null) {
            return false;
        }
        return iTransportInvoke.registerNotification(this.protocol, new to2(callback));
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean sendCommandNoResponse(@NotNull byte[] data) {
        ITransport iTransportInvoke = this.transport.invoke();
        if (iTransportInvoke == null) {
            return false;
        }
        return iTransportInvoke.sendCommandNoResponse(this.protocol, data);
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    @Nullable
    public HMNotifyResponse sendCommandWithResponse(@NotNull byte[] bArr) {
        return BluetoothCharacteristic.DefaultImpls.sendCommandWithResponse(this, bArr);
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean unregisterNotification() {
        ITransport iTransportInvoke = this.transport.invoke();
        if (iTransportInvoke == null) {
            return false;
        }
        return iTransportInvoke.unregisterNotification(this.protocol);
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    @Nullable
    public byte[] read(int timeout) {
        ITransport iTransportInvoke = this.transport.invoke();
        if (iTransportInvoke == null) {
            return null;
        }
        return iTransportInvoke.read(this.protocol, timeout);
    }

    @Override // com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    @Nullable
    public HMNotifyResponse sendCommandWithResponse(@NotNull byte[] data, int timeout) {
        ITransport iTransportInvoke = this.transport.invoke();
        if (iTransportInvoke == null) {
            return null;
        }
        return iTransportInvoke.sendCommandWithResponse(this.protocol, data, timeout);
    }
}
