package u4;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu4/e;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<g> f168407a = new ArrayList<>(32);

    public final void a(float f14, float f15, float f16, boolean z14, boolean z15, float f17) {
        this.f168407a.add(new g.a(f14, f15, 0.0f, z14, z15, f16, f17));
    }

    public final void b(float f14, float f15, float f16, boolean z14, boolean z15, float f17) {
        this.f168407a.add(new g.j(f14, f15, 0.0f, z14, z15, f16, f17));
    }

    public final void c() {
        this.f168407a.add(g.b.f168438c);
    }

    public final void d(float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f168407a.add(new g.c(f14, f15, f16, f17, f18, f19));
    }

    public final void e(float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f168407a.add(new g.k(f14, f15, f16, f17, f18, f19));
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ArrayList getF168407a() {
        return this.f168407a;
    }

    public final void g(float f14) {
        this.f168407a.add(new g.d(f14));
    }

    public final void h(float f14) {
        this.f168407a.add(new g.l(f14));
    }

    public final void i(float f14, float f15) {
        this.f168407a.add(new g.e(f14, f15));
    }

    public final void j(float f14, float f15) {
        this.f168407a.add(new g.m(f14, f15));
    }

    public final void k(float f14, float f15) {
        this.f168407a.add(new g.f(f14, f15));
    }

    public final void l(float f14, float f15) {
        this.f168407a.add(new g.n(f14, f15));
    }

    public final void m(float f14, float f15, float f16, float f17) {
        this.f168407a.add(new g.h(f14, f15, f16, f17));
    }

    public final void n(float f14, float f15, float f16, float f17) {
        this.f168407a.add(new g.p(f14, f15, f16, f17));
    }

    public final void o(float f14) {
        this.f168407a.add(new g.s(f14));
    }

    public final void p(float f14) {
        this.f168407a.add(new g.r(f14));
    }
}
