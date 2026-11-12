package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.provider.Settings;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mxx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ContentObserver f42673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ContentResolver f42674c;

    public static void b(ContentResolver contentResolver, ContentObserver contentObserver, String str) {
        if (contentResolver == null || contentObserver == null) {
            LogUtil.j("StorePutBackUtils", "startListen: failure, parameter is null");
            return;
        }
        LogUtil.a("StorePutBackUtils", "startListen: start");
        f42674c = contentResolver;
        f42673b = contentObserver;
        contentResolver.registerContentObserver(Settings.Secure.getUriFor(str), true, contentObserver);
    }

    public static void e(Context context) {
        ContentObserver contentObserver;
        LogUtil.a("StorePutBackUtils", "stopListen: start");
        if (context == null) {
            LogUtil.j("StorePutBackUtils", "stopListen: context is null.");
            return;
        }
        ContentResolver contentResolver = f42674c;
        if (contentResolver == null || (contentObserver = f42673b) == null) {
            LogUtil.j("StorePutBackUtils", "stopListen: sCalendarResolver or sCalendarObserver is null.");
        } else {
            contentResolver.unregisterContentObserver(contentObserver);
        }
    }
}
