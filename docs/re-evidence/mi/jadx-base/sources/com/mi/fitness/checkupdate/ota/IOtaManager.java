package com.mi.fitness.checkupdate.ota;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\nH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000bH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000fH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH&J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000fH&¨\u0006\u0016"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/IOtaManager;", "", "startDownload", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "downloadListener", "Lcom/mi/fitness/checkupdate/ota/DownloadListener;", "startUpgrade", "callback", "Lkotlin/Function1;", "", "getFirmwareFile", "Ljava/io/File;", "md5", "", "isDownloaded", "interruptIfNeed", "reason", "recordPushed", "did", "isPushed", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IOtaManager {
    @NotNull
    File getFirmwareFile(@NotNull String md5);

    void interruptIfNeed(@NotNull String reason);

    boolean isDownloaded();

    boolean isPushed(@NotNull String did);

    void recordPushed(@NotNull String did);

    void startDownload(@NotNull CoroutineScope scope, @NotNull DownloadListener downloadListener);

    void startUpgrade(@NotNull Function1<? super Boolean, Unit> callback);
}
