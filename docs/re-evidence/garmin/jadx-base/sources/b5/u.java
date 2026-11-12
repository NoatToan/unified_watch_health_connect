package b5;

import ch.qos.logback.core.CoreConstants;
import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb5/u;", "Lh5/x0;", "Lb5/v;", "Lb5/w;", "icon", "", "overrideDescendants", "<init>", "(Lb5/w;Z)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class u extends h5.x0<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f15902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15903b;

    public /* synthetic */ u(w wVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(wVar, (i14 & 2) != 0 ? false : z14);
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new v(this.f15902a, this.f15903b);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.f15902a, uVar.f15902a) && this.f15903b == uVar.f15903b;
    }

    @Override // h5.x0
    public final int hashCode() {
        return Boolean.hashCode(this.f15903b) + (this.f15902a.hashCode() * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "pointerHoverIcon";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f15902a, "icon");
        v3Var.c(Boolean.valueOf(this.f15903b), "overrideDescendants");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PointerHoverIconModifierElement(icon=");
        sb3.append(this.f15902a);
        sb3.append(", overrideDescendants=");
        return am.j.t(sb3, this.f15903b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        v vVar = (v) cVar;
        w wVar = vVar.f15811b;
        w wVar2 = this.f15902a;
        if (!p005kotlin.jvm.internal.s.g(wVar, wVar2)) {
            vVar.f15811b = wVar2;
            if (vVar.f15813d) {
                vVar.W1();
            }
        }
        vVar.Z1(this.f15903b);
    }

    public u(w wVar, boolean z14) {
        this.f15902a = wVar;
        this.f15903b = z14;
    }
}
