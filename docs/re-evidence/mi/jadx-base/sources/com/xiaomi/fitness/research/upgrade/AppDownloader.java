package com.xiaomi.fitness.research.upgrade;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.content.FileProvider;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SignatureUtils;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0016\u001a\u00020\rH\u0002J\u001d\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0018J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002J\u001d\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0014H\u0000¢\u0006\u0002\b J\u0016\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0014J\u0010\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0014H\u0002J\u0018\u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0014H\u0002J\u0006\u0010%\u001a\u00020\rR\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/research/upgrade/AppDownloader;", "", "<init>", "()V", "mDownloadManager", "Landroid/app/DownloadManager;", "kotlin.jvm.PlatformType", "Landroid/app/DownloadManager;", "mCurrentDownloadId", "", "isDownloading", "", "clearApkIfNeed", "", "context", "Landroid/content/Context;", "startDownload", "result", "Lcom/xiaomi/fitness/research/upgrade/AppUpgradeResult;", "apkName", "", "downloadUrl", "cancelDownload", "onDownloadResult", "onDownloadResult$research_support_chinaProductRelease", "checkSignature", "apkFile", "Ljava/io/File;", "installApk", "newFile", "checkMarketDownloadStatus", OneTrack.Param.PKG, "checkMarketDownloadStatus$research_support_chinaProductRelease", "downloadApk", Constants.KEY_PACKAGE_NAME, "downloadFromServer", "launchMarket", "onInstalled", "Companion", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppDownloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDownloader.kt\ncom/xiaomi/fitness/research/upgrade/AppDownloader\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n11158#2:219\n11493#2,3:220\n1863#3,2:223\n*S KotlinDebug\n*F\n+ 1 AppDownloader.kt\ncom/xiaomi/fitness/research/upgrade/AppDownloader\n*L\n39#1:219\n39#1:220,3\n168#1:223,2\n*E\n"})
public final class AppDownloader {

    @NotNull
    private static final String APP_UPGRADE_DIRECTORY = "research";

    @NotNull
    private static final String TAG = "AppDownloader";
    private boolean isDownloading;
    private long mCurrentDownloadId;
    private final DownloadManager mDownloadManager = (DownloadManager) ApplicationExtKt.getApplication().getSystemService(DownloadManager.class);

    @NotNull
    private static final String[] sha1SignatureArr = {"6284E60CF9322E5D356D715520C294A2B94E0174"};

    @NotNull
    private static final String mAuthority = ApplicationExtKt.getApplication().getPackageName() + ".ResearchAppUpgrade.fileProvider";

    private final void cancelDownload() {
        this.mDownloadManager.remove(this.mCurrentDownloadId);
    }

