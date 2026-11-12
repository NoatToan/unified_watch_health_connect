package com.amap.api.maps.model;

import com.amap.api.mapcore.util.dv;
import com.autonavi.amap.mapcore.DPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class a {
    private final dv a;
    private final int b;
    private List<WeightedLatLng> c;
    private List<a> d;

    public a(dv dvVar) {
        this(dvVar, 0);
    }

    public final void a(WeightedLatLng weightedLatLng) {
        DPoint point = weightedLatLng.getPoint();
        if (this.a.a(point.x, point.y)) {
            a(point.x, point.y, weightedLatLng);
        }
    }

    private a(double d, double d2, double d3, double d4, int i) {
        this(new dv(d, d2, d3, d4), i);
    }

    private a(dv dvVar, int i) {
        this.d = null;
        this.a = dvVar;
        this.b = i;
    }

    private void a(double d, double d2, WeightedLatLng weightedLatLng) {
        a aVar = this;
        while (true) {
            List<a> list = aVar.d;
            if (list == null) {
                break;
            }
            dv dvVar = aVar.a;
            if (d2 < dvVar.f) {
                if (d < dvVar.e) {
                    aVar = list.get(0);
                } else {
                    aVar = list.get(1);
                }
            } else if (d < dvVar.e) {
                aVar = list.get(2);
            } else {
                aVar = list.get(3);
            }
        }
        if (aVar.c == null) {
            aVar.c = new ArrayList();
        }
        aVar.c.add(weightedLatLng);
        if (aVar.c.size() <= 50 || aVar.b >= 40) {
            return;
        }
        aVar.a();
    }

    private void a() {
        ArrayList arrayList = new ArrayList(4);
        this.d = arrayList;
        dv dvVar = this.a;
        arrayList.add(new a(dvVar.a, dvVar.e, dvVar.b, dvVar.f, this.b + 1));
        List<a> list = this.d;
        dv dvVar2 = this.a;
        list.add(new a(dvVar2.e, dvVar2.c, dvVar2.b, dvVar2.f, this.b + 1));
        List<a> list2 = this.d;
        dv dvVar3 = this.a;
        list2.add(new a(dvVar3.a, dvVar3.e, dvVar3.f, dvVar3.d, this.b + 1));
        List<a> list3 = this.d;
        dv dvVar4 = this.a;
        list3.add(new a(dvVar4.e, dvVar4.c, dvVar4.f, dvVar4.d, this.b + 1));
        List<WeightedLatLng> list4 = this.c;
        this.c = null;
        for (WeightedLatLng weightedLatLng : list4) {
            a(weightedLatLng.getPoint().x, weightedLatLng.getPoint().y, weightedLatLng);
        }
    }

    public final Collection<WeightedLatLng> a(dv dvVar) {
        ArrayList arrayList = new ArrayList();
        a(dvVar, arrayList);
        return arrayList;
    }

    private void a(dv dvVar, Collection<WeightedLatLng> collection) {
        if (this.a.a(dvVar)) {
            List<a> list = this.d;
            if (list != null) {
                Iterator<a> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().a(dvVar, collection);
                }
                return;
            }
            List<WeightedLatLng> list2 = this.c;
            if (list2 != null) {
                dv dvVar2 = this.a;
                if (dvVar2.a >= dvVar.a && dvVar2.c <= dvVar.c && dvVar2.b >= dvVar.b && dvVar2.d <= dvVar.d) {
                    collection.addAll(list2);
                    return;
                }
                for (WeightedLatLng weightedLatLng : list2) {
                    DPoint point = weightedLatLng.getPoint();
                    if (dvVar.a(point.x, point.y)) {
                        collection.add(weightedLatLng);
                    }
                }
            }
        }
    }
}
