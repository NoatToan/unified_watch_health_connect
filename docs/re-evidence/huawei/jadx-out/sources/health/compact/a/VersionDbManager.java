package health.compact.a;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import defpackage.ltw;

/* JADX INFO: loaded from: classes2.dex */
public class VersionDbManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f36674a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile VersionDbManager f36675c;
    private static final String[] e = {MedalConstants.EVENT_KEY, "value"};
    private Uri d;

    private VersionDbManager(Context context) {
        com.huawei.hwlogsmodel.LogUtil.a("VersionDbManager", "Enter KeyValDbManager");
        f36674a = context.getApplicationContext();
        this.d = ltw.c("module_200007_keyvaldb");
    }

    public static VersionDbManager b(Context context) {
        if (f36675c == null) {
            synchronized (VersionDbManager.class) {
                if (f36675c == null) {
                    if (context == null) {
                        f36675c = new VersionDbManager(BaseApplication.getContext());
                    } else {
                        f36675c = new VersionDbManager(context.getApplicationContext());
                    }
                }
            }
        }
        return f36675c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(StorageDataCallback storageDataCallback, StorageResult storageResult) {
        if (storageDataCallback != null) {
            storageDataCallback.onProcessed(storageResult);
        }
    }

    public String d(String str) {
        Cursor cursorQuery = null;
        if (str == null) {
            com.huawei.hwlogsmodel.LogUtil.j("VersionDbManager", "getValue, key is null");
            return null;
        }
        String strB = SharedPreferenceManager.b("preference_save_module", str, "");
        if (!TextUtils.isEmpty(strB)) {
            com.huawei.hwlogsmodel.LogUtil.d("VersionDbManager", "get value from mmkv");
            return strB;
        }
        try {
            try {
                try {
                    cursorQuery = f36674a.getContentResolver().query(this.d, e, "key = ?", new String[]{str}, null);
                    if (cursorQuery != null && cursorQuery.moveToFirst()) {
                        strB = cursorQuery.getString(1);
                    }
                    SharedPreferenceManager.c("preference_save_module", str, strB);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return strB;
                } catch (Exception unused) {
                    com.huawei.hwlogsmodel.LogUtil.e("VersionDbManager", "getValue, queryStorage Exception");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return strB;
                }
            } catch (SQLException unused2) {
                com.huawei.hwlogsmodel.LogUtil.e("VersionDbManager", "getValue, queryStorage SQLException");
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return strB;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public void d(final String str, final String str2, final StorageDataCallback storageDataCallback) {
        com.huawei.hwlogsmodel.LogUtil.d("VersionDbManager", "setValue, key=", str, ", value=", str2);
        ThreadPoolManager.c().execute(new Runnable() { // from class: health.compact.a.VersionDbManager.2
            @Override // java.lang.Runnable
            public void run() {
                String str3;
                StorageResult storageResult = new StorageResult();
                String str4 = str;
                if (str4 == null || (str3 = str2) == null) {
                    com.huawei.hwlogsmodel.LogUtil.j("VersionDbManager", "setValue, key or value is null");
                    storageResult.e(AwarenessConstants.ERROR_UNKNOWN_CODE);
                } else {
                    SharedPreferenceManager.c("preference_save_module", str4, str3);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(MedalConstants.EVENT_KEY, str);
                    contentValues.put("value", str2);
                    try {
                        Uri uriInsert = VersionDbManager.f36674a.getContentResolver().insert(VersionDbManager.this.d, contentValues);
                        if (uriInsert == null) {
                            com.huawei.hwlogsmodel.LogUtil.j("VersionDbManager", "setValue failed with null.");
                            storageResult.e(201000);
                        } else if (ContentUris.parseId(uriInsert) != -1) {
                            com.huawei.hwlogsmodel.LogUtil.a("VersionDbManager", "setValue success");
                            storageResult.e(0);
                        } else {
                            com.huawei.hwlogsmodel.LogUtil.j("VersionDbManager", "setValue failed");
                            storageResult.e(201000);
                        }
                    } catch (Exception unused) {
                        com.huawei.hwlogsmodel.LogUtil.e("VersionDbManager", "setValue failed with Exception");
                        storageResult.e(201000);
                        VersionDbManager.c(storageDataCallback, storageResult);
                    }
                }
                VersionDbManager.c(storageDataCallback, storageResult);
            }
        });
    }
}
