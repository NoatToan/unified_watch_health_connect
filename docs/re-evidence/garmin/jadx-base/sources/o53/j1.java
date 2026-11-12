package o53;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bR\u000b\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lo53/j1;", "Lo53/o1;", "Lkotlin/Function1;", "", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "<init>", "(Le23/l;)V", "Lh53/a;", "_invoked", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j1 extends o1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f129353f = AtomicIntegerFieldUpdater.newUpdater(j1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.l<Throwable, Unit> f129354e;

    /* JADX WARN: Multi-variable type inference failed */
    public j1(e23.l<? super Throwable, Unit> lVar) {
        this.f129354e = lVar;
    }

    @Override // o53.o1
    public final boolean i() {
        return true;
    }

    @Override // o53.o1
    public final void j(Throwable th3) {
        if (f129353f.compareAndSet(this, 0, 1)) {
            this.f129354e.invoke(th3);
        }
    }
}
