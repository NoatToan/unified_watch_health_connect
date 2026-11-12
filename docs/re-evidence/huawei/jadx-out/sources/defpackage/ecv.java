package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.health.device.wifi.interfaces.BaseCallback;
import com.huawei.health.device.wifi.interfaces.BaseCallbackInterface;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.device.wifi.manager.DeviceRegisterManager;
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.unite.RegisterInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetWifiDeviceInfoReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetWifiDeviceInfoRsp;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes7.dex */
public class ecv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f32759b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f32760c = false;
    private static String d;
    private static BroadcastReceiver e = new BroadcastReceiver() { // from class: ecv.4
        /* JADX WARN: Code duplicated, block: B:27:0x005f  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            byte b2;
            dyg.e(false, "SoftApOuthManager", " sNetChangeReceiver enter");
            if (intent == null) {
                dyg.e(false, "SoftApOuthManager", " sNetChangeReceiver | intent == null，return！");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                dyg.e(false, "SoftApOuthManager", " sNetChangeReceiver | action == null，return！");
                return;
            }
            action.hashCode();
            int iHashCode = action.hashCode();
            if (iHashCode != -1875733435) {
                if (iHashCode != -1172645946) {
                    if (iHashCode == -343630553 && action.equals("android.net.wifi.STATE_CHANGE")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                dyg.e(false, "SoftApOuthManager", "sNetChangeReceiver WIFI_STATE_CHANGED_ACTION: wifi state:", Integer.valueOf(intent.getIntExtra("wifi_state", 0)));
                return;
            }
            if (b2 == 1) {
                NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                if (networkInfo != null) {
                    ecv.e(networkInfo, context);
                    return;
                } else {
                    dyg.e(false, "SoftApOuthManager", "sNetChangeReceiver CONNECTIVITY_ACTION: NULL");
                    return;
                }
            }
            if (b2 != 2) {
                return;
            }
            try {
                Parcelable parcelableExtra = intent.getParcelableExtra("networkInfo");
                if (parcelableExtra != null) {
                    if (parcelableExtra instanceof NetworkInfo) {
                        ecv.e((NetworkInfo) parcelableExtra, context);
                        return;
                    }
                    return;
                }
                dyg.e(false, "SoftApOuthManager", "sNetChangeReceiver NETWORK_STATE_CHANGED_ACTION: NULL");
            } catch (ClassCastException e2) {
                dyg.c(false, "SoftApOuthManager", "sNetChangeReceiver NETWORK_STATE_CHANGED_ACTION exception:", e2.getMessage());
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ebv f32761a;
    private String f;
    private CommBaseCallbackInterface g;
    private Context h;
    private String i;
    private BaseCallbackInterface j;
    private b k;
    private eay l;
    private ech t;
    private WifiManager v;
    private BaseCallbackInterface w;
    private long x;
    private final Object p = new Object();
    private volatile int ac = -1;
    private volatile boolean q = false;
    private int o = 0;
    private boolean r = false;
    private int m = -1;
    private int n = 0;
    private int s = -1;
    private String y = "";
    private long u = 0;

    private ecv(Context context) {
        this.h = context;
        o();
    }

    public static boolean e() {
        return f32760c;
    }

    public static ecv d(Context context) {
        if (context == null) {
            dyg.e(false, "SoftApOuthManager", " create Context is null");
            return null;
        }
        return new ecv(context);
    }

    private void o() {
        this.ac = -1;
        this.v = (WifiManager) this.h.getSystemService("wifi");
        this.j = new a(this);
        this.w = new d(this);
        this.k = new b(this);
    }

    public void e(ebv ebvVar, String str, String str2, CommBaseCallbackInterface commBaseCallbackInterface) {
        if (ebvVar == null) {
            dyg.e(false, "SoftApOuthManager", " start addDeviceInfo is null");
            return;
        }
        if (str == null || commBaseCallbackInterface == null) {
            dyg.e(false, "SoftApOuthManager", " start authName or callback is null");
            return;
        }
        dyg.e(false, "SoftApOuthManager", " start() addDeviceInfo = ", ebvVar, " authSSID = ", str, " authPsd = ", dyg.b(str2));
        this.f32761a = ebvVar;
        b(ebvVar.i());
        a(this.f32761a.a());
        this.i = str;
        this.f = str2;
        this.g = commBaseCallbackInterface;
        this.y = null;
        this.u = 0L;
        e(false);
        a(0, 150000L);
    }

    private static void b(String str) {
        f32759b = str;
    }

    private static void a(String str) {
        d = str;
    }

    private static void e(boolean z) {
        f32760c = z;
    }

    private void a(int i, long j) {
        if (this.f32761a == null || TextUtils.isEmpty(this.i)) {
            dyg.c(false, "SoftApOuthManager", " startSoftApAuth params error");
            return;
        }
        if (TextUtils.isEmpty(f32759b)) {
            dyg.c(false, "SoftApOuthManager", "startSoftApAuth sDeviceSsid is empty");
            this.k.removeMessages(10);
            Message messageObtain = Message.obtain();
            messageObtain.what = 10;
            messageObtain.arg1 = 1101;
            this.k.sendEmptyMessage(10);
            return;
        }
        n();
        this.k.removeMessages(10);
        this.k.sendEmptyMessageDelayed(10, j);
        this.x = System.currentTimeMillis();
        if (i == 0) {
            this.ac = -1;
            this.k.sendEmptyMessage(100);
        } else if (i == 1) {
            this.ac = 0;
            this.k.sendEmptyMessage(102);
        } else if (i == 2) {
            this.ac = 1;
            this.k.sendEmptyMessage(103);
        }
        dyg.e(false, "SoftApOuthManager", "startSoftApAuth begin staff authStep:", Integer.valueOf(i), " mWorkFlow:", Integer.valueOf(this.ac));
        ech echVar = new ech("modeDevAp");
        this.t = echVar;
        echVar.c();
    }

    private void n() {
        if (this.h == null) {
            dyg.c(false, "SoftApOuthManager", "regWifiStateBroadCast activity NULL");
            return;
        }
        if (this.q) {
            dyg.c(false, "SoftApOuthManager", "Already regWifiStateBroadCast");
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.setPriority(800);
        this.h.registerReceiver(e, intentFilter);
        this.q = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(NetworkInfo networkInfo, Context context) {
        if (networkInfo == null || context == null) {
            return;
        }
        if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
            if (context.getSystemService("wifi") instanceof WifiManager) {
                e((WifiManager) context.getSystemService("wifi"));
                return;
            }
            return;
        }
        dyg.e(false, "SoftApOuthManager", "checkWifiConnectDevice : disconnected");
    }

    static final class a extends BaseCallback<ecv> {
        @Override // com.huawei.health.device.wifi.interfaces.BaseCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onStatus(ecv ecvVar, int i) {
        }

        a(ecv ecvVar) {
            super(ecvVar);
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ecv ecvVar, Object obj) {
            dyg.a(false, "SoftApOuthManager", " SoftApDeviceCallback onSuccess:");
            if (ecvVar != null) {
                if (ecvVar.k == null || ecvVar.ac != 1) {
                    return;
                }
                ecvVar.k.removeMessages(6);
                ecvVar.k.removeMessages(1000);
                ecvVar.k.removeMessages(4);
                ecvVar.k.sendEmptyMessage(5);
                return;
            }
            dyg.a(false, "SoftApOuthManager", " SoftApDeviceCallback onSuccess obj is null");
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onFailure(ecv ecvVar, int i) {
            dyg.a(false, "SoftApOuthManager", " SoftApDeviceCallback onFailure:");
            if (ecvVar != null) {
                if (ecvVar.k == null || ecvVar.ac != 1) {
                    return;
                }
                ecvVar.k.removeMessages(1000);
                ecvVar.k.removeMessages(6);
                ecvVar.k.sendEmptyMessage(6);
                return;
            }
            dyg.a(false, "SoftApOuthManager", " SoftApDeviceCallback onFailure obj is null");
        }
    }

    static final class d extends BaseCallback<ecv> {
        @Override // com.huawei.health.device.wifi.interfaces.BaseCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onStatus(ecv ecvVar, int i) {
        }

        d(ecv ecvVar) {
            super(ecvVar);
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ecv ecvVar, Object obj) {
            if (ecvVar == null) {
                dyg.c(false, "SoftApOuthManager", "onGetVerifyCodeSuccess SoftApAuthManager is null");
                return;
            }
            Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
            if (bundle == null) {
                dyg.c(false, "SoftApOuthManager", "onGetVerifyCodeSuccess bundle is null");
                return;
            }
            RegisterInfo registerInfo = bundle.getParcelable("device_register_verifycode") instanceof RegisterInfo ? (RegisterInfo) bundle.getParcelable("device_register_verifycode") : null;
            if (registerInfo != null) {
                if (ecvVar.k == null || ecvVar.ac != 0) {
                    dyg.c(false, "SoftApOuthManager", "onGetVerifyCodeSuccess mHandler is null");
                    return;
                }
                dyg.c(false, "SoftApOuthManager", "onGetVerifyCodeSuccess success");
                ebi ebiVar = new ebi();
                ebiVar.d(registerInfo.getDevId());
                ecvVar.f32761a.c(registerInfo.getDevId());
                ebiVar.c(registerInfo.getVerifyCode());
                ebiVar.e(GRSManager.c(ecvVar.h).getUrl("healthAPPToDeviceUrl"));
                ebiVar.a(registerInfo.getPsk());
                dyg.e(false, "SoftApOuthManager", " softApRegisterInfo = ", ebiVar);
                ecvVar.y = new Gson().toJson(ebiVar, ebi.class);
                ecvVar.u = System.currentTimeMillis();
                ecvVar.k.removeMessages(0);
                ecvVar.k.sendEmptyMessage(0);
                return;
            }
            dyg.c(false, "SoftApOuthManager", "onGetVerifyCodeSuccess entity is null");
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onFailure(ecv ecvVar, int i) {
            if (ecvVar != null) {
                if (ecvVar.k != null) {
                    ecvVar.k.removeMessages(1);
                    ecvVar.k.sendEmptyMessage(1);
                    return;
                } else {
                    dyg.c(false, "SoftApOuthManager", "onGetVerify onFailure mHandler is null");
                    return;
                }
            }
            dyg.c(false, "SoftApOuthManager", "onGetVerify onFailure SoftApAuthManager is null");
        }
    }

    static class b extends StaticHandler<ecv> {
        b(ecv ecvVar) {
            super(ecvVar);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessage(ecv ecvVar, Message message) {
            if (ecvVar != null && message != null) {
                if (ecvVar.ac == 999) {
                    dyg.c(false, "SoftApOuthManager", "SoftApHandler this object has release all, ignore this msg");
                    return;
                }
                int i = message.what;
                if (i == 0 || i == 1 || i == 100) {
                    ecvVar.d(message.what);
                    return;
                }
                if (i != 1000) {
                    if (i != 1002) {
                        switch (i) {
                            case 4:
                            case 5:
                            case 6:
                                break;
                            case 7:
                            case 8:
                            case 9:
                                break;
                            case 10:
                                dyg.e(false, "SoftApOuthManager", "SoftApHandler MSG_WHOLE_TIME_OUT");
                                removeMessages(1000);
                                removeMessages(1002);
                                ecvVar.d();
                                break;
                            default:
                                switch (i) {
                                    case 102:
                                        break;
                                    case 103:
                                    case 104:
                                        break;
                                    default:
                                        dyg.c(false, "SoftApOuthManager", "SoftApHandler default msg:", Integer.valueOf(message.what));
                                        break;
                                }
                                break;
                        }
                        return;
                    }
                    ecvVar.c(message);
                    return;
                }
                ecvVar.e(message.what);
                return;
            }
            dyg.c(false, "SoftApOuthManager", "SoftApHandler this object is null or msg is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        dyg.e(false, "SoftApOuthManager", "handleMessageWaitDeviceOnline msg:", message, "mWorkFlow:", Integer.valueOf(this.ac));
        int i = message.what;
        if (i == 7) {
            dyg.e(false, "SoftApOuthManager", " connect wifi success");
            return;
        }
        if (i == 8) {
            dyg.e(false, "SoftApOuthManager", " connect wifi fail");
            return;
        }
        if (i == 9) {
            dyg.a(false, "SoftApOuthManager", "DEVICE REGISTER SUCCESS!");
            this.ac = 100;
            this.k.removeMessages(1000);
            this.k.removeMessages(1002);
            this.k.removeMessages(10);
            a(message.obj);
            return;
        }
        if (i == 103) {
            p();
            return;
        }
        if (i != 104) {
            if (i == 1002) {
                j();
                return;
            } else {
                dyg.d(false, "SoftApOuthManager", " handleMessageSwitchToRouter never go here");
                return;
            }
        }
        if (this.ac == 2 || this.ac == 3) {
            this.ac = 3;
            this.k.sendEmptyMessageDelayed(1002, 1000L);
            this.n = 0;
            return;
        }
        dyg.e(false, "SoftApOuthManager", " MSG_START_GET_ONLINE_DEVICE_INFO: ERR ", Integer.valueOf(this.ac));
    }

    private void p() {
        this.k.removeMessages(1000);
        if (this.ac == 1) {
            this.ac = 2;
            this.k.sendEmptyMessage(104);
            d(ExceptionCode.FILE_NO_EXIST, (Object) null);
            d(false);
        }
        if (this.ac == 2 || this.ac == 3) {
            this.k.removeMessages(1002);
            this.k.sendEmptyMessage(1002);
        } else {
            dyg.e(false, "SoftApOuthManager", " MSG_START_SWITCH_TO_ROUTER, ERR:", Integer.valueOf(this.ac));
        }
    }

    private void j() {
        if (this.ac == 3 || this.ac == 2) {
            dyg.e(false, "SoftApOuthManager", " MSG_GET_DEVICE_INFO_FROM get info:", Integer.valueOf(this.n));
            if (this.n > 5) {
                f();
                this.n = 0;
            }
            if (!k()) {
                dyg.e(false, "SoftApOuthManager", " MSG_GET_DEVICE_INFO_FROM reconnect preWiFiAP");
                d(true);
            }
            this.n++;
            this.k.sendEmptyMessageDelayed(1002, 1000L);
            return;
        }
        dyg.c(false, "SoftApOuthManager", " MSG_GET_DEVICE_INFO_FROM ERR", Integer.valueOf(this.ac));
    }

    private boolean d(boolean z) {
        LogUtil.d("SoftApOuthManager", "connectWiFi");
        if (this.s < 0) {
            this.s = ecs.e(this.v, this.i, this.f, f32759b);
        }
        int i = this.s;
        if (i < 0) {
            LogUtil.d("SoftApOuthManager", "connectWiFi false: ", Integer.valueOf(i));
            return false;
        }
        if (z) {
            return ecs.c(this.v, i);
        }
        return ecs.a(this.v, i);
    }

    private void f() {
        if (!TextUtils.isEmpty(this.f32761a.e())) {
            WifiDeviceGetWifiDeviceInfoReq wifiDeviceGetWifiDeviceInfoReq = new WifiDeviceGetWifiDeviceInfoReq();
            wifiDeviceGetWifiDeviceInfoReq.setDevId(this.f32761a.e());
            lqo.b(this.h).b(wifiDeviceGetWifiDeviceInfoReq, new ICloudOperationResult<WifiDeviceGetWifiDeviceInfoRsp>() { // from class: ecv.2
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void operationResult(WifiDeviceGetWifiDeviceInfoRsp wifiDeviceGetWifiDeviceInfoRsp, String str, boolean z) {
                    ecv.this.b(wifiDeviceGetWifiDeviceInfoRsp, z);
                }
            });
            return;
        }
        dyg.c(false, "SoftApOuthManager", "getAuthDeviceFromCloud mAddDeviceInfo DevId is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(WifiDeviceGetWifiDeviceInfoRsp wifiDeviceGetWifiDeviceInfoRsp, boolean z) {
        int iIntValue;
        String resultDesc;
        if (!z) {
            if (wifiDeviceGetWifiDeviceInfoRsp == null) {
                iIntValue = Constants.CODE_UNKNOWN_ERROR;
                resultDesc = "unknown error";
            } else {
                iIntValue = wifiDeviceGetWifiDeviceInfoRsp.getResultCode().intValue();
                resultDesc = wifiDeviceGetWifiDeviceInfoRsp.getResultDesc();
            }
            dyg.e(false, "SoftApOuthManager", "getAuthDeviceFromCloud() getSingleDevice errCode = ", Integer.valueOf(iIntValue), ",resultDesc:", resultDesc);
            return;
        }
        if (wifiDeviceGetWifiDeviceInfoRsp == null || wifiDeviceGetWifiDeviceInfoRsp.getDeviceDetailInfo() == null) {
            dyg.a(false, "SoftApOuthManager", "getAuthDeviceFromCloud reg device success but rsp is null");
            return;
        }
        Message messageObtain = Message.obtain();
        eby ebyVar = new eby();
        ebyVar.c(wifiDeviceGetWifiDeviceInfoRsp.getDeviceDetailInfo());
        messageObtain.obj = ebyVar;
        messageObtain.what = 9;
        this.k.sendMessage(messageObtain);
        dyg.a(false, "SoftApOuthManager", "getAuthDeviceFromCloud reg device success :", wifiDeviceGetWifiDeviceInfoRsp.toString());
    }

    private boolean k() {
        String ssid = ((WifiManager) this.h.getSystemService("wifi")).getConnectionInfo().getSSID();
        if (!TextUtils.isEmpty(ssid)) {
            if (ssid.startsWith("\"") && ssid.endsWith("\"") && TextUtils.equals(ssid.substring(1, ssid.length() - 1), this.i)) {
                return true;
            }
        } else {
            dyg.e(false, "SoftApOuthManager", "isConnectRouter CONNECTIVITY_ACTION: ", ssid);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        dyg.e(false, "SoftApOuthManager", "handleMessageGetRegisterInfo msg:", Integer.valueOf(i), " mWorkFlow:", Integer.valueOf(this.ac));
        if (i == 0) {
            if (this.ac == 0) {
                this.k.sendEmptyMessage(102);
                return;
            } else {
                dyg.e(false, "SoftApOuthManager", " MSG_GET_REGISTER_INFO_SUCCESS ERR: ", Integer.valueOf(this.ac));
                return;
            }
        }
        if (i != 1) {
            if (i == 100) {
                this.ac = 0;
                this.o = 0;
                i();
                return;
            }
            dyg.e(false, "SoftApOuthManager", " handleMessageGetRegisterInfo never go here");
            return;
        }
        this.o++;
        dyg.e(false, "SoftApOuthManager", "handleMessageGetRegisterInfo: ", Integer.valueOf(this.ac), " count:", Integer.valueOf(this.o));
        if (this.o > 3) {
            a(1102, (Object) null);
        } else {
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        dyg.e(false, "SoftApOuthManager", "handleMessageSendMsgToDevice msg: ", Integer.valueOf(i), " mWorkFlow", Integer.valueOf(this.ac));
        if (i == 4) {
            h();
            return;
        }
        if (i == 5) {
            if (this.ac == 1) {
                dyg.e(false, "SoftApOuthManager", " MSG_SEND_MSG_TO_DEVICE_SUCCESS: success");
                c();
                this.k.sendEmptyMessage(103);
                return;
            }
            dyg.e(false, "SoftApOuthManager", " MSG_SEND_MSG_TO_DEVICE_SUCCESS: err", Integer.valueOf(this.ac));
            return;
        }
        if (i == 6) {
            if (this.ac == 1) {
                dyg.e(false, "SoftApOuthManager", " MSG_SEND_MSG_TO_DEVICE_FAILURE:");
                c();
                this.k.sendEmptyMessage(103);
                return;
            }
            dyg.e(false, "SoftApOuthManager", " MSG_SEND_MSG_TO_DEVICE_FAILURE: err ", Integer.valueOf(this.ac));
            return;
        }
        if (i == 102) {
            m();
            return;
        }
        if (i == 1000) {
            if (this.ac == 1) {
                l();
                this.k.sendEmptyMessageDelayed(1000, 1000L);
                if (this.r) {
                    return;
                }
                this.r = true;
                a();
                return;
            }
            dyg.c(false, "SoftApOuthManager", " MSG_CONNECT_DEVICE_TIMER ERR:", Integer.valueOf(this.ac));
            return;
        }
        dyg.e(false, "SoftApOuthManager", "handleMessageSendMsgToDevice never go here");
    }

    private void m() {
        if (this.ac == -1 || this.ac == 0) {
            this.ac = 1;
            d(ExceptionCode.DOWNLOAD_RENAME_ERROR, (Object) null);
            e(false);
            this.r = false;
            s();
            if (this.m < 0) {
                LogUtil.e("SoftApOuthManager", "handleMessageSendMsgToDevice device addNetWork == -1");
                this.k.removeMessages(4);
                this.k.sendEmptyMessageDelayed(4, 5000L);
            } else {
                this.k.removeMessages(4);
                this.k.sendEmptyMessageDelayed(4, 50000L);
                this.k.removeMessages(6);
                this.k.sendEmptyMessageDelayed(6, 55000L);
            }
        }
        if (this.ac == 1) {
            this.k.sendEmptyMessageDelayed(1000, 1000L);
        } else {
            dyg.a(false, "SoftApOuthManager", " MSG_START_SEND_MSG_TO_DEV nodeal state:", Integer.valueOf(this.ac));
        }
    }

    private void h() {
        if (this.ac == 1) {
            this.k.removeMessages(6);
            if (f32760c) {
                dyg.e(false, "SoftApOuthManager", "isConnected so successed!");
                c();
                this.k.sendEmptyMessage(103);
                return;
            } else {
                dyg.e(false, "SoftApOuthManager", "isConnected false ,goto manual");
                c();
                a(1103, (Object) null);
                g();
                return;
            }
        }
        dyg.c(false, "SoftApOuthManager", " MSG_CONNECT_DEVICE_FAILURE ERR:", Integer.valueOf(this.ac));
    }

    public void d() {
        ech echVar = this.t;
        if (echVar != null) {
            echVar.e("networkTimeout", String.valueOf(ExceptionCode.CHECK_FILE_HASH_FAILED));
        }
        b();
        a(ExceptionCode.CHECK_FILE_HASH_FAILED, (Object) null);
    }

    private void a(Object obj) {
        dyg.a(false, "SoftApOuthManager", " registerSuccess()");
        ech echVar = this.t;
        if (echVar != null) {
            echVar.c("networkSuccess");
        }
        b();
        a(1100, obj);
    }

    private void g() {
        long jCurrentTimeMillis = 150000 - (System.currentTimeMillis() - this.x);
        dyg.a(false, "SoftApOuthManager", " connectDeviceApFail() left time:", Long.valueOf(jCurrentTimeMillis));
        if (jCurrentTimeMillis <= 10000) {
            this.k.removeMessages(10);
            this.k.sendEmptyMessage(10);
        } else {
            ech echVar = this.t;
            if (echVar != null) {
                echVar.e("authFail", String.valueOf(1103));
            }
            b();
        }
    }

    public void b() {
        q();
        if (this.k != null) {
            this.ac = 999;
            this.k.removeCallbacksAndMessages(null);
        }
    }

    private void q() {
        Context context;
        if (this.q && (context = this.h) != null) {
            context.unregisterReceiver(e);
            this.q = false;
        } else {
            dyg.c(false, "SoftApOuthManager", "unRegisterWifiStateBroadCast mIsHasRegBroadcast is false");
        }
    }

    public void a() {
        dyg.a(false, "SoftApOuthManager", " startDeviceApConnection() mAuthName = ", this.i, " mAuthPazzword = ", dyg.b(this.f), " mAddDeviceInfo = ", this.f32761a, " mRegisterMessage = ", dyg.b(this.y));
        ebd ebdVar = new ebd();
        ebdVar.d(this.i);
        ebdVar.c(this.f);
        ebdVar.e(this.f32761a.d());
        ebdVar.d(this.f32761a.b());
        ebdVar.b(this.f32761a.i());
        c();
        eay eayVar = new eay(ebdVar, this.y, this.j);
        this.l = eayVar;
        eayVar.d(this.h);
    }

    public void c() {
        dyg.a(false, "SoftApOuthManager", " stopDeviceApConnection() in");
        eay eayVar = this.l;
        if (eayVar != null) {
            eayVar.d();
            this.l = null;
        }
    }

    private void d(int i, Object obj) {
        synchronized (this.p) {
            CommBaseCallbackInterface commBaseCallbackInterface = this.g;
            if (commBaseCallbackInterface != null) {
                commBaseCallbackInterface.onResult(i, "work_flow", obj);
            } else {
                dyg.c(false, "SoftApOuthManager", "sendWorkFlowMsg callback is null");
            }
        }
    }

    private void a(int i, Object obj) {
        synchronized (this.p) {
            CommBaseCallbackInterface commBaseCallbackInterface = this.g;
            if (commBaseCallbackInterface != null) {
                commBaseCallbackInterface.onResult(i, "error_code", obj);
            } else {
                dyg.c(false, "SoftApOuthManager", "sendResultMsg callback is null");
            }
        }
    }

    private void i() {
        dyg.e(false, "SoftApOuthManager", " getDeviceRegisterInfo() enter");
        d(1111, (Object) null);
        DeviceRegisterManager.e(this.h).e(this.f32761a, DeviceRegisterManager.RegisterMode.REGISTER_SOFTAP, this.w);
    }

    private boolean s() {
        dyg.a(false, "SoftApOuthManager", " startConnectDeviceAp() enter");
        int iD = ecs.d(this.v, f32759b);
        this.m = iD;
        if (iD < 0) {
            return ecs.a(this.v, iD);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            return ecs.a(this.v, this.m);
        }
        dyg.e(false, "SoftApOuthManager", "startConnectDeviceAp false: ", Integer.valueOf(this.m));
        return false;
    }

    private void l() {
        dyg.a(false, "SoftApOuthManager", "reconnectDeviceAp：", Integer.valueOf(this.m));
        if (this.m < 0) {
            this.m = ecs.d(this.v, f32759b);
        }
        int i = this.m;
        if (i >= 0) {
            ecs.c(this.v, i);
        } else {
            dyg.e(false, "SoftApOuthManager", "reconnectDeviceAp false: ", Integer.valueOf(i));
        }
    }

    public static boolean e(WifiManager wifiManager) {
        if (wifiManager == null) {
            dyg.e(false, "SoftApOuthManager", "isWifiConnectDevice wifi is null");
            return false;
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        String ssid = connectionInfo.getSSID();
        String strE = ecj.e(connectionInfo.getBSSID());
        if (TextUtils.isEmpty(ssid) || ssid.length() <= 30) {
            dyg.e(false, "SoftApOuthManager", "isWifiConnectDevice : ", connectionInfo.getSSID());
        } else if (ssid.startsWith("\"") && ssid.endsWith("\"") && TextUtils.equals(ssid.substring(1, ssid.length() - 1), f32759b)) {
            f32760c = true;
        }
        if (!TextUtils.isEmpty(strE) && strE.equalsIgnoreCase(d)) {
            dyg.e(false, "SoftApOuthManager", "isWifiConnectDevice : MAC equal");
            f32760c = true;
        } else {
            dyg.e(false, "SoftApOuthManager", "isWifiConnectDevice : Bssid:", dyg.b(strE), " devMac:", dyg.b(d));
        }
        return f32760c;
    }
}
