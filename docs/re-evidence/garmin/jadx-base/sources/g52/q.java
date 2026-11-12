package g52;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.f f75976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd1.b f75977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f75978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z3.e f75979e;

    public /* synthetic */ q(i53.f fVar, yd1.b bVar, e23.l lVar, z3.e eVar, int i14, int i15) {
        this.f75975a = i15;
        this.f75976b = fVar;
        this.f75977c = bVar;
        this.f75978d = lVar;
        this.f75979e = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f75975a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(3073);
                r.b(this.f75976b, this.f75977c, this.f75978d, this.f75979e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(3073);
                xq1.j.b(this.f75976b, this.f75977c, this.f75978d, this.f75979e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
