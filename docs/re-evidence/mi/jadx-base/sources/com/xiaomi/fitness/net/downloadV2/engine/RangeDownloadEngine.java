package com.xiaomi.fitness.net.downloadV2.engine;

import com.xiaomi.fitness.net.downloadV2.DownloadRequest;
import com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener;
import com.xiaomi.onetrack.api.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/engine/RangeDownloadEngine;", "Lcom/xiaomi/fitness/net/downloadV2/engine/IDownloadEngine;", "<init>", "()V", "download", "", "downloadRequest", "Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest;", b.I, "Lokhttp3/Response;", "downloadListener", "Lcom/xiaomi/fitness/net/downloadV2/listener/ISingleFileDownloadListener;", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RangeDownloadEngine implements IDownloadEngine {
    @Override // com.xiaomi.fitness.net.downloadV2.engine.IDownloadEngine
    public boolean download(@NotNull DownloadRequest downloadRequest, @NotNull Response response, @Nullable ISingleFileDownloadListener downloadListener) {
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        Intrinsics.checkNotNullParameter(response, "response");
        return false;
    }
}
