package com.amap.api.mapcore.util;

import android.graphics.Point;
import com.amap.api.maps.model.MultiPointItem;
import com.autonavi.amap.mapcore.IPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class aw {
    private final as a;
    private final int b;
    private int c;
    private List<MultiPointItem> d;
    private List<aw> e;

    public aw(as asVar) {
        this(asVar, 0);
    }

    public final void a(MultiPointItem multiPointItem) {
        IPoint iPoint = multiPointItem.getIPoint();
        if (this.a.a(((Point) iPoint).x, ((Point) iPoint).y)) {
            int i = ((Point) iPoint).x;
            int i2 = ((Point) iPoint).y;
            aw awVar = this;
            while (true) {
                if (awVar.d == null) {
                    awVar.d = new ArrayList();
                }
                if (awVar.d.size() <= awVar.c || awVar.b >= 40) {
                    break;
                }
                if (awVar.e == null) {
                    ArrayList arrayList = new ArrayList(4);
                    awVar.e = arrayList;
                    as asVar = awVar.a;
                    arrayList.add(new aw(asVar.a, asVar.e, asVar.b, asVar.f, awVar.b + 1));
                    List<aw> list = awVar.e;
                    as asVar2 = awVar.a;
                    list.add(new aw(asVar2.e, asVar2.c, asVar2.b, asVar2.f, awVar.b + 1));
                    List<aw> list2 = awVar.e;
                    as asVar3 = awVar.a;
                    list2.add(new aw(asVar3.a, asVar3.e, asVar3.f, asVar3.d, awVar.b + 1));
                    List<aw> list3 = awVar.e;
                    as asVar4 = awVar.a;
                    list3.add(new aw(asVar4.e, asVar4.c, asVar4.f, asVar4.d, awVar.b + 1));
                }
                List<aw> list4 = awVar.e;
                if (list4 == null) {
                    return;
                }
                as asVar5 = awVar.a;
                if (i2 < asVar5.f) {
                    awVar = i < asVar5.e ? list4.get(0) : list4.get(1);
                } else {
                    awVar = i < asVar5.e ? list4.get(2) : list4.get(3);
                }
            }
            awVar.d.add(multiPointItem);
        }
    }

    private aw(int i, int i2, int i3, int i4, int i5) {
        this(new as(i, i2, i3, i4), i5);
    }

    private aw(as asVar, int i) {
        int i2 = 30;
        this.c = 30;
        this.e = null;
        this.a = asVar;
        this.b = i;
        switch (i) {
            case 0:
                i2 = 50;
                break;
            case 1:
                break;
            case 2:
            case 3:
                i2 = 20;
                break;
            case 4:
            case 5:
                i2 = 10;
                break;
            case 6:
            default:
                i2 = 5;
                break;
        }
        this.c = i2;
    }

    public final void a() {
        this.e = null;
        List<MultiPointItem> list = this.d;
        if (list != null) {
            list.clear();
        }
    }

    public final void a(as asVar, Collection<MultiPointItem> collection, double d) {
        a(asVar, collection, 1.0f, d);
    }

    private void a(as asVar, Collection<MultiPointItem> collection, float f, double d) {
        if (this.a.a(asVar)) {
            List<MultiPointItem> list = this.d;
            if (list != null) {
                int size = (int) (list.size() * f);
                for (int i = 0; i < size; i++) {
                    MultiPointItem multiPointItem = this.d.get(i);
                    if (asVar.a(multiPointItem.getIPoint())) {
                        collection.add(multiPointItem);
                    }
                }
            }
            if (d > 0.0d) {
                as asVar2 = this.a;
                double d2 = ((((double) asVar2.d) - ((double) asVar2.b)) * (((double) asVar2.c) - ((double) asVar2.a))) / d;
                if (d2 < 0.699999988079071d) {
                    return;
                } else {
                    f = d2 > 1.0d ? 1.0f : (float) ((((4.8188d * d2) * d2) - (d2 * 4.9339d)) + 1.1093d);
                }
            }
            List<aw> list2 = this.e;
            if (list2 != null) {
                Iterator<aw> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().a(asVar, collection, f, d);
                }
            }
        }
    }
}
