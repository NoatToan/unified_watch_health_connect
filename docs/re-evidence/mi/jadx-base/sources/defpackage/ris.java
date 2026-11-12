package defpackage;

import android.app.Application;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.amap.api.col.p0003sl.j1;
import com.amap.api.col.p0003sl.x0;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.AMapLocationQualityReport;
import com.amap.api.location.APSService;
import com.amap.api.location.IReGeoLocationCallback;
import com.amap.api.location.UmidtokenInfo;
import com.amap.api.services.core.AMapException;
import com.autonavi.aps.amapapi.utils.g;
import com.autonavi.aps.amapapi.utils.h;
import com.autonavi.aps.amapapi.utils.i;
import com.autonavi.aps.amapapi.utils.k;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.heartrate.finger.CustomizedFingerprintAcquiredInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class ris {
    public static boolean P = true;
    public static volatile boolean Q = false;
    public static boolean R = false;
    public static AtomicBoolean S = new AtomicBoolean(false);
    public IReGeoLocationCallback D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.autonavi.aps.amapapi.model.a f32581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f32582b;
    public f d;
    public ous g;
    public t0t p;
    public Intent s;
    public AMapLocationClientOption c = new AMapLocationClientOption();
    public axs e = null;
    public w2t f = null;
    public boolean h = false;
    public volatile boolean i = false;
    public ArrayList<AMapLocationListener> j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32583k = false;
    public boolean l = true;
    public boolean m = true;
    public boolean n = true;
    public boolean o = true;
    public Messenger q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Messenger f32584r = null;
    public int t = 0;
    public boolean u = true;
    public e v = null;
    public boolean w = false;
    public AMapLocationClientOption.AMapLocationMode x = AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
    public Object y = new Object();
    public i z = null;
    public boolean A = false;
    public ins B = null;
    public boolean C = false;
    public AMapLocationClientOption E = new AMapLocationClientOption();
    public dzs F = null;
    public String G = null;
    public ServiceConnection H = new b();
    public AMapLocationQualityReport I = null;
    public boolean J = false;
    public boolean K = false;
    public volatile boolean L = false;
    public d M = null;
    public String N = null;
    public boolean O = false;

    public static class a extends f7t {
        public final /* synthetic */ Context d;

        public a(Context context) {
            this.d = context;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            h0t.O();
            h0t.n(this.d);
            h0t.D(this.d);
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                ris.this.q = new Messenger(iBinder);
                ris.this.h = true;
                ris.this.A = true;
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "onServiceConnected");
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            ris risVar = ris.this;
            risVar.q = null;
            risVar.h = false;
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32586a;

        static {
            int[] iArr = new int[AMapLocationClientOption.AMapLocationMode.values().length];
            f32586a = iArr;
            try {
                iArr[AMapLocationClientOption.AMapLocationMode.Battery_Saving.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32586a[AMapLocationClientOption.AMapLocationMode.Device_Sensors.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32586a[AMapLocationClientOption.AMapLocationMode.Hight_Accuracy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v8 */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ?? r0 = 0;
            try {
                super.handleMessage(message);
                if (com.autonavi.aps.amapapi.utils.b.h) {
                }
                int i = message.what;
                if (i == 11) {
                    ris.this.k(message.getData());
                    return;
                }
                if (i == 12) {
                    ris.this.L(message);
                    return;
                }
                if (i == 16) {
                    ris.this.V(message);
                    return;
                }
                if (i == 1011) {
                    ris.this.f(14, null);
                    ris.this.n0();
                    return;
                }
                try {
                    switch (i) {
                        case 1002:
                            ris.this.X((AMapLocationListener) message.obj);
                            break;
                        case 1003:
                            ris.this.v0();
                            ris.this.f(13, null);
                            break;
                        case 1004:
                            ris.this.z0();
                            ris.this.f(14, null);
                            break;
                        case 1005:
                            ris.this.d0((AMapLocationListener) message.obj);
                            break;
                        default:
                            switch (i) {
                                case 1014:
                                    ris.this.l(message);
                                    break;
                                case 1015:
                                    ris risVar = ris.this;
                                    risVar.e.j(risVar.c);
                                    ris.this.g(1025, null, 300000L);
                                    break;
                                case 1016:
                                    if (k.m(ris.this.f32582b)) {
                                        com.autonavi.aps.amapapi.utils.e.a();
                                        ris.this.F0();
                                    } else if (!ris.this.e.t()) {
                                        ris.this.B0();
                                    } else {
                                        ris.this.g(1016, null, 1000L);
                                    }
                                    break;
                                case 1017:
                                    ris.this.e.b();
                                    ris.this.d(1025);
                                    break;
                                case 1018:
                                    ris risVar2 = ris.this;
                                    AMapLocationClientOption aMapLocationClientOption = (AMapLocationClientOption) message.obj;
                                    risVar2.c = aMapLocationClientOption;
                                    if (aMapLocationClientOption != null) {
                                        risVar2.G0();
                                    }
                                    break;
                                default:
                                    switch (i) {
                                        case 1023:
                                            ris.this.b0(message);
                                            break;
                                        case 1024:
                                            ris.this.h0(message);
                                            break;
                                        case 1025:
                                            if (ris.this.e.C()) {
                                                ris.this.e.b();
                                                ris risVar3 = ris.this;
                                                risVar3.e.j(risVar3.c);
                                            }
                                            ris.this.g(1025, null, 300000L);
                                            break;
                                        case 1026:
                                            com.autonavi.aps.amapapi.utils.e.b();
                                            ris.this.g.i(ris.this.c);
                                            break;
                                        case 1027:
                                            ris.this.g.b();
                                            break;
                                        case 1028:
                                            ris.this.r0((AMapLocation) message.obj);
                                            break;
                                        case 1029:
                                            Bundle bundle = new Bundle();
                                            bundle.putString("objHash", Integer.toString(System.identityHashCode(this)));
                                            ris.this.f(16, bundle);
                                            break;
                                        case 1030:
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString("objHash", Integer.toString(System.identityHashCode(this)));
                                            ris.this.f(17, bundle2);
                                            break;
                                        case CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_ANTI_SPOOF /* 1031 */:
                                            if (ris.this.c.isSysNetworkLocEnable()) {
                                                ris.this.f.i(ris.this.c);
                                                ris.this.g(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOW_BRIGHTNESS, null, 300000L);
                                            }
                                            break;
                                        case CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_DRY_FINGER /* 1032 */:
                                            ris.this.f.b();
                                            ris.this.d(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOW_BRIGHTNESS);
                                            break;
                                        case CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOW_BRIGHTNESS /* 1033 */:
                                            if (ris.this.f.p()) {
                                                ris.this.f.b();
                                                ris.this.f.i(ris.this.c);
                                            }
                                            ris.this.g(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOW_BRIGHTNESS, null, 300000L);
                                            break;
                                        case CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOGO /* 1034 */:
                                            Bundle data = message.getData();
                                            AMapLocation aMapLocation = (AMapLocation) data.getParcelable("mapLoc");
                                            com.autonavi.aps.amapapi.a aVar = (com.autonavi.aps.amapapi.a) data.getParcelable("entity");
                                            data.getSerializable("ex");
                                            ris.this.o(aMapLocation, aVar);
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } catch (Throwable th) {
                    r0 = message;
                    th = th;
                    if (r0 == 0) {
                        r0 = "handleMessage";
                    }
                    com.autonavi.aps.amapapi.utils.c.a(th, "AMapLocationManage$MHandlerr", r0);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static class e extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ris f32588a;

        public e(String str, ris risVar) {
            super(str);
            this.f32588a = risVar;
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            try {
                this.f32588a.p.b();
                h.a(this.f32588a.f32582b);
                this.f32588a.D0();
                ris risVar = this.f32588a;
                if (risVar != null && risVar.f32582b != null) {
                    com.autonavi.aps.amapapi.utils.b.b(this.f32588a.f32582b);
                    com.autonavi.aps.amapapi.utils.b.a(this.f32588a.f32582b);
                }
                super.onLooperPrepared();
            } catch (Throwable unused) {
            }
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                super.run();
            } catch (Throwable unused) {
            }
        }
    }

    public ris(Context context, Intent intent, Looper looper) {
        this.s = null;
        this.f32582b = context;
        this.s = intent;
        K(looper);
    }

    public static void W(AMapLocation aMapLocation) {
        if (aMapLocation == null) {
            return;
        }
        try {
            if (2 == aMapLocation.getLocationType() || 4 == aMapLocation.getLocationType()) {
                long time = aMapLocation.getTime();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis > time) {
                    aMapLocation.setTime(jCurrentTimeMillis);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void h(Context context) {
        if (S.compareAndSet(false, true)) {
            j1.h().b(new a(context));
        }
    }

    public static void t(com.autonavi.aps.amapapi.b bVar) {
        try {
            bVar.d();
            bVar.a(new AMapLocationClientOption().setNeedAddress(false));
            bVar.a(true, new com.autonavi.aps.amapapi.a());
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "apsLocation:doFirstNetLocate 2");
        }
    }

    public static void v(com.autonavi.aps.amapapi.b bVar, com.autonavi.aps.amapapi.model.a aVar) {
        if (aVar != null) {
            try {
                if (aVar.getErrorCode() == 0) {
                    bVar.b(aVar);
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "apsLocation:doFirstAddCache");
            }
        }
    }

    public final void A0() {
        com.autonavi.aps.amapapi.model.a aVarH = H(new com.autonavi.aps.amapapi.b(true));
        if (u0()) {
            Bundle bundle = new Bundle();
            String str = (aVarH == null || !(aVarH.getLocationType() == 2 || aVarH.getLocationType() == 4)) ? "0" : "1";
            bundle.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(this.c));
            bundle.putString("isCacheLoc", str);
            f(0, bundle);
            if (this.i) {
                f(13, null);
            }
        }
    }

    public final void B0() {
        if (this.c.isLBSLocationEnable()) {
            try {
                if (P || !(this.A || this.L)) {
                    P = false;
                    this.L = true;
                    A0();
                } else {
                    try {
                        if (this.A && !F() && !this.K) {
                            this.K = true;
                            D0();
                        }
                    } catch (Throwable th) {
                        this.K = true;
                        com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "doLBSLocation reStartService");
                    }
                    if (u0()) {
                        this.K = false;
                        Bundle bundle = new Bundle();
                        bundle.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(this.c));
                        bundle.putString(PluginDeviceInfo.FICONOFF, UmidtokenInfo.getUmidtoken());
                        if (!this.e.t()) {
                            f(1, bundle);
                        }
                    }
                }
                try {
                    if (this.c.isOnceLocation()) {
                        return;
                    }
                    C0();
                } catch (Throwable unused) {
                }
            } catch (Throwable th2) {
                try {
                    com.autonavi.aps.amapapi.utils.c.a(th2, "ALManager", "doLBSLocation");
                    try {
                        if (this.c.isOnceLocation()) {
                        }
                    } catch (Throwable unused2) {
                    }
                } finally {
                    try {
                        if (!this.c.isOnceLocation()) {
                            C0();
                        }
                    } catch (Throwable unused3) {
                    }
                }
            }
        }
    }

    public final void C0() {
        if (this.c.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors) {
            g(1016, null, this.c.getInterval() >= 1000 ? this.c.getInterval() : 1000L);
        }
    }

    public final void D0() {
        try {
            if (this.f32584r == null) {
                this.f32584r = new Messenger(this.d);
            }
            i(E0());
        } catch (Throwable unused) {
        }
    }

    public final void E(boolean z) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean("j", z);
            g(1024, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "disableBackgroundLocation");
        }
    }

    public final Intent E0() {
        String apikey;
        if (this.s == null) {
            this.s = new Intent(this.f32582b, (Class<?>) APSService.class);
        }
        try {
            apikey = !TextUtils.isEmpty(AMapLocationClientOption.getAPIKEY()) ? AMapLocationClientOption.getAPIKEY() : e0t.k(this.f32582b);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "startServiceImpl p2");
            apikey = "";
        }
        this.s.putExtra(PluginDeviceInfo.FMODEL, apikey);
        this.s.putExtra(PluginDeviceInfo.FDESC, e0t.g(this.f32582b));
        this.s.putExtra(PluginDeviceInfo.FICONOFF, UmidtokenInfo.getUmidtoken());
        return this.s;
    }

    public final boolean F() {
        return this.h;
    }

    public final void F0() {
        try {
            StringBuilder sb = new StringBuilder();
            new com.autonavi.aps.amapapi.a().f("#2001");
            sb.append("模糊权限下不支持低功耗定位#2001");
            i.a((String) null, 2153);
            com.autonavi.aps.amapapi.model.a aVar = new com.autonavi.aps.amapapi.model.a("");
            aVar.setErrorCode(20);
            aVar.setLocationDetail(sb.toString());
            r0(aVar);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "apsLocation:callback");
        }
    }

    public final void G0() {
        this.e.s(this.c);
        this.g.q(this.c);
        if (this.i && !this.c.getLocationMode().equals(this.x)) {
            z0();
            v0();
        }
        this.x = this.c.getLocationMode();
        if (this.z != null) {
            if (this.c.isOnceLocation()) {
                this.z.a(this.f32582b, 0);
            } else {
                this.z.a(this.f32582b, 1);
            }
            this.z.a(this.f32582b, this.c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00ed A[EXC_TOP_SPLITTER, PHI: r1
      0x00ed: PHI (r1v8 com.amap.api.location.AMapLocation) = 
      (r1v6 com.amap.api.location.AMapLocation)
      (r1v6 com.amap.api.location.AMapLocation)
      (r1v6 com.amap.api.location.AMapLocation)
      (r1v13 com.amap.api.location.AMapLocation)
     binds: [B:67:0x00e8, B:61:0x00d6, B:63:0x00da, B:64:0x00dc] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #8 {all -> 0x0035, blocks: (B:10:0x0027, B:12:0x0031), top: B:116:0x0027, outer: #11 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x003b A[Catch: all -> 0x013a, TRY_LEAVE, TryCatch #11 {all -> 0x013a, blocks: (B:3:0x000a, B:16:0x003b, B:36:0x0093, B:15:0x0036, B:9:0x0022, B:4:0x0011, B:6:0x001b, B:18:0x0043, B:20:0x004b, B:22:0x0057, B:25:0x0062, B:27:0x006a, B:29:0x007f, B:31:0x0084, B:34:0x008e, B:10:0x0027, B:12:0x0031), top: B:122:0x000a, inners: #0, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:18:0x0043, B:20:0x004b, B:22:0x0057, B:25:0x0062, B:27:0x006a, B:29:0x007f, B:31:0x0084, B:34:0x008e), top: B:115:0x0043, outer: #11 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:18:0x0043, B:20:0x004b, B:22:0x0057, B:25:0x0062, B:27:0x006a, B:29:0x007f, B:31:0x0084, B:34:0x008e), top: B:115:0x0043, outer: #11 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:18:0x0043, B:20:0x004b, B:22:0x0057, B:25:0x0062, B:27:0x006a, B:29:0x007f, B:31:0x0084, B:34:0x008e), top: B:115:0x0043, outer: #11 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:18:0x0043, B:20:0x004b, B:22:0x0057, B:25:0x0062, B:27:0x006a, B:29:0x007f, B:31:0x0084, B:34:0x008e), top: B:115:0x0043, outer: #11 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x007f A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:18:0x0043, B:20:0x004b, B:22:0x0057, B:25:0x0062, B:27:0x006a, B:29:0x007f, B:31:0x0084, B:34:0x008e), top: B:115:0x0043, outer: #11 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008e A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #7 {all -> 0x008c, blocks: (B:18:0x0043, B:20:0x004b, B:22:0x0057, B:25:0x0062, B:27:0x006a, B:29:0x007f, B:31:0x0084, B:34:0x008e), top: B:115:0x0043, outer: #11 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4 A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #6 {all -> 0x00ac, blocks: (B:41:0x009e, B:43:0x00a4), top: B:113:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8 A[Catch: all -> 0x00e7, TryCatch #3 {all -> 0x00e7, blocks: (B:60:0x00d0, B:62:0x00d8, B:64:0x00dc), top: B:107:0x00d0, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f5 A[Catch: all -> 0x00fe, TryCatch #12 {all -> 0x00fe, blocks: (B:68:0x00ed, B:70:0x00f5, B:72:0x00f9), top: B:123:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0105 A[Catch: all -> 0x0119, TryCatch #10 {all -> 0x0119, blocks: (B:73:0x00fe, B:75:0x0105, B:78:0x011b, B:80:0x0120), top: B:120:0x00fe, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0120 A[Catch: all -> 0x0119, TRY_LEAVE, TryCatch #10 {all -> 0x0119, blocks: (B:73:0x00fe, B:75:0x0105, B:78:0x011b, B:80:0x0120), top: B:120:0x00fe, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x012b A[ADDED_TO_REGION] */
    public final com.autonavi.aps.amapapi.model.a H(com.autonavi.aps.amapapi.b bVar) {
        com.autonavi.aps.amapapi.model.a aVar;
        Throwable th;
        boolean zM;
        boolean z;
        com.autonavi.aps.amapapi.model.a aVarA;
        boolean z2;
        String strK;
        Bundle bundle;
        f fVar;
        t0t t0tVar;
        long jA;
        String umidtoken;
        AMapLocation aMapLocationM78clone = null;
        this.f32581a = null;
        com.autonavi.aps.amapapi.a aVar2 = new com.autonavi.aps.amapapi.a();
        try {
            try {
                aVar2.c(k.b());
                try {
                    String apikey = AMapLocationClientOption.getAPIKEY();
                    if (TextUtils.isEmpty(apikey)) {
                        umidtoken = UmidtokenInfo.getUmidtoken();
                        if (TextUtils.isEmpty(umidtoken)) {
                            u(bVar, aVar2);
                            zM = com.autonavi.aps.amapapi.utils.b.m();
                            z = false;
                            if (this.E.getCacheCallBack()) {
                                aVarA = b(bVar, this.E.getCacheCallBack());
                                if (aVarA == null) {
                                    aVarA = null;
                                } else if (!com.autonavi.aps.amapapi.utils.b.a(aVarA.getTime())) {
                                    if (this.E.getCacheCallBack()) {
                                        int cacheTimeOut = this.E.getCacheTimeOut();
                                        jA = k.a() - aVarA.getTime();
                                        if (jA > 0) {
                                            this.f32581a = aVarA;
                                            aVarA.setLocationType(10);
                                        }
                                    }
                                    aVarA = null;
                                }
                            } else {
                                aVarA = b(bVar, false);
                            }
                            if (aVarA == null) {
                                aVarA = bVar.a(!zM, aVar2);
                                if (aVarA != null) {
                                    z = true;
                                }
                                aVar = aVarA;
                                z2 = z;
                                z = true;
                            } else {
                                aVar = aVarA;
                                z2 = false;
                            }
                            if (aVar != null) {
                                strK = aVar.k();
                                aMapLocationM78clone = aVar.m78clone();
                            } else {
                                strK = null;
                            }
                            if (this.c.isLocationCacheEnable()) {
                                if (this.E.getCacheCallBack()) {
                                    fVar.removeMessages(13);
                                }
                                bundle = new Bundle();
                                if (aMapLocationM78clone != null) {
                                    bundle.putParcelable("loc", aMapLocationM78clone);
                                    bundle.putString("nb", aVar.k());
                                    bundle.putParcelable("statics", aVar2);
                                }
                                k(bundle);
                                if (z2) {
                                    v(bVar, aVar);
                                    if (z) {
                                        Q = true;
                                        t(bVar);
                                    }
                                } else if (z) {
                                    Q = true;
                                    t(bVar);
                                }
                            } else {
                                if (this.E.getCacheCallBack()) {
                                    fVar.removeMessages(13);
                                }
                                bundle = new Bundle();
                                if (aMapLocationM78clone != null) {
                                    bundle.putParcelable("loc", aMapLocationM78clone);
                                    bundle.putString("nb", aVar.k());
                                    bundle.putParcelable("statics", aVar2);
                                }
                                k(bundle);
                                if (z2) {
                                    v(bVar, aVar);
                                    if (z) {
                                        Q = true;
                                        t(bVar);
                                    }
                                } else if (z) {
                                    Q = true;
                                    t(bVar);
                                }
                            }
                        } else {
                            h0t.r(umidtoken);
                            u(bVar, aVar2);
                            zM = com.autonavi.aps.amapapi.utils.b.m();
                            z = false;
                            if (this.E.getCacheCallBack()) {
                                aVarA = b(bVar, this.E.getCacheCallBack());
                                if (aVarA == null) {
                                    aVarA = null;
                                } else if (!com.autonavi.aps.amapapi.utils.b.a(aVarA.getTime())) {
                                    if (this.E.getCacheCallBack()) {
                                        int cacheTimeOut2 = this.E.getCacheTimeOut();
                                        jA = k.a() - aVarA.getTime();
                                        if (jA > 0) {
                                            this.f32581a = aVarA;
                                            aVarA.setLocationType(10);
                                        }
                                    }
                                    aVarA = null;
                                }
                            } else {
                                aVarA = b(bVar, false);
                            }
                            if (aVarA == null) {
                                aVarA = bVar.a(!zM, aVar2);
                                if (aVarA != null) {
                                    z = true;
                                }
                                aVar = aVarA;
                                z2 = z;
                                z = true;
                            } else {
                                aVar = aVarA;
                                z2 = false;
                            }
                            if (aVar != null) {
                                strK = aVar.k();
                                aMapLocationM78clone = aVar.m78clone();
                            } else {
                                strK = null;
                            }
                            if (this.c.isLocationCacheEnable()) {
                                if (this.E.getCacheCallBack()) {
                                    fVar.removeMessages(13);
                                }
                                bundle = new Bundle();
                                if (aMapLocationM78clone != null) {
                                    bundle.putParcelable("loc", aMapLocationM78clone);
                                    bundle.putString("nb", aVar.k());
                                    bundle.putParcelable("statics", aVar2);
                                }
                                k(bundle);
                                if (z2) {
                                    v(bVar, aVar);
                                    if (z) {
                                        Q = true;
                                        t(bVar);
                                    }
                                } else if (z) {
                                    Q = true;
                                    t(bVar);
                                }
                            } else {
                                if (this.E.getCacheCallBack()) {
                                    fVar.removeMessages(13);
                                }
                                bundle = new Bundle();
                                if (aMapLocationM78clone != null) {
                                    bundle.putParcelable("loc", aMapLocationM78clone);
                                    bundle.putString("nb", aVar.k());
                                    bundle.putParcelable("statics", aVar2);
                                }
                                k(bundle);
                                if (z2) {
                                    v(bVar, aVar);
                                    if (z) {
                                        Q = true;
                                        t(bVar);
                                    }
                                } else if (z) {
                                    Q = true;
                                    t(bVar);
                                }
                            }
                        }
                    } else {
                        x0.l(this.f32582b, apikey);
                        try {
                            umidtoken = UmidtokenInfo.getUmidtoken();
                            if (TextUtils.isEmpty(umidtoken)) {
                                h0t.r(umidtoken);
                                u(bVar, aVar2);
                                zM = com.autonavi.aps.amapapi.utils.b.m();
                                z = false;
                                try {
                                    if (this.E.getCacheCallBack()) {
                                        aVarA = b(bVar, this.E.getCacheCallBack());
                                        if (aVarA == null) {
                                            aVarA = null;
                                        } else if (!com.autonavi.aps.amapapi.utils.b.a(aVarA.getTime())) {
                                            if (this.E.getCacheCallBack()) {
                                                int cacheTimeOut3 = this.E.getCacheTimeOut();
                                                jA = k.a() - aVarA.getTime();
                                                if (jA > 0 && jA < cacheTimeOut3) {
                                                    this.f32581a = aVarA;
                                                    aVarA.setLocationType(10);
                                                }
                                            }
                                            aVarA = null;
                                        }
                                    } else {
                                        aVarA = b(bVar, false);
                                    }
                                } catch (Throwable th2) {
                                    com.autonavi.aps.amapapi.utils.c.a(th2, "ALManager", "apscach");
                                }
                                if (aVarA == null) {
                                    try {
                                        aVarA = bVar.a(!zM, aVar2);
                                        if (aVarA != null && aVarA.getErrorCode() == 0) {
                                            z = true;
                                        }
                                    } catch (Throwable th3) {
                                        try {
                                            com.autonavi.aps.amapapi.utils.c.a(th3, "ALManager", "apsLocation:doFirstNetLocate");
                                        } catch (Throwable th4) {
                                            th = th4;
                                            aVar = aVarA;
                                            try {
                                                com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "apsLocation");
                                                return aVar;
                                            } finally {
                                                try {
                                                    bVar.e();
                                                } catch (Throwable unused) {
                                                }
                                            }
                                        }
                                    }
                                    aVar = aVarA;
                                    z2 = z;
                                    z = true;
                                } else {
                                    aVar = aVarA;
                                    z2 = false;
                                }
                                if (aVar != null) {
                                    try {
                                        strK = aVar.k();
                                        aMapLocationM78clone = aVar.m78clone();
                                    } catch (Throwable th5) {
                                        th = th5;
                                        com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "apsLocation");
                                    }
                                } else {
                                    strK = null;
                                }
                                try {
                                    if (this.c.isLocationCacheEnable() || (t0tVar = this.p) == null) {
                                        try {
                                            if (this.E.getCacheCallBack() && (fVar = this.d) != null) {
                                                fVar.removeMessages(13);
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                        try {
                                            bundle = new Bundle();
                                            if (aMapLocationM78clone != null) {
                                                bundle.putParcelable("loc", aMapLocationM78clone);
                                                bundle.putString("nb", aVar.k());
                                                bundle.putParcelable("statics", aVar2);
                                            }
                                            k(bundle);
                                            if (z2) {
                                                v(bVar, aVar);
                                                if (z && zM && !Q) {
                                                    Q = true;
                                                    t(bVar);
                                                }
                                            } else if (z) {
                                                Q = true;
                                                t(bVar);
                                            }
                                        } catch (Throwable th6) {
                                            com.autonavi.aps.amapapi.utils.c.a(th6, "ALManager", "apsLocation:callback");
                                        }
                                    } else {
                                        aMapLocationM78clone = t0tVar.a(aMapLocationM78clone, strK, this.c.getLastLocationLifeCycle());
                                        if (this.E.getCacheCallBack()) {
                                            fVar.removeMessages(13);
                                        }
                                        bundle = new Bundle();
                                        if (aMapLocationM78clone != null) {
                                            bundle.putParcelable("loc", aMapLocationM78clone);
                                            bundle.putString("nb", aVar.k());
                                            bundle.putParcelable("statics", aVar2);
                                        }
                                        k(bundle);
                                        if (z2) {
                                            v(bVar, aVar);
                                            if (z) {
                                                Q = true;
                                                t(bVar);
                                            }
                                        } else if (z) {
                                            Q = true;
                                            t(bVar);
                                        }
                                    }
                                } catch (Throwable th7) {
                                    com.autonavi.aps.amapapi.utils.c.a(th7, "ALManager", "fixLastLocation");
                                }
                            } else {
                                u(bVar, aVar2);
                                zM = com.autonavi.aps.amapapi.utils.b.m();
                                z = false;
                                if (this.E.getCacheCallBack()) {
                                    aVarA = b(bVar, this.E.getCacheCallBack());
                                    if (aVarA == null) {
                                        aVarA = null;
                                    } else if (!com.autonavi.aps.amapapi.utils.b.a(aVarA.getTime())) {
                                        if (this.E.getCacheCallBack()) {
                                            int cacheTimeOut4 = this.E.getCacheTimeOut();
                                            jA = k.a() - aVarA.getTime();
                                            if (jA > 0) {
                                                this.f32581a = aVarA;
                                                aVarA.setLocationType(10);
                                            }
                                        }
                                        aVarA = null;
                                    }
                                } else {
                                    aVarA = b(bVar, false);
                                }
                                if (aVarA == null) {
                                    aVarA = bVar.a(!zM, aVar2);
                                    if (aVarA != null) {
                                        z = true;
                                    }
                                    aVar = aVarA;
                                    z2 = z;
                                    z = true;
                                } else {
                                    aVar = aVarA;
                                    z2 = false;
                                }
                                if (aVar != null) {
                                    strK = aVar.k();
                                    aMapLocationM78clone = aVar.m78clone();
                                } else {
                                    strK = null;
                                }
                                if (this.c.isLocationCacheEnable()) {
                                    if (this.E.getCacheCallBack()) {
                                        fVar.removeMessages(13);
                                    }
                                    bundle = new Bundle();
                                    if (aMapLocationM78clone != null) {
                                        bundle.putParcelable("loc", aMapLocationM78clone);
                                        bundle.putString("nb", aVar.k());
                                        bundle.putParcelable("statics", aVar2);
                                    }
                                    k(bundle);
                                    if (z2) {
                                        v(bVar, aVar);
                                        if (z) {
                                            Q = true;
                                            t(bVar);
                                        }
                                    } else if (z) {
                                        Q = true;
                                        t(bVar);
                                    }
                                } else {
                                    if (this.E.getCacheCallBack()) {
                                        fVar.removeMessages(13);
                                    }
                                    bundle = new Bundle();
                                    if (aMapLocationM78clone != null) {
                                        bundle.putParcelable("loc", aMapLocationM78clone);
                                        bundle.putString("nb", aVar.k());
                                        bundle.putParcelable("statics", aVar2);
                                    }
                                    k(bundle);
                                    if (z2) {
                                        v(bVar, aVar);
                                        if (z) {
                                            Q = true;
                                            t(bVar);
                                        }
                                    } else if (z) {
                                        Q = true;
                                        t(bVar);
                                    }
                                }
                            }
                        } catch (Throwable th8) {
                            com.autonavi.aps.amapapi.utils.c.a(th8, "ALManager", "apsLocation setUmidToken");
                        }
                    }
                } catch (Throwable th9) {
                    com.autonavi.aps.amapapi.utils.c.a(th9, "ALManager", "apsLocation setAuthKey");
                }
            } catch (Throwable th10) {
                aVar = null;
                th = th10;
                com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "apsLocation");
                return aVar;
            }
        } catch (Throwable unused3) {
        }
        return aVar;
    }

    public final boolean H0() {
        if (k.j(this.f32582b)) {
            try {
                if (g.b(((Application) this.f32582b.getApplicationContext()).getBaseContext(), "checkSelfPermission", "android.permission.FOREGROUND_SERVICE") != 0) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public final void J() {
        f fVar;
        try {
            if (this.E.getCacheCallBack() && (fVar = this.d) != null) {
                fVar.sendEmptyMessageDelayed(13, this.E.getCacheCallBackTime());
            }
        } catch (Throwable unused) {
        }
        try {
            g(1003, null, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "startLocation");
        }
    }

    public final void K(Looper looper) {
        try {
            if (looper != null) {
                this.d = new f(looper);
            } else if (Looper.myLooper() == null) {
                this.d = new f(this.f32582b.getMainLooper());
            } else {
                this.d = new f();
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "init 1");
        }
        try {
            try {
                this.p = new t0t(this.f32582b);
            } catch (Throwable th2) {
                com.autonavi.aps.amapapi.utils.c.a(th2, "ALManager", "init 2");
            }
            e eVar = new e("amapLocManagerThread", this);
            this.v = eVar;
            eVar.setPriority(5);
            this.v.start();
            this.M = c(this.v.getLooper());
        } catch (Throwable th3) {
            com.autonavi.aps.amapapi.utils.c.a(th3, "ALManager", "init 5");
        }
        try {
            this.e = new axs(this.f32582b, this.d);
            this.f = new w2t(this.f32582b, this.d);
            this.g = new ous(this.f32582b, this.d);
        } catch (Throwable th4) {
            com.autonavi.aps.amapapi.utils.c.a(th4, "ALManager", "init 3");
        }
        if (this.z == null) {
            this.z = new i();
        }
        h(this.f32582b);
    }

    public final void L(Message message) {
        try {
            AMapLocation aMapLocation = (AMapLocation) message.obj;
            aMapLocation.getLongitude();
            aMapLocation.getLatitude();
            com.autonavi.aps.amapapi.utils.e.c();
            if (this.l && this.q != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(this.c));
                f(0, bundle);
                if (this.i) {
                    f(13, null);
                }
                this.l = false;
            }
            o(aMapLocation, null);
            d(1025);
            g(1025, null, 300000L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "resultGpsLocationSuccess");
        }
    }

    public final void M(AMapLocation aMapLocation) {
        try {
            if (aMapLocation.getErrorCode() != 0) {
                aMapLocation.setLocationType(0);
            }
            if (aMapLocation.getErrorCode() == 0) {
                double latitude = aMapLocation.getLatitude();
                double longitude = aMapLocation.getLongitude();
                if ((latitude == 0.0d && longitude == 0.0d) || latitude < -90.0d || latitude > 90.0d || longitude < -180.0d || longitude > 180.0d) {
                    i.a("errorLatLng", aMapLocation.toStr());
                    aMapLocation.setLocationType(0);
                    aMapLocation.setErrorCode(8);
                    aMapLocation.setLocationDetail("LatLng is error#0802");
                }
            }
            if ("gps".equalsIgnoreCase(aMapLocation.getProvider()) || !this.e.t() || "network".equalsIgnoreCase(aMapLocation.getProvider()) || !this.f.s()) {
                aMapLocation.setAltitude(k.c(aMapLocation.getAltitude()));
                aMapLocation.setBearing(k.a(aMapLocation.getBearing()));
                aMapLocation.setSpeed(k.a(aMapLocation.getSpeed()));
                c0(aMapLocation);
                W(aMapLocation);
                aMapLocation.getProvider();
                aMapLocation.getLongitude();
                aMapLocation.getLatitude();
                com.autonavi.aps.amapapi.utils.e.c();
                Iterator<AMapLocationListener> it = this.j.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().onLocationChanged(aMapLocation);
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public final void N(AMapLocationListener aMapLocationListener) {
        try {
            g(1005, aMapLocationListener, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "unRegisterLocationListener");
        }
    }

    public final void U() {
        try {
            g(1004, null, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "stopLocation");
        }
    }

    public final void V(Message message) {
        try {
            AMapLocation aMapLocation = (AMapLocation) message.obj;
            aMapLocation.getLongitude();
            aMapLocation.getLatitude();
            com.autonavi.aps.amapapi.utils.e.c();
            if (this.n && this.q != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(this.c));
                f(0, bundle);
                if (this.i) {
                    f(13, null);
                }
                this.n = false;
            }
            if (!this.c.isLBSLocationEnable() || this.C) {
                d(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOGO);
                o(aMapLocation, null);
            }
            d(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOW_BRIGHTNESS);
            g(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOW_BRIGHTNESS, null, 300000L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "resultNetworkLocationSuccess");
        }
    }

    public final void X(AMapLocationListener aMapLocationListener) {
        if (aMapLocationListener == null) {
            throw new IllegalArgumentException("listener参数不能为null");
        }
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        if (this.j.contains(aMapLocationListener)) {
            return;
        }
        this.j.add(aMapLocationListener);
    }

    public final void a0() {
        try {
            dzs dzsVar = this.F;
            if (dzsVar != null) {
                dzsVar.f();
                this.F = null;
            }
            g(1011, null, 0L);
            this.w = true;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", LifecycleConstantKt.ON_DESTROY);
        }
    }

    public final com.autonavi.aps.amapapi.model.a b(com.autonavi.aps.amapapi.b bVar, boolean z) {
        if (!this.c.isLocationCacheEnable()) {
            return null;
        }
        try {
            return bVar.b(z);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "doFirstCacheLoc");
            return null;
        }
    }

    public final void b0(Message message) {
        if (message == null) {
            return;
        }
        try {
            Bundle data = message.getData();
            if (data == null) {
                return;
            }
            int i = data.getInt("i", 0);
            Notification notification = (Notification) data.getParcelable("h");
            Intent intentE0 = E0();
            intentE0.putExtra("i", i);
            intentE0.putExtra("h", notification);
            intentE0.putExtra(PluginDeviceInfo.FLOCALIZATIONS, 1);
            j(intentE0, true);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "doEnableBackgroundLocation");
        }
    }

    public final d c(Looper looper) {
        d dVar;
        synchronized (this.y) {
            dVar = new d(looper);
            this.M = dVar;
        }
        return dVar;
    }

    public final void c0(AMapLocation aMapLocation) {
        if (aMapLocation != null) {
            try {
                String locationDetail = aMapLocation.getLocationDetail();
                StringBuilder sb = TextUtils.isEmpty(locationDetail) ? new StringBuilder() : new StringBuilder(locationDetail);
                boolean zC = k.c(this.f32582b, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF");
                boolean zC2 = k.c(this.f32582b, "WYW5kcm9pZC5wZXJtaXNzaW9uLkNIQU5HRV9XSUZJX1NUQVRF");
                boolean zC3 = k.c(this.f32582b, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==");
                boolean zC4 = k.c(this.f32582b, "EYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=");
                boolean zC5 = k.c(this.f32582b, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O");
                boolean zC6 = k.c(this.f32582b, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=");
                sb.append(zC ? "#pm1" : "#pm0");
                sb.append(zC2 ? "1" : "0");
                sb.append(zC3 ? "1" : "0");
                sb.append(zC4 ? "1" : "0");
                sb.append(zC5 ? "1" : "0");
                sb.append(zC6 ? "1" : "0");
                aMapLocation.setLocationDetail(sb.toString());
            } catch (Throwable unused) {
                com.autonavi.aps.amapapi.utils.e.b();
            }
        }
    }

    public final void d(int i) {
        synchronized (this.y) {
            try {
                d dVar = this.M;
                if (dVar != null) {
                    dVar.removeMessages(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d0(AMapLocationListener aMapLocationListener) {
        if (!this.j.isEmpty() && this.j.contains(aMapLocationListener)) {
            this.j.remove(aMapLocationListener);
        }
        if (this.j.isEmpty()) {
            z0();
        }
    }

    public final void e(int i, Notification notification) {
        if (i == 0 || notification == null) {
            return;
        }
        try {
            if (this.o && this.q != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(this.c));
                f(0, bundle);
                this.o = false;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("i", i);
            bundle2.putParcelable("h", notification);
            g(1023, bundle2, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "disableBackgroundLocation");
        }
    }

    public final void f(int i, Bundle bundle) {
        if (bundle == null) {
            try {
                bundle = new Bundle();
            } catch (Throwable th) {
                boolean z = (th instanceof IllegalStateException) && th.getMessage().contains("sending message to a Handler on a dead thread");
                if ((th instanceof RemoteException) || z) {
                    this.q = null;
                    this.h = false;
                }
                com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "sendLocMessage");
                return;
            }
        }
        if (TextUtils.isEmpty(this.G)) {
            this.G = com.autonavi.aps.amapapi.utils.c.b(this.f32582b);
        }
        bundle.putString(PluginDeviceInfo.FICONON, this.G);
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.f32584r;
        Messenger messenger = this.q;
        if (messenger != null) {
            messenger.send(messageObtain);
        }
    }

    public final void g(int i, Object obj, long j) {
        synchronized (this.y) {
            try {
                if (this.M != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    if (obj instanceof Bundle) {
                        messageObtain.setData((Bundle) obj);
                    } else {
                        messageObtain.obj = obj;
                    }
                    this.M.sendMessageDelayed(messageObtain, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AMapLocation g0() {
        AMapLocation aMapLocationD = null;
        try {
            t0t t0tVar = this.p;
            if (t0tVar != null && (aMapLocationD = t0tVar.d()) != null) {
                aMapLocationD.setTrustedLevel(3);
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "getLastKnownLocation");
        }
        return aMapLocationD;
    }

    public final void h0(Message message) {
        if (message == null) {
            return;
        }
        try {
            Bundle data = message.getData();
            if (data == null) {
                return;
            }
            boolean z = data.getBoolean("j", true);
            Intent intentE0 = E0();
            intentE0.putExtra("j", z);
            intentE0.putExtra(PluginDeviceInfo.FLOCALIZATIONS, 2);
            j(intentE0, false);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "doDisableBackgroundLocation");
        }
    }

    public final void i(Intent intent) {
        try {
            this.f32582b.bindService(intent, this.H, 1);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "startServiceImpl");
        }
    }

    public final void i0(AMapLocation aMapLocation) {
        Message messageObtainMessage = this.d.obtainMessage();
        messageObtainMessage.what = 10;
        messageObtainMessage.obj = aMapLocation;
        this.d.sendMessage(messageObtainMessage);
    }

    public final void j(Intent intent, boolean z) {
        Context context = this.f32582b;
        if (context != null) {
            if (!z) {
                context.startService(intent);
            } else {
                if (!H0()) {
                    return;
                }
                try {
                    this.f32582b.getClass().getMethod("startForegroundService", Intent.class).invoke(this.f32582b, intent);
                } catch (Throwable unused) {
                    this.f32582b.startService(intent);
                }
            }
            this.O = true;
        }
    }

    public final void k(Bundle bundle) {
        com.autonavi.aps.amapapi.a aVar;
        AMapLocation aMapLocationA;
        axs axsVar;
        AMapLocation aMapLocation = null;
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocation.class.getClassLoader());
                aMapLocationA = (AMapLocation) bundle.getParcelable("loc");
                aMapLocationA.getLongitude();
                aMapLocationA.getLatitude();
                com.autonavi.aps.amapapi.utils.e.c();
                aMapLocationA.setProvider("lbs");
                this.N = bundle.getString("nb");
                aVar = (com.autonavi.aps.amapapi.a) bundle.getParcelable("statics");
                try {
                    if (aMapLocationA.getErrorCode() == 0 && (axsVar = this.e) != null) {
                        axsVar.v();
                        if (!TextUtils.isEmpty(aMapLocationA.getAdCode())) {
                            axs.J = aMapLocationA;
                            w2t.E = aMapLocationA;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    com.autonavi.aps.amapapi.utils.c.a(th, "AmapLocationManager", "resultLbsLocationSuccess");
                }
            } catch (Throwable th2) {
                th = th2;
                aVar = null;
                com.autonavi.aps.amapapi.utils.c.a(th, "AmapLocationManager", "resultLbsLocationSuccess");
            }
        } else {
            aVar = null;
            aMapLocationA = null;
        }
        axs axsVar2 = this.e;
        if (axsVar2 != null) {
            aMapLocationA = axsVar2.a(aMapLocationA, this.N);
        }
        if (this.f != null && (!k.a(aMapLocationA) || (this.c.isNeedAddress() && TextUtils.isEmpty(aMapLocationA.getAdCode())))) {
            aMapLocationA = this.f.a(aMapLocationA, this.N);
        }
        AMapLocation aMapLocation2 = aMapLocationA;
        th = null;
        aMapLocation = aMapLocation2;
        if (k.a(aMapLocation)) {
            this.C = false;
            o(aMapLocation, aVar);
            return;
        }
        this.C = true;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("mapLoc", aMapLocation);
        bundle2.putParcelable("entity", aVar);
        bundle2.putSerializable("ex", th);
        g(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOGO, bundle2, 10000L);
    }

    public final void k0() {
        try {
            dzs dzsVar = this.F;
            if (dzsVar != null) {
                dzsVar.f();
                this.F = null;
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "stopAssistantLocation");
        }
    }

    public final void l(Message message) {
        try {
            Bundle data = message.getData();
            AMapLocation aMapLocation = (AMapLocation) data.getParcelable("loc");
            String string = data.getString("lastLocNb");
            o0(aMapLocation);
            if (this.p.c(aMapLocation, string)) {
                this.p.f();
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "doSaveLastLocation");
        }
    }

    public final synchronized void l0(AMapLocation aMapLocation) {
        if (aMapLocation == null) {
            try {
                aMapLocation = new AMapLocation("");
                aMapLocation.setErrorCode(8);
                aMapLocation.setLocationDetail("coarse amapLocation is null#2005");
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "handlerCoarseLocation part2");
                return;
            }
        }
        if (this.I == null) {
            this.I = new AMapLocationQualityReport();
        }
        this.I.setLocationMode(this.c.getLocationMode());
        if (this.g != null) {
            this.I.setGPSSatellites(aMapLocation.getSatellites());
            this.I.setGpsStatus(this.g.n());
        }
        this.I.setWifiAble(k.g(this.f32582b));
        this.I.setNetworkType(k.h(this.f32582b));
        this.I.setNetUseTime(0L);
        this.I.setInstallHighDangerMockApp(R);
        aMapLocation.setLocationQualityReport(this.I);
        try {
            if (this.i) {
                i.a(this.f32582b, aMapLocation);
                i0(aMapLocation.m78clone());
                h.a(this.f32582b).a(aMapLocation);
                h.a(this.f32582b).b();
            }
        } catch (Throwable th2) {
            com.autonavi.aps.amapapi.utils.c.a(th2, "ALManager", "handlerCoarseLocation part");
        }
        if (this.w) {
            return;
        }
        if (this.g != null) {
            z0();
        }
        f(14, null);
    }

    public final void m(WebView webView) {
        if (this.F == null) {
            this.F = new dzs(this.f32582b, webView);
        }
        this.F.b();
    }

    public final void n(AMapLocation aMapLocation) {
        if (aMapLocation == null) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable("loc", aMapLocation);
            f(19, bundle);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "AMClt", "gReGeoL");
        }
    }

    public final void n0() {
        f(12, null);
        this.l = true;
        this.n = true;
        this.m = true;
        this.o = true;
        this.h = false;
        this.A = false;
        z0();
        i iVar = this.z;
        if (iVar != null) {
            iVar.b(this.f32582b);
        }
        h.a(this.f32582b).a();
        i.a(this.f32582b);
        ins insVar = this.B;
        if (insVar != null) {
            insVar.s().sendEmptyMessage(11);
        } else {
            ServiceConnection serviceConnection = this.H;
            if (serviceConnection != null) {
                this.f32582b.unbindService(serviceConnection);
            }
        }
        try {
            if (this.O) {
                this.f32582b.stopService(E0());
            }
        } catch (Throwable unused) {
        }
        this.O = false;
        ArrayList<AMapLocationListener> arrayList = this.j;
        if (arrayList != null) {
            arrayList.clear();
            this.j = null;
        }
        this.H = null;
        q0();
        e eVar = this.v;
        if (eVar != null) {
            try {
                g.a(eVar, (Class<?>) HandlerThread.class, "quitSafely", new Object[0]);
            } catch (Throwable unused2) {
                this.v.quit();
            }
        }
        this.v = null;
        f fVar = this.d;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages(null);
        }
        t0t t0tVar = this.p;
        if (t0tVar != null) {
            t0tVar.e();
            this.p = null;
        }
    }

    public final synchronized void o(AMapLocation aMapLocation, com.autonavi.aps.amapapi.a aVar) {
        try {
            com.autonavi.aps.amapapi.utils.e.c();
            if (aMapLocation == null) {
                aMapLocation = new AMapLocation("");
                aMapLocation.setErrorCode(8);
                aMapLocation.setLocationDetail("amapLocation is null#0801");
            }
            if (this.I == null) {
                this.I = new AMapLocationQualityReport();
            }
            this.I.setLocationMode(this.c.getLocationMode());
            axs axsVar = this.e;
            if (axsVar != null) {
                this.I.setGPSSatellites(axsVar.z());
                this.I.setGpsStatus(this.e.x());
            }
            this.I.setWifiAble(k.g(this.f32582b));
            this.I.setNetworkType(k.h(this.f32582b));
            if (aMapLocation.getLocationType() == 1 || "gps".equalsIgnoreCase(aMapLocation.getProvider())) {
                this.I.setNetUseTime(0L);
            }
            if (aVar != null) {
                this.I.setNetUseTime(aVar.a());
            }
            this.I.setInstallHighDangerMockApp(R);
            aMapLocation.setLocationQualityReport(this.I);
            try {
                if (this.i) {
                    p(aMapLocation, this.N);
                    if (aVar != null) {
                        aVar.d(k.b());
                    }
                    i.a(this.f32582b, aMapLocation, aVar);
                    i.a(this.f32582b, aMapLocation);
                    i0(aMapLocation.m78clone());
                    h.a(this.f32582b).a(aMapLocation);
                    h.a(this.f32582b).b();
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "handlerLocation part2");
            }
            if (this.w) {
                return;
            }
            if (this.c.isOnceLocation()) {
                z0();
                f(14, null);
            }
        } catch (Throwable th2) {
            com.autonavi.aps.amapapi.utils.c.a(th2, "ALManager", "handlerLocation part3");
        }
    }

    public final void o0(AMapLocation aMapLocation) {
        AMapLocation aMapLocationA;
        if (aMapLocation == null) {
            return;
        }
        try {
            com.autonavi.aps.amapapi.storage.b bVar = t0t.g;
            if (bVar == null) {
                t0t t0tVar = this.p;
                aMapLocationA = t0tVar != null ? t0tVar.d() : null;
            } else {
                aMapLocationA = bVar.a();
            }
            i.a(aMapLocationA, aMapLocation);
        } catch (Throwable unused) {
        }
    }

    public final void p(AMapLocation aMapLocation, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("loc", aMapLocation);
        bundle.putString("lastLocNb", str);
        g(1014, bundle, 0L);
    }

    public final void q(AMapLocationClientOption aMapLocationClientOption) {
        try {
            this.E = aMapLocationClientOption.m79clone();
            g(1018, aMapLocationClientOption.m79clone(), 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "setLocationOption");
        }
    }

    public final void q0() {
        synchronized (this.y) {
            try {
                d dVar = this.M;
                if (dVar != null) {
                    dVar.removeCallbacksAndMessages(null);
                }
                this.M = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(AMapLocationListener aMapLocationListener) {
        try {
            g(1002, aMapLocationListener, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "setLocationListener");
        }
    }

    public final void r0(AMapLocation aMapLocation) {
        try {
            if (this.m && this.q != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(this.c));
                f(0, bundle);
                if (this.i) {
                    f(13, null);
                }
                this.m = false;
            }
            l0(aMapLocation);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "resultGpsLocationSuccess");
        }
    }

    public final void s(IReGeoLocationCallback iReGeoLocationCallback) {
        this.D = iReGeoLocationCallback;
    }

    public final void u(com.autonavi.aps.amapapi.b bVar, com.autonavi.aps.amapapi.a aVar) {
        try {
            bVar.a(this.f32582b);
            bVar.a(this.c);
            bVar.b(aVar);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "initApsBase");
        }
    }

    public final boolean u0() {
        boolean z = false;
        int i = 0;
        while (this.q == null) {
            try {
                Thread.sleep(100L);
                i++;
                if (i >= 50) {
                    break;
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "checkAPSManager");
            }
        }
        if (this.q == null) {
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            AMapLocation aMapLocation = new AMapLocation("");
            aMapLocation.setErrorCode(10);
            if (k.k(this.f32582b.getApplicationContext())) {
                aMapLocation.setLocationDetail("启动ApsServcie失败#1001");
            } else {
                aMapLocation.setLocationDetail("请检查配置文件是否配置服务，并且manifest中service标签是否配置在application标签内#1003");
            }
            bundle.putParcelable("loc", aMapLocation);
            messageObtain.setData(bundle);
            messageObtain.what = 1;
            this.d.sendMessage(messageObtain);
        } else {
            z = true;
        }
        if (!z) {
            if (k.k(this.f32582b.getApplicationContext())) {
                i.a((String) null, AMapException.CODE_AMAP_NEARBY_KEY_NOT_BIND);
            } else {
                i.a((String) null, 2103);
            }
        }
        return z;
    }

    public final synchronized void v0() {
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 || k.c(this.f32582b, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=") || k.c(this.f32582b, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")) {
                if ((i >= 31 || i < 29 || this.f32582b.getApplicationInfo().targetSdkVersion < 29 || k.c(this.f32582b, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")) && ((i >= 31 || i < 29 || this.f32582b.getApplicationInfo().targetSdkVersion >= 29 || k.c(this.f32582b, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=") || k.c(this.f32582b, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")) && (i < 31 || k.c(this.f32582b, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=") || k.c(this.f32582b, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")))) {
                    if (this.c == null) {
                        this.c = new AMapLocationClientOption();
                    }
                    if (this.i) {
                        return;
                    }
                    this.i = true;
                    com.autonavi.aps.amapapi.utils.e.c();
                    long gpsFirstTimeout = 0;
                    g(1029, null, 0L);
                    int i2 = c.f32586a[this.c.getLocationMode().ordinal()];
                    if (i2 == 1) {
                        g(1027, null, 0L);
                        g(1017, null, 0L);
                        g(1016, null, 0L);
                        g(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_ANTI_SPOOF, null, 0L);
                        return;
                    }
                    if (i2 == 2) {
                        if (k.m(this.f32582b)) {
                            d(1016);
                            g(1017, null, 0L);
                            g(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_DRY_FINGER, null, 0L);
                            g(1026, null, 0L);
                            return;
                        }
                        d(1016);
                        g(1027, null, 0L);
                        g(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_DRY_FINGER, null, 0L);
                        g(1015, null, 0L);
                        return;
                    }
                    if (i2 == 3) {
                        if (k.m(this.f32582b)) {
                            d(1016);
                            g(1017, null, 0L);
                            g(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_DRY_FINGER, null, 0L);
                            g(1026, null, 0L);
                            return;
                        }
                        g(1027, null, 0L);
                        g(1015, null, 0L);
                        if (this.c.isGpsFirst() && this.c.isOnceLocation()) {
                            gpsFirstTimeout = this.c.getGpsFirstTimeout();
                        }
                        g(1016, null, gpsFirstTimeout);
                        g(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_ANTI_SPOOF, null, gpsFirstTimeout);
                    }
                    return;
                }
            }
            x0();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void x0() {
        AMapLocation aMapLocation = new AMapLocation("");
        aMapLocation.setErrorCode(12);
        aMapLocation.setLocationDetail("定位权限被禁用,请授予应用定位权限 #1201");
        if (this.I == null) {
            this.I = new AMapLocationQualityReport();
        }
        AMapLocationQualityReport aMapLocationQualityReport = new AMapLocationQualityReport();
        this.I = aMapLocationQualityReport;
        aMapLocationQualityReport.setGpsStatus(4);
        this.I.setGPSSatellites(0);
        this.I.setLocationMode(this.c.getLocationMode());
        this.I.setWifiAble(k.g(this.f32582b));
        this.I.setNetworkType(k.h(this.f32582b));
        this.I.setNetUseTime(0L);
        aMapLocation.setLocationQualityReport(this.I);
        i.a((String) null, 2121);
        i0(aMapLocation);
    }

    public final void z0() {
        try {
            com.autonavi.aps.amapapi.utils.e.c();
            d(1025);
            d(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOW_BRIGHTNESS);
            axs axsVar = this.e;
            if (axsVar != null) {
                axsVar.b();
            }
            w2t w2tVar = this.f;
            if (w2tVar != null) {
                w2tVar.b();
            }
            ous ousVar = this.g;
            if (ousVar != null) {
                ousVar.b();
            }
            d(1016);
            g(1030, null, 0L);
            this.i = false;
            this.t = 0;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "stopLocation");
        }
    }

    public class f extends Handler {
        public f(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            f fVar;
            f fVar2;
            try {
                super.handleMessage(message);
                ris risVar = ris.this;
                if (risVar.w) {
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    Message messageObtainMessage = risVar.M.obtainMessage();
                    messageObtainMessage.what = 11;
                    messageObtainMessage.setData(message.getData());
                    ris.this.M.sendMessage(messageObtainMessage);
                    return;
                }
                if (i != 2) {
                    switch (i) {
                        case 5:
                            Bundle data = message.getData();
                            data.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(ris.this.c));
                            ris.this.f(10, data);
                            return;
                        case 6:
                            Bundle data2 = message.getData();
                            axs axsVar = ris.this.e;
                            if (axsVar != null) {
                                axsVar.g(data2);
                                return;
                            }
                            return;
                        case 7:
                            ris.this.u = message.getData().getBoolean("ngpsAble");
                            return;
                        case 8:
                            i.a((String) null, 2141);
                            break;
                        case 9:
                            boolean unused = ris.R = message.getData().getBoolean("installMockApp");
                            return;
                        case 10:
                            risVar.M((AMapLocation) message.obj);
                            return;
                        default:
                            switch (i) {
                                case 13:
                                    com.autonavi.aps.amapapi.model.a aVar = risVar.f32581a;
                                    if (aVar != null) {
                                        risVar.M(aVar);
                                        return;
                                    }
                                    AMapLocation aMapLocation = new AMapLocation("LBS");
                                    aMapLocation.setErrorCode(33);
                                    ris.this.M(aMapLocation);
                                    return;
                                case 14:
                                    Bundle data3 = message.getData();
                                    data3.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(ris.this.c));
                                    ris.this.f(18, data3);
                                    return;
                                case 15:
                                    break;
                                default:
                                    switch (i) {
                                        case 17:
                                            i.a((String) null, 2131);
                                            break;
                                        case 18:
                                            Bundle data4 = message.getData();
                                            if (ris.this.f != null) {
                                                ris.this.f.f(data4);
                                                return;
                                            }
                                            return;
                                        case 19:
                                            AMapLocation aMapLocation2 = (AMapLocation) message.getData().getParcelable("loc");
                                            if (aMapLocation2 == null || ris.this.D == null) {
                                                return;
                                            }
                                            ris.this.D.onReGeoLocation(aMapLocation2);
                                            return;
                                        default:
                                            switch (i) {
                                                case 100:
                                                    i.a((String) null, 2155);
                                                    break;
                                                case 101:
                                                    break;
                                                case 102:
                                                    Bundle data5 = message.getData();
                                                    data5.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(ris.this.c));
                                                    ris.this.f(15, data5);
                                                    return;
                                                case 103:
                                                    Bundle data6 = message.getData();
                                                    if (ris.this.g != null) {
                                                        ris.this.g.f(data6);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    return;
                                            }
                                            Message messageObtain = Message.obtain();
                                            messageObtain.what = 1028;
                                            messageObtain.obj = message.obj;
                                            ris.this.M.sendMessage(messageObtain);
                                            if (ris.this.E == null || !ris.this.E.getCacheCallBack() || (fVar2 = ris.this.d) == null) {
                                                return;
                                            }
                                            fVar2.removeMessages(13);
                                            return;
                                    }
                                    break;
                            }
                            Message messageObtain2 = Message.obtain();
                            messageObtain2.what = 16;
                            messageObtain2.obj = message.obj;
                            ris.this.M.sendMessage(messageObtain2);
                            return;
                    }
                }
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 12;
                messageObtain3.obj = message.obj;
                ris.this.M.sendMessage(messageObtain3);
                if (ris.this.E == null || !ris.this.E.getCacheCallBack() || (fVar = ris.this.d) == null) {
                    return;
                }
                fVar.removeMessages(13);
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "AmapLocationManager$MainHandler", 0 == 0 ? "handleMessage" : null);
            }
        }

        public f() {
        }
    }
}
