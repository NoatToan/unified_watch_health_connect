package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.decoder.DecoderException;

/* JADX INFO: loaded from: classes13.dex */
public interface Decoder<I, O, E extends DecoderException> {
    I dequeueInputBuffer();

    O dequeueOutputBuffer();

    void flush();

    String getName();

    void queueInputBuffer(I i14);

    void release();
}
