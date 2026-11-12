package b82;

import ew1.b3;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16778a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f16782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f16785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f16786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f16787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f16788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f16789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o13.h f16790m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o13.h f16791n;

    public /* synthetic */ t(t0 t0Var, h4.r rVar, String str, String str2, Integer num, boolean z14, e23.l lVar, e23.l lVar2, int i14, int i15, e23.p pVar, int i16, int i17) {
        this.f16785h = t0Var;
        this.f16786i = rVar;
        this.f16787j = str;
        this.f16788k = str2;
        this.f16789l = num;
        this.f16779b = z14;
        this.f16782e = lVar;
        this.f16790m = lVar2;
        this.f16780c = i14;
        this.f16781d = i15;
        this.f16791n = pVar;
        this.f16783f = i16;
        this.f16784g = i17;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16778a;
        int i15 = this.f16783f;
        o13.h hVar = this.f16791n;
        o13.h hVar2 = this.f16790m;
        Object obj3 = this.f16789l;
        Object obj4 = this.f16788k;
        Object obj5 = this.f16787j;
        Object obj6 = this.f16786i;
        Object obj7 = this.f16785h;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                t0 t0Var = t0.f16792a;
                int iT = p3.p0.t(i15 | 1);
                ((t0) obj7).i((h4.r) obj6, (String) obj5, (String) obj4, (Integer) obj3, this.f16779b, this.f16782e, (e23.l) hVar2, this.f16780c, this.f16781d, (e23.p) hVar, (p3.m) obj, iT, this.f16784g);
                break;
            default:
                ((Integer) obj2).getClass();
                b3.a aVar = b3.f66335d;
                int iT2 = p3.p0.t(i15 | 1);
                int iT3 = p3.p0.t(this.f16784g);
                ((b3) obj7).A6((fg0.k) obj6, (List) obj5, (List) obj4, this.f16779b, this.f16780c, this.f16781d, (e23.a) obj3, (e23.a) hVar2, this.f16782e, (e23.a) hVar, (p3.m) obj, iT2, iT3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ t(b3 b3Var, fg0.k kVar, List list, List list2, boolean z14, int i14, int i15, e23.a aVar, e23.a aVar2, e23.l lVar, e23.a aVar3, int i16, int i17) {
        this.f16785h = b3Var;
        this.f16786i = kVar;
        this.f16787j = list;
        this.f16788k = list2;
        this.f16779b = z14;
        this.f16780c = i14;
        this.f16781d = i15;
        this.f16789l = aVar;
        this.f16790m = aVar2;
        this.f16782e = lVar;
        this.f16791n = aVar3;
        this.f16783f = i16;
        this.f16784g = i17;
    }
}
