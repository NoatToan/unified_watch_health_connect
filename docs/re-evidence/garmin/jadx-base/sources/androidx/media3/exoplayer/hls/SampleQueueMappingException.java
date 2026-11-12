package androidx.media3.exoplayer.hls;

import am.j;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(String str) {
        super(j.m("Unable to bind a sample queue to TrackGroup with MIME type ", str, "."));
    }
}
