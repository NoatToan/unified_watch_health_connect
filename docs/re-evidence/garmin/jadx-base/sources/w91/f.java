package w91;

import lc.m0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ba1.d f183594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q91.d f183595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f183596d;

    public /* synthetic */ f(ba1.d dVar, q91.d dVar2, m0 m0Var, int i14) {
        this.f183593a = i14;
        this.f183594b = dVar;
        this.f183595c = dVar2;
        this.f183596d = m0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f183593a) {
            case 0:
                this.f183594b.I4(this.f183595c);
                m0 m0Var = this.f183596d;
                m0Var.n();
                lc.y.l(m0Var, y.e.INSTANCE);
                break;
            case 1:
                this.f183594b.I4(this.f183595c);
                y.e eVar = y.e.INSTANCE;
                this.f183596d.h(new w40.d(20), eVar);
                break;
            case 2:
                this.f183594b.I4(this.f183595c);
                m0 m0Var2 = this.f183596d;
                m0Var2.n();
                lc.y.l(m0Var2, y.e.INSTANCE);
                break;
            case 3:
                this.f183594b.I4(this.f183595c);
                m0 m0Var3 = this.f183596d;
                m0Var3.n();
                lc.y.l(m0Var3, y.e.INSTANCE);
                break;
            default:
                this.f183594b.I4(this.f183595c);
                y.e eVar2 = y.e.INSTANCE;
                this.f183596d.h(new w40.d(22), eVar2);
                break;
        }
        return Unit.INSTANCE;
    }
}
