package ox;

import android.content.Context;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgesActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.FollowerRequestsPrivacyActivity;
import ro0.l;
import s5.m;
import s5.n;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f134323b;

    public /* synthetic */ e(Context context, int i14) {
        this.f134322a = i14;
        this.f134323b = context;
    }

    @Override // s5.n
    public final void a(m mVar) {
        int i14 = this.f134322a;
        Context context = this.f134323b;
        switch (i14) {
            case 0:
                mVar.getClass();
                tn1.e.a(context, tn1.d.BODY_BATTERY, tn1.f.ENHANCED_MESSAGE);
                break;
            case 1:
                FollowerRequestsPrivacyActivity.a aVar = FollowerRequestsPrivacyActivity.f47109c;
                mVar.getClass();
                HelpActivity.a.e(HelpActivity.f36653a, this.f134323b, l.PROFILE_PRIVACY, null, null, 12);
                break;
            default:
                mVar.getClass();
                BadgesActivity.f30332j.getClass();
                context.startActivity(BadgesActivity.b.a(context, null, false));
                break;
        }
    }
}
