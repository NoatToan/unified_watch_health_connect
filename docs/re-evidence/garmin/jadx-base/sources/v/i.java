package v;

import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f173837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.b.a f173838c;

    public /* synthetic */ i(l lVar, androidx.concurrent.futures.b.a aVar, int i14) {
        this.f173836a = i14;
        this.f173837b = lVar;
        this.f173838c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f173836a;
        androidx.concurrent.futures.b.a aVar = this.f173838c;
        l lVar = this.f173837b;
        switch (i14) {
            case 0:
                int i15 = l.C;
                final long jB = lVar.B();
                final androidx.concurrent.futures.b.a aVar2 = new androidx.concurrent.futures.b.a();
                androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar2);
                aVar2.f6080b = dVar;
                aVar2.f6079a = h.class;
                try {
                    lVar.p(new l.c() { // from class: v.j
                        @Override // v.l.c
                        public final boolean a(TotalCaptureResult totalCaptureResult) {
                            if (!l.x(totalCaptureResult, jB)) {
                                return false;
                            }
                            aVar2.b(null);
                            return true;
                        }
                    });
                    aVar2.f6079a = "waitForSessionUpdateId:" + jB;
                } catch (Exception e4) {
                    dVar.a(e4);
                }
                l0.j.g(dVar, aVar);
                break;
            default:
                aVar.b(Boolean.valueOf(lVar.f173899w));
                break;
        }
    }
}
