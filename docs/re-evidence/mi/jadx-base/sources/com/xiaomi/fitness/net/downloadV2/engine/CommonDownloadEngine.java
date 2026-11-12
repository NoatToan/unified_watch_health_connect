package com.xiaomi.fitness.net.downloadV2.engine;

import android.text.TextUtils;
import com.xiaomi.fitness.net.downloadV2.DownloadException;
import com.xiaomi.fitness.net.downloadV2.DownloadProgress;
import com.xiaomi.fitness.net.downloadV2.DownloadRequest;
import com.xiaomi.fitness.net.downloadV2.DownloadRequestKt;
import com.xiaomi.fitness.net.downloadV2.ErrorCode;
import com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener;
import com.xiaomi.fitness.net.downloadV2.util.FileUtils;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.Okio;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/engine/CommonDownloadEngine;", "Lcom/xiaomi/fitness/net/downloadV2/engine/BaseDownloadEngine;", "<init>", "()V", "download", "", "downloadRequest", "Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest;", b.I, "Lokhttp3/Response;", "downloadListener", "Lcom/xiaomi/fitness/net/downloadV2/listener/ISingleFileDownloadListener;", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonDownloadEngine extends BaseDownloadEngine {
    @Override // com.xiaomi.fitness.net.downloadV2.engine.IDownloadEngine
    public boolean download(@NotNull DownloadRequest downloadRequest, @NotNull Response response, @Nullable ISingleFileDownloadListener downloadListener) throws IOException {
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        Intrinsics.checkNotNullParameter(response, "response");
        Pair<String, Boolean> pairEnsureDownloadDirExist = FileUtils.INSTANCE.ensureDownloadDirExist(downloadRequest);
        if (!pairEnsureDownloadDirExist.getSecond().booleanValue()) {
            if (downloadListener != null) {
                downloadListener.onError(new DownloadException(ErrorCode.DownLoadDirNotExist, null, 2, null));
            }
            return false;
        }
        long j = -1;
        try {
            String str = response.headers().get(HTTP.CONTENT_LEN);
            if (str != null) {
                j = Long.parseLong(str);
            }
        } catch (Exception unused) {
        }
        if (response.body() == null) {
            if (downloadListener != null) {
                downloadListener.onError(new DownloadException(ErrorCode.ResponseEmptyBody, null, 2, null));
            }
            return false;
        }
        String first = pairEnsureDownloadDirExist.getFirst();
        String downloadFileName = DownloadRequestKt.getDownloadFileName(downloadRequest);
        if (TextUtils.isEmpty(downloadFileName)) {
            if (downloadListener != null) {
                downloadListener.onError(new DownloadException(ErrorCode.EmptyFileName, null, 2, null));
            }
            return false;
        }
        File file = new File(first, downloadFileName);
        File file2 = new File(first, downloadFileName + "_tmp");
        if (file2.exists()) {
            file2.delete();
        }
        file2.createNewFile();
        if (file.exists()) {
            file.delete();
        }
        if (downloadListener != null) {
            downloadListener.onStart(j);
        }
        ResponseBody responseBodyBody = response.body();
        Intrinsics.checkNotNull(responseBodyBody);
        Source source = Okio.source(responseBodyBody.getSource().inputStream());
        Sink sink = Okio.sink(file2, false);
        Buffer buffer = new Buffer();
        long j2 = source.read(buffer, 8192L);
        long j3 = 0;
        while (j2 > 0) {
            sink.write(buffer, j2);
            long j4 = j3 + j2;
            if (downloadListener != null) {
                downloadListener.onProgress(new DownloadProgress(j, j4, 0, 0, 12, null));
            }
            buffer.clear();
            j2 = source.read(buffer, 8192L);
            j3 = j4;
        }
        buffer.clear();
        sink.flush();
        file2.renameTo(file);
        file2.delete();
        if (downloadListener != null) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            downloadListener.onSuccess(absolutePath);
        }
        Util.closeQuietly(source);
        Util.closeQuietly(sink);
        return true;
    }
}
