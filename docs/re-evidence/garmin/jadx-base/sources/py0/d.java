package py0;

import e23.l;
import java.util.Comparator;
import p005kotlin.Metadata;
import sy0.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f141875a;

    public d(l lVar) {
        this.f141875a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        l lVar = this.f141875a;
        return r13.a.b((Comparable) lVar.invoke((r) t14), (Comparable) lVar.invoke((r) t7));
    }
}
