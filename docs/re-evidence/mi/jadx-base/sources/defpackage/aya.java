package defpackage;

import android.R;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.generic.RoundingParams;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class aya {
    public static final rbl.b t = rbl.b.f;
    public static final rbl.b u = rbl.b.g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Resources f3567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3568b;
    public float c;
    public Drawable d;
    public rbl.b e;
    public Drawable f;
    public rbl.b g;
    public Drawable h;
    public rbl.b i;
    public Drawable j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public rbl.b f3569k;
    public rbl.b l;
    public Matrix m;
    public PointF n;
    public ColorFilter o;
    public Drawable p;
    public List<Drawable> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f3570r;
    public RoundingParams s;

    public aya(Resources resources) {
        this.f3567a = resources;
        t();
    }

    public static aya u(Resources resources) {
        return new aya(resources);
    }

    public aya A(rbl.b bVar) {
        this.i = bVar;
        return this;
    }

    public aya B(Drawable drawable) {
        if (drawable == null) {
            this.q = null;
        } else {
            this.q = Arrays.asList(drawable);
        }
        return this;
    }

    public aya C(Drawable drawable) {
        this.d = drawable;
        return this;
    }

    public aya D(rbl.b bVar) {
        this.e = bVar;
        return this;
    }

    public aya E(Drawable drawable) {
        if (drawable == null) {
            this.f3570r = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
            this.f3570r = stateListDrawable;
        }
        return this;
    }

    public aya F(Drawable drawable) {
        this.j = drawable;
        return this;
    }

    public aya G(rbl.b bVar) {
        this.f3569k = bVar;
        return this;
    }

    public aya H(Drawable drawable) {
        this.f = drawable;
        return this;
    }

    public aya I(rbl.b bVar) {
        this.g = bVar;
        return this;
    }

    public aya J(RoundingParams roundingParams) {
        this.s = roundingParams;
        return this;
    }

    public final void K() {
        List<Drawable> list = this.q;
        if (list != null) {
            Iterator<Drawable> it = list.iterator();
            while (it.hasNext()) {
                b6i.g(it.next());
            }
        }
    }

    public zxa a() {
        K();
        return new zxa(this);
    }

    public ColorFilter b() {
        return this.o;
    }

    public PointF c() {
        return this.n;
    }

    public rbl.b d() {
        return this.l;
    }

    public Drawable e() {
        return this.p;
    }

    public float f() {
        return this.c;
    }

    public int g() {
        return this.f3568b;
    }

    public Drawable h() {
        return this.h;
    }

    public rbl.b i() {
        return this.i;
    }

    public List<Drawable> j() {
        return this.q;
    }

    public Drawable k() {
        return this.d;
    }

    public rbl.b l() {
        return this.e;
    }

    public Drawable m() {
        return this.f3570r;
    }

    public Drawable n() {
        return this.j;
    }

    public rbl.b o() {
        return this.f3569k;
    }

    public Resources p() {
        return this.f3567a;
    }

    public Drawable q() {
        return this.f;
    }

    public rbl.b r() {
        return this.g;
    }

    public RoundingParams s() {
        return this.s;
    }

    public final void t() {
        this.f3568b = 300;
        this.c = 0.0f;
        this.d = null;
        rbl.b bVar = t;
        this.e = bVar;
        this.f = null;
        this.g = bVar;
        this.h = null;
        this.i = bVar;
        this.j = null;
        this.f3569k = bVar;
        this.l = u;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.f3570r = null;
        this.s = null;
    }

    public aya v(rbl.b bVar) {
        this.l = bVar;
        this.m = null;
        return this;
    }

    public aya w(Drawable drawable) {
        this.p = drawable;
        return this;
    }

    public aya x(float f) {
        this.c = f;
        return this;
    }

    public aya y(int i) {
        this.f3568b = i;
        return this;
    }

    public aya z(Drawable drawable) {
        this.h = drawable;
        return this;
    }
}
