package wk2;

import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o13.t;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwk2/c;", "Lwk2/e;", "Lkotlin/Function0;", "Ldz2/b;", "initDataSource", "<init>", "(Le23/a;)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<dz2.b> f185831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f185832c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.data.DefaultFileDataSource$read$2", f = "DefaultFileDataSource.kt", l = {69}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f185833a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f185833a;
            if (i14 == 0) {
                r.b(obj);
                this.f185833a = 1;
                if (c.this.c(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.data.DefaultFileDataSource$readInto$1", f = "DefaultFileDataSource.kt", l = {77}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f185835a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f185835a;
            if (i14 == 0) {
                r.b(obj);
                this.f185835a = 1;
                if (c.this.c(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(e23.a<? extends dz2.b> aVar) {
        aVar.getClass();
        this.f185831b = aVar;
        this.f185832c = o13.m.b(new wd.c(this, 4));
    }

    @Override // wk2.e
    public final synchronized void a() {
        if (this.f185832c.isInitialized()) {
            f().getAndSet(this.f185831b.invoke()).close();
        }
    }

    @Override // dz2.b
    public final int b(int i14, int i15, byte[] bArr) throws Throwable {
        bArr.getClass();
        ge1.b.W(t13.h.f161748a, new b(null));
        return f().get().b(i14, i15, bArr);
    }

    @Override // wk2.e
    public Object c(v13.i iVar) {
        return Unit.INSTANCE;
    }

    @Override // dz2.b
    public synchronized void close() {
        f().get().close();
    }

    @Override // dz2.b
    public final boolean d() {
        return f().get().d();
    }

    @Override // dz2.b
    public final byte[] e(int i14) throws Throwable {
        ge1.b.W(t13.h.f161748a, new a(null));
        return f().get().e(i14);
    }

    public final AtomicReference<dz2.b> f() {
        return (AtomicReference) this.f185832c.getValue();
    }

    @Override // dz2.b
    /* JADX INFO: renamed from: getSize */
    public long getF126459l() {
        return f().get().getF126459l();
    }

    @Override // dz2.b
    public final void setPosition(long j8) {
        f().get().setPosition(j8);
    }
}
