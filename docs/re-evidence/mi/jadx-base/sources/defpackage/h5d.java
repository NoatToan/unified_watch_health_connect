package defpackage;

import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes4.dex */
public class h5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19710b;
    public ImageRequest c;
    public Object d;
    public p4d e;
    public boolean n;
    public String u;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public long i = -1;
    public long j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f19711k = -1;
    public long l = -1;
    public int m = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19712r = -1;
    public long s = -1;
    public long t = -1;

    public int a() {
        return this.q;
    }

    public void b() {
        this.f19710b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = -1L;
        this.h = -1L;
        this.i = -1L;
        this.j = -1L;
        this.f19711k = -1L;
        this.l = -1L;
        this.m = 1;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.f19712r = -1;
        this.s = -1L;
        this.t = -1L;
        this.u = null;
    }

    public void c(Object obj) {
        this.d = obj;
    }

    public void d(long j) {
        this.j = j;
    }

    public void e(long j) {
        this.i = j;
    }

    public void f(long j) {
        this.h = j;
    }

    public void g(String str) {
        this.f19709a = str;
    }

    public void h(long j) {
        this.g = j;
    }

    public void i(long j) {
        this.f = j;
    }

    public void j(p4d p4dVar) {
        this.e = p4dVar;
    }

    public void k(int i) {
        this.q = i;
    }

    public void l(int i) {
        this.m = i;
    }

    public void m(ImageRequest imageRequest) {
        this.c = imageRequest;
    }

    public void n(long j) {
        this.l = j;
    }

    public void o(long j) {
        this.f19711k = j;
    }

    public void p(long j) {
        this.t = j;
    }

    public void q(int i) {
        this.p = i;
    }

    public void r(int i) {
        this.o = i;
    }

    public void s(boolean z) {
        this.n = z;
    }

    public void t(String str) {
        this.f19710b = str;
    }

    public void u(long j) {
        this.s = j;
    }

    public void v(boolean z) {
        this.f19712r = z ? 1 : 2;
    }

    public c5d w() {
        return new c5d(this.f19709a, this.f19710b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.f19711k, this.l, this.m, this.n, this.o, this.p, this.f19712r, this.s, this.t, this.u);
    }
}
