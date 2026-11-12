package n23;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.reflect.full.IllegalPropertyDelegateAccessException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u0015\u0016\u0017\u0018B5\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0010B+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u0012R\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Ln23/h1;", "V", "Ln23/p0;", "Ln23/b4;", "Ln23/i3;", TtmlNode.RUBY_CONTAINER, "", "name", "signature", "Lt23/r0;", "descriptorInitialValue", "", "rawBoundReceiver", "<init>", "(Ln23/i3;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "descriptor", "(Ln23/i3;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "boundReceiver", "(Ln23/i3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "a", "c", "d", "b", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h1<V> extends p0<V> implements b4<V> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f122481n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i3 f122482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f122483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f122484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f122485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f122486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c4.a<t23.r0> f122487m;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ln23/h1$a;", "PropertyType", "ReturnType", "Ln23/p0;", "", "Lk23/g;", "<init>", "()V", "Lt23/q0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a<PropertyType, ReturnType> extends p0<ReturnType> implements k23.g<ReturnType> {
        public abstract t23.q0 E();

        public abstract h1<PropertyType> F();

        @Override // n23.y3
        public final o23.h<?> f() {
            return null;
        }

        @Override // k23.g
        public final boolean isExternal() {
            return E().isExternal();
        }

        @Override // k23.g
        public final boolean isInfix() {
            return E().isInfix();
        }

        @Override // k23.g
        public final boolean isInline() {
            return E().isInline();
        }

        @Override // k23.g
        public final boolean isOperator() {
            return E().isOperator();
        }

        @Override // k23.c
        public final boolean isSuspend() {
            return E().isSuspend();
        }

        @Override // n23.y3
        /* JADX INFO: renamed from: r */
        public final Object getF122485k() {
            return F().f122485k;
        }

        @Override // n23.y3
        /* JADX INFO: renamed from: x */
        public final i3 getF122482h() {
            return F().f122482h;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln23/h1$c;", "V", "Ln23/h1$a;", "Lk23/l$a;", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class c<V> extends a<V, V> implements k23.l.a<V> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ k23.l<Object>[] f122488j = {p005kotlin.jvm.internal.s0.f105811a.h(new p005kotlin.jvm.internal.i0(c.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final c4.a f122489h = new c4.a(null, new i1(this));

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Object f122490i = o13.m.a(o13.n.PUBLICATION, new j1(this));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        @Override // n23.y3
        public final o23.h<?> A() {
            return (o23.h) this.f122490i.getValue();
        }

        @Override // n23.h1.a
        public final t23.q0 E() {
            k23.l<Object> lVar = f122488j[0];
            Object objInvoke = this.f122489h.invoke();
            objInvoke.getClass();
            return (t23.s0) objInvoke;
        }

        @Override // n23.p0
        public final t23.b e() {
            k23.l<Object> lVar = f122488j[0];
            Object objInvoke = this.f122489h.invoke();
            objInvoke.getClass();
            return (t23.s0) objInvoke;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(F(), ((c) obj).F());
        }

        @Override // k23.c
        /* JADX INFO: renamed from: getName */
        public final String getF122483i() {
            return androidx.room.a0.m(new StringBuilder("<get-"), F().f122483i, '>');
        }

        public final int hashCode() {
            return F().hashCode();
        }

        public final String toString() {
            return "getter of " + F();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln23/h1$d;", "V", "Ln23/h1$a;", "", "Lk23/h$a;", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class d<V> extends a<V, Unit> implements k23.h.a<V> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ k23.l<Object>[] f122491j = {p005kotlin.jvm.internal.s0.f105811a.h(new p005kotlin.jvm.internal.i0(d.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final c4.a f122492h = new c4.a(null, new k1(this));

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Object f122493i = o13.m.a(o13.n.PUBLICATION, new l1(this));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        @Override // n23.y3
        public final o23.h<?> A() {
            return (o23.h) this.f122493i.getValue();
        }

        @Override // n23.h1.a
        public final t23.q0 E() {
            k23.l<Object> lVar = f122491j[0];
            Object objInvoke = this.f122492h.invoke();
            objInvoke.getClass();
            return (t23.t0) objInvoke;
        }

        @Override // n23.p0
        public final t23.b e() {
            k23.l<Object> lVar = f122491j[0];
            Object objInvoke = this.f122492h.invoke();
            objInvoke.getClass();
            return (t23.t0) objInvoke;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof d) && p005kotlin.jvm.internal.s.g(F(), ((d) obj).F());
        }

        @Override // k23.c
        /* JADX INFO: renamed from: getName */
        public final String getF122483i() {
            return androidx.room.a0.m(new StringBuilder("<set-"), F().f122483i, '>');
        }

        public final int hashCode() {
            return F().hashCode();
        }

        public final String toString() {
            return "setter of " + F();
        }
    }

    static {
        new b(null);
        f122481n = new Object();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h1(i3 i3Var, t23.r0 r0Var) {
        i3Var.getClass();
        r0Var.getClass();
        String strB = r0Var.getName().b();
        strB.getClass();
        m4.f122535a.getClass();
        this(i3Var, strB, m4.b(r0Var).getF122414f(), r0Var, p005kotlin.jvm.internal.e.NO_RECEIVER);
    }

    @Override // n23.y3
    public final o23.h<?> A() {
        return I().A();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // n23.b4
    public final Field B() {
        return (Field) this.f122486l.getValue();
    }

    public final Member E() {
        if (!e().m0()) {
            return null;
        }
        m4 m4Var = m4.f122535a;
        t23.r0 r0VarE = e();
        m4Var.getClass();
        c2 c2VarB = m4.b(r0VarE);
        if (c2VarB instanceof c2.c) {
            c2.c cVar = (c2.c) c2VarB;
            u33.d dVar = cVar.f122412d;
            v33.a.d dVar2 = cVar.f122411c;
            if ((dVar2.f175459b & 16) == 16) {
                v33.a.c cVar2 = dVar2.f175464g;
                int i14 = cVar2.f175448b;
                if ((i14 & 1) != 1 || (i14 & 2) != 2) {
                    return null;
                }
                return this.f122482h.G(dVar.getString(cVar2.f175449c), dVar.getString(cVar2.f175450d));
            }
        }
        return B();
    }

    public final Object F() {
        return gl.b.h(this.f122485k, e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object G(Member member, Object obj) throws IllegalPropertyDelegateAccessException {
        try {
            Object obj2 = f122481n;
            if ((obj == obj2 || obj2 == null) && e().I() == null) {
                throw new RuntimeException("'" + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objF = gg.b.H(this) ? F() : obj;
            if (objF == obj2) {
                objF = null;
            }
            if (!gg.b.H(this)) {
                obj = null;
            }
            if (obj == obj2) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(m23.a.a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objF);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objF == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    cls.getClass();
                    objF = s4.d(cls);
                }
                return method.invoke(null, objF);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                cls2.getClass();
                obj = s4.d(cls2);
            }
            return method2.invoke(null, objF, obj);
        } catch (IllegalAccessException e4) {
            throw new IllegalPropertyDelegateAccessException(e4);
        }
    }

    @Override // n23.p0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final t23.r0 e() {
        t23.r0 r0VarInvoke = this.f122487m.invoke();
        r0VarInvoke.getClass();
        return r0VarInvoke;
    }

    public abstract c<V> I();

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    public final boolean equals(Object obj) {
        b4 b4Var;
        x33.c cVar = s4.f122608a;
        if (obj instanceof b4) {
            b4Var = (b4) obj;
        } else if (obj instanceof p005kotlin.jvm.internal.l0) {
            k23.c cVarCompute = ((p005kotlin.jvm.internal.l0) obj).compute();
            if (cVarCompute instanceof b4) {
                b4Var = (b4) cVarCompute;
            } else {
                b4Var = null;
            }
        } else {
            b4Var = null;
        }
        return b4Var != null && p005kotlin.jvm.internal.s.g(this.f122482h, b4Var.getF122482h()) && p005kotlin.jvm.internal.s.g(this.f122483i, b4Var.getF122483i()) && p005kotlin.jvm.internal.s.g(this.f122484j, b4Var.getF122484j()) && p005kotlin.jvm.internal.s.g(this.f122485k, b4Var.getF122485k());
    }

    @Override // n23.y3
    public final o23.h<?> f() {
        I().getClass();
        return null;
    }

    @Override // k23.c
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF122483i() {
        return this.f122483i;
    }

    @Override // n23.b4
    /* JADX INFO: renamed from: getSignature, reason: from getter */
    public final String getF122484j() {
        return this.f122484j;
    }

    public final int hashCode() {
        return this.f122484j.hashCode() + wr.g.j(this.f122482h.hashCode() * 31, 31, this.f122483i);
    }

    @Override // k23.l
    public final boolean isConst() {
        return e().isConst();
    }

    @Override // k23.l
    public final boolean isLateinit() {
        return e().A0();
    }

    @Override // k23.c
    public final boolean isSuspend() {
        return false;
    }

    @Override // n23.y3
    /* JADX INFO: renamed from: r, reason: from getter */
    public final Object getF122485k() {
        return this.f122485k;
    }

    public final String toString() {
        l4.f122528a.getClass();
        return l4.d(this);
    }

    @Override // n23.y3
    /* JADX INFO: renamed from: x, reason: from getter */
    public final i3 getF122482h() {
        return this.f122482h;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln23/h1$b;", "", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(i3 i3Var, String str, String str2, Object obj) {
        this(i3Var, str, str2, null, obj);
        i3Var.getClass();
        str.getClass();
        str2.getClass();
    }

    private h1(i3 i3Var, String str, String str2, t23.r0 r0Var, Object obj) {
        this.f122482h = i3Var;
        this.f122483i = str;
        this.f122484j = str2;
        this.f122485k = obj;
        this.f122486l = o13.m.a(o13.n.PUBLICATION, new f1(this));
        this.f122487m = new c4.a<>(r0Var, new g1(this));
    }
}
