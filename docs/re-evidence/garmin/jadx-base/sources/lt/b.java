package lt;

import ht.r;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.w;
import tn.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llt/b;", "Lht/r;", "", "", "selectedStats", "<init>", "(Ljava/util/List;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f114817a;

    public b(List<String> list) {
        list.getClass();
        this.f114817a = list;
    }

    @Override // ht.r
    public final zk.a a() {
        return new zk.a("EditSecondaryStats", w.c(new zk.e("result", h0.k0(h0.M0(this.f114817a), ",", null, null, null, 62))), false, 0L, 12, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f114817a.equals(((b) obj).f114817a);
    }

    public final int hashCode() {
        return this.f114817a.hashCode();
    }

    public final String toString() {
        return k.h("EditSecondaryStatsEvent(selectedStats=", ")", this.f114817a);
    }
}
