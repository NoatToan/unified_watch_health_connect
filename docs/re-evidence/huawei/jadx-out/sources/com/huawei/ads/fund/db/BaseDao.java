package com.huawei.ads.fund.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.huawei.openplatform.abl.log.HiAdLog;
import defpackage.ayt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseDao implements IDao {
    public Context context;

    @Override // com.huawei.ads.fund.db.IDao
    public void emptyTables(String str) {
    }

    @Override // com.huawei.ads.fund.db.IDao
    public <T extends RecordBean> void update(Class<T> cls, ContentValues contentValues, String str, List<String> list) {
        BaseDbHelper dbHelper = getDbHelper();
        try {
            dbHelper.update(cls.getSimpleName(), contentValues, str, list);
        } finally {
            releaseDbHelper(dbHelper);
        }
    }

    @Override // com.huawei.ads.fund.db.IDao
    public <T extends RecordBean> int update(Class<T> cls, ContentValues contentValues, String str, String[] strArr) {
        BaseDbHelper dbHelper = getDbHelper();
        try {
            return dbHelper.update(cls.getSimpleName(), contentValues, str, strArr);
        } finally {
            releaseDbHelper(dbHelper);
        }
    }

    @Override // com.huawei.ads.fund.db.IDao
    public void releaseDbHelper(BaseDbHelper baseDbHelper) {
        if (baseDbHelper != null) {
            baseDbHelper.a();
        }
    }

    @Override // com.huawei.ads.fund.db.IDao
    public List<String> rawQuerySpecColumn(String str, String[] strArr, String str2) {
        BaseDbHelper dbHelper;
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            dbHelper = getDbHelper();
            try {
                cursorRawQuery = dbHelper.rawQuery(str, strArr);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            arrayList.add(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(str2)));
                        } catch (Exception unused) {
                            HiAdLog.e(getTag(), "query exception");
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                try {
                    HiAdLog.e(getTag(), "query db exception: %s", th.getClass().getSimpleName());
                } finally {
                    closeCursor(cursorRawQuery);
                    releaseDbHelper(dbHelper);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            dbHelper = null;
        }
        return arrayList;
    }

    @Override // com.huawei.ads.fund.db.IDao
    public <T extends RecordBean> List<T> rawQuery(Class<T> cls, String str, String[] strArr) {
        BaseDbHelper dbHelper;
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            dbHelper = getDbHelper();
            try {
                cursorRawQuery = dbHelper.rawQuery(str, strArr);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            T tNewInstance = cls.newInstance();
                            tNewInstance.toBean(cursorRawQuery);
                            arrayList.add(tNewInstance);
                        } catch (Throwable th) {
                            HiAdLog.e(getTag(), "query:" + th.getClass().getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    HiAdLog.e(getTag(), "query db exception: %s", th.getClass().getSimpleName());
                    return arrayList;
                } finally {
                    closeCursor(cursorRawQuery);
                    releaseDbHelper(dbHelper);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            dbHelper = null;
        }
        return arrayList;
    }

    @Override // com.huawei.ads.fund.db.IDao
    public long queryCount(String str) {
        BaseDbHelper dbHelper = getDbHelper();
        try {
            return dbHelper.queryCount(str);
        } catch (Exception unused) {
            HiAdLog.e(getTag(), "queryCount exception");
            return 0L;
        } finally {
            releaseDbHelper(dbHelper);
        }
    }

    @Override // com.huawei.ads.fund.db.IDao
    public <T extends RecordBean> List<T> query(Class<T> cls, String[] strArr, String str, String[] strArr2, String str2, String str3) {
        BaseDbHelper dbHelper;
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            dbHelper = getDbHelper();
            try {
                cursorQuery = dbHelper.query(cls.getSimpleName(), strArr, str, strArr2, str2, str3);
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        try {
                            T tNewInstance = cls.newInstance();
                            tNewInstance.toBean(cursorQuery);
                            arrayList.add(tNewInstance);
                        } catch (Throwable th) {
                            HiAdLog.e(getTag(), "query:" + th.getClass().getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    HiAdLog.e(getTag(), "query db exception: %s", th.getClass().getSimpleName());
                    return arrayList;
                } finally {
                    closeCursor(cursorQuery);
                    releaseDbHelper(dbHelper);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            dbHelper = null;
        }
        return arrayList;
    }

    @Override // com.huawei.ads.fund.db.IDao
    public void insertOrUpdate(List<ayt> list) {
        BaseDbHelper dbHelper = getDbHelper();
        try {
            dbHelper.insertOrUpdate(list);
        } finally {
            releaseDbHelper(dbHelper);
        }
    }

    @Override // com.huawei.ads.fund.db.IDao
    public void insert(List<ayt> list) {
        BaseDbHelper dbHelper = getDbHelper();
        try {
            dbHelper.insert(list);
        } finally {
            releaseDbHelper(dbHelper);
        }
    }

    @Override // com.huawei.ads.fund.db.IDao
    public <T extends RecordBean> long insert(Class<T> cls, ContentValues contentValues) {
        BaseDbHelper dbHelper = getDbHelper();
        try {
            return dbHelper.insert(cls.getSimpleName(), contentValues);
        } finally {
            releaseDbHelper(dbHelper);
        }
    }

    @Override // com.huawei.ads.fund.db.IDao
    public void executeSql(String str, Object[] objArr) {
        BaseDbHelper dbHelper = getDbHelper();
        try {
            dbHelper.executeSql(str, objArr);
        } finally {
            releaseDbHelper(dbHelper);
        }
    }

    @Override // com.huawei.ads.fund.db.IDao
    public <T extends RecordBean> void deleteSet(Class<T> cls, String str, List<String> list) {
        BaseDbHelper dbHelper = getDbHelper();
        try {
            dbHelper.delete(cls.getSimpleName(), str, list);
        } finally {
            releaseDbHelper(dbHelper);
        }
    }

    @Override // com.huawei.ads.fund.db.IDao
    public <T extends RecordBean> int delete(Class<T> cls, String str, String[] strArr) {
        BaseDbHelper dbHelper = getDbHelper();
        try {
            return dbHelper.delete(cls.getSimpleName(), str, strArr);
        } finally {
            releaseDbHelper(dbHelper);
        }
    }

    @Override // com.huawei.ads.fund.db.IDao
    public void closeCursor(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        try {
            cursor.close();
        } catch (Throwable unused) {
            HiAdLog.e(getTag(), "closeCursor exception");
        }
    }

    @Override // com.huawei.ads.fund.db.IDao
    public void clearExpiredData() {
        BaseDbHelper dbHelper = getDbHelper();
        try {
            dbHelper.clearExpiredData();
        } finally {
            releaseDbHelper(dbHelper);
        }
    }

    @Override // com.huawei.ads.fund.db.IDao
    public void batchExecute(String str, List<String[]> list) {
        BaseDbHelper dbHelper = getDbHelper();
        try {
            dbHelper.batchExecute(str, list);
        } finally {
            releaseDbHelper(dbHelper);
        }
    }

    public BaseDao(Context context) {
        this.context = context.getApplicationContext();
    }
}
