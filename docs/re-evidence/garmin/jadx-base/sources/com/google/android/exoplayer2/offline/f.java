package com.google.android.exoplayer2.offline;

import java.util.Comparator;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return DownloadManager.InternalHandler.compareStartTimes((Download) obj, (Download) obj2);
    }
}
