package tn;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f165484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f165485c;

    public /* synthetic */ o(r rVar, int i14, int i15) {
        this.f165483a = i15;
        this.f165484b = rVar;
        this.f165485c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f165483a;
        int i15 = this.f165485c;
        r rVar = this.f165484b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = r.f165491f;
        switch (i14) {
            case 0:
                rVar.i(mVar, p0.t(i15 | 1));
                break;
            case 1:
                rVar.g(mVar, p0.t(i15 | 1));
                break;
            case 2:
                rVar.k(mVar, p0.t(i15 | 1));
                break;
            case 3:
                rVar.j(mVar, p0.t(i15 | 1));
                break;
            case 4:
                rVar.h(mVar, p0.t(i15 | 1));
                break;
            case 5:
                rVar.m(mVar, p0.t(i15 | 1));
                break;
            case 6:
                rVar.n(mVar, p0.t(i15 | 1));
                break;
            case 7:
                rVar.o(mVar, p0.t(i15 | 1));
                break;
            default:
                rVar.l(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
