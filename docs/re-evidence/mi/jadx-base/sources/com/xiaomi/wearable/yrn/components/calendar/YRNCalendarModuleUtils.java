package com.xiaomi.wearable.yrn.components.calendar;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import defpackage.u1j;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u00018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0010J\n\u0010\u0011\u001a\u00020\u0012*\u00020\u000fJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0003J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0014H\u0002J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J/\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00162\u001a\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\"j\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`!¢\u0006\u0002\u0010#J\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010%\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0007J&\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0(2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0007J(\u0010+\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00162\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070-0(J\b\u0010.\u001a\u00020\u001bH\u0002J\u001a\u0010/\u001a\u00020\u001f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0003JW\u00100\u001a\u00020\u001f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00142\b\u00101\u001a\u0004\u0018\u00010\u00072\b\u00102\u001a\u0004\u0018\u00010\u00072\u0006\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\b\u00105\u001a\u0004\u0018\u00010\u00072\b\u00106\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0002\u00107R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/calendar/YRNCalendarModuleUtils;", "", "<init>", "()V", "ONE_DAY_MILL", "", "CALENDER_URL", "", "CALENDER_EVENT_URL", "CALENDARS_NAME", "CALENDARS_ACCOUNT_NAME", "CALENDARS_ACCOUNT_TYPE", "CALENDARS_DISPLAY_NAME", "TAG", "calendarMapToEvent", "Lcom/xiaomi/wearable/yrn/components/calendar/YRNCalendarModuleUtils$CalendarEvent;", "Lcom/facebook/react/bridge/ReadableMap;", "calendarEventToRNMap", "Lcom/facebook/react/bridge/WritableMap;", "checkAndAddCalendarAccount", "", "context", "Landroid/content/Context;", "checkCalendarAccount", "updateCalendar", "accountID", "updateEvents", "", "calendarID", "addCalendarAccount", "addCalendarEvents", "", "calendarEventArray", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)Z", "deleteAllCalendarEvent", "deleteEventByTag", "eventTag", "getEventsByTimeRange", "", "startTime", "endTime", "deleteEventsByTitleDescriptionSet", "eventsToDelete", "Lkotlin/Pair;", "init", "deleteCalendarEvent", "addCalendarEvent", "title", "description", "reminderTime", "endReminderTime", "groupTag", "isAllDay", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/Boolean;)Z", "CalendarEvent", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nYRNCalendarModuleUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YRNCalendarModuleUtils.kt\ncom/xiaomi/wearable/yrn/components/calendar/YRNCalendarModuleUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,506:1\n1872#2,3:507\n1368#2:510\n1454#2,5:511\n37#3:516\n36#3,3:517\n*S KotlinDebug\n*F\n+ 1 YRNCalendarModuleUtils.kt\ncom/xiaomi/wearable/yrn/components/calendar/YRNCalendarModuleUtils\n*L\n368#1:507,3\n376#1:510\n376#1:511,5\n378#1:516\n378#1:517,3\n*E\n"})
public final class YRNCalendarModuleUtils {

    @Nullable
    private static String CALENDARS_ACCOUNT_NAME = null;

    @Nullable
    private static String CALENDARS_ACCOUNT_TYPE = null;

    @Nullable
    private static String CALENDARS_DISPLAY_NAME = null;

    @NotNull
    private static final String CALENDARS_NAME = "rn_calendar";
    private static final long ONE_DAY_MILL = 7200000;

    @NotNull
    private static final String TAG = "WearableRnCalendarUtils";

    @NotNull
    public static final YRNCalendarModuleUtils INSTANCE = new YRNCalendarModuleUtils();

    @NotNull
    private static final String CALENDER_URL = "content://com.android.calendar/calendars";

