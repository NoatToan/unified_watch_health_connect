package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class d4q implements soo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3q f15085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f15086b;
    public final Map<String, c4q> c;
    public final Map<String, a4q> d;
    public final Map<String, String> e;

    public d4q(z3q z3qVar, Map<String, c4q> map, Map<String, a4q> map2, Map<String, String> map3) {
        this.f15085a = z3qVar;
        this.d = map2;
        this.e = map3;
        this.c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f15086b = z3qVar.j();
    }

    @Override // defpackage.soo
    public long a(int i) {
        return this.f15086b[i];
    }

    @Override // defpackage.soo
    public int b() {
        return this.f15086b.length;
    }

    @Override // defpackage.soo
    public int c(long j) {
        int iE = wlq.e(this.f15086b, j, false, false);
        if (iE < this.f15086b.length) {
            return iE;
        }
        return -1;
    }

    @Override // defpackage.soo
    public List<h55> d(long j) {
        return this.f15085a.h(j, this.c, this.d, this.e);
    }
}
