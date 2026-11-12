package o53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo53/b2;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lo53/z;", "dispatcher", "Lo53/j;", "", "continuation", "<init>", "(Lo53/z;Lo53/j;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f129309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j<Unit> f129310b;

    /* JADX WARN: Multi-variable type inference failed */
    public b2(z zVar, j<? super Unit> jVar) {
        this.f129309a = zVar;
        this.f129310b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f129310b.F(this.f129309a, Unit.INSTANCE);
    }
}
