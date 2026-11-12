package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.provider.CalendarContract;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes.dex */
public class qqe {
    public static boolean e(Context context) {
        return context != null && context.checkSelfPermission("android.permission.WRITE_CALENDAR") == 0 && context.checkSelfPermission("android.permission.READ_CALENDAR") == 0;
    }

    public static boolean a(ContentResolver contentResolver) {
        if (contentResolver == null) {
            return false;
        }
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient("com.huawei.calendar");
        LogUtil.a("AsyncCalendarUtils", "isSupportHWCalendarService:", Boolean.valueOf(contentProviderClientAcquireUnstableContentProviderClient != null));
        return contentProviderClientAcquireUnstableContentProviderClient != null;
    }

    public static int a(Context context) {
        int iC = c(context);
        if (iC < 0) {
            return 1;
        }
        LogUtil.a("AsyncCalendarUtils", "current id of CalendarAccount：" + iC);
        return iC;
    }

    private static int c(Context context) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(CalendarContract.Calendars.CONTENT_URI, null, null, null, null);
            try {
                if (cursorQuery == null) {
                    LogUtil.d("AsyncCalendarUtils", "userCursor null in checking CalendarAccount");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    if (cursorQuery.getCount() > 0) {
                        cursorQuery.moveToFirst();
                        int i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return i;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
                return 1;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLException unused) {
            LogUtil.c("AsyncCalendarUtils", "checkCalendarAccount error");
            return 1;
        }
    }
}
