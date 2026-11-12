package e11;

import android.content.Context;
import c62.f1;
import c62.g1;
import c62.h1;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import n70.k1;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.x1;
import wd2.p1;
import zd0.q0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61990a;

    public /* synthetic */ w(int i14) {
        this.f61990a = i14;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0565  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f61990a) {
            case 0:
                ((Double) obj).doubleValue();
                ((a11.r) obj2).getClass();
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                return Unit.INSTANCE;
            case 2:
                e2.i0 i0Var = (e2.i0) obj2;
                e2.i0.a aVar = e2.i0.f62432x;
                return p13.x.k(Integer.valueOf(i0Var.h()), Integer.valueOf(i0Var.i()));
            case 3:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e51.a aVar2 = e51.a.f63045a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar, R.string.pacepro_lbl_edit_splits_title);
                    b.u uVar = (b.u) mVar.A(g02.d.f74342a);
                    boolean zR = mVar.r(uVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new e51.a.C1328a(uVar);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e51.a.C1328a(uVar);
                            mVar.K(objQ);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) ((k23.g) objQ), null, strQ, mVar, null);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 4:
                List list = (List) obj;
                l52.i.a aVar3 = (l52.i.a) obj2;
                list.getClass();
                aVar3.getClass();
                list.add(new h1(aVar3));
                return Unit.INSTANCE;
            case 5:
                List list2 = (List) obj;
                l52.i.a aVar4 = (l52.i.a) obj2;
                list2.getClass();
                aVar4.getClass();
                list2.add(new g1(aVar4));
                return Unit.INSTANCE;
            case 6:
                List list3 = (List) obj;
                l52.i.a aVar5 = (l52.i.a) obj2;
                list3.getClass();
                aVar5.getClass();
                list3.add(new f1(aVar5));
                return Unit.INSTANCE;
            case 7:
                Scope scope = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                e91.a aVar6 = e91.a.f63486a;
                scope.getClass();
                parametersHolder.getClass();
                t0 t0Var = s0.f105811a;
                return new i91.g((i91.j) parametersHolder.elementAt(0, t0Var.b(i91.j.class)), (l91.a) scope.get((k23.d<?>) t0Var.b(l91.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 8:
                Scope scope2 = (Scope) obj;
                e91.a aVar7 = e91.a.f63486a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var2 = s0.f105811a;
                return new a91.m((a91.w) scope2.get((k23.d<?>) t0Var2.b(a91.w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.j0) scope2.get((k23.d<?>) t0Var2.b(z70.j0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (a80.a) scope2.get((k23.d<?>) t0Var2.b(a80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 9:
                Scope scope3 = (Scope) obj;
                e91.a aVar8 = e91.a.f63486a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new c91.a((f12.l) scope3.get((k23.d<?>) s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 10:
                Scope scope4 = (Scope) obj;
                e91.a aVar9 = e91.a.f63486a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var3 = s0.f105811a;
                return new k91.c((a91.x) scope4.get((k23.d<?>) t0Var3.b(a91.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (a91.m) scope4.get((k23.d<?>) t0Var3.b(a91.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope4.get((k23.d<?>) t0Var3.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 11:
                Scope scope5 = (Scope) obj;
                e91.a aVar10 = e91.a.f63486a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new c91.a((f12.l) scope5.get((k23.d<?>) s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 12:
                e91.a aVar11 = e91.a.f63486a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (a91.w) ez0.b.a(ez0.b.f67468a, ez0.c.GC, a91.w.class, new c83.h.a[0], null, null, null, 120);
            case 13:
                Scope scope6 = (Scope) obj;
                e91.a aVar12 = e91.a.f63486a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                return new a91.f((a91.w) scope6.get((k23.d<?>) s0.f105811a.b(a91.w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 14:
                Scope scope7 = (Scope) obj;
                e91.a aVar13 = e91.a.f63486a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var4 = s0.f105811a;
                return new a91.a((a91.y) scope7.get((k23.d<?>) t0Var4.b(a91.y.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (a91.m) scope7.get((k23.d<?>) t0Var4.b(a91.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope7.get((k23.d<?>) t0Var4.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope7.get((k23.d<?>) t0Var4.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope7.get((k23.d<?>) t0Var4.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (k1) scope7.get((k23.d<?>) t0Var4.b(k1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zr1.a) scope7.get((k23.d<?>) t0Var4.b(zr1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (az0.c) scope7.get((k23.d<?>) t0Var4.b(az0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 256, null);
            case 15:
                Scope scope8 = (Scope) obj;
                e91.a aVar14 = e91.a.f63486a;
                scope8.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var5 = s0.f105811a;
                return new g91.b((a91.m) scope8.get((k23.d<?>) t0Var5.b(a91.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.o) scope8.get((k23.d<?>) t0Var5.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 16:
                e91.a aVar15 = e91.a.f63486a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new l91.b();
            case 17:
                Scope scope9 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                e91.a aVar16 = e91.a.f63486a;
                scope9.getClass();
                parametersHolder2.getClass();
                t0 t0Var6 = s0.f105811a;
                return new i91.j((r53.i) parametersHolder2.elementAt(0, t0Var6.b(r53.i.class)), new f91.c((a91.x) scope9.get((k23.d<?>) t0Var6.b(a91.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)), new f91.b((a91.x) scope9.get((k23.d<?>) t0Var6.b(a91.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)), new f91.a((a91.x) scope9.get((k23.d<?>) t0Var6.b(a91.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)), (c91.b) scope9.get((k23.d<?>) t0Var6.b(c91.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 18:
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                ec1.a aVar17 = ec1.a.f63788a;
                ((Scope) obj).getClass();
                parametersHolder3.getClass();
                return new lc1.a(new fc1.b((r53.i) parametersHolder3.elementAt(0, s0.f105811a.b(r53.i.class)), new ae0.b()));
            case 19:
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                ec1.a aVar18 = ec1.a.f63788a;
                ((Scope) obj).getClass();
                parametersHolder4.getClass();
                return new kc1.a((lc1.a) parametersHolder4.elementAt(0, s0.f105811a.b(lc1.a.class)));
            case 20:
                Scope scope10 = (Scope) obj;
                ec1.a aVar19 = ec1.a.f63788a;
                scope10.getClass();
                ((ParametersHolder) obj2).getClass();
                return new ic1.m(((ic1.e) Scope.get$default(scope10, s0.f105811a.b(ic1.e.class), (Qualifier) null, (e23.a) null, 6, (Object) null)).f());
            case 21:
                Scope scope11 = (Scope) obj;
                ee2.a aVar20 = ee2.a.f63925a;
                scope11.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var7 = s0.f105811a;
                wd2.l lVar = (wd2.l) scope11.get((k23.d<?>) t0Var7.b(wd2.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                return new p1(new pt2.b(new ee2.a.C1356a(lVar), (Context) scope11.get((k23.d<?>) t0Var7.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new ee2.a.d(lVar), new ee2.a.b(lVar), new ee2.a.c(lVar), null, 32, null));
            case 22:
                Scope scope12 = (Scope) obj;
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                ef2.a aVar21 = ef2.a.f63969a;
                scope12.getClass();
                parametersHolder5.getClass();
                t0 t0Var8 = s0.f105811a;
                return new jf2.a(new gf2.c((r53.i) parametersHolder5.elementAt(0, t0Var8.b(r53.i.class)), (com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope12.get((k23.d<?>) t0Var8.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)), new n70.j((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope12.get((k23.d<?>) t0Var8.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
            case 23:
                Scope scope13 = (Scope) obj;
                ParametersHolder parametersHolder6 = (ParametersHolder) obj2;
                ef2.a aVar22 = ef2.a.f63969a;
                scope13.getClass();
                parametersHolder6.getClass();
                t0 t0Var9 = s0.f105811a;
                return new if2.c((jf2.a) parametersHolder6.elementAt(0, t0Var9.b(jf2.a.class)), (ff2.c) scope13.get((k23.d<?>) t0Var9.b(ff2.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (q0) scope13.get((k23.d<?>) t0Var9.b(q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 24:
                ParametersHolder parametersHolder7 = (ParametersHolder) obj2;
                el1.b bVar = el1.b.f64537a;
                ((Scope) obj).getClass();
                parametersHolder7.getClass();
                t0 t0Var10 = s0.f105811a;
                return new hl1.v(((Number) parametersHolder7.elementAt(0, t0Var10.b(Long.class))).longValue(), (zf2.d) parametersHolder7.elementAt(1, t0Var10.b(zf2.d.class)));
            case 25:
                el1.b bVar2 = el1.b.f64537a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (bl1.b) ez0.b.a(ez0.b.f67468a, ez0.c.GC, bl1.b.class, new c83.h.a[0], null, null, null, 88);
            case 26:
                Scope scope14 = (Scope) obj;
                el1.b bVar3 = el1.b.f64537a;
                scope14.getClass();
                ((ParametersHolder) obj2).getClass();
                return new cl1.b((f12.l) Scope.get$default(scope14, s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
            case 27:
                Scope scope15 = (Scope) obj;
                el1.b bVar4 = el1.b.f64537a;
                scope15.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var11 = s0.f105811a;
                return new dl1.b((bl1.b) scope15.get((k23.d<?>) t0Var11.b(bl1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl1.a) Scope.get$default(scope15, t0Var11.b(cl1.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
            case 28:
                Scope scope16 = (Scope) obj;
                el1.b bVar5 = el1.b.f64537a;
                scope16.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var12 = s0.f105811a;
                return new fl1.b((dl1.a) scope16.get((k23.d<?>) t0Var12.b(dl1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (cl1.a) scope16.get((k23.d<?>) t0Var12.b(cl1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            default:
                Scope scope17 = (Scope) obj;
                el1.b bVar6 = el1.b.f64537a;
                scope17.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var13 = s0.f105811a;
                return new fl1.g((cl1.a) scope17.get((k23.d<?>) t0Var13.b(cl1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fl1.f) scope17.get((k23.d<?>) t0Var13.b(fl1.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ws.a) scope17.get((k23.d<?>) t0Var13.b(ws.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 8, null);
        }
    }
}
