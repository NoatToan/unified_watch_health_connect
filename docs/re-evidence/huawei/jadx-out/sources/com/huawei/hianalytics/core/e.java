package com.huawei.hianalytics.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.Event;
import com.huawei.hianalytics.core.storage.Property;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends a {
    public static final String f;
    public static final String g;
    public SQLiteStatement e;

    static {
        StringBuilder sb = new StringBuilder("CREATE TABLE EVENT ( ");
        sb.append(Event.COLUMN_ID.columnName);
        sb.append(" INTEGER PRIMARY KEY, ");
        sb.append(Event.COLUMN_EVT_ID.columnName);
        sb.append(" TEXT, ");
        Property property = Event.COLUMN_EVT_TYPE;
        sb.append(property.columnName);
        sb.append(" TEXT, ");
        sb.append(Event.COLUMN_CONTENT.columnName);
        sb.append(" TEXT, ");
        sb.append(Event.COLUMN_EVT_TIME.columnName);
        sb.append(" TEXT, ");
        Property property2 = Event.COLUMN_SERVICE_TAG;
        sb.append(property2.columnName);
        sb.append(" TEXT, ");
        sb.append(Event.COLUMN_SESSION_ID.columnName);
        sb.append(" TEXT, ");
        sb.append(Event.COLUMN_SESSION_NAME.columnName);
        sb.append(" TEXT, ");
        sb.append(Event.COLUMN_EVT_EX_HASH_CODE.columnName);
        sb.append(" TEXT, ");
        Property property3 = Event.COLUMN_PROCESS_NAME;
        sb.append(property3.columnName);
        sb.append(" TEXT, ");
        sb.append(Event.COLUMN_IS_ENCRYPTED.columnName);
        sb.append(" INTEGER NOT NULL, ");
        Property property4 = Event.COLUMN_SUB_COUNT;
        sb.append(property4.columnName);
        sb.append(" INTEGER NOT NULL );");
        f = sb.toString();
        g = "SELECT SUM(" + property4.columnName + ") FROM EVENT WHERE " + property2.columnName + "=? AND " + property.columnName + "=? AND (" + property3.columnName + "=? OR " + property3.columnName + "=?)";
    }

    public e(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase, Event.TABLE_NAME);
    }

    @Override // com.huawei.hianalytics.core.a
    public final void a(ContentValues contentValues, Object obj) {
        Event event = (Event) obj;
        contentValues.clear();
        if (event.getId() != null) {
            contentValues.put(Event.COLUMN_ID.columnName, event.getId());
        }
        contentValues.put(Event.COLUMN_CONTENT.columnName, event.getContent());
        contentValues.put(Event.COLUMN_EVT_EX_HASH_CODE.columnName, event.getEvtExHashCode());
        contentValues.put(Event.COLUMN_EVT_ID.columnName, event.getEvtid());
        contentValues.put(Event.COLUMN_EVT_TIME.columnName, event.getEvttime());
        contentValues.put(Event.COLUMN_EVT_TYPE.columnName, event.getEvttype());
        contentValues.put(Event.COLUMN_IS_ENCRYPTED.columnName, Integer.valueOf(event.getIsEncrypted()));
        contentValues.put(Event.COLUMN_PROCESS_NAME.columnName, event.getProcessname());
        contentValues.put(Event.COLUMN_SERVICE_TAG.columnName, event.getServicetag());
        contentValues.put(Event.COLUMN_SESSION_ID.columnName, event.getSessionid());
        contentValues.put(Event.COLUMN_SESSION_NAME.columnName, event.getSessionname());
        contentValues.put(Event.COLUMN_SUB_COUNT.columnName, Integer.valueOf(event.getSubCount()));
    }

    public final long a(String str, String str2, String str3) {
        SQLiteDatabase sQLiteDatabase = this.f11469b;
        if (sQLiteDatabase == null) {
            return 0L;
        }
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(g, new String[]{str, str2, str3, ""});
            try {
                if (!cursorRawQuery.moveToFirst()) {
                    HiLog.e("EventDao", "cursor is empty");
                    cursorRawQuery.close();
                    return 0L;
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused) {
            HiLog.e("EventDao", "query sub count error");
        }
    }

    @Override // com.huawei.hianalytics.core.a
    public final Object a(Cursor cursor) {
        long j = cursor.getLong(cursor.getColumnIndex(Event.COLUMN_ID.columnName));
        String string = cursor.getString(cursor.getColumnIndex(Event.COLUMN_EVT_ID.columnName));
        String string2 = cursor.getString(cursor.getColumnIndex(Event.COLUMN_EVT_TYPE.columnName));
        String string3 = cursor.getString(cursor.getColumnIndex(Event.COLUMN_CONTENT.columnName));
        String string4 = cursor.getString(cursor.getColumnIndex(Event.COLUMN_EVT_TIME.columnName));
        String string5 = cursor.getString(cursor.getColumnIndex(Event.COLUMN_SERVICE_TAG.columnName));
        Property property = Event.COLUMN_SESSION_ID;
        String string6 = cursor.isNull(cursor.getColumnIndex(property.columnName)) ? "" : cursor.getString(cursor.getColumnIndex(property.columnName));
        Property property2 = Event.COLUMN_SESSION_NAME;
        String string7 = cursor.isNull(cursor.getColumnIndex(property2.columnName)) ? "" : cursor.getString(cursor.getColumnIndex(property2.columnName));
        Property property3 = Event.COLUMN_EVT_EX_HASH_CODE;
        String string8 = cursor.isNull(cursor.getColumnIndex(property3.columnName)) ? "" : cursor.getString(cursor.getColumnIndex(property3.columnName));
        String string9 = cursor.getString(cursor.getColumnIndex(Event.COLUMN_PROCESS_NAME.columnName));
        int i = cursor.getInt(cursor.getColumnIndex(Event.COLUMN_IS_ENCRYPTED.columnName));
        Property property4 = Event.COLUMN_SUB_COUNT;
        return new Event(Long.valueOf(j), string, string2, string3, string4, string5, string6, string7, string8, string9, i, cursor.isNull(cursor.getColumnIndex(property4.columnName)) ? 1 : cursor.getInt(cursor.getColumnIndex(property4.columnName)));
    }
}
