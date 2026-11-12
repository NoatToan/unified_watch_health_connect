package j2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lj2/j;", "Lh5/x0;", "Lj2/k;", "Lr5/a;", RemoteConfigConstants.ResponseFieldKey.STATE, "La2/j;", "interactionSource", "Lu1/f1;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "Lp5/l;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(Lr5/a;La2/j;Lu1/f1;ZZLp5/l;Le23/a;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class j extends x0<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r5.a f96539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2.j f96540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f96541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f96542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f96543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f96544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.a<Unit> f96545g;

    private j(r5.a aVar, a2.j jVar, f1 f1Var, boolean z14, boolean z15, l lVar, e23.a<Unit> aVar2) {
        this.f96539a = aVar;
        this.f96540b = jVar;
        this.f96541c = f1Var;
        this.f96542d = z14;
        this.f96543e = z15;
        this.f96544f = lVar;
        this.f96545g = aVar2;
    }

    @Override // h5.x0
    public final r.c create() {
        return new k(this.f96539a, this.f96540b, this.f96541c, this.f96542d, this.f96543e, this.f96544f, this.f96545g, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f96539a == jVar.f96539a && s.g(this.f96540b, jVar.f96540b) && s.g(this.f96541c, jVar.f96541c) && this.f96542d == jVar.f96542d && this.f96543e == jVar.f96543e && s.g(this.f96544f, jVar.f96544f) && this.f96545g == jVar.f96545g;
    }

    @Override // h5.x0
    public final int hashCode() {
        int iHashCode = this.f96539a.hashCode() * 31;
        a2.j jVar = this.f96540b;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        f1 f1Var = this.f96541c;
        int iG = q6.f.g(q6.f.g((iHashCode2 + (f1Var != null ? f1Var.hashCode() : 0)) * 31, 31, this.f96542d), 31, this.f96543e);
        l lVar = this.f96544f;
        return this.f96545g.hashCode() + ((iG + (lVar != null ? Integer.hashCode(lVar.f136041a) : 0)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "triStateToggleable";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f96539a, RemoteConfigConstants.ResponseFieldKey.STATE);
        v3Var.c(this.f96540b, "interactionSource");
        v3Var.c(this.f96541c, "indicationNodeFactory");
        v3Var.c(Boolean.valueOf(this.f96543e), "enabled");
        v3Var.c(this.f96544f, "role");
        v3Var.c(this.f96545g, "onClick");
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        k kVar = (k) cVar;
        r5.a aVar = kVar.C;
        r5.a aVar2 = this.f96539a;
        if (aVar != aVar2) {
            kVar.C = aVar2;
            h5.k.g(kVar).U();
        }
        kVar.i2(this.f96540b, this.f96541c, this.f96542d, this.f96543e, null, this.f96544f, this.f96545g);
    }

    public /* synthetic */ j(r5.a aVar, a2.j jVar, f1 f1Var, boolean z14, boolean z15, l lVar, e23.a aVar2, p005kotlin.jvm.internal.j jVar2) {
        this(aVar, jVar, f1Var, z14, z15, lVar, aVar2);
    }
}
