package q51;

import am.x0;
import android.content.DialogInterface;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.j1;
import androidx.lifecycle.viewmodel.CreationExtras;
import c2.n0;
import c2.n3;
import c2.x2;
import c80.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.model.MetricsMapDTO;
import com.garmin.android.library.mapsdkadapter.i;
import d53.w;
import e23.l;
import e23.p;
import gl1.y;
import h4.r;
import i3.i7;
import i3.ve;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.joda.time.DateTimeComparator;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p13.a1;
import p13.h0;
import p13.l0;
import p13.t0;
import p13.x;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;
import po2.o;
import q53.q;
import tn.k;
import u1.y0;
import v62.b3;
import v62.h7;
import vb.h;
import yq0.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142873a;

    public /* synthetic */ a(int i14) {
        this.f142873a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f142873a;
        m.a aVar = m.f135153a;
        float f14 = 2.0f;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                b bVar = b.f142874a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    t4.d dVarA = n5.c.a(R.drawable.run, mVar, 0);
                    long jA = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar);
                    r.a aVar2 = r.S;
                    d92.b.f58625c.getClass();
                    i7.a(dVarA, null, x2.q(aVar2, j92.b.f97901d.f97905d), jA, mVar, 48, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                b bVar2 = b.f142874a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    t4.d dVarA2 = n5.c.a(R.drawable.pacepro, mVar2, 0);
                    long jA2 = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar2);
                    r.a aVar3 = r.S;
                    d92.b.f58625c.getClass();
                    i7.a(dVarA2, null, x2.q(aVar3, j92.b.f97901d.f97905d), jA2, mVar2, 48, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                b bVar3 = b.f142874a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    t4.d dVarA3 = n5.c.a(R.drawable.plus, mVar3, 0);
                    d92.b.f58623a.getClass();
                    long jA3 = d92.b.a(mVar3).k().a();
                    r.a aVar4 = r.S;
                    d92.b.f58625c.getClass();
                    i7.a(dVarA3, null, x2.q(aVar4, j92.b.f97901d.f97905d), jA3, mVar3, 48, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                q62.a aVar5 = q62.a.f143171a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    i7.b(h7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_reorder), null, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar4), mVar4, 0, 4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                q62.a aVar6 = q62.a.f143171a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    z02.b.a(false, null, null, null, false, q62.a.f143172b, mVar5, 196608, 31);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                q72.a aVar7 = q72.a.f143248a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar6);
                    if (viewModelStoreOwnerA == null) {
                        h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    q72.h.g((q72.b) v9.b.a(s0.f105811a.b(q72.b.class), viewModelStoreOwnerA, null, null, viewModelStoreOwnerA instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, mVar6), mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                q72.a aVar8 = q72.a.f143248a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    x72.a.a(new x72.e(null, null, 0.0f, null, null, 31, null), null, null, q72.a.f143249b, mVar7, 3072);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                m mVar8 = (m) obj;
                ((Integer) obj2).getClass();
                mVar8.C(-1727886372);
                x1 x1Var8 = n.f135158a;
                n0 n0Var = n3.f22788a;
                n0 n0Var2 = new n0(0, 0, 0, 0);
                mVar8.f();
                return n0Var2;
            case 8:
                m mVar9 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                qb0.a aVar9 = qb0.a.f143954a;
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    o90.a aVar10 = new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (j) null);
                    Object objQ = mVar9.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new q(5);
                        mVar9.K(objQ);
                    }
                    e23.a aVar11 = (e23.a) objQ;
                    Object objQ2 = mVar9.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new o(28);
                        mVar9.K(objQ2);
                    }
                    l lVar = (l) objQ2;
                    Object objQ3 = mVar9.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new q(6);
                        mVar9.K(objQ3);
                    }
                    qb0.o.b("Venu 4", aVar10, false, aVar11, lVar, (e23.a) objQ3, mVar9, 224646);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                m mVar10 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                qb0.a aVar12 = qb0.a.f143954a;
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    ve.a(x2.d(r.S, 1.0f), null, k.a(d92.b.f58623a, mVar10), 0L, 0.0f, 0.0f, null, qb0.a.f143956c, mVar10, 12582918, 122);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                int i15 = qb1.e.f144043e;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 11:
                m mVar11 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                qk0.b bVar4 = qk0.b.f145078a;
                if (mVar11.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    Object objQ4 = mVar11.q();
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        List listK = x.k(x0.f4308n, x0.f4312o, x0.f4324r);
                        int iA = t0.a(p13.y.r(listK, 10));
                        if (iA < 16) {
                            iA = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                        for (Object obj3 : listK) {
                            x0 x0Var = (x0) obj3;
                            w13.c cVar = x0.H3;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj4 : cVar) {
                                if (w.z(((x0) obj4).f4358a, x0Var.f4358a, false)) {
                                    arrayList.add(obj4);
                                }
                            }
                            linkedHashMap.put(obj3, arrayList);
                        }
                        objQ4 = i53.a.g(linkedHashMap);
                        mVar11.K(objQ4);
                    }
                    i53.d dVar = (i53.d) objQ4;
                    m53.b bVarD = i53.a.d();
                    qk0.c.Companion companion = qk0.c.INSTANCE;
                    Set setB = a1.b(u.f25597f);
                    Set setM0 = p13.u.m0(new String[]{"dummy-gear-uuid-1", "dummy-gear-uuid-2"});
                    l0 l0Var = l0.f134950a;
                    companion.getClass();
                    qk0.c cVarA = qk0.c.Companion.a(setB, setM0, l0Var);
                    qk0.u uVar = new qk0.u();
                    Object objQ5 = mVar11.q();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new qc.c(8);
                        mVar11.K(objQ5);
                    }
                    qk0.r.d(dVar, bVarD, cVarA, uVar, (l) objQ5, mVar11, 24624);
                    x1 x1Var12 = n.f135158a;
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 12:
                m mVar12 = (m) obj;
                ((Integer) obj2).getClass();
                mVar12.C(-845008685);
                x1 x1Var13 = n.f135158a;
                n0 n0Var3 = n3.f22788a;
                n0 n0Var4 = new n0(0, 0, 0, 0);
                mVar12.f();
                return n0Var4;
            case 13:
                p1 p1Var = (p1) obj2;
                ((d4.n) obj).getClass();
                p1Var.getClass();
                return h0.b1((Iterable) p1Var.getF182175a());
            case 14:
                qq0.a aVar13 = qq0.a.f146050a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (nq0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC_OAUTH_1, nq0.a.class, new c83.h.a[0], null, null, null, 88);
            case 15:
                Scope scope = (Scope) obj;
                qq0.a aVar14 = qq0.a.f146050a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new ar0.a((nq0.a) scope.get((k23.d<?>) s0.f105811a.b(nq0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 16:
                Scope scope2 = (Scope) obj;
                qq0.a aVar15 = qq0.a.f146050a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var = s0.f105811a;
                return new rq0.d((ar0.a) scope2.get((k23.d<?>) t0Var.b(ar0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bv.d) scope2.get((k23.d<?>) t0Var.b(bv.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 17:
                Scope scope3 = (Scope) obj;
                qq0.a aVar16 = qq0.a.f146050a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var2 = s0.f105811a;
                return new rq0.e((ar0.a) scope3.get((k23.d<?>) t0Var2.b(ar0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bv.d) scope3.get((k23.d<?>) t0Var2.b(bv.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 18:
                Scope scope4 = (Scope) obj;
                qq0.a aVar17 = qq0.a.f146050a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var3 = s0.f105811a;
                return new f((rq0.d) scope4.get((k23.d<?>) t0Var3.b(rq0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (rq0.e) scope4.get((k23.d<?>) t0Var3.b(rq0.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 19:
                Scope scope5 = (Scope) obj;
                qq0.a aVar18 = qq0.a.f146050a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var4 = s0.f105811a;
                return new wq0.l((j1) scope5.get((k23.d<?>) t0Var4.b(j1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ar0.a) scope5.get((k23.d<?>) t0Var4.b(ar0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 20:
                return Integer.valueOf(((DateTimeComparator) KoinJavaComponent.get$default(DateTimeComparator.class, null, null, 6, null)).compare(((ps.x1) obj).getStartDateTime(), ((ps.x1) obj2).getStartDateTime()));
            case 21:
                MetricsMapDTO metricsMapDTO = (MetricsMapDTO) obj;
                MetricsMapDTO metricsMapDTO2 = (MetricsMapDTO) obj2;
                metricsMapDTO.getClass();
                metricsMapDTO2.getClass();
                return Integer.valueOf(Double.compare(metricsMapDTO2.f38034b, metricsMapDTO.f38034b));
            case 22:
                ((Float) obj).floatValue();
                i.d dVar2 = (i.d) obj2;
                int i16 = qt1.a.I;
                dVar2.getClass();
                return Float.valueOf(qt1.a.b.f147512a[dVar2.ordinal()] == 1 ? 4.0f : 2.0f);
            case 23:
                float fFloatValue = ((Float) obj).floatValue();
                i.d dVar3 = (i.d) obj2;
                int i17 = qt1.a.I;
                dVar3.getClass();
                if (fFloatValue < 13.0f) {
                    f14 = 0.0f;
                } else if (qt1.a.b.f147512a[dVar3.ordinal()] == 1) {
                    f14 = 4.0f;
                }
                return Float.valueOf(f14);
            case 24:
                m mVar13 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                qx0.a aVar19 = qx0.a.f148401a;
                if (mVar13.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 25:
                m mVar14 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                qx0.a aVar20 = qx0.a.f148401a;
                if (mVar14.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 26:
                m mVar15 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                qx1.a aVar21 = qx1.a.f148415a;
                if (mVar15.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    r.a aVar22 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    y0.a(n5.c.a(R.drawable.ic_remove_red, mVar15, 0), y.Q(mVar15, R.string.lbl_delete), x2.q(aVar22, j92.b.f97901d.f97904c), null, null, 0.0f, null, mVar15, 0, 120);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 27:
                m mVar16 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                qx1.a aVar23 = qx1.a.f148415a;
                if (mVar16.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    r.a aVar24 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(b3.a(t62.b.f162798a), y.Q(mVar16, R.string.lbl_edit), x2.q(aVar24, j92.b.f97901d.f97905d), sn.a.b(mVar16), mVar16, 0, 0);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 28:
                m mVar17 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                qx1.b bVar5 = qx1.b.f148418a;
                if (mVar17.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var18 = n.f135158a;
                    r.a aVar25 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(b3.a(t62.b.f162798a), y.Q(mVar17, R.string.lbl_edit), x2.q(aVar25, j92.b.f97901d.f97905d), sn.a.b(mVar17), mVar17, 0, 0);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar18 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                qx1.c cVar2 = qx1.c.f148420a;
                if (mVar18.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var19 = n.f135158a;
                    r.a aVar26 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(b3.a(t62.b.f162798a), y.Q(mVar18, R.string.lbl_edit), x2.q(aVar26, j92.b.f97901d.f97905d), sn.a.b(mVar18), mVar18, 0, 0);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
        }
    }
}
