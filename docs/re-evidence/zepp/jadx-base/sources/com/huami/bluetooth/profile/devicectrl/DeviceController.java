package com.huami.bluetooth.profile.devicectrl;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.cmdrequest.DataBuilder;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0004J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0004J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0004J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0004J\u001c\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0004J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0004J\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0004J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0004J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0004J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0004J\u001a\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0004J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0004R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/bluetooth/profile/devicectrl/DeviceController;", "", "", PointCategory.INIT, "deInit", "Lcom/huami/bluetooth/profile/Request;", "request", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "sendRequest", "Lcom/huami/bluetooth/profile/Request$Command;", "command", "", "data", "", "sendECFCommand", "Lcom/huami/bluetooth/profile/cmdrequest/DataBuilder;", "dataBuilder", "sendCommand", "sendCommandWithResponse", "sendCommandNoResponse", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "a", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "characteristic", "", "b", LogUtil.I, "initCount", "Ljava/util/concurrent/locks/ReentrantLock;", "c", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "<init>", "(Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class DeviceController {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BluetoothCharacteristic characteristic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int initCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ReentrantLock lock = new ReentrantLock();

    public DeviceController(@NotNull BluetoothCharacteristic bluetoothCharacteristic) {
        this.characteristic = bluetoothCharacteristic;
    }

    public static /* synthetic */ boolean sendCommand$default(DeviceController deviceController, Request.Command command, byte[] bArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCommand");
        }
        if ((i & 2) != 0) {
            bArr = null;
        }
        return deviceController.sendCommand(command, bArr);
    }

    public static /* synthetic */ HMNotifyResponse sendCommandWithResponse$default(DeviceController deviceController, Request.Command command, byte[] bArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCommandWithResponse");
        }
        if ((i & 2) != 0) {
            bArr = null;
        }
        return deviceController.sendCommandWithResponse(command, bArr);
    }

    public static /* synthetic */ boolean sendECFCommand$default(DeviceController deviceController, Request.Command command, byte[] bArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendECFCommand");
        }
        if ((i & 2) != 0) {
            bArr = null;
        }
        return deviceController.sendECFCommand(command, bArr);
    }

    public final void deInit() {
        this.lock.lock();
        int i = this.initCount - 1;
        this.initCount = i;
        if (i == 0) {
            this.characteristic.deInit();
        }
        this.lock.unlock();
    }

    public final void init() {
        this.lock.lock();
        if (this.initCount == 0) {
            this.characteristic.init();
        }
        this.initCount++;
        this.lock.unlock();
    }

    public final boolean sendCommand(@NotNull Request.Command command, @Nullable byte[] data) {
        return sendCommand(new Request(command, data));
    }

    public final boolean sendCommandNoResponse(@NotNull Request.Command command, @Nullable DataBuilder dataBuilder) {
        return sendCommandNoResponse(new Request(command, dataBuilder == null ? null : dataBuilder.build()).getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
    }

    @Nullable
    public final HMNotifyResponse sendCommandWithResponse(@NotNull Request.Command command, @Nullable byte[] data) {
        return sendCommandWithResponse(new Request(command, data));
    }

    public final boolean sendECFCommand(@NotNull Request.Command command, @Nullable byte[] data) {
        return sendECFCommand(new Request(command, data));
    }

    @Nullable
    public final HMNotifyResponse sendRequest(@NotNull Request request) {
        return this.characteristic.sendCommandWithResponse(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
    }

    public final boolean sendCommand(@NotNull Request.Command command, @NotNull DataBuilder dataBuilder) {
        return sendCommand(command, dataBuilder.build());
    }

    public final boolean sendCommandNoResponse(@NotNull byte[] data) {
        return this.characteristic.sendCommandNoResponse(data);
    }

    @Nullable
    public final HMNotifyResponse sendCommandWithResponse(@NotNull Request request) {
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse = this.characteristic.sendCommandWithResponse(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
        if (hMNotifyResponseSendCommandWithResponse == null) {
            return null;
        }
        return HMNotifyResponse.parse(hMNotifyResponseSendCommandWithResponse.getOriginResponseData(), request.getCmdLen());
    }

    public final boolean sendECFCommand(@NotNull Request.Command command, @NotNull DataBuilder dataBuilder) {
        return sendECFCommand(command, dataBuilder.build());
    }

    public final boolean sendCommand(@NotNull Request request) {
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse = sendCommandWithResponse(request);
        if (hMNotifyResponseSendCommandWithResponse == null) {
            return false;
        }
        return hMNotifyResponseSendCommandWithResponse.isSuccess();
    }

    public final boolean sendECFCommand(@NotNull Request request) {
        return this.characteristic.sendCommandNoResponse(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
    }

    @Nullable
    public final HMNotifyResponse sendCommandWithResponse(@NotNull Request.Command command, @NotNull DataBuilder dataBuilder) {
        return sendCommandWithResponse(command, dataBuilder.build());
    }
}
