package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class tno implements soo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h55[] f34877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f34878b;

    public tno(h55[] h55VarArr, long[] jArr) {
        this.f34877a = h55VarArr;
        this.f34878b = jArr;
    }

    @Override // defpackage.soo
    public long a(int i) {
        rk1.a(i >= 0);
        rk1.a(i < this.f34878b.length);
        return this.f34878b[i];
    }

    @Override // defpackage.soo
    public int b() {
        return this.f34878b.length;
    }

    @Override // defpackage.soo
    public int c(long j) {
        int iE = wlq.e(this.f34878b, j, false, false);
        if (iE < this.f34878b.length) {
            return iE;
        }
        return -1;
    }

    @Override // defpackage.soo
    public List<h55> d(long j) {
        h55 h55Var;
        int i = wlq.i(this.f34878b, j, true, false);
        return (i == -1 || (h55Var = this.f34877a[i]) == h55.f19700r) ? Collections.emptyList() : Collections.singletonList(h55Var);
    }
}
