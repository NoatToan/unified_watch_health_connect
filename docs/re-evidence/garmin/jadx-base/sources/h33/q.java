package h33;

import ch.qos.logback.core.CoreConstants;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p33.n f81486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection<c> f81487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f81489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f81490e;

    public q(p33.n nVar, Collection collection, boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this(nVar, collection, (i14 & 4) != 0 ? nVar.f135480a == p33.m.NOT_NULL : z14, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? false : z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f81486a, qVar.f81486a) && p005kotlin.jvm.internal.s.g(this.f81487b, qVar.f81487b) && this.f81488c == qVar.f81488c && this.f81489d == qVar.f81489d && this.f81490e == qVar.f81490e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f81490e) + q6.f.g(q6.f.g((this.f81487b.hashCode() + (this.f81486a.hashCode() * 31)) * 31, 31, this.f81488c), 31, this.f81489d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb3.append(this.f81486a);
        sb3.append(", qualifierApplicabilityTypes=");
        sb3.append(this.f81487b);
        sb3.append(", definitelyNotNull=");
        sb3.append(this.f81488c);
        sb3.append(", preferQualifierOverBound=");
        sb3.append(this.f81489d);
        sb3.append(", preferQualifierOverSupertype=");
        return am.j.t(sb3, this.f81490e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(p33.n nVar, Collection<? extends c> collection, boolean z14, boolean z15, boolean z16) {
        nVar.getClass();
        collection.getClass();
        this.f81486a = nVar;
        this.f81487b = collection;
        this.f81488c = z14;
        this.f81489d = z15;
        this.f81490e = z16;
    }
}
