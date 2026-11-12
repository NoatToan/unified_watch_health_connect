package z23;

import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends g0 implements o33.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f202039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p13.j0 f202040c;

    public e0(Class<?> cls) {
        cls.getClass();
        this.f202039b = cls;
        this.f202040c = p13.j0.f134944a;
    }

    @Override // z23.g0
    public final Type H() {
        return this.f202039b;
    }

    public final q23.h I() {
        Class cls = Void.TYPE;
        Class<?> cls2 = this.f202039b;
        if (p005kotlin.jvm.internal.s.g(cls2, cls)) {
            return null;
        }
        return g43.d.b(cls2.getName()).d();
    }

    @Override // o33.c
    public final Collection<o33.a> getAnnotations() {
        return this.f202040c;
    }
}
