package z91;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class g<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f203138a;

    public g(Comparator comparator) {
        this.f203138a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f203138a.compare(t7, t14);
        return iCompare != 0 ? iCompare : r13.a.b(Long.valueOf(((aa1.g) t7).f2275a.f143579a), Long.valueOf(((aa1.g) t14).f2275a.f143579a));
    }
}
