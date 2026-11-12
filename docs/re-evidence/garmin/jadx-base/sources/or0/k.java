package or0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.l0;
import c.w;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import p3.x1;
import r1.c0;
import r53.b2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133350a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f133351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f133352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f133353d;

    public /* synthetic */ k(Activity activity, m mVar, e23.a aVar, int i14) {
        this.f133351b = activity;
        this.f133352c = mVar;
        this.f133353d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f133350a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                    m mVar2 = this.f133352c;
                    b2 b2Var = mVar2.f133368g;
                    b63.o oVar = mVar2.f133366e;
                    p1 p1VarC = s9.c.c(b2Var, mVar);
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        mVar.K(objQ);
                    }
                    p1 p1Var = (p1) objQ;
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        o82.g gVar = ((q) p1VarC.getF182175a()).f133399c;
                        o82.g gVar2 = ((q) p1VarC.getF182175a()).f133399c;
                        gVar2.getClass();
                        b63.o.INSTANCE.getClass();
                        objQ2 = new n82.f.a(gVar, new o82.a(b63.o.Companion.a(0), gVar2 == o82.g.f130850c ? mVar2.f133364c : oVar), ((q) p1VarC.getF182175a()).f133400d);
                        mVar.K(objQ2);
                    }
                    n82.f fVarA = n82.j.a((n82.f.a) objQ2, null, mVar, 2);
                    mVar2.f133370i.c(new o82.a(mVar2.f133365d, oVar), mVar);
                    lr0.a aVar = (lr0.a) KoinJavaComponent.get$default(lr0.a.class, null, null, 6, null);
                    g.h hVar = new g.h();
                    boolean zR = mVar.r(mVar2) | mVar.B(fVarA);
                    Object objQ3 = mVar.q();
                    if (zR || objQ3 == c2565a) {
                        objQ3 = new o50.a(9, mVar2, fVarA);
                        mVar.K(objQ3);
                    }
                    c.q qVarC = w.c(hVar, (e23.l) objQ3, mVar, 0);
                    boolean z14 = ((q) p1VarC.getF182175a()).f133397a;
                    e23.a aVar2 = this.f133353d;
                    Activity activity = this.f133351b;
                    z02.d.a(z14, z3.f.c(1012354451, new na0.a(aVar2, p1VarC, activity, p1Var, 15), mVar), null, null, null, z3.f.c(382151575, new l0(fVarA, mVar2, context, aVar, activity, qVarC, p1VarC, 23), mVar), mVar, 196656, 28);
                    c0.e(((Boolean) p1Var.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(-121720138, new ku1.l((Object) mVar2, (Object) context, y.P(R.string.wellness_goal_error, new Object[]{"150", "999999"}, mVar), (Object) p1VarC, (Object) p1Var, 10), mVar), mVar, 196608, 30);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                l.a(this.f133351b, this.f133352c, this.f133353d, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k(m mVar, e23.a aVar, Activity activity) {
        this.f133352c = mVar;
        this.f133353d = aVar;
        this.f133351b = activity;
    }
}
