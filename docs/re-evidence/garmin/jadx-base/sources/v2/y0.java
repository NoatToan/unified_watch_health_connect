package v2;

import kotlin.a4;
import kotlin.c3;
import kotlin.m3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lv2/y0;", "Lh4/r$c;", "Li5/c3;", "Lh5/h;", "Lh5/u;", "Lv2/b1$a;", "Lv2/b1;", "serviceAdapter", "Ll2/b2;", "legacyTextFieldState", "Lz2/h2;", "textFieldSelectionManager", "<init>", "(Lv2/b1;Ll2/b2;Lz2/h2;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y0 extends h4.r.c implements c3, h5.h, h5.u, b1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b1 f175264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p006l2.b2 f175265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z2.h2 f175266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p3.c2 f175267d = p3.p0.n(null);

    public y0(b1 b1Var, p006l2.b2 b2Var, z2.h2 h2Var) {
        this.f175264a = b1Var;
        this.f175265b = b2Var;
        this.f175266c = h2Var;
    }

    @Override // v2.b1.a
    public final o53.c2 B1(a aVar) {
        if (getIsAttached()) {
            return ge1.b.T(getCoroutineScope(), null, o53.d0.UNDISPATCHED, new x0(this, aVar, null), 1);
        }
        return null;
    }

    @Override // v2.b1.a
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final z2.h2 getF175266c() {
        return this.f175266c;
    }

    @Override // v2.b1.a
    /* JADX INFO: renamed from: W, reason: from getter */
    public final p006l2.b2 getF175265b() {
        return this.f175265b;
    }

    @Override // v2.b1.a
    public final f5.c0 Z() {
        return (f5.c0) this.f175267d.getF182175a();
    }

    @Override // v2.b1.a
    public final m3 getSoftwareKeyboardController() {
        return (m3) h5.i.a(this, kotlin.t1.f91499q);
    }

    @Override // v2.b1.a
    public final a4 getViewConfiguration() {
        return (a4) h5.i.a(this, kotlin.t1.f91502t);
    }

    @Override // h5.u
    public final void o(h5.c1 c1Var) {
        this.f175267d.setValue(c1Var);
    }

    @Override // h4.r.c
    public final void onAttach() {
        b1 b1Var = this.f175264a;
        if (b1Var.f174890a != null) {
            b2.e.c("Expected textInputModifierNode to be null");
        }
        b1Var.f174890a = this;
    }

    @Override // h4.r.c
    public final void onDetach() {
        this.f175264a.j(this);
    }
}
