package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.health.device.wifi.interfaces.BaseCallback;
import com.huawei.health.device.wifi.interfaces.BaseCallbackInterface;
import com.huawei.health.device.wifi.interfaces.CommBaseCallback;
import com.huawei.health.device.wifi.interfaces.DeviceCallBack;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.device.wifi.manager.DeviceRegisterManager;
import com.huawei.health.ecologydevice.connectivity.ScanFilter;
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class ecq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ecq f32748c;
    private static final Object d = new Object();
    private DeviceCallBack e;
    private ebv f;
    private b g;
    private WeakReference<Context> h;
    private e i;
    private ebf j;
    private ScanFilter k;
    private DeviceRegisterManager m;
    private String o;
    private String p;
    private d q;
    private ecx r;
    private ecv s;
    private String t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32750b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32749a = 0;
    private int w = 0;
    private DeviceRegisterManager.RegisterMode l = DeviceRegisterManager.RegisterMode.REGISTER_NORFORM;
    private BaseCallbackInterface n = new BaseCallbackInterface() { // from class: ecq.4
        @Override // com.huawei.health.device.wifi.interfaces.BaseCallbackInterface
        public void onStatus(int i) {
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallbackInterface
        public void onSuccess(Object obj) {
            ecq.this.b(obj);
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallbackInterface
        public void onFailure(int i) {
            dyg.c(false, "AddDeviceManager", "mRegisterCallBack error:", Integer.valueOf(i));
            ecq.this.a(i);
        }
    };

    private ecq(Context context) {
        this.h = new WeakReference<>(context);
        HandlerThread handlerThread = new HandlerThread("config_network");
        handlerThread.start();
        this.g = new b(this, handlerThread.getLooper());
    }

    public static ecq c(Context context) {
        if (f32748c == null) {
            synchronized (d) {
                if (f32748c == null) {
                    f32748c = new ecq(context);
                }
            }
        }
        return f32748c;
    }

    static class b extends StaticHandler<ecq> {
        b(ecq ecqVar, Looper looper) {
            super(ecqVar, looper);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessage(ecq ecqVar, Message message) {
            if (ecqVar == null) {
                dyg.c(false, "AddDeviceManager", "DeviceHandler object is null");
                return;
            }
            if (message == null) {
                dyg.c(false, "AddDeviceManager", "DeviceHandler msg is null");
                return;
            }
            dyg.a(false, "AddDeviceManager", "handleMessage msg is ", Integer.valueOf(message.what));
            if (message.what < 10) {
                ecqVar.d(message);
            } else if (message.what > 10) {
                ecqVar.e(message);
            } else {
                dyg.a(false, "AddDeviceManager", "handleMessage msg is error");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        switch (message.what) {
            case 1:
            case 4:
                l();
                break;
            case 2:
                q();
                break;
            case 3:
                k();
                break;
            case 5:
                this.g.sendEmptyMessage(7);
                break;
            case 6:
                j();
                break;
            case 7:
                h();
                break;
            default:
                dyg.a(false, "AddDeviceManager", "startConfigNetWork what is error：", Integer.valueOf(message.what));
                break;
        }
    }

    private void k() {
        if (m()) {
            t();
        }
    }

    private void e(int i) {
        dyg.a(false, "AddDeviceManager", "initConfigMode configMode：", Integer.valueOf(i));
        if (i < 0 || i > 4) {
            return;
        }
        this.f32750b = i;
    }

    public void a(ebv ebvVar, DeviceCallBack deviceCallBack) {
        b(DeviceRegisterManager.RegisterMode.REGISTER_NORFORM, ebvVar, deviceCallBack);
    }

    public void b(DeviceRegisterManager.RegisterMode registerMode, ebv ebvVar, DeviceCallBack deviceCallBack) {
        this.f = ebvVar;
        e(3);
        synchronized (d) {
            this.e = deviceCallBack;
        }
        b bVar = this.g;
        if (bVar != null) {
            bVar.sendEmptyMessage(this.f32750b);
        }
        this.l = registerMode;
    }

    private boolean m() {
        if (this.f != null) {
            return true;
        }
        a(102);
        return false;
    }

    private boolean e(String str) {
        ebv ebvVar = this.f;
        if (ebvVar == null) {
            dyg.e(false, "AddDeviceManager", "isPatternMatching isPatternMatching is null ");
            return false;
        }
        String strH = ebvVar.h();
        dyg.e(false, "AddDeviceManager", "isPatternMatching deviceType : ", strH);
        if (TextUtils.equals(str, strH)) {
            return true;
        }
        dyg.c(false, "AddDeviceManager", "isPatternMatching deviceType is error : ", strH, " mode:", str);
        return false;
    }

    public void a(int i, String str, String str2, ebv ebvVar, DeviceCallBack deviceCallBack) {
        b bVar;
        this.p = str;
        this.t = str2;
        this.f = ebvVar;
        synchronized (d) {
            this.e = deviceCallBack;
        }
        e(i);
        if (!n() || (bVar = this.g) == null) {
            return;
        }
        bVar.sendEmptyMessage(i);
    }

    public void e(String str, String str2, ScanFilter scanFilter, String str3, DeviceCallBack deviceCallBack) {
        b bVar;
        this.p = str;
        this.t = str2;
        this.k = scanFilter;
        this.o = str3;
        synchronized (d) {
            this.e = deviceCallBack;
        }
        e(4);
        if (!n() || (bVar = this.g) == null) {
            return;
        }
        bVar.sendEmptyMessage(this.f32750b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        synchronized (d) {
            DeviceCallBack deviceCallBack = this.e;
            if (deviceCallBack != null) {
                deviceCallBack.onFailure(this.f32750b, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        synchronized (d) {
            DeviceCallBack deviceCallBack = this.e;
            if (deviceCallBack != null) {
                deviceCallBack.onStatus(this.f32750b, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj) {
        synchronized (d) {
            DeviceCallBack deviceCallBack = this.e;
            if (deviceCallBack != null) {
                deviceCallBack.onSuccess(this.f32750b, obj);
            }
        }
    }

    public void e() {
        int i = this.f32750b;
        if (i == 2) {
            f();
        } else if (i == 1 || i == 4) {
            i();
            if (this.w == 3) {
                b();
            }
        } else if (i == 3) {
            b();
        } else {
            dyg.a(false, "AddDeviceManager", "destroy error mode");
        }
        g();
    }

    private void g() {
        this.f32750b = 1;
        this.f32749a = 0;
        this.w = 0;
        synchronized (d) {
            this.e = null;
        }
    }

    private void f() {
        if (this.s != null) {
            c();
            this.s = null;
        }
    }

    private void i() {
        if (this.j != null) {
            this.g.removeCallbacksAndMessages(null);
            d();
            this.j = null;
        }
    }

    private boolean n() {
        int i = this.f32750b;
        if (i != 1 && i != 2 && i != 4) {
            dyg.a(false, "AddDeviceManager", "isStartConfig configMode error ", Integer.valueOf(i));
            a(101);
            return false;
        }
        if (TextUtils.isEmpty(this.p) || this.t == null) {
            dyg.a(false, "AddDeviceManager", "isStartConfig wifiName:", Boolean.valueOf(TextUtils.isEmpty(this.p)), " wifiPassword:", Boolean.valueOf(this.t == null));
            a(102);
            return false;
        }
        if (this.f32750b == 4) {
            if (this.k == null) {
                dyg.a(false, "AddDeviceManager", "isStartConfig mScanFilter null:");
                a(102);
                return false;
            }
            if (TextUtils.isEmpty(this.o)) {
                dyg.a(false, "AddDeviceManager", "isStartConfig productID is null");
                a(102);
                return false;
            }
        } else if (this.f == null) {
            dyg.a(false, "AddDeviceManager", "isStartConfig mDeviceInfo is null");
            a(102);
            return false;
        }
        if (ecs.h(this.h.get())) {
            return true;
        }
        dyg.a(false, "AddDeviceManager", "isStartConfig wifi is not connected");
        a(103);
        return false;
    }

    private void q() {
        dyg.e(false, "AddDeviceManager", "startSoftAp");
        if (e("softap")) {
            this.w = 1;
            if (this.h.get() == null) {
                LogUtil.j("AddDeviceManager", "context is null");
                return;
            }
            ecv ecvVarD = ecv.d(this.h.get());
            this.s = ecvVarD;
            if (ecvVarD == null) {
                LogUtil.j("AddDeviceManager", "mSoftApManager is null");
                return;
            } else {
                ecvVarD.e(this.f, this.p, this.t, new a(this));
                return;
            }
        }
        a(101);
    }

    public void c() {
        ecv ecvVar = this.s;
        if (ecvVar != null) {
            ecvVar.b();
        }
    }

    static class a extends CommBaseCallback<ecq> {
        a(ecq ecqVar) {
            super(ecqVar);
        }

        @Override // com.huawei.health.device.wifi.interfaces.CommBaseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(ecq ecqVar, int i, String str, Object obj) {
            if (ecqVar != null) {
                if (ecqVar.w == 0) {
                    dyg.c(false, "AddDeviceManager", "AddDeviceManager is null or Config NetWork is not running");
                    return;
                }
                if ("error_code".equals(str)) {
                    ecqVar.b(i, obj);
                    return;
                } else if ("work_flow".equals(str)) {
                    ecqVar.d(i);
                    return;
                } else {
                    dyg.c(false, "AddDeviceManager", "SoftApCallBack error");
                    return;
                }
            }
            dyg.c(false, "AddDeviceManager", "SoftApCallBack obj is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, Object obj) {
        switch (i) {
            case 1100:
                b(obj);
                break;
            case 1101:
                dyg.c(false, "AddDeviceManager", "Ap device ssid is null");
                break;
            case 1102:
            case 1103:
            case ExceptionCode.CHECK_FILE_HASH_FAILED /* 1104 */:
                a(i);
                break;
            default:
                dyg.d(false, "AddDeviceManager", "softApErrorCode error is other ", Integer.valueOf(i));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        int i = message.what;
        if (i == 11) {
            o();
        } else if (i == 13) {
            d(message.arg1);
        } else {
            dyg.d(false, "AddDeviceManager", "handleMultMessage msg is error :", Integer.valueOf(message.what));
        }
    }

    private boolean a() {
        if (ebh.d(this.h.get())) {
            return true;
        }
        a(110);
        dyg.c(false, "AddDeviceManager", "checkWiFiConfig WiFi config has Configuration information");
        return false;
    }

    private void l() {
        dyg.a(false, "AddDeviceManager", "initMulticast");
        if (a()) {
            this.i = new e(this);
            this.q = new d(this);
            this.r = ecx.d(this.h.get());
            if (this.f32750b == 4) {
                this.g.sendEmptyMessage(6);
                return;
            } else {
                this.g.sendEmptyMessage(7);
                return;
            }
        }
        dyg.d(false, "AddDeviceManager", "initMulticast start multcast fail");
    }

    public void d() {
        ebf ebfVar = this.j;
        if (ebfVar != null) {
            ebfVar.d();
            this.r.b();
            Context context = this.h.get();
            if (context != null) {
                ebh.a(context);
            }
        }
    }

    private void r() {
        ebf ebfVar = this.j;
        if (ebfVar != null) {
            ebfVar.c();
        }
    }

    private void p() {
        ebf ebfVar = this.j;
        if (ebfVar != null) {
            ebfVar.d();
        }
    }

    private void j() {
        dyg.a(false, "AddDeviceManager", "doStartHandMulticast");
        ebv ebvVar = new ebv();
        this.f = ebvVar;
        ebvVar.h("Hi11117K5B000000000000000009CB55");
        this.f.j(this.o);
        this.f.i("wifiap");
        this.f.c(eax.a(this.h.get()).b("Hi11117K5B000000000000000009CB55"));
        this.f.e("9CB55");
        h();
    }

    private void h() {
        if (this.f == null) {
            dyg.a(false, "AddDeviceManager", "doStartMulticast mDeviceInfo is null");
            return;
        }
        if (e("wifiap")) {
            this.w = 2;
            this.q.e();
            ebd ebdVar = new ebd();
            ebdVar.d(this.p);
            ebdVar.c(this.t);
            ebdVar.e(this.f.d());
            ebdVar.d(this.f.b());
            ebdVar.b(this.f.i());
            ebdVar.d(this.k);
            ebf ebfVar = new ebf(this.h.get(), ebdVar, this.i);
            this.j = ebfVar;
            ebfVar.c(this.f32749a);
            this.j.e(this.f32750b);
            this.j.e();
            return;
        }
        a(101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        ecx ecxVar = this.r;
        if (ecxVar != null) {
            ecxVar.b();
        }
    }

    static final class e extends BaseCallback<ecq> {
        e(ecq ecqVar) {
            super(ecqVar);
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ecq ecqVar, Object obj) {
            if (ecqVar == null || ecqVar.f == null) {
                return;
            }
            dyg.a(false, "AddDeviceManager", "MultCastCallback: onSuccess");
            if (obj != null) {
                ecqVar.f.a(obj.toString());
            }
            ecqVar.w();
            ecqVar.d();
            ecqVar.d(2212);
            ecqVar.g.sendEmptyMessage(3);
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFailure(ecq ecqVar, int i) {
            dyg.a(false, "AddDeviceManager", "MultCastCallback: onFailure ", Integer.valueOf(i));
            if (ecqVar != null) {
                ecqVar.w();
                ecqVar.a(2115);
            }
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onStatus(ecq ecqVar, int i) {
            dyg.a(false, "AddDeviceManager", "MultCastCallback: onStatus", Integer.valueOf(i));
            if (ecqVar != null) {
                Message messageObtainMessage = ecqVar.g.obtainMessage();
                messageObtainMessage.what = 13;
                messageObtainMessage.arg1 = i;
                ecqVar.g.sendMessage(messageObtainMessage);
                if (i != 2210 || Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                ecqVar.s();
                dyg.e(false, "AddDeviceManager", "MultCastCallback: onStatus");
                ecqVar.g.sendEmptyMessage(11);
            }
        }
    }

    private void o() {
        ecx ecxVar = this.r;
        if (ecxVar != null) {
            ecxVar.b(this.f, this.q);
        } else {
            dyg.c(false, "AddDeviceManager", "scanSelectDevice mScanManager is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        Context context = this.h.get();
        if (context != null) {
            Object systemService = context.getApplicationContext().getSystemService("wifi");
            if (systemService instanceof WifiManager) {
                ((WifiManager) systemService).startScan();
            } else {
                LogUtil.j("AddDeviceManager", "wifiManagerObj not instanceof WifiManager");
            }
        }
    }

    static final class d extends BaseCallback<ecq> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f32752b;

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onStatus(ecq ecqVar, int i) {
        }

        d(ecq ecqVar) {
            super(ecqVar);
            this.f32752b = 0;
        }

        public void e() {
            this.f32752b = 0;
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ecq ecqVar, Object obj) {
            if (ecqVar == null) {
                return;
            }
            if (obj != null) {
                dyg.a(false, "AddDeviceManager", "ScanSelectDeviceCallback: onSuccess status", obj);
                ecqVar.b(obj.toString());
            }
            int i = this.f32752b + 1;
            this.f32752b = i;
            if (i < 16) {
                return;
            }
            if (obj == null || "".equals(obj)) {
                dyg.d(false, "AddDeviceManager", "ScanSelectDeviceCallback: The specified WiFi is not scanned");
                return;
            }
            dyg.e(false, "AddDeviceManager", "ScanSelectDeviceCallback: Scan to specified WiFi");
            e();
            ecqVar.w();
            ecqVar.d();
            ecqVar.a(2114);
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFailure(ecq ecqVar, int i) {
            dyg.a(false, "AddDeviceManager", "ScanSelectDeviceCallback: onFailure");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    public void b(String str) {
        byte b2;
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            switch (str) {
                case "G":
                    b2 = 0;
                    break;
                case "H":
                    b2 = 1;
                    break;
                case "I":
                    b2 = 2;
                    break;
                case "J":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                dyg.e(false, "AddDeviceManager", "Status :WiFi Password is error ", str);
                w();
                p();
                a(2109);
                return;
            }
            if (b2 == 1) {
                dyg.e(false, "AddDeviceManager", "Status :The device has received the WiFi name/password and is connecting to the router WiFi ", str);
                r();
                a(2112);
                return;
            } else {
                if (b2 == 2) {
                    dyg.e(false, "AddDeviceManager", "Status :Cannot connect to the router WiFi due to timeout ", str);
                    w();
                    p();
                    a(2110);
                    return;
                }
                if (b2 == 3) {
                    dyg.e(false, "AddDeviceManager", "Status :Unable to connect to the router's WiFi because the router SSID could not be found ", str);
                    w();
                    p();
                    a(2111);
                    return;
                }
                dyg.d(false, "AddDeviceManager", "sendMultStatus: other msg:", str);
                return;
            }
        }
        dyg.d(false, "AddDeviceManager", "sendMultStatus msg is null");
    }

    public void b() {
        DeviceRegisterManager deviceRegisterManager = this.m;
        if (deviceRegisterManager != null) {
            deviceRegisterManager.b();
            this.m = null;
        }
    }

    private void t() {
        this.w = 3;
        DeviceRegisterManager deviceRegisterManagerE = DeviceRegisterManager.e(this.h.get());
        this.m = deviceRegisterManagerE;
        deviceRegisterManagerE.e(this.f, this.l, this.n);
    }
}
