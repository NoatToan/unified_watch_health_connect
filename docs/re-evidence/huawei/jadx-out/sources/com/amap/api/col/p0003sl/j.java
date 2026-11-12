package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.autonavi.aps.amapapi.security.a;
import com.autonavi.aps.amapapi.storage.b;
import com.autonavi.aps.amapapi.storage.c;
import com.autonavi.aps.amapapi.utils.k;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static b f2850b;
    static ke e;
    static long g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f2851a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b f2852c = null;
    b d = null;
    long f = 0;
    boolean h = false;
    private Context i;

    public j(Context context) {
        this.i = context.getApplicationContext();
    }

    public final void a() {
        if (this.h) {
            return;
        }
        try {
            if (this.f2851a == null) {
                this.f2851a = a.a("MD5", ip.k());
            }
            if (e == null) {
                e = new ke(this.i, ke.a((Class<? extends kd>) c.class));
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "LastLocationManager", "<init>:DBOperation");
        }
        this.h = true;
    }

    public final boolean a(AMapLocation aMapLocation, String str) {
        if (this.i != null && aMapLocation != null && k.a(aMapLocation) && aMapLocation.getLocationType() != 2 && !aMapLocation.isMock() && !aMapLocation.isFixLastLocation()) {
            b bVar = new b();
            bVar.a(aMapLocation);
            if (aMapLocation.getLocationType() == 1) {
                bVar.a((String) null);
            } else {
                bVar.a(str);
            }
            try {
                f2850b = bVar;
                g = k.b();
                this.f2852c = bVar;
                b bVar2 = this.d;
                if ((bVar2 == null || k.a(bVar2.a(), bVar.a()) > 500.0f) && k.b() - this.f > 30000) {
                    return true;
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "LastLocationManager", "setLastFix");
            }
        }
        return false;
    }

    public final AMapLocation b() {
        e();
        b bVar = f2850b;
        if (bVar != null && k.a(bVar.a())) {
            return f2850b.a();
        }
        return null;
    }

    public final AMapLocation a(AMapLocation aMapLocation, String str, long j) {
        AMapLocation aMapLocationA;
        Throwable th;
        boolean zA;
        if (aMapLocation == null || aMapLocation.getErrorCode() == 0 || aMapLocation.getLocationType() == 1 || aMapLocation.getErrorCode() == 7) {
            return aMapLocation;
        }
        try {
            e();
            b bVar = f2850b;
            if (bVar != null && bVar.a() != null) {
                if (TextUtils.isEmpty(str)) {
                    long jB = k.b() - f2850b.d();
                    zA = jB >= 0 && jB <= j;
                    aMapLocation.setTrustedLevel(3);
                } else {
                    zA = k.a(f2850b.b(), str);
                    aMapLocation.setTrustedLevel(2);
                }
                if (!zA) {
                    return aMapLocation;
                }
                aMapLocationA = f2850b.a();
                try {
                    com.autonavi.aps.amapapi.utils.a.a(aMapLocationA);
                    aMapLocationA.setLocationType(9);
                    aMapLocationA.setFixLastLocation(true);
                    aMapLocationA.setLocationDetail(aMapLocation.getLocationDetail());
                    return aMapLocationA;
                } catch (Throwable th2) {
                    th = th2;
                }
                com.autonavi.aps.amapapi.utils.c.a(th, "LastLocationManager", "fixLastLocation");
                return aMapLocationA;
            }
            return aMapLocation;
        } catch (Throwable th3) {
            aMapLocationA = aMapLocation;
            th = th3;
        }
    }

    public final void c() {
        try {
            d();
            this.f = 0L;
            this.h = false;
            this.f2852c = null;
            this.d = null;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "LastLocationManager", "destroy");
        }
    }

    public final void d() {
        b bVar;
        String strB;
        try {
            a();
            b bVar2 = this.f2852c;
            if (bVar2 != null && k.a(bVar2.a()) && e != null && (bVar = this.f2852c) != this.d && bVar.d() == 0) {
                String str = this.f2852c.a().toStr();
                String strB2 = this.f2852c.b();
                this.d = this.f2852c;
                String str2 = null;
                if (TextUtils.isEmpty(str)) {
                    strB = null;
                } else {
                    String strB3 = iq.b(a.a(str.getBytes("UTF-8"), this.f2851a));
                    strB = TextUtils.isEmpty(strB2) ? null : iq.b(a.a(strB2.getBytes("UTF-8"), this.f2851a));
                    str2 = strB3;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                b bVar3 = new b();
                bVar3.b(str2);
                bVar3.a(k.b());
                bVar3.a(strB);
                e.a(bVar3, "_id=1");
                this.f = k.b();
                b bVar4 = f2850b;
                if (bVar4 != null) {
                    bVar4.a(k.b());
                }
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "LastLocationManager", "saveLastFix");
        }
    }

    private void e() {
        if (f2850b == null || k.b() - g > 180000) {
            b bVarF = f();
            g = k.b();
            if (bVarF == null || !k.a(bVarF.a())) {
                return;
            }
            f2850b = bVarF;
        }
    }

    private b f() {
        Throwable th;
        b bVar;
        String str;
        byte[] bArrB;
        byte[] bArrB2;
        b bVar2 = null;
        str = null;
        str = null;
        str = null;
        String str2 = null;
        bVar2 = null;
        if (this.i == null) {
            return null;
        }
        a();
        try {
            ke keVar = e;
            if (keVar == null) {
                return null;
            }
            List listB = keVar.b("_id=1", b.class);
            if (listB == null || listB.size() <= 0) {
                str = null;
            } else {
                bVar = (b) listB.get(0);
                try {
                    byte[] bArrB3 = iq.b(bVar.c());
                    str = (bArrB3 == null || bArrB3.length <= 0 || (bArrB2 = a.b(bArrB3, this.f2851a)) == null || bArrB2.length <= 0) ? null : new String(bArrB2, "UTF-8");
                    byte[] bArrB4 = iq.b(bVar.b());
                    if (bArrB4 != null && bArrB4.length > 0 && (bArrB = a.b(bArrB4, this.f2851a)) != null && bArrB.length > 0) {
                        str2 = new String(bArrB, "UTF-8");
                    }
                    bVar.a(str2);
                    bVar2 = bVar;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                AMapLocation aMapLocation = new AMapLocation("");
                com.autonavi.aps.amapapi.utils.c.a(aMapLocation, new JSONObject(str));
                if (k.b(aMapLocation)) {
                    bVar2.a(aMapLocation);
                }
            }
            return bVar2;
        } catch (Throwable th3) {
            b bVar3 = bVar2;
            th = th3;
            bVar = bVar3;
        }
        com.autonavi.aps.amapapi.utils.c.a(th, "LastLocationManager", "readLastFix");
        return bVar;
    }
}
