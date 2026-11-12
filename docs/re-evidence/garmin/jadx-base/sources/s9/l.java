package s9;

import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import p005kotlin.Metadata;
import p3.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls9/l;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f158021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f158022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f158023c;

    public l(n0 n0Var, k0 k0Var, a aVar) {
        this.f158021a = n0Var;
        this.f158022b = k0Var;
        this.f158023c = aVar;
    }

    @Override // p3.h0
    public final void dispose() {
        b0 f158017a;
        n0 n0Var = this.f158021a;
        if (n0Var != null && (f158017a = n0Var.getF158017a()) != null) {
            f158017a.d(this.f158022b);
        }
        b0.a aVar = b0.a.ON_DESTROY;
        a aVar2 = this.f158023c;
        aVar2.getClass();
        aVar2.f157990b = aVar.a();
        aVar2.a();
    }
}
