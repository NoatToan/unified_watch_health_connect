package nc;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p3.h0;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnc/x;", "Lp3/h0;", "runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3 f125354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f125355b;

    public x(x3 x3Var, e eVar) {
        this.f125354a = x3Var;
        this.f125355b = eVar;
    }

    @Override // p3.h0
    public final void dispose() {
        Iterator it = ((List) this.f125354a.getF182175a()).iterator();
        while (it.hasNext()) {
            this.f125355b.b().b((lc.v) it.next());
        }
    }
}
