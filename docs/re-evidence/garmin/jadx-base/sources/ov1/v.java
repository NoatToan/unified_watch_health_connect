package ov1;

import java.util.List;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134233a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f134234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f134235c;

    public /* synthetic */ v(w wVar, p1 p1Var) {
        this.f134235c = wVar;
        this.f134234b = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f134233a;
        w wVar = this.f134235c;
        p1 p1Var = this.f134234b;
        switch (i14) {
            case 0:
                w.a aVar = w.f134236b;
                ((pv1.b) wVar.f134237a.getValue()).v5("FBTEditTriathlonSwimDaysFragment", new v(p1Var, wVar));
                break;
            default:
                w.a aVar2 = w.f134236b;
                ((pv1.b) wVar.f134237a.getValue()).D5(tu1.a.x((List) p1Var.getF182175a()));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ v(p1 p1Var, w wVar) {
        this.f134234b = p1Var;
        this.f134235c = wVar;
    }
}
