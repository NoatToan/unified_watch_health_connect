package im;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lim/u;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final km.b f94182a = new km.b();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f94184b;

        static {
            int[] iArr = new int[fz.c.values().length];
            try {
                iArr[fz.c.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fz.c.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f94183a = iArr;
            int[] iArr2 = new int[n.values().length];
            try {
                iArr2[n.SEATED_STANDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[n.AUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[n.LUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f94184b = iArr2;
        }
    }

    public static lm.d b(int i14, fz.c cVar, ArrayList arrayList, List list) {
        cVar.getClass();
        arrayList.getClass();
        list.getClass();
        lm.d dVar = new lm.d(i14, list, arrayList, null, 8, null);
        dVar.f113514x1 = cVar;
        int i15 = a.f94183a[cVar.ordinal()];
        int i16 = 0;
        if (i15 == 1) {
            for (Object obj : arrayList) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    p13.x.q();
                    throw null;
                }
                x1 x1Var = (x1) obj;
                long jD = (long) g8.i.D(i16 - 1, arrayList);
                long jD2 = (long) g8.i.D(i16, arrayList);
                if (jD <= jD2) {
                    while (true) {
                        c(list, x1Var, dVar, jD);
                        if (jD != jD2) {
                            jD++;
                        }
                    }
                }
                i16 = i17;
            }
        } else {
            if (i15 != 2) {
                u0.r();
                return null;
            }
            for (Object obj2 : arrayList) {
                int i18 = i16 + 1;
                if (i16 < 0) {
                    p13.x.q();
                    throw null;
                }
                x1 x1Var2 = (x1) obj2;
                long jC = (long) g8.i.C(i16 - 1, arrayList);
                long jC2 = (long) g8.i.C(i16, arrayList);
                if (jC <= jC2) {
                    while (true) {
                        c(list, x1Var2, dVar, jC);
                        if (jC != jC2) {
                            jC++;
                        }
                    }
                }
                i16 = i18;
            }
        }
        return dVar;
    }

    public static void c(List list, x1 x1Var, lm.d dVar, double d14) {
        Integer num;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qs.x xVar = (qs.x) it.next();
            int iIndexOf = list.indexOf(xVar);
            if (x1Var == null || x1Var.a2() != xVar) {
                dVar.C(iIndexOf, new o20.a(d14, Double.NaN));
            } else {
                qs.x.f147196b.getClass();
                xVar.getClass();
                int i14 = qs.x.a.C2768a.f147221a[xVar.ordinal()];
                if (i14 == 1) {
                    num = 1;
                } else if (i14 != 2) {
                    num = i14 != 3 ? null : -2;
                } else {
                    num = -1;
                }
                dVar.C(iIndexOf, new o20.a(d14, num != null ? num.intValue() : iIndexOf));
            }
        }
    }

    public final lm.c a(ActivityDetailChartDTO activityDetailChartDTO, int i14, fz.c cVar, boolean z14, String str, String... strArr) throws Throwable {
        int i15;
        activityDetailChartDTO.getClass();
        cVar.getClass();
        this.f94182a.getClass();
        Throwable th3 = null;
        lm.c cVar2 = new lm.c(i14, km.b.a(i14, null), null, 4, null);
        cVar2.f113514x1 = cVar;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG = activityDetailChartDTO.G();
        listG.getClass();
        Iterator<com.garmin.android.apps.connectmobile.activities.newmodel.y> it = listG.iterator();
        int i16 = 0;
        while (true) {
            if (!it.hasNext()) {
                i16 = -1;
                break;
            }
            if (str.equalsIgnoreCase(it.next().F())) {
                break;
            }
            i16++;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        for (int iD = 0; iD < length; iD = e5.d(i15, iD, arrayList, 1)) {
            String str2 = strArr[iD];
            List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG2 = activityDetailChartDTO.G();
            listG2.getClass();
            Iterator<com.garmin.android.apps.connectmobile.activities.newmodel.y> it3 = listG2.iterator();
            i15 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i15 = -1;
                    break;
                }
                if (d53.u.q(str2, it3.next().F(), true)) {
                    break;
                }
                i15++;
            }
        }
        if (i16 == -1 || arrayList.isEmpty()) {
            return null;
        }
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC = activityDetailChartDTO.C();
        listC.getClass();
        for (com.garmin.android.apps.connectmobile.activities.newmodel.b bVar : listC) {
            listC.indexOf(bVar);
            List<Double> listC2 = bVar.C();
            listC2.getClass();
            double dDoubleValue = listC2.get(i16).doubleValue();
            Double.isNaN(dDoubleValue);
            int i17 = 0;
            for (Object obj : arrayList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    Throwable th4 = th3;
                    p13.x.q();
                    throw th4;
                }
                Double d14 = (Double) h0.e0(((Number) obj).intValue(), listC2);
                if (d14 != null) {
                    Double.isNaN(d14.doubleValue());
                }
                if (!Double.isNaN(dDoubleValue) && ((z14 || (d14 != null && !Double.isNaN(d14.doubleValue()))) && d14 != null)) {
                    cVar2.C(i17, new o20.a(dDoubleValue, d14.doubleValue()));
                }
                listC2 = listC2;
                i17 = i18;
                th3 = th3;
            }
        }
        Throwable th5 = th3;
        int i19 = 0;
        for (Object obj2 : arrayList) {
            int i24 = i19 + 1;
            if (i19 < 0) {
                p13.x.q();
                throw th5;
            }
            if (((Number) obj2).intValue() == -1) {
                cVar2.D(i19, j0.f134944a);
            }
            i19 = i24;
        }
        return cVar2;
    }
}
