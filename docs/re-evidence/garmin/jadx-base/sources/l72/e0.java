package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0.a f110981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u4.d f110982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f110983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h4.r f110984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f110985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f110986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f110987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110988i;

    public /* synthetic */ e0(f0.a aVar, u4.d dVar, String str, h4.r rVar, boolean z14, e23.a aVar2, int i14, int i15, int i16) {
        this.f110980a = i16;
        this.f110981b = aVar;
        this.f110982c = dVar;
        this.f110983d = str;
        this.f110984e = rVar;
        this.f110985f = z14;
        this.f110986g = aVar2;
        this.f110987h = i14;
        this.f110988i = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f110980a;
        int i15 = this.f110987h;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0.a aVar = f0.a.f111000a;
                this.f110981b.k(p3.p0.t(i15 | 1), this.f110988i, this.f110986g, this.f110984e, this.f110983d, mVar, this.f110982c, this.f110985f);
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0.a aVar2 = f0.a.f111000a;
                this.f110981b.h(p3.p0.t(i15 | 1), this.f110988i, this.f110986g, this.f110984e, this.f110983d, mVar2, this.f110982c, this.f110985f);
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0.a aVar3 = f0.a.f111000a;
                this.f110981b.c(p3.p0.t(i15 | 1), this.f110988i, this.f110986g, this.f110984e, this.f110983d, mVar3, this.f110982c, this.f110985f);
                break;
        }
        return Unit.INSTANCE;
    }
}
