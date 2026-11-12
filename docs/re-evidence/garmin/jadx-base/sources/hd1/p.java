package hd1;

/* JADX INFO: loaded from: classes9.dex */
public class p extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f83395a;

    public p(e eVar) {
        this.f83395a = eVar;
    }

    @Override // ym2.b
    public final void d(xm2.f fVar) {
        e eVar = this.f83395a;
        if (eVar != null) {
            o oVar = new o(fVar.f191524a, fVar.f191525b, fVar.f191526c);
            com.garmin.android.library.backgroundtaskmanagement.b.e eVar2 = com.garmin.android.library.backgroundtaskmanagement.b.e.CACHED;
            eVar.a(oVar);
        }
    }
}
