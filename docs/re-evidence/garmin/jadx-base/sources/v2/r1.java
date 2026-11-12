package v2;

import ch.qos.logback.core.CoreConstants;
import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bs\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lv2/r1;", "Lh5/x0;", "Lv2/w1;", "Lv2/h2;", "textFieldState", "Lv2/g2;", "textLayoutState", "Lw2/n;", "textFieldSelectionState", "Lu2/a;", "filter", "", "enabled", "readOnly", "Ll2/a2;", "keyboardOptions", "Lu2/b;", "keyboardActionHandler", "singleLine", "La2/j;", "interactionSource", "isPassword", "Lr53/y1;", "", "stylusHandwritingTrigger", "<init>", "(Lv2/h2;Lv2/g2;Lw2/n;Lu2/a;ZZLl2/a2;Lu2/b;ZLa2/j;ZLr53/y1;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class r1 extends h5.x0<w1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2 f175150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f175151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.n f175152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f175153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f175154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p006l2.a2 f175155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f175156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2.j f175157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f175158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r53.y1<Unit> f175159j;

    public r1(h2 h2Var, g2 g2Var, w2.n nVar, u2.a aVar, boolean z14, boolean z15, p006l2.a2 a2Var, u2.b bVar, boolean z16, a2.j jVar, boolean z17, r53.y1<Unit> y1Var) {
        this.f175150a = h2Var;
        this.f175151b = g2Var;
        this.f175152c = nVar;
        this.f175153d = z14;
        this.f175154e = z15;
        this.f175155f = a2Var;
        this.f175156g = z16;
        this.f175157h = jVar;
        this.f175158i = z17;
        this.f175159j = y1Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new w1(this.f175150a, this.f175151b, this.f175152c, null, this.f175153d, this.f175154e, this.f175155f, null, this.f175156g, this.f175157h, this.f175158i, this.f175159j);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return p005kotlin.jvm.internal.s.g(this.f175150a, r1Var.f175150a) && p005kotlin.jvm.internal.s.g(this.f175151b, r1Var.f175151b) && p005kotlin.jvm.internal.s.g(this.f175152c, r1Var.f175152c) && this.f175153d == r1Var.f175153d && this.f175154e == r1Var.f175154e && p005kotlin.jvm.internal.s.g(this.f175155f, r1Var.f175155f) && this.f175156g == r1Var.f175156g && p005kotlin.jvm.internal.s.g(this.f175157h, r1Var.f175157h) && this.f175158i == r1Var.f175158i && p005kotlin.jvm.internal.s.g(this.f175159j, r1Var.f175159j);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iG = q6.f.g((this.f175157h.hashCode() + q6.f.g((this.f175155f.hashCode() + q6.f.g(q6.f.g((this.f175152c.hashCode() + ((this.f175151b.hashCode() + (this.f175150a.hashCode() * 31)) * 31)) * 961, 31, this.f175153d), 31, this.f175154e)) * 961, 31, this.f175156g)) * 31, 31, this.f175158i);
        r53.y1<Unit> y1Var = this.f175159j;
        return iG + (y1Var == null ? 0 : y1Var.hashCode());
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.f175150a + ", textLayoutState=" + this.f175151b + ", textFieldSelectionState=" + this.f175152c + ", filter=null, enabled=" + this.f175153d + ", readOnly=" + this.f175154e + ", keyboardOptions=" + this.f175155f + ", keyboardActionHandler=null, singleLine=" + this.f175156g + ", interactionSource=" + this.f175157h + ", isPassword=" + this.f175158i + ", stylusHandwritingTrigger=" + this.f175159j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00eb  */
    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        u1.n0 n0Var;
        o53.c2 c2Var;
        w1 w1Var = (w1) cVar;
        b5.u0 u0Var = w1Var.f175203n;
        u1.n0 n0Var2 = w1Var.f175202m;
        boolean z14 = w1Var.f175195f;
        boolean z15 = z14 && !w1Var.f175196g;
        h2 h2Var = w1Var.f175192c;
        p006l2.a2 a2Var = w1Var.f175197h;
        w2.n nVar = w1Var.f175194e;
        a2.j jVar = w1Var.f175199j;
        boolean z16 = w1Var.f175200k;
        r53.y1<Unit> y1Var = w1Var.f175201l;
        boolean z17 = this.f175153d;
        boolean z18 = this.f175154e;
        boolean z19 = z17 && !z18;
        h2 h2Var2 = this.f175150a;
        w1Var.f175192c = h2Var2;
        w1Var.f175193d = this.f175151b;
        w2.n nVar2 = this.f175152c;
        w1Var.f175194e = nVar2;
        w1Var.f175195f = z17;
        w1Var.f175196g = z18;
        p006l2.a2 a2Var2 = this.f175155f;
        w1Var.f175197h = a2Var2;
        w1Var.f175198i = this.f175156g;
        a2.j jVar2 = this.f175157h;
        w1Var.f175199j = jVar2;
        boolean z24 = this.f175158i;
        w1Var.f175200k = z24;
        r53.y1<Unit> y1Var2 = this.f175159j;
        w1Var.f175201l = y1Var2;
        if (z19 != z15 || !p005kotlin.jvm.internal.s.g(h2Var2, h2Var) || !p005kotlin.jvm.internal.s.g(a2Var2, a2Var) || !p005kotlin.jvm.internal.s.g(y1Var2, y1Var)) {
            if (z19 && (w1Var.Z1() || w1Var.f175210w != null)) {
                w1Var.c2(false);
            } else if (!z19) {
                w1Var.X1();
            }
        }
        if (z17 != z14 || z19 != z15 || a2Var2.a() != a2Var.a() || z24 != z16) {
            h5.k.g(w1Var).U();
        }
        if (!p005kotlin.jvm.internal.s.g(nVar2, nVar)) {
            u0Var.i0();
            if (w1Var.getIsAttached()) {
                nVar2.f181380p = w1Var.f175211x;
                if (w1Var.Z1() && (c2Var = w1Var.f175207r) != null) {
                    c2Var.c(null);
                    w1Var.f175207r = ge1.b.T(w1Var.getCoroutineScope(), null, null, new z1(nVar2, null), 3);
                }
            }
            nVar2.f181379o = new u1(w1Var, 2);
        }
        if (p005kotlin.jvm.internal.s.g(jVar2, jVar)) {
            n0Var = n0Var2;
        } else {
            u0Var.i0();
            if (n0Var2.getIsAttached()) {
                n0Var = n0Var2;
                n0Var.Z1(jVar2);
            } else {
                n0Var = n0Var2;
            }
        }
        if (z17 != z14) {
            if (!z17) {
                w1Var.V1(n0Var);
            } else {
                w1Var.U1(n0Var);
                n0Var.Z1(jVar2);
            }
        }
    }
}
