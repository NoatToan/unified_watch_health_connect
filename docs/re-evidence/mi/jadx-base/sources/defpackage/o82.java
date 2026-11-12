package defpackage;

import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class o82<K, A> {
    public final d<K> c;
    public yte<A> e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f28842a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28843b = false;
    public float d = 0.0f;
    public A f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public interface b {
        void e();
    }

    public static final class c<T> implements d<T> {
        public c() {
        }

        @Override // o82.d
        public e1e<T> a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // o82.d
        public float b() {
            return 0.0f;
        }

        @Override // o82.d
        public boolean c(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // o82.d
        public boolean d(float f) {
            return false;
        }

        @Override // o82.d
        public float e() {
            return 1.0f;
        }

        @Override // o82.d
        public boolean isEmpty() {
            return true;
        }
    }

    public interface d<T> {
        e1e<T> a();

        @FloatRange(from = 0.0d, to = 1.0d)
        float b();

        boolean c(float f);

        boolean d(float f);

        @FloatRange(from = 0.0d, to = 1.0d)
        float e();

        boolean isEmpty();
    }

    public static final class e<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<? extends e1e<T>> f28844a;
        public e1e<T> c = null;
        public float d = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e1e<T> f28845b = f(0.0f);

        public e(List<? extends e1e<T>> list) {
            this.f28844a = list;
        }

        @Override // o82.d
        public e1e<T> a() {
            return this.f28845b;
        }

        @Override // o82.d
        public float b() {
            return this.f28844a.get(0).f();
        }

        @Override // o82.d
        public boolean c(float f) {
            e1e<T> e1eVar = this.c;
            e1e<T> e1eVar2 = this.f28845b;
            if (e1eVar == e1eVar2 && this.d == f) {
                return true;
            }
            this.c = e1eVar2;
            this.d = f;
            return false;
        }

        @Override // o82.d
        public boolean d(float f) {
            if (this.f28845b.a(f)) {
                return !this.f28845b.i();
            }
            this.f28845b = f(f);
            return true;
        }

        @Override // o82.d
        public float e() {
            List<? extends e1e<T>> list = this.f28844a;
            return list.get(list.size() - 1).c();
        }

        public final e1e<T> f(float f) {
            List<? extends e1e<T>> list = this.f28844a;
            e1e<T> e1eVar = list.get(list.size() - 1);
            if (f >= e1eVar.f()) {
                return e1eVar;
            }
            for (int size = this.f28844a.size() - 2; size >= 1; size--) {
                e1e<T> e1eVar2 = this.f28844a.get(size);
                if (this.f28845b != e1eVar2 && e1eVar2.a(f)) {
                    return e1eVar2;
                }
            }
            return this.f28844a.get(0);
        }

        @Override // o82.d
        public boolean isEmpty() {
            return false;
        }
    }

    public static final class f<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e1e<T> f28846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f28847b = -1.0f;

        public f(List<? extends e1e<T>> list) {
            this.f28846a = list.get(0);
        }

        @Override // o82.d
        public e1e<T> a() {
            return this.f28846a;
        }

        @Override // o82.d
        public float b() {
            return this.f28846a.f();
        }

        @Override // o82.d
        public boolean c(float f) {
            if (this.f28847b == f) {
                return true;
            }
            this.f28847b = f;
            return false;
        }

        @Override // o82.d
        public boolean d(float f) {
            return !this.f28846a.i();
        }

        @Override // o82.d
        public float e() {
            return this.f28846a.c();
        }

        @Override // o82.d
        public boolean isEmpty() {
            return false;
        }
    }

    public o82(List<? extends e1e<K>> list) {
        this.c = o(list);
    }

    public static <T> d<T> o(List<? extends e1e<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        return list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f28842a.add(bVar);
    }

    public e1e<K> b() {
        w1e.a("BaseKeyframeAnimation#getCurrentKeyframe");
        e1e<K> e1eVarA = this.c.a();
        w1e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return e1eVarA;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float c() {
        if (this.h == -1.0f) {
            this.h = this.c.e();
        }
        return this.h;
    }

    public float d() {
        e1e<K> e1eVarB = b();
        if (e1eVarB == null || e1eVarB.i()) {
            return 0.0f;
        }
        return e1eVarB.d.getInterpolation(e());
    }

    public float e() {
        if (this.f28843b) {
            return 0.0f;
        }
        e1e<K> e1eVarB = b();
        if (e1eVarB.i()) {
            return 0.0f;
        }
        return (this.d - e1eVarB.f()) / (e1eVarB.c() - e1eVarB.f());
    }

    public float f() {
        return this.d;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float g() {
        if (this.g == -1.0f) {
            this.g = this.c.b();
        }
        return this.g;
    }

    public A h() {
        float fE = e();
        if (this.e == null && this.c.c(fE)) {
            return this.f;
        }
        e1e<K> e1eVarB = b();
        Interpolator interpolator = e1eVarB.e;
        A aI = (interpolator == null || e1eVarB.f == null) ? i(e1eVarB, d()) : j(e1eVarB, fE, interpolator.getInterpolation(fE), e1eVarB.f.getInterpolation(fE));
        this.f = aI;
        return aI;
    }

    public abstract A i(e1e<K> e1eVar, float f2);

    public A j(e1e<K> e1eVar, float f2, float f3, float f4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        for (int i = 0; i < this.f28842a.size(); i++) {
            this.f28842a.get(i).e();
        }
    }

    public void l() {
        this.f28843b = true;
    }

    public void m(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        if (this.c.isEmpty()) {
            return;
        }
        if (f2 < g()) {
            f2 = g();
        } else if (f2 > c()) {
            f2 = c();
        }
        if (f2 == this.d) {
            return;
        }
        this.d = f2;
        if (this.c.d(f2)) {
            k();
        }
    }

    public void n(yte<A> yteVar) {
        yte<A> yteVar2 = this.e;
        if (yteVar2 != null) {
            yteVar2.c(null);
        }
        this.e = yteVar;
        if (yteVar != null) {
            yteVar.c(this);
        }
    }
}
