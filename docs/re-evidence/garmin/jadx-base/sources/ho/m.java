package ho;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f84646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f84647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Double f84648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Double f84649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jo.a f84650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jo.a f84651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.q f84652h;

    public /* synthetic */ m(h4.r rVar, double d14, Double d15, Double d16, jo.a aVar, jo.a aVar2, e23.q qVar, int i14, int i15) {
        this.f84645a = i15;
        this.f84646b = rVar;
        this.f84647c = d14;
        this.f84648d = d15;
        this.f84649e = d16;
        this.f84650f = aVar;
        this.f84651g = aVar2;
        this.f84652h = qVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f84645a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                ge1.b.a(this.f84646b, this.f84647c, this.f84648d, this.f84649e, this.f84650f, this.f84651g, this.f84652h, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                s.a(this.f84646b, this.f84647c, this.f84648d, this.f84649e, this.f84650f, this.f84651g, this.f84652h, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
