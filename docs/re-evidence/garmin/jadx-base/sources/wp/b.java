package wp;

import d53.u;
import e23.l;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.c0;
import p13.h0;
import p13.j0;
import p5.k0;
import qs2.f;
import uy2.n;
import uy2.t;
import uy2.z;
import wq0.a0;
import wr2.e;
import wt0.h;
import wt0.i;
import xs.g;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186521a;

    public /* synthetic */ b(int i14) {
        this.f186521a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object next;
        f fVar;
        f fVar2;
        String str;
        byte b14 = 0;
        switch (this.f186521a) {
            case 0:
                oi0.b bVar = (oi0.b) obj;
                bVar.getClass();
                bVar.a();
                return Unit.INSTANCE;
            case 1:
                oi0.b bVar2 = (oi0.b) obj;
                bVar2.getClass();
                bVar2.M();
                return Unit.INSTANCE;
            case 2:
                oi0.b bVar3 = (oi0.b) obj;
                bVar3.getClass();
                bVar3.B();
                bVar3.s();
                return Unit.INSTANCE;
            case 3:
                oi0.b bVar4 = (oi0.b) obj;
                bVar4.getClass();
                bVar4.b0();
                bVar4.y();
                return Unit.INSTANCE;
            case 4:
                oi0.b bVar5 = (oi0.b) obj;
                bVar5.getClass();
                bVar5.y();
                bVar5.g();
                return Unit.INSTANCE;
            case 5:
                oi0.b bVar6 = (oi0.b) obj;
                bVar6.getClass();
                bVar6.d();
                return Unit.INSTANCE;
            case 6:
                oi0.b bVar7 = (oi0.b) obj;
                bVar7.getClass();
                bVar7.M();
                return Unit.INSTANCE;
            case 7:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                return a0Var.f186579a;
            case 8:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                List list = (List) obj;
                if (e.f186839n == null) {
                    ArrayList arrayList = new ArrayList();
                    e.f186839n = arrayList;
                    list.getClass();
                    arrayList.addAll(list);
                    ArrayList arrayList2 = e.f186839n;
                    if (arrayList2 == null) {
                        s.m("cardsCache");
                        throw null;
                    }
                    if (arrayList2.size() > 1) {
                        c0.u(arrayList2, new e.b());
                    }
                    return Unit.INSTANCE;
                }
                list.getClass();
                Iterator it = h0.N0(list, new e.c()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        fs2.a aVar = (fs2.a) next;
                        ArrayList arrayList3 = e.f186839n;
                        if (arrayList3 == null) {
                            s.m("cardsCache");
                            throw null;
                        }
                        if (!arrayList3.isEmpty()) {
                            Iterator it3 = arrayList3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (s.g(aVar.f73426a, ((fs2.a) it3.next()).f73426a)) {
                                    }
                                }
                            }
                        }
                    } else {
                        next = null;
                    }
                }
                fs2.a aVar2 = (fs2.a) next;
                if (aVar2 != null && (fVar = aVar2.f73433h) == (fVar2 = f.ACTIVE)) {
                    e eVar = e.f186838m;
                    String str2 = aVar2.f73429d;
                    long j8 = aVar2.f73431f;
                    if (fVar == null) {
                        fVar = fVar2;
                    }
                    eVar.m(new wr2.f.a(str2, j8, fVar));
                }
                ArrayList arrayList4 = e.f186839n;
                if (arrayList4 == null) {
                    s.m("cardsCache");
                    throw null;
                }
                arrayList4.clear();
                ArrayList arrayList5 = e.f186839n;
                if (arrayList5 != null) {
                    arrayList5.addAll(list);
                    return Unit.INSTANCE;
                }
                s.m("cardsCache");
                throw null;
            case 10:
                Module module = (Module) obj;
                ws.b bVar8 = ws.b.f186897a;
                module.getClass();
                wf2.b bVar9 = new wf2.b(16);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(ts.b.class), null, bVar9, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ts.a.class), null, new wf2.b(17), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(g.class), null, new wf2.b(18), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(xs.d.class), null, new wf2.b(19), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(xs.e.class), null, new wf2.b(20), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(zs.c.class), null, new wf2.b(21), kind, j0Var), module));
                return Unit.INSTANCE;
            case 11:
                Module module2 = (Module) obj;
                wt.a aVar3 = wt.a.f187002a;
                module2.getClass();
                wf2.b bVar10 = new wf2.b(23);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(du.a.class), null, bVar10, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(au.g.class), null, new wf2.b(24), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(xt.a.class), null, new wf2.b(25), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(rt.a.class), null, new wf2.b(26), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(com.garmin.android.apps.connectmobile.annual_report.preprocess.a.class), null, new wf2.b(27), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(bu.a.class), null, new wf2.b(28), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 12:
                oi0.b bVar11 = (oi0.b) obj;
                bVar11.getClass();
                bVar11.f132238b = u.v(bVar11.f132238b, "·", StringUtils.SPACE, false);
                return Unit.INSTANCE;
            case 13:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                p5.h0.g(k0Var);
                return Unit.INSTANCE;
            case 14:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                k0 k0Var2 = (k0) obj;
                int i14 = h.f187018c;
                k0Var2.getClass();
                p5.h0.f(k0Var2);
                return Unit.INSTANCE;
            case 16:
                Module module3 = (Module) obj;
                wv.a aVar4 = wv.a.f187356a;
                module3.getClass();
                i iVar = new i(b14, 6);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                j0 j0Var3 = j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(uv.d.class), null, iVar, kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(yv.d.class), null, new i(b14, 7), kind3, j0Var3), module3));
                return Unit.INSTANCE;
            case 17:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                uy2.c0 c0Var = (uy2.c0) obj;
                c0Var.getClass();
                String strDescription = c0Var.description();
                strDescription.getClass();
                str = strDescription.length() > 0 ? strDescription : null;
                return str == null ? "Return null" : str;
            case 20:
                z zVar = (z) obj;
                zVar.getClass();
                return Long.valueOf(zVar.value());
            case 21:
                n nVar = (n) obj;
                nVar.getClass();
                return s0.f105811a.b(nVar.objectClass());
            case 22:
                z zVar2 = (z) obj;
                zVar2.getClass();
                String strDescription2 = zVar2.description();
                strDescription2.getClass();
                str = strDescription2.length() > 0 ? strDescription2 : null;
                return str == null ? org.apache.commons.lang3.e.e(zVar2.value(), "Return ") : str;
            case 23:
                uy2.a0 a0Var2 = (uy2.a0) obj;
                a0Var2.getClass();
                return Long.valueOf(a0Var2.value());
            case 24:
                uy2.a0 a0Var3 = (uy2.a0) obj;
                a0Var3.getClass();
                String strDescription3 = a0Var3.description();
                strDescription3.getClass();
                str = strDescription3.length() > 0 ? strDescription3 : null;
                return str == null ? org.apache.commons.lang3.e.e(a0Var3.value(), "Return ") : str;
            case 25:
                uy2.u uVar = (uy2.u) obj;
                uVar.getClass();
                return Double.valueOf(uVar.value());
            case 26:
                uy2.u uVar2 = (uy2.u) obj;
                uVar2.getClass();
                String strDescription4 = uVar2.description();
                strDescription4.getClass();
                str = strDescription4.length() > 0 ? strDescription4 : null;
                if (str != null) {
                    return str;
                }
                return "Return " + uVar2.value();
            case 27:
                uy2.s sVar = (uy2.s) obj;
                sVar.getClass();
                return Double.valueOf(sVar.value());
            case 28:
                uy2.s sVar2 = (uy2.s) obj;
                sVar2.getClass();
                String strDescription5 = sVar2.description();
                strDescription5.getClass();
                str = strDescription5.length() > 0 ? strDescription5 : null;
                if (str != null) {
                    return str;
                }
                return "Return " + sVar2.value();
            default:
                t tVar = (t) obj;
                tVar.getClass();
                return Double.valueOf(tVar.value());
        }
    }
}
