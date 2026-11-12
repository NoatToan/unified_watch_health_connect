package c53;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc53/a;", "T", "Lc53/j;", "sequence", "<init>", "(Lc53/j;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a<T> implements j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<j<T>> f24504a;

    public a(j<? extends T> jVar) {
        jVar.getClass();
        this.f24504a = new AtomicReference<>(jVar);
    }

    @Override // c53.j
    public final Iterator<T> iterator() {
        j<T> andSet = this.f24504a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        vb.h.z("This sequence can be consumed only once.");
        return null;
    }
}
