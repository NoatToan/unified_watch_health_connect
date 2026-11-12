package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.Assertions;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalMediaDrmCallback implements MediaDrmCallback {
    private final byte[] a;

    public LocalMediaDrmCallback(byte[] keyResponse) {
        this.a = (byte[]) Assertions.checkNotNull(keyResponse);
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest request) {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest request) {
        throw new UnsupportedOperationException();
    }
}
