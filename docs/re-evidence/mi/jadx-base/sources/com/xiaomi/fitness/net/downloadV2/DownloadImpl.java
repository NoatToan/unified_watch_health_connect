package com.xiaomi.fitness.net.downloadV2;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.downloadV2.DownloadImpl;
import com.xiaomi.fitness.net.downloadV2.engine.CommonDownloadEngine;
import com.xiaomi.fitness.net.downloadV2.engine.RangeDownloadEngine;
import com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/DownloadImpl;", "", "<init>", "()V", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "okHttpClient$delegate", "Lkotlin/Lazy;", "commonDownloadEngine", "Lcom/xiaomi/fitness/net/downloadV2/engine/CommonDownloadEngine;", "getCommonDownloadEngine", "()Lcom/xiaomi/fitness/net/downloadV2/engine/CommonDownloadEngine;", "commonDownloadEngine$delegate", "rangeDownloadEngine", "Lcom/xiaomi/fitness/net/downloadV2/engine/RangeDownloadEngine;", "getRangeDownloadEngine", "()Lcom/xiaomi/fitness/net/downloadV2/engine/RangeDownloadEngine;", "rangeDownloadEngine$delegate", "download", "", "request", "Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest;", "downloadListener", "Lcom/xiaomi/fitness/net/downloadV2/listener/ISingleFileDownloadListener;", "buildInnerDownloadRequest", "Lokhttp3/Request;", "Companion", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DownloadImpl {

    @NotNull
    private static final String TAG = "DownloadImpl";

    /* JADX INFO: renamed from: okHttpClient$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy okHttpClient = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: e37
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DownloadImpl.okHttpClient_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: commonDownloadEngine$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy commonDownloadEngine = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: f37
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DownloadImpl.commonDownloadEngine_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: rangeDownloadEngine$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rangeDownloadEngine = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: g37
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DownloadImpl.rangeDownloadEngine_delegate$lambda$2();
        }
    });

    private final Request buildInnerDownloadRequest(DownloadRequest request) {
        return new Request.Builder().url(request.getUrl()).get().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonDownloadEngine commonDownloadEngine_delegate$lambda$1() {
        return new CommonDownloadEngine();
    }

    private final CommonDownloadEngine getCommonDownloadEngine() {
        return (CommonDownloadEngine) this.commonDownloadEngine.getValue();
    }

    private final OkHttpClient getOkHttpClient() {
        return (OkHttpClient) this.okHttpClient.getValue();
    }

    private final RangeDownloadEngine getRangeDownloadEngine() {
        return (RangeDownloadEngine) this.rangeDownloadEngine.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient okHttpClient_delegate$lambda$0() {
        return new OkHttpClient();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RangeDownloadEngine rangeDownloadEngine_delegate$lambda$2() {
        return new RangeDownloadEngine();
    }

    public final boolean download(@NotNull DownloadRequest request, @Nullable ISingleFileDownloadListener downloadListener) {
        Intrinsics.checkNotNullParameter(request, "request");
        String downloadFilePath = DownloadRequestKt.getDownloadFilePath(request);
        if (new File(downloadFilePath).exists() && !DownloadRequestKt.isForceDownload(request)) {
            Logger.i(TAG, "file exist:" + request.getUrl());
            if (downloadListener == null) {
                return true;
            }
            downloadListener.onSuccess(downloadFilePath);
            return true;
        }
        try {
            Response responseExecute = getOkHttpClient().newCall(buildInnerDownloadRequest(request)).execute();
            if (responseExecute.isSuccessful()) {
                return getCommonDownloadEngine().download(request, responseExecute, downloadListener);
            }
            if (downloadListener == null) {
                return false;
            }
            downloadListener.onError(new DownloadException(ErrorCode.DownLoadHttpException, new Exception("code=" + responseExecute.code())));
            return false;
        } catch (Exception e) {
            if (downloadListener != null) {
                downloadListener.onError(new DownloadException(ErrorCode.Other, e));
            }
            return false;
        }
    }
}
