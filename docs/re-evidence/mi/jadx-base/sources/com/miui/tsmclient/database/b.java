package com.miui.tsmclient.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.miui.tsmclient.util.IOUtils;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ReflectUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: loaded from: classes4.dex */
public class b extends SQLiteOpenHelper {
    public static final String c = "TSMDatabaseHelper";
    public static final String d = "tsmclient.db";
    public static final int e = 13;
    public static final String f = "bank_bin";
    public static final String g = "bank_info";
    public static final String h = "trans_card_info";
    public static final String i = ",";
    public static final String j = ".mitsmsdk.ExtraDataHelperImpl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f10338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f10339b;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);

        void a(SQLiteDatabase sQLiteDatabase, int i, int i2);
    }

    public b(Context context) {
        super(context, d, (SQLiteDatabase.CursorFactory) null, 13);
        this.f10338a = context;
        Object objNewInstance = ReflectUtil.newInstance(context.getPackageName() + j, (Class<?>[]) new Class[]{Context.class}, this.f10338a);
        if (objNewInstance instanceof a) {
            this.f10339b = (a) objNewInstance;
        }
        setWriteAheadLoggingEnabled(true);
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS bank_bin(_id INTEGER PRIMARY KEY AUTOINCREMENT,bin_code TEXT NOT NULL,bank_name TEXT NOT NULL,card_type INTEGER);");
    }

    public final void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS bank_info (_id INTEGER PRIMARY KEY AUTOINCREMENT,bank_code TEXT ,bank_id TEXT ,bank_name TEXT ,bank_logo TEXT );");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS BANK_ID_INDEX ON bank_info ( bank_id)");
    }

    public final void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cache(_id INTEGER PRIMARY KEY AUTOINCREMENT,key TEXT,value TEXT);");
    }

    public final void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS data_stat(_id INTEGER PRIMARY KEY AUTOINCREMENT,data_id INTEGER ,data_value TEXT ,data_time TEXT);");
    }

    public final void e(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS no_prompt_bulletin(_id INTEGER PRIMARY KEY AUTOINCREMENT,bulletin_id TEXT NOT NULL);");
    }

    public final void f(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
        b(sQLiteDatabase);
        g(sQLiteDatabase);
        a(sQLiteDatabase);
        e(sQLiteDatabase);
        d(sQLiteDatabase);
        h(sQLiteDatabase);
    }

    public final void g(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS trans_card_info (_id INTEGER PRIMARY KEY AUTOINCREMENT,card_code TEXT ,card_id TEXT ,card_name TEXT ,card_logo TEXT ,issuable INTEGER );");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS TRANS_CARD_ID_INDEX ON trans_card_info ( card_id)");
    }

    public final void h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS travel_info(_id INTEGER PRIMARY KEY AUTOINCREMENT,card_name TEXT,key INTEGER,value TEXT);");
    }

    public final void i(SQLiteDatabase sQLiteDatabase) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                sQLiteDatabase.delete("bank_bin", null, null);
                bufferedReader = new BufferedReader(new InputStreamReader(this.f10338a.getAssets().open("bank_bin")));
                try {
                    ContentValues contentValues = new ContentValues();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        contentValues.clear();
                        String[] strArrSplit = line.split(",");
                        int iIntValue = 0;
                        contentValues.put("bank_name", strArrSplit[0]);
                        contentValues.put(DatabaseConstants.BankBinTable.COLUMN_BIN_CODE, strArrSplit[1]);
                        if (TextUtils.isDigitsOnly(strArrSplit[2])) {
                            iIntValue = Integer.valueOf(strArrSplit[2]).intValue();
                        }
                        contentValues.put("card_type", Integer.valueOf(iIntValue));
                        sQLiteDatabase.insert("bank_bin", null, contentValues);
                    }
                    IOUtils.closeQuietly((Reader) bufferedReader);
                } catch (IOException e2) {
                    e = e2;
                    bufferedReader2 = bufferedReader;
                    LogUtils.e("failed to init bank card info table", e);
                    IOUtils.closeQuietly((Reader) bufferedReader2);
                } catch (Throwable th) {
                    th = th;
                    IOUtils.closeQuietly((Reader) bufferedReader);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public final void j(SQLiteDatabase sQLiteDatabase) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                sQLiteDatabase.delete("bank_info", null, null);
                bufferedReader = new BufferedReader(new InputStreamReader(this.f10338a.getAssets().open("bank_info")));
                try {
                    ContentValues contentValues = new ContentValues();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        contentValues.clear();
                        String[] strArrSplit = line.split(",");
                        contentValues.put(DatabaseConstants.BankInfoTable.COLUMN_BANK_CODE, strArrSplit[0]);
                        contentValues.put(DatabaseConstants.BankInfoTable.COLUMN_BANK_ID, strArrSplit[1]);
                        contentValues.put("bank_name", strArrSplit[2]);
                        if (strArrSplit.length > 3) {
                            contentValues.put(DatabaseConstants.BankInfoTable.COLUMN_BANK_LOGO, strArrSplit[3]);
                        }
                        sQLiteDatabase.insert("bank_info", null, contentValues);
                    }
                    IOUtils.closeQuietly((Reader) bufferedReader);
                } catch (IOException e2) {
                    e = e2;
                    bufferedReader2 = bufferedReader;
                    LogUtils.e("initBankInfoTb failed", e);
                    IOUtils.closeQuietly((Reader) bufferedReader2);
                } catch (Throwable th) {
                    th = th;
                    IOUtils.closeQuietly((Reader) bufferedReader);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public final void k(SQLiteDatabase sQLiteDatabase) throws Throwable {
        j(sQLiteDatabase);
        l(sQLiteDatabase);
        i(sQLiteDatabase);
    }

    public final void l(SQLiteDatabase sQLiteDatabase) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            sQLiteDatabase.delete("trans_card_info", null, null);
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(this.f10338a.getAssets().open("trans_card_info")));
            try {
                ContentValues contentValues = new ContentValues();
                while (true) {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        IOUtils.closeQuietly((Reader) bufferedReader2);
                        return;
                    }
                    contentValues.clear();
                    String[] strArrSplit = line.split(",");
                    contentValues.put(DatabaseConstants.TransCardInfoTable.COLUMN_CARD_CODE, strArrSplit[0]);
                    contentValues.put("card_id", strArrSplit[1]);
                    contentValues.put("card_name", strArrSplit[2]);
                    contentValues.put(DatabaseConstants.TransCardInfoTable.COLUMN_CARD_LOGO, strArrSplit[3]);
                    contentValues.put(DatabaseConstants.TransCardInfoTable.COLUMN_ISSUABLE, strArrSplit[4]);
                    sQLiteDatabase.insert("trans_card_info", null, contentValues);
                }
            } catch (IOException unused) {
                bufferedReader = bufferedReader2;
                IOUtils.closeQuietly((Reader) bufferedReader);
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                IOUtils.closeQuietly((Reader) bufferedReader);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws Throwable {
        LogUtils.i("TSMDatabaseHelper onCreate");
        f(sQLiteDatabase);
        a aVar = this.f10339b;
        if (aVar != null) {
            aVar.a(sQLiteDatabase);
        }
        k(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        LogUtils.i("TSMDatabaseHelper upgrading db from " + i2 + " to " + i3);
        sQLiteDatabase.beginTransaction();
        if (i2 < 7) {
            try {
                a(sQLiteDatabase, DatabaseConstants.TABLE_CACHE);
            } catch (Throwable th) {
                LogUtils.e("error occurred to upgrade db: " + th.getMessage());
            }
        }
        f(sQLiteDatabase);
        a aVar = this.f10339b;
        if (aVar != null) {
            aVar.a(sQLiteDatabase, i2, i3);
        }
        k(sQLiteDatabase);
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
    }

    public final void a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str + ";");
    }
}
