package q00;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.google.android.exoplayer2.analytics.m;
import com.google.firebase.messaging.FirebaseMessaging;
import f12.b;
import fb1.c;
import g22.n;
import java.util.concurrent.Executors;
import p005kotlin.Metadata;
import sz0.r0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lq00/a;", "", "Landroid/content/Context;", "appContext", "Lf12/b;", "userAccount", "Lo00/b;", "cloudMessagingRepo", "<init>", "(Landroid/content/Context;Lf12/b;Lo00/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f141978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o00.b f141979b;

    public a(Context context, b bVar, o00.b bVar2) {
        context.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.f141978a = bVar;
        this.f141979b = bVar2;
    }

    public final void a() {
        a2 a2Var = a2.CLOUD_MESSAGING;
        String str = a2Var.f28756a;
        i2.a aVar = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var2, str, "Unregistering for push notifications.");
        b bVar = this.f141978a;
        int i14 = 3;
        int i15 = bVar.f() ? 3 : 2;
        int userProfilePk = bVar.getUserProfilePk();
        if (i15 == 2) {
            FirebaseMessaging.getInstance().getToken().addOnCompleteListener(Executors.newSingleThreadExecutor(), new m(this, i15, userProfilePk, i14)).getClass();
            return;
        }
        int i16 = l00.a.f107830a;
        i2.a.b(a2Var2, a2Var.f28756a, "Unregistered Baidu Cloud Push.");
        b(i15, userProfilePk, GCMSettingManager.f41536b.getString(GCMSettingManager.f41535a.getString(R.string.key_baidu_cloud_push_user_registration_id), null));
    }

    public final void b(int i14, int i15, String str) {
        boolean zIsSuccessful;
        o00.b bVar = this.f141979b;
        if (n.d(str)) {
            try {
                zIsSuccessful = bVar.f128481a.b(new r0(str, i15, i14, n00.a.GCM.name(), false, false, false, false, null, null, 0L, 2032, null)).execute().f25745a.isSuccessful();
            } catch (Throwable th3) {
                String strN = c.n("unregisterCloudMessaging failed -> ", th3.getMessage());
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "CloudMessagingRepo", strN);
                zIsSuccessful = false;
            }
            if (zIsSuccessful) {
                String str2 = a2.CLOUD_MESSAGING.f28756a;
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var2, str2, "Successfully called Garmin Connect to unregistered for push notifications.");
                return;
            }
            String str3 = a2.CLOUD_MESSAGING.f28756a;
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var3, str3, "Failed to unregister for push notifications on Garmin Connect.");
        }
    }
}
