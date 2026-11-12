package com.huawei.hwarkuix.oHBrigdePlugin.device;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.hwbtsdk.btcommon.BluetoothSwitchStateUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;
import ohos.ace.adapter.capability.bridge.BridgeManager;

/* JADX INFO: loaded from: classes37.dex */
public class SystemBluetoothApiBridge extends OHProBridgePlugin {
    private static final String TAG = "SystemBluetoothApiBridge";
    private WeakReference<Context> mContext;

    public SystemBluetoothApiBridge(Context context, String str, int i) {
        super(context, str, i);
        this.mContext = new WeakReference<>(context);
    }

    public SystemBluetoothApiBridge(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
        this.mContext = new WeakReference<>(context);
    }

    public void enableBluetooth(final int i) {
        Context context = this.mContext.get();
        if (context == null) {
            ohProOnFailure(i, "enableBluetooth context is null");
            LogUtil.e(TAG, "enableBluetooth context is null");
        } else {
            new BluetoothSwitchStateUtil(context).e(new BtSwitchStateCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.device.SystemBluetoothApiBridge.1
                @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
                public void onBtSwitchStateCallback(int i2) {
                    LogUtil.a(SystemBluetoothApiBridge.TAG, "openBluetoothSwitch btSwitchState is :", Integer.valueOf(i2));
                    if (i2 == 3) {
                        SystemBluetoothApiBridge.this.ohProOnSuccess(i, "openBluetoothSwitch success");
                        return;
                    }
                    SystemBluetoothApiBridge.this.ohProOnFailure(i, "openBluetoothSwitch failed, btSwitchState is:" + i2);
                }
            });
        }
    }

    public void getState(int i) {
        int i2;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            LogUtil.e(TAG, "Bluetooth isEnabled is false");
            ohProOnFailure(i, "Bluetooth isEnabled is false");
            return;
        }
        int state = defaultAdapter.getState();
        LogUtil.a(TAG, "getState is :", Integer.valueOf(state));
        switch (state) {
            case 10:
                i2 = 0;
                break;
            case 11:
                i2 = 1;
                break;
            case 12:
                i2 = 2;
                break;
            case 13:
                i2 = 3;
                break;
            default:
                i2 = -1;
                break;
        }
        LogUtil.a(TAG, "bluetoothStateForArkUI is :", Integer.valueOf(i2));
        if (i2 == -1) {
            ohProOnFailure(i, "Bluetooth getState is " + state);
            return;
        }
        ohProOnSuccess(i, Integer.valueOf(i2));
    }
}
