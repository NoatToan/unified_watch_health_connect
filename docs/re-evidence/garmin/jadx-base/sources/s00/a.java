package s00;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.training.atp.create.video.AtpVideoProxy;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.ArticleContentActivity;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/a;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends j {
    static {
        new C2945a(null);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        Intent intentB;
        garminConnectMobileApp.getClass();
        cVar.getClass();
        if (y80.p0.f195202c) {
            return;
        }
        String string = bundle.getString("pushnotification_atp_tip_body");
        if (TextUtils.isEmpty(string)) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "ATPPushNotification", "Empty push notification body pushnotification_atp_tip_body");
            return;
        }
        t00.a aVar2 = (t00.a) new iu1.g().b(t00.a.class, string);
        if (aVar2 == null) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "ATPPushNotification", "Error parsing pushnotification_atp_tip_body");
            return;
        }
        String title = aVar2.getTitle();
        if (title == null) {
            title = garminConnectMobileApp.getString(R.string.launcher_name_garmin_connect);
            title.getClass();
        }
        String str = title;
        String caption = aVar2.getCaption();
        if (caption == null) {
            caption = "";
        }
        String str2 = caption;
        String contentfulContentId = aVar2.getContentfulContentId();
        Long athletePlanId = aVar2.getAthletePlanId();
        if (aVar2.j() && contentfulContentId != null) {
            AtpVideoProxy.f45312d.getClass();
            intentB = new Intent(garminConnectMobileApp, (Class<?>) AtpVideoProxy.class);
            Bundle bundle2 = new Bundle();
            bundle2.putString("VIDEO_ID_EXTRA", contentfulContentId);
            intentB.putExtras(bundle2);
        } else if (!aVar2.h() || contentfulContentId == null) {
            intentB = (!aVar2.i() || athletePlanId == null) ? null : TrainingPlanDashboardActivity.a.b(TrainingPlanDashboardActivity.f45383n, garminConnectMobileApp, athletePlanId.longValue(), null, 60);
        } else {
            ArticleContentActivity.f45338g.getClass();
            intentB = new Intent(garminConnectMobileApp, (Class<?>) ArticleContentActivity.class);
            Bundle bundle3 = new Bundle();
            bundle3.putString("ARTICLE_ID_EXTRA", contentfulContentId);
            intentB.putExtras(bundle3);
        }
        if (intentB != null) {
            j.e(garminConnectMobileApp, sz0.e.f161382w, d(cVar), str, str2, j.c(garminConnectMobileApp, intentB));
            return;
        }
        i2.a aVar4 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar4.getClass();
        i2.a.f(a2Var3, "ATPPushNotification", "Unable to build intent for ATP Tip " + aVar2);
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.ATP_TIP};
    }

    /* JADX INFO: renamed from: s00.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ls00/a$a;", "", "<init>", "()V", "", "PUSH_NOTIFICATION_BODY", "Ljava/lang/String;", "TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2945a {
        public /* synthetic */ C2945a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2945a() {
        }
    }
}
