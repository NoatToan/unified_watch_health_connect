package o72;

import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.terrain.generated.TerrainState;
import com.mapbox.maps.extension.style.layers.generated.LineLayerDsl;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayerDsl;
import i3.e5;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130722a;

    public /* synthetic */ z0(int i14) {
        this.f130722a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = 7;
        switch (this.f130722a) {
            case 0:
                ((Integer) obj).intValue();
                a1 a1Var = a1.f130295a;
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj).intValue();
                a1 a1Var2 = a1.f130295a;
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj).intValue();
                a1 a1Var3 = a1.f130295a;
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj).intValue();
                a1 a1Var4 = a1.f130295a;
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj).intValue();
                a1 a1Var5 = a1.f130295a;
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj).intValue();
                a1 a1Var6 = a1.f130295a;
                return Unit.INSTANCE;
            case 6:
                e1 e1Var = e1.f130368a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                m4.g0 g0Var = (m4.g0) obj;
                g0Var.getClass();
                g0Var.a();
                return Unit.INSTANCE;
            case 9:
                f2.j0 j0Var = (f2.j0) obj;
                j0Var.getClass();
                n0.f130486a.getClass();
                f2.j0.j(j0Var, null, n0.f130488c, 7);
                f2.j0.j(j0Var, null, n0.f130490e, 7);
                f2.j0.j(j0Var, null, n0.f130492g, 7);
                f2.j0.j(j0Var, null, n0.f130494i, 7);
                f2.j0.j(j0Var, null, n0.f130496k, 7);
                f2.j0.j(j0Var, null, n0.f130498m, 7);
                f2.j0.j(j0Var, null, n0.f130500o, 7);
                f2.j0.j(j0Var, null, n0.f130502q, 7);
                return Unit.INSTANCE;
            case 10:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 11:
                x5.l0 l0Var = (x5.l0) obj;
                l0Var.getClass();
                return l0Var;
            case 12:
                x5.l0 l0Var2 = (x5.l0) obj;
                l0Var2.getClass();
                String str = l0Var2.f188878a.f157138b;
                StringBuilder sb3 = new StringBuilder();
                int length = str.length();
                for (int i15 = 0; i15 < length; i15++) {
                    char cCharAt = str.charAt(i15);
                    if (Character.isDigit(cCharAt)) {
                        sb3.append(cCharAt);
                    }
                }
                return x5.l0.a(l0Var2, sb3.toString(), 0L, 6);
            case 13:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 18:
                Module module = (Module) obj;
                o80.a aVar = o80.a.f130832a;
                module.getClass();
                o3 o3Var = new o3(i14);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Singleton;
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                SingleInstanceFactory<?> singleInstanceFactoryP = lc.u0.p(new BeanDefinition(rootScopeQualifier, t0Var.b(m80.a.class), null, o3Var, kind, j0Var2), module);
                if (module.get_createdAtStart()) {
                    module.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module, singleInstanceFactoryP);
                o3 o3Var2 = new o3(8);
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(p80.f.class), null, o3Var2, Kind.Factory, j0Var2), module));
                return Unit.INSTANCE;
            case 19:
                oi0.b bVar = (oi0.b) obj;
                int i16 = o81.a.f130834f;
                bVar.getClass();
                bVar.V();
                return Unit.INSTANCE;
            case 20:
                oi0.b bVar2 = (oi0.b) obj;
                int i17 = o81.a.f130834f;
                bVar2.getClass();
                bVar2.V();
                return Unit.INSTANCE;
            case 21:
                oi0.b bVar3 = (oi0.b) obj;
                int i18 = o81.a.f130834f;
                bVar3.getClass();
                bVar3.V();
                return Unit.INSTANCE;
            case 22:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                oe.n nVar = (oe.n) obj;
                oe.n.a aVar2 = oe.n.a.f131243a;
                nVar.getClass();
                return nVar;
            case 24:
                je2.a aVar3 = (je2.a) obj;
                oe2.e.a aVar4 = oe2.e.f131472d;
                aVar3.getClass();
                return new oe2.e(aVar3);
            case 25:
                TerrainState terrainState = (TerrainState) obj;
                terrainState.getClass();
                terrainState.setExaggeration(new DoubleValue(1.0d));
                return Unit.INSTANCE;
            case 26:
                ((SymbolLayerDsl) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                ((SymbolLayerDsl) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                ((LineLayerDsl) obj).getClass();
                return Unit.INSTANCE;
            default:
                ((LineLayerDsl) obj).getClass();
                return Unit.INSTANCE;
        }
    }
}
