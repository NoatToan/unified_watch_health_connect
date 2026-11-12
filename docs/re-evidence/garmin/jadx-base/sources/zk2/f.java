package zk2;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class f<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f205135a;

    public f(Comparator comparator) {
        this.f205135a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f205135a.compare(t7, t14);
        return iCompare != 0 ? iCompare : r13.a.b(Long.valueOf(((k) t7).f205157g), Long.valueOf(((k) t14).f205157g));
    }
}
