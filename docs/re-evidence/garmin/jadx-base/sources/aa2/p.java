package aa2;

import android.content.Context;
import ca0.s1;
import ca0.u1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart.wrapper.BaseLineChart;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.LimitLine;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.LineData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.m0;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p3.p1;
import p3.x3;
import tn2.r0;
import w52.v0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2362g;

    public /* synthetic */ p(Context context, e23.a aVar, e23.l lVar, c.q qVar, tf0.i iVar, String str) {
        this.f2356a = 28;
        this.f2358c = context;
        this.f2357b = aVar;
        this.f2362g = lVar;
        this.f2359d = qVar;
        this.f2360e = iVar;
        this.f2361f = str;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01d0  */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.github.mikephil.chartingv2.data.Entry, java.lang.Object] */
    private final Object a(Object obj) {
        Object next;
        Object next2;
        String str;
        boolean z14;
        Iterator it;
        float f14;
        hz.e eVarO;
        hz.e eVarP;
        pr0.f fVar = (pr0.f) this.f2358c;
        BaseLineChart baseLineChart = (BaseLineChart) this.f2359d;
        Context context = (Context) this.f2360e;
        o13.p<String, String> pVar = (o13.p) this.f2361f;
        ArrayList arrayList = (ArrayList) this.f2357b;
        hz.a aVar = (hz.a) this.f2362g;
        ((BaseLineChart) obj).getClass();
        fVar.l(baseLineChart);
        baseLineChart.setMarkerView(new pr0.i(context));
        fVar.f139618i = pVar;
        Context context2 = fVar.f134441a;
        LineChart lineChart = fVar.f134442b;
        if (lineChart != null) {
            LocalDate localDate = aVar.f86376a;
            DateTime dateTimeAtStartOfDay = localDate != null ? localDate.toDateTimeAtStartOfDay() : null;
            LocalDate localDate2 = aVar.f86377b;
            DateTime dateTimeAtStartOfDay2 = localDate2 != null ? localDate2.toDateTimeAtStartOfDay() : null;
            fVar.w();
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    float f15 = ((pr0.d) next).f139611c;
                    do {
                        Object next3 = it3.next();
                        float f16 = ((pr0.d) next3).f139611c;
                        if (Float.compare(f15, f16) < 0) {
                            next = next3;
                            f15 = f16;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next = null;
            }
            pr0.d dVar = (pr0.d) next;
            float f17 = 0.0f;
            float f18 = dVar != null ? dVar.f139611c : 0.0f;
            Iterator it4 = arrayList.iterator();
            if (it4.hasNext()) {
                next2 = it4.next();
                if (it4.hasNext()) {
                    float f19 = ((pr0.d) next2).f139612d;
                    do {
                        Object next4 = it4.next();
                        float f22 = ((pr0.d) next4).f139612d;
                        if (Float.compare(f19, f22) < 0) {
                            next2 = next4;
                            f19 = f22;
                        }
                    } while (it4.hasNext());
                }
            } else {
                next2 = null;
            }
            pr0.d dVar2 = (pr0.d) next2;
            float f24 = dVar2 != null ? dVar2.f139612d : 0.0f;
            YAxis axisLeft = lineChart.getAxisLeft();
            axisLeft.getClass();
            fVar.x(axisLeft, 0.0f, f18, f24);
            YAxis axisLeft2 = lineChart.getAxisLeft();
            if (axisLeft2 != null) {
                axisLeft2.setLabelCount(4, false);
                axisLeft2.setGranularity(axisLeft2.getAxisMaximum() / 3);
                axisLeft2.setAxisMaxValue(axisLeft2.getAxisMaximum() * 1.1f);
            }
            ArrayList arrayList2 = new ArrayList();
            if (arrayList.isEmpty() || dateTimeAtStartOfDay == null) {
                str = null;
                z14 = true;
            } else {
                Iterator it5 = arrayList.iterator();
                int i14 = 0;
                boolean z15 = true;
                while (it5.hasNext()) {
                    Object next5 = it5.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    pr0.d dVar3 = (pr0.d) next5;
                    List<hz.d> list = dVar3.f139609a;
                    float f25 = dVar3.f139612d;
                    float f26 = f17;
                    hz.d dVar4 = (hz.d) h0.d0(list);
                    DateTime dateTimePlusWeeks = dVar4 != null ? dVar4.f86388a : null;
                    hz.d dVar5 = (hz.d) h0.n0(list);
                    DateTime dateTime = dVar5 != null ? dVar5.f86388a : null;
                    if (dateTimePlusWeeks == null || dateTime == null) {
                        it = it5;
                        f14 = f26;
                        eVarO = fVar.o(j0.f134944a, false);
                    } else {
                        hz.e eVarP2 = fVar.p(dVar3, dateTimePlusWeeks, dateTime, dateTimeAtStartOfDay);
                        int i16 = 0;
                        for (int entryCount = eVarP2.getEntryCount(); i16 < entryCount; entryCount = entryCount) {
                            ?? entryForIndex = eVarP2.getEntryForIndex(i16);
                            entryForIndex.getClass();
                            Iterator it6 = it5;
                            DateTime dateTimePlusDays = dateTimeAtStartOfDay.plusDays(entryForIndex.getXIndex());
                            hz.e eVar = eVarP2;
                            pi0.e eVar2 = fVar.f139617h;
                            dateTimePlusDays.getClass();
                            entryForIndex.setData(new pr0.h(eVar2.a(dateTimePlusDays, qi0.a.NO_YEAR_ABBREV_MONTH_DAY), null, fVar.f139600f.b(Integer.valueOf((int) entryForIndex.getVal())), Integer.valueOf(R.color.gcm_chart_intensity_minutes_data_set), null, 18, null));
                            i16++;
                            it5 = it6;
                            eVarP2 = eVar;
                        }
                        it = it5;
                        hz.e eVar3 = eVarP2;
                        if (list.isEmpty()) {
                            f14 = f26;
                            eVarP = null;
                        } else {
                            hz.d dVar6 = list.get(0);
                            float f27 = dVar6.f86389b;
                            DateTime dateTime2 = dVar6.f86388a;
                            if (f27 > f26) {
                                f14 = f26;
                                eVarP = fVar.p(new pr0.d(p13.x.k(new hz.d(dateTime2, f14), dVar6), f14, dVar6.f86389b, f25), dateTime2, dateTime2, dateTimeAtStartOfDay);
                                eVarP.setHighlightEnabled(false);
                            } else {
                                f14 = f26;
                                eVarP = null;
                            }
                        }
                        if (eVarP != null) {
                            arrayList2.add(eVarP);
                        }
                        eVarO = eVar3;
                        z15 = false;
                    }
                    if (dateTimePlusWeeks == null) {
                        dateTimePlusWeeks = dateTimeAtStartOfDay.plusWeeks(i14);
                    }
                    DateTime dateTimeMinusDays = dateTimePlusWeeks.minusDays(1);
                    dateTimeMinusDays.getClass();
                    DateTime dateTimePlusDays2 = dateTimePlusWeeks.plusDays(6);
                    dateTimePlusDays2.getClass();
                    arrayList2.add(fVar.q(f25, dateTimeMinusDays, dateTimePlusDays2, dateTimeAtStartOfDay));
                    XAxis xAxis = fVar.f134443c;
                    if (xAxis != null) {
                        DateTime dateTimePlusDays3 = dateTimePlusWeeks.plusDays(6);
                        dateTimePlusDays3.getClass();
                        LimitLine limitLine = new LimitLine(Days.daysBetween(dateTimeAtStartOfDay, dateTimePlusDays3).getDays());
                        limitLine.setLineWidth(1.0f);
                        limitLine.setLineColor(a7.b.getColor(context2, R.color.gcm_surface_3));
                        xAxis.addLimitLine(limitLine);
                    }
                    arrayList2.add(eVarO);
                    f17 = f14;
                    i14 = i15;
                    it5 = it;
                }
                str = null;
                z14 = z15;
            }
            lineChart.setNoDataText(z14 ? context2.getString(R.string.intensity_lbl_no_im_data) : str);
            o13.p<String, String> pVar2 = fVar.f139618i;
            if (pVar2 != null) {
                String str2 = pVar2.f128595b;
            }
            lineChart.setExtraRightOffset(40.0f);
            fVar.j(new LineData((List<String>) fVar.u(0, dateTimeAtStartOfDay, dateTimeAtStartOfDay2), arrayList2));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:119:0x04f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v60 java.lang.Object, still in use, count: 2, list:
          (r4v60 java.lang.Object) from 0x04a5: PHI (r4 I:??) = (r4v56 java.lang.Object), (r4v60 java.lang.Object) binds: [B:114:0x04a4, B:212:0x04a5] A[DONT_GENERATE, DONT_INLINE]
          (r4v60 java.lang.Object) from 0x0497: CHECK_CAST (fj2.d) (r4v60 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // e23.l
    public final java.lang.Object invoke(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 3146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa2.p.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ p(int i14, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z14) {
        this.f2356a = i14;
        this.f2358c = obj;
        this.f2359d = obj2;
        this.f2360e = obj3;
        this.f2357b = obj4;
        this.f2361f = obj5;
        this.f2362g = obj6;
    }

    public /* synthetic */ p(e23.l lVar, r0 r0Var, String str, String str2, String str3, e23.l lVar2) {
        this.f2356a = 29;
        this.f2362g = lVar;
        this.f2358c = r0Var;
        this.f2359d = str;
        this.f2360e = str2;
        this.f2361f = str3;
        this.f2357b = lVar2;
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14) {
        this.f2356a = i14;
        this.f2358c = obj;
        this.f2359d = obj2;
        this.f2360e = obj3;
        this.f2361f = obj4;
        this.f2357b = obj5;
        this.f2362g = obj6;
    }

    public /* synthetic */ p(m0 m0Var, e23.a aVar, s1 s1Var, e23.l lVar, e23.a aVar2, u1 u1Var) {
        this.f2356a = 3;
        this.f2361f = m0Var;
        this.f2357b = aVar;
        this.f2358c = s1Var;
        this.f2362g = lVar;
        this.f2359d = aVar2;
        this.f2360e = u1Var;
    }

    public /* synthetic */ p(b0 b0Var, p1 p1Var, p1 p1Var2, e23.l lVar, e23.l lVar2, p1 p1Var3) {
        this.f2356a = 23;
        this.f2358c = b0Var;
        this.f2359d = p1Var;
        this.f2360e = p1Var2;
        this.f2362g = lVar;
        this.f2361f = lVar2;
        this.f2357b = p1Var3;
    }

    public /* synthetic */ p(v0 v0Var, com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, e23.a aVar, m0 m0Var, e23.l lVar, e23.a aVar2) {
        this.f2356a = 9;
        this.f2358c = v0Var;
        this.f2359d = fVar;
        this.f2357b = aVar;
        this.f2361f = m0Var;
        this.f2362g = lVar;
        this.f2360e = aVar2;
    }

    public /* synthetic */ p(wn1.n nVar, e23.a aVar, String str, x3 x3Var, x3 x3Var2, e23.a aVar2) {
        this.f2356a = 1;
        this.f2358c = nVar;
        this.f2357b = aVar;
        this.f2359d = str;
        this.f2360e = x3Var;
        this.f2361f = x3Var2;
        this.f2362g = aVar2;
    }

    public /* synthetic */ p(zc.d dVar, v21.e eVar, e23.l lVar, e23.l lVar2, m21.e eVar2, e23.l lVar3) {
        this.f2356a = 14;
        this.f2358c = dVar;
        this.f2359d = eVar;
        this.f2362g = lVar;
        this.f2360e = lVar2;
        this.f2361f = eVar2;
        this.f2357b = lVar3;
    }
}
