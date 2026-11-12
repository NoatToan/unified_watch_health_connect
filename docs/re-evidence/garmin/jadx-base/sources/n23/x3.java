package n23;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f122660a = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:17:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:18:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:23:0x025b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0264 A[LOOP:0: B:20:0x024b->B:26:0x0264, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0263 A[SYNTHETIC] */
    public static final y23.i a(Class<?> cls) {
        y23.f fVar;
        h33.h0 h0Var;
        h33.h0 h0Var2;
        t4 t4Var;
        y23.i iVar;
        t4 t4Var2;
        WeakReference weakReference;
        y23.i iVar2;
        cls.getClass();
        ClassLoader classLoaderD = z23.f.d(cls);
        t4 t4Var3 = new t4(classLoaderD);
        ConcurrentHashMap concurrentHashMap = f122660a;
        WeakReference weakReference2 = (WeakReference) concurrentHashMap.get(t4Var3);
        if (weakReference2 != null) {
            y23.i iVar3 = (y23.i) weakReference2.get();
            if (iVar3 != null) {
                return iVar3;
            }
            concurrentHashMap.remove(t4Var3, weakReference2);
        }
        y23.i.f194354c.getClass();
        y23.f fVar2 = new y23.f(classLoaderD);
        q33.l.a aVar = q33.l.f142508b;
        ClassLoader classLoader = Unit.class.getClassLoader();
        classLoader.getClass();
        y23.f fVar3 = new y23.f(classLoader);
        y23.d dVar = new y23.d(classLoaderD);
        y23.h hVar = y23.h.f194353b;
        y23.j jVar = y23.j.f194357a;
        aVar.getClass();
        hVar.getClass();
        jVar.getClass();
        o43.e eVar = new o43.e("DeserializationComponentsForJava.ModuleData");
        s23.k kVar = new s23.k(eVar, s23.k.a.FROM_DEPENDENCIES);
        w23.i0 i0Var = new w23.i0(x33.f.g("<" + ("runtime module for " + classLoaderD) + '>'), eVar, kVar, null, null, null, 56, null);
        kVar.f105836d.b(new q23.e(kVar, i0Var));
        kVar.f156269f = new s23.i(i0Var, true);
        q33.o oVar = new q33.o();
        k33.m mVar = new k33.m();
        t23.g0 g0Var = new t23.g0(eVar, i0Var);
        q33.c0.a aVar2 = q33.c0.a.f142446a;
        aVar2.getClass();
        h33.x.a aVar3 = h33.x.f81510d;
        o13.j jVar2 = new o13.j(1, 9);
        aVar3.getClass();
        h33.v vVar = h33.u.f81503d;
        o13.j jVar3 = vVar.f81507b;
        if (jVar3 != null) {
            fVar = fVar3;
            if (jVar3.f128587d - jVar2.f128587d <= 0) {
                h0Var = vVar.f81508c;
            }
            h0Var.getClass();
            if (h0Var == h33.h0.WARN) {
                h0Var2 = null;
            } else {
                h0Var2 = h0Var;
            }
            h33.x xVar = new h33.x(new h33.a0(h0Var, h0Var2, null, 4, null), new h33.w(jVar2));
            i33.o.a aVar4 = i33.o.f90813a;
            aVar4.getClass();
            i33.j.a aVar5 = i33.j.f90806a;
            aVar5.getClass();
            i33.i.a aVar6 = i33.i.a.f90805a;
            t4Var = t4Var3;
            p13.j0 j0Var = p13.j0.f134944a;
            h43.b bVar = new h43.b(eVar, j0Var);
            t23.b1.a aVar7 = t23.b1.a.f161998a;
            y23.f fVar4 = fVar;
            b33.a.C0220a c0220a = b33.a.C0220a.f15678a;
            p005kotlin.reflect.jvm.internal.impl.builtins.e eVar2 = new p005kotlin.reflect.jvm.internal.impl.builtins.e(i0Var, g0Var);
            h33.d dVar2 = new h33.d(xVar);
            k33.d.a aVar8 = k33.d.a.f102775a;
            p33.n1 n1Var = new p33.n1(new p33.i(aVar8));
            h33.p.a aVar9 = h33.p.a.f81485a;
            q43.n.f142806b.getClass();
            q43.o oVar2 = q43.n.a.f142808b;
            k33.h hVar2 = new k33.h(new k33.c(eVar, dVar, fVar2, oVar, aVar4, hVar, aVar5, aVar6, bVar, jVar, mVar, aVar2, aVar7, c0220a, i0Var, eVar2, dVar2, n1Var, aVar9, aVar8, oVar2, xVar, new q33.m(), null, 8388608, null));
            u33.c cVar = u33.c.f168324g;
            cVar.getClass();
            q33.p pVar = new q33.p(fVar2, oVar);
            q33.j jVar4 = new q33.j(i0Var, g0Var, eVar, fVar2);
            jVar4.f142487h = cVar;
            l43.o.a aVar10 = l43.o.a.f110075a;
            l43.m.f110048a.getClass();
            q33.l lVar = new q33.l(eVar, i0Var, aVar10, pVar, jVar4, hVar2, g0Var, hVar, c0220a, l43.m.a.f110050b, oVar2, new s43.a(p13.w.c(p43.v.f135927a)));
            l43.n nVar = lVar.f142509a;
            nVar.getClass();
            oVar.f142518a = nVar;
            g43.b bVar2 = new g43.b(hVar2, aVar5);
            mVar.f102795a = bVar2;
            s23.y yVar = new s23.y(eVar, fVar4, i0Var, g0Var, kVar.L(), kVar.L(), aVar10, oVar2, new h43.b(eVar, j0Var));
            List listI0 = p13.u.i0(new w23.i0[]{i0Var});
            listI0.getClass();
            p13.l0 l0Var = p13.l0.f134950a;
            l0Var.getClass();
            i0Var.f181625g = new w23.f0(listI0, l0Var, j0Var, l0Var);
            i0Var.f181626h = new w23.n(p13.x.k(bVar2.f75850a, yVar), "CompositeProvider@RuntimeModuleData for " + i0Var);
            q33.l.a.C2678a c2678a = new q33.l.a.C2678a(lVar, oVar);
            iVar = new y23.i(c2678a.f142510a.f142509a, new y23.a(c2678a.f142511b, fVar2), null);
            while (true) {
                t4Var2 = t4Var;
                weakReference = (WeakReference) concurrentHashMap.putIfAbsent(t4Var2, new WeakReference(iVar));
                if (weakReference == null) {
                    return iVar;
                }
                iVar2 = (y23.i) weakReference.get();
                if (iVar2 != null) {
                    return iVar2;
                }
                concurrentHashMap.remove(t4Var2, weakReference);
                t4Var = t4Var2;
            }
        } else {
            fVar = fVar3;
        }
        h0Var = vVar.f81506a;
        h0Var.getClass();
        if (h0Var == h33.h0.WARN) {
            h0Var2 = null;
        } else {
            h0Var2 = h0Var;
        }
        h33.x xVar2 = new h33.x(new h33.a0(h0Var, h0Var2, null, 4, null), new h33.w(jVar2));
        i33.o.a aVar11 = i33.o.f90813a;
        aVar11.getClass();
        i33.j.a aVar12 = i33.j.f90806a;
        aVar12.getClass();
        i33.i.a aVar13 = i33.i.a.f90805a;
        t4Var = t4Var3;
        p13.j0 j0Var2 = p13.j0.f134944a;
        h43.b bVar3 = new h43.b(eVar, j0Var2);
        t23.b1.a aVar14 = t23.b1.a.f161998a;
        y23.f fVar5 = fVar;
        b33.a.C0220a c0220a2 = b33.a.C0220a.f15678a;
        p005kotlin.reflect.jvm.internal.impl.builtins.e eVar3 = new p005kotlin.reflect.jvm.internal.impl.builtins.e(i0Var, g0Var);
        h33.d dVar3 = new h33.d(xVar2);
        k33.d.a aVar15 = k33.d.a.f102775a;
        p33.n1 n1Var2 = new p33.n1(new p33.i(aVar15));
        h33.p.a aVar16 = h33.p.a.f81485a;
        q43.n.f142806b.getClass();
        q43.o oVar3 = q43.n.a.f142808b;
        k33.h hVar3 = new k33.h(new k33.c(eVar, dVar, fVar2, oVar, aVar11, hVar, aVar12, aVar13, bVar3, jVar, mVar, aVar2, aVar14, c0220a2, i0Var, eVar3, dVar3, n1Var2, aVar16, aVar15, oVar3, xVar2, new q33.m(), null, 8388608, null));
        u33.c cVar2 = u33.c.f168324g;
        cVar2.getClass();
        q33.p pVar2 = new q33.p(fVar2, oVar);
        q33.j jVar5 = new q33.j(i0Var, g0Var, eVar, fVar2);
        jVar5.f142487h = cVar2;
        l43.o.a aVar17 = l43.o.a.f110075a;
        l43.m.f110048a.getClass();
        q33.l lVar2 = new q33.l(eVar, i0Var, aVar17, pVar2, jVar5, hVar3, g0Var, hVar, c0220a2, l43.m.a.f110050b, oVar3, new s43.a(p13.w.c(p43.v.f135927a)));
        l43.n nVar2 = lVar2.f142509a;
        nVar2.getClass();
        oVar.f142518a = nVar2;
        g43.b bVar4 = new g43.b(hVar3, aVar12);
        mVar.f102795a = bVar4;
        s23.y yVar2 = new s23.y(eVar, fVar5, i0Var, g0Var, kVar.L(), kVar.L(), aVar17, oVar3, new h43.b(eVar, j0Var2));
        List listI1 = p13.u.i0(new w23.i0[]{i0Var});
        listI1.getClass();
        p13.l0 l0Var2 = p13.l0.f134950a;
        l0Var2.getClass();
        i0Var.f181625g = new w23.f0(listI1, l0Var2, j0Var2, l0Var2);
        i0Var.f181626h = new w23.n(p13.x.k(bVar4.f75850a, yVar2), "CompositeProvider@RuntimeModuleData for " + i0Var);
        q33.l.a.C2678a c2678a2 = new q33.l.a.C2678a(lVar2, oVar);
        iVar = new y23.i(c2678a2.f142510a.f142509a, new y23.a(c2678a2.f142511b, fVar2), null);
        while (true) {
            t4Var2 = t4Var;
            weakReference = (WeakReference) concurrentHashMap.putIfAbsent(t4Var2, new WeakReference(iVar));
            if (weakReference == null) {
                return iVar;
            }
            iVar2 = (y23.i) weakReference.get();
            if (iVar2 != null) {
                return iVar2;
            }
            concurrentHashMap.remove(t4Var2, weakReference);
            t4Var = t4Var2;
        }
    }
}
