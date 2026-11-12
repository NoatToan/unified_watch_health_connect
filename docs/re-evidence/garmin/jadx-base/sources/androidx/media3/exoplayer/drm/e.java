package androidx.media3.exoplayer.drm;

import android.media.MediaDrmException;
import androidx.media3.common.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements g {
    @Override // androidx.media3.exoplayer.drm.g
    public final void a(DefaultDrmSessionManager.c cVar) {
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final void closeSession(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final la.c createCryptoConfig(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final int getCryptoType() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final g.a getKeyRequest(byte[] bArr, List<l.b> list, int i14, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final g.c getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final Map<String, String> queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final void release() {
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final boolean requiresSecureDecoder(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }
}
