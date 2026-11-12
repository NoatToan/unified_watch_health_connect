package com.huami.tools.analytics;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
class DbUtils {
    private static final String a = "HmStat-DbUtils";

    public interface Const {

        public interface Columns {

            public interface Context {
                public static final String APP_VERSION_CODE = "appVersionCode";
                public static final String APP_VERSION_NAME = "appVersionName";
                public static final String BRAND = "brand";
                public static final String CHANNEL = "channel";
                public static final String EVENT_VERSION = "eventVersion";
                public static final String HASH_ID = "hashId";
                public static final String LOCALE = "locale";
                public static final String MODEL = "model";
                public static final String NETWORK = "network";
                public static final String OS_LEVEL = "osLevel";
                public static final String OS_VERSION_NAME = "osVersion";
                public static final String PACKAGE_NAME = "packageName";
                public static final String RESOLUTION = "resolution";
                public static final String SDK_VERSION_NAME = "sdkVersionName";
                public static final String UID = "uid";
            }

            public interface Event {
                public static final String CONTEXT_ID = "contextId";
                public static final String EVENT_ID = "eventId";
                public static final String ID = "id";
                public static final String MULTIPLE_VALUE = "multipleValue";
                public static final String NUMBER_VALUE = "numberValue";
                public static final String STRING_VALUE = "stringValue";
                public static final String TIMESTAMP = "timestamp";
                public static final String TIMEZONE = "timezone";
                public static final String TYPE = "type";
            }
        }

        public interface Database {
            public static final String ANONYMOUS = "hmstat_ano.db";
            public static final String IDENTIFIED = "hmstat_ide.db";
        }

        public interface Table {
            public static final String CONTEXT = "context";
            public static final String EVENT = "event";
        }
    }

    public static void a(@NonNull SQLiteDatabase sQLiteDatabase, @Nullable String str) {
        String str2;
        boolean z = str == null || str.isEmpty();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM context WHERE NOT EXISTS (SELECT contextId FROM event WHERE contextId = context.hashId)");
        if (z) {
            str2 = "";
        } else {
            str2 = " AND hashId != '" + str + "'";
        }
        sb.append(str2);
        sQLiteDatabase.execSQL(sb.toString());
    }

