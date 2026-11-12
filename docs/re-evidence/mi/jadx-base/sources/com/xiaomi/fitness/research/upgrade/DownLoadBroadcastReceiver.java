package com.xiaomi.fitness.research.upgrade;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/research/upgrade/DownLoadBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "downloader", "Lcom/xiaomi/fitness/research/upgrade/AppDownloader;", "apkName", "", "<init>", "(Lcom/xiaomi/fitness/research/upgrade/AppDownloader;Ljava/lang/String;)V", "downloadId", "", "getDownloadId$research_support_chinaProductRelease", "()J", "setDownloadId$research_support_chinaProductRelease", "(J)V", LoginPreferenceConfig.TYPE_REGISTER, "", "context", "Landroid/content/Context;", "onReceive", "intent", "Landroid/content/Intent;", "Companion", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DownLoadBroadcastReceiver extends BroadcastReceiver {

    @NotNull
    private static final String CHECK_RESULT = "com.xiaomi.market.DIRECT_MAIL_CHECK_RESULT";

    @NotNull
    private static final String CHECK_STATUS = "com.xiaomi.market.DIRECT_MAIL_STATUS";

    @NotNull
    private final String apkName;
    private long downloadId;

    @NotNull
    private final AppDownloader downloader;

    public DownLoadBroadcastReceiver(@NotNull AppDownloader downloader, @NotNull String apkName) {
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(apkName, "apkName");
        this.downloader = downloader;
        this.apkName = apkName;
    }

    /* JADX INFO: renamed from: getDownloadId$research_support_chinaProductRelease, reason: from getter */
    public final long getDownloadId() {
        return this.downloadId;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Logger.i("AppDownloader", "DownLoadBroadcastReceiver(ID:" + this.downloadId + ") onReceive " + intent);
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == 490579568) {
                if (action.equals(CHECK_STATUS)) {
                    Bundle extras = intent.getExtras();
                    numValueOf = extras != null ? Integer.valueOf(extras.getInt(Constants.PARAM_STATUS_CODE)) : null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onReceive: ");
                    sb.append(numValueOf);
                    return;
                }
                return;
            }
            if (iHashCode == 1248865515) {
                if (action.equals("android.intent.action.DOWNLOAD_COMPLETE")) {
                    if (this.downloadId != intent.getLongExtra("extra_download_id", -1L)) {
                        return;
                    }
                    this.downloader.onDownloadResult$research_support_chinaProductRelease(context, this.apkName);
                    ApplicationExtKt.getApplication().unregisterReceiver(this);
                    return;
                }
                return;
            }
            if (iHashCode == 1766490962 && action.equals(CHECK_RESULT)) {
                Bundle extras2 = intent.getExtras();
                Integer numValueOf2 = extras2 != null ? Integer.valueOf(extras2.getInt("styleCheckResult")) : null;
                String string = extras2 != null ? extras2.getString("packageName") : null;
                numValueOf = extras2 != null ? Integer.valueOf(extras2.getInt(Constants.PARAM_STATUS_CODE)) : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onReceive: ");
                sb2.append(numValueOf2);
                sb2.append(">>>");
                sb2.append(string);
                sb2.append(">>");
                sb2.append(numValueOf);
                AppDownloader appDownloader = this.downloader;
                Intrinsics.checkNotNull(string);
                appDownloader.checkMarketDownloadStatus$research_support_chinaProductRelease(context, string);
            }
        }
    }

    public final void register(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IntentFilter intentFilter = new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
        intentFilter.addAction(CHECK_RESULT);
        intentFilter.addAction(CHECK_STATUS);
        intentFilter.addAction("com.xiaomi.market.DIRECT_MAIL_DOWNLOAD_PROGRESS");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this, intentFilter, 2);
        } else {
            context.registerReceiver(this, intentFilter);
        }
    }

    public final void setDownloadId$research_support_chinaProductRelease(long j) {
        this.downloadId = j;
    }
}
