package com.xiaomi.smarthome.core.server.internal.bluetooth;

import android.os.Bundle;
import com.xiaomi.smarthome.core.entity.bluetooth.SearchRequest;
import com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.bluetooth.SearchResponse;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.report.IReportCoreProvider;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface IBluetoothService {
    public static final int CODE_BIND = 33;
    public static final int CODE_BLE_STANDARD_AUTH_DECRYPT = 52;
    public static final int CODE_BLE_STANDARD_AUTH_ENCRYPT = 51;
    public static final int CODE_CLEAR_ALL_DISCONNECTION = 32;
    public static final int CODE_CLEAR_DISCONNECTION = 31;
    public static final int CODE_CONNECT = 1;
    public static final int CODE_DISCONNECT = 2;
    public static final int CODE_DISCONNECT_ALL = 30;
    public static final int CODE_FIND_COMBO_MAC = 37;
    public static final int CODE_GET_BLE_MESH_FIRMWARE_VERSION = 48;
    public static final int CODE_GET_BLE_STANDARD_AUTH_FIRMWARE_VERSION = 53;
    public static final int CODE_GET_ONE_TIME_PASSWORD = 47;
    public static final int CODE_INDICATE = 8;
    public static final int CODE_INDICATION = 15;
    public static final int CODE_IS_BLE_CHARACTER_EXIST = 54;
    public static final int CODE_IS_BLE_GATEWAY_CONNECTED = 46;
    public static final int CODE_MIOT_BLE_DECRYPT = 50;
    public static final int CODE_MIOT_BLE_ENCRYPT = 49;
    public static final int CODE_NOTIFY = 6;
    public static final int CODE_ONETIME_PWD_V2_INIT = 55;
    public static final int CODE_ONETIME_PWD_V2_REQUEST = 56;
    public static final int CODE_READ = 3;
    public static final int CODE_READRSSI = 10;
    public static final int CODE_REFRESH_DEVICE_STATUS = 35;
    public static final int CODE_REFRESH_GATT_CACHE = 40;
    public static final int CODE_REGISTER_BLOCK_LISTENER = 12;
    public static final int CODE_REGISTER_CHARACTER_CHANGED = 41;
    public static final int CODE_REPORTER = 36;
    public static final int CODE_REQUEST_MTU = 14;
    public static final int CODE_SECURITY_CHIP_DECRYPT = 44;
    public static final int CODE_SECURITY_CHIP_ENCRYPT = 43;
    public static final int CODE_SECURITY_CHIP_OPERATE = 45;
    public static final int CODE_UNBIND = 34;
    public static final int CODE_UNINDICATE = 9;
    public static final int CODE_UNINDICATION = 16;
    public static final int CODE_UNNOTIFY = 7;
    public static final int CODE_UNREGISTER_BLOCK_LISTENER = 13;
    public static final int CODE_UNREGISTER_CHARACTER_CHANGED = 42;
    public static final int CODE_WRITE = 4;
    public static final int CODE_WRITE_BLOCK = 11;
    public static final int CODE_WRITE_NORSP = 5;
    public static final String EXTRA_BYTE_ARRAY = "extra.byte.array";
    public static final String EXTRA_CHARACTER_UUID = "extra.character.uuid";
    public static final String EXTRA_DELAY = "extra.delay";
    public static final String EXTRA_DEVICE = "extra.device";
    public static final String EXTRA_DEVICES = "extra.devices";
    public static final String EXTRA_DEVICE_STATUS = "extra.device.status";
    public static final String EXTRA_DID = "extra.did";
    public static final String EXTRA_DIGITS = "extra.digits";
    public static final String EXTRA_DURATION = "extra.duration";
    public static final String EXTRA_FROM_RN = "extra.from.RN";
    public static final String EXTRA_INTERVAL = "extra.interval";
    public static final String EXTRA_INT_ARRAY = "extra.int.array";
    public static final String EXTRA_KEY = "extra.key";
    public static final String EXTRA_MAC = "extra.mac";
    public static final String EXTRA_MESSAGE = "extra.message";
    public static final String EXTRA_MTU = "extra.mtu";
    public static final String EXTRA_PASSWORD_COUNT = "extra.passwordcount";
    public static final String EXTRA_RESULT = "extra.result";
    public static final String EXTRA_RSSI = "extra.rssi";
    public static final String EXTRA_SCANNABLE = "extra.scannable";
    public static final String EXTRA_SERVICE_UUID = "extra.service.uuid";
    public static final String EXTRA_SUBMAC = "extra.submac";
    public static final String EXTRA_UTCDELAYTIEM = "extra.utcdelaytime";
    public static final String EXTRA_VALUE = "extra.value";

    void callBluetoothApi(String str, int i, Bundle bundle, IBleResponse iBleResponse);

    void cancelBleMeshUpgrade(String str);

    void getBluetoothCache(String str, int i, Bundle bundle);

    List<Device> getBluetoothGatewayDevices();

    void init();

    byte[] miotBleDecryptSync(String str, byte[] bArr);

    byte[] miotBleEncryptSync(String str, byte[] bArr);

    void searchBluetoothDevice(SearchRequest searchRequest, SearchResponse searchResponse);

    void searchMiioBluetoothDevice(SearchRequest searchRequest, IBleResponse iBleResponse);

    void setBleCoreProvider(IBleCoreProvider iBleCoreProvider);

    void setBluetoothCache(String str, int i, Bundle bundle);

    void setEnvironment(boolean z);

    void setGreyProvider(IBleGreyProvider iBleGreyProvider);

    void setReportCoreProvider(IReportCoreProvider iReportCoreProvider);

    void startBleMeshUpgrade(String str, String str2, String str3, String str4, IBleMeshUpgradeResponse iBleMeshUpgradeResponse);

    void startMcuUpgrade(String str, String str2, String str3, boolean z, String str4, int i, IBleMeshUpgradeResponse iBleMeshUpgradeResponse);

    void stopSearchBluetoothDevice();
}
