package defpackage;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class yte<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lte<T> f40516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o82<?, ?> f40517b;
    public T c;

    public yte() {
        this.f40516a = new lte<>();
        this.c = null;
    }

    public T a(lte<T> lteVar) {
        return this.c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final T b(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return a(this.f40516a.h(f, f2, t, t2, f3, f4, f5));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void c(o82<?, ?> o82Var) {
        this.f40517b = o82Var;
    }

    public yte(T t) {
        this.f40516a = new lte<>();
        this.c = t;
    }
}
