package qk0;

import am.x0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqk0/t;", "", "Li53/e;", "Lam/x0;", "allPendingActivityTypes", "Li53/c;", "Lmk0/a;", "conflicts", "<init>", "(Li53/e;Li53/c;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.e<x0> f145155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<mk0.a> f145156b;

    /* JADX WARN: Multi-variable type inference failed */
    public t(i53.e<? extends x0> eVar, i53.c<mk0.a> cVar) {
        eVar.getClass();
        cVar.getClass();
        this.f145155a = eVar;
        this.f145156b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f145155a.equals(tVar.f145155a) && this.f145156b.equals(tVar.f145156b);
    }

    public final int hashCode() {
        return this.f145156b.hashCode() + (this.f145155a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingConflictSelection(allPendingActivityTypes=" + this.f145155a + ", conflicts=" + this.f145156b + ")";
    }
}
