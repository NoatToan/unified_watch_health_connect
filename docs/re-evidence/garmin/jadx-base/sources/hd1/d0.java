package hd1;

/* JADX INFO: loaded from: classes9.dex */
public class d0 extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f83377a;

    public d0(h hVar) {
        this.f83377a = hVar;
    }

    @Override // ym2.b
    public final void f(xm2.l lVar) {
        h hVar = this.f83377a;
        if (hVar != null) {
            c0 c0Var = new c0(lVar.f191558a, lVar.f191559b, lVar.f191560c, lVar.f191561d, lVar.f191562e, lVar.f191563f);
            com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.CACHED;
            hVar.a(c0Var);
        }
    }
}
