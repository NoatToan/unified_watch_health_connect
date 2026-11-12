package v;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f173911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f173912c;

    public /* synthetic */ l1(o1 o1Var, long j8, int i14) {
        this.f173910a = i14;
        this.f173911b = o1Var;
        this.f173912c = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f173910a) {
            case 0:
                o1 o1Var = this.f173911b;
                o1Var.f173949b.execute(new l1(o1Var, this.f173912c, 3));
                break;
            case 1:
                o1 o1Var2 = this.f173911b;
                o1Var2.f173949b.execute(new l1(o1Var2, this.f173912c, 2));
                break;
            case 2:
                long j8 = this.f173912c;
                o1 o1Var3 = this.f173911b;
                if (j8 == o1Var3.f173958k) {
                    o1Var3.b();
                }
                break;
            default:
                long j14 = this.f173912c;
                o1 o1Var4 = this.f173911b;
                if (j14 == o1Var4.f173958k) {
                    o1Var4.f173960m = false;
                    ScheduledFuture<?> scheduledFuture = o1Var4.f173957j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        o1Var4.f173957j = null;
                    }
                    androidx.concurrent.futures.b.a<b0.e0> aVar = o1Var4.f173966s;
                    if (aVar != null) {
                        aVar.b(b0.e0.a(false));
                        o1Var4.f173966s = null;
                    }
                }
                break;
        }
    }
}
