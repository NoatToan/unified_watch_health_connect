package d81;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o82.a f58337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i81.a f58338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f58339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f58340e;

    public /* synthetic */ l(o82.a aVar, i81.a aVar2, e23.a aVar3, int i14, int i15) {
        this.f58336a = i15;
        this.f58337b = aVar;
        this.f58338c = aVar2;
        this.f58339d = aVar3;
        this.f58340e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f58336a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                r.b(this.f58337b, this.f58338c, this.f58339d, mVar, p0.t(this.f58340e | 1));
                break;
            default:
                x.b(this.f58337b, this.f58338c, this.f58339d, mVar, p0.t(this.f58340e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
