package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li3/e6;", "Li3/c6;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e6 extends c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m4.b0 f87948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f87949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1<Boolean> f87950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f87951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f87952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f87953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.m3 f87954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3.p1<y5> f87955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f87956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p3.n1 f87957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p3.n1 f87958k;

    /* JADX WARN: Multi-variable type inference failed */
    public e6(m4.b0 b0Var, boolean z14, p3.p1<Boolean> p1Var, String str, String str2, String str3, kotlin.m3 m3Var, p3.p1<y5> p1Var2, e23.l<? super Boolean, Unit> lVar, p3.n1 n1Var, p3.n1 n1Var2) {
        this.f87948a = b0Var;
        this.f87949b = z14;
        this.f87950c = p1Var;
        this.f87951d = str;
        this.f87952e = str2;
        this.f87953f = str3;
        this.f87954g = m3Var;
        this.f87955h = p1Var2;
        this.f87956i = lVar;
        this.f87957j = n1Var;
        this.f87958k = n1Var2;
    }

    @Override // i3.b6
    public final h4.r b(h4.r rVar, boolean z14) {
        return f5.g0.d(rVar, new b21.p9(z14, this.f87957j, this.f87958k, 5));
    }

    @Override // i3.b6
    public final boolean c() {
        return this.f87950c.getF182175a().booleanValue();
    }

    @Override // i3.b6
    public final String d() {
        return this.f87955h.getF182175a().f90407a;
    }

    @Override // i3.b6
    public final h4.r e(h4.r rVar, String str) {
        h4.r rVarA = m4.e.a(rVar, this.f87948a);
        p3.p1<y5> p1Var = this.f87955h;
        h4.r rVarThen = rVarA.then(new w5(new gp.f(26, str, p1Var)));
        h4.r.a aVar = h4.r.S;
        e23.l<Boolean, Unit> lVar = this.f87956i;
        boolean z14 = this.f87949b;
        an0.d dVar = new an0.d(lVar, str, p1Var, z14);
        int i14 = h6.f88295a;
        return rVarThen.then(p5.v.c(new b21.z8(str, z14, this.f87951d, this.f87952e, this.f87953f, dVar, this.f87954g), z4.f.c(b5.s0.b(aVar, dVar, new f6(str, dVar)), new g6(str, dVar, z14, this.f87950c)), false));
    }
}
