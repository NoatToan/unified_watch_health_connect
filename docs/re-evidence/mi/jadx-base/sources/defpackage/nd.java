package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eB!\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b\u001d\u0010\"J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\u0005J!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0013J\u0019\u0010\t\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\t\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lnd;", "La6t;", "Ln2;", "", "init", "()Z", "deInit", "Lw5;", "callback", PluginDeviceInfo.FMODEL, "(Lw5;)Z", PluginDeviceInfo.FICONOFF, "", "data", "", "timeout", "Lqe;", PluginDeviceInfo.FDESC, "([BI)Lqe;", "([B)Z", "(I)[B", "Landroid/bluetooth/BluetoothGattCharacteristic;", PluginDeviceInfo.FLOCALIZATIONS, "()Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "Lce;", "char", "Ljet;", "gattPeripheral", "<init>", "(Lce;Ljet;)V", "Ljava/util/UUID;", "serviceUuid", "charUuid", "(Ljet;Ljava/util/UUID;Ljava/util/UUID;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class nd extends a6t implements n2 {

    @NotNull
    public static final a u = new a(null);

    @NotNull
    public final ce t;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lnd$a;", "", "<init>", "()V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: nd$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012B\u001f\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lnd$a$a;", "La6t;", "Lce;", "", "init", "()Z", "deInit", "Landroid/bluetooth/BluetoothGattCharacteristic;", PluginDeviceInfo.FLOCALIZATIONS, "()Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "Ljet;", "gattPeripheral", "Ljava/util/UUID;", "serviceUuid", "charUuid", "<init>", "(Ljet;Ljava/util/UUID;Ljava/util/UUID;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class C1044a extends a6t implements ce {

            @NotNull
            public static final C1045a w = new C1045a(null);

            @NotNull
            public final UUID t;

            @NotNull
            public final UUID u;

            @Nullable
            public BluetoothGattCharacteristic v;

            /* JADX INFO: renamed from: nd$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lnd$a$a$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
            public static final class C1045a {
                public C1045a() {
                }

                public /* synthetic */ C1045a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1044a(@NotNull jet gattPeripheral, @NotNull UUID serviceUuid, @NotNull UUID charUuid) {
                super(gattPeripheral);
                Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
                Intrinsics.checkNotNullParameter(serviceUuid, "serviceUuid");
                Intrinsics.checkNotNullParameter(charUuid, "charUuid");
                this.t = serviceUuid;
                this.u = charUuid;
            }

            @Override // defpackage.a6t
            public boolean deInit() {
                t5t.d("Characteristic", "De-init " + this.t + " characteristic " + this.u + ": " + this.v);
                this.v = null;
                return true;
            }

            @Override // defpackage.ce
            @Nullable
            /* JADX INFO: renamed from: g, reason: from getter */
            public BluetoothGattCharacteristic getV() {
                return this.v;
            }

            @Override // defpackage.a6t
            public boolean init() {
                BluetoothGattService service = getService(this.t);
                this.v = service != null ? service.getCharacteristic(this.u) : null;
                t5t.d("Characteristic", "Init " + this.t + " characteristic " + this.u + ": " + this.v);
                return getV() != null;
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(@NotNull ce ceVar, @NotNull jet gattPeripheral) {
        super(gattPeripheral);
        Intrinsics.checkNotNullParameter(ceVar, "char");
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        this.t = ceVar;
    }

    @Override // defpackage.n2
    public boolean a(@NotNull final w5 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BluetoothGattCharacteristic bluetoothGattCharacteristicG = g();
        if (bluetoothGattCharacteristicG != null) {
            return registerNotification(bluetoothGattCharacteristicG, new zh.b() { // from class: c9t
                @Override // zh.b
                public final void e(byte[] bArr) {
                    callback.a(bArr);
                }
            });
        }
        return false;
    }

    @Override // defpackage.n2
    @Nullable
    public qe b(@NotNull byte[] data, int timeout) {
        Intrinsics.checkNotNullParameter(data, "data");
        BluetoothGattCharacteristic bluetoothGattCharacteristicG = g();
        if (bluetoothGattCharacteristicG != null) {
            return sendCommandWithResponse(bluetoothGattCharacteristicG, data, timeout);
        }
        return null;
    }

    @Override // defpackage.n2
    @Nullable
    public qe c(@NotNull byte[] bArr) {
        return n2.a.a(this, bArr);
    }

    @Override // defpackage.n2
    public boolean d() {
        BluetoothGattCharacteristic bluetoothGattCharacteristicG = g();
        if (bluetoothGattCharacteristicG != null) {
            return unregisterNotification(bluetoothGattCharacteristicG);
        }
        return true;
    }

    @Override // defpackage.a6t
    public boolean deInit() {
        return this.t.deInit();
    }

    @Nullable
    public final BluetoothGattCharacteristic g() {
        return this.t.getV();
    }

    @Override // defpackage.n2
    @Nullable
    public byte[] i() {
        return n2.a.a(this);
    }

    @Override // defpackage.a6t
    public boolean init() {
        return this.t.init();
    }

    @Override // defpackage.n2
    @Nullable
    public byte[] a(int timeout) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicG = g();
        if (bluetoothGattCharacteristicG != null) {
            return read(bluetoothGattCharacteristicG);
        }
        return null;
    }

    @Override // defpackage.n2
    public boolean b(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        BluetoothGattCharacteristic bluetoothGattCharacteristicG = g();
        if (bluetoothGattCharacteristicG != null) {
            return sendCommandWithNoResponse(bluetoothGattCharacteristicG, data);
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nd(@NotNull jet gattPeripheral, @NotNull UUID serviceUuid, @NotNull UUID charUuid) {
        this(new a.C1044a(gattPeripheral, serviceUuid, charUuid), gattPeripheral);
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        Intrinsics.checkNotNullParameter(serviceUuid, "serviceUuid");
        Intrinsics.checkNotNullParameter(charUuid, "charUuid");
    }
}
