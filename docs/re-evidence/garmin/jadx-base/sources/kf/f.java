package kf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u000b\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¨\u0006\u0007"}, d2 = {"Lkf/f;", "Lo53/z;", "delegate", "<init>", "(Lo53/z;)V", "Lh53/a;", "_unconfined", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f104578c = AtomicIntegerFieldUpdater.newUpdater(f.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f104579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile /* synthetic */ int f104580b = 1;

    public f(z zVar) {
        this.f104579a = zVar;
    }

    public final z H() {
        return f104578c.get(this) == 1 ? s0.f129407b : this.f104579a;
    }

    @Override // o53.z
    public final void dispatch(t13.g gVar, Runnable runnable) {
        H().dispatch(gVar, runnable);
    }

    @Override // o53.z
    public final void dispatchYield(t13.g gVar, Runnable runnable) {
        H().dispatchYield(gVar, runnable);
    }

    @Override // o53.z
    public final boolean isDispatchNeeded(t13.g gVar) {
        return H().isDispatchNeeded(gVar);
    }

    @Override // o53.z
    public final z limitedParallelism(int i14, String str) {
        return H().limitedParallelism(i14, str);
    }

    @Override // o53.z
    /* JADX INFO: renamed from: toString */
    public final String getF168767c() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.f104579a + ")";
    }
}
