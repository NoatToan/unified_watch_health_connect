package bv2;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class g implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21484a;

    public /* synthetic */ g(int i14) {
        this.f21484a = i14;
    }

    private final void a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f21484a) {
            case 0:
                h.c cVar = h.f21485k;
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                lh2.d.c cVar2 = lh2.d.f112457i;
                runnable.run();
                break;
            case 3:
                lu2.a aVar = lu2.a.f115014a;
                runnable.getClass();
                runnable.run();
                break;
            case 4:
                n.a.a().b(runnable);
                break;
            case 5:
                n.a.a().f122013a.f122015b.execute(runnable);
                break;
        }
    }
}
