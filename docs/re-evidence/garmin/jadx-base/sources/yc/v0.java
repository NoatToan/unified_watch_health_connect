package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class v0 implements x.d, p005kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0<Object, Object> f196532a;

    public v0(u0<Object, Object> u0Var) {
        this.f196532a = u0Var;
    }

    @Override // yc.x.d
    public final void a() {
        this.f196532a.d();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof x.d) && (obj instanceof p005kotlin.jvm.internal.n)) {
            return getFunctionDelegate().equals(((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p005kotlin.jvm.internal.n
    public final o13.h<?> getFunctionDelegate() {
        return new p005kotlin.jvm.internal.q(0, this.f196532a, u0.class, "invalidate", "invalidate()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
