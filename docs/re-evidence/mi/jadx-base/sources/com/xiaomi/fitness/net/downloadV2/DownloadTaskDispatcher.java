package com.xiaomi.fitness.net.downloadV2;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.downloadV2.DownloadTaskDispatcher;
import com.xiaomi.fitness.net.downloadV2.listener.IMultiFileDownloadListener;
import com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener;
import com.xiaomi.fitness.net.downloadV2.listener.SingleDownloadListenerDispatcher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&J\u001e\u0010'\u001a\u00020\"2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020$0\u001d2\b\u0010%\u001a\u0004\u0018\u00010)R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011RO\u0010\u0013\u001a6\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00050\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0016 \u0015*\u001a\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00050\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00170\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0018\u0010\u0019R?\u0010\u001b\u001a&\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00050\u0005 \u0015*\u0012\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u001d0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/DownloadTaskDispatcher;", "", "<init>", "()V", "TAG", "", "DOWNLOAD_THREAD_NUM", "", "downloadImpl", "Lcom/xiaomi/fitness/net/downloadV2/DownloadImpl;", "getDownloadImpl", "()Lcom/xiaomi/fitness/net/downloadV2/DownloadImpl;", "downloadImpl$delegate", "Lkotlin/Lazy;", "downloadExecutor", "Ljava/util/concurrent/ThreadPoolExecutor;", "getDownloadExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", "downloadExecutor$delegate", "singleDownloadingRequests", "", "kotlin.jvm.PlatformType", "Lcom/xiaomi/fitness/net/downloadV2/listener/SingleDownloadListenerDispatcher;", "", "getSingleDownloadingRequests", "()Ljava/util/Map;", "singleDownloadingRequests$delegate", "multiDownloadingRequests", "", "", "getMultiDownloadingRequests", "()Ljava/util/List;", "multiDownloadingRequests$delegate", "downloadSingleFileInner", "", "request", "Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest;", "downloadListener", "Lcom/xiaomi/fitness/net/downloadV2/listener/ISingleFileDownloadListener;", "downloadMultiFilesInner", "requestList", "Lcom/xiaomi/fitness/net/downloadV2/listener/IMultiFileDownloadListener;", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDownloadTaskDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadTaskDispatcher.kt\ncom/xiaomi/fitness/net/downloadV2/DownloadTaskDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1863#2,2:92\n1863#2,2:94\n1#3:96\n*S KotlinDebug\n*F\n+ 1 DownloadTaskDispatcher.kt\ncom/xiaomi/fitness/net/downloadV2/DownloadTaskDispatcher\n*L\n63#1:92,2\n69#1:94,2\n*E\n"})
public final class DownloadTaskDispatcher {
    private static final int DOWNLOAD_THREAD_NUM = 3;

    @NotNull
    private static final String TAG = "DownloadTaskDispatcher";

    @NotNull
    public static final DownloadTaskDispatcher INSTANCE = new DownloadTaskDispatcher();

