package com.xiaomi.market.sdk;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes22.dex */
public class DownloadInstallManager {
    private static final String COLUMN_FILE_PATH = "file_path";
    private static final String TAG = "MarketUpdateDownload";
    private static DownloadManager mDownloadManager;
    public static DownloadInstallManager sDownloadInstallManager;
    private LocalAppInfo mAppInfo;
    private Context mContext;
    private long mDownloadId = -1;
    private XiaomiUpdateAgent.UpdateInfo mUpdateInfo;
    private WorkerHandler mWorkerHandler;
    private HandlerThread mWorkerThread;

    public static class DownloadManagerInfo {
        public int currBytes;
        public String downloadFilePath;
        public long id;
        public int reason;
        public int status;
        public int totalBytes;

        private DownloadManagerInfo() {
        }

        public static DownloadManagerInfo find(long j) {
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(j);
            try {
                Cursor cursorQuery = DownloadInstallManager.mDownloadManager.query(query);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            DownloadManagerInfo downloadManagerInfoQuery = query(cursorQuery);
                            cursorQuery.close();
                            return downloadManagerInfoQuery;
                        }
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Exception e) {
                Log.e(DownloadInstallManager.TAG, "Query download from DownloadManager failed - " + e.toString());
                return null;
            }
        }

        @SuppressLint({"InlinedApi"})
        private static DownloadManagerInfo query(Cursor cursor) {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("status");
            int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("reason");
            int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("bytes_so_far");
            int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("total_size");
            int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow(Client.isLaterThanHoneycomb() ? "local_filename" : "file_path");
            DownloadManagerInfo downloadManagerInfo = new DownloadManagerInfo();
            downloadManagerInfo.id = cursor.getLong(columnIndexOrThrow);
            downloadManagerInfo.status = cursor.getInt(columnIndexOrThrow2);
            downloadManagerInfo.reason = cursor.getInt(columnIndexOrThrow3);
            downloadManagerInfo.currBytes = cursor.getInt(columnIndexOrThrow4);
            downloadManagerInfo.totalBytes = cursor.getInt(columnIndexOrThrow5);
            downloadManagerInfo.downloadFilePath = cursor.getString(columnIndexOrThrow6);
            return downloadManagerInfo;
        }
    }

    public class WorkerHandler extends Handler {
        public WorkerHandler(Looper looper) {
            super(looper);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void downloadApk(Uri uri, String str) {
            Uri uri2 = Uri.parse("file://" + str);
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setMimeType("application/apk-ota");
            request.setTitle(DownloadInstallManager.this.mAppInfo.displayName);
            if (uri2 != null) {
                request.setDestinationUri(uri2);
            }
            try {
                DownloadInstallManager.this.mDownloadId = DownloadInstallManager.mDownloadManager.enqueue(request);
                ContentValues contentValues = new ContentValues();
                contentValues.put("package_name", DownloadInstallManager.this.mAppInfo.packageName);
                contentValues.put("download_id", Long.valueOf(DownloadInstallManager.this.mDownloadId));
                contentValues.put(Constants.Update.VERSION_CODE, Integer.valueOf(DownloadInstallManager.this.mUpdateInfo.versionCode));
                contentValues.put(Constants.Update.APK_URL, DownloadInstallManager.this.mUpdateInfo.apkUrl);
                contentValues.put(Constants.Update.APK_HASH, DownloadInstallManager.this.mUpdateInfo.apkHash);
                contentValues.put(Constants.Update.DIFF_URL, DownloadInstallManager.this.mUpdateInfo.diffUrl);
                contentValues.put(Constants.Update.DIFF_HASH, DownloadInstallManager.this.mUpdateInfo.diffHash);
                contentValues.put(Constants.Update.APK_PATH, str);
                SDKDatabaseHelper.getHelper(AppGlobal.getContext()).insertOrUpdateUpdate(contentValues);
            } catch (Throwable th) {
                Log.e(DownloadInstallManager.TAG, th.toString());
                DownloadInstallResultNotifier.notifyResult(-2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File generateApkSaveFile() {
            File externalFilesDir = DownloadInstallManager.this.mContext.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDir == null) {
                return null;
            }
            File file = new File(externalFilesDir.getAbsolutePath() + "/xiaomi_update_sdk");
            if (!file.exists()) {
                file.mkdirs();
            }
            return new File(file.getAbsolutePath() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + DownloadInstallManager.this.mAppInfo.packageName + "_" + DownloadInstallManager.this.mUpdateInfo.versionCode + ".apk");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Uri getDownloadUri() {
            return Uri.parse(TextUtils.isEmpty(DownloadInstallManager.this.mUpdateInfo.diffUrl) ? Connection.connect(DownloadInstallManager.this.mUpdateInfo.host, DownloadInstallManager.this.mUpdateInfo.apkUrl) : Connection.connect(DownloadInstallManager.this.mUpdateInfo.host, DownloadInstallManager.this.mUpdateInfo.diffUrl));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getPatchedApk(String str, String str2) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.equals(Coder.encodeMD5(new File(str)), str2)) {
                return null;
            }
            String str3 = str + ".apk";
            if (DownloadInstallManager.this.mAppInfo == null || TextUtils.isEmpty(DownloadInstallManager.this.mAppInfo.sourceDir)) {
                return null;
            }
            Patcher.patch(DownloadInstallManager.this.mAppInfo.sourceDir, str3, str);
            try {
                new File(str).delete();
            } catch (Exception unused) {
            }
            return str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void launchPackageInstaller(String str) {
            Uri uriGenerateInstallUri = DownloadInstallManager.this.generateInstallUri(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriGenerateInstallUri, "application/vnd.android.package-archive");
            String strQueryDefaultPackageForIntent = PkgUtils.queryDefaultPackageForIntent(intent);
            if (TextUtils.isEmpty(strQueryDefaultPackageForIntent)) {
                Log.e(DownloadInstallManager.TAG, "no activity found to install apk");
                return;
            }
            if (TextUtils.equals(uriGenerateInstallUri.getScheme(), "content")) {
                DownloadInstallManager.this.mContext.grantUriPermission(strQueryDefaultPackageForIntent, uriGenerateInstallUri, 1);
            }
            intent.setPackage(strQueryDefaultPackageForIntent);
            intent.setFlags(268435456);
            DownloadInstallManager.this.mContext.startActivity(intent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean verify(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return TextUtils.equals(Coder.encodeMD5(new File(str)), DownloadInstallManager.this.mUpdateInfo.apkHash);
        }

        public void arrange() {
            post(new Runnable() { // from class: com.xiaomi.market.sdk.DownloadInstallManager.WorkerHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    File fileGenerateApkSaveFile;
                    if (!Utils.hasExternalStorage(true)) {
                        DownloadInstallResultNotifier.notifyResult(-1);
                        return;
                    }
                    if (DownloadInstallManager.mDownloadManager == null || (fileGenerateApkSaveFile = WorkerHandler.this.generateApkSaveFile()) == null) {
                        return;
                    }
                    if (fileGenerateApkSaveFile.exists()) {
                        if (TextUtils.equals(Coder.encodeMD5(fileGenerateApkSaveFile), DownloadInstallManager.this.mUpdateInfo.apkHash)) {
                            WorkerHandler.this.install(fileGenerateApkSaveFile.getAbsolutePath(), false);
                            return;
                        }
                        fileGenerateApkSaveFile.delete();
                    }
                    WorkerHandler workerHandler = WorkerHandler.this;
                    workerHandler.downloadApk(workerHandler.getDownloadUri(), fileGenerateApkSaveFile.getAbsolutePath());
                }
            });
        }

        public void install(final String str, final boolean z) {
            post(new Runnable() { // from class: com.xiaomi.market.sdk.DownloadInstallManager.WorkerHandler.2
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    WorkerHandler.this.reloadDownloadTasks();
                    String patchedApk = str;
                    if (z) {
                        WorkerHandler workerHandler = WorkerHandler.this;
                        patchedApk = workerHandler.getPatchedApk(patchedApk, DownloadInstallManager.this.mUpdateInfo.diffHash);
                    }
                    if (WorkerHandler.this.verify(patchedApk)) {
                        WorkerHandler.this.launchPackageInstaller(patchedApk);
                    } else {
                        Log.e(DownloadInstallManager.TAG, "verify downloaded apk failed");
                    }
                }
            });
        }

        public void reloadDownloadTasks() {
            if (DownloadInstallManager.this.mAppInfo == null || DownloadInstallManager.this.mUpdateInfo == null) {
                DownloadInstallManager downloadInstallManager = DownloadInstallManager.this;
                downloadInstallManager.mAppInfo = XiaomiUpdateAgent.getAppInfo(downloadInstallManager.mContext);
                if (DownloadInstallManager.this.mAppInfo == null) {
                    return;
                }
                DownloadInstallManager.this.reloadUpdateInfoFromDB();
            }
        }
    }

    private DownloadInstallManager(Context context) {
        Client.init(context);
        this.mContext = context.getApplicationContext();
        initDownloadManager();
        HandlerThread handlerThread = new HandlerThread("Worker Thread");
        this.mWorkerThread = handlerThread;
        handlerThread.start();
        this.mWorkerHandler = new WorkerHandler(this.mWorkerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Uri generateInstallUri(String str) {
        if (!Client.isLaterThanN()) {
            return Uri.parse("file://" + str);
        }
        return FileProvider.getUriForFile(this.mContext, this.mContext.getPackageName() + ".selfupdate.fileprovider", new File(str));
    }

    public static synchronized DownloadInstallManager getManager(Context context) {
        if (sDownloadInstallManager == null) {
            sDownloadInstallManager = new DownloadInstallManager(context);
        }
        return sDownloadInstallManager;
    }

    private void initDownloadManager() {
        mDownloadManager = (DownloadManager) this.mContext.getSystemService(WatchFaceApi.SORT_DOWNLOAD);
        if (Client.isLaterThanN()) {
            try {
                Method declaredMethod = mDownloadManager.getClass().getDeclaredMethod("setAccessFilename", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(mDownloadManager, Boolean.TRUE);
            } catch (Exception e) {
                Log.e(TAG, e.getMessage(), e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void reloadUpdateInfoFromDB() {
        if (this.mUpdateInfo != null) {
            return;
        }
        if (this.mAppInfo == null) {
            LocalAppInfo appInfo = XiaomiUpdateAgent.getAppInfo(this.mContext);
            this.mAppInfo = appInfo;
            if (appInfo == null) {
                return;
            }
        }
        Cursor cursorQuery = null;
        try {
            cursorQuery = SDKDatabaseHelper.getHelper(this.mContext).query(Constants.Update.TABLE, Constants.Update.UPDATE_PROJECTION, "package_name=?", new String[]{this.mAppInfo.packageName}, null, null, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return;
            }
            this.mDownloadId = cursorQuery.getLong(cursorQuery.getColumnIndex("download_id"));
            XiaomiUpdateAgent.UpdateInfo updateInfo = new XiaomiUpdateAgent.UpdateInfo();
            updateInfo.versionCode = cursorQuery.getInt(cursorQuery.getColumnIndex(Constants.Update.VERSION_CODE));
            updateInfo.apkUrl = cursorQuery.getString(cursorQuery.getColumnIndex(Constants.Update.APK_URL));
            updateInfo.apkHash = cursorQuery.getString(cursorQuery.getColumnIndex(Constants.Update.APK_HASH));
            updateInfo.diffUrl = cursorQuery.getString(cursorQuery.getColumnIndex(Constants.Update.DIFF_URL));
            updateInfo.diffHash = cursorQuery.getString(cursorQuery.getColumnIndex(Constants.Update.DIFF_HASH));
            this.mUpdateInfo = updateInfo;
            cursorQuery.close();
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public synchronized void arrange(LocalAppInfo localAppInfo, XiaomiUpdateAgent.UpdateInfo updateInfo) {
        if (updateInfo == null || localAppInfo == null) {
            return;
        }
        this.mUpdateInfo = updateInfo;
        this.mAppInfo = localAppInfo;
        this.mWorkerHandler.arrange();
    }

    public long getDowloadId() {
        reloadUpdateInfoFromDB();
        return this.mDownloadId;
    }

    public void handleDownloadComplete(long j) {
        DownloadManagerInfo downloadManagerInfoFind;
        if (j >= 0) {
            long j2 = this.mDownloadId;
            if (j2 != j || (downloadManagerInfoFind = DownloadManagerInfo.find(j2)) == null || downloadManagerInfoFind.status == 16 || TextUtils.isEmpty(downloadManagerInfoFind.downloadFilePath)) {
                return;
            }
            this.mWorkerHandler.install(downloadManagerInfoFind.downloadFilePath, !TextUtils.isEmpty(this.mUpdateInfo.diffUrl));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    public boolean isDownloading(LocalAppInfo localAppInfo) {
        long j;
        Cursor cursorQuery = SDKDatabaseHelper.getHelper(this.mContext).query(Constants.Update.TABLE, Constants.Update.UPDATE_PROJECTION, "package_name=?", new String[]{localAppInfo.packageName}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    j = cursorQuery.getLong(cursorQuery.getColumnIndex("download_id"));
                } else {
                    j = -1;
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        } else {
            j = -1;
        }
        if (j == -1) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return false;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(j);
        Cursor cursorQuery2 = mDownloadManager.query(query);
        int i = -1;
        if (cursorQuery2 != null) {
            try {
                if (cursorQuery2.moveToFirst()) {
                    i = cursorQuery2.getInt(cursorQuery2.getColumnIndexOrThrow("status"));
                }
            } catch (Throwable th2) {
                cursorQuery2.close();
                throw th2;
            }
        }
        if (i == 4 || i == 1 || i == 2) {
            if (cursorQuery2 != null) {
                cursorQuery2.close();
            }
            return true;
        }
        if (cursorQuery2 != null) {
            cursorQuery2.close();
        }
        return false;
    }
}
