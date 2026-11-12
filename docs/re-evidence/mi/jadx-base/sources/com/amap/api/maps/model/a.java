package com.amap.api.maps.model;

import com.autonavi.amap.mapcore.DPoint;
import defpackage.wks;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wks f6450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6451b;
    private List<WeightedLatLng> c;
    private List<a> d;

    public a(wks wksVar) {
        this(wksVar, 0);
    }

    public final void a(WeightedLatLng weightedLatLng) {
        DPoint point = weightedLatLng.getPoint();
        if (this.f6450a.a(point.x, point.y)) {
            a(point.x, point.y, weightedLatLng);
        }
    }

    private a(double d, double d2, double d3, double d4, int i) {
        this(new wks(d, d2, d3, d4), i);
    }

    private a(wks wksVar, int i) {
        this.d = null;
        this.f6450a = wksVar;
        this.f6451b = i;
    }

    private void a(double d, double d2, WeightedLatLng weightedLatLng) {
        List<a> list = this.d;
        if (list != null) {
            wks wksVar = this.f6450a;
            if (d2 < wksVar.f) {
                if (d < wksVar.e) {
                    list.get(0).a(d, d2, weightedLatLng);
                    return;
                } else {
                    list.get(1).a(d, d2, weightedLatLng);
                    return;
                }
            }
            if (d < wksVar.e) {
                list.get(2).a(d, d2, weightedLatLng);
                return;
            } else {
                list.get(3).a(d, d2, weightedLatLng);
                return;
            }
        }
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(weightedLatLng);
        if (this.c.size() <= 50 || this.f6451b >= 40) {
            return;
        }
        a();
    }

    private void a() {
        ArrayList arrayList = new ArrayList(4);
        this.d = arrayList;
        wks wksVar = this.f6450a;
        arrayList.add(new a(wksVar.f38075a, wksVar.e, wksVar.f38076b, wksVar.f, this.f6451b + 1));
        List<a> list = this.d;
        wks wksVar2 = this.f6450a;
        list.add(new a(wksVar2.e, wksVar2.c, wksVar2.f38076b, wksVar2.f, this.f6451b + 1));
        List<a> list2 = this.d;
        wks wksVar3 = this.f6450a;
        list2.add(new a(wksVar3.f38075a, wksVar3.e, wksVar3.f, wksVar3.d, this.f6451b + 1));
        List<a> list3 = this.d;
        wks wksVar4 = this.f6450a;
        list3.add(new a(wksVar4.e, wksVar4.c, wksVar4.f, wksVar4.d, this.f6451b + 1));
        List<WeightedLatLng> list4 = this.c;
        this.c = null;
        for (WeightedLatLng weightedLatLng : list4) {
            a(weightedLatLng.getPoint().x, weightedLatLng.getPoint().y, weightedLatLng);
        }
    }

    public final Collection<WeightedLatLng> a(wks wksVar) {
        ArrayList arrayList = new ArrayList();
        a(wksVar, arrayList);
        return arrayList;
    }

    private void a(wks wksVar, Collection<WeightedLatLng> collection) {
        if (this.f6450a.d(wksVar)) {
            List<a> list = this.d;
            if (list != null) {
                Iterator<a> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(wksVar, collection);
                }
            } else if (this.c != null) {
                if (wksVar.e(this.f6450a)) {
                    collection.addAll(this.c);
                    return;
                }
                for (WeightedLatLng weightedLatLng : this.c) {
                    if (wksVar.c(weightedLatLng.getPoint())) {
                        collection.add(weightedLatLng);
                    }
                }
            }
        }
    }
}
