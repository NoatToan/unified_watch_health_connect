package p006l2;

import a2.j;
import a2.l;
import p005kotlin.Metadata;
import p3.h0;
import p3.p1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll2/b3;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b3 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1 f108417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f108418b;

    public b3(p1 p1Var, j jVar) {
        this.f108417a = p1Var;
        this.f108418b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3.h0
    public final void dispose() {
        p1 p1Var = this.f108417a;
        l.b bVar = (l.b) p1Var.getF182175a();
        if (bVar != null) {
            l.a aVar = new l.a(bVar);
            j jVar = this.f108418b;
            if (jVar != null) {
                jVar.a(aVar);
            }
            p1Var.setValue(null);
        }
    }
}
