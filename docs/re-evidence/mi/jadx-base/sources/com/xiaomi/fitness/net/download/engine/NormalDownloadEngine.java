package com.xiaomi.fitness.net.download.engine;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.IOExtKt;
import com.xiaomi.fitness.net.download.DownloadProgress;
import com.xiaomi.fitness.net.download.DownloadRequest;
import com.xiaomi.fitness.net.utils.DownloadFileUtil;
import com.xiaomi.fitness.net.utils.HttpUtil;
import com.xiaomi.onetrack.api.b;
import defpackage.prk;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Okio__JvmOkioKt;
import okio.Sink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000f\u0010\fJ*\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ,\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0096@¢\u0006\u0004\b\u000e\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/net/download/engine/NormalDownloadEngine;", "Lcom/xiaomi/fitness/net/download/engine/BaseDownloadEngine;", "Lcom/xiaomi/fitness/net/download/DownloadRequest;", "request", "Lprk;", "Lokhttp3/ResponseBody;", b.I, "Lcom/xiaomi/fitness/net/download/DownloadProgress;", "download", "(Lcom/xiaomi/fitness/net/download/DownloadRequest;Lprk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "recreate", "()V", "create", "startDownload", "<init>", "Buffer", "net_release"}, k = 1, mv = {2, 0, 0})
public final class NormalDownloadEngine extends BaseDownloadEngine {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/net/download/engine/NormalDownloadEngine$Buffer;", "", "source", "Lokio/BufferedSource;", "sink", "Lokio/BufferedSink;", "<init>", "(Lcom/xiaomi/fitness/net/download/engine/NormalDownloadEngine;Lokio/BufferedSource;Lokio/BufferedSink;)V", "getSource", "()Lokio/BufferedSource;", "getSink", "()Lokio/BufferedSink;", "buffer", "Lokio/Buffer;", "getBuffer", "()Lokio/Buffer;", Constants.EXTRA_CLOSE_TAI, "", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Buffer {

        @Nullable
        private final okio.Buffer buffer;

        @Nullable
        private final BufferedSink sink;

        @NotNull
        private final BufferedSource source;
        final /* synthetic */ NormalDownloadEngine this$0;

        public Buffer(@NotNull NormalDownloadEngine normalDownloadEngine, @Nullable BufferedSource source, BufferedSink bufferedSink) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.this$0 = normalDownloadEngine;
            this.source = source;
            this.sink = bufferedSink;
            this.buffer = bufferedSink != null ? bufferedSink.getBuffer() : null;
        }

        public final void close() {
            IOExtKt.closeSilently(this, this.sink, this.source);
        }

        @Nullable
        public final okio.Buffer getBuffer() {
            return this.buffer;
        }

        @Nullable
        public final BufferedSink getSink() {
            return this.sink;
        }

        @NotNull
        public final BufferedSource getSource() {
            return this.source;
        }
    }

    @Override // com.xiaomi.fitness.net.download.engine.BaseDownloadEngine
    public void create() {
        recreate();
    }

    @Override // com.xiaomi.fitness.net.download.engine.BaseDownloadEngine, com.xiaomi.fitness.net.download.engine.DownloadEngine
    @Nullable
    public Object download(@NotNull DownloadRequest downloadRequest, @NotNull prk<ResponseBody> prkVar, @NotNull Continuation<? super DownloadProgress> continuation) {
        if (prkVar.a() != null) {
            return super.download(downloadRequest, prkVar, continuation);
        }
        throw new RuntimeException("ResponseBody is Null");
    }

    @Override // com.xiaomi.fitness.net.download.engine.BaseDownloadEngine
    public void recreate() {
        DownloadFileUtil.recreate$default(DownloadFileUtil.INSTANCE, getShadow(), 0L, 2, null);
    }

    @Override // com.xiaomi.fitness.net.download.engine.BaseDownloadEngine
    @Nullable
    public Object startDownload(@Nullable DownloadRequest downloadRequest, @NotNull prk<ResponseBody> prkVar, @NotNull Continuation<? super DownloadProgress> continuation) throws IOException {
        Sink sinkSink$default;
        HttpUtil httpUtil = HttpUtil.INSTANCE;
        DownloadProgress downloadProgress = new DownloadProgress(httpUtil.getContentLength(prkVar), httpUtil.isChunked(prkVar));
        ResponseBody responseBodyA = prkVar.a();
        Intrinsics.checkNotNull(responseBodyA);
        BufferedSource source = responseBodyA.getSource();
        File shadow = getShadow();
        Buffer buffer = new Buffer(this, source, (shadow == null || (sinkSink$default = Okio__JvmOkioKt.sink$default(shadow, false, 1, null)) == null) ? null : Okio.buffer(sinkSink$default));
        BufferedSource source2 = buffer.getSource();
        okio.Buffer buffer2 = buffer.getBuffer();
        Intrinsics.checkNotNull(buffer2);
        long j = source2.read(buffer2, 8192L);
        if (j != -1) {
            BufferedSink sink = buffer.getSink();
            if (sink != null) {
                sink.emit();
            }
            DownloadProgress downloadProgressIncreaseSize = downloadProgress.increaseSize(j);
            buffer.close();
            return downloadProgressIncreaseSize;
        }
        BufferedSink sink2 = buffer.getSink();
        if (sink2 != null) {
            sink2.flush();
        }
        File shadow2 = getShadow();
        Intrinsics.checkNotNull(shadow2);
        shadow2.renameTo(getFile());
        return null;
    }
}
