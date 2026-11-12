package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.x0;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.e;
import com.autonavi.aps.amapapi.utils.f;
import com.autonavi.aps.amapapi.utils.g;
import com.autonavi.aps.amapapi.utils.i;
import com.autonavi.aps.amapapi.utils.k;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ins {
    public static boolean A = false;
    public Context l;
    public List<Messenger> s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21328a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21329b = false;
    public String c = null;
    public b d = null;
    public long e = 0;
    public long f = 0;
    public com.autonavi.aps.amapapi.model.a g = null;
    public AMapLocation h = null;
    public long i = 0;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f21330k = null;
    public t0t m = null;
    public com.autonavi.aps.amapapi.b n = null;
    public HashMap<Messenger, Long> o = new HashMap<>();
    public i p = null;
    public long q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f21331r = 0;
    public long t = 0;
    public HashMap<String, Boolean> u = new HashMap<>();
    public String v = null;
    public boolean w = true;
    public String x = "";
    public AMapLocationClientOption y = null;
    public AMapLocationClientOption z = new AMapLocationClientOption();

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Messenger messenger;
            Throwable th;
            Bundle data;
            try {
                data = message.getData();
                try {
                    messenger = message.replyTo;
                    if (data != null) {
                        try {
                            if (!data.isEmpty()) {
                                if (!ins.this.r(data.getString(PluginDeviceInfo.FICONON))) {
                                    if (message.what == 1) {
                                        i.a((String) null, 2102);
                                        com.autonavi.aps.amapapi.model.a aVarU = ins.u("invalid handlder scode!!!#1002");
                                        com.autonavi.aps.amapapi.a aVar = new com.autonavi.aps.amapapi.a();
                                        aVar.f("#1002");
                                        aVar.e("conitue");
                                        ins.this.j(messenger, aVarU, aVarU.k(), aVar);
                                        return;
                                    }
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                c.a(th, "ApsServiceCore", "ActionHandler handlerMessage");
                            } catch (Throwable th3) {
                                c.a(th3, "actionHandler", "handleMessage");
                                return;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    messenger = null;
                    th = th4;
                }
            } catch (Throwable th5) {
                messenger = null;
                th = th5;
                data = null;
            }
            int i = message.what;
            if (i == 0) {
                ins.this.e(data);
                ins.this.y(messenger, data);
            } else if (i != 1) {
                switch (i) {
                    case 9:
                        ins.this.e(data);
                        ins.this.H();
                        break;
                    case 10:
                        ins.this.e(data);
                        ins.this.i(messenger, data, "FINE_LOC", 1);
                        break;
                    case 11:
                        ins.this.D();
                        break;
                    case 12:
                        ins.this.f(messenger);
                        break;
                    case 13:
                        Messenger messenger2 = message.replyTo;
                        if (messenger2 != null && ins.this.s != null && !ins.this.s.contains(messenger2)) {
                            ins.this.s.add(messenger2);
                            if (ins.this.s.size() == 1) {
                                ins.this.G();
                            }
                        }
                        break;
                    case 14:
                        Messenger messenger3 = message.replyTo;
                        if (messenger3 != null && ins.this.s != null && ins.this.s.contains(messenger3)) {
                            ins.this.s.remove(messenger3);
                        }
                        if (ins.this.s != null && ins.this.s.size() == 0) {
                            ins.this.n.h();
                        }
                        break;
                    case 15:
                        ins.this.e(data);
                        ins.this.i(messenger, data, "COARSE_LOC", 1);
                        break;
                    case 16:
                        if (data != null && !data.isEmpty()) {
                            ins.this.u.put(data.getString("objHash"), Boolean.TRUE);
                            ins.this.B();
                        }
                        break;
                    case 17:
                        if (data != null && !data.isEmpty()) {
                            ins.this.u.put(data.getString("objHash"), Boolean.FALSE);
                            ins.this.B();
                        }
                        break;
                    case 18:
                        ins.this.e(data);
                        ins.this.i(messenger, data, "FINE_LOC", 12);
                        break;
                    case 19:
                        ins.this.e(data);
                        ins.this.h(messenger, data);
                        break;
                }
            } else {
                ins.this.e(data);
                ins.this.C(messenger, data);
            }
            super.handleMessage(message);
        }
    }

    public class b extends HandlerThread {
        public b(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            try {
                try {
                    ins.this.m = new t0t(ins.this.l);
                } catch (Throwable th) {
                    c.a(th, "APSManager$ActionThread", "init 2");
                }
                try {
                    com.autonavi.aps.amapapi.utils.b.b(ins.this.l);
                    com.autonavi.aps.amapapi.utils.b.a(ins.this.l);
                } catch (Throwable th2) {
                    c.a(th2, "APSManager$ActionThread", "init 3");
                }
                ins.this.n = new com.autonavi.aps.amapapi.b(false);
                super.onLooperPrepared();
            } catch (Throwable th3) {
                c.a(th3, "APSManager$ActionThread", "onLooperPrepared");
            }
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                super.run();
            } catch (Throwable th) {
                c.a(th, "APSManager$ActionThread", "run");
            }
        }
    }

    public ins(Context context) {
        this.l = null;
        this.l = context;
    }

    public static void F() {
        A = false;
    }

    public static com.autonavi.aps.amapapi.model.a a(int i, String str) {
        try {
            com.autonavi.aps.amapapi.model.a aVar = new com.autonavi.aps.amapapi.model.a("");
            aVar.setErrorCode(i);
            aVar.setLocationDetail(str);
            return aVar;
        } catch (Throwable th) {
            c.a(th, "ApsServiceCore", "newInstanceAMapLoc");
            return null;
        }
    }

    public static void g(Messenger messenger, int i, Bundle bundle) {
        if (messenger != null) {
            try {
                Message messageObtain = Message.obtain();
                messageObtain.setData(bundle);
                messageObtain.what = i;
                messenger.send(messageObtain);
            } catch (Throwable th) {
                c.a(th, "ApsServiceCore", "sendMessage");
            }
        }
    }

    public static AMapLocationClientOption t(Bundle bundle) {
        AMapLocationClientOption aMapLocationClientOptionA = null;
        try {
            aMapLocationClientOptionA = c.a(bundle.getBundle("optBundle"));
            try {
                String string = bundle.getString(PluginDeviceInfo.FICONOFF);
                if (!TextUtils.isEmpty(string)) {
                    h0t.r(string);
                }
            } catch (Throwable th) {
                c.a(th, "APSManager", "doLocation setUmidToken");
            }
        } catch (Throwable th2) {
            c.a(th2, "APSManager", "parseBundle");
        }
        return aMapLocationClientOptionA;
    }

    public static /* synthetic */ com.autonavi.aps.amapapi.model.a u(String str) {
        return a(10, str);
    }

    public final void B() {
        HashMap<String, Boolean> map;
        if (this.n == null || (map = this.u) == null || map.isEmpty()) {
            return;
        }
        Iterator<Boolean> it = this.u.values().iterator();
        while (it.hasNext()) {
            if (it.next().booleanValue()) {
                this.n.a(true);
                return;
            }
        }
        this.n.a(false);
    }

    public final void C(Messenger messenger, Bundle bundle) {
        String str;
        t0t t0tVar;
        if (bundle != null) {
            try {
                if (bundle.isEmpty()) {
                    return;
                }
                com.autonavi.aps.amapapi.a aVar = new com.autonavi.aps.amapapi.a();
                aVar.e("conitue");
                AMapLocationClientOption aMapLocationClientOptionT = t(bundle);
                l(aMapLocationClientOptionT);
                if (this.o.containsKey(messenger) && !aMapLocationClientOptionT.isOnceLocation()) {
                    if (k.b() - this.o.get(messenger).longValue() < 800) {
                        return;
                    }
                }
                AMapLocation aMapLocationA = null;
                if (!this.w) {
                    this.g = a(9, "init error : " + this.x + "#0901");
                    aVar.f("#0901");
                    com.autonavi.aps.amapapi.model.a aVar2 = this.g;
                    j(messenger, aVar2, aVar2.k(), aVar);
                    i.a((String) null, 2091);
                    return;
                }
                long jB = k.b();
                if (k.a(this.g) && jB - this.f < 600) {
                    com.autonavi.aps.amapapi.model.a aVar3 = this.g;
                    j(messenger, aVar3, aVar3.k(), aVar);
                    this.n.a(this.g, 3);
                    return;
                }
                aVar.c(k.b());
                try {
                    com.autonavi.aps.amapapi.model.a aVarA = this.n.a(aVar);
                    this.g = aVarA;
                    if (aVarA.getLocationType() == 6 || this.g.getLocationType() == 5) {
                        this.n.a(this.g, 2);
                    } else if (this.g.getLocationType() == 2) {
                        this.n.a(this.g, 3);
                    } else if (this.g.getLocationType() == 4) {
                        this.n.a(this.g, 4);
                    }
                    this.g = this.n.a(this.g);
                } catch (Throwable th) {
                    i.a((String) null, 2081);
                    aVar.f("#0801");
                    this.g = a(8, "loc error : " + th.getMessage() + "#0801");
                    c.a(th, "ApsServiceCore", "run part2");
                }
                if (k.a(this.g)) {
                    this.f = k.b();
                }
                if (this.g == null) {
                    this.g = a(8, "loc is null#0801");
                    aVar.f("#0801");
                }
                com.autonavi.aps.amapapi.model.a aVar4 = this.g;
                if (aVar4 != null) {
                    String strK = aVar4.k();
                    aMapLocationA = this.g.m78clone();
                    str = strK;
                } else {
                    str = null;
                }
                try {
                    if (aMapLocationClientOptionT.isLocationCacheEnable() && (t0tVar = this.m) != null) {
                        aMapLocationA = t0tVar.a(aMapLocationA, str, aMapLocationClientOptionT.getLastLocationLifeCycle());
                    }
                } catch (Throwable th2) {
                    c.a(th2, "ApsServiceCore", "fixLastLocation");
                }
                j(messenger, aMapLocationA, str, aVar);
            } catch (Throwable th3) {
                c.a(th3, "ApsServiceCore", "doLocation");
            }
        }
    }

    public final void D() {
        try {
            HashMap<Messenger, Long> map = this.o;
            if (map != null) {
                map.clear();
                this.o = null;
            }
            try {
                List<Messenger> list = this.s;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                c.a(th, "apm", "des1");
            }
            t0t t0tVar = this.m;
            if (t0tVar != null) {
                t0tVar.e();
                this.m = null;
            }
            this.f21328a = false;
            this.f21329b = false;
            this.n.e();
            a aVar = this.f21330k;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.f21330k = null;
            b bVar = this.d;
            if (bVar != null) {
                try {
                    g.a(bVar, (Class<?>) HandlerThread.class, "quitSafely", new Object[0]);
                } catch (Throwable unused) {
                    this.d.quit();
                }
            }
            this.d = null;
            if (this.p != null && this.q != 0 && this.f21331r != 0) {
                long jB = k.b() - this.q;
                i.a(this.l, this.p.c(this.l), this.p.d(this.l), this.f21331r, jB);
                this.p.e(this.l);
            }
            HashMap<String, Boolean> map2 = this.u;
            if (map2 != null) {
                map2.clear();
                this.u = null;
            }
            i.a(this.l);
            m2t.m();
            if (A) {
                Process.killProcess(Process.myPid());
            }
        } catch (Throwable th2) {
            c.a(th2, "apm", "tdest");
        }
    }

    public final void G() {
        if (k.m(this.l)) {
            e.a();
            return;
        }
        try {
            com.autonavi.aps.amapapi.b bVar = this.n;
            if (bVar == null || bVar == null) {
                return;
            }
            bVar.a(this.f21330k);
            this.n.g();
        } catch (Throwable th) {
            c.a(th, "ApsServiceCore", "startColl");
        }
    }

    public final void H() {
        try {
            com.autonavi.aps.amapapi.utils.b.c(this.l);
        } catch (Throwable th) {
            c.a(th, "ApsServiceCore", "doCallOtherSer");
        }
    }

    public final void c() {
        try {
            this.p = new i();
            b bVar = new b("amapLocCoreThread");
            this.d = bVar;
            bVar.setPriority(5);
            this.d.start();
            this.f21330k = new a(this.d.getLooper());
            this.s = new ArrayList();
        } catch (Throwable th) {
            c.a(th, "ApsServiceCore", "onCreate");
        }
    }

    public final void d(Intent intent) {
        a aVar;
        if (!"true".equals(intent.getStringExtra("as")) || (aVar = this.f21330k) == null) {
            return;
        }
        aVar.sendEmptyMessageDelayed(9, 100L);
    }

    public final void e(Bundle bundle) {
        try {
            if (this.f21328a) {
                com.autonavi.aps.amapapi.b bVar = this.n;
                if (bVar != null) {
                    bVar.a();
                    return;
                }
                return;
            }
            c.a(this.l);
            if (bundle != null) {
                this.z = c.a(bundle.getBundle("optBundle"));
            }
            this.n.a(this.l);
            this.n.b();
            l(this.z);
            this.n.c();
            this.f21328a = true;
            this.w = true;
            this.x = "";
            List<Messenger> list = this.s;
            if (list == null || list.size() <= 0) {
                return;
            }
            G();
        } catch (Throwable th) {
            this.w = false;
            th.printStackTrace();
            this.x = th.getMessage();
            c.a(th, "ApsServiceCore", "init");
        }
    }

    public final void f(Messenger messenger) {
        this.o.remove(messenger);
    }

    public final void h(Messenger messenger, Bundle bundle) {
        AMapLocation aMapLocation;
        if (bundle == null || bundle.isEmpty() || (aMapLocation = (AMapLocation) bundle.getParcelable("loc")) == null) {
            return;
        }
        double latitude = aMapLocation.getLatitude();
        double longitude = aMapLocation.getLongitude();
        if (!aMapLocation.isOffset()) {
            DPoint dPointA = f.a(this.l, new DPoint(latitude, longitude));
            double latitude2 = dPointA.getLatitude();
            double longitude2 = dPointA.getLongitude();
            latitude = latitude2;
            longitude = longitude2;
        }
        com.autonavi.aps.amapapi.model.a aVarA = this.n.a(latitude, longitude);
        this.h = aVarA;
        c.a(aMapLocation, aVarA);
        g(messenger, 19, bundle);
    }

    public final void i(Messenger messenger, Bundle bundle, String str, int i) {
        AMapLocationClientOption aMapLocationClientOptionT;
        float fA;
        AMapLocation aMapLocation;
        if (bundle != null) {
            try {
                if (bundle.isEmpty()) {
                    return;
                }
                double d = bundle.getDouble("lat");
                double d2 = bundle.getDouble("lon");
                float f = bundle.getFloat("radius");
                long j = bundle.getLong("time");
                if ("FINE_LOC".equals(str)) {
                    if (i == 1) {
                        aMapLocation = new AMapLocation("gps");
                        aMapLocation.setLocationType(1);
                    } else if (i == 12) {
                        AMapLocation aMapLocation2 = new AMapLocation("network");
                        aMapLocation2.setLocationType(12);
                        aMapLocation = aMapLocation2;
                    } else {
                        aMapLocation = null;
                    }
                    aMapLocation.setLatitude(d);
                    aMapLocation.setLongitude(d2);
                    aMapLocation.setAccuracy(f);
                    aMapLocation.setTime(j);
                    this.n.a(aMapLocation);
                }
                if (com.autonavi.aps.amapapi.utils.b.h() && (aMapLocationClientOptionT = t(bundle)) != null && aMapLocationClientOptionT.isNeedAddress()) {
                    l(aMapLocationClientOptionT);
                    AMapLocation aMapLocation3 = this.h;
                    if (aMapLocation3 != null) {
                        fA = k.a(new double[]{d, d2, aMapLocation3.getLatitude(), this.h.getLongitude()});
                        if (fA < com.autonavi.aps.amapapi.utils.b.i() * 3) {
                            k(messenger, str, i);
                        }
                    } else {
                        fA = -1.0f;
                    }
                    if (fA == -1.0f || (fA > com.autonavi.aps.amapapi.utils.b.i() && k.b() - this.t > com.autonavi.aps.amapapi.utils.b.j() * 1000)) {
                        e(bundle);
                        this.h = this.n.a(d, d2);
                        this.t = k.b();
                        AMapLocation aMapLocation4 = this.h;
                        if (aMapLocation4 == null || TextUtils.isEmpty(aMapLocation4.getAdCode())) {
                            return;
                        }
                        k(messenger, str, i);
                    }
                }
            } catch (Throwable th) {
                c.a(th, "ApsServiceCore", "doLocationGeo");
            }
        }
    }

    public final void j(Messenger messenger, AMapLocation aMapLocation, String str, com.autonavi.aps.amapapi.a aVar) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(AMapLocation.class.getClassLoader());
        bundle.putParcelable("loc", aMapLocation);
        bundle.putString("nb", str);
        bundle.putParcelable("statics", aVar);
        this.o.put(messenger, Long.valueOf(k.b()));
        g(messenger, 1, bundle);
    }

    public final void k(Messenger messenger, String str, int i) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(AMapLocation.class.getClassLoader());
        bundle.putInt("I_MAX_GEO_DIS", com.autonavi.aps.amapapi.utils.b.i() * 3);
        bundle.putInt("I_MIN_GEO_DIS", com.autonavi.aps.amapapi.utils.b.i());
        bundle.putParcelable("loc", this.h);
        if ("COARSE_LOC".equals(str)) {
            g(messenger, 103, bundle);
        } else if (i == 1) {
            g(messenger, 6, bundle);
        } else if (i == 12) {
            g(messenger, 18, bundle);
        }
    }

    public final void l(AMapLocationClientOption aMapLocationClientOption) {
        try {
            com.autonavi.aps.amapapi.b bVar = this.n;
            if (bVar != null) {
                bVar.a(aMapLocationClientOption);
            }
            if (aMapLocationClientOption != null) {
                A = aMapLocationClientOption.isKillProcess();
                if (this.y != null) {
                    if (aMapLocationClientOption.isOffset() != this.y.isOffset() || aMapLocationClientOption.isNeedAddress() != this.y.isNeedAddress() || aMapLocationClientOption.isLocationCacheEnable() != this.y.isLocationCacheEnable() || this.y.getGeoLanguage() != aMapLocationClientOption.getGeoLanguage()) {
                        this.f = 0L;
                    }
                    if (aMapLocationClientOption.isOffset() != this.y.isOffset() || this.y.getGeoLanguage() != aMapLocationClientOption.getGeoLanguage()) {
                        this.h = null;
                    }
                }
                this.y = aMapLocationClientOption;
            }
        } catch (Throwable th) {
            c.a(th, "ApsServiceCore", "setExtra");
        }
    }

    public final boolean r(String str) {
        if (TextUtils.isEmpty(this.v)) {
            this.v = c.b(this.l);
        }
        return !TextUtils.isEmpty(str) && str.equals(this.v);
    }

    public final Handler s() {
        return this.f21330k;
    }

    public final void w(Intent intent) {
        String stringExtra = intent.getStringExtra(PluginDeviceInfo.FMODEL);
        if (!TextUtils.isEmpty(stringExtra)) {
            x0.l(this.l, stringExtra);
        }
        String stringExtra2 = intent.getStringExtra(PluginDeviceInfo.FDESC);
        this.c = stringExtra2;
        e0t.c(stringExtra2);
        String stringExtra3 = intent.getStringExtra(PluginDeviceInfo.FICONOFF);
        if (TextUtils.isEmpty(stringExtra3)) {
            return;
        }
        h0t.r(stringExtra3);
    }

    public final void x(Messenger messenger) {
        try {
            this.n.f();
            if (com.autonavi.aps.amapapi.utils.b.l()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("installMockApp", true);
                g(messenger, 9, bundle);
            }
        } catch (Throwable th) {
            c.a(th, "ApsServiceCore", "initAuth");
        }
    }

    public final void y(Messenger messenger, Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.isEmpty() || this.f21329b) {
                    return;
                }
                this.f21329b = true;
                x(messenger);
            } catch (Throwable th) {
                c.a(th, "ApsServiceCore", "doInitAuth");
            }
        }
    }
}
