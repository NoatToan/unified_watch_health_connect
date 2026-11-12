package i3;

import java.util.ArrayList;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fi implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f88123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f5.v1 f88124c;

    public /* synthetic */ fi(ArrayList arrayList, f5.v1 v1Var, int i14) {
        this.f88122a = i14;
        this.f88123b = arrayList;
        this.f88124c = v1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f88122a;
        f5.v1 v1Var = this.f88124c;
        ArrayList arrayList = this.f88123b;
        f5.v1.a aVar = (f5.v1.a) obj;
        switch (i14) {
            case 0:
                bi.d dVar = bi.d.f87659a;
                aVar.r((f5.v1) arrayList.get(0), 0, 0, 0.0f);
                aVar.r((f5.v1) arrayList.get(1), ((f5.v1) arrayList.get(0)).f69144a, 0, 0.0f);
                aVar.r(v1Var, ((f5.v1) arrayList.get(0)).f69144a - (v1Var.f69144a / 2), 0, 0.0f);
                break;
            default:
                bi.h hVar = bi.h.f87673a;
                aVar.r((f5.v1) arrayList.get(0), 0, 0, 0.0f);
                aVar.r((f5.v1) arrayList.get(1), 0, ((f5.v1) arrayList.get(0)).f69145b, 0.0f);
                aVar.r(v1Var, 0, ((f5.v1) arrayList.get(0)).f69145b - (v1Var.f69145b / 2), 0.0f);
                break;
        }
        return Unit.INSTANCE;
    }
}
