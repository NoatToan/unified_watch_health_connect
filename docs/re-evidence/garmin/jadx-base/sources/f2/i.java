package f2;

import c2.h2;
import p005kotlin.Unit;
import p008y1.e1;
import u1.r1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68205a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f68207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f68208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f68209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f68210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f68211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f68212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f68213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f68214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f68215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f68216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f68217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o13.h f68218n;

    public /* synthetic */ i(b bVar, h4.r rVar, p0 p0Var, h2 h2Var, c2.j.l lVar, c2.j.e eVar, e1 e1Var, boolean z14, r1 r1Var, e23.l lVar2, int i14, int i15, int i16) {
        this.f68210f = bVar;
        this.f68211g = rVar;
        this.f68212h = p0Var;
        this.f68213i = h2Var;
        this.f68214j = lVar;
        this.f68215k = eVar;
        this.f68216l = e1Var;
        this.f68207c = z14;
        this.f68217m = r1Var;
        this.f68218n = lVar2;
        this.f68206b = i14;
        this.f68208d = i15;
        this.f68209e = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f68205a;
        int i15 = this.f68208d;
        o13.h hVar = this.f68218n;
        Object obj3 = this.f68217m;
        Object obj4 = this.f68216l;
        Object obj5 = this.f68215k;
        Object obj6 = this.f68214j;
        Object obj7 = this.f68213i;
        Object obj8 = this.f68212h;
        Object obj9 = this.f68211g;
        Object obj10 = this.f68210f;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(this.f68206b | 1);
                int iT2 = p3.p0.t(i15);
                j.a((b) obj10, (h4.r) obj9, (p0) obj8, (h2) obj7, (c2.j.l) obj6, (c2.j.e) obj5, (e1) obj4, this.f68207c, (r1) obj3, (e23.l) hVar, (p3.m) obj, iT, iT2, this.f68209e);
                break;
            default:
                ((Integer) obj2).getClass();
                g82.c cVar = g82.c.f76436a;
                int iT3 = p3.p0.t(i15 | 1);
                ((g82.c) obj10).c((g82.c.a) obj9, (String) obj8, (String) obj7, this.f68206b, (String) obj6, (e23.a) obj5, (String) obj4, (e23.a) obj3, this.f68207c, (e23.a) hVar, (p3.m) obj, iT3, this.f68209e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(g82.c cVar, g82.c.a aVar, String str, String str2, int i14, String str3, e23.a aVar2, String str4, e23.a aVar3, boolean z14, e23.a aVar4, int i15, int i16) {
        this.f68210f = cVar;
        this.f68211g = aVar;
        this.f68212h = str;
        this.f68213i = str2;
        this.f68206b = i14;
        this.f68214j = str3;
        this.f68215k = aVar2;
        this.f68216l = str4;
        this.f68217m = aVar3;
        this.f68207c = z14;
        this.f68218n = aVar4;
        this.f68208d = i15;
        this.f68209e = i16;
    }
}
