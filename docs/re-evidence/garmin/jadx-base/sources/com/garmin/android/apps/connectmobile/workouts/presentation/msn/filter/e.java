package com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.workouts.data.model.r;
import d53.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<r> a(List<r> list, j62.d dVar, String str) {
        ArrayList arrayList;
        List<String> listH;
        String workoutName;
        Object next;
        dVar.getClass();
        bv.b.f21239a.getClass();
        bv.b.a();
        boolean zE = k1.f37122a.e();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                r rVar = (r) obj;
                String sportTypeKey = rVar.getSportTypeKey();
                List<String> listK = rVar.k();
                String difficulty = rVar.getDifficulty();
                l3.a aVar = l3.f23124b;
                Long duration = rVar.getDuration();
                double dLongValue = duration != null ? duration.longValue() : 0.0d;
                aVar.getClass();
                double d14 = dLongValue / 60.0d;
                if (!zE ? (listH = rVar.h()) == null : (listH = rVar.i()) == null) {
                    listH = j0.f134944a;
                }
                List<String> listF = rVar.f();
                if (listF == null) {
                    listF = j0.f134944a;
                }
                j62.b bVar = dVar.f97419k;
                if (bVar == null || s.g(bVar.f97407a, sportTypeKey)) {
                    List<String> list2 = dVar.f97420l;
                    if (list2 != null) {
                        if (listK == null) {
                            listK = j0.f134944a;
                        }
                        if (!h0.h0(list2, h0.g1(listK)).isEmpty()) {
                        }
                    }
                    List<p<String, String>> list3 = dVar.f97421m;
                    if (list3 != null) {
                        ArrayList arrayList3 = new ArrayList(y.r(list3, 10));
                        Iterator<T> it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList3.add((String) ((p) it.next()).f128594a);
                        }
                        if (!h0.R(arrayList3, difficulty)) {
                        }
                    }
                    List<? extends a> list4 = dVar.f97422n;
                    if (list4 != null) {
                        Iterator<T> it3 = list4.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            a aVar2 = (a) next;
                            if (d14 >= aVar2.f49511a && d14 <= aVar2.f49512b) {
                                break;
                            }
                        }
                        if (((a) next) != null) {
                        }
                    }
                    List<p<String, String>> list5 = dVar.f97423o;
                    if (list5 != null) {
                        ArrayList arrayList4 = new ArrayList(y.r(list5, 10));
                        Iterator<T> it4 = list5.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add((String) ((p) it4.next()).f128594a);
                        }
                        if (h0.h0(arrayList4, listH).isEmpty()) {
                        }
                    }
                    List<p<String, String>> list6 = dVar.f97424p;
                    if (list6 != null) {
                        ArrayList arrayList5 = new ArrayList(y.r(list6, 10));
                        Iterator<T> it5 = list6.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add((String) ((p) it5.next()).f128594a);
                        }
                        if (h0.h0(arrayList5, listF).isEmpty()) {
                        }
                    }
                    if (str == null || str.length() == 0 || ((workoutName = rVar.getWorkoutName()) != null && w.z(workoutName, str, true))) {
                        arrayList2.add(obj);
                    }
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return arrayList == null ? j0.f134944a : arrayList;
    }

    public static final String b(int i14, int i15, Context context) {
        if (i14 == 0 && i15 == Integer.MAX_VALUE) {
            String string = context.getString(R.string.common_all);
            string.getClass();
            return string;
        }
        if (i14 == 61) {
            String string2 = context.getString(R.string.msn_workout_duration_greater_than_value_interval, Integer.valueOf(i14 - 1));
            string2.getClass();
            return string2;
        }
        if (i15 == 19) {
            String string3 = context.getString(R.string.msn_workout_duration_less_than_value_interval, Integer.valueOf(i15 + 1));
            string3.getClass();
            return string3;
        }
        if (i14 == 0) {
            String string4 = context.getString(R.string.msn_workout_duration_less_than_equal_value_interval, Integer.valueOf(i15));
            string4.getClass();
            return string4;
        }
        if (i15 == Integer.MAX_VALUE) {
            String string5 = context.getString(R.string.msn_workout_duration_greater_than_equal_value_interval, Integer.valueOf(i14));
            string5.getClass();
            return string5;
        }
        String string6 = context.getString(R.string.msn_workout_duration_interval, Integer.valueOf(i14), Integer.valueOf(i15));
        string6.getClass();
        return string6;
    }
}
