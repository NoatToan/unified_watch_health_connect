package com.huawei.health.ecologydevice.fitness;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.ecologydevice.callback.BroadcastObserver;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import health.compact.a.HuaweiHealth;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class BroadcastSubscribeCenter {
    private static final Object d = new Object();
    private static volatile BroadcastSubscribeCenter e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BluetoothSwitchMonitorReceiver f6483b;
    private boolean f;
    private a g;
    private boolean i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, BroadcastObserver> f6482a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, BroadcastObserver> f6484c = new ConcurrentHashMap<>();

    public static BroadcastSubscribeCenter c() {
        BroadcastSubscribeCenter broadcastSubscribeCenter;
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    e = new BroadcastSubscribeCenter();
                }
                broadcastSubscribeCenter = e;
            }
            return broadcastSubscribeCenter;
        }
        return e;
    }

    public void e(List<String> list, String str, BroadcastObserver broadcastObserver) {
        if (njy.e(list) || TextUtils.isEmpty(str) || broadcastObserver == null) {
            LogUtil.j("Ecology_BroadcastSubscribeCentre", "registerReceiverCallback is error");
            return;
        }
        for (String str2 : list) {
            if (BroadcastObserver.BLUE_STATE_TYPE.equals(str2)) {
                this.f6482a.put(str, broadcastObserver);
            } else if (BroadcastObserver.BLUE_PAIR_STATE_TYPE.equals(str2)) {
                this.f6484c.put(str, broadcastObserver);
            } else {
                LogUtil.j("Ecology_BroadcastSubscribeCentre", "registerReceiverCallback is error");
            }
        }
    }

    public void e(List<String> list, String str) {
        if (njy.e(list) || TextUtils.isEmpty(str)) {
            LogUtil.j("Ecology_BroadcastSubscribeCentre", "unregisterReceiverCallback is error");
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            a(str, it.next());
        }
    }

    private void a(String str, String str2) {
        str2.hashCode();
        if (str2.equals(BroadcastObserver.BLUE_PAIR_STATE_TYPE)) {
            this.f6484c.remove(str);
            if (this.f6484c.size() == 0) {
                a();
                return;
            }
            return;
        }
        if (str2.equals(BroadcastObserver.BLUE_STATE_TYPE)) {
            this.f6482a.remove(str);
            if (this.f6482a.size() == 0) {
                e();
            }
        }
    }

    public void b() {
        LogUtil.a("Ecology_BroadcastSubscribeCentre", "register Bluetooth Switch BrocastReciver");
        synchronized (d) {
            if (this.f6483b == null) {
                this.f6483b = new BluetoothSwitchMonitorReceiver();
            }
            if (HuaweiHealth.a() != null && !this.f) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                HuaweiHealth.a().registerReceiver(this.f6483b, intentFilter);
                this.f = true;
            }
        }
    }

    private void e() {
        synchronized (d) {
            LogUtil.a("Ecology_BroadcastSubscribeCentre", "unregister BrocastReciver for ble pair");
            if (this.f6483b != null && this.f && HuaweiHealth.a() != null) {
                this.f = false;
                HuaweiHealth.a().unregisterReceiver(this.f6483b);
            }
        }
    }

    public class BluetoothSwitchMonitorReceiver extends BroadcastReceiver {
        public BluetoothSwitchMonitorReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            LogUtil.a("Ecology_BroadcastSubscribeCentre", "Receive BluetoothSwitchMonitorReceiver : ", intent.getAction());
            String action = intent.getAction();
            if (action != null && "android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                BroadcastSubscribeCenter.this.e(intent);
            }
        }
    }

    public void d() {
        synchronized (d) {
            LogUtil.a("Ecology_BroadcastSubscribeCentre", "register BrocastReciver for ble pair");
            if (this.g == null) {
                this.g = new a();
            }
            if (HuaweiHealth.a() != null && !this.i) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
                    HuaweiHealth.a().registerReceiver(this.g, intentFilter);
                    this.i = true;
                } catch (SecurityException e2) {
                    LogUtil.e("Ecology_BroadcastSubscribeCentre", "registerBondStateReceiver SecurityException:", ExceptionUtils.c(e2));
                }
            }
        }
    }

    private void a() {
        synchronized (d) {
            LogUtil.a("Ecology_BroadcastSubscribeCentre", "unregister BrocastReciver for ble pair");
            if (this.g != null && this.i && HuaweiHealth.a() != null) {
                this.i = false;
                HuaweiHealth.a().unregisterReceiver(this.g);
            }
        }
    }

    final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            LogUtil.a("Ecology_BroadcastSubscribeCentre", "Receive BroadcastReceiverForBlePair : ", intent.getAction());
            if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice != null) {
                    BroadcastSubscribeCenter.this.d(bluetoothDevice);
                } else {
                    LogUtil.j("Ecology_BroadcastSubscribeCentre", "BroadcastReceiverForBlePair device = null");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Intent intent) {
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
        if (intExtra == 10) {
            Iterator<BroadcastObserver> it = this.f6482a.values().iterator();
            while (it.hasNext()) {
                it.next().onNotify(2, null);
            }
        } else {
            if (intExtra != 12) {
                LogUtil.a("Ecology_BroadcastSubscribeCentre", "ReceiverCallback other blueState: ", Integer.valueOf(intExtra));
                return;
            }
            LogUtil.a("Ecology_BroadcastSubscribeCentre", "BluetoothSwitchMonitorReceiver BluetoothAdapter.STATE_ON");
            Iterator<BroadcastObserver> it2 = this.f6482a.values().iterator();
            while (it2.hasNext()) {
                it2.next().onNotify(1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(BluetoothDevice bluetoothDevice) {
        try {
            String name = bluetoothDevice.getName();
            switch (bluetoothDevice.getBondState()) {
                case 10:
                    LogUtil.a("Ecology_BroadcastSubscribeCentre", name, " pair Failed");
                    Iterator<BroadcastObserver> it = this.f6482a.values().iterator();
                    while (it.hasNext()) {
                        it.next().onNotify(4, bluetoothDevice);
                    }
                    break;
                case 11:
                    LogUtil.a("Ecology_BroadcastSubscribeCentre", name, " is pairing......");
                    Iterator<BroadcastObserver> it2 = this.f6482a.values().iterator();
                    while (it2.hasNext()) {
                        it2.next().onNotify(5, bluetoothDevice);
                    }
                    break;
                case 12:
                    LogUtil.a("Ecology_BroadcastSubscribeCentre", name, " pair success");
                    Iterator<BroadcastObserver> it3 = this.f6482a.values().iterator();
                    while (it3.hasNext()) {
                        it3.next().onNotify(3, bluetoothDevice);
                    }
                    break;
                default:
                    LogUtil.a("Ecology_BroadcastSubscribeCentre", name, " other status：", Integer.valueOf(bluetoothDevice.getBondState()));
                    break;
            }
        } catch (SecurityException e2) {
            LogUtil.e("Ecology_BroadcastSubscribeCentre", "onDataTransfer SecurityException:", ExceptionUtils.c(e2));
        }
    }
}
