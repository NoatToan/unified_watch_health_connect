package com.xiaomi.fitness.detail.video.share.util;

import android.app.DownloadManager;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.detail.video.share.adapter.MusicItem;
import com.xiaomi.fitness.detail.video.share.holder.MusicStyleHolder;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J*\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\n\u0010\u0017\u001a\u00060\u0018R\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/util/DownloadMusicUtil;", "", "<init>", "()V", "mAuthority", "", "appUpgradeDirectory", "TAG", "downloadIdMap", "", "", "getDownloadIdMap", "()Ljava/util/Map;", "mDownloadManager", "Landroid/app/DownloadManager;", "getMDownloadManager", "()Landroid/app/DownloadManager;", "hasDownload", "", "apkName", "startDownload", "", "downloadUrl", "mReceiver", "Lcom/xiaomi/fitness/detail/video/share/holder/MusicStyleHolder$DownloadBroadcastReceiver;", "Lcom/xiaomi/fitness/detail/video/share/holder/MusicStyleHolder;", "musicItem", "Lcom/xiaomi/fitness/detail/video/share/adapter/MusicItem;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDownloadMusicUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadMusicUtil.kt\ncom/xiaomi/fitness/detail/video/share/util/DownloadMusicUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,77:1\n13402#2,2:78\n*S KotlinDebug\n*F\n+ 1 DownloadMusicUtil.kt\ncom/xiaomi/fitness/detail/video/share/util/DownloadMusicUtil\n*L\n35#1:78,2\n*E\n"})
public final class DownloadMusicUtil {

    @NotNull
    public static final String TAG = "DownloadMusicUtil";

    @NotNull
    public static final String appUpgradeDirectory = "music";

    @NotNull
    private static final DownloadManager mDownloadManager;

    @NotNull
    public static final DownloadMusicUtil INSTANCE = new DownloadMusicUtil();

    @NotNull
    private static final String mAuthority = ApplicationExtKt.getApplication().getPackageName() + ".AppUpgrade.fileProvider";

    @NotNull
    private static final Map<Long, String> downloadIdMap = new LinkedHashMap();

    static {
        Object systemService = ApplicationExtKt.getApplication().getSystemService("download");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        mDownloadManager = (DownloadManager) systemService;
    }

    private DownloadMusicUtil() {
    }

    @NotNull
    public final Map<Long, String> getDownloadIdMap() {
        return downloadIdMap;
    }

    @NotNull
    public final DownloadManager getMDownloadManager() {
        return mDownloadManager;
    }

    public final boolean hasDownload(@NotNull String apkName) {
        File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(apkName, "apkName");
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(appUpgradeDirectory);
        if (externalFilesDir != null && externalFilesDir.exists() && (fileArrListFiles = externalFilesDir.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                Logger.d(TAG, "clearApkIfNeed file with name " + file.getName() + ".apkName = " + apkName);
                if (Intrinsics.areEqual(file.getName(), apkName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void startDownload(@NotNull String downloadUrl, @NotNull String apkName, @NotNull MusicStyleHolder.DownloadBroadcastReceiver mReceiver, @NotNull MusicItem musicItem) {
        Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        Intrinsics.checkNotNullParameter(apkName, "apkName");
        Intrinsics.checkNotNullParameter(mReceiver, "mReceiver");
        Intrinsics.checkNotNullParameter(musicItem, "musicItem");
        for (Map.Entry<Long, String> entry : downloadIdMap.entrySet()) {
            entry.getKey().longValue();
            if (Intrinsics.areEqual(entry.getValue(), apkName)) {
                FitnessLogUtils.i(TAG, "this " + apkName + " is downing");
                return;
            }
        }
        if (hasDownload(apkName)) {
            FitnessLogUtils.i(TAG, "this " + apkName + " has down");
            return;
        }
        musicItem.setState(2);
        DownloadManager.Request destinationInExternalFilesDir = new DownloadManager.Request(Uri.parse(downloadUrl)).setNotificationVisibility(0).setTitle("music download").setAllowedOverRoaming(false).setNotificationVisibility(1).setDestinationInExternalFilesDir(ApplicationExtKt.getApplication(), appUpgradeDirectory, apkName);
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(mReceiver, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(mReceiver, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        }
        long jEnqueue = mDownloadManager.enqueue(destinationInExternalFilesDir);
        downloadIdMap.put(Long.valueOf(jEnqueue), apkName);
        Logger.d(TAG, "startDownload request enqueued.mCurrentDownloadId:" + jEnqueue + ",download url = " + downloadUrl);
    }
}
