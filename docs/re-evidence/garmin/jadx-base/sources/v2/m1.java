package v2;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import kotlin.m2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lv2/m1;", "Lh5/x0;", "Lv2/p1;", "", "isFocused", "isDragHovered", "Lv2/g2;", "textLayoutState", "Lv2/h2;", "textFieldState", "Lw2/n;", "textFieldSelectionState", "Lo4/w;", "cursorBrush", "writeable", "Lu1/d2;", "scrollState", "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "Lr2/p;", "toolbarRequester", "Lz2/q;", "platformSelectionBehaviors", "<init>", "(ZZLv2/g2;Lv2/h2;Lw2/n;Lo4/w;ZLu1/d2;Ly1/b2;Lr2/p;Lz2/q;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class m1 extends h5.x0<p1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f175087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f175088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f175089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h2 f175090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w2.n f175091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o4.w f175092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f175093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u1.d2 f175094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p008y1.b2 f175095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r2.p f175096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z2.q f175097k;

    public m1(boolean z14, boolean z15, g2 g2Var, h2 h2Var, w2.n nVar, o4.w wVar, boolean z16, u1.d2 d2Var, p008y1.b2 b2Var, r2.p pVar, z2.q qVar) {
        this.f175087a = z14;
        this.f175088b = z15;
        this.f175089c = g2Var;
        this.f175090d = h2Var;
        this.f175091e = nVar;
        this.f175092f = wVar;
        this.f175093g = z16;
        this.f175094h = d2Var;
        this.f175095i = b2Var;
        this.f175096j = pVar;
        this.f175097k = qVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new p1(this.f175087a, this.f175088b, this.f175089c, this.f175090d, this.f175091e, this.f175092f, this.f175093g, this.f175094h, this.f175095i, this.f175096j, this.f175097k);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f175087a == m1Var.f175087a && this.f175088b == m1Var.f175088b && p005kotlin.jvm.internal.s.g(this.f175089c, m1Var.f175089c) && p005kotlin.jvm.internal.s.g(this.f175090d, m1Var.f175090d) && p005kotlin.jvm.internal.s.g(this.f175091e, m1Var.f175091e) && p005kotlin.jvm.internal.s.g(this.f175092f, m1Var.f175092f) && this.f175093g == m1Var.f175093g && p005kotlin.jvm.internal.s.g(this.f175094h, m1Var.f175094h) && this.f175095i == m1Var.f175095i && p005kotlin.jvm.internal.s.g(this.f175096j, m1Var.f175096j) && p005kotlin.jvm.internal.s.g(this.f175097k, m1Var.f175097k);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iHashCode = (this.f175096j.hashCode() + ((this.f175095i.hashCode() + ((this.f175094h.hashCode() + q6.f.g((this.f175092f.hashCode() + ((this.f175091e.hashCode() + ((this.f175090d.hashCode() + ((this.f175089c.hashCode() + q6.f.g(Boolean.hashCode(this.f175087a) * 31, 31, this.f175088b)) * 31)) * 31)) * 31)) * 31, 31, this.f175093g)) * 31)) * 31)) * 31;
        z2.q qVar = this.f175097k;
        return iHashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
    }

    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.f175087a + ", isDragHovered=" + this.f175088b + ", textLayoutState=" + this.f175089c + ", textFieldState=" + this.f175090d + ", textFieldSelectionState=" + this.f175091e + ", cursorBrush=" + this.f175092f + ", writeable=" + this.f175093g + ", scrollState=" + this.f175094h + ", orientation=" + this.f175095i + ", toolbarRequester=" + this.f175096j + ", platformSelectionBehaviors=" + this.f175097k + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        o53.l1 andSet;
        p1 p1Var = (p1) cVar;
        boolean zX1 = p1Var.X1();
        boolean z14 = p1Var.f175112c;
        h2 h2Var = p1Var.f175115f;
        g2 g2Var = p1Var.f175114e;
        w2.n nVar = p1Var.f175116g;
        u1.d2 d2Var = p1Var.f175119j;
        boolean z15 = this.f175087a;
        p1Var.f175112c = z15;
        boolean z16 = this.f175088b;
        p1Var.f175113d = z16;
        g2 g2Var2 = this.f175089c;
        p1Var.f175114e = g2Var2;
        h2 h2Var2 = this.f175090d;
        p1Var.f175115f = h2Var2;
        w2.n nVar2 = this.f175091e;
        p1Var.f175116g = nVar2;
        p1Var.f175117h = this.f175092f;
        p1Var.f175118i = this.f175093g;
        u1.d2 d2Var2 = this.f175094h;
        p1Var.f175119j = d2Var2;
        p1Var.f175120k = this.f175095i;
        r2.p pVar = this.f175096j;
        p1Var.f175121l = pVar;
        p1Var.f175122m = this.f175097k;
        p1Var.f175129v.X1(h2Var2, nVar2, g2Var2, z15 || z16);
        r2.n nVar3 = p1Var.f175130w;
        nVar3.f149456c.f149467a = null;
        nVar3.f149456c = pVar;
        pVar.f149467a = nVar3;
        pVar.f149468b = nVar3.getIsAttached() ? r2.o.Attached : r2.o.Detached;
        if (!p1Var.X1()) {
            o53.c2 c2Var = p1Var.f175124o;
            if (c2Var != null) {
                c2Var.c(null);
            }
            p1Var.f175124o = null;
            e0 e0Var = p1Var.f175123n;
            if (e0Var != null && (andSet = e0Var.f174958b.getAndSet(null)) != null) {
                andSet.c(null);
            }
        } else if (!z14 || !p005kotlin.jvm.internal.s.g(h2Var, h2Var2) || !zX1) {
            p1Var.Y1();
        }
        if (p005kotlin.jvm.internal.s.g(h2Var, h2Var2) && p005kotlin.jvm.internal.s.g(g2Var, g2Var2) && p005kotlin.jvm.internal.s.g(nVar, nVar2) && p005kotlin.jvm.internal.s.g(d2Var, d2Var2)) {
            return;
        }
        h5.k.g(p1Var).T();
    }
}
