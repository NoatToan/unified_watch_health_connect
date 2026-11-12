package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ci5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f5364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5365b;

    public ci5(byte[] bArr, int i) {
        this.f5364a = bArr;
        this.f5365b = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ci5)) {
            return false;
        }
        ci5 ci5Var = (ci5) obj;
        if (ci5Var.f5365b != this.f5365b) {
            return false;
        }
        return vj1.a(this.f5364a, ci5Var.f5364a);
    }

    public int hashCode() {
        return this.f5365b ^ vj1.q(this.f5364a);
    }
}
