package c53;

import java.util.HashSet;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc53/b;", "T", "K", "Lp13/b;", "", "source", "Lkotlin/Function1;", "keySelector", "<init>", "(Ljava/util/Iterator;Le23/l;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b<T, K> extends p13.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterator<T> f24507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<T, K> f24508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet<K> f24509e;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Iterator<? extends T> it, e23.l<? super T, ? extends K> lVar) {
        it.getClass();
        lVar.getClass();
        this.f24507c = it;
        this.f24508d = lVar;
        this.f24509e = new HashSet<>();
    }

    @Override // p13.b
    public final void a() {
        T next;
        do {
            Iterator<T> it = this.f24507c;
            if (!it.hasNext()) {
                this.f134914a = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.f24509e.add(this.f24508d.invoke(next)));
        this.f134915b = next;
        this.f134914a = 1;
    }
}
