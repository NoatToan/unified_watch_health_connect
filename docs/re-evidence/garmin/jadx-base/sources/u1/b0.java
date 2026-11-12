package u1;

import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u007f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lu1/b0;", "Lh5/x0;", "Lu1/c0;", "La2/j;", "interactionSource", "Lu1/f1;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "", "onClickLabel", "Lp5/l;", "role", "Lkotlin/Function0;", "", "onClick", "onLongClickLabel", "onLongClick", "onDoubleClick", "hapticFeedbackEnabled", "<init>", "(La2/j;Lu1/f1;ZZLjava/lang/String;Lp5/l;Le23/a;Ljava/lang/String;Le23/a;Le23/a;ZLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class b0 extends h5.x0<c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.j f167399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f167400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f167402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f167403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p5.l f167404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.a<Unit> f167405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f167406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e23.a<Unit> f167407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e23.a<Unit> f167408j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f167409k;

    private b0(a2.j jVar, f1 f1Var, boolean z14, boolean z15, String str, p5.l lVar, e23.a<Unit> aVar, String str2, e23.a<Unit> aVar2, e23.a<Unit> aVar3, boolean z16) {
        this.f167399a = jVar;
        this.f167400b = f1Var;
        this.f167401c = z14;
        this.f167402d = z15;
        this.f167403e = str;
        this.f167404f = lVar;
        this.f167405g = aVar;
        this.f167406h = str2;
        this.f167407i = aVar2;
        this.f167408j = aVar3;
        this.f167409k = z16;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new c0(this.f167405g, this.f167406h, this.f167407i, this.f167408j, this.f167409k, this.f167399a, this.f167400b, this.f167401c, this.f167402d, this.f167403e, this.f167404f, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return p005kotlin.jvm.internal.s.g(this.f167399a, b0Var.f167399a) && p005kotlin.jvm.internal.s.g(this.f167400b, b0Var.f167400b) && this.f167401c == b0Var.f167401c && this.f167402d == b0Var.f167402d && p005kotlin.jvm.internal.s.g(this.f167403e, b0Var.f167403e) && p005kotlin.jvm.internal.s.g(this.f167404f, b0Var.f167404f) && this.f167405g == b0Var.f167405g && p005kotlin.jvm.internal.s.g(this.f167406h, b0Var.f167406h) && this.f167407i == b0Var.f167407i && this.f167408j == b0Var.f167408j && this.f167409k == b0Var.f167409k;
    }

    @Override // h5.x0
    public final int hashCode() {
        a2.j jVar = this.f167399a;
        int iHashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        f1 f1Var = this.f167400b;
        int iG = q6.f.g(q6.f.g((iHashCode + (f1Var != null ? f1Var.hashCode() : 0)) * 31, 31, this.f167401c), 31, this.f167402d);
        String str = this.f167403e;
        int iHashCode2 = (iG + (str != null ? str.hashCode() : 0)) * 31;
        p5.l lVar = this.f167404f;
        int iF = q6.f.f((iHashCode2 + (lVar != null ? Integer.hashCode(lVar.f136041a) : 0)) * 31, 31, this.f167405g);
        String str2 = this.f167406h;
        int iHashCode3 = (iF + (str2 != null ? str2.hashCode() : 0)) * 31;
        e23.a<Unit> aVar = this.f167407i;
        int iHashCode4 = (iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        e23.a<Unit> aVar2 = this.f167408j;
        return Boolean.hashCode(this.f167409k) + ((iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "combinedClickable";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f167400b, "indicationNodeFactory");
        v3Var.c(this.f167399a, "interactionSource");
        v3Var.c(Boolean.valueOf(this.f167402d), "enabled");
        v3Var.c(this.f167403e, "onClickLabel");
        v3Var.c(this.f167404f, "role");
        v3Var.c(this.f167405g, "onClick");
        v3Var.c(this.f167408j, "onDoubleClick");
        v3Var.c(this.f167407i, "onLongClick");
        v3Var.c(this.f167406h, "onLongClickLabel");
        v3Var.c(Boolean.valueOf(this.f167409k), "hapticFeedbackEnabled");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        boolean z14;
        b5.u0 u0Var;
        c0 c0Var = (c0) cVar;
        c0Var.D = this.f167409k;
        String str = c0Var.A;
        String str2 = this.f167406h;
        if (!p005kotlin.jvm.internal.s.g(str, str2)) {
            c0Var.A = str2;
            h5.k.g(c0Var).U();
        }
        boolean z15 = c0Var.B == null;
        e23.a<Unit> aVar = this.f167407i;
        if (z15 != (aVar == null)) {
            c0Var.a2();
            h5.k.g(c0Var).U();
            z14 = true;
        } else {
            z14 = false;
        }
        c0Var.B = aVar;
        boolean z16 = c0Var.C == null;
        e23.a<Unit> aVar2 = this.f167408j;
        if (z16 != (aVar2 == null)) {
            z14 = true;
        }
        c0Var.C = aVar2;
        boolean z17 = c0Var.f167353h;
        boolean z18 = this.f167402d;
        if (z17 != z18) {
            z14 = true;
        }
        c0Var.i2(this.f167399a, this.f167400b, this.f167401c, z18, this.f167403e, this.f167404f, this.f167405g);
        if (!z14 || (u0Var = c0Var.f167357l) == null) {
            return;
        }
        u0Var.i0();
        Unit unit = Unit.INSTANCE;
    }

    public /* synthetic */ b0(a2.j jVar, f1 f1Var, boolean z14, boolean z15, String str, p5.l lVar, e23.a aVar, String str2, e23.a aVar2, e23.a aVar3, boolean z16, p005kotlin.jvm.internal.j jVar2) {
        this(jVar, f1Var, z14, z15, str, lVar, aVar, str2, aVar2, aVar3, z16);
    }
}
