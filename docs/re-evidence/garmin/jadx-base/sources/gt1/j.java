package gt1;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import b21.p9;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.LineChart;
import e11.c0;
import e2.f0;
import i3.fe;
import java.util.ArrayList;
import java.util.List;
import l72.i3;
import lc.y;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import p3.p1;
import sk0.l0;
import sk0.m0;
import vd0.p0;
import vd0.s0;
import vd0.t0;
import yc.z0;
import yg2.q0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78969a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f78970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f78971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f78972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f78973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f78974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f78975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f78976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f78977i;

    public /* synthetic */ j(Context context, r0 r0Var, rs.c cVar, rs.d dVar, wg0.a aVar, wg0.d dVar2, xg0.n nVar, boolean z14) {
        this.f78971c = context;
        this.f78972d = r0Var;
        this.f78973e = nVar;
        this.f78974f = aVar;
        this.f78970b = z14;
        this.f78975g = cVar;
        this.f78976h = dVar;
        this.f78977i = dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v7, types: [T, xg0.c0] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        ir0.e eVar;
        List<ir0.f> list;
        wm1.a aVar;
        int i14 = this.f78969a;
        int i15 = 4;
        int i16 = 3;
        boolean z14 = this.f78970b;
        wm1.d dVar = null;
        dVar = null;
        dVar = null;
        Object obj2 = this.f78977i;
        Object obj3 = this.f78976h;
        Object obj4 = this.f78975g;
        Object obj5 = this.f78974f;
        Object obj6 = this.f78973e;
        Object obj7 = this.f78972d;
        Object obj8 = this.f78971c;
        switch (i14) {
            case 0:
                pt1.p pVar = (pt1.p) obj8;
                e23.p pVar2 = (e23.p) obj7;
                e23.l lVar = (e23.l) obj6;
                e23.a aVar2 = (e23.a) obj3;
                e23.l lVar2 = (e23.l) obj5;
                e23.l lVar3 = (e23.l) obj4;
                e23.a aVar3 = (e23.a) obj2;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                if (!pVar.f140952x) {
                    f0.b(f0Var, null, new z3.e(-1803943042, true, new p9(z14, pVar2, pVar, i16)), 3);
                }
                f0.b(f0Var, null, new z3.e(1595429945, true, new c0(19, pVar, lVar)), 3);
                f0.b(f0Var, null, new z3.e(1886581282, true, new ak0.p(aVar2, 5)), 3);
                f0.b(f0Var, null, new z3.e(2020168193, true, new l(lVar2, 0)), 3);
                if (!pVar.f140952x) {
                    f0.b(f0Var, null, new z3.e(-735714265, true, new p9(z14, lVar3, pVar, i15)), 3);
                }
                f0.b(f0Var, null, new z3.e(-2141212192, true, new ak0.p(aVar3, 6)), 3);
                return Unit.INSTANCE;
            case 1:
                DateTime dateTime = (DateTime) obj8;
                DateTime dateTime2 = (DateTime) obj7;
                Context context = (Context) obj6;
                r0 r0Var = (r0) obj5;
                p1 p1Var = (p1) obj4;
                String str = (String) obj3;
                r0 r0Var2 = (r0) obj2;
                BarLineChartBase barLineChartBase = (BarLineChartBase) obj;
                barLineChartBase.getClass();
                o13.p pVar3 = new o13.p(dateTime != null ? dateTime.toLocalDate() : null, dateTime2 != null ? dateTime2.toLocalDate() : null);
                LocalDate localDate = (LocalDate) pVar3.f128594a;
                LocalDate localDate2 = (LocalDate) pVar3.f128595b;
                if (localDate != null && localDate2 != null) {
                    if (z14) {
                        if (barLineChartBase instanceof CustomLineChart) {
                            DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
                            DateTime dateTimeAtStartOfDay2 = localDate2.toDateTimeAtStartOfDay();
                            CustomLineChart customLineChart = (CustomLineChart) barLineChartBase;
                            Context context2 = customLineChart.getContext();
                            context2.getClass();
                            dateTimeAtStartOfDay.getClass();
                            dateTimeAtStartOfDay2.getClass();
                            tz.a aVar4 = new tz.a(customLineChart, new b71.f(context2, dateTimeAtStartOfDay, dateTimeAtStartOfDay2, null, 8, null), new b71.g((LineChart) barLineChartBase, dateTimeAtStartOfDay, dateTimeAtStartOfDay2), new k00.m(barLineChartBase), new k00.g(barLineChartBase), null, 32, null);
                            aVar4.c();
                            u82.f fVar = (u82.f) r0Var.f105810a;
                            TrainingStatusReportDTO trainingStatusReportDTO = fVar != null ? (TrainingStatusReportDTO) fVar.a() : null;
                            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                            l22.a aVar5 = new l22.a(context);
                            pi0.e eVar2 = new pi0.e(context);
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayListC = trainingStatusReportDTO != null ? trainingStatusReportDTO.C() : null;
                            if (arrayListC != null) {
                                for (com.garmin.android.apps.connectmobile.performance.model.c cVar : h0.Z(arrayListC)) {
                                    double dI = cVar.I();
                                    Double D = cVar.D();
                                    double dDoubleValue = D != null ? D.doubleValue() : Double.NaN;
                                    double d14 = cVar.B;
                                    boolean z15 = cVar.f39959r;
                                    double d15 = !z15 ? cVar.f39965z : cVar.f39946e;
                                    double d16 = !z15 ? cVar.f39964y : cVar.f39945d;
                                    DateTime dateTimeC = cVar.C();
                                    String strA = eVar2.a(cVar.C(), qi0.a.NUMERIC_YEAR_MONTH_DAY);
                                    a61.e eVar3 = a61.e.f1563a;
                                    double dI2 = cVar.I();
                                    eVar3.getClass();
                                    String strC = a61.e.c(aVar5, dI2);
                                    Double D2 = cVar.D();
                                    String strC2 = a61.e.c(aVar5, D2 != null ? D2.doubleValue() : Double.NaN);
                                    boolean z16 = cVar.f39957p;
                                    String str2 = cVar.f39961v;
                                    String str3 = str2 == null ? "" : str2;
                                    String str4 = cVar.f39962w;
                                    arrayList.add(new a71.d(dI, dDoubleValue, d14, d15, d16, dateTimeC, strA, strC, strC2, z16, str3, str4 == null ? "" : str4, !cVar.f39959r, a61.e.d(aVar5, cVar.I(), cVar.G(), cVar.f39957p)));
                                }
                            }
                            if (arrayList.size() > 1) {
                                p13.c0.u(arrayList, new hn1.f());
                            }
                            qz.a.b(aVar4, new a71.e(arrayList, "", "", null, "", "", "", "", true, false, true, zBooleanValue, null, new ha0.b(18), false, null, false), str, 4);
                        }
                    } else if (barLineChartBase instanceof CustomBarChart) {
                        o13.p pVar4 = new o13.p(dateTime != null ? dateTime.toLocalDate() : null, dateTime2 != null ? dateTime2.toLocalDate() : null);
                        LocalDate localDate3 = (LocalDate) pVar4.f128594a;
                        LocalDate localDate4 = (LocalDate) pVar4.f128595b;
                        if (localDate3 != null && localDate4 != null) {
                            CustomBarChart customBarChart = (CustomBarChart) barLineChartBase;
                            Context context3 = customBarChart.getContext();
                            context3.getClass();
                            rz.a aVar6 = new rz.a(customBarChart, new wm1.b(context3, localDate, localDate2), new wm1.c((BarChart) barLineChartBase, localDate, localDate2), new k00.j(barLineChartBase), new k00.g(barLineChartBase), null, 32, null);
                            u82.f fVar2 = (u82.f) r0Var2.f105810a;
                            if (fVar2 != null && (eVar = (ir0.e) fVar2.a()) != null && (list = eVar.f94793a) != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (ir0.f fVar3 : list) {
                                    if (fVar3.f94796a == null) {
                                        fVar3 = null;
                                    }
                                    if (fVar3 != null) {
                                        Integer numD = fVar3.d();
                                        Integer numValueOf = Integer.valueOf(numD != null ? numD.intValue() : 0);
                                        Integer numG = fVar3.g();
                                        aVar = new wm1.a(fVar3.b(), Integer.valueOf(oe2.f.y(numValueOf, Integer.valueOf(numG != null ? numG.intValue() : 0))));
                                    } else {
                                        aVar = null;
                                    }
                                    if (aVar != null) {
                                        arrayList2.add(aVar);
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    arrayList2 = null;
                                }
                                ir0.e eVar4 = (ir0.e) ((u82.f) r0Var2.f105810a).a();
                                dVar = new wm1.d(arrayList2, eVar4 != null ? Integer.valueOf(eVar4.d()) : null);
                            }
                            qz.a.b(aVar6, dVar, str, 4);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 2:
                Context context4 = (Context) obj8;
                String str5 = (String) obj7;
                String str6 = (String) obj6;
                String str7 = (String) obj5;
                String str8 = (String) obj4;
                DateTime dateTime3 = (DateTime) obj3;
                String str9 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                int i17 = s00.c.f155287a;
                String string = context4.getString(R.string.pn_title_new_comment);
                string.getClass();
                String string2 = z14 ? context4.getString(R.string.pn_commented_on_group_activity_thread_without_activity_name_format, str5, str6) : context4.getString(R.string.pn_commented_on_activity_thread_with_text, str5, str7, str6);
                string2.getClass();
                po1.d dVar2 = new po1.d(context4, str8, dateTime3, null, str5, str7, str9, bitmap, string, string2);
                oi2.a.f132270a.getClass();
                l73.c.b().e(dVar2);
                ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                return Unit.INSTANCE;
            case 3:
                e23.p pVar5 = (e23.p) obj7;
                p1 p1Var2 = (p1) obj8;
                p1 p1Var3 = (p1) obj6;
                p1 p1Var4 = (p1) obj5;
                p1 p1Var5 = (p1) obj4;
                p1 p1Var6 = (p1) obj3;
                p1 p1Var7 = (p1) obj2;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "SAVE")) {
                    String str10 = ((l0) p1Var2.getF182175a()).f159721b;
                    if (str10 == null || d53.w.J(str10)) {
                        p1Var3.setValue(m0.b((m0) p1Var3.getF182175a(), true, false, false, 6));
                    }
                    if (((l0) p1Var2.getF182175a()).f159722c.isEmpty() && z14) {
                        p1Var3.setValue(m0.b((m0) p1Var3.getF182175a(), false, false, true, 3));
                    }
                    if (((m0) p1Var3.getF182175a()).f159752a) {
                        p1Var4.setValue(Boolean.TRUE);
                    } else if (((m0) p1Var3.getF182175a()).f159753b) {
                        p1Var5.setValue(Boolean.TRUE);
                    } else if (((m0) p1Var3.getF182175a()).f159754c) {
                        p1Var6.setValue(Boolean.TRUE);
                    } else {
                        pVar5.invoke((l0) p1Var2.getF182175a(), (List) p1Var7.getF182175a());
                    }
                }
                return Unit.INSTANCE;
            case 4:
                zc.d dVar3 = (zc.d) obj8;
                pe0.f fVar4 = (pe0.f) obj7;
                l22.a aVar7 = (l22.a) obj5;
                e23.l lVar4 = (e23.l) obj6;
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                boolean z17 = this.f78970b;
                f0.b(f0Var2, null, new z3.e(-1021643571, true, new d62.f(fVar4, z17, aVar7, (e23.a) obj3, (p1) obj4, 11)), 3);
                f0.b(f0Var2, null, new z3.e(139730614, true, new h21.m(fVar4, aVar7, z17, (p1) obj2, 16)), 3);
                if (dVar3 != null && dVar3.b() > 0) {
                    i53.c<String> cVar2 = fVar4.f137432m;
                    String str11 = fVar4.f137433n;
                    float f14 = t0.f177384a;
                    cVar2.getClass();
                    lVar4.getClass();
                    f0.b(f0Var2, null, new z3.e(-196432236, true, new s0(cVar2, 0, str11, lVar4)), 3);
                    if (dVar3.d().f196385a instanceof z0.b) {
                        p0.f177348a.getClass();
                        f0.b(f0Var2, null, p0.f177349b, 3);
                    } else if (dVar3.b() == 0 && (dVar3.d().f196385a instanceof z0.c)) {
                        p0.f177348a.getClass();
                        f0.b(f0Var2, null, p0.f177350c, 3);
                    } else {
                        f0.f(f0Var2, dVar3.b(), new zc.a(new vb1.d(14), dVar3), new z3.e(1214355614, true, new r22.h(dVar3, 1)), 4);
                        if (dVar3.d().f196387c instanceof z0.b) {
                            p0.f177348a.getClass();
                            f0.b(f0Var2, null, p0.f177351d, 3);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 5:
                ((Context) obj).getClass();
                View viewInflate = LayoutInflater.from((Context) obj8).inflate(R.layout.item_activity_feed_media_map, (ViewGroup) null);
                viewInflate.getClass();
                ((r0) obj7).f105810a = new xg0.c0(viewInflate, (xg0.n) obj6, (wg0.a) obj5, this.f78970b, (rs.c) obj4, (rs.d) obj3, (wg0.d) obj2);
                return viewInflate;
            default:
                yg2.o oVar = (yg2.o) obj8;
                bg2.j jVar = (bg2.j) obj7;
                y yVar = (y) obj6;
                b0 b0Var = (b0) obj5;
                fe feVar = (fe) obj4;
                String str12 = (String) obj3;
                String str13 = (String) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (z14) {
                    zg2.c.f204692a.getClass();
                    zg2.c.d("WorkoutView", "Navigate to exercise information page.");
                    q0.h(oVar, iIntValue, jVar, yVar);
                } else {
                    ge1.b.T(b0Var, null, null, new yg2.s0(feVar, str12, str13, null), 3);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(Context context, boolean z14, String str, String str2, String str3, String str4, DateTime dateTime, String str5) {
        this.f78971c = context;
        this.f78970b = z14;
        this.f78972d = str;
        this.f78973e = str2;
        this.f78974f = str3;
        this.f78975g = str4;
        this.f78976h = dateTime;
        this.f78977i = str5;
    }

    public /* synthetic */ j(e23.a aVar, e23.l lVar, l22.a aVar2, p1 p1Var, p1 p1Var2, pe0.f fVar, zc.d dVar, boolean z14) {
        this.f78971c = dVar;
        this.f78972d = fVar;
        this.f78970b = z14;
        this.f78974f = aVar2;
        this.f78976h = aVar;
        this.f78975g = p1Var;
        this.f78977i = p1Var2;
        this.f78973e = lVar;
    }

    public /* synthetic */ j(DateTime dateTime, DateTime dateTime2, boolean z14, Context context, r0 r0Var, p1 p1Var, String str, r0 r0Var2) {
        this.f78971c = dateTime;
        this.f78972d = dateTime2;
        this.f78970b = z14;
        this.f78973e = context;
        this.f78974f = r0Var;
        this.f78975g = p1Var;
        this.f78976h = str;
        this.f78977i = r0Var2;
    }

    public /* synthetic */ j(pt1.p pVar, boolean z14, e23.p pVar2, e23.l lVar, e23.a aVar, e23.l lVar2, e23.l lVar3, e23.a aVar2) {
        this.f78971c = pVar;
        this.f78970b = z14;
        this.f78972d = pVar2;
        this.f78973e = lVar;
        this.f78976h = aVar;
        this.f78974f = lVar2;
        this.f78975g = lVar3;
        this.f78977i = aVar2;
    }

    public /* synthetic */ j(boolean z14, e23.p pVar, p1 p1Var, p1 p1Var2, p1 p1Var3, p1 p1Var4, p1 p1Var5, p1 p1Var6) {
        this.f78970b = z14;
        this.f78972d = pVar;
        this.f78971c = p1Var;
        this.f78973e = p1Var2;
        this.f78974f = p1Var3;
        this.f78975g = p1Var4;
        this.f78976h = p1Var5;
        this.f78977i = p1Var6;
    }

    public /* synthetic */ j(boolean z14, yg2.o oVar, bg2.j jVar, y yVar, b0 b0Var, fe feVar, String str, String str2) {
        this.f78970b = z14;
        this.f78971c = oVar;
        this.f78972d = jVar;
        this.f78973e = yVar;
        this.f78974f = b0Var;
        this.f78975g = feVar;
        this.f78976h = str;
        this.f78977i = str2;
    }
}
