package b82;

import i3.bi;
import i3.ph;
import i3.ri;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16475g;

    public /* synthetic */ b2(int i14, i53.c cVar, i53.c cVar2, e23.a aVar, int i15, int i16) {
        this.f16469a = 4;
        this.f16471c = i14;
        this.f16474f = cVar;
        this.f16470b = cVar2;
        this.f16475g = aVar;
        this.f16472d = i15;
        this.f16473e = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16469a;
        int i15 = this.f16473e;
        int i16 = this.f16472d;
        Object obj3 = this.f16475g;
        Object obj4 = this.f16470b;
        Object obj5 = this.f16474f;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                d2 d2Var = d2.f16532a;
                int iT = p3.p0.t(i16 | 1);
                int i17 = this.f16471c;
                int i18 = this.f16473e;
                ((d2) obj5).g(i17, iT, i18, (h4.r) obj4, (p3.m) obj, (z3.e) obj3);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(1);
                ho.e0.a((h4.r) obj4, this.f16471c, this.f16472d, this.f16473e, (e23.l) obj5, (e23.l) obj3, (p3.m) obj, iT2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iT3 = p3.p0.t(i15 | 1);
                int i19 = this.f16471c;
                int i24 = this.f16472d;
                bi.n((h4.r) obj4, i19, (ri) obj5, i24, (ph) obj3, (p3.m) obj, iT3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iT4 = p3.p0.t(i15 | 1);
                int i25 = this.f16471c;
                int i26 = this.f16472d;
                wv0.s.c((h4.r) obj4, i25, (Integer) obj5, i26, (e23.l) obj3, (p3.m) obj, iT4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT5 = p3.p0.t(i16 | 1);
                int i27 = this.f16471c;
                ys1.h.a(i27, (i53.c) obj5, (i53.c) obj4, (e23.a) obj3, (p3.m) obj, iT5, this.f16473e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b2(d2 d2Var, int i14, h4.r rVar, z3.e eVar, int i15, int i16) {
        this.f16469a = 0;
        this.f16474f = d2Var;
        this.f16471c = i14;
        this.f16470b = rVar;
        this.f16475g = eVar;
        this.f16472d = i15;
        this.f16473e = i16;
    }

    public /* synthetic */ b2(h4.r rVar, int i14, int i15, int i16, e23.l lVar, e23.l lVar2, int i17) {
        this.f16469a = 1;
        this.f16470b = rVar;
        this.f16471c = i14;
        this.f16472d = i15;
        this.f16473e = i16;
        this.f16474f = lVar;
        this.f16475g = lVar2;
    }

    public /* synthetic */ b2(h4.r rVar, int i14, Object obj, int i15, Object obj2, int i16, int i17) {
        this.f16469a = i17;
        this.f16470b = rVar;
        this.f16471c = i14;
        this.f16474f = obj;
        this.f16472d = i15;
        this.f16475g = obj2;
        this.f16473e = i16;
    }
}
