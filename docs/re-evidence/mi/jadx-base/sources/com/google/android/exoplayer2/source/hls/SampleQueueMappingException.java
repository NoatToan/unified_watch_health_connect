package com.google.android.exoplayer2.source.hls;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60);
        sb.append("Unable to bind a sample queue to TrackGroup with mime type ");
        sb.append(str);
        sb.append(".");
        super(sb.toString());
    }
}
