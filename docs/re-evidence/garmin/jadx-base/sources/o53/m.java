package o53;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u000b\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¨\u0006\f"}, d2 = {"Lo53/m;", "Lo53/v;", "Lt13/d;", "continuation", "", "cause", "", "handled", "<init>", "(Lt13/d;Ljava/lang/Throwable;Z)V", "Lh53/a;", "_resumed", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f129371c = AtomicIntegerFieldUpdater.newUpdater(m.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public m(t13.d<?> dVar, Throwable th3, boolean z14) {
        if (th3 == null) {
            th3 = new CancellationException("Continuation " + dVar + " was cancelled normally");
        }
        super(th3, z14);
    }
}
