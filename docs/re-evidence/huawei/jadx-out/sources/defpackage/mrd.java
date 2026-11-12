package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.Gson;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.CalendarAllSyncInfo;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.CalendarDbBean;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.SimpleCalendarBean;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.SmartSimpleCalendarBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes11.dex */
public class mrd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f42245b = {"_id", "calendar_color", "calendar_displayName", "visible"};
    private static final String[] e = {"calendar_id", "_sync_id", "_id", "account_name", "account_type", "title", "eventLocation", "eventTimezone", "eventEndTimezone", "eventStatus", "duration", "organizer", "selfAttendeeStatus", "availability", "hasExtendedProperties", "description", "dtstart", "dtend", "allDay", "hasAlarm", "rrule", "exdate"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f42246c = {HeaderType.EVENT_ID, "begin", "rrule", "exdate", "allDay"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f42244a = {HeaderType.EVENT_ID, "state"};
    private static final String[] d = {HeaderType.EVENT_ID, "minutes", "method"};

    private static long a(long j, long j2, long j3) {
        return (j2 <= 0 && j3 > 0) ? j + j3 : j2;
    }

    public static String c(SimpleCalendarBean simpleCalendarBean) {
        if (simpleCalendarBean == null) {
            LogUtil.j("CalendarBuilderUtils", "[buildVCard] : bean is null");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(1024);
        stringBuffer.append(simpleCalendarBean.getCalendarId()).append(simpleCalendarBean.getCalendarColor()).append(simpleCalendarBean.getAccountName()).append(simpleCalendarBean.getCalendarDisplayName()).append(simpleCalendarBean.getTitle()).append(simpleCalendarBean.getEventLocation()).append(simpleCalendarBean.getDescription()).append(simpleCalendarBean.getDtstart()).append(simpleCalendarBean.getDtend()).append(simpleCalendarBean.getAllDay()).append(simpleCalendarBean.getHasAlarm()).append(simpleCalendarBean.getMinutes()).append(simpleCalendarBean.getRule());
        return stringBuffer.toString();
    }

    public static String d(SmartSimpleCalendarBean smartSimpleCalendarBean) {
        if (smartSimpleCalendarBean == null) {
            LogUtil.j("CalendarBuilderUtils", "[buildVCard] : bean is null");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(1024);
        stringBuffer.append(smartSimpleCalendarBean.getCalendarId()).append(smartSimpleCalendarBean.getCalendarColor()).append(smartSimpleCalendarBean.getAccountName()).append(smartSimpleCalendarBean.getCalendarDisplayName()).append(smartSimpleCalendarBean.getTitle()).append(smartSimpleCalendarBean.getEventLocation()).append(smartSimpleCalendarBean.getDescription()).append(smartSimpleCalendarBean.getDtstart()).append(smartSimpleCalendarBean.getDtend()).append(smartSimpleCalendarBean.getAllDay()).append(smartSimpleCalendarBean.getHasAlarm()).append(smartSimpleCalendarBean.getMinutes()).append(smartSimpleCalendarBean.getRule()).append(smartSimpleCalendarBean.getSyncId()).append(smartSimpleCalendarBean.getEventStatus()).append(smartSimpleCalendarBean.getEventTimezone()).append(smartSimpleCalendarBean.getEventEndTimezone()).append(smartSimpleCalendarBean.getDuration()).append(smartSimpleCalendarBean.getOrganizer()).append(smartSimpleCalendarBean.getSelfAttendeeStatus()).append(smartSimpleCalendarBean.getAvailability()).append(smartSimpleCalendarBean.getHasExtendedProperties()).append(smartSimpleCalendarBean.getMethod()).append(smartSimpleCalendarBean.getExdate()).append(smartSimpleCalendarBean.getVisible());
        return stringBuffer.toString();
    }

    public static List<String> c(List<SimpleCalendarBean> list, int i) {
        LogUtil.a("CalendarBuilderUtils", "generateVcards: start");
        int i2 = 0;
        if (list == null || list.isEmpty()) {
            LogUtil.j("CalendarBuilderUtils", "list is null or empty.");
            return new ArrayList(0);
        }
        Collections.sort(list, new Comparator<SimpleCalendarBean>() { // from class: mrd.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(SimpleCalendarBean simpleCalendarBean, SimpleCalendarBean simpleCalendarBean2) {
                return Long.compare(simpleCalendarBean.getDtstart(), simpleCalendarBean2.getDtstart());
            }
        });
        ArrayList arrayList = new ArrayList(list.size());
        List listC = mtv.c(list, 10);
        Gson gson = new Gson();
        while (i2 < listC.size()) {
            int i3 = i2 + 1;
            i += ((List) listC.get(i2)).size() * i3;
            LogUtil.a("CalendarBuilderUtils", "calendarMinor: ", Integer.valueOf(i));
            CalendarAllSyncInfo calendarAllSyncInfo = new CalendarAllSyncInfo();
            calendarAllSyncInfo.setMajor(CommonUtil.k(BaseApplication.getContext()));
            calendarAllSyncInfo.setMinor(i);
            calendarAllSyncInfo.setCalendarBeanList((List) listC.get(i2));
            arrayList.add(gson.toJson(calendarAllSyncInfo));
            i2 = i3;
        }
        LogUtil.a("CalendarBuilderUtils", "generateVcards: end, jsonList size: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0331  */
    /* JADX WARN: Code duplicated, block: B:101:0x0334 A[Catch: all -> 0x0389, Exception -> 0x038b, TryCatch #17 {Exception -> 0x038b, blocks: (B:74:0x02ab, B:85:0x02eb, B:108:0x0354, B:104:0x0343, B:101:0x0334, B:98:0x0327, B:95:0x031a, B:92:0x0311, B:89:0x0309), top: B:227:0x02ab }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0340  */
    /* JADX WARN: Code duplicated, block: B:104:0x0343 A[Catch: all -> 0x0389, Exception -> 0x038b, TryCatch #17 {Exception -> 0x038b, blocks: (B:74:0x02ab, B:85:0x02eb, B:108:0x0354, B:104:0x0343, B:101:0x0334, B:98:0x0327, B:95:0x031a, B:92:0x0311, B:89:0x0309), top: B:227:0x02ab }] */
    /* JADX WARN: Code duplicated, block: B:106:0x034f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0352  */
    /* JADX WARN: Code duplicated, block: B:181:0x0489  */
    /* JADX WARN: Code duplicated, block: B:183:0x048e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0493  */
    /* JADX WARN: Code duplicated, block: B:189:0x049b  */
    /* JADX WARN: Code duplicated, block: B:191:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:193:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:197:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:199:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:201:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:213:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0122 A[Catch: all -> 0x0453, Exception -> 0x0460, TRY_LEAVE, TryCatch #6 {Exception -> 0x0460, blocks: (B:21:0x011c, B:23:0x0122), top: B:213:0x011c }] */
    /* JADX WARN: Code duplicated, block: B:242:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x04d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x043b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0212 A[EDGE_INSN: B:260:0x0212->B:50:0x0212 BREAK  A[LOOP:2: B:41:0x01ec->B:45:0x01fe], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0296 A[EDGE_INSN: B:262:0x0296->B:69:0x0296 BREAK  A[LOOP:3: B:56:0x025a->B:61:0x0282], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x01f4 A[Catch: all -> 0x0201, Exception -> 0x0205, TRY_LEAVE, TryCatch #31 {Exception -> 0x0205, all -> 0x0201, blocks: (B:42:0x01ee, B:44:0x01f4), top: B:242:0x01ee }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0262  */
    /* JADX WARN: Code duplicated, block: B:85:0x02eb A[Catch: all -> 0x0389, Exception -> 0x038b, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x038b, blocks: (B:74:0x02ab, B:85:0x02eb, B:108:0x0354, B:104:0x0343, B:101:0x0334, B:98:0x0327, B:95:0x031a, B:92:0x0311, B:89:0x0309), top: B:227:0x02ab }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0307  */
    /* JADX WARN: Code duplicated, block: B:89:0x0309 A[Catch: all -> 0x0389, Exception -> 0x038b, TRY_ENTER, TryCatch #17 {Exception -> 0x038b, blocks: (B:74:0x02ab, B:85:0x02eb, B:108:0x0354, B:104:0x0343, B:101:0x0334, B:98:0x0327, B:95:0x031a, B:92:0x0311, B:89:0x0309), top: B:227:0x02ab }] */
    /* JADX WARN: Code duplicated, block: B:91:0x030f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0311 A[Catch: all -> 0x0389, Exception -> 0x038b, TryCatch #17 {Exception -> 0x038b, blocks: (B:74:0x02ab, B:85:0x02eb, B:108:0x0354, B:104:0x0343, B:101:0x0334, B:98:0x0327, B:95:0x031a, B:92:0x0311, B:89:0x0309), top: B:227:0x02ab }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0317  */
    /* JADX WARN: Code duplicated, block: B:95:0x031a A[Catch: all -> 0x0389, Exception -> 0x038b, TryCatch #17 {Exception -> 0x038b, blocks: (B:74:0x02ab, B:85:0x02eb, B:108:0x0354, B:104:0x0343, B:101:0x0334, B:98:0x0327, B:95:0x031a, B:92:0x0311, B:89:0x0309), top: B:227:0x02ab }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0324  */
    /* JADX WARN: Code duplicated, block: B:98:0x0327 A[Catch: all -> 0x0389, Exception -> 0x038b, TryCatch #17 {Exception -> 0x038b, blocks: (B:74:0x02ab, B:85:0x02eb, B:108:0x0354, B:104:0x0343, B:101:0x0334, B:98:0x0327, B:95:0x031a, B:92:0x0311, B:89:0x0309), top: B:227:0x02ab }] */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x02eb, please report this as an issue */
    public static List<SimpleCalendarBean> b(Context context, int i, int i2) throws Throwable {
        char c2;
        String string;
        String string2;
        String string3;
        int i3;
        String string4;
        String string5;
        String string6;
        String string7;
        Cursor cursor;
        Cursor cursor2;
        String string8;
        long j;
        long j2;
        int i4;
        int i5;
        String string9;
        String string10;
        Cursor cursorQuery;
        int i6;
        Cursor cursor3;
        StringBuffer stringBuffer;
        Cursor cursorQuery2;
        Cursor cursor4;
        String string11;
        String strD;
        String strD2;
        String strD3;
        String strD4;
        String strD5;
        String strD6;
        String str;
        String str2 = "minutes";
        String str3 = "state";
        ArrayList arrayList = new ArrayList(i);
        LogUtil.a("CalendarBuilderUtils", "Start query seven Days Calendar event");
        Calendar calendar = Calendar.getInstance();
        char c3 = 0;
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(5, i2 == 0 ? 7 : i2);
        long timeInMillis2 = calendar.getTimeInMillis();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (mri.d(BaseApplication.getContext())) {
            Uri.Builder builderBuildUpon = Uri.parse("content://com.coloros.calendar/instances/when").buildUpon();
            ContentUris.appendId(builderBuildUpon, timeInMillis);
            ContentUris.appendId(builderBuildUpon, timeInMillis2);
            Cursor cursorQuery3 = context.getContentResolver().query(builderBuildUpon.build(), null, "visible=?", new String[]{"1"}, "begin ASC");
            Uri uri = Uri.parse("content://com.coloros.calendar/calendar_alerts");
            Uri uri2 = Uri.parse("content://com.coloros.calendar/reminders");
            arrayList2.add(cursorQuery3);
            arrayList3.add(uri);
            arrayList4.add(uri2);
            LogUtil.a("CalendarBuilderUtils", "OPPO getSevenDayCalendar: qcursor is", cursorQuery3.toString());
        }
        Cursor cursorQuery4 = CalendarContract.Instances.query(context.getContentResolver(), null, timeInMillis, timeInMillis2);
        Uri uri3 = CalendarContract.CalendarAlerts.CONTENT_URI;
        Uri uri4 = Uri.parse("content://com.android.calendar/reminders");
        LogUtil.a("CalendarBuilderUtils", "getSevenDayCalendar: qcursor is", cursorQuery4.toString());
        arrayList2.add(cursorQuery4);
        arrayList3.add(uri3);
        arrayList4.add(uri4);
        Cursor cursor5 = null;
        Cursor cursor6 = null;
        int i7 = 0;
        while (i7 < arrayList2.size()) {
            Cursor cursor7 = (Cursor) arrayList2.get(i7);
            Uri uri5 = (Uri) arrayList3.get(i7);
            Uri uri6 = (Uri) arrayList4.get(i7);
            if (cursor7 != null) {
                try {
                    int count = cursor7.getCount();
                    Object[] objArr = new Object[2];
                    objArr[c3] = "getSevenDayCalendar: qcursor count";
                    objArr[1] = Integer.valueOf(count);
                    LogUtil.a("CalendarBuilderUtils", objArr);
                    while (true) {
                        if (cursor7 != null) {
                            c2 = 5;
                            break;
                        }
                        try {
                            try {
                                try {
                                    if (cursor7.moveToNext()) {
                                        c2 = 5;
                                        break;
                                    }
                                    string = cursor7.getString(cursor7.getColumnIndex("title"));
                                    string2 = cursor7.getString(cursor7.getColumnIndex(HeaderType.EVENT_ID));
                                    string3 = cursor7.getString(cursor7.getColumnIndex("calendar_id"));
                                    i3 = cursor7.getInt(cursor7.getColumnIndex("calendar_color"));
                                    string4 = cursor7.getString(cursor7.getColumnIndex("account_name"));
                                    arrayList2 = arrayList2;
                                    try {
                                        string5 = cursor7.getString(cursor7.getColumnIndex("account_type"));
                                        arrayList3 = arrayList3;
                                        try {
                                            string6 = cursor7.getString(cursor7.getColumnIndex("calendar_displayName"));
                                            arrayList4 = arrayList4;
                                            try {
                                                string7 = cursor7.getString(cursor7.getColumnIndex("eventLocation"));
                                                i7 = i7;
                                                try {
                                                    string8 = cursor7.getString(cursor7.getColumnIndex("description"));
                                                    cursor6 = cursor6;
                                                    try {
                                                        cursor5 = cursor5;
                                                        try {
                                                            try {
                                                                j = cursor7.getLong(cursor7.getColumnIndex("begin"));
                                                                arrayList = arrayList;
                                                                try {
                                                                    j2 = cursor7.getLong(cursor7.getColumnIndex(TtmlNode.END));
                                                                    i4 = cursor7.getInt(cursor7.getColumnIndex("allDay"));
                                                                    i5 = cursor7.getInt(cursor7.getColumnIndex("hasAlarm"));
                                                                    string9 = cursor7.getString(cursor7.getColumnIndex("rrule"));
                                                                    string10 = cursor7.getString(cursor7.getColumnIndex("calendar_timezone"));
                                                                    String[] strArr = {string2};
                                                                    cursor7 = cursor7;
                                                                    try {
                                                                        cursorQuery = context.getContentResolver().query(uri5, new String[]{str3}, "event_id=?", strArr, null);
                                                                        i6 = -1;
                                                                        while (cursorQuery != null) {
                                                                            try {
                                                                                if (cursorQuery.moveToNext()) {
                                                                                    break;
                                                                                }
                                                                                Uri uri7 = uri5;
                                                                                i6 = cursorQuery.getInt(cursorQuery.getColumnIndex(str3));
                                                                                uri5 = uri7;
                                                                            } catch (Exception e2) {
                                                                                e = e2;
                                                                                str2 = str2;
                                                                                str3 = str3;
                                                                                cursor3 = cursorQuery;
                                                                                cursor5 = cursor5;
                                                                                c2 = 5;
                                                                            } catch (Throwable th) {
                                                                                th = th;
                                                                                cursor = cursorQuery;
                                                                                cursor2 = cursor;
                                                                                cursor5 = cursor5;
                                                                                if (cursor7 != null) {
                                                                                    cursor7.close();
                                                                                }
                                                                                if (cursor5 != null) {
                                                                                    cursor5.close();
                                                                                }
                                                                                if (cursor2 != null) {
                                                                                    cursor2.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                            cursor6 = cursor3;
                                                                            arrayList = arrayList;
                                                                            c3 = 0;
                                                                            LogUtil.a("CalendarBuilderUtils", "getSevenDayCalendarData: Exception.", ExceptionUtils.c(e));
                                                                            if (cursor7 != null) {
                                                                                cursor7.close();
                                                                            }
                                                                            if (cursor5 != null) {
                                                                                cursor5.close();
                                                                            }
                                                                            if (cursor6 != null) {
                                                                                cursor6.close();
                                                                            }
                                                                            i7++;
                                                                            arrayList = arrayList;
                                                                            c3 = c3;
                                                                            str2 = str2;
                                                                            arrayList2 = arrayList2;
                                                                            arrayList3 = arrayList3;
                                                                            arrayList4 = arrayList4;
                                                                            str3 = str3;
                                                                        }
                                                                        Uri uri8 = uri5;
                                                                        try {
                                                                            try {
                                                                                Object[] objArr2 = new Object[6];
                                                                                objArr2[0] = "getSevenDayCalendar: qcursor event tiltle:  ";
                                                                                objArr2[1] = string;
                                                                                objArr2[2] = "dtstart: ";
                                                                                objArr2[3] = Long.valueOf(j);
                                                                                str3 = str3;
                                                                                try {
                                                                                    objArr2[4] = "dtend: ";
                                                                                    c2 = 5;
                                                                                    try {
                                                                                        objArr2[5] = Long.valueOf(j2);
                                                                                        LogUtil.a("CalendarBuilderUtils", objArr2);
                                                                                        stringBuffer = new StringBuffer();
                                                                                        cursorQuery2 = context.getContentResolver().query(uri6, new String[]{str2}, "event_id=?", strArr, null);
                                                                                        while (cursorQuery2 != null) {
                                                                                            try {
                                                                                                if (cursorQuery2.moveToNext()) {
                                                                                                    break;
                                                                                                }
                                                                                                cursor3 = cursorQuery;
                                                                                                try {
                                                                                                    try {
                                                                                                        StringBuilder sb = new StringBuilder();
                                                                                                        Uri uri9 = uri6;
                                                                                                        sb.append(cursorQuery2.getString(cursorQuery2.getColumnIndex(str2)));
                                                                                                        sb.append(",");
                                                                                                        stringBuffer.append(sb.toString());
                                                                                                        cursorQuery = cursor3;
                                                                                                        uri6 = uri9;
                                                                                                    } catch (Throwable th2) {
                                                                                                        th = th2;
                                                                                                        cursor4 = cursorQuery2;
                                                                                                        cursor2 = cursor3;
                                                                                                        cursor5 = cursor4;
                                                                                                        if (cursor7 != null) {
                                                                                                            cursor7.close();
                                                                                                        }
                                                                                                        if (cursor5 != null) {
                                                                                                            cursor5.close();
                                                                                                        }
                                                                                                        if (cursor2 != null) {
                                                                                                            cursor2.close();
                                                                                                        }
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (Exception e3) {
                                                                                                    e = e3;
                                                                                                    str2 = str2;
                                                                                                    cursor4 = cursorQuery2;
                                                                                                    cursor5 = cursor4;
                                                                                                    cursor6 = cursor3;
                                                                                                    arrayList = arrayList;
                                                                                                    c3 = 0;
                                                                                                    LogUtil.a("CalendarBuilderUtils", "getSevenDayCalendarData: Exception.", ExceptionUtils.c(e));
                                                                                                    if (cursor7 != null) {
                                                                                                        cursor7.close();
                                                                                                    }
                                                                                                    if (cursor5 != null) {
                                                                                                        cursor5.close();
                                                                                                    }
                                                                                                    if (cursor6 != null) {
                                                                                                        cursor6.close();
                                                                                                    }
                                                                                                    i7++;
                                                                                                    arrayList = arrayList;
                                                                                                    c3 = c3;
                                                                                                    str2 = str2;
                                                                                                    arrayList2 = arrayList2;
                                                                                                    arrayList3 = arrayList3;
                                                                                                    arrayList4 = arrayList4;
                                                                                                    str3 = str3;
                                                                                                }
                                                                                            } catch (Exception e4) {
                                                                                                e = e4;
                                                                                                cursor3 = cursorQuery;
                                                                                            } catch (Throwable th3) {
                                                                                                th = th3;
                                                                                                cursor3 = cursorQuery;
                                                                                            }
                                                                                        }
                                                                                        cursor3 = cursorQuery;
                                                                                        Uri uri10 = uri6;
                                                                                        try {
                                                                                            string11 = stringBuffer.toString();
                                                                                            str2 = str2;
                                                                                            try {
                                                                                                cursor4 = cursorQuery2;
                                                                                                try {
                                                                                                    try {
                                                                                                        if (a(string10, j) < a(System.currentTimeMillis(), true) || i4 != 1) {
                                                                                                            String str4 = string2 + "_" + j;
                                                                                                            if (string4 == null) {
                                                                                                                strD = "";
                                                                                                            } else {
                                                                                                                strD = d(string4, 64);
                                                                                                            }
                                                                                                            if (string5 == null) {
                                                                                                                strD2 = "";
                                                                                                            } else {
                                                                                                                strD2 = d(string5, 64);
                                                                                                            }
                                                                                                            if (string6 == null) {
                                                                                                                strD3 = "";
                                                                                                            } else {
                                                                                                                strD3 = d(string6, 64);
                                                                                                            }
                                                                                                            if (string == null) {
                                                                                                                strD4 = "";
                                                                                                            } else {
                                                                                                                strD4 = d(string, 500);
                                                                                                            }
                                                                                                            if (string7 == null) {
                                                                                                                strD5 = "";
                                                                                                            } else {
                                                                                                                strD5 = d(string7, 256);
                                                                                                            }
                                                                                                            if (string8 == null) {
                                                                                                                strD6 = "";
                                                                                                            } else {
                                                                                                                strD6 = d(string8, 512);
                                                                                                            }
                                                                                                            if (string9 == null) {
                                                                                                                str = "";
                                                                                                            } else {
                                                                                                                str = string9;
                                                                                                            }
                                                                                                            arrayList = arrayList;
                                                                                                            try {
                                                                                                                arrayList.add(new SimpleCalendarBean(str4, string2, 1, string3, i3, strD, strD2, strD3, strD4, strD5, strD6, j, j2, i4, i5, string11, i6, str));
                                                                                                            } catch (Exception e5) {
                                                                                                                e = e5;
                                                                                                                cursor6 = cursor3;
                                                                                                                cursor5 = cursor4;
                                                                                                                c3 = 0;
                                                                                                                LogUtil.a("CalendarBuilderUtils", "getSevenDayCalendarData: Exception.", ExceptionUtils.c(e));
                                                                                                                if (cursor7 != null) {
                                                                                                                    cursor7.close();
                                                                                                                }
                                                                                                                if (cursor5 != null) {
                                                                                                                    cursor5.close();
                                                                                                                }
                                                                                                                if (cursor6 != null) {
                                                                                                                    cursor6.close();
                                                                                                                }
                                                                                                                i7++;
                                                                                                                arrayList = arrayList;
                                                                                                                c3 = c3;
                                                                                                                str2 = str2;
                                                                                                                arrayList2 = arrayList2;
                                                                                                                arrayList3 = arrayList3;
                                                                                                                arrayList4 = arrayList4;
                                                                                                                str3 = str3;
                                                                                                            }
                                                                                                        } else {
                                                                                                            try {
                                                                                                                if (a(string10, j2) < a(System.currentTimeMillis(), false)) {
                                                                                                                    LogUtil.a("CalendarBuilderUtils", "getSevenDayCalendar: Expired Calendar Events title: ", string, ",dtstart: ", Long.valueOf(j));
                                                                                                                    arrayList = arrayList;
                                                                                                                } else {
                                                                                                                    String str5 = string2 + "_" + j;
                                                                                                                    if (string4 == null) {
                                                                                                                        strD = "";
                                                                                                                    } else {
                                                                                                                        strD = d(string4, 64);
                                                                                                                    }
                                                                                                                    if (string5 == null) {
                                                                                                                        strD2 = "";
                                                                                                                    } else {
                                                                                                                        strD2 = d(string5, 64);
                                                                                                                    }
                                                                                                                    if (string6 == null) {
                                                                                                                        strD3 = "";
                                                                                                                    } else {
                                                                                                                        strD3 = d(string6, 64);
                                                                                                                    }
                                                                                                                    if (string == null) {
                                                                                                                        strD4 = "";
                                                                                                                    } else {
                                                                                                                        strD4 = d(string, 500);
                                                                                                                    }
                                                                                                                    if (string7 == null) {
                                                                                                                        strD5 = "";
                                                                                                                    } else {
                                                                                                                        strD5 = d(string7, 256);
                                                                                                                    }
                                                                                                                    if (string8 == null) {
                                                                                                                        strD6 = "";
                                                                                                                    } else {
                                                                                                                        strD6 = d(string8, 512);
                                                                                                                    }
                                                                                                                    if (string9 == null) {
                                                                                                                        str = "";
                                                                                                                    } else {
                                                                                                                        str = string9;
                                                                                                                    }
                                                                                                                    arrayList = arrayList;
                                                                                                                    arrayList.add(new SimpleCalendarBean(str5, string2, 1, string3, i3, strD, strD2, strD3, strD4, strD5, strD6, j, j2, i4, i5, string11, i6, str));
                                                                                                                }
                                                                                                            } catch (Exception e6) {
                                                                                                                e = e6;
                                                                                                                cursor5 = cursor4;
                                                                                                                cursor6 = cursor3;
                                                                                                                arrayList = arrayList;
                                                                                                                c3 = 0;
                                                                                                                LogUtil.a("CalendarBuilderUtils", "getSevenDayCalendarData: Exception.", ExceptionUtils.c(e));
                                                                                                                if (cursor7 != null) {
                                                                                                                    cursor7.close();
                                                                                                                }
                                                                                                                if (cursor5 != null) {
                                                                                                                    cursor5.close();
                                                                                                                }
                                                                                                                if (cursor6 != null) {
                                                                                                                    cursor6.close();
                                                                                                                }
                                                                                                                i7++;
                                                                                                                arrayList = arrayList;
                                                                                                                c3 = c3;
                                                                                                                str2 = str2;
                                                                                                                arrayList2 = arrayList2;
                                                                                                                arrayList3 = arrayList3;
                                                                                                                arrayList4 = arrayList4;
                                                                                                                str3 = str3;
                                                                                                            }
                                                                                                        }
                                                                                                        arrayList = arrayList;
                                                                                                        cursor6 = cursor3;
                                                                                                        uri6 = uri10;
                                                                                                        str2 = str2;
                                                                                                        cursor5 = cursor4;
                                                                                                        arrayList2 = arrayList2;
                                                                                                        arrayList3 = arrayList3;
                                                                                                        arrayList4 = arrayList4;
                                                                                                        i7 = i7;
                                                                                                        cursor7 = cursor7;
                                                                                                        uri5 = uri8;
                                                                                                        str3 = str3;
                                                                                                        c3 = 0;
                                                                                                    } catch (Exception e7) {
                                                                                                        e = e7;
                                                                                                        arrayList = arrayList;
                                                                                                        cursor6 = cursor3;
                                                                                                        cursor5 = cursor4;
                                                                                                        c3 = 0;
                                                                                                        LogUtil.a("CalendarBuilderUtils", "getSevenDayCalendarData: Exception.", ExceptionUtils.c(e));
                                                                                                        if (cursor7 != null) {
                                                                                                            cursor7.close();
                                                                                                        }
                                                                                                        if (cursor5 != null) {
                                                                                                            cursor5.close();
                                                                                                        }
                                                                                                        if (cursor6 != null) {
                                                                                                            cursor6.close();
                                                                                                        }
                                                                                                        i7++;
                                                                                                        arrayList = arrayList;
                                                                                                        c3 = c3;
                                                                                                        str2 = str2;
                                                                                                        arrayList2 = arrayList2;
                                                                                                        arrayList3 = arrayList3;
                                                                                                        arrayList4 = arrayList4;
                                                                                                        str3 = str3;
                                                                                                    }
                                                                                                } catch (Throwable th4) {
                                                                                                    th = th4;
                                                                                                    cursor2 = cursor3;
                                                                                                    cursor5 = cursor4;
                                                                                                    if (cursor7 != null) {
                                                                                                        cursor7.close();
                                                                                                    }
                                                                                                    if (cursor5 != null) {
                                                                                                        cursor5.close();
                                                                                                    }
                                                                                                    if (cursor2 != null) {
                                                                                                        cursor2.close();
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (Exception e8) {
                                                                                                e = e8;
                                                                                                cursor4 = cursorQuery2;
                                                                                                arrayList = arrayList;
                                                                                                cursor6 = cursor3;
                                                                                                cursor5 = cursor4;
                                                                                                c3 = 0;
                                                                                                LogUtil.a("CalendarBuilderUtils", "getSevenDayCalendarData: Exception.", ExceptionUtils.c(e));
                                                                                                if (cursor7 != null) {
                                                                                                    cursor7.close();
                                                                                                }
                                                                                                if (cursor5 != null) {
                                                                                                    cursor5.close();
                                                                                                }
                                                                                                if (cursor6 != null) {
                                                                                                    cursor6.close();
                                                                                                }
                                                                                                i7++;
                                                                                                arrayList = arrayList;
                                                                                                c3 = c3;
                                                                                                str2 = str2;
                                                                                                arrayList2 = arrayList2;
                                                                                                arrayList3 = arrayList3;
                                                                                                arrayList4 = arrayList4;
                                                                                                str3 = str3;
                                                                                            }
                                                                                        } catch (Exception e9) {
                                                                                            e = e9;
                                                                                            str2 = str2;
                                                                                        }
                                                                                    } catch (Exception e10) {
                                                                                        e = e10;
                                                                                        str2 = str2;
                                                                                        cursor6 = cursorQuery;
                                                                                        cursor5 = cursor5;
                                                                                    }
                                                                                } catch (Exception e11) {
                                                                                    e = e11;
                                                                                    c2 = 5;
                                                                                    cursor6 = cursorQuery;
                                                                                    cursor5 = cursor5;
                                                                                    c3 = 0;
                                                                                    LogUtil.a("CalendarBuilderUtils", "getSevenDayCalendarData: Exception.", ExceptionUtils.c(e));
                                                                                    if (cursor7 != null) {
                                                                                        cursor7.close();
                                                                                    }
                                                                                    if (cursor5 != null) {
                                                                                        cursor5.close();
                                                                                    }
                                                                                    if (cursor6 != null) {
                                                                                        cursor6.close();
                                                                                    }
                                                                                    i7++;
                                                                                    arrayList = arrayList;
                                                                                    c3 = c3;
                                                                                    str2 = str2;
                                                                                    arrayList2 = arrayList2;
                                                                                    arrayList3 = arrayList3;
                                                                                    arrayList4 = arrayList4;
                                                                                    str3 = str3;
                                                                                }
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                                cursor = cursorQuery;
                                                                                cursor2 = cursor;
                                                                                cursor5 = cursor5;
                                                                            }
                                                                        } catch (Exception e12) {
                                                                            e = e12;
                                                                            str3 = str3;
                                                                        }
                                                                    } catch (Exception e13) {
                                                                        e = e13;
                                                                        arrayList = arrayList;
                                                                        c2 = 5;
                                                                        cursor6 = cursor6;
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        cursor = cursor6;
                                                                        cursor2 = cursor;
                                                                        cursor5 = cursor5;
                                                                        if (cursor7 != null) {
                                                                            cursor7.close();
                                                                        }
                                                                        if (cursor5 != null) {
                                                                            cursor5.close();
                                                                        }
                                                                        if (cursor2 != null) {
                                                                            cursor2.close();
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (Exception e14) {
                                                                    e = e14;
                                                                    cursor7 = cursor7;
                                                                }
                                                            } catch (Exception e15) {
                                                                e = e15;
                                                                cursor7 = cursor7;
                                                                c2 = 5;
                                                                cursor6 = cursor6;
                                                                cursor5 = cursor5;
                                                                c3 = 0;
                                                                LogUtil.a("CalendarBuilderUtils", "getSevenDayCalendarData: Exception.", ExceptionUtils.c(e));
                                                                if (cursor7 != null) {
                                                                    cursor7.close();
                                                                }
                                                                if (cursor5 != null) {
                                                                    cursor5.close();
                                                                }
                                                                if (cursor6 != null) {
                                                                    cursor6.close();
                                                                }
                                                                i7++;
                                                                arrayList = arrayList;
                                                                c3 = c3;
                                                                str2 = str2;
                                                                arrayList2 = arrayList2;
                                                                arrayList3 = arrayList3;
                                                                arrayList4 = arrayList4;
                                                                str3 = str3;
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            cursor7 = cursor7;
                                                            cursor = cursor6;
                                                            cursor2 = cursor;
                                                            cursor5 = cursor5;
                                                            if (cursor7 != null) {
                                                                cursor7.close();
                                                            }
                                                            if (cursor5 != null) {
                                                                cursor5.close();
                                                            }
                                                            if (cursor2 != null) {
                                                                cursor2.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception e16) {
                                                        e = e16;
                                                        cursor5 = cursor5;
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        cursor5 = cursor5;
                                                    }
                                                } catch (Exception e17) {
                                                    e = e17;
                                                    str2 = str2;
                                                    str3 = str3;
                                                    arrayList = arrayList;
                                                    cursor5 = cursor5;
                                                    cursor6 = cursor6;
                                                    cursor7 = cursor7;
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    cursor5 = cursor5;
                                                    cursor6 = cursor6;
                                                }
                                            } catch (Exception e18) {
                                                e = e18;
                                                str2 = str2;
                                                str3 = str3;
                                                arrayList = arrayList;
                                                cursor5 = cursor5;
                                                cursor6 = cursor6;
                                                i7 = i7;
                                                cursor7 = cursor7;
                                                c2 = 5;
                                            }
                                        } catch (Exception e19) {
                                            e = e19;
                                            str2 = str2;
                                            str3 = str3;
                                            arrayList = arrayList;
                                            arrayList4 = arrayList4;
                                        }
                                    } catch (Exception e20) {
                                        e = e20;
                                        arrayList3 = arrayList3;
                                    }
                                    c3 = 0;
                                    LogUtil.a("CalendarBuilderUtils", "getSevenDayCalendarData: Exception.", ExceptionUtils.c(e));
                                    if (cursor7 != null) {
                                        cursor7.close();
                                    }
                                    if (cursor5 != null) {
                                        cursor5.close();
                                    }
                                    if (cursor6 != null) {
                                        cursor6.close();
                                    }
                                    i7++;
                                    arrayList = arrayList;
                                    c3 = c3;
                                    str2 = str2;
                                    arrayList2 = arrayList2;
                                    arrayList3 = arrayList3;
                                    arrayList4 = arrayList4;
                                    str3 = str3;
                                } catch (Throwable th10) {
                                    th = th10;
                                    cursor2 = cursor6;
                                    if (cursor7 != null) {
                                        cursor7.close();
                                    }
                                    if (cursor5 != null) {
                                        cursor5.close();
                                    }
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e21) {
                                e = e21;
                                arrayList2 = arrayList2;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            cursor7 = cursor7;
                            cursor6 = cursor6;
                            cursor5 = cursor5;
                            cursor2 = cursor6;
                        }
                        arrayList3 = arrayList3;
                        arrayList4 = arrayList4;
                        c2 = 5;
                        cursor6 = cursor6;
                        cursor5 = cursor5;
                    }
                    if (cursor7 != 0) {
                        cursor7.close();
                    }
                    if (cursor5 != 0) {
                        cursor5.close();
                    }
                    if (cursor6 != 0) {
                        cursor6.close();
                    }
                    cursor6 = cursor6;
                    cursor5 = cursor5;
                } catch (Exception e22) {
                    e = e22;
                    str2 = str2;
                    str3 = str3;
                    arrayList = arrayList;
                    arrayList2 = arrayList2;
                    i7 = i7;
                    cursor7 = cursor7;
                    arrayList3 = arrayList3;
                    arrayList4 = arrayList4;
                    c2 = 5;
                } catch (Throwable th12) {
                    th = th12;
                    cursor7 = cursor7;
                    cursor2 = cursor6;
                    if (cursor7 != null) {
                        cursor7.close();
                    }
                    if (cursor5 != null) {
                        cursor5.close();
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
                i7++;
                arrayList = arrayList;
                c3 = c3;
                str2 = str2;
                arrayList2 = arrayList2;
                arrayList3 = arrayList3;
                arrayList4 = arrayList4;
                str3 = str3;
            } else {
                while (true) {
                    if (cursor7 != null) {
                        c2 = 5;
                        break;
                    }
                    if (cursor7.moveToNext()) {
                        c2 = 5;
                        break;
                    }
                    string = cursor7.getString(cursor7.getColumnIndex("title"));
                    string2 = cursor7.getString(cursor7.getColumnIndex(HeaderType.EVENT_ID));
                    string3 = cursor7.getString(cursor7.getColumnIndex("calendar_id"));
                    i3 = cursor7.getInt(cursor7.getColumnIndex("calendar_color"));
                    string4 = cursor7.getString(cursor7.getColumnIndex("account_name"));
                    arrayList2 = arrayList2;
                    string5 = cursor7.getString(cursor7.getColumnIndex("account_type"));
                    arrayList3 = arrayList3;
                    string6 = cursor7.getString(cursor7.getColumnIndex("calendar_displayName"));
                    arrayList4 = arrayList4;
                    string7 = cursor7.getString(cursor7.getColumnIndex("eventLocation"));
                    i7 = i7;
                    string8 = cursor7.getString(cursor7.getColumnIndex("description"));
                    cursor6 = cursor6;
                    cursor5 = cursor5;
                    j = cursor7.getLong(cursor7.getColumnIndex("begin"));
                    arrayList = arrayList;
                    j2 = cursor7.getLong(cursor7.getColumnIndex(TtmlNode.END));
                    i4 = cursor7.getInt(cursor7.getColumnIndex("allDay"));
                    i5 = cursor7.getInt(cursor7.getColumnIndex("hasAlarm"));
                    string9 = cursor7.getString(cursor7.getColumnIndex("rrule"));
                    string10 = cursor7.getString(cursor7.getColumnIndex("calendar_timezone"));
                    String[] strArr2 = {string2};
                    cursor7 = cursor7;
                    cursorQuery = context.getContentResolver().query(uri5, new String[]{str3}, "event_id=?", strArr2, null);
                    i6 = -1;
                    while (cursorQuery != null) {
                        if (cursorQuery.moveToNext()) {
                            break;
                            break;
                        }
                        Uri uri11 = uri5;
                        i6 = cursorQuery.getInt(cursorQuery.getColumnIndex(str3));
                        uri5 = uri11;
                        cursor6 = cursor3;
                        arrayList = arrayList;
                        c3 = 0;
                        LogUtil.a("CalendarBuilderUtils", "getSevenDayCalendarData: Exception.", ExceptionUtils.c(e));
                        if (cursor7 != null) {
                            cursor7.close();
                        }
                        if (cursor5 != null) {
                            cursor5.close();
                        }
                        if (cursor6 != null) {
                            cursor6.close();
                        }
                        i7++;
                        arrayList = arrayList;
                        c3 = c3;
                        str2 = str2;
                        arrayList2 = arrayList2;
                        arrayList3 = arrayList3;
                        arrayList4 = arrayList4;
                        str3 = str3;
                    }
                    Uri uri12 = uri5;
                    Object[] objArr3 = new Object[6];
                    objArr3[0] = "getSevenDayCalendar: qcursor event tiltle:  ";
                    objArr3[1] = string;
                    objArr3[2] = "dtstart: ";
                    objArr3[3] = Long.valueOf(j);
                    str3 = str3;
                    objArr3[4] = "dtend: ";
                    c2 = 5;
                    objArr3[5] = Long.valueOf(j2);
                    LogUtil.a("CalendarBuilderUtils", objArr3);
                    stringBuffer = new StringBuffer();
                    cursorQuery2 = context.getContentResolver().query(uri6, new String[]{str2}, "event_id=?", strArr2, null);
                    while (cursorQuery2 != null) {
                        if (cursorQuery2.moveToNext()) {
                            break;
                            break;
                        }
                        cursor3 = cursorQuery;
                        StringBuilder sb2 = new StringBuilder();
                        Uri uri13 = uri6;
                        sb2.append(cursorQuery2.getString(cursorQuery2.getColumnIndex(str2)));
                        sb2.append(",");
                        stringBuffer.append(sb2.toString());
                        cursorQuery = cursor3;
                        uri6 = uri13;
                    }
                    cursor3 = cursorQuery;
                    Uri uri14 = uri6;
                    string11 = stringBuffer.toString();
                    str2 = str2;
                    cursor4 = cursorQuery2;
                    if (a(string10, j) < a(System.currentTimeMillis(), true)) {
                        String str6 = string2 + "_" + j;
                        if (string4 == null) {
                            strD = "";
                        } else {
                            strD = d(string4, 64);
                        }
                        if (string5 == null) {
                            strD2 = "";
                        } else {
                            strD2 = d(string5, 64);
                        }
                        if (string6 == null) {
                            strD3 = "";
                        } else {
                            strD3 = d(string6, 64);
                        }
                        if (string == null) {
                            strD4 = "";
                        } else {
                            strD4 = d(string, 500);
                        }
                        if (string7 == null) {
                            strD5 = "";
                        } else {
                            strD5 = d(string7, 256);
                        }
                        if (string8 == null) {
                            strD6 = "";
                        } else {
                            strD6 = d(string8, 512);
                        }
                        if (string9 == null) {
                            str = "";
                        } else {
                            str = string9;
                        }
                        arrayList = arrayList;
                        arrayList.add(new SimpleCalendarBean(str6, string2, 1, string3, i3, strD, strD2, strD3, strD4, strD5, strD6, j, j2, i4, i5, string11, i6, str));
                    } else {
                        String str7 = string2 + "_" + j;
                        if (string4 == null) {
                            strD = "";
                        } else {
                            strD = d(string4, 64);
                        }
                        if (string5 == null) {
                            strD2 = "";
                        } else {
                            strD2 = d(string5, 64);
                        }
                        if (string6 == null) {
                            strD3 = "";
                        } else {
                            strD3 = d(string6, 64);
                        }
                        if (string == null) {
                            strD4 = "";
                        } else {
                            strD4 = d(string, 500);
                        }
                        if (string7 == null) {
                            strD5 = "";
                        } else {
                            strD5 = d(string7, 256);
                        }
                        if (string8 == null) {
                            strD6 = "";
                        } else {
                            strD6 = d(string8, 512);
                        }
                        if (string9 == null) {
                            str = "";
                        } else {
                            str = string9;
                        }
                        arrayList = arrayList;
                        arrayList.add(new SimpleCalendarBean(str7, string2, 1, string3, i3, strD, strD2, strD3, strD4, strD5, strD6, j, j2, i4, i5, string11, i6, str));
                    }
                    arrayList = arrayList;
                    cursor6 = cursor3;
                    uri6 = uri14;
                    str2 = str2;
                    cursor5 = cursor4;
                    arrayList2 = arrayList2;
                    arrayList3 = arrayList3;
                    arrayList4 = arrayList4;
                    i7 = i7;
                    cursor7 = cursor7;
                    uri5 = uri12;
                    str3 = str3;
                    c3 = 0;
                    arrayList3 = arrayList3;
                    arrayList4 = arrayList4;
                    c2 = 5;
                    cursor6 = cursor6;
                    cursor5 = cursor5;
                    c3 = 0;
                    LogUtil.a("CalendarBuilderUtils", "getSevenDayCalendarData: Exception.", ExceptionUtils.c(e));
                    if (cursor7 != null) {
                        cursor7.close();
                    }
                    if (cursor5 != null) {
                        cursor5.close();
                    }
                    if (cursor6 != null) {
                        cursor6.close();
                    }
                    i7++;
                    arrayList = arrayList;
                    c3 = c3;
                    str2 = str2;
                    arrayList2 = arrayList2;
                    arrayList3 = arrayList3;
                    arrayList4 = arrayList4;
                    str3 = str3;
                }
                if (cursor7 != 0) {
                    cursor7.close();
                }
                if (cursor5 != 0) {
                    cursor5.close();
                }
                if (cursor6 != 0) {
                    cursor6.close();
                }
                cursor6 = cursor6;
                cursor5 = cursor5;
                i7++;
                arrayList = arrayList;
                c3 = c3;
                str2 = str2;
                arrayList2 = arrayList2;
                arrayList3 = arrayList3;
                arrayList4 = arrayList4;
                str3 = str3;
            }
            if (cursor7 != null) {
                cursor7.close();
            }
            if (cursor5 != null) {
                cursor5.close();
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        return arrayList;
    }

    public static List<SimpleCalendarBean> b(Context context, String str, long j, long j2) throws Throwable {
        LogUtil.a("CalendarBuilderUtils", "Enter getCalendarDataForSmart");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ContentResolver contentResolver = context.getContentResolver();
        LogUtil.a("CalendarBuilderUtils", "Start query Calendar events for SmartWatch");
        List<String> listB = b(context, str, j, j2, arrayList2, arrayList3);
        if (arrayList3.size() != 0) {
            LogUtil.a("CalendarBuilderUtils", "smartWatch:query events from oppo, size is " + arrayList3.size());
            c(arrayList, contentResolver, listB.get(0), new Uri[]{Uri.parse("content://com.coloros.calendar/events"), Uri.parse("content://com.coloros.calendar/calendars"), Uri.parse("content://com.coloros.calendar/reminders"), Uri.parse("content://com.coloros.calendar/calendar_alerts")});
        }
        if (arrayList2.size() != 0) {
            LogUtil.a("CalendarBuilderUtils", "smartWatch:query events from android, size is " + arrayList2.size());
            c(arrayList, contentResolver, listB.get(listB.size() + (-1)), new Uri[]{CalendarContract.Events.CONTENT_URI, CalendarContract.Calendars.CONTENT_URI, CalendarContract.Reminders.CONTENT_URI, CalendarContract.CalendarAlerts.CONTENT_URI});
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0381  */
    /* JADX WARN: Code duplicated, block: B:110:0x0386  */
    /* JADX WARN: Code duplicated, block: B:112:0x038b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0390  */
    /* JADX WARN: Code duplicated, block: B:118:0x0397  */
    /* JADX WARN: Code duplicated, block: B:120:0x039c  */
    /* JADX WARN: Code duplicated, block: B:122:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:124:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    private static void c(List<SimpleCalendarBean> list, ContentResolver contentResolver, String str, Uri[] uriArr) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        Cursor cursor4;
        Cursor cursorQuery2;
        Cursor cursor5;
        Cursor cursor6;
        Cursor cursor7;
        int i;
        String string;
        int i2;
        String str2;
        String string2;
        int i3;
        Cursor cursor8;
        Uri uri = uriArr[0];
        int i4 = 1;
        Uri uri2 = uriArr[1];
        int i5 = 2;
        Uri uri3 = uriArr[2];
        Uri uri4 = uriArr[3];
        try {
            Cursor cursorQuery3 = contentResolver.query(uri, e, str, null, null);
            cursorQuery = null;
            cursor = null;
            cursor2 = null;
            while (cursorQuery3.moveToNext()) {
                try {
                    try {
                        String string3 = cursorQuery3.getString(cursorQuery3.getColumnIndex("_sync_id"));
                        String string4 = cursorQuery3.getString(cursorQuery3.getColumnIndex("_id"));
                        String string5 = cursorQuery3.getString(cursorQuery3.getColumnIndex("calendar_id"));
                        String string6 = cursorQuery3.getString(cursorQuery3.getColumnIndex("account_name"));
                        String string7 = cursorQuery3.getString(cursorQuery3.getColumnIndex("account_type"));
                        String string8 = cursorQuery3.getString(cursorQuery3.getColumnIndex("title"));
                        String string9 = cursorQuery3.getString(cursorQuery3.getColumnIndex("eventLocation"));
                        String string10 = cursorQuery3.getString(cursorQuery3.getColumnIndex("eventTimezone"));
                        String string11 = cursorQuery3.getString(cursorQuery3.getColumnIndex("eventEndTimezone"));
                        int i6 = cursorQuery3.getInt(cursorQuery3.getColumnIndex("eventStatus"));
                        String string12 = cursorQuery3.getString(cursorQuery3.getColumnIndex("duration"));
                        String string13 = cursorQuery3.getString(cursorQuery3.getColumnIndex("organizer"));
                        int i7 = cursorQuery3.getInt(cursorQuery3.getColumnIndex("selfAttendeeStatus"));
                        int i8 = cursorQuery3.getInt(cursorQuery3.getColumnIndex("availability"));
                        int i9 = cursorQuery3.getInt(cursorQuery3.getColumnIndex("hasExtendedProperties"));
                        String string14 = cursorQuery3.getString(cursorQuery3.getColumnIndex("description"));
                        long j = cursorQuery3.getLong(cursorQuery3.getColumnIndex("dtstart"));
                        long j2 = cursorQuery3.getLong(cursorQuery3.getColumnIndex("dtend"));
                        int i10 = cursorQuery3.getInt(cursorQuery3.getColumnIndex("allDay"));
                        int i11 = cursorQuery3.getInt(cursorQuery3.getColumnIndex("hasAlarm"));
                        String string15 = cursorQuery3.getString(cursorQuery3.getColumnIndex("rrule"));
                        String string16 = cursorQuery3.getString(cursorQuery3.getColumnIndex("exdate"));
                        int iD = d(uri, contentResolver, string4);
                        Object[] objArr = new Object[i5];
                        objArr[0] = "calendarType is";
                        objArr[i4] = Integer.valueOf(iD);
                        LogUtil.a("CalendarBuilderUtils", objArr);
                        cursor4 = cursorQuery3;
                        try {
                            Cursor cursorQuery4 = contentResolver.query(uri2, f42245b, b(), new String[]{string5}, null);
                            try {
                                if (cursorQuery4.moveToFirst()) {
                                    i2 = cursorQuery4.getInt(cursorQuery4.getColumnIndex("calendar_color"));
                                    string = cursorQuery4.getString(cursorQuery4.getColumnIndex("calendar_displayName"));
                                    i = cursorQuery4.getInt(cursorQuery4.getColumnIndex("visible"));
                                } else {
                                    i = i4;
                                    string = "";
                                    i2 = -1;
                                }
                                int i12 = (CommonUtil.bd() && i10 == i4) ? 540 : 0;
                                if (i11 == i4) {
                                    str2 = "event_id of the reminder is";
                                    cursor6 = cursorQuery4;
                                    try {
                                        cursorQuery2 = contentResolver.query(uri3, d, "event_id=?", new String[]{string4}, null);
                                        try {
                                            StringBuffer stringBuffer = new StringBuffer();
                                            int i13 = -1;
                                            while (cursorQuery2 != null && cursorQuery2.moveToNext()) {
                                                LogUtil.a("CalendarBuilderUtils", str2 + cursorQuery2.getString(0));
                                                stringBuffer.append(cursorQuery2.getInt(cursorQuery2.getColumnIndex("minutes")) - i12).append(",");
                                                i13 = cursorQuery2.getInt(cursorQuery2.getColumnIndex("method"));
                                            }
                                            cursor8 = cursorQuery2;
                                            string2 = stringBuffer.toString();
                                            i3 = i13;
                                        } catch (Exception e2) {
                                            e = e2;
                                            cursor7 = null;
                                            cursor2 = cursorQuery2;
                                            cursorQuery = cursor7;
                                            cursor3 = cursor4;
                                            cursor = cursor6;
                                            try {
                                                LogUtil.a("CalendarBuilderUtils", "queryEventsForSmart: Exception.", ExceptionUtils.c(e));
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                    return;
                                                }
                                                return;
                                            } catch (Throwable th) {
                                                th = th;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor5 = null;
                                            cursor2 = cursorQuery2;
                                            cursorQuery = cursor5;
                                            cursor3 = cursor4;
                                            cursor = cursor6;
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        cursorQuery2 = null;
                                        cursor7 = null;
                                        cursor2 = cursorQuery2;
                                        cursorQuery = cursor7;
                                        cursor3 = cursor4;
                                        cursor = cursor6;
                                        LogUtil.a("CalendarBuilderUtils", "queryEventsForSmart: Exception.", ExceptionUtils.c(e));
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cursorQuery2 = null;
                                        cursor5 = null;
                                        cursor2 = cursorQuery2;
                                        cursorQuery = cursor5;
                                        cursor3 = cursor4;
                                        cursor = cursor6;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    str2 = "event_id of the reminder is";
                                    cursor6 = cursorQuery4;
                                    string2 = "";
                                    i3 = -1;
                                    cursor8 = null;
                                }
                                try {
                                    cursorQuery = contentResolver.query(uri4, f42244a, "event_id=?", new String[]{string4}, null);
                                    int i14 = -1;
                                    while (cursorQuery != null) {
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            LogUtil.a("CalendarBuilderUtils", str2 + cursorQuery.getString(0));
                                            i14 = cursorQuery.getInt(cursorQuery.getColumnIndex("state"));
                                        } catch (Exception e4) {
                                            e = e4;
                                            cursor7 = cursorQuery;
                                            cursorQuery2 = cursor8;
                                            cursor2 = cursorQuery2;
                                            cursorQuery = cursor7;
                                            cursor3 = cursor4;
                                            cursor = cursor6;
                                            LogUtil.a("CalendarBuilderUtils", "queryEventsForSmart: Exception.", ExceptionUtils.c(e));
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            cursor5 = cursorQuery;
                                            cursorQuery2 = cursor8;
                                            cursor2 = cursorQuery2;
                                            cursorQuery = cursor5;
                                            cursor3 = cursor4;
                                            cursor = cursor6;
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    if ((!TextUtils.isEmpty(string13) && string13.contains("Birthday")) || string13.contains("Anniversary") || string13.contains("birthday") || string13.contains("anniversary")) {
                                        string15 = "";
                                    }
                                    long jD = d(string12);
                                    LogUtil.a("CalendarBuilderUtils", "getSmartsEvent: qcursor event tiltle:  ", string8, "dtstart: ", Long.valueOf(j), "dtend: ", Long.valueOf(j2), " ,parseDuration: ", Long.valueOf(jD));
                                    list.add(new SmartSimpleCalendarBean(b(string3), string4, string4, 1, string5, i2, string6, string7, string, string8, b(string9), b(string10), b(string11), i6, b(string12), b(string13), i7, i8, i9, b(string14), j, a(j, j2, jD), i10, i11, string2, i3, i14, b(string15), b(string16), i, iD));
                                    cursorQuery3 = cursor4;
                                    cursor = cursor6;
                                    cursor2 = cursor8;
                                    i4 = 1;
                                    i5 = 2;
                                } catch (Exception e5) {
                                    e = e5;
                                    cursorQuery2 = cursor8;
                                    cursor7 = null;
                                    cursor2 = cursorQuery2;
                                    cursorQuery = cursor7;
                                    cursor3 = cursor4;
                                    cursor = cursor6;
                                    LogUtil.a("CalendarBuilderUtils", "queryEventsForSmart: Exception.", ExceptionUtils.c(e));
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th5) {
                                    th = th5;
                                    cursorQuery2 = cursor8;
                                    cursor5 = null;
                                    cursor2 = cursorQuery2;
                                    cursorQuery = cursor5;
                                    cursor3 = cursor4;
                                    cursor = cursor6;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                cursor6 = cursorQuery4;
                            } catch (Throwable th6) {
                                th = th6;
                                cursor6 = cursorQuery4;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            cursorQuery2 = null;
                            cursor7 = null;
                            cursor6 = null;
                            cursor2 = cursorQuery2;
                            cursorQuery = cursor7;
                            cursor3 = cursor4;
                            cursor = cursor6;
                            LogUtil.a("CalendarBuilderUtils", "queryEventsForSmart: Exception.", ExceptionUtils.c(e));
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                                return;
                            }
                            return;
                        } catch (Throwable th7) {
                            th = th7;
                            cursorQuery2 = null;
                            cursor5 = null;
                            cursor6 = null;
                            cursor2 = cursorQuery2;
                            cursorQuery = cursor5;
                            cursor3 = cursor4;
                            cursor = cursor6;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            throw th;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        cursor4 = cursorQuery3;
                    } catch (Throwable th8) {
                        th = th8;
                        cursor4 = cursorQuery3;
                    }
                } catch (Exception e9) {
                    e = e9;
                    cursor3 = cursorQuery3;
                } catch (Throwable th9) {
                    th = th9;
                    cursor3 = cursorQuery3;
                }
            }
            Cursor cursor9 = cursorQuery3;
            if (cursor9 != null) {
                cursor9.close();
            }
            if (cursor != null) {
                cursor.close();
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e10) {
            e = e10;
            cursorQuery = null;
            cursor = null;
            cursor2 = null;
            cursor3 = null;
        } catch (Throwable th10) {
            th = th10;
            cursorQuery = null;
            cursor = null;
            cursor2 = null;
            cursor3 = null;
        }
    }

    private static int d(Uri uri, ContentResolver contentResolver, String str) {
        if (CommonUtil.bg()) {
            return c(uri, contentResolver, str);
        }
        try {
            int i = 0;
            Cursor cursorQuery = contentResolver.query(uri, new String[]{"setLunar"}, "_id== " + str, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                i = cursorQuery.getInt(cursorQuery.getColumnIndex("setLunar"));
                cursorQuery.close();
            }
            LogUtil.e("CalendarBuilderUtils", "getLunar calendarType: ", Integer.valueOf(i));
            return i;
        } catch (Exception e2) {
            LogUtil.e("CalendarBuilderUtils", "get lunar signal catch exception", ExceptionUtils.c(e2));
            return a(uri, contentResolver, str);
        }
    }

    private static int a(Uri uri, ContentResolver contentResolver, String str) {
        int i;
        try {
            Cursor cursorQuery = contentResolver.query(uri, new String[]{"BirthdayState"}, "_id== " + str, null, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                i = 0;
            } else {
                i = cursorQuery.getInt(cursorQuery.getColumnIndex("BirthdayState"));
                try {
                    cursorQuery.close();
                } catch (Exception e2) {
                    e = e2;
                    LogUtil.e("CalendarBuilderUtils", "get lunar signal catch exception", ExceptionUtils.c(e));
                }
            }
        } catch (Exception e3) {
            e = e3;
            i = 0;
        }
        LogUtil.e("CalendarBuilderUtils", "getVivoLunar calendarType: ", Integer.valueOf(i));
        return i == 2 ? 1 : 0;
    }

    private static int c(Uri uri, ContentResolver contentResolver, String str) {
        int i = 0;
        try {
            Cursor cursorQuery = contentResolver.query(uri, new String[]{"event_calendar_type"}, "_id== " + str, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                i = cursorQuery.getInt(cursorQuery.getColumnIndex("event_calendar_type"));
                cursorQuery.close();
            }
        } catch (Exception e2) {
            LogUtil.e("CalendarBuilderUtils", "getHuaweiLunar signal catch exception", ExceptionUtils.c(e2));
        }
        LogUtil.a("CalendarBuilderUtils", "getHuaweiLunar calendarType: ", Integer.valueOf(i));
        return i;
    }

    private static String b(String str) {
        return str == null ? "" : str;
    }

    private static List<String> b(Context context, String str, long j, long j2, List<String> list, List<String> list2) {
        LogUtil.a("CalendarBuilderUtils", "query event_id from instance for smartwatch");
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = context.getContentResolver();
        if (mri.d(BaseApplication.getContext())) {
            Uri.Builder builderBuildUpon = Uri.parse("content://com.coloros.calendar/instances/when").buildUpon();
            ContentUris.appendId(builderBuildUpon, j);
            ContentUris.appendId(builderBuildUpon, j2);
            Cursor cursorQuery = context.getContentResolver().query(builderBuildUpon.build(), f42246c, "visible=?", new String[]{"1"}, "event_id ASC");
            LogUtil.a("CalendarBuilderUtils", "oppo exdate update success ?", Boolean.valueOf(a(contentResolver, e(cursorQuery.getCount(), cursorQuery, list2, arrayList, str + "oppoInstance"), Uri.parse("content://com.coloros.calendar/events"), str)));
        }
        Cursor cursorQuery2 = CalendarContract.Instances.query(context.getContentResolver(), f42246c, j, j2);
        int count = cursorQuery2.getCount();
        LogUtil.a("CalendarBuilderUtils", "query event_id from android instance,count is: " + count);
        LogUtil.a("CalendarBuilderUtils", "oppo exdate update success ?", Boolean.valueOf(a(contentResolver, e(count, cursorQuery2, list, arrayList, str + "Instance"), CalendarContract.Events.CONTENT_URI, str)));
        return arrayList;
    }

    private static Map<String, String> e(int i, Cursor cursor, List<String> list, List<String> list2, String str) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        if (i > 0) {
            sb.append("_id IN (");
        }
        while (cursor != null && cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndex(HeaderType.EVENT_ID));
            long j = cursor.getLong(cursor.getColumnIndex("begin"));
            String string2 = cursor.getString(cursor.getColumnIndex("rrule"));
            String string3 = cursor.getString(cursor.getColumnIndex("exdate"));
            int i2 = cursor.getInt(cursor.getColumnIndex("allDay"));
            long j2 = !mtz.b(string2) ? 1L : 0L;
            CalendarDbBean calendarDbBean = new CalendarDbBean(string + "_" + j, 1, string, j, j2, i2, string3);
            if (j2 == 1) {
                arrayList.add(calendarDbBean);
            }
            if (!list.contains(string)) {
                list.add(string);
                sb.append(string);
                sb.append(",");
            }
        }
        if (i > 0) {
            sb.delete(sb.length() - 1, sb.length());
            sb.append(Constants.RIGHT_BRACKET_ONLY);
            list2.add(sb.toString());
        }
        if (cursor != null) {
            cursor.close();
        }
        return !CommonUtil.bg() ? mrc.e(str, arrayList) : map;
    }

    private static boolean a(ContentResolver contentResolver, Map<String, String> map, Uri uri, String str) {
        LogUtil.a("CalendarBuilderUtils", "Enter updateExDate");
        if (map == null || uri == null) {
            LogUtil.e("CalendarBuilderUtils", "param of updateExDate is invalid");
            return false;
        }
        if (map.size() == 0) {
            return true;
        }
        mqs.b(BaseApplication.getContext());
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                long j = Long.parseLong(key);
                String value = entry.getValue();
                ContentValues contentValues = new ContentValues();
                contentValues.put("exdate", value);
                LogUtil.a("CalendarBuilderUtils", "update exDate success?", contentResolver.update(ContentUris.withAppendedId(uri, j), contentValues, null, null) > 0 ? "yes" : "no", "eventId = ", key, "exDate = ", value);
            }
            return true;
        } catch (Exception e2) {
            LogUtil.e("CalendarBuilderUtils", "update ExDate catch error", ExceptionUtils.c(e2));
            return false;
        } finally {
            mrf.d().b(BaseApplication.getContext());
        }
    }

    private static String b() {
        return "_id=?";
    }

    private static String d(String str, int i) {
        String strC = HEXUtils.c(str);
        String strC2 = HEXUtils.c("...");
        if (strC.length() / 2 > i) {
            String strSubstring = strC.substring(0, (i - 6) * 2);
            String strB = HEXUtils.b(strSubstring);
            char[] charArray = strB.substring(strB.length() - 2).toCharArray();
            char c2 = charArray[0];
            char c3 = charArray[1];
            if (!Character.isHighSurrogate(c2) || !Character.isLowSurrogate(c3)) {
                strSubstring = HEXUtils.c(strB.substring(0, strB.length() - 1));
                Log.i("CalendarBuilderUtils", "getCalendarContentHex discard last char");
            }
            Log.i("CalendarBuilderUtils", "getCalendarContentHex source textContentHex: " + strC);
            strC = strSubstring + strC2;
        }
        return HEXUtils.b(strC);
    }

    private static long a(long j, boolean z) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (z) {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        } else {
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 0);
            calendar.set(14, 0);
        }
        calendar.setTimeZone(TimeZone.getDefault());
        long timeInMillis = calendar.getTimeInMillis();
        LogUtil.a("CalendarBuilderUtils", "getBeginOfDate1 beginTimestamp : ", Long.valueOf(timeInMillis));
        return timeInMillis;
    }

    private static long a(String str, long j) {
        try {
            TimeZone timeZone = TimeZone.getTimeZone(TimeZone.getDefault().getID());
            TimeZone timeZone2 = TimeZone.getTimeZone(str);
            return j + ((long) (timeZone2.getOffset(j) - timeZone.getOffset(j)));
        } catch (Exception e2) {
            LogUtil.a("CalendarBuilderUtils", "timeZoneConversion Exception : ", ExceptionUtils.c(e2));
            return j;
        }
    }

    public static long a(Context context, SmartSimpleCalendarBean smartSimpleCalendarBean) {
        long j;
        Cursor cursorQuery = context.getContentResolver().query(CalendarContract.Calendars.CONTENT_URI, f42245b, "((account_name = ?) AND (account_type = ?))", new String[]{smartSimpleCalendarBean.getAccountName(), smartSimpleCalendarBean.getAccountType()}, null);
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            j = 0;
        } else {
            j = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
            cursorQuery.close();
        }
        if (j != 0) {
            return j;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("account_name", smartSimpleCalendarBean.getAccountName());
        contentValues.put("account_type", smartSimpleCalendarBean.getAccountType());
        contentValues.put("calendar_displayName", smartSimpleCalendarBean.getCalendarDisplayName());
        contentValues.put("calendar_color", Integer.valueOf(smartSimpleCalendarBean.getCalendarColor()));
        contentValues.put("calendar_access_level", (Integer) 700);
        contentValues.put("sync_events", (Integer) 1);
        contentValues.put("ownerAccount", smartSimpleCalendarBean.getAccountName());
        Uri uriInsert = context.getContentResolver().insert(Uri.parse(String.valueOf(CalendarContract.Calendars.CONTENT_URI)).buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", smartSimpleCalendarBean.getAccountName()).appendQueryParameter("account_type", smartSimpleCalendarBean.getAccountType()).build(), contentValues);
        if (uriInsert == null) {
            return -1L;
        }
        return ContentUris.parseId(uriInsert);
    }

    public static boolean b(Context context, String str, int i, String str2) {
        boolean z;
        LogUtil.a("CalendarBuilderUtils", "Enter inSertReminder");
        boolean z2 = false;
        if (context == null) {
            return false;
        }
        if (mtz.b(str) || mtz.b(str2)) {
            LogUtil.j("CalendarBuilderUtils", "not need to insert reminder");
            return false;
        }
        try {
            ContentResolver contentResolver = context.getContentResolver();
            ContentValues contentValues = new ContentValues();
            String[] strArrSplit = str.split(",");
            int length = strArrSplit.length;
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                iArr[i2] = Integer.parseInt(strArrSplit[i2].trim());
            }
            long j = Long.parseLong(str2);
            int i3 = 0;
            z = false;
            while (i3 < length) {
                try {
                    int i4 = iArr[i3];
                    contentValues.put(HeaderType.EVENT_ID, Long.valueOf(j));
                    contentValues.put("minutes", Integer.valueOf(i4));
                    contentValues.put("method", Integer.valueOf(i));
                    Uri uriInsert = contentResolver.insert(CalendarContract.Reminders.CONTENT_URI, contentValues);
                    if (uriInsert == null) {
                        LogUtil.e("CalendarBuilderUtils", "insertReminder to URi failed");
                        return z;
                    }
                    LogUtil.a("CalendarBuilderUtils", "insertReminder result reminderId is" + Long.parseLong(uriInsert.getLastPathSegment()));
                    i3++;
                    z = true;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        LogUtil.e("CalendarBuilderUtils", "insertReminder fail", ExceptionUtils.c(e));
                        return z;
                    } catch (Throwable unused) {
                        z2 = z;
                        return z2;
                    }
                } catch (Throwable unused2) {
                    return z;
                }
            }
            return z;
        } catch (Exception e3) {
            e = e3;
            z = false;
        } catch (Throwable unused3) {
            return z2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007f A[Catch: Exception -> 0x00f2, TRY_LEAVE, TryCatch #4 {Exception -> 0x00f2, blocks: (B:19:0x0046, B:22:0x004e, B:32:0x0077, B:34:0x007f, B:27:0x0064, B:30:0x0070), top: B:84:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093 A[Catch: Exception -> 0x00f0, TryCatch #0 {Exception -> 0x00f0, blocks: (B:35:0x0087, B:38:0x0093, B:40:0x009a, B:42:0x00a2), top: B:77:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2 A[Catch: Exception -> 0x00f0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f0, blocks: (B:35:0x0087, B:38:0x0093, B:40:0x009a, B:42:0x00a2), top: B:77:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b4 A[Catch: Exception -> 0x00ed, TryCatch #1 {Exception -> 0x00ed, blocks: (B:43:0x00aa, B:46:0x00b4, B:48:0x00bb, B:50:0x00c3), top: B:79:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3 A[Catch: Exception -> 0x00ed, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ed, blocks: (B:43:0x00aa, B:46:0x00b4, B:48:0x00bb, B:50:0x00c3), top: B:79:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3 A[Catch: Exception -> 0x00eb, TryCatch #2 {Exception -> 0x00eb, blocks: (B:51:0x00cb, B:54:0x00d3, B:56:0x00da, B:58:0x00e2), top: B:81:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2 A[Catch: Exception -> 0x00eb, TRY_LEAVE, TryCatch #2 {Exception -> 0x00eb, blocks: (B:51:0x00cb, B:54:0x00d3, B:56:0x00da, B:58:0x00e2), top: B:81:0x00cb }] */
    private static long d(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iIndexOf;
        int iIndexOf2;
        int iIndexOf3;
        int iIndexOf4;
        if (TextUtils.isEmpty(str) || str.length() < 3) {
            return 0L;
        }
        LogUtil.a("CalendarBuilderUtils", "parseDuration duration: ", str);
        if (str.startsWith("P")) {
            str = str.substring(1);
        }
        int i7 = 0;
        try {
            int iIndexOf5 = str.indexOf(ExifInterface.GPS_DIRECTION_TRUE);
            try {
                if (iIndexOf5 > 0) {
                    int i8 = iIndexOf5 - 1;
                    i = str.charAt(i8) == 'D' ? Integer.parseInt(str.substring(0, i8)) : 0;
                    if (iIndexOf5 == str.length() - 1) {
                        i6 = 0;
                        i3 = 0;
                        i4 = 0;
                    } else {
                        str = str.substring(iIndexOf5 + 1);
                        iIndexOf = str.indexOf("W");
                        if (iIndexOf > 0) {
                            i2 = Integer.parseInt(str.substring(0, iIndexOf));
                            try {
                                if (iIndexOf == str.length() - 1) {
                                    i5 = 0;
                                    i3 = 0;
                                    i4 = 0;
                                } else {
                                    str = str.substring(iIndexOf + 1);
                                }
                            } catch (Exception e2) {
                                e = e2;
                                i3 = 0;
                                i4 = 0;
                                LogUtil.e("CalendarBuilderUtils", "parseDuration fail", ExceptionUtils.c(e));
                                i5 = i7;
                                i7 = i5;
                                i6 = i2;
                                return ((long) (i7 + ((i4 + ((i3 + ((i + (i6 * 7)) * 24)) * 60)) * 60))) * 1000;
                            }
                            i7 = i5;
                            i6 = i2;
                        } else {
                            i2 = 0;
                        }
                        iIndexOf2 = str.indexOf("H");
                        if (iIndexOf2 > 0) {
                            i3 = Integer.parseInt(str.substring(0, iIndexOf2));
                            try {
                                if (iIndexOf2 == str.length() - 1) {
                                    i5 = 0;
                                    i4 = 0;
                                } else {
                                    str = str.substring(iIndexOf2 + 1);
                                }
                            } catch (Exception e3) {
                                e = e3;
                                i4 = 0;
                                LogUtil.e("CalendarBuilderUtils", "parseDuration fail", ExceptionUtils.c(e));
                                i5 = i7;
                                i7 = i5;
                                i6 = i2;
                                return ((long) (i7 + ((i4 + ((i3 + ((i + (i6 * 7)) * 24)) * 60)) * 60))) * 1000;
                            }
                            i7 = i5;
                            i6 = i2;
                        } else {
                            i3 = 0;
                        }
                        iIndexOf3 = str.indexOf("M");
                        if (iIndexOf3 > 0) {
                            i4 = Integer.parseInt(str.substring(0, iIndexOf3));
                            try {
                                if (iIndexOf3 == str.length() - 1) {
                                    str = str.substring(iIndexOf3 + 1);
                                }
                            } catch (Exception e4) {
                                e = e4;
                                LogUtil.e("CalendarBuilderUtils", "parseDuration fail", ExceptionUtils.c(e));
                            }
                            i5 = i7;
                            i7 = i5;
                            i6 = i2;
                        } else {
                            i4 = 0;
                        }
                        iIndexOf4 = str.indexOf(ExifInterface.LATITUDE_SOUTH);
                        if (iIndexOf4 > 0) {
                            i7 = Integer.parseInt(str.substring(0, iIndexOf4));
                        }
                        i5 = i7;
                        i7 = i5;
                        i6 = i2;
                    }
                } else {
                    int iIndexOf6 = str.indexOf("D");
                    if (iIndexOf6 > 0) {
                        i = Integer.parseInt(str.substring(0, iIndexOf6));
                        if (iIndexOf6 == str.length() - 1) {
                            i6 = 0;
                            i3 = 0;
                            i4 = 0;
                        } else {
                            str = str.substring(iIndexOf6 + 1);
                        }
                    } else {
                        i = 0;
                    }
                    iIndexOf = str.indexOf("W");
                    if (iIndexOf > 0) {
                        i2 = Integer.parseInt(str.substring(0, iIndexOf));
                        if (iIndexOf == str.length() - 1) {
                            i5 = 0;
                            i3 = 0;
                            i4 = 0;
                        } else {
                            str = str.substring(iIndexOf + 1);
                        }
                        i7 = i5;
                        i6 = i2;
                    } else {
                        i2 = 0;
                    }
                    iIndexOf2 = str.indexOf("H");
                    if (iIndexOf2 > 0) {
                        i3 = Integer.parseInt(str.substring(0, iIndexOf2));
                        if (iIndexOf2 == str.length() - 1) {
                            i5 = 0;
                            i4 = 0;
                        } else {
                            str = str.substring(iIndexOf2 + 1);
                        }
                        i7 = i5;
                        i6 = i2;
                    } else {
                        i3 = 0;
                    }
                    iIndexOf3 = str.indexOf("M");
                    if (iIndexOf3 > 0) {
                        i4 = Integer.parseInt(str.substring(0, iIndexOf3));
                        if (iIndexOf3 == str.length() - 1) {
                            str = str.substring(iIndexOf3 + 1);
                        }
                        i5 = i7;
                        i7 = i5;
                        i6 = i2;
                    } else {
                        i4 = 0;
                    }
                    iIndexOf4 = str.indexOf(ExifInterface.LATITUDE_SOUTH);
                    if (iIndexOf4 > 0) {
                        i7 = Integer.parseInt(str.substring(0, iIndexOf4));
                    }
                    i5 = i7;
                    i7 = i5;
                    i6 = i2;
                }
            } catch (Exception e5) {
                e = e5;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                LogUtil.e("CalendarBuilderUtils", "parseDuration fail", ExceptionUtils.c(e));
                i5 = i7;
                i7 = i5;
                i6 = i2;
                return ((long) (i7 + ((i4 + ((i3 + ((i + (i6 * 7)) * 24)) * 60)) * 60))) * 1000;
            }
        } catch (Exception e6) {
            e = e6;
            i = 0;
        }
        return ((long) (i7 + ((i4 + ((i3 + ((i + (i6 * 7)) * 24)) * 60)) * 60))) * 1000;
    }
}
