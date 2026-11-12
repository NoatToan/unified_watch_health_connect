package oe2;

import java.util.List;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131454a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f131455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f131456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.c f131457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i53.c f131458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f131459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f131460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f131461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.a f131462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f131463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e23.l f131464k;

    public /* synthetic */ b(h4.r rVar, e eVar, i53.c cVar, i53.c cVar2, List list, int i14, boolean z14, e23.a aVar, boolean z15, e23.l lVar) {
        this.f131455b = rVar;
        this.f131456c = eVar;
        this.f131457d = cVar;
        this.f131458e = cVar2;
        this.f131459f = list;
        this.f131460g = i14;
        this.f131461h = z14;
        this.f131462i = aVar;
        this.f131463j = z15;
        this.f131464k = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f131454a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e.a aVar = e.f131472d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    f0.c(this.f131455b, this.f131456c, this.f131457d, this.f131458e, this.f131459f, this.f131460g, this.f131461h, this.f131462i, this.f131463j, this.f131464k, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                f0.c(this.f131455b, this.f131456c, this.f131457d, this.f131458e, this.f131459f, this.f131460g, this.f131461h, this.f131462i, this.f131463j, this.f131464k, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(h4.r rVar, e eVar, i53.c cVar, i53.c cVar2, List list, int i14, boolean z14, e23.a aVar, boolean z15, e23.l lVar, int i15) {
        this.f131455b = rVar;
        this.f131456c = eVar;
        this.f131457d = cVar;
        this.f131458e = cVar2;
        this.f131459f = list;
        this.f131460g = i14;
        this.f131461h = z14;
        this.f131462i = aVar;
        this.f131463j = z15;
        this.f131464k = lVar;
    }
}
