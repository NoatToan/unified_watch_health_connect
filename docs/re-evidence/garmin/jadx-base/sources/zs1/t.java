package zs1;

import android.content.Context;
import c2.n3;
import hx0.i0;
import i3.f0;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206885a;

    public /* synthetic */ t(int i14) {
        this.f206885a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f206885a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                mVar.C(-644903917);
                x1 x1Var = p3.n.f135158a;
                f0.f88041a.getClass();
                c2.x1 x1VarB = f0.b(mVar);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.a aVar = new c2.a(x1VarB, n3.b(0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13));
                mVar.f();
                return aVar;
            case 1:
                zw0.a aVar2 = zw0.a.f207201a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new rx0.b();
            case 2:
                zw0.a aVar3 = zw0.a.f207201a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new yw0.d();
            case 3:
                Scope scope = (Scope) obj;
                zw0.a aVar4 = zw0.a.f207201a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new jx0.k((yw0.a) Scope.get$default(scope, s0.f105811a.b(yw0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
            case 4:
                Scope scope2 = (Scope) obj;
                zw0.a aVar5 = zw0.a.f207201a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                return new hx0.s((yw0.a) Scope.get$default(scope2, s0.f105811a.b(yw0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
            case 5:
                Scope scope3 = (Scope) obj;
                zw0.a aVar6 = zw0.a.f207201a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new sx0.a((yw0.a) Scope.get$default(scope3, s0.f105811a.b(yw0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
            case 6:
                Scope scope4 = (Scope) obj;
                zw0.a aVar7 = zw0.a.f207201a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new tx0.f((yw0.a) Scope.get$default(scope4, s0.f105811a.b(yw0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
            case 7:
                Scope scope5 = (Scope) obj;
                zw0.a aVar8 = zw0.a.f207201a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new i0((yw0.a) Scope.get$default(scope5, s0.f105811a.b(yw0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
            case 8:
                Scope scope6 = (Scope) obj;
                zw0.a aVar9 = zw0.a.f207201a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                return new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b((yw0.a) Scope.get$default(scope6, s0.f105811a.b(yw0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
            case 9:
                Scope scope7 = (Scope) obj;
                zw0.a aVar10 = zw0.a.f207201a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                return new lx0.k((yw0.a) Scope.get$default(scope7, s0.f105811a.b(yw0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
            case 10:
                zw0.a aVar11 = zw0.a.f207201a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new qx0.d();
            case 11:
                Scope scope8 = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                zw0.b bVar = zw0.b.f207203a;
                scope8.getClass();
                parametersHolder.getClass();
                t0 t0Var = s0.f105811a;
                return new gx0.a(new bx0.a((r53.i) parametersHolder.elementAt(0, t0Var.b(r53.i.class)), (ax0.a) scope8.get((k23.d<?>) t0Var.b(ax0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
            case 12:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                zw0.b bVar2 = zw0.b.f207203a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new fx0.k((gx0.a) parametersHolder2.elementAt(0, s0.f105811a.b(gx0.a.class)));
            default:
                Context context = (Context) obj;
                gw2.e eVar = (gw2.e) obj2;
                context.getClass();
                eVar.getClass();
                return context.getString(eVar.f79886a);
        }
    }
}
