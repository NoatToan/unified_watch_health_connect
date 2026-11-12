package com.huami.bluetooth.profile.gdsp;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.characteristic.DataCallback;
import com.huami.bluetooth.profile.data.TimeKt;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPType;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001e\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001c\u0010\u0017\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0007H\u0016R\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/bluetooth/profile/gdsp/GdspOption;", "Lcom/huami/bluetooth/profile/gdsp/GdspControl;", "Lcom/huami/bluetooth/profile/gdsp/GdspData;", "Lcom/huami/bluetooth/profile/Request$Command;", Constant.h, "", "data", "", "a", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "c", "Lcom/huami/bluetooth/profile/Request;", "request", GoogleApiAvailabilityLight.a, "Ljava/util/Calendar;", "calendar", "Lcom/xiaomi/hm/health/bt/profile/gdsp/HMGDSPType;", "type", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "getDataHeader", "Lkotlin/Function1;", "", "result", "startTransfer", "stopTransfer", "Lcom/huami/bluetooth/profile/characteristic/DataCallback;", "callback", "registerCallback", "unregisterCallback", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", SessionDescription.n, "b", "<init>", "(Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GdspOption implements GdspControl, GdspData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BluetoothCharacteristic control;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final BluetoothCharacteristic data;

    public GdspOption(@NotNull BluetoothCharacteristic bluetoothCharacteristic, @NotNull BluetoothCharacteristic bluetoothCharacteristic2) {
        this.control = bluetoothCharacteristic;
        this.data = bluetoothCharacteristic2;
    }

    private final boolean a(Request.Command cmd, byte[] data) {
        return this.control.sendCommandNoResponse(new Request(cmd, data).getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
    }

    public static /* synthetic */ boolean b(GdspOption gdspOption, Request.Command command, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return gdspOption.a(command, bArr);
    }

    private final HMNotifyResponse c(Request.Command cmd, byte[] data) {
        return d(new Request(cmd, data));
    }

    private final HMNotifyResponse d(Request request) {
        return this.control.sendCommandWithResponse(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
    }

    public static /* synthetic */ HMNotifyResponse e(GdspOption gdspOption, Request.Command command, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return gdspOption.c(command, bArr);
    }

    @Override // com.huami.bluetooth.profile.gdsp.GdspControl
    @Nullable
    public DataHeader getDataHeader(@NotNull Calendar calendar, @NotNull HMGDSPType type) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(type.getValue());
        byteArrayOutputStream.write(TimeKt.toBytes(calendar));
        HMNotifyResponse hMNotifyResponseC = c(GdspCommand.GetDataSize.INSTANCE, byteArrayOutputStream.toByteArray());
        if (hMNotifyResponseC != null && hMNotifyResponseC.isSuccess()) {
            return DataHeader.fromBytes(hMNotifyResponseC.getData());
        }
        return null;
    }

    @Override // com.huami.bluetooth.profile.gdsp.GdspData
    public boolean registerCallback(@NotNull DataCallback callback) {
        return this.data.registerNotification(callback);
    }

    @Override // com.huami.bluetooth.profile.gdsp.GdspControl
    public boolean startTransfer(@NotNull final Function1<? super Boolean, Unit> result) {
        this.control.registerNotification(new DataCallback() { // from class: com.huami.bluetooth.profile.gdsp.GdspOption.startTransfer.1
            @Override // com.huami.bluetooth.profile.characteristic.DataCallback
            public void onReceived(@NotNull byte[] data) {
                result.invoke(Boolean.valueOf(HMNotifyResponse.parse(data).isSuccess()));
                this.control.unregisterNotification();
            }
        });
        return b(this, GdspCommand.StartTransfer.INSTANCE, null, 2, null);
    }

    @Override // com.huami.bluetooth.profile.gdsp.GdspControl
    public boolean stopTransfer() {
        HMNotifyResponse hMNotifyResponseE = e(this, GdspCommand.StopTransfer.INSTANCE, null, 2, null);
        if (hMNotifyResponseE == null) {
            return false;
        }
        return hMNotifyResponseE.isSuccess();
    }

    @Override // com.huami.bluetooth.profile.gdsp.GdspData
    public boolean unregisterCallback() {
        return this.data.unregisterNotification();
    }
}
