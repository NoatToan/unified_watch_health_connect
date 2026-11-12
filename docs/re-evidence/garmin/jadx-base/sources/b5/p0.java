package b5;

import ch.qos.logback.core.CoreConstants;
import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lb5/p0;", "Lh5/x0;", "Lb5/q0;", "Lb5/w;", "icon", "", "overrideDescendants", "Lh5/r;", "touchBoundsExpansion", "<init>", "(Lb5/w;ZLh5/r;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class p0 extends h5.x0<q0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f15867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h5.r f15869c;

    public /* synthetic */ p0(w wVar, boolean z14, h5.r rVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(wVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? null : rVar);
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new q0(this.f15867a, this.f15868b, this.f15869c);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return p005kotlin.jvm.internal.s.g(this.f15867a, p0Var.f15867a) && this.f15868b == p0Var.f15868b && p005kotlin.jvm.internal.s.g(this.f15869c, p0Var.f15869c);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iG = q6.f.g(this.f15867a.hashCode() * 31, 31, this.f15868b);
        h5.r rVar = this.f15869c;
        return iG + (rVar == null ? 0 : rVar.hashCode());
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "stylusHoverIcon";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f15867a, "icon");
        v3Var.c(Boolean.valueOf(this.f15868b), "overrideDescendants");
        v3Var.c(this.f15869c, "touchBoundsExpansion");
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.f15867a + ", overrideDescendants=" + this.f15868b + ", touchBoundsExpansion=" + this.f15869c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        q0 q0Var = (q0) cVar;
        w wVar = q0Var.f15811b;
        w wVar2 = this.f15867a;
        if (!p005kotlin.jvm.internal.s.g(wVar, wVar2)) {
            q0Var.f15811b = wVar2;
            if (q0Var.f15813d) {
                q0Var.W1();
            }
        }
        q0Var.Z1(this.f15868b);
        q0Var.f15810a = this.f15869c;
    }

    public p0(w wVar, boolean z14, h5.r rVar) {
        this.f15867a = wVar;
        this.f15868b = z14;
        this.f15869c = rVar;
    }
}
