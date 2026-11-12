package en;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Len/l;", "Lcom/garmin/android/apps/connectmobile/activities/deeplink/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "devicePartNumber", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"QueryPermissionsNeeded"})
public final class l extends com.garmin.android.apps.connectmobile.activities.deeplink.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f64666b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, String str) {
        super(context);
        context.getClass();
        this.f64666b = context;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.deeplink.e
    public final Intent a() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("garminpilot://flightplan"));
        intent.setFlags(335675392);
        List<ResolveInfo> listQueryIntentActivities = this.f64666b.getPackageManager().queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        return intent;
    }

    public /* synthetic */ l(Context context, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : str);
    }
}
