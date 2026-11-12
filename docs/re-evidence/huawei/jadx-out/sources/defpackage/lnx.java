package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.extractor.AacUtil;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback;
import com.huawei.hwbtsdk.btdatatype.datatype.BluetoothDeviceNode;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lnx {
    private int d = 2000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40520b = true;
    private lnv i = null;
    private boolean h = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInfo f40519a = null;
    private ExtendHandler j = null;
    private String e = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BtDeviceDiscoverCallback f40521c = new BtDeviceDiscoverCallback() { // from class: lnx.1
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscovered(BluetoothDeviceNode bluetoothDeviceNode, int i, byte[] bArr) {
            if (lnx.this.f40520b || bluetoothDeviceNode == null) {
                return;
            }
            try {
                if (bluetoothDeviceNode.getBtDevice() != null) {
                    BluetoothDevice btDevice = bluetoothDeviceNode.getBtDevice();
                    LogUtil.c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BleReconnectManager", "onDeviceDiscovered name:", btDevice.getName());
                    if (lnx.this.c(btDevice.getAddress())) {
                        LogUtil.c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BleReconnectManager", "onDeviceDiscovered with find device but need check.");
                        String address = btDevice.getAddress();
                        lnx lnxVar = lnx.this;
                        lnxVar.e(lnxVar.f40519a.getDeviceIdentify(), address);
                        return;
                    }
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "User disabled current device, so do not need to connect wanted device.");
                }
            } catch (SecurityException e) {
                LogUtil.d("BleReconnectManager", "onDeviceDiscovered SecurityException:", ExceptionUtils.c(e));
            }
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscoveryFinished() {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "discovery finished.");
            if (lnx.this.f40519a != null) {
                lnx lnxVar = lnx.this;
                if (lnxVar.c(lnxVar.f40519a.getDeviceIdentify())) {
                    LogUtil.c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BleReconnectManager", "User do not disable current device, so start to connect wanted device.");
                    lnx.this.j.removeMessages(1);
                    long jD = lnx.this.d();
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    messageObtain.obj = lnx.this.f40519a;
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "Do not find the wanted device so start a new reconnect process with delay Millis: ", Long.valueOf(jD));
                    lnx.this.j.sendMessage(messageObtain, jD);
                    return;
                }
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "User disabled current device, so do not need to connect wanted device.");
            }
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscoveryCanceled() {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "BLE discovery canceled.");
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onFailure(int i, String str) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "BLE discovery failure.");
        }
    };

    public lnx() {
        c();
    }

    private void c() {
        this.j = HandlerCenter.b(new c(), "BleReconnectManager");
    }

    public void c(DeviceInfo deviceInfo) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "Enter tryToReconnectBLE().");
        if (deviceInfo != null) {
            String deviceIdentify = deviceInfo.getDeviceIdentify();
            this.f40519a = deviceInfo;
            if (c(deviceIdentify)) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "User do not disconnect device so start to find device.");
                this.f40520b = false;
                b(deviceInfo);
            }
        }
    }

    public void b(String str) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "Enter stopReconnectBle().");
        this.f40520b = true;
        this.d = 2000;
        this.j.removeMessages(1);
        lmz.b().e(str);
    }

    private void b(DeviceInfo deviceInfo) {
        LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "Enter reconnectBleDevice().");
        this.j.removeMessages(1);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = deviceInfo;
        if (coy.c()) {
            this.j.sendMessage(messageObtain, 4000L);
            return;
        }
        long jD = d();
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "Delay Time is: ", Long.valueOf(jD), "ms");
        this.j.sendMessage(messageObtain, jD);
    }

    class c implements Handler.Callback {
        private c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "mReconnectHandler receive message: ", Integer.valueOf(message.what));
            if (message.what == 1) {
                lnx.this.d(message.obj instanceof DeviceInfo ? (DeviceInfo) message.obj : null);
                return true;
            }
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "mReconnectHandler default message.what");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        if (coy.c()) {
            return 1200000;
        }
        int i = this.d;
        if (i < 256000) {
            int i2 = i * 2;
            this.d = i2;
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "getReconnectDelayMillis() delayMillis: ", Integer.valueOf(i2));
            return this.d;
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "getReconnectDelayMillis() delayMillis: ", Integer.valueOf(AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND));
        return AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "Enter reconnectBleDeviceDelay() with mIsCancel: ", Boolean.valueOf(this.f40520b));
        if (deviceInfo == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "device is null.");
            return;
        }
        if (this.f40520b) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "device already connected so stop reconnect.");
            b(deviceInfo.getDeviceIdentify());
        } else if (BTDeviceMgrUtil.c().h() == 3) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "BT switch is on.");
            a(deviceInfo);
        } else {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "BT switch is not on.");
            b(deviceInfo.getDeviceIdentify());
        }
    }

    private void a(DeviceInfo deviceInfo) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "Enter tryConnectBleDevice().");
        if (deviceInfo == null) {
            LogUtil.e("0xA0200005", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "device is null.");
            return;
        }
        lnv lnvVar = this.i;
        if (lnvVar != null) {
            if (lnvVar.f() != 2 && this.i.f() != 1) {
                this.h = false;
                if (c(deviceInfo.getDeviceIdentify())) {
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "User do not disable current device, so start to discover ble device.");
                    lmz.b().c(deviceInfo.getDeviceIdentify(), this.f40521c);
                    return;
                } else {
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "User disabled current device, so do not need to connect wanted device.");
                    return;
                }
            }
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "do not need reconnect with status = " + this.i.f());
            return;
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "mSendCommandUtil is null.");
    }

    private void e() {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "Enter doConnectBleDevice().");
        lnv lnvVar = this.i;
        if (lnvVar != null) {
            lnvVar.d();
        } else {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "mSendCommandUtil is null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, String str2) {
        if (this.h) {
            return;
        }
        if (TextUtils.equals(str2, str)) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "Find the wanted device.");
            this.h = true;
            LogUtil.c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BleReconnectManager", "Enter verifySearchDestDeviceToReconnect().");
            BTDeviceMgrUtil.c().d();
            lmz.b().e(str2);
            if (c(str2)) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "User do not disable current device, so start to connect wanted device.");
                e();
                return;
            } else {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "User disabled current device, so do not need to connect wanted device.");
                return;
            }
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "verifySearchDestDeviceToReconnect(): find different device.");
    }

    public void c(lnv lnvVar) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "Enter setSendCommandUtilInfo().");
        this.i = lnvVar;
        if (lnvVar != null) {
            lnvVar.i();
        }
    }

    public lnv b() {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleReconnectManager", "Enter getSendCommandUtilInfo().");
        return this.i;
    }

    public String a() {
        return this.e;
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        return this.e.equalsIgnoreCase(str);
    }
}
