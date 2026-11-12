package androidx.camera.core.impl;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/camera/core/impl/o0;", "", "Ljava/util/concurrent/Executor;", "backgroundExecutor", "<init>", "(Ljava/util/concurrent/Executor;)V", "b", "c", "a", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f5664l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f5665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f5667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f5668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z1<List<b0.q>> f5669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f5670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile List<b0.q> f5671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f5672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList<q1> f5673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f5674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f5675k;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/core/impl/o0$b;", "", "Lb0/s;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Lb0/s;Ljava/util/concurrent/Executor;)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f5676a;

        public b(b0.s sVar, Executor executor) {
            sVar.getClass();
            executor.getClass();
            this.f5676a = executor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f5676a.equals(((b) obj).f5676a);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ListenerWrapper(listener=null, executor=" + this.f5676a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/camera/core/impl/o0$c;", "Landroidx/camera/core/impl/z1$a;", "", "Lb0/q;", "<init>", "(Landroidx/camera/core/impl/o0;)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class c implements z1.a<List<? extends b0.q>> {
        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:19:0x0057 A[LOOP:1: B:17:0x0051->B:19:0x0057, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x007e  */
        /* JADX WARN: Code duplicated, block: B:26:0x00ab A[LOOP:2: B:24:0x00a5->B:26:0x00ab, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:30:0x00c6 A[Catch: Exception -> 0x0136, LOOP:3: B:28:0x00c0->B:30:0x00c6, LOOP_END, TryCatch #3 {Exception -> 0x0136, blocks: (B:27:0x00b9, B:28:0x00c0, B:30:0x00c6, B:31:0x00d4, B:33:0x00d8, B:34:0x00de, B:36:0x00e6, B:37:0x00f1, B:39:0x00f7, B:40:0x0104, B:41:0x010d, B:43:0x0113, B:46:0x0122, B:48:0x0131), top: B:85:0x00b9 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00d8 A[Catch: Exception -> 0x0136, TryCatch #3 {Exception -> 0x0136, blocks: (B:27:0x00b9, B:28:0x00c0, B:30:0x00c6, B:31:0x00d4, B:33:0x00d8, B:34:0x00de, B:36:0x00e6, B:37:0x00f1, B:39:0x00f7, B:40:0x0104, B:41:0x010d, B:43:0x0113, B:46:0x0122, B:48:0x0131), top: B:85:0x00b9 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00e6 A[Catch: Exception -> 0x0136, TryCatch #3 {Exception -> 0x0136, blocks: (B:27:0x00b9, B:28:0x00c0, B:30:0x00c6, B:31:0x00d4, B:33:0x00d8, B:34:0x00de, B:36:0x00e6, B:37:0x00f1, B:39:0x00f7, B:40:0x0104, B:41:0x010d, B:43:0x0113, B:46:0x0122, B:48:0x0131), top: B:85:0x00b9 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00f7 A[Catch: Exception -> 0x0136, LOOP:4: B:37:0x00f1->B:39:0x00f7, LOOP_END, TryCatch #3 {Exception -> 0x0136, blocks: (B:27:0x00b9, B:28:0x00c0, B:30:0x00c6, B:31:0x00d4, B:33:0x00d8, B:34:0x00de, B:36:0x00e6, B:37:0x00f1, B:39:0x00f7, B:40:0x0104, B:41:0x010d, B:43:0x0113, B:46:0x0122, B:48:0x0131), top: B:85:0x00b9 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x0113 A[Catch: Exception -> 0x0136, TRY_LEAVE, TryCatch #3 {Exception -> 0x0136, blocks: (B:27:0x00b9, B:28:0x00c0, B:30:0x00c6, B:31:0x00d4, B:33:0x00d8, B:34:0x00de, B:36:0x00e6, B:37:0x00f1, B:39:0x00f7, B:40:0x0104, B:41:0x010d, B:43:0x0113, B:46:0x0122, B:48:0x0131), top: B:85:0x00b9 }] */
        /* JADX WARN: Code duplicated, block: B:87:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x010d A[SYNTHETIC] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.camera.core.impl.z1.a
        public final void a(List<? extends b0.q> list) {
            j0 j0Var;
            List<String> list2;
            ArrayList arrayList;
            o0 o0Var;
            List listB1;
            Set<b0.q> setG;
            Set<b0.q> setG2;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Iterator it;
            Iterator<T> it3;
            r0 r0Var;
            Iterator<T> it4;
            String strA;
            r0 r0Var2;
            List<? extends b0.q> list3 = list;
            if (o0.this.f5672h.get() && (j0Var = o0.this.f5667c) != null) {
                try {
                    if (list3 != null) {
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                        Iterator<T> it5 = list3.iterator();
                        while (true) {
                            list2 = arrayList4;
                            if (!it5.hasNext()) {
                                break;
                            } else {
                                arrayList4.add(((b0.q) it5.next()).a());
                            }
                        }
                        j0Var.b(list2);
                        LinkedHashSet<String> linkedHashSetE = j0Var.e();
                        arrayList = new ArrayList(p13.y.r(linkedHashSetE, 10));
                        for (String str : linkedHashSetE) {
                            b0.q.a aVar = b0.q.f14044c;
                            str.getClass();
                            aVar.getClass();
                            arrayList.add(b0.q.a.a(str, null, null));
                        }
                        o0Var = o0.this;
                        listB1 = p13.h0.b1(o0Var.f5671g);
                        if (arrayList.equals(listB1)) {
                            return;
                        }
                        Set setG1 = p13.h0.g1(listB1);
                        Set setG3 = p13.h0.g1(arrayList);
                        setG = p13.c1.g(setG3, setG1);
                        setG2 = p13.c1.g(setG1, setG3);
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((b0.q) it.next()).a());
                        }
                        try {
                            it3 = setG2.iterator();
                            while (it3.hasNext()) {
                                o0Var.b(((b0.q) it3.next()).a());
                            }
                            r0Var = o0Var.f5668d;
                            if (r0Var != null) {
                                r0Var.a(arrayList3);
                                arrayList2.add(r0Var);
                            }
                            if (!o0Var.f5673i.isEmpty()) {
                                o0Var.f5673i.size();
                                for (q1 q1Var : o0Var.f5673i) {
                                    q1Var.a(arrayList3);
                                    arrayList2.add(q1Var);
                                }
                            }
                            o0Var.f5671g = arrayList;
                            it4 = setG.iterator();
                            while (it4.hasNext()) {
                                strA = ((b0.q) it4.next()).a();
                                r0Var2 = o0Var.f5668d;
                                if (r0Var2 == null) {
                                    try {
                                        k0 k0VarC = r0Var2.b(strA).c();
                                        k0VarC.getClass();
                                        o0Var.c(k0VarC);
                                    } catch (IllegalArgumentException unused) {
                                    }
                                }
                            }
                            o0Var.a(setG, setG2);
                        } catch (Exception unused2) {
                            ArrayList arrayList5 = new ArrayList(p13.y.r(listB1, 10));
                            Iterator it6 = listB1.iterator();
                            while (it6.hasNext()) {
                                arrayList5.add(((b0.q) it6.next()).a());
                            }
                            Iterator it7 = new p13.x0(arrayList2).iterator();
                            while (true) {
                                p13.x0.a aVar2 = (p13.x0.a) it7;
                                if (!aVar2.f134964a.hasPrevious()) {
                                    break;
                                }
                                q1 q1Var2 = (q1) aVar2.f134964a.previous();
                                try {
                                    q1Var2.a(arrayList5);
                                } catch (Exception unused3) {
                                    Objects.toString(q1Var2);
                                }
                            }
                            Iterator<T> it8 = setG2.iterator();
                            while (it8.hasNext()) {
                                String strA2 = ((b0.q) it8.next()).a();
                                r0 r0Var3 = o0Var.f5668d;
                                if (r0Var3 != null) {
                                    try {
                                        k0 k0VarC2 = r0Var3.b(strA2).c();
                                        k0VarC2.getClass();
                                        o0Var.c(k0VarC2);
                                    } catch (IllegalArgumentException unused4) {
                                    }
                                }
                            }
                            Iterator<T> it9 = setG.iterator();
                            while (it9.hasNext()) {
                                o0Var.b(((b0.q) it9.next()).a());
                            }
                            return;
                        }
                    }
                    list2 = p13.j0.f134944a;
                    j0Var.b(list2);
                    LinkedHashSet<String> linkedHashSetE2 = j0Var.e();
                    arrayList = new ArrayList(p13.y.r(linkedHashSetE2, 10));
                    while (r10.hasNext()) {
                        b0.q.a aVar3 = b0.q.f14044c;
                        str.getClass();
                        aVar3.getClass();
                        arrayList.add(b0.q.a.a(str, null, null));
                    }
                    o0Var = o0.this;
                    listB1 = p13.h0.b1(o0Var.f5671g);
                    if (arrayList.equals(listB1)) {
                        return;
                    }
                    Set setG4 = p13.h0.g1(listB1);
                    Set setG5 = p13.h0.g1(arrayList);
                    setG = p13.c1.g(setG5, setG4);
                    setG2 = p13.c1.g(setG4, setG5);
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((b0.q) it.next()).a());
                    }
                    it3 = setG2.iterator();
                    while (it3.hasNext()) {
                        o0Var.b(((b0.q) it3.next()).a());
                    }
                    r0Var = o0Var.f5668d;
                    if (r0Var != null) {
                        r0Var.a(arrayList3);
                        arrayList2.add(r0Var);
                    }
                    if (!o0Var.f5673i.isEmpty()) {
                        o0Var.f5673i.size();
                        while (r7.hasNext()) {
                            q1Var.a(arrayList3);
                            arrayList2.add(q1Var);
                        }
                    }
                    o0Var.f5671g = arrayList;
                    it4 = setG.iterator();
                    while (it4.hasNext()) {
                        strA = ((b0.q) it4.next()).a();
                        r0Var2 = o0Var.f5668d;
                        if (r0Var2 == null) {
                            k0 k0VarC3 = r0Var2.b(strA).c();
                            k0VarC3.getClass();
                            o0Var.c(k0VarC3);
                        }
                    }
                    o0Var.a(setG, setG2);
                } catch (Exception unused5) {
                    z1<List<b0.q>> z1Var = o0.this.f5669e;
                    if (z1Var != null) {
                        z1Var.b();
                    }
                }
            }
        }

        @Override // androidx.camera.core.impl.z1.a
        public final void onError(Throwable th3) {
            z1<List<b0.q>> z1Var;
            th3.getClass();
            o0 o0Var = o0.this;
            if (o0Var.f5672h.get() && (z1Var = o0Var.f5669e) != null) {
                z1Var.b();
            }
        }
    }

    static {
        new a(null);
    }

    public o0(Executor executor) {
        executor.getClass();
        this.f5665a = executor;
        this.f5666b = new Object();
        this.f5670f = new c();
        this.f5671g = p13.j0.f134944a;
        this.f5672h = new AtomicBoolean(false);
        this.f5673i = new CopyOnWriteArrayList<>();
        this.f5674j = new CopyOnWriteArrayList<>();
        this.f5675k = new LinkedHashMap();
    }

    public final void a(final Set<b0.q> set, final Set<b0.q> set2) {
        boolean zIsEmpty = set.isEmpty();
        CopyOnWriteArrayList<b> copyOnWriteArrayList = this.f5674j;
        if (!zIsEmpty) {
            set.size();
            for (final b bVar : copyOnWriteArrayList) {
                final int i14 = 1;
                bVar.f5676a.execute(new Runnable(bVar, set, i14) { // from class: androidx.camera.core.impl.n0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f5641a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Set f5642b;

                    {
                        this.f5641a = i14;
                        this.f5642b = set;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (this.f5641a) {
                            case 0:
                                int i15 = o0.f5664l;
                                throw null;
                            default:
                                int i16 = o0.f5664l;
                                throw null;
                        }
                    }
                });
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        set2.size();
        for (final b bVar2 : copyOnWriteArrayList) {
            final int i15 = 0;
            bVar2.f5676a.execute(new Runnable(bVar2, set2, i15) { // from class: androidx.camera.core.impl.n0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f5641a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Set f5642b;

                {
                    this.f5641a = i15;
                    this.f5642b = set2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f5641a) {
                        case 0:
                            int i16 = o0.f5664l;
                            throw null;
                        default:
                            int i17 = o0.f5664l;
                            throw null;
                    }
                }
            });
        }
    }

    public final void b(String str) {
        synchronized (this.f5666b) {
            androidx.lifecycle.z0 z0Var = (androidx.lifecycle.z0) this.f5675k.remove(str);
            r0 r0Var = this.f5668d;
            if (z0Var != null && r0Var != null) {
                try {
                    k0.b.d().execute(new ab.j(3, r0Var.b(str), z0Var));
                } catch (IllegalArgumentException unused) {
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void c(k0 k0Var) {
        String strQ = k0Var.q();
        strQ.getClass();
        if (this.f5672h.get()) {
            synchronized (this.f5666b) {
                if (this.f5675k.containsKey(strQ)) {
                    return;
                }
                a4.b bVar = new a4.b(this, strQ);
                k0.b.d().execute(new ab.j(4, k0Var, bVar));
                this.f5675k.put(strQ, bVar);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void d() {
        if (this.f5672h.getAndSet(false)) {
            z1<List<b0.q>> z1Var = this.f5669e;
            if (z1Var != null) {
                z1Var.c(this.f5670f);
            }
            synchronized (this.f5666b) {
                if (!this.f5675k.isEmpty()) {
                    Map mapM = p13.u0.m(this.f5675k);
                    this.f5675k.clear();
                    Unit unit = Unit.INSTANCE;
                    r0 r0Var = this.f5668d;
                    if (r0Var != null) {
                        LinkedHashSet<l0> linkedHashSetC = r0Var.c();
                        ArrayList arrayList = new ArrayList(p13.y.r(linkedHashSetC, 10));
                        Iterator<T> it = linkedHashSetC.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((l0) it.next()).c());
                        }
                        mapM.size();
                        ArrayList arrayList2 = new ArrayList(mapM.size());
                        for (Map.Entry entry : mapM.entrySet()) {
                            String str = (String) entry.getKey();
                            k0.b.d().execute(new a8.d(arrayList, 3, (androidx.lifecycle.z0) entry.getValue(), str));
                            arrayList2.add(Unit.INSTANCE);
                        }
                    }
                }
            }
            this.f5673i.clear();
            this.f5674j.clear();
            this.f5671g = p13.j0.f134944a;
            this.f5667c = null;
            this.f5668d = null;
        }
    }

    public final void e(j0 j0Var, r0 r0Var) {
        j0Var.getClass();
        r0Var.getClass();
        if (this.f5672h.compareAndSet(false, true)) {
            LinkedHashSet<String> linkedHashSetE = j0Var.e();
            ArrayList arrayList = new ArrayList(p13.y.r(linkedHashSetE, 10));
            for (String str : linkedHashSetE) {
                b0.q.a aVar = b0.q.f14044c;
                str.getClass();
                aVar.getClass();
                arrayList.add(b0.q.a.a(str, null, null));
            }
            this.f5671g = arrayList;
            this.f5667c = j0Var;
            this.f5668d = r0Var;
            v.k0 k0VarD = j0Var.d();
            this.f5669e = k0VarD;
            if (k0VarD != null) {
                k0VarD.d(this.f5665a, this.f5670f);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/camera/core/impl/o0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
