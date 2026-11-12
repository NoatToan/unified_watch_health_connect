package com.google.android.exoplayer2.source.hls;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(@Nullable String mimeType) {
        StringBuilder sb = new StringBuilder(String.valueOf(mimeType).length() + 60);
        sb.append("Unable to bind a sample queue to TrackGroup with mime type ");
        sb.append(mimeType);
        sb.append(".");
        super(sb.toString());
    }
}
