package vu0;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f180239b;

    public /* synthetic */ f(j jVar, int i14, int i15) {
        this.f180238a = i15;
        this.f180239b = jVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f180238a;
        j jVar = this.f180239b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        int i15 = j.f180247o;
        switch (i14) {
            case 0:
                jVar.j(mVar, p0.t(1));
                break;
            case 1:
                jVar.k(mVar, p0.t(1));
                break;
            case 2:
                jVar.i(mVar, p0.t(1));
                break;
            case 3:
                jVar.m(mVar, p0.t(1));
                break;
            case 4:
                jVar.o(mVar, p0.t(1));
                break;
            case 5:
                jVar.g(mVar, p0.t(1));
                break;
            case 6:
                jVar.n(mVar, p0.t(1));
                break;
            case 7:
                jVar.h(mVar, p0.t(1));
                break;
            default:
                jVar.l(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
