package com.huawei.health;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.huawei.common.util.VersionIsCloud;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import health.compact.a.ApplicationLazyLoad;
import health.compact.a.CloudImpl;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.VersionSQLiteOpenHelper;

/* JADX INFO: loaded from: classes2.dex */
public class VersionContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final UriMatcher f6173c = new UriMatcher(-1);
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile VersionSQLiteOpenHelper f6174b;

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    private void c() {
        f6173c.addURI(CommonUtils.h(".version.provider"), "module_200007_keyvaldb", 1);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        LogUtil.b("VersionContentProvider", "onCreate", getContext());
        c();
        return true;
    }

    private VersionSQLiteOpenHelper e() {
        if (this.f6174b == null) {
            synchronized (d) {
                if (this.f6174b == null) {
                    this.f6174b = new VersionSQLiteOpenHelper(getContext(), "HwVersion.db");
                }
            }
        }
        return this.f6174b;
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        String strCheckCloudState = VersionIsCloud.checkCloudState(getContext());
        SharedPreferenceManager.c("preference_save_module", "have_cloud_or_not", strCheckCloudState);
        String country = getContext().getResources().getConfiguration().locale.getCountry();
        SharedPreferenceManager.c("preference_save_module", "local_country_code", country);
        String language = getContext().getResources().getConfiguration().locale.getLanguage();
        SharedPreferenceManager.c("preference_save_module", "local_language_code", language);
        ContentValues contentValues = new ContentValues();
        contentValues.put(MedalConstants.EVENT_KEY, "have_cloud_or_not");
        contentValues.put("value", strCheckCloudState);
        sQLiteDatabase.insertOrThrow("module_200007_keyvaldb", null, contentValues);
        contentValues.put(MedalConstants.EVENT_KEY, "local_country_code");
        contentValues.put("value", country);
        sQLiteDatabase.insertOrThrow("module_200007_keyvaldb", null, contentValues);
        contentValues.put(MedalConstants.EVENT_KEY, "local_language_code");
        contentValues.put("value", language);
        sQLiteDatabase.insertOrThrow("module_200007_keyvaldb", null, contentValues);
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        String strCheckLoginState = VersionIsCloud.checkLoginState(getContext());
        SharedPreferenceManager.c("preference_save_module", "allow_login_or_not", strCheckLoginState);
        ContentValues contentValues = new ContentValues();
        contentValues.put(MedalConstants.EVENT_KEY, "allow_login_or_not");
        contentValues.put("value", strCheckLoginState);
        sQLiteDatabase.insertOrThrow("module_200007_keyvaldb", null, contentValues);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a();
        if (str == null) {
            LogUtil.e("VersionContentProvider", "query selection == null");
            return null;
        }
        SQLiteDatabase writableDatabase = e().getWritableDatabase();
        if (f6173c.match(uri) != 1) {
            return null;
        }
        Cursor cursorQuery = writableDatabase.query("module_200007_keyvaldb", strArr, str, strArr2, str2, null, null);
        if (cursorQuery != null && cursorQuery.moveToNext()) {
            return cursorQuery;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        if (LoginInit.getCloudapi() == null) {
            CloudImpl.e((Context) null);
        }
        d(writableDatabase);
        c(writableDatabase);
        return writableDatabase.query("module_200007_keyvaldb", strArr, str, strArr2, str2, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:17:0x0053, B:34:0x007f, B:35:0x0082, B:29:0x0077), top: B:40:0x0001 }] */
    private void c(ContentValues contentValues) {
        Cursor cursorQuery;
        synchronized (this) {
            SQLiteDatabase writableDatabase = e().getWritableDatabase();
            Cursor cursor = null;
            try {
                try {
                    String asString = contentValues.getAsString(MedalConstants.EVENT_KEY);
                    String asString2 = contentValues.getAsString("value");
                    if (asString != null && asString2 != null) {
                        String[] strArr = {asString};
                        cursorQuery = writableDatabase.query("module_200007_keyvaldb", new String[]{MedalConstants.EVENT_KEY, "value"}, "key = ?", strArr, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (!cursorQuery.moveToNext()) {
                                    writableDatabase.insertOrThrow("module_200007_keyvaldb", null, contentValues);
                                } else {
                                    writableDatabase.update("module_200007_keyvaldb", contentValues, "key = ?", strArr);
                                }
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            } catch (SQLException unused) {
                                cursor = cursorQuery;
                                LogUtil.d("VersionContentProvider", "insertOrUpDate SQLException");
                                if (cursor != null) {
                                    cursor.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                throw th;
                            }
                        } else {
                            writableDatabase.insertOrThrow("module_200007_keyvaldb", null, contentValues);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                        return;
                    }
                    LogUtil.e("VersionContentProvider", "insertOrUpDate key or value is null");
                } catch (SQLException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                cursorQuery = null;
            }
        }
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        a();
        if (uri == null) {
            LogUtil.e("VersionContentProvider", "insert() uri = null");
            return null;
        }
        if (f6173c.match(uri) == 1) {
            c(contentValues);
        }
        return ContentUris.withAppendedId(uri, 0L);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        a();
        if (uri == null) {
            LogUtil.e("VersionContentProvider", "delete() uri = null");
            return 0;
        }
        SQLiteDatabase writableDatabase = e().getWritableDatabase();
        if (f6173c.match(uri) != 1) {
            return 0;
        }
        return writableDatabase.delete("module_200007_keyvaldb", str, strArr);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        a();
        SQLiteDatabase writableDatabase = e().getWritableDatabase();
        if (uri == null) {
            LogUtil.e("VersionContentProvider", "update() uri = null");
            return 0;
        }
        if (f6173c.match(uri) != 1) {
            return 0;
        }
        return writableDatabase.update("module_200007_keyvaldb", contentValues, str, strArr);
    }

    private void a() {
        ApplicationLazyLoad.a();
    }
}
