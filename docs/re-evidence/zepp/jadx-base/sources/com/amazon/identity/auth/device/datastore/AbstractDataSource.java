package com.amazon.identity.auth.device.datastore;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.amazon.identity.auth.device.dataobject.AbstractDataObject;
import com.amazon.identity.auth.map.device.utils.MAPLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDataSource<K extends AbstractDataObject> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int DELETE_SUCCEEDED = 1;
    public static final int INSERT_FAILED = -1;
    private static final String LOG_TAG = "com.amazon.identity.auth.device.datastore.AbstractDataSource";
    private static final int UPDATE_SUCCEEDED = 1;
    public SQLiteDatabase database;

    public AbstractDataSource(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            throw new IllegalArgumentException("database can't be null!");
        }
        this.database = sQLiteDatabase;
    }

    private static String getWhereClause(String[] strArr, String[] strArr2) throws IllegalArgumentException {
        String str;
        if (strArr == null && strArr2 == null) {
            return null;
        }
        if (strArr == null || strArr2 == null) {
            throw new IllegalArgumentException("Both arguments have to be either null or not null!");
        }
        if (strArr.length != strArr2.length) {
            throw new IllegalArgumentException("selectionFields and selectionValues differ in length!");
        }
        int i = 0;
        String string = "";
        while (i < strArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(strArr[i]);
            if (strArr2[i] == null) {
                str = " IS NULL";
            } else {
                str = " = '" + strArr2[i] + "'";
            }
            sb.append(str);
            String string2 = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append(i != strArr.length + (-1) ? " AND " : "");
            string = sb2.toString();
            i++;
        }
        return string;
    }

    public abstract K cursorToObject(Cursor cursor);

    public int deleteAllRows() {
        return deleteRows(null, null);
    }

    public boolean deleteRow(long j) {
        SQLiteDatabase sQLiteDatabase = this.database;
        String tableName = getTableName();
        StringBuilder sb = new StringBuilder();
        sb.append("rowid = ");
        sb.append(j);
        return sQLiteDatabase.delete(tableName, sb.toString(), null) == 1;
    }

    public int deleteRows(String[] strArr, String[] strArr2) {
        try {
            return this.database.delete(getTableName(), getWhereClause(strArr, strArr2), null);
        } catch (Exception e) {
            MAPLog.e(getLogTag(), "" + e.getMessage(), e);
            return 0;
        }
    }

    public int deleteRowsBySingleColumn(String str, String str2) {
        return deleteRows(new String[]{str}, new String[]{str2});
    }

    public List<K> findAllRows(String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.database.query(getTableName(), getAllColumns(), getWhereClause(strArr, strArr2), null, null, null, null);
                if (cursorQuery != null) {
                    cursorQuery.moveToFirst();
                    while (!cursorQuery.isAfterLast()) {
                        AbstractDataObject abstractDataObjectCursorToObject = cursorToObject(cursorQuery);
                        if (abstractDataObjectCursorToObject == null) {
                            throw new IllegalArgumentException("cursor contains invalid object!");
                        }
                        arrayList.add(abstractDataObjectCursorToObject);
                        cursorQuery.moveToNext();
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e) {
                MAPLog.e(getLogTag(), "" + e.getMessage(), e);
                arrayList.clear();
                if (cursorQuery != null) {
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public List<K> findAllRowsBySingleColumn(String str, String str2) {
        return findAllRows(new String[]{str}, new String[]{str2});
    }

    public K findByRowId(long j) {
        return (K) findOneRow(new String[]{"rowid"}, new String[]{"" + j});
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    public K findOneRow(String[] strArr, String[] strArr2) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor = (K) null;
        try {
            try {
                cursorQuery = this.database.query(getTableName(), getAllColumns(), getWhereClause(strArr, strArr2), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        cursorQuery.moveToFirst();
                        cursor = (K) cursorToObject(cursorQuery);
                    } catch (Exception e) {
                        e = e;
                        MAPLog.e(getLogTag(), "" + e.getMessage(), e);
                        if (cursorQuery != null) {
                        }
                        return (K) cursor;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                th = th;
                cursor = (K) strArr;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return (K) cursor;
    }

    public K findOneRowBySingleColumn(String str, String str2) {
        return (K) findOneRow(new String[]{str}, new String[]{str2});
    }

    public abstract String[] getAllColumns();

    public int getColumnIndex(Cursor cursor, int i) throws IllegalArgumentException {
        if (i < 0 || i >= getAllColumns().length) {
            throw new IllegalArgumentException("colIndex is out of bound!");
        }
        return cursor.getColumnIndexOrThrow(getAllColumns()[i]);
    }

    public abstract String getLogTag();

    public abstract String getTableName();

    public long insertRow(K k) {
        return insertRow(k, null);
    }

    public boolean updateRow(long j, ContentValues contentValues) {
        if (contentValues == null) {
            return false;
        }
        SQLiteDatabase sQLiteDatabase = this.database;
        String tableName = getTableName();
        StringBuilder sb = new StringBuilder();
        sb.append("rowid = ");
        sb.append(j);
        return sQLiteDatabase.update(tableName, contentValues, sb.toString(), null) == 1;
    }

    public long insertRow(K k, Context context) {
        if (k == null) {
            return -1L;
        }
        try {
            MAPLog.pii(LOG_TAG, "Insert Row table=" + getTableName(), "vals=" + k.getValuesForInsert(context));
            long jInsert = this.database.insert(getTableName(), null, k.getValuesForInsert(context));
            k.setRowId(jInsert);
            return jInsert;
        } catch (EncryptionException e) {
            MAPLog.e(LOG_TAG, "insertRow failed", e);
            return -1L;
        }
    }

    public List<K> findAllRows() {
        return findAllRows(null, null);
    }
}
