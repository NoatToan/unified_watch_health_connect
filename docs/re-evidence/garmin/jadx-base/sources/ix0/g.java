package ix0;

import e23.l;
import e23.p;
import h4.r;
import i3.mc;
import l72.p2;
import o4.d0;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95687a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f95688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f95689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f95690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f95691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f95692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f95693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f95694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f95695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f95696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f95697k;

    public /* synthetic */ g(mc mcVar, int i14, com.garmin.android.library.mapsdkadapter.i.d dVar, boolean z14, boolean z15, l lVar, l lVar2, l lVar3, e23.a aVar, int i15) {
        this.f95693g = mcVar;
        this.f95691e = i14;
        this.f95694h = dVar;
        this.f95689c = z14;
        this.f95690d = z15;
        this.f95688b = lVar;
        this.f95695i = lVar2;
        this.f95696j = lVar3;
        this.f95697k = aVar;
        this.f95692f = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f95687a;
        int i15 = this.f95691e;
        Object obj3 = this.f95697k;
        Object obj4 = this.f95696j;
        Object obj5 = this.f95695i;
        Object obj6 = this.f95688b;
        Object obj7 = this.f95694h;
        Object obj8 = this.f95693g;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int i16 = i.f95700f;
                int iT = p0.t(i15 | 1);
                ((i) obj8).j((String) obj7, (r) obj6, (d0) obj5, (Integer) obj4, this.f95689c, this.f95690d, (h4.d.b) obj3, (m) obj, iT, this.f95692f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                p2 p2Var = p2.f111205a;
                int iT2 = p0.t(i15 | 1);
                ((p2) obj8).f((r) obj6, (z3.e) obj7, (b92.a) obj5, this.f95689c, this.f95690d, (e23.a) obj4, (e23.a) obj3, (m) obj, iT2, this.f95692f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(this.f95692f | 1);
                rw0.l.a((mc) obj8, this.f95691e, (com.garmin.android.library.mapsdkadapter.i.d) obj7, this.f95689c, this.f95690d, (l) obj6, (l) obj5, (l) obj4, (e23.a) obj3, (m) obj, iT3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(i iVar, String str, r rVar, d0 d0Var, Integer num, boolean z14, boolean z15, h4.d.b bVar, int i14, int i15) {
        this.f95693g = iVar;
        this.f95694h = str;
        this.f95688b = rVar;
        this.f95695i = d0Var;
        this.f95696j = num;
        this.f95689c = z14;
        this.f95690d = z15;
        this.f95697k = bVar;
        this.f95691e = i14;
        this.f95692f = i15;
    }

    public /* synthetic */ g(p2 p2Var, r rVar, z3.e eVar, b92.a aVar, boolean z14, boolean z15, e23.a aVar2, e23.a aVar3, int i14, int i15) {
        this.f95693g = p2Var;
        this.f95688b = rVar;
        this.f95694h = eVar;
        this.f95695i = aVar;
        this.f95689c = z14;
        this.f95690d = z15;
        this.f95696j = aVar2;
        this.f95697k = aVar3;
        this.f95691e = i14;
        this.f95692f = i15;
    }
}
