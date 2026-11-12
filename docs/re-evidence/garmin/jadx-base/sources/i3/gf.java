package i3;

import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gf implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f88250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f88251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f88252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f88253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f88254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f88255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f88256h;

    public /* synthetic */ gf(String str, String str2, i53.c cVar, boolean z14, boolean z15, e23.l lVar, int i14, int i15) {
        this.f88249a = 10;
        this.f88250b = str;
        this.f88254f = str2;
        this.f88255g = cVar;
        this.f88251c = z14;
        this.f88252d = z15;
        this.f88256h = lVar;
        this.f88253e = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f88249a) {
            case 0:
                ((Integer) obj2).getClass();
                hf.b((h4.r) this.f88250b, this.f88251c, this.f88252d, (ef) this.f88254f, (a2.i) this.f88255g, (o4.r1) this.f88256h, (p3.m) obj, p3.p0.t(this.f88253e | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ic1.b.a((h4.r) this.f88250b, (DateTime) this.f88254f, (Double) this.f88255g, this.f88251c, this.f88252d, (e23.l) this.f88256h, (p3.m) obj, p3.p0.t(this.f88253e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                iv0.t.a((pu0.b) this.f88250b, (String) this.f88254f, this.f88251c, this.f88252d, (e23.a) this.f88255g, (e23.l) this.f88256h, (p3.m) obj, p3.p0.t(this.f88253e | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                j02.p.a((j02.s) this.f88254f, this.f88255g, (h4.r) this.f88250b, this.f88251c, this.f88252d, (z3.e) this.f88256h, (p3.m) obj, p3.p0.t(this.f88253e | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((li0.c) this.f88250b).a((li0.d0) this.f88254f, this.f88251c, (e23.a) this.f88255g, this.f88252d, (li0.f) this.f88256h, (p3.m) obj, p3.p0.t(this.f88253e | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                lu1.c.a((h4.r) this.f88250b, this.f88251c, this.f88252d, (String) this.f88254f, (String) this.f88255g, (u4.d) this.f88256h, (p3.m) obj, p3.p0.t(this.f88253e | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                ml0.h.b((List) this.f88250b, this.f88251c, this.f88252d, (e23.a) this.f88254f, (e23.l) this.f88255g, (e23.l) this.f88256h, (p3.m) obj, p3.p0.t(this.f88253e | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                pp.a.a((yp.d) this.f88250b, (mp.k) this.f88254f, this.f88251c, this.f88252d, (e23.p) this.f88255g, (e23.p) this.f88256h, (p3.m) obj, p3.p0.t(this.f88253e | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                rg2.a.a((List) this.f88250b, (Map) this.f88254f, this.f88251c, (rf2.l) this.f88255g, (zf2.d) this.f88256h, this.f88252d, (p3.m) obj, p3.p0.t(this.f88253e | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((s12.f) this.f88250b).a((li0.d0) this.f88254f, this.f88251c, (e23.a) this.f88255g, this.f88252d, (li0.f) this.f88256h, (p3.m) obj, p3.p0.t(this.f88253e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(1);
                xv0.a.a((String) this.f88250b, (String) this.f88254f, (i53.c) this.f88255g, this.f88251c, this.f88252d, (e23.l) this.f88256h, (p3.m) obj, iT, this.f88253e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ gf(j02.s sVar, Object obj, h4.r rVar, boolean z14, boolean z15, z3.e eVar, int i14) {
        this.f88249a = 3;
        this.f88254f = sVar;
        this.f88255g = obj;
        this.f88250b = rVar;
        this.f88251c = z14;
        this.f88252d = z15;
        this.f88256h = eVar;
        this.f88253e = i14;
    }

    public /* synthetic */ gf(Object obj, Object obj2, boolean z14, boolean z15, o13.h hVar, o13.h hVar2, int i14, int i15) {
        this.f88249a = i15;
        this.f88250b = obj;
        this.f88254f = obj2;
        this.f88251c = z14;
        this.f88252d = z15;
        this.f88255g = hVar;
        this.f88256h = hVar2;
        this.f88253e = i14;
    }

    public /* synthetic */ gf(Object obj, boolean z14, boolean z15, Object obj2, Object obj3, Object obj4, int i14, int i15) {
        this.f88249a = i15;
        this.f88250b = obj;
        this.f88251c = z14;
        this.f88252d = z15;
        this.f88254f = obj2;
        this.f88255g = obj3;
        this.f88256h = obj4;
        this.f88253e = i14;
    }

    public /* synthetic */ gf(h4.r rVar, DateTime dateTime, Double d14, boolean z14, boolean z15, e23.l lVar, int i14) {
        this.f88249a = 1;
        this.f88250b = rVar;
        this.f88254f = dateTime;
        this.f88255g = d14;
        this.f88251c = z14;
        this.f88252d = z15;
        this.f88256h = lVar;
        this.f88253e = i14;
    }

    public /* synthetic */ gf(List list, Map map, boolean z14, rf2.l lVar, zf2.d dVar, boolean z15, int i14) {
        this.f88249a = 8;
        this.f88250b = list;
        this.f88254f = map;
        this.f88251c = z14;
        this.f88255g = lVar;
        this.f88256h = dVar;
        this.f88252d = z15;
        this.f88253e = i14;
    }

    public /* synthetic */ gf(li0.s sVar, li0.d0 d0Var, boolean z14, e23.a aVar, boolean z15, li0.f fVar, int i14, int i15) {
        this.f88249a = i15;
        this.f88250b = sVar;
        this.f88254f = d0Var;
        this.f88251c = z14;
        this.f88255g = aVar;
        this.f88252d = z15;
        this.f88256h = fVar;
        this.f88253e = i14;
    }
}
