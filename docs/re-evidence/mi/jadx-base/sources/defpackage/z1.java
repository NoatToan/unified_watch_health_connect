package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001d\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lz1;", "La6t;", "Ltc;", "", "init", "()Z", "deInit", "", "data", "", "timeout", "Lvc;", PluginDeviceInfo.FMODEL, "([BI)Lvc;", "Ljet;", "gattPeripheral", "Lkotlin/Function0;", "Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "<init>", "(Ljet;Lkotlin/jvm/functions/Function0;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class z1 extends a6t implements tc {

    @NotNull
    public static final a u = new a(null);

    @NotNull
    public final Function0<BluetoothGattCharacteristic> t;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lz1$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cbData", "", PluginDeviceInfo.FMODEL, "([B)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ CountDownLatch t;
        public final /* synthetic */ ByteArrayOutputStream u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CountDownLatch countDownLatch, ByteArrayOutputStream byteArrayOutputStream) {
            super(1);
            this.t = countDownLatch;
            this.u = byteArrayOutputStream;
        }

        public final void a(@NotNull byte[] cbData) throws IOException {
            Intrinsics.checkNotNullParameter(cbData, "cbData");
            t5t.d("BleGenericNotifyCharacteristic", "received: " + tet.x(cbData));
            GenericNotify genericNotifyA = uc.a(cbData);
            if (genericNotifyA == null) {
                this.t.countDown();
                return;
            }
            this.u.write(genericNotifyA.getData());
            if (genericNotifyA.b()) {
                this.t.countDown();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) throws IOException {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z1(@NotNull jet gattPeripheral, @NotNull Function0<? extends BluetoothGattCharacteristic> characteristic) {
        super(gattPeripheral);
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        this.t = characteristic;
    }

    @Override // defpackage.tc
    @Nullable
    public GenericResponse a(@NotNull byte[] bArr) {
        return tc.a.a(this, bArr);
    }

    @Override // defpackage.a6t
    public boolean deInit() {
        return true;
    }

    @Override // defpackage.a6t
    public boolean init() {
        return true;
    }

    @Override // defpackage.tc
    @Nullable
    public GenericResponse a(@NotNull byte[] data, int timeout) {
        Intrinsics.checkNotNullParameter(data, "data");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        final b bVar = new b(countDownLatch, byteArrayOutputStream);
        BluetoothGattCharacteristic bluetoothGattCharacteristicInvoke = this.t.invoke();
        if (!registerNotification(bluetoothGattCharacteristicInvoke, new zh.b() { // from class: dht
            @Override // zh.b
            public final void e(byte[] bArr) {
                z1.a(bVar, bArr);
            }
        }) || !write(bluetoothGattCharacteristicInvoke, data)) {
            return null;
        }
        t5t.d("BleGenericNotifyCharacteristic", "send: " + tet.x(data));
        try {
            countDownLatch.await(timeout, TimeUnit.MILLISECONDS);
            return wc.a(byteArrayOutputStream.toByteArray());
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public static final void a(Function1 tmp0, byte[] bArr) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(bArr);
    }
}
