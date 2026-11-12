package com.google.android.exoplayer2.offline;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
public interface DownloadIndex {
    @Nullable
    Download getDownload(String id) throws IOException;

    DownloadCursor getDownloads(int... states) throws IOException;
}
