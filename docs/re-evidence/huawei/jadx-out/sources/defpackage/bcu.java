package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes23.dex */
public class bcu extends bct {
    private static final Uri d = Uri.parse("content://com.huawei.android.sync.syncProvider/switchState");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Uri f1028c = Uri.parse("content://com.huawei.android.sync.syncProvider/isSyncRecycle");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f1026a = Uri.parse("content://com.huawei.android.sync.syncProvider/setSwitchState");
    private static final Uri e = Uri.parse("content://com.huawei.android.sync.syncProvider/reportPrepare");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f1027b = Uri.parse("content://com.huawei.android.hicloud.loginProvider/login_status");

    public static boolean a(Context context) {
        try {
            return bct.d(context) >= 1102;
        } catch (Exception e2) {
            bcw.d("QueryHuaweiCloud", "isSupportQueryRecycleByDataType: " + e2.toString());
            return false;
        }
    }

    public static boolean b(Context context) {
        try {
            return bct.d(context) >= 1105;
        } catch (Exception e2) {
            bcw.d("QueryHuaweiCloud", "isSupportSyncRefundWithLost: " + e2.toString());
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    public static boolean c(String str, Context context) throws Throwable {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        bcw.c("QueryHuaweiCloud", "Query switch status, syncType = " + str);
        if (!bda.a(context)) {
            bcw.d("QueryHuaweiCloud", "Query switch status error: checkHiCloudValidate is false");
            return false;
        }
        Cursor cursor = null;
        try {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (contentResolver == null) {
                    bcw.d("QueryHuaweiCloud", "Query switch status error: contentResolver is null");
                    return false;
                }
                Uri uri = d;
                contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        bcw.d("QueryHuaweiCloud", "Query switch status error: cpClient is null");
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                        }
                        return false;
                    }
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, "switchState = ?", new String[]{str}, null);
                    while (cursorQuery != null && cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("switchState"));
                        if (!TextUtils.isEmpty(string) && string.contains("true")) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                                return true;
                            }
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            return true;
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    }
                    return false;
                } catch (Exception e2) {
                    e = e2;
                    bcw.d("QueryHuaweiCloud", "Query switch status error: " + e.getClass().getName());
                    if (0 != 0) {
                        cursor.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor.close();
                }
                if (context != 0) {
                    context.release();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            contentProviderClientAcquireUnstableContentProviderClient = null;
        } catch (Throwable th2) {
            th = th2;
            context = 0;
            if (0 != 0) {
                cursor.close();
            }
            if (context != 0) {
                context.release();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(String str, String str2, Context context) throws Throwable {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Cursor cursorQuery;
        bcw.c("QueryHuaweiCloud", "Query support recycle status, syncType = " + str);
        if (context == null) {
            bcw.d("QueryHuaweiCloud", "Query support recycle status error: context is null");
            return false;
        }
        Cursor cursor = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (contentResolver == null) {
                    bcw.d("QueryHuaweiCloud", "Query switch status error: contentResolver is null");
                    return false;
                }
                Uri uri = f1028c;
                contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        bcw.d("QueryHuaweiCloud", "Query support recycle status error: cpClient is null");
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                        }
                        return false;
                    }
                    if (a(context)) {
                        cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str, str2}, null);
                    } else {
                        cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                    }
                    Cursor cursor2 = cursorQuery;
                    while (cursor2 != null && cursor2.moveToNext()) {
                        if (cursor2.getString(cursor2.getColumnIndex("isSyncRecycle")).contains("true")) {
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                                return true;
                            }
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            return true;
                        }
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    }
                    return false;
                } catch (Exception e2) {
                    e = e2;
                    bcw.d("QueryHuaweiCloud", "Query support recycle status error: " + e.getClass().getName());
                    if (0 != 0) {
                        (objArr2 == true ? 1 : 0).close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor.close();
                }
                if (0 != 0) {
                    (objArr == true ? 1 : 0).release();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            contentProviderClientAcquireUnstableContentProviderClient = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                cursor.close();
            }
            if (0 != 0) {
                (objArr == true ? 1 : 0).release();
            }
            throw th;
        }
    }
}
