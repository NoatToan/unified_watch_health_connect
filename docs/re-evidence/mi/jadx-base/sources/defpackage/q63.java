package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class q63<F, T> extends ich<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dua<F, ? extends T> f31158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ich<T> f31159b;

    public q63(dua<F, ? extends T> duaVar, ich<T> ichVar) {
        this.f31158a = (dua) c6i.o(duaVar);
        this.f31159b = (ich) c6i.o(ichVar);
    }

    @Override // defpackage.ich, java.util.Comparator
    public int compare(F f, F f2) {
        return this.f31159b.compare(this.f31158a.apply(f), this.f31158a.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q63)) {
            return false;
        }
        q63 q63Var = (q63) obj;
        return this.f31158a.equals(q63Var.f31158a) && this.f31159b.equals(q63Var.f31159b);
    }

    public int hashCode() {
        return j4h.b(this.f31158a, this.f31159b);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f31159b);
        String strValueOf2 = String.valueOf(this.f31158a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(".onResultOf(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
