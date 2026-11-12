package com.amap.api.col.p0003sl;

import com.amap.api.services.core.LatLonPoint;
import defpackage.xts;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends e0 {
    public double j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LatLonPoint f6059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f6060b;

        public a(double d, double d2, double d3) {
            this.f6059a = null;
            this.f6060b = 0.0d;
            this.f6059a = new LatLonPoint(d, d2);
            this.f6060b = d3;
        }

        public final boolean a(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                LatLonPoint latLonPoint = this.f6059a;
                a aVar = (a) obj;
                LatLonPoint latLonPoint2 = aVar.f6059a;
                if (latLonPoint == latLonPoint2) {
                    return true;
                }
                if (latLonPoint != null && xts.b(latLonPoint, latLonPoint2) <= aVar.f6060b) {
                    return true;
                }
            }
            return false;
        }
    }

    public f0(String... strArr) {
        super(strArr);
        this.j = 0.0d;
    }

    @Override // com.amap.api.col.p0003sl.e0
    public final void c(d0.a aVar) {
        super.c(aVar);
        if (aVar != null) {
            this.j = aVar.h();
        }
    }

    @Override // com.amap.api.col.p0003sl.e0
    public final boolean f(LinkedHashMap<d0.b, Object> linkedHashMap, d0.b bVar) {
        String str;
        if (linkedHashMap != null && bVar != null) {
            if (bVar.f5986b == null) {
                return super.f(linkedHashMap, bVar);
            }
            for (d0.b bVar2 : linkedHashMap.keySet()) {
                if (bVar2 != null && (str = bVar2.f5985a) != null && str.equals(bVar.f5985a)) {
                    Object obj = bVar2.f5986b;
                    if ((obj instanceof a) && ((a) obj).a(bVar.f5986b)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amap.api.col.p0003sl.e0
    public final Object g(LinkedHashMap<d0.b, Object> linkedHashMap, d0.b bVar) {
        String str;
        if (linkedHashMap != null && bVar != null) {
            if (bVar.f5986b == null) {
                return super.g(linkedHashMap, bVar);
            }
            for (d0.b bVar2 : linkedHashMap.keySet()) {
                if (bVar2 != null && (str = bVar2.f5985a) != null && str.equals(bVar.f5985a)) {
                    Object obj = bVar2.f5986b;
                    if ((obj instanceof a) && ((a) obj).a(bVar.f5986b)) {
                        return linkedHashMap.get(bVar2);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    @Override // com.amap.api.col.p0003sl.e0
    public final Object k(LinkedHashMap<d0.b, Object> linkedHashMap, d0.b bVar) {
        String str;
        if (linkedHashMap != null && bVar != null) {
            if (bVar.f5986b == null) {
                return super.k(linkedHashMap, bVar);
            }
            for (d0.b bVar2 : linkedHashMap.keySet()) {
                if (bVar2 != null && (str = bVar2.f5985a) != null && str.equals(bVar.f5985a)) {
                    Object obj = bVar2.f5986b;
                    if ((obj instanceof a) && ((a) obj).a(bVar.f5986b)) {
                        if (bVar2 != null) {
                            return linkedHashMap.remove(bVar2);
                        }
                    }
                }
            }
            bVar2 = null;
            if (bVar2 != null) {
                return linkedHashMap.remove(bVar2);
            }
        }
        return null;
    }

    public final double l() {
        return this.j;
    }
}
