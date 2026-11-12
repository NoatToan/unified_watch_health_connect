package com.xiaomi.smarthome.library.bluetooth.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import com.xiaomi.smarthome.ble_core.R;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;
import com.xiaomi.smarthome.library.common.util.ListUtils;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.shop.utils.ToastUtil;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class BluetoothUtils extends BluetoothContextManager {
    private static BluetoothAdapter mBluetoothAdapter;
    private static BluetoothManager mBluetoothManager;

    public static boolean checkBluetoothPermission() {
        return BluetoothPermissionUtil.checkBluetoothPermission(BluetoothContextManager.getContext());
    }

    public static boolean closeBluetooth() {
        BluetoothAdapter bluetoothAdapter;
        if (!isBluetoothEnabledInKuailian() || (bluetoothAdapter = getBluetoothAdapter()) == null) {
            return false;
        }
        if (checkBluetoothPermission()) {
            return bluetoothAdapter.disable();
        }
        MiJiaLog.writeLogOnAll(LogType.KUAILIAN, ProductList.ProductInfo.BLE_TYPE, "closeBluetooth  no permission!");
        return false;
    }

    public static BluetoothAdapter getBluetoothAdapter() {
        if (mBluetoothAdapter == null) {
            mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        }
        return mBluetoothAdapter;
    }

    public static BluetoothManager getBluetoothManager() {
        if (!isBleSupported()) {
            return null;
        }
        if (mBluetoothManager == null) {
            mBluetoothManager = (BluetoothManager) BluetoothContextManager.getContext().getSystemService("bluetooth");
        }
        return mBluetoothManager;
    }

    public static int getBluetoothState() {
        return getBluetoothAdapter().getState();
    }

    public static List<BluetoothSearchResult> getBondedBluetoothClassicDevices() {
        ArrayList arrayList = new ArrayList();
        if (!checkBluetoothPermission()) {
            return arrayList;
        }
        for (BluetoothDevice bluetoothDevice : getBondedRawBluetoothClassicDevices()) {
            BluetoothSearchResult bluetoothSearchResult = new BluetoothSearchResult(bluetoothDevice);
            bluetoothSearchResult.setClassicDevice();
            bluetoothSearchResult.setName(bluetoothDevice.getName());
            arrayList.add(bluetoothSearchResult);
        }
        return arrayList;
    }

    public static List<BluetoothDevice> getBondedRawBluetoothClassicDevices() {
        Set<BluetoothDevice> bondedDevices;
        BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
        ArrayList arrayList = new ArrayList();
        if (checkBluetoothPermission() && bluetoothAdapter != null && (bondedDevices = bluetoothAdapter.getBondedDevices()) != null) {
            arrayList.addAll(bondedDevices);
        }
        return arrayList;
    }

    public static List<BluetoothSearchResult> getConnectedBluetoothLeDevices() {
        ArrayList arrayList = new ArrayList();
        List<BluetoothDevice> connectedRawBluetoothLeDevices = getConnectedRawBluetoothLeDevices();
        if (checkBluetoothPermission() && !ListUtils.isEmpty(connectedRawBluetoothLeDevices)) {
            for (BluetoothDevice bluetoothDevice : connectedRawBluetoothLeDevices) {
                BluetoothSearchResult bluetoothSearchResult = new BluetoothSearchResult(bluetoothDevice);
                bluetoothSearchResult.setBleDevice();
                bluetoothSearchResult.setName(bluetoothDevice.getName());
                arrayList.add(bluetoothSearchResult);
            }
        }
        return arrayList;
    }

    public static List<BluetoothDevice> getConnectedRawBluetoothLeDevices() {
        BluetoothManager bluetoothManager = getBluetoothManager();
        if (bluetoothManager != null && checkBluetoothPermission()) {
            return bluetoothManager.getConnectedDevices(7);
        }
        return ListUtils.getEmptyList();
    }

    @TargetApi(18)
    public static int getConnectionState(String str) {
        if (!TextUtils.isEmpty(str) && isBleSupported()) {
            BluetoothDevice remoteDevice = getRemoteDevice(str);
            try {
                if (checkBluetoothPermission()) {
                    return getBluetoothManager().getConnectionState(remoteDevice, 7);
                }
                return -1;
            } catch (NullPointerException e) {
                MiJiaLog.writeLogOnAll(LogType.KUAILIAN, ProductList.ProductInfo.BLE_TYPE, "getConnectionState error:" + e);
            }
        }
        return -1;
    }

    public static BluetoothDevice getRemoteDevice(String str) {
        if (!TextUtils.isEmpty(str)) {
            BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
            try {
                if (bluetoothAdapter != null) {
                    try {
                        return bluetoothAdapter.getRemoteDevice(str);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String getType(int i) {
        if (i != 1) {
            return i != 2 ? "unknown" : "ble";
        }
        return "classic";
    }

    @TargetApi(18)
    public static boolean isBleDeviceConnected(String str) {
        if (checkBluetoothPermission() && !TextUtils.isEmpty(str) && isBleSupported()) {
            try {
                return getBluetoothManager().getConnectionState(getRemoteDevice(str), 7) == 2;
            } catch (NullPointerException e) {
                MiJiaLog.writeLogOnAll(LogType.KUAILIAN, ProductList.ProductInfo.BLE_TYPE, "getConnectionState error:" + e);
            }
        }
        return false;
    }

    @TargetApi(18)
    public static boolean isBleDeviceDisconnected(String str) {
        if (!TextUtils.isEmpty(str) && isBleSupported()) {
            try {
                return checkBluetoothPermission() && getBluetoothManager().getConnectionState(getRemoteDevice(str), 7) == 0;
            } catch (NullPointerException e) {
                MiJiaLog.writeLogOnAll(LogType.KUAILIAN, ProductList.ProductInfo.BLE_TYPE, "getConnectionState error:" + e);
            }
        }
        return false;
    }

    public static boolean isBleSupported() {
        return BluetoothContextManager.getContext() != null && BluetoothContextManager.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public static boolean isBluetoothEnabled() {
        BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
        return (bluetoothAdapter == null || !isBluetoothHalfOpen()) && bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    public static boolean isBluetoothEnabledInKuailian() {
        BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    public static boolean isBluetoothHalfOpen() {
        return Settings.Global.getInt(BluetoothContextManager.getContext().getContentResolver(), "bluetooth_restricte_state", 0) == 1;
    }

    private static boolean isClassicDeviceBonded(BluetoothDevice bluetoothDevice) {
        return checkBluetoothPermission() && bluetoothDevice != null && bluetoothDevice.getBondState() == 12;
    }

    public static boolean isDeviceConnectedOrBonded(BluetoothSearchResult bluetoothSearchResult) {
        if (bluetoothSearchResult.isBleDevice()) {
            return isBleDeviceConnected(bluetoothSearchResult.getDevice());
        }
        if (bluetoothSearchResult.isClassicDevice()) {
            return isClassicDeviceBonded(bluetoothSearchResult.getDevice());
        }
        return false;
    }

    public static void openBluetooth(Context context) {
        openBluetooth(context, 16);
    }

    public static boolean openBluetoothSilently() {
        if (!isBluetoothEnabled()) {
            if (isBluetoothHalfOpen()) {
                Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
                intent.addFlags(268435456);
                BluetoothContextManager.getContext().startActivity(intent);
                return true;
            }
            BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
            if (bluetoothAdapter == null || !checkBluetoothPermission()) {
                return false;
            }
            try {
                return bluetoothAdapter.enable();
            } catch (Exception e) {
                MiJiaLog.writeLogOnAll(LogType.KUAILIAN, ProductList.ProductInfo.BLE_TYPE, "enable error:" + e);
            }
        }
        return false;
    }

    public static void openBluetoothWithRequstCode(Context context) {
        if (checkBluetoothPermission() && !isBluetoothEnabled()) {
            try {
                Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
                intent.setFlags(268435456);
                if (context == null) {
                    BluetoothContextManager.getContext().startActivity(intent);
                } else {
                    context.startActivity(intent);
                }
            } catch (Exception e) {
                MiJiaLog.writeLogOnAll(LogType.KUAILIAN, ProductList.ProductInfo.BLE_TYPE, "openBluetooth err : " + Log.getStackTraceString(e));
            }
        }
    }

    public static boolean refreshGattCache(BluetoothGatt bluetoothGatt) {
        boolean zBooleanValue = false;
        if (bluetoothGatt != null) {
            try {
                Method method = BluetoothGatt.class.getMethod("refresh", new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    zBooleanValue = ((Boolean) method.invoke(bluetoothGatt, new Object[0])).booleanValue();
                }
            } catch (Exception e) {
                BluetoothLog.e(e);
            }
        }
        BluetoothLog.v(String.format("refreshDeviceCache return %b", Boolean.valueOf(zBooleanValue)));
        return zBooleanValue;
    }

    @SuppressLint({"WrongConstant"})
    private static void registerGlobalReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        StringBuilder sb = new StringBuilder();
        sb.append("registerGlobalReceiver  sdk version:");
        int i = Build.VERSION.SDK_INT;
        sb.append(i);
        BluetoothMyLogger.i(sb.toString());
        if (i >= 33) {
            BluetoothContextManager.getContext().registerReceiver(broadcastReceiver, intentFilter, 2);
        } else {
            BluetoothContextManager.getContext().registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public static void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        registerGlobalReceiver(broadcastReceiver, intentFilter);
    }

    public static boolean removeBond(String str) {
        BluetoothDevice remoteDevice;
        Method method;
        try {
            if (!TextUtils.isEmpty(str) && (remoteDevice = getRemoteDevice(str)) != null && (method = remoteDevice.getClass().getMethod("removeBond", new Class[0])) != null) {
                return ((Boolean) method.invoke(remoteDevice, new Object[0])).booleanValue();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public static void sendBroadcast(Intent intent) {
        sendGlobalBroadcast(intent);
    }

    public static void sendBroadcastDelayed(final String str, long j) {
        BluetoothContextManager.postDelayed(new Runnable() { // from class: com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils.1
            @Override // java.lang.Runnable
            public void run() {
                BluetoothUtils.sendBroadcast(str);
            }
        }, j);
    }

    private static void sendGlobalBroadcast(Intent intent) {
        BluetoothContextManager.getContext().sendBroadcast(intent);
    }

    private static void unregisterGlobalReceiver(BroadcastReceiver broadcastReceiver) {
        BluetoothContextManager.getContext().unregisterReceiver(broadcastReceiver);
    }

    public static void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            unregisterGlobalReceiver(broadcastReceiver);
        } catch (Throwable th) {
            BluetoothLog.e(th);
        }
    }

    public static void openBluetooth(Context context, int i) {
        if (checkBluetoothPermission() && context != null && (context instanceof Activity) && !isBluetoothEnabled()) {
            try {
                ((Activity) context).startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), i);
            } catch (Exception e) {
                ToastUtil.show(context, R.string.open_bluetooth_switch);
                MiJiaLog.writeLogOnAll(LogType.PLUGIN, "miot-rn-plugin", "openBluetooth err : " + Log.getStackTraceString(e));
            }
        }
    }

    public static void sendBroadcast(String str) {
        sendGlobalBroadcast(new Intent(str));
    }

    public static boolean isDeviceConnectedOrBonded(String str) {
        BluetoothDevice remoteDevice = getRemoteDevice(str);
        if (!checkBluetoothPermission()) {
            return false;
        }
        if (remoteDevice.getType() != 1) {
            return isBleDeviceConnected(remoteDevice);
        }
        return isClassicDeviceBonded(remoteDevice);
    }

    public static boolean isBleDeviceConnected(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null && isBleSupported()) {
            try {
                return checkBluetoothPermission() && getBluetoothManager().getConnectionState(bluetoothDevice, 7) == 2;
            } catch (NullPointerException e) {
                MiJiaLog.writeLogOnAll(LogType.KUAILIAN, ProductList.ProductInfo.BLE_TYPE, "getConnectionState error:" + e);
            }
        }
        return false;
    }
}
