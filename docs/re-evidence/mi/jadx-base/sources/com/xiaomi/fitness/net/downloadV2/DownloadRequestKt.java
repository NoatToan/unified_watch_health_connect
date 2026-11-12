package com.xiaomi.fitness.net.downloadV2;

import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002¨\u0006\t"}, d2 = {"isForceDownload", "", "Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest;", "isExternal", "getDownloadDir", "", "getDownloadFilePath", "getDownloadFileName", "isFileExist", "net_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DownloadRequestKt {
    @NotNull
    public static final String getDownloadDir(@NotNull DownloadRequest downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "<this>");
        if (!TextUtils.isEmpty(downloadRequest.getDownloadDir())) {
            return downloadRequest.getDownloadDir();
        }
        String strValueOf = isExternal(downloadRequest) ? String.valueOf(ApplicationExtKt.getApplication().getExternalFilesDir("download")) : ApplicationExtKt.getApplication().getFilesDir() + File.separator + "download";
        try {
            List<String> pathSegments = Uri.parse(downloadRequest.getUrl()).getPathSegments();
            StringBuilder sb = new StringBuilder();
            if (downloadRequest.getOption().getPathDirDepth() <= pathSegments.size()) {
                for (int pathDirDepth = downloadRequest.getOption().getPathDirDepth(); 1 < pathDirDepth; pathDirDepth--) {
                    sb.append(pathSegments.get(pathSegments.size() - pathDirDepth));
                }
            }
            return strValueOf + File.separator + ((Object) sb);
        } catch (Exception e) {
            Logger.e("DownloadRequest", "getDownloadDir exception:" + e.getMessage(), e);
            return strValueOf;
        }
    }

    @NotNull
    public static final String getDownloadFileName(@NotNull DownloadRequest downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "<this>");
        if (!TextUtils.isEmpty(downloadRequest.getFileName())) {
            return downloadRequest.getFileName();
        }
        try {
            List<String> pathSegments = Uri.parse(downloadRequest.getUrl()).getPathSegments();
            String str = pathSegments.get(pathSegments.size() - 1);
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            return str;
        } catch (Exception e) {
            Logger.e("DownloadRequest", "getDownloadFileName exception:" + e.getMessage(), e);
            return "";
        }
    }

    @NotNull
    public static final String getDownloadFilePath(@NotNull DownloadRequest downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "<this>");
        return getDownloadDir(downloadRequest) + File.separator + getDownloadFileName(downloadRequest);
    }

    public static final boolean isExternal(@NotNull DownloadRequest downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "<this>");
        return downloadRequest.getOption().getExternal();
    }

    public static final boolean isFileExist(@NotNull DownloadRequest downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "<this>");
        return new File(getDownloadFilePath(downloadRequest)).exists();
    }

    public static final boolean isForceDownload(@NotNull DownloadRequest downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "<this>");
        return downloadRequest.getOption().getForceDownload();
    }
}
