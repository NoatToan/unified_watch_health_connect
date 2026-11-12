package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes4.dex */
public class xcj extends SQLiteOpenHelper {
    public static xcj d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SQLiteDatabase f38974b;
    public long c;

    public xcj(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.c = 6291456L;
        this.f38973a = context;
    }

    public static xcj n(Context context) {
        if (d == null) {
            d = new xcj(context.getApplicationContext());
        }
        return d;
    }

    public synchronized void a() {
        m().delete("catalystLocalStorage", null, null);
    }

    public synchronized void b() throws RuntimeException {
        try {
            a();
            c();
            cm8.b("ReactNative", "Cleaned RKStorage");
        } catch (Exception unused) {
            if (!d()) {
                throw new RuntimeException("Clearing and deleting database RKStorage failed");
            }
            cm8.b("ReactNative", "Deleted Local Database RKStorage");
        }
    }

    public final synchronized void c() {
        SQLiteDatabase sQLiteDatabase = this.f38974b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f38974b.close();
            this.f38974b = null;
        }
    }

    public final synchronized boolean d() {
        c();
        return this.f38973a.deleteDatabase("RKStorage");
    }

    public synchronized boolean l() {
        SQLiteDatabase sQLiteDatabase = this.f38974b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return true;
        }
        SQLiteException e = null;
        for (int i = 0; i < 2; i++) {
            if (i > 0) {
                try {
                    d();
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            this.f38974b = getWritableDatabase();
        }
        SQLiteDatabase sQLiteDatabase2 = this.f38974b;
        if (sQLiteDatabase2 == null) {
            throw e;
        }
        sQLiteDatabase2.setMaximumSize(this.c);
        return true;
    }

    public synchronized SQLiteDatabase m() {
        l();
        return this.f38974b;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            d();
            onCreate(sQLiteDatabase);
        }
    }
}
