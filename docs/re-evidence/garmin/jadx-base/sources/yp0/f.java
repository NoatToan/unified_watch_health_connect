package yp0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import h4.r;
import i3.e5;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.j0;
import p3.o0;
import p3.p2;
import p3.x1;
import vd0.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyp0/f;", "Le32/p;", "", "Ljp0/a;", "Landroid/view/View;", "view", "Le32/l;", "Lyp0/l;", "navigator", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Landroid/view/View;Le32/l;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements e32.p<List<? extends jp0.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e32.l<l> f198640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f198641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f198642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f198643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wp0.a f198644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pi0.e f198645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f198646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f198647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ComposeView f198648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ComposeView f198649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f198650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CustomBarChart f198651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rz.a<sp0.a, d00.a> f198652m;

    public f(View view2, e32.l<l> lVar, LocalDate localDate, LocalDate localDate2) {
        view2.getClass();
        lVar.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f198640a = lVar;
        this.f198641b = localDate;
        this.f198642c = localDate2;
        Context context = view2.getContext();
        context.getClass();
        this.f198643d = context;
        Context context2 = view2.getContext();
        context2.getClass();
        wp0.a aVar = new wp0.a(new l22.a(context2));
        this.f198644e = aVar;
        this.f198645f = new pi0.e(context);
        this.f198646g = aVar.d(0.0d, true);
        String string = context.getString(R.string.common_no_certain_data, context.getString(R.string.lbl_hydration_title));
        string.getClass();
        this.f198647h = string;
        this.f198648i = (ComposeView) view2.findViewById(R.id.gcm_stats_row_1);
        this.f198649j = (ComposeView) view2.findViewById(R.id.hydration_summary_list);
        View viewFindViewById = view2.findViewById(R.id.chart_title);
        viewFindViewById.getClass();
        this.f198650k = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.chart_view);
        viewFindViewById2.getClass();
        CustomBarChart customBarChart = (CustomBarChart) viewFindViewById2;
        this.f198651l = customBarChart;
        this.f198652m = new rz.a<>(customBarChart, new rp0.a(context, new pi0.e(context), localDate, localDate2), new rp0.c(customBarChart, localDate, localDate2), new rp0.d(customBarChart), null, null, 48, null);
    }

    @Override // e32.p
    public final void a() {
        e(new sp0.a(this.f198641b, this.f198642c, j0.f134944a, null, 8, null));
        ComposeView composeView = this.f198648i;
        if (composeView != null) {
            String str = null;
            composeView.setContent(new z3.e(668609313, true, new d(str, this, str, 0)));
        }
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(List<? extends jp0.a> list) {
        return false;
    }

    @Override // e32.p
    public final void c(List<? extends jp0.a> list) {
        String strD;
        Double d14;
        Object next;
        List<? extends jp0.a> list2 = list;
        Double d15 = null;
        Object next2 = null;
        e(new sp0.a(this.f198641b, this.f198642c, list2 != null ? qp0.a.b(list2) : null, null, 8, null));
        String strD2 = this.f198646g;
        if (list2 == null || list2.isEmpty()) {
            strD = strD2;
        } else {
            if (list2.isEmpty()) {
                d14 = null;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    Double value = ((jp0.a) it.next()).getValue();
                    if (value != null) {
                        arrayList.add(value);
                    }
                }
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    next = it3.next();
                    if (it3.hasNext()) {
                        double dDoubleValue = ((Number) next).doubleValue();
                        do {
                            Object next3 = it3.next();
                            double dDoubleValue2 = ((Number) next3).doubleValue();
                            if (Double.compare(dDoubleValue, dDoubleValue2) < 0) {
                                next = next3;
                                dDoubleValue = dDoubleValue2;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next = null;
                }
                Double d16 = (Double) next;
                Iterator it4 = arrayList.iterator();
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (it4.hasNext()) {
                        double dDoubleValue3 = ((Number) next2).doubleValue();
                        do {
                            Object next4 = it4.next();
                            double dDoubleValue4 = ((Number) next4).doubleValue();
                            if (Double.compare(dDoubleValue3, dDoubleValue4) > 0) {
                                next2 = next4;
                                dDoubleValue3 = dDoubleValue4;
                            }
                        } while (it4.hasNext());
                    }
                }
                d14 = (Double) next2;
                d15 = d16;
            }
            wp0.a aVar = this.f198644e;
            strD = (d15 == null || Double.isNaN(d15.doubleValue())) ? strD2 : aVar.d(d15.doubleValue(), true);
            if (d14 != null && !Double.isNaN(d14.doubleValue())) {
                strD2 = aVar.d(d14.doubleValue(), true);
            }
        }
        ComposeView composeView = this.f198648i;
        if (composeView != null) {
            composeView.setContent(new z3.e(668609313, true, new d(strD2, this, strD, 0)));
        }
        if (list2 != null) {
            i53.c cVarE = i53.a.e(list2);
            ComposeView composeView2 = this.f198649j;
            if (composeView2 != null) {
                composeView2.setContent(new z3.e(1574203477, true, new e(cVarE, this, 0)));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    public final void d(jp0.a aVar, r rVar, p3.m mVar, int i14) {
        wp0.a aVar2;
        o0 o0VarE = mVar.E(1022859430);
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        int iDoubleValue = 0;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            LocalDate localDateD = aVar.d();
            Double value = aVar.getValue();
            Double goal = aVar.getGoal();
            pi0.e eVar = this.f198645f;
            String strG = null;
            String strD = localDateD != null ? eVar.d(localDateD, qi0.a.WEEKDAY) : null;
            String strD2 = localDateD != null ? eVar.d(localDateD, qi0.a.RELATIVE_YEAR_MONTH_DAY) : null;
            wp0.a aVar3 = this.f198644e;
            if (value == null) {
                aVar2 = aVar3;
            } else if (goal != null) {
                double dDoubleValue = goal.doubleValue();
                aVar3.getClass();
                iDoubleValue = jp0.c.a(value.doubleValue(), dDoubleValue, jp0.c.j(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).d0()), aVar3);
                aVar2 = aVar3;
            } else {
                aVar2 = aVar3;
                iDoubleValue = (int) value.doubleValue();
            }
            if (strD == null) {
                strD = "";
            }
            if (strD2 != null) {
                aVar2.getClass();
                l22.b bVar = aVar2.f186529a;
                String str = NumberFormat.getIntegerInstance().format(Integer.valueOf(iDoubleValue));
                str.getClass();
                strG = e5.g(strD2, " • ", bVar.a(R.string.lbl_value_percent, str));
            }
            z3.e eVarC = z3.f.c(-406007758, new s0(value, 17, this, aVar), o0VarE);
            boolean zR = o0VarE.r(localDateD) | o0VarE.r(this);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new xr.a(22, localDateD, this);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new xr.a(22, localDateD, this);
                    o0VarE.K(objQ);
                }
            }
            l72.l.d(strD, strG, eVarC, rVar, null, false, (e23.a) objQ, o0VarE, ((i15 << 6) & 7168) | 384, 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xk1.e(this, aVar, rVar, i14, 18);
        }
    }

    public final void e(sp0.a aVar) {
        String string = this.f198643d.getString(R.string.lbl_daily_totals);
        TextView textView = this.f198650k;
        textView.setText(string);
        textView.setVisibility(0);
        qz.a.b(this.f198652m, aVar, this.f198647h, 4);
        v22.e.q(this.f198651l);
    }
}
