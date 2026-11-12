package j13;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import q03.t;
import s03.b;
import v.e0;
import v03.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T> implements t<T>, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<b> f96507a = new AtomicReference<>();

    @Override // q03.t
    public final void a(b bVar) {
        AtomicReference<b> atomicReference;
        Class<?> cls = getClass();
        w03.b.a(bVar, "next is null");
        do {
            atomicReference = this.f96507a;
            if (atomicReference.compareAndSet(null, bVar)) {
                return;
            }
        } while (atomicReference.get() == null);
        bVar.dispose();
        if (atomicReference.get() != c.DISPOSED) {
            String name = cls.getName();
            k13.a.b(new ProtocolViolationException(e0.g("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
        }
    }

    @Override // s03.b
    public final boolean b() {
        return this.f96507a.get() == c.DISPOSED;
    }

    @Override // s03.b
    public final void dispose() {
        c.a(this.f96507a);
    }
}
