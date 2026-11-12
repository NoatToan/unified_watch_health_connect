package androidx.camera.core.impl;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class y0<T> implements z1<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y0<Object> f5863b = new y0<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.m.c f5864a;

    private y0(T t7) {
        this.f5864a = l0.j.e(t7);
    }

    public static y0 a(Object obj) {
        return obj == null ? f5863b : new y0(obj);
    }

    @Override // androidx.camera.core.impl.z1
    public final ListenableFuture<T> b() {
        return this.f5864a;
    }

    @Override // androidx.camera.core.impl.z1
    public final void c(z1.a<? super T> aVar) {
    }

    @Override // androidx.camera.core.impl.z1
    public final void d(Executor executor, z1.a<? super T> aVar) {
        this.f5864a.addListener(new ab.j(6, this, aVar), executor);
    }
}
