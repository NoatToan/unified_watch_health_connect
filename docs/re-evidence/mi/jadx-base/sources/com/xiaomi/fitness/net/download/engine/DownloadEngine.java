package com.xiaomi.fitness.net.download.engine;

import com.xiaomi.fitness.net.download.DownloadProgress;
import com.xiaomi.fitness.net.download.DownloadRequest;
import com.xiaomi.onetrack.api.b;
import defpackage.prk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H¦@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/net/download/engine/DownloadEngine;", "", "Lcom/xiaomi/fitness/net/download/DownloadRequest;", "request", "Lprk;", "Lokhttp3/ResponseBody;", b.I, "Lcom/xiaomi/fitness/net/download/DownloadProgress;", "download", "(Lcom/xiaomi/fitness/net/download/DownloadRequest;Lprk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "net_release"}, k = 1, mv = {2, 0, 0})
public interface DownloadEngine {
    @Nullable
    Object download(@NotNull DownloadRequest downloadRequest, @NotNull prk<ResponseBody> prkVar, @NotNull Continuation<? super DownloadProgress> continuation);
}
