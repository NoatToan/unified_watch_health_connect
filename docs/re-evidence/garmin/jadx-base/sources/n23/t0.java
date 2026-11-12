package n23;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0002B5\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0010B+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Ln23/t0;", "Ln23/p0;", "", "Ln23/z3;", "Lkotlin/jvm/internal/o;", "Ln23/i3;", TtmlNode.RUBY_CONTAINER, "", "name", "signature", "Lt23/v;", "descriptorInitialValue", "rawBoundReceiver", "<init>", "(Ln23/i3;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "descriptor", "(Ln23/i3;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "boundReceiver", "(Ln23/i3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t0 extends p0<Object> implements p005kotlin.jvm.internal.o<Object>, e23.a, e23.l, e23.b, e23.c, e23.d, e23.e, e23.f, e23.g, e23.h, e23.i, e23.j, e23.k, e23.p, e23.m, e23.n, e23.o, e23.q, e23.r, e23.s, e23.t, e23.u, e23.v, e23.w, k23.c, z3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f122612n = {p005kotlin.jvm.internal.s0.f105811a.h(new p005kotlin.jvm.internal.i0(t0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i3 f122613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f122614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f122615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c4.a f122616k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f122617l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f122618m;

    private t0(i3 i3Var, String str, String str2, t23.v vVar, Object obj) {
        this.f122613h = i3Var;
        this.f122614i = str2;
        this.f122615j = obj;
        this.f122616k = new c4.a(vVar, new q0(this, str));
        o13.n nVar = o13.n.PUBLICATION;
        this.f122617l = o13.m.a(nVar, new r0(this));
        this.f122618m = o13.m.a(nVar, new s0(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // n23.y3
    public final o23.h<?> A() {
        return (o23.h) this.f122617l.getValue();
    }

    public final o23.i<Constructor<?>> E(Constructor<?> constructor, t23.v vVar, boolean z14) {
        Object obj = this.f122615j;
        if (!z14) {
            t23.d dVar = vVar instanceof t23.d ? (t23.d) vVar : null;
            if (dVar != null && !t23.q.e(dVar.getVisibility())) {
                t23.e eVarE0 = dVar.e0();
                eVarE0.getClass();
                if (!b43.j.e(eVarE0) && !b43.i.o(dVar.e0())) {
                    List<t23.j1> listF = dVar.f();
                    listF.getClass();
                    if (!listF.isEmpty()) {
                        Iterator<T> it = listF.iterator();
                        while (it.hasNext()) {
                            p43.n0 type = ((t23.j1) it.next()).getType();
                            type.getClass();
                            if (o53.f0.J(type)) {
                                return gg.b.H(this) ? new o23.i.a(constructor, gl.b.h(obj, e())) : new o23.i.b(constructor);
                            }
                        }
                    }
                }
            }
        }
        return gg.b.H(this) ? new o23.i.c(constructor, gl.b.h(obj, e())) : new o23.i.e(constructor);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    public final o23.i.h F(Method method, boolean z14) {
        p43.n0 type;
        if (!gg.b.H(this)) {
            return new o23.i.h.g(method);
        }
        t23.u0 u0VarH = e().H();
        Object objH = this.f122615j;
        if (u0VarH == null || (type = u0VarH.getType()) == null) {
            objH = gl.b.h(objH, e());
        } else {
            int i14 = b43.j.f15729a;
            t23.h hVarT = type.F0().t();
            if (hVarT != null ? b43.j.b(hVarT) : false) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                Class cls = (Class) p13.u.H(parameterTypes);
                if (cls == null || !cls.isInterface()) {
                    objH = gl.b.h(objH, e());
                }
            } else {
                objH = gl.b.h(objH, e());
            }
        }
        return new o23.i.h.c(method, z14, objH);
    }

    @Override // n23.p0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final t23.v e() {
        k23.l<Object> lVar = f122612n[0];
        Object objInvoke = this.f122616k.invoke();
        objInvoke.getClass();
        return (t23.v) objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    public final boolean equals(Object obj) {
        z3 z3Var;
        x33.c cVar = s4.f122608a;
        if (obj instanceof z3) {
            z3Var = (z3) obj;
        } else if (obj instanceof p005kotlin.jvm.internal.p) {
            k23.c cVarCompute = ((p005kotlin.jvm.internal.p) obj).compute();
            if (cVarCompute instanceof z3) {
                z3Var = (z3) cVarCompute;
            } else {
                z3Var = null;
            }
        } else {
            z3Var = null;
        }
        return z3Var != null && p005kotlin.jvm.internal.s.g(this.f122613h, z3Var.getF122613h()) && getF122483i().equals(z3Var.getF122483i()) && p005kotlin.jvm.internal.s.g(this.f122614i, z3Var.getF122614i()) && p005kotlin.jvm.internal.s.g(this.f122615j, z3Var.getF122615j());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // n23.y3
    public final o23.h<?> f() {
        return (o23.h) this.f122618m.getValue();
    }

    @Override // p005kotlin.jvm.internal.o
    public final int getArity() {
        o23.h<?> hVarA = A();
        hVarA.getClass();
        return hVarA.b().size();
    }

    @Override // k23.c
    /* JADX INFO: renamed from: getName */
    public final String getF122483i() {
        String strB = e().getName().b();
        strB.getClass();
        return strB;
    }

    @Override // n23.z3
    /* JADX INFO: renamed from: getSignature, reason: from getter */
    public final String getF122614i() {
        return this.f122614i;
    }

    public final int hashCode() {
        return this.f122614i.hashCode() + ((getF122483i().hashCode() + (this.f122613h.hashCode() * 31)) * 31);
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // k23.g
    public final boolean isExternal() {
        return e().isExternal();
    }

    @Override // k23.g
    public final boolean isInfix() {
        return e().isInfix();
    }

    @Override // k23.g
    public final boolean isInline() {
        return e().isInline();
    }

    @Override // k23.g
    public final boolean isOperator() {
        return e().isOperator();
    }

    @Override // k23.c
    public final boolean isSuspend() {
        return e().isSuspend();
    }

    @Override // e23.u
    public final Object m(androidx.lifecycle.u1 u1Var, Object obj, Object obj2, Object obj3, Object obj4, p3.m mVar, Integer num) {
        return call(u1Var, obj, obj2, obj3, obj4, mVar, num);
    }

    @Override // n23.y3
    /* JADX INFO: renamed from: r, reason: from getter */
    public final Object getF122615j() {
        return this.f122615j;
    }

    @Override // e23.v
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, p3.m mVar, Integer num) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, mVar, num);
    }

    public final String toString() {
        l4.f122528a.getClass();
        return l4.c(this);
    }

    @Override // n23.y3
    /* JADX INFO: renamed from: x, reason: from getter */
    public final i3 getF122613h() {
        return this.f122613h;
    }

    @Override // e23.a
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // e23.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // e23.t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t0(i3 i3Var, String str, String str2, Object obj) {
        this(i3Var, str, str2, null, obj);
        i3Var.getClass();
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t0(i3 i3Var, t23.v vVar) {
        i3Var.getClass();
        vVar.getClass();
        String strB = vVar.getName().b();
        strB.getClass();
        m4.f122535a.getClass();
        this(i3Var, strB, m4.c(vVar).getF122392b(), vVar, p005kotlin.jvm.internal.e.NO_RECEIVER);
    }
}
