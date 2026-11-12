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
import java.util.regex.Pattern;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes20.dex */
public class ClassicScanCenter {
    private static final String e = "ClassicScanCenter";
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 3;
    private static final int j = 4;
    private static final int k = 5;
    private static final int l = 6;
    private static final int m = 7;
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 0;

    @SuppressLint({"StaticFieldLeak"})
    private static ClassicScanCenter r;
    private Context a;
    private b b;
    private List<BleScanOption> c = new ArrayList();
    private BroadcastReceiver d = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:7:0x0011  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null) {
            }
            switch (action) {
                case "android.bluetooth.adapter.action.DISCOVERY_FINISHED":
                    HMLog.d(ClassicScanCenter.e, "ACTION_DISCOVERY_FINISHED", new Object[0]);
                    break;
                case "android.bluetooth.adapter.action.STATE_CHANGED":
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                    HMLog.d(ClassicScanCenter.e, "ACTION_STATE_CHANGED - state: " + intExtra, new Object[0]);
                    if (intExtra == 10) {
                        if (!ClassicScanCenter.this.c.isEmpty()) {
                            ClassicScanCenter classicScanCenter = ClassicScanCenter.this;
                            classicScanCenter.stopScan((BleScanOption) classicScanCenter.c.get(0));
                        }
                        ClassicScanCenter.this.b.sendEmptyMessage(1);
                        break;
                    }
                    break;
                case "android.bluetooth.adapter.action.DISCOVERY_STARTED":
                    HMLog.d(ClassicScanCenter.e, "ACTION_DISCOVERY_STARTED", new Object[0]);
                    break;
                case "android.bluetooth.device.action.FOUND":
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice != null) {
                        HMLog.d(ClassicScanCenter.e, "ACTION_FOUND:" + bluetoothDevice.getAddress() + "," + bluetoothDevice.getName() + "," + bluetoothDevice.getType(), new Object[0]);
                        if (bluetoothDevice.getType() == 1) {
                            ClassicScanCenter.this.m(new AdvData(bluetoothDevice));
                        }
                        break;
                    }
                    break;
                case "android.bluetooth.device.action.BOND_STATE_CHANGED":
                    HMLog.d(ClassicScanCenter.e, "ACTION_BOND_STATE_CHANGED current:" + intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10) + ",previous:" + intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", 10) + ",device:" + ((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")), new Object[0]);
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
                ClassicScanCenter.n();
                return;
            }
            if (i == 1) {
                ClassicScanCenter.o();
                return;
            }
            if (i == 4) {
                BleScanOption bleScanOption = (BleScanOption) message.obj;
                if (ClassicScanCenter.this.c.remove(bleScanOption)) {
                    bleScanOption.getCallback().onScanStop(bleScanOption);
                }
                sendEmptyMessage(1);
                return;
            }
            if (i != 5) {
                if (i != 7) {
                    return;
                }
                ClassicScanCenter.this.g((AdvData) message.obj);
                return;
            }
            BleScanOption bleScanOption2 = (BleScanOption) message.obj;
            ClassicScanCenter.this.c.add(bleScanOption2);
            IBleScanCallback callback = bleScanOption2.getCallback();
            if (callback != null) {
                callback.onScanStart(bleScanOption2);
            }
            removeMessages(0);
            sendEmptyMessage(0);
            if (bleScanOption2.getTimeout() > 0) {
                Message message2 = new Message();
                message2.what = 4;
                message2.obj = bleScanOption2;
                sendMessageDelayed(message2, bleScanOption2.getTimeout());
            }
        }
    }

    private ClassicScanCenter(Context context) {
        this.a = context.getApplicationContext();
        HandlerThread handlerThread = new HandlerThread(e);
        handlerThread.start();
        this.b = new b(handlerThread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(AdvData advData) {
        if (advData == null) {
            return;
        }
        for (BleScanOption bleScanOption : this.c) {
            if (j(bleScanOption, advData)) {
                bleScanOption.getCallback().onScanedDevice(advData, bleScanOption);
            }
        }
    }

    public static ClassicScanCenter getInstance() {
        return r;
    }

    private boolean h(List<String> list, AdvData advData) {
        String address = advData.device.getAddress();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals(address)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(List<String> list, AdvData advData) {
        String deviceName = advData.getDeviceName();
        if (TextUtils.isEmpty(deviceName)) {
            return false;
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (Pattern.matches(it2.next(), deviceName)) {
                return true;
            }
        }
        return false;
    }

    public static void init(Context context) {
        if (r == null) {
            r = new ClassicScanCenter(context);
        }
    }

    private boolean j(BleScanOption bleScanOption, AdvData advData) {
        List<UUID> filterUUIDs = bleScanOption.getFilterUUIDs();
        List<String> filterNames = bleScanOption.getFilterNames();
        List<String> filterAddress = bleScanOption.getFilterAddress();
        if (filterUUIDs != null && filterUUIDs.size() > 0 && !k(filterUUIDs, advData)) {
            HMLog.d(e, "no match uuid", new Object[0]);
            return false;
        }
        if (filterNames != null && filterNames.size() > 0 && !i(filterNames, advData)) {
            HMLog.d(e, "no match name", new Object[0]);
            return false;
        }
        if (filterAddress == null || filterAddress.size() <= 0 || h(filterAddress, advData)) {
            return true;
        }
        HMLog.d(e, "no match address", new Object[0]);
        return false;
    }

    private boolean k(List<UUID> list, AdvData advData) {
        Iterator<UUID> it2 = list.iterator();
        while (it2.hasNext()) {
            if (advData.isMatchUUID(it2.next())) {
                return true;
            }
        }
        return false;
    }

    private void l() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        this.a.registerReceiver(this.d, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(AdvData advData) {
        Message message = new Message();
        message.what = 7;
        message.obj = advData;
        this.b.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n() {
        BluetoothAdapter.getDefaultAdapter().startDiscovery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o() {
        BluetoothAdapter.getDefaultAdapter().cancelDiscovery();
    }

    public void startScan(BleScanOption bleScanOption) {
        l();
        HMLog.i(e, "startScan<" + bleScanOption + SearchCriteria.GT, new Object[0]);
        if (bleScanOption == null) {
            return;
        }
        Message message = new Message();
        message.what = 5;
        message.obj = bleScanOption;
        this.b.sendMessage(message);
    }

    public void stopScan(BleScanOption bleScanOption) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = bleScanOption;
        this.b.sendMessage(messageObtain);
        BluetoothAdapter.getDefaultAdapter().cancelDiscovery();
    }
}
