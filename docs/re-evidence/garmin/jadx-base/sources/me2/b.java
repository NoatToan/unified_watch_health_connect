package me2;

import java.util.List;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118123a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f118124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f118125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.c f118126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i53.c f118127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f118128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f118129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f118130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.a f118131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.l f118132j;

    public /* synthetic */ b(h4.r rVar, e eVar, i53.c cVar, i53.c cVar2, List list, int i14, boolean z14, e23.a aVar, e23.l lVar) {
        this.f118124b = rVar;
        this.f118125c = eVar;
        this.f118126d = cVar;
        this.f118127e = cVar2;
        this.f118128f = list;
        this.f118129g = i14;
        this.f118130h = z14;
        this.f118131i = aVar;
        this.f118132j = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f118123a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e.a aVar = e.f118163c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    y.f(this.f118124b, this.f118125c, this.f118126d, this.f118127e, this.f118128f, this.f118129g, this.f118130h, this.f118131i, this.f118132j, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                y.f(this.f118124b, this.f118125c, this.f118126d, this.f118127e, this.f118128f, this.f118129g, this.f118130h, this.f118131i, this.f118132j, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(h4.r rVar, e eVar, i53.c cVar, i53.c cVar2, List list, int i14, boolean z14, e23.a aVar, e23.l lVar, int i15) {
        this.f118124b = rVar;
        this.f118125c = eVar;
        this.f118126d = cVar;
        this.f118127e = cVar2;
        this.f118128f = list;
        this.f118129g = i14;
        this.f118130h = z14;
        this.f118131i = aVar;
        this.f118132j = lVar;
    }
}
