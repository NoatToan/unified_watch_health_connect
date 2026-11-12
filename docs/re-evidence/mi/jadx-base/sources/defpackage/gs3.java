package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class gs3 implements soo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h55> f19289a;

    public gs3(List<h55> list) {
        this.f19289a = list;
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
        return j >= 0 ? this.f19289a : Collections.emptyList();
    }
}
