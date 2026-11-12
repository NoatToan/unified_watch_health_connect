package wb2;

/* JADX INFO: loaded from: classes11.dex */
public class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f184136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f184137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f184138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f184139d;

    public t(r rVar, a aVar, long j8, long j14) {
        this.f184139d = rVar;
        this.f184136a = aVar;
        this.f184137b = j8;
        this.f184138c = j14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f184136a.p(r.b(this.f184139d, this.f184137b, this.f184138c), j.ALWAYS_SHOW_PROGRESS, "5009");
    }
}
