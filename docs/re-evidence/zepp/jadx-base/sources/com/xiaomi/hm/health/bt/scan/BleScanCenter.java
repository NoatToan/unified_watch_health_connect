package com.xiaomi.hm.health.bt.scan;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes20.dex */
@SuppressLint({"NewApi"})
public class BleScanCenter {
    public static final String TAG = "BleScanCenter";
    private static volatile BleScanCenter s = null;
    private static volatile int t = 0;
    private static volatile int u = 0;
    private static volatile int v = 0;
    private static volatile int w = 0;
    private static final int x = 8;
    private HandlerThread m;
    private Handler n;
    private Context o;
    private final BluetoothAdapter a = BluetoothAdapter.getDefaultAdapter();
    private final int b = 0;
    private final int c = 10000;
    private final int d = 0;
    private final int e = 1;
    private final int f = 2;
    private final int g = 3;
    private final int h = 4;
    private final int i = 5;
    private final int j = 6;
    private final int k = 7;
    private ScanCallback l = null;
    private volatile boolean p = false;
    private List<BleScanOption> q = new ArrayList();
    private boolean r = false;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    Debug.fi(BleScanCenter.TAG, "COUNT-SCAN******MSG_START_SCAN:<" + BleScanCenter.h() + "," + BleScanCenter.u + SearchCriteria.GT);
                    if (!BleScanCenter.this.p) {
                        BleScanCenter.this.D();
                        BleScanCenter.this.C();
                        removeMessages(3);
                        if (!BleScanCenter.this.r) {
                            sendEmptyMessageDelayed(3, 10000L);
                        }
                    } else {
                        Debug.i(BleScanCenter.TAG, "need stop,return!!!");
                    }
                    break;
                case 1:
                    Debug.fi(BleScanCenter.TAG, "COUNT-SCAN******MSG_STOP_SCAN:<" + BleScanCenter.t + "," + BleScanCenter.j() + SearchCriteria.GT);
                    BleScanCenter.this.D();
                    break;
                case 2:
                    if (!BleScanCenter.this.p) {
                        BleScanCenter.this.s((AdvData) msg.obj);
                    }
                    break;
                case 3:
                    Debug.fi(BleScanCenter.TAG, "COUNT-SCAN******MSG_PAUSE_SCAN:<" + BleScanCenter.t + "," + BleScanCenter.j() + SearchCriteria.GT);
                    BleScanCenter.this.D();
                    Message message = new Message();
                    message.what = 0;
                    message.obj = msg.obj;
                    sendMessageDelayed(message, 0L);
                    break;
                case 4:
                    try {
                        Debug.fi(BleScanCenter.TAG, "timeout msg");
                        BleScanOption bleScanOption = (BleScanOption) msg.obj;
                        if (BleScanCenter.this.q.remove(bleScanOption)) {
                            bleScanOption.getCallback().onScanStop(bleScanOption);
                        }
                        if (BleScanCenter.this.q.size() < 1) {
                            BleScanCenter.this.p = true;
                            removeMessages(3);
                            removeMessages(0);
                            sendEmptyMessage(1);
                        }
                        Debug.fi(BleScanCenter.TAG, "COUNT-SCAN******MSG_SCAN_TIMEOUT:<" + bleScanOption + ">[" + BleScanCenter.this.q.size() + "]");
                    } catch (Exception e) {
                        Debug.fi(BleScanCenter.TAG, "timeout e: " + e.toString());
                        return;
                    }
                    break;
                case 5:
                    BleScanOption bleScanOption2 = (BleScanOption) msg.obj;
                    if (bleScanOption2 == null || BleScanCenter.this.q.contains(bleScanOption2)) {
                        Debug.fi(BleScanCenter.TAG, "null or exist BleScanOption,return now!!!");
                    } else {
                        BleScanCenter.this.p = false;
                        BleScanCenter.this.q.add(bleScanOption2);
                        Debug.fi(BleScanCenter.TAG, "COUNT-SCAN******MSG_ADD_SCAN_OPTION:<" + bleScanOption2 + ">[" + BleScanCenter.this.q.size() + "]");
                        IBleScanCallback callback = bleScanOption2.getCallback();
                        if (callback != null) {
                            callback.onScanStart(bleScanOption2);
                        }
                        if (bleScanOption2.getNeedConnectedDevice()) {
                            BleScanCenter bleScanCenter = BleScanCenter.this;
                            List listR = bleScanCenter.r(bleScanCenter.o);
                            if (listR.size() > 0) {
                                List<UUID> filterUUIDs = bleScanOption2.getFilterUUIDs();
                                BleScanCenter bleScanCenter2 = BleScanCenter.this;
                                bleScanCenter2.t(bleScanCenter2.o, listR, filterUUIDs != null && filterUUIDs.size() > 0);
                            }
                        }
                        removeMessages(0);
                        sendEmptyMessage(0);
                        if (bleScanOption2.getTimeout() > 0) {
                            Message message2 = new Message();
                            message2.what = 4;
                            message2.obj = bleScanOption2;
                            sendMessageDelayed(message2, bleScanOption2.getTimeout());
                            if (callback instanceof IBleScanCallback2) {
                                Message message3 = new Message();
                                message3.what = 8;
                                message3.obj = bleScanOption2;
                                sendMessageDelayed(message3, bleScanOption2.getTimeout());
                            }
                        }
                    }
                    break;
                case 6:
                    BleScanCenter.this.r = ((Boolean) msg.obj).booleanValue();
                    if (BleScanCenter.this.q.size() > 0) {
                        sendEmptyMessage(0);
                    }
                    break;
                case 7:
                    c cVar = (c) msg.obj;
                    if (cVar != null) {
                        try {
                            AdvData advData = AdvData.parse(cVar.c());
                            advData.device = cVar.b;
                            advData.rssi = cVar.c;
                            if (!BleScanCenter.this.p) {
                                BleScanCenter.this.s(advData);
                            }
                        } catch (Exception e2) {
                            Debug.fi(BleScanCenter.TAG, "adv data parse exception:" + e2.getMessage());
                            return;
                        }
                        break;
                    }
                    break;
                case 8:
                    BleScanOption bleScanOption3 = (BleScanOption) msg.obj;
                    IBleScanCallback callback2 = bleScanOption3.getCallback();
                    if (!(callback2 instanceof IBleScanCallback2)) {
                        Debug.fi(BleScanCenter.TAG, "callback type mismatch.");
                    } else {
                        ((IBleScanCallback2) callback2).onScanTimeout(bleScanOption3);
                    }
                    break;
            }
        }
    }

    public class b extends ScanCallback {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(ScanResult scanResult) {
            ScanRecord scanRecord = scanResult.getScanRecord();
            if (scanRecord != null) {
                BleScanCenter.this.z(scanResult.getDevice(), scanResult.getRssi(), scanRecord.getBytes());
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List<ScanResult> results) {
            results.forEach(new Consumer() { // from class: com.xiaomi.hm.health.bt.scan.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.a.b((ScanResult) obj);
                }
            });
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int errorCode) {
            Debug.fi(BleScanCenter.TAG, "OnScan Failed: " + errorCode);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int callbackType, ScanResult result) {
            if (callbackType != 1) {
                Debug.fi(BleScanCenter.TAG, "LE Scan has already started");
                return;
            }
            ScanRecord scanRecord = result.getScanRecord();
            if (scanRecord != null) {
                BleScanCenter.this.z(result.getDevice(), result.getRssi(), scanRecord.getBytes());
            }
        }
    }

    public class c {
        public byte[] a;
        public BluetoothDevice b;
        public int c;

        public c(byte[] scanRecord, BluetoothDevice device, int rssi) {
            this.a = scanRecord;
            this.b = device;
            this.c = rssi;
        }

        public BluetoothDevice a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }

        public byte[] c() {
            return this.a;
        }
    }

    private BleScanCenter(Context context) {
        this.m = null;
        this.n = null;
        this.o = null;
        this.o = context;
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.m = handlerThread;
        handlerThread.start();
        this.n = new a(this.m.getLooper());
    }

    private void A(BluetoothDevice device, ArrayList<String> uuids, HMDeviceSource source) {
        AdvData advData = new AdvData();
        if (uuids != null) {
            advData.serv128.addAll(uuids);
        }
        advData.device = device;
        advData.rssi = 0;
        advData.deviceSource = source;
        Message message = new Message();
        message.what = 2;
        message.obj = advData;
        this.n.sendMessage(message);
    }

    private void B(AdvData advData, List<UUID> uuids) {
        Debug.fi(AdvData.TAG_ADV, "uuids: " + uuids.toString());
        advData.printUUIDs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        StringBuilder sb = new StringBuilder();
        sb.append("startForNormal:");
        int i = v + 1;
        v = i;
        sb.append(i);
        Debug.fi(TAG, sb.toString());
        if (this.l == null) {
            this.l = new b();
        }
        try {
            ScanSettings.Builder builder = new ScanSettings.Builder();
            builder.setScanMode(2);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                builder.setCallbackType(1);
                builder.setMatchMode(1);
                builder.setNumOfMatches(3);
            }
            if (i2 >= 26) {
                builder.setPhy(255);
            }
            this.a.getBluetoothLeScanner().startScan((List<ScanFilter>) null, builder.build(), this.l);
        } catch (Exception e) {
            Debug.fi(TAG, "startLeScan exception:" + e.getMessage());
            D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        if (this.l != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("stopForNormal:");
            int i = w + 1;
            w = i;
            sb.append(i);
            Debug.fi(TAG, sb.toString());
            try {
                try {
                    BluetoothLeScanner bluetoothLeScanner = this.a.getBluetoothLeScanner();
                    if (bluetoothLeScanner != null) {
                        bluetoothLeScanner.stopScan(this.l);
                    }
                } catch (Exception e) {
                    Debug.fi(TAG, "stopLeScan exception:" + e.getMessage());
                }
            } finally {
                this.l = null;
            }
        }
    }

    public static BleScanCenter getInstance() {
        return s;
    }

    public static /* synthetic */ int h() {
        int i = t + 1;
        t = i;
        return i;
    }

    public static void init(Context context) {
        if (s == null) {
            s = new BleScanCenter(context);
        }
    }

    public static /* synthetic */ int j() {
        int i = u + 1;
        u = i;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<BluetoothDevice> r(Context context) {
        HashMap map = new HashMap();
        List<BluetoothDevice> connectedGattDevice = GattUtils.getConnectedGattDevice(context);
        if (connectedGattDevice == null || connectedGattDevice.size() == 0) {
            return new ArrayList();
        }
        for (BluetoothDevice bluetoothDevice : connectedGattDevice) {
            map.put(bluetoothDevice.getAddress(), bluetoothDevice);
        }
        return new ArrayList(map.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(AdvData advData) {
        if (advData == null) {
            return;
        }
        for (BleScanOption bleScanOption : this.q) {
            if (w(bleScanOption, advData)) {
                this.n.removeMessages(8, bleScanOption);
                bleScanOption.getCallback().onScanedDevice(advData, bleScanOption);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(final Context context, List<BluetoothDevice> connectedDevices, boolean checkDeviceInfo) {
        for (final BluetoothDevice bluetoothDevice : connectedDevices) {
            Debug.fi(TAG, "connected device:" + bluetoothDevice);
            if (checkDeviceInfo) {
                DeviceInfoScanner.scan(context, bluetoothDevice, new DeviceInfoScanner.IDeviceInfoScanCallback() { // from class: sy
                    @Override // com.xiaomi.hm.health.bt.scan.DeviceInfoScanner.IDeviceInfoScanCallback
                    public final void onDeviceInfoObtained(ArrayList arrayList, DeviceInfo deviceInfo) {
                        this.a.y(bluetoothDevice, arrayList, deviceInfo);
                    }
                });
            } else {
                A(bluetoothDevice, null, HMDeviceSource.VDEVICE);
            }
        }
    }

    private boolean u(List<String> filterAddress, AdvData advData) {
        String address = advData.device.getAddress();
        Iterator<String> it2 = filterAddress.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals(address)) {
                return true;
            }
        }
        return false;
    }

    private boolean v(List<String> filterNames, AdvData advData) {
        String deviceName = advData.getDeviceName();
        if (TextUtils.isEmpty(deviceName)) {
            return false;
        }
        Iterator<String> it2 = filterNames.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals(deviceName)) {
                return true;
            }
        }
        return false;
    }

    private boolean w(BleScanOption exsitOpt, AdvData advData) {
        List<UUID> filterUUIDs = exsitOpt.getFilterUUIDs();
        List<String> filterNames = exsitOpt.getFilterNames();
        List<String> filterAddress = exsitOpt.getFilterAddress();
        if (filterAddress != null && filterAddress.size() > 0 && !u(filterAddress, advData)) {
            Debug.i(TAG, "no match address");
            return false;
        }
        if (filterNames != null && filterNames.size() > 0 && !v(filterNames, advData)) {
            Debug.i(TAG, "no match name");
            return false;
        }
        if (filterAddress != null && filterAddress.size() > 0) {
            B(advData, filterUUIDs);
        }
        if (filterUUIDs == null || filterUUIDs.size() <= 0 || x(filterUUIDs, advData)) {
            if (exsitOpt.getFilter() != null) {
                return exsitOpt.getFilter().isMatch(advData);
            }
            return true;
        }
        Debug.fi(TAG, "no match uuid");
        if (filterAddress != null && filterAddress.size() > 0) {
            B(advData, filterUUIDs);
        }
        return false;
    }

    private boolean x(List<UUID> filterUuids, AdvData advData) {
        Iterator<UUID> it2 = filterUuids.iterator();
        while (it2.hasNext()) {
            if (advData.isMatchUUID(it2.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(BluetoothDevice bluetoothDevice, ArrayList arrayList, DeviceInfo deviceInfo) {
        Debug.i(TAG, "onDeviceInfoObtained:" + deviceInfo);
        A(bluetoothDevice, arrayList, deviceInfo != null ? deviceInfo.getDeviceSource() : HMDeviceSource.VDEVICE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(BluetoothDevice device, int rssi, byte[] scanRecord) {
        Message message = new Message();
        message.what = 7;
        message.obj = new c(scanRecord, device, rssi);
        this.n.sendMessage(message);
    }

    public void setContinuousScan(boolean enable) {
        Message message = new Message();
        message.what = 6;
        message.obj = Boolean.valueOf(enable);
        this.n.sendMessage(message);
    }

    public void startScan(BleScanOption option) {
        Debug.fi(TAG, "startScan<" + option + SearchCriteria.GT);
        if (option == null) {
            return;
        }
        Message message = new Message();
        message.what = 5;
        message.obj = option;
        this.n.sendMessage(message);
    }

    public void stopScan(BleScanOption option) {
        Debug.fi(TAG, "stopScan<" + option + SearchCriteria.GT);
        if (option == null) {
            return;
        }
        this.n.removeMessages(4, option);
        this.n.removeMessages(8, option);
        Message message = new Message();
        message.what = 4;
        message.obj = option;
        this.n.sendMessage(message);
        Debug.fi(TAG, "timeout msg send");
    }
}
