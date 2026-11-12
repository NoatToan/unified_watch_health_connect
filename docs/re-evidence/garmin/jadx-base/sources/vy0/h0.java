package vy0;

import com.garmin.android.apps.connectmobile.navigation.more.TestSearchActivity;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TestSearchActivity f180734b;

    public /* synthetic */ h0(TestSearchActivity testSearchActivity, int i14) {
        this.f180733a = 4;
        this.f180734b = testSearchActivity;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f180733a;
        int i15 = 2;
        TestSearchActivity testSearchActivity = this.f180734b;
        int i16 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i17 = TestSearchActivity.f39390b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1944119755, new h0(testSearchActivity, i16, objArr == true ? 1 : 0), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i18 = TestSearchActivity.f39390b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.d.a(false, z3.f.c(-1305034906, new h0(testSearchActivity, i15, objArr3 == true ? 1 : 0), mVar2), null, null, null, z3.f.c(-881911326, new h0(testSearchActivity, 3, objArr2 == true ? 1 : 0), mVar2), mVar2, 196656, 29);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i19 = TestSearchActivity.f39390b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    boolean zR = mVar3.r(testSearchActivity);
                    Object objQ = mVar3.q();
                    if (zR) {
                        objQ = new vc0.v(testSearchActivity, 18);
                        mVar3.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new vc0.v(testSearchActivity, 18);
                            mVar3.K(objQ);
                        }
                    }
                    z02.f.c(6, 54, null, (e23.a) objQ, null, "Test More menu search features", mVar3, null);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i24 = TestSearchActivity.f39390b;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    testSearchActivity.da(mVar4, 0);
                } else {
                    mVar4.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                int i25 = TestSearchActivity.f39390b;
                testSearchActivity.da((p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h0(TestSearchActivity testSearchActivity, int i14, byte b14) {
        this.f180733a = i14;
        this.f180734b = testSearchActivity;
    }
}
