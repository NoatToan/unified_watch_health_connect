package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.autonavi.aps.amapapi.storage.b;
import com.autonavi.aps.amapapi.utils.a;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.k;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class t0t {
    public static b g;
    public static a4t h;
    public static long i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f34185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34186b = null;
    public b c = null;
    public b d = null;
    public long e = 0;
    public boolean f = false;

    public t0t(Context context) {
        this.f34185a = context.getApplicationContext();
    }

    public final AMapLocation a(AMapLocation aMapLocation, String str, long j) {
        boolean zA;
        if (aMapLocation == null || aMapLocation.getErrorCode() == 0 || aMapLocation.getLocationType() == 1 || aMapLocation.getErrorCode() == 7) {
            return aMapLocation;
        }
        try {
            g();
            b bVar = g;
            if (bVar != null && bVar.a() != null) {
                if (TextUtils.isEmpty(str)) {
                    long jB = k.b() - g.d();
                    zA = jB >= 0 && jB <= j;
                    aMapLocation.setTrustedLevel(3);
                } else {
                    zA = k.a(g.b(), str);
                    aMapLocation.setTrustedLevel(2);
                }
                if (!zA) {
                    return aMapLocation;
                }
                AMapLocation aMapLocationA = g.a();
                try {
                    a.a(aMapLocationA);
                    aMapLocationA.setLocationType(9);
                    aMapLocationA.setFixLastLocation(true);
                    aMapLocationA.setLocationDetail(aMapLocation.getLocationDetail());
                    return aMapLocationA;
                } catch (Throwable th) {
                    th = th;
                    aMapLocation = aMapLocationA;
                }
                c.a(th, "LastLocationManager", "fixLastLocation");
                return aMapLocation;
            }
            return aMapLocation;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void b() {
        if (this.f) {
            return;
        }
        try {
            if (this.f34186b == null) {
                this.f34186b = com.autonavi.aps.amapapi.security.a.a(Coder.KEY_MD5, h0t.N());
            }
            if (h == null) {
                h = new a4t(this.f34185a, a4t.e(com.autonavi.aps.amapapi.storage.c.class));
            }
        } catch (Throwable th) {
            c.a(th, "LastLocationManager", "<init>:DBOperation");
        }
        this.f = true;
    }

    public final boolean c(AMapLocation aMapLocation, String str) {
        if (this.f34185a != null && aMapLocation != null && k.a(aMapLocation) && aMapLocation.getLocationType() != 2 && !aMapLocation.isMock() && !aMapLocation.isFixLastLocation()) {
            b bVar = new b();
            bVar.a(aMapLocation);
            if (aMapLocation.getLocationType() == 1) {
                bVar.a((String) null);
            } else {
                bVar.a(str);
            }
            try {
                g = bVar;
                i = k.b();
                this.c = bVar;
                b bVar2 = this.d;
                if ((bVar2 == null || k.a(bVar2.a(), bVar.a()) > 500.0f) && k.b() - this.e > 30000) {
                    return true;
                }
            } catch (Throwable th) {
                c.a(th, "LastLocationManager", "setLastFix");
            }
        }
        return false;
    }

    public final AMapLocation d() {
        g();
        b bVar = g;
        if (bVar != null && k.a(bVar.a())) {
            return g.a();
        }
        return null;
    }

    public final void e() {
        try {
            f();
            this.e = 0L;
            this.f = false;
            this.c = null;
            this.d = null;
        } catch (Throwable th) {
            c.a(th, "LastLocationManager", "destroy");
        }
    }

    public final void f() {
        b bVar;
        String strF;
        try {
            b();
            b bVar2 = this.c;
            if (bVar2 != null && k.a(bVar2.a()) && h != null && (bVar = this.c) != this.d && bVar.d() == 0) {
                String str = this.c.a().toStr();
                String strB = this.c.b();
                this.d = this.c;
                String str2 = null;
                if (TextUtils.isEmpty(str)) {
                    strF = null;
                } else {
                    String strF2 = j0t.f(com.autonavi.aps.amapapi.security.a.a(str.getBytes("UTF-8"), this.f34186b));
                    strF = TextUtils.isEmpty(strB) ? null : j0t.f(com.autonavi.aps.amapapi.security.a.a(strB.getBytes("UTF-8"), this.f34186b));
                    str2 = strF2;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                b bVar3 = new b();
                bVar3.b(str2);
                bVar3.a(k.b());
                bVar3.a(strF);
                h.h(bVar3, "_id=1");
                this.e = k.b();
                b bVar4 = g;
                if (bVar4 != null) {
                    bVar4.a(k.b());
                }
            }
        } catch (Throwable th) {
            c.a(th, "LastLocationManager", "saveLastFix");
        }
    }

    public final void g() {
        if (g == null || k.b() - i > 180000) {
            b bVarH = h();
            i = k.b();
            if (bVarH == null || !k.a(bVarH.a())) {
                return;
            }
            g = bVarH;
        }
    }

    public final b h() {
        Throwable th;
        b bVar;
        byte[] bArrB;
        byte[] bArrB2;
        String str = null;
        if (this.f34185a == null) {
            return null;
        }
        b();
        try {
            a4t a4tVar = h;
            if (a4tVar == null) {
                return null;
            }
            List listO = a4tVar.o("_id=1", b.class);
            if (listO == null || listO.size() <= 0) {
                bVar = null;
            } else {
                bVar = (b) listO.get(0);
                try {
                    byte[] bArrG = j0t.g(bVar.c());
                    String str2 = (bArrG == null || bArrG.length <= 0 || (bArrB2 = com.autonavi.aps.amapapi.security.a.b(bArrG, this.f34186b)) == null || bArrB2.length <= 0) ? null : new String(bArrB2, "UTF-8");
                    byte[] bArrG2 = j0t.g(bVar.b());
                    if (bArrG2 != null && bArrG2.length > 0 && (bArrB = com.autonavi.aps.amapapi.security.a.b(bArrG2, this.f34186b)) != null && bArrB.length > 0) {
                        str = new String(bArrB, "UTF-8");
                    }
                    bVar.a(str);
                    str = str2;
                } catch (Throwable th2) {
                    th = th2;
                    c.a(th, "LastLocationManager", "readLastFix");
                }
            }
            if (!TextUtils.isEmpty(str)) {
                AMapLocation aMapLocation = new AMapLocation("");
                c.a(aMapLocation, new JSONObject(str));
                if (k.b(aMapLocation)) {
                    bVar.a(aMapLocation);
                }
            }
            return bVar;
        } catch (Throwable th3) {
            th = th3;
            bVar = null;
        }
        c.a(th, "LastLocationManager", "readLastFix");
        return bVar;
    }
}
