package wk2;

import java.util.concurrent.atomic.AtomicReference;
import o13.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwk2/b;", "Lwk2/d;", "Lkotlin/Function0;", "Ldz2/a;", "initDataSink", "<init>", "(Le23/a;)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<dz2.a> f185829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f185830c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(e23.a<? extends dz2.a> aVar) {
        aVar.getClass();
        this.f185829b = aVar;
        this.f185830c = o13.m.b(new wd.c(this, 3));
    }

    @Override // wk2.d
    public synchronized void a() {
        d().getAndSet(c().invoke()).close();
    }

    public e23.a<dz2.a> c() {
        return this.f185829b;
    }

    @Override // dz2.a
    public synchronized void close() {
        d().get().close();
    }

    public final AtomicReference<dz2.a> d() {
        return (AtomicReference) this.f185830c.getValue();
    }

    @Override // dz2.a
    public long getSize() {
        return d().get().getSize();
    }

    @Override // dz2.a
    public final void write(byte[] bArr) {
        bArr.getClass();
        d().get().write(bArr);
    }
}
