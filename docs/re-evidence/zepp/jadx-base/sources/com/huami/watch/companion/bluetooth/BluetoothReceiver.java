package com.huami.watch.companion.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.huami.watch.companion.R;
import com.huami.watch.companion.bind.BindHelper;
import com.huami.watch.companion.bind.BindUtil;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.event.BluetoothPairingConfirmEvent;
import com.huami.watch.companion.event.BluetoothPairingUserConfirmedEvent;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import java.util.Arrays;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class BluetoothReceiver extends BroadcastReceiver {
    private static final String d = "Bluetooth-Receiver";
    private static final int e = 3;
    private boolean a;
    private int b;
    private boolean c = true;

    private boolean a() {
        if (Build.VERSION.SDK_INT < 31 || !this.c) {
            return false;
        }
        this.c = false;
        return true;
    }

    private void b(Context context, boolean z, String str) {
        Log.d(d, "OnCancelPairing, Unbind : " + z + ", " + str, new Object[0]);
        if (DeviceManager.getManager(context).find(str) == null) {
            BindUtil.disconnectDevice(str, true);
        } else if (z) {
            BindUtil.disconnectDevice(str);
        }
        RxBus.get().post(new BluetoothPairingUserConfirmedEvent(false));
    }

    private void c() {
        Log.d(d, "OnConfirmPairing!!", new Object[0]);
        RxBus.get().post(new BluetoothPairingUserConfirmedEvent(true));
    }

    private void d(Context context) {
        Log.d(d, "OnRequestPairing!!", new Object[0]);
        Toast.makeText(context, R.string.bind_bt_pairing_request_tip, 1).show();
        RxBus.get().post(new BluetoothPairingConfirmEvent(null, 0, 0));
    }

    public void onBindRequestPairingStart() {
        this.b = 3;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        Log.d(d, "Receive : " + action + ", BluetoothDevice : " + bluetoothDevice, new Object[0]);
        if (bluetoothDevice == null) {
            Log.w(d, "Receive BluetoothDevice is NULL, ignore!!", new Object[0]);
            return;
        }
        Device deviceFind = DeviceManager.getManager(context).find(bluetoothDevice.getAddress());
        Log.d(d, "Saved Device : " + deviceFind, new Object[0]);
        String bindingDevice = BindHelper.getHelper().getBindingDevice();
        Log.d(d, "Binding Device : " + bindingDevice, new Object[0]);
        if (TextUtils.isEmpty(bindingDevice) && deviceFind == null) {
            Log.w(d, "Receive neither Binding nor Saved Device, ignore!!", new Object[0]);
            return;
        }
        if (!TextUtils.isEmpty(bindingDevice) && !bindingDevice.equalsIgnoreCase(bluetoothDevice.getAddress())) {
            Log.w(d, "Receive Unrelated Device, not equals to Binding Device, ignore!!", new Object[0]);
            return;
        }
        if (deviceFind != null && !deviceFind.address().equalsIgnoreCase(bluetoothDevice.getAddress())) {
            Log.w(d, "Receive Unrelated Device, not equals to Saved Device, ignore!!", new Object[0]);
            return;
        }
        if (!"android.bluetooth.device.action.PAIRING_REQUEST".equals(action)) {
            if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
                switch (intExtra) {
                    case 10:
                        Log.d(d, "Receive BondState Changed : Bond None!!", new Object[0]);
                        if (!a()) {
                            b(context, this.a && this.b <= 0, bluetoothDevice.getAddress());
                            this.a = false;
                            this.b--;
                        } else {
                            Log.d(d, "Ignore Bond None on Android 12 and later!!", new Object[0]);
                        }
                        break;
                    case 11:
                        Log.d(d, "Receive BondState Changed : Bonding!!", new Object[0]);
                        this.a = true;
                        break;
                    case 12:
                        Log.d(d, "Receive BondState Changed : Bonded!!", new Object[0]);
                        c();
                        this.a = false;
                        break;
                    default:
                        Log.d(d, "Receive Bond State Changed : " + intExtra, new Object[0]);
                        break;
                }
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", Integer.MIN_VALUE);
            int intExtra3 = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", Integer.MIN_VALUE);
            Log.d(d, "Received Pairing Request : <Device:" + bluetoothDevice.getAddress() + "," + bluetoothDevice.getName() + "," + bluetoothDevice.getBluetoothClass() + "," + bluetoothDevice.getBondState() + "," + bluetoothDevice.getType() + "," + Arrays.toString(bluetoothDevice.getUuids()) + ",Variant:" + intExtra3 + ",Key:" + intExtra2 + SearchCriteria.GT, new Object[0]);
            if (intExtra3 != 2) {
                Log.w(d, "Receive Pairing is not PAIRING_VARIANT_PASSKEY_CONFIRMATION, ignore!!", new Object[0]);
                return;
            }
        }
        d(context);
        this.a = true;
    }

    public void register(@NonNull Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
        intentFilter.addAction("android.bluetooth.device.action.PAIRING_CANCEL");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        Log.d(d, "Register Receiver: " + context, new Object[0]);
        try {
            context.registerReceiver(this, intentFilter);
        } catch (Exception e2) {
            Log.w(d, "RegisterReceiverErr", e2, new Object[0]);
        }
    }

    public void unregister(@NonNull Context context) {
        Log.d(d, "Unregister Receiver: " + context, new Object[0]);
        try {
            context.unregisterReceiver(this);
        } catch (Exception e2) {
            Log.w(d, "UnregisterReceiverErr", e2, new Object[0]);
        }
    }
}
