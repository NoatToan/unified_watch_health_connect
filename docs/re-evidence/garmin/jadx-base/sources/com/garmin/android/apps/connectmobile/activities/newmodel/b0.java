package com.garmin.android.apps.connectmobile.activities.newmodel;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/b0;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/l;", "", "Lps/x1;", "typedSplits", "<init>", "(Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<x1> f29404a;

    public b0(List<x1> list) {
        list.getClass();
        this.f29404a = list;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003f A[EDGE_INSN: B:9:0x003f->B:45:0x00b7 BREAK  A[LOOP:1: B:11:0x0047->B:58:0x0047]] */
    @Override // com.garmin.android.apps.connectmobile.activities.newmodel.l
    public final List<Entry> d(zm.p pVar, fz.c cVar) {
        x1 x1Var;
        Double targetPower;
        pVar.getClass();
        cVar.getClass();
        List<x1> listK = tq.k.k(this.f29404a, qs.x.POWER_GUIDE_SPLIT);
        List<o20.a> listP = pVar.P(0);
        ArrayList arrayList = new ArrayList();
        for (o20.a aVar : listP) {
            long jC = (long) aVar.C();
            long j8 = 0;
            if (cVar == fz.c.TIME) {
                if (listK.isEmpty()) {
                    x1Var = null;
                    break;
                }
                Iterator<x1> it = listK.iterator();
                long j14 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        x1Var = null;
                        break;
                    }
                    x1 next = it.next();
                    Double duration = next.getDuration();
                    long jRint = (long) Math.rint(duration != null ? duration.doubleValue() : 0.0d);
                    if (jRint > 0) {
                        long j15 = jRint + j14;
                        if (j14 <= jC && jC < j15) {
                            x1Var = next;
                            break;
                        }
                        j14 = j15;
                    }
                }
            } else {
                if (listK.isEmpty()) {
                    x1Var = null;
                    break;
                }
                Iterator<x1> it3 = listK.iterator();
                long j16 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        x1Var = null;
                        break;
                    }
                    x1 next2 = it3.next();
                    Double distance = next2.getDistance();
                    long j17 = j8;
                    long jRint2 = (long) Math.rint(distance != null ? distance.doubleValue() : 0.0d);
                    if (jRint2 > j17) {
                        long j18 = jRint2 + j16;
                        if (j16 <= jC && jC < j18) {
                            x1Var = next2;
                            break;
                        }
                        j16 = j18;
                    }
                    j8 = j17;
                }
            }
            arrayList.add(new Entry((float) aVar.C(), (x1Var == null || (targetPower = x1Var.getTargetPower()) == null) ? -1.0f : (float) targetPower.doubleValue()));
        }
        return arrayList;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.newmodel.l
    /* JADX INFO: renamed from: f */
    public final boolean getF29638b() {
        List<x1> list = this.f29404a;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (qs.x.POWER_GUIDE_SPLIT == ((x1) it.next()).a2()) {
                return true;
            }
        }
        return false;
    }
}
