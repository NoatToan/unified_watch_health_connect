package fb2;

/* JADX INFO: loaded from: classes8.dex */
public class y implements b0.a<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f70383a;

    public y(z zVar) {
        this.f70383a = zVar;
    }

    @Override // fb2.b0.a
    public final void e(String str) {
        z zVar = this.f70383a;
        zVar.setChanged();
        zVar.notifyObservers(str);
    }
}
