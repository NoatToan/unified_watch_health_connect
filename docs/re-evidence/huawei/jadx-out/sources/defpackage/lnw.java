package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtDevicePairCallback;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lnw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BtDeviceStateCallback f40512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInfo f40513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f40514c;
    private BluetoothDevice d;
    private lnv n;
    private HandlerThread i = null;
    private Handler l = null;
    private boolean h = false;
    private boolean g = false;
    private boolean f = false;
    private int e = 0;
    private BtDevicePairCallback j = new BtDevicePairCallback() { // from class: lnw.4
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDevicePairCallback
        public void onDevicePairing(BluetoothDevice bluetoothDevice) {
            if (bluetoothDevice == null) {
                LogUtil.e("BleAuthenticManager", "onDevicePairing device is null");
            } else {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "state: ", Integer.valueOf(bluetoothDevice.getBondState()));
            }
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDevicePairCallback
        public void onDevicePaired(BluetoothDevice bluetoothDevice) {
            lnw.this.d(2, false);
            Message messageObtainMessage = lnw.this.l.obtainMessage(3);
            messageObtainMessage.obj = bluetoothDevice;
            lnw.this.l.sendMessageDelayed(messageObtainMessage, 1000L);
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDevicePairCallback
        public void onDevicePairNone(BluetoothDevice bluetoothDevice) {
            if (lnw.this.f) {
                lnw.this.f = false;
                try {
                    lnw.this.b();
                    return;
                } catch (SecurityException e) {
                    LogUtil.d("BleAuthenticManager", "onDevicePairNone SecurityException:", ExceptionUtils.c(e));
                    return;
                }
            }
            lnw lnwVar = lnw.this;
            lnwVar.b(lnwVar.d, lnw.this.j);
            lnw.this.f = true;
        }
    };

    public lnw(lnv lnvVar, Context context, BluetoothDevice bluetoothDevice, BtDeviceStateCallback btDeviceStateCallback) {
        this.d = null;
        this.n = null;
        if (lnvVar != null) {
            this.n = lnvVar;
        }
        if (context != null) {
            this.f40514c = context;
        }
        if (bluetoothDevice != null) {
            this.d = bluetoothDevice;
        }
        if (btDeviceStateCallback != null) {
            this.f40512a = btDeviceStateCallback;
        }
        d();
    }

    private void d() {
        HandlerThread handlerThread = new HandlerThread("BleAuthenticManager");
        this.i = handlerThread;
        handlerThread.start();
        this.l = new d(this.i.getLooper());
    }

    public boolean b(DeviceInfo deviceInfo, byte[] bArr) {
        if (deviceInfo == null || bArr == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "processPairResponse() btDeviceInfo or dataContent is null");
            return false;
        }
        this.f40513b = deviceInfo;
        deviceInfo.setDeviceIdentify(deviceInfo.getDeviceIdentify());
        int iH = lmw.h(this.f40514c, bArr);
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "processPairResponse with mBtDeviceInfo :", Integer.valueOf(this.e), " isAllowBind : ", Integer.valueOf(iH));
        if (iH == 0) {
            BtDeviceStateCallback btDeviceStateCallback = this.f40512a;
            if (btDeviceStateCallback != null) {
                btDeviceStateCallback.disconnectBluetooth(this.f40513b, 4);
            }
            d(4, false);
            lnv lnvVar = this.n;
            if (lnvVar != null) {
                lnvVar.a(false, 4);
                this.n.e(false);
                this.n.a();
            }
            return true;
        }
        if (iH != 1) {
            return false;
        }
        d(deviceInfo);
        int i = this.e;
        if (i == 0) {
            lnb.e(this.f40514c).d(this.f40514c);
            this.l.sendEmptyMessageDelayed(4, 1000L);
            return true;
        }
        if (i == 1) {
            d(2, false);
            return true;
        }
        if (i == 2) {
            d(2, false);
            return true;
        }
        LogUtil.e("BleAuthenticManager", "switch mBtVersionInfo in default");
        return true;
    }

    private void d(DeviceInfo deviceInfo) {
        if (this.e == 2) {
            String strA = lnb.e(this.f40514c).a(this.d.getAddress());
            LogUtil.c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BleAuthenticManager", "CommandPackage.authVersion : ", Integer.valueOf(deviceInfo.getAuthVersion()), "CommandPackage.key : ", strA);
            lnb.e(this.f40514c).d(this.d.getAddress(), strA, "btsdk_sharedpreferences_name4", this.f40514c);
        }
    }

    private void d(DeviceInfo deviceInfo, int i) {
        if (i == 12 && deviceInfo.getDeviceProtocol() == 1) {
            e(this.d, true);
        } else {
            b(deviceInfo, lnb.e(this.f40514c).c(this.d.getAddress(), this.f40514c));
            this.l.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private void a(DeviceInfo deviceInfo, lno lnoVar, int i) {
        if (lnoVar.d() == 0) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "handleBondState1 deviceBondState: ", Integer.valueOf(i));
            if (i == 12) {
                d(2, false);
                return;
            } else {
                this.l.sendEmptyMessageDelayed(1, 1000L);
                return;
            }
        }
        String strC = lnb.e(this.f40514c).c(this.d.getAddress(), this.f40514c);
        b(deviceInfo, strC);
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "handleBondState1 key is empty: ", Boolean.valueOf(TextUtils.isEmpty(strC)));
        if (strC != null && !"".equals(strC)) {
            d(2, false);
        } else {
            this.l.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private void b(DeviceInfo deviceInfo, String str) {
        LogUtil.c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BleAuthenticManager", "Encrypt key : ", str);
        if (this.f40513b == null || str == null || deviceInfo.getDeviceProtocol() != 2 || str.length() != 64) {
            return;
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "Need to reset v2 key info empty.");
        lnb.e(this.f40514c).d(this.d.getAddress(), "", "btsdk_sharedpreferences_name4", this.f40514c);
    }

    public boolean a(DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "Enter processBondStatusResponse() btDeviceInfo: ", Boolean.valueOf(deviceInfo == null), " dataContent: ", Boolean.valueOf(bArr == null));
        if (deviceInfo == null || bArr == null) {
            return false;
        }
        this.f40513b = deviceInfo;
        lno lnoVarE = lmw.e(deviceInfo.getDeviceIdentify(), this.f40514c, bArr);
        if (lnoVarE == null) {
            LogUtil.e("0xA0200007", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "bondState parameter is incorrect.");
            return false;
        }
        this.e = lnoVarE.d();
        int iB = lnoVarE.b();
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "mBtVersionInfo : ", Integer.valueOf(this.e), " btServiceMtu: ", Integer.valueOf(iB));
        if (iB != 0) {
            this.n.e(iB);
        } else {
            this.n.e(128);
        }
        try {
            int bondState = this.d.getBondState();
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "deviceBondState is ", Integer.valueOf(bondState), "; BtBindStatus is", Integer.valueOf(lnoVarE.a()), " ;btBindStatusInfo is ", Integer.valueOf(lnoVarE.e()));
            int iA = lnoVarE.a();
            if (iA == 0) {
                d(deviceInfo, bondState);
            } else if (iA != 1) {
                LogUtil.e("BleAuthenticManager", "switch bondState.getBtBindStatus() in default");
            } else {
                b(lnoVarE, deviceInfo, bondState);
            }
            return true;
        } catch (SecurityException e) {
            LogUtil.d("BleAuthenticManager", "onDeviceDiscovered SecurityException:", ExceptionUtils.c(e));
            return false;
        }
    }

    private void b(lno lnoVar, DeviceInfo deviceInfo, int i) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "whileCaseOne bondState.getBtBindStatusInfo(): ", Integer.valueOf(lnoVar.e()), " mIsGetDeviceBondStateFlag: ", Boolean.valueOf(this.g));
        if (lnoVar.e() == 1) {
            a(deviceInfo, lnoVar, i);
        } else if (!this.g) {
            this.l.sendEmptyMessage(5);
            this.g = true;
        } else {
            b();
            this.g = false;
        }
    }

    class d extends Handler {
        d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.e("BleAuthenticManager", "message == null");
                return;
            }
            super.handleMessage(message);
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "received message:", Integer.valueOf(message.what), " mBtDeviceInfo is null:", Boolean.valueOf(lnw.this.f40513b == null));
            int i = message.what;
            if (i == 1) {
                lnw.this.f40514c.sendBroadcast(new Intent("com.huawei.bone.action.REQUEST_BIND_DEVICE"), clx.e);
                lnw.this.n.b(lmw.d(lnw.this.f40514c, lnw.this.d, lnw.this.f40513b, false));
                return;
            }
            if (i == 2) {
                lnw.this.n.d();
                return;
            }
            if (i == 4) {
                lnw lnwVar = lnw.this;
                lnwVar.b(lnwVar.d, lnw.this.j);
            } else {
                if (i == 5) {
                    lnw.this.n.e(20);
                    if (lnw.this.f40513b != null) {
                        lnw.this.n.b(lmw.e(lnw.this.f40513b.getDeviceProtocol(), lnw.this.f40513b));
                        return;
                    }
                    return;
                }
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "SendHandler no this message.what");
            }
        }
    }

    public void b(final BluetoothDevice bluetoothDevice, final BtDevicePairCallback btDevicePairCallback) {
        LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "btDevice: ", Boolean.valueOf(bluetoothDevice == null), " devicePairCallback: ", Boolean.valueOf(btDevicePairCallback == null));
        if (bluetoothDevice == null || btDevicePairCallback == null) {
            return;
        }
        boolean zE = BTDeviceMgrUtil.c().e(bluetoothDevice, btDevicePairCallback);
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "pairDevice(), isResult: ", Boolean.valueOf(zE), " mIsPairingDevice is ", Boolean.valueOf(this.f));
        if (zE) {
            return;
        }
        if (!this.f) {
            this.l.postDelayed(new Runnable() { // from class: lnw.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean zE2 = BTDeviceMgrUtil.c().e(bluetoothDevice, btDevicePairCallback);
                    lnw.this.f = true;
                    if (!zE2) {
                        lnw.this.f = false;
                        lnw.this.b();
                    }
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "pairDevice() postDelayed, isResult: ", Boolean.valueOf(zE2), " pairDeviceFlag : ", Boolean.valueOf(lnw.this.f));
                }
            }, 1000L);
        } else {
            this.f = false;
            b();
        }
    }

    public boolean e(BluetoothDevice bluetoothDevice, boolean z) {
        if (bluetoothDevice == null) {
            return false;
        }
        this.h = z;
        boolean zB = BTDeviceMgrUtil.c().b(bluetoothDevice);
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "unPairDevice() fail unbind isUnPair: ", Boolean.valueOf(zB), " isReconnectFlag : ", Boolean.valueOf(z));
        if (zB && z) {
            b();
            this.l.sendEmptyMessageDelayed(2, 5000L);
            return zB;
        }
        if (!zB && z) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "unPairDevice() fail unbind.");
        } else {
            lnb.e(this.f40514c).d(this.f40514c);
        }
        this.h = false;
        b();
        return zB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, boolean z) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "Enter reportConnectStatus() status : ", Integer.valueOf(i), " isConnectFlag: ", Boolean.valueOf(z), " mIsUnPairFlag: ", Boolean.valueOf(this.h));
        if (i == 3 || i == 0) {
            if (this.h) {
                return;
            }
        } else if (i == 1 && this.h) {
            return;
        } else {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "others");
        }
        DeviceInfo deviceInfo = this.f40513b;
        if (deviceInfo != null) {
            if (this.e == 2) {
                deviceInfo.setEncryptType(1);
            } else {
                deviceInfo.setEncryptType(0);
            }
        }
        if (i == 2) {
            this.n.a(false, 2);
        }
        if (this.f40513b == null || this.f40512a == null) {
            return;
        }
        loa loaVarA = loa.a();
        String deviceIdentify = this.f40513b.getDeviceIdentify();
        if (i == 4) {
            loaVarA.a(deviceIdentify, System.currentTimeMillis());
            loaVarA.d(deviceIdentify, 2010009);
            loaVarA.e(deviceIdentify, AgdConstant.INSTALL_TYPE_DEFAULT);
        }
        this.f40512a.onDeviceConnectionStateChanged(this.f40513b, i, loaVarA.d(deviceIdentify));
    }

    public void b() {
        if (this.n.g() != null) {
            this.n.g().disconnectBTDevice();
        }
        this.e = 0;
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BleAuthenticManager", "disconnect end.");
    }
}
