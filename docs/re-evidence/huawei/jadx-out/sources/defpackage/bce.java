package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.huawei.android.hicloud.sync.c.a.a;

/* JADX INFO: loaded from: classes23.dex */
public final class bce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile SQLiteDatabase f968a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f969c;
    private static volatile a d;

    public static void b(Context context) {
        synchronized (bce.class) {
            bcw.c("SyncDBManager", "initDataBase start!");
            f969c = context.createDeviceProtectedStorageContext();
            if (d == null) {
                bcw.c("SyncDBManager", "init db helper");
                d = new a(f969c);
            }
        }
    }

    public static SQLiteDatabase c() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (bce.class) {
            if (f968a == null) {
                try {
                    if (d == null) {
                        b(f969c);
                    }
                    f968a = d.getWritableDatabase();
                } catch (SQLiteException unused) {
                    bcw.d("SyncDBManager", "getDB() SQLiteException");
                }
            }
            sQLiteDatabase = f968a;
        }
        return sQLiteDatabase;
    }

    public static void e(Context context) {
        f969c = context;
    }

    public static Context b() {
        return f969c;
    }
}
