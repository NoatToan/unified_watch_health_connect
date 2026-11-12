package uk;

import java.util.PriorityQueue;
import java.util.concurrent.CancellationException;
import o53.e2;
import o53.l1;
import o53.n1;
import o53.p1;
import o53.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Luk/e;", "", "<init>", "()V", "a", "b", "vivoki_release"}, k = 1, mv = {1, 4, 0})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f171651a = ge1.b.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue<b> f171652b = new PriorityQueue<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f171653c;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Luk/e$b;", "Lo53/r;", "", "", "", "priority", "Lo53/l1;", "parent", "<init>", "(ILo53/l1;)V", "vivoki_release"}, k = 1, mv = {1, 4, 0})
    public static final class b implements o53.r<Unit>, Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f171654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f171655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o53.s f171656c;

        public b(int i14, l1 l1Var) {
            l1Var.getClass();
            this.f171656c = new o53.s(l1Var);
            this.f171655b = i14;
            this.f171654a = System.currentTimeMillis();
        }

        @Override // o53.l1
        public final o53.o E(p1 p1Var) {
            return this.f171656c.E(p1Var);
        }

        @Override // o53.l1
        public final u0 J(e23.l<? super Throwable, Unit> lVar) {
            return this.f171656c.J(lVar);
        }

        @Override // o53.r
        public final boolean O(Throwable th3) {
            th3.getClass();
            return this.f171656c.O(th3);
        }

        @Override // o53.l1
        public final Object P(t13.d<? super Unit> dVar) {
            return this.f171656c.P(dVar);
        }

        @Override // o53.l1
        public final CancellationException Q() {
            return this.f171656c.Q();
        }

        @Override // o53.l1
        public final c53.j<l1> a() {
            return this.f171656c.a();
        }

        @Override // o53.i0
        public final Object await(t13.d<? super Unit> dVar) {
            Object objC = this.f171656c.C(dVar);
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            objC.getClass();
            return objC;
        }

        @Override // o53.l1
        public final void c(CancellationException cancellationException) {
            this.f171656c.c(cancellationException);
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            bVar2.getClass();
            int i14 = bVar2.f171655b;
            int i15 = this.f171655b;
            if (i15 == i14) {
                return this.f171654a < bVar2.f171654a ? -1 : 1;
            }
            return i15 > i14 ? -1 : 1;
        }

        @Override // o53.l1
        public final boolean e() {
            return this.f171656c.e();
        }

        @Override // o53.i0
        public final Object f() {
            this.f171656c.W().getClass();
            return Unit.INSTANCE;
        }

        @Override // t13.g
        public final <R> R fold(R r14, e23.p<? super R, ? super t13.g.a, ? extends R> pVar) {
            pVar.getClass();
            o53.s sVar = this.f171656c;
            sVar.getClass();
            return pVar.invoke(r14, sVar);
        }

        @Override // t13.g
        public final <E extends t13.g.a> E get(t13.g.b<E> bVar) {
            bVar.getClass();
            o53.s sVar = this.f171656c;
            sVar.getClass();
            return (E) t13.g.a.C3052a.b(sVar, bVar);
        }

        @Override // t13.g.a
        public final t13.g.b<?> getKey() {
            this.f171656c.getClass();
            return l1.f129368i0;
        }

        @Override // o53.l1
        public final boolean isActive() {
            return this.f171656c.isActive();
        }

        @Override // o53.l1
        public final boolean isCancelled() {
            return this.f171656c.isCancelled();
        }

        @Override // t13.g
        public final t13.g minusKey(t13.g.b<?> bVar) {
            bVar.getClass();
            o53.s sVar = this.f171656c;
            sVar.getClass();
            return t13.g.a.C3052a.c(sVar, bVar);
        }

        @Override // o53.r
        public final boolean p(Unit unit) {
            Unit unit2 = unit;
            unit2.getClass();
            return this.f171656c.g0(unit2);
        }

        @Override // t13.g
        public final t13.g plus(t13.g gVar) {
            gVar.getClass();
            o53.s sVar = this.f171656c;
            sVar.getClass();
            return t13.g.a.C3052a.d(gVar, sVar);
        }

        @Override // o53.l1
        public final boolean start() {
            return this.f171656c.start();
        }

        @Override // o53.l1
        public final u0 w(boolean z14, boolean z15, n1 n1Var) {
            return this.f171656c.w(z14, z15, n1Var);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0080 A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:33:0x0076, B:36:0x0080, B:39:0x0086), top: B:66:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:33:0x0076, B:36:0x0080, B:39:0x0086), top: B:66:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b1 A[Catch: all -> 0x00b5, TRY_ENTER, TryCatch #2 {all -> 0x00b5, blocks: (B:50:0x00a7, B:53:0x00b1, B:56:0x00b7), top: B:67:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b7 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #2 {all -> 0x00b5, blocks: (B:50:0x00a7, B:53:0x00b1, B:56:0x00b7), top: B:67:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i14, d0 d0Var, t13.d dVar) {
        f fVar;
        Throwable th3;
        b bVar;
        e eVar;
        boolean zG;
        PriorityQueue<b> priorityQueue;
        boolean zG2;
        PriorityQueue<b> priorityQueue2;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i15 = fVar.f171659b;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                fVar.f171659b = i15 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, dVar);
            }
        } else {
            fVar = new f(this, dVar);
        }
        Object obj = fVar.f171658a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = fVar.f171659b;
        b bVarPoll = null;
        if (i16 != 0) {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = fVar.f171662e;
            eVar = fVar.f171661d;
            try {
                o13.r.b(obj);
                synchronized (eVar.f171652b) {
                    try {
                        zG2 = p005kotlin.jvm.internal.s.g(eVar.f171653c, bVar);
                        priorityQueue2 = eVar.f171652b;
                        if (zG2) {
                            bVarPoll = priorityQueue2.poll();
                            eVar.f171653c = bVarPoll;
                        } else {
                            priorityQueue2.remove(bVar);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (bVarPoll != null) {
                    Unit unit = Unit.INSTANCE;
                    unit.getClass();
                    bVarPoll.f171656c.g0(unit);
                }
                return obj;
            } catch (Throwable th5) {
                th3 = th5;
                synchronized (eVar.f171652b) {
                    try {
                        zG = p005kotlin.jvm.internal.s.g(eVar.f171653c, bVar);
                        priorityQueue = eVar.f171652b;
                        if (zG) {
                            bVarPoll = priorityQueue.poll();
                            eVar.f171653c = bVarPoll;
                        } else {
                            priorityQueue.remove(bVar);
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                if (bVarPoll != null) {
                    Unit unit2 = Unit.INSTANCE;
                    unit2.getClass();
                    bVarPoll.f171656c.g0(unit2);
                }
                throw th3;
            }
        }
        o13.r.b(obj);
        b bVar2 = new b(i14, this.f171651a);
        synchronized (this.f171652b) {
            try {
                if (this.f171653c == null) {
                    this.f171653c = bVar2;
                    Unit unit3 = Unit.INSTANCE;
                    unit3.getClass();
                    bVar2.f171656c.g0(unit3);
                } else {
                    this.f171652b.add(bVar2);
                }
            } catch (Throwable th7) {
                throw th7;
            }
        }
        try {
            g gVar = new g(this, bVar2, d0Var, null);
            fVar.f171661d = this;
            fVar.f171662e = bVar2;
            fVar.f171659b = 1;
            Object objE = o53.c0.e(gVar, fVar);
            if (objE == aVar) {
                return aVar;
            }
            obj = objE;
            bVar = bVar2;
            eVar = this;
            synchronized (eVar.f171652b) {
                zG2 = p005kotlin.jvm.internal.s.g(eVar.f171653c, bVar);
                priorityQueue2 = eVar.f171652b;
                if (zG2) {
                    priorityQueue2.remove(bVar);
                } else {
                    bVarPoll = priorityQueue2.poll();
                    eVar.f171653c = bVarPoll;
                }
                if (bVarPoll != null) {
                    Unit unit4 = Unit.INSTANCE;
                    unit4.getClass();
                    bVarPoll.f171656c.g0(unit4);
                }
                return obj;
            }
        } catch (Throwable th8) {
            th3 = th8;
            bVar = bVar2;
            eVar = this;
            synchronized (eVar.f171652b) {
                zG = p005kotlin.jvm.internal.s.g(eVar.f171653c, bVar);
                priorityQueue = eVar.f171652b;
                if (zG) {
                    priorityQueue.remove(bVar);
                } else {
                    bVarPoll = priorityQueue.poll();
                    eVar.f171653c = bVarPoll;
                }
                if (bVarPoll != null) {
                    Unit unit5 = Unit.INSTANCE;
                    unit5.getClass();
                    bVarPoll.f171656c.g0(unit5);
                }
                throw th3;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luk/e$a;", "", "<init>", "()V", "", "DEFAULT_PRIORITY", "I", "vivoki_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }
}
