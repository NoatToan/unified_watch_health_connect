package nc1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.legend.CustomLegendView;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import dc1.f;
import e23.l;
import g22.k;
import h4.g;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mh1.x;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.y;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p2;
import p3.x1;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, p13.j0] */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r8v23, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.util.ArrayList] */
    public static final void a(f fVar, DateTime dateTime, DateTime dateTime2, m mVar, int i14) {
        CustomBarChart customBarChart;
        Context context;
        ?? r14;
        List<dc1.d> list;
        ?? arrayList;
        List<dc1.c> list2;
        ?? E = mVar.E(-305303983);
        int i15 = i14 | (E.r(fVar) ? 4 : 2) | (E.r(dateTime) ? 32 : 16) | (E.r(dateTime2) ? 256 : 128);
        if (E.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            boolean z14 = Days.daysBetween(dateTime, dateTime2).getDays() > 7;
            Context context2 = (Context) E.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = E.q();
            m.f135153a.getClass();
            Object obj = m.a.f135155b;
            if (objQ == obj) {
                objQ = new CustomBarChart(context2);
                E.K(objQ);
            }
            CustomBarChart customBarChart2 = (CustomBarChart) objQ;
            Object objQ2 = E.q();
            if (objQ2 == obj) {
                CustomLegendView customLegendView = new CustomLegendView(context2, null, 0, 0, 14, null);
                String string = context2.getString(R.string.device_settings_pulse_ox);
                string.getClass();
                customLegendView.setChartTitle(string);
                E.K(customLegendView);
                objQ2 = customLegendView;
            }
            CustomLegendView customLegendView2 = (CustomLegendView) objQ2;
            Object objQ3 = E.q();
            if (objQ3 == obj) {
                DateTime dateTimeWithTimeAtStartOfDay = dateTime.withTimeAtStartOfDay();
                dateTimeWithTimeAtStartOfDay.getClass();
                DateTime dateTimeWithTimeAtStartOfDay2 = dateTime2.plusDays(1).withTimeAtStartOfDay();
                dateTimeWithTimeAtStartOfDay2.getClass();
                customBarChart = customBarChart2;
                rz.a aVar = new rz.a(customBarChart, new jc1.c(context2, dateTimeWithTimeAtStartOfDay, dateTimeWithTimeAtStartOfDay2, z14), new jc1.d(customBarChart2, z14), null, null, customLegendView2, 24, null);
                aVar.c();
                E.K(aVar);
                objQ3 = aVar;
            } else {
                customBarChart = customBarChart2;
            }
            rz.a aVar2 = (rz.a) objQ3;
            if (z14) {
                if (fVar == null || (list2 = fVar.f59148b) == null) {
                    arrayList = j0.f134944a;
                } else {
                    arrayList = new ArrayList(y.r(list2, 10));
                    for (dc1.c cVar : list2) {
                        arrayList.add(new p(k.p(cVar.f59140a, "yyyy-MM-dd", DateTimeZone.UTC), Float.valueOf((float) cVar.f59141b)));
                    }
                }
                r14 = arrayList;
                context = context2;
            } else {
                r0 r0Var = new r0();
                r0Var.f105810a = j0.f134944a;
                if (fVar != null && (list = fVar.f59147a) != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            context = context2;
                            break;
                        }
                        if (((dc1.d) it.next()).f59143b > 0.0d) {
                            ?? arrayList2 = new ArrayList(y.r(list, 10));
                            for (dc1.d dVar : list) {
                                arrayList2.add(new p(new DateTime(dVar.f59142a, DateTimeZone.UTC), Float.valueOf((float) dVar.f59143b)));
                                context2 = context2;
                            }
                            context = context2;
                            r0Var.f105810a = arrayList2;
                            break;
                        }
                    }
                } else {
                    context = context2;
                    break;
                }
                r14 = (List) r0Var.f105810a;
            }
            Integer numValueOf = r14.isEmpty() ? Integer.valueOf(R.string.txt_empty_page_no_data) : null;
            h4.d.f81522a.getClass();
            g.a aVar3 = h4.d.a.f81537o;
            r.a aVar4 = r.S;
            j.f22691a.getClass();
            z zVarA = c2.y.a(j.f22694d, aVar3, E, 48);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(E.U);
            i2 i2VarA0 = E.a0();
            r rVarC = h4.k.c(aVar4, E);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (E.f135177b == null) {
                p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar5);
            } else {
                E.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, E);
            b4.c(h5.g.a.f81809f, i2VarA0, E);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (E.T || !s.g(E.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, E, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, E);
            b0 b0Var = b0.f22601a;
            boolean zR = E.r(customBarChart);
            Object objQ4 = E.q();
            if (zR || objQ4 == m.a.f135155b) {
                objQ4 = new di0.c(customBarChart, 6);
                E.K(objQ4);
            }
            l lVar = (l) objQ4;
            g6.f.a aVar6 = g6.f.f75994b;
            r rVarH = x2.h(x2.f(aVar4, 1.0f), 170);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = c2.l.A(rVarH, j92.b.f97899b.f97920e, 0.0f, 2);
            Context context3 = context;
            boolean zR2 = E.r(aVar2) | E.r(r14) | E.B(numValueOf) | E.r(context3);
            Object objQ5 = E.q();
            if (zR2 || objQ5 == m.a.f135155b) {
                mt0.e0 e0Var = new mt0.e0(aVar2, (Object) r14, numValueOf, context3, 4);
                E.K(e0Var);
                objQ5 = e0Var;
            }
            p002j6.c.b(lVar, rVarA, (l) objQ5, E, 0, 0);
            boolean zR3 = E.r(customLegendView2);
            Object objQ6 = E.q();
            if (zR3 || objQ6 == m.a.f135155b) {
                objQ6 = new x(customLegendView2, 22);
                E.K(objQ6);
            }
            p002j6.c.b((l) objQ6, null, null, E, 0, 6);
            E.g0(true);
        } else {
            E.e();
        }
        p2 p2VarI0 = E.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(fVar, dateTime, dateTime2, i14, 9);
        }
    }
}
