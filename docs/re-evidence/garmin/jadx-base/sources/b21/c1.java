package b21;

import i3.fe;
import i3.wd;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb21/c1;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c1 implements p3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f14567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i21.d f14568c;

    public c1(boolean z14, fe feVar, i21.d dVar) {
        this.f14566a = z14;
        this.f14567b = feVar;
        this.f14568c = dVar;
    }

    @Override // p3.h0
    public final void dispose() {
        if (this.f14566a) {
            wd wdVar = (wd) this.f14567b.f88108b.getF182175a();
            if (wdVar != null) {
                wdVar.dismiss();
            }
            this.f14568c.F4();
        }
    }
}
