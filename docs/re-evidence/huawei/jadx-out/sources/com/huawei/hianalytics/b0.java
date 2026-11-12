package com.huawei.hianalytics;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.DaoManager;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile b0 f11459a;

    public b0(Context context) {
        super(context, "haformal_event.db", (SQLiteDatabase.CursorFactory) null, 6);
    }

    public static b0 a(Context context) {
        if (f11459a == null) {
            synchronized (b0.class) {
                if (f11459a == null) {
                    f11459a = new b0(context);
                }
            }
        }
        return f11459a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        try {
            sQLiteDatabase.execSQL("PRAGMA synchronous = OFF");
        } catch (SQLException unused) {
            HiLog.e("HaOpenHelper", "execSQL synchronous OFF SQLException");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        DaoManager.getInstance().createEventTable(sQLiteDatabase);
        DaoManager.getInstance().createHeaderTable(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        HiLog.si("HaOpenHelper", "upgrade run");
        try {
            s1.a(sQLiteDatabase);
            HiLog.si("HaOpenHelper", "upgrade run success");
        } catch (Exception unused) {
            HiLog.e("HaOpenHelper", "onUpgrade error");
            DaoManager.getInstance().dropAllTable(sQLiteDatabase);
            DaoManager.getInstance().createEventTable(sQLiteDatabase);
            DaoManager.getInstance().createHeaderTable(sQLiteDatabase);
        }
    }
}
