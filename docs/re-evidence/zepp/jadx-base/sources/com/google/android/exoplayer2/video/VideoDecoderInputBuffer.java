package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class VideoDecoderInputBuffer extends DecoderInputBuffer {

    @Nullable
    public Format format;

    public VideoDecoderInputBuffer(int bufferReplacementMode) {
        super(bufferReplacementMode);
    }

    public VideoDecoderInputBuffer(int bufferReplacementMode, int paddingSize) {
        super(bufferReplacementMode, paddingSize);
    }
}
