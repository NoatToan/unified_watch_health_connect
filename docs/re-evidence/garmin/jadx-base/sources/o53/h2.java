package o53;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u000b\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¨\u0006\u0006"}, d2 = {"Lo53/h2;", "Lo53/o1;", "<init>", "()V", "", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h2 extends o1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f129346g = AtomicIntegerFieldUpdater.newUpdater(h2.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Thread f129347e = Thread.currentThread();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u0 f129348f;

    public static void l(int i14) {
        throw new IllegalStateException(("Illegal state " + i14).toString());
    }

    @Override // o53.o1
    public final boolean i() {
        return true;
    }

    @Override // o53.o1
    public final void j(Throwable th3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i14;
        do {
            atomicIntegerFieldUpdater = f129346g;
            i14 = atomicIntegerFieldUpdater.get(this);
            if (i14 != 0) {
                if (i14 == 1 || i14 == 2 || i14 == 3) {
                    return;
                }
                l(i14);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i14, 2));
        this.f129347e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f129346g;
            int i14 = atomicIntegerFieldUpdater.get(this);
            if (i14 != 0) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        l(i14);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i14, 1)) {
                u0 u0Var = this.f129348f;
                if (u0Var != null) {
                    u0Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}
