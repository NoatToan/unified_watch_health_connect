package com.huami.bluetooth.profile.base;

import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.parser.ClassicDeviceInfoParser;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0011J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/base/ClassicDeviceInfoController;", "Lcom/huami/bluetooth/profile/base/DeviceInfoController;", "Lcom/huami/bluetooth/profile/Request;", "request", "", "a", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "getDeviceInfo", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "characteristic", "", "b", "Z", "isSupportNewDeviceInfo", "<init>", "(Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;Z)V", "(Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ClassicDeviceInfoController implements DeviceInfoController {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BluetoothCharacteristic characteristic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSupportNewDeviceInfo;

    public ClassicDeviceInfoController(@NotNull BluetoothCharacteristic bluetoothCharacteristic, boolean z) {
        this.characteristic = bluetoothCharacteristic;
        this.isSupportNewDeviceInfo = z;
    }

    private final byte[] a(Request request) {
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse = this.characteristic.sendCommandWithResponse(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
        if (hMNotifyResponseSendCommandWithResponse == null) {
            return null;
        }
        return hMNotifyResponseSendCommandWithResponse.getOriginResponseData();
    }

    public static /* synthetic */ byte[] b(ClassicDeviceInfoController classicDeviceInfoController, Request request, int i, Object obj) {
        if ((i & 1) != 0) {
            request = new Request();
        }
        return classicDeviceInfoController.a(request);
    }

    @Override // com.huami.bluetooth.profile.base.DeviceInfoController
    @Nullable
    public DeviceInfo getDeviceInfo() {
        byte[] bArrB = b(this, null, 1, null);
        if (bArrB == null) {
            return null;
        }
        return this.isSupportNewDeviceInfo ? ClassicNewDeviceInfoParser.INSTANCE.parse(bArrB) : ClassicDeviceInfoParser.parse(bArrB);
    }

    public /* synthetic */ ClassicDeviceInfoController(BluetoothCharacteristic bluetoothCharacteristic, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bluetoothCharacteristic, (i & 2) != 0 ? false : z);
    }

    public ClassicDeviceInfoController(@NotNull BluetoothCharacteristic bluetoothCharacteristic) {
        this(bluetoothCharacteristic, false);
    }
}
