package hd1;

/* JADX INFO: loaded from: classes9.dex */
public class z extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f83435a;

    public z(f fVar) {
        this.f83435a = fVar;
    }

    @Override // ym2.b
    public final void b(xm2.d dVar) {
        f fVar = this.f83435a;
        if (fVar != null) {
            y yVar = new y(dVar.f191518a, dVar.f191519b, dVar.f191520c, dVar.f191521d);
            com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.CACHED;
            fVar.a(yVar);
        }
    }
}
