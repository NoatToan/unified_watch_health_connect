package lt1;

import java.util.Comparator;
import p005kotlin.Metadata;
import pt1.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class h<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f114863a;

    public h(Comparator comparator) {
        this.f114863a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f114863a.compare(t7, t14);
        return iCompare != 0 ? iCompare : r13.a.b(((t) t7).f140969c.f140953a, ((t) t14).f140969c.f140953a);
    }
}