    @NonNull
    private static ContentValues b(@NonNull d dVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Const.Columns.Context.HASH_ID, dVar.a);
        contentValues.put("uid", dVar.b);
        contentValues.put(Const.Columns.Context.APP_VERSION_CODE, Integer.valueOf(dVar.h));
        contentValues.put(Const.Columns.Context.APP_VERSION_NAME, dVar.i);
        contentValues.put(Const.Columns.Context.SDK_VERSION_NAME, dVar.k);
        contentValues.put(Const.Columns.Context.OS_LEVEL, Integer.valueOf(dVar.f));
        contentValues.put(Const.Columns.Context.OS_VERSION_NAME, dVar.g);
        contentValues.put("channel", dVar.n);
        contentValues.put("locale", dVar.j);
        contentValues.put("network", dVar.l);
        contentValues.put("resolution", dVar.m);
        contentValues.put(Const.Columns.Context.EVENT_VERSION, Integer.valueOf(dVar.o));
        contentValues.put("packageName", dVar.c);
        contentValues.put("brand", dVar.d);
        contentValues.put("model", dVar.e);
        return contentValues;
    }

    @NonNull
    private static d c(@NonNull Cursor cursor) {
        d dVar = new d();
        dVar.a = cursor.getString(cursor.getColumnIndex(Const.Columns.Context.HASH_ID));
        dVar.b = cursor.getString(cursor.getColumnIndex("uid"));
        dVar.h = cursor.getInt(cursor.getColumnIndex(Const.Columns.Context.APP_VERSION_CODE));
        dVar.i = cursor.getString(cursor.getColumnIndex(Const.Columns.Context.APP_VERSION_NAME));
        dVar.k = cursor.getString(cursor.getColumnIndex(Const.Columns.Context.SDK_VERSION_NAME));
        dVar.f = cursor.getInt(cursor.getColumnIndex(Const.Columns.Context.OS_LEVEL));
        dVar.g = cursor.getString(cursor.getColumnIndex(Const.Columns.Context.OS_VERSION_NAME));
        dVar.n = cursor.getString(cursor.getColumnIndex("channel"));
        dVar.j = cursor.getString(cursor.getColumnIndex("locale"));
        dVar.l = cursor.getString(cursor.getColumnIndex("network"));
        dVar.m = cursor.getString(cursor.getColumnIndex("resolution"));
        dVar.o = cursor.getInt(cursor.getColumnIndex(Const.Columns.Context.EVENT_VERSION));
        dVar.c = cursor.getString(cursor.getColumnIndex("packageName"));
        dVar.d = cursor.getString(cursor.getColumnIndex("brand"));
        dVar.e = cursor.getString(cursor.getColumnIndex("model"));
        return dVar;
    }

    @NonNull
    private static Event d(@NonNull Cursor cursor) {
        Event event = new Event();
        event.setContextId(cursor.getString(cursor.getColumnIndex(Const.Columns.Event.CONTEXT_ID)));
        event.setEventId(cursor.getString(cursor.getColumnIndex(Const.Columns.Event.EVENT_ID)));
        event.setTimestamp(Long.valueOf(cursor.getLong(cursor.getColumnIndex("timestamp"))));
        event.setTimezone(cursor.getString(cursor.getColumnIndex("timezone")));
        event.setType(cursor.getString(cursor.getColumnIndex("type")));
        int columnIndex = cursor.getColumnIndex(Const.Columns.Event.NUMBER_VALUE);
        if (!cursor.isNull(columnIndex)) {
            event.setNumberValue(Float.valueOf(cursor.getFloat(columnIndex)));
        }
        int columnIndex2 = cursor.getColumnIndex(Const.Columns.Event.STRING_VALUE);
        if (!cursor.isNull(columnIndex2)) {
            event.setStringValue(cursor.getString(columnIndex2));
        }
        if (!cursor.isNull(cursor.getColumnIndex(Const.Columns.Event.MULTIPLE_VALUE))) {
            event.setMultipleValue(j(cursor.getString(cursor.getColumnIndex(Const.Columns.Event.MULTIPLE_VALUE))));
        }
        return event;
    }

    @NonNull
    private static ContentValues e(@NonNull Event event) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Const.Columns.Event.CONTEXT_ID, event.getContextId());
        contentValues.put(Const.Columns.Event.EVENT_ID, event.getCom.huami.tools.analytics.DbUtils.Const.Columns.Event.EVENT_ID java.lang.String());
        contentValues.put("type", event.getType());
        contentValues.put("timestamp", event.getTimestamp());
        contentValues.put("timezone", event.getTimezone());
        if (event.getNumberValue() != null) {
            contentValues.put(Const.Columns.Event.NUMBER_VALUE, event.getNumberValue());
        }
        if (event.getStringValue() != null) {
            contentValues.put(Const.Columns.Event.STRING_VALUE, event.getStringValue());
        }
        if (event.getMultipleValue() != null) {
            contentValues.put(Const.Columns.Event.MULTIPLE_VALUE, new JSONObject(event.getMultipleValue()).toString());
        }
        return contentValues;
    }

    public static int f(@NonNull SQLiteDatabase sQLiteDatabase, @NonNull List<Event> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Event> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(it2.next().getTimestamp()));
        }
        return sQLiteDatabase.delete("event", "timestamp IN (" + TextUtils.join(",", arrayList) + ")", null);
    }

    public static boolean g(@NonNull SQLiteDatabase sQLiteDatabase, @Nullable String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        Cursor cursorQuery = sQLiteDatabase.query(Const.Table.CONTEXT, null, "hashId = ?", new String[]{str}, null, null, null);
        if (cursorQuery != null) {
            z = cursorQuery.getCount() > 0;
            cursorQuery.close();
        }
        return z;
    }

    public static long h(@NonNull SQLiteDatabase sQLiteDatabase, @NonNull d dVar) throws SQLException {
        return sQLiteDatabase.insertOrThrow(Const.Table.CONTEXT, null, b(dVar));
    }

    public static long i(@NonNull SQLiteDatabase sQLiteDatabase, @NonNull Event event) throws SQLException {
        return sQLiteDatabase.insertOrThrow("event", null, e(event));
    }

    @Nullable
    @VisibleForTesting
    private static Map<String, String> j(@NonNull String str) {
        try {
            HMLog.d("HuamiAnalytics", "字符串大小：" + str.length(), new Object[0]);
            JSONObject jSONObject = new JSONObject(str);
            HMLog.d("HuamiAnalytics", "转换为Json大小：" + jSONObject.length(), new Object[0]);
            HashMap map = new HashMap(jSONObject.length());
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            return map;
        } catch (JSONException e) {
            p.b().w(a, e, "json格式异常");
            return null;
        }
    }

    @Nullable
    public static d k(@NonNull SQLiteDatabase sQLiteDatabase, @Nullable String str) {
        Cursor cursorQuery;
        if (str == null || (cursorQuery = sQLiteDatabase.query(Const.Table.CONTEXT, null, "hashId = ?", new String[]{str}, null, null, null)) == null || !cursorQuery.moveToFirst()) {
            return null;
        }
        d dVarC = c(cursorQuery);
        cursorQuery.close();
        return dVarC;
    }

    @NonNull
    public static List<Event> l(@NonNull SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("event", null, null, null, null, null, "timestamp ASC");
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                arrayList.add(d(cursorQuery));
            }
            cursorQuery.close();
        }
        return arrayList;
    }
}
