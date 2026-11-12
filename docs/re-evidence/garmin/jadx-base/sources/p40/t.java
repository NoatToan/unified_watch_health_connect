package p40;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f135751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f135752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f135753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f135754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f135755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f135756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.l f135757h;

    public /* synthetic */ t(h4.r rVar, String str, String str2, String str3, e23.l lVar, e23.l lVar2, e23.l lVar3, int i14, int i15) {
        this.f135750a = i15;
        this.f135751b = rVar;
        this.f135752c = str;
        this.f135753d = str2;
        this.f135754e = str3;
        this.f135755f = lVar;
        this.f135756g = lVar2;
        this.f135757h = lVar3;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f135750a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(1794055);
                u.c(this.f135751b, this.f135752c, this.f135753d, this.f135754e, this.f135755f, this.f135756g, this.f135757h, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(1794055);
                r82.g.h(this.f135751b, this.f135752c, this.f135753d, this.f135754e, this.f135755f, this.f135756g, this.f135757h, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
