package com.miot.rn.plugin.rnevent;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.onetrack.c.i;
import com.xiaomi.phonenum.data.AccountCertification;
import com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.rn.constants.MiotNativeModuleConstants;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTUtils;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import defpackage.y8j;
import defpackage.zxc;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class RNEventReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f10259a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, Integer> f10260b = new HashMap();
    public final WeakReference<zxc> c;

    public RNEventReceiver(zxc zxcVar) {
        this.c = new WeakReference<>(zxcVar);
    }

    public final int a(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return -1;
        }
        if (networkInfo.getDetailedState() == NetworkInfo.DetailedState.DISCONNECTED) {
            return 0;
        }
        NetworkInfo.DetailedState detailedState = networkInfo.getDetailedState();
        NetworkInfo.DetailedState detailedState2 = NetworkInfo.DetailedState.CONNECTED;
        if (detailedState == detailedState2 && AccountCertification.Source.SOURCE_TYPE_OPERATOR_MOBILE.equals(networkInfo.getTypeName())) {
            return 1;
        }
        return (networkInfo.getDetailedState() == detailedState2 && NetworkUtils.NETWORK_TYPE_WIFI.equals(networkInfo.getTypeName())) ? 2 : -1;
    }

    public boolean b(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        Integer num = this.f10260b.get(str);
        if (num != null && num.intValue() == z) {
            return true;
        }
        this.f10260b.put(str, Integer.valueOf(z ? 1 : 0));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        NetworkInfo networkInfo;
        String address;
        WritableMap writableMapCreateMap = Arguments.createMap();
        zxc zxcVar = this.c.get();
        if (zxcVar == null || intent == null) {
            return;
        }
        if ("action.more.rename.notify".equals(intent.getAction())) {
            writableMapCreateMap.putString("newName", intent.getStringExtra("extra.name"));
            writableMapCreateMap.putString("result", intent.getStringExtra(IBluetoothService.EXTRA_RESULT));
            writableMapCreateMap.putString("did", intent.getStringExtra(IBluetoothService.EXTRA_DID));
            str = "deviceNameChanged_36621";
        } else {
            if ("com.xiaomi.smarthome.bluetooth.connect_status_changed".equals(intent.getAction())) {
                boolean z = 16 == intent.getIntExtra("key_connect_status", 0);
                String stringExtra = intent.getStringExtra("key_device_address");
                writableMapCreateMap.putString("mac", stringExtra);
                if (b(stringExtra, z)) {
                    return;
                } else {
                    writableMapCreateMap.putBoolean("isConnected", z);
                }
            } else {
                if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction())) {
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    address = bluetoothDevice != null ? bluetoothDevice.getAddress() : "";
                    writableMapCreateMap.putString("mac", address);
                    if (b(address, false)) {
                        return;
                    } else {
                        writableMapCreateMap.putBoolean("isConnected", false);
                    }
                } else if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
                    boolean z2 = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1) == 12;
                    BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    address = bluetoothDevice2 != null ? bluetoothDevice2.getAddress() : "";
                    writableMapCreateMap.putString("mac", address);
                    if (b(address, z2)) {
                        return;
                    } else {
                        writableMapCreateMap.putBoolean("isConnected", z2);
                    }
                } else if (MiotNativeModuleConstants.STARTSCAN_CALLBACK.equals(intent.getAction())) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        writableMapCreateMap.merge(Arguments.fromBundle(extras));
                    }
                    str = "bluetoothDeviceDiscovered_36621";
                } else if (MiotNativeModuleConstants.DISCOVERSERVICES_CALLBACK.equals(intent.getAction())) {
                    writableMapCreateMap.putString("mac", intent.getStringExtra(MiotNativeModuleConstants.EMIT_MAC));
                    writableMapCreateMap.putArray("foundUUIDs", Arguments.fromArray(intent.getStringArrayExtra(MiotNativeModuleConstants.EMIT_UUID)));
                    str = "bluetoothSeviceDiscovered_36621";
                } else if (MiotNativeModuleConstants.DISCOVERCHARACTERISTICS_CALLBACK.equals(intent.getAction())) {
                    writableMapCreateMap.putString("mac", intent.getStringExtra(MiotNativeModuleConstants.EMIT_MAC));
                    writableMapCreateMap.putString("serviceUUID", intent.getStringExtra(MiotNativeModuleConstants.EMIT_SERVICEID));
                    writableMapCreateMap.putArray("foundUUIDs", Arguments.fromArray(intent.getStringArrayExtra(MiotNativeModuleConstants.EMIT_UUID)));
                    str = "bluetoothCharacteristicDiscovered_36621";
                } else if ("com.xiaomi.smarthome.bluetooth.character_changed".equals(intent.getAction())) {
                    writableMapCreateMap.putString("mac", intent.getStringExtra("key_device_address"));
                    writableMapCreateMap.putString("serviceUUID", intent.getSerializableExtra("key_service_uuid").toString());
                    UUID uuid = (UUID) intent.getSerializableExtra("key_character_uuid");
                    if (BluetoothConstants.CHARACTER_BLE_SPEC_READ.equals(uuid)) {
                        return;
                    }
                    writableMapCreateMap.putString("characteristicUUID", uuid.toString());
                    writableMapCreateMap.putString("value", MIOTUtils.byte2String(intent.getByteArrayExtra("key_character_value")));
                    str = "bluetoothCharacteristicValueChanged_36621";
                } else if (MiotNativeModuleConstants.DEVICESTATUSCHANGED.equals(intent.getAction())) {
                    writableMapCreateMap.putString("subcribeId", intent.getStringExtra(MiotNativeModuleConstants.EMIT_SUBID));
                    writableMapCreateMap.putString("did", intent.getStringExtra(MiotNativeModuleConstants.EMIT_DID));
                    writableMapCreateMap.putString("data", intent.getStringExtra(MiotNativeModuleConstants.EMIT_DATA));
                    str = "deviceRecievedMessages_36621";
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if (intent.getExtras() != null) {
                        try {
                            networkInfo = (NetworkInfo) intent.getExtras().get("networkInfo");
                        } catch (Exception unused) {
                            networkInfo = null;
                        }
                    } else {
                        networkInfo = null;
                    }
                    writableMapCreateMap.putInt("networkState", a(networkInfo));
                    str = "cellPhoneNetworkStateChanged_36621";
                } else if (BluetoothConstants.ACTION_DEVICE_STATUS_CHANGED.equals(intent.getAction())) {
                    String stringExtra2 = intent.getStringExtra("did");
                    writableMapCreateMap.putMap("newStatus", Arguments.fromBundle(intent.getBundleExtra("deviceStatus")));
                    writableMapCreateMap.putString("did", stringExtra2);
                    RnPluginLog.d("device status changed");
                    str = "deviceStatusChanged_36621";
                } else if (MiotNativeModuleConstants.DEVICE_PINCODE_SWITCH_CHANGED.equals(intent.getAction())) {
                    String stringExtra3 = intent.getStringExtra("did");
                    Bundle bundleExtra = intent.getBundleExtra("switchStatus");
                    if (bundleExtra != null) {
                        WritableMap writableMapFromBundle = Arguments.fromBundle(bundleExtra);
                        writableMapCreateMap.putString("did", stringExtra3);
                        writableMapCreateMap.putMap("switchStatus", writableMapFromBundle);
                        RnPluginLog.d("device pincode switch changed");
                    }
                    str = "pinCodeSwitchChanged_36621";
                } else if (BluetoothConstants.ACTION_FIRMWARE_HAS_NEW_VERSION.equals(intent.getAction())) {
                    writableMapCreateMap.putString("currentVersion", intent.getStringExtra("current_version"));
                    writableMapCreateMap.putString("latestVersion", intent.getStringExtra("latest_version"));
                    writableMapCreateMap.putString("did", intent.getStringExtra("did"));
                    writableMapCreateMap.putString("mcu_version", intent.getStringExtra("mcu_version"));
                    str = "bleDeviceFirmwareNeedUpgrade_36621";
                } else if ("com.xiaomi.smarthome.ble.spec.notify".equals(intent.getAction())) {
                    String stringExtra4 = intent.getStringExtra("packageName");
                    if (!TextUtils.equals(stringExtra4, context.getPackageName())) {
                        RnPluginLog.addFrameworkLog("receive spec notify from other package " + stringExtra4 + " ,ignore");
                        return;
                    }
                    writableMapCreateMap.putString("result", intent.getStringExtra("json"));
                    str = "BLESpecNotifyActionEvent_36621";
                } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                    DeviceStat deviceStat = y8j.a().getDeviceStat();
                    writableMapCreateMap.putString("mac", deviceStat != null ? deviceStat.mac : "");
                    writableMapCreateMap.putString(i.d, "bluetoothStatusChanged_36621");
                    ?? r10 = 12 == intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0) ? 1 : 0;
                    long j = (long) r10;
                    if (this.f10259a == j) {
                        return;
                    }
                    this.f10259a = j;
                    writableMapCreateMap.putBoolean("isEnabled", r10);
                    str = "bluetoothStatusChanged_36621";
                } else {
                    str = "";
                }
            }
            str = "bluetoothConnectionStatusChanged_36621";
        }
        RnPluginLog.addFrameworkLog("sendEvent eventName: " + str + "  action: " + intent.getAction() + " data: " + writableMapCreateMap.toString());
        zxcVar.sendEvent(str, writableMapCreateMap);
    }
}
