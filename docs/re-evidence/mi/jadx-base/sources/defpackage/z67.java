package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.RestrictTo;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import defpackage.z67;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class z67<T extends z67<T>> implements lc1.b {
    public static final r m = new f(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X);
    public static final r n = new g(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y);
    public static final r o = new h("translationZ");
    public static final r p = new i("scaleX");
    public static final r q = new j("scaleY");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final r f40939r = new k("rotation");
    public static final r s = new l("rotationX");
    public static final r t = new m("rotationY");
    public static final r u = new n("x");
    public static final r v = new a("y");
    public static final r w = new b("z");
    public static final r x = new c(SleepAnalyzerAlpha.NAME_ALPHA);
    public static final r y = new d("scrollX");
    public static final r z = new e("scrollY");
    public final Object d;
    public final dy9 e;
    public float j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f40940a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f40941b = Float.MAX_VALUE;
    public boolean c = false;
    public boolean f = false;
    public float g = Float.MAX_VALUE;
    public float h = -Float.MAX_VALUE;
    public long i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<p> f40942k = new ArrayList<>();
    public final ArrayList<q> l = new ArrayList<>();

    public static class a extends r {
        public a(String str) {
            super(str, null);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setY(f);
        }
    }

    public static class b extends r {
        public b(String str) {
            super(str, null);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return androidx.core.view.c.N(view);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            androidx.core.view.c.Q0(view, f);
        }
    }

    public static class c extends r {
        public c(String str) {
            super(str, null);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setAlpha(f);
        }
    }

    public static class d extends r {
        public d(String str) {
            super(str, null);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    public static class e extends r {
        public e(String str) {
            super(str, null);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    public static class f extends r {
        public f(String str) {
            super(str, null);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    public static class g extends r {
        public g(String str) {
            super(str, null);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    public static class h extends r {
        public h(String str) {
            super(str, null);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return androidx.core.view.c.K(view);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            androidx.core.view.c.P0(view, f);
        }
    }

    public static class i extends r {
        public i(String str) {
            super(str, null);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScaleX(f);
        }
    }

    public static class j extends r {
        public j(String str) {
            super(str, null);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScaleY(f);
        }
    }

    public static class k extends r {
        public k(String str) {
            super(str, null);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setRotation(f);
        }
    }

    public static class l extends r {
        public l(String str) {
            super(str, null);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setRotationX(f);
        }
    }

    public static class m extends r {
        public m(String str) {
            super(str, null);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setRotationY(f);
        }
    }

    public static class n extends r {
        public n(String str) {
            super(str, null);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setX(f);
        }
    }

    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f40943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f40944b;
    }

    public interface p {
        void a(z67 z67Var, boolean z, float f, float f2);
    }

    public interface q {
        void a(z67 z67Var, float f, float f2);
    }

    public static abstract class r extends dy9<View> {
        public /* synthetic */ r(String str, f fVar) {
            this(str);
        }

        public r(String str) {
            super(str);
        }
    }

    public <K> z67(K k2, dy9<K> dy9Var) {
        this.d = k2;
        this.e = dy9Var;
        if (dy9Var == f40939r || dy9Var == s || dy9Var == t) {
            this.j = 0.1f;
            return;
        }
        if (dy9Var == x) {
            this.j = 0.00390625f;
        } else if (dy9Var == p || dy9Var == q) {
            this.j = 0.00390625f;
        } else {
            this.j = 1.0f;
        }
    }

    public static <T> void f(ArrayList<T> arrayList, T t2) {
        int iIndexOf = arrayList.indexOf(t2);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public static <T> void g(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public T a(p pVar) {
        if (!this.f40942k.contains(pVar)) {
            this.f40942k.add(pVar);
        }
        return this;
    }

    public final void b(boolean z2) {
        this.f = false;
        lc1.d().g(this);
        this.i = 0L;
        this.c = false;
        for (int i2 = 0; i2 < this.f40942k.size(); i2++) {
            if (this.f40942k.get(i2) != null) {
                this.f40942k.get(i2).a(this, z2, this.f40941b, this.f40940a);
            }
        }
        g(this.f40942k);
    }

    public final float c() {
        return this.e.a(this.d);
    }

    public float d() {
        return this.j * 0.75f;
    }

    @Override // lc1.b
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean doAnimationFrame(long j2) {
        long j3 = this.i;
        if (j3 == 0) {
            this.i = j2;
            h(this.f40941b);
            return false;
        }
        this.i = j2;
        boolean zL = l(j2 - j3);
        float fMin = Math.min(this.f40941b, this.g);
        this.f40941b = fMin;
        float fMax = Math.max(fMin, this.h);
        this.f40941b = fMax;
        h(fMax);
        if (zL) {
            b(false);
        }
        return zL;
    }

    public boolean e() {
        return this.f;
    }

    public void h(float f2) {
        this.e.b(this.d, f2);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            if (this.l.get(i2) != null) {
                this.l.get(i2).a(this, this.f40941b, this.f40940a);
            }
        }
        g(this.l);
    }

    public T i(float f2) {
        this.f40941b = f2;
        this.c = true;
        return this;
    }

    public void j() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f) {
            return;
        }
        k();
    }

    public final void k() {
        if (this.f) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.f40941b = c();
        }
        float f2 = this.f40941b;
        if (f2 > this.g || f2 < this.h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        lc1.d().a(this, 0L);
    }

    public abstract boolean l(long j2);

    public void removeEndListener(p pVar) {
        f(this.f40942k, pVar);
    }

    public void removeUpdateListener(q qVar) {
        f(this.l, qVar);
    }
}
