package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ivc {
    public static int d(Context context) {
        int i = 0;
        if (context == null) {
            LogUtil.e("MmOpenApiCaller", "getMmApiLevel failed. context is null.");
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.tencent.mm", 128);
            if (applicationInfo.metaData == null || (i = applicationInfo.metaData.getInt("wechat_ext_api_level", 0)) > 0 || !TextUtils.isEmpty(applicationInfo.metaData.getString("wechat_fun_support"))) {
                return i;
            }
            return 1;
        } catch (PackageManager.NameNotFoundException unused) {
            ReleaseLogUtil.d("R_MmOpenApiCaller", "getMmApiLevel failed. can't find weChart package.");
            return i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.database.Cursor] */
    public static int c(Context context, String str, long j, long j2) throws Throwable {
        if (context == null || str == null || str.isEmpty()) {
            return 20;
        }
        ContentProviderClient contentProviderClient = null;
        try {
            try {
                Uri uri = Uri.parse(String.format("content://com.tencent.mm.sdk.comm.provider/setWechatSportStep?appid=%s", str));
                LogUtil.b("MmOpenApiCaller", "uri:", uri.toString(), " time:", Long.valueOf(j), " step:", Long.valueOf(j2));
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        ReleaseLogUtil.b("R_MmOpenApiCaller", "setSportStep providerClient == null");
                        e(contentProviderClientAcquireUnstableContentProviderClient, (Cursor) null);
                        return 20;
                    }
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{Long.toString(j2), Long.toString(j), Integer.toString(1)}, null);
                    int iE = e(cursorQuery);
                    e(contentProviderClientAcquireUnstableContentProviderClient, cursorQuery);
                    return iE;
                } catch (RemoteException e2) {
                    e = e2;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    ReleaseLogUtil.b("R_MmOpenApiCaller", "setSportStep failed with remoteException: ", LogAnonymous.b(e));
                    e(contentProviderClient, (Cursor) contentProviderClient);
                    return 19;
                } catch (Exception e3) {
                    e = e3;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    ReleaseLogUtil.b("R_MmOpenApiCaller", "setSportStep failed with exception: ", LogAnonymous.b(e));
                    e(contentProviderClient, (Cursor) contentProviderClient);
                    return 19;
                } catch (Throwable th) {
                    th = th;
                    contentProviderClient = 0;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    e(contentProviderClient, (Cursor) contentProviderClient);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (RemoteException e4) {
            e = e4;
        } catch (Exception e5) {
            e = e5;
        } catch (Throwable th3) {
            th = th3;
            contentProviderClient = 0;
        }
    }

    private static int e(Cursor cursor) {
        if (cursor == null) {
            return 16;
        }
        if (!cursor.moveToFirst()) {
            return 18;
        }
        if (cursor.getColumnCount() == 0) {
            return 17;
        }
        return cursor.getInt(cursor.getColumnIndex("retCode"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.database.Cursor] */
    public static d e(Context context, String str) throws Throwable {
        d dVar = new d();
        if (context != null && str != null && !str.isEmpty()) {
            ContentProviderClient contentProviderClient = null;
            try {
                try {
                    Uri uri = Uri.parse(String.format("content://com.tencent.mm.sdk.comm.provider/getWechatSportConfig?appid=%s", str));
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            ReleaseLogUtil.b("R_MmOpenApiCaller", "setSportStep providerClient == null");
                            dVar.f38071b = 20;
                            e(contentProviderClientAcquireUnstableContentProviderClient, (Cursor) null);
                            return dVar;
                        }
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, null, null);
                        b(cursorQuery, dVar);
                        e(contentProviderClientAcquireUnstableContentProviderClient, cursorQuery);
                        return dVar;
                    } catch (RemoteException e2) {
                        e = e2;
                        contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                        dVar.f38071b = 19;
                        ReleaseLogUtil.b("R_MmOpenApiCaller", "setSportStep failed with remoteException: ", LogAnonymous.b(e));
                        e(contentProviderClient, (Cursor) contentProviderClient);
                        return dVar;
                    } catch (Exception e3) {
                        e = e3;
                        contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                        dVar.f38071b = 19;
                        ReleaseLogUtil.b("R_MmOpenApiCaller", "setSportStep failed with exception: ", LogAnonymous.b(e));
                        e(contentProviderClient, (Cursor) contentProviderClient);
                        return dVar;
                    } catch (Throwable th) {
                        th = th;
                        contentProviderClient = 0;
                        contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                        e(contentProviderClient, (Cursor) contentProviderClient);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (RemoteException e4) {
                e = e4;
            } catch (Exception e5) {
                e = e5;
            } catch (Throwable th3) {
                th = th3;
                contentProviderClient = 0;
            }
        } else {
            dVar.f38071b = 20;
            return dVar;
        }
    }

    private static void e(ContentProviderClient contentProviderClient, Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception e2) {
                ReleaseLogUtil.b("R_MmOpenApiCaller", "release cursor failed with exception: ", LogAnonymous.b(e2));
            }
        }
        if (contentProviderClient != null) {
            try {
                contentProviderClient.close();
            } catch (Exception e3) {
                ReleaseLogUtil.b("R_MmOpenApiCaller", "release providerClient failed with exception: ", LogAnonymous.b(e3));
            }
        }
    }

    private static void b(Cursor cursor, d dVar) throws JSONException {
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                d(dVar, cursor);
                return;
            } else {
                dVar.f38071b = 18;
                return;
            }
        }
        dVar.f38071b = 16;
    }

    private static void d(d dVar, Cursor cursor) throws JSONException {
        int columnIndex;
        int columnIndex2 = cursor.getColumnIndex("retCode");
        if (columnIndex2 != -1) {
            dVar.f38071b = cursor.getInt(columnIndex2);
        } else {
            dVar.f38071b = 17;
        }
        if (dVar.f38071b == 1 && (columnIndex = cursor.getColumnIndex("sportConfig")) != -1) {
            String string = cursor.getString(columnIndex);
            e eVar = new e();
            JSONObject jSONObject = new JSONObject(string);
            eVar.f38072a = jSONObject.getLong("version");
            eVar.f38073b = jSONObject.getLong("interval");
            dVar.f38070a = eVar;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f38070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f38071b;

        public int b() {
            return this.f38071b;
        }

        public Object e() {
            return this.f38070a;
        }

        public String toString() {
            return "MmResult{retCode=" + this.f38071b + ", data=" + this.f38070a + '}';
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f38072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f38073b;

        public long b() {
            return this.f38073b;
        }
    }
}
