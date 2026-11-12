package w21;

import android.content.Context;
import b63.o;
import c2.b0;
import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import c22.o2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import e23.p;
import f5.z0;
import h4.r;
import h5.e0;
import i3.fe;
import i3.mc;
import i3.mh;
import i3.ua;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ky0.w;
import l72.f0;
import l72.h3;
import l72.i3;
import lc.m0;
import o4.m1;
import o4.r1;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import s5.x0;
import tn2.s0;
import u1.a2;
import u1.d2;
import u1.y0;
import w51.h0;
import wx1.t;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f181519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f181520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f181521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f181522e;

    public /* synthetic */ d(h0 h0Var, p1 p1Var, Context context, w wVar) {
        this.f181518a = 2;
        this.f181521d = h0Var;
        this.f181519b = p1Var;
        this.f181522e = context;
        this.f181520c = wVar;
    }

    private final Object a(Object obj, Object obj2) {
        j92.e eVar;
        int i14;
        float f14;
        e23.a aVar = (e23.a) this.f181521d;
        mx1.f fVar = (mx1.f) this.f181522e;
        jf.d dVar = (jf.d) this.f181519b;
        x3 x3Var = (x3) this.f181520c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            r rVarD = x2.d(aVar2, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            z zVarA = y.a(kVar, aVar3, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = h4.k.c(rVarD, mVar);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar4);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, mVar);
            r rVarB = a2.b(b0.f22601a.a(aVar2, 1.0f, true), a2.a(mVar), true);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f15 = eVar3.f97920e;
            z zVarA2 = y.a(c2.j.i(f15), aVar3, mVar, 0);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            r rVarC2 = h4.k.c(rVarB, mVar);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar4);
            } else {
                mVar.c();
            }
            b4.c(eVar2, zVarA2, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar2, rVarC2, mVar);
            float f16 = ox1.b.f134333b;
            j92.c cVar = j92.b.f97901d;
            float f17 = cVar.f97907f / 2;
            g6.f.a aVar5 = g6.f.f75994b;
            r rVarH = x2.h(aVar2, f17 + f16);
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode3 = Long.hashCode(mVar.getU());
            i2 i2VarX3 = mVar.x();
            r rVarC3 = h4.k.c(rVarH, mVar);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar4);
            } else {
                mVar.c();
            }
            b4.c(eVar2, z0VarD, mVar);
            b4.c(c1623g, i2VarX3, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                v.h.z(iHashCode3, mVar, iHashCode3, bVar);
            }
            b4.c(fVar2, rVarC3, mVar);
            u uVar = u.f22885a;
            if (((jf.d.c) x3Var.getF182175a()) instanceof jf.d.c.C1894d) {
                mVar.C(111703064);
                r rVarH2 = x2.h(x2.f(aVar2, 1.0f), f16);
                f5.k.f68985a.getClass();
                f5.k.a.b bVar2 = f5.k.a.f68993h;
                String strQ = gl1.y.Q(mVar, fVar.f121397c);
                f14 = f15;
                i14 = 0;
                y0.a(dVar, strQ, rVarH2, null, bVar2, 0.0f, null, mVar, 24960, 104);
                mVar.f();
                eVar = eVar3;
            } else {
                eVar = eVar3;
                i14 = 0;
                mVar.C(112204768);
                r rVarH3 = x2.h(x2.f(aVar2, 1.0f), f16);
                z0 z0VarD2 = q.d(h4.d.a.f81528f, false);
                int iHashCode4 = Long.hashCode(mVar.getU());
                i2 i2VarX4 = mVar.x();
                r rVarC4 = h4.k.c(rVarH3, mVar);
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar4);
                } else {
                    mVar.c();
                }
                b4.c(eVar2, z0VarD2, mVar);
                b4.c(c1623g, i2VarX4, mVar);
                if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode4))) {
                    v.h.z(iHashCode4, mVar, iHashCode4, bVar);
                }
                b4.c(fVar2, rVarC4, mVar);
                f14 = f15;
                ua.a(0.0f, 0.0f, 0, 0, 61, d92.b.a(mVar).f().b(), 0L, null, mVar);
                mVar = mVar;
                mVar.y();
                mVar.f();
            }
            p3.m mVar2 = mVar;
            y0.a(n5.c.a(R.drawable.strength_training_icon, mVar, i14), null, x2.q(uVar.c(c2.l.C(aVar2, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), h4.d.a.f81530h), cVar.f97907f), null, null, 0.0f, null, mVar2, 48, 120);
            mVar2.y();
            r rVarA = c2.l.A(aVar2, f14, 0.0f, 2);
            String strG = sn.a.g(gl1.y.Q(mVar2, R.string.lbl_key_features));
            d92.b.f58624b.getClass();
            x0 x0Var = j92.f.f97933j;
            mh.c(strG, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
            r rVarA2 = c2.l.A(aVar2, f14, 0.0f, 2);
            mx1.e eVar4 = fVar.f121399e;
            int i15 = fVar.f121398d;
            j23.l lVar = fVar.f121401g;
            int i16 = lVar.f96797b;
            int i17 = lVar.f96796a;
            mVar2.C(-2118950959);
            StringBuilder sb3 = new StringBuilder();
            String str = fVar.f121395a;
            if (x.k(mx1.g.f121403a.f121395a, mx1.g.f121406d.f121395a, mx1.g.f121405c.f121395a, mx1.g.f121404b.f121395a).contains(str)) {
                mVar2.C(-1001468513);
                sb3.append(oi0.c.Z(gl1.y.P(R.string.lbl_stp_key_feature_1, new Object[]{Integer.valueOf(i15)}, mVar2)));
                sb3.append('\n');
                sb3.append(oi0.c.Z(gl1.y.Q(mVar2, R.string.lbl_stp_key_feature_2)));
                sb3.append('\n');
                sb3.append(oi0.c.Z(gl1.y.P(R.string.lbl_stp_key_feature_estimated_duration, new Object[]{gl1.y.P(R.string.range_of_days, new Object[]{Integer.valueOf(i17), Integer.valueOf(i16)}, mVar2)}, mVar2)));
                sb3.append('\n');
                if (eVar4 == null) {
                    mVar2.C(-1000726219);
                    mVar2.f();
                } else {
                    mVar2.C(-1000726218);
                    sb3.append(oi0.c.Z(gl1.y.P(R.string.lbl_stp_key_feature_4, new Object[]{Integer.valueOf(eVar4.f121393b)}, mVar2)));
                    mVar2.f();
                    Unit unit = Unit.INSTANCE;
                }
                mVar2.f();
            } else if (x.k(mx1.g.f121407e.f121395a, mx1.g.f121408f.f121395a).contains(str)) {
                mVar2.C(-1000442847);
                sb3.append(oi0.c.Z(gl1.y.P(R.string.lbl_plan_type_get_fit_key_feature_1, new Object[]{Integer.valueOf(i15)}, mVar2)));
                sb3.append('\n');
                sb3.append(oi0.c.Z(gl1.y.Q(mVar2, R.string.lbl_plan_type_get_fit_key_feature_2)));
                sb3.append('\n');
                sb3.append(oi0.c.Z(gl1.y.P(R.string.lbl_stp_key_feature_estimated_duration, new Object[]{gl1.y.P(R.string.range_of_days, new Object[]{Integer.valueOf(i17), Integer.valueOf(i16)}, mVar2)}, mVar2)));
                sb3.append('\n');
                mVar2.f();
            } else {
                mVar2.C(-999663290);
                mVar2.f();
                sb3.append("");
            }
            String string = sb3.toString();
            mVar2.f();
            mh.c(string, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar2), mVar2, 0, 0, 131068);
            mh.c(sn.a.g(gl1.y.Q(mVar2, R.string.common_how_it_works)), c2.l.A(aVar2, f14, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
            mh.c(gl1.y.Q(mVar2, R.string.lbl_stp_how_it_works_message), c2.l.A(aVar2, f14, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar2), mVar2, 0, 0, 131068);
            mVar2.y();
            f0.f110999a.d(0, 9, aVar, c2.l.C(c2.l.A(x2.f(aVar2, 1.0f), f14, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, eVar.f97921f, 5), gl1.y.Q(mVar2, R.string.lbl_setup_plan), mVar2, null, false);
            mVar2.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    private final Object b(Object obj, Object obj2) {
        xi1.d dVar = (xi1.d) this.f181521d;
        e23.a aVar = (e23.a) this.f181522e;
        x3 x3Var = (x3) this.f181519b;
        x3 x3Var2 = (x3) this.f181520c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean zR = mVar.r(dVar) | mVar.B(aVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new xi1.b(dVar, aVar, i14);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new xi1.b(dVar, aVar, i14);
                    mVar.K(objQ);
                }
            }
            c.w.a(0, 1, (e23.a) objQ, mVar, false);
            z02.d.a(((Boolean) x3Var.getF182175a()).booleanValue(), z3.f.c(76135089, new xi1.a(dVar, aVar), mVar), null, null, null, z3.f.c(72466357, new wb1.i(27, dVar, x3Var2), mVar), mVar, 196656, 28);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        wq1.b bVar = (wq1.b) this.f181521d;
        String str = (String) this.f181522e;
        p1 p1Var = (p1) this.f181519b;
        p1 p1Var2 = (p1) this.f181520c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            r rVarH = x2.h(x2.f(r.S, 1.0f), 290);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = c2.l.A(rVarH, j92.b.f97899b.f97920e, 0.0f, 2);
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new xq1.c(p1Var, i14);
                mVar.K(objQ);
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR = mVar.r(bVar) | mVar.B(str);
            Object objQ2 = mVar.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new wn2.f(bVar, str, p1Var2);
                mVar.K(objQ2);
            }
            p002j6.c.b(lVar, rVarA, (e23.l) objQ2, mVar, 6, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        jq1.i iVar = (jq1.i) this.f181521d;
        LocalDate localDate = (LocalDate) this.f181522e;
        LocalDate localDate2 = (LocalDate) this.f181519b;
        yd1.b bVar = (yd1.b) this.f181520c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            xq1.l.a(iVar, localDate, localDate2, bVar, mVar, jq1.i.f100018d);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0405  */
    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    /* JADX WARN: Code duplicated, block: B:175:0x0655  */
    /* JADX WARN: Code duplicated, block: B:19:0x0086  */
    /* JADX WARN: Code duplicated, block: B:213:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:304:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:317:0x0ba0  */
    /* JADX WARN: Code duplicated, block: B:340:0x0c75  */
    /* JADX WARN: Code duplicated, block: B:357:0x0cee  */
    /* JADX WARN: Code duplicated, block: B:67:0x0217  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar;
        Object obj3;
        i53.c cVarA;
        int i14 = this.f181518a;
        int i15 = 26;
        p3.m.a aVar = p3.m.f135153a;
        final int i16 = 2;
        boolean z14 = false;
        final int i17 = 1;
        Object obj4 = this.f181520c;
        Object obj5 = this.f181519b;
        Object obj6 = this.f181522e;
        Object obj7 = this.f181521d;
        switch (i14) {
            case 0:
                x21.c cVar = (x21.c) obj7;
                NutritionActivity.g gVar = (NutritionActivity.g) obj6;
                p1 p1Var = (p1) obj5;
                p1 p1Var2 = (p1) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    c22.x0.f23314a.getClass();
                    String strW = gl1.d.W(c22.x0.f23711xd);
                    boolean zR = mVar2.r(cVar) | mVar2.B(gVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        b bVar = new b(cVar, gVar, p1Var, p1Var2, 2);
                        mVar2.K(bVar);
                        objQ = bVar;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            b bVar2 = new b(cVar, gVar, p1Var, p1Var2, 2);
                            mVar2.K(bVar2);
                            objQ = bVar2;
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ, null, strW, mVar2, null);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                h0 h0Var = (h0) obj7;
                Context context = (Context) obj6;
                p1 p1Var3 = (p1) obj5;
                p1 p1Var4 = (p1) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    Map<o, List<z51.h>> map = ((w51.w) p1Var4.getF182175a()).f182449e;
                    if (map == null || !(!map.isEmpty()) || ((w51.w) p1Var4.getF182175a()).f182445a) {
                        mVar3.C(-1596546500);
                        mVar3.f();
                    } else {
                        mVar3.C(-1598037972);
                        i53.f fVarA = i53.a.a(new i3("SAVE_ALL", gl1.y.Q(mVar3, R.string.lbl_save_all), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new i3("DISCARD_ALL", gl1.y.Q(mVar3, R.string.lbl_discard_all), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        String strQ = gl1.y.Q(mVar3, R.string.lbl_more);
                        boolean zR2 = mVar3.r(h0Var) | mVar3.r(context) | mVar3.B(p1Var3);
                        Object objQ2 = mVar3.q();
                        if (zR2) {
                            objQ2 = new s0(h0Var, i15, context, p1Var3);
                            mVar3.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new s0(h0Var, i15, context, p1Var3);
                                mVar3.K(objQ2);
                            }
                        }
                        h3.a(null, null, fVarA, strQ, (e23.l) objQ2, mVar3, 560);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                h0 h0Var2 = (h0) obj7;
                p1 p1Var5 = (p1) obj5;
                Context context2 = (Context) obj6;
                w wVar = (w) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    if (((w51.w) p1Var5.getF182175a()).f182447c) {
                        mVar4.C(-1284176839);
                        boolean zR3 = mVar4.r(h0Var2);
                        Object objQ3 = mVar4.q();
                        if (zR3) {
                            objQ3 = new w51.l(h0Var2, 1);
                            mVar4.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new w51.l(h0Var2, 1);
                                mVar4.K(objQ3);
                            }
                        }
                        w51.x0.a(0, (e23.a) objQ3, null, mVar4);
                        mVar4.f();
                    } else {
                        mVar4.C(-1284007610);
                        Map<o, List<z51.h>> map2 = ((w51.w) p1Var5.getF182175a()).f182449e;
                        if (map2 == null || !map2.isEmpty() || ((w51.w) p1Var5.getF182175a()).f182445a) {
                            mVar4.C(-1283479618);
                            r rVarD = x2.d(r.S, 1.0f);
                            boolean zB = mVar4.B(p1Var5) | mVar4.r(h0Var2) | mVar4.r(context2) | mVar4.B(wVar);
                            Object objQ4 = mVar4.q();
                            if (zB) {
                                t42.l lVar = new t42.l(p1Var5, h0Var2, context2, wVar, 25);
                                mVar4.K(lVar);
                                objQ4 = lVar;
                            } else {
                                aVar.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    t42.l lVar2 = new t42.l(p1Var5, h0Var2, context2, wVar, 25);
                                    mVar4.K(lVar2);
                                    objQ4 = lVar2;
                                }
                            }
                            mVar = mVar4;
                            e2.c.b(rVarD, null, null, null, null, null, false, null, (e23.l) objQ4, mVar, 6, 510);
                            mVar.f();
                        } else {
                            mVar4.C(-1283935597);
                            r.a aVar2 = r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            r rVarC = c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                            s62.a.f157643a.getClass();
                            b82.n.c(u62.a.a(t62.a.f162797a), gl1.y.Q(mVar4, R.string.lbl_you_are_all_caught_up), gl1.y.Q(mVar4, R.string.msg_device_automatically_detects_activities), rVarC, null, mVar4, 0, 16);
                            mVar4.f();
                            mVar = mVar4;
                        }
                        mVar.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                w70.e.g((String) obj7, (o70.f) obj6, (LinkedHashMap) obj5, (p) obj4, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                w91.x.a((ba1.d) obj7, (q91.g) obj6, (q91.d) obj5, (m0) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                Map map3 = (Map) obj7;
                List list = (List) obj6;
                lc.y yVar = (lc.y) obj4;
                p1 p1Var6 = (p1) obj5;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    Map map4 = (Map) p1Var6.getF182175a();
                    Object objQ5 = mVar5.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ5 == c2565a) {
                        objQ5 = new vd0.d(p1Var6, 20);
                        mVar5.K(objQ5);
                    }
                    e23.l lVar3 = (e23.l) objQ5;
                    boolean zR4 = mVar5.r(yVar);
                    Object objQ6 = mVar5.q();
                    if (zR4 || objQ6 == c2565a) {
                        objQ6 = new c42.o(yVar, 11);
                        mVar5.K(objQ6);
                    }
                    wb1.j.a(null, map3, list, map4, lVar3, (e23.l) objQ6, mVar5, 24576);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.running_economy.presentation.b.a((we1.d) obj7, (lc.y) obj6, (e23.a) obj5, (Boolean) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                lc.y yVar2 = (lc.y) obj7;
                we1.d dVar = (we1.d) obj6;
                p1 p1Var7 = (p1) obj5;
                yd1.a aVar3 = (yd1.a) obj4;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    r.a aVar4 = r.S;
                    r rVarE = u1.n.e(x2.d(aVar4, 1.0f), vb.h.e(d92.b.f58623a, mVar6), m1.f128891a);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar5 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA = y.a(c2.j.f22694d, aVar5, mVar6, 48);
                    int iHashCode = Long.hashCode(mVar6.getU());
                    i2 i2VarX = mVar6.x();
                    r rVarC2 = h4.k.c(rVarE, mVar6);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar6);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar6);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar6.getT() || !s.g(mVar6.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar6, iHashCode, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar6);
                    b0 b0Var = b0.f22601a;
                    af1.d.a(yVar2, dVar, mVar6, 0);
                    d92.b.f58625c.getClass();
                    c2.l.f(c2.l.C(aVar4, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), mVar6);
                    Object objQ7 = mVar6.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    Object obj8 = objQ7;
                    if (objQ7 == c2565a2) {
                        i53.f fVarA2 = i53.a.a(o82.g.f130849b, o82.g.f130853f, o82.g.f130854g, o82.g.f130856i);
                        mVar6.K(fVarA2);
                        obj8 = fVarA2;
                    }
                    i53.f fVar = (i53.f) obj8;
                    Object objQ8 = mVar6.q();
                    if (objQ8 == c2565a2) {
                        n82.f.a aVar7 = new n82.f.a((o82.g) fVar.get(0), null, null, 6, null);
                        mVar6.K(aVar7);
                        objQ8 = aVar7;
                    }
                    n82.f fVarA3 = n82.j.a((n82.f.a) objQ8, null, mVar6, 2);
                    n82.b bVar4 = fVarA3.f124961b;
                    i53.c cVarE = i53.a.e(o2.b(fVar, mVar6));
                    T f182175a = p1Var7.getF182175a();
                    Boolean bool = Boolean.TRUE;
                    int iIndexOf = s.g(f182175a, bool) ? 1 : fVar.indexOf(bVar4.a());
                    boolean zB2 = mVar6.B(fVarA3);
                    Object objQ9 = mVar6.q();
                    Object obj9 = objQ9;
                    if (zB2 || objQ9 == c2565a2) {
                        a42.f0 f0Var = new a42.f0(fVarA3, fVar, 15);
                        mVar6.K(f0Var);
                        obj9 = f0Var;
                    }
                    t82.c.a(cVarE, null, iIndexOf, 0.0f, (e23.l) obj9, mVar6, 3072, 18);
                    if (bVar4.a() != o82.g.f130849b) {
                        mVar6.C(-1386931818);
                        q82.a.a(x2.f(aVar4, 1.0f), new n82.n(fVarA3, aVar3), null, mVar6, 6, 4);
                        mVar6.f();
                    } else {
                        mVar6.C(-1386704061);
                        mVar6.f();
                    }
                    if (s.g(p1Var7.getF182175a(), bool)) {
                        fVarA3.d(o82.g.f130853f);
                    }
                    p1Var7.setValue(Boolean.FALSE);
                    n82.c.a(b0Var.a(aVar4, 1.0f, true), fVarA3, 3, false, z3.f.c(554966621, new we1.a(dVar, 0), mVar6), mVar6, 24960, 8);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                wg2.m.a((r) obj7, (String) obj6, (e23.a) obj5, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                i53.c<in0.h> cVar2 = (i53.c) obj7;
                in0.g gVar2 = (in0.g) obj6;
                un0.a aVar8 = (un0.a) obj5;
                e23.l lVar4 = (e23.l) obj4;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    for (in0.h hVar : cVar2) {
                        if (hVar.f94447b == null) {
                            mVar7.C(-815741909);
                            in0.m mVar8 = hVar.f94446a;
                            boolean z15 = hVar.f94449d;
                            boolean zB3 = mVar7.B(lVar4) | mVar7.r(hVar);
                            Object objQ10 = mVar7.q();
                            if (zB3) {
                                vv0.n nVar = new vv0.n(24, lVar4, hVar);
                                mVar7.K(nVar);
                                obj3 = nVar;
                            } else {
                                aVar.getClass();
                                if (objQ10 == p3.m.a.f135155b) {
                                    vv0.n nVar2 = new vv0.n(24, lVar4, hVar);
                                    mVar7.K(nVar2);
                                    obj3 = nVar2;
                                } else {
                                    obj3 = objQ10;
                                }
                            }
                            wn0.g.o(mVar8, z15, gVar2, aVar8, (e23.a) obj3, mVar7, un0.a.f172042b << 9);
                            mVar7.f();
                        } else {
                            mVar7.C(-815350782);
                            mVar7.f();
                        }
                    }
                    x1 x1Var7 = n.f135158a;
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 10:
                in0.m mVar9 = (in0.m) obj;
                in0.h.a aVar9 = (in0.h.a) obj2;
                mVar9.getClass();
                aVar9.getClass();
                ((wn0.l) obj7).x4(mVar9, (o) obj6, aVar9);
                ge1.b.T((o53.b0) obj5, null, null, new wn0.e((mc) obj4, null), 3);
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                wv0.u.a((mc) obj7, (String) obj6, (e23.a) obj5, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                wv0.w.a((pv0.w) obj7, (mc) obj6, (e23.l) obj5, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                mx1.c cVar3 = (mx1.c) obj7;
                e23.a aVar10 = (e23.a) obj6;
                i53.c<mx1.c> cVar4 = (i53.c) obj5;
                e23.l lVar5 = (e23.l) obj4;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    r.a aVar11 = r.S;
                    r rVarD2 = x2.d(aVar11, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(kVar, h4.d.a.f81536n, mVar10, 0);
                    int iHashCode2 = Long.hashCode(mVar10.getU());
                    i2 i2VarX2 = mVar10.x();
                    r rVarC3 = h4.k.c(rVarD2, mVar10);
                    h5.g.V.getClass();
                    e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar12);
                    } else {
                        mVar10.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA2, mVar10);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar10);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar10.getT() || !s.g(mVar10.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar10, iHashCode2, bVar5);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC3, mVar10);
                    r rVarB = a2.b(b0.f22601a.a(aVar11, 1.0f, true), a2.a(mVar10), true);
                    z zVarA3 = y.a(kVar, h4.d.a.f81537o, mVar10, 48);
                    int iHashCode3 = Long.hashCode(mVar10.getU());
                    i2 i2VarX3 = mVar10.x();
                    r rVarC4 = h4.k.c(rVarB, mVar10);
                    if (mVar10.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar12);
                    } else {
                        mVar10.c();
                    }
                    b4.c(eVar, zVarA3, mVar10);
                    b4.c(c1623g, i2VarX3, mVar10);
                    if (mVar10.getT() || !s.g(mVar10.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar10, iHashCode3, bVar5);
                    }
                    b4.c(fVar2, rVarC4, mVar10);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarY = c2.l.y(aVar11, j92.b.f97899b.f97921f);
                    String strQ2 = gl1.y.Q(mVar10, R.string.lbl_stp_choose_equipment_message);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar10);
                    d6.h.f57752b.getClass();
                    mh.c(strQ2, rVarY, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar10, 0, 0, 130044);
                    mVar10.C(-519610675);
                    for (mx1.c cVar5 : cVar4) {
                        String strQ3 = gl1.y.Q(mVar10, cVar5.f121375c);
                        boolean z16 = cVar3 == cVar5;
                        boolean zB4 = mVar10.B(lVar5) | mVar10.k(cVar5.ordinal());
                        Object objQ11 = mVar10.q();
                        if (zB4) {
                            objQ11 = new w02.b(22, lVar5, cVar5);
                            mVar10.K(objQ11);
                        } else {
                            aVar.getClass();
                            if (objQ11 == p3.m.a.f135155b) {
                                objQ11 = new w02.b(22, lVar5, cVar5);
                                mVar10.K(objQ11);
                            }
                        }
                        qx1.m.a(strQ3, z16, null, false, null, false, false, (e23.l) objQ11, mVar10, 0, 124);
                    }
                    mVar10.f();
                    mVar10.y();
                    f0 f0Var2 = f0.f110999a;
                    r rVarF = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    f0Var2.d(0, 1, aVar10, c2.l.C(c2.l.A(rVarF, eVar2.f97920e, 0.0f, 2), 0.0f, eVar2.f97920e, 0.0f, eVar2.f97921f, 5), gl1.y.Q(mVar10, R.string.lbl_next), mVar10, null, cVar3 != null);
                    mVar10.y();
                    x1 x1Var9 = n.f135158a;
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                wx1.q.a((dy1.p) obj7, (e23.l) obj6, (e23.a) obj5, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                return a(obj, obj2);
            case 16:
                ((Integer) obj2).getClass();
                t.a((mx1.f) obj7, (e23.a) obj6, (e23.a) obj5, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                mx1.d dVar2 = (mx1.d) obj7;
                e23.a aVar13 = (e23.a) obj6;
                i53.c<mx1.d> cVar6 = (i53.c) obj5;
                e23.l lVar6 = (e23.l) obj4;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    r.a aVar14 = r.S;
                    r rVarD3 = x2.d(aVar14, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA4 = y.a(kVar2, h4.d.a.f81536n, mVar11, 0);
                    int iHashCode4 = Long.hashCode(mVar11.getU());
                    i2 i2VarX4 = mVar11.x();
                    r rVarC5 = h4.k.c(rVarD3, mVar11);
                    h5.g.V.getClass();
                    e0.a aVar15 = h5.g.a.f81805b;
                    if (mVar11.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar15);
                    } else {
                        mVar11.c();
                    }
                    h5.g.a.e eVar3 = h5.g.a.f81810g;
                    b4.c(eVar3, zVarA4, mVar11);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX4, mVar11);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar11.getT() || !s.g(mVar11.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar11, iHashCode4, bVar6);
                    }
                    h5.g.a.f fVar3 = h5.g.a.f81807d;
                    b4.c(fVar3, rVarC5, mVar11);
                    r rVarB2 = a2.b(b0.f22601a.a(aVar14, 1.0f, true), a2.a(mVar11), true);
                    z zVarA5 = y.a(kVar2, h4.d.a.f81537o, mVar11, 48);
                    int iHashCode5 = Long.hashCode(mVar11.getU());
                    i2 i2VarX5 = mVar11.x();
                    r rVarC6 = h4.k.c(rVarB2, mVar11);
                    if (mVar11.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar15);
                    } else {
                        mVar11.c();
                    }
                    b4.c(eVar3, zVarA5, mVar11);
                    b4.c(c1623g2, i2VarX5, mVar11);
                    if (mVar11.getT() || !s.g(mVar11.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar11, iHashCode5, bVar6);
                    }
                    b4.c(fVar3, rVarC6, mVar11);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarY2 = c2.l.y(aVar14, j92.b.f97899b.f97921f);
                    String strQ4 = gl1.y.Q(mVar11, R.string.lbl_stp_set_your_goals_message);
                    d92.b.f58624b.getClass();
                    x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar11);
                    d6.h.f57752b.getClass();
                    mh.c(strQ4, rVarY2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar11, 0, 0, 130044);
                    mVar11.C(36774173);
                    for (mx1.d dVar3 : cVar6) {
                        String strQ5 = gl1.y.Q(mVar11, dVar3.f121382a);
                        String strQ6 = gl1.y.Q(mVar11, dVar3.f121383b);
                        boolean z17 = dVar2 == dVar3;
                        boolean zB5 = mVar11.B(lVar6) | mVar11.k(dVar3.ordinal());
                        Object objQ12 = mVar11.q();
                        if (zB5) {
                            objQ12 = new w02.b(24, lVar6, dVar3);
                            mVar11.K(objQ12);
                        } else {
                            aVar.getClass();
                            if (objQ12 == p3.m.a.f135155b) {
                                objQ12 = new w02.b(24, lVar6, dVar3);
                                mVar11.K(objQ12);
                            }
                        }
                        qx1.m.a(strQ5, z17, null, false, strQ6, false, false, (e23.l) objQ12, mVar11, 0, 108);
                    }
                    mVar11.f();
                    mVar11.y();
                    f0 f0Var3 = f0.f110999a;
                    r rVarF2 = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    f0Var3.d(0, 1, aVar13, c2.l.C(c2.l.A(rVarF2, eVar4.f97920e, 0.0f, 2), 0.0f, eVar4.f97920e, 0.0f, eVar4.f97921f, 5), gl1.y.Q(mVar11, R.string.lbl_next), mVar11, null, dVar2 != null);
                    mVar11.y();
                    x1 x1Var11 = n.f135158a;
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                x70.d.a((r70.z) obj7, (e23.a) obj6, (e23.a) obj5, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                x72.a.a((x72.e) obj7, (d92.a) obj6, (d92.a) obj5, (p) obj4, (p3.m) obj, p0.t(3073));
                return Unit.INSTANCE;
            case 20:
                aa1.a aVar16 = (aa1.a) obj7;
                e23.a aVar17 = (e23.a) obj6;
                e23.a aVar18 = (e23.a) obj4;
                p1 p1Var8 = (p1) obj5;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    String str = aVar16.f2221d;
                    if (((Boolean) p1Var8.getF182175a()).booleanValue()) {
                        mVar12.C(1932278089);
                        mVar12.f();
                        cVarA = j53.l.b();
                    } else {
                        mVar12.C(1932343592);
                        cVarA = i53.a.a(new i3("MENU_HELP", gl1.y.Q(mVar12, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        mVar12.f();
                    }
                    i53.c cVar7 = cVarA;
                    boolean zB6 = mVar12.B(aVar18);
                    Object objQ13 = mVar12.q();
                    if (zB6) {
                        objQ13 = new rx1.m(aVar18, i15);
                        mVar12.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            objQ13 = new rx1.m(aVar18, i15);
                            mVar12.K(objQ13);
                        }
                    }
                    z02.f.d(str, null, null, aVar17, cVar7, null, (e23.l) objQ13, mVar12, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                x91.l.a((aa1.b) obj7, (fe) obj6, (e23.l) obj5, (e23.a) obj4, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                xa0.a.a((String) obj7, (n90.b) obj6, (r1) obj5, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                h82.r rVar = (h82.r) obj7;
                String str2 = (String) obj6;
                e23.l lVar7 = (e23.l) obj5;
                e23.l lVar8 = (e23.l) obj4;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i18 = xa1.b0.f189732f;
                if (mVar13.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    rVar.t(R.string.about_power_guide_help_paragraph_heading1, mVar13, 0);
                    rVar.y(str2, null, null, i53.a.a(lVar7, lVar8), mVar13, 0, 6);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                xe1.d.a((List) obj7, (Float) obj6, (Float) obj5, (Float) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                return b(obj, obj2);
            case 26:
                ((Integer) obj2).getClass();
                w13.b.b((String) obj7, (mc) obj6, (e23.a) obj5, (z3.e) obj4, (p3.m) obj, p0.t(3073));
                return Unit.INSTANCE;
            case 27:
                return c(obj, obj2);
            case 28:
                return d(obj, obj2);
            default:
                final xr.c cVar8 = (xr.c) obj7;
                d2 d2Var = (d2) obj6;
                x3 x3Var = (x3) obj5;
                x3 x3Var2 = (x3) obj4;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i19 = xr.c.f191947e;
                if (mVar14.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    nr.t.g gVar3 = (nr.t.g) x3Var.getF182175a();
                    bs.b bVar7 = cVar8.f191950c;
                    nr.y yVar3 = (nr.y) x3Var2.getF182175a();
                    boolean zR5 = mVar14.r(cVar8);
                    Object objQ14 = mVar14.q();
                    if (zR5) {
                        final boolean z18 = z14 ? 1 : 0;
                        objQ14 = new e23.l() { // from class: xr.b
                            @Override // e23.l
                            public final Object invoke(Object obj10) {
                                Object value;
                                ArrayList arrayList;
                                wg0.l lVar9;
                                int i24 = z18;
                                c cVar9 = cVar8;
                                switch (i24) {
                                    case 0:
                                        Boolean bool2 = (Boolean) obj10;
                                        bool2.getClass();
                                        int i25 = c.f191947e;
                                        cVar9.u6().f146557s2.k(null, bool2);
                                        break;
                                    case 1:
                                        int i26 = c.f191947e;
                                        cVar9.u6().P5((nr.y) obj10);
                                        break;
                                    default:
                                        int iIntValue12 = ((Integer) obj10).intValue();
                                        int i27 = c.f191947e;
                                        p2 p2Var = cVar9.u6().M1;
                                        do {
                                            value = p2Var.getValue();
                                            List<nr.g> list2 = ((nr.t.g) value).f127353a;
                                            arrayList = new ArrayList(p13.y.r(list2, 10));
                                            for (nr.g gVar4 : list2) {
                                                if ((gVar4 instanceof nr.g.l) && (lVar9 = ((nr.g.l) gVar4).f127084b) != null) {
                                                    lVar9.f185106e = iIntValue12;
                                                }
                                                arrayList.add(gVar4);
                                            }
                                        } while (!p2Var.b(value, new nr.t.g(arrayList)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar14.K(objQ14);
                    } else {
                        aVar.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            final int z19 = z14 ? 1 : 0;
                            objQ14 = new e23.l() { // from class: xr.b
                                @Override // e23.l
                                public final Object invoke(Object obj10) {
                                    Object value;
                                    ArrayList arrayList;
                                    wg0.l lVar9;
                                    int i24 = z19;
                                    c cVar9 = cVar8;
                                    switch (i24) {
                                        case 0:
                                            Boolean bool2 = (Boolean) obj10;
                                            bool2.getClass();
                                            int i25 = c.f191947e;
                                            cVar9.u6().f146557s2.k(null, bool2);
                                            break;
                                        case 1:
                                            int i26 = c.f191947e;
                                            cVar9.u6().P5((nr.y) obj10);
                                            break;
                                        default:
                                            int iIntValue12 = ((Integer) obj10).intValue();
                                            int i27 = c.f191947e;
                                            p2 p2Var = cVar9.u6().M1;
                                            do {
                                                value = p2Var.getValue();
                                                List<nr.g> list2 = ((nr.t.g) value).f127353a;
                                                arrayList = new ArrayList(p13.y.r(list2, 10));
                                                for (nr.g gVar4 : list2) {
                                                    if ((gVar4 instanceof nr.g.l) && (lVar9 = ((nr.g.l) gVar4).f127084b) != null) {
                                                        lVar9.f185106e = iIntValue12;
                                                    }
                                                    arrayList.add(gVar4);
                                                }
                                            } while (!p2Var.b(value, new nr.t.g(arrayList)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar14.K(objQ14);
                        }
                    }
                    e23.l lVar9 = (e23.l) objQ14;
                    boolean zR6 = mVar14.r(cVar8);
                    Object objQ15 = mVar14.q();
                    if (zR6) {
                        objQ15 = new e23.l() { // from class: xr.b
                            @Override // e23.l
                            public final Object invoke(Object obj10) {
                                Object value;
                                ArrayList arrayList;
                                wg0.l lVar10;
                                int i24 = i17;
                                c cVar9 = cVar8;
                                switch (i24) {
                                    case 0:
                                        Boolean bool2 = (Boolean) obj10;
                                        bool2.getClass();
                                        int i25 = c.f191947e;
                                        cVar9.u6().f146557s2.k(null, bool2);
                                        break;
                                    case 1:
                                        int i26 = c.f191947e;
                                        cVar9.u6().P5((nr.y) obj10);
                                        break;
                                    default:
                                        int iIntValue12 = ((Integer) obj10).intValue();
                                        int i27 = c.f191947e;
                                        p2 p2Var = cVar9.u6().M1;
                                        do {
                                            value = p2Var.getValue();
                                            List<nr.g> list2 = ((nr.t.g) value).f127353a;
                                            arrayList = new ArrayList(p13.y.r(list2, 10));
                                            for (nr.g gVar4 : list2) {
                                                if ((gVar4 instanceof nr.g.l) && (lVar10 = ((nr.g.l) gVar4).f127084b) != null) {
                                                    lVar10.f185106e = iIntValue12;
                                                }
                                                arrayList.add(gVar4);
                                            }
                                        } while (!p2Var.b(value, new nr.t.g(arrayList)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar14.K(objQ15);
                    } else {
                        aVar.getClass();
                        if (objQ15 == p3.m.a.f135155b) {
                            objQ15 = new e23.l() { // from class: xr.b
                                @Override // e23.l
                                public final Object invoke(Object obj10) {
                                    Object value;
                                    ArrayList arrayList;
                                    wg0.l lVar10;
                                    int i24 = i17;
                                    c cVar9 = cVar8;
                                    switch (i24) {
                                        case 0:
                                            Boolean bool2 = (Boolean) obj10;
                                            bool2.getClass();
                                            int i25 = c.f191947e;
                                            cVar9.u6().f146557s2.k(null, bool2);
                                            break;
                                        case 1:
                                            int i26 = c.f191947e;
                                            cVar9.u6().P5((nr.y) obj10);
                                            break;
                                        default:
                                            int iIntValue12 = ((Integer) obj10).intValue();
                                            int i27 = c.f191947e;
                                            p2 p2Var = cVar9.u6().M1;
                                            do {
                                                value = p2Var.getValue();
                                                List<nr.g> list2 = ((nr.t.g) value).f127353a;
                                                arrayList = new ArrayList(p13.y.r(list2, 10));
                                                for (nr.g gVar4 : list2) {
                                                    if ((gVar4 instanceof nr.g.l) && (lVar10 = ((nr.g.l) gVar4).f127084b) != null) {
                                                        lVar10.f185106e = iIntValue12;
                                                    }
                                                    arrayList.add(gVar4);
                                                }
                                            } while (!p2Var.b(value, new nr.t.g(arrayList)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar14.K(objQ15);
                        }
                    }
                    e23.l lVar10 = (e23.l) objQ15;
                    boolean zR7 = mVar14.r(cVar8);
                    Object objQ16 = mVar14.q();
                    if (zR7) {
                        objQ16 = new e23.l() { // from class: xr.b
                            @Override // e23.l
                            public final Object invoke(Object obj10) {
                                Object value;
                                ArrayList arrayList;
                                wg0.l lVar11;
                                int i24 = i16;
                                c cVar9 = cVar8;
                                switch (i24) {
                                    case 0:
                                        Boolean bool2 = (Boolean) obj10;
                                        bool2.getClass();
                                        int i25 = c.f191947e;
                                        cVar9.u6().f146557s2.k(null, bool2);
                                        break;
                                    case 1:
                                        int i26 = c.f191947e;
                                        cVar9.u6().P5((nr.y) obj10);
                                        break;
                                    default:
                                        int iIntValue12 = ((Integer) obj10).intValue();
                                        int i27 = c.f191947e;
                                        p2 p2Var = cVar9.u6().M1;
                                        do {
                                            value = p2Var.getValue();
                                            List<nr.g> list2 = ((nr.t.g) value).f127353a;
                                            arrayList = new ArrayList(p13.y.r(list2, 10));
                                            for (nr.g gVar4 : list2) {
                                                if ((gVar4 instanceof nr.g.l) && (lVar11 = ((nr.g.l) gVar4).f127084b) != null) {
                                                    lVar11.f185106e = iIntValue12;
                                                }
                                                arrayList.add(gVar4);
                                            }
                                        } while (!p2Var.b(value, new nr.t.g(arrayList)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar14.K(objQ16);
                    } else {
                        aVar.getClass();
                        if (objQ16 == p3.m.a.f135155b) {
                            objQ16 = new e23.l() { // from class: xr.b
                                @Override // e23.l
                                public final Object invoke(Object obj10) {
                                    Object value;
                                    ArrayList arrayList;
                                    wg0.l lVar11;
                                    int i24 = i16;
                                    c cVar9 = cVar8;
                                    switch (i24) {
                                        case 0:
                                            Boolean bool2 = (Boolean) obj10;
                                            bool2.getClass();
                                            int i25 = c.f191947e;
                                            cVar9.u6().f146557s2.k(null, bool2);
                                            break;
                                        case 1:
                                            int i26 = c.f191947e;
                                            cVar9.u6().P5((nr.y) obj10);
                                            break;
                                        default:
                                            int iIntValue12 = ((Integer) obj10).intValue();
                                            int i27 = c.f191947e;
                                            p2 p2Var = cVar9.u6().M1;
                                            do {
                                                value = p2Var.getValue();
                                                List<nr.g> list2 = ((nr.t.g) value).f127353a;
                                                arrayList = new ArrayList(p13.y.r(list2, 10));
                                                for (nr.g gVar4 : list2) {
                                                    if ((gVar4 instanceof nr.g.l) && (lVar11 = ((nr.g.l) gVar4).f127084b) != null) {
                                                        lVar11.f185106e = iIntValue12;
                                                    }
                                                    arrayList.add(gVar4);
                                                }
                                            } while (!p2Var.b(value, new nr.t.g(arrayList)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar14.K(objQ16);
                        }
                    }
                    xr.h.a(gVar3, bVar7, d2Var, yVar3, lVar9, lVar10, (e23.l) objQ16, mVar14, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i14, int i15) {
        this.f181518a = i15;
        this.f181521d = obj;
        this.f181522e = obj2;
        this.f181519b = obj3;
        this.f181520c = obj4;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, p1 p1Var, int i14) {
        this.f181518a = i14;
        this.f181521d = obj;
        this.f181522e = obj2;
        this.f181520c = obj3;
        this.f181519b = p1Var;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f181518a = i14;
        this.f181521d = obj;
        this.f181522e = obj2;
        this.f181519b = obj3;
        this.f181520c = obj4;
    }
}
