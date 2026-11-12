package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.s;
import p13.w;
import ww0.e;
import ww0.h;
import ww0.p;
import ww0.r;
import ww0.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/util/a;", "", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0696a f39194a = new C0696a(null);

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/util/a$a;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0696a {
        public /* synthetic */ C0696a(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0063  */
        public static GridChartView.b a(Context context, int i14, LocalDate localDate, List list) {
            Object next;
            boolean z14;
            List<e> listG;
            ArrayList arrayList = new ArrayList();
            e.f187542a.getClass();
            for (e eVar : e.a.a(context, s.c(e.values()))) {
                ArrayList arrayList2 = new ArrayList();
                for (int i15 = 0; i15 < i14; i15++) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p005kotlin.jvm.internal.s.g(((ww0.b) next).getDate(), localDate.plusDays(i15)));
                    ww0.b bVar = (ww0.b) next;
                    if (bVar == null || (listG = bVar.g()) == null) {
                        z14 = false;
                    } else {
                        z14 = true;
                        if (!listG.contains(eVar)) {
                            z14 = false;
                        }
                    }
                    arrayList2.add(Boolean.valueOf(z14));
                }
                if (arrayList2.contains(Boolean.TRUE)) {
                    arrayList.add(new GridChartView.c(eVar.a(context), arrayList2));
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            String string = context.getString(R.string.mct_discharge);
            string.getClass();
            return new GridChartView.b(string, i14, arrayList, R.color.mct_fertility_dark);
        }

        public static GridChartView.b b(Context context, int i14, LocalDate localDate, List list) {
            Object next;
            ArrayList arrayList = new ArrayList();
            h.f187557a.getClass();
            h[] hVarArrValues = h.values();
            int length = hVarArrValues.length;
            for (int i15 = 0; i15 < length; i15++) {
                h hVar = hVarArrValues[i15];
                ArrayList arrayList2 = new ArrayList();
                for (int i16 = 0; i16 < i14; i16++) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p005kotlin.jvm.internal.s.g(((ww0.b) next).getDate(), localDate.plusDays(i16)));
                    ww0.b bVar = (ww0.b) next;
                    arrayList2.add(Boolean.valueOf((bVar != null ? bVar.getFlow() : null) == hVar));
                }
                if (arrayList2.contains(Boolean.TRUE)) {
                    arrayList.add(new GridChartView.c(hVar.a(context), arrayList2));
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            String string = context.getString(R.string.mct_flow);
            string.getClass();
            return new GridChartView.b(string, i14, arrayList, R.color.mct_period);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0059  */
        public static GridChartView.b c(Context context, int i14, LocalDate localDate, List list) {
            Object next;
            boolean z14;
            List<p> listI;
            ArrayList arrayList = new ArrayList();
            p.f187627a.getClass();
            for (p pVar : p.values()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i15 = 0; i15 < i14; i15++) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p005kotlin.jvm.internal.s.g(((ww0.b) next).getDate(), localDate.plusDays(i15)));
                    ww0.b bVar = (ww0.b) next;
                    if (bVar == null || (listI = bVar.i()) == null) {
                        z14 = false;
                    } else {
                        z14 = true;
                        if (!listI.contains(pVar)) {
                            z14 = false;
                        }
                    }
                    arrayList2.add(Boolean.valueOf(z14));
                }
                if (arrayList2.contains(Boolean.TRUE)) {
                    arrayList.add(new GridChartView.c(pVar.a(context), arrayList2));
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            String string = context.getString(R.string.mct_mood);
            string.getClass();
            return new GridChartView.b(string, i14, arrayList, R.color.mct_period_dark);
        }

        public static GridChartView.b d(Context context, int i14, LocalDate localDate, List list) {
            ArrayList arrayList = new ArrayList();
            int i15 = 0;
            while (true) {
                Object obj = null;
                if (i15 >= i14) {
                    break;
                }
                for (Object obj2 : list) {
                    if (p005kotlin.jvm.internal.s.g(((ww0.b) obj2).getDate(), localDate.plusDays(i15))) {
                        obj = obj2;
                        break;
                    }
                }
                ww0.b bVar = (ww0.b) obj;
                arrayList.add(Boolean.valueOf(bVar != null ? p005kotlin.jvm.internal.s.g(bVar.getIsOvulationDay(), Boolean.TRUE) : false));
                i15++;
            }
            if (!arrayList.contains(Boolean.TRUE)) {
                return null;
            }
            String string = context.getString(R.string.mct_ovulation_days);
            string.getClass();
            List listC = w.c(new GridChartView.c(string, arrayList));
            String string2 = context.getString(R.string.mct_ovulation);
            string2.getClass();
            return new GridChartView.b(string2, i14, listC, R.color.mct_fertility);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0061  */
        public static GridChartView.b e(Context context, int i14, LocalDate localDate, List list) {
            Object next;
            boolean z14;
            List<t> listO;
            ArrayList arrayList = new ArrayList();
            t.f187658a.getClass();
            for (t tVar : t.a.a(context, h0.b1(t.X))) {
                ArrayList arrayList2 = new ArrayList();
                for (int i15 = 0; i15 < i14; i15++) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p005kotlin.jvm.internal.s.g(((ww0.b) next).getDate(), localDate.plusDays(i15)));
                    ww0.b bVar = (ww0.b) next;
                    if (bVar == null || (listO = bVar.o()) == null) {
                        z14 = false;
                    } else {
                        z14 = true;
                        if (!listO.contains(tVar)) {
                            z14 = false;
                        }
                    }
                    arrayList2.add(Boolean.valueOf(z14));
                }
                if (arrayList2.contains(Boolean.TRUE)) {
                    arrayList.add(new GridChartView.c(tVar.a(context), arrayList2));
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            String string = context.getString(R.string.mct_physical_symptoms);
            string.getClass();
            return new GridChartView.b(string, i14, arrayList, R.color.mct_physical_symptom);
        }

        public static GridChartView.b f(Context context, int i14, LocalDate localDate, List list) {
            Object next;
            ArrayList arrayList = new ArrayList();
            r[] rVarArrValues = r.values();
            int length = rVarArrValues.length;
            for (int i15 = 0; i15 < length; i15++) {
                r rVar = rVarArrValues[i15];
                ArrayList arrayList2 = new ArrayList();
                for (int i16 = 0; i16 < i14; i16++) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p005kotlin.jvm.internal.s.g(((ww0.b) next).getDate(), localDate.plusDays(i16)));
                    ww0.b bVar = (ww0.b) next;
                    arrayList2.add(Boolean.valueOf((bVar != null ? bVar.getSexDrive() : null) == rVar));
                }
                if (arrayList2.contains(Boolean.TRUE)) {
                    arrayList.add(new GridChartView.c(rVar.a(context), arrayList2));
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            String string = context.getString(R.string.mct_sex_drive);
            string.getClass();
            return new GridChartView.b(string, i14, arrayList, R.color.gcm_text_primary);
        }

        public static GridChartView.b g(Context context, int i14, LocalDate localDate, List list) {
            Object next;
            ArrayList arrayList = new ArrayList();
            ww0.s.f187653a.getClass();
            ww0.s[] sVarArrValues = ww0.s.values();
            int length = sVarArrValues.length;
            for (int i15 = 0; i15 < length; i15++) {
                ww0.s sVar = sVarArrValues[i15];
                ArrayList arrayList2 = new ArrayList();
                for (int i16 = 0; i16 < i14; i16++) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p005kotlin.jvm.internal.s.g(((ww0.b) next).getDate(), localDate.plusDays(i16)));
                    ww0.b bVar = (ww0.b) next;
                    arrayList2.add(Boolean.valueOf((bVar != null ? bVar.getSexualActivity() : null) == sVar));
                }
                if (arrayList2.contains(Boolean.TRUE)) {
                    arrayList.add(new GridChartView.c(sVar.a(context), arrayList2));
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            String string = context.getString(R.string.mct_sexual_activity);
            string.getClass();
            return new GridChartView.b(string, i14, arrayList, R.color.mct_cycle_gray);
        }

        private C0696a() {
        }
    }
}
