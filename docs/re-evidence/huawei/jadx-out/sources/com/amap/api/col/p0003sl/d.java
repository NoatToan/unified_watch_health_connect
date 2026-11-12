package com.amap.api.col.p0003sl;

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
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.AMapLocationQualityReport;
import com.amap.api.location.APSService;
import com.amap.api.location.IReGeoLocationCallback;
import com.amap.api.location.UmidtokenInfo;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.autonavi.aps.amapapi.utils.e;
import com.autonavi.aps.amapapi.utils.g;
import com.autonavi.aps.amapapi.utils.h;
import com.autonavi.aps.amapapi.utils.i;
import com.autonavi.aps.amapapi.utils.k;
import com.huawei.common.Constant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private static boolean J = true;
    private static boolean L = false;
    private static AtomicBoolean N = new AtomicBoolean(false);
    public static volatile boolean g = false;
    private Context E;
    private g G;
    private IReGeoLocationCallback O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.autonavi.aps.amapapi.model.a f2343a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f2345c;
    j l;
    Intent o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    AMapLocationClientOption f2344b = new AMapLocationClientOption();
    h d = null;
    private k F = null;
    private boolean H = false;
    private volatile boolean I = false;
    ArrayList<AMapLocationListener> e = new ArrayList<>();
    boolean f = false;
    public boolean h = true;
    public boolean i = true;
    public boolean j = true;
    public boolean k = true;
    Messenger m = null;
    Messenger n = null;
    int p = 0;
    private boolean K = true;
    b q = null;
    boolean r = false;
    AMapLocationClientOption.AMapLocationMode s = AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
    Object t = new Object();
    i u = null;
    boolean v = false;
    e w = null;
    private boolean M = false;
    private AMapLocationClientOption P = new AMapLocationClientOption();
    private i Q = null;
    String x = null;
    private ServiceConnection R = new ServiceConnection() { // from class: com.amap.api.col.3sl.d.2
        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            d.this.m = null;
            d.this.H = false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                d.this.m = new Messenger(iBinder);
                d.this.H = true;
                d.this.v = true;
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", Constant.SERVICE_CONNECT_MESSAGE);
            }
        }
    };
    AMapLocationQualityReport y = null;
    boolean z = false;
    boolean A = false;
    private volatile boolean S = false;
    a B = null;
    String C = null;
    boolean D = false;

    public d(Context context, Intent intent, Looper looper) {
        this.o = null;
        this.E = context;
        this.o = intent;
        b(looper);
    }

    public final boolean a() {
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object obj, long j) {
        synchronized (this.t) {
            if (this.B != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = i;
                if (obj instanceof Bundle) {
                    messageObtain.setData((Bundle) obj);
                } else {
                    messageObtain.obj = obj;
                }
                this.B.sendMessageDelayed(messageObtain, j);
            }
        }
    }

    private void h() {
        synchronized (this.t) {
            a aVar = this.B;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.B = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        synchronized (this.t) {
            a aVar = this.B;
            if (aVar != null) {
                aVar.removeMessages(i);
            }
        }
    }

    private a a(Looper looper) {
        a aVar;
        synchronized (this.t) {
            aVar = new a(looper);
            this.B = aVar;
        }
        return aVar;
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        try {
            this.P = aMapLocationClientOption.m750clone();
            a(1018, aMapLocationClientOption.m750clone(), 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "setLocationOption");
        }
    }

    public final void a(AMapLocationListener aMapLocationListener) {
        try {
            a(1002, aMapLocationListener, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "setLocationListener");
        }
    }

    public final void b(AMapLocationListener aMapLocationListener) {
        try {
            a(1005, aMapLocationListener, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "unRegisterLocationListener");
        }
    }

    public final void b() {
        c cVar;
        try {
            if (this.P.getCacheCallBack() && (cVar = this.f2345c) != null) {
                cVar.sendEmptyMessageDelayed(13, this.P.getCacheCallBackTime());
            }
        } catch (Throwable unused) {
        }
        try {
            a(1003, (Object) null, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "startLocation");
        }
    }

    public final void c() {
        try {
            a(1004, (Object) null, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "stopLocation");
        }
    }

    public final void a(IReGeoLocationCallback iReGeoLocationCallback) {
        this.O = iReGeoLocationCallback;
    }

    public final void a(AMapLocation aMapLocation) {
        if (aMapLocation == null) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable("loc", aMapLocation);
            a(19, bundle);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "AMClt", "gReGeoL");
        }
    }

    public final void d() {
        try {
            i iVar = this.Q;
            if (iVar != null) {
                iVar.b();
                this.Q = null;
            }
            a(1011, (Object) null, 0L);
            this.r = true;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "onDestroy");
        }
    }

    public final AMapLocation e() {
        AMapLocation aMapLocationB = null;
        try {
            j jVar = this.l;
            if (jVar != null && (aMapLocationB = jVar.b()) != null) {
                aMapLocationB.setTrustedLevel(3);
            }
            return aMapLocationB;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "getLastKnownLocation");
            return aMapLocationB;
        }
    }

    public final void a(WebView webView) {
        if (this.Q == null) {
            this.Q = new i(this.E, webView);
        }
        this.Q.a();
    }

    public final void f() {
        try {
            i iVar = this.Q;
            if (iVar != null) {
                iVar.b();
                this.Q = null;
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "stopAssistantLocation");
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0029 -> B:31:0x002e). Please report as a decompilation issue!!! */
    private void b(Looper looper) {
        try {
            if (looper == null) {
                if (Looper.myLooper() == null) {
                    this.f2345c = new c(this.E.getMainLooper());
                } else {
                    this.f2345c = new c();
                }
            } else {
                this.f2345c = new c(looper);
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "init 1");
        }
        try {
            try {
                this.l = new j(this.E);
            } catch (Throwable th2) {
                com.autonavi.aps.amapapi.utils.c.a(th2, "ALManager", "init 2");
            }
            b bVar = new b("amapLocManagerThread", this);
            this.q = bVar;
            bVar.setPriority(5);
            this.q.start();
            this.B = a(this.q.getLooper());
        } catch (Throwable th3) {
            com.autonavi.aps.amapapi.utils.c.a(th3, "ALManager", "init 5");
        }
        try {
            this.d = new h(this.E, this.f2345c);
            this.F = new k(this.E, this.f2345c);
            this.G = new g(this.E, this.f2345c);
        } catch (Throwable th4) {
            com.autonavi.aps.amapapi.utils.c.a(th4, "ALManager", "init 3");
        }
        if (this.u == null) {
            this.u = new i();
        }
        a(this.E);
    }

    private static void a(final Context context) {
        if (N.compareAndSet(false, true)) {
            ma.a().a(new mb() { // from class: com.amap.api.col.3sl.d.1
                @Override // com.amap.api.col.p0003sl.mb
                public final void runTask() {
                    ip.l();
                    ip.a(context);
                    ip.f(context);
                }
            });
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
                    this.m = null;
                    this.H = false;
                }
                com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "sendLocMessage");
                return;
            }
        }
        if (TextUtils.isEmpty(this.x)) {
            this.x = com.autonavi.aps.amapapi.utils.c.b(this.E);
        }
        bundle.putString("c", this.x);
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.n;
        Messenger messenger = this.m;
        if (messenger != null) {
            messenger.send(messageObtain);
        }
    }

    private boolean i() {
        boolean z = false;
        int i = 0;
        while (this.m == null) {
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
        if (this.m == null) {
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            AMapLocation aMapLocation = new AMapLocation("");
            aMapLocation.setErrorCode(10);
            if (!k.k(this.E.getApplicationContext())) {
                aMapLocation.setLocationDetail("请检查配置文件是否配置服务，并且manifest中service标签是否配置在application标签内#1003");
            } else {
                aMapLocation.setLocationDetail("启动ApsServcie失败#1001");
            }
            bundle.putParcelable("loc", aMapLocation);
            messageObtain.setData(bundle);
            messageObtain.what = 1;
            this.f2345c.sendMessage(messageObtain);
        } else {
            z = true;
        }
        if (!z) {
            if (!k.k(this.E.getApplicationContext())) {
                i.a((String) null, 2103);
            } else {
                i.a((String) null, 2101);
            }
        }
        return z;
    }

    private void a(Intent intent) {
        try {
            this.E.bindService(intent, this.R, 1);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "startServiceImpl");
        }
    }

    public final class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        public c() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                super.handleMessage(message);
                if (d.this.r) {
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    Message messageObtainMessage = d.this.B.obtainMessage();
                    messageObtainMessage.what = 11;
                    messageObtainMessage.setData(message.getData());
                    d.this.B.sendMessage(messageObtainMessage);
                    return;
                }
                if (i != 2) {
                    switch (i) {
                        case 5:
                            Bundle data = message.getData();
                            data.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(d.this.f2344b));
                            d.this.a(10, data);
                            return;
                        case 6:
                            Bundle data2 = message.getData();
                            if (d.this.d != null) {
                                d.this.d.a(data2);
                                return;
                            }
                            return;
                        case 7:
                            d.this.K = message.getData().getBoolean("ngpsAble");
                            return;
                        case 8:
                            i.a((String) null, 2141);
                            break;
                        case 9:
                            boolean unused = d.L = message.getData().getBoolean("installMockApp");
                            return;
                        case 10:
                            d.this.b((AMapLocation) message.obj);
                            return;
                        default:
                            switch (i) {
                                case 13:
                                    if (d.this.f2343a != null) {
                                        d dVar = d.this;
                                        dVar.b(dVar.f2343a);
                                        return;
                                    } else {
                                        AMapLocation aMapLocation = new AMapLocation("LBS");
                                        aMapLocation.setErrorCode(33);
                                        d.this.b(aMapLocation);
                                        return;
                                    }
                                case 14:
                                    Bundle data3 = message.getData();
                                    data3.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(d.this.f2344b));
                                    d.this.a(18, data3);
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
                                            if (d.this.F != null) {
                                                d.this.F.a(data4);
                                                return;
                                            }
                                            return;
                                        case 19:
                                            AMapLocation aMapLocation2 = (AMapLocation) message.getData().getParcelable("loc");
                                            if (aMapLocation2 == null || d.this.O == null) {
                                                return;
                                            }
                                            d.this.O.onReGeoLocation(aMapLocation2);
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
                                                    data5.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(d.this.f2344b));
                                                    d.this.a(15, data5);
                                                    return;
                                                case 103:
                                                    Bundle data6 = message.getData();
                                                    if (d.this.G != null) {
                                                        d.this.G.a(data6);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    return;
                                            }
                                            Message messageObtain = Message.obtain();
                                            messageObtain.what = 1028;
                                            messageObtain.obj = message.obj;
                                            d.this.B.sendMessage(messageObtain);
                                            if (d.this.P == null || !d.this.P.getCacheCallBack() || d.this.f2345c == null) {
                                                return;
                                            }
                                            d.this.f2345c.removeMessages(13);
                                            return;
                                    }
                                    break;
                            }
                            Message messageObtain2 = Message.obtain();
                            messageObtain2.what = 16;
                            messageObtain2.obj = message.obj;
                            d.this.B.sendMessage(messageObtain2);
                            return;
                    }
                }
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 12;
                messageObtain3.obj = message.obj;
                d.this.B.sendMessage(messageObtain3);
                if (d.this.P == null || !d.this.P.getCacheCallBack() || d.this.f2345c == null) {
                    return;
                }
                d.this.f2345c.removeMessages(13);
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "AmapLocationManager$MainHandler", 0 == 0 ? "handleMessage" : null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AMapLocation aMapLocation) {
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
            if (GeocodeSearch.GPS.equalsIgnoreCase(aMapLocation.getProvider()) || !this.d.b() || "network".equalsIgnoreCase(aMapLocation.getProvider()) || !this.F.c()) {
                aMapLocation.setAltitude(k.c(aMapLocation.getAltitude()));
                aMapLocation.setBearing(k.a(aMapLocation.getBearing()));
                aMapLocation.setSpeed(k.a(aMapLocation.getSpeed()));
                d(aMapLocation);
                c(aMapLocation);
                aMapLocation.getProvider();
                aMapLocation.getLongitude();
                aMapLocation.getLatitude();
                e.c();
                Iterator<AMapLocationListener> it = this.e.iterator();
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

    private static void c(AMapLocation aMapLocation) {
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

    private void d(AMapLocation aMapLocation) {
        StringBuilder sb;
        if (aMapLocation != null) {
            try {
                String locationDetail = aMapLocation.getLocationDetail();
                if (TextUtils.isEmpty(locationDetail)) {
                    sb = new StringBuilder();
                } else {
                    sb = new StringBuilder(locationDetail);
                }
                boolean zC = k.c(this.E, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF");
                boolean zC2 = k.c(this.E, "WYW5kcm9pZC5wZXJtaXNzaW9uLkNIQU5HRV9XSUZJX1NUQVRF");
                boolean zC3 = k.c(this.E, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==");
                boolean zC4 = k.c(this.E, "EYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=");
                boolean zC5 = k.c(this.E, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O");
                boolean zC6 = k.c(this.E, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=");
                sb.append(zC ? "#pm1" : "#pm0");
                sb.append(zC2 ? "1" : "0");
                sb.append(zC3 ? "1" : "0");
                sb.append(zC4 ? "1" : "0");
                sb.append(zC5 ? "1" : "0");
                sb.append(zC6 ? "1" : "0");
                aMapLocation.setLocationDetail(sb.toString());
            } catch (Throwable unused) {
                e.b();
            }
        }
    }

    private void e(AMapLocation aMapLocation) {
        Message messageObtainMessage = this.f2345c.obtainMessage();
        messageObtainMessage.what = 10;
        messageObtainMessage.obj = aMapLocation;
        this.f2345c.sendMessage(messageObtainMessage);
    }

    private void f(AMapLocation aMapLocation) {
        synchronized (this) {
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
            if (this.y == null) {
                this.y = new AMapLocationQualityReport();
            }
            this.y.setLocationMode(this.f2344b.getLocationMode());
            if (this.G != null) {
                this.y.setGPSSatellites(aMapLocation.getSatellites());
                this.y.setGpsStatus(this.G.b());
            }
            this.y.setWifiAble(k.g(this.E));
            this.y.setNetworkType(k.h(this.E));
            this.y.setNetUseTime(0L);
            this.y.setInstallHighDangerMockApp(L);
            aMapLocation.setLocationQualityReport(this.y);
            try {
                if (this.I) {
                    i.a(this.E, aMapLocation);
                    e(aMapLocation.m749clone());
                    h.a(this.E).a(aMapLocation);
                    h.a(this.E).b();
                }
            } catch (Throwable th2) {
                com.autonavi.aps.amapapi.utils.c.a(th2, "ALManager", "handlerCoarseLocation part");
            }
            if (this.r) {
                return;
            }
            if (this.G != null) {
                l();
            }
            a(14, (Bundle) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AMapLocation aMapLocation, com.autonavi.aps.amapapi.a aVar) {
        synchronized (this) {
            try {
                e.c();
                if (aMapLocation == null) {
                    aMapLocation = new AMapLocation("");
                    aMapLocation.setErrorCode(8);
                    aMapLocation.setLocationDetail("amapLocation is null#0801");
                }
                if (this.y == null) {
                    this.y = new AMapLocationQualityReport();
                }
                this.y.setLocationMode(this.f2344b.getLocationMode());
                h hVar = this.d;
                if (hVar != null) {
                    this.y.setGPSSatellites(hVar.e());
                    this.y.setGpsStatus(this.d.d());
                }
                this.y.setWifiAble(k.g(this.E));
                this.y.setNetworkType(k.h(this.E));
                if (aMapLocation.getLocationType() == 1 || GeocodeSearch.GPS.equalsIgnoreCase(aMapLocation.getProvider())) {
                    this.y.setNetUseTime(0L);
                }
                if (aVar != null) {
                    this.y.setNetUseTime(aVar.a());
                }
                this.y.setInstallHighDangerMockApp(L);
                aMapLocation.setLocationQualityReport(this.y);
                try {
                    if (this.I) {
                        a(aMapLocation, this.C);
                        if (aVar != null) {
                            aVar.d(k.b());
                        }
                        i.a(this.E, aMapLocation, aVar);
                        i.a(this.E, aMapLocation);
                        e(aMapLocation.m749clone());
                        h.a(this.E).a(aMapLocation);
                        h.a(this.E).b();
                    }
                } catch (Throwable th) {
                    com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "handlerLocation part2");
                }
                if (this.r) {
                    return;
                }
                if (this.f2344b.isOnceLocation()) {
                    l();
                    a(14, (Bundle) null);
                }
            } catch (Throwable th2) {
                com.autonavi.aps.amapapi.utils.c.a(th2, "ALManager", "handlerLocation part3");
            }
        }
    }

    private void a(AMapLocation aMapLocation, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("loc", aMapLocation);
        bundle.putString("lastLocNb", str);
        a(1014, bundle, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        try {
            Bundle data = message.getData();
            AMapLocation aMapLocation = (AMapLocation) data.getParcelable("loc");
            String string = data.getString("lastLocNb");
            g(aMapLocation);
            if (this.l.a(aMapLocation, string)) {
                this.l.d();
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "doSaveLastLocation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(AMapLocationListener aMapLocationListener) {
        if (aMapLocationListener == null) {
            throw new IllegalArgumentException("listener参数不能为null");
        }
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        if (this.e.contains(aMapLocationListener)) {
            return;
        }
        this.e.add(aMapLocationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this) {
            if ((Build.VERSION.SDK_INT < 29 && !k.c(this.E, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=") && !k.c(this.E, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")) || ((Build.VERSION.SDK_INT < 31 && Build.VERSION.SDK_INT >= 29 && this.E.getApplicationInfo().targetSdkVersion >= 29 && !k.c(this.E, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")) || ((Build.VERSION.SDK_INT < 31 && Build.VERSION.SDK_INT >= 29 && this.E.getApplicationInfo().targetSdkVersion < 29 && !k.c(this.E, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=") && !k.c(this.E, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")) || (Build.VERSION.SDK_INT >= 31 && !k.c(this.E, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=") && !k.c(this.E, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O"))))) {
                k();
                return;
            }
            if (this.f2344b == null) {
                this.f2344b = new AMapLocationClientOption();
            }
            if (this.I) {
                return;
            }
            this.I = true;
            e.c();
            long gpsFirstTimeout = 0;
            a(1029, (Object) null, 0L);
            int i = AnonymousClass3.f2348a[this.f2344b.getLocationMode().ordinal()];
            if (i == 1) {
                a(1027, (Object) null, 0L);
                a(1017, (Object) null, 0L);
                a(1016, (Object) null, 0L);
                a(AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED, (Object) null, 0L);
                return;
            }
            if (i == 2) {
                if (k.m(this.E)) {
                    a(1016);
                    a(1017, (Object) null, 0L);
                    a(AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED, (Object) null, 0L);
                    a(1026, (Object) null, 0L);
                    return;
                }
                a(1016);
                a(1027, (Object) null, 0L);
                a(AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED, (Object) null, 0L);
                a(1015, (Object) null, 0L);
                return;
            }
            if (i == 3) {
                if (k.m(this.E)) {
                    a(1016);
                    a(1017, (Object) null, 0L);
                    a(AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED, (Object) null, 0L);
                    a(1026, (Object) null, 0L);
                    return;
                }
                a(1027, (Object) null, 0L);
                a(1015, (Object) null, 0L);
                if (this.f2344b.isGpsFirst() && this.f2344b.isOnceLocation()) {
                    gpsFirstTimeout = this.f2344b.getGpsFirstTimeout();
                }
                a(1016, (Object) null, gpsFirstTimeout);
                a(AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED, (Object) null, gpsFirstTimeout);
            }
        }
    }

    /* JADX INFO: renamed from: com.amap.api.col.3sl.d$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2348a;

        static {
            int[] iArr = new int[AMapLocationClientOption.AMapLocationMode.values().length];
            f2348a = iArr;
            try {
                iArr[AMapLocationClientOption.AMapLocationMode.Battery_Saving.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2348a[AMapLocationClientOption.AMapLocationMode.Device_Sensors.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2348a[AMapLocationClientOption.AMapLocationMode.Hight_Accuracy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void k() {
        AMapLocation aMapLocation = new AMapLocation("");
        aMapLocation.setErrorCode(12);
        aMapLocation.setLocationDetail("定位权限被禁用,请授予应用定位权限 #1201");
        if (this.y == null) {
            this.y = new AMapLocationQualityReport();
        }
        AMapLocationQualityReport aMapLocationQualityReport = new AMapLocationQualityReport();
        this.y = aMapLocationQualityReport;
        aMapLocationQualityReport.setGpsStatus(4);
        this.y.setGPSSatellites(0);
        this.y.setLocationMode(this.f2344b.getLocationMode());
        this.y.setWifiAble(k.g(this.E));
        this.y.setNetworkType(k.h(this.E));
        this.y.setNetUseTime(0L);
        aMapLocation.setLocationQualityReport(this.y);
        i.a((String) null, 2121);
        e(aMapLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            e.c();
            a(1025);
            a(1033);
            h hVar = this.d;
            if (hVar != null) {
                hVar.a();
            }
            k kVar = this.F;
            if (kVar != null) {
                kVar.a();
            }
            g gVar = this.G;
            if (gVar != null) {
                gVar.a();
            }
            a(1016);
            a(1030, (Object) null, 0L);
            this.I = false;
            this.p = 0;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "stopLocation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(AMapLocationListener aMapLocationListener) {
        if (!this.e.isEmpty() && this.e.contains(aMapLocationListener)) {
            this.e.remove(aMapLocationListener);
        }
        if (this.e.isEmpty()) {
            l();
        }
    }

    final void g() {
        a(12, (Bundle) null);
        this.h = true;
        this.j = true;
        this.i = true;
        this.k = true;
        this.H = false;
        this.v = false;
        l();
        i iVar = this.u;
        if (iVar != null) {
            iVar.b(this.E);
        }
        h.a(this.E).a();
        i.a(this.E);
        e eVar = this.w;
        if (eVar != null) {
            eVar.b().sendEmptyMessage(11);
        } else {
            ServiceConnection serviceConnection = this.R;
            if (serviceConnection != null) {
                this.E.unbindService(serviceConnection);
            }
        }
        try {
            if (this.D) {
                this.E.stopService(q());
            }
        } catch (Throwable unused) {
        }
        this.D = false;
        ArrayList<AMapLocationListener> arrayList = this.e;
        if (arrayList != null) {
            arrayList.clear();
            this.e = null;
        }
        this.R = null;
        h();
        b bVar = this.q;
        if (bVar != null) {
            try {
                g.a(bVar, (Class<?>) HandlerThread.class, "quitSafely", new Object[0]);
            } catch (Throwable unused2) {
                this.q.quit();
            }
        }
        this.q = null;
        c cVar = this.f2345c;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
        }
        j jVar = this.l;
        if (jVar != null) {
            jVar.c();
            this.l = null;
        }
    }

    private void m() {
        String str;
        com.autonavi.aps.amapapi.model.a aVarB = b(new com.autonavi.aps.amapapi.b(true));
        if (i()) {
            Bundle bundle = new Bundle();
            if (aVarB != null && (aVarB.getLocationType() == 2 || aVarB.getLocationType() == 4)) {
                str = "1";
            } else {
                str = "0";
            }
            bundle.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(this.f2344b));
            bundle.putString("isCacheLoc", str);
            a(0, bundle);
            if (this.I) {
                a(13, (Bundle) null);
            }
        }
    }

    private void a(com.autonavi.aps.amapapi.b bVar, com.autonavi.aps.amapapi.a aVar) {
        try {
            bVar.a(this.E);
            bVar.a(this.f2344b);
            bVar.b(aVar);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "initApsBase");
        }
    }

    private com.autonavi.aps.amapapi.model.a a(com.autonavi.aps.amapapi.b bVar, boolean z) {
        if (!this.f2344b.isLocationCacheEnable()) {
            return null;
        }
        try {
            return bVar.b(z);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "doFirstCacheLoc");
            return null;
        }
    }

    private static void a(com.autonavi.aps.amapapi.b bVar) {
        try {
            bVar.d();
            bVar.a(new AMapLocationClientOption().setNeedAddress(false));
            bVar.a(true, new com.autonavi.aps.amapapi.a());
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "apsLocation:doFirstNetLocate 2");
        }
    }

    private static void a(com.autonavi.aps.amapapi.b bVar, com.autonavi.aps.amapapi.model.a aVar) {
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

    /* JADX WARN: Code duplicated, block: B:108:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00e8 A[EXC_TOP_SPLITTER, PHI: r1
      0x00e8: PHI (r1v8 com.amap.api.location.AMapLocation) = 
      (r1v6 com.amap.api.location.AMapLocation)
      (r1v6 com.amap.api.location.AMapLocation)
      (r1v6 com.amap.api.location.AMapLocation)
      (r1v13 com.amap.api.location.AMapLocation)
     binds: [B:64:0x00e3, B:58:0x00d1, B:60:0x00d5, B:61:0x00d7] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #9 {all -> 0x0035, blocks: (B:10:0x0027, B:12:0x0031), top: B:115:0x0027, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x003b A[Catch: all -> 0x0135, TRY_LEAVE, TryCatch #10 {all -> 0x0135, blocks: (B:3:0x000a, B:16:0x003b, B:35:0x0092, B:15:0x0036, B:9:0x0022, B:4:0x0011, B:6:0x001b, B:18:0x0043, B:20:0x004b, B:22:0x0057, B:25:0x0062, B:27:0x006a, B:29:0x007f, B:31:0x0084, B:32:0x008c, B:10:0x0027, B:12:0x0031), top: B:117:0x000a, inners: #1, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b A[Catch: all -> 0x0091, TryCatch #7 {all -> 0x0091, blocks: (B:18:0x0043, B:20:0x004b, B:22:0x0057, B:25:0x0062, B:27:0x006a, B:29:0x007f, B:31:0x0084, B:32:0x008c), top: B:112:0x0043, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[Catch: all -> 0x0091, TryCatch #7 {all -> 0x0091, blocks: (B:18:0x0043, B:20:0x004b, B:22:0x0057, B:25:0x0062, B:27:0x006a, B:29:0x007f, B:31:0x0084, B:32:0x008c), top: B:112:0x0043, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[Catch: all -> 0x0091, TryCatch #7 {all -> 0x0091, blocks: (B:18:0x0043, B:20:0x004b, B:22:0x0057, B:25:0x0062, B:27:0x006a, B:29:0x007f, B:31:0x0084, B:32:0x008c), top: B:112:0x0043, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[Catch: all -> 0x0091, TryCatch #7 {all -> 0x0091, blocks: (B:18:0x0043, B:20:0x004b, B:22:0x0057, B:25:0x0062, B:27:0x006a, B:29:0x007f, B:31:0x0084, B:32:0x008c), top: B:112:0x0043, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x007f A[Catch: all -> 0x0091, TryCatch #7 {all -> 0x0091, blocks: (B:18:0x0043, B:20:0x004b, B:22:0x0057, B:25:0x0062, B:27:0x006a, B:29:0x007f, B:31:0x0084, B:32:0x008c), top: B:112:0x0043, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[Catch: all -> 0x0091, TRY_LEAVE, TryCatch #7 {all -> 0x0091, blocks: (B:18:0x0043, B:20:0x004b, B:22:0x0057, B:25:0x0062, B:27:0x006a, B:29:0x007f, B:31:0x0084, B:32:0x008c), top: B:112:0x0043, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3 A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #6 {all -> 0x00ab, blocks: (B:40:0x009d, B:42:0x00a3), top: B:110:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d3 A[Catch: all -> 0x00e2, TryCatch #3 {all -> 0x00e2, blocks: (B:57:0x00cb, B:59:0x00d3, B:61:0x00d7), top: B:104:0x00cb, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0 A[Catch: all -> 0x00f9, TryCatch #11 {all -> 0x00f9, blocks: (B:65:0x00e8, B:67:0x00f0, B:69:0x00f4), top: B:118:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0100 A[Catch: all -> 0x011f, TryCatch #12 {all -> 0x011f, blocks: (B:70:0x00f9, B:72:0x0100, B:73:0x0116, B:75:0x011b), top: B:120:0x00f9, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x011b A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #12 {all -> 0x011f, blocks: (B:70:0x00f9, B:72:0x0100, B:73:0x0116, B:75:0x011b), top: B:120:0x00f9, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0127 A[ADDED_TO_REGION] */
    private com.autonavi.aps.amapapi.model.a b(com.autonavi.aps.amapapi.b bVar) {
        com.autonavi.aps.amapapi.model.a aVarA;
        Throwable th;
        com.autonavi.aps.amapapi.model.a aVar;
        boolean zM;
        boolean z;
        boolean z2;
        String strK;
        Bundle bundle;
        c cVar;
        j jVar;
        long jA;
        String umidtoken;
        AMapLocation aMapLocationClone = null;
        this.f2343a = null;
        com.autonavi.aps.amapapi.a aVar2 = new com.autonavi.aps.amapapi.a();
        try {
            try {
                aVar2.c(k.b());
                try {
                    String apikey = AMapLocationClientOption.getAPIKEY();
                    if (!TextUtils.isEmpty(apikey)) {
                        im.a(this.E, apikey);
                        try {
                            umidtoken = UmidtokenInfo.getUmidtoken();
                            if (!TextUtils.isEmpty(umidtoken)) {
                                ip.a(umidtoken);
                                a(bVar, aVar2);
                                zM = com.autonavi.aps.amapapi.utils.b.m();
                                z = false;
                                try {
                                    if (this.P.getCacheCallBack()) {
                                        aVarA = a(bVar, this.P.getCacheCallBack());
                                        if (aVarA == null) {
                                            aVarA = null;
                                        } else if (!com.autonavi.aps.amapapi.utils.b.a(aVarA.getTime())) {
                                            if (this.P.getCacheCallBack()) {
                                                int cacheTimeOut = this.P.getCacheTimeOut();
                                                jA = k.a() - aVarA.getTime();
                                                if (jA > 0 && jA < cacheTimeOut) {
                                                    this.f2343a = aVarA;
                                                    aVarA.setLocationType(10);
                                                }
                                            }
                                            aVarA = null;
                                        }
                                    } else {
                                        aVarA = a(bVar, false);
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
                                            try {
                                                com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "apsLocation");
                                                aVar = aVarA;
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
                                        aMapLocationClone = aVar.m749clone();
                                    } catch (Throwable th5) {
                                        th = th5;
                                        aVarA = aVar;
                                        com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "apsLocation");
                                        aVar = aVarA;
                                    }
                                } else {
                                    strK = null;
                                }
                                try {
                                    if (!this.f2344b.isLocationCacheEnable() && (jVar = this.l) != null) {
                                        aMapLocationClone = jVar.a(aMapLocationClone, strK, this.f2344b.getLastLocationLifeCycle());
                                        if (this.P.getCacheCallBack()) {
                                            cVar.removeMessages(13);
                                        }
                                        bundle = new Bundle();
                                        if (aMapLocationClone != null) {
                                            bundle.putParcelable("loc", aMapLocationClone);
                                            bundle.putString("nb", aVar.k());
                                            bundle.putParcelable("statics", aVar2);
                                        }
                                        a(bundle);
                                        if (z2) {
                                            a(bVar, aVar);
                                            if (z) {
                                                g = true;
                                                a(bVar);
                                            }
                                        } else if (z) {
                                            g = true;
                                            a(bVar);
                                        }
                                    } else {
                                        try {
                                            if (this.P.getCacheCallBack() && (cVar = this.f2345c) != null) {
                                                cVar.removeMessages(13);
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                        try {
                                            bundle = new Bundle();
                                            if (aMapLocationClone != null) {
                                                bundle.putParcelable("loc", aMapLocationClone);
                                                bundle.putString("nb", aVar.k());
                                                bundle.putParcelable("statics", aVar2);
                                            }
                                            a(bundle);
                                            if (z2) {
                                                a(bVar, aVar);
                                                if (z && zM && !g) {
                                                    g = true;
                                                    a(bVar);
                                                }
                                            } else if (z) {
                                                g = true;
                                                a(bVar);
                                            }
                                        } catch (Throwable th6) {
                                            com.autonavi.aps.amapapi.utils.c.a(th6, "ALManager", "apsLocation:callback");
                                        }
                                    }
                                } catch (Throwable th7) {
                                    com.autonavi.aps.amapapi.utils.c.a(th7, "ALManager", "fixLastLocation");
                                }
                            } else {
                                a(bVar, aVar2);
                                zM = com.autonavi.aps.amapapi.utils.b.m();
                                z = false;
                                if (this.P.getCacheCallBack()) {
                                    aVarA = a(bVar, this.P.getCacheCallBack());
                                    if (aVarA == null) {
                                        aVarA = null;
                                    } else if (!com.autonavi.aps.amapapi.utils.b.a(aVarA.getTime())) {
                                        if (this.P.getCacheCallBack()) {
                                            int cacheTimeOut2 = this.P.getCacheTimeOut();
                                            jA = k.a() - aVarA.getTime();
                                            if (jA > 0) {
                                                this.f2343a = aVarA;
                                                aVarA.setLocationType(10);
                                            }
                                        }
                                        aVarA = null;
                                    }
                                } else {
                                    aVarA = a(bVar, false);
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
                                    aMapLocationClone = aVar.m749clone();
                                } else {
                                    strK = null;
                                }
                                if (!this.f2344b.isLocationCacheEnable()) {
                                    if (this.P.getCacheCallBack()) {
                                        cVar.removeMessages(13);
                                    }
                                    bundle = new Bundle();
                                    if (aMapLocationClone != null) {
                                        bundle.putParcelable("loc", aMapLocationClone);
                                        bundle.putString("nb", aVar.k());
                                        bundle.putParcelable("statics", aVar2);
                                    }
                                    a(bundle);
                                    if (z2) {
                                        a(bVar, aVar);
                                        if (z) {
                                            g = true;
                                            a(bVar);
                                        }
                                    } else if (z) {
                                        g = true;
                                        a(bVar);
                                    }
                                } else {
                                    if (this.P.getCacheCallBack()) {
                                        cVar.removeMessages(13);
                                    }
                                    bundle = new Bundle();
                                    if (aMapLocationClone != null) {
                                        bundle.putParcelable("loc", aMapLocationClone);
                                        bundle.putString("nb", aVar.k());
                                        bundle.putParcelable("statics", aVar2);
                                    }
                                    a(bundle);
                                    if (z2) {
                                        a(bVar, aVar);
                                        if (z) {
                                            g = true;
                                            a(bVar);
                                        }
                                    } else if (z) {
                                        g = true;
                                        a(bVar);
                                    }
                                }
                            }
                        } catch (Throwable th8) {
                            com.autonavi.aps.amapapi.utils.c.a(th8, "ALManager", "apsLocation setUmidToken");
                        }
                    } else {
                        umidtoken = UmidtokenInfo.getUmidtoken();
                        if (!TextUtils.isEmpty(umidtoken)) {
                            ip.a(umidtoken);
                            a(bVar, aVar2);
                            zM = com.autonavi.aps.amapapi.utils.b.m();
                            z = false;
                            if (this.P.getCacheCallBack()) {
                                aVarA = a(bVar, this.P.getCacheCallBack());
                                if (aVarA == null) {
                                    aVarA = null;
                                } else if (!com.autonavi.aps.amapapi.utils.b.a(aVarA.getTime())) {
                                    if (this.P.getCacheCallBack()) {
                                        int cacheTimeOut3 = this.P.getCacheTimeOut();
                                        jA = k.a() - aVarA.getTime();
                                        if (jA > 0) {
                                            this.f2343a = aVarA;
                                            aVarA.setLocationType(10);
                                        }
                                    }
                                    aVarA = null;
                                }
                            } else {
                                aVarA = a(bVar, false);
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
                                aMapLocationClone = aVar.m749clone();
                            } else {
                                strK = null;
                            }
                            if (!this.f2344b.isLocationCacheEnable()) {
                                if (this.P.getCacheCallBack()) {
                                    cVar.removeMessages(13);
                                }
                                bundle = new Bundle();
                                if (aMapLocationClone != null) {
                                    bundle.putParcelable("loc", aMapLocationClone);
                                    bundle.putString("nb", aVar.k());
                                    bundle.putParcelable("statics", aVar2);
                                }
                                a(bundle);
                                if (z2) {
                                    a(bVar, aVar);
                                    if (z) {
                                        g = true;
                                        a(bVar);
                                    }
                                } else if (z) {
                                    g = true;
                                    a(bVar);
                                }
                            } else {
                                if (this.P.getCacheCallBack()) {
                                    cVar.removeMessages(13);
                                }
                                bundle = new Bundle();
                                if (aMapLocationClone != null) {
                                    bundle.putParcelable("loc", aMapLocationClone);
                                    bundle.putString("nb", aVar.k());
                                    bundle.putParcelable("statics", aVar2);
                                }
                                a(bundle);
                                if (z2) {
                                    a(bVar, aVar);
                                    if (z) {
                                        g = true;
                                        a(bVar);
                                    }
                                } else if (z) {
                                    g = true;
                                    a(bVar);
                                }
                            }
                        } else {
                            a(bVar, aVar2);
                            zM = com.autonavi.aps.amapapi.utils.b.m();
                            z = false;
                            if (this.P.getCacheCallBack()) {
                                aVarA = a(bVar, this.P.getCacheCallBack());
                                if (aVarA == null) {
                                    aVarA = null;
                                } else if (!com.autonavi.aps.amapapi.utils.b.a(aVarA.getTime())) {
                                    if (this.P.getCacheCallBack()) {
                                        int cacheTimeOut4 = this.P.getCacheTimeOut();
                                        jA = k.a() - aVarA.getTime();
                                        if (jA > 0) {
                                            this.f2343a = aVarA;
                                            aVarA.setLocationType(10);
                                        }
                                    }
                                    aVarA = null;
                                }
                            } else {
                                aVarA = a(bVar, false);
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
                                aMapLocationClone = aVar.m749clone();
                            } else {
                                strK = null;
                            }
                            if (!this.f2344b.isLocationCacheEnable()) {
                                if (this.P.getCacheCallBack()) {
                                    cVar.removeMessages(13);
                                }
                                bundle = new Bundle();
                                if (aMapLocationClone != null) {
                                    bundle.putParcelable("loc", aMapLocationClone);
                                    bundle.putString("nb", aVar.k());
                                    bundle.putParcelable("statics", aVar2);
                                }
                                a(bundle);
                                if (z2) {
                                    a(bVar, aVar);
                                    if (z) {
                                        g = true;
                                        a(bVar);
                                    }
                                } else if (z) {
                                    g = true;
                                    a(bVar);
                                }
                            } else {
                                if (this.P.getCacheCallBack()) {
                                    cVar.removeMessages(13);
                                }
                                bundle = new Bundle();
                                if (aMapLocationClone != null) {
                                    bundle.putParcelable("loc", aMapLocationClone);
                                    bundle.putString("nb", aVar.k());
                                    bundle.putParcelable("statics", aVar2);
                                }
                                a(bundle);
                                if (z2) {
                                    a(bVar, aVar);
                                    if (z) {
                                        g = true;
                                        a(bVar);
                                    }
                                } else if (z) {
                                    g = true;
                                    a(bVar);
                                }
                            }
                        }
                    }
                } catch (Throwable th9) {
                    com.autonavi.aps.amapapi.utils.c.a(th9, "ALManager", "apsLocation setAuthKey");
                }
            } catch (Throwable th10) {
                aVarA = null;
                th = th10;
                com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "apsLocation");
                aVar = aVarA;
                return aVar;
            }
        } catch (Throwable unused3) {
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            if (this.f2344b.isLBSLocationEnable()) {
                try {
                    if (J || (!this.v && !this.S)) {
                        J = false;
                        this.S = true;
                        m();
                    } else {
                        try {
                            if (this.v && !a() && !this.A) {
                                this.A = true;
                                p();
                            }
                        } catch (Throwable th) {
                            this.A = true;
                            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "doLBSLocation reStartService");
                        }
                        if (i()) {
                            this.A = false;
                            Bundle bundle = new Bundle();
                            bundle.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(this.f2344b));
                            bundle.putString("d", UmidtokenInfo.getUmidtoken());
                            if (!this.d.b()) {
                                a(1, bundle);
                            }
                        }
                    }
                    if (this.f2344b.isOnceLocation()) {
                        return;
                    }
                } catch (Throwable th2) {
                    try {
                        com.autonavi.aps.amapapi.utils.c.a(th2, "ALManager", "doLBSLocation");
                        if (this.f2344b.isOnceLocation()) {
                            return;
                        }
                    } catch (Throwable th3) {
                        try {
                            if (!this.f2344b.isOnceLocation()) {
                                o();
                            }
                        } catch (Throwable unused) {
                        }
                        throw th3;
                    }
                }
                o();
            }
        } catch (Throwable unused2) {
        }
    }

    private void o() {
        if (this.f2344b.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors) {
            a(1016, (Object) null, this.f2344b.getInterval() >= 1000 ? this.f2344b.getInterval() : 1000L);
        }
    }

    static final class b extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        d f2350a;

        public b(String str, d dVar) {
            super(str);
            this.f2350a = dVar;
        }

        @Override // android.os.HandlerThread
        protected final void onLooperPrepared() {
            try {
                this.f2350a.l.a();
                h.a(this.f2350a.E);
                this.f2350a.p();
                d dVar = this.f2350a;
                if (dVar != null && dVar.E != null) {
                    com.autonavi.aps.amapapi.utils.b.b(this.f2350a.E);
                    com.autonavi.aps.amapapi.utils.b.a(this.f2350a.E);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        try {
            if (this.n == null) {
                this.n = new Messenger(this.f2345c);
            }
            a(q());
        } catch (Throwable unused) {
        }
    }

    private Intent q() {
        String strF;
        if (this.o == null) {
            this.o = new Intent(this.E, (Class<?>) APSService.class);
        }
        try {
            if (!TextUtils.isEmpty(AMapLocationClientOption.getAPIKEY())) {
                strF = AMapLocationClientOption.getAPIKEY();
            } else {
                strF = il.f(this.E);
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "startServiceImpl p2");
            strF = "";
        }
        this.o.putExtra("a", strF);
        this.o.putExtra("b", il.c(this.E));
        this.o.putExtra("d", UmidtokenInfo.getUmidtoken());
        return this.o;
    }

    public final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Throwable th;
            try {
                super.handleMessage(message);
                if (com.autonavi.aps.amapapi.utils.b.h) {
                    Log.e("AMapLocationClient", "SERVICE_NOT_AVAILABLE");
                    return;
                }
                int i = message.what;
                if (i == 11) {
                    d.this.a(message.getData());
                    return;
                }
                if (i == 12) {
                    d.this.b(message);
                    return;
                }
                if (i == 16) {
                    d.this.c(message);
                    return;
                }
                if (i != 1011) {
                    try {
                        switch (i) {
                            case 1002:
                                d.this.c((AMapLocationListener) message.obj);
                                break;
                            case 1003:
                                d.this.j();
                                d.this.a(13, (Bundle) null);
                                break;
                            case 1004:
                                d.this.l();
                                d.this.a(14, (Bundle) null);
                                break;
                            case 1005:
                                d.this.d((AMapLocationListener) message.obj);
                                break;
                            default:
                                switch (i) {
                                    case 1014:
                                        d.this.a(message);
                                        break;
                                    case 1015:
                                        d.this.d.a(d.this.f2344b);
                                        d.this.a(1025, (Object) null, 300000L);
                                        break;
                                    case 1016:
                                        if (k.m(d.this.E)) {
                                            e.a();
                                            d.this.r();
                                        } else if (d.this.d.b()) {
                                            d.this.a(1016, (Object) null, 1000L);
                                        } else {
                                            d.this.n();
                                        }
                                        break;
                                    case 1017:
                                        d.this.d.a();
                                        d.this.a(1025);
                                        break;
                                    case 1018:
                                        d.this.f2344b = (AMapLocationClientOption) message.obj;
                                        if (d.this.f2344b != null) {
                                            d.this.s();
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 1023:
                                                d.this.d(message);
                                                break;
                                            case 1024:
                                                d.this.e(message);
                                                break;
                                            case 1025:
                                                if (d.this.d.f()) {
                                                    d.this.d.a();
                                                    d.this.d.a(d.this.f2344b);
                                                }
                                                d.this.a(1025, (Object) null, 300000L);
                                                break;
                                            case 1026:
                                                e.b();
                                                d.this.G.a(d.this.f2344b);
                                                break;
                                            case 1027:
                                                d.this.G.a();
                                                break;
                                            case 1028:
                                                d.this.h((AMapLocation) message.obj);
                                                break;
                                            case 1029:
                                                Bundle bundle = new Bundle();
                                                bundle.putString("objHash", Integer.toString(System.identityHashCode(this)));
                                                d.this.a(16, bundle);
                                                break;
                                            case 1030:
                                                Bundle bundle2 = new Bundle();
                                                bundle2.putString("objHash", Integer.toString(System.identityHashCode(this)));
                                                d.this.a(17, bundle2);
                                                break;
                                            case AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED /* 1031 */:
                                                if (d.this.f2344b.isSysNetworkLocEnable()) {
                                                    d.this.F.a(d.this.f2344b);
                                                    d.this.a(1033, (Object) null, 300000L);
                                                }
                                                break;
                                            case AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED /* 1032 */:
                                                d.this.F.a();
                                                d.this.a(1033);
                                                break;
                                            case 1033:
                                                if (d.this.F.b()) {
                                                    d.this.F.a();
                                                    d.this.F.a(d.this.f2344b);
                                                }
                                                d.this.a(1033, (Object) null, 300000L);
                                                break;
                                            case 1034:
                                                Bundle data = message.getData();
                                                AMapLocation aMapLocation = (AMapLocation) data.getParcelable("mapLoc");
                                                com.autonavi.aps.amapapi.a aVar = (com.autonavi.aps.amapapi.a) data.getParcelable("entity");
                                                data.getSerializable("ex");
                                                d.this.a(aMapLocation, aVar);
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (message == 0) {
                            message = "handleMessage";
                        }
                        com.autonavi.aps.amapapi.utils.c.a(th, "AMapLocationManage$MHandlerr", message);
                        return;
                    }
                    return;
                }
                d.this.a(14, (Bundle) null);
                d.this.g();
            } catch (Throwable th3) {
                th = th3;
                message = 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        try {
            new com.autonavi.aps.amapapi.a().f("#2001");
            i.a((String) null, 2153);
            com.autonavi.aps.amapapi.model.a aVar = new com.autonavi.aps.amapapi.model.a("");
            aVar.setErrorCode(20);
            aVar.setLocationDetail("模糊权限下不支持低功耗定位#2001");
            h(aVar);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "apsLocation:callback");
        }
    }

    private void g(AMapLocation aMapLocation) {
        AMapLocation aMapLocationA;
        if (aMapLocation == null) {
            return;
        }
        try {
            if (j.f2850b == null) {
                j jVar = this.l;
                aMapLocationA = jVar != null ? jVar.b() : null;
            } else {
                aMapLocationA = j.f2850b.a();
            }
            i.a(aMapLocationA, aMapLocation);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.d.b(this.f2344b);
        this.G.b(this.f2344b);
        if (this.I && !this.f2344b.getLocationMode().equals(this.s)) {
            l();
            j();
        }
        this.s = this.f2344b.getLocationMode();
        if (this.u != null) {
            if (this.f2344b.isOnceLocation()) {
                this.u.a(this.E, 0);
            } else {
                this.u.a(this.E, 1);
            }
            this.u.a(this.E, this.f2344b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(AMapLocation aMapLocation) {
        try {
            if (this.i && this.m != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(this.f2344b));
                a(0, bundle);
                if (this.I) {
                    a(13, (Bundle) null);
                }
                this.i = false;
            }
            f(aMapLocation);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "resultGpsLocationSuccess");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        com.autonavi.aps.amapapi.a aVar;
        AMapLocation aMapLocationA;
        com.autonavi.aps.amapapi.a aVar2;
        h hVar;
        Throwable th;
        AMapLocation aMapLocation = null;
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocation.class.getClassLoader());
                aMapLocationA = (AMapLocation) bundle.getParcelable("loc");
                aMapLocationA.getLongitude();
                aMapLocationA.getLatitude();
                e.c();
                aMapLocationA.setProvider("lbs");
                this.C = bundle.getString("nb");
                aVar2 = (com.autonavi.aps.amapapi.a) bundle.getParcelable("statics");
                if (aMapLocationA != null) {
                    try {
                        if (aMapLocationA.getErrorCode() == 0 && (hVar = this.d) != null) {
                            hVar.c();
                            if (!TextUtils.isEmpty(aMapLocationA.getAdCode())) {
                                h.y = aMapLocationA;
                                k.y = aMapLocationA;
                            }
                        }
                    } catch (Throwable th2) {
                        aVar = aVar2;
                        th = th2;
                        com.autonavi.aps.amapapi.utils.c.a(th, "AmapLocationManager", "resultLbsLocationSuccess");
                        com.autonavi.aps.amapapi.a aVar3 = aVar;
                        th = th;
                        aVar2 = aVar3;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                aVar = null;
                com.autonavi.aps.amapapi.utils.c.a(th, "AmapLocationManager", "resultLbsLocationSuccess");
                com.autonavi.aps.amapapi.a aVar4 = aVar;
                th = th;
                aVar2 = aVar4;
            }
        } else {
            aVar2 = null;
            aMapLocationA = null;
        }
        h hVar2 = this.d;
        if (hVar2 != null) {
            aMapLocationA = hVar2.a(aMapLocationA, this.C);
        }
        if (this.F != null && (!k.a(aMapLocationA) || (this.f2344b.isNeedAddress() && TextUtils.isEmpty(aMapLocationA.getAdCode())))) {
            aMapLocationA = this.F.a(aMapLocationA, this.C);
        }
        AMapLocation aMapLocation2 = aMapLocationA;
        th = null;
        aMapLocation = aMapLocation2;
        if (k.a(aMapLocation)) {
            this.M = false;
            a(aMapLocation, aVar2);
            return;
        }
        this.M = true;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("mapLoc", aMapLocation);
        bundle2.putParcelable("entity", aVar2);
        bundle2.putSerializable("ex", th);
        a(1034, bundle2, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        try {
            AMapLocation aMapLocation = (AMapLocation) message.obj;
            aMapLocation.getLongitude();
            aMapLocation.getLatitude();
            e.c();
            if (this.h && this.m != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(this.f2344b));
                a(0, bundle);
                if (this.I) {
                    a(13, (Bundle) null);
                }
                this.h = false;
            }
            a(aMapLocation, (com.autonavi.aps.amapapi.a) null);
            a(1025);
            a(1025, (Object) null, 300000L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "resultGpsLocationSuccess");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        try {
            AMapLocation aMapLocation = (AMapLocation) message.obj;
            aMapLocation.getLongitude();
            aMapLocation.getLatitude();
            e.c();
            if (this.j && this.m != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(this.f2344b));
                a(0, bundle);
                if (this.I) {
                    a(13, (Bundle) null);
                }
                this.j = false;
            }
            if (!this.f2344b.isLBSLocationEnable() || this.M) {
                a(1034);
                a(aMapLocation, (com.autonavi.aps.amapapi.a) null);
            }
            a(1033);
            a(1033, (Object) null, 300000L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "resultNetworkLocationSuccess");
        }
    }

    public final void a(int i, Notification notification) {
        if (i == 0 || notification == null) {
            return;
        }
        try {
            if (this.k && this.m != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("optBundle", com.autonavi.aps.amapapi.utils.c.a(this.f2344b));
                a(0, bundle);
                this.k = false;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, i);
            bundle2.putParcelable("h", notification);
            a(1023, bundle2, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "disableBackgroundLocation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        if (message == null) {
            return;
        }
        try {
            Bundle data = message.getData();
            if (data == null) {
                return;
            }
            int i = data.getInt(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, 0);
            Notification notification = (Notification) data.getParcelable("h");
            Intent intentQ = q();
            intentQ.putExtra(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, i);
            intentQ.putExtra("h", notification);
            intentQ.putExtra(jt.f, 1);
            a(intentQ, true);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "doEnableBackgroundLocation");
        }
    }

    public final void a(boolean z) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean("j", z);
            a(1024, bundle, 0L);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "disableBackgroundLocation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        if (message == null) {
            return;
        }
        try {
            Bundle data = message.getData();
            if (data == null) {
                return;
            }
            boolean z = data.getBoolean("j", true);
            Intent intentQ = q();
            intentQ.putExtra("j", z);
            intentQ.putExtra(jt.f, 2);
            a(intentQ, false);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ALManager", "doDisableBackgroundLocation");
        }
    }

    private boolean t() {
        if (k.j(this.E)) {
            try {
                if (g.b(((Application) this.E.getApplicationContext()).getBaseContext(), "checkSelfPermission", "android.permission.FOREGROUND_SERVICE") != 0) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    private void a(Intent intent, boolean z) {
        Context context = this.E;
        if (context != null) {
            if (z) {
                if (!t()) {
                    Log.e("amapapi", "-------------调用后台定位服务，缺少权限：android.permission.FOREGROUND_SERVICE--------------");
                    return;
                } else {
                    try {
                        this.E.getClass().getMethod("startForegroundService", Intent.class).invoke(this.E, intent);
                    } catch (Throwable unused) {
                        this.E.startService(intent);
                    }
                }
            } else {
                context.startService(intent);
            }
            this.D = true;
        }
    }
}
