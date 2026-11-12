package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.FloatRange;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import defpackage.nb2;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nb2<T extends nb2<T>> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27737a;
    public Drawable e;
    public int f;
    public Drawable g;
    public int h;
    public boolean m;
    public Drawable o;
    public int p;
    public boolean t;
    public Resources.Theme u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f27738b = 1.0f;
    public jy6 c = jy6.e;
    public Priority d = Priority.NORMAL;
    public boolean i = true;
    public int j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27739k = -1;
    public pzd l = k98.c();
    public boolean n = true;
    public cch q = new cch();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Map<Class<?>, lyp<?>> f27740r = new l93();
    public Class<?> s = Object.class;
    public boolean y = true;

    public static boolean J(int i, int i2) {
        return (i & i2) != 0;
    }

    public final boolean A() {
        return this.z;
    }

    public final boolean B() {
        return this.w;
    }

    public final boolean C() {
        return this.v;
    }

    public final boolean D(nb2<?> nb2Var) {
        return Float.compare(nb2Var.f27738b, this.f27738b) == 0 && this.f == nb2Var.f && ulq.e(this.e, nb2Var.e) && this.h == nb2Var.h && ulq.e(this.g, nb2Var.g) && this.p == nb2Var.p && ulq.e(this.o, nb2Var.o) && this.i == nb2Var.i && this.j == nb2Var.j && this.f27739k == nb2Var.f27739k && this.m == nb2Var.m && this.n == nb2Var.n && this.w == nb2Var.w && this.x == nb2Var.x && this.c.equals(nb2Var.c) && this.d == nb2Var.d && this.q.equals(nb2Var.q) && this.f27740r.equals(nb2Var.f27740r) && this.s.equals(nb2Var.s) && ulq.e(this.l, nb2Var.l) && ulq.e(this.u, nb2Var.u);
    }

    public final boolean F() {
        return this.i;
    }

    public final boolean G() {
        return I(8);
    }

    public boolean H() {
        return this.y;
    }

    public final boolean I(int i) {
        return J(this.f27737a, i);
    }

    public final boolean K() {
        return this.n;
    }

    public final boolean L() {
        return this.m;
    }

    public final boolean M() {
        return I(2048);
    }

    public final boolean N() {
        return ulq.u(this.f27739k, this.j);
    }

    public T O() {
        this.t = true;
        return (T) a0();
    }

    @CheckResult
    public T Q(boolean z) {
        if (this.v) {
            return (T) clone().Q(z);
        }
        this.x = z;
        this.f27737a |= 524288;
        return (T) b0();
    }

    @CheckResult
    public T R() {
        return (T) V(DownsampleStrategy.e, new is3());
    }

    @CheckResult
    public T S() {
        return (T) U(DownsampleStrategy.d, new js3());
    }

    @CheckResult
    public T T() {
        return (T) U(DownsampleStrategy.c, new lo9());
    }

    public final T U(DownsampleStrategy downsampleStrategy, lyp<Bitmap> lypVar) {
        return (T) Z(downsampleStrategy, lypVar, false);
    }

    public final T V(DownsampleStrategy downsampleStrategy, lyp<Bitmap> lypVar) {
        if (this.v) {
            return (T) clone().V(downsampleStrategy, lypVar);
        }
        f(downsampleStrategy);
        return (T) h0(lypVar, false);
    }

    @CheckResult
    public T W(int i, int i2) {
        if (this.v) {
            return (T) clone().W(i, i2);
        }
        this.f27739k = i;
        this.j = i2;
        this.f27737a |= 512;
        return (T) b0();
    }

    @CheckResult
    public T X(Drawable drawable) {
        if (this.v) {
            return (T) clone().X(drawable);
        }
        this.g = drawable;
        int i = this.f27737a | 64;
        this.h = 0;
        this.f27737a = i & (-129);
        return (T) b0();
    }

    @CheckResult
    public T Y(Priority priority) {
        if (this.v) {
            return (T) clone().Y(priority);
        }
        this.d = (Priority) a6i.d(priority);
        this.f27737a |= 8;
        return (T) b0();
    }

    public final T Z(DownsampleStrategy downsampleStrategy, lyp<Bitmap> lypVar, boolean z) {
        T t = z ? (T) i0(downsampleStrategy, lypVar) : (T) V(downsampleStrategy, lypVar);
        t.y = true;
        return t;
    }

    @CheckResult
    public T a(nb2<?> nb2Var) {
        if (this.v) {
            return (T) clone().a(nb2Var);
        }
        if (J(nb2Var.f27737a, 2)) {
            this.f27738b = nb2Var.f27738b;
        }
        if (J(nb2Var.f27737a, 262144)) {
            this.w = nb2Var.w;
        }
        if (J(nb2Var.f27737a, EventRecurrence.TH)) {
            this.z = nb2Var.z;
        }
        if (J(nb2Var.f27737a, 4)) {
            this.c = nb2Var.c;
        }
        if (J(nb2Var.f27737a, 8)) {
            this.d = nb2Var.d;
        }
        if (J(nb2Var.f27737a, 16)) {
            this.e = nb2Var.e;
            this.f = 0;
            this.f27737a &= -33;
        }
        if (J(nb2Var.f27737a, 32)) {
            this.f = nb2Var.f;
            this.e = null;
            this.f27737a &= -17;
        }
        if (J(nb2Var.f27737a, 64)) {
            this.g = nb2Var.g;
            this.h = 0;
            this.f27737a &= -129;
        }
        if (J(nb2Var.f27737a, 128)) {
            this.h = nb2Var.h;
            this.g = null;
            this.f27737a &= -65;
        }
        if (J(nb2Var.f27737a, 256)) {
            this.i = nb2Var.i;
        }
        if (J(nb2Var.f27737a, 512)) {
            this.f27739k = nb2Var.f27739k;
            this.j = nb2Var.j;
        }
        if (J(nb2Var.f27737a, 1024)) {
            this.l = nb2Var.l;
        }
        if (J(nb2Var.f27737a, 4096)) {
            this.s = nb2Var.s;
        }
        if (J(nb2Var.f27737a, 8192)) {
            this.o = nb2Var.o;
            this.p = 0;
            this.f27737a &= -16385;
        }
        if (J(nb2Var.f27737a, 16384)) {
            this.p = nb2Var.p;
            this.o = null;
            this.f27737a &= -8193;
        }
        if (J(nb2Var.f27737a, 32768)) {
            this.u = nb2Var.u;
        }
        if (J(nb2Var.f27737a, 65536)) {
            this.n = nb2Var.n;
        }
        if (J(nb2Var.f27737a, 131072)) {
            this.m = nb2Var.m;
        }
        if (J(nb2Var.f27737a, 2048)) {
            this.f27740r.putAll(nb2Var.f27740r);
            this.y = nb2Var.y;
        }
        if (J(nb2Var.f27737a, 524288)) {
            this.x = nb2Var.x;
        }
        if (!this.n) {
            this.f27740r.clear();
            int i = this.f27737a;
            this.m = false;
            this.f27737a = i & (-133121);
            this.y = true;
        }
        this.f27737a |= nb2Var.f27737a;
        this.q.d(nb2Var.q);
        return (T) b0();
    }

    public final T a0() {
        return this;
    }

    public T b() {
        if (this.t && !this.v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.v = true;
        return (T) O();
    }

    public final T b0() {
        if (this.t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) a0();
    }

    @Override // 
    @CheckResult
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            cch cchVar = new cch();
            t.q = cchVar;
            cchVar.d(this.q);
            l93 l93Var = new l93();
            t.f27740r = l93Var;
            l93Var.putAll(this.f27740r);
            t.t = false;
            t.v = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @CheckResult
    public <Y> T c0(wbh<Y> wbhVar, Y y) {
        if (this.v) {
            return (T) clone().c0(wbhVar, y);
        }
        a6i.d(wbhVar);
        a6i.d(y);
        this.q.e(wbhVar, y);
        return (T) b0();
    }

    @CheckResult
    public T d(Class<?> cls) {
        if (this.v) {
            return (T) clone().d(cls);
        }
        this.s = (Class) a6i.d(cls);
        this.f27737a |= 4096;
        return (T) b0();
    }

    @CheckResult
    public T d0(pzd pzdVar) {
        if (this.v) {
            return (T) clone().d0(pzdVar);
        }
        this.l = (pzd) a6i.d(pzdVar);
        this.f27737a |= 1024;
        return (T) b0();
    }

    @CheckResult
    public T e(jy6 jy6Var) {
        if (this.v) {
            return (T) clone().e(jy6Var);
        }
        this.c = (jy6) a6i.d(jy6Var);
        this.f27737a |= 4;
        return (T) b0();
    }

    @CheckResult
    public T e0(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.v) {
            return (T) clone().e0(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f27738b = f;
        this.f27737a |= 2;
        return (T) b0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof nb2) {
            return D((nb2) obj);
        }
        return false;
    }

    @CheckResult
    public T f(DownsampleStrategy downsampleStrategy) {
        return (T) c0(DownsampleStrategy.h, a6i.d(downsampleStrategy));
    }

    @CheckResult
    public T f0(boolean z) {
        if (this.v) {
            return (T) clone().f0(true);
        }
        this.i = !z;
        this.f27737a |= 256;
        return (T) b0();
    }

    @CheckResult
    public T g(Drawable drawable) {
        if (this.v) {
            return (T) clone().g(drawable);
        }
        this.o = drawable;
        int i = this.f27737a | 8192;
        this.p = 0;
        this.f27737a = i & (-16385);
        return (T) b0();
    }

    @CheckResult
    public T g0(lyp<Bitmap> lypVar) {
        return (T) h0(lypVar, true);
    }

    public final jy6 h() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T h0(lyp<Bitmap> lypVar, boolean z) {
        if (this.v) {
            return (T) clone().h0(lypVar, z);
        }
        s47 s47Var = new s47(lypVar, z);
        j0(Bitmap.class, lypVar, z);
        j0(Drawable.class, s47Var, z);
        j0(BitmapDrawable.class, s47Var.c(), z);
        j0(kza.class, new oza(lypVar), z);
        return (T) b0();
    }

    public int hashCode() {
        return ulq.p(this.u, ulq.p(this.l, ulq.p(this.s, ulq.p(this.f27740r, ulq.p(this.q, ulq.p(this.d, ulq.p(this.c, ulq.q(this.x, ulq.q(this.w, ulq.q(this.n, ulq.q(this.m, ulq.o(this.f27739k, ulq.o(this.j, ulq.q(this.i, ulq.p(this.o, ulq.o(this.p, ulq.p(this.g, ulq.o(this.h, ulq.p(this.e, ulq.o(this.f, ulq.m(this.f27738b)))))))))))))))))))));
    }

    public final int i() {
        return this.f;
    }

    @CheckResult
    public final T i0(DownsampleStrategy downsampleStrategy, lyp<Bitmap> lypVar) {
        if (this.v) {
            return (T) clone().i0(downsampleStrategy, lypVar);
        }
        f(downsampleStrategy);
        return (T) g0(lypVar);
    }

    public final Drawable j() {
        return this.e;
    }

    public <Y> T j0(Class<Y> cls, lyp<Y> lypVar, boolean z) {
        if (this.v) {
            return (T) clone().j0(cls, lypVar, z);
        }
        a6i.d(cls);
        a6i.d(lypVar);
        this.f27740r.put(cls, lypVar);
        int i = this.f27737a;
        this.n = true;
        this.f27737a = 67584 | i;
        this.y = false;
        if (z) {
            this.f27737a = i | 198656;
            this.m = true;
        }
        return (T) b0();
    }

    public final Drawable k() {
        return this.o;
    }

    @CheckResult
    public T k0(boolean z) {
        if (this.v) {
            return (T) clone().k0(z);
        }
        this.z = z;
        this.f27737a |= EventRecurrence.TH;
        return (T) b0();
    }

    public final int l() {
        return this.p;
    }

    public final boolean n() {
        return this.x;
    }

    public final cch p() {
        return this.q;
    }

    public final int q() {
        return this.j;
    }

    public final int r() {
        return this.f27739k;
    }

    public final Drawable s() {
        return this.g;
    }

    public final int t() {
        return this.h;
    }

    public final Priority u() {
        return this.d;
    }

    public final Class<?> v() {
        return this.s;
    }

    public final pzd w() {
        return this.l;
    }

    public final float x() {
        return this.f27738b;
    }

    public final Resources.Theme y() {
        return this.u;
    }

    public final Map<Class<?>, lyp<?>> z() {
        return this.f27740r;
    }
}
