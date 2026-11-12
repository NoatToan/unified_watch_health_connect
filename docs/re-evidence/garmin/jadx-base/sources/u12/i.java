package u12;

import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.FollowerRequestsPrivacyActivity;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FollowerRequestsPrivacyActivity f167793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f167794c;

    public /* synthetic */ i(FollowerRequestsPrivacyActivity followerRequestsPrivacyActivity, boolean z14, int i14) {
        this.f167792a = 2;
        this.f167793b = followerRequestsPrivacyActivity;
        this.f167794c = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f167792a;
        byte b14 = 0;
        boolean z14 = this.f167794c;
        FollowerRequestsPrivacyActivity followerRequestsPrivacyActivity = this.f167793b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                FollowerRequestsPrivacyActivity.a aVar = FollowerRequestsPrivacyActivity.f47109c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-923963092, new i(followerRequestsPrivacyActivity, z14, i15, b14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                FollowerRequestsPrivacyActivity.a aVar2 = FollowerRequestsPrivacyActivity.f47109c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    followerRequestsPrivacyActivity.ea(z14, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                FollowerRequestsPrivacyActivity.a aVar3 = FollowerRequestsPrivacyActivity.f47109c;
                followerRequestsPrivacyActivity.ea(z14, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(FollowerRequestsPrivacyActivity followerRequestsPrivacyActivity, boolean z14, int i14, byte b14) {
        this.f167792a = i14;
        this.f167793b = followerRequestsPrivacyActivity;
        this.f167794c = z14;
    }
}
