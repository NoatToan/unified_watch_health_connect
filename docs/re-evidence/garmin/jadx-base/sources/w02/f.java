package w02;

import p005kotlin.Metadata;
import p3.h0;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw02/f;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f181102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f181103b;

    public f(r rVar, p1 p1Var) {
        this.f181102a = rVar;
        this.f181103b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3.h0
    public final void dispose() {
        if (((Boolean) this.f181103b.getF182175a()).booleanValue()) {
            this.f181102a.i();
        }
    }
}
