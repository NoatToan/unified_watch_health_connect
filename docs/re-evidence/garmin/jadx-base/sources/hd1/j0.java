package hd1;

/* JADX INFO: loaded from: classes9.dex */
public class j0 extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f83385a;

    public j0(k kVar) {
        this.f83385a = kVar;
    }

    @Override // ym2.b
    public final void i(xm2.r rVar) {
        k kVar = this.f83385a;
        if (kVar != null) {
            i0 i0Var = new i0(rVar.f191579a, rVar.f191580b, rVar.f191581c);
            com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.CACHED;
            kVar.a(i0Var);
        }
    }
}
