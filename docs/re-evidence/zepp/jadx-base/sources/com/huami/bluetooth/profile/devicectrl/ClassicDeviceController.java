package com.huami.bluetooth.profile.devicectrl;

import androidx.core.app.NotificationCompat;
import com.huami.bluetooth.profile.characteristic.HMClassicBluetoothCharacteristic;
import com.xiaomi.hm.health.bt.classic.ITransport;
import com.xiaomi.hm.health.bt.classic.Protocol;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/devicectrl/ClassicDeviceController;", "Lcom/huami/bluetooth/profile/devicectrl/DeviceController;", "Lcom/xiaomi/hm/health/bt/classic/Protocol;", "protocol", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/classic/ITransport;", NotificationCompat.CATEGORY_TRANSPORT, "<init>", "(Lcom/xiaomi/hm/health/bt/classic/Protocol;Lkotlin/jvm/functions/Function0;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class ClassicDeviceController extends DeviceController {
    public ClassicDeviceController(@NotNull Protocol protocol, @NotNull Function0<? extends ITransport> function0) {
        super(new HMClassicBluetoothCharacteristic(protocol, function0));
    }
}
