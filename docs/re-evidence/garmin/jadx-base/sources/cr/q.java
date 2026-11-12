package cr;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class q<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f55284a;

    public q(Comparator comparator) {
        this.f55284a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f55284a.compare(t7, t14);
        return iCompare != 0 ? iCompare : r13.a.b(Integer.valueOf(((to.m) t7).f165818b), Integer.valueOf(((to.m) t14).f165818b));
    }
}
