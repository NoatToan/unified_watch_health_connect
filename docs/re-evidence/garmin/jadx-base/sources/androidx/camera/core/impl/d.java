package androidx.camera.core.impl;

import androidx.camera.core.CameraControl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class d implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f5527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f5529c;

    public d(l0 l0Var, c cVar) {
        this.f5527a = l0Var;
        this.f5528b = cVar;
        this.f5529c = new b(l0Var.n(), cVar.f5517d.t());
    }

    @Override // androidx.camera.core.impl.l0, b0.k
    public final CameraControl a() {
        return this.f5529c;
    }

    @Override // androidx.camera.core.impl.l0, b0.k
    public final b0.r b() {
        return this.f5528b;
    }

    @Override // androidx.camera.core.impl.l0
    public final k0 c() {
        return this.f5528b;
    }

    @Override // b0.i1.c
    public final void d(b0.i1 i1Var) {
        this.f5527a.d(i1Var);
    }

    @Override // androidx.camera.core.impl.l0
    public final boolean e() {
        return this.f5527a.e();
    }

    @Override // androidx.camera.core.impl.l0
    public final void f(e0 e0Var) {
        this.f5527a.f(e0Var);
    }

    @Override // androidx.camera.core.impl.l0
    public final void g(boolean z14) {
        this.f5527a.g(z14);
    }

    @Override // androidx.camera.core.impl.l0
    public final z1<l0.a> getCameraState() {
        return this.f5527a.getCameraState();
    }

    @Override // androidx.camera.core.impl.l0
    public final e0 h() {
        return this.f5527a.h();
    }

    @Override // androidx.camera.core.impl.l0
    public final void i(Collection<b0.i1> collection) {
        this.f5527a.i(collection);
    }

    @Override // androidx.camera.core.impl.l0
    public final boolean j() {
        return this.f5527a.j();
    }

    @Override // b0.i1.c
    public final void k(b0.i1 i1Var) {
        this.f5527a.k(i1Var);
    }

    @Override // b0.i1.c
    public final void l(b0.i1 i1Var) {
        this.f5527a.l(i1Var);
    }

    @Override // b0.i1.c
    public final void m(b0.i1 i1Var) {
        this.f5527a.m(i1Var);
    }

    @Override // androidx.camera.core.impl.l0
    public final CameraControlInternal n() {
        return this.f5529c;
    }

    @Override // androidx.camera.core.impl.l0
    public final void o(boolean z14) {
        this.f5527a.o(z14);
    }

    @Override // androidx.camera.core.impl.l0
    public final void p(Collection<b0.i1> collection) {
        this.f5527a.p(collection);
    }

    @Override // androidx.camera.core.impl.l0
    public final ListenableFuture<Void> release() {
        return this.f5527a.release();
    }
}
