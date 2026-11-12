package v2;

import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\"\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lv2/d2;", "Lh5/x0;", "Lv2/e2;", "Lv2/g2;", "textLayoutState", "Lv2/h2;", "textFieldState", "Ls5/x0;", "textStyle", "", "singleLine", "Lkotlin/Function2;", "Lg6/c;", "Lkotlin/Function0;", "Ls5/q0;", "", "onTextLayout", "Ll2/a2;", "keyboardOptions", "<init>", "(Lv2/g2;Lv2/h2;Ls5/x0;ZLe23/p;Ll2/a2;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d2 extends h5.x0<e2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f174949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2 f174950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s5.x0 f174951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f174952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.p<g6.c, e23.a<s5.q0>, Unit> f174953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p006l2.a2 f174954f;

    /* JADX WARN: Multi-variable type inference failed */
    public d2(g2 g2Var, h2 h2Var, s5.x0 x0Var, boolean z14, e23.p<? super g6.c, ? super e23.a<s5.q0>, Unit> pVar, p006l2.a2 a2Var) {
        this.f174949a = g2Var;
        this.f174950b = h2Var;
        this.f174951c = x0Var;
        this.f174952d = z14;
        this.f174953e = pVar;
        this.f174954f = a2Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new e2(this.f174949a, this.f174950b, this.f174951c, this.f174952d, this.f174953e, this.f174954f);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.f174952d == d2Var.f174952d && p005kotlin.jvm.internal.s.g(this.f174949a, d2Var.f174949a) && p005kotlin.jvm.internal.s.g(this.f174950b, d2Var.f174950b) && p005kotlin.jvm.internal.s.g(this.f174951c, d2Var.f174951c) && this.f174953e == d2Var.f174953e && p005kotlin.jvm.internal.s.g(this.f174954f, d2Var.f174954f);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iB = v.e0.b((this.f174950b.hashCode() + ((this.f174949a.hashCode() + (Boolean.hashCode(this.f174952d) * 31)) * 31)) * 31, 31, this.f174951c);
        e23.p<g6.c, e23.a<s5.q0>, Unit> pVar = this.f174953e;
        return this.f174954f.hashCode() + ((iB + (pVar != null ? pVar.hashCode() : 0)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        e2 e2Var = (e2) cVar;
        g2 g2Var = e2Var.f174973c;
        g2 g2Var2 = this.f174949a;
        e2Var.f174973c = g2Var2;
        g2Var2.f174996b = this.f174953e;
        boolean z14 = this.f174952d;
        e2Var.f174974d = z14;
        g2Var2.g(this.f174950b, this.f174951c, z14, !z14, this.f174954f);
        if (p005kotlin.jvm.internal.s.g(g2Var, g2Var2)) {
            return;
        }
        e2Var.f174975e.U1(g2Var2.f175002h);
    }
}
