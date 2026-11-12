package com.xiaomi.smarthome.core.server.internal.bluetooth.decorator;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.xiaomi.smarthome.ble_core.R;
import com.xiaomi.smarthome.core.entity.device.BtDevice;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.common.util.StringUtil;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothDeviceNameDecorator implements Decorator {
    private static volatile BluetoothDeviceNameDecorator sInstance;

    private String getDefaultName(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if ("yeelink.light.ble1".equalsIgnoreCase(str)) {
            return StringUtil.getString(BluetoothService.getAppContext(), R.string.yeelight_name);
        }
        if ("zimi.powerbank.v1".equalsIgnoreCase(str)) {
            return StringUtil.getString(BluetoothService.getAppContext(), R.string.zimi_power_name);
        }
        return "xiaomi.ble.v1".equalsIgnoreCase(str) ? StringUtil.getString(BluetoothService.getAppContext(), R.string.xiaomi_bracelet) : BluetoothService.getBleCoreProvider().getPluginNameByModel(str);
    }

    public static BluetoothDeviceNameDecorator getInstance() {
        if (sInstance == null) {
            synchronized (BluetoothDeviceNameDecorator.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new BluetoothDeviceNameDecorator();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.decorator.Decorator
    public void decorate(BtDevice btDevice) {
        BluetoothDevice remoteDevice;
        String propName = BluetoothCache.getPropName(btDevice.getMac());
        if (TextUtils.isEmpty(propName)) {
            propName = getDefaultName(btDevice.getModel());
        }
        if (!TextUtils.isEmpty(propName)) {
            btDevice.setName(propName);
        } else {
            if (!TextUtils.isEmpty(btDevice.getName()) || (remoteDevice = BluetoothUtils.getRemoteDevice(btDevice.getMac())) == null) {
                return;
            }
            btDevice.setName(remoteDevice.getName());
        }
    }
}
