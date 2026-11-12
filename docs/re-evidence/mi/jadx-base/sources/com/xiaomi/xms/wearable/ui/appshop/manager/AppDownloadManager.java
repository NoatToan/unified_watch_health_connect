package com.xiaomi.xms.wearable.ui.appshop.manager;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.wearable.hm.BroadcastsKt;
import com.xiaomi.xms.wearable.ui.appshop.manager.AppDownloadManager;
import com.xiaomi.xms.wearable.ui.appshop.model.WatchAppListData;
import defpackage.lg1;
import defpackage.r72;
import defpackage.vgc;
import defpackage.x1j;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ \u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bJ\n\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppDownloadManager;", "", "<init>", "()V", "mSemaphore", "Ljava/util/concurrent/Semaphore;", "mAppCacheMap", "", "", "Lcom/xiaomi/xms/wearable/ui/appshop/model/WatchAppListData$WatchAppBean;", "downloadApp", "", "appInfo", "startDownload", "packageName", "url", "filePath", "getCachedAppInfo", "getAppFilePath", "getThirdMarketAppExternalPath", "DownloadObserver", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppDownloadManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<AppDownloadManager> INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: gg1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDownloadManager.INSTANCE_delegate$lambda$0();
        }
    });
    private static final int MAX_DOWNLOAD_COUNT = 4;

    @NotNull
    private static final String RPK_SUFFIX = ".rpk";

    @NotNull
    private static final String TAG = "AppDownloadManager";

    @NotNull
    private static final String THIRD_MARKET_APP_DIR = "AppMarket";

    @NotNull
    private final Semaphore mSemaphore = new Semaphore(4);

    @NotNull
    private final Map<String, WatchAppListData.WatchAppBean> mAppCacheMap = new HashMap();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppDownloadManager$Companion;", "", "<init>", "()V", "TAG", "", "RPK_SUFFIX", "MAX_DOWNLOAD_COUNT", "", "THIRD_MARKET_APP_DIR", "INSTANCE", "Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppDownloadManager;", "getINSTANCE", "()Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppDownloadManager;", "INSTANCE$delegate", "Lkotlin/Lazy;", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AppDownloadManager getINSTANCE() {
            return (AppDownloadManager) AppDownloadManager.INSTANCE$delegate.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppDownloadManager$DownloadObserver;", "Lvgc$a;", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "onProgress", "(I)V", "onComplete", "()V", "", Constants.EXTRA_ERROR_MESSAGE, "onError", "(Ljava/lang/String;)V", "packageName", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "<init>", "(Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppDownloadManager;Ljava/lang/String;)V", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
    public final class DownloadObserver implements vgc.a {

        @NotNull
        private final String packageName;
        final /* synthetic */ AppDownloadManager this$0;

        public DownloadObserver(@NotNull AppDownloadManager appDownloadManager, String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            this.this$0 = appDownloadManager;
            this.packageName = packageName;
        }

        @NotNull
        public final String getPackageName() {
            return this.packageName;
        }

        @Override // vgc.a
        public void onComplete() {
            try {
                lg1.b(this.packageName + ": onComplete");
                AppStatusManager.updateStatus$default(AppStatusManager.INSTANCE.getINSTANCE(), this.packageName, 5, 0, null, 12, null);
            } finally {
                this.this$0.mSemaphore.release();
                lg1.d("Semaphore release onComplete Semaphore.availablePermits:" + this.this$0.mSemaphore.availablePermits() + " packName:" + this.packageName);
            }
        }

        @Override // vgc.a
        public void onError(@Nullable String errorMsg) {
            try {
                lg1.b(this.packageName + ": onError:" + errorMsg);
                AppStatusManager.updateStatus$default(AppStatusManager.INSTANCE.getINSTANCE(), this.packageName, 6, 0, null, 12, null);
            } finally {
                this.this$0.mSemaphore.release();
                lg1.d("Semaphore release onError Semaphore.availablePermits:" + this.this$0.mSemaphore.availablePermits() + " packName:" + this.packageName);
            }
        }

        @Override // vgc.a
        public void onProgress(int progress) {
            lg1.d("packageName:" + this.packageName + "  onProgress:" + progress);
            AppStatusManager.updateStatus$default(AppStatusManager.INSTANCE.getINSTANCE(), this.packageName, 4, progress, null, 8, null);
        }
    }

    private AppDownloadManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppDownloadManager INSTANCE_delegate$lambda$0() {
        return new AppDownloadManager();
    }

    private final String getThirdMarketAppExternalPath() {
        return r72.f(THIRD_MARKET_APP_DIR);
    }

    private final void startDownload(String packageName, String url, String filePath) {
        AppStatusManager.Companion companion = AppStatusManager.INSTANCE;
        AppStatusManager.updateStatus$default(companion.getINSTANCE(), packageName, 3, 0, null, 12, null);
        lg1.d("startDownload: " + packageName + "  start");
        File file = new File(filePath);
        if (!file.exists() || file.length() == 0) {
            vgc.k(url, filePath, new DownloadObserver(this, packageName));
            return;
        }
        try {
            lg1.b(packageName + " file(" + filePath + ") already exits");
            AppStatusManager.updateStatus$default(companion.getINSTANCE(), packageName, 5, 0, null, 12, null);
        } finally {
            this.mSemaphore.release();
            lg1.d("Semaphore release file exits Semaphore.availablePermits:" + this.mSemaphore.availablePermits() + " packName:" + packageName);
        }
    }

    public final synchronized void downloadApp(@NotNull WatchAppListData.WatchAppBean appInfo) {
        try {
            Intrinsics.checkNotNullParameter(appInfo, "appInfo");
            if (NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
                String str = appInfo.package_name;
                String str2 = appInfo.download_url;
                this.mAppCacheMap.put(str, appInfo);
                lg1.d("Semaphore start Semaphore.availablePermits:" + this.mSemaphore.availablePermits() + " packName:" + str);
                boolean zTryAcquire = this.mSemaphore.tryAcquire();
                lg1.b("Semaphore tryAcquire Semaphore.availablePermits:" + this.mSemaphore.availablePermits() + " acquired:" + zTryAcquire + " packName:" + str);
                if (zTryAcquire) {
                    Intrinsics.checkNotNull(str);
                    Intrinsics.checkNotNull(str2);
                    startDownload(str, str2, getAppFilePath(str));
                } else {
                    AppStatusManager instance = AppStatusManager.INSTANCE.getINSTANCE();
                    Intrinsics.checkNotNull(str);
                    AppStatusManager.updateStatus$default(instance, str, 18, 0, null, 12, null);
                }
            } else {
                lg1.b("AppDownloadManagererror network not available");
                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), x1j.common_hint_network_unavailable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    public final String getAppFilePath(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return getThirdMarketAppExternalPath() + File.separator + packageName + RPK_SUFFIX;
    }

    @Nullable
    public final WatchAppListData.WatchAppBean getCachedAppInfo(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return this.mAppCacheMap.get(packageName);
    }
}
