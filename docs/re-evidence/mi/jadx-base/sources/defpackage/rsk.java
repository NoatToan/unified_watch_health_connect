package defpackage;

import com.miui.tsmclient.service.DKFRequestService;

/* JADX INFO: loaded from: classes3.dex */
public class rsk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f32863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f32864b;

    @Deprecated
    public volatile int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f32866b;
        public int c;
        public int d;
        public int e;
        public int f;
        public float g;

        @Deprecated
        public int h;
    }

    public rsk() {
        m(-1);
        k(DKFRequestService.x0);
        j(0);
        o(0);
        p(0);
        i(0);
        h(0);
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.d;
    }

    @Deprecated
    public int c() {
        return this.c;
    }

    public int d() {
        return this.f32863a;
    }

    public int e() {
        return this.f32864b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof rsk)) {
            return false;
        }
        rsk rskVar = (rsk) obj;
        int i = this.d;
        int i2 = rskVar.d;
        boolean z = i == i2 || Math.abs(i - i2) == 1;
        int i3 = this.e;
        int i4 = rskVar.e;
        return this.c == rskVar.c && this.f32863a == rskVar.f32863a && z && (i3 == i4 || Math.abs(i3 - i4) == 1);
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return this.f;
    }

    public void h(int i) {
        this.e = i;
    }

    public void i(int i) {
        this.d = i;
    }

    @Deprecated
    public void j(int i) {
        this.c = i;
    }

    public void k(int i) {
        this.f32863a = i;
    }

    public void l(rsk rskVar) {
        if (rskVar != null) {
            this.f32864b = rskVar.f32864b;
            this.f32863a = rskVar.f32863a;
            this.f = rskVar.f;
            this.g = rskVar.g;
            this.d = rskVar.d;
            this.e = rskVar.e;
            this.c = rskVar.c;
        }
    }

    public void m(int i) {
        this.f32864b = i;
    }

    public void n(float f) {
        this.h = f;
    }

    public void o(int i) {
        this.g = i;
    }

    public void p(int i) {
        this.f = i;
    }

    public void q(fhl fhlVar) {
        fhlVar.f17790a = e();
        fhlVar.f17791b = c();
        fhlVar.c = d();
        fhlVar.d = g();
        fhlVar.e = f();
        fhlVar.f = b();
        fhlVar.g = a();
    }

    public void r(a aVar) {
        m(aVar.f32865a);
        k(aVar.f32866b);
        p(aVar.e);
        o(aVar.f);
        i(aVar.c);
        h(aVar.d);
        n(aVar.g);
        j(aVar.h);
    }

    public String toString() {
        return "ResponsiveState@" + hashCode() + "( type = " + this.f32864b + ", mode = " + this.f32863a + ", windowDensity " + this.h + ", wWidthDp " + this.f + ", wHeightDp " + this.g + ", wWidth " + this.d + ", wHeight " + this.e + " )";
    }
}
