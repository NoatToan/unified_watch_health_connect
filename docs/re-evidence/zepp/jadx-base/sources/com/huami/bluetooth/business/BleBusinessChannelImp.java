package com.huami.bluetooth.business;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.huami.bluetooth.business.BleBusinessChannelImp;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007H\u0016R\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/business/BleBusinessChannelImp;", "Lcom/huami/bluetooth/business/IChannel;", "", "byteArray", "", "sendData", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "callback", "registerDataCallback", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "a", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "getGattPeripheral", "()Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Landroid/bluetooth/BluetoothGattCharacteristic;", "b", "Landroid/bluetooth/BluetoothGattCharacteristic;", "bleCharacteristic", "c", "Lkotlin/jvm/functions/Function1;", "dataCallback", "Ljava/util/UUID;", "serviceUUID", "characteristicUUID", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Ljava/util/UUID;Ljava/util/UUID;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BleBusinessChannelImp implements IChannel {

    @NotNull
    private static final String d = "BleBusinessChannelImp";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GattPeripheral gattPeripheral;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private BluetoothGattCharacteristic bleCharacteristic;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private Function1<? super byte[], Unit> dataCallback = a.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<byte[], Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull byte[] bArr) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    public BleBusinessChannelImp(@NotNull GattPeripheral gattPeripheral, @NotNull UUID uuid, @NotNull UUID uuid2) {
        this.gattPeripheral = gattPeripheral;
        b(this, uuid, uuid2);
    }

    private static final void b(final BleBusinessChannelImp bleBusinessChannelImp, UUID uuid, UUID uuid2) {
        BluetoothGattService service = bleBusinessChannelImp.gattPeripheral.getService(uuid);
        if (service == null) {
            Debug.fi(d, "ERROR: Please check your service uuid");
            return;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        if (characteristic == null) {
            Debug.fi(d, "ERROR: characteristic not found");
        } else {
            bleBusinessChannelImp.bleCharacteristic = characteristic;
            bleBusinessChannelImp.gattPeripheral.registerNotification(characteristic, new IGattCallback.INotifyCallback() { // from class: ky
                @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
                public final void notify(byte[] bArr) {
                    BleBusinessChannelImp.c(this.a, bArr);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(BleBusinessChannelImp bleBusinessChannelImp, byte[] bArr) {
        bleBusinessChannelImp.dataCallback.invoke(bArr);
    }

    @NotNull
    public final GattPeripheral getGattPeripheral() {
        return this.gattPeripheral;
    }

    @Override // com.huami.bluetooth.business.IChannel
    public void registerDataCallback(@NotNull Function1<? super byte[], Unit> callback) {
        this.dataCallback = callback;
    }

    @Override // com.huami.bluetooth.business.IChannel
    @Nullable
    public Object sendData(@NotNull byte[] bArr, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(getGattPeripheral().sendCommandWithWrite(this.bleCharacteristic, bArr));
    }
}
