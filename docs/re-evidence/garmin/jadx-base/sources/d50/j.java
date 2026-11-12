package d50;

import e2.f0;
import p005kotlin.Unit;
import x91.r;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f57536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f57537c;

    public /* synthetic */ j(e23.l lVar, i53.c cVar) {
        this.f57535a = 1;
        this.f57536b = lVar;
        this.f57537c = cVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f57535a) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                i53.c cVar = this.f57537c;
                Object obj2 = null;
                if (cVar != null) {
                    for (Object obj3 : cVar) {
                        Long l14 = ((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) obj3).f39764a;
                        if (l14 != null && l14.longValue() == jLongValue) {
                            obj2 = obj3;
                            obj2 = (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) obj2;
                        }
                    }
                    obj2 = (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) obj2;
                }
                if (obj2 != null) {
                    this.f57536b.invoke(obj2);
                }
                break;
            case 1:
                this.f57536b.invoke(this.f57537c.get(((Integer) obj).intValue()));
                break;
            case 2:
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                wv0.i.f fVar = wv0.i.f.f187412a;
                i53.c cVar2 = this.f57537c;
                f0Var.a(cVar2.size(), null, new wv0.i.g(fVar, cVar2), new z3.e(802480018, true, new wv0.i.h(cVar2, this.f57536b)));
                break;
            case 3:
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                x91.j jVar = new x91.j(2);
                r.b bVar = r.b.f189635a;
                i53.c cVar3 = this.f57537c;
                f0Var2.a(cVar3.size(), new r.c(jVar, cVar3), new r.d(bVar, cVar3), new z3.e(802480018, true, new r.e(cVar3, this.f57536b)));
                break;
            default:
                f0 f0Var3 = (f0) obj;
                f0Var3.getClass();
                yq.d dVar = new yq.d(3);
                ys1.e.b bVar2 = ys1.e.b.f199172a;
                i53.c cVar4 = this.f57537c;
                f0Var3.a(cVar4.size(), new ys1.e.c(dVar, cVar4), new ys1.e.d(bVar2, cVar4), new z3.e(802480018, true, new ys1.e.C3732e(cVar4, this.f57536b)));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ j(int i14, e23.l lVar, i53.c cVar) {
        this.f57535a = i14;
        this.f57537c = cVar;
        this.f57536b = lVar;
    }
}
