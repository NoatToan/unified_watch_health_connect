package zo1;

import java.util.Comparator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class s0<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f206447a;

    public s0(Map map) {
        this.f206447a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        Long lValueOf = Long.valueOf(((yo1.b) t14).getWinnerUserPk());
        Map map = this.f206447a;
        return r13.a.b(Integer.valueOf(r0.k((yo1.i) map.get(lValueOf))), Integer.valueOf(r0.k((yo1.i) map.get(Long.valueOf(((yo1.b) t7).getWinnerUserPk())))));
    }
}
