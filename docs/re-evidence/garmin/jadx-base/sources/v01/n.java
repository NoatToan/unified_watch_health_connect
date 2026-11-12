package v01;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class n<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f174476a;

    public n(Comparator comparator) {
        this.f174476a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        Integer num = 0;
        int iCompare = this.f174476a.compare(t7, t14);
        if (iCompare != 0) {
            return iCompare;
        }
        return r13.a.b(((g21.f) t7).f75416b != null ? 1 : num, ((g21.f) t14).f75416b != null ? 1 : 0);
    }
}
