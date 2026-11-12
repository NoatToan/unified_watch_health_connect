package com.xiaomi.hm.health.manager;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import androidx.collection.LongSparseArray;
import androidx.core.content.FileProvider;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.keeper.HMKeeper;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class HMDownloadManager {
    private static final String b = "HMDownloadManager";
    private static final String c = ".apk";
    private static final String d = "mi_file";
    private LongSparseArray<String> a;

    public static class a {
        private static final HMDownloadManager a = new HMDownloadManager();

        private a() {
        }
    }

    private HMDownloadManager() {
        this.a = new LongSparseArray<>();
    }

    private void a(Context context, long downloadId) {
        Uri uriFromFile;
        String str = this.a.get(downloadId);
        HMLog.i(b, "apkName = " + str, new Object[0]);
        if (str == null || "".equals(str) || !str.endsWith(c)) {
            return;
        }
        String str2 = b(context) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str;
        HMLog.i(b, "filePath = " + str2, new Object[0]);
        File file = new File(str2);
        if (!file.exists()) {
            HMLog.i(b, "file not exist.", new Object[0]);
            return;
        }
        c(file);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                intent.addFlags(64);
                uriFromFile = FileProvider.getUriForFile(BraceletApp.getContext(), context.getResources().getString(R.string.share_provider_file_authorities), file);
            } else {
                uriFromFile = Uri.fromFile(file);
            }
            intent.setDataAndType(uriFromFile, "application/vnd.android.package-archive");
            context.startActivity(intent);
        } catch (Exception e) {
            HMLog.i(b, "queryDownloadStatus STATUS_SUCCESSFUL, but has exception = " + e, new Object[0]);
            e.printStackTrace();
        }
        IconToast.showSuccess(context, HMKeeper.getDownloadSuccessStr());
        HMKeeper.keepDownloadApkId(-1L);
        this.a.remove(downloadId);
    }

    private String b(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            File externalFilesDir = context.getExternalFilesDir(d);
            return externalFilesDir != null ? externalFilesDir.getAbsolutePath() : "";
        }
        String str = Environment.getExternalStorageDirectory().getPath() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + d;
        File file = new File(str);
        if (file.exists()) {
            return str;
        }
        HMLog.i(b, "isMk = " + file.mkdirs(), new Object[0]);
        return str;
    }

    private static void c(File apkFile) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (Build.VERSION.SDK_INT >= 24) {
                Uri uriForFile = FileProvider.getUriForFile(BraceletApp.getContext(), BraceletApp.getContext().getResources().getString(R.string.share_provider_file_authorities), apkFile);
                intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
                Iterator<ResolveInfo> it2 = BraceletApp.getContext().getPackageManager().queryIntentActivities(intent, 65536).iterator();
                while (it2.hasNext()) {
                    BraceletApp.getContext().grantUriPermission(it2.next().activityInfo.packageName, uriForFile, 3);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static HMDownloadManager getInstance() {
        return a.a;
    }

    public void downloadAPK(Context context, String apkPath) {
        CustomToast.makeText(context, R.string.start_download, 0).show();
        if (!Environment.getExternalStorageState().equals("mounted")) {
            IconToast.showError(context, context.getString(R.string.sdcarderror));
            return;
        }
        try {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(apkPath));
            request.setAllowedNetworkTypes(3);
            request.setAllowedOverRoaming(false);
            request.setMimeType(MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(apkPath)));
            request.setNotificationVisibility(0);
            request.setVisibleInDownloadsUi(true);
            try {
                String str = context.getString(R.string.app_name) + "_" + System.currentTimeMillis() + c;
                request.setDestinationInExternalPublicDir(d, str);
                long jEnqueue = ((DownloadManager) context.getSystemService(WatchFaceApi.SORT_DOWNLOAD)).enqueue(request);
                HMKeeper.keepDownloadApkId(jEnqueue);
                HMKeeper.setDownloadSuccessStr(context.getString(R.string.apk_download_ok));
                HMLog.i(b, "id = " + jEnqueue, new Object[0]);
                this.a.put(jEnqueue, str);
            } catch (Exception e) {
                HMLog.i(b, "Exception = " + e.toString(), new Object[0]);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public LongSparseArray<String> getMap() {
        return this.a;
    }

    public void queryDownloadStatus(Context context) {
        DownloadManager downloadManager = (DownloadManager) context.getSystemService(WatchFaceApi.SORT_DOWNLOAD);
        DownloadManager.Query query = new DownloadManager.Query();
        long downloadApkId = HMKeeper.readDownloadApkId();
        query.setFilterById(downloadApkId);
        Cursor cursorQuery = downloadManager.query(query);
        try {
            if (cursorQuery.moveToFirst()) {
                int i = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                if (i == 1) {
                    HMLog.e(b, "STATUS_PENDING", new Object[0]);
                } else if (i == 2) {
                    HMLog.e(b, "STATUS_RUNNING", new Object[0]);
                } else if (i == 4) {
                    HMLog.i(b, "STATUS_PAUSED", new Object[0]);
                } else if (i == 8) {
                    HMLog.i(b, "STATUS_SUCCESSFUL downloadId=" + downloadApkId, new Object[0]);
                    a(context, downloadApkId);
                } else if (i == 16) {
                    HMLog.e(b, "STATUS_FAILED", new Object[0]);
                    HMLog.e(b, "------- reasonCode = ----------" + cursorQuery.getInt(cursorQuery.getColumnIndex("reason")), new Object[0]);
                    downloadManager.remove(HMKeeper.readDownloadApkId());
                    HMKeeper.keepDownloadApkId(-1L);
                    IconToast.showError(context, context.getString(R.string.download_failed));
                }
            }
        } finally {
            cursorQuery.close();
        }
    }
}
