package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class pqc implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30642b;

    public pqc(Object obj) {
        this.f30642b = System.identityHashCode(obj);
        this.f30641a = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof pqc)) {
            return false;
        }
        pqc pqcVar = (pqc) obj;
        return this.f30642b == pqcVar.f30642b && this.f30641a == pqcVar.f30641a;
    }

    public int hashCode() {
        return this.f30642b;
    }
}
