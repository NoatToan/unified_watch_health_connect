package o4;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo4/h;", "Lo4/d1;", "Landroid/graphics/Paint;", "internalPaint", "<init>", "(Landroid/graphics/Paint;)V", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f128857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f128858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Shader f128859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0 f128860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g1 f128861e;

    public h(Paint paint) {
        this.f128857a = paint;
        q.f128930b.getClass();
        this.f128858b = q.f128933e;
    }

    @Override // o4.d1
    public final float a() {
        return this.f128857a.getAlpha() / 255.0f;
    }

    @Override // o4.d1
    public final long b() {
        return f0.b(this.f128857a.getColor());
    }

    @Override // o4.d1
    public final void c(float f14) {
        this.f128857a.setAlpha((int) Math.rint(f14 * 255.0f));
    }

    @Override // o4.d1
    public final void d(e0 e0Var) {
        this.f128860d = e0Var;
        this.f128857a.setColorFilter(e0Var != null ? e0Var.f128844a : null);
    }

    @Override // o4.d1
    public final void e(long j8) {
        this.f128857a.setColor(f0.j(j8));
    }

    @Override // o4.d1
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Shader getF128859c() {
        return this.f128859c;
    }

    @Override // o4.d1
    public final void g(Shader shader) {
        this.f128859c = shader;
        this.f128857a.setShader(shader);
    }

    public final int h() {
        if (this.f128857a.isFilterBitmap()) {
            o0.f128897b.getClass();
            return o0.f128898c;
        }
        o0.f128897b.getClass();
        return 0;
    }

    public final int i() {
        Paint.Cap strokeCap = this.f128857a.getStrokeCap();
        int i14 = strokeCap == null ? -1 : i.a.f128866a[strokeCap.ordinal()];
        if (i14 == 1) {
            u1.f129010b.getClass();
            return 0;
        }
        if (i14 == 2) {
            u1.f129010b.getClass();
            return u1.f129011c;
        }
        if (i14 != 3) {
            u1.f129010b.getClass();
            return 0;
        }
        u1.f129010b.getClass();
        return u1.f129012d;
    }

    public final int j() {
        Paint.Join strokeJoin = this.f128857a.getStrokeJoin();
        int i14 = strokeJoin == null ? -1 : i.a.f128867b[strokeJoin.ordinal()];
        if (i14 == 1) {
            v1.f129019b.getClass();
            return 0;
        }
        if (i14 == 2) {
            v1.f129019b.getClass();
            return v1.f129021d;
        }
        if (i14 != 3) {
            v1.f129019b.getClass();
            return 0;
        }
        v1.f129019b.getClass();
        return v1.f129020c;
    }

    public final void k(int i14) {
        int i15 = this.f128858b;
        q.a aVar = q.f128930b;
        if (i15 == i14) {
            return;
        }
        this.f128858b = i14;
        int i16 = Build.VERSION.SDK_INT;
        Paint paint = this.f128857a;
        if (i16 < 29) {
            paint.setXfermode(new PorterDuffXfermode(b.b(i14)));
        } else {
            b2.f128815a.getClass();
            paint.setBlendMode(b.a(i14));
        }
    }

    public final void l(int i14) {
        o0.f128897b.getClass();
        this.f128857a.setFilterBitmap(!(i14 == 0));
    }

    public final void m(g1 g1Var) {
        k kVar = (k) g1Var;
        this.f128857a.setPathEffect(kVar != null ? kVar.f128879b : null);
        this.f128861e = g1Var;
    }

    public final void n(int i14) {
        Paint.Cap cap;
        u1.f129010b.getClass();
        if (i14 == u1.f129012d) {
            cap = Paint.Cap.SQUARE;
        } else if (i14 == u1.f129011c) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i14 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        this.f128857a.setStrokeCap(cap);
    }

    public final void o(int i14) {
        Paint.Join join;
        v1.f129019b.getClass();
        if (i14 == 0) {
            join = Paint.Join.MITER;
        } else if (i14 == v1.f129021d) {
            join = Paint.Join.BEVEL;
        } else {
            join = i14 == v1.f129020c ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        this.f128857a.setStrokeJoin(join);
    }

    public final void p(float f14) {
        this.f128857a.setStrokeMiter(f14);
    }

    public final void q(float f14) {
        this.f128857a.setStrokeWidth(f14);
    }

    public final void r(int i14) {
        e1.f128845b.getClass();
        this.f128857a.setStyle(i14 == e1.f128846c ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public h() {
        this(new Paint(7));
    }
}
