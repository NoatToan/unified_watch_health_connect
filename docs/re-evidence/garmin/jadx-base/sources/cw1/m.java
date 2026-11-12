package cw1;

import c2.t2;
import i3.mh;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f56123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f56124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f56125d;

    public /* synthetic */ m(String str, s5.x0 x0Var, long j8) {
        this.f56122a = 0;
        this.f56125d = str;
        this.f56123b = x0Var;
        this.f56124c = j8;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f56122a) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    mh.c(this.f56125d, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(this.f56123b, this.f56124c, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar, 0, 0, 131070);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                ((t2) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    mVar2.C(-396997146);
                    mVar2.f();
                    s5.x0 x0VarA = s5.x0.a(this.f56123b, this.f56124c, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.h.f57752b.getClass();
                    mh.c(this.f56125d, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, mVar2, 0, 0, 130046);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.contacts.emergency.f.a aVar2 = com.garmin.android.apps.connectmobile.contacts.emergency.f.f32689b;
                ((t2) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    mVar3.C(-35247106);
                    mVar3.f();
                    s5.x0 x0VarA2 = s5.x0.a(this.f56123b, this.f56124c, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.h.f57752b.getClass();
                    mh.c(this.f56125d, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA2, mVar3, 0, 0, 130046);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m(s5.x0 x0Var, long j8, String str, int i14) {
        this.f56122a = i14;
        this.f56123b = x0Var;
        this.f56124c = j8;
        this.f56125d = str;
    }
}
