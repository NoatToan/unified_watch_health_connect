package u1;

import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lu1/v;", "Lh5/x0;", "Lu1/y;", "La2/j;", "interactionSource", "Lu1/f1;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "", "onClickLabel", "Lp5/l;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(La2/j;Lu1/f1;ZZLjava/lang/String;Lp5/l;Le23/a;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class v extends h5.x0<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.j f167685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f167686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f167688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f167689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p5.l f167690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.a<Unit> f167691g;

    private v(a2.j jVar, f1 f1Var, boolean z14, boolean z15, String str, p5.l lVar, e23.a<Unit> aVar) {
        this.f167685a = jVar;
        this.f167686b = f1Var;
        this.f167687c = z14;
        this.f167688d = z15;
        this.f167689e = str;
        this.f167690f = lVar;
        this.f167691g = aVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new y(this.f167685a, this.f167686b, this.f167687c, this.f167688d, this.f167689e, this.f167690f, this.f167691g, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f167685a, vVar.f167685a) && p005kotlin.jvm.internal.s.g(this.f167686b, vVar.f167686b) && this.f167687c == vVar.f167687c && this.f167688d == vVar.f167688d && p005kotlin.jvm.internal.s.g(this.f167689e, vVar.f167689e) && p005kotlin.jvm.internal.s.g(this.f167690f, vVar.f167690f) && this.f167691g == vVar.f167691g;
    }

    @Override // h5.x0
    public final int hashCode() {
        a2.j jVar = this.f167685a;
        int iHashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        f1 f1Var = this.f167686b;
        int iG = q6.f.g(q6.f.g((iHashCode + (f1Var != null ? f1Var.hashCode() : 0)) * 31, 31, this.f167687c), 31, this.f167688d);
        String str = this.f167689e;
        int iHashCode2 = (iG + (str != null ? str.hashCode() : 0)) * 31;
        p5.l lVar = this.f167690f;
        return this.f167691g.hashCode() + ((iHashCode2 + (lVar != null ? Integer.hashCode(lVar.f136041a) : 0)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "clickable";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(Boolean.valueOf(this.f167688d), "enabled");
        v3Var.c(this.f167691g, "onClick");
        v3Var.c(this.f167689e, "onClickLabel");
        v3Var.c(this.f167690f, "role");
        v3Var.c(this.f167685a, "interactionSource");
        v3Var.c(this.f167686b, "indicationNodeFactory");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((y) cVar).i2(this.f167685a, this.f167686b, this.f167687c, this.f167688d, this.f167689e, this.f167690f, this.f167691g);
    }

    public /* synthetic */ v(a2.j jVar, f1 f1Var, boolean z14, boolean z15, String str, p5.l lVar, e23.a aVar, p005kotlin.jvm.internal.j jVar2) {
        this(jVar, f1Var, z14, z15, str, lVar, aVar);
    }
}
