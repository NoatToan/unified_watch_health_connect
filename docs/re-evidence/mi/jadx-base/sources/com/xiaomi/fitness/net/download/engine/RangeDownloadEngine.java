package com.xiaomi.fitness.net.download.engine;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.IOExtKt;
import com.xiaomi.fitness.net.download.DownloadRequest;
import com.xiaomi.fitness.net.utils.DownloadFileUtil;
import com.xiaomi.fitness.net.utils.HttpUtil;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.prk;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001-B\u0011\b\u0000\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b+\u0010,J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0018\u00010\u0007R\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u00020\n2\f\u0010\t\u001a\b\u0018\u00010\u0007R\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\b\u0018\u00010\u0013R\u00020\u00002\f\u0010\t\u001a\b\u0018\u00010\u0007R\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001b\u0010\u0004J,\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/net/download/engine/RangeDownloadEngine;", "Lcom/xiaomi/fitness/net/download/engine/BaseDownloadEngine;", "", "createFiles", "()V", "", "url", "Lcom/xiaomi/fitness/net/download/engine/RangeTempHelper$Segment;", "Lcom/xiaomi/fitness/net/download/engine/RangeTempHelper;", "segment", "", "download", "(Ljava/lang/String;Lcom/xiaomi/fitness/net/download/engine/RangeTempHelper$Segment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lprk;", "Lokhttp3/ResponseBody;", b.I, "saveRange", "(Lcom/xiaomi/fitness/net/download/engine/RangeTempHelper$Segment;Lprk;)J", "body", "Lcom/xiaomi/fitness/net/download/engine/RangeDownloadEngine$Buffer;", "createBuffer", "(Lcom/xiaomi/fitness/net/download/engine/RangeTempHelper$Segment;Lokhttp3/ResponseBody;)Lcom/xiaomi/fitness/net/download/engine/RangeDownloadEngine$Buffer;", "Lcom/xiaomi/fitness/net/download/DownloadRequest;", "request", "beforeDownload", "(Lcom/xiaomi/fitness/net/download/DownloadRequest;Lprk;)V", "recreate", "create", "Lcom/xiaomi/fitness/net/download/DownloadProgress;", "startDownload", "(Lcom/xiaomi/fitness/net/download/DownloadRequest;Lprk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fitness/net/download/engine/RealDownloadRequest;", "mDownloadRequest", "Lcom/xiaomi/fitness/net/download/engine/RealDownloadRequest;", "mRequest", "Lcom/xiaomi/fitness/net/download/DownloadRequest;", "Ljava/io/File;", "mTmp", "Ljava/io/File;", "mResponse", "Lprk;", "mRangeTempHelper", "Lcom/xiaomi/fitness/net/download/engine/RangeTempHelper;", "<init>", "(Lcom/xiaomi/fitness/net/download/engine/RealDownloadRequest;)V", "Buffer", "net_release"}, k = 1, mv = {2, 0, 0})
public final class RangeDownloadEngine extends BaseDownloadEngine {

    @NotNull
    private final RealDownloadRequest mDownloadRequest;

    @Nullable
    private RangeTempHelper mRangeTempHelper;
    private DownloadRequest mRequest;
    private prk<ResponseBody> mResponse;

    @Nullable
    private File mTmp;

    /* JADX INFO: renamed from: com.xiaomi.fitness.net.download.engine.RangeDownloadEngine$download$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.net.download.engine.RangeDownloadEngine", f = "RangeDownloadEngine.kt", i = {0, 0}, l = {77}, m = "download", n = {"this", "segment"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RangeDownloadEngine.this.download((String) null, (RangeTempHelper.Segment) null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.net.download.engine.RangeDownloadEngine$startDownload$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.net.download.engine.RangeDownloadEngine", f = "RangeDownloadEngine.kt", i = {0, 0, 0, 0, 0}, l = {67}, m = "startDownload", n = {"this", b.I, "url", BroadcastsKt.SILENT_PUSHING_PROGRESS, "sources"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class C26531 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C26531(Continuation<? super C26531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RangeDownloadEngine.this.startDownload(null, null, this);
        }
    }

    public RangeDownloadEngine(@NotNull RealDownloadRequest mDownloadRequest) {
        Intrinsics.checkNotNullParameter(mDownloadRequest, "mDownloadRequest");
        this.mDownloadRequest = mDownloadRequest;
    }

    private final Buffer createBuffer(RangeTempHelper.Segment segment, ResponseBody body) {
        InputStream inputStreamByteStream = body.byteStream();
        DownloadFileUtil downloadFileUtil = DownloadFileUtil.INSTANCE;
        FileChannel channel = downloadFileUtil.getChannel(this.mTmp);
        FileChannel channel2 = downloadFileUtil.getChannel(getShadow());
        if (channel != null && channel2 != null) {
            try {
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                Intrinsics.checkNotNull(segment);
                MappedByteBuffer map = channel.map(mapMode, segment.startByte(), 32L);
                MappedByteBuffer map2 = channel2.map(mapMode, segment.getCurrent(), segment.remainSize());
                Intrinsics.checkNotNull(map2);
                Intrinsics.checkNotNull(map);
                return new Buffer(this, inputStreamByteStream, channel2, channel, map2, map, segment.getCurrent());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private final void createFiles() throws Throwable {
        DownloadRequest downloadRequest = this.mRequest;
        prk<ResponseBody> prkVar = null;
        if (downloadRequest == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRequest");
            downloadRequest = null;
        }
        File tmp = downloadRequest.getTmp();
        this.mTmp = tmp;
        DownloadFileUtil downloadFileUtil = DownloadFileUtil.INSTANCE;
        DownloadFileUtil.recreate$default(downloadFileUtil, tmp, 0L, 2, null);
        File shadow = getShadow();
        HttpUtil httpUtil = HttpUtil.INSTANCE;
        prk<ResponseBody> prkVar2 = this.mResponse;
        if (prkVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResponse");
            prkVar2 = null;
        }
        downloadFileUtil.recreate(shadow, httpUtil.getContentLength(prkVar2));
        File file = this.mTmp;
        Intrinsics.checkNotNull(file);
        RangeTempHelper rangeTempHelper = new RangeTempHelper(file);
        this.mRangeTempHelper = rangeTempHelper;
        Intrinsics.checkNotNull(rangeTempHelper);
        prk<ResponseBody> prkVar3 = this.mResponse;
        if (prkVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResponse");
        } else {
            prkVar = prkVar3;
        }
        rangeTempHelper.write(prkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object download(String str, RangeTempHelper.Segment segment, Continuation<? super Long> continuation) {
        AnonymousClass1 anonymousClass1;
        RangeDownloadEngine rangeDownloadEngine;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objDownload = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDownload);
            RealDownloadRequest realDownloadRequest = this.mDownloadRequest;
            Intrinsics.checkNotNull(segment);
            long current = segment.getCurrent();
            long end = segment.getEnd();
            anonymousClass2.L$0 = this;
            anonymousClass2.L$1 = segment;
            anonymousClass2.label = 1;
            objDownload = realDownloadRequest.download(current, end, str, anonymousClass2);
            if (objDownload == coroutine_suspended) {
                return coroutine_suspended;
            }
            rangeDownloadEngine = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            segment = (RangeTempHelper.Segment) anonymousClass2.L$1;
            rangeDownloadEngine = (RangeDownloadEngine) anonymousClass2.L$0;
            ResultKt.throwOnFailure(objDownload);
        }
        return Boxing.boxLong(rangeDownloadEngine.saveRange(segment, (prk) objDownload));
    }

    private final long saveRange(RangeTempHelper.Segment segment, prk<ResponseBody> response) {
        ResponseBody responseBodyA = response.a();
        if (responseBodyA == null) {
            throw new RuntimeException("ResponseBody is Null");
        }
        Buffer bufferCreateBuffer = createBuffer(segment, responseBodyA);
        if (bufferCreateBuffer == null) {
            return 0L;
        }
        try {
            byte[] bArr = new byte[8192];
            int i = bufferCreateBuffer.getSource().read(bArr);
            if (i == -1) {
                return 0L;
            }
            bufferCreateBuffer.getShadowBuffer().put(bArr, 0, i);
            long j = i;
            bufferCreateBuffer.setCurrent(bufferCreateBuffer.getCurrent() + j);
            bufferCreateBuffer.getTempBuffer().putLong(16, bufferCreateBuffer.getCurrent());
            return j;
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    @Override // com.xiaomi.fitness.net.download.engine.BaseDownloadEngine
    public void beforeDownload(@NotNull DownloadRequest request, @NotNull prk<ResponseBody> response) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        this.mRequest = request;
        this.mResponse = response;
        super.beforeDownload(request, response);
    }

    @Override // com.xiaomi.fitness.net.download.engine.BaseDownloadEngine
    public void create() throws Throwable {
        DownloadRequest downloadRequest = this.mRequest;
        prk<ResponseBody> prkVar = null;
        if (downloadRequest == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRequest");
            downloadRequest = null;
        }
        this.mTmp = downloadRequest.getTmp();
        File shadow = getShadow();
        Intrinsics.checkNotNull(shadow);
        if (shadow.exists()) {
            File file = this.mTmp;
            Intrinsics.checkNotNull(file);
            if (file.exists()) {
                File file2 = this.mTmp;
                Intrinsics.checkNotNull(file2);
                RangeTempHelper rangeTempHelper = new RangeTempHelper(file2);
                this.mRangeTempHelper = rangeTempHelper;
                Intrinsics.checkNotNull(rangeTempHelper);
                prk<ResponseBody> prkVar2 = this.mResponse;
                if (prkVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mResponse");
                } else {
                    prkVar = prkVar2;
                }
                if (rangeTempHelper.read(prkVar)) {
                    return;
                }
                createFiles();
                return;
            }
        }
        createFiles();
    }

    @Override // com.xiaomi.fitness.net.download.engine.BaseDownloadEngine
    public void recreate() throws Throwable {
        createFiles();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009e  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c1 -> B:23:0x00c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x00c1
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.xiaomi.fitness.net.download.engine.BaseDownloadEngine
    @org.jetbrains.annotations.Nullable
    public java.lang.Object startDownload(@org.jetbrains.annotations.Nullable com.xiaomi.fitness.net.download.DownloadRequest r13, @org.jetbrains.annotations.NotNull defpackage.prk<okhttp3.ResponseBody> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.xiaomi.fitness.net.download.DownloadProgress> r15) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.net.download.engine.RangeDownloadEngine.startDownload(com.xiaomi.fitness.net.download.DownloadRequest, prk, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u001a\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/net/download/engine/RangeDownloadEngine$Buffer;", "", "source", "Ljava/io/InputStream;", "shadowChannel", "Ljava/nio/channels/FileChannel;", "tempChannel", "shadowBuffer", "Ljava/nio/MappedByteBuffer;", "tempBuffer", "current", "", "<init>", "(Lcom/xiaomi/fitness/net/download/engine/RangeDownloadEngine;Ljava/io/InputStream;Ljava/nio/channels/FileChannel;Ljava/nio/channels/FileChannel;Ljava/nio/MappedByteBuffer;Ljava/nio/MappedByteBuffer;J)V", "getSource", "()Ljava/io/InputStream;", "getShadowChannel", "()Ljava/nio/channels/FileChannel;", "getTempChannel", "getShadowBuffer", "()Ljava/nio/MappedByteBuffer;", "getTempBuffer", "getCurrent", "()J", "setCurrent", "(J)V", Constants.EXTRA_CLOSE_TAI, "", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Buffer {
        private long current;

        @NotNull
        private final MappedByteBuffer shadowBuffer;

        @NotNull
        private final FileChannel shadowChannel;

        @NotNull
        private final InputStream source;

        @NotNull
        private final MappedByteBuffer tempBuffer;

        @NotNull
        private final FileChannel tempChannel;
        final /* synthetic */ RangeDownloadEngine this$0;

        public Buffer(@NotNull RangeDownloadEngine rangeDownloadEngine, @NotNull InputStream source, @NotNull FileChannel shadowChannel, @NotNull FileChannel tempChannel, @NotNull MappedByteBuffer shadowBuffer, MappedByteBuffer tempBuffer, long j) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(shadowChannel, "shadowChannel");
            Intrinsics.checkNotNullParameter(tempChannel, "tempChannel");
            Intrinsics.checkNotNullParameter(shadowBuffer, "shadowBuffer");
            Intrinsics.checkNotNullParameter(tempBuffer, "tempBuffer");
            this.this$0 = rangeDownloadEngine;
            this.source = source;
            this.shadowChannel = shadowChannel;
            this.tempChannel = tempChannel;
            this.shadowBuffer = shadowBuffer;
            this.tempBuffer = tempBuffer;
            this.current = j;
        }

        public final void close() {
            IOExtKt.closeSilently(this, this.tempChannel, this.shadowChannel, this.source);
        }

        public final long getCurrent() {
            return this.current;
        }

        @NotNull
        public final MappedByteBuffer getShadowBuffer() {
            return this.shadowBuffer;
        }

        @NotNull
        public final FileChannel getShadowChannel() {
            return this.shadowChannel;
        }

        @NotNull
        public final InputStream getSource() {
            return this.source;
        }

        @NotNull
        public final MappedByteBuffer getTempBuffer() {
            return this.tempBuffer;
        }

        @NotNull
        public final FileChannel getTempChannel() {
            return this.tempChannel;
        }

        public final void setCurrent(long j) {
            this.current = j;
        }

        public /* synthetic */ Buffer(RangeDownloadEngine rangeDownloadEngine, InputStream inputStream, FileChannel fileChannel, FileChannel fileChannel2, MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rangeDownloadEngine, inputStream, fileChannel, fileChannel2, mappedByteBuffer, mappedByteBuffer2, (i & 32) != 0 ? 0L : j);
        }
    }
}
