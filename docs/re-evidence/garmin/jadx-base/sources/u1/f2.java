package u1;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p008y1.a3;
import p008y1.e3;
import p008y1.r2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lu1/f2;", "Lh5/m;", "Lh5/h;", "Lh5/i1;", "Ly1/e3;", RemoteConfigConstants.ResponseFieldKey.STATE, "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "", "enabled", "reverseScrolling", "Ly1/e1;", "flingBehavior", "La2/j;", "interactionSource", "Ly1/x;", "bringIntoViewSpec", "useLocalOverscrollFactory", "Lu1/r1;", "userProvidedOverscrollEffect", "<init>", "(Ly1/e3;Ly1/b2;ZZLy1/e1;La2/j;Ly1/x;ZLu1/r1;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f2 extends h5.m implements h5.h, h5.i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e3 f167477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p008y1.b2 f167478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f167479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f167480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p008y1.e1 f167481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a2.j f167482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p008y1.x f167483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f167484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r1 f167485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a3 f167486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h5.j f167487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s1 f167488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r1 f167489o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f167490p;

    public f2(e3 e3Var, p008y1.b2 b2Var, boolean z14, boolean z15, p008y1.e1 e1Var, a2.j jVar, p008y1.x xVar, boolean z16, r1 r1Var) {
        this.f167477c = e3Var;
        this.f167478d = b2Var;
        this.f167479e = z14;
        this.f167480f = z15;
        this.f167481g = e1Var;
        this.f167482h = jVar;
        this.f167483i = xVar;
        this.f167484j = z16;
        this.f167485k = r1Var;
    }

    public final void X1() {
        h5.j jVar = this.f167487m;
        if (jVar != null) {
            if (jVar.getNode().getIsAttached()) {
                return;
            }
            U1(jVar);
            return;
        }
        if (this.f167484j) {
            h5.j1.a(this, new ty1.f1(this, 3));
        }
        r1 r1Var = this.f167484j ? this.f167489o : this.f167485k;
        if (r1Var != null) {
            h5.j node = r1Var.getNode();
            if (node.getNode().getIsAttached()) {
                return;
            }
            U1(node);
            this.f167487m = node;
        }
    }

    public final boolean Y1() {
        g6.o oVar = g6.o.Ltr;
        if (getIsAttached()) {
            oVar = h5.k.g(this).B;
        }
        r2 r2Var = r2.f193614a;
        p008y1.b2 b2Var = this.f167478d;
        boolean z14 = this.f167480f;
        r2Var.getClass();
        return (oVar != g6.o.Rtl || b2Var == p008y1.b2.Vertical) ? !z14 : z14;
    }

    public final void Z1(e3 e3Var, p008y1.b2 b2Var, boolean z14, boolean z15, p008y1.e1 e1Var, a2.j jVar, p008y1.x xVar, boolean z16, r1 r1Var) {
        boolean z17;
        this.f167477c = e3Var;
        this.f167478d = b2Var;
        boolean z18 = true;
        if (this.f167484j != z14) {
            this.f167484j = z14;
            z17 = true;
        } else {
            z17 = false;
        }
        if (p005kotlin.jvm.internal.s.g(this.f167485k, r1Var)) {
            z18 = false;
        } else {
            this.f167485k = r1Var;
        }
        if (z17 || (z18 && !z14)) {
            h5.j jVar2 = this.f167487m;
            if (jVar2 != null) {
                V1(jVar2);
            }
            this.f167487m = null;
            X1();
        }
        this.f167479e = z15;
        this.f167480f = z16;
        this.f167481g = e1Var;
        this.f167482h = jVar;
        this.f167483i = xVar;
        boolean zY1 = Y1();
        this.f167490p = zY1;
        a3 a3Var = this.f167486l;
        if (a3Var != null) {
            a3Var.p2(e3Var, b2Var, this.f167484j ? this.f167489o : this.f167485k, z15, zY1, e1Var, jVar, xVar);
        }
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // h4.r.c
    public final void onAttach() {
        this.f167490p = Y1();
        X1();
        if (this.f167486l == null) {
            a3 a3Var = new a3(this.f167477c, this.f167484j ? this.f167489o : this.f167485k, this.f167481g, this.f167478d, this.f167479e, this.f167490p, this.f167482h, this.f167483i);
            U1(a3Var);
            this.f167486l = a3Var;
        }
    }

    @Override // h4.r.c
    public final void onDetach() {
        h5.j jVar = this.f167487m;
        if (jVar != null) {
            V1(jVar);
        }
    }

    @Override // h5.j
    public final void onLayoutDirectionChange() {
        boolean zY1 = Y1();
        if (this.f167490p != zY1) {
            this.f167490p = zY1;
            e3 e3Var = this.f167477c;
            p008y1.b2 b2Var = this.f167478d;
            boolean z14 = this.f167484j;
            Z1(e3Var, b2Var, z14, this.f167479e, this.f167481g, this.f167482h, this.f167483i, this.f167480f, z14 ? this.f167489o : this.f167485k);
        }
    }

    @Override // h5.i1
    public final void x1() {
        s1 s1Var = (s1) h5.i.a(this, t1.f167682a);
        if (p005kotlin.jvm.internal.s.g(s1Var, this.f167488n)) {
            return;
        }
        this.f167488n = s1Var;
        this.f167489o = null;
        h5.j jVar = this.f167487m;
        if (jVar != null) {
            V1(jVar);
        }
        this.f167487m = null;
        X1();
        a3 a3Var = this.f167486l;
        if (a3Var != null) {
            a3Var.p2(this.f167477c, this.f167478d, this.f167484j ? this.f167489o : this.f167485k, this.f167479e, this.f167490p, this.f167481g, this.f167482h, this.f167483i);
        }
    }
}
