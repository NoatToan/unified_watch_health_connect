package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback;
import com.huawei.hwbtsdk.btdatatype.datatype.OperationDeviceInfo;
import com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase;
import com.huawei.hwbtsdk.btmanager.btdeviceservice.WearableSwitchAdapter;
import com.huawei.hwbtsdk.btmanager.btlinklayerwrap.BTDeviceDataWrapBase;
import health.compact.a.LogUtil;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public class lnv {
    private Context ad;
    private boolean ah;
    private String am;
    private loa ao;
    private OperationDeviceInfo aq;
    private lnw g;
    private BluetoothDevice h;
    private lnr p;
    private BTDeviceServiceBase q;
    private int r;
    private BtDeviceStateCallback w;
    private int al = -1;
    private int aj = -1;
    private int an = -1;
    private int ai = -1;
    private int i = 0;
    private String j = "";
    private String f = "";
    private String ag = AgdConstant.INSTALL_TYPE_AUTO;
    private String af = "0100";
    private BTDeviceDataWrapBase k = null;
    private lnq ax = new lnq();
    private int o = 0;
    private int m = 0;
    private List<lnr> l = new ArrayList(128);
    private boolean ap = false;
    private lnr t = new lnr();
    private int as = -1;
    private int at = -1;
    private int av = -1;
    private int ba = -1;
    private int au = -1;
    private int v = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f40507c = new Object();
    private final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40505a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40506b = false;
    private boolean ae = false;
    private BTDeviceMgrUtil n = BTDeviceMgrUtil.c();
    private boolean z = false;
    private boolean ak = false;
    private int u = 1;
    private ExtendHandler ar = null;
    private int y = 0;
    private int x = 0;
    private boolean ac = false;
    private boolean ab = true;
    private boolean aa = true;
    private boolean bb = true;
    private boolean aw = false;
    private ExecutorService az = Executors.newFixedThreadPool(2);
    private final Object bc = new Object();
    private boolean e = false;
    private BtDeviceStateCallback s = new BtDeviceStateCallback() { // from class: lnv.4
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback
        public void disconnectBluetooth(DeviceInfo deviceInfo, int i) {
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback
        public void onAckReceived(DeviceInfo deviceInfo, int i, byte[] bArr) {
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback
        public void onDeviceConnectionStateChanged(DeviceInfo deviceInfo, int i, OperationDeviceInfo operationDeviceInfo) {
            lnv.this.e(deviceInfo, i, operationDeviceInfo);
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback
        public void onDataReceived(DeviceInfo deviceInfo, int i, byte[] bArr) {
            lnv.this.c(deviceInfo, i, bArr);
        }
    };

    public lnv(Context context, lnu lnuVar) {
        this.ad = null;
        this.r = -1;
        this.am = "";
        this.h = null;
        this.q = null;
        this.w = null;
        if (lnuVar == null) {
            LogUtil.e("BTDeviceSendCommandUtil", "Enter BTDeviceSendCommandUtil() sendCommandUtilInfo is null");
            return;
        }
        int iE = lnuVar.e();
        BluetoothDevice bluetoothDeviceA = lnuVar.a();
        String strB = lnuVar.b();
        BtDeviceStateCallback btDeviceStateCallbackC = lnuVar.c();
        LogUtil.b("BTDeviceSendCommandUtil", "Enter BTDeviceSendCommandUtil().", strB);
        if (btDeviceStateCallbackC != null) {
            this.w = btDeviceStateCallbackC;
        }
        this.r = iE;
        this.h = bluetoothDeviceA;
        this.am = strB;
        if (context != null) {
            this.ad = context;
        }
        String strD = lnuVar.d();
        int iF = lnuVar.f();
        BTDeviceServiceBase bTDeviceServiceBaseE = e(bluetoothDeviceA, strD, this.s, iF, strB);
        this.q = bTDeviceServiceBaseE;
        if (bTDeviceServiceBaseE == null) {
            LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", " initBTDeviceService with return null.");
        }
        this.ao = loa.a();
        e(bluetoothDeviceA, iF);
        x();
    }

    public void a(int i) {
        if (this.h != null) {
            LogUtil.c("BTDeviceSendCommandUtil", "confirmOrCancel : " + i);
            if (i == 0) {
                this.ah = false;
            } else {
                this.ah = true;
            }
            this.e = false;
            b(lmw.e(i));
        }
    }

    private void x() {
        this.ar = HandlerCenter.b(new e(), "BTDeviceSendCommandUtil");
    }

    private BTDeviceServiceBase e(BluetoothDevice bluetoothDevice, String str, BtDeviceStateCallback btDeviceStateCallback, int i, String str2) {
        LogUtil.b("BTDeviceSendCommandUtil", "initBTDeviceService with btType is ", Integer.valueOf(this.r));
        int i2 = this.r;
        if (-1 == i2) {
            LogUtil.b("BTDeviceSendCommandUtil", "0xA0200008", " initBTDeviceService with btType is unknown");
            return null;
        }
        if (i2 == 0) {
            return WearableSwitchAdapter.b().e(null, btDeviceStateCallback);
        }
        if (i2 == 1) {
            return new lnz(this.ad, bluetoothDevice, btDeviceStateCallback, i);
        }
        if (i2 == 2) {
            lob lobVar = new lob(this.ad, bluetoothDevice, str, btDeviceStateCallback);
            this.g = new lnw(this, this.ad, this.h, this.w);
            return lobVar;
        }
        if (i2 == 5) {
            return WearableSwitchAdapter.b().e(str2, btDeviceStateCallback);
        }
        LogUtil.e("BTDeviceSendCommandUtil", "initBTDeviceService() default");
        return null;
    }

    private void e(BluetoothDevice bluetoothDevice, int i) {
        LogUtil.b("BTDeviceSendCommandUtil", "Enter initBTDeviceLinkLayerBaseInfo() with mBTType:", Integer.valueOf(this.r));
        int i2 = this.r;
        if (i2 == 0 || i2 == 5) {
            this.aj = 65535;
            this.an = 65535;
            this.ai = 0;
            this.al = 2;
            if (this.k == null) {
                this.k = new loh(this.ad, 65535);
                return;
            }
            return;
        }
        if (bluetoothDevice != null) {
            int iC = this.n.c(bluetoothDevice);
            if (-1 == iC && TextUtils.isEmpty(bluetoothDevice.getName()) && i != -1) {
                LogUtil.b("BTDeviceSendCommandUtil", "Use the product Type.");
            } else {
                i = iC;
            }
            f(i);
            if (this.k == null) {
                int i3 = this.al;
                if (i3 == 1) {
                    this.k = new lny(this.ad, this.aj);
                    return;
                } else if (i3 == 2) {
                    this.k = new loh(this.ad, this.aj);
                    return;
                } else {
                    LogUtil.e("BTDeviceSendCommandUtil", "initBTDeviceLinkLayerBaseInfo() default");
                    return;
                }
            }
            return;
        }
        LogUtil.b("BTDeviceSendCommandUtil", "btDevice is null.");
    }

    private void f(int i) {
        LogUtil.b("BTDeviceSendCommandUtil", "Device product type is ", Integer.valueOf(i));
        if (i == 0) {
            this.al = 0;
            this.aj = 128;
            this.an = 128;
            this.ai = 0;
            return;
        }
        if (i == 1) {
            this.al = 1;
            this.aj = 128;
            this.an = 128;
            this.ai = 0;
            return;
        }
        if (i == 5) {
            this.al = 1;
            this.aj = 20;
            this.an = 20;
            this.ai = 10;
            return;
        }
        this.al = 2;
        this.aj = 255;
        this.an = 255;
        this.ai = 10;
    }

    public void e(int i) {
        this.aj = i;
    }

    public int j() {
        return this.o;
    }

    public void d(int i) {
        LogUtil.b("BTDeviceSendCommandUtil", "Enter setBTDeviceActiveState() with activeState is ", Integer.valueOf(i));
        this.o = i;
    }

    public int f() {
        LogUtil.b("BTDeviceSendCommandUtil", "getBTDeviceConnectState with state is ", Integer.valueOf(this.m));
        return this.m;
    }

    public void d() {
        if (this.q != null) {
            this.aa = true;
            ExtendHandler extendHandler = this.ar;
            if (extendHandler != null) {
                extendHandler.removeMessages(3);
            }
            if (this.r != 1 || this.q.getBTDeviceConnectState() != 2) {
                this.aw = true;
                ExtendHandler extendHandler2 = this.ar;
                if (extendHandler2 != null) {
                    extendHandler2.sendEmptyMessage(3, 60000L);
                }
            }
            int i = this.r;
            if (i == 0 || 5 == i) {
                this.q.connectBTDevice(this.am);
                return;
            } else {
                this.q.connectBTDevice(this.h);
                return;
            }
        }
        LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", "connectBTDevice: mBTDeviceServiceBase is null.");
    }

    public void a() {
        BTDeviceServiceBase bTDeviceServiceBase = this.q;
        if (bTDeviceServiceBase != null) {
            bTDeviceServiceBase.disconnectBTDevice();
        } else {
            LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", " disconnectBTDevice: mBTDeviceServiceBase is null.");
        }
    }

    private String e(String str) {
        LogUtil.b("BTDeviceSendCommandUtil", "Enter getAuthenticTokenValue().");
        if (16 == this.j.length() / 2 && 16 == this.f.length() / 2) {
            byte[] bArrD = cph.d(this.j);
            byte[] bArrD2 = cph.d(this.f);
            byte[] bArr = new byte[32];
            System.arraycopy(bArrD, 0, bArr, 0, 16);
            System.arraycopy(bArrD2, 0, bArr, 16, 16);
            String strT = t();
            LogUtil.b("BTDeviceSendCommandUtil", "old strCak is ", strT, " after convert old strCak to Hex is ", cph.b(strT));
            try {
                return cph.d(lnh.a(lnh.a(cph.d(strT + str), bArr), bArr));
            } catch (UnsupportedEncodingException unused) {
                LogUtil.d("BTDeviceSendCommandUtil", "HMac256 occur exception with info is UnsupportedEncodingException");
                return null;
            } catch (InvalidKeyException unused2) {
                LogUtil.d("BTDeviceSendCommandUtil", "HMac256 occur exception with info is InvalidKeyException");
                return null;
            } catch (NoSuchAlgorithmException unused3) {
                LogUtil.d("BTDeviceSendCommandUtil", "HMac256 occur exception with info is NoSuchAlgorithmException");
                return null;
            }
        }
        LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", " Authentic Random parameter is incorrect.");
        return null;
    }

    private String t() {
        LogUtil.b("BTDeviceSendCommandUtil", "getCak enter");
        int i = this.i;
        if (i == 2) {
            return cqr.e(cqh.c(1, 31) + cqh.c(1, AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED) + cqh.c(1, 2031));
        }
        if (i == 1) {
            return cqr.e(cqh.c(1, 30) + cqh.c(1, 1030) + cqh.c(1, 2030));
        }
        if (i == 3) {
            String strC = cqh.c(1, 23);
            String strC2 = cqh.c(1, 1023);
            String strC3 = cqh.c(1, 2023);
            LogUtil.c("BTDeviceSendCommandUtil", "getCak first is ", strC, " getCak second is ", strC2, " getCak third is ", strC3);
            try {
                byte[] bArrE = cqh.e(Base64.decode(strC + strC2 + strC3, 0));
                if (bArrE != null) {
                    return new String(bArrE, "UTF-8");
                }
                LogUtil.e("BTDeviceSendCommandUtil", "getCak bytes is null.");
                return "";
            } catch (UnsupportedEncodingException unused) {
                LogUtil.d("BTDeviceSendCommandUtil", "getCak UnsupportedEncodingException");
            }
        } else {
            LogUtil.b("BTDeviceSendCommandUtil", "no support  SECRET_KEY", Integer.valueOf(i));
        }
        LogUtil.b("BTDeviceSendCommandUtil", "getCak exception, the mAuthenticVersion is ", Integer.valueOf(this.i));
        return "";
    }

    private boolean c(DeviceInfo deviceInfo) {
        LogUtil.b("BTDeviceSendCommandUtil", "Enter startAuthenticBTDevice().");
        if (32 != this.j.length()) {
            LogUtil.b("BTDeviceSendCommandUtil", "RandA parameter is incorrect so stop authentic");
            return false;
        }
        try {
            byte[] bArrA = lnh.a(16);
            if (bArrA == null) {
                LogUtil.e("BTDeviceSendCommandUtil", "generateRandomBytes fail.");
                return false;
            }
            this.f = cph.d(bArrA);
            String strE = e(this.af);
            if (strE == null) {
                return false;
            }
            a(strE, deviceInfo);
            return true;
        } catch (NoSuchAlgorithmException unused) {
            LogUtil.d("BTDeviceSendCommandUtil", "generateRandomBytes exception with info is NoSuchAlgorithmException");
            return false;
        }
    }

    private void a(String str, DeviceInfo deviceInfo) {
        lnr lnrVarC = lmw.c(this.ad, this.i, str, this.f, deviceInfo);
        LogUtil.b("BTDeviceSendCommandUtil", "Start to request authentic.");
        b(lnrVarC);
    }

    private boolean a(DeviceInfo deviceInfo, String str) {
        LogUtil.b("BTDeviceSendCommandUtil", "Enter checkAuthenticBTDevice().");
        if (16 == this.j.length() / 2 && 16 == this.f.length() / 2) {
            String strE = e(this.ag);
            if (strE != null) {
                return str.equalsIgnoreCase(strE);
            }
            LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", " Authentic codeInfoHex is incorrect.");
            return false;
        }
        LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", " Authentic Random parameter is incorrect.");
        return false;
    }

    private void c(int i, int i2) {
        if (this.au == i && this.v == i2) {
            this.x = 0;
            aa();
        }
    }

    private void e(DeviceInfo deviceInfo, int i, byte[] bArr) {
        if (c(deviceInfo, bArr)) {
            LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", " parameter is incorrect.");
            return;
        }
        if (d(bArr)) {
            LogUtil.b("BTDeviceSendCommandUtil", "reconnect, do not resolve before command.");
            c(bArr[0], bArr[1]);
            return;
        }
        byte b2 = bArr[0];
        byte b3 = bArr[1];
        if (b2 != 1) {
            LogUtil.b("BTDeviceSendCommandUtil", "handshake report data with V2.");
            this.w.onDataReceived(deviceInfo, i, bArr);
            return;
        }
        if (b3 == 1) {
            a(deviceInfo, bArr);
            return;
        }
        if (b3 == 19) {
            f(deviceInfo, bArr);
            return;
        }
        if (b3 == 15) {
            j(deviceInfo, bArr);
            return;
        }
        if (b3 == 14) {
            h(deviceInfo, bArr);
        } else if (b3 == 22) {
            i(deviceInfo, bArr);
        } else {
            LogUtil.b("BTDeviceSendCommandUtil", "handshake report data with V2.");
            this.w.onDataReceived(deviceInfo, i, bArr);
        }
    }

    private boolean c(DeviceInfo deviceInfo, byte[] bArr) {
        return this.w == null || deviceInfo == null || bArr == null;
    }

    private boolean d(byte[] bArr) {
        return this.aw && !(bArr[0] == 1 && bArr[1] == 1);
    }

    public void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e("BTDeviceSendCommandUtil", "deviceConnectedSuccess deviceInfo is empty!");
            return;
        }
        b(2);
        this.z = false;
        OperationDeviceInfo operationDeviceInfoD = this.ao.d(deviceInfo.getDeviceIdentify());
        this.aq = operationDeviceInfoD;
        BtDeviceStateCallback btDeviceStateCallback = this.w;
        if (btDeviceStateCallback == null) {
            LogUtil.e("BTDeviceSendCommandUtil", "mBtDeviceStateClientCallback  is empty!");
        } else {
            btDeviceStateCallback.onDeviceConnectionStateChanged(deviceInfo, this.m, operationDeviceInfoD);
        }
    }

    public void b(DeviceInfo deviceInfo, int i) {
        if (deviceInfo == null) {
            LogUtil.e("BTDeviceSendCommandUtil", "connectFail deviceInfo is empty!");
            return;
        }
        this.m = 4;
        this.z = false;
        OperationDeviceInfo operationDeviceInfoC = c(deviceInfo.getDeviceIdentify(), i);
        this.aq = operationDeviceInfoC;
        BtDeviceStateCallback btDeviceStateCallback = this.w;
        if (btDeviceStateCallback == null) {
            LogUtil.e("BTDeviceSendCommandUtil", "mBtDeviceStateClientCallback  is empty !");
        } else {
            btDeviceStateCallback.onDeviceConnectionStateChanged(deviceInfo, 4, operationDeviceInfoC);
        }
    }

    private void a(DeviceInfo deviceInfo, byte[] bArr) {
        BTDeviceServiceBase bTDeviceServiceBase;
        LogUtil.b("BTDeviceSendCommandUtil", "Capture V2 link connect parameter.");
        this.ar.removeMessages(3);
        this.aw = false;
        c(1, 1);
        if (this.r == 0 && (bTDeviceServiceBase = this.q) != null) {
            bTDeviceServiceBase.removeV1CheckCommand();
        }
        lnp lnpVarE = lmw.e(this.ad, bArr);
        this.m = 1;
        if (lnpVarE != null) {
            this.al = lnpVarE.d();
            int iC = lnpVarE.c();
            this.aj = iC;
            if (this.k != null) {
                LogUtil.b("BTDeviceSendCommandUtil", "Device max frame size : ", Integer.valueOf(iC));
                this.k.setDeviceMaxFrameSize(this.aj);
            }
            this.an = lnpVarE.a();
            LogUtil.b("BTDeviceSendCommandUtil", "sendLinkDataCommand, mInterval : ", Integer.valueOf(this.ai));
            this.ai = lnpVarE.b();
            int iE = lnpVarE.e();
            this.i = iE;
            if (iE == 0) {
                LogUtil.e("BTDeviceSendCommandUtil", "invalid device version.");
                b(deviceInfo, 2100011);
                return;
            }
            this.j = lnpVarE.j();
            deviceInfo.setAuthVersion(this.i);
            if (this.r == 0) {
                LogUtil.b("BTDeviceSendCommandUtil", "Path extend number: ", Integer.valueOf(lnpVarE.f()));
                BTDeviceServiceBase bTDeviceServiceBase2 = this.q;
                if (bTDeviceServiceBase2 != null) {
                    bTDeviceServiceBase2.setPathExtendNum(lnpVarE.f());
                }
            }
            if (2 == this.r) {
                a(deviceInfo);
                return;
            }
            this.ah = true;
            LogUtil.b("BTDeviceSendCommandUtil", "Start to get device available status.");
            c(lnpVarE.h(), deviceInfo);
            return;
        }
        LogUtil.b("BTDeviceSendCommandUtil", "Device Link parameter resolve fail.");
        b(deviceInfo, 2100011);
    }

    private void c(int i, DeviceInfo deviceInfo) {
        b(lmw.d());
    }

    private void a(DeviceInfo deviceInfo) {
        LogUtil.b("BTDeviceSendCommandUtil", "Device need authentic Application mAuthenticVersion:", Integer.valueOf(this.i));
        if (c(deviceInfo)) {
            return;
        }
        LogUtil.b("BTDeviceSendCommandUtil", "Send Authentic command fail.");
        b(deviceInfo, 2010009);
    }

    private void j(DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.b("BTDeviceSendCommandUtil", "Capture V2 receive bond status response.");
        c(1, 15);
        lnw lnwVar = this.g;
        if (lnwVar == null || lnwVar.a(deviceInfo, bArr)) {
            return;
        }
        LogUtil.b("BTDeviceSendCommandUtil", "receive bond status incorrect response.");
        b(deviceInfo, 2010009);
    }

    private void f(DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.b("BTDeviceSendCommandUtil", "Capture V2 Authentic parameter.");
        c(1, 19);
        boolean zA = a(deviceInfo, lmw.e(bArr));
        LogUtil.b("BTDeviceSendCommandUtil", "Authentic checkResult:", Boolean.valueOf(zA));
        if (zA) {
            if (2 == this.r) {
                b(lmw.e(2, deviceInfo));
                return;
            } else {
                d(deviceInfo);
                return;
            }
        }
        a();
        b(deviceInfo, 2010009);
    }

    private void h(DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.b("BTDeviceSendCommandUtil", "Capture V2 bond request response.");
        c(1, 14);
        lnw lnwVar = this.g;
        if (lnwVar == null || lnwVar.b(deviceInfo, bArr)) {
            return;
        }
        LogUtil.b("BTDeviceSendCommandUtil", "receive pair status incorrect response.");
        b(deviceInfo, 2010009);
    }

    private void i(DeviceInfo deviceInfo, byte[] bArr) {
        boolean zN = lof.d(this.ad).n();
        lof.d(this.ad).b(false);
        c(1, 22);
        int iD = lmw.d(this.ad, bArr);
        LogUtil.b("BTDeviceSendCommandUtil", "isAutoConnect : ", Boolean.valueOf(zN), " isWaitUserConfirm : ", Boolean.valueOf(this.e), "Device available status : ", Integer.valueOf(iD), "mAuthenticVersion : ", Integer.valueOf(this.i));
        if (-1 == iD || iD == 0 || 1 == iD) {
            if (this.i != 0) {
                if (!c(deviceInfo)) {
                    LogUtil.b("BTDeviceSendCommandUtil", "Send Authentic command fail after check device available.");
                    b(deviceInfo, 2010009);
                }
            } else {
                d(deviceInfo);
            }
            this.ab = true;
            return;
        }
        if (2 == iD) {
            this.m = 5;
            this.z = false;
            OperationDeviceInfo operationDeviceInfoD = this.ao.d(deviceInfo.getDeviceIdentify());
            this.aq = operationDeviceInfoD;
            this.w.onDeviceConnectionStateChanged(deviceInfo, 5, operationDeviceInfoD);
            this.ab = false;
            return;
        }
        if (3 == iD) {
            c(zN);
        } else if (100000 != iD) {
            LogUtil.b("BTDeviceSendCommandUtil", "this status not deal with.");
        } else {
            p();
        }
    }

    private void c(boolean z) {
        LogUtil.c("BTDeviceSendCommandUtil", "isAutoConnect : " + z);
        if (z) {
            if (this.e) {
                LogUtil.b("BTDeviceSendCommandUtil", "wait util user click button.");
                return;
            }
            this.m = 4;
            this.z = false;
            this.ab = false;
            this.q.disconnectBTDevice();
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(BaseApplication.d(), "com.huawei.ui.device.activity.pairing.NotifyActivity"));
        intent.addFlags(268435456);
        intent.addFlags(536870912);
        BluetoothDevice bluetoothDevice = this.h;
        if (bluetoothDevice != null) {
            intent.putExtra("deviceName", bluetoothDevice.getAddress());
        } else {
            LogUtil.b("BTDeviceSendCommandUtil", "mBTDevice is null.");
        }
        this.e = true;
        try {
            this.ad.startActivity(intent);
            LogUtil.b("BTDeviceSendCommandUtil", "mContext, startActivity intent = ", intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.d("BTDeviceSendCommandUtil", "startJumpActivity not find JumpActivity");
        }
    }

    private void p() {
        if (this.ah) {
            LogUtil.c("BTDeviceSendCommandUtil", "5.1.22 receive 100000 connect failed");
            this.m = 4;
            this.z = false;
            this.ab = false;
            this.q.disconnectBTDevice();
            return;
        }
        lnr lnrVarB = lmw.b(this.r);
        LogUtil.b("BTDeviceSendCommandUtil", "Start to get link parameter.");
        b(lnrVarB);
        this.ah = true;
    }

    private void a(byte[] bArr) {
        if (bArr == null || bArr.length < 5) {
            LogUtil.b("BTDeviceSendCommandUtil", "not 5.1.17 data, return");
            return;
        }
        if (1 == bArr[0] && 17 == bArr[1]) {
            String strD = cph.d(bArr);
            if (strD.length() < 8) {
                LogUtil.e("BTDeviceSendCommandUtil", "getMtsInterval valid data");
                return;
            }
            try {
                this.ai = Integer.parseInt(strD.substring(8, strD.length()), 16);
            } catch (NumberFormatException unused) {
                LogUtil.d("BTDeviceSendCommandUtil", "getMTSInterval NumberFormatException");
            }
            LogUtil.b("BTDeviceSendCommandUtil", "getMTSInterval mInterval : ", Integer.valueOf(this.ai));
        }
    }

    private void d(DeviceInfo deviceInfo, int i, byte[] bArr) {
        try {
            if (this.w == null || deviceInfo == null || bArr == null) {
                LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", " reportReceivedData: parameter is not correct.");
                return;
            }
            deviceInfo.setDeviceProtocol(this.al);
            int i2 = this.al;
            if (2 == i2) {
                c(deviceInfo, bArr, i);
                return;
            }
            if (1 == i2) {
                n(deviceInfo, bArr);
            } else if (i2 != 0) {
                LogUtil.b("BTDeviceSendCommandUtil", "no support this linkVersion ", Integer.valueOf(i2));
            } else {
                g(deviceInfo, bArr);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            LogUtil.d("BTDeviceSendCommandUtil", "ArrayIndexOutOfBoundsException ERROR. ");
        }
    }

    private void c(DeviceInfo deviceInfo, byte[] bArr, int i) {
        if (bArr != null) {
            if (bArr.length < 2) {
                LogUtil.e("BTDeviceSendCommandUtil", "dealWithV2 invalid data");
                return;
            } else if (bArr[0] == 1 && bArr[1] == 14) {
                this.z = true;
            }
        }
        if (!this.z) {
            LogUtil.b("BTDeviceSendCommandUtil", "not handshake report data with V2.");
            byte[] bArrE = lmw.e(this.ad, bArr, deviceInfo);
            if (bArrE == null) {
                LogUtil.e("BTDeviceSendCommandUtil", "checkedContent is null.");
                bArrE = bArr;
            }
            c(bArrE);
            if (bArr != null) {
                c(bArr[0], bArr[1]);
            }
            this.w.onDataReceived(deviceInfo, bArrE.length, bArrE);
            a(bArrE);
            return;
        }
        e(deviceInfo, i, bArr);
    }

    private void n(DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr.length > 3 && bArr[2] == 0) {
            k(deviceInfo, bArr);
            return;
        }
        int i = this.u;
        if (1 == i) {
            int i2 = bArr[0];
            LogUtil.b("BTDeviceSendCommandUtil", "before requestId : ", Integer.valueOf(i2));
            if (i2 < 0) {
                i2 += 256;
            }
            int i3 = this.as;
            if (i2 != i3) {
                LogUtil.e("BTDeviceSendCommandUtil", "error report data, requestId:", Integer.valueOf(i2), " mRequestID:", Integer.valueOf(i3));
                return;
            }
            bArr = lna.e(this.at, this.av, this.ba, bArr);
        } else if (2 == i) {
            int i4 = this.au;
            bArr[0] = (byte) i4;
            LogUtil.b("BTDeviceSendCommandUtil", "reportReceivedData, OTA report business cmd, need add Service id, mServiceID : ", Integer.valueOf(i4));
        } else if (3 == i) {
            LogUtil.b("BTDeviceSendCommandUtil", "reportReceivedData, OTA report file data, do nothing...");
        } else {
            LogUtil.b("BTDeviceSendCommandUtil", "reportReceivedData, OTA report wrong data, do nothing...");
        }
        LogUtil.b("BTDeviceSendCommandUtil", "reportReceivedData, receive data finish so need to reset resend timer and unLockBT.");
        this.x = 0;
        aa();
        if (bArr == null) {
            LogUtil.e("BTDeviceSendCommandUtil", "btV2Command is null.");
        } else if (this.z) {
            m(deviceInfo, bArr);
        } else {
            e(deviceInfo, bArr);
        }
    }

    private void k(DeviceInfo deviceInfo, byte[] bArr) {
        String strD = cph.d(bArr);
        LogUtil.b("BTDeviceSendCommandUtil", "Notification info: ", strD);
        if (e(bArr)) {
            bArr = lna.e(bArr[1], bArr[2], bArr[3], cph.d(strD));
            cpl.d("BTDeviceSendCommandUtil", bArr, "after V1--->V2 Notification info: ");
        }
        if (bArr != null) {
            this.w.onDataReceived(deviceInfo, bArr.length, bArr);
        } else {
            LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", "notificationData is null.");
        }
    }

    private void m(DeviceInfo deviceInfo, byte[] bArr) {
        if (2 == this.r) {
            byte b2 = bArr[0];
            if (1 == b2 && 15 == bArr[1]) {
                LogUtil.b("BTDeviceSendCommandUtil", "receive bond status response.");
                lnw lnwVar = this.g;
                if (lnwVar == null || lnwVar.a(deviceInfo, bArr)) {
                    return;
                }
                LogUtil.b("BTDeviceSendCommandUtil", "receive bond status incorrect response.");
                return;
            }
            if (1 == b2 && 14 == bArr[1]) {
                LogUtil.b("BTDeviceSendCommandUtil", "receive request bond response.");
                lnw lnwVar2 = this.g;
                if (lnwVar2 == null || lnwVar2.b(deviceInfo, bArr)) {
                    return;
                }
                LogUtil.b("BTDeviceSendCommandUtil", "receive pair status incorrect response.");
                return;
            }
            LogUtil.b("BTDeviceSendCommandUtil", "handshake report data with V1.");
            this.w.onDataReceived(deviceInfo, bArr.length, bArr);
            return;
        }
        LogUtil.b("BTDeviceSendCommandUtil", "handshake report data with V1 and not BLE.");
        this.w.onDataReceived(deviceInfo, bArr.length, bArr);
    }

    private void e(DeviceInfo deviceInfo, byte[] bArr) {
        int i = this.au;
        if (7 == i && 9 == this.v) {
            LogUtil.b("BTDeviceSendCommandUtil", "Take wanted message so need change command ID for set userInfo.");
            bArr[1] = 2;
        } else if (2 == i && 3 == this.v) {
            LogUtil.b("BTDeviceSendCommandUtil", "Take wanted message so need change command ID for send message.");
            bArr[1] = 1;
        } else {
            LogUtil.b("BTDeviceSendCommandUtil", "dealWithNotHandshake() else");
        }
        this.w.onDataReceived(deviceInfo, bArr.length, bArr);
    }

    private void g(DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.b("BTDeviceSendCommandUtil", "receive V0 data info.");
        this.x = 0;
        aa();
        LogUtil.b("BTDeviceSendCommandUtil", "not handshake report data with V1.");
        int length = bArr.length;
        int i = length + 2;
        byte[] bArr2 = new byte[i];
        bArr2[0] = (byte) this.au;
        bArr2[1] = (byte) this.v;
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2 + 2] = bArr[i2];
        }
        this.w.onDataReceived(deviceInfo, i, bArr2);
    }

    private void c(byte[] bArr) {
        LogUtil.c("BTDeviceSendCommandUtil", "enter reSend");
        if (this.p == null) {
            LogUtil.c("BTDeviceSendCommandUtil", "mBtDeviceCommand is null");
            return;
        }
        if (bArr != null && bArr.length > 4 && bArr[2] == 127) {
            String strD = cph.d(bArr);
            try {
                List<cqa> listB = new cqe().a(strD.substring(4, strD.length())).b();
                if (listB != null && listB.size() == 1) {
                    a(bArr, listB.get(0));
                } else {
                    LogUtil.c("BTDeviceSendCommandUtil", "wrong cmd ,no need resend.");
                }
            } catch (cpy e2) {
                LogUtil.d("BTDeviceSendCommandUtil", e2.getMessage());
            }
        } else {
            LogUtil.c("BTDeviceSendCommandUtil", "no need resend.");
        }
        this.p = null;
    }

    private void a(byte[] bArr, cqa cqaVar) {
        if (cpb.a(cqaVar.b()) == 127) {
            if (cpb.a(cqaVar.c()) == 100014) {
                LogUtil.c("BTDeviceSendCommandUtil", "pre resend device command.");
                c(bArr[0], bArr[1]);
                f(this.p);
                return;
            }
            return;
        }
        LogUtil.e("BTDeviceSendCommandUtil", "wrong tlv");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInfo deviceInfo, int i, OperationDeviceInfo operationDeviceInfo) {
        if (this.w == null || deviceInfo == null) {
            LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", "Parameter is incorrect.");
            return;
        }
        LogUtil.b("BTDeviceSendCommandUtil", "DeviceProtocol:", Integer.valueOf(deviceInfo.getDeviceProtocol()), "device state changed, btState:", Integer.valueOf(i));
        if (1 == i) {
            m();
        } else {
            LogUtil.b("BTDeviceSendCommandUtil", "Start to remove connect timeout message.");
            this.ar.removeMessages(2);
        }
        if (2 != i) {
            a(deviceInfo, i, operationDeviceInfo);
            return;
        }
        if (2 == this.m) {
            LogUtil.b("BTDeviceSendCommandUtil", "Already finish handshake and repeat report connected.");
            return;
        }
        if (this.z) {
            LogUtil.b("BTDeviceSendCommandUtil", "Already Start handshake.");
            return;
        }
        this.z = true;
        this.ar.removeMessages(3);
        this.aw = true;
        this.ar.sendEmptyMessage(3, 60000L);
        int i2 = this.r;
        if (i2 == 0 || i2 == 5) {
            deviceInfo.setDeviceProtocol(2);
            this.al = 2;
            LogUtil.b("BTDeviceSendCommandUtil", "Set init AW Device Protocol : ", 2);
        }
        b(deviceInfo, i, operationDeviceInfo);
    }

    private void b(DeviceInfo deviceInfo, int i, OperationDeviceInfo operationDeviceInfo) {
        lnr lnrVarB = lmw.b(this.r);
        LogUtil.b("BTDeviceSendCommandUtil", "Start to get link parameter.");
        b(lnrVarB);
    }

    private void m() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        LogUtil.b("BTDeviceSendCommandUtil", "Start to create connect timeout info msg.");
        this.ar.sendMessage(messageObtain, 60000L);
    }

    private void a(DeviceInfo deviceInfo, int i, OperationDeviceInfo operationDeviceInfo) {
        BTDeviceServiceBase bTDeviceServiceBase;
        this.z = false;
        if (3 == i) {
            List<lnr> list = this.l;
            if (list != null && list.size() != 0) {
                LogUtil.b("BTDeviceSendCommandUtil", "Start to clear command list for disconnect");
                synchronized (this.bc) {
                    this.l.clear();
                }
            }
            this.ar.removeMessages(1);
            this.x = this.y;
            if (deviceInfo.getDeviceBluetoothType() == 0 && 1 == this.al) {
                LogUtil.b("BTDeviceSendCommandUtil", "Need reset reSendCounter and unLockAW.");
                this.az.execute(new Runnable() { // from class: lnv.2
                    @Override // java.lang.Runnable
                    public void run() {
                        lnv.this.ad();
                    }
                });
            } else {
                LogUtil.b("BTDeviceSendCommandUtil", "Need reset reSendCounter and unlockBT.");
                this.az.execute(new Runnable() { // from class: lnv.5
                    @Override // java.lang.Runnable
                    public void run() {
                        lnv.this.aa();
                    }
                });
            }
        }
        if (2 == this.al) {
            LogUtil.b("BTDeviceSendCommandUtil", "Reset V2 package info.");
            this.k.resetPackageInfo();
            u();
        }
        if (this.r == 0 && (bTDeviceServiceBase = this.q) != null) {
            bTDeviceServiceBase.removeV1CheckCommand();
        }
        deviceInfo.setDeviceProtocol(this.al);
        this.m = i;
        this.w.onDeviceConnectionStateChanged(deviceInfo, i, operationDeviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo, int i, byte[] bArr) {
        boolean z = (bArr == null || this.w == null) ? false : true;
        boolean z2 = this.r == 0 || this.k != null;
        if (z && z2) {
            int i2 = this.al;
            if (2 == i2) {
                String strSpliceMTUPackage = this.k.spliceMTUPackage(i, bArr);
                if (strSpliceMTUPackage == null) {
                    LogUtil.e("BTDeviceSendCommandUtil", "strDataContent is null.");
                    return;
                }
                if (strSpliceMTUPackage.length() != 0) {
                    byte[] bArrD = cph.d(strSpliceMTUPackage);
                    List<lnq> responsePacket = this.k.parseResponsePacket(bArrD.length, bArrD);
                    if (responsePacket == null) {
                        return;
                    }
                    a(responsePacket, deviceInfo);
                    return;
                }
                LogUtil.b("BTDeviceSendCommandUtil", "BLE package and length less than MTU threshold.");
                return;
            }
            if (1 != i2) {
                if (i2 == 0) {
                    a(deviceInfo, i, bArr);
                    return;
                } else {
                    LogUtil.b("BTDeviceSendCommandUtil", "Do not support this link protocol.");
                    return;
                }
            }
            LogUtil.b("BTDeviceSendCommandUtil", "Current is V1 Protocol.");
            if (this.r == 0) {
                d(deviceInfo, bArr.length, bArr);
                ad();
            } else {
                b(deviceInfo, bArr);
            }
        }
    }

    private void b(DeviceInfo deviceInfo, byte[] bArr) {
        String strD = cph.d(bArr);
        if (strD.contains("AA0100496C")) {
            String strReplace = strD.replace("AA0100496C", "");
            if (!TextUtils.isEmpty(strReplace)) {
                LogUtil.b("BTDeviceSendCommandUtil", "Receive ACK info and Response at the same time.");
                bArr = cph.d(strReplace);
            }
        }
        String strD2 = cph.d(bArr);
        if (strD2.equals("AA0100496C") || strD2.equals("AA01000049") || strD2.equals("AA0C010000")) {
            LogUtil.b("BTDeviceSendCommandUtil", "Receive ACK info, mIsLastCommandPackage is ", Boolean.valueOf(this.ae));
            if (!this.ae) {
                aa();
                return;
            } else {
                LogUtil.b("BTDeviceSendCommandUtil", "The last CommandPackage,do unLockBT() need wait response in reportReceivedData()");
                return;
            }
        }
        if (strD2.equals("AA0102692E")) {
            LogUtil.b("BTDeviceSendCommandUtil", "device tell sdk receive a incorrect command.");
        } else {
            d(deviceInfo, bArr);
        }
    }

    private void a(List<lnq> list, DeviceInfo deviceInfo) {
        for (lnq lnqVar : list) {
            LogUtil.b("BTDeviceSendCommandUtil", "slice info : ", Boolean.valueOf(lnqVar.c()), ". success info : ", Boolean.valueOf(lnqVar.a()), ". receivedAll info : ", Boolean.valueOf(lnqVar.e()));
            if (!lnqVar.c() && lnqVar.a()) {
                d(deviceInfo, lnqVar.b(), lnqVar.d());
            } else {
                if (this.ax.b() != 0) {
                    byte[] bArr = new byte[this.ax.d().length + lnqVar.d().length];
                    System.arraycopy(this.ax.d(), 0, bArr, 0, this.ax.d().length);
                    System.arraycopy(lnqVar.d(), 0, bArr, this.ax.d().length, lnqVar.d().length);
                    this.ax.b(bArr);
                } else {
                    this.ax.b(lnqVar.d());
                }
                this.ax.b(lnqVar.b() + this.ax.b());
                this.ax.b(lnqVar.a());
                this.ax.d(lnqVar.e());
                if (this.ax.e()) {
                    d(deviceInfo, this.ax.b(), this.ax.d());
                    u();
                }
            }
        }
    }

    private void a(DeviceInfo deviceInfo, int i, byte[] bArr) {
        LogUtil.b("BTDeviceSendCommandUtil", "Current is V0 Protocol.");
        List<lnq> responsePacket = this.k.parseResponsePacket(i, bArr);
        if (responsePacket == null || responsePacket.size() == 0) {
            LogUtil.e("BTDeviceSendCommandUtil", "Parse response packet fail.");
            return;
        }
        lnq lnqVar = responsePacket.get(0);
        if (!lnqVar.c()) {
            d(deviceInfo, lnqVar.b(), lnqVar.d());
            return;
        }
        if (lnqVar.a()) {
            BTDeviceServiceBase bTDeviceServiceBase = this.q;
            if (bTDeviceServiceBase != null) {
                bTDeviceServiceBase.sendBTDeviceData(bArr);
            }
            if (this.ax.b() != 0) {
                byte[] bArr2 = new byte[this.ax.d().length + lnqVar.d().length];
                System.arraycopy(this.ax.d(), 0, bArr2, 0, this.ax.d().length);
                System.arraycopy(lnqVar.d(), 0, bArr2, this.ax.d().length, lnqVar.d().length);
                this.ax.b(bArr2);
            } else {
                this.ax.b(lnqVar.d());
            }
            this.ax.b(lnqVar.d().length + this.ax.b());
            this.ax.b(lnqVar.a());
            this.ax.d(lnqVar.e());
            if (lnqVar.e()) {
                d(deviceInfo, this.ax.b(), this.ax.d());
                u();
                return;
            }
            return;
        }
        LogUtil.b("BTDeviceSendCommandUtil", "Receive incorrect data from device.");
    }

    private void d(DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null) {
            LogUtil.e("BTDeviceSendCommandUtil", "dealWithOnDataReceivedV1NotAwParse dataPayload is null");
            return;
        }
        if (cph.d(bArr).startsWith("cc") || cph.d(bArr).startsWith("CC")) {
            d(deviceInfo, bArr.length, bArr);
            return;
        }
        List<lnq> responsePacket = this.k.parseResponsePacket(bArr.length, bArr);
        if (responsePacket == null || responsePacket.isEmpty()) {
            LogUtil.e("BTDeviceSendCommandUtil", "Parse response packet fail.");
            return;
        }
        lnq lnqVar = responsePacket.get(0);
        if (!lnqVar.c()) {
            BTDeviceServiceBase bTDeviceServiceBase = this.q;
            if (bTDeviceServiceBase != null) {
                bTDeviceServiceBase.sendBTDeviceData(cph.d("AA0101594D"));
            }
            LogUtil.b("BTDeviceSendCommandUtil", "Report V1 not sliced data.");
            d(deviceInfo, lnqVar.b(), lnqVar.d());
            return;
        }
        if (this.ax.b() != 0) {
            if (this.ax.d() == null || lnqVar.d() == null) {
                LogUtil.b("BTDeviceSendCommandUtil", "data array is null.");
            } else {
                byte[] bArr2 = new byte[this.ax.d().length + lnqVar.d().length];
                System.arraycopy(this.ax.d(), 0, bArr2, 0, this.ax.d().length);
                System.arraycopy(lnqVar.d(), 0, bArr2, this.ax.d().length, lnqVar.d().length);
                this.ax.b(bArr2);
            }
        } else {
            this.ax.b(lnqVar.d());
        }
        this.ax.b(lnqVar.b() + this.ax.b());
        this.ax.b(lnqVar.a());
        this.ax.d(lnqVar.e());
        BTDeviceServiceBase bTDeviceServiceBase2 = this.q;
        if (bTDeviceServiceBase2 != null) {
            bTDeviceServiceBase2.sendBTDeviceData(cph.d("AA0101594D"));
        }
        if (lnqVar.e()) {
            LogUtil.b("BTDeviceSendCommandUtil", "Report V1 sliced data.");
            d(deviceInfo, this.ax.b(), this.ax.d());
            u();
        }
    }

    private void u() {
        this.ax.d(false);
        this.ax.b(0);
        this.ax.b((byte[]) null);
        this.ax.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        synchronized (this.d) {
            if (this.f40506b) {
                this.d.notifyAll();
                this.f40506b = false;
            }
            this.ap = false;
            LogUtil.b("BTDeviceSendCommandUtil", " unLockAW, mSendingV1Command set false.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        synchronized (this.f40507c) {
            if (this.f40505a) {
                this.f40507c.notifyAll();
                this.f40505a = false;
            }
            this.ap = false;
            LogUtil.b("BTDeviceSendCommandUtil", " unLockBT, mSendingV1Command set false.");
        }
    }

    private boolean g(byte[] bArr) {
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(12);
        int i = this.an;
        if (length <= i) {
            arrayList.add(bArr);
        } else {
            int i2 = length % i > 0 ? (length / i) + 1 : length / i;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = this.an;
                int i5 = i3 == i2 + (-1) ? length - (i3 * i4) : i4;
                int i6 = i4 * i3;
                arrayList.add(Arrays.copyOfRange(bArr, i6, i5 + i6));
                i3++;
            }
        }
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!this.q.sendBTDeviceData((byte[]) it.next())) {
                LogUtil.b("BTDeviceSendCommandUtil", "sendLinkDataCommond has write false");
                z = false;
            }
            if (1 == this.al) {
                try {
                    int i7 = this.ai;
                    if (i7 > 0) {
                        Thread.sleep(i7);
                    }
                } catch (InterruptedException unused) {
                    LogUtil.d("BTDeviceSendCommandUtil", "0xA0200006", "sendLinkDataCommand InterruptedException");
                }
            }
        }
        if (2 == this.al) {
            try {
                int i8 = this.ai;
                if (i8 > 0) {
                    Thread.sleep(i8);
                }
            } catch (InterruptedException unused2) {
                LogUtil.d("BTDeviceSendCommandUtil", "0xA0200006", "sendLinkDataCommand2 InterruptedException:");
            }
        }
        return z;
    }

    private void n() {
        int i = this.as + 1;
        this.as = i;
        if (256 == i) {
            this.as = 0;
        }
    }

    protected byte[] b(byte[] bArr) {
        if (bArr == null) {
            LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", "transferV2ToV1Protocol with parameter is null.");
            return new byte[0];
        }
        byte[] bArrD = lna.d(bArr);
        if (bArrD == null) {
            LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", "transferV2ToV1Protocol with commandData is null.");
            return new byte[0];
        }
        n();
        if (bArrD.length > 4) {
            bArrD[0] = (byte) this.as;
            this.at = bArrD[1];
            this.av = bArrD[2];
            byte b2 = bArrD[3];
            this.ba = b2;
            if (b2 < 0) {
                this.ba = b2 + 128;
            }
        }
        return bArrD;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c A[RETURN] */
    private int r() {
        boolean z;
        List<lnr> list = this.l;
        int i = -1;
        if (list != null) {
            lnr lnrVar = null;
            for (lnr lnrVar2 : list) {
                i++;
                if (lnrVar2 instanceof lnr) {
                    lnrVar = lnrVar2;
                }
                if (lnrVar != null && 2 == lnrVar.f()) {
                    z = true;
                    if (!z) {
                        return 0;
                    }
                }
            }
            z = false;
            if (!z) {
                return 0;
            }
        }
        return i;
    }

    private void w() {
        LogUtil.b("BTDeviceSendCommandUtil", "Enter reportTimeoutInfo() with ServiceID is ", Integer.valueOf(this.au), " CommandID : ", Integer.valueOf(this.v));
        String strD = lmw.d(this.au, this.v, this.al, this.as, this.at);
        if (strD.length() != 0) {
            byte[] bArrD = cph.d(strD);
            LogUtil.b("BTDeviceSendCommandUtil", "Timeout Info : ", strD);
            d(i(), bArrD.length, bArrD);
        }
    }

    private void v() {
        DeviceInfo deviceInfo;
        try {
            BTDeviceServiceBase bTDeviceServiceBase = this.q;
            if (bTDeviceServiceBase != null) {
                deviceInfo = bTDeviceServiceBase.getDeviceInfo();
                this.q.disconnectGMS();
            } else {
                deviceInfo = null;
            }
            if (deviceInfo == null) {
                deviceInfo = new DeviceInfo();
                if (this.r == 0) {
                    deviceInfo.setDeviceIdentify("AndroidWear");
                    deviceInfo.setDeviceName("HUAWEI WATCH");
                } else {
                    BluetoothDevice bluetoothDevice = this.h;
                    if (bluetoothDevice == null) {
                        LogUtil.b("BTDeviceSendCommandUtil", "mBTDevice is null");
                    } else {
                        deviceInfo.setDeviceIdentify(bluetoothDevice.getAddress());
                        deviceInfo.setDeviceName(this.h.getName());
                    }
                }
            }
            deviceInfo.setDeviceConnectState(4);
            b(deviceInfo, 2010000);
        } catch (SecurityException e2) {
            LogUtil.d("BTDeviceSendCommandUtil", "reportConnectFailed SecurityException:", ExceptionUtils.c(e2));
        }
    }

    private boolean f(lnr lnrVar) {
        if (2 != s()) {
            this.ap = false;
            if (this.z) {
                this.z = false;
                v();
            }
            LogUtil.b("BTDeviceSendCommandUtil", "base Service connect state is not connected so return.");
            return false;
        }
        if (this.l.size() == 0) {
            LogUtil.b("BTDeviceSendCommandUtil", "mBTDeviceCommandList size : 0, so cancel send wrap data.");
            return false;
        }
        if (lnrVar != null) {
            byte[] bArrD = lnrVar.d();
            if (lnrVar.e() == 0 && 1 == this.al) {
                if (!a(bArrD, lnrVar)) {
                    return false;
                }
            } else if (!d(lnrVar, bArrD)) {
                return false;
            }
        }
        return this.bb;
    }

    private boolean a(byte[] bArr, lnr lnrVar) {
        BTDeviceServiceBase bTDeviceServiceBase = this.q;
        if (bTDeviceServiceBase != null && this.d != null) {
            try {
                bTDeviceServiceBase.sendBTDeviceData(bArr);
                synchronized (this.d) {
                    this.f40506b = true;
                    if (this.z) {
                        LogUtil.b("BTDeviceSendCommandUtil", "BTDeviceAWService Enter Lock of sendBTDeviceWrapData Handshake, timeout : ", 30000);
                        this.y = 1;
                        if (2 != s()) {
                            this.f40506b = false;
                            return false;
                        }
                        this.d.wait(30000L);
                    } else {
                        LogUtil.b("BTDeviceSendCommandUtil", "BTDeviceAWService Enter Lock of sendBTDeviceWrapData, timeout : ", 10000);
                        if (2 != s()) {
                            this.f40506b = false;
                            return false;
                        }
                        this.d.wait(10000L);
                    }
                    if (this.f40506b) {
                        j(lnrVar);
                    }
                }
            } catch (InterruptedException unused) {
                LogUtil.d("BTDeviceSendCommandUtil", "0xA0200008", "dwsbw InterruptedException");
            }
        }
        return true;
    }

    private void j(lnr lnrVar) {
        int i = this.x + 1;
        this.x = i;
        if (this.y == i) {
            if (this.z) {
                this.z = false;
                BTDeviceServiceBase bTDeviceServiceBase = this.q;
                DeviceInfo deviceInfo = bTDeviceServiceBase != null ? bTDeviceServiceBase.getDeviceInfo() : null;
                if (deviceInfo == null) {
                    deviceInfo = new DeviceInfo();
                    deviceInfo.setDeviceIdentify("AndroidWear");
                    deviceInfo.setDeviceName("HUAWEI WATCH");
                }
                deviceInfo.setDeviceConnectState(4);
                LogUtil.b("BTDeviceSendCommandUtil", "Start to report aw v1 protocol connect fail.");
                b(deviceInfo, 2010009);
            } else if (lnrVar.j()) {
                w();
            }
            this.ap = false;
            LogUtil.e("BTDeviceSendCommandUtil", "BTDeviceAWService Set Sending flag false for AW timeout.");
        } else {
            LogUtil.b("BTDeviceSendCommandUtil", "BTDeviceAWService Command send timeout but counter not arrived : ", Integer.valueOf(i));
        }
        this.f40506b = false;
    }

    private boolean d(lnr lnrVar, byte[] bArr) {
        ArrayList<byte[]> arrayListWrapCommandPackets;
        if (this.k != null) {
            int iA = lnrVar.a();
            if (3 == lnrVar.b()) {
                LogUtil.b("BTDeviceSendCommandUtil", "OTA send bytes of file data.");
                arrayListWrapCommandPackets = b(iA, bArr);
            } else {
                arrayListWrapCommandPackets = this.k.wrapCommandPackets(iA, bArr);
            }
            if (arrayListWrapCommandPackets == null) {
                return true;
            }
            lns lnsVar = new lns(arrayListWrapCommandPackets, lnrVar.j());
            if (this.q == null) {
                return true;
            }
            this.ae = false;
            return b(lnsVar, lnrVar);
        }
        LogUtil.d("BTDeviceSendCommandUtil", "0xA0200008", "disconnectBTDevice: mBTDeviceServiceBase is null.");
        return true;
    }

    private boolean b(lns lnsVar, lnr lnrVar) {
        Object obj;
        for (int i = 0; i < lnsVar.a().size(); i++) {
            byte[] bArr = lnsVar.a().get(i);
            LogUtil.b("BTDeviceSendCommandUtil", "wrapData i: ", Integer.valueOf(i), ",size: ", Integer.valueOf(lnsVar.a().size()));
            if (i == lnsVar.a().size() - 1) {
                this.ae = true;
            }
            try {
                if (3 != lnrVar.b()) {
                    if (e(lnrVar) && (obj = this.f40507c) != null) {
                        synchronized (obj) {
                            this.f40505a = true;
                            boolean zG = g(bArr);
                            this.bb = zG;
                            LogUtil.b("BTDeviceSendCommandUtil", "sendLinkDataCommand result:", Boolean.valueOf(zG));
                            if (!d(lnrVar)) {
                                return false;
                            }
                            if (this.f40505a) {
                                a(lnrVar);
                            }
                        }
                        break;
                    }
                    boolean zG2 = g(bArr);
                    this.bb = zG2;
                    LogUtil.b("BTDeviceSendCommandUtil", "sendLinkData result:", Boolean.valueOf(zG2));
                } else {
                    this.bb = this.q.sendBTDeviceData(bArr);
                    try {
                        Thread.sleep(this.ai);
                    } catch (InterruptedException unused) {
                        LogUtil.d("BTDeviceSendCommandUtil", "0xA0200008", "Sleep InterruptedException with exception.");
                    }
                    this.ap = false;
                    LogUtil.b("BTDeviceSendCommandUtil", "Set Sending flag false for OTA transfer file...");
                }
            } catch (InterruptedException unused2) {
                LogUtil.d("BTDeviceSendCommandUtil", "0xA0200008", " dwsbwdopf InterruptedException");
            }
        }
        return true;
    }

    private boolean d(lnr lnrVar) throws InterruptedException {
        if (1 == lnrVar.h() && 14 == lnrVar.c()) {
            LogUtil.b("BTDeviceSendCommandUtil", "Lock of sendBTDeviceWrapData with device pair. timeout : ", 30000);
            this.y = 1;
            if (2 != s()) {
                this.f40505a = false;
                return false;
            }
            this.f40507c.wait(30000L);
        } else if (this.r != 0 || 1 != lnrVar.h() || 1 != lnrVar.c()) {
            LogUtil.b("BTDeviceSendCommandUtil", "Enter Lock of sendBTDeviceWrapData. timeout : ", 10000);
            if (2 != s()) {
                this.f40505a = false;
                return false;
            }
            this.f40507c.wait(10000L);
        } else {
            this.y = 1;
            LogUtil.b("BTDeviceSendCommandUtil", "BTDeviceAWService Enter Lock of sendBTDeviceWrapData. timeout : ", 30000);
            if (2 != s()) {
                this.f40505a = false;
                return false;
            }
            this.f40507c.wait(30000L);
        }
        return true;
    }

    private boolean e(lnr lnrVar) {
        return q() || (2 == this.al && (this.ae && lnrVar.j()));
    }

    private boolean q() {
        int i = this.al;
        return 1 == i || i == 0;
    }

    private void a(lnr lnrVar) {
        int i = this.x + 1;
        this.x = i;
        if (this.y == i) {
            LogUtil.b("BTDeviceSendCommandUtil", "Command send timeout and counter arrived.");
            if (this.z) {
                if (this.w != null) {
                    this.z = false;
                    LogUtil.b("DEVMGR_SETTING", "BTDeviceSendCommandUtil", " shake failed due to timeout");
                    lnn.a(2010000);
                    v();
                }
            } else if (lnrVar.j()) {
                w();
            }
            this.ap = false;
            LogUtil.b("BTDeviceSendCommandUtil", "Set Sending flag false for BT timeout.");
        } else {
            LogUtil.b("BTDeviceSendCommandUtil", "Command send timeout but counter not arrived : ", Integer.valueOf(i));
        }
        this.f40505a = false;
    }

    private ArrayList<byte[]> b(int i, byte[] bArr) {
        if (i <= 0 || bArr == null) {
            LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", "wrapOTAFilePackets error, dataContent is null.");
            return null;
        }
        ArrayList<byte[]> arrayList = new ArrayList<>(12);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.flip();
        arrayList.add(byteBufferAllocate.array());
        return arrayList;
    }

    private byte[] b(byte[] bArr, int i) {
        if (bArr == null) {
            LogUtil.d("BTDeviceSendCommandUtil", "0xA0200008", "otaCmdForDeviceCommand with parameter deviceData is null.");
            return new byte[0];
        }
        LogUtil.b("BTDeviceSendCommandUtil", "otaCmdForDeviceCommand , type : ", Integer.valueOf(i));
        if (3 == i) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length + 1];
        n();
        bArr2[0] = (byte) this.as;
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        return bArr2;
    }

    class e implements Handler.Callback {
        private e() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                if (lnv.this.q == null || lnv.this.q.getBTDeviceConnectState() == 2 || lnv.this.l == null || lnv.this.l.size() == 0) {
                    lnv.this.o();
                    return true;
                }
                LogUtil.b("BTDeviceSendCommandUtil", "send command but link is not connected");
                synchronized (lnv.this.bc) {
                    lnv.this.l.clear();
                }
                return true;
            }
            if (i == 2) {
                if (lnv.this.q != null) {
                    LogUtil.b("BTDeviceSendCommandUtil", "Receive CONNECT_TIMEOUT_COMMAND Message.Start to disconnect service.");
                    lnn.a(2010001);
                    lnv.this.q.disconnectBTDevice();
                }
                return true;
            }
            if (i == 3) {
                LogUtil.b("BTDeviceSendCommandUtil", "reconnect timeout.no get 5.1.1 data.");
                lnv.this.aw = false;
                return true;
            }
            LogUtil.b("BTDeviceSendCommandUtil", "unknown what : ", Integer.valueOf(message.what));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        int iR;
        lnr lnrVar;
        LogUtil.b("BTDeviceSendCommandUtil", "sendResult : ", Boolean.valueOf(this.bb), " size:", Integer.valueOf(this.l.size()));
        if (this.l.size() != 0) {
            synchronized (this.bc) {
                iR = r();
                lnrVar = iR < this.l.size() ? this.l.get(iR) : null;
            }
            if (lnrVar != null) {
                if (2 == this.al) {
                    d(lnrVar, iR);
                    return;
                } else {
                    e(lnrVar, iR);
                    return;
                }
            }
            return;
        }
        LogUtil.b("BTDeviceSendCommandUtil", "mBTDeviceCommandList has no command.");
    }

    private void d(lnr lnrVar, int i) {
        boolean zY;
        if (this.ap) {
            return;
        }
        this.au = lnrVar.h();
        int iC = lnrVar.c();
        this.v = iC;
        LogUtil.b("BTDeviceSendCommandUtil", "ServiceID : ", Integer.valueOf(this.au), " CommandID : ", Integer.valueOf(iC));
        String strG = lnrVar.g();
        if (this.au == 1 && this.v == 5) {
            lnrVar = lmw.a(false);
            lnrVar.e(strG);
        }
        if (this.au == 1 && this.v == 50) {
            lnrVar = lmw.n();
            lnrVar.e(strG);
        }
        if (lnrVar.j()) {
            LogUtil.b("BTDeviceSendCommandUtil", "Command need ack.");
            this.ap = true;
            this.y = 3;
        }
        if (this.q == null) {
            zY = false;
        } else if (lnrVar.i()) {
            zY = y();
        } else {
            LogUtil.b("BTDeviceSendCommandUtil", "do not need encrpt");
            zY = false;
        }
        d(lnrVar, zY);
        if (lnrVar.j()) {
            c(lnrVar);
        } else {
            this.bb = f(lnrVar);
        }
        synchronized (this.bc) {
            LogUtil.b("BTDeviceSendCommandUtil", "rm V2 cmd from list.");
            if (i < this.l.size() && i >= 0) {
                this.l.remove(i);
            } else {
                LogUtil.e("BTDeviceSendCommandUtil", "Remove fail for index is not in rang, mBTDeviceCommandList.size() : ", Integer.valueOf(this.l.size()));
            }
        }
    }

    private boolean y() {
        DeviceInfo deviceInfo = this.q.getDeviceInfo();
        if (deviceInfo != null && deviceInfo.getDeviceBluetoothType() == 2) {
            LogUtil.b("BTDeviceSendCommandUtil", "Current device type is ble or isHiChain");
            int i = this.au;
            if (i != 9 && i != 10) {
                if (i == 1) {
                    int i2 = this.v;
                    boolean z = (i2 == 1 || i2 == 14) ? false : true;
                    boolean z2 = (i2 == 15 || i2 == 19 || i2 == 40 || i2 == 44) ? false : true;
                    boolean z3 = (i2 == 22 || i2 == 45 || i2 == 51 || i2 == 52) ? false : true;
                    if (!z || !z2 || !z3) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void d(lnr lnrVar, boolean z) {
        byte[] bArrB;
        BTDeviceServiceBase bTDeviceServiceBase;
        if (z) {
            if (this.h != null && (bTDeviceServiceBase = this.q) != null) {
                bArrB = lmw.b(this.ad, lnrVar.d(), lnrVar.g(), this.bb, bTDeviceServiceBase.getDeviceInfo());
            } else {
                LogUtil.b("BTDeviceSendCommandUtil", "mBTDevice is null");
                bArrB = null;
            }
            LogUtil.b("BTDeviceSendCommandUtil", "Get encryptData info:", Boolean.valueOf(bArrB != null));
            if (bArrB != null) {
                lnrVar.c(bArrB.length);
                lnrVar.c(bArrB);
            } else {
                lnrVar.c(lnrVar.d().length);
                lnrVar.c(lnrVar.d());
            }
        }
    }

    private void c(lnr lnrVar) {
        int i;
        byte[] bArrB;
        BTDeviceServiceBase bTDeviceServiceBase;
        this.x = 0;
        LogUtil.c("BTDeviceSendCommandUtil", "mBtDeviceCommand : btDeviceCommand");
        this.p = lnrVar;
        int i2 = 0;
        do {
            i2++;
            LogUtil.b("BTDeviceSendCommandUtil", "Send V2 Command timeout with ReSendTime : ", Integer.valueOf(this.x));
            if (this.x != 0 && 1 == this.au && 5 == this.v) {
                lnr lnrVarA = lmw.a(false);
                if (this.h != null && (bTDeviceServiceBase = this.q) != null) {
                    bArrB = lmw.b(this.ad, lnrVarA.d(), lnrVar.g(), this.bb, bTDeviceServiceBase.getDeviceInfo());
                } else {
                    LogUtil.e("BTDeviceSendCommandUtil", "0xA0200006", "mBTDevice is null");
                    bArrB = null;
                }
                if (bArrB != null) {
                    lnrVar.c(bArrB);
                    lnrVar.c(bArrB.length);
                } else {
                    LogUtil.b("BTDeviceSendCommandUtil", "encryptData is null.");
                }
            }
            this.bb = f(lnrVar);
            if (i2 > 5) {
                Log.i("BTDeviceSendCommandUtil", "repeat send error");
                return;
            } else {
                i = this.x;
                if (i == 0) {
                    return;
                }
            }
        } while (this.y > i);
    }

    private void e(lnr lnrVar, int i) {
        byte[] bArrC;
        if (this.ap || this.t == null) {
            return;
        }
        this.ap = true;
        this.y = 3;
        LogUtil.b("BTDeviceSendCommandUtil", "Set Sending flag true.");
        byte[] bArrD = lnrVar.d();
        this.u = lnrVar.b();
        if (1 == this.al) {
            bArrC = e(lnrVar, bArrD);
        } else {
            bArrC = c(lnrVar, bArrD);
        }
        c(lnrVar, i, bArrC);
    }

    private byte[] e(lnr lnrVar, byte[] bArr) {
        this.au = lnrVar.h();
        int iC = lnrVar.c();
        this.v = iC;
        LogUtil.b("BTDeviceSendCommandUtil", "SEND_COMMAND Msg with mServiceID : ", Integer.valueOf(this.au), " mCommandID : ", Integer.valueOf(iC));
        if (this.u != 1) {
            return b(lnrVar.d(), lnrVar.b());
        }
        if (lnrVar.i()) {
            byte b2 = bArr[0];
            if (7 == b2 && 2 == bArr[1]) {
                LogUtil.b("BTDeviceSendCommandUtil", "Need change command ID for set userInfo.");
                bArr[1] = 9;
                this.v = 9;
            } else if (2 == b2 && 1 == bArr[1]) {
                LogUtil.b("BTDeviceSendCommandUtil", "Need change command ID for send message.");
                bArr[1] = 3;
                this.v = 3;
            } else {
                LogUtil.b("BTDeviceSendCommandUtil", "dealWithHandMessageSendCommandNotV2DealV1() else");
            }
        }
        return b(bArr);
    }

    private byte[] c(lnr lnrVar, byte[] bArr) {
        try {
            Thread.sleep(5L);
        } catch (InterruptedException unused) {
            LogUtil.d("BTDeviceSendCommandUtil", "Exception is InterruptedException.");
        }
        this.au = bArr[0];
        this.v = bArr[1];
        int iA = lnrVar.a() - 2;
        byte[] bArr2 = new byte[iA];
        for (int i = 0; i < iA; i++) {
            bArr2[i] = bArr[i + 2];
        }
        return bArr2;
    }

    private void c(lnr lnrVar, int i, byte[] bArr) {
        int i2;
        byte[] bArrB;
        BTDeviceServiceBase bTDeviceServiceBase;
        if (bArr != null) {
            LogUtil.b("BTDeviceSendCommandUtil", "Is command need encrypt ?: ", Boolean.valueOf(lnrVar.i()));
            if (lnrVar.i()) {
                if (this.h != null && (bTDeviceServiceBase = this.q) != null) {
                    bArr = lmw.d(this.ad, bArr, this.h.getAddress(), bTDeviceServiceBase.getDeviceInfo());
                } else {
                    LogUtil.b("BTDeviceSendCommandUtil", "mBTDevice is null.");
                }
            }
            cpl.d("BTDeviceSendCommandUtil", bArr, "After encryptTLVs & transferV2ToV1, btV1Command : ");
            a(lnrVar, bArr);
            this.x = 0;
            do {
                LogUtil.b("BTDeviceSendCommandUtil", "Send V1 Command timeout with ReSendTime : ", Integer.valueOf(this.x));
                if (this.x != 0 && 1 == this.au && 5 == this.v && (bArrB = b(lmw.a(false).d())) != null) {
                    this.t.c(bArrB);
                    this.t.c(bArrB.length);
                }
                f(this.t);
                i2 = this.x;
                if (i2 == 0) {
                    break;
                }
            } while (this.y > i2);
            synchronized (this.bc) {
                LogUtil.b("BTDeviceSendCommandUtil", "Remove V1 Command from list,iCommandIndex : ", Integer.valueOf(i));
                if (i >= this.l.size() || i < 0) {
                    LogUtil.e("BTDeviceSendCommandUtil", "Remove fail for index is not in rang, size() : ", Integer.valueOf(this.l.size()));
                } else {
                    this.l.remove(i);
                }
            }
        }
    }

    private void a(lnr lnrVar, byte[] bArr) {
        this.t.c(lnrVar.j());
        this.t.e(lnrVar.g());
        this.t.b(lnrVar.e());
        this.t.d(lnrVar.f());
        this.t.c(bArr);
        this.t.c(bArr.length);
        this.t.a(lnrVar.b());
        this.t.d(lnrVar.i());
        this.t.g(lnrVar.h());
        this.t.e(lnrVar.c());
    }

    public void b(lnr lnrVar) {
        if (lnrVar == null) {
            LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", "btDeviceCommand is null.");
            return;
        }
        if (this.l != null) {
            synchronized (this.bc) {
                this.l.add(lnrVar);
                ExtendHandler extendHandler = this.ar;
                if (extendHandler != null) {
                    extendHandler.sendEmptyMessage(1);
                    LogUtil.b("BTDeviceSendCommandUtil", "insert queue.");
                } else {
                    LogUtil.e("BTDeviceSendCommandUtil", "sendBTDeviceData mSendHandler is null");
                }
            }
            return;
        }
        LogUtil.d("BTDeviceSendCommandUtil", "0xA0200008", "mBTDeviceCommandList is null.");
    }

    public void c(String str) {
        if (str == null) {
            LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", "filePath is null.");
        } else {
            LogUtil.b("BTDeviceSendCommandUtil", "sendAssetData sendBTDeviceAssetData filePath : ", str);
            this.q.sendBTFilePath(str);
        }
    }

    public void a(BtDeviceResponseCallback btDeviceResponseCallback) {
        if (btDeviceResponseCallback == null) {
            LogUtil.d("BTDeviceSendCommandUtil", "0xA0200008", "callback is null.");
        } else {
            LogUtil.b("BTDeviceSendCommandUtil", "setFileCallback callback : ", btDeviceResponseCallback);
            this.q.setFileCallback(btDeviceResponseCallback);
        }
    }

    public void c(BtDeviceResponseCallback btDeviceResponseCallback) {
        LogUtil.b("BTDeviceSendCommandUtil", "Enter setAWAssetCallback");
        if (btDeviceResponseCallback == null) {
            LogUtil.b("BTDeviceSendCommandUtil", "setAWAssetCallback callback is null");
        } else {
            this.q.setAwAssetCallback(btDeviceResponseCallback);
        }
    }

    public BTDeviceServiceBase g() {
        return this.q;
    }

    public void a(boolean z, int i) {
        LogUtil.b("BTDeviceSendCommandUtil", "Enter setBLEHandshakeStatus() with needHandshake : ", Boolean.valueOf(z));
        this.z = z;
        b(i);
    }

    private void b(int i) {
        if (i == 2) {
            i = s() == 2 ? 2 : 3;
        }
        this.m = i;
    }

    public void b(boolean z) {
        this.ak = z;
    }

    public boolean l() {
        return this.ak;
    }

    public DeviceInfo i() {
        BTDeviceServiceBase bTDeviceServiceBase = this.q;
        if (bTDeviceServiceBase != null) {
            return bTDeviceServiceBase.getDeviceInfo();
        }
        LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", "getDeviceInfo: mBTDeviceServiceBase is null.");
        return null;
    }

    private boolean e(byte[] bArr) {
        return (4 == bArr[1] && bArr[2] == 0 && 8 == bArr[3]) ? false : true;
    }

    public void d(boolean z) {
        this.ac = z;
    }

    public boolean c() {
        return this.ac;
    }

    public boolean k() {
        return this.ab;
    }

    public void a(boolean z) {
        this.ab = z;
    }

    public void c(int i) {
        LogUtil.b("BTDeviceSendCommandUtil", "Enter btSwitchChangeInfo() with status : ", Integer.valueOf(i));
        BTDeviceServiceBase bTDeviceServiceBase = this.q;
        if (bTDeviceServiceBase != null) {
            bTDeviceServiceBase.btSwitchChangeInfo(i);
        } else {
            LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", "mBTDeviceServiceBase is null.");
        }
    }

    public void e(boolean z) {
        LogUtil.b("BTDeviceSendCommandUtil", "Enter setBLEReconnectEnableFlag() with status : ", Boolean.valueOf(z));
        this.aa = z;
    }

    public boolean e() {
        LogUtil.b("BTDeviceSendCommandUtil", "Enter getBLEReconnectEnableFlag() with status : ", Boolean.valueOf(this.aa));
        return this.aa;
    }

    public void b() {
        LogUtil.b("BTDeviceSendCommandUtil", "Enter disconnectGMS()");
        BTDeviceServiceBase bTDeviceServiceBase = this.q;
        if (bTDeviceServiceBase != null) {
            bTDeviceServiceBase.disconnectGMS();
        } else {
            LogUtil.e("BTDeviceSendCommandUtil", "0xA0200008", "mBTDeviceServiceBase is null.");
        }
    }

    private int s() {
        BTDeviceServiceBase bTDeviceServiceBase = this.q;
        if (bTDeviceServiceBase != null) {
            return bTDeviceServiceBase.getBTDeviceConnectState();
        }
        return 3;
    }

    private OperationDeviceInfo c(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.b("BTDeviceSendCommandUtil", "setConnectFailedParms mac is null");
            return null;
        }
        loa loaVar = this.ao;
        if (loaVar == null) {
            LogUtil.b("BTDeviceSendCommandUtil", "setConnectFailedParms mOpAnalyticsManager is null");
            return null;
        }
        loaVar.a(str, System.currentTimeMillis());
        this.ao.e(str, lmq.b(this.au, this.v));
        this.ao.d(str, i);
        return this.ao.d(str);
    }

    public int h() {
        return this.r;
    }
}
