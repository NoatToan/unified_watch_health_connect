package en;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Len/j;", "Lcom/garmin/android/apps/connectmobile/activities/deeplink/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "productNbr", "deviceName", "", "deviceId", "", "isChina", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends com.garmin.android.apps.connectmobile.activities.deeplink.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f64660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f64662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f64663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f64664f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, String str, String str2, Long l14, boolean z14) {
        super(context);
        context.getClass();
        this.f64660b = context;
        this.f64661c = str;
        this.f64662d = str2;
        this.f64663e = l14;
        this.f64664f = z14;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.deeplink.c
    public final Intent a() {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority(this.f64664f ? "connect.garmin.cn" : "connect.garmin.com").path("mobile-link/dive/pair-device").appendQueryParameter("productNumber", this.f64661c);
        Long l14 = this.f64663e;
        if (l14 != null) {
            builderAppendQueryParameter.appendQueryParameter("deviceId", String.valueOf(l14.longValue()));
        }
        Intent intent = new Intent("android.intent.action.VIEW", builderAppendQueryParameter.build());
        intent.setFlags(335675392);
        List<ResolveInfo> listQueryIntentActivities = this.f64660b.getPackageManager().queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        return intent;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.deeplink.c
    public final void c() {
        Context context = this.f64660b;
        String string = context.getString(R.string.diving_app_title);
        string.getClass();
        String string2 = context.getString(R.string.your_device_can_only_pair_with_app_software, this.f64662d, string);
        string2.getClass();
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(context).setTitle(context.getString(R.string.download_x, string)).setCancelable(false).setMessage(string2).setPositiveButton(R.string.lbl_download, new ai1.a(this, 28)).setNegativeButton(android.R.string.cancel, new com.garmin.android.apps.connectmobile.connectiq.i(25)).create();
        eVarCreate.getClass();
        eVarCreate.show();
        oe2.f.e(eVarCreate, 1.5f);
    }
}
