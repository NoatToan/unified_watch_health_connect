package fd0;

import hk0.p;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class h<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f70473a;

    public h(Comparator comparator) {
        this.f70473a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f70473a.compare(t7, t14);
        return iCompare != 0 ? iCompare : r13.a.b(Boolean.valueOf(p.m((sd2.f) t14)), Boolean.valueOf(p.m((sd2.f) t7)));
    }
}
