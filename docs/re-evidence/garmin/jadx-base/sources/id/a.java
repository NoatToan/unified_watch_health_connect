package id;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lid/a;", "", "Landroidx/room/concurrent/SynchronizedObject;", "Lkotlin/Function0;", "", "closeAction", "<init>", "(Le23/a;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Unit> f92645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f92646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f92647c;

    public a(e23.a<Unit> aVar) {
        aVar.getClass();
        this.f92645a = aVar;
        this.f92646b = new AtomicInteger(0);
        this.f92647c = new AtomicBoolean(false);
    }

    public final boolean a() {
        synchronized (this) {
            if (this.f92647c.get()) {
                return false;
            }
            this.f92646b.incrementAndGet();
            return true;
        }
    }

    public final void b() {
        synchronized (this) {
            this.f92646b.decrementAndGet();
            if (this.f92646b.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
