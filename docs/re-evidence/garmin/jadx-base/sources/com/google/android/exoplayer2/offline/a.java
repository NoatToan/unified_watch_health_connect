package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.trackselection.TrackSelector;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements TrackSelector.InvalidationListener {
    @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
    public final void onTrackSelectionsInvalidated() {
        DownloadHelper.lambda$new$2();
    }
}
