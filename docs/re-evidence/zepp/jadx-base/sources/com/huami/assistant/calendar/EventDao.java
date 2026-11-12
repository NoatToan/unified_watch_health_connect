package com.huami.assistant.calendar;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.CalendarContract;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.util.AndroidPermissions;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class EventDao {
    private static final String a = "EventDao";
    private static final String c = "Zepp";
    private static final String d = "LOCAL";
    private static final String e = "begin ASC, end DESC, title ASC";
    private static final String f = "startDay ASC, endDay DESC, title ASC";
    private static final String g = "allDay=0";
    private static final String h = "allDay=1";
    private static final String o = "event_id=?";
    private static ConcurrentHashMap<Integer, Integer> i = new ConcurrentHashMap<>();
    private static long j = -1;
    private static final String b = "Amazfit";
    private static String k = b;
    private static final String[] l = {"event_id", "startDay", "endDay"};
    private static final String[] m = {"_id", "_sync_id", "title", "description", "dtstart", "dtend", "duration", "rrule", "allDay", "hasAlarm", "account_type"};
    private static final String[] n = {"_id", "minutes", "method"};

    private EventDao() {
    }

    private static Uri a(Uri uri) {
        return uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", k).appendQueryParameter("account_type", d).build();
    }

    private static void b(Context context, List<Event> events, Cursor cursor, int startDay, int endDay) throws Throwable {
        if (cursor == null || events == null) {
            Log.e(a, "buildEventsFromCursor: null cursor or null events list!", new Object[0]);
            return;
        }
        if (cursor.getCount() == 0) {
            return;
        }
        i.clear();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(cursor.getColumnIndex("startDay"));
            int i3 = cursor.getInt(cursor.getColumnIndex("endDay"));
            if (i2 <= endDay && i3 >= startDay) {
                int i4 = cursor.getInt(cursor.getColumnIndex("event_id"));
                if (i.get(Integer.valueOf(i4)) == null) {
                    i.put(Integer.valueOf(i4), Integer.valueOf(startDay));
                    List<Event> listQueryEvents = queryEvents(context, null, "_id=?", new String[]{String.valueOf(i4)}, false);
                    if (!ArraysUtil.isEmpty(listQueryEvents)) {
                        events.addAll(listQueryEvents);
                    }
                }
            }
        }
    }

    private static Event c(Context context, Cursor cursor) {
        int i2 = cursor.getInt(cursor.getColumnIndex("_id"));
        String string = cursor.getString(cursor.getColumnIndex("_sync_id"));
        String string2 = cursor.getString(cursor.getColumnIndex("title"));
        String string3 = cursor.getString(cursor.getColumnIndex("description"));
        boolean z = cursor.getInt(cursor.getColumnIndex("hasAlarm")) != 0;
        boolean z2 = cursor.getInt(cursor.getColumnIndex("allDay")) != 0;
        long j2 = cursor.getLong(cursor.getColumnIndex("dtstart"));
        long jG = cursor.getLong(cursor.getColumnIndex("dtend"));
        if (jG == 0) {
            jG = g(j2, cursor.getString(cursor.getColumnIndex("duration")));
        }
        String string4 = cursor.getString(cursor.getColumnIndex("rrule"));
        Event event = new Event();
        long j3 = i2;
        event.id = j3;
        event.syncId = string;
        event.title = string2;
        event.description = string3;
        event.startMillis = j2;
        event.endMillis = jG;
        event.hasAlarm = z;
        event.allDay = z2;
        event.rrule = string4;
        if (z) {
            List<Event.Reminder> listN = n(context, j3);
            if (!listN.isEmpty()) {
                event.reminderMinutes = listN.get(0).minutes;
            }
        }
        return event;
    }

    private static boolean d(Context context, Uri uri, int id) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriP = p(uri, id);
        boolean z = contentResolver.delete(uriP, null, null) >= 1;
        Log.d(a, "Delete <" + uriP + ">, Success : " + z, new Object[0]);
        return z;
    }

    public static boolean deleteAllEvents(@NonNull Context context) {
        if (!AndroidPermissions.checkGranted(context, "android.permission.WRITE_CALENDAR")) {
            return false;
        }
        int iDelete = context.getContentResolver().delete(a(CalendarContract.Events.CONTENT_URI), "deleted=0", null);
        boolean z = iDelete >= 0;
        Log.d(a, "Delete All Events, Success: " + z + ", Rows: " + iDelete, new Object[0]);
        return z;
    }

    public static boolean deleteCalendar(Context context, int accountId) {
        Uri uriA = a(CalendarContract.Calendars.CONTENT_URI);
        j = -1L;
        return d(context, uriA, accountId);
    }

    public static boolean deleteEvent(@NonNull Context context, int eventId) {
        return deleteEvent(context, eventId, false);
    }

    public static boolean deleteEventBySyncId(@NonNull Context context, @NonNull String syncId) {
        if (!AndroidPermissions.checkGranted(context, "android.permission.WRITE_CALENDAR")) {
            return false;
        }
        boolean z = context.getContentResolver().delete(CalendarContract.Events.CONTENT_URI, "_sync_id=?", new String[]{syncId}) >= 0;
        Log.d(a, "Delete Event by SyncId : " + syncId + ", Success : " + z, new Object[0]);
        return z;
    }

    public static boolean deleteEventsBySyncIds(@NonNull Context context, @NonNull String[] syncIds) {
        if (!AndroidPermissions.checkGranted(context, "android.permission.WRITE_CALENDAR")) {
            return false;
        }
        Uri uri = CalendarContract.Events.CONTENT_URI;
        int iDelete = context.getContentResolver().delete(uri, "_sync_id IN (" + ArraysUtil.join(syncIds, "'", "'", ",") + ")", null);
        boolean z = iDelete >= 0;
        Log.d(a, "Delete Events by SyncIds <" + ArraysUtil.toString(syncIds) + ">, Success: " + z + ", Rows: " + iDelete, new Object[0]);
        return z;
    }

    private static boolean e(Context context, Uri uri, long id) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriQ = q(uri, id);
        boolean z = contentResolver.delete(uriQ, null, null) >= 1;
        Log.d(a, "Delete <" + uriQ + ">, Success : " + z, new Object[0]);
        return z;
    }

    private static String f(long startMillis, long endMillis, boolean allDay) {
        if (endMillis < startMillis) {
            return allDay ? "P1D" : "P3600S";
        }
        if (allDay) {
            return "P" + ((((endMillis - startMillis) + 86400000) - 1) / 86400000) + LogUtil.D;
        }
        return "P" + ((endMillis - startMillis) / 1000) + ExifInterface.LATITUDE_SOUTH;
    }

    private static long g(long startMillis, String duration) {
        long millis;
        if (TextUtils.isEmpty(duration)) {
            millis = 0;
        } else {
            try {
                Duration duration2 = new Duration();
                duration2.parse(duration);
                millis = duration2.getMillis() + startMillis;
                if (millis < startMillis) {
                    millis = startMillis;
                }
            } catch (DateException e2) {
                android.util.Log.d(a, "Error parsing duration string " + duration, e2);
                millis = 0;
            }
        }
        return millis == 0 ? startMillis : millis;
    }

    private static void h(Context context) {
        if (j == -1) {
            if (k()) {
                k = c;
            } else {
                k = b;
            }
            long jM = m(context);
            j = jM;
            if (jM == -1) {
                j = i(context);
            }
        }
    }

    private static long i(Context context) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("account_name", k);
        contentValues.put("name", k);
        contentValues.put("calendar_displayName", k);
        contentValues.put("account_type", d);
        contentValues.put("calendar_access_level", (Integer) 700);
        contentValues.put("visible", (Integer) 1);
        contentValues.put("sync_events", (Integer) 1);
        contentValues.put("calendar_timezone", TimeZone.getDefault().getID());
        contentValues.put("canModifyTimeZone", (Integer) 1);
        contentValues.put("isPrimary", (Integer) 1);
        contentValues.put("canPartiallyUpdate", (Integer) 1);
        contentValues.put("ownerAccount", k);
        contentValues.put("canOrganizerRespond", (Integer) 0);
        Uri uriInsert = context.getContentResolver().insert(a(CalendarContract.Calendars.CONTENT_URI), contentValues);
        int iL = uriInsert != null ? l(uriInsert) : -1;
        Log.d(a, "Insert Calendar <" + k + ">, Id : " + iL, new Object[0]);
        return iL;
    }

    public static boolean insertEvent(@NonNull Context context, @NonNull Event event) {
        return insertEvent(context, event, false);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x001c A[PHI: r11
      0x001c: PHI (r11v3 java.lang.String) = (r11v1 java.lang.String), (r11v2 java.lang.String), (r11v2 java.lang.String) binds: [B:3:0x001a, B:6:0x0038, B:8:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    private static Cursor j(ContentResolver cr, String[] projection, int startDay, int endDay, String selection, String[] selectionArgs, String orderBy) {
        String[] strArr;
        String str;
        String[] strArr2 = {"1"};
        Uri.Builder builderBuildUpon = CalendarContract.Instances.CONTENT_BY_DAY_URI.buildUpon();
        ContentUris.appendId(builderBuildUpon, startDay);
        ContentUris.appendId(builderBuildUpon, endDay);
        String str2 = "visible=?";
        if (TextUtils.isEmpty(selection)) {
            str = str2;
            strArr = strArr2;
        } else {
            str2 = "(" + selection + ") AND visible=?";
            if (selectionArgs == null || selectionArgs.length <= 0) {
                str = str2;
                strArr = strArr2;
            } else {
                String[] strArr3 = (String[]) Arrays.copyOf(selectionArgs, selectionArgs.length + 1);
                strArr3[strArr3.length - 1] = strArr2[0];
                strArr = strArr3;
                str = str2;
            }
        }
        Uri uriBuild = builderBuildUpon.build();
        if (orderBy == null) {
            orderBy = "begin ASC";
        }
        return cr.query(uriBuild, projection, str, strArr, orderBy);
    }

    private static boolean k() {
        return GlobalConfig.get().isBuildMidong() && !GlobalConfig.get().isBuildAmazfit();
    }

    private static int l(Uri uri) {
        return (int) ContentUris.parseId(uri);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    private static int m(Context context) throws Throwable {
        int i2;
        int iO;
        if (ContextCompat.checkSelfPermission(context, "android.permission.READ_CALENDAR") != 0) {
            return -1;
        }
        String[] strArr = {"_id", "account_name"};
        Uri uri = CalendarContract.Calendars.CONTENT_URI;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            Cursor cursorQuery = contentResolver.query(uri, strArr, "account_name=?", new String[]{k}, "calendar_displayName");
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        cursorQuery.moveToNext();
                        iO = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                    } else {
                        iO = -1;
                    }
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                iO = -1;
            }
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Exception e2) {
                    i2 = iO;
                    e = e2;
                    Log.w(a, "QueryCalendarErr, Account: " + k, e, new Object[0]);
                    iO = i2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            i2 = -1;
            Log.w(a, "QueryCalendarErr, Account: " + k, e, new Object[0]);
            iO = i2;
            if (iO == -1) {
                iO = o(contentResolver, uri, strArr);
            }
            Log.d(a, "Query Calendar <" + k + ">, Id : " + iO, new Object[0]);
            return iO;
        }
        if (iO == -1 && k()) {
            iO = o(contentResolver, uri, strArr);
        }
        Log.d(a, "Query Calendar <" + k + ">, Id : " + iO, new Object[0]);
        return iO;
    }

    private static List<Event.Reminder> n(Context context, long eventId) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(CalendarContract.Reminders.CONTENT_URI, n, o, new String[]{String.valueOf(eventId)}, null, null);
                if (cursorQuery != null && cursorQuery.getCount() != 0) {
                    while (cursorQuery.moveToNext()) {
                        int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("minutes"));
                        int i3 = cursorQuery.getInt(cursorQuery.getColumnIndex("method"));
                        Event.Reminder reminder = new Event.Reminder();
                        reminder.minutes = i2;
                        reminder.method = i3;
                        arrayList.add(reminder);
                    }
                    cursorQuery.close();
                    return arrayList;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                Log.e(a, "buildEventsFromCursor: null cursor or null events list!", new Object[0]);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (Exception e2) {
                Log.d(a, e2.toString(), new Object[0]);
                if (0 != 0) {
                }
                return arrayList;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    private static int o(ContentResolver cr, Uri uri, String[] calendarsProjection) throws Throwable {
        int iUpdate = -1;
        try {
            Cursor cursorQuery = cr.query(uri, calendarsProjection, "account_name=?", new String[]{b}, "calendar_displayName");
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        cursorQuery.moveToNext();
                        int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                        try {
                            Uri uriBuild = uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", b).appendQueryParameter("account_type", d).build();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("account_name", c);
                            contentValues.put("name", c);
                            contentValues.put("calendar_displayName", c);
                            contentValues.put("ownerAccount", c);
                            try {
                                iUpdate = cr.update(p(uriBuild, i2), contentValues, null, null);
                            } catch (Exception e2) {
                                Log.w(a, "UpdateCalendarErr", e2, new Object[0]);
                            }
                            boolean z = true;
                            if (iUpdate != 1) {
                                z = false;
                            }
                            Log.d(a, "Update Calendar AccountName -> <Zepp>, Success: " + z, new Object[0]);
                            if (!z) {
                                k = b;
                            }
                            iUpdate = i2;
                        } catch (Throwable th) {
                            th = th;
                            iUpdate = i2;
                            try {
                                cursorQuery.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e3) {
            Log.w(a, "QueryCalendarErr, Account: " + b, e3, new Object[0]);
        }
        return iUpdate;
    }

    private static Uri p(Uri uri, int id) {
        return ContentUris.withAppendedId(uri, id);
    }

    private static Uri q(Uri uri, long id) {
        return ContentUris.withAppendedId(uri, id);
    }

    @Nullable
    public static List<Event> queryAddedEvents(Context context) {
        return queryEvents(context, null, "dirty=1 AND deleted=0", null, true);
    }

    @Nullable
    public static String[] queryDeletedEvents(@NonNull Context context) {
        Uri uriA = a(CalendarContract.Events.CONTENT_URI);
        String[] strArr = {"_sync_id"};
        ContentResolver contentResolver = context.getContentResolver();
        String[] strArr2 = null;
        if (Build.VERSION.SDK_INT >= 19) {
            Cursor cursorQuery = contentResolver.query(uriA, strArr, "dirty=1 AND deleted=1", null, null);
            if (cursorQuery != null) {
                try {
                    String[] strArr3 = new String[cursorQuery.getCount()];
                    if (cursorQuery.getCount() > 0) {
                        int i2 = 0;
                        while (cursorQuery.moveToNext()) {
                            int i3 = i2 + 1;
                            strArr3[i2] = cursorQuery.getString(0);
                            i2 = i3;
                        }
                    }
                    strArr2 = strArr3;
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        Log.d(a, "Query Deleted Events <AsSyncAdapter: true>, Result: " + ArraysUtil.toString(strArr2), new Object[0]);
        return strArr2;
    }

    public static List<Event> queryEvents(@NonNull Context context) {
        return queryEvents(context, null, "deleted=0", null, false);
    }

    public static List<Event> queryEventsWithDeleted(@NonNull Context context) {
        return queryEvents(context, null, null, null, true);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @NonNull
    public static List<Event> queryPhoneEventByInstances(Context context, int startDay, int days) throws Throwable {
        Cursor cursorJ;
        ArrayList arrayList = new ArrayList();
        Log.d(a, "QueryPhoneEvent", new Object[0]);
        int i2 = (days + startDay) - 1;
        Cursor cursorJ2 = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            String[] strArr = l;
            cursorJ = j(contentResolver, strArr, startDay, i2, h, null, f);
            try {
                try {
                    cursorJ2 = j(context.getContentResolver(), strArr, startDay, i2, g, null, e);
                    b(context, arrayList, cursorJ, startDay, i2);
                    b(context, arrayList, cursorJ2, startDay, i2);
                    if (cursorJ2 != null) {
                        cursorJ2.close();
                    }
                    if (cursorJ != null) {
                        cursorJ.close();
                    }
                    return arrayList;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (cursorJ2 != null) {
                        cursorJ2.close();
                    }
                    if (cursorJ != null) {
                        cursorJ.close();
                    }
                    return arrayList;
                }
            } catch (Throwable th) {
                th = th;
                if (cursorJ2 != null) {
                    cursorJ2.close();
                }
                if (cursorJ != null) {
                    cursorJ.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            cursorJ = null;
        } catch (Throwable th2) {
            th = th2;
            cursorJ = null;
            if (cursorJ2 != null) {
                cursorJ2.close();
            }
            if (cursorJ != null) {
                cursorJ.close();
            }
            throw th;
        }
    }

    public static boolean updateEventSyncId(Context context, int id, String syncId) {
        if (!AndroidPermissions.checkGranted(context, "android.permission.WRITE_CALENDAR")) {
            return false;
        }
        Uri uriP = p(a(CalendarContract.Events.CONTENT_URI), id);
        ContentValues contentValues = new ContentValues();
        contentValues.put("_sync_id", syncId);
        boolean z = context.getContentResolver().update(uriP, contentValues, null, null) >= 0;
        Log.d(a, "Update Event SyncId <Id: " + id + ", " + syncId + ">, Uri: " + uriP + "Success: " + z, new Object[0]);
        return z;
    }

    public static boolean updateEventSynced(Context context, int id) {
        Uri uriP = p(a(CalendarContract.Events.CONTENT_URI), id);
        ContentValues contentValues = new ContentValues();
        contentValues.put("dirty", (Integer) 0);
        boolean z = context.getContentResolver().update(uriP, contentValues, null, null) >= 0;
        Log.d(a, "Update Event Synced <Id: " + id + ">, Uri: " + uriP + "Success: " + z, new Object[0]);
        return z;
    }

    public static boolean deleteEvent(@NonNull Context context, int eventId, boolean syncAdapter) {
        Uri uriA = CalendarContract.Events.CONTENT_URI;
        if (syncAdapter) {
            uriA = a(uriA);
        }
        return d(context, uriA, eventId);
    }

    public static boolean insertEvent(@NonNull Context context, @NonNull Event event, boolean z) {
        long j2;
        if (!AndroidPermissions.checkGranted(context, "android.permission.WRITE_CALENDAR")) {
            return false;
        }
        h(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put("calendar_id", Long.valueOf(j));
        contentValues.put("title", event.title);
        contentValues.put("description", event.description);
        contentValues.put("dtstart", Long.valueOf(event.startMillis));
        if (TextUtils.isEmpty(event.rrule)) {
            contentValues.put("dtend", Long.valueOf(event.endMillis));
        } else {
            contentValues.put("rrule", event.rrule);
            contentValues.put("duration", f(event.startMillis, event.endMillis, event.allDay));
        }
        contentValues.put("hasAttendeeData", (Integer) 0);
        contentValues.put("eventStatus", (Integer) 1);
        contentValues.put("allDay", Integer.valueOf(event.allDay ? 1 : 0));
        contentValues.put("eventTimezone", TimeZone.getDefault().getID());
        boolean z2 = event.hasAlarm;
        contentValues.put("hasAlarm", Boolean.valueOf(z2));
        if (z) {
            contentValues.put("_sync_id", event.syncId);
            contentValues.put("dirty", (Integer) 0);
        }
        Uri uriA = CalendarContract.Events.CONTENT_URI;
        if (z) {
            uriA = a(uriA);
        }
        Log.d(a, "Insert Event Uri : " + uriA, new Object[0]);
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriInsert = contentResolver.insert(uriA, contentValues);
        long jL = -1;
        if (uriInsert != null) {
            long jL2 = l(uriInsert);
            if (z2) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jL2));
                contentValues2.put("minutes", Integer.valueOf(event.reminderMinutes));
                contentValues2.put("method", (Integer) 1);
                Uri uriA2 = CalendarContract.Reminders.CONTENT_URI;
                if (z) {
                    uriA2 = a(uriA2);
                }
                jL = l(contentResolver.insert(uriA2, contentValues2));
            }
            j2 = jL;
            jL = jL2;
        } else {
            j2 = -1;
        }
        Log.d(a, "Insert Event <" + contentValues + ", AsSyncAdapter : " + z + ">, Id : " + jL + ", ReminderId : " + j2, new Object[0]);
        return true;
    }

    @Nullable
    public static List<Event> queryEvents(@NonNull Context context, String[] strArr, String str, String[] strArr2, boolean z) throws Throwable {
        ArrayList arrayList;
        Uri uriA = CalendarContract.Events.CONTENT_URI;
        if (z) {
            uriA = a(uriA);
        }
        Uri uri = uriA;
        if (strArr == null) {
            strArr = m;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        ArrayList arrayList2 = null;
        cursor = null;
        cursor = null;
        if (Build.VERSION.SDK_INT >= 19) {
            Cursor cursorQuery = contentResolver.query(uri, strArr, str, strArr2, "_id DESC");
            if (cursorQuery != null) {
                try {
                    arrayList2 = new ArrayList(cursorQuery.getCount());
                    if (cursorQuery.getCount() > 0) {
                        while (cursorQuery.moveToNext()) {
                            arrayList2.add(c(context, cursorQuery));
                        }
                    }
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            Log.d(a, "Query Events <Projection: " + ArraysUtil.toString(strArr) + ", Selection: " + str + ", SelectionArgs: " + ArraysUtil.toString(strArr2) + ", AsSyncAdapter: " + z + ">, Result :" + ArraysUtil.toString(arrayList2), new Object[0]);
            return arrayList2;
        }
        try {
            try {
                Cursor cursorQuery2 = contentResolver.query(uri, strArr, str, strArr2, null);
                if (cursorQuery2 != null) {
                    try {
                        try {
                            if (cursorQuery2.getCount() != 0) {
                                arrayList = new ArrayList(cursorQuery2.getCount());
                                while (cursorQuery2.moveToNext()) {
                                    try {
                                        arrayList.add(c(context, cursorQuery2));
                                    } catch (Exception e2) {
                                        e = e2;
                                        cursor = cursorQuery2;
                                        e.printStackTrace();
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                    }
                                }
                                cursorQuery2.close();
                                return arrayList;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = cursorQuery2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        arrayList = null;
                    }
                }
                if (cursorQuery2 != null) {
                    cursorQuery2.close();
                }
                if (cursorQuery2 != null) {
                    cursorQuery2.close();
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e4) {
            e = e4;
            arrayList = null;
        }
    }

    public static boolean deleteEvent(@NonNull Context context, long eventId) {
        return deleteEvent(context, eventId, false);
    }

    public static boolean deleteEvent(@NonNull Context context, long eventId, boolean syncAdapter) {
        Uri uriA = CalendarContract.Events.CONTENT_URI;
        if (syncAdapter) {
            uriA = a(uriA);
        }
        return e(context, uriA, eventId);
    }

    public static boolean updateEventSynced(Context context, long id) {
        Uri uriQ = q(a(CalendarContract.Events.CONTENT_URI), id);
        ContentValues contentValues = new ContentValues();
        contentValues.put("dirty", (Integer) 0);
        boolean z = context.getContentResolver().update(uriQ, contentValues, null, null) >= 0;
        Log.d(a, "Update Event Synced <Id: " + id + ">, Uri: " + uriQ + "Success: " + z, new Object[0]);
        return z;
    }

    public static boolean updateEventSyncId(Context context, long id, String syncId) {
        if (!AndroidPermissions.checkGranted(context, "android.permission.WRITE_CALENDAR")) {
            return false;
        }
        Uri uriQ = q(a(CalendarContract.Events.CONTENT_URI), id);
        ContentValues contentValues = new ContentValues();
        contentValues.put("_sync_id", syncId);
        boolean z = context.getContentResolver().update(uriQ, contentValues, null, null) >= 0;
        Log.d(a, "Update Event SyncId <Id: " + id + ", " + syncId + ">, Uri: " + uriQ + "Success: " + z, new Object[0]);
        return z;
    }
}
