package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.CalendarContract;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mqs {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ContentResolver f42196c;
    private static ContentObserver d;

    public static void e(ContentResolver contentResolver, ContentObserver contentObserver) {
        if (contentResolver == null || contentObserver == null) {
            LogUtil.j("CalendarListenUtils", "startListen: failure, parameter is null");
        } else if (!mri.b()) {
            LogUtil.j("CalendarListenUtils", "startListen: no contact permission..");
        } else {
            c(contentResolver, contentObserver);
        }
    }

    public static void b(Context context) {
        ContentObserver contentObserver;
        LogUtil.a("CalendarListenUtils", "stopListen: start");
        if (context == null) {
            LogUtil.j("CalendarListenUtils", "stopListen: context is null.");
            return;
        }
        ContentResolver contentResolver = f42196c;
        if (contentResolver == null || (contentObserver = d) == null) {
            LogUtil.j("CalendarListenUtils", "stopListen: sCalendarResolver or sCalendarObserver is null.");
        } else {
            contentResolver.unregisterContentObserver(contentObserver);
        }
    }

    private static void c(ContentResolver contentResolver, ContentObserver contentObserver) {
        LogUtil.a("CalendarListenUtils", "listenCalendarEarlierApi24: start");
        f42196c = contentResolver;
        d = contentObserver;
        if (mri.d(BaseApplication.getContext())) {
            f42196c.registerContentObserver(Uri.parse("content://com.coloros.calendar/events"), true, d);
            f42196c.registerContentObserver(Uri.parse("content://com.coloros.calendar/calendars"), true, d);
        }
        f42196c.registerContentObserver(CalendarContract.Events.CONTENT_URI, true, d);
        f42196c.registerContentObserver(CalendarContract.Calendars.CONTENT_URI, true, d);
    }
}
