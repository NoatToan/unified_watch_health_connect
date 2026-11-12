package defpackage;

import android.util.AndroidRuntimeException;
import android.view.View;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import defpackage.a77;
import java.util.ArrayList;
import miuix.animation.internal.FolmeCore;
import miuix.animation.internal.FolmeEngine;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a77<T extends a77<T>> implements mc1.d {
    public final cy9 e;
    public static final s n = new g(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X);
    public static final s o = new h(EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y);
    public static final s p = new i("translationZ");
    public static final s q = new j("scaleX");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f704r = new k("scaleY");
    public static final s s = new l("rotation");
    public static final s t = new m("rotationX");
    public static final s u = new n("rotationY");
    public static final s v = new o("x");
    public static final s w = new b("y");
    public static final s x = new c("z");
    public static final s y = new d(SleepAnalyzerAlpha.NAME_ALPHA);
    public static final s z = new e("scrollX");
    public static final s A = new f("scrollY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f705a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f706b = Float.MAX_VALUE;
    public boolean c = false;
    public boolean f = false;
    public float g = Float.MAX_VALUE;
    public float h = -Float.MAX_VALUE;
    public long i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f707k = 0;
    public final ArrayList<q> l = new ArrayList<>();
    public final ArrayList<r> m = new ArrayList<>();
    public final Object d = null;
    public float j = 1.0f;

    public class a extends cy9 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fy9 f708b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, fy9 fy9Var) {
            super(str);
            this.f708b = fy9Var;
        }

        @Override // defpackage.cy9
        public float a(Object obj) {
            return this.f708b.a();
        }

        @Override // defpackage.cy9
        public void b(Object obj, float f) {
            this.f708b.b(f);
        }
    }

    public class b extends s {
        public b(String str) {
            super(str, null);
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setY(f);
        }
    }

    public class c extends s {
        public c(String str) {
            super(str, null);
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getZ();
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setZ(f);
        }
    }

    public class d extends s {
        public d(String str) {
            super(str, null);
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setAlpha(f);
        }
    }

    public class e extends s {
        public e(String str) {
            super(str, null);
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    public class f extends s {
        public f(String str) {
            super(str, null);
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    public class g extends s {
        public g(String str) {
            super(str, null);
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    public class h extends s {
        public h(String str) {
            super(str, null);
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    public class i extends s {
        public i(String str) {
            super(str, null);
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationZ();
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setTranslationZ(f);
        }
    }

    public class j extends s {
        public j(String str) {
            super(str, null);
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScaleX(f);
        }
    }

    public class k extends s {
        public k(String str) {
            super(str, null);
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScaleY(f);
        }
    }

    public class l extends s {
        public l(String str) {
            super(str, null);
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setRotation(f);
        }
    }

    public class m extends s {
        public m(String str) {
            super(str, null);
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setRotationX(f);
        }
    }

    public class n extends s {
        public n(String str) {
            super(str, null);
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setRotationY(f);
        }
    }

    public class o extends s {
        public o(String str) {
            super(str, null);
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // defpackage.cy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setX(f);
        }
    }

    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f710b;
    }

    public interface q {
        void a(a77 a77Var, boolean z, float f, float f2);
    }

    public interface r {
        void a(a77 a77Var, float f, float f2);
    }

    public static abstract class s extends cy9<View> {
        public /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        public s(String str) {
            super(str);
        }
    }

    public a77(fy9 fy9Var) {
        this.e = new a("FloatValueHolder", fy9Var);
    }

    public static <T> void h(ArrayList<T> arrayList, T t2) {
        int iIndexOf = arrayList.indexOf(t2);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public static <T> void i(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public T a(r rVar) {
        if (g()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe miuix.animation.");
        }
        if (!this.m.contains(rVar)) {
            this.m.add(rVar);
        }
        return this;
    }

    public void b() {
        if (!d().l()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.f) {
            c(true);
        }
    }

    public final void c(boolean z2) {
        this.f = false;
        mc1.i().n(this);
        this.i = 0L;
        this.c = false;
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            if (this.l.get(i2) != null) {
                this.l.get(i2).a(this, z2, this.f706b, this.f705a);
            }
        }
        i(this.l);
    }

    public mc1 d() {
        return mc1.i();
    }

    @Override // mc1.d
    public boolean doAnimationFrame(long j2) {
        long jG = mc1.i().g();
        boolean zH = mc1.i().h();
        long j3 = this.i;
        if (j3 == 0) {
            this.i = j2;
            m(this.f706b);
            return false;
        }
        if (jG == 0) {
            jG = j2 - j3;
        }
        long jMin = (!zH || jG == 0) ? Math.min(jG, FolmeEngine.MAX_DELTA) : Math.min(jG, FolmeCore.NANOS_TO_S);
        this.i = j2;
        boolean zS = s(jMin);
        float fMin = Math.min(this.f706b, this.g);
        this.f706b = fMin;
        float fMax = Math.max(fMin, this.h);
        this.f706b = fMax;
        m(fMax);
        if (zS) {
            c(false);
        }
        return zS;
    }

    public final float e() {
        return this.e.a(this.d);
    }

    public float f() {
        return this.j * 0.75f;
    }

    public boolean g() {
        return this.f;
    }

    public T j(float f2) {
        this.g = f2;
        return this;
    }

    public T k(float f2) {
        this.h = f2;
        return this;
    }

    public T l(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.j = f2;
        p(f2 * 0.75f);
        return this;
    }

    public void m(float f2) {
        this.e.b(this.d, f2);
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            if (this.m.get(i2) != null) {
                this.m.get(i2).a(this, this.f706b, this.f705a);
            }
        }
        i(this.m);
    }

    public T n(float f2) {
        this.f706b = f2;
        this.c = true;
        return this;
    }

    public T o(float f2) {
        this.f705a = f2;
        return this;
    }

    public abstract void p(float f2);

    public void q(boolean z2) {
        if (!d().l()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f) {
            return;
        }
        r(z2);
    }

    public final void r(boolean z2) {
        if (this.f) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.f706b = e();
        }
        float f2 = this.f706b;
        if (f2 > this.g || f2 < this.h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        if (z2) {
            return;
        }
        mc1.i().d(this, this.f707k);
    }

    public void removeEndListener(q qVar) {
        h(this.l, qVar);
    }

    public void removeUpdateListener(r rVar) {
        h(this.m, rVar);
    }

    public abstract boolean s(long j2);
}
