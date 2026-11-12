package dy1;

import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldy1/u;", "", "Li53/c;", "Ldy1/h;", "exercises", "<init>", "(Li53/c;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<h> f61639a;

    public u(i53.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j53.l.b() : cVar);
    }

    public final String a() {
        return h0.k0(this.f61639a, null, null, null, new dv0.n(3), 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && p005kotlin.jvm.internal.s.g(this.f61639a, ((u) obj).f61639a);
    }

    public final int hashCode() {
        return this.f61639a.hashCode();
    }

    public final String toString() {
        return "WorkoutStepExercisesState(exercises=" + this.f61639a + ")";
    }

    public u(i53.c<h> cVar) {
        cVar.getClass();
        this.f61639a = cVar;
    }

    public u() {
        this(null, 1, null);
    }
}
