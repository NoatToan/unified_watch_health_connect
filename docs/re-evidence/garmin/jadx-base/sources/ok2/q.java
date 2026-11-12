package ok2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import o53.j2;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.q0;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$onNewItemsAvailable$2", f = "CoreTransferManager.kt", l = {1132, 1138, 1169, 1194, 1203}, m = "invokeSuspend")
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConcurrentLinkedQueue<l1> f132769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<wk2.f> f132770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ConcurrentLinkedQueue<wk2.i> f132771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0<com.garmin.device.filetransfer.core.background.a.b> f132772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f132773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<lk2.a> f132774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f132775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ok2.d f132776i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$onNewItemsAvailable$2$1", f = "CoreTransferManager.kt", l = {1139}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f132777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f132778b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f132778b = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f132778b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f132777a;
            if (i14 == 0) {
                o13.r.b(obj);
                o53.s sVar = this.f132778b.f132693l;
                this.f132777a = 1;
                if (sVar.C(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$onNewItemsAvailable$2$5$1", f = "CoreTransferManager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f132779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q0 f132780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<lk2.a> f132781c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$onNewItemsAvailable$2$5$1$1", f = "CoreTransferManager.kt", l = {}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f132782a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0 f132783b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ List<lk2.a> f132784c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, q0 q0Var, List<lk2.a> list, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f132782a = gVar;
                this.f132783b = q0Var;
                this.f132784c = list;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f132782a, this.f132783b, this.f132784c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                long j8 = this.f132783b.f105808a / ((long) 1000);
                lk2.a aVar2 = (lk2.a) p13.h0.d0(this.f132784c);
                g.J(this.f132782a, "onNewItemsAvailable(SMALL-" + j8 + ", " + (aVar2 != null ? aVar2.f113152a : null) + ")", null, false, 6);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, q0 q0Var, List<lk2.a> list, t13.d<? super b> dVar) {
            super(1, dVar);
            this.f132779a = gVar;
            this.f132780b = q0Var;
            this.f132781c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new b(this.f132779a, this.f132780b, this.f132781c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            g gVar = this.f132779a;
            ge1.b.T(gVar.f132687f, null, null, new a(gVar, this.f132780b, this.f132781c, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$onNewItemsAvailable$2$6", f = "CoreTransferManager.kt", l = {}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f132785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<lk2.a> f132786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m0 f132787c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar, List<lk2.a> list, m0 m0Var, t13.d<? super c> dVar) {
            super(1, dVar);
            this.f132785a = gVar;
            this.f132786b = list;
            this.f132787c = m0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new c(this.f132785a, this.f132786b, this.f132787c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            lk2.a aVar2 = (lk2.a) p13.h0.d0(this.f132786b);
            g.J(this.f132785a, "onNewItemsAvailable(NO_DELAY, " + (aVar2 != null ? aVar2.f113152a : null) + ")", null, !this.f132787c.f105804a, 2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d extends p005kotlin.jvm.internal.q implements e23.l<t13.d<? super Unit>, Object> {
        public d(Object obj) {
            super(1, obj, kotlin.jvm.internal.s.a.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            ((e23.a) this.receiver).invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ConcurrentLinkedQueue<l1> concurrentLinkedQueue, List<wk2.f> list, ConcurrentLinkedQueue<wk2.i> concurrentLinkedQueue2, r0<com.garmin.device.filetransfer.core.background.a.b> r0Var, AtomicBoolean atomicBoolean, List<lk2.a> list2, g gVar, ok2.d dVar, t13.d<? super q> dVar2) {
        super(2, dVar2);
        this.f132769b = concurrentLinkedQueue;
        this.f132770c = list;
        this.f132771d = concurrentLinkedQueue2;
        this.f132772e = r0Var;
        this.f132773f = atomicBoolean;
        this.f132774g = list2;
        this.f132775h = gVar;
        this.f132776i = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f132769b, this.f132770c, this.f132771d, this.f132772e, this.f132773f, this.f132774g, this.f132775h, this.f132776i, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00af A[LOOP:2: B:39:0x00a9->B:41:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00a5 A[EDGE_INSN: B:76:0x00a5->B:38:0x00a5 BREAK  A[LOOP:0: B:23:0x0069->B:35:0x009d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0189, code lost:
    
        if (r0.c(r1, r4, r18) == r6) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b7, code lost:
    
        if (r0 == r6) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0206, code lost:
    
        if (r1.c(r2, r4, r18) == r6) goto L73;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00af, please report this as an issue */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, com.garmin.device.filetransfer.core.background.a$b] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList<wk2.f> arrayList;
        Iterator<T> it;
        boolean zHasNext;
        ConcurrentLinkedQueue<wk2.i> concurrentLinkedQueue;
        m0 m0Var;
        boolean zG;
        List<lk2.a> list;
        Object objD;
        zk2.d dVar;
        Object next;
        wk2.f fVar;
        Iterator<T> it3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132768a;
        g gVar = this.f132775h;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f132768a = 1;
            if (g8.i.Q(this.f132769b, this) != aVar) {
            }
            return aVar;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 == 3) {
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i14 == 4) {
                    o13.r.b(obj);
                    objD = obj;
                    Long l14 = (Long) objD;
                    if (l14 != null) {
                        gVar.f132688g.info("Next startItem attempt scheduled for " + (l14.longValue() / ((long) 1000)) + "s. Skip background scheduler");
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i14 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            arrayList = new ArrayList();
            it = this.f132770c.iterator();
            while (true) {
                zHasNext = it.hasNext();
                concurrentLinkedQueue = this.f132771d;
                if (zHasNext) {
                    break;
                }
                next = it.next();
                fVar = (wk2.f) next;
                if (concurrentLinkedQueue == null && concurrentLinkedQueue.isEmpty()) {
                    arrayList.add(next);
                    break;
                    break;
                }
                it3 = concurrentLinkedQueue.iterator();
                do {
                    if (!it3.hasNext()) {
                        arrayList.add(next);
                        break;
                    }
                } while (!p005kotlin.jvm.internal.s.g(((wk2.i) it3.next()).getId(), fVar.f185842a));
            }
            for (wk2.f fVar2 : arrayList) {
                gVar.f132688g.warn("onNewItemsAvailable: Skipped " + fVar2 + ", Not relevant to upload agents");
            }
            m0Var = new m0();
            for (wk2.i iVar : concurrentLinkedQueue) {
                dVar = gVar.f132695n;
                iVar.getClass();
                dVar.getClass();
                if (dVar.c(iVar, true)) {
                    m0Var.f105804a = true;
                }
            }
            r0<com.garmin.device.filetransfer.core.background.a.b> r0Var = this.f132772e;
            com.garmin.device.filetransfer.core.background.a.b bVar = r0Var.f105810a;
            com.garmin.device.filetransfer.core.background.a.b.f50787e.getClass();
            zG = p005kotlin.jvm.internal.s.g(bVar, com.garmin.device.filetransfer.core.background.a.b.f50788f);
            list = this.f132774g;
            if (!zG || !this.f132773f.get()) {
                if (p13.h0.L(concurrentLinkedQueue)) {
                    cz2.j jVar = (cz2.j) gVar.f132698q.getValue();
                    h23.c.f81216a.getClass();
                    long jF = h23.c.f81217b.f(750L, 1500L);
                    c cVar = new c(gVar, list, m0Var, null);
                    this.f132768a = 5;
                }
                return Unit.INSTANCE;
            }
            q0 q0Var = new q0();
            long jB = r0Var.f105810a.b(((lk2.a) p13.h0.b0(list)).f113152a.hashCode());
            q0Var.f105808a = jB;
            com.garmin.device.filetransfer.core.background.a.b bVar2 = com.garmin.device.filetransfer.core.background.a.b.f50789g;
            if (jB <= bVar2.a()) {
                ?? A = gVar.f132685d.a(bVar2.a() + System.currentTimeMillis(), list);
                if (A.a() > r0Var.f105810a.a()) {
                    r0Var.f105810a = A;
                    q0Var.f105808a = A.b(((lk2.a) p13.h0.b0(list)).f113152a.hashCode());
                    ok0.d dVar2 = new ok0.d(r0Var, this.f132776i, gVar, q0Var, 1);
                    cz2.j jVar2 = (cz2.j) gVar.f132698q.getValue();
                    d dVar3 = new d(dVar2);
                    Long l15 = new Long(q0Var.f105808a);
                    this.f132768a = 4;
                    objD = jVar2.d(dVar3, l15, 10L, this);
                } else {
                    wr.g.v("Next startItem attempt scheduled for ", q0Var.f105808a / ((long) 1000), "s", gVar.f132688g);
                    cz2.j jVar3 = (cz2.j) gVar.f132698q.getValue();
                    long j8 = q0Var.f105808a;
                    b bVar3 = new b(gVar, q0Var, list, null);
                    this.f132768a = 3;
                }
            } else {
                ok0.d dVar4 = new ok0.d(r0Var, this.f132776i, gVar, q0Var, 1);
                cz2.j jVar4 = (cz2.j) gVar.f132698q.getValue();
                d dVar5 = new d(dVar4);
                Long l16 = new Long(q0Var.f105808a);
                this.f132768a = 4;
                objD = jVar4.d(dVar5, l16, 10L, this);
            }
            return aVar;
        }
        o13.r.b(obj);
        a aVar2 = new a(gVar, null);
        this.f132768a = 2;
        if (j2.c(2250L, aVar2, this) != aVar) {
            arrayList = new ArrayList();
            it = this.f132770c.iterator();
            while (true) {
                zHasNext = it.hasNext();
                concurrentLinkedQueue = this.f132771d;
                if (zHasNext) {
                    break;
                    break;
                }
                next = it.next();
                fVar = (wk2.f) next;
                if (concurrentLinkedQueue == null) {
                    it3 = concurrentLinkedQueue.iterator();
                    do {
                        if (!it3.hasNext()) {
                            arrayList.add(next);
                            break;
                            break;
                        }
                    } while (!p005kotlin.jvm.internal.s.g(((wk2.i) it3.next()).getId(), fVar.f185842a));
                } else {
                    it3 = concurrentLinkedQueue.iterator();
                    do {
                        if (!it3.hasNext()) {
                            arrayList.add(next);
                            break;
                            break;
                        }
                    } while (!p005kotlin.jvm.internal.s.g(((wk2.i) it3.next()).getId(), fVar.f185842a));
                }
            }
            while (r0.hasNext()) {
                gVar.f132688g.warn("onNewItemsAvailable: Skipped " + fVar2 + ", Not relevant to upload agents");
            }
            m0Var = new m0();
            while (r1.hasNext()) {
                dVar = gVar.f132695n;
                iVar.getClass();
                dVar.getClass();
                if (dVar.c(iVar, true)) {
                    m0Var.f105804a = true;
                }
            }
            r0<com.garmin.device.filetransfer.core.background.a.b> r0Var2 = this.f132772e;
            com.garmin.device.filetransfer.core.background.a.b bVar4 = r0Var2.f105810a;
            com.garmin.device.filetransfer.core.background.a.b.f50787e.getClass();
            zG = p005kotlin.jvm.internal.s.g(bVar4, com.garmin.device.filetransfer.core.background.a.b.f50788f);
            list = this.f132774g;
            if (!zG) {
            }
            if (p13.h0.L(concurrentLinkedQueue)) {
                cz2.j jVar5 = (cz2.j) gVar.f132698q.getValue();
                h23.c.f81216a.getClass();
                long jF2 = h23.c.f81217b.f(750L, 1500L);
                c cVar2 = new c(gVar, list, m0Var, null);
                this.f132768a = 5;
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
