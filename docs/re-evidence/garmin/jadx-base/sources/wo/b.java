package wo;

import android.content.Context;
import androidx.core.view.j;
import bm.m;
import c22.m3;
import c22.o;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.activities.newmodel.h;
import f12.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;
import ps.d1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lwo/b;", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "activityDetails", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/h;", "activitySummaryDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;Lcom/garmin/android/apps/connectmobile/activities/newmodel/h;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<Integer> f186399e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityDetailChartDTO f186400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f186401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f186402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3 f186403d;

    static {
        new a(null);
        f186399e = x.k(0, 5, 3, 2);
    }

    public b(ActivityDetailChartDTO activityDetailChartDTO, h hVar) {
        activityDetailChartDTO.getClass();
        hVar.getClass();
        this.f186400a = activityDetailChartDTO;
        this.f186401b = hVar;
        this.f186402c = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        this.f186403d = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? m3.KILOMETER : m3.MILE;
        j0 j0Var = j0.f134944a;
    }

    public final im.b a(double d14, double d15, int i14, fz.c cVar) {
        String str;
        im.b bVarA;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i15;
        int i16;
        List<o20.a> list;
        cVar.getClass();
        h hVar = this.f186401b;
        Context context = this.f186402c;
        ActivityDetailChartDTO activityDetailChartDTO = this.f186400a;
        if (i14 == 0) {
            bVarA = m.b(activityDetailChartDTO, hVar, context, cVar, true);
        } else {
            if (i14 == 0) {
                str = "DIRECTSPEED";
            } else if (i14 == 5) {
                str = "DIRECTPOWER";
            } else if (i14 != 2) {
                str = i14 != 3 ? null : "DIRECTHEARTRATE";
            } else {
                str = "DIRECTELEVATION";
            }
            bVarA = m.a(activityDetailChartDTO, hVar, context, cVar, str);
        }
        if (bVarA == null || (list = bVarA.f94122l) == null) {
            str2 = null;
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            int i17 = 0;
            for (Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    x.q();
                    throw null;
                }
                o20.a aVar = (o20.a) obj;
                List<o20.a> list2 = bVarA.f94122l;
                o20.a aVar2 = list2 != null ? (o20.a) h0.e0(i17 - 1, list2) : null;
                if (aVar2 == null || aVar.C() != aVar2.C()) {
                    arrayList.add(obj);
                }
                i17 = i18;
            }
            str2 = null;
        }
        if (arrayList != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                double dC = ((o20.a) obj2).C();
                if (d14 <= dC && dC <= d15) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
            for (Iterator it = arrayList3.iterator(); it.hasNext(); it = it) {
                o20.a aVar3 = (o20.a) it.next();
                arrayList4.add(new o20.a(aVar3.C() - d14, aVar3.D()));
            }
            arrayList2 = new ArrayList(arrayList4);
        } else {
            arrayList2 = new ArrayList();
        }
        if (arrayList2.isEmpty() && (i15 = (int) d14) <= (i16 = (int) d15)) {
            while (true) {
                arrayList2.add(new o20.a(((double) i15) - d14, 0.0d));
                if (i15 == i16) {
                    break;
                }
                i15++;
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(0, new o20.a(0.0d, 0.0d));
            break;
        }
        Iterator it3 = arrayList2.iterator();
        do {
            if (!it3.hasNext()) {
                arrayList2.add(0, new o20.a(0.0d, 0.0d));
                break;
            }
        } while (((o20.a) it3.next()).C() != 0.0d);
        if (arrayList2.isEmpty()) {
            arrayList2.add(new o20.a(d15 - d14, 0.0d));
            break;
        }
        Iterator it4 = arrayList2.iterator();
        do {
            if (!it4.hasNext()) {
                arrayList2.add(new o20.a(d15 - d14, 0.0d));
                break;
            }
        } while (((int) ((o20.a) it4.next()).C()) != ((int) (d15 - d14)));
        if (cVar == fz.c.TIME) {
            if (bVarA != null) {
                bVarA.q(context.getString(R.string.lbl_time_h_m_s));
            }
            if (bVarA != null) {
                String strO2 = bVarA.getF113500j1();
                bVarA.f94120k = strO2 != null ? oi0.c.A(context, new wl.a(8), strO2) : str2;
            }
        } else {
            if (bVarA != null) {
                bVarA.q(context.getString(R.string.chart_distance_title, context.getString(this.f186403d.f23164e)));
            }
            if (bVarA != null) {
                bVarA.f94120k = oi0.c.A(context, new wl.a(9), bVarA.getF113500j1());
            }
        }
        if (bVarA != null) {
            bVarA.k(arrayList2);
        }
        return bVarA;
    }

    public final wo.a b(d1 d1Var, d1 d1Var2) {
        String str;
        Throwable th3;
        Object next;
        Object next2;
        int i14;
        int i15;
        Object string;
        int i16 = 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double d14 = d1Var.f139789e;
        double d15 = d14 - d1Var.f139786b;
        double d16 = d14 + (d1Var2 != null ? d1Var2.f139786b : 0.0d);
        Iterator<Integer> it = f186399e.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue == 0) {
                str = "DIRECTSPEED";
            } else if (iIntValue == 5) {
                str = "DIRECTPOWER";
            } else if (iIntValue != i16) {
                str = iIntValue != 3 ? null : "DIRECTHEARTRATE";
            } else {
                str = "DIRECTELEVATION";
            }
            ActivityDetailChartDTO activityDetailChartDTO = this.f186400a;
            List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG = activityDetailChartDTO.G();
            listG.getClass();
            Iterator<T> it3 = listG.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    th3 = null;
                    next = null;
                    break;
                }
                next = it3.next();
                com.garmin.android.apps.connectmobile.activities.newmodel.y yVar = (com.garmin.android.apps.connectmobile.activities.newmodel.y) next;
                th3 = null;
                if (str != null && str.equalsIgnoreCase(yVar.F())) {
                    break;
                }
            }
            com.garmin.android.apps.connectmobile.activities.newmodel.y yVar2 = (com.garmin.android.apps.connectmobile.activities.newmodel.y) next;
            int iG = yVar2 != null ? yVar2.G() : -1;
            List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG2 = activityDetailChartDTO.G();
            listG2.getClass();
            Iterator<T> it4 = listG2.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = th3;
                    break;
                }
                next2 = it4.next();
            } while (!"SUMDURATION".equalsIgnoreCase(((com.garmin.android.apps.connectmobile.activities.newmodel.y) next2).F()));
            com.garmin.android.apps.connectmobile.activities.newmodel.y yVar3 = (com.garmin.android.apps.connectmobile.activities.newmodel.y) next2;
            int iG2 = yVar3 != null ? yVar3.G() : -1;
            List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC = activityDetailChartDTO.C();
            ArrayList arrayListL = j.l(listC);
            for (Object obj : listC) {
                List<Double> listC2 = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) obj).C();
                listC2.getClass();
                Double d17 = (Double) h0.e0(iG2, listC2);
                double dDoubleValue = d17 != null ? d17.doubleValue() : 0.0d;
                if (d15 <= dDoubleValue && dDoubleValue <= d16) {
                    arrayListL.add(obj);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it5 = arrayListL.iterator();
            while (it5.hasNext()) {
                List<Double> listC3 = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) it5.next()).C();
                listC3.getClass();
                Double d18 = (Double) h0.e0(iG, listC3);
                if (d18 != null) {
                    arrayList.add(d18);
                }
            }
            if (arrayList.isEmpty()) {
                i14 = 0;
            } else {
                Iterator it6 = arrayList.iterator();
                i14 = 0;
                while (it6.hasNext()) {
                    double dDoubleValue2 = ((Number) it6.next()).doubleValue();
                    if (!Double.isNaN(dDoubleValue2) && dDoubleValue2 != 0.0d && (i14 = i14 + 1) < 0) {
                        x.p();
                        throw th3;
                    }
                }
            }
            if (i14 > 0) {
                Integer numValueOf = Integer.valueOf(iIntValue);
                Context context = this.f186402c;
                if (iIntValue == 0) {
                    i15 = 2;
                    string = context.getString(R.string.lbl_speed);
                } else if (iIntValue != 5) {
                    i15 = 2;
                    string = iIntValue != 2 ? iIntValue != 3 ? th3 : context.getString(R.string.activity_details_heart_rate) : context.getString(R.string.activity_details_elevation);
                } else {
                    i15 = 2;
                    string = context.getString(R.string.activity_details_power);
                }
                linkedHashMap.put(numValueOf, string);
                i16 = i15;
            } else {
                i16 = 2;
            }
        }
        if (!(linkedHashMap.get(2) != null && linkedHashMap.size() == 1)) {
            linkedHashMap.remove(2);
        }
        return new wo.a(null, linkedHashMap);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwo/b$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
