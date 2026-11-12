package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements DrmSessionManagerProvider, RequirementsWatcher.Listener, CacheWriter.ProgressListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f53034a;

    public /* synthetic */ b(Object obj) {
        this.f53034a = obj;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
    public DrmSessionManager get(MediaItem mediaItem) {
        return DownloadHelper.lambda$createMediaSourceInternal$6((DrmSessionManager) this.f53034a, mediaItem);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
    public void onProgress(long j8, long j14, long j15) {
        ((ProgressiveDownloader) this.f53034a).onProgress(j8, j14, j15);
    }

    @Override // com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i14) {
        ((DownloadManager) this.f53034a).onRequirementsStateChanged(requirementsWatcher, i14);
    }
}
