package com.huawei.ads.fund.db;

import android.content.ContentValues;
import android.database.Cursor;
import defpackage.ayt;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface IDao {
    void batchExecute(String str, List<String[]> list);

    void clearExpiredData();

    void closeCursor(Cursor cursor);

    <T extends RecordBean> int delete(Class<T> cls, String str, String[] strArr);

    <T extends RecordBean> void deleteSet(Class<T> cls, String str, List<String> list);

    void emptyTables(String str);

    void executeSql(String str, Object[] objArr);

    BaseDbHelper getDbHelper();

    String getTag();

    <T extends RecordBean> long insert(Class<T> cls, ContentValues contentValues);

    void insert(List<ayt> list);

    void insertOrUpdate(List<ayt> list);

    <T extends RecordBean> List<T> query(Class<T> cls, String[] strArr, String str, String[] strArr2, String str2, String str3);

    long queryCount(String str);

    <T extends RecordBean> List<T> rawQuery(Class<T> cls, String str, String[] strArr);

    List<String> rawQuerySpecColumn(String str, String[] strArr, String str2);

    void releaseDbHelper(BaseDbHelper baseDbHelper);

    <T extends RecordBean> int update(Class<T> cls, ContentValues contentValues, String str, String[] strArr);

    <T extends RecordBean> void update(Class<T> cls, ContentValues contentValues, String str, List<String> list);
}
