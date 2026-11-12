package com.xiaomi.hm.health.external;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.account.HMLoginManager;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDatabaseHelper;
import com.xiaomi.hm.health.databases.model.DaoMaster;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.ui.smartplay.MiuiAPI;
import org.greenrobot.greendao.Property;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ExtContentProvider extends ContentProvider {
    private static final String a = "ExtContentProvider";

    private boolean a(Uri uri) {
        HMLog.d(a, "scheme:" + uri.getScheme() + ",authority:" + uri.getAuthority() + ",path:" + uri.getPath() + ",from date:" + uri.getQueryParameter("from_date"), new Object[0]);
        return a.e.equals(uri.getAuthority()) && a.g.equals(uri.getPath());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private Cursor b(SQLiteDatabase database, String fromDate) throws Throwable {
        Cursor cursorQuery;
        ?? r2 = 0;
        try {
            try {
                Property property = DateDataDao.Properties.Date;
                cursorQuery = database.query("DATE_DATA", new String[]{property.columnName, DateDataDao.Properties.Summary.columnName}, property.columnName + ">=?", new String[]{fromDate}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() != 0) {
                            MatrixCursor matrixCursor = new MatrixCursor(a.d);
                            cursorQuery.moveToFirst();
                            int i = 0;
                            int i2 = 0;
                            do {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex(DateDataDao.Properties.Date.columnName));
                                String string2 = cursorQuery.getString(cursorQuery.getColumnIndex(DateDataDao.Properties.Summary.columnName));
                                HMLog.d(a, "date:" + string + ",summary:" + string2, new Object[0]);
                                JSONObject jSONObject = new JSONObject(string2).getJSONObject(StepsInfo.KEY_STEP_INFO);
                                i += jSONObject.getInt("ttl");
                                i2 += jSONObject.getInt("cal");
                            } while (cursorQuery.moveToNext());
                            matrixCursor.addRow(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                            cursorQuery.close();
                            return matrixCursor;
                        }
                    } catch (Exception e) {
                        e = e;
                        HMLog.d(a, "Exception:" + e.getMessage(), new Object[0]);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                r2 = database;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, ContentValues values) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(@NonNull Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        String huamiId;
        HMLog.d(a, "android system release:" + Build.VERSION.RELEASE, new Object[0]);
        String callingPackage = getCallingPackage();
        HMLog.d(a, "package:" + callingPackage, new Object[0]);
        if (!MiuiAPI.isMiui(getContext())) {
            HMLog.d(a, "return as just support MIUI system!!!", new Object[0]);
            return null;
        }
        if (!"com.android.keyguard".equalsIgnoreCase(callingPackage)) {
            HMLog.d(a, "return as not auth App!!!", new Object[0]);
            return null;
        }
        if (!a(uri)) {
            HMLog.d(a, "Uri is invalid", new Object[0]);
            return null;
        }
        if (getContext() == null) {
            return null;
        }
        try {
            huamiId = HMLoginManager.getThirdId();
        } catch (Exception unused) {
            huamiId = null;
        }
        if (TextUtils.isEmpty(huamiId)) {
            HMLog.d(a, "userId is null", new Object[0]);
            return null;
        }
        String queryParameter = uri.getQueryParameter("from_date");
        if (TextUtils.isEmpty(queryParameter)) {
            HMLog.d(a, "from day is null", new Object[0]);
            return null;
        }
        Context context = getContext();
        if (!TextUtils.isEmpty(HMLoginManager.getHuamiId())) {
            huamiId = HMLoginManager.getHuamiId();
        }
        SQLiteDatabase readableDatabase = new DaoMaster.DevOpenHelper(context, HMDatabaseHelper.parseNewMD5DbName(huamiId), null).getReadableDatabase();
        if (readableDatabase != null) {
            return b(readableDatabase, queryParameter);
        }
        HMLog.d(a, "database is null", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
