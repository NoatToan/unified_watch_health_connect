package ya;

import fa.g;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Executor f195390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f195391b;

    public a(Executor executor, g gVar) {
        this.f195390a = executor;
        this.f195391b = gVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f195390a.execute(runnable);
    }

    @Override // ya.b
    public final void release() {
        this.f195391b.accept(this.f195390a);
    }
}
