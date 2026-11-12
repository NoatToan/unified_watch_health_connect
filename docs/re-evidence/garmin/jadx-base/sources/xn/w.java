package xn;

import java.util.List;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f191632b;

    public /* synthetic */ w(x xVar) {
        this.f191631a = 10;
        this.f191632b = xVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f191631a;
        x xVar = this.f191632b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.getClass();
                List<Integer> list = x.f191633p;
                xVar.m(mVar, p0.t(1));
                break;
            case 1:
                num.getClass();
                List<Integer> list2 = x.f191633p;
                xVar.s(mVar, p0.t(1));
                break;
            case 2:
                num.getClass();
                List<Integer> list3 = x.f191633p;
                xVar.g(mVar, p0.t(1));
                break;
            case 3:
                num.getClass();
                List<Integer> list4 = x.f191633p;
                xVar.q(mVar, p0.t(1));
                break;
            case 4:
                num.getClass();
                List<Integer> list5 = x.f191633p;
                xVar.n(mVar, p0.t(1));
                break;
            case 5:
                num.getClass();
                List<Integer> list6 = x.f191633p;
                xVar.h(mVar, p0.t(1));
                break;
            case 6:
                num.getClass();
                List<Integer> list7 = x.f191633p;
                xVar.l(mVar, p0.t(1));
                break;
            case 7:
                num.getClass();
                List<Integer> list8 = x.f191633p;
                xVar.r(mVar, p0.t(1));
                break;
            case 8:
                num.getClass();
                List<Integer> list9 = x.f191633p;
                xVar.k(mVar, p0.t(1));
                break;
            case 9:
                num.getClass();
                List<Integer> list10 = x.f191633p;
                xVar.i(mVar, p0.t(1));
                break;
            default:
                int iIntValue = num.intValue();
                List<Integer> list11 = x.f191633p;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    xVar.n(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ w(x xVar, int i14, int i15) {
        this.f191631a = i15;
        this.f191632b = xVar;
    }
}
