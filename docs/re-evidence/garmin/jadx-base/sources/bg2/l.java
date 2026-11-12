package bg2;

import c83.a0;
import lc.y;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lbg2/l;", "Lc83/f;", "Lbg2/h;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements c83.f<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f17897b;

    public l(String str, y yVar) {
        this.f17896a = str;
        this.f17897b = yVar;
    }

    @Override // c83.f
    public final void a(c83.d<h> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        String message = th3.getMessage();
        if (message != null) {
            zg2.c cVar = zg2.c.f204692a;
            String strConcat = "Failed to fetch MSN Exercise Data: ".concat(message);
            cVar.getClass();
            zg2.c.b("MsnWorkoutViewModel", strConcat);
        }
    }

    @Override // c83.f
    public final void c(c83.d<h> dVar, a0<h> a0Var) {
        h hVar;
        dVar.getClass();
        if (!a0Var.f25745a.isSuccessful() || (hVar = a0Var.f25746b) == null) {
            return;
        }
        y.l(this.f17897b, new vg2.a.d(this.f17896a, hVar));
    }
}
