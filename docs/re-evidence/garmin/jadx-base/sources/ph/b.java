package ph;

/* JADX INFO: loaded from: classes7.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f137646a;

    public b(c cVar) {
        this.f137646a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f137646a;
        c.b bVar = cVar.f137647a;
        if (bVar == null || !bVar.isShowing()) {
            return;
        }
        try {
            cVar.f137650d.removeMessages(1);
            cVar.f137647a.dismiss();
        } catch (Exception e4) {
            nh.d.a(e4);
        }
    }
}
