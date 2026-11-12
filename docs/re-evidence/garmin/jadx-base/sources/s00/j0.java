package s00;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.notifications.NotificationsActivity;

/* JADX INFO: loaded from: classes7.dex */
public class j0 extends j {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155300a;

        static {
            int[] iArr = new int[n00.c.values().length];
            f155300a = iArr;
            try {
                iArr[n00.c.WEIGHT_SCALE_INVITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f155300a[n00.c.WEIGHT_SCALE_REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void f(Context context, String str, String str2, Intent intent, int i14) {
        sz0.e eVar = sz0.e.f161380t;
        z6.q qVar = new z6.q(context, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.i(16, true);
        qVar.f202683e = z6.q.e(str);
        qVar.f202684f = z6.q.e(str2);
        z6.o oVar = new z6.o();
        oVar.f202664e = z6.q.e(str2);
        qVar.l(oVar);
        qVar.k(Settings.System.DEFAULT_NOTIFICATION_URI);
        qVar.B = "social";
        qVar.f202691m = 0;
        qVar.E = 0;
        if (intent != null) {
            qVar.f202686h = PendingIntent.getActivity(context, 0, intent, 1140850688);
        }
        sz0.f.a(context, qVar.c(), i14, eVar);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        if (y80.p0.f195202c) {
            return;
        }
        String string = bundle.getString("profile-fullname");
        String string2 = bundle.getString("device-name");
        int i14 = a.f155300a[cVar.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                return;
            }
            int iD = d(n00.c.WEIGHT_SCALE_REMOVED);
            String string3 = garminConnectMobileApp.getString(R.string.pn_smart_scale_user_removed);
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            if (TextUtils.isEmpty(string2)) {
                string2 = "";
            }
            f(garminConnectMobileApp, string3, garminConnectMobileApp.getString(R.string.pn_weight_scale_remove_format, string, string2), null, iD);
            return;
        }
        f12.l.f68084a.getClass();
        f12.l lVarA = f12.l.a.a();
        lVarA.r3(lVarA.y4() + 1);
        int iD2 = d(n00.c.WEIGHT_SCALE_INVITE);
        Intent intent = new Intent(garminConnectMobileApp, (Class<?>) NotificationsActivity.class);
        intent.addFlags(335544320);
        String string4 = garminConnectMobileApp.getString(R.string.pn_smart_scale_invitation_request_title);
        if (TextUtils.isEmpty(string)) {
            string = "";
        }
        if (TextUtils.isEmpty(string2)) {
            string2 = "";
        }
        f(garminConnectMobileApp, string4, garminConnectMobileApp.getString(R.string.pn_weight_scale_invite_format, string, string2), intent, iD2);
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.WEIGHT_SCALE_INVITE, n00.c.WEIGHT_SCALE_REMOVED, n00.c.WEIGHT_SCALE_MAX_USER};
    }
}
