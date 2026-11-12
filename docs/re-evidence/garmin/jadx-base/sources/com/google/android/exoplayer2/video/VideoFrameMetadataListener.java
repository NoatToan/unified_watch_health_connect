package com.google.android.exoplayer2.video;

import android.media.MediaFormat;
import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes14.dex */
public interface VideoFrameMetadataListener {
    void onVideoFrameAboutToBeRendered(long j8, long j14, Format format, MediaFormat mediaFormat);
}
