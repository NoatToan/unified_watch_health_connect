package com.huawei.hianalytics.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.DBUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f11469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentValues f11470c = new ContentValues();
    public SQLiteStatement d;

    public a(SQLiteDatabase sQLiteDatabase, String str) {
        this.f11469b = sQLiteDatabase;
        this.f11468a = str;
    }

    public abstract Object a(Cursor cursor);

    public final ArrayList a(String[] strArr, String str, String[] strArr2, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f11469b.query(this.f11468a, strArr, str, strArr2, null, null, str2, str3);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(a(cursorQuery));
                }
            } catch (Exception e) {
                HiLog.e("AbstractDao", e.getMessage());
                if (cursorQuery != null) {
                }
                return arrayList;
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public abstract void a(ContentValues contentValues, Object obj);

    public final int b(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase = this.f11469b;
        int iA = -1;
        if (sQLiteDatabase == null) {
            return -1;
        }
        if (sQLiteDatabase.isDbLockedByCurrentThread()) {
            return a(str, strArr);
        }
        this.f11469b.beginTransaction();
        try {
            try {
                iA = a(str, strArr);
                this.f11469b.setTransactionSuccessful();
            } catch (Exception e) {
                HiLog.e("AbstractDao", e.getMessage());
            }
            return iA;
        } finally {
            this.f11469b.endTransaction();
        }
    }

    public final long b(List list, boolean z) {
        long j;
        long jInsert;
        long j2 = -1;
        try {
            synchronized (this) {
                j = -1;
                for (int i = 0; i < list.size(); i++) {
                    try {
                        a(this.f11470c, list.get(i));
                        if (z) {
                            jInsert = this.f11469b.insertWithOnConflict(this.f11468a, null, this.f11470c, 5);
                        } else {
                            jInsert = this.f11469b.insert(this.f11468a, null, this.f11470c);
                        }
                        j = jInsert;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Exception e) {
                            e = e;
                            j2 = j;
                            HiLog.e("AbstractDao", "insertOrReplace() error: " + e.getMessage());
                            return j2;
                        }
                    }
                }
            }
            return j;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void a() {
        SQLiteDatabase sQLiteDatabase = this.f11469b;
        if (sQLiteDatabase == null) {
            return;
        }
        DBUtil.deleteAll(sQLiteDatabase, this.f11468a);
        HiLog.i("AbstractDao", "deleteAll: ".concat(this.f11468a));
    }

    public final long a(List list, boolean z) {
        SQLiteDatabase sQLiteDatabase = this.f11469b;
        long jB = -1;
        if (sQLiteDatabase == null) {
            return -1L;
        }
        if (sQLiteDatabase.isDbLockedByCurrentThread()) {
            return b(list, z);
        }
        this.f11469b.beginTransaction();
        try {
            try {
                jB = b(list, z);
                this.f11469b.setTransactionSuccessful();
            } catch (Exception e) {
                HiLog.e("AbstractDao", e.getMessage());
            }
            return jB;
        } finally {
            this.f11469b.endTransaction();
        }
    }

    public final int a(String str, String[] strArr) {
        int iDelete = -1;
        try {
            synchronized (this) {
                iDelete = this.f11469b.delete(this.f11468a, str, strArr);
            }
            return iDelete;
        } catch (Exception e) {
            HiLog.e("AbstractDao", "deleteSynchronized() error: " + e.getMessage());
            return iDelete;
        }
    }
}
