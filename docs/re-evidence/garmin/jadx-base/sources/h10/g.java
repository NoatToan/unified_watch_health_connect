package h10;

import com.garmin.android.apps.connectmobile.R;
import fe2.z;
import p005kotlin.Unit;
import p3.x1;
import v62.o7;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f80766b;

    public /* synthetic */ g(h hVar, int i14) {
        this.f80765a = i14;
        this.f80766b = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f80765a;
        h hVar = this.f80766b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = h.D;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-529219265, new g(hVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = h.D;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = o7.a(t62.b.f162798a);
                    String string = hVar.getString(R.string.social_group_find_your_people);
                    String string2 = hVar.getString(R.string.social_group_empty_message_2);
                    string2.getClass();
                    String string3 = hVar.getString(R.string.social_group_search_groups);
                    boolean zR = mVar2.r(hVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new z(hVar, 25);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new z(hVar, 25);
                            mVar2.K(objQ);
                        }
                    }
                    b82.n.d(dVarA, string, string2, null, string3, (e23.a) objQ, null, null, mVar2, 0, 200);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
