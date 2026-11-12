package com.huami.watch.companion.ble.lostwarning;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import com.huami.watch.companion.ble.utils.BLEScanRecord;
import com.huami.watch.companion.ble.utils.GetString;
import com.huami.watch.util.Log;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
class a {
    private static final boolean l = true;
    private static final String m = "BleDeviceScanner";
    private static final int n = 1;
    private static final int o = 101;
    private static final int p = 102;
    private static final int q = 103;
    private static final int r = 4000;
    private static final int s = 2000;
    private static final int t = 104;
    private static final int u = 105;
    private static final int v = 106;
    private static final int w = 5;
    private static final int x = 6;
    private Context b;
    private HandlerThread c;
    private c d;
    private BluetoothManager e;
    private String g;
    private com.huami.watch.companion.ble.lostwarning.c i;
    private int a = 30000;
    private ArrayList<BluetoothDevice> f = new ArrayList<>();
    private int h = -1;
    private BluetoothAdapter.LeScanCallback j = new C0650a();
    private com.huami.watch.companion.ble.lostwarning.b k = new b();

    /* JADX INFO: renamed from: com.huami.watch.companion.ble.lostwarning.a$a, reason: collision with other inner class name */
    public class C0650a implements BluetoothAdapter.LeScanCallback {
        public C0650a() {
        }

        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            try {
                byte[] serviceData = BLEScanRecord.parseFromBytes(bArr).getServiceData(LostWarningConstant.MI_SERVICE);
                if (serviceData != null) {
                    Log.d(a.m, "onLeScan: found Amazfit Watch " + bluetoothDevice.getName() + "\n    serviceData:" + GetString.toString(serviceData), new Object[0]);
                    if (serviceData.length >= 11) {
                        String str = String.format(Locale.US, "%02X:%02X:%02X:%02X:%02X:%02X", Byte.valueOf(serviceData[10]), Byte.valueOf(serviceData[9]), Byte.valueOf(serviceData[8]), Byte.valueOf(serviceData[7]), Byte.valueOf(serviceData[6]), Byte.valueOf(serviceData[5]));
                        Log.d(a.m, "  mac in serviceData: " + str, new Object[0]);
                        if (a.this.g.equals(str)) {
                            Log.d(a.m, "  verifyed success!", new Object[0]);
                            a.this.n();
                            a.this.d.sendMessageDelayed(a.this.d.obtainMessage(106, bluetoothDevice), 1L);
                        }
                    }
                }
            } catch (Exception e) {
                Log.d(a.m, "onLeScan Exception: " + e.getClass().getName(), new Object[0]);
            }
        }
    }

    public class b implements com.huami.watch.companion.ble.lostwarning.b {
        public b() {
        }

        @Override // com.huami.watch.companion.ble.lostwarning.b
        public boolean a(String str) {
            Log.d(a.m, "onDeviceVerifyed: " + str, new Object[0]);
            if (a.this.g.equals(str)) {
                a.this.d.sendEmptyMessageDelayed(105, 1L);
                return true;
            }
            a.this.h++;
            a.this.d.sendEmptyMessageDelayed(104, 1L);
            return false;
        }

        @Override // com.huami.watch.companion.ble.lostwarning.b
        public void b(boolean z) {
            Log.d(a.m, "onDevicePerform: " + z, new Object[0]);
            a.this.d.sendEmptyMessageDelayed(102, 1L);
        }

        @Override // com.huami.watch.companion.ble.lostwarning.b
        public void onStateChanged(int i) {
            if (i != 2) {
                return;
            }
            Log.d(a.m, "VerifyConsumer onStateChanged: STATE_READY", new Object[0]);
            a.this.d.removeMessages(104);
            a.this.d.sendEmptyMessageDelayed(104, 1L);
        }
    }

    public class c extends Handler {
        private c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 101:
                    Log.d(a.m, "CMD_START_SCAN", new Object[0]);
                    a.this.l();
                    sendEmptyMessageDelayed(103, 1L);
                    removeMessages(102);
                    sendEmptyMessageDelayed(102, a.this.a);
                    break;
                case 102:
                    Log.d(a.m, "CMD_STOP_SCAN", new Object[0]);
                    a.this.n();
                    a.this.f.clear();
                    a.this.h = -1;
                    removeMessages(103);
                    break;
                case 103:
                    a.this.o();
                    removeMessages(104);
                    sendEmptyMessageDelayed(104, 1L);
                    removeMessages(103);
                    sendEmptyMessageDelayed(103, 4000L);
                    break;
                case 104:
                    Log.d(a.m, "CMD_VERIFY_DEVICE", new Object[0]);
                    if (a.this.f.size() > 0 && a.this.h < a.this.f.size()) {
                        if (a.this.i.b() != 2) {
                            Log.d(a.m, "VerifyStateMachine status not ready, try again later.", new Object[0]);
                            sendEmptyMessageDelayed(104, 2000L);
                            break;
                        } else {
                            BluetoothDevice bluetoothDevice = (BluetoothDevice) a.this.f.get(a.this.h);
                            Log.d(a.m, " verify next device " + a.this.h + " Name:" + bluetoothDevice.getName() + " MAC:" + bluetoothDevice.getAddress() + " Type:" + bluetoothDevice.getType(), new Object[0]);
                            int iA = a.this.i.a(bluetoothDevice);
                            if (iA == -2) {
                                Log.d(a.m, "VerifyStateMachine status error, try again later.", new Object[0]);
                                sendEmptyMessageDelayed(104, 2000L);
                                break;
                            } else if (iA == 0) {
                                Log.d(a.m, "Connecting device " + bluetoothDevice.getAddress(), new Object[0]);
                                break;
                            }
                        }
                    }
                    break;
                case 105:
                    Log.d(a.m, "CMD_MATCHED_CONNECTED_DEVICE", new Object[0]);
                    a.this.i.h(1);
                    break;
                case 106:
                    Log.d(a.m, "CMD_MATCHED_LESCAN_DEVICE", new Object[0]);
                    removeMessages(102);
                    removeMessages(103);
                    removeMessages(104);
                    a.this.f.clear();
                    a.this.h = 0;
                    a.this.f.add((BluetoothDevice) message.obj);
                    sendEmptyMessageDelayed(104, 1L);
                    break;
            }
        }
    }

    public a(Context context) {
        this.b = context;
        HandlerThread handlerThread = new HandlerThread(m);
        this.c = handlerThread;
        handlerThread.start();
        this.d = new c(this.c.getLooper());
        this.e = (BluetoothManager) this.b.getSystemService(DeviceSettingApiImpl.META_KEY_BLUETOOTH);
        this.i = new com.huami.watch.companion.ble.lostwarning.c(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Log.d(m, "startLeScan", new Object[0]);
        this.e.getAdapter().startLeScan(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Log.d(m, "stopLeScan", new Object[0]);
        try {
            this.e.getAdapter().stopLeScan(this.j);
        } catch (Exception e) {
            Log.e(m, e.getMessage(), e, new Object[0]);
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Log.d(m, "updateConnectedDevices", new Object[0]);
        for (BluetoothDevice bluetoothDevice : this.e.getConnectedDevices(8)) {
            if (this.f.indexOf(bluetoothDevice) < 0) {
                this.f.add(bluetoothDevice);
                Log.d(m, "  add connected device " + bluetoothDevice, new Object[0]);
            }
        }
        if (this.f.size() <= 0 || this.h >= 0) {
            return;
        }
        this.h = 0;
    }

    public void k() {
        Log.d(m, "onDestroy", new Object[0]);
        n();
        this.c.getLooper().quitSafely();
        this.d.removeCallbacksAndMessages(null);
        this.i.d();
    }

    public void m(int i, String str) {
        Log.d(m, "startScan timeout:" + i + " verifyMac:" + str, new Object[0]);
        if (i <= 0) {
            i = 20000;
        }
        this.a = i;
        this.g = str;
        this.i.e(this.k);
        this.i.f();
        this.d.removeMessages(102);
        this.d.removeMessages(101);
        this.d.sendEmptyMessageDelayed(102, 1L);
        this.d.sendEmptyMessageDelayed(101, 1L);
    }
}
