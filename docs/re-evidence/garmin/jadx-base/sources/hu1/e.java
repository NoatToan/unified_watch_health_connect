package hu1;

import fu1.q;
import fu1.u;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f85717a;

    public e(Comparator comparator) {
        this.f85717a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f85717a.compare(t7, t14);
        if (iCompare != 0) {
            return iCompare;
        }
        q qVar = ((u) t14).f73557b;
        Long activityId = qVar != null ? qVar.getActivityId() : null;
        q qVar2 = ((u) t7).f73557b;
        return r13.a.b(activityId, qVar2 != null ? qVar2.getActivityId() : null);
    }
}
