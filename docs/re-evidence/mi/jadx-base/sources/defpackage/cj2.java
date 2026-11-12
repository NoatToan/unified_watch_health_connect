package defpackage;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class cj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bj2 f5391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cp2 f5392b;

    public cj2(bj2 bj2Var) {
        if (bj2Var == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f5391a = bj2Var;
    }

    public cp2 a() throws NotFoundException {
        if (this.f5392b == null) {
            this.f5392b = this.f5391a.b();
        }
        return this.f5392b;
    }

    public zo2 b(int i, zo2 zo2Var) throws NotFoundException {
        return this.f5391a.c(i, zo2Var);
    }

    public int c() {
        return this.f5391a.d();
    }

    public int d() {
        return this.f5391a.f();
    }

    public boolean e() {
        return this.f5391a.e().f();
    }

    public cj2 f() {
        return new cj2(this.f5391a.a(this.f5391a.e().g()));
    }

    public String toString() {
        try {
            return a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
