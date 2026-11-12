package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes6.dex */
public class wcj extends SQLiteOpenHelper {
    public static wcj d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f37845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SQLiteDatabase f37846b;
    public long c;

    public wcj(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.c = c63.f4975a.longValue() * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        this.f37845a = context;
    }

    public static wcj n(Context context) {
        if (d == null) {
            d = new wcj(context.getApplicationContext());
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
        SQLiteDatabase sQLiteDatabase = this.f37846b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f37846b.close();
            this.f37846b = null;
        }
    }

    public final synchronized boolean d() {
        c();
        return this.f37845a.deleteDatabase("RKStorage");
    }

    public synchronized boolean l() {
        SQLiteDatabase sQLiteDatabase = this.f37846b;
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
            this.f37846b = getWritableDatabase();
        }
        SQLiteDatabase sQLiteDatabase2 = this.f37846b;
        if (sQLiteDatabase2 == null) {
            throw e;
        }
        sQLiteDatabase2.setMaximumSize(this.c);
        return true;
    }

    public synchronized SQLiteDatabase m() {
        l();
        return this.f37846b;
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
