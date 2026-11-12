package w31;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import e2.i0;
import e2.k0;
import e23.p;
import e32.l;
import h4.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.j0;
import l72.x0;
import m92.o;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.w;
import p13.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import r22.z0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lw31/h;", "Lw31/i;", "", "Li41/f;", "Landroid/view/View;", "view", "Le32/l;", "Lj41/b;", "navigator", "Lorg/joda/time/DateTime;", "startDate", "endDate", "Lo41/a;", "viewModel", "<init>", "(Landroid/view/View;Le32/l;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lo41/a;)V", "Lo41/b;", "uiState", "gcm-overnighthrv_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends i<List<? extends i41.f>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o41.a f181863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTime f181864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f181865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u31.a f181866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f181867i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view2, l<j41.b> lVar, DateTime dateTime, DateTime dateTime2, o41.a aVar) {
        super(view2, lVar);
        view2.getClass();
        lVar.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        aVar.getClass();
        this.f181863e = aVar;
        this.f181864f = dateTime;
        this.f181865g = dateTime2;
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.recycler_view);
        u31.a aVar2 = new u31.a(this.f181869b, new dp1.e(lVar, 3));
        this.f181866h = aVar2;
        Context context = this.f181869b;
        String string = context.getString(R.string.common_no_certain_data, context.getString(R.string.ohrv_status));
        string.getClass();
        this.f181867i = string;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f181869b));
        Context context2 = this.f181869b;
        Integer numValueOf = Integer.valueOf(R.dimen.spacing_small);
        recyclerView.addItemDecoration(new z0(context2, numValueOf, numValueOf, numValueOf, numValueOf));
        recyclerView.setAdapter(aVar2);
    }

    @Override // e32.p
    public final void a() {
        g();
    }

    @Override // e32.p
    public final void c(Object obj) {
        double dFloor;
        h hVar;
        List list = (List) obj;
        if (list == null) {
            g();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((i41.f) obj2).getLastNightAvg() != null) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer lastNightAvg = ((i41.f) it.next()).getLastNightAvg();
            lastNightAvg.getClass();
            arrayList2.add(lastNightAvg);
        }
        double dFloor2 = 0.0d;
        if (arrayList2.isEmpty()) {
            dFloor = 0.0d;
        } else {
            Iterator it3 = arrayList2.iterator();
            double dIntValue = 0.0d;
            while (it3.hasNext()) {
                dIntValue += (double) ((Number) it3.next()).intValue();
            }
            dFloor = Math.floor(dIntValue / ((double) arrayList2.size()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (((i41.f) obj3).getWeeklyAvg() != null) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Integer weeklyAvg = ((i41.f) it4.next()).getWeeklyAvg();
            weeklyAvg.getClass();
            arrayList4.add(weeklyAvg);
        }
        if (!arrayList4.isEmpty()) {
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                dFloor2 += (double) ((Number) it5.next()).intValue();
            }
            dFloor2 = Math.floor(dFloor2 / ((double) arrayList4.size()));
        }
        double d14 = dFloor2;
        z31.b bVarA = n41.c.a.a(n41.c.f123606a, list, this.f181864f, this.f181865g);
        ComposeView composeView = this.f181871d;
        if (composeView != null) {
            hVar = this;
            composeView.setContent(new z3.e(1648750442, true, new g(hVar, bVarA, dFloor, d14, 0)));
        } else {
            hVar = this;
        }
        u31.a aVar = hVar.f181866h;
        ArrayList arrayList5 = aVar.f168284e;
        arrayList5.clear();
        if (!list.isEmpty()) {
            arrayList5.addAll(list);
        }
        aVar.notifyDataSetChanged();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    public final void d(y31.a aVar, e23.l lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1605987137);
        int i15 = i14 | (o0VarE.k(aVar == null ? -1 : aVar.ordinal()) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            i53.c cVarE = i53.a.e(w.c(new j0(gl1.y.Q(o0VarE, R.string.ohrv_chip_title_overnight_averages), null, null, false, aVar != null, 14, null)));
            f82.b bVar = new f82.b();
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new b71.n(lVar, 28, (byte) 0);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new b71.n(lVar, 28, (byte) 0);
                    o0VarE.K(objQ);
                }
            }
            e82.a.b(cVarE, bVar, i0VarA, null, null, (p) objQ, o0VarE, 0, 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.b(this, aVar, lVar, i14, 10);
        }
    }

    public final void e(String str, String str2, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-692568016);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            n41.a aVar = this.f181870c;
            o0Var = o0VarE;
            x0.f111346a.e(null, z3.f.c(-1267328009, new ku1.l(str, aVar.f123602b.getString(R.string.no_value_card), (Object) this, (Object) aVar.f123604d, (Object) str2, 27), o0VarE), o0Var, (x0.f111348c << 6) | 48, 1);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(this, str, str2, i14);
        }
    }

    public final void f(z31.b bVar, String str, String str2, m mVar, int i14, int i15) {
        String str3;
        int i16;
        String str4;
        int i17;
        String str5;
        String str6;
        o0 o0VarE = mVar.E(-589292261);
        int i18 = i14 | (o0VarE.r(bVar) ? 4 : 2);
        int i19 = i15 & 2;
        if (i19 != 0) {
            i16 = i18 | 48;
            str3 = str;
        } else {
            str3 = str;
            i16 = i18 | (o0VarE.B(str3) ? 32 : 16);
        }
        int i24 = i15 & 4;
        if (i24 != 0) {
            i17 = i16 | 384;
            str4 = str2;
        } else {
            str4 = str2;
            i17 = i16 | (o0VarE.B(str4) ? 256 : 128);
        }
        int i25 = i17 | (o0VarE.r(this) ? 2048 : 1024);
        if (o0VarE.n(i25 & 1, (i25 & 1171) != 1170)) {
            String str7 = i19 != 0 ? null : str3;
            String str8 = i24 != 0 ? null : str4;
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(this.f181863e.f129061g, o0VarE);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomCombinedChart(context);
                o0VarE.K(objQ);
            }
            CustomCombinedChart customCombinedChart = (CustomCombinedChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                b41.b bVar2 = new b41.b(customCombinedChart, new a41.a(context), new d41.b(customCombinedChart, this.f181864f, this.f181865g), new c41.a(customCombinedChart), new k00.g(customCombinedChart), null, 32, null);
                o0VarE.K(bVar2);
                objQ2 = bVar2;
            }
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            o.a(c2.l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), gl1.y.Q(o0VarE, R.string.title_7d_4w_charts), null, null, z3.f.c(232941723, new sg2.g(customCombinedChart, bVar, p1VarC, (b41.b) objQ2, this, 24), o0VarE), z3.f.c(-1898723364, new vq0.a(19, this, p1VarC), o0VarE), z3.f.c(264578845, new e(this, str7, str8), o0VarE), o0VarE, 1794048, 12);
            str5 = str7;
            str6 = str8;
        } else {
            o0VarE.e();
            str5 = str3;
            str6 = str4;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c(this, bVar, str5, str6, i14, i15);
        }
    }

    public final void g() {
        z31.b bVarA = n41.c.a.a(n41.c.f123606a, p13.j0.f134944a, this.f181864f, this.f181865g);
        ComposeView composeView = this.f181871d;
        if (composeView != null) {
            composeView.setContent(new z3.e(-1183403966, true, new f(this, bVarA, 0)));
        }
        u31.a aVar = this.f181866h;
        aVar.f168284e.clear();
        aVar.notifyDataSetChanged();
    }
}
