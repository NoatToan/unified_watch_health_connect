package com.xiaomi.fitness.net.download.engine;

import android.text.TextUtils;
import com.xiaomi.fitness.net.download.DownloadProgress;
import com.xiaomi.fitness.net.download.DownloadRequest;
import com.xiaomi.fitness.net.utils.HttpUtil;
import com.xiaomi.onetrack.api.b;
import defpackage.prk;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u000eJ*\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH$¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH$¢\u0006\u0004\b\u000f\u0010\u000eJ,\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H¦@¢\u0006\u0004\b\u0010\u0010\tR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/net/download/engine/BaseDownloadEngine;", "Lcom/xiaomi/fitness/net/download/engine/DownloadEngine;", "Lcom/xiaomi/fitness/net/download/DownloadRequest;", "request", "Lprk;", "Lokhttp3/ResponseBody;", b.I, "Lcom/xiaomi/fitness/net/download/DownloadProgress;", "download", "(Lcom/xiaomi/fitness/net/download/DownloadRequest;Lprk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "beforeDownload", "(Lcom/xiaomi/fitness/net/download/DownloadRequest;Lprk;)V", "recreate", "()V", "create", "startDownload", "", "alreadyDownloaded", "Z", "Ljava/io/File;", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "setFile", "(Ljava/io/File;)V", "shadow", "getShadow", "setShadow", "<init>", "net_release"}, k = 1, mv = {2, 0, 0})
public abstract class BaseDownloadEngine implements DownloadEngine {
    private boolean alreadyDownloaded;

    @Nullable
    private File file;

    @Nullable
    private File shadow;

    public static /* synthetic */ Object download$suspendImpl(BaseDownloadEngine baseDownloadEngine, DownloadRequest downloadRequest, prk<ResponseBody> prkVar, Continuation<? super DownloadProgress> continuation) {
        if (TextUtils.isEmpty(downloadRequest.getFileName())) {
            downloadRequest.setFileName(HttpUtil.INSTANCE.getFileName(prkVar));
        }
        baseDownloadEngine.beforeDownload(downloadRequest, prkVar);
        if (!baseDownloadEngine.alreadyDownloaded) {
            return baseDownloadEngine.startDownload(downloadRequest, prkVar, continuation);
        }
        long contentLength = HttpUtil.INSTANCE.getContentLength(prkVar);
        return new DownloadProgress(contentLength, contentLength, false, 4, null);
    }

    public void beforeDownload(@NotNull DownloadRequest request, @NotNull prk<ResponseBody> response) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        this.file = request.getFile();
        this.shadow = request.getShadow();
        File dir = request.getDir();
        if (!dir.exists() || !dir.isDirectory()) {
            dir.mkdirs();
        }
        File file = this.file;
        Intrinsics.checkNotNull(file);
        if (!file.exists()) {
            create();
            return;
        }
        File file2 = this.file;
        Intrinsics.checkNotNull(file2);
        if (file2.length() == HttpUtil.INSTANCE.getContentLength(response)) {
            this.alreadyDownloaded = true;
            return;
        }
        File file3 = this.file;
        Intrinsics.checkNotNull(file3);
        file3.delete();
        recreate();
    }

    public abstract void create();

    @Override // com.xiaomi.fitness.net.download.engine.DownloadEngine
    @Nullable
    public Object download(@NotNull DownloadRequest downloadRequest, @NotNull prk<ResponseBody> prkVar, @NotNull Continuation<? super DownloadProgress> continuation) {
        return download$suspendImpl(this, downloadRequest, prkVar, continuation);
    }

    @Nullable
    public final File getFile() {
        return this.file;
    }

    @Nullable
    public final File getShadow() {
        return this.shadow;
    }

    public abstract void recreate();

    public final void setFile(@Nullable File file) {
        this.file = file;
    }

    public final void setShadow(@Nullable File file) {
        this.shadow = file;
    }

    @Nullable
    public abstract Object startDownload(@Nullable DownloadRequest downloadRequest, @NotNull prk<ResponseBody> prkVar, @NotNull Continuation<? super DownloadProgress> continuation);
}
