package com.xiaomi.fitness.net.download;

import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.net.download.DownloadManager;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ.\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\tJ$\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0011\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0012\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ+\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0015\"\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/net/download/DownloadManager;", "", "<init>", "()V", "mDownloader", "Lcom/xiaomi/fitness/net/download/Downloader;", "download", "", "url", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/net/download/DownloadListener;", "fileName", "path", "request", "Lcom/xiaomi/fitness/net/download/DownloadRequest;", "name", "pause", BroadcastsKt.SILENT_PUSHING_CANCEL, "sessionId", "", "", "(I[Ljava/lang/String;)V", "Companion", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DownloadManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<DownloadManager> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: h37
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DownloadManager.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private Downloader mDownloader = new DownloaderImpl();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/net/download/DownloadManager$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/net/download/DownloadManager;", "getInstance", "()Lcom/xiaomi/fitness/net/download/DownloadManager;", "instance$delegate", "Lkotlin/Lazy;", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DownloadManager getInstance() {
            return (DownloadManager) DownloadManager.instance$delegate.getValue();
        }
    }

    private DownloadManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DownloadManager instance_delegate$lambda$0() {
        return new DownloadManager();
    }

    public final void cancel(@Nullable String url) {
        this.mDownloader.cancel(url);
    }

    public final void download(int sessionId, @NotNull String... url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public final void pause(@Nullable String url) {
        this.mDownloader.pause(url);
    }

    public final void download(@Nullable String url, @Nullable DownloadListener listener) {
        download(url, null, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath(), listener);
    }

    public final void download(@Nullable String url, @Nullable String fileName, @Nullable String path, @Nullable DownloadListener listener) {
        if (TextUtils.isEmpty(url)) {
            return;
        }
        NormalDownloadRequest normalDownloadRequest = new NormalDownloadRequest();
        normalDownloadRequest.setUrl(url);
        normalDownloadRequest.setFileName(fileName);
        normalDownloadRequest.setFilePath(path);
        download(normalDownloadRequest, listener);
    }

    public final void download(@Nullable DownloadRequest request, @Nullable DownloadListener listener) {
        if (request != null) {
            this.mDownloader.download(request, listener);
        }
    }

    public final void download(@Nullable String url, @Nullable String path) {
        download(url, null, path);
    }

    public final void download(@Nullable String url, @Nullable String name, @Nullable String path) {
        download(url, name, path, null);
    }
}
