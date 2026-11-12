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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lj2/a;", "Lh5/x0;", "Lj2/c;", "", "selected", "La2/j;", "interactionSource", "Lu1/f1;", "indicationNodeFactory", "useLocalIndication", "enabled", "Lp5/l;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(ZLa2/j;Lu1/f1;ZZLp5/l;Le23/a;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a extends x0<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f96508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2.j f96509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f96510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f96511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f96512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f96513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.a<Unit> f96514g;

    private a(boolean z14, a2.j jVar, f1 f1Var, boolean z15, boolean z16, l lVar, e23.a<Unit> aVar) {
        this.f96508a = z14;
        this.f96509b = jVar;
        this.f96510c = f1Var;
        this.f96511d = z15;
        this.f96512e = z16;
        this.f96513f = lVar;
        this.f96514g = aVar;
    }

    @Override // h5.x0
    public final r.c create() {
        return new c(this.f96508a, this.f96509b, this.f96510c, this.f96511d, this.f96512e, this.f96513f, this.f96514g, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f96508a == aVar.f96508a && s.g(this.f96509b, aVar.f96509b) && s.g(this.f96510c, aVar.f96510c) && this.f96511d == aVar.f96511d && this.f96512e == aVar.f96512e && s.g(this.f96513f, aVar.f96513f) && this.f96514g == aVar.f96514g;
    }

    @Override // h5.x0
    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f96508a) * 31;
        a2.j jVar = this.f96509b;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        f1 f1Var = this.f96510c;
        int iG = q6.f.g(q6.f.g((iHashCode2 + (f1Var != null ? f1Var.hashCode() : 0)) * 31, 31, this.f96511d), 31, this.f96512e);
        l lVar = this.f96513f;
        return this.f96514g.hashCode() + ((iG + (lVar != null ? Integer.hashCode(lVar.f136041a) : 0)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "selectable";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(Boolean.valueOf(this.f96508a), "selected");
        v3Var.c(this.f96509b, "interactionSource");
        v3Var.c(this.f96510c, "indicationNodeFactory");
        v3Var.c(Boolean.valueOf(this.f96512e), "enabled");
        v3Var.c(this.f96513f, "role");
        v3Var.c(this.f96514g, "onClick");
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        c cVar2 = (c) cVar;
        boolean z14 = cVar2.C;
        boolean z15 = this.f96508a;
        if (z14 != z15) {
            cVar2.C = z15;
            h5.k.g(cVar2).U();
        }
        cVar2.i2(this.f96509b, this.f96510c, this.f96511d, this.f96512e, null, this.f96513f, this.f96514g);
    }

    public /* synthetic */ a(boolean z14, a2.j jVar, f1 f1Var, boolean z15, boolean z16, l lVar, e23.a aVar, p005kotlin.jvm.internal.j jVar2) {
        this(z14, jVar, f1Var, z15, z16, lVar, aVar);
    }
}
