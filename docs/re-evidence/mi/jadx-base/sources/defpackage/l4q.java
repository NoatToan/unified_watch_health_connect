package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class l4q implements soo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l4q f24667b = new l4q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h55> f24668a;

    public l4q(h55 h55Var) {
        this.f24668a = Collections.singletonList(h55Var);
    }

    @Override // defpackage.soo
    public long a(int i) {
        rk1.a(i == 0);
        return 0L;
    }

    @Override // defpackage.soo
    public int b() {
        return 1;
    }

    @Override // defpackage.soo
    public int c(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.soo
    public List<h55> d(long j) {
        return j >= 0 ? this.f24668a : Collections.emptyList();
    }

    public l4q() {
        this.f24668a = Collections.emptyList();
    }
}
