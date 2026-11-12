package i3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Li3/k7;", "Lh5/x0;", "Li3/l7;", "", "enabled", "isError", "La2/i;", "interactionSource", "Li3/sg;", "colors", "Lo4/r1;", "textFieldShape", "Lg6/f;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "<init>", "(ZZLa2/i;Li3/sg;Lo4/r1;FFLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class k7 extends h5.x0<l7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f88670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f88671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.i f88672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sg f88673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o4.r1 f88674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f88675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f88676g;

    private k7(boolean z14, boolean z15, a2.i iVar, sg sgVar, o4.r1 r1Var, float f14, float f15) {
        this.f88670a = z14;
        this.f88671b = z15;
        this.f88672c = iVar;
        this.f88673d = sgVar;
        this.f88674e = r1Var;
        this.f88675f = f14;
        this.f88676g = f15;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new l7(this.f88670a, this.f88671b, this.f88672c, this.f88673d, this.f88674e, this.f88675f, this.f88676g, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return this.f88670a == k7Var.f88670a && this.f88671b == k7Var.f88671b && p005kotlin.jvm.internal.s.g(this.f88672c, k7Var.f88672c) && p005kotlin.jvm.internal.s.g(this.f88673d, k7Var.f88673d) && p005kotlin.jvm.internal.s.g(this.f88674e, k7Var.f88674e) && g6.f.c(this.f88675f, k7Var.f88675f) && g6.f.c(this.f88676g, k7Var.f88676g);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iHashCode = (this.f88672c.hashCode() + q6.f.g(Boolean.hashCode(this.f88670a) * 31, 31, this.f88671b)) * 31;
        sg sgVar = this.f88673d;
        int iHashCode2 = (iHashCode + (sgVar == null ? 0 : sgVar.hashCode())) * 31;
        o4.r1 r1Var = this.f88674e;
        int iHashCode3 = (iHashCode2 + (r1Var != null ? r1Var.hashCode() : 0)) * 31;
        g6.f.a aVar = g6.f.f75994b;
        return Float.hashCode(this.f88676g) + q6.f.d(this.f88675f, iHashCode3, 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "indicatorLine";
        kotlin.v3 v3Var = m2Var.f91343c;
        v3Var.c(Boolean.valueOf(this.f88670a), "enabled");
        v3Var.c(Boolean.valueOf(this.f88671b), "isError");
        v3Var.c(this.f88672c, "interactionSource");
        v3Var.c(this.f88673d, "colors");
        v3Var.c(this.f88674e, "textFieldShape");
        v3Var.c(g6.f.a(this.f88675f), "focusedIndicatorLineThickness");
        v3Var.c(g6.f.a(this.f88676g), "unfocusedIndicatorLineThickness");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IndicatorLineElement(enabled=");
        sb3.append(this.f88670a);
        sb3.append(", isError=");
        sb3.append(this.f88671b);
        sb3.append(", interactionSource=");
        sb3.append(this.f88672c);
        sb3.append(", colors=");
        sb3.append(this.f88673d);
        sb3.append(", textFieldShape=");
        sb3.append(this.f88674e);
        sb3.append(", focusedIndicatorLineThickness=");
        tn.k.l(this.f88675f, ", unfocusedIndicatorLineThickness=", sb3);
        sb3.append((Object) g6.f.d(this.f88676g));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        boolean z14;
        l7 l7Var = (l7) cVar;
        boolean z15 = l7Var.f88835c;
        boolean z16 = this.f88670a;
        boolean z17 = true;
        if (z15 != z16) {
            l7Var.f88835c = z16;
            z14 = true;
        } else {
            z14 = false;
        }
        boolean z18 = l7Var.f88836d;
        boolean z19 = this.f88671b;
        if (z18 != z19) {
            l7Var.f88836d = z19;
            z14 = true;
        }
        a2.i iVar = l7Var.f88837e;
        a2.i iVar2 = this.f88672c;
        if (iVar != iVar2) {
            l7Var.f88837e = iVar2;
            o53.c2 c2Var = l7Var.f88841i;
            if (c2Var != null) {
                c2Var.c(null);
            }
            l7Var.f88841i = ge1.b.T(l7Var.getCoroutineScope(), null, null, new n7(l7Var, null), 3);
        }
        sg sgVar = l7Var.f88842j;
        sg sgVar2 = this.f88673d;
        if (!p005kotlin.jvm.internal.s.g(sgVar, sgVar2)) {
            l7Var.f88842j = sgVar2;
            z14 = true;
        }
        o4.r1 r1Var = l7Var.f88844l;
        o4.r1 r1Var2 = this.f88674e;
        if (!p005kotlin.jvm.internal.s.g(r1Var, r1Var2)) {
            if (!p005kotlin.jvm.internal.s.g(l7Var.f88844l, r1Var2)) {
                l7Var.f88844l = r1Var2;
                l7Var.f88846n.l0();
            }
            z14 = true;
        }
        float f14 = l7Var.f88838f;
        float f15 = this.f88675f;
        if (!g6.f.c(f14, f15)) {
            l7Var.f88838f = f15;
            z14 = true;
        }
        float f16 = l7Var.f88839g;
        float f17 = this.f88676g;
        if (g6.f.c(f16, f17)) {
            z17 = z14;
        } else {
            l7Var.f88839g = f17;
        }
        if (z17) {
            l7Var.Y1();
        }
    }

    public /* synthetic */ k7(boolean z14, boolean z15, a2.i iVar, sg sgVar, o4.r1 r1Var, float f14, float f15, p005kotlin.jvm.internal.j jVar) {
        this(z14, z15, iVar, sgVar, r1Var, f14, f15);
    }
}
