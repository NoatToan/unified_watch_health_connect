package androidx.media3.exoplayer.drm;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {
        public final int errorCode;

        public DrmSessionException(Throwable th3, int i14) {
            super(th3);
            this.errorCode = i14;
        }
    }

    void a(b.a aVar);

    void b(b.a aVar);

    la.c getCryptoConfig();

    DrmSessionException getError();

    UUID getSchemeUuid();

    int getState();

    default boolean playClearSamplesWithoutKeys() {
        return false;
    }

    boolean requiresSecureDecoder(String str);
}
