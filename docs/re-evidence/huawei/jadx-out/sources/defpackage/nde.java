package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.callback.OtaResultCallbackInterface;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import com.huawei.hwdevice.outofprocess.datatype.DataOtaParametersV2;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.unitedevice.callback.IResultAIDLCallback;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.TransferFileQueueManager;
import com.huawei.unitedevice.hwcommonfilemgr.entity.CommonFileInfoParcel;
import com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager;
import com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import ohos.ace.plugin.wifimanager.WifiDeviceUtils;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nde {
    private int af;
    private OtaResultCallbackInterface al;
    private int an;
    private lof f;
    private CountDownLatch h;
    private DataOtaParametersV2 i;
    private String j;
    private String m;
    private DeviceInfo o;
    private static final Map<String, Integer> d = new HashMap(24);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42921c = new Object();
    private boolean r = true;
    private Timer aj = null;
    private boolean y = false;
    private d l = new d();
    private ExtendHandler ai = null;
    private int aa = -1;
    private FileInputStream n = null;
    private int z = 0;
    private int ak = 30000;
    private int ag = 180000;
    private boolean q = false;
    private double ac = 0.0d;
    private boolean w = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42923b = 0;
    private boolean s = false;
    private int k = 0;
    private boolean v = false;
    private boolean x = true;
    private boolean u = true;
    private boolean p = false;
    private boolean t = false;
    private List<ndg> g = new ArrayList();
    private int ah = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42922a = -1;
    private long e = 0;
    private CountDownLatch ad = null;
    private final BroadcastReceiver ab = new BroadcastReceiver() { // from class: nde.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("OtaTransferFile", "mNetworkStateReceiver , intent is null.");
                return;
            }
            int intExtra = intent.getIntExtra("wifi_state", 0);
            LogUtil.a("OtaTransferFile", "mNetworkStateReceiver wifiState: ", Integer.valueOf(intExtra), "mTransferFileMode:", Integer.valueOf(nde.this.af));
            if (intExtra == 1) {
                nde.this.b();
            }
            if (intExtra == 3 && nde.this.af == 1) {
                nde.this.m();
            }
        }
    };
    private WifiP2pTransferListener ae = new WifiP2pTransferListener() { // from class: nde.3
        @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener
        public void onSuccess(int i, String str, int i2) {
            mik.a("OtaTransferFile", "WifiP2pTransferListener onSuccess : ", Integer.valueOf(i), " msg : ", str, "fileType : ", Integer.valueOf(i2));
            if (i == 1000) {
                nde.this.s = false;
                nde.this.c(1);
                nde.this.b();
            } else if (i == 10000) {
                nde.this.af = 0;
                LogUtil.a("OtaTransferFile", "ota wifi all send, wait 5.9.6 from device.");
            } else {
                LogUtil.j("OtaTransferFile", "unknown code : ", Integer.valueOf(i), " please check.");
            }
        }

        @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener
        public void onFail(int i, String str, int i2) {
            nde.this.d(i, str);
        }

        @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener
        public void onProcess(int i, int i2) {
            LogUtil.a("OtaTransferFile", "ready onProcess : ", Integer.valueOf(i));
            nde.this.af = 2;
            nde.this.r = true;
            nde.this.s = true;
            if (nde.this.ai != null) {
                nde.this.ai.removeMessages(6);
            }
            nde.this.e(1);
            nde.this.a(i, "wifi");
        }
    };

    public nde(lof lofVar, String str) {
        this.f = null;
        this.j = "";
        this.f = lofVar;
        this.j = str;
        mik.a("OtaTransferFile", "OtaTransferFile init");
    }

    private String c(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, str2);
            return jSONObject.toString();
        } catch (JSONException unused) {
            LogUtil.e("OtaTransferFile", "getJsonString. please check.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String str) {
        ExtendHandler extendHandler = this.ai;
        if (extendHandler != null) {
            extendHandler.removeMessages(6);
        }
        boolean zA = HwWifiP2pTransferManager.a().a(i);
        mik.a("OtaTransferFile", "WifiP2pTransferListener onFail : ", Integer.valueOf(i), " msg : ", str, " isRepeat ", Boolean.valueOf(zA));
        DataOtaParametersV2 dataOtaParametersV2 = this.i;
        d();
        if (!zA || dataOtaParametersV2 == null) {
            mik.a("OtaTransferFile", "wifiFail, !isRepeat || (dataOtaParam == null)");
            e(1);
        } else {
            d(dataOtaParametersV2);
        }
    }

    public void c() {
        ExtendHandler extendHandler = this.ai;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
            this.ai = null;
        }
        try {
            BaseApplication.b().unregisterReceiver(this.ab);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("OtaTransferFile", "IllegalArgumentException e");
        }
    }

    class d implements Handler.Callback {
        private d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            String str;
            if (message == null) {
                return false;
            }
            mik.a("OtaTransferFile", "msg what : ", Integer.valueOf(message.what));
            if (message.what != 6) {
                return false;
            }
            LogUtil.a("OtaTransferFile", "Wait OTA upgrade timeout mIsOtaV2Failed is true");
            if (nde.this.af != 2) {
                if (nde.this.af == 1) {
                    str = nde.this.o.getDeviceBluetoothType() == 1 ? "BR" : "BLE";
                } else {
                    str = "";
                }
            } else {
                str = "wifi";
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("transferPath", str);
            } catch (JSONException unused) {
                LogUtil.e("OtaTransferFile", "handleMessage OTA_V2_TIME_OUT JSONException");
            }
            mio.c(nde.this.o, "090002", "1", "", jSONObject.toString());
            nde.this.c(1, "wait time out");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, String str) {
        OtaResultCallbackInterface otaResultCallbackInterface = this.al;
        if (otaResultCallbackInterface != null) {
            otaResultCallbackInterface.onUpgradeFailed(this.j, i, str);
        }
        this.v = true;
        this.x = true;
        this.u = true;
        this.af = 0;
        d();
        try {
            BaseApplication.b().unregisterReceiver(this.ab);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("OtaTransferFile", "IllegalArgumentException e");
        }
    }

    private void d() {
        FileInputStream fileInputStream = this.n;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
                this.n = null;
            } catch (IOException unused) {
                LogUtil.e("OtaTransferFile", "IOException closeStream exception");
            }
        }
        this.f42922a = -1;
        this.e = 0L;
        a();
        synchronized (f42921c) {
            this.g.clear();
        }
    }

    public void a(String str, String str2, DataOtaParametersV2 dataOtaParametersV2, int i, OtaResultCallbackInterface otaResultCallbackInterface) {
        int iD;
        if (c(str, str2, dataOtaParametersV2, otaResultCallbackInterface)) {
            this.ad = null;
            this.an = i;
            mik.a("OtaTransferFile", "startTransferOTAFile, version", str2, "; updateMode", Integer.valueOf(i));
            if (dataOtaParametersV2.getOtaInterval() == 109000) {
                mik.a("OtaTransferFile", "startTransferOTAFile dataOtaParametersV2.getOtaInterval() == Constant.OTA_TAINTERVAL");
                this.al = otaResultCallbackInterface;
                return;
            }
            ExtendHandler extendHandler = this.ai;
            if (extendHandler != null) {
                extendHandler.removeMessages(6);
            }
            if (this.ai == null) {
                this.ai = HandlerCenter.b(this.l, "OtaTransferFile");
            }
            this.al = otaResultCallbackInterface;
            b();
            DeviceInfo deviceInfoG = g();
            this.o = deviceInfoG;
            if (deviceInfoG == null) {
                mik.a("OtaTransferFile", "startTransferOTAFile, mDeviceInfo == null");
                return;
            }
            b(str);
            o();
            if ("is_package_already_exists".equals(str)) {
                this.i = null;
                d(dataOtaParametersV2);
                return;
            }
            boolean zC = c(this.o, 0, 147);
            this.y = zC;
            if (zC) {
                k();
                int iD2 = HwWifiP2pTransferManager.a().d(this.o.getDeviceIdentify());
                if (iD2 < 4 || !d(dataOtaParametersV2, iD2)) {
                    this.i = null;
                    d(dataOtaParametersV2);
                    return;
                }
                return;
            }
            if (c(this.o, i, 31) && (iD = HwWifiP2pTransferManager.a().d(this.o.getDeviceIdentify())) >= 4 && d(dataOtaParametersV2, iD)) {
                return;
            }
            this.i = null;
            d(dataOtaParametersV2);
        }
    }

    private void o() {
        xhr xhrVarB = TransferFileQueueManager.b().b("sport_ota_send_bt");
        if (xhrVarB == null || this.an == 2) {
            return;
        }
        xhrVarB.n(2);
        mik.a("OtaTransferFile", "ota ready send fore ground, tell normal file send tag.");
    }

    private CommonFileInfoParcel c(xia xiaVar) {
        CommonFileInfoParcel commonFileInfoParcel = new CommonFileInfoParcel();
        commonFileInfoParcel.setFileName(xiaVar.j());
        commonFileInfoParcel.setFileType(xiaVar.l());
        UniteDevice uniteDeviceA = xiaVar.a();
        if (uniteDeviceA != null) {
            commonFileInfoParcel.setIdentify(uniteDeviceA.getIdentify());
        }
        commonFileInfoParcel.setSourcePackageName(xiaVar.y());
        commonFileInfoParcel.setDestinationPackageName(xiaVar.c());
        return commonFileInfoParcel;
    }

    private boolean d(DataOtaParametersV2 dataOtaParametersV2, int i) {
        xia xiaVarI = HwWifiP2pTransferManager.a().i();
        if (xiaVarI != null && xiaVarI.u() == 2) {
            return false;
        }
        xhr xhrVarB = TransferFileQueueManager.b().b("sport_ota_send_wifi");
        if (xhrVarB != null) {
            mik.a("OtaTransferFile", "tryOpenWifiChannel file is running, no wifi send.");
            if (this.an == 2) {
                return false;
            }
            if (xiaVarI != null) {
                mik.a("OtaTransferFile", "normal file send by wifi, stop it by app.");
                xhj.c().d(xiaVarI.a(), c(xiaVarI), new e(xhrVarB));
            }
            mik.a("OtaTransferFile", "tryOpenWifiChannel return false.");
            return false;
        }
        d(this.o, i);
        this.i = dataOtaParametersV2;
        boolean zF = f();
        if (zF || HwWifiP2pTransferManager.a().d(this.o.getDeviceIdentify(), (HwWifiP2pTransferManager.TransferBleToWifiCallback) null)) {
            lng.k();
            int otaUnitSize = dataOtaParametersV2.getOtaUnitSize();
            this.t = dataOtaParametersV2.getOffsetEnable();
            this.q = dataOtaParametersV2.getAckEnable();
            this.z = otaUnitSize;
            this.ag = dataOtaParametersV2.getDeviceRestartTimeout() * 1000;
            this.v = false;
            this.x = true;
            this.u = true;
            this.ak = dataOtaParametersV2.getAppWaitTimeout() * 1000;
            e(0);
            this.f42923b = 0;
            this.k = 0;
            this.ac = 0.0d;
            b(zF);
            return true;
        }
        HwWifiP2pTransferManager.a().b(-1);
        return false;
    }

    private void b(boolean z) {
        WifiP2pTransferListener wifiP2pTransferListener;
        if (!z || (wifiP2pTransferListener = this.ae) == null) {
            return;
        }
        wifiP2pTransferListener.onSuccess(1000, "send 5.9.9", -1);
    }

    private void k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        BaseApplication.b().registerReceiver(this.ab, intentFilter);
    }

    private boolean c(String str, String str2, DataOtaParametersV2 dataOtaParametersV2, OtaResultCallbackInterface otaResultCallbackInterface) {
        this.af = 0;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && dataOtaParametersV2 != null && otaResultCallbackInterface != null) {
            return true;
        }
        LogUtil.j("OtaTransferFile", "startTransferOTAFile error, parameter is null");
        if (otaResultCallbackInterface != null) {
            otaResultCallbackInterface.onUpgradeFailed(this.j, 109001, AuthInternalPickerConstant.PARAM_ERROR);
        }
        d();
        return false;
    }

    private boolean f() {
        HwWifiP2pTransferManager hwWifiP2pTransferManagerA = HwWifiP2pTransferManager.a();
        if (!hwWifiP2pTransferManagerA.l() || !hwWifiP2pTransferManagerA.g()) {
            return false;
        }
        LogUtil.j("OtaTransferFile", "wifiP2pTransferChannelAvailable");
        return true;
    }

    private void d(DeviceInfo deviceInfo, int i) {
        xhr xhrVar = new xhr();
        xhrVar.g(-1);
        if (deviceInfo != null) {
            xhrVar.c(mko.d(deviceInfo));
        }
        xhrVar.i(i);
        HwWifiP2pTransferManager.a().c(xhrVar, this.ae, 2);
    }

    private void d(DataOtaParametersV2 dataOtaParametersV2) {
        ExtendHandler extendHandler;
        lng.c();
        c(0);
        int otaUnitSize = dataOtaParametersV2.getOtaUnitSize();
        this.t = dataOtaParametersV2.getOffsetEnable();
        int appWaitTimeout = dataOtaParametersV2.getAppWaitTimeout();
        this.q = dataOtaParametersV2.getAckEnable();
        this.z = otaUnitSize;
        this.ak = appWaitTimeout * 1000;
        int deviceRestartTimeout = dataOtaParametersV2.getDeviceRestartTimeout() * 1000;
        this.ag = deviceRestartTimeout;
        this.v = false;
        this.x = true;
        this.u = true;
        LogUtil.a("OtaTransferFile", "startTransferOTAFile, mMaxPacket ", Integer.valueOf(this.z), " ; mWaitTimeout ", Integer.valueOf(this.ak), " ; mRestartTimeout ", Integer.valueOf(deviceRestartTimeout), "; mIsAckEnable ", Boolean.valueOf(this.q), "; mIsOffsetEnable ", Boolean.valueOf(this.t), " mIsOtaV2Failed is false");
        int i = this.ak;
        if (i == 0 || (extendHandler = this.ai) == null) {
            return;
        }
        extendHandler.sendEmptyMessage(6, i);
    }

    private boolean c(DeviceInfo deviceInfo, int i, int i2) {
        if (deviceInfo == null) {
            return false;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            LogUtil.j("OtaTransferFile", "cannot get info, please check.");
            return false;
        }
        if (!deviceIdentify.equalsIgnoreCase(this.j)) {
            LogUtil.a("OtaTransferFile", "double device link, aw70 device is using ota.");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return eey.d(deviceInfo, i2) && i != 2;
        }
        LogUtil.a("OtaTransferFile", "sdk version is too low, can not support wi-fi direct.");
        return false;
    }

    private void b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            File file = new File(str);
            if (e(file, str) && !file.createNewFile()) {
                LogUtil.a("OtaTransferFile", "startTransferOTAFile, The file already exists,continue");
            }
            String canonicalPath = file.getCanonicalPath();
            this.m = canonicalPath;
            this.aa = a(canonicalPath);
        } catch (IOException e2) {
            LogUtil.e("OtaTransferFile", "IOException exception ", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        String str;
        String str2;
        String str3 = eeq.d(1) + eeq.d(1) + eeq.d(1);
        if (this.y) {
            str = eeq.d(2) + eeq.d(1) + eeq.d(i);
        } else {
            str = "";
        }
        String str4 = str3 + str;
        LogUtil.a("OtaTransferFile", "5.9.9 otaStatusData : ", str4);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(9);
        deviceCommand.setDataContent(eeq.c(str4));
        deviceCommand.setDataLen(eeq.c(str4).length);
        deviceCommand.setmIdentify(this.j);
        JSONObject jSONObject = new JSONObject();
        if (i == 1) {
            str2 = WifiDeviceUtils.NETWORKINFO_TYPE_NAME;
        } else if (i == 0) {
            str2 = this.o.getDeviceBluetoothType() == 1 ? "BR" : "BLE";
        } else {
            str2 = "";
        }
        try {
            jSONObject.put("transferPath", str2);
            jSONObject.put("0x01", 1);
            jSONObject.put("0x02", i);
        } catch (JSONException unused) {
            LogUtil.e("OtaTransferFile", "otaStatusNotify JSONException");
        }
        mio.c(this.o, "050909", "1", "", jSONObject.toString());
        mik.b("OtaTransferFile", 9, 9);
        c(deviceCommand);
    }

    private int a(String str) {
        if (e(str) && str != null) {
            try {
                File file = new File(CommonUtil.c(str));
                if (!file.exists() && !file.createNewFile()) {
                    LogUtil.a("OtaTransferFile", "getOTAFileByPath, The file already exists continue");
                }
                return (int) file.length();
            } catch (IOException unused) {
                LogUtil.e("OtaTransferFile", "IOException getOTAFileByPath() exception");
            }
        }
        return 1;
    }

    private boolean e(File file, String str) throws IOException {
        if (file.getCanonicalPath().startsWith(new File(str).getCanonicalPath())) {
            return true;
        }
        LogUtil.j("OtaTransferFile", "File is outside extraction target directory.");
        return false;
    }

    private void d(ncw ncwVar) {
        ExtendHandler extendHandler = this.ai;
        if (extendHandler != null) {
            extendHandler.removeMessages(6);
        }
        int iD = (int) ncwVar.d();
        int iB = (int) ncwVar.b();
        int iC = (int) ncwVar.c();
        if (iC > 0) {
            e(this.m, iD, iC, ncwVar.a());
            this.f42923b += iC;
            return;
        }
        if (this.s) {
            d();
            LogUtil.a("OtaTransferFile", "closeStream");
            this.s = false;
        }
        List<Integer> listA = ncwVar.a();
        LogUtil.a("OtaTransferFile", "5.9.3 deviceApplyInfo file_offset ", Integer.valueOf(iD), ", file_length ", Integer.valueOf(iB));
        a(iD, iB);
        b(iD, iB, listA);
        if (this.w) {
            this.af = 1;
            if (this.r && iC == 0) {
                m();
                this.r = false;
            }
            int i = (int) ((((double) (this.f42923b + this.k)) / this.ac) * 100.0d);
            a(i, "bluetooth");
            LogUtil.a("OtaTransferFile", "onFileTransferState mAlreadySend ", Integer.valueOf(this.f42923b), ", mDeviceReceived ", Integer.valueOf(this.k), ", mOtaFileSizeV2 ", Double.valueOf(this.ac), ", otaProgress ", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i != this.f42922a || Math.abs(jCurrentTimeMillis - this.e) >= 1000 || i >= 100) {
            this.f42922a = i;
            this.e = jCurrentTimeMillis;
            e(i, str);
            OtaResultCallbackInterface otaResultCallbackInterface = this.al;
            if (otaResultCallbackInterface != null) {
                otaResultCallbackInterface.onFileTransferState(this.j, i);
                this.al.onFileTransferReport(c("transferWay", str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (!j()) {
            LogUtil.a("OtaTransferFile", "wifi is not open, please check!");
            return;
        }
        if (this.aj != null) {
            LogUtil.a("OtaTransferFile", "wifi already count time, no switch this time. wait time switch wifi");
            return;
        }
        int i = (int) (((this.ac - ((double) this.f42923b)) - ((double) this.k)) / 1.048576E8d);
        int i2 = 1 <= i ? 1 + i : 1;
        this.aj = new Timer("switchBtToWifi");
        LogUtil.a("OtaTransferFile", "trySwitchWifiTask time : ", 0, " limitTimes : ", Integer.valueOf(i2));
        d(0, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final int i, final int i2) {
        LogUtil.a("OtaTransferFile", "delayTask time : ", Integer.valueOf(i), " maxTime : ", Integer.valueOf(i2));
        Timer timer = this.aj;
        if (timer == null) {
            LogUtil.j("OtaTransferFile", "delayTask timer is null. please check.");
            return;
        }
        long j = ((long) ((i * 2) + 1)) * 60000;
        if (j <= 0) {
            j = 0;
        }
        timer.schedule(new TimerTask() { // from class: nde.4
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (i >= i2 || nde.this.o == null || nde.this.o.getDeviceConnectState() != 2) {
                    nde.this.b();
                    return;
                }
                if (HwWifiP2pTransferManager.a().m() != 1) {
                    nde.this.h();
                }
                nde.this.d(i + 1, i2);
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("OtaTransferFile", "closeTrySwitchWifiTask");
        Timer timer = this.aj;
        if (timer != null) {
            timer.cancel();
        }
        this.aj = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ndc
            @Override // java.lang.Runnable
            public final void run() {
                this.f42918b.e();
            }
        });
    }

    /* synthetic */ void e() {
        LogUtil.a("OtaTransferFile", "processWifiEnableMessage enter.");
        if (!j()) {
            LogUtil.j("OtaTransferFile", "processWifiEnableMessage not support switch");
            return;
        }
        HwWifiP2pTransferManager.a().r();
        d(this.o, 4);
        HwWifiP2pTransferManager.a().d(this.o.getDeviceIdentify(), (HwWifiP2pTransferManager.TransferBleToWifiCallback) null);
    }

    private boolean j() {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        double d2 = (this.ac - ((double) this.f42923b)) - ((double) this.k);
        LogUtil.a("OtaTransferFile", "translate file remainingSize:", Double.valueOf(d2));
        if (this.ac <= 2097152.0d || d2 < 2097152.0d) {
            LogUtil.j("OtaTransferFile", "file size less than 2M，no need switch to wifi send file");
            return false;
        }
        LogUtil.a("OtaTransferFile", "no support wifi, do not switch to wifi. : ", Boolean.valueOf(this.y));
        return HwWifiP2pTransferManager.a().o() && !HwWifiP2pTransferManager.a().k() && this.y;
    }

    private void a(int i, int i2) {
        ndg ndgVarRemove;
        if (TextUtils.isEmpty(this.m)) {
            LogUtil.j("OtaTransferFile", "getTransferDataBuffer info is null.");
            return;
        }
        if (this.n == null) {
            try {
                File file = new File(CommonUtil.c(this.m));
                if (!file.exists()) {
                    LogUtil.j("OtaTransferFile", "getTransferDataBuffer, file is not exists");
                    xjt.ap("getTransferDataBuffer, file is not exists:" + this.m);
                    if (!file.createNewFile()) {
                        LogUtil.a("OtaTransferFile", "getTransferDataBuffer, The file already exists continue");
                    }
                }
                this.n = FileUtils.openInputStream(file);
            } catch (IOException unused) {
                LogUtil.e("OtaTransferFile", "IOException getTransferDataBuffer() exception");
            }
        }
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2);
            FileInputStream fileInputStream = this.n;
            if (fileInputStream != null && fileInputStream.getChannel().read(byteBufferAllocate, i) == -1) {
                LogUtil.j("OtaTransferFile", "getTransferDataBuffer set read position occur error or readSize error");
                if (this.p) {
                    return;
                }
                xjt.ap("getTransferDataBuffer set read position occur error or readSize error " + Build.VERSION.RELEASE);
                this.p = true;
                return;
            }
            synchronized (f42921c) {
                if (this.g.size() > 4 && (ndgVarRemove = this.g.remove(0)) != null) {
                    ndgVarRemove.b();
                }
                ndg ndgVarA = ndg.a();
                ndgVarA.e(byteBufferAllocate.array());
                ndgVarA.e(i);
                this.g.add(ndgVarA);
            }
        } catch (IOException | IllegalArgumentException e2) {
            LogUtil.e("OtaTransferFile", "getTransferDataBuffer Exception.", ExceptionUtils.c(e2));
        }
    }

    private void d(ncv ncvVar) {
        this.w = true;
        this.f42923b = 0;
        long jB = ncvVar.b();
        this.ac = jB;
        long jE = ncvVar.e();
        this.k = (int) jE;
        LogUtil.a("OtaTransferFile", "5.9.5 updatePacketSize，progress ", Integer.valueOf((int) (jE / jB)), ", packageValidSize", Long.valueOf(jB), ", receivedFileSize ", Long.valueOf(jE));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0x01", jB);
            jSONObject.put("0x02", jE);
        } catch (JSONException unused) {
            LogUtil.e("OtaTransferFile", "updatePacketSize JSONException");
        }
        mio.c(this.o, "050905", "0", "", jSONObject.toString());
    }

    private void d(ncs ncsVar) {
        int iA = ncsVar.a();
        this.w = false;
        a();
        this.ai.removeMessages(6);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0x01", iA);
            jSONObject.put("0x04", ncsVar.d());
        } catch (JSONException unused) {
            LogUtil.e("OtaTransferFile", "otaCheckResultsReport JSONException");
        }
        mio.c(this.o, "050906", "0", "", jSONObject.toString());
        if (iA == 0) {
            LogUtil.a("OtaTransferFile", "ota check failed");
            OtaResultCallbackInterface otaResultCallbackInterface = this.al;
            if (otaResultCallbackInterface != null) {
                otaResultCallbackInterface.onFileRespond(this.j, iA);
            }
            n();
        } else if (iA == 1) {
            LogUtil.a("OtaTransferFile", "ota check success , mRestartTimeout: ", Integer.valueOf(this.ag));
            OtaResultCallbackInterface otaResultCallbackInterface2 = this.al;
            if (otaResultCallbackInterface2 != null) {
                int i = this.ag;
                if (i == 0) {
                    otaResultCallbackInterface2.onFileRespond(this.j, iA);
                } else {
                    otaResultCallbackInterface2.onFileRespond(this.j, i);
                }
            }
            if (CommonUtil.ap() && TextUtils.equals(nvd.m(com.huawei.hwcommonmodel.application.BaseApplication.getContext()), "true")) {
                List<String> listN = nvd.n(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
                if (listN.size() >= 2) {
                    listN.remove(0);
                }
                listN.add(this.m);
                LogUtil.a("OtaTransferFile", "SaveUpgradePackage,FilePath = ", this.m);
                nvd.e(listN, com.huawei.hwcommonmodel.application.BaseApplication.getContext());
            } else {
                i();
            }
            n();
        } else {
            LogUtil.j("OtaTransferFile", "ota check default");
        }
        this.af = 0;
        d();
    }

    private void i() {
        if (TextUtils.isEmpty(this.m)) {
            return;
        }
        File file = new File(this.m);
        if (!file.exists() || file.delete()) {
            return;
        }
        LogUtil.a("OtaTransferFile", "deleteOtaFile: path = ", this.m, " failed!");
    }

    private void n() {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(6);
        deviceCommand.setDataContent(null);
        deviceCommand.setDataLen(0);
        c(deviceCommand);
    }

    private void d(int i) {
        LogUtil.a("OtaTransferFile", "5.9.7 otaStatusReport,errorCode ", Integer.valueOf(i));
        mio.c(this.o, "050907", "0", String.valueOf(i), "");
        if (i != 100000) {
            ExtendHandler extendHandler = this.ai;
            if (extendHandler != null) {
                extendHandler.removeMessages(6);
            }
            c(i, "device error");
            LogUtil.a("OtaTransferFile", "5.9.7 otaStatusReport,mIsOtaV2Failed is true");
        }
    }

    private void a() {
        if (c(g(), this.an, 31) || this.y) {
            l();
            HwWifiP2pTransferManager.a().b(-1);
            HwWifiP2pTransferManager.a().c();
        } else if (this.i != null) {
            l();
            if (HwWifiP2pTransferManager.a().b(-1)) {
                HwWifiP2pTransferManager.a().c();
            }
        }
    }

    private void l() {
        LogUtil.a("OtaTransferFile", "tryResetWifi enter.");
        xia xiaVarI = HwWifiP2pTransferManager.a().i();
        if (xiaVarI != null) {
            HwWifiP2pTransferManager.a().f(xiaVarI.o());
        }
    }

    private void b(int i, int i2, List<Integer> list) {
        CountDownLatch countDownLatch = this.h;
        if (countDownLatch != null) {
            try {
                if (countDownLatch.await(2L, TimeUnit.SECONDS)) {
                    LogUtil.a("OtaTransferFile", "otaFileDelivery timeout");
                }
            } catch (InterruptedException unused) {
                LogUtil.e("OtaTransferFile", "otaFileDelivery InterruptedException");
            }
        }
        if (c(i, i2, list)) {
            return;
        }
        e(2);
        CountDownLatch countDownLatch2 = this.h;
        if (countDownLatch2 != null) {
            countDownLatch2.countDown();
        }
    }

    private boolean c(int i, int i2, List<Integer> list) {
        int i3 = this.z - 9;
        int iB = b(i2, i3);
        boolean z = true;
        this.h = new CountDownLatch(1);
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < iB) {
            int iE = e(i2, i3, i4, i6);
            if (iE < 0) {
                LogUtil.j("OtaTransferFile", "out of length mIsOtaV2Failed is true");
                c(104004, "transfer error");
                return z;
            }
            ncy ncyVarE = e(i4 - i, i, iE);
            if (i7 > 255) {
                i7 = 0;
            }
            if (list != null && i5 < list.size()) {
                LogUtil.a("OtaTransferFile", "otaFileDelivery bitmapList.get(index) ", list.get(i5));
                if (list.get(i5).intValue() == 0) {
                    this.f42923b -= iE;
                    e(i7, ncyVarE, i4);
                    this.f42923b += iE;
                }
            } else {
                e(i7, ncyVarE, i4);
                this.f42923b += iE;
            }
            i6 += iE;
            i4 += i3;
            i7++;
            i5++;
            z = true;
        }
        return false;
    }

    private ncy e(int i, int i2, int i3) {
        ncy ncyVarC = ncy.c(i3);
        try {
            byte[] bArrB = b(i2);
            if (bArrB != null && bArrB.length > 0) {
                ncyVarC.a().put(bArrB, i, i3);
                return ncyVarC;
            }
            return ncy.c(0);
        } catch (IndexOutOfBoundsException e2) {
            LogUtil.e("OtaTransferFile", "IndexOutOfBoundsException ", ExceptionUtils.c(e2));
            return ncyVarC;
        }
    }

    private byte[] b(int i) {
        synchronized (f42921c) {
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                ndg ndgVar = this.g.get(i2);
                if (ndgVar != null && ndgVar.d() == i) {
                    return ndgVar.c();
                }
            }
            return new byte[0];
        }
    }

    private int e(int i, int i2, int i3, int i4) {
        if ((i - i4) / i2 == 0) {
            i2 = i % i2;
        }
        if ((i + i3) - i4 <= this.aa) {
            return i2;
        }
        LogUtil.a("OtaTransferFile", "out of Index");
        return this.aa - i3;
    }

    private int b(int i, int i2) {
        if (i % i2 == 0) {
            return i / i2;
        }
        return (i / i2) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (this.ai == null) {
            this.ai = HandlerCenter.b(this.l, "OtaTransferFile");
        }
        if (i == 0) {
            this.ai.sendEmptyMessage(6, 45000L);
            return;
        }
        if (i == 1) {
            ExtendHandler extendHandler = this.ai;
            int i2 = this.ak;
            extendHandler.sendEmptyMessage(6, i2 + (i2 == 0 ? 60000 : 30000));
        } else {
            int i3 = this.ak;
            if (i3 != 0) {
                this.ai.sendEmptyMessage(6, i3);
            } else {
                this.ai.sendEmptyMessage(6, 30000L);
            }
        }
    }

    private void e(int i, ncy ncyVar, int i2) {
        byte[] bArr;
        if (this.u) {
            mik.b("OtaTransferFile", 9, 4);
            mio.c(this.o, "050904", "1", "", "");
        }
        this.u = false;
        byte[] bArrA = eeq.a(i);
        byte[] bArrArray = ncyVar.a().array();
        if (this.t) {
            byte[] bArrH = eeq.h(i2);
            bArr = new byte[bArrArray.length + bArrA.length + bArrH.length];
            System.arraycopy(bArrH, 0, bArr, 0, bArrH.length);
            System.arraycopy(bArrA, 0, bArr, bArrH.length, bArrA.length);
            System.arraycopy(bArrArray, 0, bArr, bArrA.length + bArrH.length, bArrArray.length);
        } else {
            bArr = new byte[bArrArray.length + bArrA.length];
            System.arraycopy(bArrA, 0, bArr, 0, bArrA.length);
            System.arraycopy(bArrArray, 0, bArr, bArrA.length, bArrArray.length);
        }
        ncyVar.d();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(4);
        deviceCommand.setDataContent(bArr);
        deviceCommand.setDataLen(bArr.length);
        c(deviceCommand);
    }

    private void e(int i, String str) {
        if (cop.h()) {
            if (i % 5 == 0 && i != this.ah) {
                this.ah = i;
                mik.a("OtaTransferFile", str, "ota process : ", Integer.valueOf(i));
            }
            if (i == 100) {
                this.ah = 0;
            }
        }
    }

    private void e(byte[] bArr) {
        CountDownLatch countDownLatch = this.h;
        if (countDownLatch != null) {
            try {
                if (countDownLatch.await(2L, TimeUnit.SECONDS)) {
                    LogUtil.a("OtaTransferFile", "sendApplyData timeout");
                }
            } catch (InterruptedException unused) {
                LogUtil.e("OtaTransferFile", "sendApplyData InterruptedException");
            }
        }
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 2, bArr2, 0, length);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(9);
        deviceCommand.setCommandID(3);
        deviceCommand.setDataContent(bArr2);
        deviceCommand.setDataLen(length);
        if (this.x) {
            mio.c(this.o, "050903", "1", "", "");
        }
        this.x = false;
        c(deviceCommand);
    }

    private void a(byte[] bArr) throws eeu {
        if (this.v) {
            return;
        }
        if (bArr[0] == 9) {
            int length = bArr.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                byte b2 = bArr[i];
                iArr[i] = b2;
                if (b2 < 0) {
                    iArr[i] = b2 + 256;
                }
            }
            int i2 = iArr[1];
            if (i2 == 3) {
                if (this.x) {
                    mik.b("OtaTransferFile", 9, 3);
                    mio.c(this.o, "050903", "0", "", "");
                }
                d(bArr, iArr);
                return;
            }
            if (i2 == 5) {
                mik.b("OtaTransferFile", 9, 5);
                d(bArr);
            } else if (i2 == 6) {
                mik.b("OtaTransferFile", 9, 6);
                d(nda.a(bArr));
            } else if (i2 == 7) {
                mik.b("OtaTransferFile", 9, 7);
                d(mbi.b(bArr));
            } else {
                LogUtil.j("OtaTransferFile", "otaV2NotificationMsg default");
            }
        }
    }

    private void d(byte[] bArr, int[] iArr) throws eeu {
        if (iArr[2] == 127) {
            LogUtil.j("OtaTransferFile", "error,do nothing");
            return;
        }
        CountDownLatch countDownLatch = this.ad;
        if (countDownLatch == null) {
            LogUtil.a("OtaTransferFile", "queue command.");
            this.ad = new CountDownLatch(1);
        } else {
            try {
                if (!countDownLatch.await(1L, TimeUnit.SECONDS)) {
                    countDownLatch.countDown();
                }
            } catch (InterruptedException e2) {
                LogUtil.e("OtaTransferFile", "5.9.3", ExceptionUtils.c(e2));
                countDownLatch.countDown();
            }
        }
        if (this.q) {
            e(bArr);
        }
        ncw ncwVarB = nda.b(bArr);
        if (ncwVarB == null) {
            LogUtil.j("OtaTransferFile", "dataOtaApplyReport == null");
        } else {
            d(ncwVarB);
        }
    }

    private void d(byte[] bArr) throws eeu {
        LogUtil.a("OtaTransferFile", "5.9.5 size report");
        d(nda.e(bArr));
        CountDownLatch countDownLatch = this.ad;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            LogUtil.a("OtaTransferFile", "5.9.5 finish, 5.9.3 can continue go on.");
        }
    }

    private void c(DeviceCommand deviceCommand) {
        deviceCommand.setmIdentify(this.j);
        if (this.f == null) {
            mkn.e().sendDeviceData(deviceCommand);
            return;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(deviceCommand.getDataLen() + 2);
        byteBufferAllocate.put(eeq.a(deviceCommand.getServiceID()));
        byteBufferAllocate.put(eeq.a(deviceCommand.getCommandID()));
        if (deviceCommand.getDataContent() != null) {
            byteBufferAllocate.put(deviceCommand.getDataContent());
        } else {
            LogUtil.j("OtaTransferFile", "command data is null, if not OTA, data incorrect");
        }
        byteBufferAllocate.flip();
        lnr lnrVar = new lnr();
        lnrVar.c(byteBufferAllocate.array());
        lnrVar.c(byteBufferAllocate.array().length);
        lnrVar.c(deviceCommand.getNeedAck());
        lnrVar.e(this.j);
        lnrVar.d(deviceCommand.getNeedEncrypt());
        lnrVar.g(deviceCommand.getServiceID());
        lnrVar.e(deviceCommand.getCommandID());
        this.f.b(c(this.j), lnrVar);
    }

    private int c(String str) {
        if (str == null) {
            return -1;
        }
        Integer num = d.get(str);
        if (num != null) {
            return num.intValue();
        }
        DeviceInfo deviceInfo = null;
        for (DeviceInfo deviceInfo2 : ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_DEVICES, null, "OtaTransferFile")) {
            if (deviceInfo2.getDeviceIdentify().equalsIgnoreCase(str)) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        if (deviceInfo == null) {
            return -1;
        }
        int deviceBluetoothType = deviceInfo.getDeviceBluetoothType();
        Integer numValueOf = Integer.valueOf(deviceBluetoothType);
        d.put(str, numValueOf);
        numValueOf.getClass();
        return deviceBluetoothType;
    }

    private boolean e(String str) {
        return str == null || str.indexOf(FeedbackWebConstants.INVALID_FILE_NAME_PRE) < 0;
    }

    public void c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("OtaTransferFile", "parseOTAReceivedData error ,data is null");
            return;
        }
        try {
            a(bArr);
        } catch (eeu e2) {
            LogUtil.e("OtaTransferFile", "otaV2NotificationMsg tlv error ", e2.getMessage());
        }
    }

    private void e(String str, int i, int i2, List<Integer> list) {
        LogUtil.a("OtaTransferFile", "sendFileByWifi : ", str, " offset : ", Integer.valueOf(i), "fileLength : ", Integer.valueOf(i2));
        if (TextUtils.isEmpty(str)) {
            this.ae.onFail(1002, "filePath is empty.", -1);
            return;
        }
        e(1);
        xia xiaVar = new xia();
        xiaVar.f(str);
        xiaVar.e(-1);
        xiaVar.e(i2);
        xiaVar.b(i);
        xiaVar.e(this.ae);
        double d2 = this.ac;
        xiaVar.d(d2 == 0.0d ? d(str) : (long) d2);
        xiaVar.d(list);
        xiaVar.h(4);
        xiaVar.j(this.k);
        xiaVar.g(this.f42923b);
        HwWifiP2pTransferManager.a().a(xiaVar);
    }

    private long d(String str) {
        return new File(str).length();
    }

    private DeviceInfo g() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "OtaTransferFile");
        if (deviceList.size() > 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (deviceInfo.getDeviceIdentify().equals(this.j)) {
                    return deviceInfo;
                }
            }
        }
        return null;
    }

    static class e implements ITransferFileCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private xhr f42929a;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.unitedevice.callback.ITransferFileCallback
        public void onFailure(int i, String str) throws RemoteException {
        }

        @Override // com.huawei.unitedevice.callback.ITransferFileCallback
        public void onProgress(int i, String str) throws RemoteException {
        }

        @Override // com.huawei.unitedevice.callback.ITransferFileCallback
        public void onSuccess(int i, String str, String str2) throws RemoteException {
        }

        public e(xhr xhrVar) {
            this.f42929a = xhrVar;
        }

        @Override // com.huawei.unitedevice.callback.ITransferFileCallback
        public void onResponse(int i, String str) throws RemoteException {
            LogUtil.a("OtaTransferFile", "sport device ota stop wifi file response, tell ui code.");
            xhr xhrVar = this.f42929a;
            if (xhrVar != null) {
                IResultAIDLCallback iResultAIDLCallbackL = xhrVar.l();
                UniteDevice uniteDeviceH = this.f42929a.h();
                try {
                    iResultAIDLCallbackL.onTransferFailed(109022, uniteDeviceH != null ? uniteDeviceH.getIdentify() : null);
                } catch (RemoteException e) {
                    LogUtil.e("OtaTransferFile", "reportUiFail Exception", ExceptionUtils.c(e));
                }
                this.f42929a = null;
            }
        }
    }
}
