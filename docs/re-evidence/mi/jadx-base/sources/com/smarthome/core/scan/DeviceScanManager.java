package com.smarthome.core.scan;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.smarthome.core.SDKBleCoreProvider;
import com.smarthome.core.device.SmartDeviceInfo;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.core.entity.bluetooth.SearchRequest;
import com.xiaomi.smarthome.core.entity.device.BtDevice;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.LocalSearchResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.IPCChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.SpecNotifyChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.SpecWriteChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.StandardAuthChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.MiotBleAdvPacket;
import com.xiaomi.smarthome.core.server.internal.device.BluetoothDeviceSearch;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import defpackage.aje;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018J \u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/smarthome/core/scan/DeviceScanManager;", "", "()V", "BLE_SEARCH_BROADCAST", "", "SEARCH_TIME_OUT", "", "TAG", "bleScanDevice", "", "Lcom/smarthome/core/scan/SDKBleDevice;", "mainHandler", "Landroid/os/Handler;", "addDeviceToResult", "", "device", "getBleSearchResult", "", "initContext", "context", "Landroid/content/Context;", "notifyAddChooseDevice", "saveBleDeviceInfo", "info", "Lcom/smarthome/core/device/SmartDeviceInfo;", "startSearchDevice", b.I, "Lcom/smarthome/core/scan/BleSearchResponse;", "timeout", "", "stopSearch", "smarthome-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DeviceScanManager {

    @NotNull
    public static final String BLE_SEARCH_BROADCAST = "bleSearchBroadcast";
    public static final long SEARCH_TIME_OUT = 120000;

    @NotNull
    public static final String TAG = "smartCoreTest";

    @NotNull
    public static final DeviceScanManager INSTANCE = new DeviceScanManager();

    @NotNull
    private static Map<String, SDKBleDevice> bleScanDevice = new LinkedHashMap();

    @NotNull
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    private DeviceScanManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addDeviceToResult(SDKBleDevice device) {
        if (device.getMPacket() == null || device.getScanRecord() == null) {
            Intrinsics.stringPlus("device message is not complete: ", device);
            return;
        }
        if (bleScanDevice.containsKey(device.getMac())) {
            SDKBleDevice sDKBleDevice = bleScanDevice.get(device.getMac());
            if (sDKBleDevice != null && StringsKt__StringsJVMKt.equals$default(sDKBleDevice.getMac(), device.getMac(), false, 2, null)) {
                sDKBleDevice.setScanRecord(device.getScanRecord());
                sDKBleDevice.setMPacket(device.getMPacket());
                sDKBleDevice.setUpdateTime(System.currentTimeMillis());
            }
        } else {
            String mac = device.getMac();
            if (mac != null) {
                bleScanDevice.put(mac, device);
            }
        }
        Intrinsics.stringPlus("device added: ", device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyAddChooseDevice() {
        aje.b(MiJiaEnvironment.getAppContext()).d(new Intent(BLE_SEARCH_BROADCAST));
    }

    @NotNull
    public final synchronized List<SDKBleDevice> getBleSearchResult() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, SDKBleDevice> entry : bleScanDevice.entrySet()) {
            entry.getKey();
            SDKBleDevice value = entry.getValue();
            if (System.currentTimeMillis() - value.getUpdateTime() < 120000) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    public final void initContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BluetoothContextManager.setContext(context, true);
        BluetoothService.getInstance(context);
        BluetoothCache.reloadCache();
        BluetoothService.getInstance(context).setBleCoreProvider(new SDKBleCoreProvider());
        IPCChannelManager.getInstance().init();
        StandardAuthChannelManager.getInstance().init();
        SpecNotifyChannelManager.getInstance().init();
        SpecWriteChannelManager.getInstance().init();
    }

    public final void saveBleDeviceInfo(@NotNull SmartDeviceInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        BluetoothCache.setPropProductId(info.getMac(), info.getPid());
        BluetoothCache.setPropToken(info.getMac(), info.getToken());
        BluetoothCache.setPropDid(info.getMac(), info.getDid());
    }

    public final void startSearchDevice(@NotNull Context context, @Nullable final BleSearchResponse response, int timeout) {
        Intrinsics.checkNotNullParameter(context, "context");
        SearchRequest searchRequestBuild = new SearchRequest.Builder().searchBluetoothLeDevice(timeout / 2, 2).build();
        Intrinsics.checkNotNullExpressionValue(searchRequestBuild, "Builder()\n            .s…, 2)\n            .build()");
        BluetoothDeviceSearch.getInstance().searchMiioBluetoothDevice(searchRequestBuild, new LocalSearchResponse() { // from class: com.smarthome.core.scan.DeviceScanManager.startSearchDevice.1
            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchCanceled() {
                BleSearchResponse bleSearchResponse = response;
                if (bleSearchResponse != null) {
                    bleSearchResponse.onSearchCanceled();
                }
                DeviceScanManager.INSTANCE.notifyAddChooseDevice();
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchStarted() {
                BleSearchResponse bleSearchResponse = response;
                if (bleSearchResponse == null) {
                    return;
                }
                bleSearchResponse.onSearchStarted();
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchStopped() {
                BleSearchResponse bleSearchResponse = response;
                if (bleSearchResponse != null) {
                    bleSearchResponse.onSearchStopped();
                }
                DeviceScanManager.INSTANCE.notifyAddChooseDevice();
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onDeviceFounded(@NotNull BtDevice device) {
                Intrinsics.checkNotNullParameter(device, "device");
                if (BluetoothLog.isShowSearchLog()) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("BLEDeviceManager onDeviceFounded %s", Arrays.copyOf(new Object[]{device}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                    BluetoothLog.v(str);
                }
                MiotBleAdvPacket packet = device.getPacket();
                String str2 = device.mac;
                byte[] scanRecord = device.getScanRecord();
                String str3 = device.model;
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str4 = device.did;
                Intrinsics.checkNotNullExpressionValue(str4, "device.did");
                SDKBleDevice sDKBleDevice = new SDKBleDevice(packet, str2, scanRecord, str3, jCurrentTimeMillis, str4);
                DeviceScanManager.INSTANCE.addDeviceToResult(sDKBleDevice);
                BleSearchResponse bleSearchResponse = response;
                if (bleSearchResponse == null) {
                    return;
                }
                bleSearchResponse.onDeviceFounded(sDKBleDevice);
            }
        });
    }

    public final void stopSearch() {
        BluetoothDeviceSearch.getInstance().stopSearchBluetoothDevice();
        mainHandler.removeCallbacksAndMessages(null);
    }
}
