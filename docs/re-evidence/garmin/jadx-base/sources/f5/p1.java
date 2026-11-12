package f5;

import kotlin.v3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf5/p1;", "Lh5/x0;", "Lf5/q1;", "", "minDurationMs", "", "minFractionVisible", "Lf5/b0;", "viewportBounds", "Lkotlin/Function1;", "", "", "callback", "<init>", "(JFLf5/b0;Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p1 extends h5.x0<q1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f69017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f69018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f69019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<Boolean, Unit> f69020d;

    /* JADX WARN: Multi-variable type inference failed */
    public p1(long j8, float f14, b0 b0Var, e23.l<? super Boolean, Unit> lVar) {
        this.f69017a = j8;
        this.f69018b = f14;
        this.f69019c = b0Var;
        this.f69020d = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new q1(this.f69017a, this.f69018b, this.f69019c, this.f69020d);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p1.class == obj.getClass()) {
            p1 p1Var = (p1) obj;
            return this.f69017a == p1Var.f69017a && this.f69018b == p1Var.f69018b && p005kotlin.jvm.internal.s.g(this.f69019c, p1Var.f69019c) && this.f69020d == p1Var.f69020d;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        int iD = q6.f.d(this.f69018b, Long.hashCode(this.f69017a) * 31, 31);
        b0 b0Var = this.f69019c;
        return this.f69020d.hashCode() + ((iD + (b0Var != null ? b0Var.hashCode() : 0)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "onViewportVisibilityChanged";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(Long.valueOf(this.f69017a), "minDurationMs");
        v3Var.c(Float.valueOf(this.f69018b), "minFractionVisible");
        v3Var.c(this.f69019c, "viewportRef");
        v3Var.c(this.f69020d, "callback");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        q1 q1Var = (q1) cVar;
        q1Var.f69063a = this.f69017a;
        q1Var.f69064b = this.f69018b;
        q1Var.f69065c = this.f69020d;
        q1Var.f69066d = this.f69019c;
        q1Var.X1();
        q5.f fVar = q1Var.f69071i;
        if (fVar != null) {
            q1Var.U1(q1Var.f69064b, fVar, q1Var.f69072j);
        }
    }
}
