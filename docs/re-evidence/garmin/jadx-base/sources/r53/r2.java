package r53;

import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lr53/r2;", "Ls53/c;", "Lr53/p2;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r2 extends s53.c<p2<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<Object> f150846a = new AtomicReference<>(null);

    @Override // s53.c
    public final boolean a(s53.a aVar) {
        AtomicReference<Object> atomicReference = this.f150846a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(q2.f150809a);
        return true;
    }

    @Override // s53.c
    public final t13.d[] b(s53.a aVar) {
        this.f150846a.set(null);
        return s53.b.f157467a;
    }
}
