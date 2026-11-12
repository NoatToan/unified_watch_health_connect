package com.activeandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.activeandroid.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class ActiveAndroid {
    public static void beginTransaction() {
        Cache.openDatabase().beginTransaction();
    }

    public static void clearCache() {
        Cache.clear();
    }

    public static void dispose() {
        Cache.dispose();
    }

    public static void endTransaction() {
        Cache.openDatabase().endTransaction();
    }

    public static void execSQL(String str) {
        Cache.openDatabase().execSQL(str);
    }

    public static SQLiteDatabase getDatabase() {
        return Cache.openDatabase();
    }

    public static boolean inTransaction() {
        return Cache.openDatabase().inTransaction();
    }

    public static void initialize(Context context) {
        initialize(new Configuration.Builder(context).create());
    }

    public static void setLoggingEnabled(boolean z) {
        Log.setEnabled(z);
    }

    public static void setTransactionSuccessful() {
        Cache.openDatabase().setTransactionSuccessful();
    }

    public static void execSQL(String str, Object[] objArr) {
        Cache.openDatabase().execSQL(str, objArr);
    }

    public static void initialize(Configuration configuration) {
        initialize(configuration, false);
    }

    public static void initialize(Context context, boolean z) {
        initialize(new Configuration.Builder(context).create(), z);
    }

    public static void initialize(Configuration configuration, boolean z) {
        setLoggingEnabled(z);
        Cache.initialize(configuration);
    }
}
