package sm2;

/* JADX INFO: loaded from: classes11.dex */
public class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yl2.d f160335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f160336b;

    public q(yl2.d dVar, boolean z14) {
        this.f160335a = dVar;
        this.f160336b = z14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yl2.d dVar = this.f160335a;
        long f197655a = dVar.getF197655a();
        bm2.a aVar = dVar.f197841c;
        ((fm2.c) lm2.h.c()).d(f197655a, aVar != null ? aVar.f18886a : null, this.f160336b);
    }
}
