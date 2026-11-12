package li0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112740a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f112741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f112742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f112743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f112744e;

    public /* synthetic */ h0(h4.r rVar, e23.l lVar, float f14, int i14) {
        this.f112743d = rVar;
        this.f112744e = lVar;
        this.f112741b = f14;
        this.f112742c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f112740a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(this.f112742c | 1);
                k0.h((d0) this.f112743d, this.f112741b, (e) this.f112744e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(this.f112742c | 1);
                u11.a.b((h4.r) this.f112743d, (e23.l) this.f112744e, this.f112741b, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h0(d0 d0Var, float f14, e eVar, int i14) {
        this.f112743d = d0Var;
        this.f112741b = f14;
        this.f112744e = eVar;
        this.f112742c = i14;
    }
}
