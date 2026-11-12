package com.amazon.alexa.avs.message.request.context;

import com.amazon.alexa.avs.message.Payload;

/* JADX INFO: loaded from: classes2.dex */
public class VolumeStatePayload extends Payload {
    private final boolean muted;
    private final long volume;

    public VolumeStatePayload(long j, boolean z) {
        this.volume = j;
        this.muted = z;
    }

    public boolean getMuted() {
        return this.muted;
    }

    public long getVolume() {
        return this.volume;
    }
}
