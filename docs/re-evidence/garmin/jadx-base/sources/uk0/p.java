package uk0;

import c2.t2;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171861a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f171862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f171863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4.r f171864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f171865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f171866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f171867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f171868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f171869i;

    public /* synthetic */ p(h4.r rVar, u4.d dVar, String str, float f14, String str2, String str3, int i14, int i15) {
        this.f171864d = rVar;
        this.f171867g = dVar;
        this.f171862b = str;
        this.f171865e = f14;
        this.f171868h = str2;
        this.f171869i = str3;
        this.f171863c = i14;
        this.f171866f = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f171861a;
        Object obj3 = this.f171869i;
        Object obj4 = this.f171868h;
        Object obj5 = this.f171867g;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(this.f171863c | 1);
                h4.r rVar = this.f171864d;
                String str = this.f171862b;
                float f14 = this.f171865e;
                q.a(rVar, (u4.d) obj5, str, f14, (String) obj4, (String) obj3, (p3.m) obj, iT, this.f171866f);
                break;
            default:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                ww.f.a aVar = ww.f.f187506i;
                int iT2 = p0.t(this.f171866f | 1);
                ((ww.f) obj5).l((t2) obj4, this.f171862b, this.f171863c, this.f171864d, this.f171865e, (h4.d.b) obj3, mVar, iT2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ p(ww.f fVar, t2 t2Var, String str, int i14, h4.r rVar, float f14, h4.d.b bVar, int i15) {
        this.f171867g = fVar;
        this.f171868h = t2Var;
        this.f171862b = str;
        this.f171863c = i14;
        this.f171864d = rVar;
        this.f171865e = f14;
        this.f171869i = bVar;
        this.f171866f = i15;
    }
}
