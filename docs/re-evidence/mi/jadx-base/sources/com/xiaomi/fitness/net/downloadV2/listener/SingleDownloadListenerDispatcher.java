package com.xiaomi.fitness.net.downloadV2.listener;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.net.downloadV2.DownloadException;
import com.xiaomi.fitness.net.downloadV2.DownloadProgress;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/listener/SingleDownloadListenerDispatcher;", "Lcom/xiaomi/fitness/net/downloadV2/listener/ISingleFileDownloadListener;", "<init>", "()V", "downloadListeners", "Ljava/util/ArrayList;", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, LifecycleConstantKt.ON_START, "contentLength", "", "onProgress", BroadcastsKt.SILENT_PUSHING_PROGRESS, "Lcom/xiaomi/fitness/net/downloadV2/DownloadProgress;", "onSuccess", "path", "", "onError", PluginDeviceInfo.FICONOFFLINE, "Lcom/xiaomi/fitness/net/downloadV2/DownloadException;", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSingleDownloadListenerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleDownloadListenerDispatcher.kt\ncom/xiaomi/fitness/net/downloadV2/listener/SingleDownloadListenerDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n1#2:30\n1863#3,2:31\n1863#3,2:33\n1863#3,2:35\n1863#3,2:37\n*S KotlinDebug\n*F\n+ 1 SingleDownloadListenerDispatcher.kt\ncom/xiaomi/fitness/net/downloadV2/listener/SingleDownloadListenerDispatcher\n*L\n15#1:31,2\n19#1:33,2\n23#1:35,2\n27#1:37,2\n*E\n"})
public final class SingleDownloadListenerDispatcher implements ISingleFileDownloadListener {

    @NotNull
    private final ArrayList<ISingleFileDownloadListener> downloadListeners = new ArrayList<>();

    public final void addListener(@Nullable ISingleFileDownloadListener listener) {
        if (listener != null) {
            this.downloadListeners.add(listener);
        }
    }

    @Override // com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
    public void onError(@NotNull DownloadException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        Iterator<T> it = this.downloadListeners.iterator();
        while (it.hasNext()) {
            ((ISingleFileDownloadListener) it.next()).onError(e);
        }
    }

    @Override // com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
    public void onProgress(@NotNull DownloadProgress progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        Iterator<T> it = this.downloadListeners.iterator();
        while (it.hasNext()) {
            ((ISingleFileDownloadListener) it.next()).onProgress(progress);
        }
    }

    @Override // com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
    public void onStart(long contentLength) {
        Iterator<T> it = this.downloadListeners.iterator();
        while (it.hasNext()) {
            ((ISingleFileDownloadListener) it.next()).onStart(contentLength);
        }
    }

    @Override // com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
    public void onSuccess(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Iterator<T> it = this.downloadListeners.iterator();
        while (it.hasNext()) {
            ((ISingleFileDownloadListener) it.next()).onSuccess(path);
        }
    }
}
