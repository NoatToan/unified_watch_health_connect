package r;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICustomTabsService f148685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICustomTabsCallback f148686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentName f148687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f148688d;

    public g(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName, PendingIntent pendingIntent) {
        this.f148685a = iCustomTabsService;
        this.f148686b = iCustomTabsCallback;
        this.f148687c = componentName;
        this.f148688d = pendingIntent;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = this.f148688d;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        return bundle;
    }
}
