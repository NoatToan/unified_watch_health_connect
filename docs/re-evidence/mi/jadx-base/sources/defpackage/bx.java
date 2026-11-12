package defpackage;

import android.bluetooth.BluetoothGattService;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lbx;", "", "Ljet;", "gattPeripheral", "Ldj;", PluginDeviceInfo.FMODEL, "(Ljet;)Ldj;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class bx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bx f4686a = new bx();

    @JvmStatic
    @Nullable
    public static final dj a(@NotNull jet gattPeripheral) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        BluetoothGattService bluetoothGattServiceP = gattPeripheral.p(a6t.UUID_SERVICE_MILI_SERVICE);
        if ((bluetoothGattServiceP != null ? bluetoothGattServiceP.getCharacteristic(wss.c) : null) == null) {
            return new sm(gattPeripheral);
        }
        t5t.d("WeatherFactory", "old protocol");
        return new wss(gattPeripheral);
    }
}
