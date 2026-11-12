package com.autonavi.aps.amapapi.filters;

import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.autonavi.aps.amapapi.utils.b;
import com.autonavi.aps.amapapi.utils.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.autonavi.aps.amapapi.model.a f3933a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f3934b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f3935c = 0;
    private boolean h = true;
    int d = 0;
    long e = 0;
    AMapLocation f = null;
    long g = 0;

    public final void a() {
        this.f3933a = null;
        this.f3934b = 0L;
        this.f3935c = 0L;
        this.f = null;
        this.g = 0L;
    }

    public final com.autonavi.aps.amapapi.model.a a(com.autonavi.aps.amapapi.model.a aVar) {
        if (k.b() - this.e > 30000) {
            this.f3933a = aVar;
            this.e = k.b();
            return this.f3933a;
        }
        this.e = k.b();
        if (!k.a(this.f3933a) || !k.a(aVar)) {
            this.f3934b = k.b();
            this.f3933a = aVar;
            return aVar;
        }
        if (aVar.getTime() == this.f3933a.getTime() && aVar.getAccuracy() < 300.0f) {
            return aVar;
        }
        if (GeocodeSearch.GPS.equals(aVar.getProvider())) {
            this.f3934b = k.b();
            this.f3933a = aVar;
            return aVar;
        }
        if (aVar.c() != this.f3933a.c()) {
            this.f3934b = k.b();
            this.f3933a = aVar;
            return aVar;
        }
        if (aVar.getBuildingId() != null && !aVar.getBuildingId().equals(this.f3933a.getBuildingId()) && !TextUtils.isEmpty(aVar.getBuildingId())) {
            this.f3934b = k.b();
            this.f3933a = aVar;
            return aVar;
        }
        this.d = aVar.getLocationType();
        float fA = k.a(aVar, this.f3933a);
        float accuracy = this.f3933a.getAccuracy();
        float accuracy2 = aVar.getAccuracy();
        float f = accuracy2 - accuracy;
        long jB = k.b();
        long j = this.f3934b;
        boolean z = false;
        boolean z2 = accuracy <= 100.0f && accuracy2 > 299.0f;
        if (accuracy > 299.0f && accuracy2 > 299.0f) {
            z = true;
        }
        if (z2 || z) {
            long j2 = this.f3935c;
            if (j2 == 0) {
                this.f3935c = jB;
            } else if (jB - j2 > 30000) {
                this.f3934b = jB;
                this.f3933a = aVar;
                this.f3935c = 0L;
                return aVar;
            }
            com.autonavi.aps.amapapi.model.a aVarB = b(this.f3933a);
            this.f3933a = aVarB;
            return aVarB;
        }
        if (accuracy2 < 100.0f && accuracy > 299.0f) {
            this.f3934b = jB;
            this.f3933a = aVar;
            this.f3935c = 0L;
            return aVar;
        }
        if (accuracy2 <= 299.0f) {
            this.f3935c = 0L;
        }
        if (fA >= 10.0f || fA <= 0.1d || accuracy2 <= 5.0f) {
            if (f < 300.0f) {
                this.f3934b = k.b();
                this.f3933a = aVar;
                return aVar;
            }
            if (jB - j >= 30000) {
                this.f3934b = k.b();
                this.f3933a = aVar;
                return aVar;
            }
            com.autonavi.aps.amapapi.model.a aVarB2 = b(this.f3933a);
            this.f3933a = aVarB2;
            return aVarB2;
        }
        if (f >= -300.0f) {
            com.autonavi.aps.amapapi.model.a aVarB3 = b(this.f3933a);
            this.f3933a = aVarB3;
            return aVarB3;
        }
        if (accuracy / accuracy2 >= 2.0f) {
            this.f3934b = jB;
            this.f3933a = aVar;
            return aVar;
        }
        com.autonavi.aps.amapapi.model.a aVarB4 = b(this.f3933a);
        this.f3933a = aVarB4;
        return aVarB4;
    }

    private com.autonavi.aps.amapapi.model.a b(com.autonavi.aps.amapapi.model.a aVar) {
        if (k.a(aVar)) {
            if (this.h && b.a(aVar.getTime())) {
                if (aVar.getLocationType() == 5 || aVar.getLocationType() == 6) {
                    aVar.setLocationType(4);
                    return aVar;
                }
            } else {
                aVar.setLocationType(this.d);
            }
        }
        return aVar;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final AMapLocation a(AMapLocation aMapLocation) {
        if (k.a(aMapLocation)) {
            long jB = k.b();
            long j = this.g;
            this.g = k.b();
            if (jB - j <= 5000) {
                AMapLocation aMapLocation2 = this.f;
                if (aMapLocation2 == null) {
                    this.f = aMapLocation;
                    return aMapLocation;
                }
                if (1 != aMapLocation2.getLocationType() && !GeocodeSearch.GPS.equalsIgnoreCase(this.f.getProvider())) {
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
        return aMapLocation;
    }
}
