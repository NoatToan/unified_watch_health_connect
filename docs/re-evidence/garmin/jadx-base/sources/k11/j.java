package k11;

import i3.fe;
import i3.mc;
import java.util.Map;
import lc.m0;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o13.h f102205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o13.h f102206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f102207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f102208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f102209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f102210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f102211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f102212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f102213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f102214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f102215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f102216m;

    public /* synthetic */ j(l72.s sVar, h4.r rVar, l72.s.b bVar, u4.d dVar, String str, s5.c cVar, String str2, e23.a aVar, b92.a aVar2, e23.a aVar3, int i14, int i15) {
        this.f102204a = 1;
        this.f102209f = sVar;
        this.f102210g = rVar;
        this.f102211h = bVar;
        this.f102212i = dVar;
        this.f102213j = str;
        this.f102214k = cVar;
        this.f102215l = str2;
        this.f102205b = aVar;
        this.f102216m = aVar2;
        this.f102206c = aVar3;
        this.f102207d = i14;
        this.f102208e = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f102204a;
        Object obj3 = this.f102210g;
        int i15 = this.f102207d;
        Object obj4 = this.f102216m;
        o13.h hVar = this.f102206c;
        o13.h hVar2 = this.f102205b;
        Object obj5 = this.f102215l;
        Object obj6 = this.f102214k;
        Object obj7 = this.f102213j;
        Object obj8 = this.f102212i;
        Object obj9 = this.f102211h;
        Object obj10 = this.f102209f;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                m.a((l11.a) obj10, (v21.e) obj3, (e01.a) obj9, (fe) obj8, (e23.p) obj7, (e23.p) obj6, (e23.p) obj5, (e23.a) hVar2, (e23.a) hVar, (e23.a) obj4, (p3.m) obj, p0.t(i15 | 1), this.f102208e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                l72.s sVar = l72.s.f111232a;
                ((l72.s) obj10).e((h4.r) obj3, (l72.s.b) obj9, (u4.d) obj8, (String) obj7, (s5.c) obj6, (String) obj5, (e23.a) hVar2, (b92.a) obj4, (e23.a) hVar, (p3.m) obj, p0.t(i15 | 1), this.f102208e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iT = p0.t(i15 | 1);
                nc.y.a((m0) obj10, this.f102210g, (h4.r) obj9, (h4.d) obj8, (Map) obj7, (e23.l) obj6, (e23.l) obj5, (e23.l) hVar2, (e23.l) hVar, (e23.l) obj4, (p3.m) obj, iT, this.f102208e);
                break;
            default:
                ((Integer) obj2).getClass();
                wv0.s.a((String) obj10, (Integer) obj3, (String) obj9, (i53.c) obj8, (Integer) obj7, (mc) obj6, (e23.l) obj5, (e23.a) hVar2, (e23.a) hVar, (e23.l) obj4, (p3.m) obj, p0.t(i15 | 1), p0.t(this.f102208e));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, o13.h hVar, o13.h hVar2, o13.h hVar3, o13.h hVar4, int i14, int i15, int i16) {
        this.f102204a = i16;
        this.f102209f = obj;
        this.f102210g = obj2;
        this.f102211h = obj3;
        this.f102212i = obj4;
        this.f102213j = obj5;
        this.f102214k = obj6;
        this.f102215l = hVar;
        this.f102205b = hVar2;
        this.f102206c = hVar3;
        this.f102216m = hVar4;
        this.f102207d = i14;
        this.f102208e = i15;
    }
}
