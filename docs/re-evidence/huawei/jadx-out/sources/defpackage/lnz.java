package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.text.TextUtils;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.network.embedded.y1;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtDevicePairCallback;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback;
import com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase;
import health.compact.a.LogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class lnz implements BTDeviceServiceBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BluetoothDevice f40526b;
    private int d;
    private d f;
    private e g;
    private BTDeviceMgrUtil h;
    private BtDeviceStateCallback i;
    private int k;
    private int o;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f40524c = new Object();
    private boolean n = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInfo f40525a = new DeviceInfo();
    private BtDevicePairCallback j = new BtDevicePairCallback() { // from class: lnz.3
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDevicePairCallback
        public void onDevicePairing(BluetoothDevice bluetoothDevice) {
            if (bluetoothDevice == null) {
                LogUtil.e("BTDeviceBRService", "onDevicePairing btDevice is null");
                return;
            }
            try {
                LogUtil.b("BTDeviceBRService", "onDevicePairing state: ", Integer.valueOf(bluetoothDevice.getBondState()));
            } catch (SecurityException e2) {
                LogUtil.d("BTDeviceBRService", "mBtDevicePairCallback onDevicePairing SecurityException:", ExceptionUtils.c(e2));
            }
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDevicePairCallback
        public void onDevicePaired(BluetoothDevice bluetoothDevice) {
            LogUtil.b("BTDeviceBRService", "btDevice paired.");
            try {
                if (lnz.this.d(bluetoothDevice)) {
                    lnz.this.n = false;
                    if (!lnz.this.h.e(bluetoothDevice)) {
                        LogUtil.b("BTDeviceBRService", "Need to connect hfp profile.");
                        lnz.this.n = true;
                        lnz.this.h.d(bluetoothDevice);
                    }
                    LogUtil.b("BTDeviceBRService", "Start to connect btDevice.");
                    lnz.this.b(bluetoothDevice);
                    return;
                }
                LogUtil.e("BTDeviceBRService", "not current device.");
            } catch (SecurityException e2) {
                LogUtil.d("BTDeviceBRService", "mBtDevicePairCallback onDevicePaired:", ExceptionUtils.c(e2));
            }
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDevicePairCallback
        public void onDevicePairNone(BluetoothDevice bluetoothDevice) {
            try {
                if (!lnz.this.d(bluetoothDevice)) {
                    LogUtil.e("BTDeviceBRService", "onDevicePairNone not current device.");
                    return;
                }
                LogUtil.b("DEVMGR_SETTING", "BTDeviceBRService", " btDevice pair fail, so connect btDevice fail.");
                lnn.a(1001001);
                lnz.this.k = 1001001;
                lnz.this.a(4);
            } catch (SecurityException e2) {
                LogUtil.d("BTDeviceBRService", "mBtDevicePairCallback onDevicePairNone:", ExceptionUtils.c(e2));
            }
        }
    };

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void connectBTDevice(String str) {
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void setAwAssetCallback(BtDeviceResponseCallback btDeviceResponseCallback) {
    }

    public lnz(Context context, BluetoothDevice bluetoothDevice, BtDeviceStateCallback btDeviceStateCallback, int i) {
        if (context == null) {
            LogUtil.e("BTDeviceBRService", "DEVMGR_SETTING", "context is null.");
        }
        if (bluetoothDevice != null) {
            this.f40526b = bluetoothDevice;
        }
        if (btDeviceStateCallback != null) {
            this.i = btDeviceStateCallback;
        }
        this.h = BTDeviceMgrUtil.c();
        this.f40525a.setDeviceBluetoothType(1);
        this.o = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(BluetoothDevice bluetoothDevice) {
        BluetoothDevice bluetoothDevice2 = this.f40526b;
        if (bluetoothDevice2 == null || TextUtils.isEmpty(bluetoothDevice2.getAddress())) {
            LogUtil.e("BTDeviceBRService", "mBTDevice is invalid");
            return false;
        }
        if (bluetoothDevice == null || TextUtils.isEmpty(bluetoothDevice.getAddress())) {
            LogUtil.e("BTDeviceBRService", "btDevice is invalid");
            return false;
        }
        return this.f40526b.getAddress().equals(bluetoothDevice.getAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BluetoothDevice bluetoothDevice) {
        LogUtil.b("BTDeviceBRService", "Enter connectBTDeviceThread().");
        if (!xgx.d().getAuthorizationStatus(BaseApplication.b())) {
            LogUtil.e("BTDeviceBRService", "br start connect, but not authorize, so return");
            return;
        }
        synchronized (b()) {
            e eVar = this.g;
            if (eVar != null) {
                eVar.e();
                this.g = null;
            }
            LogUtil.b("BTDeviceBRService", "Start ConnectThread.");
            e eVar2 = new e(bluetoothDevice);
            this.g = eVar2;
            eVar2.start();
        }
        synchronized (d()) {
            d dVar = this.f;
            if (dVar != null) {
                dVar.b();
                this.f = null;
            }
        }
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void connectBTDevice(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            LogUtil.e("BTDeviceBRService", "0xA0200006", "btDevice is null.");
            return;
        }
        LogUtil.b("DEVMGR_SETTING", "BTDeviceBRService", "Start to report connecting state.");
        if (this.d == 2) {
            return;
        }
        a(1);
        try {
            lmq.c(bluetoothDevice.getName());
            if (12 != bluetoothDevice.getBondState()) {
                LogUtil.b("BTDeviceBRService", "Need to pair btDevice.");
                if (this.h.e(bluetoothDevice, this.j)) {
                    return;
                }
                LogUtil.b("R_BTDeviceBRService", "btDevice pair failed, so connect btDevice fail.");
                lnn.a(1001001);
                this.k = 1001001;
                a(4);
                return;
            }
            LogUtil.b("BTDeviceBRService", "Do not need to pair btDevice, so connect btDevice directly.");
            b(bluetoothDevice);
        } catch (SecurityException e2) {
            LogUtil.d("BTDeviceBRService", "connectBTDevice SecurityException:", ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BluetoothSocket bluetoothSocket) {
        synchronized (d()) {
            d dVar = this.f;
            if (dVar != null) {
                dVar.b();
                this.f = null;
            }
            d dVar2 = new d(bluetoothSocket);
            this.f = dVar2;
            dVar2.start();
        }
        LogUtil.b("BTDeviceBRService", "Connect success, so report state.");
        a(2);
        lng.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.b("R_BTDeviceBRService", "connectionLost");
        a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.b("R_BTDeviceBRService", "connectionFail:", 1001002);
        lnn.a(1001002);
        this.k = 1001002;
        a(4);
    }

    protected void a(int i) {
        if (i != this.d) {
            this.d = i;
            if (this.i != null) {
                LogUtil.b("BTDeviceBRService", "report connect state : ", Integer.valueOf(i));
                DeviceInfo deviceInfo = this.f40525a;
                if (deviceInfo != null) {
                    try {
                        deviceInfo.setDeviceName(this.f40526b.getName());
                        this.f40525a.setDeviceIdentify(this.f40526b.getAddress());
                    } catch (SecurityException e2) {
                        LogUtil.d("BTDeviceBRService", "setState SecurityException:", ExceptionUtils.c(e2));
                    }
                    loa loaVarA = loa.a();
                    String deviceIdentify = this.f40525a.getDeviceIdentify();
                    if (i == 4) {
                        loaVarA.a(deviceIdentify, System.currentTimeMillis());
                        loaVarA.e(deviceIdentify, AgdConstant.INSTALL_TYPE_DEFAULT);
                        loaVarA.d(deviceIdentify, this.k);
                    }
                    this.i.onDeviceConnectionStateChanged(this.f40525a, this.d, loaVarA.d(deviceIdentify));
                }
            }
        }
    }

    class e extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final BluetoothSocket f40530b;
        private String e;

        /* JADX WARN: Code duplicated, block: B:15:0x004f  */
        /* JADX WARN: Code duplicated, block: B:17:0x0052 A[Catch: SecurityException -> 0x0077, IOException | SecurityException -> 0x0079, TryCatch #2 {IOException | SecurityException -> 0x0079, blocks: (B:8:0x0038, B:10:0x0042, B:12:0x0048, B:17:0x0052, B:21:0x0066, B:22:0x006b, B:18:0x0057, B:19:0x005e), top: B:30:0x0038 }] */
        /* JADX WARN: Code duplicated, block: B:18:0x0057 A[Catch: SecurityException -> 0x0077, IOException | SecurityException -> 0x0079, TryCatch #2 {IOException | SecurityException -> 0x0079, blocks: (B:8:0x0038, B:10:0x0042, B:12:0x0048, B:17:0x0052, B:21:0x0066, B:22:0x006b, B:18:0x0057, B:19:0x005e), top: B:30:0x0038 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x005e A[Catch: SecurityException -> 0x0077, IOException | SecurityException -> 0x0079, TryCatch #2 {IOException | SecurityException -> 0x0079, blocks: (B:8:0x0038, B:10:0x0042, B:12:0x0048, B:17:0x0052, B:21:0x0066, B:22:0x006b, B:18:0x0057, B:19:0x005e), top: B:30:0x0038 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0066 A[Catch: SecurityException -> 0x0077, IOException | SecurityException -> 0x0079, TryCatch #2 {IOException | SecurityException -> 0x0079, blocks: (B:8:0x0038, B:10:0x0042, B:12:0x0048, B:17:0x0052, B:21:0x0066, B:22:0x006b, B:18:0x0057, B:19:0x005e), top: B:30:0x0038 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x006b A[Catch: SecurityException -> 0x0077, IOException | SecurityException -> 0x0079, TRY_LEAVE, TryCatch #2 {IOException | SecurityException -> 0x0079, blocks: (B:8:0x0038, B:10:0x0042, B:12:0x0048, B:17:0x0052, B:21:0x0066, B:22:0x006b, B:18:0x0057, B:19:0x005e), top: B:30:0x0038 }] */
        private e(BluetoothDevice bluetoothDevice) {
            UUID uuidFromString;
            this.e = y1.f15624a;
            LogUtil.b("BTDeviceBRService", "Enter ConnectThread.");
            BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord = null;
            if (bluetoothDevice != null) {
                lnz.this.f40526b = bluetoothDevice;
                int iC = lnz.this.h.c(bluetoothDevice);
                if (-1 == iC) {
                    try {
                        if (TextUtils.isEmpty(bluetoothDevice.getName()) && -1 != lnz.this.o) {
                            iC = lnz.this.o;
                        }
                        if (iC != 1) {
                            uuidFromString = UUID.fromString("82ff3820-8411-400c-b85a-55bdb32cf057");
                        } else if (iC != 7) {
                            uuidFromString = UUID.fromString("82ff3820-8411-400c-b85a-55bdb32cf060");
                        } else {
                            uuidFromString = c(bluetoothDevice);
                        }
                        if (uuidFromString != null) {
                            LogUtil.d("R_BTDeviceBRService", "secureSocketUUID is null.");
                        } else {
                            bluetoothSocketCreateRfcommSocketToServiceRecord = bluetoothDevice.createRfcommSocketToServiceRecord(uuidFromString);
                        }
                    } catch (IOException | SecurityException e) {
                        LogUtil.d("BTDeviceBRService", "0xA0200000", "create socket exception with info : ", e.getMessage());
                        LogUtil.d("R_BTDeviceBRService", "create socket exception.");
                    }
                } else {
                    if (iC != 1) {
                        uuidFromString = UUID.fromString("82ff3820-8411-400c-b85a-55bdb32cf057");
                    } else if (iC != 7) {
                        uuidFromString = UUID.fromString("82ff3820-8411-400c-b85a-55bdb32cf060");
                    } else {
                        uuidFromString = c(bluetoothDevice);
                    }
                    if (uuidFromString != null) {
                        LogUtil.d("R_BTDeviceBRService", "secureSocketUUID is null.");
                    } else {
                        bluetoothSocketCreateRfcommSocketToServiceRecord = bluetoothDevice.createRfcommSocketToServiceRecord(uuidFromString);
                    }
                }
                this.f40530b = bluetoothSocketCreateRfcommSocketToServiceRecord;
                return;
            }
            LogUtil.e("BTDeviceBRService", "0xA0200006", "ConnectThread: device parameter is null.");
            this.f40530b = null;
            lnz.this.f40526b = null;
        }

        private UUID c(BluetoothDevice bluetoothDevice) {
            LogUtil.e("BTDeviceBRService", "Do not find suitable UUID info.");
            try {
                if (TextUtils.isEmpty(bluetoothDevice.getName())) {
                    return null;
                }
                return UUID.fromString("82ff3820-8411-400c-b85a-55bdb32cf060");
            } catch (SecurityException e) {
                LogUtil.d("BTDeviceBRService", "onDeviceNull SecurityException:", ExceptionUtils.c(e));
                return null;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("ConnectThread" + this.e);
            try {
                Thread.sleep(500L);
                if (lnz.this.n) {
                    Thread.sleep(1000L);
                }
            } catch (InterruptedException e) {
                LogUtil.d("BTDeviceBRService", "0xA0200006", "InterruptedException : ", e.getMessage());
            }
            lnz.this.h.e();
            BluetoothSocket bluetoothSocket = this.f40530b;
            if (bluetoothSocket == null) {
                LogUtil.e("BTDeviceBRService", "0xA0200006", "mBTSocket is null.");
                lnz.this.e();
                return;
            }
            try {
                try {
                    bluetoothSocket.connect();
                    b();
                    lnz.this.a(this.f40530b);
                } catch (IOException e2) {
                    LogUtil.d("BTDeviceBRService", "0xA0200000", " mBTSocket connect IOException with info : ", e2.getMessage());
                    lnz.this.e();
                }
            } catch (IOException e3) {
                try {
                    LogUtil.d("BTDeviceBRService", "0xA0200000", " mBTSocket connect IOException1 with info : ", e3.getMessage());
                    lnz.this.d(1011002);
                    this.f40530b.close();
                } catch (IOException e4) {
                    LogUtil.d("BTDeviceBRService", "0xA0200000", " mBTSocket connect IOException2 with info : ", e4.getMessage());
                }
                lnz.this.e();
            } catch (Exception unused) {
                LogUtil.d("BTDeviceBRService", "0xA0200000", " mBTSocket connect NullPointerException1 with info");
                this.f40530b.close();
                lnz.this.e();
            }
        }

        private void b() {
            LogUtil.b("BTDeviceBRService", "Start DataTransferThread.");
        }

        public void e() {
            try {
                BluetoothSocket bluetoothSocket = this.f40530b;
                if (bluetoothSocket != null) {
                    bluetoothSocket.close();
                }
            } catch (IOException e) {
                LogUtil.d("BTDeviceBRService", "0xA0200000", " Close socket exception with info : ", e.getMessage());
            }
        }
    }

    class d extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OutputStream f40528a;
        private final BluetoothSocket d;
        private final InputStream e;

        private d(BluetoothSocket bluetoothSocket) {
            InputStream inputStream;
            this.d = bluetoothSocket;
            OutputStream outputStream = null;
            try {
                inputStream = bluetoothSocket.getInputStream();
                try {
                    outputStream = bluetoothSocket.getOutputStream();
                } catch (IOException e) {
                    e = e;
                    LogUtil.d("BTDeviceBRService", "0xA0200006", "Get Input Stream Handle exception with info : ", e.getMessage());
                }
            } catch (IOException e2) {
                e = e2;
                inputStream = null;
            }
            this.e = inputStream;
            this.f40528a = outputStream;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            byte[] bArr = new byte[AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED];
            while (true) {
                try {
                    Arrays.fill(bArr, (byte) 0);
                    int i = this.e.read(bArr);
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i);
                    cpl.d("BTDeviceBRService", bArrCopyOfRange, 0, "BTDeviceBRService", "MessageAPI Device-->SDK: ");
                    if (lnz.this.i != null && lnz.this.f40525a != null) {
                        lnz.this.f40525a.setDeviceName(lnz.this.f40526b.getName());
                        lnz.this.f40525a.setDeviceIdentify(lnz.this.f40526b.getAddress());
                        LogUtil.b("BTDeviceBRService", "dataLen : ", Integer.valueOf(i));
                        lnz.this.i.onDataReceived(lnz.this.f40525a, i, bArrCopyOfRange);
                    }
                } catch (IOException | SecurityException e) {
                    LogUtil.d("BTDeviceBRService", "0xA0200006", " SPP Socket read occur IOException with info : ", e.getMessage());
                    lnz.this.a();
                    lnz.this.d(1021002);
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(byte[] bArr) {
            try {
                if (this.f40528a != null) {
                    lmq.e("BTDeviceBRService", cph.d(bArr));
                    this.f40528a.write(bArr);
                } else {
                    LogUtil.e("BTDeviceBRService", "Send BT Data with mBTOutStream is null.");
                }
            } catch (IOException e) {
                LogUtil.d("BTDeviceBRService", "0xA0200006", " SPP Socket send occur IOException with info : ", e.getMessage());
                lnz.this.a();
                lnz.this.d(1031002);
            }
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0019 -> B:22:0x0026). Please report as a decompilation issue!!! */
        public void b() {
            try {
                InputStream inputStream = this.e;
                if (inputStream != null) {
                    inputStream.close();
                } else {
                    LogUtil.e("BTDeviceBRService", "Cancel Spp Socket with mBTInStream is null.");
                }
            } catch (IOException e) {
                LogUtil.d("BTDeviceBRService", "0xA0200000", "In Stream close occur IOException with info : ", e.getMessage());
            }
            try {
                OutputStream outputStream = this.f40528a;
                if (outputStream != null) {
                    outputStream.close();
                } else {
                    LogUtil.e("BTDeviceBRService", "Cancel Spp Socket with mBTOutStream is null.");
                }
            } catch (IOException e2) {
                LogUtil.d("BTDeviceBRService", "0xA0200000", "Out Stream close occur IOException with info : ", e2.getMessage());
            }
            try {
                this.d.close();
            } catch (IOException e3) {
                LogUtil.d("BTDeviceBRService", "0xA0200000", "Socket close occur IOException with info : ", e3.getMessage());
            }
        }
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void disconnectBTDevice() {
        LogUtil.b("DEVMGR_SETTING", "BTDeviceBRService", "Enter disconnectBTDevice.");
        synchronized (b()) {
            e eVar = this.g;
            if (eVar != null) {
                eVar.e();
                this.g = null;
            }
        }
        synchronized (d()) {
            d dVar = this.f;
            if (dVar != null) {
                dVar.b();
                this.f = null;
            }
        }
        a(3);
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public boolean sendBTDeviceData(byte[] bArr) {
        d dVar;
        if (bArr == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceBRService", "btDeviceData is null");
            return false;
        }
        synchronized (this) {
            if (2 != this.d) {
                LogUtil.e("BTDeviceBRService", "Connect State is not connect.");
                return false;
            }
            synchronized (d()) {
                dVar = this.f;
            }
            if (dVar != null) {
                dVar.e(bArr);
                return true;
            }
            LogUtil.e("BTDeviceBRService", "dataTransferThread is null.");
            return false;
        }
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void onDestroy() {
        this.f40526b = null;
        this.i = null;
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public DeviceInfo getDeviceInfo() {
        return this.f40525a;
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void btSwitchChangeInfo(int i) {
        LogUtil.b("BTDeviceBRService", "Enter btSwitchChangeInfo() with status : ", Integer.valueOf(i));
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void sendBTFilePath(String str) {
        LogUtil.b("BTDeviceBRService", "Enter sendBTFilePath in br");
        if (str == null) {
            LogUtil.e("BTDeviceBRService", "path is null");
        }
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void setFileCallback(BtDeviceResponseCallback btDeviceResponseCallback) {
        LogUtil.b("BTDeviceBRService", "Enter setFileCallback in br.");
        if (btDeviceResponseCallback == null) {
            LogUtil.e("BTDeviceBRService", "callback is null");
        }
    }

    private static Object d() {
        Object obj;
        synchronized (lnz.class) {
            obj = f40524c;
        }
        return obj;
    }

    private static Object b() {
        Object obj;
        synchronized (lnz.class) {
            obj = e;
        }
        return obj;
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void disconnectGMS() {
        LogUtil.b("BTDeviceBRService", "start to disconnectGMS in br.");
        this.d = 3;
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void removeV1CheckCommand() {
        LogUtil.b("BTDeviceBRService", "start to removeV1CheckCommand in br.");
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public void setPathExtendNum(int i) {
        LogUtil.b("BTDeviceBRService", "Enter setPathExtendNum in br with pathExtendNum : ", Integer.valueOf(i));
    }

    @Override // com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase
    public int getBTDeviceConnectState() {
        int i;
        synchronized (this) {
            i = this.d;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (this.h.e(this.f40526b)) {
            lng.a(i);
        }
    }
}