    /* JADX INFO: renamed from: downloadImpl$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy downloadImpl = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: w37
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DownloadTaskDispatcher.downloadImpl_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: downloadExecutor$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy downloadExecutor = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: x37
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DownloadTaskDispatcher.downloadExecutor_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: singleDownloadingRequests$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy singleDownloadingRequests = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: y37
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DownloadTaskDispatcher.singleDownloadingRequests_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: multiDownloadingRequests$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy multiDownloadingRequests = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: z37
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DownloadTaskDispatcher.multiDownloadingRequests_delegate$lambda$3();
        }
    });

    private DownloadTaskDispatcher() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadPoolExecutor downloadExecutor_delegate$lambda$1() {
        return new ThreadPoolExecutor(0, 3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DownloadImpl downloadImpl_delegate$lambda$0() {
        return new DownloadImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadMultiFilesInner$lambda$8$lambda$7(DownloadRequest request, AtomicInteger successCount, AtomicInteger failCount, IMultiFileDownloadListener iMultiFileDownloadListener, List requestList) {
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(successCount, "$successCount");
        Intrinsics.checkNotNullParameter(failCount, "$failCount");
        Intrinsics.checkNotNullParameter(requestList, "$requestList");
        DownloadTaskDispatcher downloadTaskDispatcher = INSTANCE;
        downloadTaskDispatcher.getMultiDownloadingRequests().add(request.getUrl());
        boolean zDownload = downloadTaskDispatcher.getDownloadImpl().download(request, null);
        downloadTaskDispatcher.getMultiDownloadingRequests().remove(request.getUrl());
        if (zDownload) {
            successCount.addAndGet(1);
        } else {
            failCount.addAndGet(1);
        }
        if (iMultiFileDownloadListener != null) {
            iMultiFileDownloadListener.onProgress(successCount.get(), failCount.get());
        }
        if (successCount.get() + failCount.get() != requestList.size() || iMultiFileDownloadListener == null) {
            return;
        }
        iMultiFileDownloadListener.onComplete(successCount.get(), failCount.get(), requestList.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadSingleFileInner$lambda$5(DownloadRequest request, ISingleFileDownloadListener iSingleFileDownloadListener) {
        Intrinsics.checkNotNullParameter(request, "$request");
        DownloadTaskDispatcher downloadTaskDispatcher = INSTANCE;
        Map<String, SingleDownloadListenerDispatcher> singleDownloadingRequests2 = downloadTaskDispatcher.getSingleDownloadingRequests();
        Intrinsics.checkNotNullExpressionValue(singleDownloadingRequests2, "<get-singleDownloadingRequests>(...)");
        String url = request.getUrl();
        SingleDownloadListenerDispatcher singleDownloadListenerDispatcher = new SingleDownloadListenerDispatcher();
        singleDownloadListenerDispatcher.addListener(iSingleFileDownloadListener);
        singleDownloadingRequests2.put(url, singleDownloadListenerDispatcher);
        downloadTaskDispatcher.getDownloadImpl().download(request, downloadTaskDispatcher.getSingleDownloadingRequests().get(request.getUrl()));
        downloadTaskDispatcher.getSingleDownloadingRequests().remove(request.getUrl());
    }

    private final ThreadPoolExecutor getDownloadExecutor() {
        return (ThreadPoolExecutor) downloadExecutor.getValue();
    }

    private final DownloadImpl getDownloadImpl() {
        return (DownloadImpl) downloadImpl.getValue();
    }

    private final List<String> getMultiDownloadingRequests() {
        return (List) multiDownloadingRequests.getValue();
    }

    private final Map<String, SingleDownloadListenerDispatcher> getSingleDownloadingRequests() {
        return (Map) singleDownloadingRequests.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List multiDownloadingRequests_delegate$lambda$3() {
        return Collections.synchronizedList(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map singleDownloadingRequests_delegate$lambda$2() {
        return Collections.synchronizedMap(new LinkedHashMap());
    }

    public final void downloadMultiFilesInner(@NotNull final List<DownloadRequest> requestList, @Nullable final IMultiFileDownloadListener downloadListener) {
        Intrinsics.checkNotNullParameter(requestList, "requestList");
        if (requestList.isEmpty()) {
            if (downloadListener != null) {
                downloadListener.onError(new DownloadException(ErrorCode.EmptyDownloadRequest, null, 2, null));
                return;
            }
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        ArrayList<DownloadRequest> arrayList = new ArrayList();
        for (DownloadRequest downloadRequest : requestList) {
            if (!INSTANCE.getMultiDownloadingRequests().contains(downloadRequest.getUrl())) {
                Logger.i(TAG, downloadRequest.getUrl() + " is downloading!!");
                arrayList.add(downloadRequest);
            }
        }
        for (final DownloadRequest downloadRequest2 : arrayList) {
            INSTANCE.getDownloadExecutor().execute(new Runnable() { // from class: v37
                @Override // java.lang.Runnable
                public final void run() {
                    DownloadTaskDispatcher.downloadMultiFilesInner$lambda$8$lambda$7(downloadRequest2, atomicInteger, atomicInteger2, downloadListener, requestList);
                }
            });
        }
        if (downloadListener != null) {
            downloadListener.onSubmit(arrayList.size());
        }
    }

    public final void downloadSingleFileInner(@NotNull final DownloadRequest request, @Nullable final ISingleFileDownloadListener downloadListener) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (getSingleDownloadingRequests().get(request.getUrl()) == null) {
            getDownloadExecutor().execute(new Runnable() { // from class: u37
                @Override // java.lang.Runnable
                public final void run() {
                    DownloadTaskDispatcher.downloadSingleFileInner$lambda$5(request, downloadListener);
                }
            });
            return;
        }
        SingleDownloadListenerDispatcher singleDownloadListenerDispatcher = getSingleDownloadingRequests().get(request.getUrl());
        Intrinsics.checkNotNull(singleDownloadListenerDispatcher);
        singleDownloadListenerDispatcher.addListener(downloadListener);
        Logger.i(TAG, "request:" + request.getUrl() + " is downloading!!");
    }
}
