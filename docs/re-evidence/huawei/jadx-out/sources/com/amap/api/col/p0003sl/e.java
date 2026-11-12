package com.amap.api.col.p0003sl;

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
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.f;
import com.autonavi.aps.amapapi.utils.g;
import com.autonavi.aps.amapapi.utils.i;
import com.autonavi.aps.amapapi.utils.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    static boolean g = false;
    Context e;
    private List<Messenger> w;
    private boolean o = false;
    private boolean p = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f2405a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    b f2406b = null;
    private long q = 0;
    private long r = 0;
    private com.autonavi.aps.amapapi.model.a s = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    AMapLocation f2407c = null;
    private long t = 0;
    private int u = 0;
    a d = null;
    private j v = null;
    com.autonavi.aps.amapapi.b f = null;
    HashMap<Messenger, Long> h = new HashMap<>();
    i i = null;
    long j = 0;
    long k = 0;
    private long x = 0;
    private HashMap<String, Boolean> y = new HashMap<>();
    String l = null;
    private boolean z = true;
    private String A = "";
    AMapLocationClientOption m = null;
    AMapLocationClientOption n = new AMapLocationClientOption();

    static /* synthetic */ com.autonavi.aps.amapapi.model.a b(String str) {
        return a(10, str);
    }

    public e(Context context) {
        this.e = null;
        this.e = context;
    }

    public final void a() {
        try {
            this.i = new i();
            b bVar = new b("amapLocCoreThread");
            this.f2406b = bVar;
            bVar.setPriority(5);
            this.f2406b.start();
            this.d = new a(this.f2406b.getLooper());
            this.w = new ArrayList();
        } catch (Throwable th) {
            c.a(th, "ApsServiceCore", "onCreate");
        }
    }

    public final Handler b() {
        return this.d;
    }

    public final void a(Intent intent) {
        a aVar;
        if (!"true".equals(intent.getStringExtra("as")) || (aVar = this.d) == null) {
            return;
        }
        aVar.sendEmptyMessageDelayed(9, 100L);
    }

    final class b extends HandlerThread {
        public b(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread
        protected final void onLooperPrepared() {
            try {
                try {
                    e.this.v = new j(e.this.e);
                } catch (Throwable th) {
                    c.a(th, "APSManager$ActionThread", "init 2");
                }
                try {
                    com.autonavi.aps.amapapi.utils.b.b(e.this.e);
                    com.autonavi.aps.amapapi.utils.b.a(e.this.e);
                } catch (Throwable th2) {
                    c.a(th2, "APSManager$ActionThread", "init 3");
                }
                e.this.f = new com.autonavi.aps.amapapi.b(false);
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

    public final class a extends Handler {
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
                                if (!e.this.a(data.getString("c"))) {
                                    if (message.what == 1) {
                                        i.a((String) null, 2102);
                                        com.autonavi.aps.amapapi.model.a aVarB = e.b("invalid handlder scode!!!#1002");
                                        com.autonavi.aps.amapapi.a aVar = new com.autonavi.aps.amapapi.a();
                                        aVar.f("#1002");
                                        aVar.e("conitue");
                                        e.this.a(messenger, aVarB, aVarB.k(), aVar);
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
                e.this.a(data);
                e.this.b(messenger, data);
            } else if (i != 1) {
                switch (i) {
                    case 9:
                        e.this.a(data);
                        e.this.g();
                        break;
                    case 10:
                        e.this.a(data);
                        e.this.a(messenger, data, "FINE_LOC", 1);
                        break;
                    case 11:
                        e.this.d();
                        break;
                    case 12:
                        e.this.a(messenger);
                        break;
                    case 13:
                        Messenger messenger2 = message.replyTo;
                        if (messenger2 != null && e.this.w != null && !e.this.w.contains(messenger2)) {
                            e.this.w.add(messenger2);
                            if (e.this.w.size() == 1) {
                                e.this.f();
                            }
                        }
                        break;
                    case 14:
                        Messenger messenger3 = message.replyTo;
                        if (messenger3 != null && e.this.w != null && e.this.w.contains(messenger3)) {
                            e.this.w.remove(messenger3);
                        }
                        if (e.this.w != null && e.this.w.size() == 0) {
                            e.this.f.h();
                        }
                        break;
                    case 15:
                        e.this.a(data);
                        e.this.a(messenger, data, "COARSE_LOC", 1);
                        break;
                    case 16:
                        if (data != null && !data.isEmpty()) {
                            e.this.y.put(data.getString("objHash"), Boolean.TRUE);
                            e.this.c();
                        }
                        break;
                    case 17:
                        if (data != null && !data.isEmpty()) {
                            e.this.y.put(data.getString("objHash"), Boolean.FALSE);
                            e.this.c();
                        }
                        break;
                    case 18:
                        e.this.a(data);
                        e.this.a(messenger, data, "FINE_LOC", 12);
                        break;
                    case 19:
                        e.this.a(data);
                        e.this.a(messenger, data);
                        break;
                }
            } else {
                e.this.a(data);
                e.this.c(messenger, data);
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Messenger messenger) {
        this.h.remove(messenger);
    }

    private static com.autonavi.aps.amapapi.model.a a(int i, String str) {
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

    private void b(Messenger messenger) {
        try {
            this.f.f();
            if (com.autonavi.aps.amapapi.utils.b.l()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("installMockApp", true);
                a(messenger, 9, bundle);
            }
        } catch (Throwable th) {
            c.a(th, "ApsServiceCore", "initAuth");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        try {
            if (this.o) {
                com.autonavi.aps.amapapi.b bVar = this.f;
                if (bVar != null) {
                    bVar.a();
                    return;
                }
                return;
            }
            c.a(this.e);
            if (bundle != null) {
                this.n = c.a(bundle.getBundle("optBundle"));
            }
            this.f.a(this.e);
            this.f.b();
            a(this.n);
            this.f.c();
            this.o = true;
            this.z = true;
            this.A = "";
            List<Messenger> list = this.w;
            if (list == null || list.size() <= 0) {
                return;
            }
            f();
        } catch (Throwable th) {
            this.z = false;
            th.printStackTrace();
            this.A = th.getMessage();
            c.a(th, "ApsServiceCore", "init");
        }
    }

    private void a(AMapLocationClientOption aMapLocationClientOption) {
        try {
            com.autonavi.aps.amapapi.b bVar = this.f;
            if (bVar != null) {
                bVar.a(aMapLocationClientOption);
            }
            if (aMapLocationClientOption != null) {
                g = aMapLocationClientOption.isKillProcess();
                if (this.m != null) {
                    if (aMapLocationClientOption.isOffset() != this.m.isOffset() || aMapLocationClientOption.isNeedAddress() != this.m.isNeedAddress() || aMapLocationClientOption.isLocationCacheEnable() != this.m.isLocationCacheEnable() || this.m.getGeoLanguage() != aMapLocationClientOption.getGeoLanguage()) {
                        this.r = 0L;
                    }
                    if (aMapLocationClientOption.isOffset() != this.m.isOffset() || this.m.getGeoLanguage() != aMapLocationClientOption.getGeoLanguage()) {
                        this.f2407c = null;
                    }
                }
                this.m = aMapLocationClientOption;
            }
        } catch (Throwable th) {
            c.a(th, "ApsServiceCore", "setExtra");
        }
    }

    public final void c() {
        HashMap<String, Boolean> map;
        if (this.f == null || (map = this.y) == null || map.isEmpty()) {
            return;
        }
        Iterator<Boolean> it = this.y.values().iterator();
        while (it.hasNext()) {
            if (it.next().booleanValue()) {
                this.f.a(true);
                return;
            }
        }
        this.f.a(false);
    }

    public final void d() {
        try {
            HashMap<Messenger, Long> map = this.h;
            if (map != null) {
                map.clear();
                this.h = null;
            }
            try {
                List<Messenger> list = this.w;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                c.a(th, "apm", "des1");
            }
            j jVar = this.v;
            if (jVar != null) {
                jVar.c();
                this.v = null;
            }
            this.o = false;
            this.p = false;
            this.f.e();
            a aVar = this.d;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.d = null;
            b bVar = this.f2406b;
            if (bVar != null) {
                try {
                    g.a(bVar, (Class<?>) HandlerThread.class, "quitSafely", new Object[0]);
                } catch (Throwable unused) {
                    this.f2406b.quit();
                }
            }
            this.f2406b = null;
            if (this.i != null && this.j != 0 && this.k != 0) {
                long jB = k.b();
                long j = this.j;
                i.a(this.e, this.i.c(this.e), this.i.d(this.e), this.k, jB - j);
                this.i.e(this.e);
            }
            HashMap<String, Boolean> map2 = this.y;
            if (map2 != null) {
                map2.clear();
                this.y = null;
            }
            i.a(this.e);
            jv.b();
            if (g) {
                Process.killProcess(Process.myPid());
            }
        } catch (Throwable th2) {
            c.a(th2, "apm", "tdest");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (k.m(this.e)) {
            new Object[]{"Cl | dl -- sc_cpo"};
            com.autonavi.aps.amapapi.utils.e.a();
            return;
        }
        try {
            com.autonavi.aps.amapapi.b bVar = this.f;
            if (bVar == null || bVar == null) {
                return;
            }
            bVar.a(this.d);
            this.f.g();
        } catch (Throwable th) {
            c.a(th, "ApsServiceCore", "startColl");
        }
    }

    private static void a(Messenger messenger, int i, Bundle bundle) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Messenger messenger, Bundle bundle) {
        if (bundle != null) {
            try {
                if (!bundle.isEmpty() && !this.p) {
                    this.p = true;
                    b(messenger);
                }
            } catch (Throwable th) {
                c.a(th, "ApsServiceCore", "doInitAuth");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Messenger messenger, AMapLocation aMapLocation, String str, com.autonavi.aps.amapapi.a aVar) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(AMapLocation.class.getClassLoader());
        bundle.putParcelable("loc", aMapLocation);
        bundle.putString("nb", str);
        bundle.putParcelable("statics", aVar);
        this.h.put(messenger, Long.valueOf(k.b()));
        a(messenger, 1, bundle);
    }

    private static AMapLocationClientOption b(Bundle bundle) {
        AMapLocationClientOption aMapLocationClientOptionA = null;
        try {
            aMapLocationClientOptionA = c.a(bundle.getBundle("optBundle"));
            try {
                String string = bundle.getString("d");
                if (!TextUtils.isEmpty(string)) {
                    ip.a(string);
                }
            } catch (Throwable th) {
                c.a(th, "APSManager", "doLocation setUmidToken");
            }
        } catch (Throwable th2) {
            c.a(th2, "APSManager", "parseBundle");
        }
        return aMapLocationClientOptionA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Messenger messenger, Bundle bundle) {
        String str;
        j jVar;
        if (bundle != null) {
            try {
                if (bundle.isEmpty()) {
                    return;
                }
                com.autonavi.aps.amapapi.a aVar = new com.autonavi.aps.amapapi.a();
                aVar.e("conitue");
                AMapLocationClientOption aMapLocationClientOptionB = b(bundle);
                a(aMapLocationClientOptionB);
                if (this.h.containsKey(messenger) && !aMapLocationClientOptionB.isOnceLocation()) {
                    if (k.b() - this.h.get(messenger).longValue() < 800) {
                        return;
                    }
                }
                AMapLocation aMapLocationA = null;
                if (!this.z) {
                    this.s = a(9, "init error : " + this.A + "#0901");
                    aVar.f("#0901");
                    com.autonavi.aps.amapapi.model.a aVar2 = this.s;
                    a(messenger, aVar2, aVar2.k(), aVar);
                    i.a((String) null, 2091);
                    return;
                }
                long jB = k.b();
                if (k.a(this.s) && jB - this.r < 600) {
                    com.autonavi.aps.amapapi.model.a aVar3 = this.s;
                    a(messenger, aVar3, aVar3.k(), aVar);
                    this.f.a(this.s, 3);
                    return;
                }
                aVar.c(k.b());
                try {
                    com.autonavi.aps.amapapi.model.a aVarA = this.f.a(aVar);
                    this.s = aVarA;
                    if (aVarA.getLocationType() == 6 || this.s.getLocationType() == 5) {
                        this.f.a(this.s, 2);
                    } else if (this.s.getLocationType() == 2) {
                        this.f.a(this.s, 3);
                    } else if (this.s.getLocationType() == 4) {
                        this.f.a(this.s, 4);
                    }
                    this.s = this.f.a(this.s);
                } catch (Throwable th) {
                    i.a((String) null, 2081);
                    aVar.f("#0801");
                    this.s = a(8, "loc error : " + th.getMessage() + "#0801");
                    c.a(th, "ApsServiceCore", "run part2");
                }
                if (k.a(this.s)) {
                    this.r = k.b();
                }
                if (this.s == null) {
                    this.s = a(8, "loc is null#0801");
                    aVar.f("#0801");
                }
                com.autonavi.aps.amapapi.model.a aVar4 = this.s;
                if (aVar4 != null) {
                    String strK = aVar4.k();
                    aMapLocationA = this.s.m749clone();
                    str = strK;
                } else {
                    str = null;
                }
                try {
                    if (aMapLocationClientOptionB.isLocationCacheEnable() && (jVar = this.v) != null) {
                        aMapLocationA = jVar.a(aMapLocationA, str, aMapLocationClientOptionB.getLastLocationLifeCycle());
                    }
                } catch (Throwable th2) {
                    c.a(th2, "ApsServiceCore", "fixLastLocation");
                }
                a(messenger, aMapLocationA, str, aVar);
            } catch (Throwable th3) {
                c.a(th3, "ApsServiceCore", "doLocation");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            com.autonavi.aps.amapapi.utils.b.c(this.e);
        } catch (Throwable th) {
            c.a(th, "ApsServiceCore", "doCallOtherSer");
        }
    }

    final void a(Messenger messenger, Bundle bundle, String str, int i) {
        AMapLocationClientOption aMapLocationClientOptionB;
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
                        aMapLocation = new AMapLocation(GeocodeSearch.GPS);
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
                    this.f.a(aMapLocation);
                }
                if (com.autonavi.aps.amapapi.utils.b.h() && (aMapLocationClientOptionB = b(bundle)) != null && aMapLocationClientOptionB.isNeedAddress()) {
                    a(aMapLocationClientOptionB);
                    AMapLocation aMapLocation3 = this.f2407c;
                    if (aMapLocation3 != null) {
                        fA = k.a(new double[]{d, d2, aMapLocation3.getLatitude(), this.f2407c.getLongitude()});
                        if (fA < com.autonavi.aps.amapapi.utils.b.i() * 3) {
                            a(messenger, str, i);
                        }
                    } else {
                        fA = -1.0f;
                    }
                    if (fA == -1.0f || (fA > com.autonavi.aps.amapapi.utils.b.i() && k.b() - this.x > com.autonavi.aps.amapapi.utils.b.j() * 1000)) {
                        a(bundle);
                        this.f2407c = this.f.a(d, d2);
                        this.x = k.b();
                        AMapLocation aMapLocation4 = this.f2407c;
                        if (aMapLocation4 == null || TextUtils.isEmpty(aMapLocation4.getAdCode())) {
                            return;
                        }
                        a(messenger, str, i);
                    }
                }
            } catch (Throwable th) {
                c.a(th, "ApsServiceCore", "doLocationGeo");
            }
        }
    }

    final void a(Messenger messenger, Bundle bundle) {
        AMapLocation aMapLocation;
        if (bundle == null || bundle.isEmpty() || (aMapLocation = (AMapLocation) bundle.getParcelable("loc")) == null) {
            return;
        }
        double latitude = aMapLocation.getLatitude();
        double longitude = aMapLocation.getLongitude();
        if (!aMapLocation.isOffset()) {
            DPoint dPointA = f.a(this.e, new DPoint(latitude, longitude));
            double latitude2 = dPointA.getLatitude();
            double longitude2 = dPointA.getLongitude();
            latitude = latitude2;
            longitude = longitude2;
        }
        com.autonavi.aps.amapapi.model.a aVarA = this.f.a(latitude, longitude);
        this.f2407c = aVarA;
        c.a(aMapLocation, aVarA);
        a(messenger, 19, bundle);
    }

    private void a(Messenger messenger, String str, int i) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(AMapLocation.class.getClassLoader());
        bundle.putInt("I_MAX_GEO_DIS", com.autonavi.aps.amapapi.utils.b.i() * 3);
        bundle.putInt("I_MIN_GEO_DIS", com.autonavi.aps.amapapi.utils.b.i());
        bundle.putParcelable("loc", this.f2407c);
        if ("COARSE_LOC".equals(str)) {
            a(messenger, 103, bundle);
        } else if (i == 1) {
            a(messenger, 6, bundle);
        } else if (i == 12) {
            a(messenger, 18, bundle);
        }
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(this.l)) {
            this.l = c.b(this.e);
        }
        return !TextUtils.isEmpty(str) && str.equals(this.l);
    }

    public final void b(Intent intent) {
        String stringExtra = intent.getStringExtra("a");
        if (!TextUtils.isEmpty(stringExtra)) {
            im.a(this.e, stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("b");
        this.f2405a = stringExtra2;
        il.a(stringExtra2);
        String stringExtra3 = intent.getStringExtra("d");
        if (TextUtils.isEmpty(stringExtra3)) {
            return;
        }
        ip.a(stringExtra3);
    }

    public static void e() {
        g = false;
    }
}
