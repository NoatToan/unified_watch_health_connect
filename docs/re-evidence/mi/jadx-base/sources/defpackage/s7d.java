package defpackage;

import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.RtlMode;

/* JADX INFO: loaded from: classes6.dex */
public class s7d {
    public RtlMode A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33375b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f33376k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f33377r;
    public long s;
    public int u;
    public int v;
    public int w;
    public Orientation y;
    public AnimationType z;
    public int t = 3;
    public int x = -1;

    public void A(boolean z) {
        this.n = z;
    }

    public void B(int i) {
        this.t = i;
    }

    public void C(boolean z) {
        this.o = z;
    }

    public void D(boolean z) {
        this.p = z;
    }

    public void E(int i) {
        this.f33374a = i;
    }

    public void F(boolean z) {
        this.q = z;
    }

    public void G(long j) {
        this.f33377r = j;
    }

    public void H(boolean z) {
        this.m = z;
    }

    public void I(int i) {
        this.w = i;
    }

    public void J(Orientation orientation) {
        this.y = orientation;
    }

    public void K(int i) {
        this.d = i;
    }

    public void L(int i) {
        this.h = i;
    }

    public void M(int i) {
        this.e = i;
    }

    public void N(int i) {
        this.g = i;
    }

    public void O(int i) {
        this.f = i;
    }

    public void P(int i) {
        this.c = i;
    }

    public void Q(RtlMode rtlMode) {
        this.A = rtlMode;
    }

    public void R(float f) {
        this.j = f;
    }

    public void S(int i) {
        this.l = i;
    }

    public void T(int i) {
        this.u = i;
    }

    public void U(int i) {
        this.v = i;
    }

    public void V(int i) {
        this.i = i;
    }

    public void W(int i) {
        this.f33376k = i;
    }

    public void X(int i) {
        this.x = i;
    }

    public void Y(int i) {
        this.f33375b = i;
    }

    public long a() {
        return this.s;
    }

    public AnimationType b() {
        if (this.z == null) {
            this.z = AnimationType.NONE;
        }
        return this.z;
    }

    public int c() {
        return this.t;
    }

    public long d() {
        return this.f33377r;
    }

    public int e() {
        return this.w;
    }

    public Orientation f() {
        if (this.y == null) {
            this.y = Orientation.HORIZONTAL;
        }
        return this.y;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.h;
    }

    public int i() {
        return this.e;
    }

    public int j() {
        return this.g;
    }

    public int k() {
        return this.f;
    }

    public int l() {
        return this.c;
    }

    public RtlMode m() {
        if (this.A == null) {
            this.A = RtlMode.Off;
        }
        return this.A;
    }

    public float n() {
        return this.j;
    }

    public int o() {
        return this.l;
    }

    public int p() {
        return this.u;
    }

    public int q() {
        return this.v;
    }

    public int r() {
        return this.i;
    }

    public int s() {
        return this.f33376k;
    }

    public int t() {
        return this.x;
    }

    public boolean u() {
        return this.n;
    }

    public boolean v() {
        return this.o;
    }

    public boolean w() {
        return this.p;
    }

    public boolean x() {
        return this.m;
    }

    public void y(long j) {
        this.s = j;
    }

    public void z(AnimationType animationType) {
        this.z = animationType;
    }
}
