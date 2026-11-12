package yk1;

import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;
import xn.r;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StrideLengthSettingsActivity f197599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f197600c;

    public /* synthetic */ c(StrideLengthSettingsActivity strideLengthSettingsActivity, String str, int i14) {
        this.f197598a = i14;
        this.f197599b = strideLengthSettingsActivity;
        this.f197600c = str;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f197598a;
        String str = this.f197600c;
        StrideLengthSettingsActivity strideLengthSettingsActivity = this.f197599b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                StrideLengthSettingsActivity.a aVar = StrideLengthSettingsActivity.f44198b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(150720773, new c(strideLengthSettingsActivity, str, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                StrideLengthSettingsActivity.a aVar2 = StrideLengthSettingsActivity.f44198b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    v.a(g02.d.f74342a.c(strideLengthSettingsActivity.getOnBackPressedDispatcher()), z3.f.c(957900229, new c(strideLengthSettingsActivity, str, i15), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                StrideLengthSettingsActivity.a aVar3 = StrideLengthSettingsActivity.f44198b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    StrideLengthSettingsActivity strideLengthSettingsActivity2 = this.f197599b;
                    i iVar = (i) strideLengthSettingsActivity2.f44199a.getValue();
                    boolean zR = mVar3.r(strideLengthSettingsActivity2);
                    Object objQ = mVar3.q();
                    if (zR) {
                        objQ = new r(strideLengthSettingsActivity2, 21);
                        mVar3.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new r(strideLengthSettingsActivity2, 21);
                            mVar3.K(objQ);
                        }
                    }
                    strideLengthSettingsActivity2.ea(this.f197600c, iVar, (e23.a) objQ, mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
