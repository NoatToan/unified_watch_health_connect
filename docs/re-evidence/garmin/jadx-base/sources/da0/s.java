package da0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import lc.u0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f58856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f58857c;

    public /* synthetic */ s(int i14, Object obj, Object obj2) {
        this.f58855a = i14;
        this.f58856b = obj;
        this.f58857c = obj2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f58855a;
        Object obj3 = this.f58857c;
        Object obj4 = this.f58856b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (p005kotlin.jvm.internal.s.g(obj4, obj3)) {
                        mVar.C(1587567501);
                        h4.r.a aVar = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i7.a(n5.c.a(R.drawable.check, mVar, 0), null, x2.q(aVar, j92.b.f97901d.f97904c), u0.f(mVar), mVar, 48, 0);
                        mVar.f();
                    } else {
                        mVar.C(1587900813);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (p005kotlin.jvm.internal.s.g(obj4, obj3)) {
                        mVar2.C(1756505036);
                        h4.r.a aVar2 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i7.a(n5.c.a(R.drawable.check, mVar2, 0), null, x2.q(aVar2, j92.b.f97901d.f97904c), u0.f(mVar2), mVar2, 48, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(1756873905);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
