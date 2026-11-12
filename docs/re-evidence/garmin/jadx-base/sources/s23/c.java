package s23;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f156232a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f156233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f156234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f156235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f156236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x33.b f156237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x33.c f156238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x33.b f156239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap<x33.d, x33.b> f156240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap<x33.d, x33.b> f156241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashMap<x33.d, x33.c> f156242k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap<x33.d, x33.c> f156243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap<x33.b, x33.b> f156244m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap<x33.b, x33.b> f156245n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final LinkedHashSet f156246o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List<a> f156247p;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x33.b f156248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x33.b f156249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x33.b f156250c;

        public a(x33.b bVar, x33.b bVar2, x33.b bVar3) {
            bVar.getClass();
            bVar2.getClass();
            bVar3.getClass();
            this.f156248a = bVar;
            this.f156249b = bVar2;
            this.f156250c = bVar3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f156248a.equals(aVar.f156248a) && this.f156249b.equals(aVar.f156249b) && this.f156250c.equals(aVar.f156250c);
        }

        public final int hashCode() {
            return this.f156250c.hashCode() + ((this.f156249b.hashCode() + (this.f156248a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f156248a + ", kotlinReadOnly=" + this.f156249b + ", kotlinMutable=" + this.f156250c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        StringBuilder sb3 = new StringBuilder();
        r23.f.a aVar = r23.f.a.f149959c;
        sb3.append(aVar.f149957a);
        sb3.append('.');
        sb3.append(aVar.f149958b);
        f156233b = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        r23.f.b bVar = r23.f.b.f149960c;
        sb4.append(bVar.f149957a);
        sb4.append('.');
        sb4.append(bVar.f149958b);
        f156234c = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        r23.f.d dVar = r23.f.d.f149962c;
        sb5.append(dVar.f149957a);
        sb5.append('.');
        sb5.append(dVar.f149958b);
        f156235d = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        r23.f.c cVar = r23.f.c.f149961c;
        sb6.append(cVar.f149957a);
        sb6.append('.');
        sb6.append(cVar.f149958b);
        f156236e = sb6.toString();
        x33.b.a aVar2 = x33.b.f188590d;
        x33.c cVar2 = new x33.c("kotlin.jvm.functions.FunctionN");
        aVar2.getClass();
        x33.b bVarB = x33.b.a.b(cVar2);
        f156237f = bVarB;
        f156238g = bVarB.a();
        x33.i.f188617a.getClass();
        f156239h = x33.i.f188640x;
        d(Class.class);
        f156240i = new HashMap<>();
        f156241j = new HashMap<>();
        f156242k = new HashMap<>();
        f156243l = new HashMap<>();
        f156244m = new HashMap<>();
        f156245n = new HashMap<>();
        f156246o = new LinkedHashSet();
        x33.b bVarB2 = x33.b.a.b(kotlin.reflect.jvm.internal.impl.builtins.f.a.C);
        x33.c cVar3 = kotlin.reflect.jvm.internal.impl.builtins.f.a.K;
        x33.c cVar4 = bVarB2.f188591a;
        a aVar3 = new a(d(Iterable.class), bVarB2, new x33.b(cVar4, x33.e.a(cVar3, cVar4), false));
        x33.b bVarB3 = x33.b.a.b(kotlin.reflect.jvm.internal.impl.builtins.f.a.B);
        x33.c cVar5 = kotlin.reflect.jvm.internal.impl.builtins.f.a.J;
        x33.c cVar6 = bVarB3.f188591a;
        a aVar4 = new a(d(Iterator.class), bVarB3, new x33.b(cVar6, x33.e.a(cVar5, cVar6), false));
        x33.b bVarB4 = x33.b.a.b(kotlin.reflect.jvm.internal.impl.builtins.f.a.D);
        x33.c cVar7 = kotlin.reflect.jvm.internal.impl.builtins.f.a.L;
        x33.c cVar8 = bVarB4.f188591a;
        a aVar5 = new a(d(Collection.class), bVarB4, new x33.b(cVar8, x33.e.a(cVar7, cVar8), false));
        x33.b bVarB5 = x33.b.a.b(kotlin.reflect.jvm.internal.impl.builtins.f.a.E);
        x33.c cVar9 = kotlin.reflect.jvm.internal.impl.builtins.f.a.M;
        x33.c cVar10 = bVarB5.f188591a;
        a aVar6 = new a(d(List.class), bVarB5, new x33.b(cVar10, x33.e.a(cVar9, cVar10), false));
        x33.b bVarB6 = x33.b.a.b(kotlin.reflect.jvm.internal.impl.builtins.f.a.G);
        x33.c cVar11 = kotlin.reflect.jvm.internal.impl.builtins.f.a.O;
        x33.c cVar12 = bVarB6.f188591a;
        a aVar7 = new a(d(Set.class), bVarB6, new x33.b(cVar12, x33.e.a(cVar11, cVar12), false));
        x33.b bVarB7 = x33.b.a.b(kotlin.reflect.jvm.internal.impl.builtins.f.a.F);
        x33.c cVar13 = kotlin.reflect.jvm.internal.impl.builtins.f.a.N;
        x33.c cVar14 = bVarB7.f188591a;
        a aVar8 = new a(d(ListIterator.class), bVarB7, new x33.b(cVar14, x33.e.a(cVar13, cVar14), false));
        x33.c cVar15 = kotlin.reflect.jvm.internal.impl.builtins.f.a.H;
        x33.b bVarB8 = x33.b.a.b(cVar15);
        x33.c cVar16 = kotlin.reflect.jvm.internal.impl.builtins.f.a.P;
        x33.c cVar17 = bVarB8.f188591a;
        a aVar9 = new a(d(Map.class), bVarB8, new x33.b(cVar17, x33.e.a(cVar16, cVar17), false));
        x33.b bVarD = x33.b.a.b(cVar15).d(kotlin.reflect.jvm.internal.impl.builtins.f.a.I.f188596a.g());
        x33.c cVar18 = kotlin.reflect.jvm.internal.impl.builtins.f.a.Q;
        x33.c cVar19 = bVarD.f188591a;
        List<a> listK = p13.x.k(aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, new a(d(Map.Entry.class), bVarD, new x33.b(cVar19, x33.e.a(cVar18, cVar19), false)));
        f156247p = listK;
        c(Object.class, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105869b);
        c(String.class, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105879g);
        c(CharSequence.class, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105877f);
        x33.c cVar20 = kotlin.reflect.jvm.internal.impl.builtins.f.a.f105886l;
        x33.b bVarD2 = d(Throwable.class);
        aVar2.getClass();
        a(bVarD2, x33.b.a.b(cVar20));
        c(Cloneable.class, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105873d);
        c(Number.class, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105884j);
        x33.c cVar21 = kotlin.reflect.jvm.internal.impl.builtins.f.a.f105887m;
        x33.b bVarD3 = d(Comparable.class);
        aVar2.getClass();
        a(bVarD3, x33.b.a.b(cVar21));
        c(Enum.class, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105885k);
        x33.c cVar22 = kotlin.reflect.jvm.internal.impl.builtins.f.a.f105894t;
        x33.b bVarD4 = d(Annotation.class);
        aVar2.getClass();
        a(bVarD4, x33.b.a.b(cVar22));
        for (a aVar10 : listK) {
            f156232a.getClass();
            x33.b bVar2 = aVar10.f156248a;
            x33.b bVar3 = aVar10.f156249b;
            x33.b bVar4 = aVar10.f156250c;
            a(bVar2, bVar3);
            b(bVar4.a(), bVar2);
            f156244m.put(bVar4, bVar3);
            f156245n.put(bVar3, bVar4);
            x33.c cVarA = bVar3.a();
            x33.c cVarA2 = bVar4.a();
            f156242k.put(bVar4.a().f188596a, cVarA);
            f156243l.put(cVarA.f188596a, cVarA2);
        }
        for (g43.d dVar2 : g43.d.values()) {
            c cVar23 = f156232a;
            x33.b.a aVar11 = x33.b.f188590d;
            x33.c cVar24 = dVar2.f75869d;
            if (cVar24 == null) {
                g43.d.a(15);
                throw null;
            }
            aVar11.getClass();
            x33.b bVarB9 = x33.b.a.b(cVar24);
            q23.h hVarD = dVar2.d();
            hVarD.getClass();
            x33.b bVarB10 = x33.b.a.b(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105860l.a(hVarD.f142332a));
            cVar23.getClass();
            a(bVarB9, bVarB10);
        }
        p005kotlin.reflect.jvm.internal.impl.builtins.a.f105828a.getClass();
        for (x33.b bVar5 : p005kotlin.reflect.jvm.internal.impl.builtins.a.f105829b) {
            c cVar25 = f156232a;
            x33.b.a aVar12 = x33.b.f188590d;
            x33.c cVar26 = new x33.c("kotlin.jvm.internal." + bVar5.f().b() + "CompanionObject");
            aVar12.getClass();
            x33.b bVarB11 = x33.b.a.b(cVar26);
            x33.b bVarD5 = bVar5.d(x33.h.f188611c);
            cVar25.getClass();
            a(bVarB11, bVarD5);
        }
        for (int i14 = 0; i14 < 23; i14++) {
            c cVar27 = f156232a;
            x33.b.a aVar13 = x33.b.f188590d;
            x33.c cVar28 = new x33.c(am.j.h(i14, "kotlin.jvm.functions.Function"));
            aVar13.getClass();
            x33.b bVarB12 = x33.b.a.b(cVar28);
            x33.b bVar6 = new x33.b(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105860l, x33.f.e("Function" + i14));
            cVar27.getClass();
            a(bVarB12, bVar6);
            b(new x33.c(j20.x.e(new StringBuilder(), i14, f156234c)), f156239h);
        }
        for (int i15 = 0; i15 < 22; i15++) {
            r23.f.c cVar29 = r23.f.c.f149961c;
            String str = cVar29.f149957a + '.' + cVar29.f149958b;
            c cVar30 = f156232a;
            x33.c cVar31 = new x33.c(str + i15);
            x33.b bVar7 = f156239h;
            cVar30.getClass();
            b(cVar31, bVar7);
        }
        c cVar32 = f156232a;
        x33.c cVar33 = new x33.c("kotlin.concurrent.atomics.AtomicInt");
        cVar32.getClass();
        b(cVar33, d(AtomicInteger.class));
        b(new x33.c("kotlin.concurrent.atomics.AtomicLong"), d(AtomicLong.class));
        b(new x33.c("kotlin.concurrent.atomics.AtomicBoolean"), d(AtomicBoolean.class));
        b(new x33.c("kotlin.concurrent.atomics.AtomicReference"), d(AtomicReference.class));
        b(new x33.c("kotlin.concurrent.atomics.AtomicIntArray"), d(AtomicIntegerArray.class));
        b(new x33.c("kotlin.concurrent.atomics.AtomicLongArray"), d(AtomicLongArray.class));
        b(new x33.c("kotlin.concurrent.atomics.AtomicArray"), d(AtomicReferenceArray.class));
        b(kotlin.reflect.jvm.internal.impl.builtins.f.a.f105871c.i(), d(Void.class));
    }

    private c() {
    }

    public static void a(x33.b bVar, x33.b bVar2) {
        f156240i.put(bVar.a().f188596a, bVar2);
        b(bVar2.a(), bVar);
    }

    public static void b(x33.c cVar, x33.b bVar) {
        f156246o.add(cVar);
        f156241j.put(cVar.f188596a, bVar);
    }

    public static void c(Class cls, x33.d dVar) {
        x33.c cVarI = dVar.i();
        x33.b bVarD = d(cls);
        x33.b.f188590d.getClass();
        a(bVarD, x33.b.a.b(cVarI));
    }

    public static x33.b d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return d(declaringClass).d(x33.f.e(cls.getSimpleName()));
        }
        x33.b.a aVar = x33.b.f188590d;
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        x33.c cVar = new x33.c(canonicalName);
        aVar.getClass();
        return x33.b.a.b(cVar);
    }

    public static boolean e(x33.d dVar, String str) {
        Integer numI;
        String str2 = dVar.f188600a;
        if (d53.u.y(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            if ((strSubstring.length() <= 0 || !d53.b.d(strSubstring.charAt(0), '0', false)) && (numI = d53.t.i(strSubstring)) != null && numI.intValue() >= 23) {
                return true;
            }
        }
        return false;
    }

    public static x33.b f(x33.d dVar) {
        dVar.getClass();
        if (e(dVar, f156233b) || e(dVar, f156235d)) {
            return f156237f;
        }
        return (e(dVar, f156234c) || e(dVar, f156236e)) ? f156239h : f156241j.get(dVar);
    }
}
