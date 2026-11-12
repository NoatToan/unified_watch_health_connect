package j02;

import p005kotlin.Metadata;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lj02/f;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements p3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a f96063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f96064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f96065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f96066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2.j f96067e;

    public f(e23.a aVar, p1 p1Var, p1 p1Var2, o53.b0 b0Var, a2.j jVar) {
        this.f96063a = aVar;
        this.f96064b = p1Var;
        this.f96065c = p1Var2;
        this.f96066d = b0Var;
        this.f96067e = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3.h0
    public final void dispose() {
        p1 p1Var = this.f96064b;
        if (((Boolean) p1Var.getF182175a()).booleanValue()) {
            a2.a.b bVar = (a2.a.b) this.f96065c.getF182175a();
            if (bVar != null) {
                ge1.b.T(this.f96066d, null, null, new c(this.f96067e, bVar, null), 3);
            }
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                this.f96063a.invoke();
            }
            p1Var.setValue(Boolean.FALSE);
        }
    }
}
