package ok0;

import c80.u;
import java.util.Locale;
import l72.r1;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f132513b;

    public /* synthetic */ q(u uVar, int i14) {
        this.f132512a = i14;
        this.f132513b = uVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f132512a;
        u uVar = this.f132513b;
        e2.d dVar = (e2.d) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i14) {
            case 0:
                dVar.getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    r1.b(xy2.b.m(uVar, mVar), null, mVar, 0, 2);
                } else {
                    mVar.e();
                }
                break;
            default:
                dVar.getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String upperCase = xy2.b.m(uVar, mVar).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    r1.b(upperCase, null, mVar, 0, 2);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
