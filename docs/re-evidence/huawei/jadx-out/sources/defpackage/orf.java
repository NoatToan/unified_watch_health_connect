package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes13.dex */
public final class orf {
    public static void a(Context context, Intent intent) {
        if (context == null || intent == null) {
            ork.b("ActivityUtils", "startActivity params is null");
            return;
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ork.a("ActivityUtils", "startActivity Exception: ", e);
        }
    }

    public static void d(Activity activity, Intent intent, int i) {
        if (activity == null || intent == null) {
            ork.b("ActivityUtils", "startActivityForResult params is null");
            return;
        }
        try {
            activity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e) {
            ork.a("ActivityUtils", "startActivityForResult Exception: ", e);
        }
    }
}
