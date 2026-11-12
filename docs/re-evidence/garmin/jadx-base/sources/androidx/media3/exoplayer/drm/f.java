package androidx.media3.exoplayer.drm;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class f implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DrmSession.DrmSessionException f8901a;

    public f(DrmSession.DrmSessionException drmSessionException) {
        drmSessionException.getClass();
        this.f8901a = drmSessionException;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void a(b.a aVar) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void b(b.a aVar) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final la.c getCryptoConfig() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        return this.f8901a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID getSchemeUuid() {
        return androidx.media3.common.h.f8296a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean requiresSecureDecoder(String str) {
        return false;
    }
}
