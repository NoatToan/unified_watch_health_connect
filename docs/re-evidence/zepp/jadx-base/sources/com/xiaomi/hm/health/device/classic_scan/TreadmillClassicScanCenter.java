package com.xiaomi.hm.health.device.classic_scan;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.scan.AdvData;
import com.xiaomi.hm.health.bt.scan.BleScanOption;
import com.xiaomi.hm.health.bt.scan.IBleScanCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes20.dex */
public class TreadmillClassicScanCenter {
    private static final String e = "TreadmillClassicScanCenter";
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 3;
    private static final int j = 4;

    @SuppressLint({"StaticFieldLeak"})
    private static TreadmillClassicScanCenter k;
    private Context a;
    private b b;
    private List<BleScanOption> c = new ArrayList();
    private BroadcastReceiver d = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:7:0x0012  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null) {
            }
            switch (action) {
                case "android.bluetooth.adapter.action.DISCOVERY_FINISHED":
                    HMLog.i(TreadmillClassicScanCenter.e, "ACTION_DISCOVERY_FINISHED", new Object[0]);
                    break;
                case "android.bluetooth.adapter.action.STATE_CHANGED":
                    HMLog.i(TreadmillClassicScanCenter.e, "ACTION_STATE_CHANGED", new Object[0]);
                    if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) == 10 && !TreadmillClassicScanCenter.this.c.isEmpty()) {
                        TreadmillClassicScanCenter treadmillClassicScanCenter = TreadmillClassicScanCenter.this;
                        treadmillClassicScanCenter.stopScan((BleScanOption) treadmillClassicScanCenter.c.get(0));
                        break;
                    }
                    break;
                case "android.bluetooth.adapter.action.DISCOVERY_STARTED":
                    HMLog.i(TreadmillClassicScanCenter.e, "ACTION_DISCOVERY_STARTED", new Object[0]);
                    break;
                case "android.bluetooth.device.action.FOUND":
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice != null) {
                        HMLog.i(TreadmillClassicScanCenter.e, "ACTION_FOUND:" + bluetoothDevice.getAddress() + "," + bluetoothDevice.getName() + "," + bluetoothDevice.getType(), new Object[0]);
                        if (bluetoothDevice.getType() == 1 || bluetoothDevice.getType() == 3) {
                            TreadmillClassicScanCenter.this.l(new AdvData(bluetoothDevice));
                        }
                        break;
                    }
                    break;
                case "android.bluetooth.device.action.BOND_STATE_CHANGED":
                    HMLog.i(TreadmillClassicScanCenter.e, "ACTION_BOND_STATE_CHANGED current:" + intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10) + ",previous:" + intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", 10) + ",device:" + ((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")), new Object[0]);
                    break;
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class b extends Handler {
        public b(HandlerThread handlerThread) {
            super(handlerThread.getLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                TreadmillClassicScanCenter.m();
                return;
            }
            if (i == 1) {
                TreadmillClassicScanCenter.n();
                return;
            }
            if (i == 2) {
                Object obj = message.obj;
                if (obj instanceof BleScanOption) {
                    BleScanOption bleScanOption = (BleScanOption) obj;
                    if (TreadmillClassicScanCenter.this.c.remove(bleScanOption)) {
                        bleScanOption.getCallback().onScanStop(bleScanOption);
                    }
                    sendEmptyMessage(1);
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                TreadmillClassicScanCenter.this.f((AdvData) message.obj);
                return;
            }
            BleScanOption bleScanOption2 = (BleScanOption) message.obj;
            TreadmillClassicScanCenter.this.c.add(bleScanOption2);
            IBleScanCallback callback = bleScanOption2.getCallback();
            if (callback != null) {
                callback.onScanStart(bleScanOption2);
            }
            removeMessages(0);
            sendEmptyMessage(0);
            if (bleScanOption2.getTimeout() > 0) {
                Message message2 = new Message();
                message2.what = 2;
                message2.obj = bleScanOption2;
                sendMessageDelayed(message2, bleScanOption2.getTimeout());
            }
        }
    }

    private TreadmillClassicScanCenter(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread(e);
        handlerThread.start();
        this.b = new b(handlerThread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(AdvData advData) {
        if (advData == null) {
            return;
        }
        for (BleScanOption bleScanOption : this.c) {
            if (i(bleScanOption, advData)) {
                bleScanOption.getCallback().onScanedDevice(advData, bleScanOption);
            }
        }
    }

    private boolean g(List<String> list, AdvData advData) {
        String address = advData.device.getAddress();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals(address)) {
                return true;
            }
        }
        return false;
    }

    public static TreadmillClassicScanCenter getInstance() {
        return k;
    }

    private boolean h(List<String> list, AdvData advData) {
        String deviceName = advData.getDeviceName();
        if (TextUtils.isEmpty(deviceName)) {
            return false;
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals(deviceName)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(BleScanOption bleScanOption, AdvData advData) {
        List<UUID> filterUUIDs = bleScanOption.getFilterUUIDs();
        List<String> filterNames = bleScanOption.getFilterNames();
        List<String> filterAddress = bleScanOption.getFilterAddress();
        if (filterUUIDs != null && filterUUIDs.size() > 0 && !j(filterUUIDs, advData)) {
            HMLog.i(e, "no match uuid", new Object[0]);
            return false;
        }
        if (filterNames != null && filterNames.size() > 0 && !h(filterNames, advData)) {
            HMLog.i(e, "no match name", new Object[0]);
            return false;
        }
        if (filterAddress == null || filterAddress.size() <= 0 || g(filterAddress, advData)) {
            return true;
        }
        HMLog.i(e, "no match address", new Object[0]);
        return false;
    }

    public static void init(Context context) {
        if (k == null) {
            k = new TreadmillClassicScanCenter(context);
        }
    }

    private boolean j(List<UUID> list, AdvData advData) {
        Iterator<UUID> it2 = list.iterator();
        while (it2.hasNext()) {
            if (advData.isMatchUUID(it2.next())) {
                return true;
            }
        }
        return false;
    }

    private void k() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        this.a.registerReceiver(this.d, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(AdvData advData) {
        Message message = new Message();
        message.what = 4;
        message.obj = advData;
        this.b.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m() {
        BluetoothAdapter.getDefaultAdapter().startDiscovery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n() {
        BluetoothAdapter.getDefaultAdapter().cancelDiscovery();
    }

    public void startScan(BleScanOption bleScanOption) {
        k();
        HMLog.i(e, "startScan<" + bleScanOption + SearchCriteria.GT, new Object[0]);
        if (bleScanOption == null) {
            return;
        }
        Message message = new Message();
        message.what = 3;
        message.obj = bleScanOption;
        this.b.sendMessage(message);
    }

    public void stopScan(BleScanOption bleScanOption) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = bleScanOption;
        this.b.sendMessage(messageObtain);
        try {
            this.a.unregisterReceiver(this.d);
        } catch (Exception unused) {
        }
        BluetoothAdapter.getDefaultAdapter().cancelDiscovery();
    }
}
