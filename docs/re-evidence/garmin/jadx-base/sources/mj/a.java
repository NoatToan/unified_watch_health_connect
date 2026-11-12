package mj;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import dj.o;
import mj.a;
import qj.l;
import qj.m;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T extends a<T>> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118994a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f118998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f118999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f119000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f119001h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f119006m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f119011r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Resources.Theme f119012t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f119013v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f119015x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f118995b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wi.j f118996c = wi.j.f185367d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.g f118997d = com.bumptech.glide.g.NORMAL;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f119002i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f119003j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f119004k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ui.e f119005l = pj.c.f137873b;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f119007n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ui.h f119008o = new ui.h();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public qj.b f119009p = new qj.b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Class<?> f119010q = Object.class;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f119014w = true;

    public static boolean h(int i14, int i15) {
        return (i14 & i15) != 0;
    }

    public T a(a<?> aVar) {
        if (this.f119013v) {
            return (T) clone().a(aVar);
        }
        if (h(aVar.f118994a, 2)) {
            this.f118995b = aVar.f118995b;
        }
        if (h(aVar.f118994a, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)) {
            this.f119015x = aVar.f119015x;
        }
        if (h(aVar.f118994a, 4)) {
            this.f118996c = aVar.f118996c;
        }
        if (h(aVar.f118994a, 8)) {
            this.f118997d = aVar.f118997d;
        }
        if (h(aVar.f118994a, 16)) {
            this.f118998e = aVar.f118998e;
            this.f118999f = 0;
            this.f118994a &= -33;
        }
        if (h(aVar.f118994a, 32)) {
            this.f118999f = aVar.f118999f;
            this.f118998e = null;
            this.f118994a &= -17;
        }
        if (h(aVar.f118994a, 64)) {
            this.f119000g = aVar.f119000g;
            this.f119001h = 0;
            this.f118994a &= -129;
        }
        if (h(aVar.f118994a, 128)) {
            this.f119001h = aVar.f119001h;
            this.f119000g = null;
            this.f118994a &= -65;
        }
        if (h(aVar.f118994a, 256)) {
            this.f119002i = aVar.f119002i;
        }
        if (h(aVar.f118994a, 512)) {
            this.f119004k = aVar.f119004k;
            this.f119003j = aVar.f119003j;
        }
        if (h(aVar.f118994a, 1024)) {
            this.f119005l = aVar.f119005l;
        }
        if (h(aVar.f118994a, 4096)) {
            this.f119010q = aVar.f119010q;
        }
        if (h(aVar.f118994a, 8192)) {
            this.f118994a &= -16385;
        }
        if (h(aVar.f118994a, 16384)) {
            this.f118994a &= -8193;
        }
        if (h(aVar.f118994a, 32768)) {
            this.f119012t = aVar.f119012t;
        }
        if (h(aVar.f118994a, 65536)) {
            this.f119007n = aVar.f119007n;
        }
        if (h(aVar.f118994a, 131072)) {
            this.f119006m = aVar.f119006m;
        }
        if (h(aVar.f118994a, 2048)) {
            this.f119009p.putAll(aVar.f119009p);
            this.f119014w = aVar.f119014w;
        }
        if (!this.f119007n) {
            this.f119009p.clear();
            int i14 = this.f118994a;
            this.f119006m = false;
            this.f118994a = i14 & (-133121);
            this.f119014w = true;
        }
        this.f118994a |= aVar.f118994a;
        this.f119008o.f171173b.h(aVar.f119008o.f171173b);
        o();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: b */
    public T clone() {
        try {
            T t7 = (T) super.clone();
            ui.h hVar = new ui.h();
            t7.f119008o = hVar;
            hVar.f171173b.h(this.f119008o.f171173b);
            qj.b bVar = new qj.b();
            t7.f119009p = bVar;
            bVar.putAll(this.f119009p);
            t7.f119011r = false;
            t7.f119013v = false;
            return t7;
        } catch (CloneNotSupportedException e4) {
            o2.c.p(e4);
            return null;
        }
    }

    public final T c(Class<?> cls) {
        if (this.f119013v) {
            return (T) clone().c(cls);
        }
        this.f119010q = cls;
        this.f118994a |= 4096;
        o();
        return this;
    }

    public final T d(wi.j jVar) {
        if (this.f119013v) {
            return (T) clone().d(jVar);
        }
        l.c(jVar, "Argument must not be null");
        this.f118996c = jVar;
        this.f118994a |= 4;
        o();
        return this;
    }

    public final T e(int i14) {
        if (this.f119013v) {
            return (T) clone().e(i14);
        }
        this.f118999f = i14;
        int i15 = this.f118994a | 32;
        this.f118998e = null;
        this.f118994a = i15 & (-17);
        o();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return g((a) obj);
        }
        return false;
    }

    public final T f(Drawable drawable) {
        if (this.f119013v) {
            return (T) clone().f(drawable);
        }
        this.f118998e = drawable;
        int i14 = this.f118994a | 16;
        this.f118999f = 0;
        this.f118994a = i14 & (-33);
        o();
        return this;
    }

    public final boolean g(a<?> aVar) {
        return Float.compare(aVar.f118995b, this.f118995b) == 0 && this.f118999f == aVar.f118999f && m.b(this.f118998e, aVar.f118998e) && this.f119001h == aVar.f119001h && m.b(this.f119000g, aVar.f119000g) && this.f119002i == aVar.f119002i && this.f119003j == aVar.f119003j && this.f119004k == aVar.f119004k && this.f119006m == aVar.f119006m && this.f119007n == aVar.f119007n && this.f118996c.equals(aVar.f118996c) && this.f118997d == aVar.f118997d && this.f119008o.equals(aVar.f119008o) && this.f119009p.equals(aVar.f119009p) && this.f119010q.equals(aVar.f119010q) && m.b(this.f119005l, aVar.f119005l) && m.b(this.f119012t, aVar.f119012t);
    }

    public int hashCode() {
        float f14 = this.f118995b;
        char[] cArr = m.f144982a;
        return m.h(m.h(m.h(m.h(m.h(m.h(m.h(m.g(0, m.g(0, m.g(this.f119007n ? 1 : 0, m.g(this.f119006m ? 1 : 0, m.g(this.f119004k, m.g(this.f119003j, m.g(this.f119002i ? 1 : 0, m.h(m.g(0, m.h(m.g(this.f119001h, m.h(m.g(this.f118999f, m.g(Float.floatToIntBits(f14), 17)), this.f118998e)), this.f119000g)), null)))))))), this.f118996c), this.f118997d), this.f119008o), this.f119009p), this.f119010q), this.f119005l), this.f119012t);
    }

    public final a i(dj.l lVar, dj.f fVar) {
        if (this.f119013v) {
            return clone().i(lVar, fVar);
        }
        ui.g gVar = dj.l.f59842f;
        l.c(lVar, "Argument must not be null");
        p(gVar, lVar);
        return w(fVar, false);
    }

    public final T j(int i14, int i15) {
        if (this.f119013v) {
            return (T) clone().j(i14, i15);
        }
        this.f119004k = i14;
        this.f119003j = i15;
        this.f118994a |= 512;
        o();
        return this;
    }

    public final T k(int i14) {
        if (this.f119013v) {
            return (T) clone().k(i14);
        }
        this.f119001h = i14;
        int i15 = this.f118994a | 128;
        this.f119000g = null;
        this.f118994a = i15 & (-65);
        o();
        return this;
    }

    public final T l(Drawable drawable) {
        if (this.f119013v) {
            return (T) clone().l(drawable);
        }
        this.f119000g = drawable;
        int i14 = this.f118994a | 64;
        this.f119001h = 0;
        this.f118994a = i14 & (-129);
        o();
        return this;
    }

    public final T m(com.bumptech.glide.g gVar) {
        if (this.f119013v) {
            return (T) clone().m(gVar);
        }
        l.c(gVar, "Argument must not be null");
        this.f118997d = gVar;
        this.f118994a |= 8;
        o();
        return this;
    }

    public final T n(ui.g<?> gVar) {
        if (this.f119013v) {
            return (T) clone().n(gVar);
        }
        this.f119008o.f171173b.remove(gVar);
        o();
        return this;
    }

    public final void o() {
        if (this.f119011r) {
            vb.h.z("You cannot modify locked T, consider clone()");
        }
    }

    public final <Y> T p(ui.g<Y> gVar, Y y14) {
        if (this.f119013v) {
            return (T) clone().p(gVar, y14);
        }
        l.b(gVar);
        l.b(y14);
        this.f119008o.f171173b.put(gVar, y14);
        o();
        return this;
    }

    public final T q(ui.e eVar) {
        if (this.f119013v) {
            return (T) clone().q(eVar);
        }
        this.f119005l = eVar;
        this.f118994a |= 1024;
        o();
        return this;
    }

    public final T r(float f14) {
        if (this.f119013v) {
            return (T) clone().r(f14);
        }
        if (f14 < 0.0f || f14 > 1.0f) {
            vb.h.s("sizeMultiplier must be between 0 and 1");
            return null;
        }
        this.f118995b = f14;
        this.f118994a |= 2;
        o();
        return this;
    }

    public final T s(boolean z14) {
        if (this.f119013v) {
            return (T) clone().s(true);
        }
        this.f119002i = !z14;
        this.f118994a |= 256;
        o();
        return this;
    }

    public final T t(Resources.Theme theme) {
        if (this.f119013v) {
            return (T) clone().t(theme);
        }
        this.f119012t = theme;
        int i14 = this.f118994a;
        if (theme != null) {
            this.f118994a = i14 | 32768;
            return (T) p(fj.e.f71824b, theme);
        }
        this.f118994a = (-32769) & i14;
        return (T) n(fj.e.f71824b);
    }

    public final a u(dj.l lVar, dj.i iVar) {
        if (this.f119013v) {
            return clone().u(lVar, iVar);
        }
        ui.g gVar = dj.l.f59842f;
        l.c(lVar, "Argument must not be null");
        p(gVar, lVar);
        return w(iVar, true);
    }

    public final <Y> T v(Class<Y> cls, ui.l<Y> lVar, boolean z14) {
        if (this.f119013v) {
            return (T) clone().v(cls, lVar, z14);
        }
        l.b(lVar);
        this.f119009p.put(cls, lVar);
        int i14 = this.f118994a;
        this.f119007n = true;
        this.f118994a = 67584 | i14;
        this.f119014w = false;
        if (z14) {
            this.f118994a = i14 | 198656;
            this.f119006m = true;
        }
        o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T w(ui.l<Bitmap> lVar, boolean z14) {
        if (this.f119013v) {
            return (T) clone().w(lVar, z14);
        }
        o oVar = new o(lVar, z14);
        v(Bitmap.class, lVar, z14);
        v(Drawable.class, oVar, z14);
        v(BitmapDrawable.class, oVar, z14);
        v(hj.c.class, new hj.f(lVar), z14);
        o();
        return this;
    }

    public final a x() {
        if (this.f119013v) {
            return clone().x();
        }
        this.f119015x = true;
        this.f118994a |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        o();
        return this;
    }
}
