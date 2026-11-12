package f21;

import i3.fe;
import java.util.Calendar;
import java.util.List;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68569a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f68570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f68571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f68572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f68573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f68574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f68575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f68576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f68577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f68578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f68579k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f68580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f68581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f68582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f68583o;

    public /* synthetic */ k0(int i14, int i15, fe feVar, dy1.c cVar, boolean z14, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.l lVar, e23.a aVar5, e23.a aVar6, e23.a aVar7, int i16) {
        this.f68574f = i14;
        this.f68575g = i15;
        this.f68577i = feVar;
        this.f68571c = cVar;
        this.f68570b = z14;
        this.f68572d = aVar;
        this.f68573e = aVar2;
        this.f68578j = aVar3;
        this.f68579k = aVar4;
        this.f68580l = lVar;
        this.f68581m = aVar5;
        this.f68582n = aVar6;
        this.f68583o = aVar7;
        this.f68576h = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f68569a;
        int i15 = this.f68575g;
        int i16 = this.f68574f;
        Object obj3 = this.f68583o;
        Object obj4 = this.f68582n;
        Object obj5 = this.f68581m;
        Object obj6 = this.f68580l;
        Object obj7 = this.f68579k;
        Object obj8 = this.f68578j;
        Object obj9 = this.f68573e;
        Object obj10 = this.f68572d;
        Object obj11 = this.f68571c;
        Object obj12 = this.f68577i;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(i16 | 1);
                int iT2 = p0.t(i15);
                l0.b((b63.o) obj12, (String) obj11, (List) obj9, this.f68570b, (String) obj10, (List) obj8, (Float) obj7, (Float) obj6, (Float) obj5, (pi0.e) obj4, (v21.e) obj3, (p3.m) obj, iT, iT2, this.f68576h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(i16 | 1);
                int iT4 = p0.t(i15);
                g82.a.a(this.f68570b, (String) obj11, (String) obj10, (e23.a) obj12, (String) obj8, (e23.a) obj7, (List) obj9, (Calendar) obj6, (Calendar) obj5, (Calendar) obj4, (e23.l) obj3, (p3.m) obj, iT3, iT4, this.f68576h);
                break;
            case 2:
                ((Integer) obj2).getClass();
                l72.s sVar = l72.s.f111232a;
                int iT5 = p0.t(i16 | 1);
                int iT6 = p0.t(i15);
                ((l72.s) obj12).c((h4.r) obj9, (u4.d) obj8, (l72.s.a) obj7, (e23.p) obj6, (String) obj11, (String) obj10, (String) obj5, this.f68570b, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, iT5, iT6, this.f68576h);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT7 = p0.t(this.f68576h | 1);
                wx1.r.a(this.f68574f, this.f68575g, (fe) obj12, (dy1.c) obj11, this.f68570b, (e23.a) obj10, (e23.a) obj9, (e23.a) obj8, (e23.a) obj7, (e23.l) obj6, (e23.a) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, iT7);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k0(b63.o oVar, String str, List list, boolean z14, String str2, List list2, Float f14, Float f15, Float f16, pi0.e eVar, v21.e eVar2, int i14, int i15, int i16) {
        this.f68577i = oVar;
        this.f68571c = str;
        this.f68573e = list;
        this.f68570b = z14;
        this.f68572d = str2;
        this.f68578j = list2;
        this.f68579k = f14;
        this.f68580l = f15;
        this.f68581m = f16;
        this.f68582n = eVar;
        this.f68583o = eVar2;
        this.f68574f = i14;
        this.f68575g = i15;
        this.f68576h = i16;
    }

    public /* synthetic */ k0(l72.s sVar, h4.r rVar, u4.d dVar, l72.s.a aVar, e23.p pVar, String str, String str2, String str3, boolean z14, e23.a aVar2, e23.a aVar3, int i14, int i15, int i16) {
        this.f68577i = sVar;
        this.f68573e = rVar;
        this.f68578j = dVar;
        this.f68579k = aVar;
        this.f68580l = pVar;
        this.f68571c = str;
        this.f68572d = str2;
        this.f68581m = str3;
        this.f68570b = z14;
        this.f68582n = aVar2;
        this.f68583o = aVar3;
        this.f68574f = i14;
        this.f68575g = i15;
        this.f68576h = i16;
    }

    public /* synthetic */ k0(boolean z14, String str, String str2, e23.a aVar, String str3, e23.a aVar2, List list, Calendar calendar, Calendar calendar2, Calendar calendar3, e23.l lVar, int i14, int i15, int i16) {
        this.f68570b = z14;
        this.f68571c = str;
        this.f68572d = str2;
        this.f68577i = aVar;
        this.f68578j = str3;
        this.f68579k = aVar2;
        this.f68573e = list;
        this.f68580l = calendar;
        this.f68581m = calendar2;
        this.f68582n = calendar3;
        this.f68583o = lVar;
        this.f68574f = i14;
        this.f68575g = i15;
        this.f68576h = i16;
    }
}
