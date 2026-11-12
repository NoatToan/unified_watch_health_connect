package b82;

import c2.t2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16923a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f16930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f16931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f16932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f16933k;

    public /* synthetic */ z1(int i14, int i15, int i16, int i17, mx1.b bVar, dy1.l lVar, e23.l lVar2, e23.a aVar, e23.a aVar2, e23.a aVar3, int i18) {
        this.f16924b = i14;
        this.f16925c = i15;
        this.f16926d = i16;
        this.f16927e = i17;
        this.f16928f = bVar;
        this.f16929g = lVar;
        this.f16930h = lVar2;
        this.f16931i = aVar;
        this.f16932j = aVar2;
        this.f16933k = aVar3;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16923a;
        Object obj3 = this.f16933k;
        Object obj4 = this.f16932j;
        Object obj5 = this.f16931i;
        Object obj6 = this.f16930h;
        Object obj7 = this.f16929g;
        Object obj8 = this.f16928f;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                d2 d2Var = d2.f16532a;
                int iT = p3.p0.t(this.f16926d | 1);
                ((d2) obj8).c((t2) obj7, (String) obj6, (String) obj5, (h4.r) obj4, (h4.d.b) obj3, this.f16924b, this.f16925c, (p3.m) obj, iT, this.f16927e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(7);
                xx1.i.a(this.f16924b, this.f16925c, this.f16926d, this.f16927e, (mx1.b) obj8, (dy1.l) obj7, (e23.l) obj6, (e23.a) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ z1(d2 d2Var, t2 t2Var, String str, String str2, h4.r rVar, h4.d.b bVar, int i14, int i15, int i16, int i17) {
        this.f16928f = d2Var;
        this.f16929g = t2Var;
        this.f16930h = str;
        this.f16931i = str2;
        this.f16932j = rVar;
        this.f16933k = bVar;
        this.f16924b = i14;
        this.f16925c = i15;
        this.f16926d = i16;
        this.f16927e = i17;
    }
}
