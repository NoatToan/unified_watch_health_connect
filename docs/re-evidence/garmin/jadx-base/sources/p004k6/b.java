package p004k6;

import p005kotlin.Metadata;
import p3.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk6/b;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f103006a;

    public b(w wVar) {
        this.f103006a = wVar;
    }

    @Override // p3.h0
    public final void dispose() {
        w wVar = this.f103006a;
        wVar.dismiss();
        wVar.f103118d.disposeComposition();
    }
}
