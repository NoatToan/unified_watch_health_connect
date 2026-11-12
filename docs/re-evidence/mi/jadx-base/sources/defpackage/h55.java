package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;

/* JADX INFO: loaded from: classes4.dex */
public final class h55 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h55 f19700r = new b().o("").a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f19701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f19702b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f19703k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f19704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap f19705b;
        public Layout.Alignment c;
        public Layout.Alignment d;
        public float e;
        public int f;
        public int g;
        public float h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f19706k;
        public float l;
        public float m;
        public boolean n;
        public int o;
        public int p;
        public float q;

        public h55 a() {
            return new h55(this.f19704a, this.c, this.d, this.f19705b, this.e, this.f, this.g, this.h, this.i, this.j, this.f19706k, this.l, this.m, this.n, this.o, this.p, this.q);
        }

        public b b() {
            this.n = false;
            return this;
        }

        public int c() {
            return this.g;
        }

        public int d() {
            return this.i;
        }

        public CharSequence e() {
            return this.f19704a;
        }

        public b f(Bitmap bitmap) {
            this.f19705b = bitmap;
            return this;
        }

        public b g(float f) {
            this.m = f;
            return this;
        }

        public b h(float f, int i) {
            this.e = f;
            this.f = i;
            return this;
        }

        public b i(int i) {
            this.g = i;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public b k(float f) {
            this.h = f;
            return this;
        }

        public b l(int i) {
            this.i = i;
            return this;
        }

        public b m(float f) {
            this.q = f;
            return this;
        }

        public b n(float f) {
            this.l = f;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f19704a = charSequence;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.c = alignment;
            return this;
        }

        public b q(float f, int i) {
            this.f19706k = f;
            this.j = i;
            return this;
        }

        public b r(int i) {
            this.p = i;
            return this;
        }

        public b s(int i) {
            this.o = i;
            this.n = true;
            return this;
        }

        public b() {
            this.f19704a = null;
            this.f19705b = null;
            this.c = null;
            this.d = null;
            this.e = -3.4028235E38f;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = Integer.MIN_VALUE;
            this.f19706k = -3.4028235E38f;
            this.l = -3.4028235E38f;
            this.m = -3.4028235E38f;
            this.n = false;
            this.o = -16777216;
            this.p = Integer.MIN_VALUE;
        }

        public b(h55 h55Var) {
            this.f19704a = h55Var.f19701a;
            this.f19705b = h55Var.d;
            this.c = h55Var.f19702b;
            this.d = h55Var.c;
            this.e = h55Var.e;
            this.f = h55Var.f;
            this.g = h55Var.g;
            this.h = h55Var.h;
            this.i = h55Var.i;
            this.j = h55Var.n;
            this.f19706k = h55Var.o;
            this.l = h55Var.j;
            this.m = h55Var.f19703k;
            this.n = h55Var.l;
            this.o = h55Var.m;
            this.p = h55Var.p;
            this.q = h55Var.q;
        }
    }

    public h55(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            rk1.e(bitmap);
        } else {
            rk1.a(bitmap == null);
        }
        this.f19701a = charSequence;
        this.f19702b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.f19703k = f5;
        this.l = z;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
    }

    public b a() {
        return new b();
    }
}
