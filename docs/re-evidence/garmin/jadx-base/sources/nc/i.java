package nc;

import lc.x0;
import p005kotlin.Metadata;
import p3.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnc/i;", "Lp3/h0;", "runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f125283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.v f125284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f4.s f125285c;

    public i(k kVar, lc.v vVar, f4.s sVar) {
        this.f125283a = kVar;
        this.f125284b = vVar;
        this.f125285c = sVar;
    }

    @Override // p3.h0
    public final void dispose() {
        x0 x0VarB = this.f125283a.b();
        lc.v vVar = this.f125284b;
        x0VarB.b(vVar);
        this.f125285c.remove(vVar);
    }
}
