package en;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Len/d;", "Lcom/garmin/android/apps/connectmobile/activities/deeplink/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "activityTypeId", "", "activityTypeName", "<init>", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends com.garmin.android.apps.connectmobile.activities.deeplink.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f64651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f64652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f64653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, Integer num, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.f64651b = context;
        this.f64652c = num;
        this.f64653d = str;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.deeplink.a
    public final Intent a() {
        Integer num = this.f64652c;
        if (num == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("connectiq").authority("apps").appendPath("activity").appendPath(String.valueOf(num.intValue())).appendPath("datafields").appendPath("").appendQueryParameter("activityTypeName", this.f64653d).build());
        intent.setFlags(335675392);
        List<ResolveInfo> listQueryIntentActivities = this.f64651b.getPackageManager().queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        return intent;
    }
}
