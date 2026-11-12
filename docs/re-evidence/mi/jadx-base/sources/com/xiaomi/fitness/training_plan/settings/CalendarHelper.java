package com.xiaomi.fitness.training_plan.settings;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import defpackage.k1j;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0015\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0003JH\u0010\u0018\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u0018\u0010\"\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0017H\u0002J\b\u0010%\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/training_plan/settings/CalendarHelper;", "", "<init>", "()V", "CALENDER_URL", "", "CALENDER_EVENT_URL", "CALENDARS_NAME", "CALENDARS_ACCOUNT_NAME", "CALENDARS_ACCOUNT_TYPE", "CALENDARS_DISPLAY_NAME", "TAG", "testCalendar", "", "context", "Landroid/content/Context;", "saveToCalendar", "", "list", "", "Lcom/xiaomi/fitness/training_plan/settings/CalendarHelper$CalendarReminderEvent;", "deleteCalendarEvent", "accountID", "", "addCalendarEvent", "title", "description", "reminderTime", "", "endReminderTime", "rule", "checkAndAddCalendarAccount", "addCalendarAccount", "checkCalendarAccount", "updateCalendar", "updateEvents", "calendarID", "init", "CalendarReminderEvent", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CalendarHelper {

    @Nullable
    private static String CALENDARS_ACCOUNT_NAME = null;

    @Nullable
    private static String CALENDARS_ACCOUNT_TYPE = null;

    @Nullable
    private static String CALENDARS_DISPLAY_NAME = null;

    @NotNull
    private static final String CALENDARS_NAME = "train_calendar";

    @NotNull
    private static final String TAG = "TrainingPlanCalendarHelper";

    @NotNull
    public static final CalendarHelper INSTANCE = new CalendarHelper();

    @NotNull
    private static final String CALENDER_URL = "content://com.android.calendar/calendars";

    @NotNull
    private static final String CALENDER_EVENT_URL = "content://com.android.calendar/events";

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/training_plan/settings/CalendarHelper$CalendarReminderEvent;", "", "title", "", "des", "startTime", "", "endTime", "rule", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDes", "getStartTime", "()J", "getEndTime", "getRule", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CalendarReminderEvent {

        @NotNull
        private final String des;
        private final long endTime;

        @NotNull
        private final String rule;
        private final long startTime;

        @NotNull
        private final String title;

        public CalendarReminderEvent(@NotNull String title, @NotNull String des, long j, long j2, @NotNull String rule) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(des, "des");
            Intrinsics.checkNotNullParameter(rule, "rule");
            this.title = title;
            this.des = des;
            this.startTime = j;
            this.endTime = j2;
            this.rule = rule;
        }

        public static /* synthetic */ CalendarReminderEvent copy$default(CalendarReminderEvent calendarReminderEvent, String str, String str2, long j, long j2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = calendarReminderEvent.title;
            }
            if ((i & 2) != 0) {
                str2 = calendarReminderEvent.des;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                j = calendarReminderEvent.startTime;
            }
            long j3 = j;
            if ((i & 8) != 0) {
                j2 = calendarReminderEvent.endTime;
            }
            long j4 = j2;
            if ((i & 16) != 0) {
                str3 = calendarReminderEvent.rule;
            }
            return calendarReminderEvent.copy(str, str4, j3, j4, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDes() {
            return this.des;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getEndTime() {
            return this.endTime;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getRule() {
            return this.rule;
        }

        @NotNull
        public final CalendarReminderEvent copy(@NotNull String title, @NotNull String des, long startTime, long endTime, @NotNull String rule) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(des, "des");
            Intrinsics.checkNotNullParameter(rule, "rule");
            return new CalendarReminderEvent(title, des, startTime, endTime, rule);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CalendarReminderEvent)) {
                return false;
            }
            CalendarReminderEvent calendarReminderEvent = (CalendarReminderEvent) other;
            return Intrinsics.areEqual(this.title, calendarReminderEvent.title) && Intrinsics.areEqual(this.des, calendarReminderEvent.des) && this.startTime == calendarReminderEvent.startTime && this.endTime == calendarReminderEvent.endTime && Intrinsics.areEqual(this.rule, calendarReminderEvent.rule);
        }

        @NotNull
        public final String getDes() {
            return this.des;
        }

        public final long getEndTime() {
            return this.endTime;
        }

        @NotNull
        public final String getRule() {
            return this.rule;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.des.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31) + this.rule.hashCode();
        }

        @NotNull
        public String toString() {
            return "CalendarReminderEvent(title=" + this.title + ", des=" + this.des + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", rule=" + this.rule + ")";
        }
    }

    private CalendarHelper() {
    }

    private final long addCalendarAccount(Context context) {
        TimeZone timeZone = TimeZone.getDefault();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", CALENDARS_NAME);
        contentValues.put("account_name", CALENDARS_ACCOUNT_NAME);
        contentValues.put("account_type", CALENDARS_ACCOUNT_TYPE);
        contentValues.put("calendar_displayName", CALENDARS_DISPLAY_NAME);
        contentValues.put("visible", (Integer) 1);
        contentValues.put("calendar_color", (Integer) (-16776961));
        contentValues.put("calendar_access_level", (Integer) 700);
        contentValues.put("sync_events", (Integer) 1);
        contentValues.put("calendar_timezone", timeZone.getID());
        contentValues.put("ownerAccount", CALENDARS_ACCOUNT_NAME);
        contentValues.put("canOrganizerRespond", (Integer) 0);
        Uri uriInsert = context.getContentResolver().insert(Uri.parse(CALENDER_URL).buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", CALENDARS_ACCOUNT_NAME).appendQueryParameter("account_type", CALENDARS_ACCOUNT_TYPE).build(), contentValues);
        if (uriInsert == null) {
            return -1L;
        }
        return ContentUris.parseId(uriInsert);
    }

    private final boolean addCalendarEvent(Context context, int accountID, String title, String description, long reminderTime, long endReminderTime, String rule) {
        init();
        if (context == null) {
            return false;
        }
        if (accountID < 0 && (accountID = checkAndAddCalendarAccount(context)) < 0) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", title);
        contentValues.put("description", description);
        contentValues.put("calendar_id", Integer.valueOf(accountID));
        contentValues.put("dtstart", Long.valueOf(reminderTime));
        contentValues.put("dtend", Long.valueOf(endReminderTime));
        contentValues.put("allDay", Boolean.TRUE);
        contentValues.put("hasAlarm", Boolean.FALSE);
        if (rule != null) {
            contentValues.put("rrule", rule);
        }
        String id = TimeZone.getDefault().getID();
        contentValues.put("eventTimezone", id);
        contentValues.put("eventEndTimezone", id);
        Logger.d(TAG, "add calendar event:" + title + " - " + reminderTime + " - " + endReminderTime + " - " + id);
        return context.getContentResolver().insert(Uri.parse(CALENDER_EVENT_URL).buildUpon().appendQueryParameter("account_name", CALENDARS_ACCOUNT_NAME).appendQueryParameter("account_type", CALENDARS_ACCOUNT_TYPE).build(), contentValues) != null;
    }

    private final int checkAndAddCalendarAccount(Context context) {
        int iCheckCalendarAccount = checkCalendarAccount(context);
        if (iCheckCalendarAccount >= 0) {
            return iCheckCalendarAccount;
        }
        if (addCalendarAccount(context) >= 0) {
            return checkCalendarAccount(context);
        }
        return -1;
    }

    @SuppressLint({"Range"})
    private final int checkCalendarAccount(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse(CALENDER_URL), null, null, null, null);
        int i = -1;
        try {
            if (cursorQuery == null) {
                return -1;
            }
            try {
                if (cursorQuery.getCount() > 0) {
                    cursorQuery.moveToFirst();
                    while (!cursorQuery.isAfterLast()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("account_name"));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("account_type"));
                        String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("name"));
                        String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("calendar_displayName"));
                        if (Intrinsics.areEqual(string, CALENDARS_ACCOUNT_NAME) && Intrinsics.areEqual(string2, CALENDARS_ACCOUNT_TYPE) && Intrinsics.areEqual(string3, CALENDARS_NAME)) {
                            i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                            if (!Intrinsics.areEqual(string4, CALENDARS_DISPLAY_NAME)) {
                                cursorQuery.close();
                                try {
                                    updateCalendar(context, i);
                                    updateEvents(context, i);
                                } catch (Throwable unused) {
                                }
                                cursorQuery = null;
                                break;
                            }
                            break;
                        }
                        cursorQuery.moveToNext();
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return i;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    private final void init() {
        if (CALENDARS_ACCOUNT_NAME == null) {
            Account xiaomiAccount = XiaomiAccountManager.get(AppUtil.getApp()).getXiaomiAccount();
            CALENDARS_ACCOUNT_NAME = xiaomiAccount.name;
            CALENDARS_ACCOUNT_TYPE = xiaomiAccount.type;
            CALENDARS_DISPLAY_NAME = AppUtil.getApp().getString(k1j.e);
        }
    }

    private final int updateCalendar(Context context, int accountID) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("calendar_displayName", CALENDARS_DISPLAY_NAME);
        Uri uriBuild = Uri.parse(CALENDER_URL).buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", CALENDARS_ACCOUNT_NAME).appendQueryParameter("account_type", CALENDARS_ACCOUNT_TYPE).build();
        StringBuilder sb = new StringBuilder();
        sb.append(accountID);
        return context.getContentResolver().update(uriBuild, contentValues, "((_id = ?))", new String[]{sb.toString()});
    }

    private final void updateEvents(Context context, int calendarID) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_data1", context.getPackageName());
        StringBuilder sb = new StringBuilder();
        sb.append(calendarID);
        String[] strArr = {sb.toString()};
        context.getContentResolver().update(Uri.parse(CALENDER_EVENT_URL).buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", CALENDARS_ACCOUNT_NAME).appendQueryParameter("account_type", CALENDARS_ACCOUNT_TYPE).build(), contentValues, "((calendar_id = ?))", strArr);
    }

    public final boolean deleteCalendarEvent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        init();
        int iCheckCalendarAccount = checkCalendarAccount(context);
        if (iCheckCalendarAccount == -1) {
            return false;
        }
        return deleteCalendarEvent(context, iCheckCalendarAccount);
    }

    public final boolean saveToCalendar(@NotNull Context context, @Nullable List<CalendarReminderEvent> list) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<CalendarReminderEvent> list2 = list;
        boolean zAddCalendarEvent = false;
        if (list2 != null && !list2.isEmpty()) {
            init();
            int iCheckAndAddCalendarAccount = checkAndAddCalendarAccount(context);
            deleteCalendarEvent(context, iCheckAndAddCalendarAccount);
            for (CalendarReminderEvent calendarReminderEvent : list) {
                zAddCalendarEvent = addCalendarEvent(context, iCheckAndAddCalendarAccount, calendarReminderEvent.getTitle(), calendarReminderEvent.getDes(), calendarReminderEvent.getStartTime(), calendarReminderEvent.getEndTime(), calendarReminderEvent.getRule());
            }
        }
        return zAddCalendarEvent;
    }

    @SuppressLint({"Range"})
    public final void testCalendar(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        init();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse(CALENDER_EVENT_URL), new String[]{"_id", "dtstart", "dtend", "title", "eventTimezone", "eventEndTimezone", "rrule", "allDay"}, "((calendar_id = ?))", new String[]{String.valueOf(checkAndAddCalendarAccount(context))}, null);
        if (cursorQuery == null) {
            return;
        }
        try {
            try {
                if (cursorQuery.getCount() > 0) {
                    cursorQuery.moveToFirst();
                    while (!cursorQuery.isAfterLast()) {
                        cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                        Logger.d(TAG, "event-info:" + cursorQuery.getLong(cursorQuery.getColumnIndex("dtstart")) + " - " + cursorQuery.getLong(cursorQuery.getColumnIndex("dtend")) + " - " + cursorQuery.getString(cursorQuery.getColumnIndex("title")) + " - " + cursorQuery.getString(cursorQuery.getColumnIndex("eventTimezone")) + " - " + cursorQuery.getString(cursorQuery.getColumnIndex("eventEndTimezone")) + " - " + cursorQuery.getString(cursorQuery.getColumnIndex("rrule")) + " - " + cursorQuery.getInt(cursorQuery.getColumnIndex("allDay")));
                        cursorQuery.moveToNext();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            cursorQuery.close();
        }
    }

    @SuppressLint({"Range"})
    private final boolean deleteCalendarEvent(Context context, int accountID) {
        init();
        boolean z = false;
        if (context == null) {
            return false;
        }
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse(CALENDER_EVENT_URL), new String[]{"_id"}, "((calendar_id = ?))", new String[]{String.valueOf(accountID)}, null);
        try {
            if (cursorQuery == null) {
                return false;
            }
            try {
                if (cursorQuery.getCount() > 0) {
                    cursorQuery.moveToFirst();
                    boolean z2 = false;
                    while (!cursorQuery.isAfterLast()) {
                        try {
                            Uri uriWithAppendedId = ContentUris.withAppendedId(Uri.parse(CALENDER_EVENT_URL), cursorQuery.getInt(cursorQuery.getColumnIndex("_id")));
                            Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
                            z2 = context.getContentResolver().delete(uriWithAppendedId, null, null) != -1;
                            cursorQuery.moveToNext();
                        } catch (Exception e) {
                            e = e;
                            z = z2;
                            e.printStackTrace();
                        }
                    }
                    z = z2;
                }
            } catch (Exception e2) {
                e = e2;
            }
            return z;
        } finally {
            cursorQuery.close();
        }
    }
}
