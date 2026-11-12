package z23;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends x implements o33.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f202052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Annotation[] f202053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f202054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f202055d;

    public i0(g0 g0Var, Annotation[] annotationArr, String str, boolean z14) {
        g0Var.getClass();
        annotationArr.getClass();
        this.f202052a = g0Var;
        this.f202053b = annotationArr;
        this.f202054c = str;
        this.f202055d = z14;
    }

    @Override // o33.w
    public final boolean a() {
        return this.f202055d;
    }

    @Override // o33.c
    public final Collection getAnnotations() {
        return w5.r.i(this.f202053b);
    }

    @Override // o33.w
    public final x33.f getName() {
        String str = this.f202054c;
        if (str != null) {
            return x33.f.d(str);
        }
        return null;
    }

    @Override // o33.w
    public final o33.t getType() {
        return this.f202052a;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        androidx.core.view.j.o(i0.class, sb3, ": ");
        sb3.append(this.f202055d ? "vararg " : "");
        sb3.append(getName());
        sb3.append(": ");
        sb3.append(this.f202052a);
        return sb3.toString();
    }

    @Override // o33.c
    public final o33.a z(x33.c cVar) {
        cVar.getClass();
        return w5.r.g(this.f202053b, cVar);
    }
}
