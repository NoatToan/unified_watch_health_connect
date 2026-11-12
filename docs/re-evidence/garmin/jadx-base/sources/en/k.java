package en;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Len/k;", "Lcom/garmin/android/apps/connectmobile/activities/deeplink/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends com.garmin.android.apps.connectmobile.activities.deeplink.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f64665b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        super(context);
        context.getClass();
        this.f64665b = context;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.deeplink.d
    public final Intent a() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://messenger.garmin.com"));
        intent.setFlags(335675392);
        List<ResolveInfo> listQueryIntentActivities = this.f64665b.getPackageManager().queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        return intent;
    }
}
