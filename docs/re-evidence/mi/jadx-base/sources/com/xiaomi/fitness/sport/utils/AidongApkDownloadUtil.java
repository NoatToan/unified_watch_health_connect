package com.xiaomi.fitness.sport.utils;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sport/utils/AidongApkDownloadUtil;", "", "<init>", "()V", "mReceiver", "Lcom/xiaomi/fitness/sport/utils/AidongApkDownloadUtil$DownloadBroadcastReceiver;", "mCurrentDownloadId", "", "mAuthority", "", "appUpgradeDirectory", "mApkName", "isDownloading", "", "TAG", "mDownloadManager", "Landroid/app/DownloadManager;", "clearApkIfNeed", "", "context", "Landroid/content/Context;", "apkName", "startDownload", "downloadUrl", "cancelDownload", DownloadBroadcastReceiver.TAG, "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAidongApkDownloadUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AidongApkDownloadUtil.kt\ncom/xiaomi/fitness/sport/utils/AidongApkDownloadUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,136:1\n13402#2,2:137\n*S KotlinDebug\n*F\n+ 1 AidongApkDownloadUtil.kt\ncom/xiaomi/fitness/sport/utils/AidongApkDownloadUtil\n*L\n35#1:137,2\n*E\n"})
public final class AidongApkDownloadUtil {

    @NotNull
    public static final String TAG = "AidongApkDownloadUtil";

    @NotNull
    private static final String appUpgradeDirectory = "AppUpgrade/Aidong";
    private static boolean isDownloading;
    private static long mCurrentDownloadId;

    @NotNull
    private static final DownloadManager mDownloadManager;

    @NotNull
    public static final AidongApkDownloadUtil INSTANCE = new AidongApkDownloadUtil();

    @NotNull
    private static final String mAuthority = ApplicationExtKt.getApplication().getPackageName() + ".AppUpgrade.fileProvider";

    @NotNull
    private static String mApkName = "";

    @NotNull
    private static final DownloadBroadcastReceiver mReceiver = new DownloadBroadcastReceiver();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport/utils/AidongApkDownloadUtil$DownloadBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DownloadBroadcastReceiver extends BroadcastReceiver {

        @NotNull
        public static final String TAG = "DownloadBroadcastReceiver";

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            Logger.d(TAG, "onReceive completeId=" + longExtra + " mCurrentDownloadId=" + AidongApkDownloadUtil.mCurrentDownloadId);
            if (AidongApkDownloadUtil.mCurrentDownloadId == longExtra) {
                try {
                    DownloadManager.Query query = new DownloadManager.Query();
                    query.setFilterById(AidongApkDownloadUtil.mCurrentDownloadId);
                    Cursor cursorQuery = AidongApkDownloadUtil.mDownloadManager.query(query);
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("status");
                        if (8 == cursorQuery.getInt(columnIndex)) {
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            Uri uriForFile = FileProvider.getUriForFile(context, AidongApkDownloadUtil.mAuthority, new File(context.getExternalFilesDir(AidongApkDownloadUtil.appUpgradeDirectory), AidongApkDownloadUtil.mApkName));
                            if (uriForFile != null) {
                                intent2.addFlags(1);
                                intent2.addFlags(268435456);
                                intent2.setDataAndType(uriForFile, "application/vnd.android.package-archive");
                                context.startActivity(intent2);
                            }
                        } else if (cursorQuery.getInt(columnIndex) == 16) {
                            AidongApkDownloadUtil.INSTANCE.cancelDownload();
                        }
                    }
                    ApplicationExtKt.getApplication().unregisterReceiver(AidongApkDownloadUtil.mReceiver);
                } catch (Exception e) {
                    Logger.e(TAG, e, "install process occurred error");
                }
                AidongApkDownloadUtil.mCurrentDownloadId = 0L;
                AidongApkDownloadUtil.isDownloading = false;
            }
        }
    }

    static {
        Object systemService = ApplicationExtKt.getApplication().getSystemService("download");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        mDownloadManager = (DownloadManager) systemService;
    }

    private AidongApkDownloadUtil() {
    }

    private final void clearApkIfNeed(Context context, String apkName) {
        File externalFilesDir = context.getExternalFilesDir(appUpgradeDirectory);
        if (externalFilesDir == null || !externalFilesDir.exists()) {
            return;
        }
        File[] fileArrListFiles = externalFilesDir.listFiles();
        Intrinsics.checkNotNull(fileArrListFiles);
        for (File file : fileArrListFiles) {
            if (Intrinsics.areEqual(file.getName(), apkName)) {
                file.delete();
            }
            Logger.d(TAG, "clearApkIfNeed file with name " + file.getName() + " is deleted.");
        }
    }

    public final void cancelDownload() {
        mDownloadManager.remove(mCurrentDownloadId);
    }

    public final void startDownload(@NotNull String downloadUrl, @NotNull String apkName) {
        Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        Intrinsics.checkNotNullParameter(apkName, "apkName");
        if (isDownloading) {
            Logger.i(TAG, "is under Downloading");
            return;
        }
        mApkName = apkName;
        DownloadManager.Request destinationInExternalFilesDir = new DownloadManager.Request(Uri.parse(downloadUrl)).setNotificationVisibility(0).setTitle("Aidong Apk").setAllowedOverRoaming(false).setNotificationVisibility(1).setDestinationInExternalFilesDir(ApplicationExtKt.getApplication(), appUpgradeDirectory, apkName);
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(mReceiver, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(mReceiver, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        }
        clearApkIfNeed(ApplicationExtKt.getApplication(), apkName);
        mCurrentDownloadId = mDownloadManager.enqueue(destinationInExternalFilesDir);
        isDownloading = true;
        Logger.d(TAG, "startDownload request enqueued.");
    }
}
