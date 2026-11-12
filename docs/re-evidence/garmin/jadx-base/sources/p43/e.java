package p43;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q43.p f135819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f135820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r43.g f135821d;

    static {
        new a(null);
    }

    public e(q43.p pVar, boolean z14) {
        pVar.getClass();
        this.f135819b = pVar;
        this.f135820c = z14;
        this.f135821d = r43.l.b(r43.h.STUB_TYPE_SCOPE, pVar.toString());
    }

    @Override // p43.n0
    public final List<t1> D0() {
        return p13.j0.f134944a;
    }

    @Override // p43.n0
    public final k1 E0() {
        k1.f135863b.getClass();
        return k1.f135864c;
    }

    @Override // p43.n0
    public final boolean G0() {
        return this.f135820c;
    }

    @Override // p43.n0
    public final n0 H0(q43.f fVar) {
        fVar.getClass();
        return this;
    }

    @Override // p43.f2
    /* JADX INFO: renamed from: K0 */
    public final f2 H0(q43.f fVar) {
        fVar.getClass();
        return this;
    }

    @Override // p43.v0, p43.f2
    public final f2 L0(k1 k1Var) {
        k1Var.getClass();
        return this;
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: M0 */
    public final v0 J0(boolean z14) {
        return z14 == this.f135820c ? this : O0(z14);
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: N0 */
    public final v0 L0(k1 k1Var) {
        k1Var.getClass();
        return this;
    }

    public abstract e1 O0(boolean z14);

    @Override // p43.n0
    public i43.l i() {
        return this.f135821d;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
