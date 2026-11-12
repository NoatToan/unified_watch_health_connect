package com.autonavi.aps.amapapi.filters;

import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.autonavi.aps.amapapi.utils.b;
import com.autonavi.aps.amapapi.utils.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.autonavi.aps.amapapi.model.a f6841a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f6842b = 0;
    long c = 0;
    private boolean h = true;
    int d = 0;
    long e = 0;
    AMapLocation f = null;
    long g = 0;

    private com.autonavi.aps.amapapi.model.a b(com.autonavi.aps.amapapi.model.a aVar) {
        if (k.a(aVar)) {
            if (!this.h || !b.a(aVar.getTime())) {
                aVar.setLocationType(this.d);
            } else if (aVar.getLocationType() == 5 || aVar.getLocationType() == 6) {
                aVar.setLocationType(4);
            }
        }
        return aVar;
    }

    public final void a() {
        this.f6841a = null;
        this.f6842b = 0L;
        this.c = 0L;
        this.f = null;
        this.g = 0L;
    }

    public final com.autonavi.aps.amapapi.model.a a(com.autonavi.aps.amapapi.model.a aVar) {
        if (k.b() - this.e > 30000) {
            this.f6841a = aVar;
            this.e = k.b();
            return this.f6841a;
        }
        this.e = k.b();
        if (!k.a(this.f6841a) || !k.a(aVar)) {
            this.f6842b = k.b();
            this.f6841a = aVar;
            return aVar;
        }
        if (aVar.getTime() == this.f6841a.getTime() && aVar.getAccuracy() < 300.0f) {
            return aVar;
        }
        if ("gps".equals(aVar.getProvider())) {
            this.f6842b = k.b();
            this.f6841a = aVar;
            return aVar;
        }
        if (aVar.c() != this.f6841a.c()) {
            this.f6842b = k.b();
            this.f6841a = aVar;
            return aVar;
        }
        if (aVar.getBuildingId() != null && !aVar.getBuildingId().equals(this.f6841a.getBuildingId()) && !TextUtils.isEmpty(aVar.getBuildingId())) {
            this.f6842b = k.b();
            this.f6841a = aVar;
            return aVar;
        }
        this.d = aVar.getLocationType();
        float fA = k.a(aVar, this.f6841a);
        float accuracy = this.f6841a.getAccuracy();
        float accuracy2 = aVar.getAccuracy();
        float f = accuracy2 - accuracy;
        long jB = k.b();
        long j = jB - this.f6842b;
        boolean z = false;
        boolean z2 = accuracy <= 100.0f && accuracy2 > 299.0f;
        if (accuracy > 299.0f && accuracy2 > 299.0f) {
            z = true;
        }
        if (z2 || z) {
            long j2 = this.c;
            if (j2 == 0) {
                this.c = jB;
            } else if (jB - j2 > 30000) {
                this.f6842b = jB;
                this.f6841a = aVar;
                this.c = 0L;
                return aVar;
            }
            com.autonavi.aps.amapapi.model.a aVarB = b(this.f6841a);
            this.f6841a = aVarB;
            return aVarB;
        }
        if (accuracy2 < 100.0f && accuracy > 299.0f) {
            this.f6842b = jB;
            this.f6841a = aVar;
            this.c = 0L;
            return aVar;
        }
        if (accuracy2 <= 299.0f) {
            this.c = 0L;
        }
        if (fA >= 10.0f || fA <= 0.1d || accuracy2 <= 5.0f) {
            if (f < 300.0f) {
                this.f6842b = k.b();
                this.f6841a = aVar;
                return aVar;
            }
            if (j >= 30000) {
                this.f6842b = k.b();
                this.f6841a = aVar;
                return aVar;
            }
            com.autonavi.aps.amapapi.model.a aVarB2 = b(this.f6841a);
            this.f6841a = aVarB2;
            return aVarB2;
        }
        if (f >= -300.0f) {
            com.autonavi.aps.amapapi.model.a aVarB3 = b(this.f6841a);
            this.f6841a = aVarB3;
            return aVarB3;
        }
        if (accuracy / accuracy2 >= 2.0f) {
            this.f6842b = jB;
            this.f6841a = aVar;
            return aVar;
        }
        com.autonavi.aps.amapapi.model.a aVarB4 = b(this.f6841a);
        this.f6841a = aVarB4;
        return aVarB4;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final AMapLocation a(AMapLocation aMapLocation) {
        if (!k.a(aMapLocation)) {
            return aMapLocation;
        }
        long jB = k.b() - this.g;
        this.g = k.b();
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
        if (k.a(aMapLocation, this.f) > (((this.f.getSpeed() + aMapLocation.getSpeed()) * jAbs) / 2000.0f) + ((this.f.getAccuracy() + aMapLocation.getAccuracy()) * 2.0f) + 3000.0f) {
            return this.f;
        }
        this.f = aMapLocation;
        return aMapLocation;
    }
}
