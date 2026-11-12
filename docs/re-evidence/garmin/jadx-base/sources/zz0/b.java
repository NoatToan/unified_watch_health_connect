package zz0;

import c2.l;
import c2.x2;
import com.garmin.android.apps.connectmobile.notifications.model.NotificationItem;
import e23.p;
import h4.r;
import i3.i7;
import lc.u0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationItem.Activity f207585b;

    public /* synthetic */ b(NotificationItem.Activity activity, int i14) {
        this.f207584a = i14;
        this.f207585b = activity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f207584a;
        NotificationItem.Activity activity = this.f207585b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = f.f207600m;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1135942819, new b(activity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = f.f207600m;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97900c.f97915g;
                    float f15 = j92.b.f97901d.f97905d;
                    r rVarE = u1.n.e(r.S, d92.b.a(mVar2).e().g(), k2.i.f102406a);
                    g6.f.a aVar = g6.f.f75994b;
                    i7.b(activity.getIconVector(), null, x2.q(l.y(rVarE, (f14 - f15) / 2), f15), u0.f(mVar2), mVar2, 48, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
