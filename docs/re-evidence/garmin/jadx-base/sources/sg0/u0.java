package sg0;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ue0.l f159170b;

    public /* synthetic */ u0(ue0.l lVar, int i14) {
        this.f159169a = i14;
        this.f159170b = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strA1;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        String strA2;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2;
        int i14 = this.f159169a;
        ue0.l lVar = this.f159170b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97901d.f97906e;
                    com.garmin.android.apps.connectmobile.userprofile.model.l lVar2 = lVar.f170208m;
                    if (lVar2 == null || (profileImageUrls = lVar2.getProfileImageUrls()) == null || (strA1 = profileImageUrls.f46879h) == null) {
                        strA1 = lVar.A1();
                    }
                    String str = strA1;
                    Long userLevel = lVar.getUserLevel();
                    b12.k.b(null, null, f14, new b12.b(str, null, f12.u.a(userLevel != null ? (int) userLevel.longValue() : 0), null, null, 26, null), mVar, b12.b.f14385f << 9, 19);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97901d.f97906e;
                    com.garmin.android.apps.connectmobile.userprofile.model.l lVar3 = lVar.f170208m;
                    if (lVar3 == null || (profileImageUrls2 = lVar3.getProfileImageUrls()) == null || (strA2 = profileImageUrls2.f46879h) == null) {
                        strA2 = lVar.A1();
                    }
                    String str2 = strA2;
                    Long userLevel2 = lVar.getUserLevel();
                    b12.k.b(null, null, f15, new b12.b(str2, null, f12.u.a(userLevel2 != null ? (int) userLevel2.longValue() : 0), null, null, 26, null), mVar2, b12.b.f14385f << 9, 19);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
