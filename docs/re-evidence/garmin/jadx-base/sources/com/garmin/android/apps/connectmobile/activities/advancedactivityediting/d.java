package com.garmin.android.apps.connectmobile.activities.advancedactivityediting;

import am.m;
import am.x0;
import am.z0;
import android.content.Context;
import androidx.lifecycle.s0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import bm.c0;
import bm.e0;
import bm.i;
import bm.k0;
import bm.n;
import bm.y;
import bm.z;
import c22.b1;
import c22.k;
import c22.l3;
import c22.m3;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.text.DecimalFormat;
import java.util.List;
import lc.u0;
import o13.r;
import o13.t;
import o13.u;
import o53.m0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import ps.p;
import r53.z1;
import yo.a0;
import yo.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/d;", "Landroidx/lifecycle/u1;", "Lam/m;", "activityRepo", "<init>", "(Lam/m;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {
    public final t A;
    public final t B;
    public final z1 C;
    public w D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f28863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f28864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f28865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f28866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActivityDetailChartDTO f28867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y0 f28868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.h f28869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f28870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f28871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<w61.f<Object>> f28872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<Double> f28873k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0 f28874l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public yo.d f28875m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f28876n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28877o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28878p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f28879q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f28880r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f28881t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f28882v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f28883w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t f28884x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t f28885y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final t f28886z;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28887a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_START_DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28887a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/activities/advancedactivityediting/d$b", "Lcom/google/gson/reflect/TypeToken;", "", "", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends TypeToken<List<? extends String>> {
    }

    public d(m mVar) {
        mVar.getClass();
        this.f28863a = mVar;
        int i14 = gt2.c.f79010a;
        this.f28865c = gt2.b.f79005a.h("TrimActivityViewModel");
        this.f28872j = new y0<>();
        y0<Double> y0Var = new y0<>();
        this.f28873k = y0Var;
        this.f28874l = y0Var;
        this.f28876n = o13.m.b(new b4.b(22));
        this.f28877o = o13.m.b(new b4.b(29));
        this.f28878p = o13.m.b(new y(0));
        this.f28879q = o13.m.b(new y(1));
        this.f28880r = o13.m.b(new y(2));
        this.f28881t = o13.m.b(new y(3));
        this.f28882v = o13.m.b(new y(4));
        this.f28883w = o13.m.b(new b4.b(23));
        this.f28884x = o13.m.b(new b4.b(24));
        this.f28885y = o13.m.b(new b4.b(25));
        this.f28886z = o13.m.b(new b4.b(26));
        this.A = o13.m.b(new b4.b(27));
        t tVarB = o13.m.b(new b4.b(28));
        this.B = tVarB;
        this.C = (z1) tVarB.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Double A4(d dVar, String str, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar, n nVar, im.b bVar2, int i14) {
        int iC;
        com.garmin.android.apps.connectmobile.activities.newmodel.b bVar3;
        com.garmin.android.apps.connectmobile.activities.newmodel.b bVar4;
        n nVar2 = nVar;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar5 = (i14 & 2) != 0 ? null : bVar;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar2 = (i14 & 4) != 0 ? null : aVar;
        im.b bVar6 = (i14 & 16) != 0 ? null : bVar2;
        dVar.getClass();
        nVar2.getClass();
        c cVar = dVar.f28864b;
        if (cVar != null) {
            ActivityDetailChartDTO activityDetailChartDTO = dVar.f28867e;
            if (nVar2 == n.SUM_DURATION_TO_SUM_DISTANCE && activityDetailChartDTO != null && c.i(activityDetailChartDTO, nVar2) == -1) {
                nVar2 = n.SUM_DURATION_TO_TIME_STAMP;
            }
            n nVar3 = nVar2;
            nVar3.getClass();
            Integer numValueOf = activityDetailChartDTO != null ? Integer.valueOf(activityDetailChartDTO.H(str)) : null;
            Double dE = cVar.e(bVar5, aVar2);
            if (dE != null && numValueOf != null && (iC = cVar.c(activityDetailChartDTO, bVar6, str, bVar5, aVar2)) != -1) {
                List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC = activityDetailChartDTO.C();
                if (listC != null && !listC.isEmpty()) {
                    if (s.d(listC.get(iC).C().get(numValueOf.intValue()), dE)) {
                        return activityDetailChartDTO.C().get(iC).C().get(c.i(activityDetailChartDTO, nVar3));
                    }
                    double dDoubleValue = dE.doubleValue();
                    Double d14 = listC.get(iC).C().get(numValueOf.intValue());
                    d14.getClass();
                    o13.p pVarD = c.d(dDoubleValue, iC, listC.size(), d14.doubleValue());
                    if (pVarD != null) {
                        int iIntValue = ((Number) pVarD.f128594a).intValue();
                        int iIntValue2 = ((Number) pVarD.f128595b).intValue();
                        double dDoubleValue2 = dE.doubleValue();
                        int iH = activityDetailChartDTO.H(str);
                        int i15 = c.i(activityDetailChartDTO, nVar3);
                        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC2 = activityDetailChartDTO.C();
                        List<Double> listC3 = (listC2 == null || (bVar4 = listC2.get(iIntValue)) == null) ? null : bVar4.C();
                        List<Double> listC4 = (listC2 == null || (bVar3 = listC2.get(iIntValue2)) == null) ? null : bVar3.C();
                        if (listC3 != null && !listC3.isEmpty() && listC4 != null && !listC4.isEmpty()) {
                            Double d15 = listC3.get(iH);
                            d15.getClass();
                            double dDoubleValue3 = d15.doubleValue();
                            Double d16 = listC3.get(i15);
                            d16.getClass();
                            double dDoubleValue4 = d16.doubleValue();
                            Double d17 = listC4.get(iH);
                            d17.getClass();
                            double dDoubleValue5 = d17.doubleValue();
                            Double d18 = listC4.get(i15);
                            d18.getClass();
                            return Double.valueOf(bm.m.j(dDoubleValue3, dDoubleValue4, dDoubleValue5, d18.doubleValue(), dDoubleValue2));
                        }
                    }
                }
                return activityDetailChartDTO.C().get(iC).C().get(c.i(activityDetailChartDTO, nVar3));
            }
        }
        return null;
    }

    public static boolean G4() {
        List list = (List) new Gson().fromJson(((k) KoinJavaComponent.get$default(k.class, null, null, 6, null)).e("provisional_finish_point_feature_enabled"), new b().getType());
        if (list == null) {
            return false;
        }
        if (list.contains("AnyUser")) {
            return true;
        }
        if (list.contains("MBTester")) {
            s3.f23252a.getClass();
            if (s3.a("ROLE_MBTESTER")) {
                return true;
            }
        }
        if (!list.contains("DITester")) {
            return false;
        }
        s3.f23252a.getClass();
        return s3.a("ROLE_DI_TESTER");
    }

    public static Integer[] L4(d dVar, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar, Integer num, int i14) {
        if ((i14 & 2) != 0) {
            num = null;
        }
        boolean z14 = (i14 & 4) == 0;
        dVar.getClass();
        aVar.getClass();
        c cVar = dVar.f28864b;
        if (cVar == null) {
            return null;
        }
        if (z14) {
            cVar.l(cVar.f28849f, z14);
        }
        int i15 = c.b.f28860b[aVar.ordinal()];
        if (i15 == 1) {
            return cVar.k(num != null ? num.intValue() : cVar.f28851h.f18789b);
        }
        if (i15 == 2) {
            return cVar.j(num != null ? num.intValue() : cVar.f28852i.f18789b);
        }
        if (i15 == 3) {
            return cVar.b(num != null ? num.intValue() : cVar.f28853j.f18789b);
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(d dVar, v13.c cVar) {
        z zVar;
        dVar.getClass();
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i14 = zVar.f18881c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f18881c = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new z(dVar, cVar);
            }
        } else {
            zVar = new z(dVar, cVar);
        }
        Object obj = zVar.f18879a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = zVar.f18881c;
        if (i15 == 0) {
            r.b(obj);
            zVar.f18881c = 1;
            if (m0.b(5000L, zVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        dVar.f28872j.m(new w61.f<>(new Integer(1)));
        return Unit.INSTANCE;
    }

    public static int z4(d dVar, im.b bVar, String str, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar2, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar, int i14) {
        if ((i14 & 4) != 0) {
            bVar2 = null;
        }
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar2 = (i14 & 8) != 0 ? null : aVar;
        c cVar = dVar.f28864b;
        if (cVar != null) {
            return cVar.c(dVar.f28867e, bVar, str, bVar2, aVar2);
        }
        return -1;
    }

    public final void B4(List<? extends Object> list) {
        list.getClass();
        o13.p<String, Long> pVarE = bm.m.e(list);
        if ((pVarE != null ? pVarE.f128594a : null) != null) {
            String str = pVarE.f128594a;
            Long l14 = pVarE.f128595b;
            List<String> listF = bm.m.f(str);
            if (listF == null || listF.size() <= 1) {
                return;
            }
            String str2 = listF.get(0);
            str2.getClass();
            String str3 = listF.get(1);
            str3.getClass();
            l14.getClass();
            ge1.b.T(v1.a(this), null, null, new c0(l14.longValue(), this, str2, str3, null), 3);
        }
    }

    public final boolean C4() {
        c cVar = this.f28864b;
        if (cVar != null) {
            return (cVar.f28845b.f18822a == cVar.f28847d.f18822a && cVar.f28846c.f18822a == cVar.f28848e.f18822a && cVar.f28852i.f18788a == cVar.f28855l.f18788a && cVar.f28853j.f18788a == cVar.f28856m.f18788a) ? false : true;
        }
        return false;
    }

    public final s0<fw.m<ActivityDetailChartDTO>> D4(long j8) {
        w0 w0Var = this.f28866d;
        if (w0Var != null) {
            return w0Var;
        }
        cw.a.M().getClass();
        w0 w0VarK = new i(j8, null, tq.k.i(null)).k();
        w0VarK.getClass();
        this.f28866d = w0VarK;
        return w0VarK;
    }

    public final y0<Integer> E4() {
        return (y0) this.A.getValue();
    }

    public final y0<Integer> F4() {
        return (y0) this.f28886z.getValue();
    }

    public final boolean H4() {
        int i14;
        a0 reconstruct;
        List<yo.c> listA;
        x0 x0VarC;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f28869g;
        if (!z0.H((hVar == null || (x0VarC = hVar.C()) == null) ? null : x0VarC.f4358a)) {
            return true;
        }
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START;
        n nVar = n.SUM_DURATION_TO_TIME_STAMP;
        Double dA4 = A4(this, "SUMDURATION", bVar, null, nVar, null, 16);
        long jDoubleValue = dA4 != null ? (long) dA4.doubleValue() : 0L;
        Double dA5 = A4(this, "SUMDURATION", com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END, null, nVar, null, 16);
        long jDoubleValue2 = dA5 != null ? (long) dA5.doubleValue() : 0L;
        yo.d dVar = this.f28875m;
        if (dVar == null || (reconstruct = dVar.getReconstruct()) == null || (listA = reconstruct.a()) == null || listA.isEmpty()) {
            i14 = 0;
        } else {
            i14 = 0;
            for (yo.c cVar : listA) {
                long startTime = cVar.getStartTime();
                if (jDoubleValue > startTime || startTime > jDoubleValue2) {
                    long endTime = cVar.getEndTime();
                    if (jDoubleValue > endTime || endTime > jDoubleValue2) {
                    }
                }
                i14++;
                if (i14 < 0) {
                    x.p();
                    throw null;
                }
            }
        }
        return i14 >= 2;
    }

    public final void I4(Context context) {
        c cVar = this.f28864b;
        if (cVar != null) {
            k0 k0Var = cVar.f28848e;
            c.s(cVar, Integer.valueOf(k0Var.f18822a), null, null, null, 14);
            c.q(cVar, Integer.valueOf(cVar.f28847d.f18822a), null, null, null, 14);
            c.o(cVar, Integer.valueOf(k0Var.f18822a), null, null, null, 14);
            e0 e0Var = cVar.f28856m;
            cVar.r(e0Var.f18788a);
            cVar.p(cVar.f28855l.f18788a);
            cVar.m(e0Var.f18788a);
        }
        O4(context);
        N4(context);
        F4().m(null);
        E4().m(null);
    }

    public final void J4(im.b bVar, String str, fz.c cVar) {
        cVar.getClass();
        int iZ4 = cVar == fz.c.TIME ? z4(this, bVar, str, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END, null, 8) : z4(this, bVar, str, null, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE, 4);
        if (iZ4 != -1) {
            E4().m(Integer.valueOf(iZ4));
        }
    }

    public final void K4(im.b bVar, String str, fz.c cVar) {
        cVar.getClass();
        int iZ4 = cVar == fz.c.TIME ? z4(this, bVar, str, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START, null, 8) : z4(this, bVar, str, null, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_START_DISTANCE, 4);
        if (iZ4 != -1) {
            F4().m(Integer.valueOf(iZ4));
        }
    }

    public final Integer[] M4(int i14, int i15, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar) {
        c cVar = this.f28864b;
        if (cVar == null) {
            return null;
        }
        if (bVar == null) {
            return new Integer[0];
        }
        int i16 = c.b.f28859a[bVar.ordinal()];
        if (i16 == 1) {
            return cVar.n(i14, i15, new k0(cVar.f28847d.f18822a + 1, 0, 0, 0, 14, null));
        }
        if (i16 == 2) {
            return cVar.t(i14, i15);
        }
        if (i16 == 3) {
            return cVar.n(i14, i15, new k0(cVar.f28845b.f18822a + 1, 0, 0, 0, 14, null));
        }
        u0.r();
        return null;
    }

    public final void N4(Context context) {
        c cVar = this.f28864b;
        if (cVar != null) {
            y0 y0Var = (y0) this.f28882v.getValue();
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_DISTANCE;
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f28869g;
            y0Var.m(cVar.g(context, aVar, hVar != null ? hVar.C() : null, true));
            y0 y0Var2 = (y0) this.f28883w.getValue();
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_START_DISTANCE;
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = this.f28869g;
            y0Var2.m(cVar.g(context, aVar2, hVar2 != null ? hVar2.C() : null, true));
            y0 y0Var3 = (y0) this.f28884x.getValue();
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar3 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE;
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar3 = this.f28869g;
            y0Var3.m(cVar.g(context, aVar3, hVar3 != null ? hVar3.C() : null, true));
            y0 y0Var4 = (y0) this.f28885y.getValue();
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar4 = this.f28869g;
            y0Var4.m(cVar.g(context, aVar, hVar4 != null ? hVar4.C() : null, false));
        }
    }

    public final void O4(Context context) {
        c cVar = this.f28864b;
        if (cVar != null) {
            ((y0) this.f28879q.getValue()).m(cVar.h(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_TIME, context));
            ((y0) this.f28880r.getValue()).m(cVar.h(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START, context));
            ((y0) this.f28881t.getValue()).m(cVar.h(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END, context));
        }
    }

    /* JADX WARN: Code duplicated, block: B:97:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void y4(Context context, im.b bVar) {
        String strF;
        double dB;
        int i14;
        u uVar;
        Double dValueOf;
        double dC;
        boolean z14;
        double dC2;
        boolean z15;
        List<o20.a> list = bVar != null ? bVar.f94122l : null;
        c cVar = this.f28864b;
        if (context == null || list == null || cVar == null) {
            return;
        }
        y0 y0Var = (y0) this.f28877o.getValue();
        ActivityDetailChartDTO activityDetailChartDTO = this.f28867e;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f28869g;
        x0 x0VarC = hVar != null ? hVar.C() : null;
        Integer numD = F4().d();
        int iIntValue = numD != null ? numD.intValue() : 0;
        Integer numD2 = E4().d();
        int iIntValue2 = numD2 != null ? numD2.intValue() : list.size() - 1;
        k0 k0Var = cVar.f28844a;
        k0 k0Var2 = cVar.f28846c;
        k0 k0Var3 = cVar.f28845b;
        e0 e0Var = cVar.f28851h;
        bVar.getClass();
        int iG1 = bVar.g1();
        if (iG1 != 0) {
            if (iG1 != 1) {
                if (iG1 == 2) {
                    List<o20.a> list2 = bVar.f94122l;
                    if (list2 != null) {
                        double D = list2.get(iIntValue).D();
                        double d14 = 0.0d;
                        double d15 = 0.0d;
                        for (int i15 = iIntValue + 1; i15 <= iIntValue2; i15++) {
                            double D2 = (list2.get(i15).D() - D) + d15;
                            if (D2 > 2.0d || D2 < -2.0d) {
                                if (D2 > 2.0d) {
                                    d14 += D2;
                                }
                                D = list2.get(i15).D();
                                d15 = 0.0d;
                            } else {
                                d15 = D2;
                            }
                        }
                        strF = bVar.f(d14);
                        strF.getClass();
                    } else {
                        strF = context.getString(R.string.no_value);
                        strF.getClass();
                    }
                } else if (iG1 != 50) {
                    switch (iG1) {
                        case 67:
                        case 68:
                        case 69:
                            break;
                        default:
                            Double dA = c.a(cVar, activityDetailChartDTO, bVar, list, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START);
                            Double dA2 = c.a(cVar, activityDetailChartDTO, bVar, list, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END);
                            if (dA == null || dA2 == null) {
                                i14 = iIntValue2;
                                uVar = null;
                            } else {
                                int i16 = k0Var3.f18822a;
                                int i17 = k0Var2.f18822a;
                                double d16 = i16;
                                if (list.get(iIntValue).C() >= d16 || iIntValue == iIntValue2) {
                                    dC = list.get(iIntValue).C();
                                    z14 = false;
                                } else {
                                    dC = list.get(Math.min(iIntValue + 1, iIntValue2)).C();
                                    z14 = true;
                                }
                                int i18 = iIntValue2;
                                double d17 = i17;
                                if (list.get(iIntValue2).C() > d17) {
                                    i14 = i18;
                                    if (iIntValue != i14) {
                                        dC2 = list.get(Math.max(i14 - 1, iIntValue)).C();
                                        z15 = true;
                                    }
                                    uVar = new u(Double.valueOf(((dC - d16) * dA.doubleValue()) + ((d17 - dC2) * dA2.doubleValue())), Boolean.valueOf(z14), Boolean.valueOf(z15));
                                } else {
                                    i14 = i18;
                                }
                                dC2 = list.get(i14).C();
                                z15 = false;
                                uVar = new u(Double.valueOf(((dC - d16) * dA.doubleValue()) + ((d17 - dC2) * dA2.doubleValue())), Boolean.valueOf(z14), Boolean.valueOf(z15));
                            }
                            if (uVar != null) {
                                if (((Boolean) uVar.f128606b).booleanValue()) {
                                    iIntValue++;
                                }
                                int i19 = ((Boolean) uVar.f128607c).booleanValue() ? i14 - 1 : i14;
                                double dDoubleValue = ((Number) uVar.f128605a).doubleValue();
                                int i24 = k0Var2.f18822a - k0Var3.f18822a;
                                List<o20.a> list3 = bVar.f94122l;
                                if (list3 != null) {
                                    double dH4 = bVar.h4();
                                    int iG2 = bVar.g1();
                                    if (iIntValue == 0 && i19 == list3.size() - 1 && iG2 != 2 && !Double.isNaN(dH4)) {
                                        dValueOf = Double.valueOf(dH4);
                                    } else if (list3.size() <= i19 || list3.size() <= iIntValue) {
                                        dValueOf = null;
                                    } else {
                                        double dC3 = -1.0d;
                                        double dDoubleValue2 = 0.0d;
                                        Double d18 = null;
                                        for (int i25 = iIntValue; i25 <= i19; i25++) {
                                            double D3 = list3.get(i25).D();
                                            Double dValueOf2 = Double.valueOf(D3);
                                            if (i25 == iIntValue && (D3 == 0.0d || dValueOf2.isNaN())) {
                                                dValueOf2 = Double.valueOf(0.0d);
                                            }
                                            if (dC3 != -1.0d && d18 != null && !dValueOf2.isNaN()) {
                                                dDoubleValue2 = ((list3.get(i25).C() - dC3) * d18.doubleValue()) + dDoubleValue2;
                                            }
                                            if (!dValueOf2.isNaN()) {
                                                dC3 = list3.get(i25).C();
                                                d18 = dValueOf2;
                                            }
                                        }
                                        if (d18 != null) {
                                            dDoubleValue2 += d18.doubleValue();
                                        }
                                        dValueOf = Double.valueOf((dDoubleValue2 + dDoubleValue) / ((double) i24));
                                    }
                                    if (dValueOf == null || Double.isNaN(dValueOf.doubleValue())) {
                                        strF = context.getString(R.string.no_value);
                                    } else {
                                        strF = bVar.f(dValueOf.doubleValue());
                                    }
                                } else {
                                    strF = context.getString(R.string.no_value);
                                }
                                strF.getClass();
                            } else {
                                strF = context.getString(R.string.no_value);
                                strF.getClass();
                            }
                            break;
                    }
                }
            }
            int i26 = k0Var.f18822a;
            int i27 = x0VarC == null ? -1 : c.b.f28861c[x0VarC.ordinal()];
            if (i27 == 1 || i27 == 2) {
                dB = e0Var.f18788a / 500.0d;
            } else if (i27 != 3) {
                m3 m3Var = e0Var.f18792e;
                l3.a aVar = l3.f23124b;
                double d19 = e0Var.f18788a;
                DecimalFormat decimalFormat = l3.f23137o;
                aVar.getClass();
                dB = b1.b(l3.a.N(d19, m3Var, decimalFormat));
            } else {
                dB = e0Var.f18788a / ((e0Var.f18792e.f23160a ? 1.0d : 0.9144d) * 100.0d);
            }
            strF = bVar.f(dB > 0.0d ? ((double) i26) / dB : 0.0d);
            strF.getClass();
        } else {
            m3 m3Var2 = e0Var.f18792e;
            l3.a aVar2 = l3.f23124b;
            double d24 = e0Var.f18788a;
            DecimalFormat decimalFormat2 = l3.f23137o;
            aVar2.getClass();
            double dB2 = b1.b(l3.a.N(d24, m3Var2, decimalFormat2));
            if (dB2 > 0.0d) {
                double d25 = 60;
                strF = bVar.f(((dB2 * d25) * d25) / ((double) k0Var.f18822a));
                strF.getClass();
            } else {
                strF = bVar.f(0.0d);
                strF.getClass();
            }
        }
        y0Var.m(strF);
    }
}
