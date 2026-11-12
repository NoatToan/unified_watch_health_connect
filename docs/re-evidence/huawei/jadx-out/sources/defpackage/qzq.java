package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class qzq {
    public static void b(Activity activity, int i) {
        if (activity == null) {
            ReleaseLogUtil.e("DEVMGR_ContactConstantsAndUtils", "startAppSettingActivityForResult, activity is null");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        if (intent.resolveActivity(activity.getPackageManager()) == null) {
            ReleaseLogUtil.e("DEVMGR_ContactConstantsAndUtils", "startAppSettingActivityForResult, resolveActivity is null");
            return;
        }
        try {
            activity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException unused) {
            ReleaseLogUtil.a("DEVMGR_ContactConstantsAndUtils", "startAppSettingActivityForResult ActivityNotFoundException");
        }
    }
}
