package wn0;

import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import p005kotlin.Metadata;
import p3.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwn0/j;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f186128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f186129b;

    public j(n0 n0Var, k0 k0Var) {
        this.f186128a = n0Var;
        this.f186129b = k0Var;
    }

    @Override // p3.h0
    public final void dispose() {
        this.f186128a.getF158017a().d(this.f186129b);
    }
}
