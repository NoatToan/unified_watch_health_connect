package ft2;

import c53.j;
import e23.l;
import e23.p;
import java.util.PriorityQueue;
import java.util.concurrent.CancellationException;
import o13.e;
import o53.b0;
import o53.c0;
import o53.e2;
import o53.l1;
import o53.n1;
import o53.o;
import o53.p1;
import o53.r;
import o53.s;
import o53.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.g;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lft2/c;", "", "<init>", "()V", "a", "b", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f73454a = ge1.b.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue<b> f73455b = new PriorityQueue<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f73456c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f73457d;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lft2/c$b;", "Lo53/r;", "", "", "", "priority", "Lo53/l1;", "parent", "<init>", "(ILo53/l1;)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements r<Unit>, Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f73458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f73460c;

        public b(int i14, l1 l1Var) {
            l1Var.getClass();
            this.f73458a = new s(l1Var);
            this.f73459b = i14;
            this.f73460c = System.currentTimeMillis();
        }

        @Override // o53.l1
        public final o E(p1 p1Var) {
            return this.f73458a.E(p1Var);
        }

        @Override // o53.l1
        public final u0 J(l<? super Throwable, Unit> lVar) {
            return this.f73458a.J(lVar);
        }

        @Override // o53.r
        public final boolean O(Throwable th3) {
            th3.getClass();
            return this.f73458a.O(th3);
        }

        @Override // o53.l1
        public final Object P(t13.d<? super Unit> dVar) {
            return this.f73458a.P(dVar);
        }

        @Override // o53.l1
        public final CancellationException Q() {
            return this.f73458a.Q();
        }

        @Override // o53.l1
        public final j<l1> a() {
            return this.f73458a.a();
        }

        @Override // o53.i0
        public final Object await(t13.d<? super Unit> dVar) {
            Object objC = this.f73458a.C(dVar);
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            return objC;
        }

        @Override // o53.l1
        public final void c(CancellationException cancellationException) {
            this.f73458a.c(cancellationException);
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            bVar2.getClass();
            int i14 = bVar2.f73459b;
            int i15 = this.f73459b;
            if (i15 == i14) {
                return this.f73460c < bVar2.f73460c ? -1 : 1;
            }
            return i15 > i14 ? -1 : 1;
        }

        @Override // o53.l1
        public final boolean e() {
            return this.f73458a.e();
        }

        @Override // o53.i0
        public final Object f() throws Throwable {
            this.f73458a.W();
            return Unit.INSTANCE;
        }

        @Override // t13.g
        public final <R> R fold(R r14, p<? super R, ? super g.a, ? extends R> pVar) {
            pVar.getClass();
            s sVar = this.f73458a;
            sVar.getClass();
            return pVar.invoke(r14, sVar);
        }

        @Override // t13.g
        public final <E extends g.a> E get(g.b<E> bVar) {
            bVar.getClass();
            s sVar = this.f73458a;
            sVar.getClass();
            return (E) g.a.C3052a.b(sVar, bVar);
        }

        @Override // t13.g.a
        public final g.b<?> getKey() {
            this.f73458a.getClass();
            return l1.f129368i0;
        }

        @Override // o53.l1
        public final boolean isActive() {
            return this.f73458a.isActive();
        }

        @Override // o53.l1
        public final boolean isCancelled() {
            return this.f73458a.isCancelled();
        }

        @Override // t13.g
        public final g minusKey(g.b<?> bVar) {
            bVar.getClass();
            s sVar = this.f73458a;
            sVar.getClass();
            return g.a.C3052a.c(sVar, bVar);
        }

        @Override // o53.r
        public final boolean p(Unit unit) {
            Unit unit2 = unit;
            unit2.getClass();
            return this.f73458a.g0(unit2);
        }

        @Override // t13.g
        public final g plus(g gVar) {
            gVar.getClass();
            s sVar = this.f73458a;
            sVar.getClass();
            return g.a.C3052a.d(gVar, sVar);
        }

        @Override // o53.l1
        public final boolean start() {
            return this.f73458a.start();
        }

        @Override // o53.l1
        public final u0 w(boolean z14, boolean z15, n1 n1Var) {
            return this.f73458a.w(z14, z15, n1Var);
        }
    }

    /* JADX INFO: renamed from: ft2.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.gfdi.util.OperationQueue", f = "OperationQueue.kt", l = {86}, m = "queue")
    public static final class C1484c<T> extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f73461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f73462b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f73464d;

        public C1484c(t13.d<? super C1484c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f73462b = obj;
            this.f73464d |= Integer.MIN_VALUE;
            return c.this.b(0, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.util.OperationQueue$queue$4", f = "OperationQueue.kt", l = {88, 89}, m = "invokeSuspend")
    public static final class d<T> extends i implements p<b0, t13.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f73466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f73467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<t13.d<? super T>, Object> f73468d;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.gfdi.util.OperationQueue$queue$4$1", f = "OperationQueue.kt", l = {89}, m = "invokeSuspend")
        public static final class a extends i implements p<b0, t13.d<? super T>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f73469a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l<t13.d<? super T>, Object> f73470b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(l<? super t13.d<? super T>, ? extends Object> lVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f73470b = lVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f73470b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, Object obj) {
                return ((a) create(b0Var, (t13.d) obj)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f73469a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f73469a = 1;
                    Object objInvoke = this.f73470b.invoke(this);
                    return objInvoke == aVar ? aVar : objInvoke;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(b bVar, c cVar, l<? super t13.d<? super T>, ? extends Object> lVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f73466b = bVar;
            this.f73467c = cVar;
            this.f73468d = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f73466b, this.f73467c, this.f73468d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, Object obj) {
            return ((d) create(b0Var, (t13.d) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f73465a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f73465a = 1;
                if (this.f73466b.await(this) != aVar) {
                }
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    o13.r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            e2 e2Var = this.f73467c.f73454a;
            a aVar2 = new a(this.f73468d, null);
            this.f73465a = 2;
            Object objE0 = ge1.b.e0(e2Var, aVar2, this);
            return objE0 == aVar ? aVar : objE0;
        }
    }

    static {
        new a(null);
    }

    public final void a() {
        synchronized (this.f73455b) {
            this.f73455b.clear();
            this.f73456c = false;
            Unit unit = Unit.INSTANCE;
        }
        g8.i.q("OperationQueue closed", this.f73454a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007b A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #4 {all -> 0x007f, blocks: (B:33:0x0071, B:36:0x007b, B:39:0x0081), top: B:71:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0081 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #4 {all -> 0x007f, blocks: (B:33:0x0071, B:36:0x007b, B:39:0x0081), top: B:71:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9 A[Catch: all -> 0x00ad, TRY_ENTER, TryCatch #3 {all -> 0x00ad, blocks: (B:50:0x009f, B:53:0x00a9, B:56:0x00af), top: B:70:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00af A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #3 {all -> 0x00ad, blocks: (B:50:0x009f, B:53:0x00a9, B:56:0x00af), top: B:70:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <T> Object b(int i14, l<? super t13.d<? super T>, ? extends Object> lVar, t13.d<? super T> dVar) {
        C1484c c1484c;
        b bVar;
        boolean zG;
        PriorityQueue<b> priorityQueue;
        boolean zG2;
        PriorityQueue<b> priorityQueue2;
        if (dVar instanceof C1484c) {
            c1484c = (C1484c) dVar;
            int i15 = c1484c.f73464d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c1484c.f73464d = i15 - Integer.MIN_VALUE;
            } else {
                c1484c = new C1484c(dVar);
            }
        } else {
            c1484c = new C1484c(dVar);
        }
        Object obj = c1484c.f73462b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = c1484c.f73464d;
        b bVarPoll = null;
        if (i16 != 0) {
            if (i16 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = c1484c.f73461a;
            try {
                o13.r.b(obj);
                synchronized (this.f73455b) {
                    try {
                        zG2 = p005kotlin.jvm.internal.s.g(this.f73457d, bVar);
                        priorityQueue2 = this.f73455b;
                        if (zG2) {
                            bVarPoll = priorityQueue2.poll();
                            this.f73457d = bVarPoll;
                        } else {
                            priorityQueue2.remove(bVar);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (bVarPoll != null) {
                    Unit unit = Unit.INSTANCE;
                    unit.getClass();
                    bVarPoll.f73458a.g0(unit);
                }
                return obj;
            } catch (Throwable th4) {
                th = th4;
                synchronized (this.f73455b) {
                    try {
                        zG = p005kotlin.jvm.internal.s.g(this.f73457d, bVar);
                        priorityQueue = this.f73455b;
                        if (zG) {
                            bVarPoll = priorityQueue.poll();
                            this.f73457d = bVarPoll;
                        } else {
                            priorityQueue.remove(bVar);
                        }
                        if (bVarPoll != null) {
                            Unit unit2 = Unit.INSTANCE;
                            unit2.getClass();
                            bVarPoll.f73458a.g0(unit2);
                        }
                        throw th;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            }
        }
        o13.r.b(obj);
        b bVar2 = new b(i14, this.f73454a);
        synchronized (this.f73455b) {
            try {
                if (this.f73457d == null) {
                    this.f73457d = bVar2;
                    Unit unit3 = Unit.INSTANCE;
                    unit3.getClass();
                    bVar2.f73458a.g0(unit3);
                } else {
                    this.f73455b.add(bVar2);
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        try {
            d dVar2 = new d(bVar2, this, lVar, null);
            c1484c.f73461a = bVar2;
            c1484c.f73464d = 1;
            Object objE = c0.e(dVar2, c1484c);
            if (objE == aVar) {
                return aVar;
            }
            obj = objE;
            bVar = bVar2;
            synchronized (this.f73455b) {
                zG2 = p005kotlin.jvm.internal.s.g(this.f73457d, bVar);
                priorityQueue2 = this.f73455b;
                if (zG2) {
                    priorityQueue2.remove(bVar);
                } else {
                    bVarPoll = priorityQueue2.poll();
                    this.f73457d = bVarPoll;
                }
                if (bVarPoll != null) {
                    Unit unit4 = Unit.INSTANCE;
                    unit4.getClass();
                    bVarPoll.f73458a.g0(unit4);
                }
                return obj;
            }
        } catch (Throwable th7) {
            th = th7;
            bVar = bVar2;
            synchronized (this.f73455b) {
                zG = p005kotlin.jvm.internal.s.g(this.f73457d, bVar);
                priorityQueue = this.f73455b;
                if (zG) {
                    priorityQueue.remove(bVar);
                } else {
                    bVarPoll = priorityQueue.poll();
                    this.f73457d = bVarPoll;
                }
            }
            if (bVarPoll != null) {
                Unit unit5 = Unit.INSTANCE;
                unit5.getClass();
                bVarPoll.f73458a.g0(unit5);
            }
            throw th;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lft2/c$a;", "", "<init>", "()V", "", "DEFAULT_PRIORITY", "I", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
