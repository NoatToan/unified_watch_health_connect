package fd0;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class i<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f70474a;

    public i(Comparator comparator) {
        this.f70474a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f70474a.compare(t7, t14);
        return iCompare != 0 ? iCompare : r13.a.b(Long.valueOf(((sd2.f) t14).K2()), Long.valueOf(((sd2.f) t7).K2()));
    }
}
