package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lce;", "", "", "init", "deInit", "Landroid/bluetooth/BluetoothGattCharacteristic;", PluginDeviceInfo.FLOCALIZATIONS, "()Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface ce {
    boolean deInit();

    @Nullable
    BluetoothGattCharacteristic g();

    boolean init();
}
