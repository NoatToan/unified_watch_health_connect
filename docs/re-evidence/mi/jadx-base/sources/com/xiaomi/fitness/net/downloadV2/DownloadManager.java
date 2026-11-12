package com.xiaomi.fitness.net.downloadV2;

import com.xiaomi.fitness.net.downloadV2.listener.IMultiFileDownloadListener;
import com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ \u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\rJ\u001e\u0010\u000e\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\b\u0010\b\u001a\u0004\u0018\u00010\rJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fH\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/DownloadManager;", "", "<init>", "()V", "downloadSingleFile", "", "request", "Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest;", "downloadListener", "Lcom/xiaomi/fitness/net/downloadV2/listener/ISingleFileDownloadListener;", "downloadMultiFiles", "requestList", "", "Lcom/xiaomi/fitness/net/downloadV2/listener/IMultiFileDownloadListener;", "downloadMultiFilesWithUrls", "urlList", "", "buildDownloadRequestList", "isFileExist", "", "url", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDownloadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadManager.kt\ncom/xiaomi/fitness/net/downloadV2/DownloadManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1863#2,2:49\n*S KotlinDebug\n*F\n+ 1 DownloadManager.kt\ncom/xiaomi/fitness/net/downloadV2/DownloadManager\n*L\n39#1:49,2\n*E\n"})
public final class DownloadManager {

    @NotNull
    public static final DownloadManager INSTANCE = new DownloadManager();

    private DownloadManager() {
    }

    private final List<DownloadRequest> buildDownloadRequestList(List<String> urlList) {
        List<String> list = urlList;
        if (list == null || list.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = urlList.iterator();
        while (it.hasNext()) {
            arrayList.add(new DownloadRequest((String) it.next(), null, null, null, 14, null));
        }
        return arrayList;
    }

    public static /* synthetic */ void downloadMultiFiles$default(DownloadManager downloadManager, List list, IMultiFileDownloadListener iMultiFileDownloadListener, int i, Object obj) {
        if ((i & 2) != 0) {
            iMultiFileDownloadListener = null;
        }
        downloadManager.downloadMultiFiles(list, iMultiFileDownloadListener);
    }

    public static /* synthetic */ void downloadSingleFile$default(DownloadManager downloadManager, DownloadRequest downloadRequest, ISingleFileDownloadListener iSingleFileDownloadListener, int i, Object obj) {
        if ((i & 2) != 0) {
            iSingleFileDownloadListener = null;
        }
        downloadManager.downloadSingleFile(downloadRequest, iSingleFileDownloadListener);
    }

    public final void downloadMultiFiles(@NotNull List<DownloadRequest> requestList, @Nullable IMultiFileDownloadListener downloadListener) {
        Intrinsics.checkNotNullParameter(requestList, "requestList");
        DownloadTaskDispatcher.INSTANCE.downloadMultiFilesInner(requestList, downloadListener);
    }

    public final void downloadMultiFilesWithUrls(@NotNull List<String> urlList, @Nullable IMultiFileDownloadListener downloadListener) {
        Intrinsics.checkNotNullParameter(urlList, "urlList");
        List<DownloadRequest> listBuildDownloadRequestList = buildDownloadRequestList(urlList);
        if (!listBuildDownloadRequestList.isEmpty()) {
            downloadMultiFiles(listBuildDownloadRequestList, downloadListener);
        } else if (downloadListener != null) {
            downloadListener.onError(new DownloadException(ErrorCode.EmptyDownloadRequest, null, 2, null));
        }
    }

    public final void downloadSingleFile(@NotNull DownloadRequest request, @Nullable ISingleFileDownloadListener downloadListener) {
        Intrinsics.checkNotNullParameter(request, "request");
        DownloadTaskDispatcher.INSTANCE.downloadSingleFileInner(request, downloadListener);
    }

    public final boolean isFileExist(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return DownloadRequestKt.isFileExist(new DownloadRequest(url, null, null, null, 14, null));
    }
}
