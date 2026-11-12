package gi0;

import com.garmin.android.apps.connectmobile.follow.domain.OthersFriendListActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.TeamChallengeActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.p0;
import mi0.j;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f77483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f77484c;

    public /* synthetic */ c(String str, String str2, int i14) {
        this.f77482a = i14;
        this.f77483b = str;
        this.f77484c = str2;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f77482a;
        String str = this.f77484c;
        String str2 = this.f77483b;
        switch (i14) {
            case 0:
                OthersFriendListActivity.a aVar = OthersFriendListActivity.f35271a;
                androidx.lifecycle.viewmodel.a aVar2 = new androidx.lifecycle.viewmodel.a(null, 1, null);
                j.f118892t.getClass();
                aVar2.b(j.f118894w, str2);
                aVar2.b(j.f118895x, str);
                return aVar2;
            case 1:
                TeamChallengeActivity.a aVar3 = TeamChallengeActivity.f37278g;
                return ParametersHolderKt.parametersOf(str2, str, Long.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()));
            default:
                p0.a aVar4 = p0.f37754d;
                return ParametersHolderKt.parametersOf(str2, str, Long.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()));
        }
    }
}
