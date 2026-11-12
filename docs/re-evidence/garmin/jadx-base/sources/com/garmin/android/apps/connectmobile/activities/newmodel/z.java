package com.garmin.android.apps.connectmobile.activities.newmodel;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import ps.w1;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/z;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/l;", "", "Lps/x1;", "typedSplits", "<init>", "(Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<x1> f29702a;

    public z(List<x1> list) {
        list.getClass();
        this.f29702a = list;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.newmodel.l
    public final List<Entry> d(zm.p pVar, fz.c cVar) {
        Object next;
        Object obj;
        double dDoubleValue;
        pVar.getClass();
        cVar.getClass();
        x1.a aVar = x1.F1;
        List<x1> listK = tq.k.k(this.f29702a, qs.x.PACE_PRO_SPLIT);
        aVar.getClass();
        List listN0 = p13.h0.N0(listK, new w1());
        int i14 = 0;
        double d14 = 0.0d;
        for (Object obj2 : listN0) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            x1 x1Var = (x1) obj2;
            x1Var.E1 = d14;
            if (i14 == listN0.size() - 1) {
                dDoubleValue = Double.POSITIVE_INFINITY;
            } else {
                Double distance = x1Var.getDistance();
                dDoubleValue = distance != null ? distance.doubleValue() : 0.0d;
            }
            d14 += dDoubleValue;
            x1Var.D1 = d14;
            i14 = i15;
        }
        List<o20.a> listP = pVar.P(0);
        ArrayList arrayList = new ArrayList();
        DateTime f113503m1 = pVar.getF113503m1();
        long j8 = 1000;
        long millis = (f113503m1 != null ? f113503m1.getMillis() : 0L) / 1000;
        for (o20.a aVar2 : listP) {
            double dC = (millis + aVar2.C()) * j8;
            Iterator it = listN0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    millis = millis;
                    next = null;
                    break;
                }
                next = it.next();
                x1 x1Var2 = (x1) next;
                if (cVar != fz.c.TIME) {
                    millis = millis;
                    if (x1Var2.E1 <= aVar2.C() && aVar2.C() <= x1Var2.D1) {
                        break;
                    }
                    millis = millis;
                } else {
                    DateTime startDateTime = x1Var2.getStartDateTime();
                    if ((startDateTime != null ? startDateTime.getMillis() : 0L) <= dC) {
                        DateTime endDateTime = x1Var2.getEndDateTime();
                        if (dC <= (endDateTime != null ? endDateTime.getMillis() : 1L)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    millis = millis;
                }
            }
            x1 x1Var3 = (x1) next;
            if (x1Var3 != null) {
                obj = null;
                f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
                Double targetAvgSpeed = x1Var3.getTargetAvgSpeed();
                arrayList.add(new Entry((float) aVar2.C(), wq.f.a(Double.valueOf(targetAvgSpeed != null ? targetAvgSpeed.doubleValue() : 0.0d), lVar.y())));
            } else {
                obj = null;
                arrayList.add(new Entry((float) aVar2.C(), 1000000.0f));
            }
            millis = millis;
            j8 = 1000;
        }
        return arrayList;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.newmodel.l
    /* JADX INFO: renamed from: f */
    public final boolean getF29638b() {
        List<x1> list = this.f29702a;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z14 = true;
            if (!it.hasNext()) {
                return !arrayList.isEmpty();
            }
            if (qs.x.PACE_PRO_SPLIT != ((x1) it.next()).a2()) {
                z14 = false;
            }
            arrayList.add(Boolean.valueOf(z14));
        }
    }
}
