package com.huawei.health.ecologydevice.fitness.util;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class RopeStateMonitor extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IntentFilter f6514b;
    private StateChangeListener d;
    private Context e;

    public interface StateChangeListener {
        void onBondStateChanged(int i, BluetoothDevice bluetoothDevice);

        void onSwitchStateChanged(int i);
    }

    public RopeStateMonitor(Context context, StateChangeListener stateChangeListener) {
        this.e = context;
        this.d = stateChangeListener;
    }

    public void d() {
        if (this.e == null) {
            LogUtil.a("PDROPE_RopeStateMonitor", "context is null, start failed. ");
        } else {
            e();
            this.e.registerReceiver(this, this.f6514b);
        }
    }

    public void a() {
        Context context = this.e;
        if (context == null) {
            LogUtil.a("PDROPE_RopeStateMonitor", "Monitor has not started yet.");
            return;
        }
        try {
            context.unregisterReceiver(this);
            this.e = null;
        } catch (IllegalArgumentException unused) {
            LogUtil.e("PDROPE_RopeStateMonitor", "Receiver not registered");
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LogUtil.a("PDROPE_RopeStateMonitor", "Receive BluetoothSwitchMonitorReceiver : ", intent.getAction());
        try {
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                LogUtil.a("PDROPE_RopeStateMonitor", "BluetoothSwitchMonitorReceiver blueState: ", Integer.valueOf(intExtra));
                if (intExtra == 10) {
                    this.d.onSwitchStateChanged(3);
                } else if (intExtra == 12) {
                    this.d.onSwitchStateChanged(4);
                } else {
                    LogUtil.a("PDROPE_RopeStateMonitor", "BluetoothSwitchMonitorReceiver other ignored blueState: ", Integer.valueOf(intExtra));
                }
            }
            if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice == null) {
                    LogUtil.j("PDROPE_RopeStateMonitor", "BroadcastReceiverForBlePair device = null");
                    return;
                }
                switch (bluetoothDevice.getBondState()) {
                    case 10:
                        this.d.onBondStateChanged(0, bluetoothDevice);
                        break;
                    case 11:
                        this.d.onBondStateChanged(1, bluetoothDevice);
                        break;
                    case 12:
                        this.d.onBondStateChanged(2, bluetoothDevice);
                        break;
                    default:
                        LogUtil.a("PDROPE_RopeStateMonitor", bluetoothDevice.getName(), " other status：", Integer.valueOf(bluetoothDevice.getBondState()));
                        break;
                }
            }
            b(intent);
        } catch (SecurityException e) {
            LogUtil.e("PDROPE_RopeStateMonitor", "onReceive SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void b(Intent intent) {
        try {
            if ("android.bluetooth.device.action.PAIRING_REQUEST".equals(intent.getAction())) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice == null) {
                    LogUtil.j("PDROPE_RopeStateMonitor", "BroadcastReceiverForBlePair device = null");
                } else if (bluetoothDevice.getBondState() != 12) {
                    this.d.onBondStateChanged(9, bluetoothDevice);
                }
            }
        } catch (SecurityException e) {
            LogUtil.e("PDROPE_RopeStateMonitor", "actionForRequestPair SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void e() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            this.f6514b = intentFilter;
            intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
            this.f6514b.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            this.f6514b.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
        } catch (SecurityException e) {
            LogUtil.e("PDROPE_RopeStateMonitor", "initFilter SecurityException:", ExceptionUtils.c(e));
        }
    }
}
