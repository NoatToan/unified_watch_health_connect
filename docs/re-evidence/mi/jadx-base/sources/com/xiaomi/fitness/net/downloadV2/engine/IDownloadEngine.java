package com.xiaomi.fitness.net.downloadV2.engine;

import com.xiaomi.fitness.net.downloadV2.DownloadRequest;
import com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener;
import com.xiaomi.onetrack.api.b;
import kotlin.Metadata;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/engine/IDownloadEngine;", "", "download", "", "downloadRequest", "Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest;", b.I, "Lokhttp3/Response;", "downloadListener", "Lcom/xiaomi/fitness/net/downloadV2/listener/ISingleFileDownloadListener;", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IDownloadEngine {
    boolean download(@NotNull DownloadRequest downloadRequest, @NotNull Response response, @Nullable ISingleFileDownloadListener downloadListener);
}
