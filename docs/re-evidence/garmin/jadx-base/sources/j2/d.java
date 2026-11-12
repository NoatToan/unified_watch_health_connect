package j2;

import h4.r;
import h5.x0;
import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p5.l;
import u1.f1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lj2/d;", "Lh5/x0;", "Lj2/i;", "", "value", "La2/j;", "interactionSource", "Lu1/f1;", "indicationNodeFactory", "useLocalIndication", "enabled", "Lp5/l;", "role", "Lkotlin/Function1;", "", "onValueChange", "<init>", "(ZLa2/j;Lu1/f1;ZZLp5/l;Le23/l;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class d extends x0<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f96520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2.j f96521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f96522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f96523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f96524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f96525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.l<Boolean, Unit> f96526g;

    /* JADX WARN: Multi-variable type inference failed */
    private d(boolean z14, a2.j jVar, f1 f1Var, boolean z15, boolean z16, l lVar, e23.l<? super Boolean, Unit> lVar2) {
        this.f96520a = z14;
        this.f96521b = jVar;
        this.f96522c = f1Var;
        this.f96523d = z15;
        this.f96524e = z16;
        this.f96525f = lVar;
        this.f96526g = lVar2;
    }

    @Override // h5.x0
    public final r.c create() {
        return new i(this.f96520a, this.f96521b, this.f96522c, this.f96523d, this.f96524e, this.f96525f, this.f96526g, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f96520a == dVar.f96520a && s.g(this.f96521b, dVar.f96521b) && s.g(this.f96522c, dVar.f96522c) && this.f96523d == dVar.f96523d && this.f96524e == dVar.f96524e && s.g(this.f96525f, dVar.f96525f) && this.f96526g == dVar.f96526g;
    }

    @Override // h5.x0
    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f96520a) * 31;
        a2.j jVar = this.f96521b;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        f1 f1Var = this.f96522c;
        int iG = q6.f.g(q6.f.g((iHashCode2 + (f1Var != null ? f1Var.hashCode() : 0)) * 31, 31, this.f96523d), 31, this.f96524e);
        l lVar = this.f96525f;
        return this.f96526g.hashCode() + ((iG + (lVar != null ? Integer.hashCode(lVar.f136041a) : 0)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "toggleable";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(m2Var.f91342b, "value");
        v3Var.c(this.f96521b, "interactionSource");
        v3Var.c(this.f96522c, "indicationNodeFactory");
        v3Var.c(Boolean.valueOf(this.f96524e), "enabled");
        v3Var.c(this.f96525f, "role");
        v3Var.c(this.f96526g, "onValueChange");
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        i iVar = (i) cVar;
        boolean z14 = iVar.C;
        boolean z15 = this.f96520a;
        if (z14 != z15) {
            iVar.C = z15;
            h5.k.g(iVar).U();
        }
        iVar.D = this.f96526g;
        iVar.i2(this.f96521b, this.f96522c, this.f96523d, this.f96524e, null, this.f96525f, iVar.E);
    }

    public /* synthetic */ d(boolean z14, a2.j jVar, f1 f1Var, boolean z15, boolean z16, l lVar, e23.l lVar2, p005kotlin.jvm.internal.j jVar2) {
        this(z14, jVar, f1Var, z15, z16, lVar, lVar2);
    }
}
