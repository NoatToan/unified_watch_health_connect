package com.mi.health.appupgrade;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.mi.health.appupgrade.model.AppUpgradeResult;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SignatureUtils;
import defpackage.bzi;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0002J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\tJ\u0006\u0010\u001b\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0007R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/mi/health/appupgrade/AppDownloadHelper;", "", "<init>", "()V", "mDownloadManager", "Landroid/app/DownloadManager;", "mReceiver", "Lcom/mi/health/appupgrade/AppDownloadHelper$DownLoadBroadcastReceiver;", "mUpdateResponse", "Lcom/mi/health/appupgrade/model/AppUpgradeResult;", "mCurrentDownloadId", "", "mAuthority", "", "appUpgradeDirectory", "isDownloading", "", "sha1SignatureArr", "", "[Ljava/lang/String;", "clearApkIfNeed", "", "context", "Landroid/content/Context;", "apkName", "startDownload", "updateResponse", "cancelDownload", "DownLoadBroadcastReceiver", "Companion", "appupgrade_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppDownloadHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDownloadHelper.kt\ncom/mi/health/appupgrade/AppDownloadHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n11158#2:162\n11493#2,3:163\n1#3:166\n*S KotlinDebug\n*F\n+ 1 AppDownloadHelper.kt\ncom/mi/health/appupgrade/AppDownloadHelper\n*L\n36#1:162\n36#1:163,3\n*E\n"})
public final class AppDownloadHelper {

    @NotNull
    public static final String TAG = "AppDownloadHelper";

    @NotNull
    private final String appUpgradeDirectory;
    private boolean isDownloading;

    @NotNull
    private final String mAuthority;
    private long mCurrentDownloadId;

    @NotNull
    private final DownloadManager mDownloadManager;

    @NotNull
    private final DownLoadBroadcastReceiver mReceiver;

    @Nullable
    private AppUpgradeResult mUpdateResponse;

    @NotNull
    private final String[] sha1SignatureArr;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/mi/health/appupgrade/AppDownloadHelper$DownLoadBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/mi/health/appupgrade/AppDownloadHelper;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "appupgrade_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DownLoadBroadcastReceiver extends BroadcastReceiver {
        public DownLoadBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            String apkName;
            boolean z;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            Logger.i(AppDownloadHelper.TAG, "DownLoadBroadcastReceiver onReceive " + intent);
            if (AppDownloadHelper.this.mCurrentDownloadId == longExtra) {
                try {
                    DownloadManager.Query query = new DownloadManager.Query();
                    query.setFilterById(AppDownloadHelper.this.mCurrentDownloadId);
                    Cursor cursorQuery = AppDownloadHelper.this.mDownloadManager.query(query);
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("status");
                        if (8 == cursorQuery.getInt(columnIndex)) {
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            File externalFilesDir = context.getExternalFilesDir(AppDownloadHelper.this.appUpgradeDirectory);
                            AppUpgradeResult appUpgradeResult = AppDownloadHelper.this.mUpdateResponse;
                            if (appUpgradeResult == null || (apkName = appUpgradeResult.getApkName()) == null) {
                                apkName = "";
                            }
                            File file = new File(externalFilesDir, apkName);
                            SignatureUtils signatureUtils = SignatureUtils.INSTANCE;
                            String path = file.getPath();
                            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                            String sha1SignatureByFile = signatureUtils.getSha1SignatureByFile(path);
                            String[] strArr = AppDownloadHelper.this.sha1SignatureArr;
                            int length = strArr.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    z = false;
                                    break;
                                } else {
                                    if (StringsKt__StringsJVMKt.equals(strArr[i], sha1SignatureByFile, true)) {
                                        z = true;
                                        break;
                                    }
                                    i++;
                                }
                            }
                            Logger.i(AppDownloadHelper.TAG, "signature check result " + z);
                            if (!z) {
                                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), "验证签名失败...跳过安装..");
                                return;
                            }
                            Uri uriForFile = FileProvider.getUriForFile(context, AppDownloadHelper.this.mAuthority, file);
                            if (uriForFile != null) {
                                intent2.addFlags(1);
                                intent2.addFlags(268435456);
                                intent2.setDataAndType(uriForFile, "application/vnd.android.package-archive");
                                context.startActivity(intent2);
                            }
                        } else if (cursorQuery.getInt(columnIndex) == 16) {
                            AppDownloadHelper.this.cancelDownload();
                        }
                    }
                    ApplicationExtKt.getApplication().unregisterReceiver(AppDownloadHelper.this.mReceiver);
                } catch (Exception e) {
                    Logger.e(AppDownloadHelper.TAG, "install process occurred error " + e);
                }
                AppDownloadHelper.this.mCurrentDownloadId = 0L;
                AppDownloadHelper.this.isDownloading = false;
            }
        }
    }

    public AppDownloadHelper() {
        Object systemService = ApplicationExtKt.getApplication().getSystemService("download");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        this.mDownloadManager = (DownloadManager) systemService;
        this.mAuthority = ApplicationExtKt.getApplication().getPackageName() + ".AppUpgrade.fileProvider";
        this.appUpgradeDirectory = AppUpgradeUtil.TAG;
        this.sha1SignatureArr = new String[]{"7B6DC7079C34739CE81159719FB5EB61D2A03225", "1DA20E2BDFA678AE888E81E5CA0EC4744EBBBBBD"};
        this.mReceiver = new DownLoadBroadcastReceiver();
    }

    private final void clearApkIfNeed(Context context, String apkName) {
        File[] fileArrListFiles;
        File externalFilesDir = context.getExternalFilesDir(this.appUpgradeDirectory);
        if (externalFilesDir == null || !externalFilesDir.exists() || (fileArrListFiles = externalFilesDir.listFiles()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(Boolean.valueOf(file.delete()));
        }
    }

    public final void cancelDownload() {
        this.mDownloadManager.remove(this.mCurrentDownloadId);
    }

    public final void startDownload(@NotNull AppUpgradeResult updateResponse) {
        String apkName;
        Intrinsics.checkNotNullParameter(updateResponse, "updateResponse");
        if (this.isDownloading) {
            Logger.i(TAG, "is under Downloading");
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), bzi.e);
            return;
        }
        Context applicationContext = ApplicationExtKt.getApplication().getApplicationContext();
        this.mUpdateResponse = updateResponse;
        String download_url = updateResponse != null ? updateResponse.getDownload_url() : null;
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(download_url));
        request.setNotificationVisibility(0);
        request.setTitle("MiHealth.apk");
        request.setAllowedOverRoaming(false);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        String str = this.appUpgradeDirectory;
        AppUpgradeResult appUpgradeResult = this.mUpdateResponse;
        request.setDestinationInExternalFilesDir(applicationContext, str, appUpgradeResult != null ? appUpgradeResult.getApkName() : null);
        if (Build.VERSION.SDK_INT >= 33) {
            applicationContext.registerReceiver(this.mReceiver, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
        } else {
            applicationContext.registerReceiver(this.mReceiver, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        }
        AppUpgradeResult appUpgradeResult2 = this.mUpdateResponse;
        if (appUpgradeResult2 != null && (apkName = appUpgradeResult2.getApkName()) != null) {
            Intrinsics.checkNotNull(applicationContext);
            clearApkIfNeed(applicationContext, apkName);
        }
        long jEnqueue = this.mDownloadManager.enqueue(request);
        this.mCurrentDownloadId = jEnqueue;
        this.isDownloading = true;
        Logger.i(TAG, "startDownload mCurrentDownloadId " + jEnqueue + ", url " + download_url);
    }
}
