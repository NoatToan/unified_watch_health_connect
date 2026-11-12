package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.huawei.datatype.GoogleDeviceCache;
import com.huawei.devicepair.model.StartPairOption;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwbtsdk.btdatatype.datatype.BluetoothDeviceNode;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.adddevice.PairingGuideActivity;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import com.huawei.ui.device.activity.pairing.DevicePairGuideUtil;
import com.huawei.ui.homehealth.qrcode.activity.DeviceConnectTipsActivity;
import com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity;
import com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;
import com.tencent.connect.common.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes17.dex */
public class ssj extends QrCodeBaseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f48589a = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f48590b = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.READ_PHONE_STATE"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f48591c = {"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"};
    private Timer aa;
    protected ssn d;
    protected int e;
    private BTDeviceMgrUtil f;
    private boolean g;
    private int h;
    private edn i;
    private ssn j;
    private CustomProgressDialog k;
    private BtSwitchStateCallback l;
    private BtDeviceDiscoverCallback m;
    private CustomProgressDialog.Builder n;
    private String o;
    private CustomTextAlertDialog p;
    private CommonDialog21 q;
    private BtDeviceResponseCallback r;
    private String s;
    private Timer t;
    private BroadcastReceiver u;
    private boolean v;
    private boolean w;
    private String x;
    private NoTitleCustomAlertDialog y;

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void handleMessage(Message message) {
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void mainHandleMessage(Message message, Activity activity) {
    }

    public ssj(Activity activity, CommBaseCallbackInterface commBaseCallbackInterface) {
        super(activity, commBaseCallbackInterface);
        this.aa = null;
        this.t = null;
        this.q = null;
        this.y = null;
        this.w = false;
        this.v = false;
        this.j = null;
        this.u = new BroadcastReceiver() { // from class: ssj.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    LogUtil.j("DeviceQrCodeHandle", "mProcessLocalBroadcastReceiver intent is null");
                    return;
                }
                if ("com.huawei.health.action.DOWNLOAD_SINGLE_DEVICE_PROCESS".equals(intent.getAction())) {
                    ssj.this.d(intent.getIntExtra("progress", -1));
                    return;
                }
                if ("com.huawei.health.action.ACTION_BACKGROUND_DOWNLOAD_DEVICE".equals(intent.getAction())) {
                    LogUtil.j("DeviceQrCodeHandle", "mProcessLocalBroadcastReceiver ACTION_BACKGROUND_DOWNLOAD_DEVICE");
                    ssj.this.ag();
                    Activity activity2 = (Activity) ssj.this.mActivity.get();
                    if (activity2 == null) {
                        LogUtil.j("DeviceQrCodeHandle", "runActivity is null");
                        return;
                    } else {
                        activity2.runOnUiThread(new Runnable() { // from class: ssj.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                ssj.this.m();
                                if (ssj.this.verify(ssj.this.j)) {
                                    ssj.this.execute();
                                } else {
                                    LogUtil.e("DeviceQrCodeHandle", "Data validation failed");
                                }
                            }
                        });
                        return;
                    }
                }
                LogUtil.a("DeviceQrCodeHandle", "mProcessLocalBroadcastReceiver()  intent : ", intent.getAction());
            }
        };
        this.l = new BtSwitchStateCallback() { // from class: ssj.13
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
            public void onBtSwitchStateCallback(int i) {
                LogUtil.a("DeviceQrCodeHandle", "btSwitchState:", Integer.valueOf(i));
                if (i == 1) {
                    ssj.this.e();
                    ssj.this.f();
                    ssj.this.d();
                    ssj.this.f.e(ssj.this.l);
                    ssj.this.n();
                    return;
                }
                LogUtil.j("R_QrCode_DeviceQrCodeHandle", "Bluetooth unknown state.");
            }
        };
        this.m = new BtDeviceDiscoverCallback() { // from class: ssj.22
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
            public void onDeviceDiscoveryCanceled() {
            }

            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
            public void onFailure(int i, String str) {
            }

            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
            public void onDeviceDiscovered(BluetoothDeviceNode bluetoothDeviceNode, int i, byte[] bArr) {
                if (bluetoothDeviceNode != null) {
                    try {
                        BluetoothDevice btDevice = bluetoothDeviceNode.getBtDevice();
                        if (btDevice != null) {
                            String name = btDevice.getName();
                            if (name == null) {
                                name = bluetoothDeviceNode.getRecordName();
                            }
                            LogUtil.a("DeviceQrCodeHandle", "device name : ", CommonUtil.n(name));
                            ssj.this.d(name, btDevice, i);
                        }
                    } catch (SecurityException e) {
                        LogUtil.e("DeviceQrCodeHandle", "onDeviceDiscovered SecurityException:", ExceptionUtils.c(e));
                    }
                }
            }

            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
            public void onDeviceDiscoveryFinished() {
                LogUtil.a("DeviceQrCodeHandle", "onDeviceDiscoveryFinished enter.");
                if (ssj.this.q != null && ssj.this.q.isShowing()) {
                    ssj.this.f();
                    ssj.this.f.d(BaseApplication.getContext(), ssj.this.r);
                    ssj.this.ab();
                }
            }
        };
        this.r = new BtDeviceResponseCallback() { // from class: ssj.23
            @Override // com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback
            public void onResponse(int i, Object obj) {
                if (i == 0) {
                    LogUtil.a("DeviceQrCodeHandle", "mHfpService set ok.");
                    ssj.this.w = true;
                } else {
                    LogUtil.e("R_QrCode_DeviceQrCodeHandle", "mHfpService is null.");
                    ssj.this.w = false;
                }
            }
        };
        BTDeviceMgrUtil bTDeviceMgrUtilC = BTDeviceMgrUtil.c();
        this.f = bTDeviceMgrUtilC;
        bTDeviceMgrUtilC.d(BaseApplication.getContext(), this.r);
    }

    public ssj(Activity activity, CommBaseCallbackInterface commBaseCallbackInterface, boolean z) {
        super(activity, commBaseCallbackInterface);
        this.aa = null;
        this.t = null;
        this.q = null;
        this.y = null;
        this.w = false;
        this.v = false;
        this.j = null;
        this.u = new BroadcastReceiver() { // from class: ssj.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    LogUtil.j("DeviceQrCodeHandle", "mProcessLocalBroadcastReceiver intent is null");
                    return;
                }
                if ("com.huawei.health.action.DOWNLOAD_SINGLE_DEVICE_PROCESS".equals(intent.getAction())) {
                    ssj.this.d(intent.getIntExtra("progress", -1));
                    return;
                }
                if ("com.huawei.health.action.ACTION_BACKGROUND_DOWNLOAD_DEVICE".equals(intent.getAction())) {
                    LogUtil.j("DeviceQrCodeHandle", "mProcessLocalBroadcastReceiver ACTION_BACKGROUND_DOWNLOAD_DEVICE");
                    ssj.this.ag();
                    Activity activity2 = (Activity) ssj.this.mActivity.get();
                    if (activity2 == null) {
                        LogUtil.j("DeviceQrCodeHandle", "runActivity is null");
                        return;
                    } else {
                        activity2.runOnUiThread(new Runnable() { // from class: ssj.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                ssj.this.m();
                                if (ssj.this.verify(ssj.this.j)) {
                                    ssj.this.execute();
                                } else {
                                    LogUtil.e("DeviceQrCodeHandle", "Data validation failed");
                                }
                            }
                        });
                        return;
                    }
                }
                LogUtil.a("DeviceQrCodeHandle", "mProcessLocalBroadcastReceiver()  intent : ", intent.getAction());
            }
        };
        this.l = new BtSwitchStateCallback() { // from class: ssj.13
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
            public void onBtSwitchStateCallback(int i) {
                LogUtil.a("DeviceQrCodeHandle", "btSwitchState:", Integer.valueOf(i));
                if (i == 1) {
                    ssj.this.e();
                    ssj.this.f();
                    ssj.this.d();
                    ssj.this.f.e(ssj.this.l);
                    ssj.this.n();
                    return;
                }
                LogUtil.j("R_QrCode_DeviceQrCodeHandle", "Bluetooth unknown state.");
            }
        };
        this.m = new BtDeviceDiscoverCallback() { // from class: ssj.22
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
            public void onDeviceDiscoveryCanceled() {
            }

            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
            public void onFailure(int i, String str) {
            }

            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
            public void onDeviceDiscovered(BluetoothDeviceNode bluetoothDeviceNode, int i, byte[] bArr) {
                if (bluetoothDeviceNode != null) {
                    try {
                        BluetoothDevice btDevice = bluetoothDeviceNode.getBtDevice();
                        if (btDevice != null) {
                            String name = btDevice.getName();
                            if (name == null) {
                                name = bluetoothDeviceNode.getRecordName();
                            }
                            LogUtil.a("DeviceQrCodeHandle", "device name : ", CommonUtil.n(name));
                            ssj.this.d(name, btDevice, i);
                        }
                    } catch (SecurityException e) {
                        LogUtil.e("DeviceQrCodeHandle", "onDeviceDiscovered SecurityException:", ExceptionUtils.c(e));
                    }
                }
            }

            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
            public void onDeviceDiscoveryFinished() {
                LogUtil.a("DeviceQrCodeHandle", "onDeviceDiscoveryFinished enter.");
                if (ssj.this.q != null && ssj.this.q.isShowing()) {
                    ssj.this.f();
                    ssj.this.f.d(BaseApplication.getContext(), ssj.this.r);
                    ssj.this.ab();
                }
            }
        };
        this.r = new BtDeviceResponseCallback() { // from class: ssj.23
            @Override // com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback
            public void onResponse(int i, Object obj) {
                if (i == 0) {
                    LogUtil.a("DeviceQrCodeHandle", "mHfpService set ok.");
                    ssj.this.w = true;
                } else {
                    LogUtil.e("R_QrCode_DeviceQrCodeHandle", "mHfpService is null.");
                    ssj.this.w = false;
                }
            }
        };
        BTDeviceMgrUtil bTDeviceMgrUtilC = BTDeviceMgrUtil.c();
        this.f = bTDeviceMgrUtilC;
        bTDeviceMgrUtilC.d(BaseApplication.getContext(), this.r);
        this.g = z;
    }

    protected void d(String str, BluetoothDevice bluetoothDevice, int i) {
        try {
            if (!TextUtils.isEmpty(this.x) && !TextUtils.isEmpty(str)) {
                if (this.x.equalsIgnoreCase(str)) {
                    if (lvi.i(this.e) && !this.v) {
                        f();
                        GoogleDeviceCache.QrBleCache qrBleCache = new GoogleDeviceCache.QrBleCache();
                        qrBleCache.setBluetoothDevice(bluetoothDevice);
                        qrBleCache.setRssi(i);
                        qrBleCache.setTime(System.currentTimeMillis());
                        GoogleDeviceCache.getInstance().saveCache(qrBleCache);
                        d();
                        e();
                        p();
                        this.v = true;
                        return;
                    }
                    if (this.v) {
                        LogUtil.a("DeviceQrCodeHandle", "no target device : ", CommonUtil.n(bluetoothDevice.getName()));
                        return;
                    } else {
                        e(bluetoothDevice, str);
                        return;
                    }
                }
                return;
            }
            LogUtil.j("DeviceQrCodeHandle", "mTargetDeviceName or deviceName is null");
        } catch (SecurityException e) {
            LogUtil.e("DeviceQrCodeHandle", "doJump SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void e(BluetoothDevice bluetoothDevice, String str) {
        this.v = true;
        d();
        f();
        e();
        try {
            if (bluetoothDevice.getName() != null) {
                str = bluetoothDevice.getName();
            }
            this.s = str;
            this.o = bluetoothDevice.getAddress();
            int i = this.h;
            if (i != 1 && i != 2) {
                this.h = this.i.b();
            } else {
                this.h = bluetoothDevice.getType();
            }
            b();
        } catch (SecurityException e) {
            LogUtil.e("DeviceQrCodeHandle", "scanedDeviceAboutNormalDevice SecurityException:", ExceptionUtils.c(e));
        }
    }

    public void b() {
        Activity activity = this.mActivity.get();
        if (activity == null) {
            return;
        }
        if (this.g) {
            i(activity);
            return;
        }
        if (rdp.a(activity, this.h)) {
            new HwGetDevicesParameter().setDeviceIdentify(this.o);
            if (!njy.e(ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, null, "DeviceQrCodeHandle"))) {
                SharedPreferenceManager.a(Integer.toString(1000), "wearable_unpair_reconnection", true);
                ArrayList arrayList = new ArrayList(16);
                arrayList.add(this.o);
                rcv.a(BaseApplication.getContext()).b((List<String>) arrayList, true);
            } else {
                coi.b().e(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.o));
            }
            c(activity);
            return;
        }
        g();
    }

    private void i(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) DeviceConnectTipsActivity.class);
        intent.putExtra("deviceName", this.s);
        intent.putExtra(MatterDataContans.KEY_MAC_ADDRESS, this.o);
        intent.putExtra("deviceType", this.e);
        ssn ssnVar = this.d;
        if (ssnVar != null) {
            intent.putExtra("pinCode", ssnVar.c());
        }
        intent.putExtra("bluetoothType", this.h);
        activity.startActivity(intent);
        activity.finish();
    }

    /* synthetic */ void a(View view) {
        g();
    }

    public void c(Activity activity) {
        if (activity != null) {
            rdp.d(this.o, activity, this.h, new View.OnClickListener() { // from class: ssl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48635a.a(view);
                }
            });
        }
    }

    protected void d() {
        Timer timer = this.aa;
        if (timer != null) {
            timer.cancel();
            this.aa = null;
        }
    }

    public void d(String str) {
        cqp.a(100112, this.s, str, String.valueOf(100003));
    }

    public void a(Intent intent) {
        if (this.o != null) {
            BluetoothAdapter.getDefaultAdapter();
            if (BluetoothAdapter.checkBluetoothAddress(this.o)) {
                rdp.d("DeviceQrCodeHandle", this.o, intent);
                SharedPreferenceManager.a("HEARTBEAT_INFO", "companion_device_manager_flag", true);
            }
        }
    }

    public void g() {
        LogUtil.a("DeviceQrCodeHandle", "Enter pairBleDevice.");
        final Activity activity = this.mActivity.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: ssj.21
                @Override // java.lang.Runnable
                public void run() {
                    rcw.b(activity).g(ssj.this.o);
                    String strI = lvi.a(ssj.this.e).i();
                    if (cjk.d().isSupportH5Pair(ssj.this.s)) {
                        String strJ = lvi.j(ssj.this.e);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(strJ);
                        cjk.d().startPair(activity, StartPairOption.builder().c(ssj.this.o).d(arrayList).d(ssj.this.s).a("wear_watch").e(false).a());
                        activity.finish();
                        return;
                    }
                    Intent intent = new Intent(activity, (Class<?>) DevicePairGuideActivity.class);
                    intent.putExtra("pairGuideProductType", ssj.this.e);
                    intent.putExtra("pairGuideProductName", strI);
                    intent.putExtra("pairGuideFromScanList", true);
                    intent.putExtra("pairGuideSelectName", ssj.this.s);
                    intent.putExtra("pairGuideSelectAddress", ssj.this.o);
                    intent.putExtra("pairGuideDeviceMode", 100003);
                    if (ssj.this.d != null) {
                        intent.putExtra("pairGuideProductPin", ssj.this.d.c());
                    }
                    activity.startActivityForResult(intent, 1);
                }
            });
        }
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public QrCodeDataBase parser(String str, Object obj) {
        if (str == null) {
            ReleaseLogUtil.e("R_QrCode_DeviceQrCodeHandle", "parser action is null.");
            return this.j;
        }
        if (!(obj instanceof String)) {
            ReleaseLogUtil.e("R_QrCode_DeviceQrCodeHandle", "data is null or error.");
            return this.j;
        }
        String strDecode = (String) obj;
        String str2 = str + sub.d(FitRunPlayAudio.PLAY_TYPE_T, strDecode);
        if (strDecode.startsWith("&")) {
            try {
                strDecode = URLDecoder.decode(strDecode.substring(1), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                LogUtil.e("DeviceQrCodeHandle", "parser UnsupportedEncodingException");
            }
        }
        LogUtil.a("DeviceQrCodeHandle", "codeResult:", strDecode, "actionType:", str2);
        ssn ssnVar = new ssn(str2);
        this.j = ssnVar;
        int rVar = ssnVar.parser(strDecode);
        cqp.a(100004, this.j.e(), String.valueOf(rVar), "");
        if (rVar == 0) {
            return this.j;
        }
        switch (rVar) {
            case Constants.ERROR_QQ_NOT_LOGIN /* -21 */:
                s();
                return null;
            case Constants.ERROR_QQ_NOT_INSTALL /* -20 */:
                LogUtil.j("DeviceQrCodeHandle", "DEVICE_TO_DOWNLOAD");
                aa();
                y();
                return null;
            case Constants.ERROR_NO_AUTHORITY /* -19 */:
                z();
                return null;
            default:
                u();
                return this.j;
        }
    }

    private void y() {
        LogUtil.a("DeviceQrCodeHandle", "enter registerNonLocalBroadcastReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action.DOWNLOAD_SINGLE_DEVICE_PROCESS");
        intentFilter.addAction("com.huawei.health.action.ACTION_BACKGROUND_DOWNLOAD_DEVICE");
        LocalBroadcastManager.getInstance().registerReceiver(this.u, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        if (this.u != null) {
            try {
                LocalBroadcastManager.getInstance().unregisterReceiver(this.u);
                LogUtil.a("DeviceQrCodeHandle", "unRegisterProcessBroadcastReceiver unregister");
                return;
            } catch (IllegalArgumentException unused) {
                LogUtil.e("DeviceQrCodeHandle", "IllegalArgumentException unRegisterProcessBroadcastReceiver unregister");
                return;
            }
        }
        LogUtil.a("DeviceQrCodeHandle", "mProcessLocalBroadcastReceiver is null");
    }

    private void s() {
        final Activity activity = this.mActivity.get();
        if (activity == null) {
            LogUtil.e("DeviceQrCodeHandle", "startDownLoadProgress activity is null");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: ssj.25
                @Override // java.lang.Runnable
                public void run() {
                    qpx.e(activity, R.string.IDS_connect_network);
                    ssj.this.n();
                }
            });
        }
    }

    private void aa() {
        CustomProgressDialog customProgressDialog = this.k;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            LogUtil.a("DeviceQrCodeHandle", "The progress bar already exists");
            return;
        }
        final Activity activity = this.mActivity.get();
        if (activity == null) {
            LogUtil.e("DeviceQrCodeHandle", "startDownLoadProgress activity is null");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: ssj.24
                @Override // java.lang.Runnable
                public void run() {
                    ssj.this.n = new CustomProgressDialog.Builder(activity);
                    ssj.this.n.e(activity.getString(R.string.IDS_hw_health_wear_update_device_resource_text)).e(new View.OnClickListener() { // from class: ssj.24.5
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            LogUtil.a("DeviceQrCodeHandle", "Click Cancel");
                            ssj.this.q();
                        }
                    });
                    ssj ssjVar = ssj.this;
                    ssjVar.k = ssjVar.n.c();
                    ssj.this.k.setCanceledOnTouchOutside(false);
                    if (!activity.isFinishing()) {
                        ssj.this.k.show();
                        ssj.this.n.b(0);
                        ssj.this.n.b(UnitUtil.e(0.0d, 2, 0));
                    }
                    LogUtil.a("DeviceQrCodeHandle", "mCustomProgressDialog.show()");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (i == -1) {
            rdt.b(100101, "");
            q();
            return;
        }
        CustomProgressDialog customProgressDialog = this.k;
        if (customProgressDialog == null || this.n == null || !customProgressDialog.isShowing() || i < 0) {
            return;
        }
        String strE = UnitUtil.e(i, 2, 0);
        this.n.b(i);
        this.n.b(strE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        LogUtil.a("DeviceQrCodeHandle", "enter handleCancel");
        pis pisVarE = piu.c().e(lvi.d(this.e));
        if (pisVarE != null) {
            EzPluginManager.b().c(pisVarE);
        }
        o();
    }

    private void o() {
        m();
        ag();
        x();
    }

    private void x() {
        CustomTextAlertDialog customTextAlertDialog = this.p;
        if (customTextAlertDialog == null || !customTextAlertDialog.isShowing()) {
            final Activity activity = this.mActivity.get();
            if (activity == null) {
                LogUtil.e("DeviceQrCodeHandle", "showErrorLayoutDialog activity is null");
            } else {
                activity.runOnUiThread(new Runnable() { // from class: ssj.27
                    @Override // java.lang.Runnable
                    public void run() {
                        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
                        builder.a(R.string.IDS_service_area_notice_title).b(R.string.IDS_device_device_list_update_failed).a(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: ssj.27.2
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                if (ssj.this.p != null) {
                                    ssj.this.p.dismiss();
                                    ssj.this.p = null;
                                    ssj.this.n();
                                }
                            }
                        });
                        ssj.this.p = builder.b();
                        ssj.this.p.setCancelable(false);
                        ssj.this.p.show();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        LogUtil.a("DeviceQrCodeHandle", "enter closeProgress");
        if (this.k == null) {
            return;
        }
        Activity activity = this.mActivity.get();
        if (activity == null) {
            LogUtil.e("DeviceQrCodeHandle", "closeProgress activity is null");
            return;
        }
        if (this.k.isShowing() && !activity.isFinishing()) {
            this.k.dismiss();
            LogUtil.a("DeviceQrCodeHandle", "enter closeProgress cancel");
        }
        this.k = null;
        this.n = null;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public boolean verify(QrCodeDataBase qrCodeDataBase) {
        if (qrCodeDataBase == null) {
            LogUtil.e("R_QrCode_DeviceQrCodeHandle", "device qrcodeData is null");
        } else if (qrCodeDataBase instanceof ssn) {
            ssn ssnVar = (ssn) qrCodeDataBase;
            if (ssnVar.b()) {
                LogUtil.a("R_QrCode_DeviceQrCodeHandle", "parse result is empty or loss info.");
                sendCallBack(-3, qrCodeDataBase.getAction(), null);
            } else {
                LogUtil.a("DeviceQrCodeHandle", "verify ok. return true.");
                this.d = ssnVar;
                return true;
            }
        } else {
            sendCallBack(-4, qrCodeDataBase.getAction(), null);
            LogUtil.e("R_QrCode_DeviceQrCodeHandle", "device qrcodeData type is error,");
        }
        return true;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void execute() {
        ReleaseLogUtil.d("R_QrCode_DeviceQrCodeHandle", "execute");
        if (this.d == null || this.mActivity == null) {
            LogUtil.j("DeviceQrCodeHandle", "mData or mActivity is null");
            return;
        }
        ReleaseLogUtil.d("R_QrCode_DeviceQrCodeHandle", "deviceName : ", this.d.e(), " , type : ", Integer.valueOf(this.d.d()));
        int iD = this.d.d();
        this.e = iD;
        boolean zN = lvi.n(iD);
        LogUtil.a("DeviceQrCodeHandle", "isPlugin:", Boolean.valueOf(zN));
        if (!CommonUtil.ap() && zN) {
            boolean zC = qtk.c(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(this.e)), this.e, CommonUtil.e(BaseApplication.getContext()));
            ReleaseLogUtil.d("R_QrCode_DeviceQrCodeHandle", "isUpdate:", Boolean.valueOf(zC));
            final Activity activity = this.mActivity.get();
            if (zC && activity != null) {
                activity.runOnUiThread(new Runnable() { // from class: ssj.29
                    @Override // java.lang.Runnable
                    public void run() {
                        qtk.a(BaseApplication.getContext(), activity, true);
                    }
                });
                return;
            }
        }
        Activity activity2 = this.mActivity.get();
        if (activity2 != null && !rdp.b((Context) activity2)) {
            b(activity2);
            return;
        }
        String strJ = lvi.j(this.e);
        if (((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strJ)) {
            if (!TextUtils.isEmpty(this.d.e())) {
                c();
                return;
            } else {
                e(activity2);
                return;
            }
        }
        LogUtil.j("DeviceQrCodeHandle", "isAvaiable is false,uuid:", strJ);
    }

    protected void e(final Activity activity) {
        LogUtil.a("DeviceQrCodeHandle", "enter jumpToPairingGuideActivity");
        List<edx> indexList = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getIndexList();
        if (indexList == null) {
            LogUtil.j("DeviceQrCodeHandle", "deviceList is null");
            z();
            return;
        }
        for (edx edxVar : indexList) {
            if (edxVar.g() != null) {
                if (lvi.j(this.e).equals(edxVar.b()) && !eev.d(edxVar.h())) {
                    LogUtil.j("DeviceQrCodeHandle", "app version is not supported");
                    z();
                    return;
                }
            }
        }
        activity.runOnUiThread(new Runnable() { // from class: ssj.3
            @Override // java.lang.Runnable
            public void run() {
                ssj.this.d(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity) {
        String strR;
        String strS;
        Intent intent = new Intent(activity, (Class<?>) PairingGuideActivity.class);
        String strJ = lvi.j(this.e);
        Iterator<eds> it = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList().iterator();
        while (true) {
            strR = "2";
            if (!it.hasNext()) {
                strS = "wear_watch";
                break;
            }
            eds next = it.next();
            if (next.aa().contains(strJ)) {
                strS = next.s();
                Map<String, String> mapU = next.u();
                if (mapU != null && !mapU.isEmpty()) {
                    strR = mapU.get(strJ);
                }
                if (TextUtils.isEmpty(strR)) {
                    strR = next.r();
                }
                LogUtil.a("DeviceQrCodeHandle", "kindId:", strS);
                break;
            }
        }
        intent.putExtra("kind_id", strS);
        intent.putExtra("pair_guide", strR);
        intent.putExtra("is_scan_to_pair_guide", true);
        ArrayList<String> arrayList = new ArrayList<>(16);
        arrayList.add(strJ);
        intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, arrayList);
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("DeviceQrCodeHandle", "jumpToPairingGuideIntent not found");
        }
        n();
    }

    protected static void b(final Activity activity) {
        activity.runOnUiThread(new Runnable() { // from class: ssj.4
            @Override // java.lang.Runnable
            public void run() {
                NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).b(R.string.IDS_pad_cannot_be_added).c(R.string.IDS_ota_update_know, new View.OnClickListener() { // from class: ssj.4.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LogUtil.a("DeviceQrCodeHandle", "Bluetooth not supported");
                        activity.finish();
                    }
                }).c();
                noTitleCustomAlertDialogC.setCancelable(false);
                noTitleCustomAlertDialogC.show();
            }
        });
    }

    protected void a() {
        if (lvi.i(this.d.d())) {
            if (qql.e()) {
                b(this.d.e());
                return;
            } else {
                r();
                return;
            }
        }
        b(this.d.e());
    }

    private void ac() {
        LogUtil.a("DeviceQrCodeHandle", "enter showWaitDialog.");
        final Activity activity = this.mActivity.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: ssj.2
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("DeviceQrCodeHandle", "showWaitDialog. run");
                    if (!activity.isFinishing()) {
                        if (ssj.this.q == null) {
                            ssj ssjVar = ssj.this;
                            new CommonDialog21(activity, com.huawei.ui.homehealth.R.style.app_update_dialogActivity);
                            ssjVar.q = CommonDialog21.b(activity);
                        }
                        ssj.this.q.b(activity.getString(R.string.IDS_qrcode_wait_dialog_msg));
                        ssj.this.q.setCancelable(false);
                        if (activity.isFinishing()) {
                            return;
                        }
                        ssj.this.q.show();
                        return;
                    }
                    LogUtil.e("R_QrCode_DeviceQrCodeHandle", "showWaitDialog is null.");
                }
            });
        }
    }

    protected void e() {
        final Activity activity = this.mActivity.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: ssj.5
                @Override // java.lang.Runnable
                public void run() {
                    if (!activity.isFinishing() && ssj.this.q != null && !activity.isDestroyed()) {
                        ssj.this.q.dismiss();
                        ssj.this.q = null;
                    } else {
                        LogUtil.a("DeviceQrCodeHandle", "no need dismiss mDialog.");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        ReleaseLogUtil.d("R_QrCode_DeviceQrCodeHandle", "enter showNoFindDevice");
        final Activity activity = this.mActivity.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: ssj.8
                @Override // java.lang.Runnable
                public void run() {
                    ssj.this.e();
                    NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
                    builder.b(R.string.IDS_qrcode_no_find_device);
                    builder.c(R.string.IDS_qrcode_rescan_device, new View.OnClickListener() { // from class: ssj.8.4
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            ssj.this.y.dismiss();
                            ssj.this.w();
                        }
                    });
                    builder.a(R.string.IDS_settings_button_cancal_ios_btn, new View.OnClickListener() { // from class: ssj.8.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            ssj.this.y.dismiss();
                            activity.finish();
                        }
                    });
                    ssj.this.y = builder.c();
                    ssj.this.y.setCancelable(false);
                    if (activity.isFinishing()) {
                        return;
                    }
                    ssj.this.y.show();
                }
            });
        }
    }

    private void z() {
        final Activity activity = this.mActivity.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: ssj.6
                @Override // java.lang.Runnable
                public void run() {
                    NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
                    builder.a(activity.getResources().getString(R.string.IDS_qrcode_not_support_device));
                    builder.a(R.string.IDS_dialog_checkbox_confirm, new View.OnClickListener() { // from class: ssj.6.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            ssj.this.n();
                        }
                    });
                    if (activity.isFinishing()) {
                        return;
                    }
                    NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
                    noTitleCustomAlertDialogC.setCancelable(false);
                    noTitleCustomAlertDialogC.show();
                }
            });
        }
    }

    private void u() {
        final Activity activity = this.mActivity.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: ssj.7
                @Override // java.lang.Runnable
                public void run() {
                    NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
                    builder.a(activity.getResources().getString(R.string.IDS_qrcode_no_recognition));
                    builder.a(activity.getResources().getString(R.string.IDS_common_notification_know_tips), new View.OnClickListener() { // from class: ssj.7.5
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            LogUtil.a("R_QrCode_DeviceQrCodeHandle", "noRecognitionDialog click ok.");
                            ssj.this.n();
                        }
                    });
                    if (activity.isFinishing()) {
                        return;
                    }
                    NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
                    noTitleCustomAlertDialogC.setCancelable(false);
                    noTitleCustomAlertDialogC.show();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        final Activity activity = this.mActivity.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: ssj.9
                @Override // java.lang.Runnable
                public void run() {
                    qql.b(activity, new View.OnClickListener() { // from class: ssj.9.4
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            LogUtil.a("DeviceQrCodeHandle", "uninstallShowDialog negative.");
                            ssj.this.n();
                        }
                    }, new View.OnClickListener() { // from class: ssj.9.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if ("network_disconnected".equals(view.getTag())) {
                                LogUtil.a("R_QrCode_DeviceQrCodeHandle", "no net.");
                                ssj.this.n();
                            } else if ("network_connected".equals(view.getTag())) {
                                LogUtil.a("R_QrCode_DeviceQrCodeHandle", "jump download.");
                            } else {
                                LogUtil.a("R_QrCode_DeviceQrCodeHandle", "unknown tag.");
                            }
                        }
                    });
                }
            });
        }
    }

    private void b(String str) {
        this.x = str;
        SharedPreferenceManager.c(String.valueOf(10), "app_big_data_device_name", str);
        Activity activity = this.mActivity.get();
        if (activity != null) {
            edn ednVarA = lvi.a(this.e);
            if (Build.VERSION.SDK_INT > 30) {
                d(f48591c, activity);
            } else if (ednVarA.b() == 2) {
                d(f48590b, activity);
            } else {
                d(f48589a, activity);
            }
        }
    }

    private void c(final Activity activity, String str, String str2) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.mActivity.get()).a(str2).a(str, new View.OnClickListener() { // from class: ssj.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                activity.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 3);
            }
        }).c();
        noTitleCustomAlertDialogC.setCanceledOnTouchOutside(false);
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void d(String[] strArr, Activity activity) {
        if (!lsg.d(activity, strArr)) {
            if (Arrays.asList(strArr).contains("android.permission.READ_PHONE_STATE")) {
                e(PermissionUtil.PermissionType.PHONE_STATE, activity);
                return;
            } else if (Arrays.asList(strArr).contains("android.permission.BLUETOOTH_SCAN")) {
                e(PermissionUtil.PermissionType.SCAN, activity);
                return;
            } else {
                e(PermissionUtil.PermissionType.LOCATION, activity);
                return;
            }
        }
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(PermissionUtil.PermissionType permissionType, Activity activity) {
        LogUtil.a("DeviceQrCodeHandle", "applyLocationAndPhoneStatePermission", permissionType);
        if (activity.isFinishing()) {
            return;
        }
        activity.runOnUiThread(new AnonymousClass14(activity, permissionType));
    }

    /* JADX INFO: renamed from: ssj$14, reason: invalid class name */
    class AnonymousClass14 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f48599b;
        final /* synthetic */ PermissionUtil.PermissionType d;

        AnonymousClass14(Activity activity, PermissionUtil.PermissionType permissionType) {
            this.f48599b = activity;
            this.d = permissionType;
        }

        @Override // java.lang.Runnable
        public void run() {
            PermissionUtil.d(this.f48599b, this.d, new CustomPermissionAction(this.f48599b) { // from class: ssj.14.4
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("DeviceQrCodeHandle", "permission allowed permissionType:", AnonymousClass14.this.d);
                    if (AnonymousClass14.this.d == PermissionUtil.PermissionType.LOCATION || AnonymousClass14.this.d == PermissionUtil.PermissionType.SCAN) {
                        ssj.this.t();
                    } else {
                        ssj.this.e(PermissionUtil.PermissionType.LOCATION, AnonymousClass14.this.f48599b);
                    }
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    super.onDenied(str);
                    LogUtil.a("DeviceQrCodeHandle", "permission onDenied permission:", str);
                    if (AnonymousClass14.this.f48599b.isFinishing()) {
                        return;
                    }
                    super.onForeverDenied(AnonymousClass14.this.d, new View.OnClickListener() { // from class: ssj.14.4.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            ssj.this.n();
                        }
                    }, new View.OnClickListener() { // from class: ssj.14.4.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            ssj.this.n();
                        }
                    });
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                    LogUtil.a("DeviceQrCodeHandle", "permission onForeverDenied:", permissionType);
                    if (!AnonymousClass14.this.f48599b.isFinishing()) {
                        super.onForeverDenied(permissionType, new View.OnClickListener() { // from class: ssj.14.4.5
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                ssj.this.n();
                            }
                        }, new View.OnClickListener() { // from class: ssj.14.4.2
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                ssj.this.n();
                            }
                        });
                    } else {
                        super.onForeverDenied(permissionType);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        final Activity activity = this.mActivity.get();
        if (activity == null) {
            LogUtil.j("DeviceQrCodeHandle", "getHarmonyStatus runActivity is null");
        } else if (DevicePairGuideUtil.b() == null) {
            ThreadPoolManager.c().a("DeviceQrCodeHandle", new Runnable() { // from class: ssj.11
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("DeviceQrCodeHandle", "getHarmonyStatus getValue");
                    String strD = lon.c().d("scale_share_harmony_tips");
                    DevicePairGuideUtil.e(strD);
                    LogUtil.a("DeviceQrCodeHandle", "getHarmonyStatus scale_share_harmony_tips:", strD);
                    activity.runOnUiThread(new Runnable() { // from class: ssj.11.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT > 30) {
                                ssj.this.ae();
                            } else {
                                ssj.this.a(activity);
                            }
                        }
                    });
                }
            });
        } else {
            activity.runOnUiThread(new Runnable() { // from class: ssj.15
                @Override // java.lang.Runnable
                public void run() {
                    if (Build.VERSION.SDK_INT > 30) {
                        ssj.this.ae();
                    } else {
                        ssj.this.a(activity);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        String string;
        edn ednVarA = lvi.a(this.e);
        if ((a(ednVarA.b()) || ednVarA.b() == 2) && !rdp.b()) {
            LogUtil.j("DeviceQrCodeHandle", "checkGpsState open gps switch.");
            String string2 = BaseApplication.getContext().getString(android.R.string.ok);
            if ("on".equals(DevicePairGuideUtil.b())) {
                string = BaseApplication.getContext().getString(R.string.IDS_btsdk_turn_on_location_harmony);
            } else {
                string = BaseApplication.getContext().getString(R.string.IDS_btsdk_turn_on_location);
            }
            c(activity, string2, string);
            return;
        }
        ae();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        ReleaseLogUtil.d("R_QrCode_DeviceQrCodeHandle", "start scan ble.");
        int iH = this.f.h();
        if (iH == 1 || iH == 2) {
            j();
        } else if (iH == 3 || iH == 4) {
            v();
        } else {
            LogUtil.j("R_QrCode_DeviceQrCodeHandle", "unknown state.");
            k();
        }
    }

    private void k() {
        final Activity activity = this.mActivity.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: ssj.12
                @Override // java.lang.Runnable
                public void run() {
                    qpx.e(activity, qrs.ah(BaseApplication.getContext()) ? R.string.IDS_blite_pair_reopen_bt_pad : R.string.IDS_blite_guide_paire_fail_help_no_band_string);
                    ssj.this.n();
                }
            });
        }
    }

    private void v() {
        edn ednVarA = lvi.a(this.e);
        this.i = ednVarA;
        if (TextUtils.isEmpty(ednVarA.i())) {
            z();
            LogUtil.a("DeviceQrCodeHandle", "no support type : ", Integer.valueOf(this.e));
            return;
        }
        ac();
        Timer timer = new Timer("DeviceQrCodeHandle");
        this.aa = timer;
        timer.schedule(new TimerTask() { // from class: ssj.17
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                cqp.a(100006, ssj.this.x, "", "");
                ssj.this.f();
                ssj.this.ad();
            }
        }, 20000L);
        ab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        Timer timer = new Timer("DeviceQrCodeHandle");
        this.t = timer;
        timer.schedule(new TimerTask() { // from class: ssj.16
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                LogUtil.a("DeviceQrCodeHandle", "mHfpTimer enter.");
                if (ssj.this.w || ssj.this.i.b() != 1) {
                    if (ssj.this.t != null) {
                        ssj.this.t.cancel();
                    }
                    if (ssj.this.l()) {
                        return;
                    }
                    ssj.this.f.c(rcy.e(ssj.this.e), ssj.this.i.b(), ssj.this.m);
                    return;
                }
                LogUtil.j("R_QrCode_DeviceQrCodeHandle", "HfpService is not ok.");
            }
        }, 1000L, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        if (TextUtils.isEmpty(this.x)) {
            return false;
        }
        try {
            List<BluetoothDevice> listI = this.f.i();
            if (listI != null && listI.size() > 0) {
                for (BluetoothDevice bluetoothDevice : listI) {
                    if (!this.x.equalsIgnoreCase(bluetoothDevice.getName())) {
                        LogUtil.a("DeviceQrCodeHandle", "hfp device is : ", bluetoothDevice.getName());
                    } else {
                        e(bluetoothDevice, (String) null);
                        return true;
                    }
                }
            }
        } catch (SecurityException e) {
            LogUtil.e("DeviceQrCodeHandle", "checkHfpDeviceList SecurityException:", ExceptionUtils.c(e));
        }
        return false;
    }

    public void i() {
        e();
        f();
        d();
        this.f.e(this.l);
    }

    public void h() {
        v();
    }

    protected void f() {
        LogUtil.a("DeviceQrCodeHandle", "stop scan ble.");
        Timer timer = this.t;
        if (timer != null) {
            timer.cancel();
            this.t = null;
        }
        this.f.d();
        this.w = false;
    }

    private void p() {
        final Activity activity = this.mActivity.get();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: ssj.19
            @Override // java.lang.Runnable
            public void run() {
                if (qql.b() == null) {
                    ssj.this.r();
                    return;
                }
                if (qql.a(activity)) {
                    Activity activity2 = (Activity) ssj.this.mActivity.get();
                    if (activity2 != null) {
                        activity2.finish();
                        return;
                    }
                    return;
                }
                ssj.this.r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Activity activity = this.mActivity.get();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        Activity activity = this.mActivity.get();
        if (activity == null) {
            return;
        }
        if (activity instanceof QrCodeScanningActivity) {
            ((QrCodeScanningActivity) activity).b();
        } else {
            activity.finish();
        }
    }

    private void j() {
        final Activity activity = this.mActivity.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: ssj.18
                @Override // java.lang.Runnable
                public void run() {
                    NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
                    builder.b(R.string.IDS_btsdk_turn_on_BT).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: ssj.18.5
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            ssj.this.f.a(ssj.this.l);
                            LogUtil.a("DeviceQrCodeHandle", "bluetoothSwitch ACTION_REQUEST_ENABLE");
                            try {
                                activity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 102);
                            } catch (SecurityException unused) {
                                ReleaseLogUtil.a("R_QrCode_DeviceQrCodeHandle", "bluetoothSwitch SecurityException");
                                ssj.this.n();
                            }
                        }
                    }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: ssj.18.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            ssj.this.n();
                        }
                    });
                    if (activity.isFinishing()) {
                        return;
                    }
                    NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
                    noTitleCustomAlertDialogC.setCancelable(false);
                    noTitleCustomAlertDialogC.show();
                }
            });
        }
    }

    private boolean a(int i) {
        return PermissionUtil.a() && i == 1;
    }

    protected void c() {
        LogUtil.a("DeviceQrCodeHandle", "Enter handleSwitchDevice.");
        List<DeviceInfo> listB = rcv.a(BaseApplication.getContext()).b();
        if (listB == null || listB.isEmpty()) {
            LogUtil.j("DeviceQrCodeHandle", "handleSwitchDevice connectedDeviceInfo is empty.");
            a();
        } else if (listB.size() == 1) {
            c(listB);
        } else {
            e(listB);
        }
    }

    private void c(List<DeviceInfo> list) {
        LogUtil.a("DeviceQrCodeHandle", "Enter switchForOneConnectedDevice.");
        DeviceInfo deviceInfo = list.get(0);
        if (deviceInfo == null) {
            LogUtil.j("DeviceQrCodeHandle", "switchForOneConnectedDevice deviceInfo is null.");
            a();
            return;
        }
        if (eel.d(deviceInfo.getProductType())) {
            if (deviceInfo.getAutoDetectSwitchStatus() == 0) {
                LogUtil.a("DeviceQrCodeHandle", "switchForOneConnectedDevice connected device is aw70 band mode.");
                a(deviceInfo);
                return;
            } else if (deviceInfo.getAutoDetectSwitchStatus() == 1) {
                LogUtil.a("DeviceQrCodeHandle", "switchForOneConnectedDevice connected device is aw70 run mode.");
                a();
                return;
            } else {
                LogUtil.j("DeviceQrCodeHandle", "switchForOneConnectedDevice connected device is aw70 unknown mode.");
                a();
                return;
            }
        }
        a(deviceInfo);
    }

    private void e(List<DeviceInfo> list) {
        LogUtil.a("DeviceQrCodeHandle", "Enter switchForMoreConnectedDevices.");
        for (DeviceInfo deviceInfo : list) {
            if (!eel.d(deviceInfo.getProductType(), deviceInfo.getAutoDetectSwitchStatus())) {
                LogUtil.d("DeviceQrCodeHandle", "switchForMoreConnectedDevices connected device is not aw70 run mode.");
                a(deviceInfo);
                return;
            }
        }
    }

    private void a(DeviceInfo deviceInfo) {
        if (this.mActivity == null) {
            LogUtil.j("DeviceQrCodeHandle", "handleSwitchDeviceDialog mActivity is null.");
            return;
        }
        Activity activity = this.mActivity.get();
        if (activity == null) {
            LogUtil.j("DeviceQrCodeHandle", "handleSwitchDeviceDialog activity is null.");
            return;
        }
        rcv rcvVarA = rcv.a(BaseApplication.getContext());
        String strD = rcvVarA.d(deviceInfo.getProductType());
        String deviceName = deviceInfo.getDeviceName();
        if (!TextUtils.isEmpty(deviceName)) {
            strD = deviceName;
        }
        String strE = rcvVarA.e(this.e);
        ssn ssnVar = this.d;
        if (ssnVar != null && !TextUtils.isEmpty(ssnVar.e())) {
            strE = this.d.e();
        }
        LogUtil.a("DeviceQrCodeHandle", "handleSwitchDeviceDialog scan device: ", strE, ", connected device: ", strD);
        a(activity, String.format(Locale.ENGLISH, activity.getResources().getString(R.string.IDS_replace_device_dialog_content_new), strE, strD));
    }

    private void a(final Activity activity, final String str) {
        activity.runOnUiThread(new Runnable() { // from class: ssj.20
            @Override // java.lang.Runnable
            public void run() {
                CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(activity).a(R.string.IDS_device_replace_dialog_title_notification).a(str).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: ssj.20.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LogUtil.a("DeviceQrCodeHandle", "showSwitchDeviceDialog click cancel.");
                        ssj.this.n();
                    }
                }).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: ssj.20.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LogUtil.a("DeviceQrCodeHandle", "showSwitchDeviceDialog click ok.");
                        ssj.this.a();
                    }
                }).b();
                customTextAlertDialogB.setCancelable(false);
                if (activity.isFinishing()) {
                    return;
                }
                customTextAlertDialogB.show();
            }
        });
    }
}
