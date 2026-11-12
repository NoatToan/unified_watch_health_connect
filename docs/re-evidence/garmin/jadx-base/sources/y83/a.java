package y83;

import j83.o;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3631a f195244b = new C3631a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<n83.a> f195245a;

    /* JADX INFO: renamed from: y83.a$a, reason: collision with other inner class name */
    public static class C3631a implements n83.a {
        @Override // n83.a
        public final void d() {
        }
    }

    public a() {
        this.f195245a = new AtomicReference<>();
    }

    public static a a(n83.a aVar) {
        return new a(aVar);
    }

    @Override // j83.o
    public final boolean e() {
        return this.f195245a.get() == f195244b;
    }

    @Override // j83.o
    public final void f() {
        n83.a andSet;
        AtomicReference<n83.a> atomicReference = this.f195245a;
        n83.a aVar = atomicReference.get();
        C3631a c3631a = f195244b;
        if (aVar == c3631a || (andSet = atomicReference.getAndSet(c3631a)) == null || andSet == c3631a) {
            return;
        }
        andSet.d();
    }

    private a(n83.a aVar) {
        this.f195245a = new AtomicReference<>(aVar);
    }
}
