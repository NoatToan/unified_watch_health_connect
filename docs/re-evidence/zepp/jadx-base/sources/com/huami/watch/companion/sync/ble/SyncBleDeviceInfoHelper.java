package com.huami.watch.companion.sync.ble;

import android.content.Context;
import com.huami.network.hmnetwork.webapi.HMWebParameter;
import com.huami.wallet.ui.utils.AnalyticConst;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.sync.BaseSyncHelper;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class SyncBleDeviceInfoHelper extends BaseSyncHelper {
    private static final String f = "Sync-BLE-DeviceInfo";
    private String e;

    public static SyncBleDeviceInfoHelper getHelper(Context context) {
        SyncBleDeviceInfoHelper syncBleDeviceInfoHelper = (SyncBleDeviceInfoHelper) BaseSyncHelper.getHelper(context, null, SyncBleDeviceInfoHelper.class);
        syncBleDeviceInfoHelper.e = null;
        return syncBleDeviceInfoHelper;
    }

    public SyncBleDeviceInfoHelper address(String str) {
        this.e = str;
        return this;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        DeviceManager manager = DeviceManager.getManager(this.mContext);
        String str = this.e;
        Device currentDevice = str == null ? manager.getCurrentDevice() : manager.find(str);
        if (currentDevice == null) {
            Log.w(f, "Device [" + this.e + "] is Null, Abort!!", new Object[0]);
            return false;
        }
        Log.d(f, "Sync Device: " + currentDevice, new Object[0]);
        SyncUtil.waitDeviceChannelAvailable(this.mContext, currentDevice, 30);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice == null) {
            return false;
        }
        String address = hMSmartWatchDevice.getBluetoothDevice().getAddress();
        if (!currentDevice.address().equals(address)) {
            Log.d(f, "BleDevice: " + hMSmartWatchDevice + "[" + address + "] not Match, Abort!!", new Object[0]);
            return false;
        }
        Map<String, String> smartWatchDeviceInfoSync = hMSmartWatchDevice.getSmartWatchDeviceInfoSync();
        Log.d(f, "Get Ble DeviceInfo: " + smartWatchDeviceInfoSync, new Object[0]);
        if (smartWatchDeviceInfoSync == null) {
            return false;
        }
        String str2 = smartWatchDeviceInfoSync.get("cpuid");
        String str3 = smartWatchDeviceInfoSync.get("sn");
        boolean zEquals = "mcu".equals(smartWatchDeviceInfoSync.get("mode"));
        String str4 = smartWatchDeviceInfoSync.get("rom_ver");
        String str5 = smartWatchDeviceInfoSync.get("model");
        String str6 = smartWatchDeviceInfoSync.get("huami_model");
        currentDevice.setCpuId(str2);
        currentDevice.setSN(str3);
        currentDevice.setBindingState(0);
        currentDevice.setBound(true);
        currentDevice.setOverseaEdition(false);
        currentDevice.setCplc(AnalyticConst.ParamKey.CPLC);
        currentDevice.setMcuMode(zEquals);
        currentDevice.info().setBuildNumber(str4);
        currentDevice.info().setModelNumber(str5);
        currentDevice.info().setHuamiModel(str6);
        currentDevice.info().setHuamiBuildNum(0);
        currentDevice.info().setExperienceMode(false);
        currentDevice.info().setAndroidDId("AndroidDeviceId");
        currentDevice.info().setLocalLanguage(HMWebParameter.PARAM_LANGUAGE);
        currentDevice.info().setLocalRegion("Region");
        currentDevice.info().setBuildType("BuildType");
        manager.save(currentDevice);
        return true;
    }
}
