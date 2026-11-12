package nw0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.mh;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.x1;
import v01.b2;
import v01.f1;
import v01.g2;
import v01.j1;
import v01.k0;
import v01.n0;
import v01.n1;
import v01.p0;
import v01.q1;
import v01.s1;
import v01.u1;
import v62.o1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127994a;

    public /* synthetic */ b(int i14) {
        this.f127994a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f127994a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                c cVar = c.f128001a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strG = tn.k.g(gl1.y.Q(mVar, R.string.lbl_search), "...");
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strG, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar), mVar, 0, 0, 131070);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                c cVar2 = c.f128001a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i14 = b3.a.f15501a;
                    u4.d dVarA = c3.a.a();
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_navigate_up);
                    long jB = ds.e0.b(d92.b.f58623a, mVar2);
                    g6.f.a aVar = g6.f.f75994b;
                    i7.b(dVarA, strQ, x2.u(h4.r.S, 24), jB, mVar2, 384, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                c cVar3 = c.f128001a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(o1.a(t62.b.f162798a), null, null, ds.e0.b(d92.b.f58623a, mVar3), mVar3, 48, 4);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                o01.b bVar = o01.b.f128484a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new g11.f((h11.a) parametersHolder.elementAt(0, s0.f105811a.b(h11.a.class)));
            case 4:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                o01.b bVar2 = o01.b.f128484a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new g11.k((h11.b) parametersHolder2.elementAt(0, s0.f105811a.b(h11.b.class)));
            case 5:
                Scope scope = (Scope) obj;
                o01.f fVar = o01.f.f128489a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new v01.i0((m01.g) scope.get((k23.d<?>) s0.f105811a.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 2, null);
            case 6:
                Scope scope2 = (Scope) obj;
                o01.f fVar2 = o01.f.f128489a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                return new n0(new l22.a(ModuleExtKt.androidContext(scope2)));
            case 7:
                o01.f fVar3 = o01.f.f128489a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                p63.f fVar4 = new p63.f();
                t0 t0Var = s0.f105811a;
                p63.b bVar3 = new p63.b(t0Var.b(g01.a.class), null);
                bVar3.b(t0Var.b(g01.r.class), g01.r.INSTANCE.serializer());
                bVar3.b(t0Var.b(g01.e.class), g01.e.INSTANCE.serializer());
                bVar3.b(t0Var.b(g01.e0.class), g01.e0.INSTANCE.serializer());
                bVar3.a(fVar4);
                return (c01.b) ez0.b.a(ez0.b.f67468a, ez0.c.GC, c01.b.class, new c83.h.a[0], null, fVar4.f(), null, 72);
            case 8:
                Scope scope3 = (Scope) obj;
                o01.f fVar5 = o01.f.f128489a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var2 = s0.f105811a;
                return new b2((m01.g) scope3.get((k23.d<?>) t0Var2.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (d01.c) scope3.get((k23.d<?>) t0Var2.b(d01.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s01.f) scope3.get((k23.d<?>) t0Var2.b(s01.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (e01.a) scope3.get((k23.d<?>) t0Var2.b(e01.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 9:
                Scope scope4 = (Scope) obj;
                o01.f fVar6 = o01.f.f128489a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new s01.g((e01.a) scope4.get((k23.d<?>) s0.f105811a.b(e01.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 10:
                Scope scope5 = (Scope) obj;
                o01.f fVar7 = o01.f.f128489a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var3 = s0.f105811a;
                return new v01.s((v01.g0) scope5.get((k23.d<?>) t0Var3.b(v01.g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, (v01.t0) scope5.get((k23.d<?>) t0Var3.b(v01.t0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s01.f) scope5.get((k23.d<?>) t0Var3.b(s01.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), 2, null);
            case 11:
                Scope scope6 = (Scope) obj;
                o01.f fVar8 = o01.f.f128489a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var4 = s0.f105811a;
                return new k0((v01.g0) scope6.get((k23.d<?>) t0Var4.b(v01.g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (p0) scope6.get((k23.d<?>) t0Var4.b(p0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m01.g) scope6.get((k23.d<?>) t0Var4.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, (s01.f) scope6.get((k23.d<?>) t0Var4.b(s01.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), 8, null);
            case 12:
                Scope scope7 = (Scope) obj;
                o01.f fVar9 = o01.f.f128489a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var5 = s0.f105811a;
                return new n1((m01.g) scope7.get((k23.d<?>) t0Var5.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (d01.c) scope7.get((k23.d<?>) t0Var5.b(d01.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
            case 13:
                Scope scope8 = (Scope) obj;
                o01.f fVar10 = o01.f.f128489a;
                scope8.getClass();
                ((ParametersHolder) obj2).getClass();
                return new u1((m01.g) scope8.get((k23.d<?>) s0.f105811a.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 2, null);
            case 14:
                Scope scope9 = (Scope) obj;
                o01.f fVar11 = o01.f.f128489a;
                scope9.getClass();
                ((ParametersHolder) obj2).getClass();
                return new v01.b((m01.g) scope9.get((k23.d<?>) s0.f105811a.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 2, null);
            case 15:
                Scope scope10 = (Scope) obj;
                o01.f fVar12 = o01.f.f128489a;
                scope10.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var6 = s0.f105811a;
                return new e01.b((f12.l) scope10.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c22.k) scope10.get((k23.d<?>) t0Var6.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 16:
                Scope scope11 = (Scope) obj;
                o01.f fVar13 = o01.f.f128489a;
                scope11.getClass();
                ((ParametersHolder) obj2).getClass();
                return new v01.c0((m01.g) scope11.get((k23.d<?>) s0.f105811a.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 2, null);
            case 17:
                Scope scope12 = (Scope) obj;
                o01.f fVar14 = o01.f.f128489a;
                scope12.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var7 = s0.f105811a;
                return new v01.e((m01.g) scope12.get((k23.d<?>) t0Var7.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (q1) scope12.get((k23.d<?>) t0Var7.b(q1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
            case 18:
                Scope scope13 = (Scope) obj;
                o01.f fVar15 = o01.f.f128489a;
                scope13.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var8 = s0.f105811a;
                return new v01.a0((m01.g) scope13.get((k23.d<?>) t0Var8.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v01.t0) scope13.get((k23.d<?>) t0Var8.b(v01.t0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s01.f) scope13.get((k23.d<?>) t0Var8.b(s01.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 8, null);
            case 19:
                o01.f fVar16 = o01.f.f128489a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (c01.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, c01.c.class, new c83.h.a[0], null, null, null, 88);
            case 20:
                Scope scope14 = (Scope) obj;
                o01.f fVar17 = o01.f.f128489a;
                scope14.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var9 = s0.f105811a;
                return new j1((m01.g) scope14.get((k23.d<?>) t0Var9.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v01.t0) scope14.get((k23.d<?>) t0Var9.b(v01.t0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s01.f) scope14.get((k23.d<?>) t0Var9.b(s01.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 8, null);
            case 21:
                Scope scope15 = (Scope) obj;
                o01.f fVar18 = o01.f.f128489a;
                scope15.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var10 = s0.f105811a;
                return new f1((v01.g0) scope15.get((k23.d<?>) t0Var10.b(v01.g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (p0) scope15.get((k23.d<?>) t0Var10.b(p0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m01.g) scope15.get((k23.d<?>) t0Var10.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (s01.f) scope15.get((k23.d<?>) t0Var10.b(s01.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 16, null);
            case 22:
                Scope scope16 = (Scope) obj;
                o01.f fVar19 = o01.f.f128489a;
                scope16.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var11 = s0.f105811a;
                return new v01.j((m01.g) scope16.get((k23.d<?>) t0Var11.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (q1) scope16.get((k23.d<?>) t0Var11.b(q1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
            case 23:
                Scope scope17 = (Scope) obj;
                o01.f fVar20 = o01.f.f128489a;
                scope17.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var12 = s0.f105811a;
                return new g2((m01.g) scope17.get((k23.d<?>) t0Var12.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (q1) scope17.get((k23.d<?>) t0Var12.b(q1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
            case 24:
                Scope scope18 = (Scope) obj;
                o01.f fVar21 = o01.f.f128489a;
                scope18.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var13 = s0.f105811a;
                return new v01.h((m01.g) scope18.get((k23.d<?>) t0Var13.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (q1) scope18.get((k23.d<?>) t0Var13.b(q1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
            case 25:
                Scope scope19 = (Scope) obj;
                o01.f fVar22 = o01.f.f128489a;
                scope19.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var14 = s0.f105811a;
                return new v01.e0((m01.g) scope19.get((k23.d<?>) t0Var14.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v01.g0) scope19.get((k23.d<?>) t0Var14.b(v01.g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (p0) scope19.get((k23.d<?>) t0Var14.b(p0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, (s01.f) scope19.get((k23.d<?>) t0Var14.b(s01.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), 8, null);
            case 26:
                Scope scope20 = (Scope) obj;
                o01.f fVar23 = o01.f.f128489a;
                scope20.getClass();
                ((ParametersHolder) obj2).getClass();
                return new s1(ModuleExtKt.androidContext(scope20));
            case 27:
                Scope scope21 = (Scope) obj;
                o01.f fVar24 = o01.f.f128489a;
                scope21.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var15 = s0.f105811a;
                return new v01.y((m01.g) scope21.get((k23.d<?>) t0Var15.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (d01.c) scope21.get((k23.d<?>) t0Var15.b(d01.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
            case 28:
                Scope scope22 = (Scope) obj;
                o01.f fVar25 = o01.f.f128489a;
                scope22.getClass();
                ((ParametersHolder) obj2).getClass();
                return new q1((m01.g) scope22.get((k23.d<?>) s0.f105811a.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 6, null);
            default:
                Scope scope23 = (Scope) obj;
                o01.f fVar26 = o01.f.f128489a;
                scope23.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var16 = s0.f105811a;
                return new v01.u((m01.g) scope23.get((k23.d<?>) t0Var16.b(m01.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (d01.c) scope23.get((k23.d<?>) t0Var16.b(d01.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
        }
    }
}
