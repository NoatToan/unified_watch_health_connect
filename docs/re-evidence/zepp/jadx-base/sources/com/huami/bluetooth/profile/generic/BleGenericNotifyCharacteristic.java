package com.huami.bluetooth.profile.generic;

import android.bluetooth.BluetoothGattCharacteristic;
import com.huami.bluetooth.profile.generic.BleGenericNotifyCharacteristic;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0016B\u001d\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/generic/BleGenericNotifyCharacteristic;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseProfile;", "Lcom/huami/bluetooth/profile/generic/GenericNotifyCharacteristic;", "", PointCategory.INIT, "deInit", "", "data", "", "timeout", "Lcom/huami/bluetooth/profile/generic/GenericResponse;", "send", "Lkotlin/Function0;", "Landroid/bluetooth/BluetoothGattCharacteristic;", "b", "Lkotlin/jvm/functions/Function0;", "characteristic", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Lkotlin/jvm/functions/Function0;)V", "c", "a", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BleGenericNotifyCharacteristic extends HMBaseProfile implements GenericNotifyCharacteristic {

    @Deprecated
    @NotNull
    public static final String TAG = "BleGenericNotifyCharacteristic";

    @NotNull
    private static final a c = new a(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<BluetoothGattCharacteristic> characteristic;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/bluetooth/profile/generic/BleGenericNotifyCharacteristic$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "cbData", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ CountDownLatch a;
        public final /* synthetic */ ByteArrayOutputStream b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CountDownLatch countDownLatch, ByteArrayOutputStream byteArrayOutputStream) {
            super(1);
            this.a = countDownLatch;
            this.b = byteArrayOutputStream;
        }

        public final void a(@NotNull byte[] bArr) {
            Debug.fi(BleGenericNotifyCharacteristic.TAG, Intrinsics.stringPlus("received: ", GattUtils.bytesToHexString(bArr)));
            GenericNotify genericNotify = GenericNotifyKt.toGenericNotify(bArr);
            if (genericNotify == null) {
                this.a.countDown();
                return;
            }
            this.b.write(genericNotify.getData$bluetooth_release());
            if (genericNotify.isEnd()) {
                this.a.countDown();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleGenericNotifyCharacteristic(@NotNull GattPeripheral gattPeripheral, @NotNull Function0<? extends BluetoothGattCharacteristic> function0) {
        super(gattPeripheral);
        this.characteristic = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function1 function1, byte[] bArr) {
        function1.invoke(bArr);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        return true;
    }

    @Override // com.huami.bluetooth.profile.generic.GenericNotifyCharacteristic
    @Nullable
    public GenericResponse send(@NotNull byte[] bArr) {
        return GenericNotifyCharacteristic.DefaultImpls.send(this, bArr);
    }

    @Override // com.huami.bluetooth.profile.generic.GenericNotifyCharacteristic
    @Nullable
    public GenericResponse send(@NotNull byte[] data, int timeout) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        final b bVar = new b(countDownLatch, byteArrayOutputStream);
        BluetoothGattCharacteristic bluetoothGattCharacteristicInvoke = this.characteristic.invoke();
        if (!registerNotification(bluetoothGattCharacteristicInvoke, new IGattCallback.INotifyCallback() { // from class: ny
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                BleGenericNotifyCharacteristic.c(bVar, bArr);
            }
        }) || !write(bluetoothGattCharacteristicInvoke, data)) {
            return null;
        }
        Debug.fi(TAG, Intrinsics.stringPlus("send: ", GattUtils.bytesToHexString(data)));
        try {
            countDownLatch.await(timeout, TimeUnit.MILLISECONDS);
            return GenericResponseKt.toGenericResponse(byteArrayOutputStream.toByteArray());
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
