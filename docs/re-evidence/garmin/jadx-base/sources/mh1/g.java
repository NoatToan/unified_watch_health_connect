package mh1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.model.g f118473b;

    public /* synthetic */ g(com.garmin.android.apps.connectmobile.userprofile.model.g gVar, int i14) {
        this.f118472a = i14;
        this.f118473b = gVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        String str2;
        String str3;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2;
        int i14 = this.f118472a;
        com.garmin.android.apps.connectmobile.userprofile.model.g gVar = this.f118473b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97901d.f97906e;
                    com.garmin.android.apps.connectmobile.userprofile.model.l lVar = gVar.f46859c;
                    if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (str = profileImageUrls.f46879h) == null) {
                        str = gVar.f46860d;
                    }
                    String str4 = str;
                    Long l14 = gVar.f46861e;
                    b12.k.b(null, null, f14, new b12.b(str4, null, f12.u.a(l14 != null ? (int) l14.longValue() : 0), null, null, 26, null), mVar, b12.b.f14385f << 9, 19);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tt1.l lVar2 = tt1.l.f166459a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarX = x2.x(aVar, h4.d.a.f81533k, 2);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = f72.s.a(t62.c.f162799a);
                    String strQ = gl1.y.Q(mVar2, R.string.permission_required);
                    if (gVar == null || (str2 = gVar.f46858b) == null) {
                        str2 = "";
                    }
                    b82.n.c(dVarA, strQ, gl1.y.P(R.string.msg_atp_permissions_required, new Object[]{str2}, mVar2), rVarX, null, mVar2, 3072, 16);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97901d.f97906e;
                    com.garmin.android.apps.connectmobile.userprofile.model.l lVar3 = gVar.f46859c;
                    if (lVar3 == null || (profileImageUrls2 = lVar3.getProfileImageUrls()) == null || (str3 = profileImageUrls2.f46879h) == null) {
                        str3 = gVar.f46860d;
                    }
                    String str5 = str3;
                    Long l15 = gVar.f46861e;
                    b12.k.b(null, null, f15, new b12.b(str5, null, f12.u.a(l15 != null ? (int) l15.longValue() : 0), null, null, 26, null), mVar3, b12.b.f14385f << 9, 19);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
