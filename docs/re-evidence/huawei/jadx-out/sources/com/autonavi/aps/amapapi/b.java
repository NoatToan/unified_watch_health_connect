package com.autonavi.aps.amapapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.ik;
import com.amap.api.col.p0003sl.im;
import com.amap.api.col.p0003sl.ip;
import com.amap.api.col.p0003sl.iy;
import com.amap.api.col.p0003sl.jv;
import com.amap.api.col.p0003sl.lb;
import com.amap.api.col.p0003sl.np;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.autonavi.aps.amapapi.restruct.e;
import com.autonavi.aps.amapapi.restruct.g;
import com.autonavi.aps.amapapi.restruct.k;
import com.autonavi.aps.amapapi.trans.f;
import com.autonavi.aps.amapapi.utils.i;
import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    static int A = -1;
    private static boolean K = false;
    boolean F;
    private Handler N;
    private g O;
    private String P;
    private c R;
    public static String[] D = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    public static String E = "android.permission.ACCESS_BACKGROUND_LOCATION";
    private static volatile boolean Q = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f3914a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ConnectivityManager f3915b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    k f3916c = null;
    e d = null;
    com.autonavi.aps.amapapi.storage.a e = null;
    com.autonavi.aps.amapapi.trans.e f = null;
    ArrayList<np> g = new ArrayList<>();
    a h = null;
    AMapLocationClientOption i = new AMapLocationClientOption();
    com.autonavi.aps.amapapi.model.a j = null;
    long k = 0;
    private int I = 0;
    f l = null;
    boolean m = false;
    private String J = null;
    com.autonavi.aps.amapapi.trans.c n = null;
    StringBuilder o = new StringBuilder();
    boolean p = true;
    boolean q = true;
    AMapLocationClientOption.GeoLanguage r = AMapLocationClientOption.GeoLanguage.DEFAULT;
    boolean s = true;
    boolean t = false;
    private String L = null;
    StringBuilder u = null;
    boolean v = false;
    public boolean w = false;
    int x = 12;
    private boolean M = true;
    com.autonavi.aps.amapapi.restruct.b y = null;
    boolean z = false;
    com.autonavi.aps.amapapi.filters.a B = null;
    String C = null;
    IntentFilter G = null;
    LocationManager H = null;

    public b(boolean z) {
        this.F = z;
    }

    public final void a(Handler handler) {
        this.N = handler;
    }

    public final void a(Context context) {
        try {
            if (this.f3914a != null) {
                return;
            }
            this.B = new com.autonavi.aps.amapapi.filters.a();
            Context applicationContext = context.getApplicationContext();
            this.f3914a = applicationContext;
            com.autonavi.aps.amapapi.utils.k.b(applicationContext);
            if (this.f3916c == null) {
                this.f3916c = new k(this.f3914a, (WifiManager) com.autonavi.aps.amapapi.utils.k.a(this.f3914a, "wifi"), this.N);
            }
            if (this.d == null) {
                this.d = new e(this.f3914a, this.N);
            }
            this.O = new g(context, this.N);
            if (this.e == null) {
                this.e = new com.autonavi.aps.amapapi.storage.a();
            }
            if (this.f == null) {
                this.f = new com.autonavi.aps.amapapi.trans.e();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            com.autonavi.aps.amapapi.utils.c.a(th, "Aps", "initBase");
        }
    }

    public final void a() {
        e eVar = this.d;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final void b() {
        this.n = com.autonavi.aps.amapapi.trans.c.a(this.f3914a);
        i();
        if (this.f3915b == null) {
            this.f3915b = (ConnectivityManager) com.autonavi.aps.amapapi.utils.k.a(this.f3914a, "connectivity");
        }
        if (this.l == null) {
            this.l = new f();
        }
    }

    private void i() {
        if (this.n != null) {
            try {
                if (this.i == null) {
                    this.i = new AMapLocationClientOption();
                }
                this.n.a(this.i.getHttpTimeOut(), this.i.getLocationProtocol().equals(AMapLocationClientOption.AMapLocationProtocol.HTTPS), j());
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.autonavi.aps.amapapi.b$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3917a;

        static {
            int[] iArr = new int[AMapLocationClientOption.GeoLanguage.values().length];
            f3917a = iArr;
            try {
                iArr[AMapLocationClientOption.GeoLanguage.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3917a[AMapLocationClientOption.GeoLanguage.ZH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3917a[AMapLocationClientOption.GeoLanguage.EN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private int j() {
        int i;
        if (this.i.getGeoLanguage() == null || (i = AnonymousClass1.f3917a[this.i.getGeoLanguage().ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final void c() {
        if (this.i.isLBSLocationEnable()) {
            if (this.y == null) {
                this.y = new com.autonavi.aps.amapapi.restruct.b(this.f3914a);
            }
            m();
            k kVar = this.f3916c;
            if (kVar != null) {
                kVar.b(false);
                this.g = this.f3916c.e();
            }
            e eVar = this.d;
            if (eVar != null) {
                eVar.a(false, q());
            }
            this.e.a(this.f3914a);
            b(this.f3914a);
            this.w = true;
        }
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        this.i = aMapLocationClientOption;
        if (aMapLocationClientOption == null) {
            this.i = new AMapLocationClientOption();
        }
        k kVar = this.f3916c;
        if (kVar != null) {
            this.i.isWifiActiveScan();
            kVar.a(this.i.isWifiScan(), this.i.isMockEnable(), AMapLocationClientOption.isOpenAlwaysScanWifi(), aMapLocationClientOption.getScanWifiInterval());
        }
        i();
        com.autonavi.aps.amapapi.storage.a aVar = this.e;
        if (aVar != null) {
            aVar.a(this.i);
        }
        com.autonavi.aps.amapapi.trans.e eVar = this.f;
        if (eVar != null) {
            eVar.a(this.i);
        }
        e eVar2 = this.d;
        if (eVar2 != null) {
            eVar2.c(this.i.isNoLocReqCgiEnable());
        }
        k();
    }

    private void k() {
        boolean zIsNeedAddress;
        boolean z;
        boolean zIsOffset;
        AMapLocationClientOption.GeoLanguage geoLanguage = AMapLocationClientOption.GeoLanguage.DEFAULT;
        boolean zIsLocationCacheEnable = true;
        try {
            geoLanguage = this.i.getGeoLanguage();
            zIsNeedAddress = this.i.isNeedAddress();
            try {
                zIsOffset = this.i.isOffset();
                try {
                    zIsLocationCacheEnable = this.i.isLocationCacheEnable();
                    this.t = this.i.isOnceLocationLatest();
                    this.z = this.i.isSensorEnable();
                    if (zIsOffset != this.q || zIsNeedAddress != this.p || zIsLocationCacheEnable != this.s || geoLanguage != this.r) {
                        s();
                    }
                } catch (Throwable unused) {
                    z = zIsLocationCacheEnable;
                    zIsLocationCacheEnable = zIsOffset;
                    boolean z2 = z;
                    zIsOffset = zIsLocationCacheEnable;
                    zIsLocationCacheEnable = z2;
                }
            } catch (Throwable unused2) {
                z = true;
            }
        } catch (Throwable unused3) {
            zIsNeedAddress = true;
            z = true;
        }
        this.q = zIsOffset;
        this.p = zIsNeedAddress;
        this.s = zIsLocationCacheEnable;
        this.r = geoLanguage;
    }

    public final void d() {
        if (this.o.length() > 0) {
            StringBuilder sb = this.o;
            sb.delete(0, sb.length());
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x017d A[Catch: all -> 0x0199, TryCatch #2 {all -> 0x0199, blocks: (B:80:0x016d, B:83:0x0173, B:85:0x017d, B:88:0x0187, B:91:0x0191, B:92:0x0196), top: B:108:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0181  */
    /* JADX WARN: Code duplicated, block: B:88:0x0187 A[Catch: all -> 0x0199, TryCatch #2 {all -> 0x0199, blocks: (B:80:0x016d, B:83:0x0173, B:85:0x017d, B:88:0x0187, B:91:0x0191, B:92:0x0196), top: B:108:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:89:0x018b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0191 A[Catch: all -> 0x0199, TryCatch #2 {all -> 0x0199, blocks: (B:80:0x016d, B:83:0x0173, B:85:0x017d, B:88:0x0187, B:91:0x0191, B:92:0x0196), top: B:108:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0196 A[Catch: all -> 0x0199, TRY_LEAVE, TryCatch #2 {all -> 0x0199, blocks: (B:80:0x016d, B:83:0x0173, B:85:0x017d, B:88:0x0187, B:91:0x0191, B:92:0x0196), top: B:108:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01b4  */
    public final com.autonavi.aps.amapapi.model.a a(com.autonavi.aps.amapapi.a aVar) throws Throwable {
        k kVar;
        com.autonavi.aps.amapapi.restruct.b bVar;
        long jB;
        k kVar2;
        d();
        aVar.e("conitue");
        if (this.f3914a == null) {
            aVar.f("#0101");
            this.o.append("context is null#0101");
            return a(1, this.o.toString());
        }
        int i = this.I + 1;
        this.I = i;
        if (i == 1) {
            p();
        }
        if (a(this.k) && com.autonavi.aps.amapapi.utils.k.a(this.j)) {
            if (this.s && com.autonavi.aps.amapapi.utils.b.a(this.j.getTime())) {
                this.j.setLocationType(2);
            }
            return this.j;
        }
        com.autonavi.aps.amapapi.restruct.b bVar2 = this.y;
        if (bVar2 != null) {
            if (this.z) {
                bVar2.a();
            } else {
                bVar2.b();
            }
        }
        try {
            boolean z = this.i.isOnceLocationLatest() || !this.i.isOnceLocation();
            k kVar3 = this.f3916c;
            if (kVar3 != null) {
                kVar3.b(z);
                this.g = this.f3916c.e();
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "Aps", "getLocation getScanResultsParam");
        }
        try {
            e eVar = this.d;
            if (eVar != null) {
                eVar.a(false, q());
            }
        } catch (Throwable th2) {
            com.autonavi.aps.amapapi.utils.c.a(th2, "Aps", "getLocation getCgiListParam");
        }
        String strC = c(aVar);
        this.L = strC;
        if (TextUtils.isEmpty(strC)) {
            return a(this.x, this.o.toString());
        }
        this.u = a(this.u);
        k kVar4 = this.f3916c;
        if (kVar4 != null && kVar4.o()) {
            com.autonavi.aps.amapapi.model.a aVarA = a(15, "networkLocation has been mocked!#1502");
            aVar.f("#1502");
            aVarA.setMock(true);
            aVarA.setTrustedLevel(4);
            return aVarA;
        }
        boolean zO = o();
        e eVar2 = this.d;
        com.autonavi.aps.amapapi.model.a aVarA2 = null;
        com.autonavi.aps.amapapi.model.a aVarA3 = (eVar2 == null || (kVar2 = this.f3916c) == null) ? null : this.e.a(eVar2, zO, this.j, kVar2, this.u, this.L, this.f3914a, false);
        try {
            if (com.autonavi.aps.amapapi.utils.k.a(aVarA3)) {
                aVarA3.setTrustedLevel(2);
                d(aVarA3);
            } else {
                aVarA3 = b(true, aVar);
                if (com.autonavi.aps.amapapi.utils.k.a(aVarA3)) {
                    aVarA3.e("new");
                    this.e.a(this.u.toString());
                    e eVar3 = this.d;
                    if (eVar3 != null) {
                        this.e.a(eVar3.e());
                    }
                    d(aVarA3);
                } else {
                    e eVar4 = this.d;
                    if (eVar4 != null && (kVar = this.f3916c) != null) {
                        aVarA2 = this.e.a(eVar4, false, this.j, kVar, this.u, this.L, this.f3914a, true);
                    }
                    if (com.autonavi.aps.amapapi.utils.k.a(aVarA2)) {
                        aVar.f("#0001");
                        aVarA2.setTrustedLevel(2);
                        d(aVarA2);
                    }
                    if (this.f3916c != null && aVarA2 != null) {
                        jB = k.b();
                        if (jB <= 15) {
                            aVarA2.setTrustedLevel(1);
                        } else if (jB <= 120) {
                            aVarA2.setTrustedLevel(2);
                        } else if (jB <= 600) {
                            aVarA2.setTrustedLevel(3);
                        } else {
                            aVarA2.setTrustedLevel(4);
                        }
                    }
                    this.e.a(this.L, this.u, aVarA2, this.f3914a, true);
                    com.autonavi.aps.amapapi.utils.k.a(aVarA2);
                    StringBuilder sb = this.u;
                    sb.delete(0, sb.length());
                    if (aVarA2 != null) {
                        if (!this.z && (bVar = this.y) != null) {
                            aVarA2.setAltitude(bVar.c());
                            aVarA2.setBearing(this.y.d());
                            aVarA2.setSpeed((float) this.y.e());
                        } else {
                            aVarA2.setAltitude(0.0d);
                            aVarA2.setBearing(0.0f);
                            aVarA2.setSpeed(0.0f);
                        }
                    }
                    d(aVarA2);
                    return this.j;
                }
            }
            if (this.f3916c != null) {
                jB = k.b();
                if (jB <= 15) {
                    aVarA2.setTrustedLevel(1);
                } else if (jB <= 120) {
                    aVarA2.setTrustedLevel(2);
                } else if (jB <= 600) {
                    aVarA2.setTrustedLevel(3);
                } else {
                    aVarA2.setTrustedLevel(4);
                }
            }
        } catch (Throwable unused) {
        }
        aVarA2 = aVarA3;
        this.e.a(this.L, this.u, aVarA2, this.f3914a, true);
        com.autonavi.aps.amapapi.utils.k.a(aVarA2);
        StringBuilder sb2 = this.u;
        sb2.delete(0, sb2.length());
        if (aVarA2 != null) {
            if (!this.z) {
                aVarA2.setAltitude(0.0d);
                aVarA2.setBearing(0.0f);
                aVarA2.setSpeed(0.0f);
            } else {
                aVarA2.setAltitude(0.0d);
                aVarA2.setBearing(0.0f);
                aVarA2.setSpeed(0.0f);
            }
        }
        d(aVarA2);
        return this.j;
    }

    public final com.autonavi.aps.amapapi.model.a a(com.autonavi.aps.amapapi.model.a aVar) {
        this.B.a(this.s);
        return this.B.a(aVar);
    }

    public final void e() {
        this.C = null;
        this.v = false;
        this.w = false;
        com.autonavi.aps.amapapi.storage.a aVar = this.e;
        if (aVar != null) {
            aVar.b(this.f3914a);
        }
        com.autonavi.aps.amapapi.filters.a aVar2 = this.B;
        if (aVar2 != null) {
            aVar2.a();
        }
        if (this.f != null) {
            this.f = null;
        }
        g gVar = this.O;
        if (gVar != null) {
            gVar.a(this.F);
        }
        l();
        ArrayList<np> arrayList = this.g;
        if (arrayList != null) {
            arrayList.clear();
        }
        com.autonavi.aps.amapapi.restruct.b bVar = this.y;
        if (bVar != null) {
            bVar.f();
        }
        this.j = null;
        this.f3914a = null;
        this.u = null;
        this.H = null;
    }

    private void l() {
        a aVar;
        try {
            Context context = this.f3914a;
            if (context != null && (aVar = this.h) != null) {
                context.unregisterReceiver(aVar);
            }
        } catch (Throwable th) {
            try {
                com.autonavi.aps.amapapi.utils.c.a(th, "Aps", "destroy");
            } catch (Throwable th2) {
                this.h = null;
                throw th2;
            }
        }
        this.h = null;
        e eVar = this.d;
        if (eVar != null) {
            eVar.a(this.F);
        }
        k kVar = this.f3916c;
        if (kVar != null) {
            kVar.c(this.F);
        }
    }

    public final void a(boolean z) {
        e eVar = this.d;
        if (eVar != null) {
            eVar.b(z);
        }
    }

    private void m() {
        try {
            if (this.h == null) {
                this.h = new a();
            }
            if (this.G == null) {
                IntentFilter intentFilter = new IntentFilter();
                this.G = intentFilter;
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                this.G.addAction("android.net.wifi.SCAN_RESULTS");
                this.G.addAction("android.net.wifi.STATE_CHANGE");
            }
            this.f3914a.registerReceiver(this.h, this.G);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "Aps", "initBroadcastListener");
        }
    }

    private boolean a(long j) {
        if (!this.M) {
            this.M = true;
            return false;
        }
        if (com.autonavi.aps.amapapi.utils.k.b() - j < 800) {
            if ((com.autonavi.aps.amapapi.utils.k.a(this.j) ? com.autonavi.aps.amapapi.utils.k.a() - this.j.getTime() : 0L) <= 10000) {
                return true;
            }
        }
        return false;
    }

    private String c(com.autonavi.aps.amapapi.a aVar) {
        String string;
        e eVar = this.d;
        String str = "";
        if (eVar != null && this.f3916c != null) {
            int iH = eVar.h();
            com.autonavi.aps.amapapi.restruct.d dVarE = this.d.e();
            com.autonavi.aps.amapapi.restruct.d dVarF = this.d.f();
            ArrayList<np> arrayList = this.g;
            boolean z = arrayList == null || arrayList.isEmpty();
            if (dVarE == null && dVarF == null && z) {
                if (this.f3915b == null) {
                    this.f3915b = (ConnectivityManager) com.autonavi.aps.amapapi.utils.k.a(this.f3914a, "connectivity");
                }
                if (com.autonavi.aps.amapapi.utils.k.c() >= 31) {
                    if (com.autonavi.aps.amapapi.utils.k.a(this.f3914a) && !this.f3916c.m()) {
                        this.x = 18;
                        this.o.append("飞行模式下关闭了WIFI开关，请关闭飞行模式或者打开WIFI开关#1802");
                        i.a((String) null, 2132);
                        aVar.f("#1802");
                        return "";
                    }
                } else if (com.autonavi.aps.amapapi.utils.k.a(this.f3914a) && !this.f3916c.l()) {
                    this.x = 18;
                    this.o.append("飞行模式下关闭了WIFI开关，请关闭飞行模式或者打开WIFI开关#1801");
                    i.a((String) null, 2132);
                    aVar.f("#1801");
                    return "";
                }
                if (com.autonavi.aps.amapapi.utils.k.c() >= 28) {
                    if (this.H == null) {
                        this.H = (LocationManager) this.f3914a.getApplicationContext().getSystemService("location");
                    }
                    if (!((Boolean) com.autonavi.aps.amapapi.utils.g.a(this.H, "isLocationEnabled", new Object[0])).booleanValue()) {
                        this.x = 12;
                        this.o.append("定位服务没有开启，请在设置中打开定位服务开关#1206");
                        aVar.f("#1206");
                        i.a((String) null, 2121);
                        return "";
                    }
                }
                if (!com.autonavi.aps.amapapi.utils.k.e(this.f3914a)) {
                    this.x = 12;
                    this.o.append("定位权限被禁用,请授予应用定位权限#1201");
                    aVar.f("#1201");
                    i.a((String) null, 2121);
                    return "";
                }
                if (com.autonavi.aps.amapapi.utils.k.c() >= 24 && com.autonavi.aps.amapapi.utils.k.c() < 28 && Settings.Secure.getInt(this.f3914a.getContentResolver(), "location_mode", 0) == 0) {
                    this.x = 12;
                    aVar.f("#1206");
                    this.o.append("定位服务没有开启，请在设置中打开定位服务开关#1206");
                    i.a((String) null, 2121);
                    return "";
                }
                String strK = this.d.k();
                String strD = this.f3916c.d();
                if (this.f3916c.a(this.f3915b) && strD != null) {
                    this.x = 12;
                    aVar.f("#1202");
                    this.o.append("获取基站与获取WIFI的权限都被禁用，请在安全软件中打开应用的定位权限#1202");
                    i.a((String) null, 2121);
                    return "";
                }
                if (strK != null) {
                    this.x = 12;
                    if (!this.f3916c.l()) {
                        aVar.f("#1204");
                        this.o.append("WIFI开关关闭，并且获取基站权限被禁用，请在安全软件中打开应用的定位权限或者打开WIFI开关#1204");
                    } else {
                        aVar.f("#1205");
                        this.o.append("获取的WIFI列表为空，并且获取基站权限被禁用，请在安全软件中打开应用的定位权限#1205");
                    }
                    i.a((String) null, 2121);
                    return "";
                }
                if (!this.f3916c.l() && !this.d.n()) {
                    this.x = 19;
                    aVar.f("#1901");
                    this.o.append("没有检查到SIM卡，并且WIFI开关关闭，请打开WIFI开关或者插入SIM卡#1901");
                    i.a((String) null, 2133);
                    return "";
                }
                if (!this.f3916c.l()) {
                    aVar.f("#1301");
                    this.o.append("获取到的基站为空，并且关闭了WIFI开关，请您打开WIFI开关再发起定位#1301");
                } else {
                    aVar.f("#1302");
                    if (this.f3916c.c() != null) {
                        this.o.append("获取到的基站和WIFI信息均为空，请检查是否授予APP定位权限");
                        if (!com.autonavi.aps.amapapi.utils.k.f(this.f3914a)) {
                            this.o.append("或后台运行没有后台定位权限");
                        }
                        this.o.append("#1302");
                    } else {
                        this.o.append("获取到的基站和WIFI信息均为空，请移动到有WIFI的区域，若确定当前区域有WIFI，请检查是否授予APP定位权限");
                        if (!com.autonavi.aps.amapapi.utils.k.f(this.f3914a)) {
                            this.o.append("或后台运行没有后台定位权限");
                        }
                        this.o.append("#1302");
                    }
                }
                this.x = 13;
                i.a((String) null, 2131);
                return "";
            }
            boolean zA = k.a(this.f3916c.n());
            String str2 = "cgiwifi";
            if (iH == 0) {
                boolean z2 = !this.g.isEmpty() || zA;
                boolean z3 = dVarF != null;
                if (!z3) {
                    if (zA && this.g.isEmpty()) {
                        this.x = 2;
                        aVar.f("#0201");
                        this.o.append("当前基站为伪基站，并且WIFI权限被禁用，请在安全软件中打开应用的定位权限#0201");
                        i.a((String) null, 2021);
                        return "";
                    }
                    if (this.g.size() == 1) {
                        this.x = 2;
                        if (!zA) {
                            aVar.f("#0202");
                            this.o.append("当前基站为伪基站，并且搜到的WIFI数量不足，请移动到WIFI比较丰富的区域#0202");
                            i.a((String) null, 2022);
                            return "";
                        }
                        if (this.g.get(0).h) {
                            aVar.f("#0202");
                            this.o.append("当前基站为伪基站，并且搜到的WIFI数量不足，请移动到WIFI比较丰富的区域#0202");
                            i.a((String) null, 2021);
                            return "";
                        }
                    }
                }
                String str3 = String.format(Locale.US, "#%s#", "network");
                if (z3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(dVarF.b());
                    if (this.g.isEmpty() && !zA) {
                        str2 = "cgi";
                    }
                    sb.append("network#");
                    sb.append(str2);
                    string = sb.toString();
                } else if (z2) {
                    string = str3 + "wifi";
                } else {
                    this.x = 2;
                    if (!this.f3916c.l()) {
                        aVar.f("#0203");
                        this.o.append("当前基站为伪基站,并且关闭了WIFI开关，请在设置中打开WIFI开关#0203");
                    } else {
                        aVar.f("#0204");
                        this.o.append("当前基站为伪基站,并且没有搜索到WIFI，请移动到WIFI比较丰富的区域#0204");
                    }
                    i.a((String) null, 2022);
                }
                str = string;
            } else if (iH != 1) {
                if (iH != 2) {
                    this.x = 11;
                    i.a((String) null, 2111);
                    aVar.f("#1101");
                    this.o.append("get cgi failure#1101");
                } else if (dVarE != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(dVarE.f3947a);
                    sb2.append("#");
                    sb2.append(dVarE.f3948b);
                    sb2.append("#");
                    sb2.append(dVarE.h);
                    sb2.append("#");
                    sb2.append(dVarE.i);
                    sb2.append("#");
                    sb2.append(dVarE.j);
                    sb2.append("#network#");
                    if (this.g.isEmpty() && !zA) {
                        str2 = "cgi";
                    }
                    sb2.append(str2);
                    string = sb2.toString();
                    str = string;
                }
            } else if (dVarE != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(dVarE.f3947a);
                sb3.append("#");
                sb3.append(dVarE.f3948b);
                sb3.append("#");
                sb3.append(dVarE.f3949c);
                sb3.append("#");
                sb3.append(dVarE.d);
                sb3.append("#network#");
                if (this.g.isEmpty() && !zA) {
                    str2 = "cgi";
                }
                sb3.append(str2);
                string = sb3.toString();
                str = string;
            }
            if (!TextUtils.isEmpty(str)) {
                if (!str.startsWith("#")) {
                    str = "#" + str;
                }
                return com.autonavi.aps.amapapi.utils.k.e() + str;
            }
        }
        return str;
    }

    private StringBuilder a(StringBuilder sb) {
        if (sb == null) {
            sb = new StringBuilder(700);
        } else {
            sb.delete(0, sb.length());
        }
        e eVar = this.d;
        if (eVar != null && this.f3916c != null) {
            sb.append(eVar.m());
            sb.append(this.f3916c.p());
        }
        return sb;
    }

    private byte[] n() throws Throwable {
        if (this.l == null) {
            this.l = new f();
        }
        if (this.i == null) {
            this.i = new AMapLocationClientOption();
        }
        if (this.d != null && this.f3916c != null) {
            this.l.a(this.f3914a, this.i.isNeedAddress(), this.i.isOffset(), this.d, this.f3916c, this.f3915b, this.C, this.O);
        }
        return this.l.a();
    }

    final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (context == null || intent == null) {
                return;
            }
            try {
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                if (action.equals("android.net.wifi.SCAN_RESULTS")) {
                    if (b.this.f3916c != null) {
                        b.this.f3916c.j();
                    }
                    try {
                        if (intent.getExtras() == null || !intent.getExtras().getBoolean("resultsUpdated", true) || b.this.f3916c == null) {
                            return;
                        }
                        b.this.f3916c.i();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                    if (b.this.f3916c != null) {
                        b.this.f3916c.k();
                    }
                } else {
                    if (!action.equals("android.net.wifi.STATE_CHANGE") || b.this.f3916c == null) {
                        return;
                    }
                    b.this.f3916c.h();
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "Aps", "onReceive");
            }
        }
    }

    private com.autonavi.aps.amapapi.model.a a(com.autonavi.aps.amapapi.model.a aVar, lb lbVar, com.autonavi.aps.amapapi.a aVar2) {
        if (lbVar != null) {
            try {
                if (lbVar.f3037a != null && lbVar.f3037a.length != 0) {
                    com.autonavi.aps.amapapi.trans.e eVar = new com.autonavi.aps.amapapi.trans.e();
                    String str = new String(lbVar.f3037a, "UTF-8");
                    if (str.contains("\"status\":\"0\"")) {
                        com.autonavi.aps.amapapi.model.a aVarA = eVar.a(str, this.f3914a, lbVar, aVar2);
                        aVarA.h(this.u.toString());
                        return aVarA;
                    }
                    if (!str.contains("</body></html>")) {
                        return null;
                    }
                    aVar.setErrorCode(5);
                    k kVar = this.f3916c;
                    if (kVar != null && kVar.a(this.f3915b)) {
                        aVar2.f("#0501");
                        this.o.append("您连接的是一个需要登录的网络，请确认已经登入网络#0501");
                        i.a((String) null, 2051);
                    } else {
                        aVar2.f("#0502");
                        this.o.append("请求可能被劫持了#0502");
                        i.a((String) null, 2052);
                    }
                    aVar.setLocationDetail(this.o.toString());
                    return aVar;
                }
            } catch (Throwable th) {
                aVar.setErrorCode(4);
                com.autonavi.aps.amapapi.utils.c.a(th, "Aps", "checkResponseEntity");
                aVar2.f("#0403");
                this.o.append("check response exception ex is" + th.getMessage() + "#0403");
                aVar.setLocationDetail(this.o.toString());
                return aVar;
            }
        }
        aVar.setErrorCode(4);
        this.o.append("网络异常,请求异常#0403");
        aVar2.f("#0403");
        aVar.h(this.u.toString());
        aVar.setLocationDetail(this.o.toString());
        if (lbVar != null) {
            i.a(lbVar.d, 2041);
        }
        return aVar;
    }

    private static void c(com.autonavi.aps.amapapi.model.a aVar) {
        if (aVar.getErrorCode() == 0 && aVar.getLocationType() == 0) {
            if ("-5".equals(aVar.d()) || "1".equals(aVar.d()) || "2".equals(aVar.d()) || "14".equals(aVar.d()) || "24".equals(aVar.d()) || "-1".equals(aVar.d())) {
                aVar.setLocationType(5);
            } else {
                aVar.setLocationType(6);
            }
        }
    }

    private com.autonavi.aps.amapapi.model.a b(boolean z, com.autonavi.aps.amapapi.a aVar) {
        String str;
        try {
            if (TextUtils.isEmpty(this.P)) {
                this.P = iy.b(ip.a(this.f3914a) + "," + ip.f(this.f3914a));
            }
            StringBuilder sb = this.o;
            sb.append("#id:");
            sb.append(this.P);
        } catch (Throwable unused) {
        }
        com.autonavi.aps.amapapi.model.a aVar2 = new com.autonavi.aps.amapapi.model.a("");
        try {
            byte[] bArrN = n();
            long jB = com.autonavi.aps.amapapi.utils.k.b();
            this.k = jB;
            aVar.a(jB);
            try {
                com.autonavi.aps.amapapi.utils.c.c(this.f3914a);
                com.autonavi.aps.amapapi.trans.d dVarA = this.n.a(this.f3914a, bArrN, com.autonavi.aps.amapapi.utils.c.a(), com.autonavi.aps.amapapi.utils.c.b(), z);
                dVarA.getURL();
                String ipv6url = dVarA.getIPV6URL();
                im.a(this.f3914a);
                boolean z2 = !TextUtils.isEmpty(ipv6url) && ipv6url.contains("dualstack");
                int i = com.autonavi.aps.amapapi.trans.a.f3979a;
                if (im.a() && im.c() && z2) {
                    i = com.autonavi.aps.amapapi.trans.a.f3980b;
                }
                String strA = im.b() ? null : com.autonavi.aps.amapapi.trans.a.a(this.f3914a).a(dVarA, i);
                aVar.a(i == com.autonavi.aps.amapapi.trans.a.f3980b ? "v6" : "v4");
                lb lbVarA = this.n.a(dVarA);
                long jB2 = com.autonavi.aps.amapapi.utils.k.b();
                if (!TextUtils.isEmpty(strA)) {
                    if (!lbVarA.f) {
                        com.autonavi.aps.amapapi.trans.a.a(this.f3914a).a(true, i);
                    } else {
                        com.autonavi.aps.amapapi.trans.a.a(this.f3914a).a(false, i);
                        com.autonavi.aps.amapapi.trans.a.a(this.f3914a).a(i);
                    }
                }
                if (lbVarA != null && !TextUtils.isEmpty(strA)) {
                    if (!lbVarA.f) {
                        aVar.b(strA);
                        aVar.c(MonitorResult.SUCCESS);
                    } else {
                        aVar.b(strA);
                        aVar.c("FAIL");
                        aVar.d(MonitorResult.SUCCESS);
                    }
                } else {
                    aVar.d(MonitorResult.SUCCESS);
                }
                c cVar = this.R;
                if (cVar != null) {
                    cVar.d();
                }
                aVar.b(jB2);
                if (lbVarA != null) {
                    if (!TextUtils.isEmpty(lbVarA.f3039c)) {
                        this.o.append("#csid:" + lbVarA.f3039c);
                    }
                    str = lbVarA.d;
                    if (!TextUtils.isEmpty(str)) {
                        this.o.append("#gsid:".concat(String.valueOf(str)));
                    }
                    aVar2.h(this.u.toString());
                } else {
                    str = "";
                }
                com.autonavi.aps.amapapi.model.a aVarA = a(aVar2, lbVarA, aVar);
                if (aVarA != null) {
                    return aVarA;
                }
                byte[] bArrB = com.autonavi.aps.amapapi.security.a.b(lbVarA.f3037a);
                if (bArrB == null) {
                    aVar2.setErrorCode(5);
                    aVar.f("#0503");
                    this.o.append("解密数据失败#0503");
                    aVar2.setLocationDetail(this.o.toString());
                    i.a(str, 2053);
                    return aVar2;
                }
                com.autonavi.aps.amapapi.model.a aVarA2 = this.f.a(aVar2, bArrB, aVar);
                if (!com.autonavi.aps.amapapi.utils.k.a(aVarA2)) {
                    String strB = aVarA2.b();
                    this.J = strB;
                    if (!TextUtils.isEmpty(strB)) {
                        i.a(str, 2062);
                    } else {
                        i.a(str, 2061);
                    }
                    aVarA2.setErrorCode(6);
                    aVar.f("#0601");
                    StringBuilder sb2 = this.o;
                    StringBuilder sb3 = new StringBuilder("location faile retype:");
                    sb3.append(aVarA2.d());
                    sb3.append(" rdesc:");
                    sb3.append(TextUtils.isEmpty(this.J) ? "" : this.J);
                    sb3.append("#0601");
                    sb2.append(sb3.toString());
                    aVarA2.h(this.u.toString());
                    aVarA2.setLocationDetail(this.o.toString());
                    return aVarA2;
                }
                c(aVarA2);
                aVarA2.setOffset(this.q);
                aVarA2.a(this.p);
                aVarA2.f(String.valueOf(this.r));
                aVarA2.e("new");
                aVarA2.setLocationDetail(this.o.toString());
                this.C = aVarA2.a();
                return aVarA2;
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.k.b();
                aVar.d("FAIL");
                com.autonavi.aps.amapapi.trans.a.a(this.f3914a).a(false, com.autonavi.aps.amapapi.trans.a.f3979a);
                com.autonavi.aps.amapapi.utils.c.a(th, "Aps", "getApsLoc req");
                i.a("/mobile/binary", th);
                if (!com.autonavi.aps.amapapi.utils.k.d(this.f3914a)) {
                    aVar.f("#0401");
                    this.o.append("网络异常，未连接到网络，请连接网络#0401");
                } else if (th instanceof ik) {
                    ik ikVar = th;
                    if (ikVar.a().contains("网络异常状态码")) {
                        aVar.f("#0404");
                        StringBuilder sb4 = this.o;
                        sb4.append("网络异常，状态码错误#0404");
                        sb4.append(ikVar.f());
                    } else if (ikVar.f() == 23 || Math.abs((com.autonavi.aps.amapapi.utils.k.b() - this.k) - this.i.getHttpTimeOut()) < 500) {
                        aVar.f("#0402");
                        this.o.append("网络异常，连接超时#0402");
                    } else {
                        aVar.f("#0403," + th.getMessage());
                        this.o.append("网络异常,请求异常#0403");
                    }
                } else {
                    aVar.f("#0403," + th.getMessage());
                    this.o.append("网络异常,请求异常#0403");
                }
                com.autonavi.aps.amapapi.model.a aVarA3 = a(4, this.o.toString());
                aVarA3.h(this.u.toString());
                return aVarA3;
            }
        } catch (Throwable th2) {
            aVar.f("#0301");
            this.o.append("get parames error:" + th2.getMessage() + "#0301");
            i.a((String) null, 2031);
            com.autonavi.aps.amapapi.model.a aVarA4 = a(3, this.o.toString());
            aVarA4.h(this.u.toString());
            return aVarA4;
        }
    }

    private boolean o() {
        return this.k == 0 || com.autonavi.aps.amapapi.utils.k.b() - this.k > 20000;
    }

    private void b(Context context) {
        try {
            if (context.checkCallingOrSelfPermission(iy.c("EYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFQ1VSRV9TRVRUSU5HUw==")) == 0) {
                this.m = true;
            }
        } catch (Throwable unused) {
        }
    }

    private void p() {
        k kVar = this.f3916c;
        if (kVar == null) {
            return;
        }
        kVar.a(this.m);
    }

    public final void f() {
        c cVar = this.R;
        if (cVar != null) {
            cVar.d();
        }
    }

    public final void b(com.autonavi.aps.amapapi.a aVar) {
        try {
            if (this.v) {
                return;
            }
            r();
            if (this.t) {
                m();
            }
            k kVar = this.f3916c;
            if (kVar != null) {
                kVar.b(this.t);
                this.g = this.f3916c.e();
            }
            e eVar = this.d;
            if (eVar != null) {
                eVar.a(true, q());
            }
            String strC = c(aVar);
            this.L = strC;
            if (!TextUtils.isEmpty(strC)) {
                this.u = a(this.u);
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "Aps", "initFirstLocateParam");
        }
        this.v = true;
    }

    private boolean q() {
        k kVar = this.f3916c;
        if (kVar != null) {
            this.g = kVar.e();
        }
        ArrayList<np> arrayList = this.g;
        return arrayList == null || arrayList.size() <= 0;
    }

    private void r() {
        if (this.L != null) {
            this.L = null;
        }
        StringBuilder sb = this.u;
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public final com.autonavi.aps.amapapi.model.a b(boolean z) {
        k kVar = this.f3916c;
        if (kVar != null && kVar.o()) {
            return a(15, "networkLocation has been mocked!#1502");
        }
        if (TextUtils.isEmpty(this.L)) {
            return a(this.x, this.o.toString());
        }
        com.autonavi.aps.amapapi.model.a aVarA = this.e.a(this.f3914a, this.L, this.u, true, z);
        if (com.autonavi.aps.amapapi.utils.k.a(aVarA)) {
            d(aVarA);
        }
        return aVarA;
    }

    private void d(com.autonavi.aps.amapapi.model.a aVar) {
        if (aVar != null) {
            this.j = aVar;
        }
    }

    public final com.autonavi.aps.amapapi.model.a a(boolean z, com.autonavi.aps.amapapi.a aVar) {
        if (z) {
            aVar.e("statics");
        } else {
            aVar.e("first");
        }
        if (this.f3914a == null) {
            aVar.f("#0101");
            this.o.append("context is null#0101");
            i.a((String) null, 2011);
            return a(1, this.o.toString());
        }
        k kVar = this.f3916c;
        if (kVar != null && kVar.o()) {
            aVar.f("#1502");
            return a(15, "networkLocation has been mocked!#1502");
        }
        b();
        if (TextUtils.isEmpty(this.L)) {
            return a(this.x, this.o.toString());
        }
        com.autonavi.aps.amapapi.model.a aVarB = b(z, aVar);
        if (com.autonavi.aps.amapapi.utils.k.a(aVarB) && !Q) {
            this.e.a(this.u.toString());
            e eVar = this.d;
            if (eVar != null) {
                this.e.a(eVar.e());
            }
            d(aVarB);
        }
        Q = true;
        return aVarB;
    }

    public final void b(com.autonavi.aps.amapapi.model.a aVar) {
        if (com.autonavi.aps.amapapi.utils.k.a(aVar)) {
            this.e.a(this.L, this.u, aVar, this.f3914a, true);
        }
    }

    public final void g() {
        k kVar;
        try {
            if (this.f3914a == null) {
                return;
            }
            if (this.R == null) {
                this.R = new c(this.f3914a);
            }
            e eVar = this.d;
            if (eVar == null || (kVar = this.f3916c) == null) {
                return;
            }
            this.R.a(eVar, kVar, this.N);
        } catch (Throwable th) {
            jv.c(th, "as", "stc");
        }
    }

    public final void h() {
        c cVar = this.R;
        if (cVar != null) {
            cVar.a();
        }
    }

    private void s() {
        try {
            com.autonavi.aps.amapapi.storage.a aVar = this.e;
            if (aVar != null) {
                aVar.a();
            }
            d(null);
            this.M = false;
            com.autonavi.aps.amapapi.filters.a aVar2 = this.B;
            if (aVar2 != null) {
                aVar2.a();
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "Aps", "cleanCache");
        }
    }

    public final com.autonavi.aps.amapapi.model.a a(double d, double d2) {
        try {
            String strA = this.n.a(this.f3914a, d, d2);
            if (!strA.contains("\"status\":\"1\"")) {
                return null;
            }
            com.autonavi.aps.amapapi.model.a aVarA = this.f.a(strA);
            aVarA.setLatitude(d);
            aVarA.setLongitude(d2);
            return aVarA;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void a(AMapLocation aMapLocation) {
        if (aMapLocation != null && aMapLocation.getErrorCode() == 0) {
            com.autonavi.aps.amapapi.restruct.f fVar = new com.autonavi.aps.amapapi.restruct.f();
            fVar.f3955a = aMapLocation.getLocationType();
            fVar.d = aMapLocation.getTime();
            fVar.e = (int) aMapLocation.getAccuracy();
            fVar.f3956b = aMapLocation.getLatitude();
            fVar.f3957c = aMapLocation.getLongitude();
            if (aMapLocation.getLocationType() == 1) {
                this.O.a(fVar);
            }
            if (aMapLocation.getLocationType() == 12) {
                this.O.b(fVar);
            }
        }
    }

    public final void a(com.autonavi.aps.amapapi.model.a aVar, int i) {
        if (aVar != null && aVar.getErrorCode() == 0) {
            com.autonavi.aps.amapapi.restruct.f fVar = new com.autonavi.aps.amapapi.restruct.f();
            fVar.d = aVar.getTime();
            fVar.e = (int) aVar.getAccuracy();
            fVar.f3956b = aVar.getLatitude();
            fVar.f3957c = aVar.getLongitude();
            fVar.f3955a = i;
            fVar.g = Integer.parseInt(aVar.d());
            fVar.h = aVar.l();
            this.O.c(fVar);
        }
    }

    private static com.autonavi.aps.amapapi.model.a a(int i, String str) {
        com.autonavi.aps.amapapi.model.a aVar = new com.autonavi.aps.amapapi.model.a("");
        aVar.setErrorCode(i);
        aVar.setLocationDetail(str);
        if (i == 15) {
            i.a((String) null, 2151);
        }
        return aVar;
    }
}
