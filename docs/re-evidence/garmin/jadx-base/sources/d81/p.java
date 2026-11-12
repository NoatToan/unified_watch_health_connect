package d81;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g81.c0 f58357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o82.a f58358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f58359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f58360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f58361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f58362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.a f58363h;

    public /* synthetic */ p(g81.c0 c0Var, o82.a aVar, int i14, int i15, e23.l lVar, e23.l lVar2, e23.a aVar2, int i16, int i17) {
        this.f58356a = i17;
        this.f58357b = c0Var;
        this.f58358c = aVar;
        this.f58359d = i14;
        this.f58360e = i15;
        this.f58361f = lVar;
        this.f58362g = lVar2;
        this.f58363h = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58356a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                r.a(this.f58357b, this.f58358c, this.f58359d, this.f58360e, this.f58361f, this.f58362g, this.f58363h, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                x.a(this.f58357b, this.f58358c, this.f58359d, this.f58360e, this.f58361f, this.f58362g, this.f58363h, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
