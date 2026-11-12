package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes9.dex */
public class hmc implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Path f36895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f36897c;
    private float d;
    private int e;
    private float f;
    private boolean g;
    private boolean h;
    private float i;
    private float j;
    private String k;
    private float l;
    private String m;
    private int n;
    private Path o;
    private Path p;
    private float q;
    private float r;
    private String s;
    private PointF t;
    private float w;
    private float y;

    public hmc(float f, String str, int i) {
        this(0.0f, f, str);
        this.f36896b = i;
    }

    public hmc(float f, float f2, String str) {
        this(f, f2, str, -7829368);
    }

    public hmc(float f, float f2, String str, int i) {
        this(f, f2, "", str, -7829368);
    }

    public hmc(float f, float f2, String str, String str2, int i) {
        this.n = 0;
        this.t = new PointF();
        this.q = 0.0f;
        this.p = new Path();
        this.f36895a = new Path();
        this.o = new Path();
        this.w = f2;
        this.f = f;
        this.d = f2 - f;
        this.t.y = f;
        this.m = str2;
        this.s = str;
        this.e = i;
        this.k = new DecimalFormat("##").format(this.d);
    }

    public Path g() {
        if (this.d > 0.0f) {
            this.f36895a = new Path();
            this.h = b(this.f36895a, this.d, this.h, e(this.d), d(this.d));
        }
        return this.f36895a;
    }

    public RectF k() {
        return new RectF(this.t.x, this.t.y - this.q, this.t.x + this.y, this.t.y);
    }

    public Path o() {
        if (this.q > 0.0f) {
            this.p = new Path();
            this.g = b(this.p, this.q, this.g, e(this.q), d(this.q));
        }
        return this.p;
    }

    public RectF e(float f) {
        return new RectF(this.t.x, (this.t.y - f) + (this.y / 2.0f), this.t.x + this.y, this.t.y);
    }

    public RectF d(float f) {
        return new RectF(this.t.x, this.t.y - f, this.t.x + this.y, (this.t.y - f) + this.y);
    }

    public Path f() {
        float f = this.d - this.q;
        if (f > 0.0f) {
            Path path = new Path();
            this.o = path;
            b(path, f, false, new RectF(this.t.x, (this.t.y - this.d) + (this.y / 2.0f), this.t.x + this.y, this.t.y - this.q), d(this.d));
        }
        return this.o;
    }

    private boolean b(Path path, float f, boolean z, RectF rectF, RectF rectF2) {
        if (f > this.y / 2.0f) {
            Path path2 = new Path();
            path2.moveTo(rectF.left, rectF.top);
            path2.lineTo(rectF.left, rectF.bottom);
            path2.lineTo(rectF.right, rectF.bottom);
            path2.lineTo(rectF.right, rectF.top);
            path.addPath(path2);
            path.addArc(rectF2, 180.0f, 180.0f);
            return true;
        }
        rectF2.bottom -= this.y - (f * 2.0f);
        path.addArc(rectF2, 180.0f, 180.0f);
        path.close();
        return true;
    }

    public PointF b() {
        return new PointF(p(), this.t.y - this.d);
    }

    public PointF m() {
        return new PointF(p(), this.t.y - this.q);
    }

    public float y() {
        return this.y;
    }

    public hmc b(float f) {
        this.y = f;
        return this;
    }

    public float l() {
        return this.d;
    }

    public float t() {
        float f = this.d;
        float f2 = this.q;
        return f > f2 ? f : f2;
    }

    public hmc c(float f) {
        this.h = false;
        this.g = false;
        this.q *= f;
        this.d *= f;
        return this;
    }

    public PointF r() {
        return this.t;
    }

    public float p() {
        PointF pointF = this.t;
        if (pointF != null) {
            this.i = pointF.x + (this.y / 2.0f);
        }
        return this.i;
    }

    public hmc e(int i) {
        this.e = i;
        return this;
    }

    public float s() {
        return this.j;
    }

    public hmc i(float f) {
        this.j = f;
        return this;
    }

    public String e() {
        return this.m;
    }

    public float w() {
        return this.w;
    }

    public hmc j(float f) {
        this.w = f;
        this.d = f - this.f;
        this.k = new DecimalFormat("##.#").format(this.w);
        return this;
    }

    public float d() {
        return this.f;
    }

    public int a() {
        return this.f36896b;
    }

    public String j() {
        return this.k;
    }

    public hmc b(String str) {
        this.k = str;
        return this;
    }

    public float c() {
        return this.d - this.q;
    }

    public float i() {
        return this.q;
    }

    public hmc f(float f) {
        this.r = f;
        this.q = f;
        return this;
    }

    public float n() {
        return this.d;
    }

    public hmc a(float f) {
        this.f36897c = f;
        this.d = f;
        return this;
    }

    public float q() {
        return this.l;
    }

    public void g(float f) {
        this.l = f;
    }

    public int h() {
        return this.n;
    }

    public void c(int i) {
        this.n = i;
    }

    public Object clone() {
        hmc hmcVar;
        CloneNotSupportedException e;
        hmc hmcVar2 = null;
        try {
            if (super.clone() instanceof hmc) {
                hmcVar = (hmc) super.clone();
                try {
                    hmcVar.t = new PointF(this.t.x, this.t.y);
                } catch (CloneNotSupportedException e2) {
                    e = e2;
                    LogUtil.e("Suggestion_SugExcel", LogAnonymous.b(e));
                }
                hmcVar2 = hmcVar;
            }
        } catch (CloneNotSupportedException e3) {
            hmcVar = null;
            e = e3;
        }
        if (hmcVar2 != null) {
            return hmcVar2;
        }
        hmc hmcVar3 = new hmc(this.w, this.m, this.f36896b);
        hmcVar3.t = new PointF(this.t.x, this.t.y);
        return hmcVar3;
    }
}
