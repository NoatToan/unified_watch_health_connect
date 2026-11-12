package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0002\t\nB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/o0;", "Landroidx/lifecycle/b0;", "Landroidx/lifecycle/n0;", "provider", "", "enforceMainThread", "<init>", "(Landroidx/lifecycle/n0;Z)V", "(Landroidx/lifecycle/n0;)V", "b", "a", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class o0 extends b0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f7970k = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o.a<m0, b> f7972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0.b f7973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference<n0> f7974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList<b0.b> f7978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f7979j;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/o0$b;", "", "Landroidx/lifecycle/m0;", "observer", "Landroidx/lifecycle/b0$b;", "initialState", "<init>", "(Landroidx/lifecycle/m0;Landroidx/lifecycle/b0$b;)V", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b0.b f7980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k0 f7981b;

        public b(m0 m0Var, b0.b bVar) {
            k0 g1Var;
            bVar.getClass();
            m0Var.getClass();
            r0 r0Var = r0.f8000a;
            boolean z14 = m0Var instanceof k0;
            boolean z15 = m0Var instanceof n;
            if (z14 && z15) {
                g1Var = new o((n) m0Var, (k0) m0Var);
            } else if (z15) {
                g1Var = new o((n) m0Var, null);
            } else if (z14) {
                g1Var = (k0) m0Var;
            } else {
                Class<?> cls = m0Var.getClass();
                r0Var.getClass();
                if (r0.b(cls) == 2) {
                    Object obj = r0.f8002c.get(cls);
                    obj.getClass();
                    List list = (List) obj;
                    if (list.size() == 1) {
                        g1Var = new s1(r0.a((Constructor) list.get(0), m0Var));
                    } else {
                        int size = list.size();
                        x[] xVarArr = new x[size];
                        for (int i14 = 0; i14 < size; i14++) {
                            xVarArr[i14] = r0.a((Constructor) list.get(i14), m0Var);
                        }
                        g1Var = new g(xVarArr);
                    }
                } else {
                    g1Var = new g1(m0Var);
                }
            }
            this.f7981b = g1Var;
            this.f7980a = bVar;
        }

        public final void a(n0 n0Var, b0.a aVar) {
            b0.b bVarA = aVar.a();
            a aVar2 = o0.f7970k;
            b0.b bVar = this.f7980a;
            aVar2.getClass();
            bVar.getClass();
            if (bVarA != null && bVarA.compareTo(bVar) < 0) {
                bVar = bVarA;
            }
            this.f7980a = bVar;
            this.f7981b.onStateChanged(n0Var, aVar);
            this.f7980a = bVarA;
        }
    }

    private o0(n0 n0Var, boolean z14) {
        this.f7971b = z14;
        this.f7972c = new o.a<>();
        b0.b bVar = b0.b.INITIALIZED;
        this.f7973d = bVar;
        this.f7978i = new ArrayList<>();
        this.f7974e = new WeakReference<>(n0Var);
        this.f7979j = q2.a(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.lifecycle.b0
    public final void a(m0 m0Var) {
        b bVar;
        n0 n0Var;
        m0Var.getClass();
        f("addObserver");
        b0.b bVar2 = this.f7973d;
        b0.b bVar3 = b0.b.DESTROYED;
        if (bVar2 != bVar3) {
            bVar3 = b0.b.INITIALIZED;
        }
        b bVar4 = new b(m0Var, bVar3);
        o.a<m0, b> aVar = this.f7972c;
        o.b.c<m0, b> cVarA = aVar.a(m0Var);
        if (cVarA != null) {
            bVar = cVarA.f128472b;
        } else {
            HashMap<K, o.b.c<K, V>> map = aVar.f128466e;
            o.b.c<K, V> cVar = new o.b.c<>(m0Var, bVar4);
            aVar.f128470d++;
            o.b.c<K, V> cVar2 = aVar.f128468b;
            if (cVar2 == 0) {
                aVar.f128467a = cVar;
                aVar.f128468b = cVar;
            } else {
                cVar2.f128473c = cVar;
                cVar.f128474d = cVar2;
                aVar.f128468b = cVar;
            }
            map.put((K) m0Var, cVar);
            bVar = null;
        }
        if (bVar == null && (n0Var = this.f7974e.get()) != null) {
            boolean z14 = this.f7975f != 0 || this.f7976g;
            b0.b bVarE = e(m0Var);
            this.f7975f++;
            while (bVar4.f7980a.compareTo(bVarE) < 0 && this.f7972c.f128466e.containsKey(m0Var)) {
                b0.b bVar5 = bVar4.f7980a;
                ArrayList<b0.b> arrayList = this.f7978i;
                arrayList.add(bVar5);
                b0.a.Companion companion = b0.a.INSTANCE;
                b0.b bVar6 = bVar4.f7980a;
                companion.getClass();
                b0.a aVarB = b0.a.Companion.b(bVar6);
                if (aVarB == null) {
                    androidx.room.a0.s(bVar4.f7980a, "no event up from ");
                    return;
                } else {
                    bVar4.a(n0Var, aVarB);
                    arrayList.remove(arrayList.size() - 1);
                    bVarE = e(m0Var);
                }
            }
            if (!z14) {
                j();
            }
            this.f7975f--;
        }
    }

    @Override // androidx.lifecycle.b0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0.b getF7973d() {
        return this.f7973d;
    }

    @Override // androidx.lifecycle.b0
    public final r53.b2 c() {
        return r53.s.d(this.f7979j);
    }

    @Override // androidx.lifecycle.b0
    public final void d(m0 m0Var) {
        m0Var.getClass();
        f("removeObserver");
        this.f7972c.b(m0Var);
    }

    public final b0.b e(m0 m0Var) {
        b value;
        HashMap<m0, o.b.c<m0, b>> map = this.f7972c.f128466e;
        o.b.c<m0, b> cVar = map.containsKey(m0Var) ? map.get(m0Var).f128474d : null;
        b0.b bVar = (cVar == null || (value = cVar.getValue()) == null) ? null : value.f7980a;
        ArrayList<b0.b> arrayList = this.f7978i;
        b0.b bVar2 = arrayList.isEmpty() ? null : (b0.b) am.j.f(1, arrayList);
        b0.b bVar3 = this.f7973d;
        f7970k.getClass();
        bVar3.getClass();
        if (bVar == null || bVar.compareTo(bVar3) >= 0) {
            bVar = bVar3;
        }
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    public final void f(String str) {
        if (!this.f7971b || n.a.a().f122013a.a()) {
            return;
        }
        v.e0.n(am.j.m("Method ", str, " must be called on the main thread"));
    }

    public final void g(b0.a aVar) {
        aVar.getClass();
        f("handleLifecycleEvent");
        h(aVar.a());
    }

    public final void h(b0.b bVar) {
        if (this.f7973d == bVar) {
            return;
        }
        n0 n0Var = this.f7974e.get();
        b0.b bVar2 = this.f7973d;
        bVar2.getClass();
        bVar.getClass();
        if (bVar2 == b0.b.INITIALIZED && bVar == b0.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + b0.b.CREATED + "' to be moved to '" + bVar + "' in component " + n0Var).toString());
        }
        b0.b bVar3 = b0.b.DESTROYED;
        if (bVar2 == bVar3 && bVar2 != bVar) {
            throw new IllegalStateException(("State is '" + bVar3 + "' and cannot be moved to `" + bVar + "` in component " + n0Var).toString());
        }
        this.f7973d = bVar;
        if (this.f7976g || this.f7975f != 0) {
            this.f7977h = true;
            return;
        }
        this.f7976g = true;
        j();
        this.f7976g = false;
        if (this.f7973d == bVar3) {
            this.f7972c = new o.a<>();
        }
    }

    public final void i(b0.b bVar) {
        bVar.getClass();
        f("setCurrentState");
        h(bVar);
    }

    public final void j() {
        n0 n0Var = this.f7974e.get();
        if (n0Var == null) {
            vb.h.z("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            o.a<m0, b> aVar = this.f7972c;
            if (aVar.f128470d != 0) {
                o.b.c<m0, b> cVar = aVar.f128467a;
                cVar.getClass();
                b0.b bVar = cVar.getValue().f7980a;
                o.b.c<m0, b> cVar2 = this.f7972c.f128468b;
                cVar2.getClass();
                b0.b bVar2 = cVar2.getValue().f7980a;
                if (bVar == bVar2 && this.f7973d == bVar2) {
                    break;
                }
                this.f7977h = false;
                b0.b bVar3 = this.f7973d;
                o.b.c<m0, b> cVar3 = this.f7972c.f128467a;
                cVar3.getClass();
                int iCompareTo = bVar3.compareTo(cVar3.getValue().f7980a);
                ArrayList<b0.b> arrayList = this.f7978i;
                if (iCompareTo < 0) {
                    o.a<m0, b> aVar2 = this.f7972c;
                    o.b.C2464b c2464b = new o.b.C2464b(aVar2.f128468b, aVar2.f128467a);
                    aVar2.f128469c.put(c2464b, Boolean.FALSE);
                    while (c2464b.hasNext() && !this.f7977h) {
                        Map.Entry entry = (Map.Entry) c2464b.next();
                        entry.getClass();
                        m0 m0Var = (m0) entry.getKey();
                        b bVar4 = (b) entry.getValue();
                        while (bVar4.f7980a.compareTo(this.f7973d) > 0 && !this.f7977h && this.f7972c.f128466e.containsKey(m0Var)) {
                            b0.a.Companion companion = b0.a.INSTANCE;
                            b0.b bVar5 = bVar4.f7980a;
                            companion.getClass();
                            b0.a aVarA = b0.a.Companion.a(bVar5);
                            if (aVarA == null) {
                                androidx.room.a0.s(bVar4.f7980a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(aVarA.a());
                                bVar4.a(n0Var, aVarA);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                o.b.c<m0, b> cVar4 = this.f7972c.f128468b;
                if (!this.f7977h && cVar4 != null && this.f7973d.compareTo(cVar4.getValue().f7980a) > 0) {
                    o.a<m0, b> aVar3 = this.f7972c;
                    aVar3.getClass();
                    o.b.d dVar = new o.b.d();
                    aVar3.f128469c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f7977h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        m0 m0Var2 = (m0) entry2.getKey();
                        b bVar6 = (b) entry2.getValue();
                        while (bVar6.f7980a.compareTo(this.f7973d) < 0 && !this.f7977h && this.f7972c.f128466e.containsKey(m0Var2)) {
                            arrayList.add(bVar6.f7980a);
                            b0.a.Companion companion2 = b0.a.INSTANCE;
                            b0.b bVar7 = bVar6.f7980a;
                            companion2.getClass();
                            b0.a aVarB = b0.a.Companion.b(bVar7);
                            if (aVarB == null) {
                                androidx.room.a0.s(bVar6.f7980a, "no event up from ");
                                return;
                            } else {
                                bVar6.a(n0Var, aVarB);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f7977h = false;
        this.f7979j.setValue(this.f7973d);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/o0$a;", "", "<init>", "()V", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ o0(n0 n0Var, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(n0Var, z14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(n0 n0Var) {
        this(n0Var, true);
        n0Var.getClass();
    }
}
