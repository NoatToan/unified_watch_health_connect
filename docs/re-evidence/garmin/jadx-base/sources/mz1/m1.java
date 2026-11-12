package mz1;

import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m1<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f121845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f121846b;

    public m1(Comparator comparator, List list) {
        this.f121845a = comparator;
        this.f121846b = list;
    }

    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f121845a.compare(t7, t14);
        if (iCompare != 0) {
            return iCompare;
        }
        Long lValueOf = Long.valueOf(((sd2.f) t14).getUnitID());
        List list = this.f121846b;
        return r13.a.b(Boolean.valueOf(list.contains(lValueOf)), Boolean.valueOf(list.contains(Long.valueOf(((sd2.f) t7).getUnitID()))));
    }
}
