package l72;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll72/s2;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s2 implements p3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f111255a;

    public s2(p3.p1 p1Var) {
        this.f111255a = p1Var;
    }

    @Override // p3.h0
    public final void dispose() {
        o53.l1 l1Var = (o53.l1) this.f111255a.getF182175a();
        if (l1Var != null) {
            l1Var.c(null);
        }
    }
}
