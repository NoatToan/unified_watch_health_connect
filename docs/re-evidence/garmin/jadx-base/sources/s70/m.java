package s70;

import android.content.Context;
import java.util.Set;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157723a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f157724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f157725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bc0.a f157726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f157727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f157728f;

    public /* synthetic */ m(p3.p1 p1Var, bc0.a aVar, o53.b0 b0Var, o oVar, Context context) {
        this.f157728f = p1Var;
        this.f157726d = aVar;
        this.f157727e = b0Var;
        this.f157724b = oVar;
        this.f157725c = context;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f157723a) {
            case 0:
                p3.p1 p1Var = this.f157728f;
                Set set = (Set) p1Var.getF182175a();
                bc0.a aVar = this.f157726d;
                p1Var.setValue(p13.c1.i(set, Long.valueOf(aVar.f17403a)));
                ge1.b.T(this.f157727e, null, null, new o.d(this.f157724b, aVar, this.f157725c, p1Var, null), 3);
                break;
            default:
                o oVar = this.f157724b;
                n70.g gVar = oVar.f157749b;
                bc0.a aVar2 = this.f157726d;
                long j8 = aVar2.f17403a;
                Context context = this.f157725c;
                gVar.u(context, j8);
                sz0.f.f161394a.getClass();
                sz0.f.a.a(43, context);
                ge1.b.T(this.f157727e, null, null, new o.c(oVar, aVar2, this.f157728f, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m(o oVar, Context context, bc0.a aVar, o53.b0 b0Var, p3.p1 p1Var) {
        this.f157724b = oVar;
        this.f157725c = context;
        this.f157726d = aVar;
        this.f157727e = b0Var;
        this.f157728f = p1Var;
    }
}
