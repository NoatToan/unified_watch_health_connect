package dg;

import androidx.lifecycle.n0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldg/j;", "Landroidx/lifecycle/n;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements androidx.lifecycle.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<Unit> f59482a;

    /* JADX WARN: Multi-variable type inference failed */
    public j(o53.j<? super Unit> jVar) {
        this.f59482a = jVar;
    }

    @Override // androidx.lifecycle.n
    public final void onStart(n0 n0Var) {
        int i14 = o13.q.f128596b;
        this.f59482a.resumeWith(Unit.INSTANCE);
    }
}
