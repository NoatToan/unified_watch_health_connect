package ky0;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import i3.i7;
import kotlin.t3;
import org.joda.time.DateTime;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p006l2.f3;
import p3.b4;
import p3.i2;
import v62.h6;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107218a;

    public /* synthetic */ c(int i14) {
        this.f107218a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = 17;
        switch (this.f107218a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                d dVar = d.f107246a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(aVar, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.u uVar = c2.u.f22885a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = u62.h1.a(t62.a.f162797a);
                    long jB = ds.e0.b(d92.b.f58623a, mVar);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, "", x2.q(aVar, j92.b.f97901d.f97905d), jB, mVar, 48, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                d dVar2 = d.f107246a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(aVar3, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    c2.u uVar2 = c2.u.f22885a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = v62.j1.a(t62.b.f162798a);
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar2);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA2, "", x2.q(aVar3, j92.b.f97901d.f97904c), jA, mVar2, 48, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                Scope scope = (Scope) obj;
                l12.a aVar5 = l12.a.f108324a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                f12.l.f68084a.getClass();
                oo1.b bVar3 = new oo1.b(f12.l.a.a());
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                return new com.garmin.android.apps.connectmobile.userprofile.presentation.d(bVar3, (m12.n) scope.get((k23.d<?>) t0Var.b(m12.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m12.d) scope.get((k23.d<?>) t0Var.b(m12.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m12.m) scope.get((k23.d<?>) t0Var.b(m12.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m12.v) scope.get((k23.d<?>) t0Var.b(m12.v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m12.y) scope.get((k23.d<?>) t0Var.b(m12.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m12.o) scope.get((k23.d<?>) t0Var.b(m12.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m12.a) scope.get((k23.d<?>) t0Var.b(m12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((k23.d<?>) t0Var.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 3:
                l12.a aVar6 = l12.a.f108324a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return k12.d.a.a(k12.d.f102315g);
            case 4:
                l12.a aVar7 = l12.a.f108324a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return k12.b.a.a(k12.b.f102303b);
            case 5:
                Scope scope2 = (Scope) obj;
                l12.a aVar8 = l12.a.f108324a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                return new m12.d((m12.r) scope2.get((k23.d<?>) t0Var2.b(m12.r.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (k12.a) scope2.get((k23.d<?>) t0Var2.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.d) scope2.get((k23.d<?>) t0Var2.b(ei0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 6:
                Scope scope3 = (Scope) obj;
                l12.a aVar9 = l12.a.f108324a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                k12.b bVar4 = (k12.b) scope3.get((k23.d<?>) t0Var3.b(k12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                k12.a aVar10 = (k12.a) scope3.get((k23.d<?>) t0Var3.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                f12.b bVar5 = (f12.b) scope3.get((k23.d<?>) t0Var3.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                f12.l.f68084a.getClass();
                return new m12.m(bVar4, aVar10, bVar5, f12.l.a.a());
            case 7:
                Scope scope4 = (Scope) obj;
                l12.a aVar11 = l12.a.f108324a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                return new m12.v((k12.a) scope4.get((k23.d<?>) t0Var4.b(k12.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m12.r) scope4.get((k23.d<?>) t0Var4.b(m12.r.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.d) scope4.get((k23.d<?>) t0Var4.b(ei0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 8:
                l12.a aVar12 = l12.a.f108324a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new m12.n();
            case 9:
                l12.a aVar13 = l12.a.f108324a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new m12.y();
            case 10:
                l12.a aVar14 = l12.a.f108324a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new m12.o();
            case 11:
                Scope scope5 = (Scope) obj;
                l12.a aVar15 = l12.a.f108324a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new m12.a((pu.h) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pu.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 6, null);
            case 12:
                f3 f3Var = (f3) obj2;
                return p13.x.k(Float.valueOf(f3Var.f108480a.getFloatValue()), Boolean.valueOf(((p008y1.b2) f3Var.f108485f.getF182175a()) == p008y1.b2.Vertical));
            case 13:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l21.c cVar = l21.c.f109076a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(v62.n1.a(t62.b.f162798a), gl1.y.Q(mVar3, R.string.lbl_cancel), null, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar3), mVar3, 0, 4);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l21.c cVar2 = l21.c.f109076a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar16 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = x2.q(aVar16, j92.b.f97901d.f97904c);
                    s62.a.f157643a.getClass();
                    t62.b.f162798a.getClass();
                    u4.d dVarA3 = a72.c.a(h6.f175899a);
                    c22.x0.f23314a.getClass();
                    i7.b(dVarA3, gl1.d.W(c22.x0.f23711xd), rVarQ, d92.b.a(mVar4).f().f63508c, mVar4, 0, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l21.c cVar3 = l21.c.f109076a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    Object objQ = mVar5.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    int i15 = 16;
                    if (objQ == c2565a) {
                        objQ = new l01.b(i15);
                        mVar5.K(objQ);
                    }
                    e23.a aVar17 = (e23.a) objQ;
                    mVar5.L(-1614864554);
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar5);
                    if (viewModelStoreOwnerA == null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(m21.g.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar5, 0), aVar17);
                    mVar5.R();
                    m21.g gVar = (m21.g) u1VarResolveViewModel;
                    v21.e eVar = new v21.e((Context) mVar5.A(AndroidCompositionLocals_androidKt.f6042b));
                    Object objQ2 = mVar5.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new fe();
                        mVar5.K(objQ2);
                    }
                    fe feVar = (fe) objQ2;
                    Object objQ3 = mVar5.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new c(i15);
                        mVar5.K(objQ3);
                    }
                    e23.p pVar = (e23.p) objQ3;
                    Object objQ4 = mVar5.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new l01.b(i14);
                        mVar5.K(objQ4);
                    }
                    e23.a aVar18 = (e23.a) objQ4;
                    Object objQ5 = mVar5.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new l01.b(18);
                        mVar5.K(objQ5);
                    }
                    l21.i.a(gVar, eVar, feVar, pVar, null, null, null, null, null, null, null, aVar18, null, (e23.a) objQ5, mVar5, 3456, 3120, 6128);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 16:
                ((Boolean) obj2).booleanValue();
                l21.c cVar4 = l21.c.f109076a;
                ((b11.a) obj).getClass();
                return Unit.INSTANCE;
            case 17:
                return Unit.INSTANCE;
            case 18:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l31.a aVar19 = l31.a.f109686a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1595804875, new kk1.h((t3) mVar6.A(kotlin.t1.f91501s), i14), mVar6), mVar6, 196608, 31);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l50.a aVar20 = l50.a.f110139a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.icon_back_arrow, mVar7, 0), gl1.y.Q(mVar7, R.string.common_button_back), null, 0L, mVar7, 0, 12);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                l51.k.a((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                l51.k.a((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 22:
                l52.r rVar = (l52.r) obj;
                l52.i.a aVar21 = (l52.i.a) obj2;
                Parcelable.Creator<l52.m<Parcelable>> creator = l52.m.CREATOR;
                rVar.getClass();
                aVar21.getClass();
                Parcelable data = aVar21.getData();
                int i16 = o13.q.f128596b;
                rVar.a(data);
                return Unit.INSTANCE;
            case 23:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                l60.a aVar22 = l60.a.f110526a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new p60.a(new m60.d((r53.i) parametersHolder.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(r53.i.class))));
            case 24:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                l60.a aVar23 = l60.a.f110526a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new o60.a((p60.a) parametersHolder2.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(p60.a.class)));
            case 25:
                l61.a aVar24 = l61.a.f110528a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (p61.b) ez0.b.a(ez0.b.f67468a, ez0.c.GC, p61.b.class, new c83.h.a[0], null, null, null, 120);
            case 26:
                Scope scope6 = (Scope) obj;
                l61.a aVar25 = l61.a.f110528a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                return new p61.e((p61.b) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(p61.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 27:
                Scope scope7 = (Scope) obj;
                l61.a aVar26 = l61.a.f110528a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                return new t61.r((p61.e) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(p61.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 28:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l71.a aVar27 = l71.a.f110840a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    h4.r rVarI = yz1.s.i(h4.r.S, ((g6.c) mVar8.A(kotlin.t1.f91490h)).getF69051c());
                    yz1.d dVar3 = new yz1.d(yz1.u.SUCCESS, null, false, 6, null);
                    com.garmin.android.apps.connectmobile.performance.model.b bVar6 = com.garmin.android.apps.connectmobile.performance.model.b.STRAINED;
                    String strB = c22.j0.b(DateTime.now(), "MMM d", null);
                    e71.k kVar = new e71.k();
                    i53.f fVarA = i53.a.a(new i71.y(0.1f, com.garmin.android.apps.connectmobile.performance.model.b.OVERREACHING), new i71.y(0.2f, com.garmin.android.apps.connectmobile.performance.model.b.PRODUCTIVE), new i71.y(0.4f, com.garmin.android.apps.connectmobile.performance.model.b.DETRAINING), new i71.y(0.1f, com.garmin.android.apps.connectmobile.performance.model.b.RECOVERY), new i71.y(0.2f, bVar6));
                    i41.h hVar = i41.h.f90944g;
                    x61.c.f189186c.getClass();
                    i71.x xVar = new i71.x(dVar3, bVar6, strB, kVar, fVarA, hVar, 1000, 25, x61.c.m.a("BALANCED").f189188b, Integer.valueOf(q71.a.GOOD.f143227a), gg1.o0.STATUTE_US, true, true, 2);
                    e71.m.a aVar28 = e71.m.f63320c;
                    l71.h.e(rVarI, xVar, mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                l71.a aVar29 = l71.a.f110840a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    l71.h.e(yz1.s.i(h4.r.S, ((g6.c) mVar9.A(kotlin.t1.f91490h)).getF69051c()), null, mVar9, 48);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(int i14, int i15) {
        this.f107218a = i15;
    }
}
