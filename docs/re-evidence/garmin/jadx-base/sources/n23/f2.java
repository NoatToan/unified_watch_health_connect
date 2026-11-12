package n23;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0003%&'B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Ln23/f2;", "", "T", "Ln23/i3;", "Lk23/d;", "Ln23/v3;", "Lt43/m;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lt23/e;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lc33/f;", "getKmClass", "()Lkotlin/metadata/KmClass;", "kmClass", "Lx33/b;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Lc33/b;", "getClassKind$kotlin_reflection", "()Lkotlin/metadata/ClassKind;", "classKind", "Li43/l;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "Lc33/h0;", "getModality", "()Lkotlin/metadata/Modality;", "modality", "b", "c", "a", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f2<T> extends i3 implements k23.d<T>, v3, t43.m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashSet f122440f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<T> f122441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f122442e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ln23/f2$b;", "Ln23/i3$b;", "Ln23/i3;", "<init>", "(Ln23/f2;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends i3.b {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ k23.l<Object>[] f122443u;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f122444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c4.a f122445d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c4.a f122446e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final c4.a f122447f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c4.a f122448g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final c4.a f122449h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Object f122450i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final c4.a f122451j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final c4.a f122452k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final c4.a f122453l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final c4.a f122454m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final c4.a f122455n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final c4.a f122456o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final c4.a f122457p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final c4.a f122458q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final c4.a f122459r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final c4.a f122460s;

        static {
            p005kotlin.jvm.internal.i0 i0Var = new p005kotlin.jvm.internal.i0(b.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            f122443u = new k23.l[]{t0Var.h(i0Var), j.l(b.class, "annotations", "getAnnotations()Ljava/util/List;", 0, t0Var), j.l(b.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0, t0Var), j.l(b.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0, t0Var), j.l(b.class, "constructors", "getConstructors()Ljava/util/Collection;", 0, t0Var), j.l(b.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0, t0Var), j.l(b.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0, t0Var), j.l(b.class, "typeParameterTable", "getTypeParameterTable()Lkotlin/reflect/jvm/internal/TypeParameterTable;", 0, t0Var), j.l(b.class, "supertypes", "getSupertypes()Ljava/util/List;", 0, t0Var), j.l(b.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0, t0Var), j.l(b.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0, t0Var), j.l(b.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0, t0Var), j.l(b.class, "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;", 0, t0Var), j.l(b.class, "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;", 0, t0Var), j.l(b.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0, t0Var), j.l(b.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0, t0Var), j.l(b.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0, t0Var), j.l(b.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0, t0Var)};
        }

        public b() {
            super(f2.this);
            o13.n nVar = o13.n.PUBLICATION;
            this.f122444c = o13.m.a(nVar, new g2(f2.this, this));
            this.f122445d = new c4.a(null, new r2(f2.this));
            c4.a(null, new u2(f2.this));
            this.f122446e = new c4.a(null, new v2(f2.this, this));
            this.f122447f = new c4.a(null, new w2(f2.this));
            this.f122448g = new c4.a(null, new x2(f2.this));
            this.f122449h = new c4.a(null, new y2(this, f2.this));
            this.f122450i = o13.m.a(nVar, new z2(this, f2.this));
            this.f122451j = new c4.a(null, new a3(this, f2.this));
            this.f122452k = new c4.a(null, new b3(this, f2.this));
            this.f122453l = new c4.a(null, new h2(f2.this, this));
            c4.a(null, new i2(f2.this, this));
            this.f122454m = new c4.a(null, new j2(f2.this));
            this.f122455n = new c4.a(null, new k2(f2.this));
            this.f122456o = new c4.a(null, new l2(f2.this));
            this.f122457p = new c4.a(null, new m2(f2.this));
            this.f122458q = new c4.a(null, new n2(this));
            this.f122459r = new c4.a(null, new o2(this));
            c4.a(null, new p2(this));
            this.f122460s = new c4.a(null, new q2(this));
        }

        public final t23.e a() {
            k23.l<Object> lVar = f122443u[0];
            Object objInvoke = this.f122445d.invoke();
            objInvoke.getClass();
            return (t23.e) objInvoke;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final c33.f b() {
            return (c33.f) this.f122444c.getValue();
        }

        public final r4 c() {
            k23.l<Object> lVar = f122443u[7];
            Object objInvoke = this.f122452k.invoke();
            objInvoke.getClass();
            return (r4) objInvoke;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln23/f2$c;", "", "<init>", "(Ljava/lang/String;I)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        DECLARED,
        INHERITED
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122465a;

        static {
            int[] iArr = new int[r33.a.EnumC2820a.values().length];
            try {
                iArr[r33.a.EnumC2820a.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r33.a.EnumC2820a.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r33.a.EnumC2820a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r33.a.EnumC2820a.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[r33.a.EnumC2820a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[r33.a.EnumC2820a.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f122465a = iArr;
        }
    }

    static {
        new a(null);
        p23.b.f135026a.getClass();
        LinkedHashSet linkedHashSet = p23.b.f135027b;
        HashSet hashSet = new HashSet();
        Iterator<T> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hashSet.add(((x33.b) it.next()).a().f188596a.toString());
        }
        f122440f = hashSet;
    }

    public f2(Class<T> cls) {
        cls.getClass();
        this.f122441d = cls;
        this.f122442e = o13.m.a(o13.n.PUBLICATION, new d2(this));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    public static final List Q(f2 f2Var, i43.l lVar, c cVar) {
        p0 p0Var;
        f2Var.getClass();
        d3 d3Var = new d3(f2Var);
        Collection<t23.l> collectionA = i43.o.a.a(lVar, null, 3);
        ArrayList arrayList = new ArrayList();
        for (t23.l lVar2 : collectionA) {
            if (lVar2 instanceof t23.b) {
                t23.b bVar = (t23.b) lVar2;
                if (p005kotlin.jvm.internal.s.g(bVar.getVisibility(), t23.q.f162053h)) {
                    p0Var = null;
                } else {
                    cVar.getClass();
                    t23.b.a kind = bVar.getKind();
                    kind.getClass();
                    if ((kind != t23.b.a.FAKE_OVERRIDE) == (cVar == c.DECLARED)) {
                        p0Var = (p0) lVar2.K(d3Var, Unit.INSTANCE);
                    } else {
                        p0Var = null;
                    }
                }
            } else {
                p0Var = null;
            }
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return p13.h0.b1(arrayList);
    }

    public static w23.m R(x33.b bVar, y23.i iVar) {
        l43.n nVar = iVar.f194355a;
        w23.m mVar = new w23.m(new w23.r(nVar.f110052b, bVar.f188591a), bVar.f(), t23.a0.FINAL, t23.f.CLASS, p13.w.c(nVar.f110052b.e().k("Any").p()), t23.y0.f162076a, false, nVar.f110051a);
        mVar.E0(new c3(mVar, nVar.f110051a), p13.l0.f134950a, null);
        return mVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.d
    public final String D() {
        c4.a aVar = ((b) this.f122442e.getValue()).f122446e;
        k23.l<Object> lVar = b.f122443u[2];
        return (String) aVar.invoke();
    }

    @Override // n23.i3
    public final Collection<t23.k> H() {
        t23.e eVarU = U();
        if (eVarU.getKind() == t23.f.INTERFACE || eVarU.getKind() == t23.f.OBJECT) {
            return p13.j0.f134944a;
        }
        Collection<t23.d> collectionN = eVarU.n();
        collectionN.getClass();
        return collectionN;
    }

    @Override // n23.i3
    public final Collection<t23.v> I(x33.f fVar) {
        i43.l lVarI = U().p().i();
        b33.b bVar = b33.b.FROM_REFLECTION;
        Collection<? extends t23.x0> collectionC = lVarI.c(fVar, bVar);
        i43.l lVarP = U().P();
        lVarP.getClass();
        return p13.h0.C0(collectionC, lVarP.c(fVar, bVar));
    }

    @Override // n23.i3
    public final t23.r0 J(int i14) {
        Class<?> declaringClass;
        Class<T> cls = this.f122441d;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((f2) p005kotlin.jvm.internal.s0.f105811a.b(declaringClass)).J(i14);
        }
        t23.e eVarU = U();
        n43.n nVar = eVarU instanceof n43.n ? (n43.n) eVarU : null;
        if (nVar != null) {
            s33.c cVar = nVar.f123654f;
            z33.g.f<s33.c, List<s33.o>> fVar = v33.a.f175429h;
            fVar.getClass();
            s33.o oVar = (s33.o) u33.f.b(cVar, fVar, i14);
            if (oVar != null) {
                l43.p pVar = nVar.f123661m;
                return (t23.r0) s4.e(this.f122441d, oVar, pVar.f110086b, pVar.f110088d, nVar.f123655g, e2.f122434a);
            }
        }
        return null;
    }

    @Override // n23.i3
    public final Collection<t23.r0> L(x33.f fVar) {
        i43.l lVarI = U().p().i();
        b33.b bVar = b33.b.FROM_REFLECTION;
        Collection<? extends t23.r0> collectionA = lVarI.a(fVar, bVar);
        i43.l lVarP = U().P();
        lVarP.getClass();
        return p13.h0.C0(collectionA, lVarP.a(fVar, bVar));
    }

    public final x33.b S() {
        q23.h hVarD;
        m4.f122535a.getClass();
        Class<T> cls = this.f122441d;
        cls.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            hVarD = componentType.isPrimitive() ? g43.d.b(componentType.getSimpleName()).d() : null;
            if (hVarD != null) {
                return new x33.b(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105860l, hVarD.f142333b);
            }
            x33.b.a aVar = x33.b.f188590d;
            x33.c cVarI = kotlin.reflect.jvm.internal.impl.builtins.f.a.f105881h.i();
            aVar.getClass();
            return x33.b.a.b(cVarI);
        }
        if (cls.equals(Void.TYPE)) {
            return m4.f122536b;
        }
        hVarD = cls.isPrimitive() ? g43.d.b(cls.getSimpleName()).d() : null;
        if (hVarD != null) {
            return new x33.b(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105860l, hVarD.f142332a);
        }
        x33.b bVarA = z23.f.a(cls);
        if (!bVarA.f188593c) {
            s23.c cVar = s23.c.f156232a;
            x33.c cVarA = bVarA.a();
            cVar.getClass();
            cVarA.getClass();
            x33.b bVar = s23.c.f156240i.get(cVarA.f188596a);
            if (bVar != null) {
                return bVar;
            }
        }
        return bVarA;
    }

    public final c33.b T() {
        c33.b bVarA;
        c33.f fVarV = V();
        if (fVarV != null && (bVarA = c33.a.a(fVarV)) != null) {
            return bVarA;
        }
        Class<T> cls = this.f122441d;
        if (cls.isAnnotation()) {
            return c33.b.ANNOTATION_CLASS;
        }
        if (cls.isInterface()) {
            return c33.b.INTERFACE;
        }
        if (cls.isEnum()) {
            return c33.b.ENUM_CLASS;
        }
        return cls.getSuperclass().isEnum() ? c33.b.ENUM_ENTRY : c33.b.CLASS;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final t23.e U() {
        return ((b) this.f122442e.getValue()).a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final c33.f V() {
        return ((b) this.f122442e.getValue()).b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.d
    public final List<k23.p> b() {
        c4.a aVar = ((b) this.f122442e.getValue()).f122453l;
        k23.l<Object> lVar = b.f122443u[8];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // k23.d
    public final boolean equals(Object obj) {
        return (obj instanceof f2) && dh.b.v(this).equals(dh.b.v((k23.d) obj));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.d
    public final List<k23.q> getTypeParameters() {
        c4.a aVar = ((b) this.f122442e.getValue()).f122451j;
        k23.l<Object> lVar = b.f122443u[6];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // k23.d
    public final int hashCode() {
        return dh.b.v(this).hashCode();
    }

    @Override // p005kotlin.jvm.internal.g
    public final Class<T> j() {
        return this.f122441d;
    }

    @Override // k23.d
    public final boolean k() {
        c33.f fVarV = V();
        return fVarV != null && c33.a.f24128f.a(fVarV, c33.a.f24123a[14]);
    }

    @Override // k23.d
    public final boolean l() {
        c33.f fVarV = V();
        if (fVarV != null) {
            return c33.a.f24127e.a(fVarV, c33.a.f24123a[10]);
        }
        Class<T> cls = this.f122441d;
        return (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.d
    public final Collection<k23.g<T>> n() {
        c4.a aVar = ((b) this.f122442e.getValue()).f122448g;
        k23.l<Object> lVar = b.f122443u[4];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.d
    public final Collection<k23.d<?>> o() {
        c4.a aVar = ((b) this.f122442e.getValue()).f122449h;
        k23.l<Object> lVar = b.f122443u[5];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    @Override // k23.d
    public final boolean q(Object obj) {
        List<k23.d<? extends Object>> list = z23.f.f202041a;
        Class<T> cls = this.f122441d;
        cls.getClass();
        Integer num = z23.f.f202044d.get(cls);
        if (num != null) {
            return p005kotlin.jvm.internal.y0.f(num.intValue(), obj);
        }
        Class<T> cls2 = (Class) z23.f.f202043c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.d
    public final Collection<k23.c<?>> s() {
        c4.a aVar = ((b) this.f122442e.getValue()).f122460s;
        k23.l<Object> lVar = b.f122443u[17];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    public final String toString() {
        x33.b bVarS = S();
        x33.c cVar = bVarS.f188591a;
        return "class ".concat((cVar.f188596a.c() ? "" : androidx.room.a0.m(new StringBuilder(), cVar.f188596a.f188600a, '.')).concat(d53.u.w(bVarS.f188592b.f188596a.f188600a, '.', '$')));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.d
    /* JADX INFO: renamed from: w */
    public final String getF16141b() {
        c4.a aVar = ((b) this.f122442e.getValue()).f122447f;
        k23.l<Object> lVar = b.f122443u[3];
        return (String) aVar.invoke();
    }

    @Override // k23.d
    public final boolean z() {
        c33.f fVarV = V();
        return (fVarV != null ? c33.a.a(fVarV) : null) == c33.b.COMPANION_OBJECT;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln23/f2$a;", "", "<init>", "()V", "", "", "SPECIAL_JVM_ANNOTATION_NAMES", "Ljava/util/Set;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
