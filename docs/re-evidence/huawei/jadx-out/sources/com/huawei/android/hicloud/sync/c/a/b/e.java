package com.huawei.android.hicloud.sync.c.a.b;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import defpackage.bce;
import defpackage.bcw;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes23.dex */
public abstract class e<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f5098a = bce.c();

    protected abstract V a(Cursor cursor);

    public void a(String str, String[] strArr) throws Exception {
        if (strArr != null) {
            this.f5098a.execSQL(str, strArr);
        } else {
            this.f5098a.execSQL(str);
        }
    }

    ArrayList<V> b(String str, String[] strArr) {
        Exception e;
        ArrayList<V> arrayList = new ArrayList<>();
        if (str == null) {
            return arrayList;
        }
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = this.f5098a.rawQuery(str, strArr);
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    ArrayList<V> arrayList2 = new ArrayList<>();
                    do {
                        try {
                            arrayList2.add(a(cursorRawQuery));
                        } catch (Exception e2) {
                            e = e2;
                            arrayList = arrayList2;
                            bcw.d("SyncOperator", "queryResult4Vo exception: " + e.getClass().getName());
                            return arrayList;
                        }
                    } while (cursorRawQuery.moveToNext());
                    arrayList = arrayList2;
                }
                if (cursorRawQuery == null) {
                    return arrayList;
                }
            } finally {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
        return arrayList;
    }

    Cursor c(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase = this.f5098a;
        if (sQLiteDatabase == null || str == null) {
            bcw.e("SyncOperator", "rawQuery database or sql is null.");
            return null;
        }
        try {
            return sQLiteDatabase.rawQuery(str, strArr);
        } catch (Exception e) {
            bcw.d("SyncOperator", "rawQuery exception: " + e.getClass().getName());
            return null;
        }
    }

    public int a(String str, ArrayList<String[]> arrayList) {
        int i;
        if (str == null) {
            return -2;
        }
        try {
            if (arrayList == null) {
                return -2;
            }
            this.f5098a.beginTransaction();
            SQLiteStatement sQLiteStatementCompileStatement = this.f5098a.compileStatement(str);
            for (String[] strArr : arrayList) {
                sQLiteStatementCompileStatement.clearBindings();
                sQLiteStatementCompileStatement.bindAllArgsAsStrings(strArr);
                sQLiteStatementCompileStatement.execute();
            }
            this.f5098a.setTransactionSuccessful();
            i = 0;
            return i;
        } catch (Exception e) {
            bcw.d("SyncOperator", "execSQL4Batch exception: " + e.getClass().getName());
            i = -1;
        } finally {
            this.f5098a.endTransaction();
        }
    }
}
