package hx0;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import java.util.concurrent.locks.ReentrantLock;
import o53.c2;
import o53.e2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhx0/i0;", "Landroidx/lifecycle/u1;", "Lo53/b0;", "Lyw0/a;", "repository", "<init>", "(Lyw0/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 extends u1 implements o53.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.a f86080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f86081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f86082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<cx0.a<ww0.b>> f86083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0<cx0.a<ww0.c>> f86084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c2 f86085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c2 f86086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e2 f86087h;

    public i0(yw0.a aVar) {
        aVar.getClass();
        this.f86080a = aVar;
        this.f86081b = new ReentrantLock();
        this.f86082c = new ReentrantLock();
        this.f86083d = new y0<>();
        this.f86084e = new y0<>();
        this.f86087h = ge1.b.h();
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        return o53.s0.f129406a.plus(this.f86087h);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        this.f86087h.c(null);
        super.onCleared();
    }
}
