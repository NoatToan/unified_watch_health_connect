package t10;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import e23.s;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt10/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f161675a;

    public b(Context context) {
        context.getClass();
        this.f161675a = context;
    }

    public final void a(long j8, boolean z14, e23.l<? super Intent, Unit> lVar, s<? super String, ? super String, ? super String, ? super sz0.e, ? super PendingIntent, Unit> sVar) {
        GarminPayLaunchScreenActivity.a aVar = GarminPayLaunchScreenActivity.f35305d;
        kj0.a.C2012a c2012a = new kj0.a.C2012a(z14, j8);
        aVar.getClass();
        Context context = this.f161675a;
        Intent intentA = GarminPayLaunchScreenActivity.a.a(context, c2012a);
        if (z14) {
            intentA.addFlags(268435456);
            lVar.invoke(intentA);
            return;
        }
        String string = context.getString(R.string.connect);
        String strD = p6.b.d(context, R.string.alipay_applet_download_notification_message, string);
        String string2 = context.getString(R.string.alipay_applet_download_notification_message);
        string2.getClass();
        sz0.e eVar = sz0.e.F;
        PendingIntent activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
        activity.getClass();
        sVar.invoke(string, strD, string2, eVar, activity);
    }
}
