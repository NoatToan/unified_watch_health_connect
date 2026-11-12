package fb2;

/* JADX INFO: loaded from: classes8.dex */
public class s implements b0.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f70373a;

    public s(t tVar) {
        this.f70373a = tVar;
    }

    @Override // fb2.b0.a
    public final void e(Object obj) {
        t tVar = this.f70373a;
        tVar.w(obj, tVar.f70344b);
        tVar.setChanged();
        tVar.notifyObservers(obj);
    }
}
