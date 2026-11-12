package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public class f08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f17254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f17255b;
    public float c;
    public float d;

    public f08(float f, float f2, float f3, float f4) {
        this.f17254a = f;
        this.f17255b = f2;
        this.c = f3;
        this.d = f4;
    }

    public boolean a(f08 f08Var) {
        if (this == f08Var) {
            return true;
        }
        return this.f17254a == f08Var.f17254a && this.f17255b == f08Var.f17255b && this.c == f08Var.c && this.d == f08Var.d;
    }
}
