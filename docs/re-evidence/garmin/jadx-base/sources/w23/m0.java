package w23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p43.a2;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m0 extends p implements t23.q0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f181654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f181655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t23.a0 f181656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t23.r0 f181657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f181658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t23.b.a f181659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t23.r f181660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t23.v f181661l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(t23.a0 a0Var, t23.r rVar, t23.r0 r0Var, u23.h hVar, x33.f fVar, boolean z14, boolean z15, boolean z16, t23.b.a aVar, t23.y0 y0Var) {
        super(r0Var.d(), hVar, fVar, y0Var);
        if (a0Var == null) {
            y(0);
            throw null;
        }
        if (rVar == null) {
            y(1);
            throw null;
        }
        if (r0Var == null) {
            y(2);
            throw null;
        }
        if (hVar == null) {
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
        this.f181661l = null;
        this.f181656g = a0Var;
        this.f181660k = rVar;
        this.f181657h = r0Var;
        this.f181654e = z14;
        this.f181655f = z15;
        this.f181658i = z16;
        this.f181659j = aVar;
    }

    public static /* synthetic */ void y(int i14) {
        String str;
        int i15;
        switch (i14) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i14) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i15 = 2;
                break;
            case 7:
            default:
                i15 = 3;
                break;
        }
        Object[] objArr = new Object[i15];
        switch (i14) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i14) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i14) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i14) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // t23.v
    public final boolean C() {
        return false;
    }

    @Override // t23.v
    public final boolean C0() {
        return false;
    }

    @Override // w23.p, w23.o, t23.l
    /* JADX INFO: renamed from: D0 */
    public abstract t23.q0 a();

    public final ArrayList E0(boolean z14) {
        ArrayList arrayList = new ArrayList(0);
        Iterator<? extends t23.b> it = p0().o().iterator();
        while (it.hasNext()) {
            t23.r0 r0Var = (t23.r0) it.next();
            u23.a getter = z14 ? r0Var.getGetter() : r0Var.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // t23.a
    public final t23.u0 H() {
        return p0().H();
    }

    @Override // t23.a
    public final t23.u0 I() {
        return p0().I();
    }

    @Override // t23.a
    public final boolean M() {
        return false;
    }

    @Override // t23.z
    public final boolean O() {
        return false;
    }

    @Override // t23.a
    public final List<t23.u0> S() {
        List<t23.u0> listS = p0().S();
        if (listS != null) {
            return listS;
        }
        y(14);
        throw null;
    }

    @Override // t23.v
    public final boolean W() {
        return false;
    }

    @Override // t23.v, t23.a1
    public final t23.v b(a2 a2Var) {
        if (a2Var != null) {
            return this;
        }
        y(7);
        throw null;
    }

    @Override // t23.b
    public final t23.b f0(t23.e eVar, t23.a0 a0Var, t23.p pVar, t23.b.a aVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // t23.z
    public final t23.a0 g() {
        t23.a0 a0Var = this.f181656g;
        if (a0Var != null) {
            return a0Var;
        }
        y(10);
        throw null;
    }

    @Override // t23.b
    public final t23.b.a getKind() {
        t23.b.a aVar = this.f181659j;
        if (aVar != null) {
            return aVar;
        }
        y(6);
        throw null;
    }

    @Override // t23.a
    public final List<d1> getTypeParameters() {
        List<d1> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        y(9);
        throw null;
    }

    @Override // t23.o
    public final t23.r getVisibility() {
        t23.r rVar = this.f181660k;
        if (rVar != null) {
            return rVar;
        }
        y(11);
        throw null;
    }

    @Override // t23.b
    public final void i0(Collection<? extends t23.b> collection) {
        if (collection != null) {
            return;
        }
        y(16);
        throw null;
    }

    @Override // t23.z
    public final boolean isExternal() {
        return this.f181655f;
    }

    @Override // t23.v
    public final boolean isInfix() {
        return false;
    }

    @Override // t23.v
    public final boolean isInline() {
        return this.f181658i;
    }

    @Override // t23.v
    public final boolean isOperator() {
        return false;
    }

    @Override // t23.v
    public final boolean isSuspend() {
        return false;
    }

    @Override // t23.q0
    public final boolean n0() {
        return this.f181654e;
    }

    @Override // t23.q0
    public final t23.r0 p0() {
        t23.r0 r0Var = this.f181657h;
        if (r0Var != null) {
            return r0Var;
        }
        y(13);
        throw null;
    }

    @Override // t23.z
    public final boolean q0() {
        return false;
    }

    @Override // t23.a
    public final <V> V v(t23.a.InterfaceC3056a<V> interfaceC3056a) {
        return null;
    }

    @Override // t23.v
    public final t23.v y0() {
        return this.f181661l;
    }

    @Override // t23.a1
    public final /* bridge */ /* synthetic */ t23.m b(a2 a2Var) {
        b(a2Var);
        return this;
    }
}
