package s21;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class q<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f156162a;

    public q(Comparator comparator) {
        this.f156162a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f156162a.compare(t7, t14);
        return iCompare != 0 ? iCompare : r13.a.b(Integer.valueOf(((n) t7).f156156f), Integer.valueOf(((n) t14).f156156f));
    }
}
