package com.xiaomi.fitness.rn.sdk;

import android.os.Bundle;
import com.smarthome.core.bleconnect.BleDeviceConnectManager;
import com.smarthome.core.scan.BleSearchResponse;
import com.smarthome.core.scan.DeviceScanManager;
import com.smarthome.core.scan.SDKBleDevice;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.mijia.sdk.api.MiJiaBleBindCallback;
import com.xiaomi.fitness.mijia.sdk.api.MiJiaBleScanCallback;
import com.xiaomi.fitness.mijia.sdk.data.AdvPacket;
import com.xiaomi.fitness.mijia.sdk.data.MiJiaScanDevice;
import com.xiaomi.smarthome.core.entity.device.BtDevice;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.MiotBleAdvPacket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u0005J\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\u001bH\u0002J\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\u001eH\u0002J\u000e\u0010\u001f\u001a\u0004\u0018\u00010 *\u00020!H\u0002J\u000e\u0010\"\u001a\u0004\u0018\u00010\u0011*\u00020\u0010H\u0002¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/rn/sdk/MiJiaSdkBleCompat;", "", "<init>", "()V", "startScanDevice", "", "callback", "Lcom/xiaomi/fitness/mijia/sdk/api/MiJiaBleScanCallback;", "timeoutInMilli", "", "startBindDevice", "device", "Lcom/xiaomi/fitness/mijia/sdk/data/MiJiaScanDevice;", "Lcom/xiaomi/fitness/mijia/sdk/api/MiJiaBleBindCallback;", "stopScan", "toAdvPackage", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "Lcom/xiaomi/smarthome/core/server/internal/bluetooth/recognizer/beacon/MiotBleAdvPacket;", "getFrameControl", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$FrameControl;", "frameControl", "Lcom/xiaomi/smarthome/core/server/internal/bluetooth/recognizer/beacon/MiotBleAdvPacket$FrameControl;", "getCapability", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Capability;", "Lcom/xiaomi/smarthome/core/server/internal/bluetooth/recognizer/beacon/MiotBleAdvPacket$Capability;", "getMesh", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Mesh;", "Lcom/xiaomi/smarthome/core/server/internal/bluetooth/recognizer/beacon/MiotBleAdvPacket$Mesh;", "getEvent", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Event;", "Lcom/xiaomi/smarthome/core/server/internal/bluetooth/recognizer/beacon/MiotBleAdvPacket$Event;", "getIoCapability", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$IoCapability;", "Lcom/xiaomi/smarthome/core/server/internal/bluetooth/recognizer/beacon/MiotBleAdvPacket$IoCapability;", "toMiotBleAdvPacket", "Companion", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiJiaSdkBleCompat {

    @NotNull
    private static final String TAG = "MiJiaSdkBleCompat";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MiJiaSdkBleCompat instance = new MiJiaSdkBleCompat();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/rn/sdk/MiJiaSdkBleCompat$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/rn/sdk/MiJiaSdkBleCompat;", "getInstance", "()Lcom/xiaomi/fitness/rn/sdk/MiJiaSdkBleCompat;", "TAG", "", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MiJiaSdkBleCompat getInstance() {
            return MiJiaSdkBleCompat.instance;
        }
    }

    private MiJiaSdkBleCompat() {
    }

    private final AdvPacket.Capability getCapability(MiotBleAdvPacket.Capability capability) {
        AdvPacket.Capability capability2 = new AdvPacket.Capability(false, false, false, 0, false, 31, null);
        capability2.setConnectable(capability.connectable);
        capability2.setCentralable(capability.centralable);
        capability2.setEncryptable(capability.encryptable);
        capability2.setBindable(capability.bindable);
        capability2.setIoCapabilityable(capability.ioCapabilityable);
        return capability2;
    }

    private final AdvPacket.Event getEvent(MiotBleAdvPacket.Event event) {
        AdvPacket.Event event2 = new AdvPacket.Event(0, 0, 3, null);
        event2.setEventId(event.eventId);
        event2.setEventLength(event.eventLength);
        return event2;
    }

    private final AdvPacket.FrameControl getFrameControl(MiotBleAdvPacket.FrameControl frameControl) {
        AdvPacket.FrameControl frameControl2 = new AdvPacket.FrameControl(false, false, false, false, false, false, false, false, 0, 0, 1023, null);
        frameControl2.setEncrypted(frameControl.encrypted);
        frameControl2.setWithMac(frameControl.withMac);
        frameControl2.setWithCapability(frameControl.withCapability);
        frameControl2.setWithEvent(frameControl.withEvent);
        frameControl2.setWithMesh(frameControl.withMesh);
        frameControl2.setRegistered(frameControl.registered);
        frameControl2.setBindingCfm(frameControl.bindingCfm);
        frameControl2.setAuthMode(frameControl.authMode);
        frameControl2.setVersion(frameControl.version);
        return frameControl2;
    }

    private final AdvPacket.IoCapability getIoCapability(MiotBleAdvPacket.IoCapability ioCapability) {
        AdvPacket.IoCapability ioCapability2 = new AdvPacket.IoCapability(0, 0, 3, null);
        ioCapability2.setInputCapability(ioCapability.inputCapability);
        ioCapability2.setOutputCapability(ioCapability.outputCapability);
        return ioCapability2;
    }

    private final AdvPacket.Mesh getMesh(MiotBleAdvPacket.Mesh mesh) {
        AdvPacket.Mesh mesh2 = new AdvPacket.Mesh(0, 0, 0, 7, null);
        mesh2.setPbType(mesh.pbType);
        mesh2.setState(mesh.state);
        mesh2.setVersion(mesh.version);
        return mesh2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdvPacket toAdvPackage(MiotBleAdvPacket miotBleAdvPacket) {
        AdvPacket advPacket = new AdvPacket(null, 0, 0, null, null, null, null, null, null, null, null, 2047, null);
        MiotBleAdvPacket.FrameControl frameControl = miotBleAdvPacket.frameControl;
        Intrinsics.checkNotNullExpressionValue(frameControl, "frameControl");
        advPacket.setFrameControl(getFrameControl(frameControl));
        advPacket.setProductId(miotBleAdvPacket.productId);
        advPacket.setFrameCounter(miotBleAdvPacket.frameCounter);
        advPacket.setMac(miotBleAdvPacket.mac);
        MiotBleAdvPacket.Capability capability = miotBleAdvPacket.capability;
        advPacket.setCapability(capability != null ? getCapability(capability) : null);
        advPacket.setComboKey(miotBleAdvPacket.comboKey);
        MiotBleAdvPacket.IoCapability ioCapability = miotBleAdvPacket.ioCapability;
        advPacket.setIoCapability(ioCapability != null ? getIoCapability(ioCapability) : null);
        MiotBleAdvPacket.Event event = miotBleAdvPacket.event;
        advPacket.setEvent(event != null ? getEvent(event) : null);
        advPacket.setExtendedFrameCounter(miotBleAdvPacket.extendedFrameCounter);
        advPacket.setMessageIntegrityCheck(miotBleAdvPacket.messageIntegrityCheck);
        MiotBleAdvPacket.Mesh mesh = miotBleAdvPacket.mesh;
        advPacket.setMesh(mesh != null ? getMesh(mesh) : null);
        return advPacket;
    }

    private final MiotBleAdvPacket toMiotBleAdvPacket(AdvPacket advPacket) {
        MiJiaSDKCompat.Companion companion = MiJiaSDKCompat.INSTANCE;
        try {
            return (MiotBleAdvPacket) companion.getGson().fromJson(companion.getGson().toJson(advPacket), MiotBleAdvPacket.class);
        } catch (Exception e) {
            Logger.e(TAG, "toMiotBleAdvPacket", e);
            return null;
        }
    }

    public final void startBindDevice(@NotNull MiJiaScanDevice device, @NotNull final MiJiaBleBindCallback callback) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AdvPacket packet = device.getPacket();
        BleDeviceConnectManager.INSTANCE.startBindBleDevice(new SDKBleDevice(packet != null ? toMiotBleAdvPacket(packet) : null, device.getMac(), device.getScanRecord(), device.getModel(), device.getUpdateTime(), device.getDid()), new BleDeviceConnectManager.IBleConnectResponse() { // from class: com.xiaomi.fitness.rn.sdk.MiJiaSdkBleCompat.startBindDevice.1
            @Override // com.smarthome.core.bleconnect.BleDeviceConnectManager.IBleConnectResponse
            public void onAuthResponse(int code, Bundle args) {
                Logger.i(MiJiaSdkBleCompat.TAG, "onAuthResponse code=" + code);
                callback.onAuthResponse(code, args);
            }

            @Override // com.smarthome.core.bleconnect.BleDeviceConnectManager.IBleConnectResponse
            public void onBindResponse(int code, Bundle args) {
                Logger.i(MiJiaSdkBleCompat.TAG, "onBindResponse code=" + code);
                callback.onBindResponse(code, args);
            }

            @Override // com.smarthome.core.bleconnect.BleDeviceConnectManager.IBleConnectResponse
            public void onConnectResponse(int code, Bundle args) {
                Logger.i(MiJiaSdkBleCompat.TAG, "onConnectResponse code=" + code);
                callback.onConnectResponse(code, args);
            }

            @Override // com.smarthome.core.bleconnect.BleDeviceConnectManager.IBleConnectResponse
            public void onLastResponse(int code, Bundle args) {
                Logger.i(MiJiaSdkBleCompat.TAG, "onLastResponse code=" + code + ", " + args);
                callback.onLastResponse(code, args);
            }
        });
    }

    public final void startScanDevice(@NotNull final MiJiaBleScanCallback callback, int timeoutInMilli) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        DeviceScanManager.INSTANCE.startSearchDevice(ApplicationExtKt.getApplication(), new BleSearchResponse() { // from class: com.xiaomi.fitness.rn.sdk.MiJiaSdkBleCompat.startScanDevice.1
            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchCanceled() {
                Logger.i(MiJiaSdkBleCompat.TAG, "onSearchCanceled");
                new RuntimeException();
                callback.onScanCanceled();
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchStarted() {
                Logger.i(MiJiaSdkBleCompat.TAG, "onSearchStarted");
                callback.onScanStarted();
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchStopped() {
                Logger.i(MiJiaSdkBleCompat.TAG, "onSearchStopped");
                callback.onScanStopped();
            }

            @Override // com.smarthome.core.scan.BleSearchResponse
            public void onDeviceFounded(SDKBleDevice device) {
                Intrinsics.checkNotNullParameter(device, "device");
                Logger.i(MiJiaSdkBleCompat.TAG, "onDeviceFounded, SDKBleDevice(" + device + ")");
                MiotBleAdvPacket mPacket = device.getMPacket();
                AdvPacket advPackage = mPacket != null ? MiJiaSdkBleCompat.this.toAdvPackage(mPacket) : null;
                String mac = device.getMac();
                byte[] scanRecord = device.getScanRecord();
                String model = device.getModel();
                if (model == null) {
                    model = "";
                }
                callback.onDeviceFounded(new MiJiaScanDevice(advPackage, mac, scanRecord, model, device.getUpdateTime(), device.getDid()));
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onDeviceFounded(BtDevice p0) {
                Logger.i(MiJiaSdkBleCompat.TAG, "onDeviceFounded, BtDevice(" + p0 + ")");
            }
        }, timeoutInMilli);
    }

    public final void stopScan() {
        DeviceScanManager.INSTANCE.stopSearch();
    }
}
