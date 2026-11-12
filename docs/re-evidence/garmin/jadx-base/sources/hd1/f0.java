package hd1;

/* JADX INFO: loaded from: classes9.dex */
public class f0 extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f83380a;

    public f0(i iVar) {
        this.f83380a = iVar;
    }

    @Override // ym2.b
    public final void g(xm2.n nVar) {
        i iVar = this.f83380a;
        if (iVar != null) {
            e0 e0Var = new e0(nVar.f191565a, nVar.f191566b, nVar.f191567c);
            com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.CACHED;
            iVar.a(e0Var);
        }
    }
}
