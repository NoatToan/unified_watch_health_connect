package qc;

import am.x0;
import android.view.View;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.lifecycle.m1;
import androidx.lifecycle.viewmodel.CreationExtras;
import c22.l3;
import com.garmin.android.apps.connectmobile.leaderboard.model.MetricsMapDTO;
import i3.e5;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import lc.h0;
import lc.j0;
import lc.p0;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.t0;
import p5.k0;
import qk0.v;
import qm.g0;
import qr.t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144292a;

    public /* synthetic */ c(t tVar) {
        this.f144292a = 25;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f144292a) {
            case 0:
                CreationExtras creationExtras = (CreationExtras) obj;
                creationExtras.getClass();
                return new d.a(m1.a(creationExtras));
            case 1:
                p0 p0Var = (p0) obj;
                int i14 = h.B;
                p0Var.getClass();
                p0Var.f111830c = true;
                return Unit.INSTANCE;
            case 2:
                h0 h0Var = (h0) obj;
                int i15 = h.B;
                h0Var.getClass();
                j0 j0Var = h0Var.f111774c;
                if (j0Var == null || j0Var.f111791g.f144354c != h0Var.f111773b.f144346e) {
                    return null;
                }
                return j0Var;
            case 3:
                h0 h0Var2 = (h0) obj;
                int i16 = h.B;
                h0Var2.getClass();
                j0 j0Var2 = h0Var2.f111774c;
                if (j0Var2 == null || j0Var2.f111791g.f144354c != h0Var2.f111773b.f144346e) {
                    return null;
                }
                return j0Var2;
            case 4:
                h0 h0Var3 = (h0) obj;
                int i17 = h.B;
                h0Var3.getClass();
                return Integer.valueOf(h0Var3.f111773b.f144346e);
            case 5:
                com.garmin.android.library.mapsdkadapter.i iVar = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar.getClass();
                iVar.clear();
                return Unit.INSTANCE;
            case 6:
                com.garmin.android.library.mapsdkadapter.i iVar2 = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar2.getClass();
                iVar2.q();
                return Unit.INSTANCE;
            case 7:
                com.garmin.android.library.mapsdkadapter.i iVar3 = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar3.getClass();
                iVar3.S();
                return Unit.INSTANCE;
            case 8:
                qk0.b bVar = qk0.b.f145078a;
                ((qk0.d) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                v vVar = (v) obj;
                vVar.getClass();
                return vVar.getF145163d();
            case 10:
                x0 x0Var = (x0) obj;
                x0Var.getClass();
                return x0Var.f4358a;
            case 11:
                List list = (List) obj;
                list.getClass();
                return p3.p0.n(i53.a.h(list));
            case 12:
                ql0.b.a aVar = ql0.b.f145209b;
                new iu1.f();
                return (com.garmin.android.apps.connectmobile.golf.truswing.model.m) iu1.f.d(com.garmin.android.apps.connectmobile.golf.truswing.model.m.class, (String) obj);
            case 13:
                ql0.b.a aVar2 = ql0.b.f145209b;
                return new iu1.f().a(com.garmin.android.apps.connectmobile.golf.truswing.model.k.class, (String) obj);
            case 14:
                ql0.b.a aVar3 = ql0.b.f145209b;
                return new iu1.f().a(com.garmin.android.apps.connectmobile.golf.truswing.model.b.class, (String) obj);
            case 15:
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                ((View) obj).requestApplyInsets();
                return Unit.INSTANCE;
            case 16:
                String str = (String) obj;
                int i18 = g0.C;
                str.getClass();
                return Boolean.valueOf(!str.equals("OVERLAY"));
            case 17:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                oi0.b bVar2 = (oi0.b) obj;
                bVar2.getClass();
                bVar2.a();
                return Unit.INSTANCE;
            case 20:
                oi0.b bVar3 = (oi0.b) obj;
                bVar3.getClass();
                bVar3.J();
                bVar3.n();
                bVar3.M();
                return Unit.INSTANCE;
            case 21:
                oi0.b bVar4 = (oi0.b) obj;
                bVar4.getClass();
                bVar4.a();
                return Unit.INSTANCE;
            case 22:
                oi0.b bVar5 = (oi0.b) obj;
                bVar5.getClass();
                bVar5.M();
                return Unit.INSTANCE;
            case 23:
                Module module = (Module) obj;
                qq0.a aVar4 = qq0.a.f146050a;
                module.getClass();
                q51.a aVar5 = new q51.a(14);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var3 = p13.j0.f134944a;
                t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(nq0.a.class), null, aVar5, kind, j0Var3), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ar0.a.class), null, new q51.a(15), kind, j0Var3), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(rq0.d.class), null, new q51.a(16), kind, j0Var3), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(rq0.e.class), null, new q51.a(17), kind, j0Var3), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(yq0.f.class), null, new q51.a(18), kind, j0Var3), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(wq0.l.class), null, new q51.a(19), kind, j0Var3), module));
                return Unit.INSTANCE;
            case 24:
                Double d14 = (Double) obj;
                if (d14 == null) {
                    return "";
                }
                l3.a aVar6 = l3.f23124b;
                int iDoubleValue = (int) d14.doubleValue();
                aVar6.getClass();
                return l3.a.Z0(iDoubleValue);
            case 25:
                ((Boolean) obj).getClass();
                int i19 = t.A2;
                return Unit.INSTANCE;
            case 26:
                oi0.b bVar6 = (oi0.b) obj;
                bVar6.getClass();
                bVar6.M();
                bVar6.a();
                return Unit.INSTANCE;
            case 27:
                oi0.b bVar7 = (oi0.b) obj;
                bVar7.getClass();
                bVar7.M();
                bVar7.a();
                return Unit.INSTANCE;
            case 28:
                MetricsMapDTO metricsMapDTO = (MetricsMapDTO) obj;
                com.garmin.android.apps.connectmobile.leaderboard.connections.c.a aVar7 = com.garmin.android.apps.connectmobile.leaderboard.connections.c.D;
                metricsMapDTO.getClass();
                return NumberFormat.getNumberInstance(Locale.getDefault()).format(metricsMapDTO.f38034b);
            default:
                MetricsMapDTO metricsMapDTO2 = (MetricsMapDTO) obj;
                com.garmin.android.apps.connectmobile.leaderboard.connections.e.a aVar8 = com.garmin.android.apps.connectmobile.leaderboard.connections.e.D;
                metricsMapDTO2.getClass();
                return NumberFormat.getNumberInstance(Locale.getDefault()).format(metricsMapDTO2.f38034b);
        }
    }

    public /* synthetic */ c(int i14) {
        this.f144292a = i14;
    }
}
