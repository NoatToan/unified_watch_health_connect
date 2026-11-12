package com.huami.bluetooth.profile.hr;

import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateControlImpl;", "Lcom/huami/bluetooth/profile/hr/HeartRateControl;", "Lcom/huami/bluetooth/profile/Request;", "request", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "a", "Lcom/huami/bluetooth/profile/Request$Command;", "command", "", "data", "", "b", "c", PointCategory.INIT, "deInit", "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Mode;", "mode", "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Operation;", "operation", "setMode", "", "minutes", "setInterval", "sendHeartbeat", "Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "getHeartRateConfig", "enableAbnormalHeartWarning", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "characteristic", "<init>", "(Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateControlImpl implements HeartRateControl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BluetoothCharacteristic characteristic;

    public HeartRateControlImpl(@NotNull BluetoothCharacteristic bluetoothCharacteristic) {
        this.characteristic = bluetoothCharacteristic;
    }

    private final HMNotifyResponse a(Request request) {
        return this.characteristic.sendCommandWithResponse(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
    }

    private final boolean b(Request.Command command, byte[] data) {
        return c(new Request(command, data));
    }

    private final boolean c(Request request) {
        return this.characteristic.sendCommandNoResponse(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
    }

    public static /* synthetic */ boolean d(HeartRateControlImpl heartRateControlImpl, Request.Command command, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return heartRateControlImpl.b(command, bArr);
    }

    @Override // com.huami.bluetooth.profile.hr.HeartRateControl
    public boolean deInit() {
        return this.characteristic.deInit();
    }

    @Override // com.huami.bluetooth.profile.hr.HeartRateControl
    public boolean enableAbnormalHeartWarning(@NotNull Request.Command command, @NotNull HeartRateControl.Operation operation) {
        return b(command, new byte[]{operation.getValue()});
    }

    @Override // com.huami.bluetooth.profile.hr.HeartRateControl
    @Nullable
    public HeartRateConfig getHeartRateConfig() {
        byte[] bArr = this.characteristic.read();
        if (bArr == null) {
            return null;
        }
        return HeartRateConfig.parserFrom(bArr);
    }

    @Override // com.huami.bluetooth.profile.hr.HeartRateControl
    public boolean init() {
        return this.characteristic.init();
    }

    @Override // com.huami.bluetooth.profile.hr.HeartRateControl
    public boolean sendHeartbeat() {
        return d(this, HeartRateCommand.Heartbeat.INSTANCE, null, 2, null);
    }

    @Override // com.huami.bluetooth.profile.hr.HeartRateControl
    public boolean setInterval(int minutes) {
        return b(HeartRateCommand.SetInterval.INSTANCE, new byte[]{(byte) minutes});
    }

    @Override // com.huami.bluetooth.profile.hr.HeartRateControl
    public boolean setMode(@NotNull HeartRateControl.Mode mode, @NotNull HeartRateControl.Operation operation) {
        return b(HeartRateCommand.SetWorkMode.INSTANCE, new byte[]{mode.getValue(), operation.getValue()});
    }
}
