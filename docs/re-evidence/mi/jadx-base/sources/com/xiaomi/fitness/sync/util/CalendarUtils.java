package com.xiaomi.fitness.sync.util;

import android.content.Context;
import android.database.Cursor;
import android.provider.CalendarContract;
import com.google.gson.Gson;
import com.xiaomi.fitness.common.extensions.GsonExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.sync.model.CalendarModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0011\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u00010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J,\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J<\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00142\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J0\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u000bH\u0002J\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u000bH\u0002R\u000e\u0010 \u001a\u00020\u0019X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190.X\u0082\u0004¢\u0006\u0004\n\u0002\u0010/¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/sync/util/CalendarUtils;", "", "<init>", "()V", "genCalendarEvents", "", "Lcom/xiaomi/fitness/sync/model/CalendarModel$CalendarEvent;", "context", "Landroid/content/Context;", "load", "begin", "", StatConstants.PARAM_END, "buildEventsFromCursor", "cursor", "Landroid/database/Cursor;", "generateEvent", "pair", "Lkotlin/Pair;", "", "", "hasExtendedProperties", "getReminderMinutes", "id", "timeZone", "", "getNormalReminder", "getExtendedReminders", "type", "getThisYearReminder", "timeMillis", "getUTCStart", "TAG", "SYNC_SCHEDULE", "PROJECTION_TITLE_INDEX", "PROJECTION_LOCATION_INDEX", "PROJECTION_ID_INDEX", "PROJECTION_ALL_DAY_INDEX", "PROJECTION_BEGIN_INDEX", "PROJECTION_END_INDEX", "PROJECTION_EXTENDED_INDEX", "PROJECTION_DESCRIPTION_INDEX", "PROJECTION_TIME_ZONE_INDEX", "EXTENDED_TYPE_ANNIVERSARY", "EXTENDED_TYPE_COUNT", "EVENT_PROJECTION", "", "[Ljava/lang/String;", "ExtendedProperties", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CalendarUtils {
    private static final int EXTENDED_TYPE_ANNIVERSARY = 8;
    private static final int EXTENDED_TYPE_COUNT = 9;
    private static final int PROJECTION_ALL_DAY_INDEX = 2;
    private static final int PROJECTION_BEGIN_INDEX = 5;
    private static final int PROJECTION_DESCRIPTION_INDEX = 22;
    private static final int PROJECTION_END_INDEX = 6;
    private static final int PROJECTION_EXTENDED_INDEX = 21;
    private static final int PROJECTION_ID_INDEX = 4;
    private static final int PROJECTION_LOCATION_INDEX = 1;
    private static final int PROJECTION_TIME_ZONE_INDEX = 24;
    private static final int PROJECTION_TITLE_INDEX = 0;
    private static final int SYNC_SCHEDULE = 604800000;

    @NotNull
    private static final String TAG = "CalendarUtils";

    @NotNull
    public static final CalendarUtils INSTANCE = new CalendarUtils();

    @NotNull
    private static final String[] EVENT_PROJECTION = {"title", "eventLocation", "allDay", "displayColor", "event_id", "begin", StatConstants.PARAM_END, "_id", "startDay", "endDay", "startMinute", "endMinute", "hasAlarm", "rrule", "selfAttendeeStatus", "organizer", "guestsCanModify", "account_name", "account_type", "calendar_displayName", "customAppPackage", "hasExtendedProperties", "description", "calendar_id", "eventTimezone"};

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sync/util/CalendarUtils$ExtendedProperties;", "", "need_alarm", "", MiuiCursorConstants.CONTENT, "", "timeMillis", "", "reminderBefore3Day", "repeatType", "", "<init>", "(ZLjava/lang/String;JZI)V", "getNeed_alarm", "()Z", "getContent", "()Ljava/lang/String;", "getTimeMillis", "()J", "getReminderBefore3Day", "getRepeatType", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExtendedProperties {

        @Nullable
        private final String content;
        private final boolean need_alarm;
        private final boolean reminderBefore3Day;
        private final int repeatType;
        private final long timeMillis;

        public ExtendedProperties(boolean z, @Nullable String str, long j, boolean z2, int i) {
            this.need_alarm = z;
            this.content = str;
            this.timeMillis = j;
            this.reminderBefore3Day = z2;
            this.repeatType = i;
        }

        public static /* synthetic */ ExtendedProperties copy$default(ExtendedProperties extendedProperties, boolean z, String str, long j, boolean z2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = extendedProperties.need_alarm;
            }
            if ((i2 & 2) != 0) {
                str = extendedProperties.content;
            }
            String str2 = str;
            if ((i2 & 4) != 0) {
                j = extendedProperties.timeMillis;
            }
            long j2 = j;
            if ((i2 & 8) != 0) {
                z2 = extendedProperties.reminderBefore3Day;
            }
            boolean z3 = z2;
            if ((i2 & 16) != 0) {
                i = extendedProperties.repeatType;
            }
            return extendedProperties.copy(z, str2, j2, z3, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getNeed_alarm() {
            return this.need_alarm;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getReminderBefore3Day() {
            return this.reminderBefore3Day;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getRepeatType() {
            return this.repeatType;
        }

        @NotNull
        public final ExtendedProperties copy(boolean need_alarm, @Nullable String content, long timeMillis, boolean reminderBefore3Day, int repeatType) {
            return new ExtendedProperties(need_alarm, content, timeMillis, reminderBefore3Day, repeatType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExtendedProperties)) {
                return false;
            }
            ExtendedProperties extendedProperties = (ExtendedProperties) other;
            return this.need_alarm == extendedProperties.need_alarm && Intrinsics.areEqual(this.content, extendedProperties.content) && this.timeMillis == extendedProperties.timeMillis && this.reminderBefore3Day == extendedProperties.reminderBefore3Day && this.repeatType == extendedProperties.repeatType;
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        public final boolean getNeed_alarm() {
            return this.need_alarm;
        }

        public final boolean getReminderBefore3Day() {
            return this.reminderBefore3Day;
        }

        public final int getRepeatType() {
            return this.repeatType;
        }

        public final long getTimeMillis() {
            return this.timeMillis;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.need_alarm) * 31;
            String str = this.content;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.timeMillis)) * 31) + Boolean.hashCode(this.reminderBefore3Day)) * 31) + Integer.hashCode(this.repeatType);
        }

        @NotNull
        public String toString() {
            return "ExtendedProperties(need_alarm=" + this.need_alarm + ", content=" + this.content + ", timeMillis=" + this.timeMillis + ", reminderBefore3Day=" + this.reminderBefore3Day + ", repeatType=" + this.repeatType + ")";
        }
    }

    private CalendarUtils() {
    }

    private final List<CalendarModel.CalendarEvent> buildEventsFromCursor(Context context, Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor != null && cursor.getCount() != 0) {
            cursor.moveToPosition(-1);
            while (cursor.moveToNext() && arrayList.size() < 20) {
                CalendarModel.CalendarEvent calendarEventGenerateEvent = generateEvent(context, cursor, hasExtendedProperties(cursor));
                if (calendarEventGenerateEvent.getStart() > System.currentTimeMillis()) {
                    arrayList.add(calendarEventGenerateEvent);
                }
            }
        }
        return arrayList;
    }

    private final CalendarModel.CalendarEvent generateEvent(Context context, Cursor cursor, Pair<Boolean, Integer> pair) {
        String strSubStringByByte$default = StringExtKt.subStringByByte$default(cursor.getString(0), 90, null, 2, null);
        String strSubStringByByte$default2 = StringExtKt.subStringByByte$default(cursor.getString(22), 45, null, 2, null);
        String strSubStringByByte$default3 = StringExtKt.subStringByByte$default(cursor.getString(1), 60, null, 2, null);
        int i = cursor.getInt(2);
        long j = cursor.getLong(5);
        long j2 = cursor.getLong(6);
        int i2 = cursor.getInt(4);
        String string = cursor.getString(24);
        Intrinsics.checkNotNull(string);
        return new CalendarModel.CalendarEvent(strSubStringByByte$default, strSubStringByByte$default2, strSubStringByByte$default3, j, j2, i, getReminderMinutes(context, cursor, i2, pair, string));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    private final int getExtendedReminders(Context context, Cursor cursor, int id, int type, String timeZone) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(CalendarContract.ExtendedProperties.CONTENT_URI, null, null, null, null);
                Intrinsics.checkNotNull(cursorQuery);
                cursorQuery.moveToPosition(-1);
                while (cursorQuery.moveToNext()) {
                    int columnIndex = cursorQuery.getColumnIndex("event_id");
                    if (columnIndex < 0) {
                        cursorQuery.close();
                        return 0;
                    }
                    if (id == cursorQuery.getInt(columnIndex)) {
                        int columnIndex2 = cursorQuery.getColumnIndex("value");
                        if (columnIndex2 < 0) {
                            cursorQuery.close();
                            return 0;
                        }
                        String string = cursorQuery.getString(columnIndex2);
                        Gson gson = new Gson();
                        Intrinsics.checkNotNull(string);
                        ExtendedProperties extendedProperties = (ExtendedProperties) GsonExtKt.toObject(gson, string, ExtendedProperties.class);
                        long j = cursor.getLong(5);
                        int uTCStart = (int) ((getUTCStart(timeZone, j) - getThisYearReminder(type, extendedProperties.getTimeMillis())) / ((long) 60000));
                        cursorQuery.close();
                        return uTCStart;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
                cursorQuery.close();
                return 0;
            } catch (Exception e) {
                e.printStackTrace();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return 0;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    private final int getNormalReminder(Context context, Cursor cursor) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = CalendarContract.Reminders.query(context.getContentResolver(), cursor.getLong(4), null);
                int i = cursorQuery.moveToFirst() ? cursorQuery.getInt(cursorQuery.getColumnIndex("minutes")) : 0;
                cursorQuery.close();
                return i;
            } catch (Exception e) {
                e.printStackTrace();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return 0;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    private final int getReminderMinutes(Context context, Cursor cursor, int id, Pair<Boolean, Integer> pair, String timeZone) {
        return pair.getFirst().booleanValue() ? getExtendedReminders(context, cursor, id, pair.getSecond().intValue(), timeZone) : getNormalReminder(context, cursor);
    }

    private final long getThisYearReminder(int type, long timeMillis) {
        if (type == 9) {
            return timeMillis;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeMillis);
        calendar.set(1, Calendar.getInstance().get(1));
        return calendar.getTimeInMillis();
    }

    private final long getUTCStart(String timeZone, long timeMillis) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return timeMillis - ((((long) (TimeZone.getDefault().getOffset(jCurrentTimeMillis) - TimeZone.getTimeZone(timeZone).getOffset(jCurrentTimeMillis))) / 3600000) * 3600000);
    }

    private final Pair<Boolean, Integer> hasExtendedProperties(Cursor cursor) {
        try {
            int i = cursor.getInt(21);
            return new Pair<>(Boolean.valueOf(i == 8 || i == 9), Integer.valueOf(i));
        } catch (Exception e) {
            e.printStackTrace();
            return new Pair<>(Boolean.FALSE, 0);
        }
    }

    private final List<CalendarModel.CalendarEvent> load(Context context, long begin, long end) {
        List<CalendarModel.CalendarEvent> arrayList;
        Cursor cursorQuery = null;
        try {
            cursorQuery = CalendarContract.Instances.query(context.getContentResolver(), EVENT_PROJECTION, begin, end, " ");
            arrayList = buildEventsFromCursor(context, cursorQuery);
        } catch (Exception e) {
            Logger.e(TAG, "load events: " + e);
            arrayList = new ArrayList<>();
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    @Nullable
    public final List<CalendarModel.CalendarEvent> genCalendarEvents(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!PermissionExtKt.isPermissionGranted(context, "android.permission.READ_CALENDAR")) {
            Logger.i(TAG, "genCalendarEvents permission not granted");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        arrayList.addAll(load(context, jCurrentTimeMillis, jCurrentTimeMillis + ((long) SYNC_SCHEDULE)));
        return arrayList;
    }
}
