package defpackage;

import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes11.dex */
public class nwa {
    private static volatile nwa l;
    private static final byte[] k = {-15, -128, -128, -14};
    private static final byte[] j = {-15, -123, -123, -14};
    private static final byte[] i = {-15, -125, -125, -14};
    private static final byte[] f = {-15, -127, -127, -14};
    private static final byte[] g = {-15, -126, -126, -14};
    private static final byte[] n = {-15, -96, -96, -14};
    private static final byte[] d = {-15, -95, -95, -14};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f43853b = {-15, -80, -80, -14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f43854c = {-15, -93, -93, -14};
    private static final byte[] h = {-15, -91, -91, -14};
    private static final byte[] e = {-15, -76, -76, -14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f43852a = {-15, -94, -94, -14};
    private String m = "unknown";
    private boolean r = false;
    private boolean t = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean s = false;
    private int x = 0;
    private long u = 0;
    private ISportDataCallback w = null;
    private ISportDataCallback v = null;

    private nwa() {
    }

    public static nwa n() {
        nwa nwaVar;
        synchronized (nwa.class) {
            if (l == null) {
                l = new nwa();
                LogUtil.a("Track_IDEQ/GlobleOrConsVar", "getInstance of IndoorEquipmentConstants, instance == null, create a new one");
            } else {
                LogUtil.a("Track_IDEQ/GlobleOrConsVar", "getInstance of IndoorEquipmentConstants, instance is not null");
            }
            nwaVar = l;
        }
        return nwaVar;
    }

    public void b(ISportDataCallback iSportDataCallback) {
        if (iSportDataCallback == null) {
            return;
        }
        if (this.w != null) {
            this.w = iSportDataCallback;
            return;
        }
        this.w = iSportDataCallback;
        SportDataOutputApi sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
        if (sportDataOutputApi != null && sportDataOutputApi.isAlreadyInit()) {
            sportDataOutputApi.registerDeviceDataCallback(this.w);
        }
    }

    public void d(ISportDataCallback iSportDataCallback) {
        if (iSportDataCallback == null) {
            LogUtil.e("Track_IDEQ/GlobleOrConsVar", "wearSportDataCallback is null");
        } else {
            this.v = iSportDataCallback;
        }
    }

    public ISportDataCallback q() {
        return this.v;
    }

    public ISportDataCallback o() {
        return this.w;
    }

    public String m() {
        return this.m;
    }

    public void e(String str) {
        this.m = str;
    }

    public boolean t() {
        return this.r;
    }

    public void e(boolean z) {
        this.r = z;
    }

    public boolean s() {
        return this.t;
    }

    public void a(boolean z) {
        this.t = z;
    }

    public boolean u() {
        return this.q;
    }

    public void i(boolean z) {
        this.q = z;
    }

    public boolean r() {
        return this.o;
    }

    public void c(boolean z) {
        this.o = z;
    }

    public boolean y() {
        return this.p;
    }

    public void d(boolean z) {
        this.p = z;
    }

    public void b(boolean z) {
        this.s = z;
    }

    public void v() {
        SportLifecycle sportLifecycle = (SportLifecycle) Services.d("SportService", SportLifecycle.class);
        if (sportLifecycle != null) {
            LogUtil.a("Track_IDEQ/GlobleOrConsVar", "sportDataOutputApi != null");
            sportLifecycle.onStopSport();
        }
    }

    public static byte[] h() {
        return (byte[]) k.clone();
    }

    public static byte[] f() {
        return (byte[]) j.clone();
    }

    public static byte[] d() {
        return (byte[]) i.clone();
    }

    public static byte[] g() {
        return (byte[]) f.clone();
    }

    public static byte[] i() {
        return (byte[]) g.clone();
    }

    public static byte[] k() {
        return (byte[]) n.clone();
    }

    public static byte[] b() {
        return (byte[]) d.clone();
    }

    public static byte[] a() {
        return (byte[]) f43854c.clone();
    }

    public static byte[] j() {
        return (byte[]) h.clone();
    }

    public static byte[] e() {
        return (byte[]) e.clone();
    }

    public static byte[] c() {
        return (byte[]) f43852a.clone();
    }

    public int p() {
        return this.x;
    }

    public void e(int i2) {
        this.x = i2;
    }

    public long l() {
        return this.u;
    }

    public void c(long j2) {
        this.u = j2;
    }
}
