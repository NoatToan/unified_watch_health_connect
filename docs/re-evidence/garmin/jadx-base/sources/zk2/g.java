package zk2;

import java.util.Comparator;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class g<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f205136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f205137b;

    public g(Comparator comparator, UUID uuid) {
        this.f205136a = comparator;
        this.f205137b = uuid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f205136a.compare(t7, t14);
        if (iCompare != 0) {
            return iCompare;
        }
        UUID uuid = ((k) t14).f205152b.f185842a;
        UUID uuid2 = this.f205137b;
        return r13.a.b(Boolean.valueOf(s.g(uuid2, uuid)), Boolean.valueOf(s.g(uuid2, ((k) t7).f205152b.f185842a)));
    }
}
