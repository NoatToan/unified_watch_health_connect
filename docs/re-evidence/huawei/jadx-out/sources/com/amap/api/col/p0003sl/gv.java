package com.amap.api.col.p0003sl;

import com.amap.api.services.core.LatLonPoint;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
final class gv extends gu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f2603a;

    public gv(String... strArr) {
        super(strArr);
        this.f2603a = 0.0d;
    }

    @Override // com.amap.api.col.p0003sl.gu
    protected final boolean a(LinkedHashMap<gt.b, Object> linkedHashMap, gt.b bVar) {
        if (linkedHashMap == null || bVar == null) {
            return false;
        }
        if (bVar.f2597b == null) {
            return super.a(linkedHashMap, bVar);
        }
        for (gt.b bVar2 : linkedHashMap.keySet()) {
            if (bVar2 != null && bVar2.f2596a != null && bVar2.f2596a.equals(bVar.f2596a) && (bVar2.f2597b instanceof a) && ((a) bVar2.f2597b).a(bVar.f2597b)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amap.api.col.p0003sl.gu
    protected final Object b(LinkedHashMap<gt.b, Object> linkedHashMap, gt.b bVar) {
        if (linkedHashMap == null || bVar == null) {
            return null;
        }
        if (bVar.f2597b == null) {
            return super.b(linkedHashMap, bVar);
        }
        for (gt.b bVar2 : linkedHashMap.keySet()) {
            if (bVar2 != null && bVar2.f2596a != null && bVar2.f2596a.equals(bVar.f2596a) && (bVar2.f2597b instanceof a) && ((a) bVar2.f2597b).a(bVar.f2597b)) {
                return linkedHashMap.get(bVar2);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    @Override // com.amap.api.col.p0003sl.gu
    protected final Object c(LinkedHashMap<gt.b, Object> linkedHashMap, gt.b bVar) {
        if (linkedHashMap != null && bVar != null) {
            if (bVar.f2597b == null) {
                return super.c(linkedHashMap, bVar);
            }
            for (gt.b bVar2 : linkedHashMap.keySet()) {
                if (bVar2 != null && bVar2.f2596a != null && bVar2.f2596a.equals(bVar.f2596a) && (bVar2.f2597b instanceof a) && ((a) bVar2.f2597b).a(bVar.f2597b)) {
                    if (bVar2 != null) {
                        return linkedHashMap.remove(bVar2);
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

    public final double a() {
        return this.f2603a;
    }

    @Override // com.amap.api.col.p0003sl.gu
    public final void a(gt.a aVar) {
        super.a(aVar);
        if (aVar != null) {
            this.f2603a = aVar.d();
        }
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        LatLonPoint f2604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f2605b;

        public a(double d, double d2, double d3) {
            this.f2604a = null;
            this.f2605b = 0.0d;
            this.f2604a = new LatLonPoint(d, d2);
            this.f2605b = d3;
        }

        public final boolean a(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            LatLonPoint latLonPoint = this.f2604a;
            a aVar = (a) obj;
            LatLonPoint latLonPoint2 = aVar.f2604a;
            if (latLonPoint == latLonPoint2) {
                return true;
            }
            return latLonPoint != null && ((double) fu.a(latLonPoint, latLonPoint2)) <= aVar.f2605b;
        }
    }
}
