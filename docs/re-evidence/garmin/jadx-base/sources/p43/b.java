package p43;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o43.n nVar) {
        super(nVar);
        if (nVar != null) {
        } else {
            l(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static /* synthetic */ void l(int i14) {
        String str = (i14 == 1 || i14 == 3 || i14 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 1 || i14 == 3 || i14 == 4) ? 2 : 3];
        if (i14 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i14 == 2) {
            objArr[0] = "classifier";
        } else if (i14 == 3 || i14 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i14 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i14 == 3 || i14 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i14 != 1) {
            if (i14 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i14 != 3 && i14 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i14 != 1 && i14 != 3 && i14 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p43.t
    public final boolean a(t23.h hVar) {
        boolean z14;
        if (hVar instanceof t23.e) {
            t23.e eVarT = t();
            eVarT.getClass();
            if (!p005kotlin.jvm.internal.s.g(eVarT.getName(), hVar.getName())) {
                z14 = false;
                break;
            }
            t23.l lVarD = eVarT.d();
            t23.l lVarD2 = hVar.d();
            while (true) {
                if (lVarD != null && lVarD2 != null) {
                    if (!(lVarD instanceof t23.c0)) {
                        if (!(lVarD2 instanceof t23.c0)) {
                            if (lVarD instanceof t23.h0) {
                                if (!(lVarD2 instanceof t23.h0) || !p005kotlin.jvm.internal.s.g(((t23.h0) lVarD).c(), ((t23.h0) lVarD2).c())) {
                                    break;
                                }
                            } else if (!(lVarD2 instanceof t23.h0) && p005kotlin.jvm.internal.s.g(lVarD.getName(), lVarD2.getName())) {
                                lVarD = lVarD.d();
                                lVarD2 = lVarD2.d();
                            }
                        }
                        z14 = false;
                        break;
                    }
                    z14 = lVarD2 instanceof t23.c0;
                    break;
                }
                z14 = true;
                break;
            }
            if (z14) {
                return true;
            }
        }
        return false;
    }

    @Override // p43.m1
    public final p005kotlin.reflect.jvm.internal.impl.builtins.d e() {
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE = f43.e.e(t());
        if (dVarE != null) {
            return dVarE;
        }
        l(1);
        throw null;
    }

    @Override // p43.n
    public final n0 f() {
        t23.e eVarT = t();
        if (eVarT == null) {
            p005kotlin.reflect.jvm.internal.impl.builtins.d.a(107);
            throw null;
        }
        x33.f fVar = p005kotlin.reflect.jvm.internal.impl.builtins.d.f105832e;
        if (p005kotlin.reflect.jvm.internal.impl.builtins.d.b(eVarT, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105869b) || p005kotlin.reflect.jvm.internal.impl.builtins.d.b(eVarT, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105871c)) {
            return null;
        }
        return e().e();
    }

    @Override // p43.n
    public final Collection<n0> g(boolean z14) {
        t23.l lVarD = t().d();
        if (!(lVarD instanceof t23.e)) {
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            l(3);
            throw null;
        }
        z43.i iVar = new z43.i();
        t23.e eVar = (t23.e) lVarD;
        iVar.add(eVar.p());
        t23.e eVarU0 = eVar.u0();
        if (z14 && eVarU0 != null) {
            iVar.add(eVarU0.p());
        }
        return iVar;
    }

    @Override // p43.m1
    /* JADX INFO: renamed from: m */
    public abstract t23.e t();
}
