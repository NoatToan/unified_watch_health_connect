package androidx.camera.core.impl;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class i1 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f5574a;

    public i1(k0 k0Var) {
        this.f5574a = k0Var;
    }

    @Override // androidx.camera.core.impl.k0
    public final Set<b0.b0> a() {
        return this.f5574a.a();
    }

    @Override // b0.r
    public final int b() {
        return this.f5574a.b();
    }

    @Override // androidx.camera.core.impl.k0
    public final void c(s sVar) {
        this.f5574a.c(sVar);
    }

    @Override // androidx.camera.core.impl.k0
    public final List<Size> d(Range<Integer> range) {
        return this.f5574a.d(range);
    }

    @Override // androidx.camera.core.impl.k0
    public final boolean e() {
        return this.f5574a.e();
    }

    @Override // androidx.camera.core.impl.k0
    public final e1 f() {
        return this.f5574a.f();
    }

    @Override // b0.r
    public androidx.lifecycle.s0<b0.l1> g() {
        return this.f5574a.g();
    }

    @Override // b0.r
    public final androidx.lifecycle.s0<b0.u> getCameraState() {
        return this.f5574a.getCameraState();
    }

    @Override // androidx.camera.core.impl.k0
    public k0 getImplementation() {
        return this.f5574a.getImplementation();
    }

    @Override // androidx.camera.core.impl.k0
    public final List<Size> getSupportedResolutions(int i14) {
        return this.f5574a.getSupportedResolutions(i14);
    }

    @Override // b0.r
    public int h() {
        return this.f5574a.h();
    }

    @Override // androidx.camera.core.impl.k0
    public final Object i() {
        return this.f5574a.i();
    }

    @Override // androidx.camera.core.impl.k0
    public final i2 j() {
        return this.f5574a.j();
    }

    @Override // androidx.camera.core.impl.k0
    public final Set<Integer> k() {
        return this.f5574a.k();
    }

    @Override // androidx.camera.core.impl.k0
    public final void l(Executor executor, j1.h hVar) {
        this.f5574a.l(executor, hVar);
    }

    @Override // b0.r
    public androidx.lifecycle.s0<Integer> m() {
        return this.f5574a.m();
    }

    @Override // androidx.camera.core.impl.k0
    public final x2 n() {
        return this.f5574a.n();
    }

    @Override // b0.r
    public final String o() {
        return this.f5574a.o();
    }

    @Override // androidx.camera.core.impl.k0
    public final List<Size> p() {
        return this.f5574a.p();
    }

    @Override // androidx.camera.core.impl.k0
    public String q() {
        return this.f5574a.q();
    }

    @Override // b0.r
    public int r(int i14) {
        return this.f5574a.r(i14);
    }

    @Override // androidx.camera.core.impl.k0
    public final Set<Integer> s() {
        return this.f5574a.s();
    }

    @Override // androidx.camera.core.impl.k0
    public final Rect t() {
        return this.f5574a.t();
    }

    @Override // androidx.camera.core.impl.k0
    public final void u(b0.v vVar) {
        this.f5574a.u(vVar);
    }

    @Override // androidx.camera.core.impl.k0
    public final List<Size> v(int i14) {
        return this.f5574a.v(i14);
    }

    @Override // androidx.camera.core.impl.k0
    public boolean x() {
        return this.f5574a.x();
    }
}
