package q3;

import e23.l;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class a<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f142354a;

    public a(l lVar) {
        this.f142354a = lVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        l lVar = this.f142354a;
        return r13.a.b((Comparable) lVar.invoke(t7), (Comparable) lVar.invoke(t14));
    }
}
