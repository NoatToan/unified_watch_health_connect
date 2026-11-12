package zk2;

import e23.p;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pk2.c0;
import pk2.f0;
import pk2.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzk2/j;", "Lzk2/d$b;", "Lok2/b;", "helper", "Lrs2/c;", "device", "Lo53/b0;", "coroutineScope", "<init>", "(Lok2/b;Lrs2/c;Lo53/b0;)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ok2.b f205140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rs2.c f205141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f205142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Logger f205143d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.queue.DefaultQueueConfiguration$handleMaxAttemptsItem$1$1", f = "DefaultQueueConfiguration.kt", l = {57}, m = "invokeSuspend")
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0 f205145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f205146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ wk2.f f205147d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0 c0Var, j jVar, wk2.f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f205145b = c0Var;
            this.f205146c = jVar;
            this.f205147d = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f205145b, this.f205146c, this.f205147d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            c0 c0Var = this.f205145b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205144a;
            wk2.f fVar = this.f205147d;
            j jVar = this.f205146c;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    if (c0Var.h(jVar.f205141b, fVar)) {
                        rs2.c cVar = jVar.f205141b;
                        this.f205144a = 1;
                        if (c0Var.d(cVar, fVar, null, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Exception e4) {
                jVar.f205143d.warn("Failed to ack item " + fVar.f185842a + " with too many retries", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.queue.DefaultQueueConfiguration$handleMaxAttemptsItem$2", f = "DefaultQueueConfiguration.kt", l = {78}, m = "invokeSuspend")
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205148a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wk2.f f205150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x f205151d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wk2.f fVar, x xVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f205150c = fVar;
            this.f205151d = xVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return j.this.new b(this.f205150c, this.f205151d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            lk2.b bVarC;
            List<UUID> listV;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205148a;
            wk2.f fVar = this.f205150c;
            j jVar = j.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    HashSet hashSet = new HashSet();
                    ok2.b bVar = jVar.f205140a;
                    rs2.c cVar = jVar.f205141b;
                    List<f0> list = bVar.getConfiguration().f132627g;
                    x xVar = this.f205151d;
                    for (f0 f0Var : list) {
                        try {
                            if (f0Var.m(cVar, fVar)) {
                                xVar.getClass();
                                try {
                                    listV = f0Var.v(xVar);
                                } catch (Throwable unused) {
                                    listV = f0Var.getF159941g().f113303b;
                                }
                                hashSet.addAll(listV);
                            }
                        } catch (Exception e4) {
                            jVar.f205143d.warn("Failed get archive status for " + f0Var.A() + " with too many retries", (Throwable) e4);
                        }
                    }
                    if (!hashSet.isEmpty() && (bVarC = jVar.f205140a.c(cVar.getF92741e())) != null) {
                        UUID uuid = fVar.f185842a;
                        this.f205148a = 1;
                        if (bVarC.o(uuid, hashSet, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Exception e14) {
                jVar.f205143d.warn("Failed to archive item " + fVar.f185842a + " with too many retries", (Throwable) e14);
            }
            return Unit.INSTANCE;
        }
    }

    public j(ok2.b bVar, rs2.c cVar, b0 b0Var) {
        bVar.getClass();
        cVar.getClass();
        b0Var.getClass();
        this.f205140a = bVar;
        this.f205141b = cVar;
        this.f205142c = b0Var;
        Logger logger = LoggerFactory.getLogger("CFT#QueueConfig@" + cVar.getF92741e());
        logger.getClass();
        this.f205143d = logger;
    }

    @Override // zk2.d.b
    public final zy2.e a() {
        return this.f205140a.a();
    }

    @Override // zk2.d.b
    public final long b() {
        this.f205140a.getConfiguration().n().i();
        return 300000L;
    }

    @Override // zk2.d.b
    public final void c(wk2.f fVar, x xVar) {
        fVar.getClass();
        this.f205143d.warn("Remove item " + fVar.f185842a + " with too many retries");
        wk2.h hVar = fVar.f185844c;
        wk2.h hVar2 = wk2.h.PHONE_TO_DEVICE;
        b0 b0Var = this.f205142c;
        if (hVar != hVar2) {
            ge1.b.T(b0Var, null, null, new b(fVar, xVar, null), 3);
            return;
        }
        Iterator<T> it = this.f205140a.getConfiguration().f132621a.iterator();
        while (it.hasNext()) {
            ge1.b.T(b0Var, null, null, new a((c0) it.next(), this, fVar, null), 3);
        }
    }

    @Override // zk2.d.b
    public final int d(wk2.f fVar) {
        fVar.getClass();
        this.f205140a.getConfiguration().n().h(this.f205141b, fVar);
        return 25;
    }

    @Override // zk2.d.b
    public final Set<String> e(wk2.f fVar) {
        fVar.getClass();
        return this.f205140a.getConfiguration().l(this.f205141b, fVar);
    }
}
