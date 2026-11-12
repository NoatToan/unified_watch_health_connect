package defpackage;

import android.accounts.Account;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.example.habit.export.WeekDayBean;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.habit.bean.CalendarReminderEvent;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes8.dex */
public class ba3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f3971a = "content://com.android.calendar/calendars";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f3972b = "content://com.android.calendar/events";
    public static String c = "content://com.android.calendar/reminders";
    public static String d;
    public static String e;
    public static String f;
    public static String g;

    public static long a(Context context) {
        TimeZone timeZone = TimeZone.getDefault();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", d);
        contentValues.put("account_name", e);
        contentValues.put("account_type", f);
        contentValues.put("calendar_displayName", g);
        contentValues.put("visible", (Integer) 1);
        contentValues.put("calendar_color", (Integer) (-16776961));
        contentValues.put("calendar_access_level", (Integer) 700);
        contentValues.put("sync_events", (Integer) 1);
        contentValues.put("calendar_timezone", timeZone.getID());
        contentValues.put("ownerAccount", e);
        contentValues.put("canOrganizerRespond", (Integer) 0);
        Uri uriInsert = context.getContentResolver().insert(Uri.parse(f3971a).buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", e).appendQueryParameter("account_type", f).build(), contentValues);
        if (uriInsert == null) {
            return -1L;
        }
        return ContentUris.parseId(uriInsert);
    }

    public static boolean b(Context context, int i, String str, String str2, long j, long j2, String str3) {
        j();
        if (context == null) {
            return false;
        }
        if (i < 0 && (i = e(context)) < 0) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", str);
        contentValues.put("description", str2);
        contentValues.put("calendar_id", Integer.valueOf(i));
        contentValues.put("dtstart", Long.valueOf(j));
        contentValues.put("dtend", Long.valueOf(j2));
        contentValues.put("eventLocation", context.getString(b0j.f3656k));
        contentValues.put("sync_data1", context.getPackageName());
        contentValues.put("hasAlarm", (Integer) 1);
        if (str3 != null) {
            contentValues.put("rrule", str3);
        }
        contentValues.put("eventTimezone", TimeZone.getDefault().getID());
        Uri uriInsert = context.getContentResolver().insert(Uri.parse(f3972b).buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", e).appendQueryParameter("account_type", f).build(), contentValues);
        if (uriInsert == null) {
            return false;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("event_id", Long.valueOf(ContentUris.parseId(uriInsert)));
        contentValues2.put("minutes", (Integer) 0);
        contentValues2.put("method", (Integer) 1);
        return context.getContentResolver().insert(Uri.parse(c), contentValues2) != null;
    }

    public static boolean c(Context context, String str, List<CalendarReminderEvent> list) {
        boolean zB = false;
        if (list != null && !list.isEmpty()) {
            j();
            int iE = e(context);
            h(context, iE, str);
            for (CalendarReminderEvent calendarReminderEvent : list) {
                zB = b(context, iE, str, calendarReminderEvent.getDes(), calendarReminderEvent.getStartTime(), calendarReminderEvent.getEndTime(), calendarReminderEvent.getRule());
            }
        }
        return zB;
    }

    public static String d(WeekDayBean weekDayBean) {
        StringBuilder sb = new StringBuilder();
        sb.append("FREQ=WEEKLY;WKST=SU;BYDAY=");
        if (weekDayBean.getRest()) {
            sb.append("SA,");
            sb.append("SU,");
        } else if (weekDayBean.getWork()) {
            sb.append("MO,");
            sb.append("TU,");
            sb.append("WE,");
            sb.append("TH,");
            sb.append("FR,");
        } else {
            if (weekDayBean.getMon()) {
                sb.append("MO,");
            }
            if (weekDayBean.getTue()) {
                sb.append("TU,");
            }
            if (weekDayBean.getWeb()) {
                sb.append("WE,");
            }
            if (weekDayBean.getThu()) {
                sb.append("TH,");
            }
            if (weekDayBean.getFri()) {
                sb.append("FR,");
            }
            if (weekDayBean.getSat()) {
                sb.append("SA,");
            }
            if (weekDayBean.getSun()) {
                sb.append("SU,");
            }
        }
        String string = sb.toString();
        if (!string.endsWith(",")) {
            return null;
        }
        return string.substring(0, string.length() - 1) + ";";
    }

    public static int e(Context context) {
        int iF = f(context);
        if (iF >= 0) {
            return iF;
        }
        if (a(context) >= 0) {
            return f(context);
        }
        return -1;
    }

    public static int f(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse(f3971a), null, null, null, null);
        int i = -1;
        if (cursorQuery == null) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return -1;
        }
        try {
            try {
                if (cursorQuery.getCount() > 0) {
                    cursorQuery.moveToFirst();
                    while (!cursorQuery.isAfterLast()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("account_name"));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("account_type"));
                        String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("name"));
                        String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("calendar_displayName"));
                        if (string.equals(e) && string2.equals(f) && string3.equals(d)) {
                            i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                            if (!string4.equals(g)) {
                                cursorQuery.close();
                                cursorQuery = null;
                                try {
                                    if (k(context, i) > 0) {
                                        hfb.d("CALENDAR_REMINDERupdateCalendarAccount oldName:" + string4 + " newName:" + g);
                                    } else {
                                        hfb.d("CALENDAR_REMINDERupdateCalendarAccount oldName:" + string4 + " failure");
                                    }
                                    l(context, i);
                                } catch (Throwable th) {
                                    hfb.d("CALENDAR_REMINDERupdateCalendarAccount exception:" + v84.f(th));
                                }
                            }
                            hfb.a("CALENDAR_REMINDERcheckCalendarAccount id:" + i);
                            break;
                        }
                        cursorQuery.moveToNext();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                hfb.d("CALENDAR_REMINDERcheckCalendarAccount exception:" + v84.f(e2));
            }
            return i;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public static int g(Context context) {
        int iF;
        j();
        if (context == null || (iF = f(context)) < 0) {
            return -1;
        }
        return context.getContentResolver().delete(Uri.parse(f3972b), "((calendar_id = ?) AND (sync_data1 = ?))", new String[]{iF + "", context.getPackageName()});
    }

    public static boolean h(Context context, int i, String str) {
        j();
        boolean z = false;
        if (context == null) {
            return false;
        }
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse(f3972b), new String[]{"_id", "title"}, "((calendar_id = ?))", new String[]{i + ""}, null);
        if (cursorQuery == null) {
            return false;
        }
        try {
            try {
                if (cursorQuery.getCount() > 0) {
                    cursorQuery.moveToFirst();
                    boolean z2 = false;
                    while (!cursorQuery.isAfterLast()) {
                        try {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndex("title"));
                            if (!TextUtils.isEmpty(str) && str.equals(string)) {
                                z2 = context.getContentResolver().delete(ContentUris.withAppendedId(Uri.parse(f3972b), (long) cursorQuery.getInt(cursorQuery.getColumnIndex("_id"))), null, null) != -1;
                            }
                            cursorQuery.moveToNext();
                        } catch (Exception e2) {
                            e = e2;
                            z = z2;
                            e.printStackTrace();
                            hfb.d("CALENDAR_REMINDER" + v84.f(e));
                        }
                    }
                    z = z2;
                }
            } catch (Exception e3) {
                e = e3;
            }
            return z;
        } finally {
            cursorQuery.close();
        }
    }

    public static boolean i(Context context, String str) {
        j();
        int iF = f(context);
        if (iF == -1) {
            return false;
        }
        return h(context, iF, str);
    }

    public static void j() {
        if (e == null) {
            Account xiaomiAccount = XiaomiAccountManager.get(AppUtil.getApp()).getXiaomiAccount();
            e = xiaomiAccount.name;
            f = xiaomiAccount.type;
            g = AppUtil.getApp().getString(b0j.f3654a);
            d = "habit_calendar";
        }
    }

    public static int k(Context context, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("calendar_displayName", g);
        return context.getContentResolver().update(Uri.parse(f3971a).buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", e).appendQueryParameter("account_type", f).build(), contentValues, "((_id = ?))", new String[]{i + ""});
    }

    public static void l(Context context, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_data1", context.getPackageName());
        hfb.d("CALENDAR_REMINDERupdateEvents count:" + context.getContentResolver().update(Uri.parse(f3972b).buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", e).appendQueryParameter("account_type", f).build(), contentValues, "((calendar_id = ?))", new String[]{i + ""}));
    }
}