    private final boolean checkSignature(File apkFile) {
        SignatureUtils signatureUtils = SignatureUtils.INSTANCE;
        String path = apkFile.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        String sha1SignatureByFile = signatureUtils.getSha1SignatureByFile(path);
        boolean z = false;
        for (String str : sha1SignatureArr) {
            if (StringsKt__StringsJVMKt.equals(str, sha1SignatureByFile, true)) {
                z = true;
                break;
            }
        }
        Logger.i(TAG, "signature check result " + z);
        if (!z) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), "验证签名失败...跳过安装..");
        }
        return z;
    }

    private final void clearApkIfNeed(Context context) {
        File[] fileArrListFiles;
        File externalFilesDir = context.getExternalFilesDir(APP_UPGRADE_DIRECTORY);
        if (externalFilesDir == null || !externalFilesDir.exists() || (fileArrListFiles = externalFilesDir.listFiles()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(Boolean.valueOf(file.delete()));
        }
    }

    private final void downloadFromServer(String pkgName) {
        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) DownloadWebViewActivity.class);
        intent.putExtra("URL", "https://hlth.research.xiaomiwear.com/download?redir=common");
        intent.addFlags(268435456);
        ApplicationExtKt.getApplication().startActivity(intent);
    }

    private final void installApk(Context context, File newFile) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri uriForFile = FileProvider.getUriForFile(context, mAuthority, newFile);
        if (uriForFile != null) {
            intent.addFlags(1);
            intent.addFlags(268435456);
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            context.startActivity(intent);
        }
    }

    private final void launchMarket(Context context, String pkgName) {
        new DownLoadBroadcastReceiver(this, pkgName).register(ApplicationExtKt.getApplication());
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mimarket://details?&detailStyle=1&id=" + pkgName));
        intent.setPackage("com.xiaomi.market");
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public final void checkMarketDownloadStatus$research_support_chinaProductRelease(@NotNull Context context, @NotNull String pkg) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("packageNames", CollectionsKt__CollectionsKt.arrayListOf(pkg));
        Bundle bundleCall = context.getContentResolver().call(Uri.parse("content://com.xiaomi.market.provider.DirectMailProvider/status"), "queryDownloadStatus", (String) null, bundle);
        ArrayList<Bundle> parcelableArrayList = bundleCall != null ? bundleCall.getParcelableArrayList("packageNames") : null;
        StringBuilder sb = new StringBuilder();
        sb.append("checkMarketDownloadStatus: ");
        sb.append(bundleCall);
        if (parcelableArrayList != null) {
            for (Bundle bundle2 : parcelableArrayList) {
                String string = bundle2 != null ? bundle2.getString("packageName") : null;
                Integer numValueOf = bundle2 != null ? Integer.valueOf(bundle2.getInt("status")) : null;
                Integer numValueOf2 = bundle2 != null ? Integer.valueOf(bundle2.getInt(BroadcastsKt.SILENT_PUSHING_PROGRESS)) : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("packageName=");
                sb2.append(string);
                sb2.append(",status=");
                sb2.append(numValueOf);
                sb2.append(",progress=");
                sb2.append(numValueOf2);
                if (bundle2 != null && bundle2.getInt("status") == 3008) {
                    onInstalled();
                }
            }
        }
    }

    public final void downloadApk(@NotNull Context context, @NotNull String pkgName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        downloadFromServer(pkgName);
    }

    public final void onDownloadResult$research_support_chinaProductRelease(@NotNull Context context, @NotNull String apkName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apkName, "apkName");
        try {
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(this.mCurrentDownloadId);
            Cursor cursorQuery = this.mDownloadManager.query(query);
            if (cursorQuery.moveToFirst()) {
                int columnIndex = cursorQuery.getColumnIndex("status");
                if (8 == cursorQuery.getInt(columnIndex)) {
                    File file = new File(context.getExternalFilesDir(APP_UPGRADE_DIRECTORY), apkName);
                    if (checkSignature(file)) {
                        installApk(context, file);
                    }
                } else if (cursorQuery.getInt(columnIndex) == 16) {
                    cancelDownload();
                }
            }
        } catch (Exception e) {
            Logger.e(TAG, "install process occurred error " + e);
        }
        this.mCurrentDownloadId = 0L;
        this.isDownloading = false;
    }

    public final void onInstalled() {
    }

    public final void startDownload(@NotNull AppUpgradeResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (this.isDownloading) {
            Logger.i(TAG, "is under downloading");
            return;
        }
        Context applicationContext = ApplicationExtKt.getApplication().getApplicationContext();
        DownLoadBroadcastReceiver downLoadBroadcastReceiver = new DownLoadBroadcastReceiver(this, result.getApkName());
        downLoadBroadcastReceiver.register(ApplicationExtKt.getApplication());
        String downloadUrl = result.getDownloadUrl();
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(downloadUrl));
        request.setNotificationVisibility(0);
        request.setTitle(result.getApkName());
        request.setAllowedOverRoaming(false);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        request.setDestinationInExternalFilesDir(applicationContext, APP_UPGRADE_DIRECTORY, result.getApkName());
        Intrinsics.checkNotNull(applicationContext);
        clearApkIfNeed(applicationContext);
        try {
            this.mCurrentDownloadId = this.mDownloadManager.enqueue(request);
        } catch (Exception e) {
            FitnessLogUtils.e(TAG, "exception:" + e);
        }
        downLoadBroadcastReceiver.setDownloadId$research_support_chinaProductRelease(this.mCurrentDownloadId);
        this.isDownloading = true;
        Logger.i(TAG, "startDownload mCurrentDownloadId " + this.mCurrentDownloadId + ", url " + downloadUrl);
    }

    public final void startDownload(@NotNull String apkName, @NotNull String downloadUrl) {
        Intrinsics.checkNotNullParameter(apkName, "apkName");
        Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        AppUpgradeResult appUpgradeResult = new AppUpgradeResult(0, "", 0, downloadUrl, null);
        appUpgradeResult.setApkName(apkName);
        startDownload(appUpgradeResult);
    }
}
