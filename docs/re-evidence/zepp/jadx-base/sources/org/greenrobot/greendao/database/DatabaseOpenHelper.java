package org.greenrobot.greendao.database;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes23.dex */
public abstract class DatabaseOpenHelper extends SQLiteOpenHelper {
    private final Context a;
    private final String b;
    private final int c;
    private a d;
    private boolean e;

    public class a extends net.sqlcipher.database.SQLiteOpenHelper {
        public a(Context context, String str, int i, boolean z) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i);
            if (z) {
                SQLiteDatabase.loadLibs(context);
            }
        }

        public void a(SQLiteDatabase sQLiteDatabase) {
            DatabaseOpenHelper.this.onCreate(d(sQLiteDatabase));
        }

        public void b(SQLiteDatabase sQLiteDatabase) {
            DatabaseOpenHelper.this.onOpen(d(sQLiteDatabase));
        }

        public void c(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            DatabaseOpenHelper.this.onUpgrade(d(sQLiteDatabase), i, i2);
        }

        public Database d(SQLiteDatabase sQLiteDatabase) {
            return new EncryptedDatabase(sQLiteDatabase);
        }
    }

    public DatabaseOpenHelper(Context context, String str, int i) {
        this(context, str, null, i);
    }

    private a a() {
        if (this.d == null) {
            this.d = new a(this.a, this.b, this.c, this.e);
        }
        return this.d;
    }

    public Database getEncryptedReadableDb(String str) {
        a aVarA = a();
        return aVarA.d(aVarA.getReadableDatabase(str));
    }

    public Database getEncryptedWritableDb(String str) {
        a aVarA = a();
        return aVarA.d(aVarA.getWritableDatabase(str));
    }

    public Database getReadableDb() {
        return wrap(getReadableDatabase());
    }

    public Database getWritableDb() {
        return wrap(getWritableDatabase());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        onCreate(wrap(sQLiteDatabase));
    }

    public void onCreate(Database database) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        onOpen(wrap(sQLiteDatabase));
    }

    public void onOpen(Database database) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(wrap(sQLiteDatabase), i, i2);
    }

    public void onUpgrade(Database database, int i, int i2) {
    }

    public void setLoadSQLCipherNativeLibs(boolean z) {
        this.e = z;
    }

    public Database wrap(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        return new StandardDatabase(sQLiteDatabase);
    }

    public DatabaseOpenHelper(Context context, String str, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.e = true;
        this.a = context;
        this.b = str;
        this.c = i;
    }

    public Database getEncryptedReadableDb(char[] cArr) {
        a aVarA = a();
        return aVarA.d(aVarA.getReadableDatabase(cArr));
    }

    public Database getEncryptedWritableDb(char[] cArr) {
        a aVarA = a();
        return aVarA.d(aVarA.getWritableDatabase(cArr));
    }
}
