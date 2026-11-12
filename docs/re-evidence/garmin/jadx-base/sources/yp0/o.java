package yp0;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import ho.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import l72.x0;
import m92.h0;
import m92.l0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import vd0.s0;
import w5.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyp0/o;", "Le32/p;", "", "Ljp0/f;", "Landroid/view/View;", "view", "Le32/l;", "Lyp0/l;", "navigator", "Lb63/o;", "startDate", "endDate", "<init>", "(Landroid/view/View;Le32/l;Lb63/o;Lb63/o;)V", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements e32.p<List<? extends jp0.f>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e32.l<l> f198680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.o f198681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.o f198682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f198683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wp0.a f198684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pi0.e f198685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f198686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ComposeView f198687h;

    public o(View view2, e32.l<l> lVar, b63.o oVar, b63.o oVar2) {
        view2.getClass();
        lVar.getClass();
        oVar.getClass();
        oVar2.getClass();
        this.f198680a = lVar;
        this.f198681b = oVar;
        this.f198682c = oVar2;
        Context context = view2.getContext();
        context.getClass();
        this.f198683d = context;
        wp0.a aVar = new wp0.a(new l22.a(context));
        this.f198684e = aVar;
        this.f198685f = new pi0.e(context);
        this.f198686g = aVar.d(0.0d, true);
        this.f198687h = (ComposeView) view2.findViewById(R.id.composable_container);
    }

    @Override // e32.p
    public final void a() {
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(List<? extends jp0.f> list) {
        return false;
    }

    @Override // e32.p
    public final void c(List<? extends jp0.f> list) {
        List<? extends jp0.f> list2 = list;
        ComposeView composeView = this.f198687h;
        if (composeView != null) {
            composeView.setContent(new z3.e(2144764730, true, new n(this, list2, 0)));
        }
    }

    public final void d(String str, String str2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-75227733);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            x0 x0Var = x0.f111346a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            x0Var.e(c2.l.y(aVar, j92.b.f97899b.f97920e), z3.f.c(-349583310, new s0(this, str, 19, str2), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xk1.e(this, str, str2, i14, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012f  */
    public final void e(List<jp0.f> list, p3.m mVar, int i14) {
        String strM;
        o0 o0VarE = mVar.E(329398416);
        int i15 = 2;
        int i16 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        boolean z14 = false;
        boolean z15 = true;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (list == null) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new n(this, list, i14, i15);
                    return;
                }
                return;
            }
            r.a aVar = r.S;
            float f14 = 8;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarC = c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            r rVarZ = c2.l.z(aVar, 16, f14);
            String strQ = gl1.y.Q(o0VarE, R.string.steps_steps_daily_avg);
            o0VarE.C(-380671393);
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                jp0.f fVar = (jp0.f) it.next();
                LocalDate localDateD = fVar.d();
                Double value = fVar.getValue();
                if (localDateD != null) {
                    LocalDate localDatePlusDays = localDateD.plusDays(6);
                    localDatePlusDays.getClass();
                    strM = this.f198685f.m(localDateD, localDatePlusDays, pi0.f.SHORT_MONTH_NO_WEEKDAY);
                } else {
                    strM = null;
                }
                if (strM == null) {
                    strM = "";
                }
                String strD = value != null ? this.f198684e.d(value.doubleValue(), z15) : null;
                boolean zR = o0VarE.r(localDateD) | o0VarE.r(this);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new xr.a(23, localDateD, this);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new xr.a(23, localDateD, this);
                        o0VarE.K(objQ);
                    }
                }
                l72.l.e(strM, null, strD, strQ, null, null, rVarZ, null, false, (e23.a) objQ, o0VarE, 0, 434);
                z14 = z14;
                z15 = true;
            }
            o0VarE.g0(z14);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new n(this, list, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x01df A[PHI: r6
      0x01df: PHI (r6v25 java.lang.Object) = (r6v16 java.lang.Object), (r6v17 java.lang.Object) binds: [B:40:0x01dd, B:43:0x01ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v28, types: [p13.j0] */
    public final void f(i53.d<b63.o, Double> dVar, b63.o oVar, b63.o oVar2, p3.m mVar, int i14) {
        ?? arrayList;
        float fFloor;
        double d14;
        o0 o0VarE = mVar.E(952226396);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(oVar) ? 32 : 16) | (o0VarE.r(oVar2) ? 256 : 128) | (o0VarE.r(this) ? 2048 : 1024);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            s5.s0 s0Var = new s5.s0((q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) o0VarE.A(t1.f91496n), 0, 8, null);
            DateTime dateTimeK = vb.h.k(oVar);
            DateTime dateTimeK2 = vb.h.k(oVar2);
            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMM");
            dateTimeFormatterForPattern.getClass();
            List<String> listE = c02.a.e(dateTimeK, dateTimeK2, dateTimeFormatterForPattern);
            dVar.getClass();
            if (dVar.isEmpty()) {
                arrayList = j0.f134944a;
            } else {
                j23.l lVar = new j23.l(0, b63.p.a(oVar, oVar2) / 7);
                arrayList = new ArrayList(p13.y.r(lVar, 10));
                Iterator<Integer> it = lVar.iterator();
                while (((j23.k) it).f96801c) {
                    int iNextInt = ((p13.p0) it).nextInt();
                    int i17 = iNextInt * 7;
                    b63.o oVarE = oVar;
                    for (int i18 = 0; i18 < i17; i18++) {
                        b63.i.INSTANCE.getClass();
                        oVarE = b63.q.e(oVarE, i16, b63.i.f16190d);
                    }
                    Double d15 = dVar.get(oVarE);
                    if (d15 != null) {
                        double d16 = 10;
                        fFloor = (float) (Math.floor(d15.doubleValue() * d16) / d16);
                    } else {
                        fFloor = 0.0f;
                    }
                    arrayList.add(new l0(new h0.e.a(iNextInt, fFloor), true, false, 4, null));
                    i16 = i16;
                }
            }
            int i19 = i16;
            i53.c cVarE = i53.a.e((Iterable) arrayList);
            float fG = w02.b0.g(p.f198688a, o0VarE);
            float fCeil = (float) Math.ceil(((double) (b63.p.a(oVar, oVar2) + i19)) / 7.0d);
            gl.c.f77766a.getClass();
            long j8 = gl.c.f77767b.f77805s;
            g6.f.a aVar = g6.f.f75994b;
            r rVarH = x2.h(x2.f(r.S, 1.0f), 350);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = c2.l.A(rVarH, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            r rVarC = c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            String strQ = gl1.y.Q(o0VarE, R.string.pregnancy_daily_averages);
            String strP = gl1.y.P(R.string.common_no_certain_data, new Object[]{gl1.y.Q(o0VarE, R.string.lbl_hydration_title)}, o0VarE);
            d92.b.f58624b.getClass();
            n92.l lVar2 = new n92.l(listE, s0Var, d92.c.f(j92.f.f97935l, o0VarE));
            d02.a aVar2 = new d02.a();
            new wp0.a(new l22.a(this.f198683d));
            Object next = null;
            double dH = wp0.a.h(jp0.c.e(null, ((mp0.a) KoinJavaComponent.get$default(mp0.a.class, null, null, 6, null)).a(), 1));
            Iterator it3 = dVar.values().iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    double dDoubleValue = ((Number) next).doubleValue();
                    while (true) {
                        Object next2 = it3.next();
                        d14 = dH;
                        double dDoubleValue2 = ((Number) next2).doubleValue();
                        if (Double.compare(dDoubleValue, dDoubleValue2) < 0) {
                            dDoubleValue = dDoubleValue2;
                            next = next2;
                        }
                        if (!it3.hasNext()) {
                            break;
                        }
                        fG = fG;
                        cVarE = cVarE;
                        dH = d14;
                    }
                } else {
                    d14 = dH;
                }
            } else {
                d14 = dH;
            }
            Double d17 = (Double) next;
            n92.h hVar = new n92.h(aVar2, Float.valueOf(qp0.a.a(d17 != null ? d17.doubleValue() : d14, 0.0d)), 5);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            m92.d.a(rVarC, strQ, fG, j8, 0.0f, cVarE, Float.valueOf(fCeil), strP, new n92.a(hVar, null, new n92.g(sn.a.c(o0VarE), s0Var, d92.c.f(j92.f.f97935l, o0VarE), null, 8, null), lVar2, 2, null), null, z3.f.c(257638578, new x(oVar, dVar, this, j8, 5), o0VarE), o0VarE, 0, 48, 1168);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(this, dVar, oVar, oVar2, i14, 9);
        }
    }
}
