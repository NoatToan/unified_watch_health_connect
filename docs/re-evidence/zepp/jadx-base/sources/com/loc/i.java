package com.loc;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.huami.watch.companion.ecg.media.MediaRecorderHelper;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class i {
    public static dz b;
    public static ae e;
    public static long g;
    public String a = null;
    public dz c = null;
    public dz d = null;
    public long f = 0;
    public boolean h = false;
    private Context i;

    public i(Context context) {
        this.i = context.getApplicationContext();
    }

    private void e() {
        if (b == null || eo.b() - g > MediaRecorderHelper.MAX_RECORD_TIME) {
            dz dzVarF = f();
            g = eo.b();
            if (dzVarF == null || !eo.a(dzVarF.a())) {
                return;
            }
            b = dzVarF;
        }
    }

    private dz f() {
        Throwable th;
        dz dzVar;
        byte[] bArrB;
        byte[] bArrB2;
        String str = null;
        if (this.i == null) {
            return null;
        }
        a();
        try {
            ae aeVar = e;
            if (aeVar == null) {
                return null;
            }
            List listA = aeVar.a("_id=1", dz.class);
            if (listA.size() > 0) {
                dzVar = (dz) listA.get(0);
                try {
                    byte[] bArrB3 = o.b(dzVar.c());
                    String str2 = (bArrB3 == null || bArrB3.length <= 0 || (bArrB2 = dx.b(bArrB3, this.a)) == null || bArrB2.length <= 0) ? null : new String(bArrB2, "UTF-8");
                    byte[] bArrB4 = o.b(dzVar.b());
                    if (bArrB4 != null && bArrB4.length > 0 && (bArrB = dx.b(bArrB4, this.a)) != null && bArrB.length > 0) {
                        str = new String(bArrB, "UTF-8");
                    }
                    dzVar.a(str);
                    str = str2;
                } catch (Throwable th2) {
                    th = th2;
                    ei.a(th, "LastLocationManager", "readLastFix");
                }
            } else {
                dzVar = null;
            }
            if (!TextUtils.isEmpty(str)) {
                AMapLocation aMapLocation = new AMapLocation("");
                ei.a(aMapLocation, new JSONObject(str));
                if (eo.b(aMapLocation)) {
                    dzVar.a(aMapLocation);
                }
            }
            return dzVar;
        } catch (Throwable th3) {
            th = th3;
            dzVar = null;
        }
        ei.a(th, "LastLocationManager", "readLastFix");
        return dzVar;
    }

    public final AMapLocation a(AMapLocation aMapLocation, String str, long j) {
        if (aMapLocation == null || aMapLocation.getErrorCode() == 0 || aMapLocation.getLocationType() == 1 || aMapLocation.getErrorCode() == 7) {
            return aMapLocation;
        }
        try {
            e();
            dz dzVar = b;
            if (dzVar != null && dzVar.a() != null) {
                boolean zA = false;
                if (TextUtils.isEmpty(str)) {
                    long jB = eo.b() - b.d();
                    if (jB >= 0 && jB <= j) {
                        zA = true;
                    }
                    aMapLocation.setTrustedLevel(3);
                } else {
                    zA = eo.a(b.b(), str);
                    aMapLocation.setTrustedLevel(2);
                }
                if (!zA) {
                    return aMapLocation;
                }
                AMapLocation aMapLocationA = b.a();
                try {
                    aMapLocationA.setLocationType(9);
                    aMapLocationA.setFixLastLocation(true);
                    aMapLocationA.setLocationDetail(aMapLocation.getLocationDetail());
                    return aMapLocationA;
                } catch (Throwable th) {
                    th = th;
                    aMapLocation = aMapLocationA;
                }
                ei.a(th, "LastLocationManager", "fixLastLocation");
                return aMapLocation;
            }
            return aMapLocation;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void a() {
        if (this.h) {
            return;
        }
        try {
            if (this.a == null) {
                this.a = dx.a("MD5", n.w(this.i));
            }
            if (e == null) {
                e = new ae(this.i, ae.a((Class<? extends ad>) ea.class));
            }
        } catch (Throwable th) {
            ei.a(th, "LastLocationManager", "<init>:DBOperation");
        }
        this.h = true;
    }

    public final boolean a(AMapLocation aMapLocation, String str) {
        if (this.i != null && aMapLocation != null && eo.a(aMapLocation) && aMapLocation.getLocationType() != 2 && !aMapLocation.isMock() && !aMapLocation.isFixLastLocation()) {
            dz dzVar = new dz();
            dzVar.a(aMapLocation);
            if (aMapLocation.getLocationType() == 1) {
                dzVar.a((String) null);
            } else {
                dzVar.a(str);
            }
            try {
                b = dzVar;
                g = eo.b();
                this.c = dzVar;
                dz dzVar2 = this.d;
                if ((dzVar2 == null || eo.a(dzVar2.a(), dzVar.a()) > 500.0f) && eo.b() - this.f > 30000) {
                    return true;
                }
            } catch (Throwable th) {
                ei.a(th, "LastLocationManager", "setLastFix");
            }
        }
        return false;
    }

    public final AMapLocation b() {
        e();
        dz dzVar = b;
        if (dzVar != null && eo.a(dzVar.a())) {
            return b.a();
        }
        return null;
    }

    public final void c() {
        try {
            d();
            this.f = 0L;
            this.h = false;
            this.c = null;
            this.d = null;
        } catch (Throwable th) {
            ei.a(th, "LastLocationManager", "destroy");
        }
    }

    public final void d() {
        dz dzVar;
        String strB;
        try {
            a();
            dz dzVar2 = this.c;
            if (dzVar2 != null && eo.a(dzVar2.a()) && e != null && (dzVar = this.c) != this.d && dzVar.d() == 0) {
                String str = this.c.a().toStr();
                String strB2 = this.c.b();
                this.d = this.c;
                String str2 = null;
                if (TextUtils.isEmpty(str)) {
                    strB = null;
                } else {
                    String strB3 = o.b(dx.a(str.getBytes("UTF-8"), this.a));
                    strB = TextUtils.isEmpty(strB2) ? null : o.b(dx.a(strB2.getBytes("UTF-8"), this.a));
                    str2 = strB3;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                dz dzVar3 = new dz();
                dzVar3.b(str2);
                dzVar3.a(eo.b());
                dzVar3.a(strB);
                e.a(dzVar3, "_id=1");
                this.f = eo.b();
                dz dzVar4 = b;
                if (dzVar4 != null) {
                    dzVar4.a(eo.b());
                }
            }
        } catch (Throwable th) {
            ei.a(th, "LastLocationManager", "saveLastFix");
        }
    }
}
