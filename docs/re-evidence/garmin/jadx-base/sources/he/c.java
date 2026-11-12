package he;

/* JADX INFO: loaded from: classes7.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f83470a;

    public c(a aVar) {
        this.f83470a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f83470a;
        aVar.f83455h = false;
        aVar.x();
    }
}
