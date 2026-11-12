package p003ji0;

import a5.a;
import j23.t;
import n4.c;
import p005kotlin.Metadata;
import p3.m1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lji0/g;", "La5/a;", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f98781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f98782b;

    public g(m1 m1Var, m1 m1Var2) {
        this.f98781a = m1Var;
        this.f98782b = m1Var2;
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo4onPreScrollOzD1aCk(long j8, int i14) {
        m1 m1Var = this.f98781a;
        m1Var.i(t.d(Float.intBitsToFloat((int) (j8 & 4294967295L)) + m1Var.getFloatValue(), -this.f98782b.getFloatValue(), 0.0f));
        c.f123541b.getClass();
        return 0L;
    }
}
