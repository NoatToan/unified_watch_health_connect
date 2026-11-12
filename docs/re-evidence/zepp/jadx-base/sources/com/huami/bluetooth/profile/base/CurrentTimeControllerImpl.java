package com.huami.bluetooth.profile.base;

import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/base/CurrentTimeControllerImpl;", "Lcom/huami/bluetooth/profile/base/CurrentTimeController;", "Lcom/huami/bluetooth/profile/Request;", "request", "", "a", "Ljava/util/Calendar;", "getTime", "calendar", "setTime", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "characteristic", "<init>", "(Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CurrentTimeControllerImpl implements CurrentTimeController {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BluetoothCharacteristic characteristic;

    public CurrentTimeControllerImpl(@NotNull BluetoothCharacteristic bluetoothCharacteristic) {
        this.characteristic = bluetoothCharacteristic;
    }

    private final boolean a(Request request) {
        return this.characteristic.sendCommandNoResponse(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
    }

    public static /* synthetic */ boolean b(CurrentTimeControllerImpl currentTimeControllerImpl, Request request, int i, Object obj) {
        if ((i & 1) != 0) {
            request = new Request();
        }
        return currentTimeControllerImpl.a(request);
    }

    @Override // com.huami.bluetooth.profile.base.CurrentTimeController
    @Nullable
    public Calendar getTime() {
        return null;
    }

    @Override // com.huami.bluetooth.profile.base.CurrentTimeController
    public boolean setTime(@NotNull Calendar calendar) {
        return a(new Request(ProfileUtils.bytesOfTime(calendar)));
    }
}
