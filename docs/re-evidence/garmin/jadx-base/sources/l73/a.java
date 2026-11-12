package l73;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f111409a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f111410b;

    public a(c cVar) {
        this.f111410b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVarB = this.f111409a.b();
        if (iVarB != null) {
            this.f111410b.d(iVarB);
        } else {
            vb.h.z("No pending post available");
        }
    }
}
