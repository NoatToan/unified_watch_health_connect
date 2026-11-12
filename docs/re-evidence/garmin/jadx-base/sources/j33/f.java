package j33;

import h33.c0;
import java.util.ArrayList;
import o13.p;
import o43.k;
import p13.j0;
import p33.s1;
import p43.d2;
import q23.m;
import q43.s;
import t23.a0;
import t23.j;
import t23.j1;
import t23.l;
import t23.r;
import t23.r0;
import t23.t0;
import t23.y0;
import u23.h;
import w23.n0;
import w23.o0;
import w23.p0;
import w23.q0;

/* JADX INFO: loaded from: classes3.dex */
public class f extends n0 implements a {
    public final boolean D;
    public final p<t23.a.InterfaceC3056a<?>, ?> E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, h hVar, a0 a0Var, r rVar, boolean z14, x33.f fVar, y0 y0Var, r0 r0Var, t23.b.a aVar, boolean z15, p<t23.a.InterfaceC3056a<?>, ?> pVar) {
        super(lVar, r0Var, hVar, a0Var, rVar, z14, fVar, aVar, y0Var, false, false, false, false, false, false);
        if (lVar == null) {
            y(0);
            throw null;
        }
        if (hVar == null) {
            y(1);
            throw null;
        }
        if (a0Var == null) {
            y(2);
            throw null;
        }
        if (rVar == null) {
            y(3);
            throw null;
        }
        if (fVar == null) {
            y(4);
            throw null;
        }
        if (y0Var == null) {
            y(5);
            throw null;
        }
        if (aVar == null) {
            y(6);
            throw null;
        }
        this.D = z15;
        this.E = pVar;
    }

    public static f L0(l lVar, k33.f fVar, a0 a0Var, r rVar, boolean z14, x33.f fVar2, n33.a aVar, boolean z15) {
        if (lVar == null) {
            y(7);
            throw null;
        }
        if (a0Var == null) {
            y(9);
            throw null;
        }
        if (fVar2 == null) {
            y(11);
            throw null;
        }
        if (aVar != null) {
            return new f(lVar, fVar, a0Var, rVar, z14, fVar2, aVar, null, t23.b.a.DECLARATION, z15, null);
        }
        y(12);
        throw null;
    }

    public static /* synthetic */ void y(int i14) {
        String str = i14 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i14 != 21 ? 3 : 2];
        switch (i14) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i14 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i14) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // w23.n0
    public final n0 H0(l lVar, a0 a0Var, r rVar, r0 r0Var, t23.b.a aVar, x33.f fVar, y0 y0Var) {
        if (lVar == null) {
            y(13);
            throw null;
        }
        if (a0Var == null) {
            y(14);
            throw null;
        }
        if (rVar == null) {
            y(15);
            throw null;
        }
        if (aVar == null) {
            y(16);
            throw null;
        }
        if (fVar == null) {
            y(17);
            throw null;
        }
        if (y0Var == null) {
            y(18);
            throw null;
        }
        return new f(lVar, getAnnotations(), a0Var, rVar, this.f181567f, fVar, y0Var, r0Var, aVar, this.D, this.E);
    }

    @Override // w23.n0
    public final void J0(p43.n0 n0Var) {
    }

    @Override // w23.z0, t23.a
    public final boolean M() {
        return false;
    }

    @Override // w23.n0, t23.k1
    public final boolean isConst() {
        p43.n0 type = getType();
        if (!this.D) {
            return false;
        }
        int i14 = j.f162025a;
        type.getClass();
        if (((!p005kotlin.reflect.jvm.internal.impl.builtins.d.H(type) && !m.a(type)) || d2.g(type)) && !p005kotlin.reflect.jvm.internal.impl.builtins.d.I(type)) {
            return false;
        }
        p33.h hVar = s1.f135515a;
        s sVar = s.f142813a;
        sVar.getClass();
        x33.c cVar = c0.f81434p;
        cVar.getClass();
        return !sVar.G0(type, cVar) || p005kotlin.reflect.jvm.internal.impl.builtins.d.I(type);
    }

    @Override // j33.a
    public final a l0(p43.n0 n0Var, ArrayList arrayList, p43.n0 n0Var2, p pVar) {
        p43.n0 n0Var3;
        o0 o0Var;
        p0 p0Var;
        q0 q0VarH = null;
        r0 r0VarA = a() == this ? null : a();
        f fVar = new f(d(), getAnnotations(), g(), getVisibility(), this.f181567f, getName(), getSource(), r0VarA, getKind(), this.D, pVar);
        o0 o0Var2 = this.f181679z;
        if (o0Var2 != null) {
            o0 o0Var3 = new o0(fVar, o0Var2.getAnnotations(), o0Var2.g(), o0Var2.getVisibility(), o0Var2.f181654e, o0Var2.f181655f, o0Var2.f181658i, getKind(), r0VarA == null ? null : r0VarA.getGetter(), o0Var2.getSource());
            o0Var3.f181661l = o0Var2.f181661l;
            n0Var3 = n0Var2;
            o0Var3.f181692m = n0Var3;
            o0Var = o0Var3;
        } else {
            n0Var3 = n0Var2;
            o0Var = null;
        }
        t0 t0Var = this.A;
        if (t0Var != null) {
            p0Var = new p0(fVar, t0Var.getAnnotations(), t0Var.g(), t0Var.getVisibility(), t0Var.n0(), t0Var.isExternal(), t0Var.isInline(), getKind(), r0VarA == null ? null : r0VarA.getSetter(), t0Var.getSource());
            p0Var.f181661l = p0Var.f181661l;
            j1 j1Var = t0Var.f().get(0);
            if (j1Var == null) {
                p0.y(6);
                throw null;
            }
            p0Var.f181696m = j1Var;
        } else {
            p0Var = null;
        }
        fVar.I0(o0Var, p0Var, this.B, this.C);
        e23.a<k<d43.g<?>>> aVar = this.f181569h;
        if (aVar != null) {
            fVar.E0(this.f181568g, aVar);
        }
        fVar.i0(o());
        if (n0Var != null) {
            h.f168226x0.getClass();
            q0VarH = b43.h.h(this, n0Var, h.a.f168228b);
        }
        fVar.K0(n0Var3, getTypeParameters(), this.f181676w, q0VarH, j0.f134944a);
        return fVar;
    }

    @Override // w23.n0, t23.a
    public final <V> V v(t23.a.InterfaceC3056a<V> interfaceC3056a) {
        p<t23.a.InterfaceC3056a<?>, ?> pVar = this.E;
        if (pVar == null || !pVar.f128594a.equals(interfaceC3056a)) {
            return null;
        }
        return (V) pVar.f128595b;
    }
}
