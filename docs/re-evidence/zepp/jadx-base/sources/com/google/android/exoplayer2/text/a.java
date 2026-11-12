package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.OutputBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class a extends SubtitleOutputBuffer {
    private final OutputBuffer.Owner<SubtitleOutputBuffer> d;

    public a(OutputBuffer.Owner<SubtitleOutputBuffer> owner) {
        this.d = owner;
    }

    @Override // com.google.android.exoplayer2.decoder.OutputBuffer
    public final void release() {
        this.d.releaseOutputBuffer(this);
    }
}
