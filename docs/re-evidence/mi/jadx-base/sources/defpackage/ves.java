package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class ves implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rqh f36826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h3s f36827b;

    public ves(h3s h3sVar, rqh rqhVar) {
        this.f36827b = h3sVar;
        this.f36826a = rqhVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f36827b.u(this.f36826a);
    }
}
