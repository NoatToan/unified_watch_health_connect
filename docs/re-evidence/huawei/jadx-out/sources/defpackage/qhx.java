package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes15.dex */
public class qhx {
    private LinearGradient aa;
    private LinearGradient ad;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearGradient f46262c;
    private LinearGradient i;
    private LinearGradient j;
    private LinearGradient l;
    private LinearGradient p;
    private LinearGradient t;
    private PointF u;
    private Path x;
    private float y = 437.0f;
    private float v = 501.0f;
    private int m = 868255472;
    private int f = 864320759;
    private int q = 872267365;
    private int n = 872255062;
    private int ab = 862505936;
    private int w = 860537305;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46261b = 866117244;
    private int d = 862374758;
    private int g = 1301911961;
    private int o = -4159760;
    private int k = -8094473;
    private int r = -147867;
    private int s = -160170;
    private int ac = -9909296;
    private int z = -11877927;
    private int h = -6297988;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46260a = -10040474;
    private PointF ag = new PointF(218.5f, -21.381f);
    private PointF e = new PointF(218.5f, 492.83408f);

    public qhx() {
        Path path = new Path();
        this.x = path;
        path.moveTo(63.997f, 64.143f);
        this.x.cubicTo(149.327f, -21.381f, 287.673f, -21.381f, 373.003f, 64.143f);
        this.x.cubicTo(458.332f, 149.666f, 458.332f, 288.328f, 373.003f, 373.851f);
        this.x.cubicTo(287.673f, 459.375f, 234.885f, 485.212f, 228.763f, 489.662f);
        this.x.cubicTo(222.642f, 494.113f, 214.358f, 494.113f, 208.237f, 489.662f);
        this.x.cubicTo(202.115f, 485.212f, 149.327f, 459.375f, 63.997f, 373.851f);
        this.x.cubicTo(-21.332f, 288.328f, -21.332f, 149.666f, 63.997f, 64.143f);
        this.x.close();
        this.j = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, this.m, this.f, Shader.TileMode.CLAMP);
        this.t = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, this.q, this.n, Shader.TileMode.CLAMP);
        this.ad = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, this.ab, this.w, Shader.TileMode.CLAMP);
        this.f46262c = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, this.f46261b, this.d, Shader.TileMode.CLAMP);
        this.l = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, this.o, this.k, Shader.TileMode.CLAMP);
        this.p = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, this.r, this.s, Shader.TileMode.CLAMP);
        this.aa = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, this.ac, this.z, Shader.TileMode.CLAMP);
        this.i = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, this.h, this.f46260a, Shader.TileMode.CLAMP);
        this.u = new PointF(this.y / 2.0f, this.v);
    }

    public float j() {
        return this.y;
    }

    public float i() {
        return this.v;
    }

    public Path f() {
        return this.x;
    }

    public PointF g() {
        return this.u;
    }

    public LinearGradient e() {
        return this.l;
    }

    public LinearGradient h() {
        return this.p;
    }

    public LinearGradient l() {
        return this.aa;
    }

    public LinearGradient c() {
        return this.j;
    }

    public LinearGradient d() {
        return this.t;
    }

    public LinearGradient o() {
        return this.ad;
    }

    public LinearGradient b() {
        return this.f46262c;
    }

    public LinearGradient a() {
        return this.i;
    }

    public int n() {
        return this.g;
    }

    public void j(int i) {
        this.o = i;
        this.l = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, i, this.k, Shader.TileMode.CLAMP);
    }

    public void e(int i) {
        this.m = i;
        this.j = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, i, this.f, Shader.TileMode.CLAMP);
    }

    public void c(int i) {
        this.k = i;
        this.l = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, this.o, i, Shader.TileMode.CLAMP);
    }

    public void b(int i) {
        this.f = i;
        this.j = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, this.m, i, Shader.TileMode.CLAMP);
    }

    public void f(int i) {
        this.r = i;
        this.p = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, i, this.s, Shader.TileMode.CLAMP);
    }

    public void h(int i) {
        this.q = i;
        this.t = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, i, this.n, Shader.TileMode.CLAMP);
    }

    public void g(int i) {
        this.n = i;
        this.t = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, this.q, i, Shader.TileMode.CLAMP);
    }

    public void i(int i) {
        this.s = i;
        this.p = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, this.r, i, Shader.TileMode.CLAMP);
    }

    public void l(int i) {
        this.ac = i;
        this.aa = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, i, this.z, Shader.TileMode.CLAMP);
    }

    public void m(int i) {
        this.ab = i;
        this.ad = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, i, this.w, Shader.TileMode.CLAMP);
    }

    public void n(int i) {
        this.z = i;
        this.aa = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, this.ac, i, Shader.TileMode.CLAMP);
    }

    public void o(int i) {
        this.w = i;
        this.ad = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, this.ab, i, Shader.TileMode.CLAMP);
    }

    public void d(int i) {
        this.h = i;
        this.i = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, i, this.f46260a, Shader.TileMode.CLAMP);
    }

    public void a(int i) {
        this.f46260a = i;
        this.i = new LinearGradient(this.ag.x, this.ag.y, this.e.x, this.e.y, this.h, i, Shader.TileMode.CLAMP);
    }
}
