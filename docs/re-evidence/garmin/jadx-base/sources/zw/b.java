package zw;

import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import fg0.k;
import fw.p;
import gs1.v;
import hx0.i0;
import hx0.s;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p5.h0;
import p5.k0;
import qx0.d;
import r70.r;
import tx0.f;
import zs1.t;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207198a;

    public /* synthetic */ b(int i14) {
        this.f207198a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List<k> list;
        k kVar;
        Long l14;
        List<k> list2;
        String strValueOf;
        String strValueOf2;
        int i14 = 1;
        switch (this.f207198a) {
            case 0:
                jx.c cVar = (jx.c) obj;
                int i15 = c.f207199b;
                cVar.getClass();
                return cVar.f101392a;
            case 1:
                Module module = (Module) obj;
                zw0.a aVar = zw0.a.f207201a;
                module.getClass();
                t tVar = new t(2);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(yw0.a.class), null, tVar, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(jx0.k.class), null, new t(3), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(s.class), null, new t(4), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(sx0.a.class), null, new t(5), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(f.class), null, new t(6), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(i0.class), null, new t(7), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b.class), null, new t(8), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(lx0.k.class), null, new t(9), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(d.class), null, new t(10), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(rx0.b.class), null, new t(i14), kind, j0Var), module));
                return Unit.INSTANCE;
            case 2:
                Module module2 = (Module) obj;
                zw0.b bVar = zw0.b.f207203a;
                module2.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.t.P0.a());
                t tVar2 = new t(11);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(r70.s.class), stringQualifierNamed, tVar2, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r.class), stringQualifierNamed, new t(12), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 3:
                ((v.a) obj).getClass();
                return Boolean.TRUE;
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getKey() + "=" + entry.getValue();
            case 5:
                g3 g3Var = (g3) obj;
                int i16 = zy1.d.Q0;
                p pVar = g3Var.f35300a;
                bz1.b bVar2 = (bz1.b) g3Var.f35301b;
                return new g3(pVar, new bz1.c(bVar2 != null ? bVar2.f22291c : null, bVar2 != null ? bVar2.f22292d : null), null, null, null, 16, null);
            case 6:
                g3 g3Var2 = (g3) obj;
                int i17 = zy1.d.Q0;
                p pVar2 = g3Var2.f35300a;
                bz1.b bVar3 = (bz1.b) g3Var2.f35301b;
                if (bVar3 == null || (list2 = bVar3.f22291c) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list2) {
                        gg0.f eventType = ((k) obj2).getEventType();
                        if (eventType != null && eventType.d()) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : arrayList3) {
                        k kVar2 = (k) obj3;
                        k kVar3 = bVar3.f22290b;
                        if (!p005kotlin.jvm.internal.s.g(kVar3 != null ? kVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() : null, kVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String())) {
                            arrayList4.add(obj3);
                        }
                    }
                    arrayList = arrayList4;
                }
                long jLongValue = (bVar3 == null || (kVar = bVar3.f22290b) == null || (l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) == null) ? -1L : l14.longValue();
                if (bVar3 == null || (list = bVar3.f22291c) == null) {
                    arrayList2 = null;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : list) {
                        gg0.f eventType2 = ((k) obj4).getEventType();
                        if (eventType2 != null && eventType2.d()) {
                            arrayList5.add(obj4);
                        }
                    }
                    arrayList2 = arrayList5;
                }
                return new g3(pVar2, new bz1.a(jLongValue, arrayList2, arrayList, bVar3 != null ? bVar3.f22294f : null), null, null, null, 16, null);
            case 7:
                Double d14 = (Double) obj;
                return (d14 == null || (strValueOf = String.valueOf((int) d14.doubleValue())) == null) ? "0" : strValueOf;
            case 8:
                Double d15 = (Double) obj;
                return (d15 == null || (strValueOf2 = String.valueOf((int) d15.doubleValue())) == null) ? "" : strValueOf2;
            case 9:
                k0 k0Var = (k0) obj;
                zz2.b bVar4 = zz2.b.f207647a;
                k0Var.getClass();
                h0.n(k0Var, "DragHandle");
                return Unit.INSTANCE;
            default:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.t(k0Var2, "Bottom Sheet");
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(zy1.d dVar, int i14) {
        this.f207198a = i14;
    }
}
