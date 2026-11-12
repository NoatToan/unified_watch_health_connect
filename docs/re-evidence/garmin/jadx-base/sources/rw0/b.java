package rw0;

import android.content.ComponentCallbacks;
import androidx.lifecycle.b0;
import com.garmin.android.apps.connectmobile.view.GCMMapPreview;
import f4.v;
import g01.x;
import h4.r;
import i3.e5;
import java.util.List;
import l72.i3;
import lc.u0;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.math.MathKt;
import p13.j0;
import s1.a1;
import s1.q;
import s1.w1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154821a;

    public /* synthetic */ b(int i14) {
        this.f154821a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, o13.l] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        switch (this.f154821a) {
            case 0:
                GCMMapPreview gCMMapPreview = (GCMMapPreview) obj;
                gCMMapPreview.getClass();
                gCMMapPreview.c();
                return Unit.INSTANCE;
            case 1:
                GCMMapPreview gCMMapPreview2 = (GCMMapPreview) obj;
                gCMMapPreview2.getClass();
                Object tag = gCMMapPreview2.getTag();
                tag.getClass();
                m mVar = (m) tag;
                ComponentCallbacks componentCallbacks = mVar.f154849a;
                j jVar = mVar.f154850b;
                gCMMapPreview2.getContext().unregisterComponentCallbacks(componentCallbacks);
                if (jVar.f154840b.compareTo(b0.b.INITIALIZED) > 0) {
                    jVar.b(b0.b.DESTROYED);
                }
                gCMMapPreview2.setTag(null);
                return Unit.INSTANCE;
            case 2:
                ((GCMMapPreview) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                ((i3) obj).getClass();
                return Unit.INSTANCE;
            case 4:
                r rVar = (r) obj;
                rVar.getClass();
                return l4.k.a(rVar, 0.5f);
            case 5:
                return Unit.INSTANCE;
            case 6:
                a1 a1Var = (a1) obj;
                long j8 = a1Var.f155466f;
                ((v) w1.f155836b.getValue()).d(a1Var, w1.f155835a, a1Var.f155467g);
                long j14 = a1Var.f155466f;
                if (j8 != j14) {
                    a1.b bVar = a1Var.f155474n;
                    if (bVar != null) {
                        if (bVar.f155478a > j14) {
                            a1Var.l();
                        } else {
                            bVar.f155484g = j14;
                            if (bVar.f155479b == null) {
                                bVar.f155485h = MathKt.d((1.0d - ((double) bVar.f155482e.a(0))) * a1Var.f155466f);
                            }
                        }
                    } else if (j14 != 0) {
                        a1Var.o();
                    }
                }
                return Unit.INSTANCE;
            case 7:
                ((e23.a) obj).invoke();
                return Unit.INSTANCE;
            case 8:
                return new s1.n(((Float) obj).floatValue());
            case 9:
                return new s1.n(((Integer) obj).intValue());
            case 10:
                return Integer.valueOf((int) ((s1.n) obj).f155642a);
            case 11:
                return new s1.n(((g6.f) obj).f75997a);
            case 12:
                return g6.f.a(((s1.n) obj).f155642a);
            case 13:
                g6.g gVar = (g6.g) obj;
                return new s1.o(g6.g.b(gVar.f75999a), g6.g.c(gVar.f75999a));
            case 14:
                s1.o oVar = (s1.o) obj;
                float f14 = oVar.f155672a;
                g6.f.a aVar = g6.f.f75994b;
                return g6.g.a((((long) Float.floatToRawIntBits(oVar.f155673b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f14)) << 32));
            case 15:
                n4.g gVar2 = (n4.g) obj;
                return new s1.o(Float.intBitsToFloat((int) (gVar2.f123561a >> 32)), Float.intBitsToFloat((int) (4294967295L & gVar2.f123561a)));
            case 16:
                s1.o oVar2 = (s1.o) obj;
                return n4.g.a((((long) Float.floatToRawIntBits(oVar2.f155673b)) & 4294967295L) | (((long) Float.floatToRawIntBits(oVar2.f155672a)) << 32));
            case 17:
                n4.c cVar = (n4.c) obj;
                return new s1.o(Float.intBitsToFloat((int) (cVar.f123544a >> 32)), Float.intBitsToFloat((int) (4294967295L & cVar.f123544a)));
            case 18:
                s1.o oVar3 = (s1.o) obj;
                return n4.c.a((((long) Float.floatToRawIntBits(oVar3.f155673b)) & 4294967295L) | (((long) Float.floatToRawIntBits(oVar3.f155672a)) << 32));
            case 19:
                long j15 = ((g6.k) obj).f76005a;
                return new s1.o((int) (j15 >> 32), (int) (4294967295L & j15));
            case 20:
                s1.o oVar4 = (s1.o) obj;
                return g6.k.a((((long) Math.round(oVar4.f155673b)) & 4294967295L) | (((long) Math.round(oVar4.f155672a)) << 32));
            case 21:
                long j16 = ((g6.m) obj).f76013a;
                return new s1.o((int) (j16 >> 32), (int) (4294967295L & j16));
            case 22:
                s1.o oVar5 = (s1.o) obj;
                int iRound = Math.round(oVar5.f155672a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(oVar5.f155673b);
                return g6.m.a((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32));
            case 23:
                n4.d dVar = (n4.d) obj;
                return new q(dVar.f123547a, dVar.f123548b, dVar.f123549c, dVar.f123550d);
            case 24:
                q qVar = (q) obj;
                return new n4.d(qVar.f155695a, qVar.f155696b, qVar.f155697c, qVar.f155698d);
            case 25:
                return Float.valueOf(((s1.n) obj).f155642a);
            case 26:
                g01.g gVar3 = (g01.g) obj;
                int i14 = s11.e.f155898m;
                gVar3.getClass();
                List<x> list = gVar3.f74183b;
                return list == null ? j0.f134944a : list;
            case 27:
                x xVar = (x) obj;
                int i15 = s11.e.f155898m;
                xVar.getClass();
                return xVar.b();
            case 28:
                b11.l lVar = (b11.l) obj;
                int i16 = s11.e.f155898m;
                lVar.getClass();
                return Long.valueOf(lVar.f14331a);
            default:
                Module module = (Module) obj;
                s41.b bVar2 = s41.b.f157060a;
                module.getClass();
                rk2.b bVar3 = new rk2.b(objArr5 == true ? 1 : 0, 14);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Singleton;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                SingleInstanceFactory<?> singleInstanceFactoryP = u0.p(new BeanDefinition(rootScopeQualifier, t0Var.b(r41.a.class), null, bVar3, kind, j0Var), module);
                if (module.get_createdAtStart()) {
                    module.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module, singleInstanceFactoryP);
                SingleInstanceFactory<?> singleInstanceFactoryP2 = u0.p(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(d60.b.class), null, new rk2.b(objArr4 == true ? 1 : 0, 15), kind, j0Var), module);
                if (module.get_createdAtStart()) {
                    module.prepareForCreationAtStart(singleInstanceFactoryP2);
                }
                new KoinDefinition(module, singleInstanceFactoryP2);
                rk2.b bVar4 = new rk2.b(objArr3 == true ? 1 : 0, 16);
                StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var.b(p51.c.class), null, bVar4, kind2, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(p51.e.class), null, new rk2.b(objArr2 == true ? 1 : 0, 17), kind2, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(p51.b.class), null, new rk2.b(objArr == true ? 1 : 0, 18), kind2, j0Var), module));
                return Unit.INSTANCE;
        }
    }
}
