package com.xiaomi.fitness.net.downloadV2.util;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.downloadV2.DownloadRequest;
import com.xiaomi.fitness.net.downloadV2.DownloadRequestKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/util/FileUtils;", "", "<init>", "()V", "TAG", "", "ensureDownloadDirExist", "Lkotlin/Pair;", "", "downloadRequest", "Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest;", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FileUtils {

    @NotNull
    public static final FileUtils INSTANCE = new FileUtils();

    @NotNull
    private static final String TAG = "Download_FileUtils";

    private FileUtils() {
    }

    @NotNull
    public final Pair<String, Boolean> ensureDownloadDirExist(@NotNull DownloadRequest downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        try {
            String downloadDir = DownloadRequestKt.getDownloadDir(downloadRequest);
            File file = new File(downloadDir);
            if (!file.exists() && !file.mkdirs()) {
                return new Pair<>(downloadDir, Boolean.FALSE);
            }
            return new Pair<>(downloadDir, Boolean.TRUE);
        } catch (Exception e) {
            Logger.e(TAG, "ensureDownloadDirExist exception: " + e.getMessage(), e);
            return new Pair<>("", Boolean.FALSE);
        }
    }
}
