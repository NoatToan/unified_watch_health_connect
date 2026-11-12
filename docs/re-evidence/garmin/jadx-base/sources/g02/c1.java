package g02;

import android.app.DownloadManager;
import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import i3.e9;
import java.util.List;
import java.util.Map;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74341a;

    public /* synthetic */ c1(int i14) {
        this.f74341a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f74341a) {
            case 0:
                ((Integer) obj2).getClass();
                f1.c((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                f1.d((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                f1.g((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                f1.f((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                f1.b((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                f1.a((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 6:
                Map<String, List<Object>> mapB = ((g2.n1) obj2).b();
                if (mapB.isEmpty()) {
                    return null;
                }
                return mapB;
            case 7:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g50.a aVar = g50.a.f75882a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new g12.m(7);
                        mVar.K(objQ);
                    }
                    g50.n.a((e23.a) objQ, e9.f(true, null, mVar, 6, 2), mVar, 6);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 8:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                PregnancyDetailsActivity.a aVar2 = PregnancyDetailsActivity.f40489x;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 9:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                PregnancyDetailsActivity.a aVar3 = PregnancyDetailsActivity.f40489x;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 10:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                gf1.a aVar4 = gf1.a.f77073a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new mf1.a(new hf1.a((r53.i) parametersHolder.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(r53.i.class))));
            case 11:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                gf1.a aVar5 = gf1.a.f77073a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new lf1.a((mf1.a) parametersHolder2.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(mf1.a.class)));
            case 12:
                gf1.b bVar = gf1.b.f77075a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (df1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, df1.a.class, new c83.h.a[0], null, null, null, 120);
            case 13:
                Scope scope = (Scope) obj;
                gf1.b bVar2 = gf1.b.f77075a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new ff1.f((df1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(df1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 14:
                Scope scope2 = (Scope) obj;
                gf1.b bVar3 = gf1.b.f77075a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                return new jf1.b((ff1.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(ff1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 15:
                Scope scope3 = (Scope) obj;
                gl0.a aVar6 = gl0.a.f77821a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new hl0.o(ModuleExtKt.androidContext(scope3));
            case 16:
                Scope scope4 = (Scope) obj;
                gl0.a aVar7 = gl0.a.f77821a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                return new hl0.x((el0.c) scope4.get((k23.d<?>) t0Var.b(el0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hl0.o) scope4.get((k23.d<?>) t0Var.b(hl0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
            case 17:
                Scope scope5 = (Scope) obj;
                gl0.a aVar8 = gl0.a.f77821a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                return new ll0.f((hl0.n) scope5.get((k23.d<?>) t0Var2.b(hl0.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hl0.f) scope5.get((k23.d<?>) t0Var2.b(hl0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope5.get((k23.d<?>) t0Var2.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 18:
                gl0.a aVar9 = gl0.a.f77821a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (el0.b) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, el0.b.class, new c83.h.a[0], null, null, null, 120);
            case 19:
                Scope scope6 = (Scope) obj;
                gl0.a aVar10 = gl0.a.f77821a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                return new ml0.p((hl0.x) scope6.get((k23.d<?>) t0Var3.b(hl0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hl0.u) scope6.get((k23.d<?>) t0Var3.b(hl0.u.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mv0.e) scope6.get((k23.d<?>) t0Var3.b(mv0.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope6.get((k23.d<?>) t0Var3.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 20:
                Scope scope7 = (Scope) obj;
                gl0.a aVar11 = gl0.a.f77821a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                return new kl0.d((androidx.lifecycle.j1) scope7.get((k23.d<?>) t0Var4.b(androidx.lifecycle.j1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hl0.k) scope7.get((k23.d<?>) t0Var4.b(hl0.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hl0.u) scope7.get((k23.d<?>) t0Var4.b(hl0.u.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mv0.e) scope7.get((k23.d<?>) t0Var4.b(mv0.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 21:
                Scope scope8 = (Scope) obj;
                gl0.a aVar12 = gl0.a.f77821a;
                scope8.getClass();
                ((ParametersHolder) obj2).getClass();
                el0.b bVar4 = (el0.b) scope8.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(el0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                rd2.l lVarE = rd2.l.e();
                lVarE.getClass();
                return new el0.e(bVar4, lVarE);
            case 22:
                Scope scope9 = (Scope) obj;
                gl0.a aVar13 = gl0.a.f77821a;
                scope9.getClass();
                ((ParametersHolder) obj2).getClass();
                Object systemService = ModuleExtKt.androidContext(scope9).getSystemService("download");
                systemService.getClass();
                l22.a aVar14 = new l22.a(ModuleExtKt.androidContext(scope9));
                rd2.l lVarE2 = rd2.l.e();
                lVarE2.getClass();
                return new hl0.u((DownloadManager) systemService, aVar14, lVarE2, null, 8, null);
            case 23:
                Scope scope10 = (Scope) obj;
                gl0.a aVar15 = gl0.a.f77821a;
                scope10.getClass();
                ((ParametersHolder) obj2).getClass();
                Object systemService2 = ModuleExtKt.androidContext(scope10).getSystemService("download");
                systemService2.getClass();
                rd2.l lVarE3 = rd2.l.e();
                lVarE3.getClass();
                return new hl0.f((DownloadManager) systemService2, lVarE3, null, 4, null);
            case 24:
                Scope scope11 = (Scope) obj;
                gl0.a aVar16 = gl0.a.f77821a;
                scope11.getClass();
                ((ParametersHolder) obj2).getClass();
                Object systemService3 = ModuleExtKt.androidContext(scope11).getSystemService("download");
                systemService3.getClass();
                return new hl0.a((DownloadManager) systemService3);
            case 25:
                Scope scope12 = (Scope) obj;
                gl0.a aVar17 = gl0.a.f77821a;
                scope12.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                return new hl0.n((el0.c) scope12.get((k23.d<?>) t0Var5.b(el0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hl0.a) scope12.get((k23.d<?>) t0Var5.b(hl0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 26:
                Scope scope13 = (Scope) obj;
                gl0.a aVar18 = gl0.a.f77821a;
                scope13.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                return new hl0.k((el0.c) scope13.get((k23.d<?>) t0Var6.b(el0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hl0.a) scope13.get((k23.d<?>) t0Var6.b(hl0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 27:
                gq1.b bVar5 = gq1.b.f78507a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new fq1.e();
            case 28:
                gq1.b bVar6 = gq1.b.f78507a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new fq1.f();
            default:
                gq1.b bVar7 = gq1.b.f78507a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new fq1.b();
        }
    }

    public /* synthetic */ c1(int i14, int i15) {
        this.f74341a = i15;
    }
}
