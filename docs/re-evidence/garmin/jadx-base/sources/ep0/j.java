package ep0;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class j<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f64890a;

    public j(Comparator comparator) {
        this.f64890a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f64890a.compare(t7, t14);
        return iCompare != 0 ? iCompare : r13.a.b(Integer.valueOf(((y) t14).f64910g), Integer.valueOf(((y) t7).f64910g));
    }
}
