package com.autonavi.aps.amapapi.storage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.x3t;

/* JADX INFO: loaded from: classes4.dex */
public class c implements x3t {
    @Override // defpackage.x3t
    public final void a(SQLiteDatabase sQLiteDatabase, int i) {
    }

    @Override // defpackage.x3t
    public final String b() {
        return "alsn20170807.db";
    }

    @Override // defpackage.x3t
    public final int c() {
        return 1;
    }

    @Override // defpackage.x3t
    public final void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS c (_id integer primary key autoincrement, a2 varchar(100), a4 varchar(2000), a3 LONG );");
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "SdCardDbCreator", "onCreate");
        }
    }
}
