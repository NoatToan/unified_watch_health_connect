package androidx.camera.core.impl;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h1 implements CameraControlInternal {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraControlInternal f5567b;

    public h1(CameraControlInternal cameraControlInternal) {
        this.f5567b = cameraControlInternal;
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Void> a(float f14) {
        return this.f5567b.a(f14);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Void> b(float f14) {
        return this.f5567b.b(f14);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void c() {
        this.f5567b.c();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final x0 d() {
        return this.f5567b.d();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void e() {
        this.f5567b.e();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void f() {
        this.f5567b.f();
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<Void> g(boolean z14) {
        return this.f5567b.g(z14);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void h() {
        this.f5567b.h();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void i(x0 x0Var) {
        this.f5567b.i(x0Var);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public ListenableFuture j(int i14, int i15, List list) {
        return this.f5567b.j(i14, i15, list);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void k(b0.l0.j jVar) {
        this.f5567b.k(jVar);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture<b0.e0> l(b0.d0 d0Var) {
        return this.f5567b.l(d0Var);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void m(int i14) {
        this.f5567b.m(i14);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void n(l2.b bVar) {
        this.f5567b.n(bVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture o(int i14) {
        return this.f5567b.o(i14);
    }
}
