package en;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Len/b;", "Lcom/garmin/android/apps/connectmobile/activities/deeplink/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceId", "<init>", "(Landroid/content/Context;Ljava/lang/Long;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends com.garmin.android.apps.connectmobile.activities.deeplink.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f64646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f64647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, Long l14) {
        super(context);
        context.getClass();
        this.f64646b = context;
        this.f64647c = l14;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.deeplink.a
    public final Intent a() {
        Uri.Builder builderAuthority = new Uri.Builder().scheme("connectiq").authority("apps");
        builderAuthority.appendPath("");
        Long l14 = this.f64647c;
        if (l14 != null) {
            builderAuthority.appendQueryParameter("deviceId", String.valueOf(l14.longValue()));
        }
        Intent intent = new Intent("android.intent.action.VIEW", builderAuthority.build());
        intent.setFlags(335675392);
        List<ResolveInfo> listQueryIntentActivities = this.f64646b.getPackageManager().queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        return intent;
    }
}
