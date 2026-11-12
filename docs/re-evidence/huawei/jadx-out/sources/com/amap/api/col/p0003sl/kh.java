package com.amap.api.col.p0003sl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes4.dex */
public final class kh extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f2954b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f2955c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kd f2956a;

    public kh(Context context, String str, int i, kd kdVar) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f2956a = kdVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f2956a.a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f2956a.a(sQLiteDatabase, i);
    }
}
