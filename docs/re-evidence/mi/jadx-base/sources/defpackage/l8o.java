package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class l8o implements soo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<List<h55>> f24787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Long> f24788b;

    public l8o(List<List<h55>> list, List<Long> list2) {
        this.f24787a = list;
        this.f24788b = list2;
    }

    @Override // defpackage.soo
    public long a(int i) {
        rk1.a(i >= 0);
        rk1.a(i < this.f24788b.size());
        return this.f24788b.get(i).longValue();
    }

    @Override // defpackage.soo
    public int b() {
        return this.f24788b.size();
    }

    @Override // defpackage.soo
    public int c(long j) {
        int iD = wlq.d(this.f24788b, Long.valueOf(j), false, false);
        if (iD < this.f24788b.size()) {
            return iD;
        }
        return -1;
    }

    @Override // defpackage.soo
    public List<h55> d(long j) {
        int iG = wlq.g(this.f24788b, Long.valueOf(j), true, false);
        return iG == -1 ? Collections.emptyList() : this.f24787a.get(iG);
    }
}
