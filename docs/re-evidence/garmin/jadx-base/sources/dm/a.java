package dm;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class a implements d80.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f60326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd2.a.EnumC2721a f60327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f60328c;

    public a(long j8, qd2.a.EnumC2721a enumC2721a, int i14) {
        this.f60326a = j8;
        this.f60327b = enumC2721a;
        this.f60328c = i14;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // d80.h
    public final String a() throws Throwable {
        String str;
        char c14;
        char c15;
        Cursor cursorQuery;
        String[] strArr;
        qd2.a aVarB = qd2.a.b();
        aVarB.getClass();
        qd2.a.EnumC2721a enumC2721a = this.f60327b;
        Cursor cursor = null;
        if (enumC2721a == null) {
            strArr = null;
            c14 = 1;
            c15 = 0;
        } else {
            String strValueOf = String.valueOf(this.f60326a);
            String strName = enumC2721a.name();
            try {
                try {
                    try {
                        str = "getDatabaseJSON: for id [";
                        c14 = 1;
                        c15 = 0;
                        try {
                            cursorQuery = aVarB.f144484a.query("json_activities", new String[]{"saved_timestamp", "cached_val"}, "concept_id=? AND data_type=?", new String[]{strValueOf, strName}, null, null, null);
                            if (cursorQuery != null) {
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            strArr = new String[2];
                                            try {
                                                int columnIndex = cursorQuery.getColumnIndex("saved_timestamp");
                                                long j8 = 0;
                                                if (columnIndex != -1) {
                                                    try {
                                                        if (!cursorQuery.isNull(columnIndex)) {
                                                            j8 = cursorQuery.getLong(columnIndex);
                                                        }
                                                    } catch (Exception e4) {
                                                        qd2.a.f144482c.error(e4.getMessage(), (Throwable) e4);
                                                    }
                                                }
                                                strArr[0] = ((System.currentTimeMillis() - j8) / 60000) + "";
                                                int columnIndex2 = cursorQuery.getColumnIndex("cached_val");
                                                strArr[1] = (columnIndex2 == -1 || cursorQuery.isNull(columnIndex2)) ? null : cursorQuery.getString(columnIndex2);
                                            } catch (SQLException e14) {
                                                e = e14;
                                                qd2.a.f144482c.error(str + strValueOf + "] and dataType [" + strName + "]", (Throwable) e);
                                            }
                                        } else {
                                            strArr = null;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cursor = cursorQuery;
                                        qd2.a.a(cursor);
                                        throw th;
                                    }
                                } catch (SQLException e15) {
                                    e = e15;
                                    strArr = null;
                                }
                            } else {
                                strArr = null;
                            }
                        } catch (SQLException e16) {
                            e = e16;
                            cursorQuery = null;
                            strArr = null;
                            qd2.a.f144482c.error(str + strValueOf + "] and dataType [" + strName + "]", (Throwable) e);
                            qd2.a.a(cursorQuery);
                            if (strArr != null) {
                            }
                            return null;
                        }
                    } catch (SQLException e17) {
                        e = e17;
                        str = "getDatabaseJSON: for id [";
                        c14 = 1;
                        c15 = 0;
                        cursorQuery = null;
                        strArr = null;
                        qd2.a.f144482c.error(str + strValueOf + "] and dataType [" + strName + "]", (Throwable) e);
                        qd2.a.a(cursorQuery);
                        if (strArr != null) {
                        }
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    qd2.a.a(cursor);
                    throw th;
                }
            } catch (SQLException e18) {
                e = e18;
                str = "getDatabaseJSON: for id [";
            }
            qd2.a.a(cursorQuery);
        }
        if (strArr != null || TextUtils.isEmpty(strArr[c14]) || Integer.parseInt(strArr[c15]) >= this.f60328c) {
            return null;
        }
        return strArr[c14];
    }

    @Override // d80.h
    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qd2.a aVarB = qd2.a.b();
        aVarB.getClass();
        qd2.a.EnumC2721a enumC2721a = this.f60327b;
        if (enumC2721a == null || TextUtils.isEmpty(str)) {
            return;
        }
        String strValueOf = String.valueOf(this.f60326a);
        String strName = enumC2721a.name();
        Logger logger = qd2.a.f144482c;
        SQLiteDatabase sQLiteDatabase = aVarB.f144484a;
        sQLiteDatabase.beginTransaction();
        try {
            try {
                sQLiteDatabase.delete("json_activities", "concept_id=? AND data_type=?", new String[]{strValueOf, strName});
                ContentValues contentValues = new ContentValues(4);
                contentValues.put("saved_timestamp", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("concept_id", strValueOf);
                contentValues.put("data_type", strName);
                contentValues.put("cached_val", str.trim());
                sQLiteDatabase.insert("json_activities", null, contentValues);
                sQLiteDatabase.setTransactionSuccessful();
                logger.debug("JSON for " + strName + " [" + strValueOf + "] saved successfully.");
            } catch (SQLException e4) {
                logger.error("updateDatabaseJSON", (Throwable) e4);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
