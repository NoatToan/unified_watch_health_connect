package fb2;

/* JADX INFO: loaded from: classes8.dex */
public class q implements b0.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f70370a;

    public q(r rVar) {
        this.f70370a = rVar;
    }

    @Override // fb2.b0.a
    public final void e(Object obj) {
        if (obj != null) {
            r rVar = this.f70370a;
            rVar.z(obj, rVar.f70344b);
            rVar.setChanged();
            rVar.notifyObservers(obj);
        }
    }
}
