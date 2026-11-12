package b0;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f14035b;

    public /* synthetic */ n(Runnable runnable, int i14) {
        this.f14034a = i14;
        this.f14035b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14034a) {
            case 0:
                Process.setThreadPriority(-3);
                this.f14035b.run();
                break;
            default:
                Process.setThreadPriority(-16);
                this.f14035b.run();
                break;
        }
    }
}
