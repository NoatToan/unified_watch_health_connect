package v0;

import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.z1;
import b0.i1;
import com.google.common.util.concurrent.ListenableFuture;
import j0.u;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class g implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f174172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f174173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f174174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1.c f174175d;

    public g(l0 l0Var, i1.c cVar, d.a aVar) {
        this.f174172a = l0Var;
        this.f174175d = cVar;
        this.f174173b = new k(l0Var.n(), aVar);
        this.f174174c = new l(l0Var.c());
    }

    @Override // androidx.camera.core.impl.l0
    public final k0 c() {
        return this.f174174c;
    }

    @Override // b0.i1.c
    public final void d(i1 i1Var) {
        u.a();
        this.f174175d.d(i1Var);
    }

    @Override // androidx.camera.core.impl.l0
    public final z1<l0.a> getCameraState() {
        return this.f174172a.getCameraState();
    }

    @Override // androidx.camera.core.impl.l0
    public final void i(Collection<i1> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.l0
    public final boolean j() {
        return false;
    }

    @Override // b0.i1.c
    public final void k(i1 i1Var) {
        u.a();
        this.f174175d.k(i1Var);
    }

    @Override // b0.i1.c
    public final void l(i1 i1Var) {
        u.a();
        this.f174175d.l(i1Var);
    }

    @Override // b0.i1.c
    public final void m(i1 i1Var) {
        u.a();
        this.f174175d.m(i1Var);
    }

    @Override // androidx.camera.core.impl.l0
    public final CameraControlInternal n() {
        return this.f174173b;
    }

    @Override // androidx.camera.core.impl.l0
    public final void p(Collection<i1> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.l0
    public final ListenableFuture<Void> release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
