package com.garmin.android.apps.connectmobile.activities.newmodel;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/l;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class l {
    public static ArrayList b(List list, int i14, double d14, double d15) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        while (i14 < list.size() && ((o20.a) list.get(i14)).C() <= d14) {
            if (d15 > 0.0d) {
                arrayListL.add(new Entry((float) ((o20.a) list.get(i14)).C(), (float) d15));
            } else {
                arrayListL.add(new Entry((float) ((o20.a) list.get(i14)).C(), -1.0f));
            }
            i14++;
        }
        return arrayListL;
    }

    public List<Entry> d(zm.p pVar, fz.c cVar) {
        pVar.getClass();
        cVar.getClass();
        return p13.j0.f134944a;
    }

    /* JADX INFO: renamed from: f */
    public boolean getF29638b() {
        return false;
    }
}
