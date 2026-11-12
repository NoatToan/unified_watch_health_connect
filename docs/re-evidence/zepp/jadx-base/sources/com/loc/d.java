package com.loc;

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
import android.util.Log;
import android.webkit.WebView;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.AMapLocationQualityReport;
import com.amap.api.location.APSService;
import com.amap.api.location.UmidtokenInfo;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public final class d {
    private static boolean C = true;
    private static boolean E = false;
    public c b;
    public g c;
    public i g;
    public Intent j;
    public b l;
    public em p;
    public a w;
    private Context z;
    public AMapLocationClientOption a = new AMapLocationClientOption();
    private boolean A = false;
    private volatile boolean B = false;
    public ArrayList<AMapLocationListener> d = new ArrayList<>();
    public boolean e = false;
    public boolean f = true;
    public Messenger h = null;
    public Messenger i = null;
    public int k = 0;
    private boolean D = true;
    public boolean m = false;
    public AMapLocationClientOption.AMapLocationMode n = AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
    public Object o = new Object();
    public boolean q = false;
    public e r = null;
    private h F = null;
    public String s = null;
    private ServiceConnection G = new ServiceConnection() { // from class: com.loc.d.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                d.this.h = new Messenger(iBinder);
                d.this.A = true;
                d.this.q = true;
            } catch (Throwable th) {
                ei.a(th, "ALManager", "onServiceConnected");
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            d dVar = d.this;
            dVar.h = null;
            dVar.A = false;
        }
    };
    public AMapLocationQualityReport t = null;
    public boolean u = false;
    public boolean v = false;
    public String x = null;
    public boolean y = false;

    /* JADX INFO: renamed from: com.loc.d$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AMapLocationClientOption.AMapLocationMode.values().length];
            a = iArr;
            try {
                iArr[AMapLocationClientOption.AMapLocationMode.Battery_Saving.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AMapLocationClientOption.AMapLocationMode.Device_Sensors.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AMapLocationClientOption.AMapLocationMode.Hight_Accuracy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ?? r0 = 0;
            try {
                super.handleMessage(message);
                int i = message.what;
                if (i == 11) {
                    d.this.a(message.getData());
                    return;
                }
                if (i == 12) {
                    d.a(d.this, message);
                    return;
                }
                if (i == 1008) {
                    d.h(d.this);
                    return;
                }
                if (i == 1009) {
                    d.i(d.this);
                    return;
                }
                if (i == 1011) {
                    d.this.a(14, (Bundle) null);
                    d.this.h();
                }
                try {
                    switch (i) {
                        case 1002:
                            d.a(d.this, (AMapLocationListener) message.obj);
                            break;
                        case 1003:
                            d.this.j();
                            d.this.a(13, (Bundle) null);
                            break;
                        case 1004:
                            d.this.k();
                            d.this.a(14, (Bundle) null);
                            break;
                        case 1005:
                            d.b(d.this, (AMapLocationListener) message.obj);
                            break;
                        default:
                            switch (i) {
                                case 1014:
                                    d.b(d.this, message);
                                    break;
                                case 1015:
                                    d dVar = d.this;
                                    dVar.c.a(dVar.a);
                                    d.this.a(1025, (Object) null, 300000L);
                                    break;
                                case 1016:
                                    if (!d.this.c.b()) {
                                        d.e(d.this);
                                    } else {
                                        d.this.a(1016, (Object) null, 1000L);
                                    }
                                    break;
                                case 1017:
                                    d.this.c.a();
                                    d.this.a(1025);
                                    break;
                                case 1018:
                                    d dVar2 = d.this;
                                    AMapLocationClientOption aMapLocationClientOption = (AMapLocationClientOption) message.obj;
                                    dVar2.a = aMapLocationClientOption;
                                    if (aMapLocationClientOption != null) {
                                        d.g(dVar2);
                                    }
                                    break;
                                default:
                                    switch (i) {
                                        case 1023:
                                            d.c(d.this, message);
                                            break;
                                        case 1024:
                                            d.d(d.this, message);
                                            break;
                                        case 1025:
                                            g gVar = d.this.c;
                                            AMapLocationClientOption aMapLocationClientOption2 = gVar.c;
                                            boolean z = false;
                                            if (aMapLocationClientOption2 != null && !aMapLocationClientOption2.isOnceLocation() && eo.b() - gVar.d > 300000) {
                                                z = true;
                                            }
                                            if (z) {
                                                d.this.c.a();
                                                d dVar3 = d.this;
                                                dVar3.c.a(dVar3.a);
                                            }
                                            d.this.a(1025, (Object) null, 300000L);
                                            break;
                                        default:
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
                    ei.a(th, "AMapLocationManage$MHandlerr", r0);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static class b extends HandlerThread {
        public d a;

        public b(String str, d dVar) {
            super(str);
            this.a = null;
            this.a = dVar;
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            try {
                this.a.g.a();
                this.a.m();
                dv.j();
                d dVar = this.a;
                if (dVar != null && dVar.z != null) {
                    eh.b(this.a.z);
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

    public class c extends Handler {
        public c() {
        }

        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String str = null;
            try {
                super.handleMessage(message);
                d dVar = d.this;
                if (dVar.m) {
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    Message messageObtainMessage = dVar.w.obtainMessage();
                    messageObtainMessage.what = 11;
                    messageObtainMessage.setData(message.getData());
                    d.this.w.sendMessage(messageObtainMessage);
                    return;
                }
                if (i != 2) {
                    switch (i) {
                        case 5:
                            Bundle data = message.getData();
                            data.putBundle("optBundle", ei.a(d.this.a));
                            d.this.a(10, data);
                            break;
                        case 6:
                            str = "handleMessage RESULT_GPS_GEO_SUCCESS";
                            Bundle data2 = message.getData();
                            g gVar = d.this.c;
                            if (gVar != null && data2 != null) {
                                try {
                                    data2.setClassLoader(AMapLocation.class.getClassLoader());
                                    gVar.g = data2.getInt("I_MAX_GEO_DIS");
                                    gVar.h = data2.getInt("I_MIN_GEO_DIS");
                                    AMapLocation aMapLocation = (AMapLocation) data2.getParcelable("loc");
                                    if (!TextUtils.isEmpty(aMapLocation.getAdCode())) {
                                        synchronized (gVar.o) {
                                            try {
                                                gVar.y = aMapLocation;
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    ei.a(th2, "GpsLocation", "setLastGeoLocation");
                                    return;
                                }
                                break;
                            }
                            break;
                        case 7:
                            Bundle data3 = message.getData();
                            d.this.D = data3.getBoolean("ngpsAble");
                            break;
                        case 8:
                            em.a((String) null, 2141);
                            break;
                        case 9:
                            boolean unused = d.E = message.getData().getBoolean("installMockApp");
                            break;
                        case 10:
                            d.a(dVar, (AMapLocation) message.obj);
                            break;
                        default:
                            break;
                    }
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 12;
                messageObtain.obj = message.obj;
                d.this.w.sendMessage(messageObtain);
            } catch (Throwable th3) {
                if (str == null) {
                    str = "handleMessage";
                }
                ei.a(th3, "AmapLocationManager$MainHandler", str);
            }
        }
    }

    public d(Context context, Intent intent, Looper looper) {
        this.c = null;
        this.j = null;
        this.l = null;
        this.p = null;
        this.w = null;
        this.z = context;
        this.j = intent;
        try {
            this.b = looper == null ? Looper.myLooper() == null ? new c(this.z.getMainLooper()) : new c() : new c(looper);
        } catch (Throwable th) {
            ei.a(th, "ALManager", "init 1");
        }
        try {
            try {
                this.g = new i(this.z);
            } catch (Throwable th2) {
                ei.a(th2, "ALManager", "init 5");
            }
        } catch (Throwable th3) {
            ei.a(th3, "ALManager", "init 2");
        }
        b bVar = new b("amapLocManagerThread", this);
        this.l = bVar;
        bVar.setPriority(5);
        this.l.start();
        this.w = a(this.l.getLooper());
        try {
            this.c = new g(this.z, this.b);
        } catch (Throwable th4) {
            ei.a(th4, "ALManager", "init 3");
        }
        if (this.p == null) {
            this.p = new em();
        }
    }

    private a a(Looper looper) {
        a aVar;
        synchronized (this.o) {
            aVar = new a(looper);
            this.w = aVar;
        }
        return aVar;
    }

    private dr a(dm dmVar) {
        if (!this.a.isLocationCacheEnable()) {
            return null;
        }
        try {
            return dmVar.f();
        } catch (Throwable th) {
            ei.a(th, "ALManager", "doFirstCacheLoc");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        synchronized (this.o) {
            a aVar = this.w;
            if (aVar != null) {
                aVar.removeMessages(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Bundle bundle) {
        if (bundle == null) {
            try {
                bundle = new Bundle();
            } catch (Throwable th) {
                boolean z = (th instanceof IllegalStateException) && th.getMessage().contains("sending message to a Handler on a dead thread");
                if ((th instanceof RemoteException) || z) {
                    this.h = null;
                    this.A = false;
                }
                ei.a(th, "ALManager", "sendLocMessage");
                return;
            }
        }
        if (TextUtils.isEmpty(this.s)) {
            this.s = ei.b(this.z);
        }
        bundle.putString("c", this.s);
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.i;
        Messenger messenger = this.h;
        if (messenger != null) {
            messenger.send(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object obj, long j) {
        synchronized (this.o) {
            if (this.w != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = i;
                if (obj instanceof Bundle) {
                    messageObtain.setData((Bundle) obj);
                } else {
                    messageObtain.obj = obj;
                }
                this.w.sendMessageDelayed(messageObtain, j);
            }
        }
    }

    private void a(Intent intent, boolean z) {
        Context context = this.z;
        if (context != null) {
            if (Build.VERSION.SDK_INT < 26 || !z) {
                context.startService(intent);
            } else if (!o()) {
                Log.e("amapapi", "-------------调用后台定位服务，缺少权限：android.permission.FOREGROUND_SERVICE--------------");
                return;
            } else {
                try {
                    this.z.getClass().getMethod("startForegroundService", Intent.class).invoke(this.z, intent);
                } catch (Throwable unused) {
                    this.z.startService(intent);
                }
            }
            this.y = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        dl dlVar;
        AMapLocation aMapLocation;
        g gVar;
        AMapLocation aMapLocationA = null;
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocation.class.getClassLoader());
                aMapLocation = (AMapLocation) bundle.getParcelable("loc");
                this.x = bundle.getString("nb");
                dlVar = (dl) bundle.getParcelable("statics");
                if (aMapLocation != null) {
                    try {
                        if (aMapLocation.getErrorCode() == 0 && (gVar = this.c) != null) {
                            gVar.w = 0;
                            if (!TextUtils.isEmpty(aMapLocation.getAdCode())) {
                                this.c.y = aMapLocation;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        ei.a(th, "AmapLocationManager", "resultLbsLocationSuccess");
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                dlVar = null;
                ei.a(th, "AmapLocationManager", "resultLbsLocationSuccess");
            }
            a(aMapLocationA, dlVar);
        }
        dlVar = null;
        aMapLocation = null;
        g gVar2 = this.c;
        aMapLocationA = gVar2 != null ? gVar2.a(aMapLocation, this.x) : aMapLocation;
        a(aMapLocationA, dlVar);
    }

    private synchronized void a(AMapLocation aMapLocation, dl dlVar) {
        if (aMapLocation == null) {
            try {
                aMapLocation = new AMapLocation("");
                aMapLocation.setErrorCode(8);
                aMapLocation.setLocationDetail("amapLocation is null#0801");
            } catch (Throwable th) {
                ei.a(th, "ALManager", "handlerLocation part3");
                return;
            }
        }
        if (!"gps".equalsIgnoreCase(aMapLocation.getProvider())) {
            aMapLocation.setProvider("lbs");
        }
        if (this.t == null) {
            this.t = new AMapLocationQualityReport();
        }
        this.t.setLocationMode(this.a.getLocationMode());
        g gVar = this.c;
        if (gVar != null) {
            this.t.setGPSSatellites(gVar.d());
            this.t.setGpsStatus(this.c.c());
        }
        this.t.setWifiAble(eo.h(this.z));
        this.t.setNetworkType(eo.i(this.z));
        if (aMapLocation.getLocationType() == 1 || "gps".equalsIgnoreCase(aMapLocation.getProvider())) {
            this.t.setNetUseTime(0L);
        }
        if (dlVar != null) {
            this.t.setNetUseTime(dlVar.a());
        }
        this.t.setInstallHighDangerMockApp(E);
        aMapLocation.setLocationQualityReport(this.t);
        try {
            if (this.B) {
                String str = this.x;
                Bundle bundle = new Bundle();
                bundle.putParcelable("loc", aMapLocation);
                bundle.putString("lastLocNb", str);
                a(1014, bundle, 0L);
                if (dlVar != null) {
                    dlVar.d(eo.b());
                }
                em.a(this.z, aMapLocation, dlVar);
                em.a(this.z, aMapLocation);
                AMapLocation aMapLocationM3277clone = aMapLocation.m3277clone();
                Message messageObtainMessage = this.b.obtainMessage();
                messageObtainMessage.what = 10;
                messageObtainMessage.obj = aMapLocationM3277clone;
                this.b.sendMessage(messageObtainMessage);
            }
        } catch (Throwable th2) {
            ei.a(th2, "ALManager", "handlerLocation part2");
        }
        if (this.m) {
            return;
        }
        if (this.a.isOnceLocation()) {
            k();
            a(14, (Bundle) null);
        }
    }

    public static /* synthetic */ void a(d dVar, Message message) {
        try {
            AMapLocation aMapLocation = (AMapLocation) message.obj;
            if (dVar.f && dVar.h != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("optBundle", ei.a(dVar.a));
                dVar.a(0, bundle);
                if (dVar.B) {
                    dVar.a(13, (Bundle) null);
                }
                dVar.f = false;
            }
            dVar.a(aMapLocation, (dl) null);
            if (dVar.D) {
                dVar.a(7, (Bundle) null);
            }
            dVar.a(1025);
            dVar.a(1025, (Object) null, 300000L);
        } catch (Throwable th) {
            ei.a(th, "ALManager", "resultGpsLocationSuccess");
        }
    }

    public static /* synthetic */ void a(d dVar, AMapLocation aMapLocation) {
        try {
            if (aMapLocation.getErrorCode() != 0) {
                aMapLocation.setLocationType(0);
            }
            if (aMapLocation.getErrorCode() == 0) {
                double latitude = aMapLocation.getLatitude();
                double longitude = aMapLocation.getLongitude();
                if ((latitude == 0.0d && longitude == 0.0d) || latitude < -90.0d || latitude > 90.0d || longitude < -180.0d || longitude > 180.0d) {
                    em.a("errorLatLng", aMapLocation.toStr());
                    aMapLocation.setLocationType(0);
                    aMapLocation.setErrorCode(8);
                    aMapLocation.setLocationDetail("LatLng is error#0802");
                }
            }
            if ("gps".equalsIgnoreCase(aMapLocation.getProvider()) || !dVar.c.b()) {
                aMapLocation.setAltitude(eo.c(aMapLocation.getAltitude()));
                aMapLocation.setBearing(eo.a(aMapLocation.getBearing()));
                aMapLocation.setSpeed(eo.a(aMapLocation.getSpeed()));
                Iterator<AMapLocationListener> it2 = dVar.d.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().onLocationChanged(aMapLocation);
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public static /* synthetic */ void a(d dVar, AMapLocationListener aMapLocationListener) {
        if (aMapLocationListener == null) {
            throw new IllegalArgumentException("listener参数不能为null");
        }
        if (dVar.d == null) {
            dVar.d = new ArrayList<>();
        }
        if (dVar.d.contains(aMapLocationListener)) {
            return;
        }
        dVar.d.add(aMapLocationListener);
    }

    private static void a(dm dmVar, dr drVar) {
        if (drVar != null) {
            try {
                if (drVar.getErrorCode() == 0) {
                    dmVar.b(drVar);
                }
            } catch (Throwable th) {
                ei.a(th, "ALManager", "apsLocation:doFirstAddCache");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private dr b(dm dmVar) {
        boolean z;
        String strK;
        i iVar;
        dl dlVar = new dl();
        AMapLocation aMapLocationA = null;
        try {
            dlVar.c(eo.b());
            try {
                String apikey = AMapLocationClientOption.getAPIKEY();
                if (!TextUtils.isEmpty(apikey)) {
                    l.a(this.z, apikey);
                }
            } catch (Throwable th) {
                ei.a(th, "ALManager", "apsLocation setAuthKey");
            }
            try {
                String umidtoken = UmidtokenInfo.getUmidtoken();
                if (!TextUtils.isEmpty(umidtoken)) {
                    n.a(umidtoken);
                }
            } catch (Throwable th2) {
                ei.a(th2, "ALManager", "apsLocation setUmidToken");
            }
            try {
                dmVar.a(this.z);
                dmVar.a(this.a);
                dmVar.b(dlVar);
            } catch (Throwable th3) {
                ei.a(th3, "ALManager", "initApsBase");
            }
            boolean zS = eh.s();
            dr drVarA = a(dmVar);
            if (drVarA == null) {
                try {
                    try {
                        drVarA = dmVar.a(!zS, dlVar);
                        if (!zS) {
                            a(dmVar, drVarA);
                        }
                    } catch (Throwable th4) {
                        ei.a(th4, "ALManager", "apsLocation:doFirstNetLocate");
                    }
                    z = true;
                } catch (Throwable th5) {
                    th = th5;
                    aMapLocationA = drVarA;
                    try {
                        ei.a(th, "ALManager", "apsLocation");
                        return aMapLocationA;
                    } finally {
                        try {
                            dmVar.e();
                        } catch (Throwable unused) {
                        }
                    }
                }
            } else {
                z = false;
            }
            if (drVarA != null) {
                if (!drVarA.e().equals("new")) {
                    drVarA.b(false);
                }
                strK = drVarA.k();
                aMapLocationA = drVarA.m3277clone();
            } else {
                strK = null;
            }
            try {
                if (this.a.isLocationCacheEnable() && (iVar = this.g) != null) {
                    aMapLocationA = iVar.a(aMapLocationA, strK, this.a.getLastLocationLifeCycle());
                }
            } catch (Throwable th6) {
                ei.a(th6, "ALManager", "fixLastLocation");
            }
            try {
                Bundle bundle = new Bundle();
                if (aMapLocationA != null) {
                    bundle.putParcelable("loc", aMapLocationA);
                    bundle.putString("nb", drVarA.k());
                    bundle.putParcelable("statics", dlVar);
                }
                a(bundle);
            } catch (Throwable th7) {
                ei.a(th7, "ALManager", "apsLocation:callback");
            }
            if (z && zS) {
                try {
                    dmVar.c();
                    a(dmVar, dmVar.a(true, new dl()));
                } catch (Throwable th8) {
                    ei.a(th8, "ALManager", "apsLocation:doFirstNetLocate 2");
                }
            }
            try {
                dmVar.e();
                return drVarA;
            } catch (Throwable unused2) {
                return drVarA;
            }
        } catch (Throwable th9) {
            th = th9;
            ei.a(th, "ALManager", "apsLocation");
            return aMapLocationA;
        }
    }

    public static /* synthetic */ void b(d dVar, Message message) {
        try {
            Bundle data = message.getData();
            AMapLocation aMapLocation = (AMapLocation) data.getParcelable("loc");
            String string = data.getString("lastLocNb");
            if (aMapLocation != null) {
                AMapLocation aMapLocationA = null;
                try {
                    dz dzVar = i.b;
                    if (dzVar == null) {
                        i iVar = dVar.g;
                        if (iVar != null) {
                            aMapLocationA = iVar.b();
                        }
                    } else {
                        aMapLocationA = dzVar.a();
                    }
                    em.a(aMapLocationA, aMapLocation);
                } catch (Throwable unused) {
                }
            }
            if (dVar.g.a(aMapLocation, string)) {
                dVar.g.d();
            }
        } catch (Throwable th) {
            ei.a(th, "ALManager", "doSaveLastLocation");
        }
    }

    public static /* synthetic */ void b(d dVar, AMapLocationListener aMapLocationListener) {
        if (!dVar.d.isEmpty() && dVar.d.contains(aMapLocationListener)) {
            dVar.d.remove(aMapLocationListener);
        }
        if (dVar.d.isEmpty()) {
            dVar.k();
        }
    }

    public static /* synthetic */ void c(d dVar, Message message) {
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
            Intent intentN = dVar.n();
            intentN.putExtra("i", i);
            intentN.putExtra("h", notification);
            intentN.putExtra("g", 1);
            dVar.a(intentN, true);
        } catch (Throwable th) {
            ei.a(th, "ALManager", "doEnableBackgroundLocation");
        }
    }

    public static /* synthetic */ void d(d dVar, Message message) {
        if (message == null) {
            return;
        }
        try {
            Bundle data = message.getData();
            if (data == null) {
                return;
            }
            boolean z = data.getBoolean(z.j, true);
            Intent intentN = dVar.n();
            intentN.putExtra(z.j, z);
            intentN.putExtra("g", 2);
            dVar.a(intentN, false);
        } catch (Throwable th) {
            ei.a(th, "ALManager", "doDisableBackgroundLocation");
        }
    }

    public static /* synthetic */ void e(d dVar) {
        boolean zL;
        boolean z;
        try {
            if (C || !(z = dVar.q)) {
                C = false;
                dr drVarB = dVar.b(new dm());
                if (dVar.i()) {
                    Bundle bundle = new Bundle();
                    String str = "0";
                    if (drVarB != null) {
                        str = (drVarB.getLocationType() == 2 || drVarB.getLocationType() == 4) ? "1" : "0";
                        zL = drVarB.l();
                    } else {
                        zL = false;
                    }
                    bundle.putBundle("optBundle", ei.a(dVar.a));
                    bundle.putString("isCacheLoc", str);
                    bundle.putBoolean("needRequestCloud", zL);
                    bundle.putString("requestHost", eh.b);
                    bundle.putString("requestIpV6Host", eh.c);
                    bundle.putString("dnsHostName", eh.d);
                    dVar.a(0, bundle);
                    if (dVar.B) {
                        dVar.a(13, (Bundle) null);
                    }
                }
            } else {
                if (z) {
                    try {
                        if (!dVar.A && !dVar.v) {
                            dVar.v = true;
                            dVar.m();
                        }
                    } catch (Throwable th) {
                        dVar.v = true;
                        ei.a(th, "ALManager", "doLBSLocation reStartService");
                    }
                }
                if (dVar.i()) {
                    dVar.v = false;
                    Bundle bundle2 = new Bundle();
                    bundle2.putBundle("optBundle", ei.a(dVar.a));
                    bundle2.putString(GoogleApiAvailabilityLight.a, UmidtokenInfo.getUmidtoken());
                    if (!dVar.c.b()) {
                        dVar.a(1, bundle2);
                    }
                }
            }
            try {
                if (dVar.a.isOnceLocation()) {
                    return;
                }
                dVar.l();
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            try {
                ei.a(th2, "ALManager", "doLBSLocation");
                try {
                    if (dVar.a.isOnceLocation()) {
                    }
                } catch (Throwable unused2) {
                }
            } finally {
                try {
                    if (!dVar.a.isOnceLocation()) {
                        dVar.l();
                    }
                } catch (Throwable unused3) {
                }
            }
        }
    }

    public static /* synthetic */ void g(d dVar) {
        em emVar;
        Context context;
        int i;
        Handler handler;
        g gVar = dVar.c;
        AMapLocationClientOption aMapLocationClientOption = dVar.a;
        if (aMapLocationClientOption == null) {
            aMapLocationClientOption = new AMapLocationClientOption();
        }
        gVar.c = aMapLocationClientOption;
        if (aMapLocationClientOption.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors && (handler = gVar.a) != null) {
            handler.removeMessages(8);
        }
        if (gVar.r != gVar.c.getGeoLanguage()) {
            synchronized (gVar.o) {
                gVar.y = null;
            }
        }
        gVar.r = gVar.c.getGeoLanguage();
        if (dVar.B && !dVar.a.getLocationMode().equals(dVar.n)) {
            dVar.k();
            dVar.j();
        }
        dVar.n = dVar.a.getLocationMode();
        if (dVar.p != null) {
            if (dVar.a.isOnceLocation()) {
                emVar = dVar.p;
                context = dVar.z;
                i = 0;
            } else {
                emVar = dVar.p;
                context = dVar.z;
                i = 1;
            }
            emVar.a(context, i);
            dVar.p.a(dVar.z, dVar.a);
        }
    }

    public static /* synthetic */ void h(d dVar) {
        try {
            if (dVar.h != null) {
                dVar.k = 0;
                Bundle bundle = new Bundle();
                bundle.putBundle("optBundle", ei.a(dVar.a));
                dVar.a(2, bundle);
                return;
            }
            int i = dVar.k + 1;
            dVar.k = i;
            if (i < 10) {
                dVar.a(1008, (Object) null, 50L);
            }
        } catch (Throwable th) {
            ei.a(th, "ALManager", "startAssistantLocationImpl");
        }
    }

    public static /* synthetic */ void i(d dVar) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBundle("optBundle", ei.a(dVar.a));
            dVar.a(3, bundle);
        } catch (Throwable th) {
            ei.a(th, "ALManager", "stopAssistantLocationImpl");
        }
    }

    private boolean i() {
        boolean z = false;
        int i = 0;
        while (this.h == null) {
            try {
                Thread.sleep(100L);
                i++;
                if (i >= 50) {
                    break;
                }
            } catch (Throwable th) {
                ei.a(th, "ALManager", "checkAPSManager");
            }
        }
        if (this.h == null) {
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            AMapLocation aMapLocation = new AMapLocation("");
            aMapLocation.setErrorCode(10);
            aMapLocation.setLocationDetail(!eo.l(this.z.getApplicationContext()) ? "请检查配置文件是否配置服务，并且manifest中service标签是否配置在application标签内#1003" : "启动ApsServcie失败#1001");
            bundle.putParcelable("loc", aMapLocation);
            messageObtain.setData(bundle);
            messageObtain.what = 1;
            this.b.sendMessage(messageObtain);
        } else {
            z = true;
        }
        if (!z) {
            em.a((String) null, !eo.l(this.z.getApplicationContext()) ? 2103 : 2101);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        if (this.a == null) {
            this.a = new AMapLocationClientOption();
        }
        if (this.B) {
            return;
        }
        this.B = true;
        int i = AnonymousClass2.a[this.a.getLocationMode().ordinal()];
        long gpsFirstTimeout = 0;
        if (i == 1) {
            a(1017, (Object) null, 0L);
            a(1016, (Object) null, 0L);
        } else {
            if (i == 2) {
                a(1016);
                a(1015, (Object) null, 0L);
                return;
            }
            if (i == 3) {
                a(1015, (Object) null, 0L);
                if (this.a.isGpsFirst() && this.a.isOnceLocation()) {
                    gpsFirstTimeout = this.a.getGpsFirstTimeout();
                }
                a(1016, (Object) null, gpsFirstTimeout);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        try {
            a(1025);
            g gVar = this.c;
            if (gVar != null) {
                gVar.a();
            }
            a(1016);
            this.B = false;
            this.k = 0;
        } catch (Throwable th) {
            ei.a(th, "ALManager", "stopLocation");
        }
    }

    private void l() {
        if (this.a.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors) {
            a(1016, (Object) null, this.a.getInterval() >= 1000 ? this.a.getInterval() : 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            if (this.i == null) {
                this.i = new Messenger(this.b);
            }
            try {
                this.z.bindService(n(), this.G, 1);
            } catch (Throwable th) {
                ei.a(th, "ALManager", "startServiceImpl");
            }
        } catch (Throwable unused) {
        }
    }

    private Intent n() {
        String apikey;
        if (this.j == null) {
            this.j = new Intent(this.z, (Class<?>) APSService.class);
        }
        try {
            apikey = !TextUtils.isEmpty(AMapLocationClientOption.getAPIKEY()) ? AMapLocationClientOption.getAPIKEY() : k.f(this.z);
        } catch (Throwable th) {
            ei.a(th, "ALManager", "startServiceImpl p2");
            apikey = "";
        }
        this.j.putExtra("a", apikey);
        this.j.putExtra("b", k.c(this.z));
        this.j.putExtra(GoogleApiAvailabilityLight.a, UmidtokenInfo.getUmidtoken());
        return this.j;
    }

    private boolean o() {
        if (eo.k(this.z)) {
            int iB = -1;
            try {
                iB = el.b(((Application) this.z.getApplicationContext()).getBaseContext(), "checkSelfPermission", "android.permission.FOREGROUND_SERVICE");
            } catch (Throwable unused) {
            }
            if (iB != 0) {
                return false;
            }
        }
        return true;
    }

    public final void a(int i, Notification notification) {
        if (i == 0 || notification == null) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("i", i);
            bundle.putParcelable("h", notification);
            a(1023, bundle, 0L);
        } catch (Throwable th) {
            ei.a(th, "ALManager", "disableBackgroundLocation");
        }
    }

    public final void a(WebView webView) {
        if (this.F == null) {
            this.F = new h(this.z, webView);
        }
        this.F.a();
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        try {
            a(1018, aMapLocationClientOption.m3278clone(), 0L);
        } catch (Throwable th) {
            ei.a(th, "ALManager", "setLocationOption");
        }
    }

    public final void a(AMapLocationListener aMapLocationListener) {
        try {
            a(1002, aMapLocationListener, 0L);
        } catch (Throwable th) {
            ei.a(th, "ALManager", "setLocationListener");
        }
    }

    public final void a(boolean z) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean(z.j, z);
            a(1024, bundle, 0L);
        } catch (Throwable th) {
            ei.a(th, "ALManager", "disableBackgroundLocation");
        }
    }

    public final boolean a() {
        return this.A;
    }

    public final void b() {
        try {
            a(1003, (Object) null, 0L);
        } catch (Throwable th) {
            ei.a(th, "ALManager", "startLocation");
        }
    }

    public final void b(AMapLocationListener aMapLocationListener) {
        try {
            a(1005, aMapLocationListener, 0L);
        } catch (Throwable th) {
            ei.a(th, "ALManager", "unRegisterLocationListener");
        }
    }

    public final void c() {
        try {
            a(1004, (Object) null, 0L);
        } catch (Throwable th) {
            ei.a(th, "ALManager", "stopLocation");
        }
    }

    public final void d() {
        try {
            h hVar = this.F;
            if (hVar != null) {
                hVar.b();
                this.F = null;
            }
            a(1011, (Object) null, 0L);
            this.m = true;
        } catch (Throwable th) {
            ei.a(th, "ALManager", "onDestroy");
        }
    }

    public final AMapLocation e() {
        AMapLocation aMapLocationB = null;
        try {
            i iVar = this.g;
            if (iVar != null && (aMapLocationB = iVar.b()) != null) {
                aMapLocationB.setTrustedLevel(3);
            }
        } catch (Throwable th) {
            ei.a(th, "ALManager", "getLastKnownLocation");
        }
        return aMapLocationB;
    }

    public final void f() {
        try {
            a(1008, (Object) null, 0L);
        } catch (Throwable th) {
            ei.a(th, "ALManager", "startAssistantLocation");
        }
    }

    public final void g() {
        try {
            h hVar = this.F;
            if (hVar != null) {
                hVar.b();
                this.F = null;
            }
            a(1009, (Object) null, 0L);
        } catch (Throwable th) {
            ei.a(th, "ALManager", "stopAssistantLocation");
        }
    }

    public final void h() {
        a(12, (Bundle) null);
        C = true;
        this.f = true;
        this.A = false;
        this.q = false;
        k();
        em emVar = this.p;
        if (emVar != null) {
            emVar.b(this.z);
        }
        em.a(this.z);
        e eVar = this.r;
        if (eVar != null) {
            eVar.d.sendEmptyMessage(11);
        } else {
            ServiceConnection serviceConnection = this.G;
            if (serviceConnection != null) {
                this.z.unbindService(serviceConnection);
            }
        }
        try {
            if (this.y) {
                this.z.stopService(n());
            }
        } catch (Throwable unused) {
        }
        this.y = false;
        ArrayList<AMapLocationListener> arrayList = this.d;
        if (arrayList != null) {
            arrayList.clear();
            this.d = null;
        }
        this.G = null;
        synchronized (this.o) {
            a aVar = this.w;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.w = null;
        }
        b bVar = this.l;
        if (bVar != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                try {
                    el.a(bVar, (Class<?>) HandlerThread.class, "quitSafely", new Object[0]);
                } catch (Throwable unused2) {
                    this.l.quit();
                }
            } else {
                bVar.quit();
            }
        }
        this.l = null;
        c cVar = this.b;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
        }
        i iVar = this.g;
        if (iVar != null) {
            iVar.c();
            this.g = null;
        }
    }
}
