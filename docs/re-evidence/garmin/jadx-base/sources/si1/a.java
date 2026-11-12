package si1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.model.MccItem;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import ds.e0;
import f72.l1;
import f72.s9;
import gg1.o0;
import gl1.y;
import i3.e9;
import i3.i7;
import i3.mh;
import i3.ve;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.List;
import n70.k7;
import o4.d0;
import o4.m1;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.t0;
import p13.x;
import p3.p0;
import p3.p1;
import p3.x1;
import sk0.b1;
import sk0.e1;
import sk0.h0;
import sk0.i0;
import sk0.j0;
import sk0.k0;
import sk0.n0;
import sk0.y0;
import v62.d3;
import v62.s6;
import yc.t2;
import yc.u2;
import yt0.f1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159363a;

    public /* synthetic */ a(int i14) {
        this.f159363a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f159363a;
        int i15 = 11;
        int i16 = 14;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                b bVar = b.f159364a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                b bVar2 = b.f159364a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    Object objQ = mVar2.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new sd.o(10);
                        mVar2.K(objQ);
                    }
                    h.a(false, (e23.a) objQ, b.f159366c, mVar2, 438);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                c cVar = c.f159367a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = d3.a(t62.b.f162798a);
                    String strQ = y.Q(mVar3, R.string.device_settings_inreach_plan_manage_subscription);
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar3);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, strQ, x2.q(aVar2, j92.b.f97901d.f97904c), jA, mVar3, 0, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                c cVar2 = c.f159367a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = s9.a(t62.c.f162799a);
                    long jB = e0.b(d92.b.f58623a, mVar4);
                    h4.r rVarE = u1.n.e(l4.k.b(h4.r.S, k2.i.f102406a), d0.c(0.14f, d92.b.a(mVar4).f().f63509d, 14), m1.f128891a);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA2, null, c2.l.y(x2.q(rVarE, j92.b.f97901d.f97906e), j92.b.f97899b.f97918c), jB, mVar4, 48, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                c cVar3 = c.f159367a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    Object objQ2 = mVar5.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new sd.o(11);
                        mVar5.K(objQ2);
                    }
                    q.b(48, 1, (e23.a) objQ2, null, mVar5);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                c cVar4 = c.f159367a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    ve.a(x2.d(h4.r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar6), 0L, 0.0f, 0.0f, null, c.f159370d, mVar6, 12582918, 122);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                j.g((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                j.f((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                sj1.a.C3020a c3020a = sj1.a.f159441a;
                return Integer.valueOf(p005kotlin.jvm.internal.s.h(((MccItem) obj).getMcc(), ((MccItem) obj2).getMcc()));
            case 9:
                ((Integer) obj2).getClass();
                sk0.g.d((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                sk0.p.e((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                h0 h0Var = h0.f159674a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    sk0.p.e(mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                h0 h0Var2 = h0.f159674a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    String str = NumberFormat.getIntegerInstance().format((Object) 999999);
                    str.getClass();
                    sk0.p.f(y.P(R.string.value_unit, new Object[]{str, y.Q(mVar8, R.string.lbl_hours)}, mVar8), mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                h0 h0Var3 = h0.f159674a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    Object objQ3 = mVar9.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new h0.a();
                        mVar9.K(objQ3);
                    }
                    h0.a aVar3 = (h0.a) objQ3;
                    Object objQ4 = mVar9.q();
                    if (objQ4 == c2565a) {
                        c80.u uVar = c80.u.f25597f;
                        n0 n0Var = new n0(uVar, null, null, null, g22.l.d(b63.o.INSTANCE), c80.w.Distance, sk0.p.h(uVar, o0.STATUTE_US), null, sk0.p.i(), j53.l.b(), false, null, j53.l.b());
                        mVar9.K(n0Var);
                        objQ4 = n0Var;
                    }
                    n0 n0Var2 = (n0) objQ4;
                    o0 o0Var = o0.STATUTE_US;
                    Object objQ5 = mVar9.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new a(i16);
                        mVar9.K(objQ5);
                    }
                    e23.p pVar = (e23.p) objQ5;
                    Object objQ6 = mVar9.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new se0.a(19);
                        mVar9.K(objQ6);
                    }
                    e23.l lVar = (e23.l) objQ6;
                    Object objQ7 = mVar9.q();
                    if (objQ7 == c2565a) {
                        objQ7 = new s50.b(i15);
                        mVar9.K(objQ7);
                    }
                    e23.q qVar = (e23.q) objQ7;
                    Object objQ8 = mVar9.q();
                    if (objQ8 == c2565a) {
                        objQ8 = new s50.b(12);
                        mVar9.K(objQ8);
                    }
                    e23.q qVar2 = (e23.q) objQ8;
                    Object objQ9 = mVar9.q();
                    if (objQ9 == c2565a) {
                        objQ9 = new se0.a(20);
                        mVar9.K(objQ9);
                    }
                    e23.l lVar2 = (e23.l) objQ9;
                    Object objQ10 = mVar9.q();
                    if (objQ10 == c2565a) {
                        objQ10 = new se0.a(21);
                        mVar9.K(objQ10);
                    }
                    e23.l lVar3 = (e23.l) objQ10;
                    Object objQ11 = mVar9.q();
                    if (objQ11 == c2565a) {
                        objQ11 = new a(15);
                        mVar9.K(objQ11);
                    }
                    e23.p pVar2 = (e23.p) objQ11;
                    Object objQ12 = mVar9.q();
                    if (objQ12 == c2565a) {
                        objQ12 = new sd.o(28);
                        mVar9.K(objQ12);
                    }
                    sk0.p.b("Preview Title", n0Var2, aVar3, o0Var, true, null, null, pVar, lVar, qVar, qVar2, lVar2, lVar3, pVar2, (e23.a) objQ12, mVar9, 918580230, 28086, 96);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 14:
                h0 h0Var4 = h0.f159674a;
                ((List) obj).getClass();
                ((qk0.c) obj2).getClass();
                return Unit.INSTANCE;
            case 15:
                h0 h0Var5 = h0.f159674a;
                ((n0) obj).getClass();
                ((List) obj2).getClass();
                return Unit.INSTANCE;
            case 16:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                j0 j0Var = j0.f159697a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    String strQ2 = y.Q(mVar10, R.string.lbl_gear_add);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar10), mVar10, 0, 0, 131070);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                j0 j0Var2 = j0.f159697a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(s6.a(t62.b.f162798a), null, null, e0.b(d92.b.f58623a, mVar11), mVar11, 48, 4);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                j0 j0Var3 = j0.f159697a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    String strQ3 = y.Q(mVar12, R.string.add_gear_collection);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar12), mVar12, 0, 0, 131070);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                j0 j0Var4 = j0.f159697a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(l1.a(t62.c.f162799a), null, null, e0.b(d92.b.f58623a, mVar13), mVar13, 48, 4);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                j0 j0Var5 = j0.f159697a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    Object objQ13 = mVar14.q();
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        w13.c cVar5 = b1.b.f159631e;
                        int iA = t0.a(p13.y.r(cVar5, 10));
                        if (iA < 16) {
                            iA = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                        for (Object obj3 : cVar5) {
                            b1.b bVar3 = (b1.b) obj3;
                            List listK = x.k(y0.e("0", bVar3), y0.e(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, bVar3), y0.e("2", bVar3), y0.e("3", bVar3));
                            listK.getClass();
                            linkedHashMap.put(obj3, new t2(new u2(10, 0, false, 0, 0, 0, 62, null), null, new ad.b(listK, false ? 1 : 0), 2, null).f196485a);
                        }
                        j0.a aVar4 = new j0.a(i53.a.k(linkedHashMap));
                        mVar14.K(aVar4);
                        objQ13 = aVar4;
                    }
                    j0.a aVar5 = (j0.a) objQ13;
                    o0 o0Var2 = o0.STATUTE_US;
                    Object objQ14 = mVar14.q();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ14 == c2565a2) {
                        objQ14 = new sd.o(29);
                        mVar14.K(objQ14);
                    }
                    e23.a aVar6 = (e23.a) objQ14;
                    Object objQ15 = mVar14.q();
                    if (objQ15 == c2565a2) {
                        objQ15 = new se0.a(22);
                        mVar14.K(objQ15);
                    }
                    e23.l lVar4 = (e23.l) objQ15;
                    Object objQ16 = mVar14.q();
                    if (objQ16 == c2565a2) {
                        objQ16 = new se0.a(23);
                        mVar14.K(objQ16);
                    }
                    e23.l lVar5 = (e23.l) objQ16;
                    Object objQ17 = mVar14.q();
                    if (objQ17 == c2565a2) {
                        objQ17 = new i0(0);
                        mVar14.K(objQ17);
                    }
                    e23.a aVar7 = (e23.a) objQ17;
                    Object objQ18 = mVar14.q();
                    if (objQ18 == c2565a2) {
                        objQ18 = new i0(1);
                        mVar14.K(objQ18);
                    }
                    y0.d(aVar5, o0Var2, aVar6, lVar4, lVar5, aVar7, (e23.a) objQ18, mVar14, 1797552);
                    x1 x1Var15 = p3.n.f135158a;
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                k0 k0Var = k0.f159709a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    Object objQ19 = mVar15.q();
                    aVar.getClass();
                    if (objQ19 == p3.m.a.f135155b) {
                        objQ19 = new i0(2);
                        mVar15.K(objQ19);
                    }
                    e1.a((e23.a) objQ19, e9.f(true, null, mVar15, 6, 2), mVar15, 6);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 22:
                p1 p1Var = (p1) obj2;
                ((d4.n) obj).getClass();
                p1Var.getClass();
                return p13.h0.b1((Iterable) p1Var.getF182175a());
            case 23:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                sl.a aVar8 = sl.a.f159965a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    ul.c.a(mVar16, 0);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                sn0.e.c((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                Scope scope = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                st0.a aVar9 = st0.a.f160843a;
                scope.getClass();
                parametersHolder.getClass();
                p005kotlin.jvm.internal.t0 t0Var = s0.f105811a;
                return new xt0.a(new tt0.f((r53.i) parametersHolder.elementAt(0, t0Var.b(r53.i.class)), (yt0.i0) scope.get((k23.d<?>) t0Var.b(yt0.i0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)), new k7((f12.l) scope.get((k23.d<?>) t0Var.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
            case 26:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                st0.a aVar10 = st0.a.f160843a;
                scope2.getClass();
                parametersHolder2.getClass();
                p005kotlin.jvm.internal.t0 t0Var2 = s0.f105811a;
                return new wt0.h((xt0.a) parametersHolder2.elementAt(0, t0Var2.b(xt0.a.class)), (kt0.a) scope2.get((k23.d<?>) t0Var2.b(kt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 27:
                Scope scope3 = (Scope) obj;
                st0.c cVar6 = st0.c.f160846a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new pt0.e0((f1) scope3.get((k23.d<?>) s0.f105811a.b(f1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 28:
                Scope scope4 = (Scope) obj;
                st0.c cVar7 = st0.c.f160846a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new pt0.f((yt0.a) scope4.get((k23.d<?>) s0.f105811a.b(yt0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            default:
                st0.c cVar8 = st0.c.f160846a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (lt0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.a.class, new c83.h.a[0], null, null, null, 120);
        }
    }

    public /* synthetic */ a(int i14, int i15) {
        this.f159363a = i15;
    }
}
