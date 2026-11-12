package com.loc;

import android.text.TextUtils;
import com.amap.api.location.AMapLocation;

/* JADX INFO: loaded from: classes18.dex */
public final class dq {
    public dr a = null;
    public long b = 0;
    public long c = 0;
    private boolean h = true;
    public int d = 0;
    public long e = 0;
    public AMapLocation f = null;
    public long g = 0;

    private dr b(dr drVar) {
        int i;
        if (eo.a(drVar)) {
            if (!this.h || !eh.b(drVar.getTime())) {
                i = this.d;
            } else if (drVar.getLocationType() == 5 || drVar.getLocationType() == 6) {
                i = 4;
            }
            drVar.setLocationType(i);
        }
        return drVar;
    }

    public final AMapLocation a(AMapLocation aMapLocation) {
        if (!eo.a(aMapLocation)) {
            return aMapLocation;
        }
        long jB = eo.b() - this.g;
        this.g = eo.b();
        if (jB > 5000) {
            return aMapLocation;
        }
        AMapLocation aMapLocation2 = this.f;
        if (aMapLocation2 == null) {
            this.f = aMapLocation;
            return aMapLocation;
        }
        if (1 != aMapLocation2.getLocationType() && !"gps".equalsIgnoreCase(this.f.getProvider())) {
            this.f = aMapLocation;
            return aMapLocation;
        }
        if (this.f.getAltitude() == aMapLocation.getAltitude() && this.f.getLongitude() == aMapLocation.getLongitude()) {
            this.f = aMapLocation;
            return aMapLocation;
        }
        long jAbs = Math.abs(aMapLocation.getTime() - this.f.getTime());
        if (30000 < jAbs) {
            this.f = aMapLocation;
            return aMapLocation;
        }
        if (eo.a(aMapLocation, this.f) > (((this.f.getSpeed() + aMapLocation.getSpeed()) * jAbs) / 2000.0f) + ((this.f.getAccuracy() + aMapLocation.getAccuracy()) * 2.0f) + 3000.0f) {
            return this.f;
        }
        this.f = aMapLocation;
        return aMapLocation;
    }

    public final dr a(dr drVar) {
        if (eo.b() - this.e > 30000) {
            this.a = drVar;
            this.e = eo.b();
            return this.a;
        }
        this.e = eo.b();
        if (!eo.a(this.a) || !eo.a(drVar)) {
            this.b = eo.b();
            this.a = drVar;
            return drVar;
        }
        if (drVar.getTime() == this.a.getTime() && drVar.getAccuracy() < 300.0f) {
            return drVar;
        }
        if (drVar.getProvider().equals("gps")) {
            this.b = eo.b();
            this.a = drVar;
            return drVar;
        }
        if (drVar.c() != this.a.c()) {
            this.b = eo.b();
            this.a = drVar;
            return drVar;
        }
        if (!drVar.getBuildingId().equals(this.a.getBuildingId()) && !TextUtils.isEmpty(drVar.getBuildingId())) {
            this.b = eo.b();
            this.a = drVar;
            return drVar;
        }
        this.d = drVar.getLocationType();
        float fA = eo.a(drVar, this.a);
        float accuracy = this.a.getAccuracy();
        float accuracy2 = drVar.getAccuracy();
        float f = accuracy2 - accuracy;
        long jB = eo.b();
        long j = jB - this.b;
        boolean z = accuracy <= 100.0f && accuracy2 > 299.0f;
        boolean z2 = accuracy > 299.0f && accuracy2 > 299.0f;
        if (z || z2) {
            long j2 = this.c;
            if (j2 == 0) {
                this.c = jB;
            } else if (jB - j2 > 30000) {
                this.b = jB;
                this.a = drVar;
                this.c = 0L;
                return drVar;
            }
            dr drVarB = b(this.a);
            this.a = drVarB;
            return drVarB;
        }
        if (accuracy2 < 100.0f && accuracy > 299.0f) {
            this.b = jB;
            this.a = drVar;
            this.c = 0L;
            return drVar;
        }
        if (accuracy2 <= 299.0f) {
            this.c = 0L;
        }
        if (fA >= 10.0f || fA <= 0.1d || accuracy2 <= 5.0f) {
            if (f < 300.0f) {
                this.b = eo.b();
                this.a = drVar;
                return drVar;
            }
            if (j >= 30000) {
                this.b = eo.b();
                this.a = drVar;
                return drVar;
            }
            dr drVarB2 = b(this.a);
            this.a = drVarB2;
            return drVarB2;
        }
        if (f >= -300.0f) {
            dr drVarB3 = b(this.a);
            this.a = drVarB3;
            return drVarB3;
        }
        if (accuracy / accuracy2 >= 2.0f) {
            this.b = jB;
            this.a = drVar;
            return drVar;
        }
        dr drVarB4 = b(this.a);
        this.a = drVarB4;
        return drVarB4;
    }

    public final void a() {
        this.a = null;
        this.b = 0L;
        this.c = 0L;
        this.f = null;
        this.g = 0L;
    }

    public final void a(boolean z) {
        this.h = z;
    }
}
