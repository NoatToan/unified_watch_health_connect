package by1;

import android.content.Context;
import lc.m0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ey1.a f22198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f22199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f22200d;

    public /* synthetic */ n(ey1.a aVar, Context context, m0 m0Var, int i14) {
        this.f22197a = i14;
        this.f22198b = aVar;
        this.f22199c = context;
        this.f22200d = m0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f22197a;
        m0 m0Var = this.f22200d;
        Context context = this.f22199c;
        ey1.a aVar = this.f22198b;
        switch (i14) {
            case 0:
                mx1.f fVar = (mx1.f) obj;
                o oVar = o.f22201a;
                fVar.getClass();
                aVar.W4(fVar);
                if (!fVar.d()) {
                    aVar.F4(context);
                }
                lc.y.k(w.f22220a.c(), m0Var);
                break;
            case 1:
                dy1.u uVar = (dy1.u) obj;
                v vVar = v.f22216a;
                uVar.getClass();
                aVar.G4(context, uVar);
                lc.y.k(cy1.c.f56798a.c(), m0Var);
                break;
            default:
                dy1.u uVar2 = (dy1.u) obj;
                cy1.b bVar = cy1.b.f56796a;
                uVar2.getClass();
                aVar.G4(context, uVar2);
                lc.y.k(cy1.c.f56798a.c(), m0Var);
                break;
        }
        return Unit.INSTANCE;
    }
}
