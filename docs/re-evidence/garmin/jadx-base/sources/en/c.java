package en;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import ds.e0;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Len/c;", "Lcom/garmin/android/apps/connectmobile/activities/deeplink/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", RemoteConfigConstants.RequestFieldKey.APP_ID, "connectIqAppStoreBaseUrl", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends com.garmin.android.apps.connectmobile.activities.deeplink.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f64648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f64650d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, String str, String str2) {
        super(context);
        e0.p(context, str, str2);
        this.f64648b = context;
        this.f64649c = str;
        this.f64650d = str2;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.deeplink.a
    public final Intent a() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f64650d + hb2.h.b() + "/apps/" + this.f64649c));
        intent.setFlags(335675392);
        List<ResolveInfo> listQueryIntentActivities = this.f64648b.getPackageManager().queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        return intent;
    }
}
