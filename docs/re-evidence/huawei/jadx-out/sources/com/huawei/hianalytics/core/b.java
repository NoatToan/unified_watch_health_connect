package com.huawei.hianalytics.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hianalytics.core.storage.CommonHeaderEx;
import com.huawei.hianalytics.core.storage.Property;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {
    public static final String e = "CREATE TABLE COMMON_HEADER_EX (" + CommonHeaderEx.COLUMN_HASHCODE.columnName + " TEXT PRIMARY KEY NOT NULL," + CommonHeaderEx.COLUMN_HEADER.columnName + " TEXT);";

    public b(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase, CommonHeaderEx.TABLE_NAME);
    }

    @Override // com.huawei.hianalytics.core.a
    public final void a(ContentValues contentValues, Object obj) {
        CommonHeaderEx commonHeaderEx = (CommonHeaderEx) obj;
        contentValues.clear();
        contentValues.put(CommonHeaderEx.COLUMN_HASHCODE.columnName, commonHeaderEx.getEvtExHashCode());
        contentValues.put(CommonHeaderEx.COLUMN_HEADER.columnName, commonHeaderEx.getCommonHeaderEx());
    }

    @Override // com.huawei.hianalytics.core.a
    public final Object a(Cursor cursor) {
        Property property = CommonHeaderEx.COLUMN_HASHCODE;
        String string = cursor.getColumnIndex(property.columnName) == -1 ? "" : cursor.getString(cursor.getColumnIndex(property.columnName));
        Property property2 = CommonHeaderEx.COLUMN_HEADER;
        return new CommonHeaderEx(string, cursor.isNull(cursor.getColumnIndex(property2.columnName)) ? "" : cursor.getString(cursor.getColumnIndex(property2.columnName)));
    }
}
