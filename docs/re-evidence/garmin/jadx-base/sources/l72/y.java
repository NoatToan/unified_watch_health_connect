package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f111370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4.r f111371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p f111372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f111373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f111374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f111375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f111376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111377i;

    public /* synthetic */ y(f0 f0Var, e23.p pVar, String str, h4.r rVar, boolean z14, e23.a aVar, int i14, int i15) {
        this.f111369a = 2;
        this.f111370b = f0Var;
        this.f111372d = pVar;
        this.f111373e = str;
        this.f111371c = rVar;
        this.f111374f = z14;
        this.f111375g = aVar;
        this.f111376h = i14;
        this.f111377i = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f111369a;
        int i15 = this.f111376h;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0 f0Var = f0.f110999a;
                this.f111370b.a(this.f111372d, this.f111373e, this.f111371c, this.f111374f, this.f111375g, mVar, p3.p0.t(i15 | 1), this.f111377i);
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0 f0Var2 = f0.f110999a;
                this.f111370b.h(this.f111372d, this.f111373e, this.f111371c, this.f111374f, this.f111375g, mVar2, p3.p0.t(i15 | 1), this.f111377i);
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0 f0Var3 = f0.f110999a;
                this.f111370b.e(this.f111372d, this.f111373e, this.f111371c, this.f111374f, this.f111375g, mVar3, p3.p0.t(i15 | 1), this.f111377i);
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0 f0Var4 = f0.f110999a;
                this.f111370b.j(this.f111372d, this.f111373e, this.f111371c, this.f111374f, this.f111375g, mVar4, p3.p0.t(i15 | 1), this.f111377i);
                break;
            default:
                p3.m mVar5 = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0 f0Var5 = f0.f110999a;
                this.f111370b.f(this.f111371c, this.f111372d, this.f111373e, this.f111374f, this.f111375g, mVar5, p3.p0.t(i15 | 1), this.f111377i);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ y(f0 f0Var, h4.r rVar, e23.p pVar, String str, boolean z14, e23.a aVar, int i14, int i15, int i16) {
        this.f111369a = i16;
        this.f111370b = f0Var;
        this.f111371c = rVar;
        this.f111372d = pVar;
        this.f111373e = str;
        this.f111374f = z14;
        this.f111375g = aVar;
        this.f111376h = i14;
        this.f111377i = i15;
    }
}
