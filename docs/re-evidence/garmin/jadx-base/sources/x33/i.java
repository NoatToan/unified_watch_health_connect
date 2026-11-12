package x33;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import o13.p;
import p13.c1;
import p13.t0;
import p13.u;
import p13.u0;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static final Set<b> A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final Object F;
    public static final Object G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f188617a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f188618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f188619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f188620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f188621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f188622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f188623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f188624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f188625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set<c> f188626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Set<c> f188627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f188628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f188629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f188630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f188631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f188632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f188633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f188634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f188635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f188636t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f188637u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f188638v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f188639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f188640x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Set<b> f188641y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Set<b> f188642z;

    static {
        c cVar = new c("kotlin");
        f188618b = cVar;
        c cVarA = cVar.a(f.e("reflect"));
        f188619c = cVarA;
        cVar.a(f.e("experimental"));
        c cVarA2 = cVar.a(f.e("collections"));
        f188620d = cVarA2;
        cVar.a(f.e("sequences"));
        c cVarA3 = cVar.a(f.e("ranges"));
        f188621e = cVarA3;
        c cVarA4 = cVar.a(f.e("jvm"));
        cVar.a(f.e("js"));
        cVar.a(f.e("annotations")).a(f.e("jvm"));
        cVarA4.a(f.e("internal"));
        cVarA4.a(f.e("functions"));
        c cVarA5 = cVar.a(f.e("annotation"));
        f188622f = cVarA5;
        c cVarA6 = cVar.a(f.e("internal"));
        cVarA6.a(f.e("ir"));
        c cVarA7 = cVar.a(f.e("coroutines"));
        f188623g = cVarA7;
        cVarA7.a(f.e("intrinsics"));
        f188624h = cVar.a(f.e("enums"));
        cVar.a(f.e("contracts"));
        c cVarA8 = cVar.a(f.e("concurrent")).a(f.e("atomics"));
        f188625i = cVarA8;
        cVar.a(f.e("test"));
        cVar.a(f.e("text"));
        f188626j = u.m0(new c[]{cVar, cVarA2, cVarA3, cVarA5});
        f188627k = u.m0(new c[]{cVar, cVarA2, cVarA3, cVarA5, cVarA, cVarA6, cVarA7, cVarA8});
        j.b("Nothing");
        f188628l = j.b("Unit");
        f188629m = j.b("Any");
        f188630n = j.b("Enum");
        j.b("Annotation");
        f188631o = j.b("Array");
        b bVarB = j.b("Boolean");
        f188632p = bVarB;
        b bVarB2 = j.b("Char");
        b bVarB3 = j.b("Byte");
        b bVarB4 = j.b("Short");
        b bVarB5 = j.b("Int");
        f188633q = bVarB5;
        b bVarB6 = j.b("Long");
        f188634r = bVarB6;
        b bVarB7 = j.b("Float");
        b bVarB8 = j.b("Double");
        f188635s = j.g(bVarB3);
        f188636t = j.g(bVarB4);
        f188637u = j.g(bVarB5);
        f188638v = j.g(bVarB6);
        j.b("CharSequence");
        f188639w = j.b("String");
        j.b("Throwable");
        j.b("Cloneable");
        j.f("KProperty");
        j.f("KMutableProperty");
        j.f("KProperty0");
        j.f("KMutableProperty0");
        j.f("KProperty1");
        j.f("KMutableProperty1");
        j.f("KProperty2");
        j.f("KMutableProperty2");
        f188640x = j.f("KFunction");
        j.f("KClass");
        j.f("KCallable");
        j.f("KType");
        j.b("Comparable");
        j.b("Number");
        j.b("Function");
        Set<b> setM0 = u.m0(new b[]{bVarB, bVarB2, bVarB3, bVarB4, bVarB5, bVarB6, bVarB7, bVarB8});
        f188641y = setM0;
        f188642z = u.m0(new b[]{bVarB3, bVarB4, bVarB5, bVarB6});
        Set<b> set = setM0;
        int iA = t0.a(y.r(set, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : set) {
            linkedHashMap.put(obj, j.e(((b) obj).f()));
        }
        j.d(linkedHashMap);
        Set<b> setM1 = u.m0(new b[]{f188635s, f188636t, f188637u, f188638v});
        A = setM1;
        Set<b> set2 = setM1;
        int iA2 = t0.a(y.r(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, j.e(((b) obj2).f()));
        }
        j.d(linkedHashMap2);
        Set<b> set3 = f188641y;
        Set<b> set4 = A;
        LinkedHashSet linkedHashSetH = c1.h(set3, set4);
        b bVar = f188639w;
        c1.i(linkedHashSetH, bVar);
        f188617a.getClass();
        new b(f188623g, f.e("Continuation"));
        j.c("Iterator");
        j.c("Iterable");
        j.c("Collection");
        j.c("List");
        j.c("ListIterator");
        j.c("Set");
        b bVarC = j.c("Map");
        j.c("AbstractMap");
        j.c("MutableIterator");
        j.c("CharIterator");
        j.c("MutableIterable");
        j.c("MutableCollection");
        B = j.c("MutableList");
        j.c("MutableListIterator");
        C = j.c("MutableSet");
        b bVarC2 = j.c("MutableMap");
        D = bVarC2;
        bVarC.d(f.e("Entry"));
        bVarC2.d(f.e("MutableEntry"));
        j.b("Result");
        c cVar2 = f188621e;
        new b(cVar2, f.e("IntRange"));
        new b(cVar2, f.e("LongRange"));
        new b(cVar2, f.e("CharRange"));
        c cVar3 = f188622f;
        new b(cVar3, f.e("AnnotationRetention"));
        new b(cVar3, f.e("AnnotationTarget"));
        j.b("DeprecationLevel");
        E = new b(f188624h, f.e("EnumEntries"));
        b bVarA = j.a("AtomicBoolean");
        b bVarA2 = j.a("AtomicInt");
        b bVarA3 = j.a("AtomicLong");
        j.a("AtomicReference");
        p pVar = new p(f188632p, bVarA);
        b bVar2 = f188633q;
        p pVar2 = new p(bVar2, bVarA2);
        b bVar3 = f188634r;
        F = u0.e(pVar, pVar2, new p(bVar3, bVarA3));
        j.a("AtomicArray");
        G = u0.e(new p(bVar2, j.a("AtomicIntArray")), new p(bVar3, j.a("AtomicLongArray")));
        c1.i(c1.i(c1.i(c1.i(c1.h(set3, set4), bVar), f188628l), f188629m), f188630n);
    }

    private i() {
    }
}