    @NotNull
    private static final String CALENDER_EVENT_URL = "content://com.android.calendar/events";

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\t\u0010\u0015¨\u0006$"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/calendar/YRNCalendarModuleUtils$CalendarEvent;", "", "title", "", "des", "startTime", "", "endTime", "eventTag", "isAllDay", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)V", "getTitle", "()Ljava/lang/String;", "getDes", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTime", "getEventTag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/xiaomi/wearable/yrn/components/calendar/YRNCalendarModuleUtils$CalendarEvent;", "equals", "other", "hashCode", "", "toString", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CalendarEvent {

        @Nullable
        private final String des;

        @Nullable
        private final Long endTime;

        @Nullable
        private final String eventTag;

        @Nullable
        private final Boolean isAllDay;

        @Nullable
        private final Long startTime;

        @Nullable
        private final String title;

        public CalendarEvent(@Nullable String str, @Nullable String str2, @Nullable Long l, @Nullable Long l2, @Nullable String str3, @Nullable Boolean bool) {
            this.title = str;
            this.des = str2;
            this.startTime = l;
            this.endTime = l2;
            this.eventTag = str3;
            this.isAllDay = bool;
        }

        public static /* synthetic */ CalendarEvent copy$default(CalendarEvent calendarEvent, String str, String str2, Long l, Long l2, String str3, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = calendarEvent.title;
            }
            if ((i & 2) != 0) {
                str2 = calendarEvent.des;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                l = calendarEvent.startTime;
            }
            Long l3 = l;
            if ((i & 8) != 0) {
                l2 = calendarEvent.endTime;
            }
            Long l4 = l2;
            if ((i & 16) != 0) {
                str3 = calendarEvent.eventTag;
            }
            String str5 = str3;
            if ((i & 32) != 0) {
                bool = calendarEvent.isAllDay;
            }
            return calendarEvent.copy(str, str4, l3, l4, str5, bool);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDes() {
            return this.des;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getStartTime() {
            return this.startTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getEndTime() {
            return this.endTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getEventTag() {
            return this.eventTag;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Boolean getIsAllDay() {
            return this.isAllDay;
        }

        @NotNull
        public final CalendarEvent copy(@Nullable String title, @Nullable String des, @Nullable Long startTime, @Nullable Long endTime, @Nullable String eventTag, @Nullable Boolean isAllDay) {
            return new CalendarEvent(title, des, startTime, endTime, eventTag, isAllDay);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CalendarEvent)) {
                return false;
            }
            CalendarEvent calendarEvent = (CalendarEvent) other;
            return Intrinsics.areEqual(this.title, calendarEvent.title) && Intrinsics.areEqual(this.des, calendarEvent.des) && Intrinsics.areEqual(this.startTime, calendarEvent.startTime) && Intrinsics.areEqual(this.endTime, calendarEvent.endTime) && Intrinsics.areEqual(this.eventTag, calendarEvent.eventTag) && Intrinsics.areEqual(this.isAllDay, calendarEvent.isAllDay);
        }

        @Nullable
        public final String getDes() {
            return this.des;
        }

        @Nullable
        public final Long getEndTime() {
            return this.endTime;
        }

        @Nullable
        public final String getEventTag() {
            return this.eventTag;
        }

        @Nullable
        public final Long getStartTime() {
            return this.startTime;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.des;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.startTime;
            int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.endTime;
            int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str3 = this.eventTag;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.isAllDay;
            return iHashCode5 + (bool != null ? bool.hashCode() : 0);
        }

        @Nullable
        public final Boolean isAllDay() {
            return this.isAllDay;
        }

        @NotNull
        public String toString() {
            return "CalendarEvent(title=" + this.title + ", des=" + this.des + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", eventTag=" + this.eventTag + ", isAllDay=" + this.isAllDay + ")";
        }
    }

    private YRNCalendarModuleUtils() {
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

    private final boolean addCalendarEvent(Context context, int accountID, String title, String description, long reminderTime, long endReminderTime, String groupTag, Boolean isAllDay) {
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
        contentValues.put("allDay", isAllDay);
        contentValues.put("hasAlarm", Boolean.FALSE);
        String id = TimeZone.getDefault().getID();
        contentValues.put("eventTimezone", id);
        contentValues.put("eventEndTimezone", id);
        if (groupTag != null && groupTag.length() > 0) {
            contentValues.put("customAppUri", groupTag);
        }
        contentValues.put("customAppPackage", context.getPackageName());
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
                        Logger.w(TAG, "calendarAccountName：" + string + ",calendarAccountType:" + string2 + ",calendarName:" + string3 + ",displayName:" + string4);
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

    private final void init() {
        if (CALENDARS_ACCOUNT_NAME == null) {
            Account xiaomiAccount = XiaomiAccountManager.get(AppUtil.getApp()).getXiaomiAccount();
            CALENDARS_ACCOUNT_NAME = xiaomiAccount.name;
            CALENDARS_ACCOUNT_TYPE = xiaomiAccount.type;
            CALENDARS_DISPLAY_NAME = AppUtil.getApp().getString(u1j.f35277a);
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

    public final boolean addCalendarEvents(@NotNull Context context, @Nullable ArrayList<CalendarEvent> calendarEventArray) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean zAddCalendarEvent = false;
        if (calendarEventArray != null && !calendarEventArray.isEmpty()) {
            init();
            int iCheckAndAddCalendarAccount = checkAndAddCalendarAccount(context);
            Iterator<CalendarEvent> it = calendarEventArray.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                CalendarEvent next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                CalendarEvent calendarEvent = next;
                String title = calendarEvent.getTitle();
                String des = calendarEvent.getDes();
                Long startTime = calendarEvent.getStartTime();
                long jLongValue = startTime != null ? startTime.longValue() : 0L;
                Long endTime = calendarEvent.getEndTime();
                zAddCalendarEvent = addCalendarEvent(context, iCheckAndAddCalendarAccount, title, des, jLongValue, endTime != null ? endTime.longValue() : 0L, calendarEvent.getEventTag(), calendarEvent.isAllDay());
            }
        }
        return zAddCalendarEvent;
    }

    @NotNull
    public final WritableMap calendarEventToRNMap(@NotNull CalendarEvent calendarEvent) {
        Intrinsics.checkNotNullParameter(calendarEvent, "<this>");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("title", calendarEvent.getTitle());
        writableMapCreateMap.putString("desc", calendarEvent.getDes());
        Long startTime = calendarEvent.getStartTime();
        writableMapCreateMap.putString("startTime", String.valueOf((startTime != null ? startTime.longValue() : 0L) / 1000));
        Long endTime = calendarEvent.getEndTime();
        writableMapCreateMap.putString("endTime", String.valueOf((endTime != null ? endTime.longValue() : 0L) / ((long) 1000)));
        writableMapCreateMap.putString("eventTag", calendarEvent.getEventTag());
        Boolean boolIsAllDay = calendarEvent.isAllDay();
        writableMapCreateMap.putBoolean("isAllDay", boolIsAllDay != null ? boolIsAllDay.booleanValue() : true);
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    @NotNull
    public final CalendarEvent calendarMapToEvent(@NotNull ReadableMap readableMap) {
        Long longOrNull;
        Long longOrNull2;
        Intrinsics.checkNotNullParameter(readableMap, "<this>");
        String string = readableMap.getString("title");
        String string2 = readableMap.getString("desc");
        String string3 = readableMap.getString("startTime");
        long jLongValue = 0;
        long j = 1000;
        Long lValueOf = Long.valueOf(((string3 == null || (longOrNull2 = StringsKt__StringNumberConversionsKt.toLongOrNull(string3)) == null) ? 0L : longOrNull2.longValue()) * j);
        String string4 = readableMap.getString("endTime");
        if (string4 != null && (longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(string4)) != null) {
            jLongValue = longOrNull.longValue();
        }
        return new CalendarEvent(string, string2, lValueOf, Long.valueOf(jLongValue * j), readableMap.getString("eventTag"), Boolean.valueOf(readableMap.getBoolean("isAllDay")));
    }

    public final boolean deleteAllCalendarEvent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        init();
        int iCheckCalendarAccount = checkCalendarAccount(context);
        if (iCheckCalendarAccount == -1) {
            return false;
        }
        return deleteCalendarEvent(context, iCheckCalendarAccount);
    }

    public final boolean deleteEventByTag(@NotNull Context context, @NotNull String eventTag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventTag, "eventTag");
        int iDelete = -1;
        try {
            iDelete = context.getContentResolver().delete(CalendarContract.Events.CONTENT_URI, "customAppPackage = ? \nAND customAppUri = ?", new String[]{context.getPackageName(), eventTag});
            Logger.d(TAG, "deleteEventByTag[" + eventTag + "] success, del num:" + iDelete);
        } catch (SecurityException e) {
            Logger.e(TAG, "deleteEventByTag: SecurityException", e);
        } catch (Exception e2) {
            Logger.e(TAG, "deleteEventByTag fail", e2);
        }
        return iDelete > 0;
    }

    public final boolean deleteEventsByTitleDescriptionSet(@NotNull Context context, @NotNull List<Pair<String, String>> eventsToDelete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventsToDelete, "eventsToDelete");
        if (eventsToDelete.isEmpty()) {
            Logger.w(TAG, "deleteEventsByTitleDescriptionSet eventsToDelete empty");
            return false;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            int i = 0;
            for (Object obj : eventsToDelete) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (i > 0) {
                    sb.append(" OR ");
                }
                sb.append("(title = ? AND description = ?)");
                i = i2;
            }
            sb.append(")");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = eventsToDelete.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{(String) pair.component1(), (String) pair.component2()}));
            }
            int iDelete = context.getContentResolver().delete(CalendarContract.Events.CONTENT_URI, sb.toString(), (String[]) arrayList.toArray(new String[0]));
            Logger.d(TAG, "deleteEventsByTitleDescriptionSet: del num: " + eventsToDelete.size() + " , real del num:" + iDelete);
            return iDelete > 0;
        } catch (IllegalArgumentException e) {
            Logger.e(TAG, "deleteEventsByTitleDescriptionSet fail", e);
            return false;
        } catch (SecurityException e2) {
            Logger.e(TAG, "deleteEventsByTitleDescriptionSet fail: SecurityException", e2);
            return false;
        } catch (Exception e3) {
            Logger.e(TAG, "deleteEventsByTitleDescriptionSet fail ", e3);
            return false;
        }
    }

    @SuppressLint({"Range"})
    @NotNull
    public final List<CalendarEvent> getEventsByTimeRange(@NotNull Context context, long startTime, long endTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = context.getContentResolver().query(CalendarContract.Events.CONTENT_URI, new String[]{"_id", "title", "description", "dtstart", "dtend", "calendar_id", "customAppUri", "allDay"}, " customAppPackage = ? AND dtstart >= ? AND dtend <= ?", new String[]{context.getPackageName(), String.valueOf(startTime), String.valueOf(endTime)}, "dtstart ASC");
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                try {
                    Cursor cursor2 = cursor;
                    while (cursor2.moveToNext()) {
                        cursor2.getLong(cursor2.getColumnIndex("_id"));
                        String string = cursor2.getString(cursor2.getColumnIndex("title"));
                        String string2 = cursor2.getString(cursor2.getColumnIndex("description"));
                        long j = cursor2.getLong(cursor2.getColumnIndex("dtstart"));
                        long j2 = cursor2.getLong(cursor2.getColumnIndex("dtend"));
                        cursor2.getLong(cursor2.getColumnIndex("calendar_id"));
                        String string3 = cursor2.getString(cursor2.getColumnIndex("customAppUri"));
                        boolean z = true;
                        if (cursor2.getInt(cursor2.getColumnIndex("allDay")) != 1) {
                            z = false;
                        }
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new CalendarEvent(string, string2 == null ? "" : string2, Long.valueOf(j), Long.valueOf(j2), string3, Boolean.valueOf(z)));
                    }
                    Logger.d(TAG, "getEventsByTimeRange num: " + arrayList.size() + " , (" + new Date(startTime) + " --- " + new Date(endTime) + ")");
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursor, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(cursor, th);
                        throw th2;
                    }
                }
            }
        } catch (SecurityException e) {
            Logger.e(TAG, "getEventsByTimeRange fail: SecurityException", e);
        } catch (Exception e2) {
            Logger.e(TAG, "getEventsByTimeRange fail", e2);
        }
        return arrayList;
    }
}
