package ok2;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$onNewItemsAvailable$1$1", f = "CoreTransferManager.kt", l = {1103, 1110}, m = "invokeSuspend")
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f132758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<wk2.f> f132759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.f0 f132760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<pk2.f0> f132761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ConcurrentLinkedQueue<wk2.i> f132762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r0<com.garmin.device.filetransfer.core.background.a.b> f132763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f132764h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$onNewItemsAvailable$1$1$1", f = "CoreTransferManager.kt", l = {1104}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f132765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pk2.f0 f132766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f132767c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pk2.f0 f0Var, g gVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f132766b = f0Var;
            this.f132767c = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f132766b, this.f132767c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f132765a;
            if (i14 == 0) {
                o13.r.b(obj);
                rs2.c cVar = this.f132767c.f132682a;
                this.f132765a = 1;
                if (this.f132766b.w(cVar, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(g gVar, List<wk2.f> list, pk2.f0 f0Var, List<? extends pk2.f0> list2, ConcurrentLinkedQueue<wk2.i> concurrentLinkedQueue, r0<com.garmin.device.filetransfer.core.background.a.b> r0Var, AtomicBoolean atomicBoolean, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f132758b = gVar;
        this.f132759c = list;
        this.f132760d = f0Var;
        this.f132761e = list2;
        this.f132762f = concurrentLinkedQueue;
        this.f132763g = r0Var;
        this.f132764h = atomicBoolean;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f132758b, this.f132759c, this.f132760d, this.f132761e, this.f132762f, this.f132763g, this.f132764h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (o53.j2.b(30000, r0, r21) == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r0.f(r21) == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        return r2;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g0 g0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132757a;
        g0 g0Var2 = null;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                List<wk2.f> list = this.f132759c;
                List<pk2.f0> list2 = this.f132761e;
                g gVar = this.f132758b;
                pk2.f0 f0Var = this.f132760d;
                ConcurrentLinkedQueue<wk2.i> concurrentLinkedQueue = this.f132762f;
                r0<com.garmin.device.filetransfer.core.background.a.b> r0Var = this.f132763g;
                AtomicBoolean atomicBoolean = this.f132764h;
                for (wk2.f fVar : list) {
                    g0 g0VarE = cl2.c.e(list2, fVar, gVar.f132682a);
                    c cVar = gVar.f132692k;
                    synchronized (cVar.f132601c) {
                        g0Var = cVar.f132603e;
                        if (g0Var != g0.USER_INITIATED_GENERAL) {
                            g0Var = g0Var2;
                        }
                    }
                    g0 g0VarQ = cl2.c.q(g0VarE, g0Var, false);
                    if (gVar.f132695n.e(fVar.f185842a) == null && f0Var.m(gVar.f132682a, fVar)) {
                        zk2.k kVarA = wk2.i.a.a(wk2.i.f185855a, fVar, f0Var.b(gVar.f132682a, fVar), g0VarQ, wk2.m.f185867g, gVar.f132683b.a(), null, g0VarE, null, 352);
                        concurrentLinkedQueue.add(kVarA);
                        gVar.f132688g.info("onNewItemsAvailable: " + kVarA);
                        com.garmin.device.filetransfer.core.background.a.b bVar = r0Var.f105810a;
                        com.garmin.device.filetransfer.core.background.a.b.f50787e.getClass();
                        if (!p005kotlin.jvm.internal.s.g(bVar, com.garmin.device.filetransfer.core.background.a.b.f50788f) && !gVar.f132683b.getConfiguration().p()) {
                            atomicBoolean.set(true);
                        }
                    }
                    g0Var2 = null;
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            a aVar2 = new a(this.f132760d, this.f132758b, null);
            this.f132757a = 1;
        } catch (Exception e4) {
            ds.e0.v("Failed to load agent: ", e4.getMessage(), this.f132758b.f132688g);
        }
        pk2.b bVar2 = this.f132758b.f132696o;
        this.f132757a = 2;
    }
}
