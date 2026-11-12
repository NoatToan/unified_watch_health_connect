package r1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lr1/r2;", "", "Lo4/d0;", "initialColor", "targetColor", "Ls1/f0;", "animationSpec", "", "matchParentSize", "<init>", "(JJLs1/f0;ZLkotlin/jvm/internal/j;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f149222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f149223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1.f0<o4.d0> f149224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f149225d;

    private r2(long j8, long j14, s1.f0<o4.d0> f0Var, boolean z14) {
        this.f149222a = j8;
        this.f149223b = j14;
        this.f149224c = f0Var;
        this.f149225d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return o4.d0.d(this.f149222a, r2Var.f149222a) && o4.d0.d(this.f149223b, r2Var.f149223b) && p005kotlin.jvm.internal.s.g(this.f149224c, r2Var.f149224c) && this.f149225d == r2Var.f149225d;
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Boolean.hashCode(this.f149225d) + ((this.f149224c.hashCode() + q6.f.e(Long.hashCode(this.f149222a) * 31, 31, this.f149223b)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Veil(initialColor=");
        q2.m(this.f149222a, ", targetColor=", sb3);
        q2.m(this.f149223b, ", animationSpec=", sb3);
        sb3.append(this.f149224c);
        sb3.append(", matchParentSize=");
        return am.j.t(sb3, this.f149225d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ r2(long j8, long j14, s1.f0 f0Var, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, f0Var, z14);
    }
}
