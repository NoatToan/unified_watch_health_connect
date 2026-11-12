package f10;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f67844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f67845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.c f67846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f67847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f67848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f67849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.l f67850h;

    public /* synthetic */ i(r rVar, i53.c cVar, i53.c cVar2, int i14, int i15, e23.l lVar, e23.l lVar2, int i16, int i17) {
        this.f67843a = i17;
        this.f67844b = rVar;
        this.f67845c = cVar;
        this.f67846d = cVar2;
        this.f67847e = i14;
        this.f67848f = i15;
        this.f67849g = lVar;
        this.f67850h = lVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f67843a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1769479);
                m.c(this.f67844b, this.f67845c, this.f67846d, this.f67847e, this.f67848f, this.f67849g, this.f67850h, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1769479);
                m.a(this.f67844b, this.f67845c, this.f67846d, this.f67847e, this.f67848f, this.f67849g, this.f67850h, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
