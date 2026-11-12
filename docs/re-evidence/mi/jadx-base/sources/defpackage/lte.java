package defpackage;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class lte<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f25417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f25418b;
    public T c;
    public T d;
    public float e;
    public float f;
    public float g;

    public float a() {
        return this.f25418b;
    }

    public T b() {
        return this.d;
    }

    public float c() {
        return this.f;
    }

    public float d() {
        return this.e;
    }

    public float e() {
        return this.g;
    }

    public float f() {
        return this.f25417a;
    }

    public T g() {
        return this.c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public lte<T> h(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        this.f25417a = f;
        this.f25418b = f2;
        this.c = t;
        this.d = t2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        return this;
    }
}
