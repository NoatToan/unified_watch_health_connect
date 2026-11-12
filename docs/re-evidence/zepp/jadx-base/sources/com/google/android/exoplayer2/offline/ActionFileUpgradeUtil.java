package com.google.android.exoplayer2.offline;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ActionFileUpgradeUtil {

    public interface DownloadIdProvider {
        String getId(DownloadRequest downloadRequest);
    }

    private ActionFileUpgradeUtil() {
    }

    public static void a(DownloadRequest request, DefaultDownloadIndex downloadIndex, boolean addNewDownloadAsCompleted, long nowMs) throws IOException {
        Download download;
        Download download2 = downloadIndex.getDownload(request.id);
        if (download2 != null) {
            download = DownloadManager.d(download2, request, download2.stopReason, nowMs);
        } else {
            download = new Download(request, addNewDownloadAsCompleted ? 3 : 0, nowMs, nowMs, -1L, 0, 0);
        }
        downloadIndex.putDownload(download);
    }

    @WorkerThread
    public static void upgradeAndDelete(File actionFilePath, @Nullable DownloadIdProvider downloadIdProvider, DefaultDownloadIndex downloadIndex, boolean deleteOnFailure, boolean addNewDownloadsAsCompleted) throws IOException {
        a aVar = new a(actionFilePath);
        if (aVar.b()) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (DownloadRequest downloadRequestCopyWithId : aVar.e()) {
                    if (downloadIdProvider != null) {
                        downloadRequestCopyWithId = downloadRequestCopyWithId.copyWithId(downloadIdProvider.getId(downloadRequestCopyWithId));
                    }
                    a(downloadRequestCopyWithId, downloadIndex, addNewDownloadsAsCompleted, jCurrentTimeMillis);
                }
                aVar.a();
            } catch (Throwable th) {
                if (deleteOnFailure) {
                    aVar.a();
                }
                throw th;
            }
        }
    }
}
