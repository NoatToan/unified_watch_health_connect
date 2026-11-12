package defpackage;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class dnd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f32046a = new byte[1];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f32047b = "AssetsDatabaseManager";
    private static dnd e;
    private Map<String, SQLiteDatabase> d = new HashMap(16);

    private dnd() {
    }

    public SQLiteDatabase b(String str) {
        Map<String, SQLiteDatabase> map = this.d;
        if (map == null) {
            return null;
        }
        if (map.get(str) != null) {
            return this.d.get(str);
        }
        LogUtil.a(f32047b, " open33 = dbfile");
        return d(str);
    }

    public boolean c(String str) {
        String str2 = f32047b;
        LogUtil.a(str2, " start closeDatabase ");
        if (this.d.get(str) != null) {
            SQLiteDatabase sQLiteDatabase = this.d.get(str);
            LogUtil.a(str2, " open33 = " + sQLiteDatabase.isOpen());
            sQLiteDatabase.close();
            LogUtil.a(str2, " close12 = " + sQLiteDatabase.isOpen());
            this.d.remove(str);
            return true;
        }
        LogUtil.a("database", " end closeDatabase ");
        return false;
    }

    public static dnd b() {
        dnd dndVar;
        LogUtil.a("database", " start getManager ");
        synchronized (f32046a) {
            dndVar = e;
        }
        return dndVar;
    }

    public SQLiteDatabase d(String str) {
        LogUtil.a("database", " start getSQLiteDatabase ");
        Map<String, SQLiteDatabase> map = this.d;
        if (map == null) {
            LogUtil.j(f32047b, "databaseMap is null");
            return null;
        }
        map.clear();
        String strE = e();
        String strA = a(str);
        File file = new File(strA);
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences(dnd.class.toString(), 0);
        LogUtil.a("database", " ing getSQLiteDatabase ");
        if (!sharedPreferences.getBoolean(str, false) || !file.exists()) {
            File file2 = new File(strE);
            if ((!file2.exists() && !file2.mkdirs()) || !d(str, strA)) {
                return null;
            }
            LogUtil.a("database", " ing2 getSQLiteDatabase ");
            sharedPreferences.edit().putBoolean(str, true).commit();
        }
        LogUtil.a("database", " ing end getSQLiteDatabase ");
        SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(strA, null, 16);
        LogUtil.a("database", " open32 = " + sQLiteDatabaseOpenDatabase.isOpen());
        this.d.put(str, sQLiteDatabaseOpenDatabase);
        return sQLiteDatabaseOpenDatabase;
    }

    public static void c() {
        LogUtil.a("database", " start initManager ");
        synchronized (f32046a) {
            if (e == null) {
                e = new dnd();
            }
        }
    }

    private String e() {
        return String.format(Locale.ENGLISH, "/data/data/%s/database", BaseApplication.getContext().getApplicationInfo().packageName);
    }

    private String a(String str) {
        return e() + "/" + str;
    }

    private boolean d(String str, String str2) {
        int i;
        LogUtil.a("database", " start copyAssetsToFilesystem ");
        try {
            InputStream inputStreamOpen = BaseApplication.getContext().getAssets().open(str);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                try {
                    LogUtil.a("database", " ing copyAssetsToFilesystem ");
                    byte[] bArr = new byte[1024];
                    int i2 = 0;
                    while (true) {
                        i = i2 + 1024;
                        if (i > 52428800 || inputStreamOpen.read(bArr) <= 0) {
                            break;
                        }
                        int i3 = inputStreamOpen.read(bArr);
                        fileOutputStream.write(bArr, 0, i3);
                        i2 += i3;
                    }
                    if (i > 52428800) {
                        LogUtil.j(f32047b, "assetsSrc is too big");
                    }
                    inputStreamOpen.close();
                    fileOutputStream.close();
                    LogUtil.a("database", " ing2 copyAssetsToFilesystem ");
                    fileOutputStream.close();
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    LogUtil.a("database", " close copyAssetsToFilesystem ");
                    return true;
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (IOException e2) {
            LogUtil.e(f32047b, e2.getMessage());
            return false;
        }
    }
}
