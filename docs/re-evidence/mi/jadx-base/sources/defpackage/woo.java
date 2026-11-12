package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class woo extends ieh implements soo {
    public soo d;
    public long e;

    @Override // defpackage.soo
    public long a(int i) {
        return ((soo) rk1.e(this.d)).a(i) + this.e;
    }

    @Override // defpackage.soo
    public int b() {
        return ((soo) rk1.e(this.d)).b();
    }

    @Override // defpackage.soo
    public int c(long j) {
        return ((soo) rk1.e(this.d)).c(j - this.e);
    }

    @Override // defpackage.soo
    public List<h55> d(long j) {
        return ((soo) rk1.e(this.d)).d(j - this.e);
    }

    @Override // defpackage.u53
    public void h() {
        super.h();
        this.d = null;
    }

    public void s(long j, soo sooVar, long j2) {
        this.f21056b = j;
        this.d = sooVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.e = j;
    }
}
