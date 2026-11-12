package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class yos extends z5s.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z5s.b f40385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tos f40386b;

    public yos(tos tosVar) {
        this.f40386b = tosVar;
    }

    @Override // z5s.b
    public void b() {
        tos.b bVar = (tos.b) this.f40386b.f34897a.peek();
        if (bVar == null || !bVar.d()) {
            return;
        }
        if (this.f40386b.f34897a.remove(bVar)) {
            this.f40385a = bVar;
        }
        z5s.b bVar2 = this.f40385a;
        if (bVar2 != null) {
            bVar2.b();
        }
    }

    @Override // z5s.b
    public void c() {
        z5s.b bVar = this.f40385a;
        if (bVar != null) {
            bVar.c();
        }
    }
}
