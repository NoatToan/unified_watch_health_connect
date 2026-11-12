package rn1;

import c2.t2;
import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f153649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mm1.a f153650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f153651d;

    public /* synthetic */ i(t2 t2Var, mm1.a aVar, int i14, int i15) {
        this.f153648a = i15;
        this.f153649b = t2Var;
        this.f153650c = aVar;
        this.f153651d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f153648a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                j.a(this.f153649b, this.f153650c, mVar, p0.t(this.f153651d | 1));
                break;
            case 1:
                j.e(this.f153649b, this.f153650c, mVar, p0.t(this.f153651d | 1));
                break;
            case 2:
                j.c(this.f153649b, this.f153650c, mVar, p0.t(this.f153651d | 1));
                break;
            case 3:
                j.g(this.f153649b, this.f153650c, mVar, p0.t(this.f153651d | 1));
                break;
            case 4:
                j.f(this.f153649b, this.f153650c, mVar, p0.t(this.f153651d | 1));
                break;
            default:
                j.d(this.f153649b, this.f153650c, mVar, p0.t(this.f153651d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
