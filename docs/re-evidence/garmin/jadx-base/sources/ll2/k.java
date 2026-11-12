package ll2;

import com.garmin.device.filetransfer.mlr.MLRTransportException;
import e23.p;
import ml2.r;
import o53.b0;
import o53.c0;
import o53.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.mlr.MLRTransportPipe$write$2", f = "MLRTransportPipe.kt", l = {345, 347, 351, 351}, m = "invokeSuspend")
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f113482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f113483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f113484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz2.b f113485e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.mlr.MLRTransportPipe$write$2$1", f = "MLRTransportPipe.kt", l = {355}, m = "invokeSuspend")
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f113486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r f113487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f113488c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f113487b = rVar;
            this.f113488c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f113487b, this.f113488c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f113486a;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    r rVar = this.f113487b;
                    this.f113486a = 1;
                    if (rVar.b(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            } catch (Exception e4) {
                com.airbnb.lottie.animation.keyframe.a.A("Failed to close service after write: ", e4.getMessage(), this.f113488c.f113449b);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, r rVar, dz2.b bVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f113483c = eVar;
        this.f113484d = rVar;
        this.f113485e = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f113483c, this.f113484d, this.f113485e, dVar);
        kVar.f113482b = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (ge1.b.e0(r10, r1, r9) == r0) goto L40;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f113481a;
        r rVar = this.f113484d;
        e eVar = this.f113483c;
        try {
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    b0Var = (b0) this.f113482b;
                    this.f113482b = b0Var;
                    this.f113481a = 1;
                    e.a aVar2 = e.f113445l;
                    if (eVar.a(rVar, 1, this) == aVar) {
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    b0Var = (b0) this.f113482b;
                    o13.r.b(obj);
                } else if (i14 == 2) {
                    o13.r.b(obj);
                    v1 v1Var = v1.f129418a;
                    a aVar3 = new a(rVar, eVar, null);
                    this.f113481a = 3;
                } else {
                    if (i14 != 3) {
                        if (i14 != 4) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th3 = (Throwable) this.f113482b;
                        o13.r.b(obj);
                        throw th3;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
                c0.f(b0Var);
                dz2.b bVar = this.f113485e;
                p<Long, Long, Unit> pVar = eVar.f113450c;
                this.f113482b = null;
                this.f113481a = 2;
                if (rVar.c(bVar, pVar, this) != aVar) {
                    v1 v1Var2 = v1.f129418a;
                    a aVar4 = new a(rVar, eVar, null);
                    this.f113481a = 3;
                }
            } catch (Exception e4) {
                e.a aVar5 = e.f113445l;
                eVar.getClass();
                if (e4 instanceof MLRTransportException) {
                    throw ((MLRTransportException) e4);
                }
                throw new MLRTransportException("Failed to write to Multi-Link service", e4);
            }
        } catch (Throwable th4) {
            v1 v1Var3 = v1.f129418a;
            a aVar6 = new a(rVar, eVar, null);
            this.f113482b = th4;
            this.f113481a = 4;
            if (ge1.b.e0(v1Var3, aVar6, this) != aVar) {
                throw th4;
            }
        }
        return aVar;
    }
}
