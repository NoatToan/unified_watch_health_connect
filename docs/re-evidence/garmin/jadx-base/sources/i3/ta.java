package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ta implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89776a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f89777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4.r f89778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f89779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f89780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f89781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f89782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f89783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f89785j;

    public /* synthetic */ ta(e23.a aVar, h4.r rVar, long j8, float f14, long j14, int i14, float f15, int i15, int i16) {
        this.f89785j = aVar;
        this.f89778c = rVar;
        this.f89779d = j8;
        this.f89777b = f14;
        this.f89780e = j14;
        this.f89782g = i14;
        this.f89781f = f15;
        this.f89783h = i15;
        this.f89784i = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f89776a;
        int i15 = this.f89783h;
        Object obj3 = this.f89785j;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(i15 | 1);
                ua.b((e23.a) obj3, this.f89778c, this.f89779d, this.f89777b, this.f89780e, this.f89782g, this.f89781f, (p3.m) obj, iT, this.f89784i);
                break;
            default:
                ((Integer) obj2).getClass();
                l72.y2 y2Var = l72.y2.f111386a;
                int iT2 = p3.p0.t(i15 | 1);
                ((l72.y2) obj3).a(this.f89777b, this.f89781f, this.f89782g, iT2, this.f89784i, this.f89779d, this.f89780e, this.f89778c, (p3.m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ta(l72.y2 y2Var, float f14, h4.r rVar, long j8, long j14, float f15, int i14, int i15, int i16) {
        this.f89785j = y2Var;
        this.f89777b = f14;
        this.f89778c = rVar;
        this.f89779d = j8;
        this.f89780e = j14;
        this.f89781f = f15;
        this.f89782g = i14;
        this.f89783h = i15;
        this.f89784i = i16;
    }
}
