package en;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Len/f;", "Lcom/garmin/android/apps/connectmobile/activities/deeplink/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "activityId", "<init>", "(Landroid/content/Context;J)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends com.garmin.android.apps.connectmobile.activities.deeplink.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f64655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f64656c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, long j8) {
        super(context);
        context.getClass();
        this.f64655b = context;
        this.f64656c = j8;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.deeplink.c
    public final Intent a() {
        Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("diveapp").authority("activity").appendQueryParameter("activityId", String.valueOf(this.f64656c)).build());
        intent.setFlags(335675392);
        List<ResolveInfo> listQueryIntentActivities = this.f64655b.getPackageManager().queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        return intent;
    }
}
