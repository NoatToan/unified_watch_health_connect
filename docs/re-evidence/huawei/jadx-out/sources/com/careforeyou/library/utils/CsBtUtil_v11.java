package com.careforeyou.library.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.careforeyou.library.bean.CsFatScale;
import com.careforeyou.library.bt.bean.TaskData;
import com.careforeyou.library.enums.EnumProcessResult;
import com.careforeyou.library.enums.Protocal_Type;
import com.careforeyou.library.intface.AsynBLETaskCallback;
import com.careforeyou.library.intface.OnBluetoothListener;
import com.careforeyou.library.intface.OnWeightScalesListener;
import com.careforeyou.library.intface.SeachDeviceCallback;
import com.careforeyou.library.protocal.iStraightFrame;
import com.huawei.operation.ble.BleConstants;
import com.huawei.profile.profile.ProfileExtendConstants;
import defpackage.vo;
import defpackage.vp;
import defpackage.vq;
import defpackage.vs;
import defpackage.vt;
import defpackage.vv;
import defpackage.vx;
import defpackage.wf;
import defpackage.wg;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class CsBtUtil_v11 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile CsBtUtil_v11 f4036c;
    public BluetoothAdapter e;
    private vo f;
    private BluetoothGatt h;
    private Context j;
    private BluetoothGattCharacteristic n;
    private Handler q;
    private BluetoothGattCharacteristic t;
    private BluetoothDevice i = null;
    private OnBluetoothListener g = null;
    private OnWeightScalesListener r = null;
    private final int s = 1500;
    private int k = 11;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4038b = "";
    private Protocal_Type o = Protocal_Type.OKOK;
    private boolean l = false;
    private AsynBLETaskCallback p = null;
    private BluetoothGattCallback m = new BluetoothGattCallback() { // from class: com.careforeyou.library.utils.CsBtUtil_v11.2
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            wf.e("CsBtUtil_v11", "status" + i + "++newState++" + i2);
            if (i == 133) {
                wf.e("CsBtUtil_v11", "status == 133");
                CsBtUtil_v11.this.k = 11;
                bluetoothGatt.close();
                if (CsBtUtil_v11.this.g != null) {
                    CsBtUtil_v11.this.g.bluetoothStateChange(CsBtUtil_v11.this.k);
                    return;
                }
                return;
            }
            if (i2 == 2 && i == 0) {
                wf.e("CsBtUtil_v11", "STATE_CONNECTED++++GATT_SUCCESS");
                CsBtUtil_v11.this.k = 12;
                CsBtUtil_v11.this.q.removeCallbacks(CsBtUtil_v11.this.f4037a);
                CsBtUtil_v11.this.h.discoverServices();
                if (CsBtUtil_v11.this.g != null) {
                    CsBtUtil_v11.this.g.bluetoothStateChange(CsBtUtil_v11.this.k);
                    return;
                }
                return;
            }
            if (i2 == 0) {
                wf.e("CsBtUtil_v11", " BluetoothProfile.STATE_DISCONNECTED");
                bluetoothGatt.close();
                CsBtUtil_v11.this.k = 11;
                if (CsBtUtil_v11.this.g != null) {
                    CsBtUtil_v11.this.g.bluetoothStateChange(CsBtUtil_v11.this.k);
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            if (i == 0) {
                wf.e("CsBtUtil_v11", "GATT_SUCCESS");
                List<BluetoothGattService> services = CsBtUtil_v11.this.h.getServices();
                CsBtUtil_v11.this.k = 10;
                CsBtUtil_v11.this.e(services);
                return;
            }
            wf.e("CsBtUtil_v11", "服务发现失败");
            CsBtUtil_v11.this.k = 11;
            bluetoothGatt.disconnect();
            if (CsBtUtil_v11.this.g != null) {
                CsBtUtil_v11.this.g.bluetoothStateChange(CsBtUtil_v11.this.k);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
            if (CsBtUtil_v11.this.g != null) {
                CsBtUtil_v11.this.g.bluetoothStateChange(2);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            if (CsBtUtil_v11.this.g != null) {
                CsBtUtil_v11.this.g.bluetoothStateChange(3);
            }
            if (CsBtUtil_v11.this.p == null) {
                return;
            }
            if (i == 0) {
                CsBtUtil_v11.this.p.success("");
            } else {
                CsBtUtil_v11.this.p.failed();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            CsBtUtil_v11.this.d(bluetoothGattCharacteristic);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onReadRemoteRssi(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            if (CsBtUtil_v11.this.p == null) {
                return;
            }
            if (i == 0) {
                CsBtUtil_v11.this.p.success("");
            } else {
                CsBtUtil_v11.this.p.failed();
            }
        }
    };
    BroadcastReceiver d = new BroadcastReceiver() { // from class: com.careforeyou.library.utils.CsBtUtil_v11.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.location.MODE_CHANGED")) {
                if (CsBtUtil_v11.this.g != null) {
                    CsBtUtil_v11.this.g.bluetoothStateChange(17);
                    return;
                }
                return;
            }
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
            if (intExtra != 10) {
                if (intExtra == 12 && CsBtUtil_v11.this.g != null) {
                    CsBtUtil_v11.this.g.bluetoothTurnOn();
                    CsBtUtil_v11.this.g.bluetoothStateChange(8);
                    return;
                }
                return;
            }
            if (CsBtUtil_v11.this.g != null) {
                CsBtUtil_v11.this.g.bluetoothTurnOff();
                CsBtUtil_v11.this.g.bluetoothStateChange(7);
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Runnable f4037a = new Runnable() { // from class: com.careforeyou.library.utils.CsBtUtil_v11.4
        @Override // java.lang.Runnable
        public void run() {
            if (CsBtUtil_v11.this.a()) {
                return;
            }
            wf.e("CsBtUtil_v11", "runnableReConnect:  !isConnected()");
            CsBtUtil_v11.this.f();
            CsBtUtil_v11.this.q.postDelayed(this, ProfileExtendConstants.TIME_OUT);
        }
    };

    public enum CONNECT_MODE {
        FSAC,
        Alway_Conn
    }

    public enum Down_Instruction_Type {
        Sync_UserInfo
    }

    public enum Synchronization_Task_Key {
        Time,
        CSDownData,
        BodyMeasurement,
        BodyHistory,
        CSNotify,
        LXUPI,
        LXUPN,
        LXDOWNN,
        Unknown
    }

    public static CsBtUtil_v11 b() {
        if (f4036c == null) {
            synchronized (CsBtUtil_v11.class) {
                if (f4036c == null) {
                    f4036c = new CsBtUtil_v11();
                }
            }
        }
        return f4036c;
    }

    private CsBtUtil_v11() {
        this.e = null;
        this.f = null;
        this.e = BluetoothAdapter.getDefaultAdapter();
        this.f = new vo(this);
    }

    public void a(Context context) {
        this.l = false;
        this.j = context;
        if (vv.b(Build.VERSION.RELEASE, "4.4") < 0) {
            this.q = new Handler(context.getMainLooper());
        } else {
            this.q = new Handler();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.location.MODE_CHANGED");
        context.registerReceiver(this.d, intentFilter);
    }

    public void c() {
        BluetoothGatt bluetoothGatt = this.h;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
        wf.e("CsBtUtil_v11", "disconnectGATT");
        this.k = 11;
    }

    public void e(Context context) {
        try {
            context.unregisterReceiver(this.d);
        } catch (IllegalArgumentException e) {
            if (!e.getMessage().contains("Receiver not registered")) {
                throw e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        boolean z = this.e == null;
        boolean z2 = this.i == null;
        boolean z3 = this.h == null;
        if (z || this.f4038b == null || !e()) {
            return false;
        }
        if (z2) {
            this.i = this.e.getRemoteDevice(this.f4038b);
        } else if (this.i.getAddress() != null && !this.i.getAddress().equalsIgnoreCase(this.f4038b)) {
            this.i = this.e.getRemoteDevice(this.f4038b);
        }
        if (this.i == null) {
            wf.e("CsBtUtil_v11", "mBtDevice == null");
            return false;
        }
        if (!z3) {
            try {
                wf.e("CsBtUtil_v11", "mBtGatt.close()");
                this.h.close();
            } catch (Exception e) {
                if (TextUtils.isEmpty(e.getMessage())) {
                    wf.b("CsBtUtil_v11", e.getMessage());
                }
            }
            this.h = null;
        }
        this.h = this.i.connectGatt(this.j, false, this.m);
        this.k = 14;
        OnBluetoothListener onBluetoothListener = this.g;
        if (onBluetoothListener != null) {
            onBluetoothListener.bluetoothStateChange(14);
        }
        if (this.h != null) {
            wf.e("CsBtUtil_v11", "mBtGatt != null");
            return true;
        }
        wf.e("CsBtUtil_v11", "mBtGatt == null");
        return false;
    }

    public boolean a() {
        int i = this.k;
        return i == 13 || i == 12 || i == 16;
    }

    public void d(String str, Protocal_Type protocal_Type, boolean z) {
        if (this.e == null || str == null || this.l || protocal_Type == Protocal_Type.UNKNOWN || !e() || a()) {
            return;
        }
        wf.e("CsBtUtil_v11", "autoConnect(begin)");
        this.f4038b = str;
        this.o = protocal_Type;
        vo voVar = this.f;
        if (voVar != null) {
            voVar.c();
        }
        if (vp.c() == CONNECT_MODE.Alway_Conn) {
            wf.e("CsBtUtil_v11", "Alway_Conn: " + this.f4038b);
            this.q.removeCallbacks(this.f4037a);
            this.q.postDelayed(this.f4037a, ProfileExtendConstants.TIME_OUT);
            return;
        }
        wf.e("CsBtUtil_v11", "starSeachBindDevice: " + this.f4038b);
        if (z) {
            wf.e("CsBtUtil_v11", "starSeachBindDevice: isScan" + z);
            vq.b().starSeachBindDevice(this.f4038b, new SeachDeviceCallback() { // from class: com.careforeyou.library.utils.CsBtUtil_v11.3
                @Override // com.careforeyou.library.intface.SeachDeviceCallback
                public void success() {
                    wf.e("CsBtUtil_v11", "SeachDeviceCallback::success");
                    vq.b().stopSeachBindDevice();
                    CsBtUtil_v11.this.f();
                }
            });
            return;
        }
        wf.e("CsBtUtil_v11", "starSeachBindDevice: isScan" + z);
        f();
    }

    public void j() {
        Handler handler = this.q;
        if (handler != null) {
            handler.removeCallbacks(this.f4037a);
        }
        if (vp.c() == CONNECT_MODE.FSAC) {
            vq.b().stopSeachBindDevice();
        }
    }

    public void e(OnBluetoothListener onBluetoothListener) {
        this.g = onBluetoothListener;
    }

    public void b(OnWeightScalesListener onWeightScalesListener) {
        this.r = onWeightScalesListener;
        vq.b().setWeightScalesListener(onWeightScalesListener);
    }

    public boolean e() {
        BluetoothAdapter bluetoothAdapter = this.e;
        if (bluetoothAdapter != null) {
            return this.e.isEnabled() && bluetoothAdapter.getState() == 12;
        }
        return false;
    }

    public boolean d() {
        OnBluetoothListener onBluetoothListener = this.g;
        if (onBluetoothListener != null) {
            onBluetoothListener.bluetoothStateChange(9);
        }
        vq.b().startSearching();
        return true;
    }

    public void h() {
        vq.b().stopSearching();
    }

    public void b(Synchronization_Task_Key synchronization_Task_Key, AsynBLETaskCallback asynBLETaskCallback) {
        String str;
        BluetoothGattCharacteristic characteristic;
        String str2 = "0000181b-0000-1000-8000-00805f9b34fb";
        boolean z = true;
        if (synchronization_Task_Key == Synchronization_Task_Key.BodyMeasurement) {
            str = "00002a9c-0000-1000-8000-00805f9b34fb";
        } else if (synchronization_Task_Key == Synchronization_Task_Key.BodyHistory) {
            str = "0000fa9c-0000-1000-8000-00805f9b34fb";
        } else if (synchronization_Task_Key == Synchronization_Task_Key.CSNotify) {
            str2 = "0000fff0-0000-1000-8000-00805f9b34fb";
            str = "0000fff1-0000-1000-8000-00805f9b34fb";
            z = false;
        } else {
            if (synchronization_Task_Key == Synchronization_Task_Key.LXUPI) {
                str = "0000a620-0000-1000-8000-00805f9b34fb";
            } else {
                if (synchronization_Task_Key == Synchronization_Task_Key.LXUPN) {
                    str = "0000a621-0000-1000-8000-00805f9b34fb";
                } else if (synchronization_Task_Key != Synchronization_Task_Key.LXDOWNN) {
                    str = "";
                } else {
                    str = "0000a625-0000-1000-8000-00805f9b34fb";
                }
                z = false;
            }
            str2 = "0000a602-0000-1000-8000-00805f9b34fb";
        }
        BluetoothGattService service = this.h.getService(UUID.fromString(str2));
        if (service != null && (characteristic = service.getCharacteristic(UUID.fromString(str))) != null) {
            this.p = asynBLETaskCallback;
            if (c(characteristic, z)) {
                return;
            }
        }
        AsynBLETaskCallback asynBLETaskCallback2 = this.p;
        if (asynBLETaskCallback2 != null) {
            asynBLETaskCallback2.failed();
        }
    }

    public void c(TaskData taskData, AsynBLETaskCallback asynBLETaskCallback) {
        String str;
        BluetoothGattCharacteristic characteristic;
        String str2 = "00001805-0000-1000-8000-00805f9b34fb";
        if (taskData.f4030b == Synchronization_Task_Key.Time) {
            str = "00002a08-0000-1000-8000-00805f9b34fb";
        } else if (taskData.f4030b != Synchronization_Task_Key.CSDownData) {
            str = "";
        } else {
            str2 = "0000fff0-0000-1000-8000-00805f9b34fb";
            str = "0000fff2-0000-1000-8000-00805f9b34fb";
        }
        BluetoothGattService service = this.h.getService(UUID.fromString(str2));
        if (service != null && (characteristic = service.getCharacteristic(UUID.fromString(str))) != null) {
            this.p = asynBLETaskCallback;
            if (a(characteristic, taskData.d(), Down_Instruction_Type.Sync_UserInfo)) {
                return;
            }
        }
        AsynBLETaskCallback asynBLETaskCallback2 = this.p;
        if (asynBLETaskCallback2 != null) {
            asynBLETaskCallback2.failed();
        }
    }

    public boolean a(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, Down_Instruction_Type down_Instruction_Type) {
        if (this.h == null || this.e == null || bluetoothGattCharacteristic == null) {
            return false;
        }
        bluetoothGattCharacteristic.setValue(bArr);
        bluetoothGattCharacteristic.setWriteType(1);
        return this.h.writeCharacteristic(bluetoothGattCharacteristic);
    }

    /* JADX INFO: renamed from: com.careforeyou.library.utils.CsBtUtil_v11$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f4042c;

        static {
            int[] iArr = new int[Protocal_Type.values().length];
            f4042c = iArr;
            try {
                iArr[Protocal_Type.OKOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private String c(boolean z) {
        if (AnonymousClass5.f4042c[this.o.ordinal()] != 1) {
            return "";
        }
        if (z) {
            return "0000fff1-0000-1000-8000-00805f9b34fb";
        }
        return "0000fff2-0000-1000-8000-00805f9b34fb";
    }

    private String k() {
        if (AnonymousClass5.f4042c[this.o.ordinal()] == 1) {
            return "0000fff0-0000-1000-8000-00805f9b34fb";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<BluetoothGattService> list) {
        if (list == null) {
            return;
        }
        if (this.o == Protocal_Type.OKOKCloud || this.o == Protocal_Type.OKOKCloudV3 || this.o == Protocal_Type.OKOKCloudV4) {
            this.f.c(new TaskData(Synchronization_Task_Key.CSNotify, true));
            this.f.c(new TaskData(Synchronization_Task_Key.BodyMeasurement, true));
            this.f.a();
            this.k = 13;
            OnBluetoothListener onBluetoothListener = this.g;
            if (onBluetoothListener != null) {
                onBluetoothListener.bluetoothStateChange(13);
            }
            OnWeightScalesListener onWeightScalesListener = this.r;
            if (onWeightScalesListener != null) {
                onWeightScalesListener.bluetoothWriteChannelDone(null);
            }
            OnBluetoothListener onBluetoothListener2 = this.g;
            if (onBluetoothListener2 != null) {
                onBluetoothListener2.bluetoothStateChange(16);
                return;
            }
            return;
        }
        String strK = k();
        for (BluetoothGattService bluetoothGattService : list) {
            if (bluetoothGattService.getUuid().toString().compareToIgnoreCase(strK) == 0) {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                    int properties = bluetoothGattCharacteristic.getProperties();
                    String string = bluetoothGattCharacteristic.getUuid().toString();
                    if (properties > 0 && string.compareToIgnoreCase(c(true)) == 0) {
                        this.n = bluetoothGattCharacteristic;
                        a(bluetoothGattCharacteristic, true);
                    }
                    if (properties > 0 && string.compareToIgnoreCase(c(false)) == 0) {
                        this.t = bluetoothGattCharacteristic;
                        this.k = 13;
                        OnBluetoothListener onBluetoothListener3 = this.g;
                        if (onBluetoothListener3 != null) {
                            onBluetoothListener3.bluetoothStateChange(13);
                        }
                        OnWeightScalesListener onWeightScalesListener2 = this.r;
                        if (onWeightScalesListener2 != null) {
                            onWeightScalesListener2.bluetoothWriteChannelDone(this.t);
                        }
                        OnBluetoothListener onBluetoothListener4 = this.g;
                        if (onBluetoothListener4 != null) {
                            onBluetoothListener4.bluetoothStateChange(16);
                        }
                    }
                }
                return;
            }
        }
    }

    private void a(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        BluetoothGatt bluetoothGatt;
        if (this.e == null || (bluetoothGatt = this.h) == null) {
            return;
        }
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(UUID.fromString(BleConstants.CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID));
        if (descriptor != null) {
            descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            this.h.writeDescriptor(descriptor);
        }
    }

    private boolean c(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        BluetoothGatt bluetoothGatt;
        if (this.e == null || (bluetoothGatt = this.h) == null) {
            return false;
        }
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(UUID.fromString(BleConstants.CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID));
        if (descriptor == null) {
            return false;
        }
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        if (z) {
            descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        }
        return this.h.writeDescriptor(descriptor);
    }

    public void e(byte[] bArr) {
        this.f.c(new TaskData(Synchronization_Task_Key.CSDownData, bArr));
        this.f.a();
    }

    public void g() {
        Calendar calendar = Calendar.getInstance();
        byte[] bArrD = wg.d((short) calendar.get(1));
        this.f.c(new TaskData(Synchronization_Task_Key.Time, new byte[]{bArrD[1], bArrD[0], (byte) (calendar.get(2) + 1), (byte) calendar.get(5), (byte) calendar.get(11), (byte) calendar.get(12), (byte) calendar.get(13)}));
        this.f.a();
    }

    public void i() {
        byte[] bArr = new byte[4];
        wg.e(bArr, (int) (System.currentTimeMillis() / 1000), 0);
        this.f.c(new TaskData(Synchronization_Task_Key.Time, bArr));
        this.f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        OnWeightScalesListener onWeightScalesListener;
        byte[] value = bluetoothGattCharacteristic.getValue();
        wf.e("CsBtUtil_v11", "++handleConnectedInfo++" + wg.e(value));
        if (value == null || value.length <= 0) {
            return;
        }
        try {
            iStraightFrame istraightframeD = vt.d(this.o);
            EnumProcessResult enumProcessResultProcess = istraightframeD.process(value, bluetoothGattCharacteristic.getUuid().toString());
            if (enumProcessResultProcess == EnumProcessResult.Received_Scale_Data) {
                wf.e("CsBtUtil_v11", "Received_Scale_Data");
                if (this.g != null) {
                    CsFatScale fatScale = vt.d(this.o).getFatScale();
                    if (fatScale.getLockFlag() == 1) {
                        wf.e("CsBtUtil_v11", "fatScale.getLockFlag() == 1");
                        if (fatScale.getWeight() >= 2.0d && fatScale.getWeight() <= 2000.0d) {
                            if (fatScale.getAxunge() > 0.0d) {
                                if (fatScale.ori_visceral_fat == 25600.0d) {
                                    a(2);
                                } else {
                                    a(1);
                                }
                            }
                            if (fatScale.getHeartRateMeasuringType() == 1) {
                                this.k = 6;
                            }
                        }
                        return;
                    }
                    wf.e("CsBtUtil_v11", "fatScale.getLockFlag() == 0");
                    if (fatScale.getWeight() == 0.0d && fatScale.getAxunge() == 0.0d) {
                        this.k = 4;
                    } else if (fatScale.getWeight() > 0.0d && fatScale.getAxunge() == 0.0d) {
                        this.k = 5;
                    }
                    OnBluetoothListener onBluetoothListener = this.g;
                    if (onBluetoothListener != null) {
                        onBluetoothListener.bluetoothStateChange(this.k);
                    }
                    if (fatScale.isHistoryData()) {
                        wf.e("CsBtUtil_v11", "历史数据");
                        try {
                            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2010-01-01 00:00:00");
                            if (fatScale.weighingDate != null) {
                                if ((fatScale.weighingDate.getTime() >= date.getTime() || fatScale.weighingDate.getTime() <= System.currentTimeMillis()) && (onWeightScalesListener = this.r) != null) {
                                    onWeightScalesListener.specialFatScaleInfo(fatScale);
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (ParseException e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    if (this.r != null) {
                        wf.e("CsBtUtil_v11", "specialFatScaleInfo：" + fatScale.toString());
                        this.r.specialFatScaleInfo(fatScale);
                        return;
                    }
                    return;
                }
                return;
            }
            if (enumProcessResultProcess == EnumProcessResult.Match_User_Msg && (istraightframeD instanceof vx)) {
                vx vxVar = (vx) istraightframeD;
                OnWeightScalesListener onWeightScalesListener2 = this.r;
                if (onWeightScalesListener2 != null) {
                    onWeightScalesListener2.matchUserMsg(vxVar.d());
                }
            }
        } catch (vs e2) {
            e2.printStackTrace();
        }
    }

    public int b(String str) {
        return this.j.getSharedPreferences("chipsea_btLib", 0).getInt("device:" + str, 0);
    }

    private void a(int i) {
        String str = this.f4038b;
        if (str == null || str.length() == 0) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.j.getSharedPreferences("chipsea_btLib", 0).edit();
        editorEdit.putInt("device:" + this.f4038b, i);
        editorEdit.commit();
    }
}
