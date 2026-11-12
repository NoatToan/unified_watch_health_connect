package c02;

import e23.p;
import h2.j0;
import h4.r;
import p005kotlin.Unit;
import p3.p0;
import qb0.t;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22380a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f22382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f22383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f22387h;

    public /* synthetic */ g(r rVar, i53.c cVar, p pVar, float f14, e23.l lVar, j0 j0Var, int i14, int i15) {
        this.f22381b = rVar;
        this.f22385f = cVar;
        this.f22386g = pVar;
        this.f22382c = f14;
        this.f22383d = lVar;
        this.f22387h = j0Var;
        this.f22384e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22380a) {
            case 0:
                ((Integer) obj2).getClass();
                h.b((r) this.f22381b, (Double) this.f22385f, (Double) this.f22386g, this.f22382c, this.f22383d, (String) this.f22387h, (p3.m) obj, p0.t(this.f22384e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT = p0.t(385);
                ds.j0.a((r) this.f22381b, (i53.c) this.f22385f, (p) this.f22386g, this.f22382c, this.f22383d, (j0) this.f22387h, this.f22384e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                t.b((String) this.f22387h, (String) this.f22381b, (o90.a) this.f22385f, this.f22382c, this.f22383d, (e23.a) this.f22386g, (p3.m) obj, p0.t(this.f22384e | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(r rVar, Double d14, Double d15, float f14, e23.l lVar, String str, int i14) {
        this.f22381b = rVar;
        this.f22385f = d14;
        this.f22386g = d15;
        this.f22382c = f14;
        this.f22383d = lVar;
        this.f22387h = str;
        this.f22384e = i14;
    }

    public /* synthetic */ g(String str, String str2, o90.a aVar, float f14, e23.l lVar, e23.a aVar2, int i14) {
        this.f22387h = str;
        this.f22381b = str2;
        this.f22385f = aVar;
        this.f22382c = f14;
        this.f22383d = lVar;
        this.f22386g = aVar2;
        this.f22384e = i14;
    }
}
