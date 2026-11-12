package m72;

import android.content.DialogInterface;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.b0;
import c2.n0;
import c2.n3;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.index.InviteByEmailActivity;
import g02.f1;
import g02.q;
import h4.r;
import h5.e0;
import i3.mh;
import i3.ve;
import mh1.w;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117126a;

    public /* synthetic */ o(int i14) {
        this.f117126a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f117126a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                mVar.C(970386504);
                x1 x1Var = p3.n.f135158a;
                n0 n0Var = n3.f22788a;
                n0 n0Var2 = new n0(0, 0, 0, 0);
                mVar.f();
                return n0Var2;
            case 1:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                m81.a aVar2 = m81.a.f117163a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new t81.a(new n81.a((r53.i) parametersHolder.elementAt(0, s0.f105811a.b(r53.i.class))));
            case 2:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                m81.a aVar3 = m81.a.f117163a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new s81.a((t81.a) parametersHolder2.elementAt(0, s0.f105811a.b(t81.a.class)));
            case 3:
                m81.b bVar = m81.b.f117165a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (j81.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, j81.a.class, new c83.h.a[0], null, null, null, 120);
            case 4:
                m81.b bVar2 = m81.b.f117165a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new l81.e();
            case 5:
                boolean z14 = false;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ma0.c cVar = ma0.c.f117613a;
                if ((iIntValue & 3) != 2) {
                    z14 = true;
                }
                if (mVar2.n(iIntValue & 1, z14)) {
                    x1 x1Var2 = p3.n.f135158a;
                    Object objQ = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new ll0.b(19);
                        mVar2.K(objQ);
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    Object objQ2 = mVar2.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new ll0.b(20);
                        mVar2.K(objQ2);
                    }
                    ma0.e.a(aVar4, (e23.a) objQ2, mVar2, 54);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 6:
                boolean z15 = false;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ma0.c cVar2 = ma0.c.f117613a;
                if ((iIntValue2 & 3) != 2) {
                    z15 = true;
                }
                if (mVar3.n(iIntValue2 & 1, z15)) {
                    x1 x1Var3 = p3.n.f135158a;
                    ve.a(x2.d(r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar3), 0L, 0.0f, 0.0f, null, ma0.c.f117615c, mVar3, 12582918, 122);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 7:
                boolean z16 = false;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ma0.d dVar = ma0.d.f117616a;
                if ((iIntValue3 & 3) != 2) {
                    z16 = true;
                }
                if (mVar4.n(iIntValue3 & 1, z16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    Object objQ3 = mVar4.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ3 == c2565a2) {
                        objQ3 = new m30.n(16);
                        mVar4.K(objQ3);
                    }
                    e23.l lVar = (e23.l) objQ3;
                    Object objQ4 = mVar4.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new ll0.b(21);
                        mVar4.K(objQ4);
                    }
                    ma0.g.a((e23.a) objQ4, lVar, mVar4, 54);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 8:
                boolean z17 = false;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ma0.d dVar2 = ma0.d.f117616a;
                if ((iIntValue4 & 3) != 2) {
                    z17 = true;
                }
                if (mVar5.n(iIntValue4 & 1, z17)) {
                    x1 x1Var5 = p3.n.f135158a;
                    ve.a(x2.d(r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar5), 0L, 0.0f, 0.0f, null, ma0.d.f117618c, mVar5, 12582918, 122);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                md0.a.a((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                md0.a.d((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                md0.a.e((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                md0.a.f((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                md0.a.b((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                md0.c cVar3 = md0.c.f117892a;
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    md0.e.a(mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                md0.c cVar4 = md0.c.f117892a;
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    r.a aVar5 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarF = x2.f(c2.l.y(aVar5, eVar.f97920e), 1.0f);
                    c2.j jVar = c2.j.f22691a;
                    float f14 = eVar.f97918c;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(iVarI, h4.d.a.f81536n, mVar7, 0);
                    int iHashCode = Long.hashCode(mVar7.getU());
                    i2 i2VarX = mVar7.x();
                    r rVarC = h4.k.c(rVarF, mVar7);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar6);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar7);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar7.getT() || !s.g(mVar7.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar7, iHashCode, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar7);
                    b0 b0Var = b0.f22601a;
                    f1.h(mVar7, 0);
                    f1.f(mVar7, 0);
                    f1.d(mVar7, 0);
                    f1.e(mVar7, 0);
                    f1.g(mVar7, 0);
                    f1.a(mVar7, 0);
                    f1.c(mVar7, 0);
                    f1.b(mVar7, 0);
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                md0.c cVar5 = md0.c.f117892a;
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    md0.i.a(mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                md0.c cVar6 = md0.c.f117892a;
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    q.a(mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                md0.c cVar7 = md0.c.f117892a;
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    md0.h.a(mVar10, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                md0.c cVar8 = md0.c.f117892a;
                if (mVar11.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    md0.a.a(mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                md0.e.a((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                md0.h.a((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                md0.i.a((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                me2.e eVar2 = (me2.e) obj2;
                me2.e.a aVar7 = me2.e.f118163c;
                ((d4.n) obj).getClass();
                eVar2.getClass();
                return eVar2.f98597a;
            case 24:
                boolean z18 = false;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                mh1.b bVar4 = mh1.b.f118457a;
                if ((iIntValue11 & 3) != 2) {
                    z18 = true;
                }
                if (mVar12.n(iIntValue11 & 1, z18)) {
                    x1 x1Var12 = p3.n.f135158a;
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                mh1.b bVar5 = mh1.b.f118457a;
                if (mVar13.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    mVar13.L(-1614864554);
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar13);
                    if (viewModelStoreOwnerA == null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(w.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar13, 0), null);
                    mVar13.R();
                    w wVar = (w) u1VarResolveViewModel;
                    com.garmin.android.apps.connectmobile.userprofile.model.g gVar = new com.garmin.android.apps.connectmobile.userprofile.model.g(1245L, "Ana Smith", null, null, null, 28, null);
                    Object objQ5 = mVar13.q();
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new ll0.b(28);
                        mVar13.K(objQ5);
                    }
                    mh1.h.b(wVar, gVar, 121341L, "Index", (e23.a) objQ5, mVar13, (com.garmin.android.apps.connectmobile.userprofile.model.g.f46856f << 3) | 28032);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 26:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                InviteByEmailActivity.a aVar8 = InviteByEmailActivity.f43034c;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 27:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                InviteByEmailActivity.a aVar9 = InviteByEmailActivity.f43034c;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 28:
                boolean z19 = false;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                mk1.a aVar10 = mk1.a.f119141a;
                if ((iIntValue13 & 3) != 2) {
                    z19 = true;
                }
                if (mVar14.n(iIntValue13 & 1, z19)) {
                    x1 x1Var14 = p3.n.f135158a;
                    r.a aVar11 = r.S;
                    h4.d.f81522a.getClass();
                    r rVarX = x2.x(aVar11, h4.d.a.f81533k, 2);
                    s62.a.f157643a.getClass();
                    b82.n.c(v62.l.a(t62.b.f162798a), gl1.y.Q(mVar14, R.string.lbl_third_party_not_supported), gl1.y.Q(mVar14, R.string.msg_third_party_not_supported), rVarX, null, mVar14, 3072, 16);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ml0.b bVar6 = ml0.b.f119197a;
                if (mVar15.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar15, R.string.lbl_search);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, com.nimbusds.jose.shaded.gson.internal.a.x(mVar15), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar15), mVar15, 0, 0, 131066);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ o(int i14, int i15) {
        this.f117126a = i15;
    }
}
