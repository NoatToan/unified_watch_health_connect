package com.google.android.exoplayer2.drm;

import java.util.UUID;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class f implements ExoMediaDrm.Provider {
    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.Provider
    public final ExoMediaDrm acquireExoMediaDrm(UUID uuid) {
        return FrameworkMediaDrm.lambda$static$0(uuid);
    }
}
