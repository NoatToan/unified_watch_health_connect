package zo1;

import java.util.Comparator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class t0<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f206450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f206451b;

    public t0(Comparator comparator, Map map) {
        this.f206450a = comparator;
        this.f206451b = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f206450a.compare(t7, t14);
        if (iCompare != 0) {
            return iCompare;
        }
        Long lValueOf = Long.valueOf(((yo1.b) t7).getWinnerUserPk());
        Map map = this.f206451b;
        yo1.i iVar = (yo1.i) map.get(lValueOf);
        String fullName = iVar != null ? iVar.getFullName() : null;
        yo1.i iVar2 = (yo1.i) map.get(Long.valueOf(((yo1.b) t14).getWinnerUserPk()));
        return r13.a.b(fullName, iVar2 != null ? iVar2.getFullName() : null);
    }
}
