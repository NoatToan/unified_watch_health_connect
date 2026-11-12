package com.tekartik.sqflite;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes18.dex */
class a {
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public SQLiteDatabase e;
    public boolean f;

    /* JADX INFO: renamed from: com.tekartik.sqflite.a$a, reason: collision with other inner class name */
    public class C0749a implements DatabaseErrorHandler {
        public C0749a() {
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    public a(String str, int i, boolean z, int i2) {
        this.b = str;
        this.a = z;
        this.c = i;
        this.d = i2;
    }

    public static void b(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    public void a() {
        this.e.close();
    }

    public boolean c() {
        try {
            return this.e.enableWriteAheadLogging();
        } catch (Exception e) {
            Log.e(Constant.TAG, e() + "enable WAL error: " + e);
            return false;
        }
    }

    public SQLiteDatabase d() {
        return this.e;
    }

    public String e() {
        return "[" + f() + "] ";
    }

    public String f() {
        Thread threadCurrentThread = Thread.currentThread();
        return "" + this.c + "," + threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")";
    }

    public SQLiteDatabase g() {
        return this.e;
    }

    public void h() {
        this.e = SQLiteDatabase.openDatabase(this.b, null, 268435456);
    }

    public void i() {
        this.e = SQLiteDatabase.openDatabase(this.b, null, 1, new C0749a());
    }
}
