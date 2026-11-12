package bg2;

import c83.a0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lbg2/k;", "Lc83/f;", "Lbg2/h;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements c83.f<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f17895a;

    public k(j jVar) {
        this.f17895a = jVar;
    }

    @Override // c83.f
    public final void a(c83.d<h> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        zg2.c.f204692a.getClass();
        zg2.c.b("MsnWorkoutViewModel", "fetchMsnExercise Failure: " + th3);
        this.f17895a.f17891b.setValue(null);
    }

    @Override // c83.f
    public final void c(c83.d<h> dVar, a0<h> a0Var) {
        dVar.getClass();
        boolean zIsSuccessful = a0Var.f25745a.isSuccessful();
        j jVar = this.f17895a;
        if (!zIsSuccessful) {
            zg2.c.f204692a.getClass();
            zg2.c.b("MsnWorkoutViewModel", "fetchMsnExercise Fail");
            jVar.f17891b.setValue(null);
            return;
        }
        h hVar = a0Var.f25746b;
        zg2.c.f204692a.getClass();
        zg2.c.a("MsnWorkoutViewModel", "fetchMsnExercise isSuccessful:" + hVar);
        jVar.f17891b.setValue(hVar);
    }
}
