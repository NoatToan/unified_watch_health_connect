package p005kotlin.reflect.jvm.internal.impl.load.java;

import c2.o3;
import c53.c0;
import c53.h;
import c53.h0;
import c53.j;
import c53.q;
import c53.s;
import h33.m;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import p005kotlin.reflect.jvm.internal.impl.resolve.b;
import p13.g0;
import p13.j0;
import p13.u;
import p13.x;
import p43.a2;
import p43.n0;
import t23.d1;
import t23.e;
import t23.j1;
import t23.u0;
import t23.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105901a;

        static {
            int[] iArr = new int[b.c.a.values().length];
            try {
                iArr[b.c.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f105901a = iArr;
        }
    }

    @Override // p005kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.a getContract() {
        return ExternalOverridabilityCondition.a.SUCCESS_ONLY;
    }

    @Override // p005kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.b isOverridable(t23.a aVar, t23.a aVar2, e eVar) {
        aVar.getClass();
        aVar2.getClass();
        if (aVar2 instanceof j33.e) {
            j33.e eVar2 = (j33.e) aVar2;
            if (eVar2.getTypeParameters().isEmpty()) {
                b.c cVarK = b.k(aVar, aVar2);
                if ((cVarK != null ? cVarK.b() : null) != null) {
                    return ExternalOverridabilityCondition.b.UNKNOWN;
                }
                List<j1> listF = eVar2.f();
                listF.getClass();
                h0 h0VarO = c0.o(new g0(listF), m.f81478a);
                n0 n0Var = eVar2.f181725g;
                n0Var.getClass();
                j jVarV = u.v(new j[]{h0VarO, new s(n0Var)});
                jVarV.getClass();
                h hVarC = q.c(jVarV, new o3(15));
                u0 u0Var = eVar2.f181727i;
                List listL = x.l(u0Var != null ? u0Var.getType() : null);
                listL.getClass();
                j jVarV2 = u.v(new j[]{hVarC, new g0(listL)});
                jVarV2.getClass();
                h.a aVar3 = new h.a(q.c(jVarV2, new o3(15)));
                while (aVar3.hasNext()) {
                    n0 n0Var2 = (n0) aVar3.next();
                    if (!n0Var2.D0().isEmpty() && !(n0Var2.I0() instanceof m33.j)) {
                        return ExternalOverridabilityCondition.b.UNKNOWN;
                    }
                }
                t23.a aVarB = aVar.b(a2.e(new m33.h(null, 1, null)));
                if (aVarB == null) {
                    return ExternalOverridabilityCondition.b.UNKNOWN;
                }
                if (aVarB instanceof x0) {
                    x0 x0Var = (x0) aVarB;
                    List<d1> typeParameters = x0Var.getTypeParameters();
                    typeParameters.getClass();
                    if (!typeParameters.isEmpty()) {
                        aVarB = x0Var.j0().j(j0.f134944a).build();
                        aVarB.getClass();
                    }
                }
                b.c.a aVarB2 = b.f105945f.p(false, aVarB, aVar2).b();
                aVarB2.getClass();
                return a.f105901a[aVarB2.ordinal()] == 1 ? ExternalOverridabilityCondition.b.OVERRIDABLE : ExternalOverridabilityCondition.b.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition.b.UNKNOWN;
    }
}
