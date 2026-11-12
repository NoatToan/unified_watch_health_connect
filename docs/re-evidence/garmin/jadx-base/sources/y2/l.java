package y2;

import b5.r0;
import b5.s0;
import b5.t0;
import b5.w;
import p005kotlin.Metadata;
import p3.y2;
import z2.q1;
import z2.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ly2/l;", "Lp3/y2;", "", "selectableId", "Lz2/q1;", "selectionRegistrar", "Lo4/d0;", "backgroundSelectionColor", "Ly2/p;", "params", "<init>", "(JLz2/q1;JLy2/p;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f194118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f194119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f194120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f194121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f194122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h4.r f194123f;

    private l(long j8, q1 q1Var, long j14, p pVar) {
        this.f194118a = j8;
        this.f194119b = q1Var;
        this.f194120c = j14;
        this.f194121d = pVar;
        k kVar = new k(this, 2);
        n nVar = new n(kVar, q1Var, j8);
        o oVar = new o(kVar, q1Var, j8);
        h4.r.a aVar = h4.r.S;
        m mVar = new m(oVar, nVar);
        b5.q qVar = s0.f15885a;
        r0 r0Var = new r0(oVar, nVar, null, mVar, 4, null);
        aVar.then(r0Var);
        w.f15928a.getClass();
        this.f194123f = t0.a(r0Var, w.a.f15931c);
    }

    @Override // p3.y2
    public final void onAbandoned() {
        y yVar = this.f194122e;
        if (yVar != null) {
            this.f194119b.a(yVar);
            this.f194122e = null;
        }
    }

    @Override // p3.y2
    public final void onForgotten() {
        y yVar = this.f194122e;
        if (yVar != null) {
            this.f194119b.a(yVar);
            this.f194122e = null;
        }
    }

    @Override // p3.y2
    public final void onRemembered() {
        this.f194122e = this.f194119b.i(new z2.n(this.f194118a, new k(this, 0), new k(this, 1)));
    }

    public /* synthetic */ l(long j8, q1 q1Var, long j14, p pVar, p005kotlin.jvm.internal.j jVar) {
        this(j8, q1Var, j14, pVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(long j8, q1 q1Var, long j14, p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 8) != 0) {
            p.f194136c.getClass();
            pVar = p.f194137d;
        }
        this(j8, q1Var, j14, pVar, null);
    }
}
