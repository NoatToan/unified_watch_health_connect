package il2;

import al2.m;
import al2.n;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e23.p;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import o13.q;
import o13.r;
import o53.b0;
import ok2.g0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pk2.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lil2/l;", "Lea2/f$d;", "Lrs2/c;", "device", "Lo53/b0;", "coroutineScope", "Lt13/d;", "", "cont", "Lal2/m;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lrs2/c;Lo53/b0;Lt13/d;Lal2/m;)V", "file-transfer-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements ea2.f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rs2.c f94065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f94066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t13.d<byte[]> f94067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f94068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference<wk2.f> f94069e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.legacy.XmlTransferListener$onGarminDeviceXmlRead$1", f = "XmlTransferListener.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            l lVar = l.this;
            m mVar = lVar.f94068d;
            if (mVar != null) {
                mVar.u(lVar.d(null));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.legacy.XmlTransferListener$onGarminDeviceXmlRead$2", f = "XmlTransferListener.kt", l = {}, m = "invokeSuspend")
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CoreTransferException f94072b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoreTransferException coreTransferException, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f94072b = coreTransferException;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new b(this.f94072b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            l lVar = l.this;
            m mVar = lVar.f94068d;
            if (mVar != null) {
                mVar.u(lVar.d(this.f94072b));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.legacy.XmlTransferListener$onGarminDeviceXmlReadFailure$1", f = "XmlTransferListener.kt", l = {}, m = "invokeSuspend")
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CoreTransferException f94074b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoreTransferException coreTransferException, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f94074b = coreTransferException;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new c(this.f94074b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            l lVar = l.this;
            m mVar = lVar.f94068d;
            if (mVar != null) {
                mVar.u(lVar.d(this.f94074b));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.legacy.XmlTransferListener$onGarminDeviceXmlReadProgress$1", f = "XmlTransferListener.kt", l = {}, m = "invokeSuspend")
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wk2.f f94076b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(wk2.f fVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f94076b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new d(this.f94076b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            l lVar = l.this;
            rs2.c cVar = lVar.f94065a;
            il2.a.f94004g.getClass();
            lVar.f94068d.u(new al2.l(cVar, il2.a.f94005h, this.f94076b, al2.k.STARTED, null, null, null, null, null, null, 1008, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.legacy.XmlTransferListener$onGarminDeviceXmlReadProgress$2", f = "XmlTransferListener.kt", l = {}, m = "invokeSuspend")
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wk2.f f94078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f94079c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(wk2.f fVar, long j8, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f94078b = fVar;
            this.f94079c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new e(this.f94078b, this.f94079c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            l lVar = l.this;
            rs2.c cVar = lVar.f94065a;
            il2.a.f94004g.getClass();
            lVar.f94068d.B(new n(cVar, il2.a.f94005h, this.f94078b, this.f94079c, 0L, 16, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(rs2.c cVar, b0 b0Var, t13.d<? super byte[]> dVar, m mVar) {
        cVar.getClass();
        b0Var.getClass();
        dVar.getClass();
        this.f94065a = cVar;
        this.f94066b = b0Var;
        this.f94067c = dVar;
        this.f94068d = mVar;
        this.f94069e = new AtomicReference<>(null);
    }

    @Override // ea2.f.d
    public final void a(long j8, long j14) {
        AtomicReference<wk2.f> atomicReference;
        b0 b0Var;
        if (this.f94068d == null) {
            return;
        }
        wk2.f fVarE = e(j14);
        do {
            atomicReference = this.f94069e;
            boolean zCompareAndSet = atomicReference.compareAndSet(null, fVarE);
            b0Var = this.f94066b;
            if (zCompareAndSet) {
                ge1.b.T(b0Var, null, null, new d(fVarE, null), 3);
                break;
            }
        } while (atomicReference.get() == null);
        ge1.b.T(b0Var, null, null, new e(fVarE, j8, null), 3);
    }

    @Override // ea2.f.d
    public final void b(String str) {
        CoreTransferException coreTransferException = wb2.r.f().i(this.f94065a.getF92741e()) ? new CoreTransferException(ok2.e.f132637e, str.concat(" : Device XML read attempted during active sync"), null, 4, null) : new CoreTransferException(ok2.e.f132646n, str, null, 4, null);
        ge1.b.T(this.f94066b, null, null, new c(coreTransferException, null), 3);
        int i14 = q.f128596b;
        this.f94067c.resumeWith(new q.b(coreTransferException));
    }

    @Override // ea2.f.d
    public final void c(byte[] bArr) {
        b0 b0Var = this.f94066b;
        t13.d<byte[]> dVar = this.f94067c;
        if (bArr != null && bArr.length != 0) {
            ge1.b.T(b0Var, null, null, new a(null), 3);
            int i14 = q.f128596b;
            dVar.resumeWith(bArr);
        } else {
            CoreTransferException coreTransferException = wb2.r.f().i(this.f94065a.getF92741e()) ? new CoreTransferException(ok2.e.f132637e, "Empty Device XML: Device XML read attempted during active sync", null, 4, null) : new CoreTransferException(ok2.e.f132646n, "Empty Device XML", null, 4, null);
            ge1.b.T(b0Var, null, null, new b(coreTransferException, null), 3);
            int i15 = q.f128596b;
            dVar.resumeWith(new q.b(coreTransferException));
        }
    }

    public final al2.l d(CoreTransferException coreTransferException) {
        rs2.c cVar = this.f94065a;
        if (coreTransferException != null) {
            il2.a.f94004g.getClass();
            return new al2.l(cVar, il2.a.f94005h, e(0L), al2.k.FAILURE, x.a.b(x.f138495e, coreTransferException), null, null, null, null, null, 992, null);
        }
        il2.a.f94004g.getClass();
        g0 g0Var = il2.a.f94005h;
        wk2.f fVarE = e(0L);
        al2.k kVar = al2.k.SUCCESS;
        x.f138495e.getClass();
        return new al2.l(cVar, g0Var, fVarE, kVar, x.a.e(), null, null, null, null, null, 992, null);
    }

    public final wk2.f e(long j8) {
        wk2.f fVar = this.f94069e.get();
        if (fVar != null) {
            return fVar;
        }
        wk2.f.a aVar = wk2.f.f185841i;
        il2.a.f94004g.getClass();
        UUID uuid = il2.a.f94006i;
        aVar.getClass();
        uuid.getClass();
        return new wk2.f(uuid, "GDXml", wk2.h.DEVICE_TO_PHONE, j8, null, null, null, 112, null);
    }
}
